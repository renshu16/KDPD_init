package com.aiyacloud.common.utils;

import com.aiyacloud.common.ImageType;
import com.aiyacloud.common.log.ExceptionLevel;
import net.coobird.thumbnailator.geometry.Positions;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;

/**
 * Created by hx on 2015/10/14.
 */
@Component
public class FileUploadHelper {

    private final static Logger logger = Logger.getLogger(FileUploadHelper.class);
    private static final String PICTURE_SERVER_URL;
    private static final String PICTURE_UPLOAD_ROOT_PATH;
    private static final String PICTURE_UPLOAD_VIR_PATH;

    static {
        Properties properties = new Properties();
        try {
            properties.load(FileUploadHelper.class.getClassLoader().getResourceAsStream("aiyacloud.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        PICTURE_SERVER_URL = properties.getProperty("picture_server_url");
        PICTURE_UPLOAD_ROOT_PATH = properties.getProperty("picture_upload_root_path");
        PICTURE_UPLOAD_VIR_PATH = properties.getProperty("picture_upload_vir_path");
    }

    /**
     * 批量上传图片
     *
     * @param images
     * @param type   {@link ImageType}
     * @return 图片信息, 无文件时返回emptyList
     * @throws IOException 上传失败时抛出
     */
    public static List<String> uploadImage(List<MultipartFile> images, int type) throws Exception {
        if (CollectionUtils.isEmpty(images)) {
            return Collections.emptyList();
        }
        List<String> urls = new ArrayList<>();
        for (MultipartFile file : images) {
            String url = uploadFile(file);
            urls.add(url);
        }
        return urls;
    }


    /**
     * 上传图片
     *
     * @param file 文件数据
     * @return 图片信息
     */
    public static String uploadFile(MultipartFile file) {

        // 上传根目录
        String rootPath = PICTURE_UPLOAD_ROOT_PATH;
        // 生成图片文件夹虚拟路径
        String relativeMakeDirName = PICTURE_UPLOAD_VIR_PATH + FileUpload.getRandomDirName() + "/";
        // 本地完整路径
        String sourceDirName = rootPath + relativeMakeDirName;
        ByteArrayInputStream inStream = null;
        // 文件名
        String fileName = FileUpload.getRandomFileName() + FileUpload.getFileSuffix(file.getOriginalFilename());
        try {
            boolean mkSuccess = FileUpload.mkDir(sourceDirName);
            if (!mkSuccess) {
                logger.error("上传图片失败,创建文件夹失败");
            }
            inStream = new ByteArrayInputStream(file.getBytes());
            // 保存原图
            FileUpload.upload4Stream(fileName, sourceDirName, inStream);
        } catch (Exception e) {
            writeErrorLog("上传图片失败", file, e);
            e.printStackTrace();
            return "";
        } finally {
            if (inStream != null) {
                try {
                    inStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        String url = PICTURE_UPLOAD_ROOT_PATH + relativeMakeDirName + fileName;
        return url;
    }

    /**
     * 输出上传失败日志到log文件
     *
     * @param title
     * @param file
     * @param e
     */
    private static void writeErrorLog(String title, MultipartFile file, Exception e) {
        Map<String, Serializable> map = new HashMap<>();
        map.put("title", title);
        map.put("fileSize", file.getSize());
        map.put("fileName", file.getOriginalFilename());
        map.put("mime", file.getContentType());
        map.put("date", DateUtils.getDateNow());
        String errorMessage = e.toString();
        if (errorMessage.lastIndexOf(":") != -1)
            errorMessage = errorMessage.substring(0, errorMessage.lastIndexOf(":"));
        map.put("exception", errorMessage);
        logger.log(ExceptionLevel.EXCEPTION, JsonUtils.object2Json(map));
    }

    /**
     * @param @param  bufImg
     * @param @param  thumbWidth 缩略图宽
     * @param @param  thumbHeight 缩略图高
     * @param @return 索引0处为宽，1处为高
     * @throws Exception
     * @description :计算要裁剪的宽高。如果宽高比例大于3，则需要
     * @version ：3.0.0
     * @author :hkj
     * @date :2014-9-24
     */
    private int[] getCutWH(BufferedImage bufImg, int thumbWidth, int thumbHeight) {
        int[] wh = new int[2];

        if ((double) bufImg.getWidth() / bufImg.getHeight() > 3) {
            wh[0] = bufImg.getHeight() * 3;
            wh[1] = bufImg.getHeight();
        } else if ((double) bufImg.getHeight() / bufImg.getWidth() > 3) {
            wh[0] = bufImg.getWidth();
            wh[1] = bufImg.getWidth() * 3;
        } else {
            wh[0] = bufImg.getWidth();
            wh[1] = bufImg.getHeight();
        }

        return wh;
    }

    /**
     * @param @param  value
     * @param @return
     * @description :根据字符串获取水印位置枚举
     * @version ：3.0.0
     * @author :hkj
     * @date :2014-9-24
     */
    private Positions toPositionEnum(String value) {
        if (value.equalsIgnoreCase("lefttop")) {
            return Positions.TOP_LEFT;
        } else if (value.equalsIgnoreCase("righttop")) {
            return Positions.TOP_RIGHT;
        } else if (value.equalsIgnoreCase("rightbottom")) {
            return Positions.BOTTOM_RIGHT;
        } else if (value.equalsIgnoreCase("middle")) {
            return Positions.CENTER;
        } else if (value.equalsIgnoreCase("bottommiddle")) {
            return Positions.BOTTOM_CENTER;
        } else if (value.equalsIgnoreCase("topmiddle")) {
            return Positions.TOP_CENTER;
        } else if (value.equalsIgnoreCase("leftmiddle")) {
            return Positions.CENTER_LEFT;
        } else if (value.equalsIgnoreCase("rightmiddle")) {
            return Positions.CENTER_RIGHT;
        } else if (value.equalsIgnoreCase("leftbottom")) {
            return Positions.BOTTOM_LEFT;
        }

        return Positions.TOP_LEFT;
    }

    /**
     * 根据文件类型生产文件后缀
     *
     * @param type
     * @param file
     * @return
     */
    private static String generateFileSuffixWithImageType(int type, MultipartFile file) {
        String suffix = ".jpg";
        switch (type) {
            case ImageType.TYPE_ADV:
            case ImageType.TYPE_LICENCE:
            case ImageType.TYPE_SCHOOL_COVER:
                suffix = ".jpg";
                break;
            case ImageType.TYPE_SCHOOL_CONTENT:
                suffix = ".html";
                break;
            default:
                return FileUpload.getFileSuffix(file.getOriginalFilename());
        }
        return suffix;
    }

    /**
     * 检查图片是否符合给定的宽度和高度
     *
     * @param file
     * @param width  宽
     * @param height 高
     * @return 符合返回true
     */
    public static boolean checkImageSize(MultipartFile file, int width, int height) {
        BufferedImage bufferedImg = null;
        try {
            bufferedImg = ImageIO.read(file.getInputStream());
            int imgWidth = bufferedImg.getWidth();
            int imgHeight = bufferedImg.getHeight();
            if (imgWidth == width && imgHeight == height) {
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
