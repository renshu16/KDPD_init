package com.aiyacloud.common.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @Copyright :aiya ©2012 -2020
 * @date :2014-9-10
 * @author :hkj
 * @version :3.0.0
 * @description :文件上传工具类
 */

/**
 * 文件上传
 *
 * @author cary
 * @since 2012-12-19 下午2:22:12
 */
public class FileUpload {

    // 一次读取多少字节
    public static int bufferSize = 1024 * 8;

    /**
     * @param @return
     * @throws Exception
     * @description :随机获取文件名
     * @version ：3.0.0
     * @author :hkj
     * @date :2014-9-10
     */
    public static String getRandomFileName() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        int rand = new Random().nextInt(1000);
        String numberName = format.format(new Date()) + rand;
        return numberName;
    }

    /**
     * @param @return
     * @throws Exception
     * @description :随机获取文件夹名称
     * @version ：3.0.0
     * @author :hkj
     * @date :2014-9-10
     */
    public static String getRandomDirName() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        return format.format(new Date());
    }

    public static void upload4Stream(String fileName, String path, InputStream is) throws IOException {
        // UploadState state = UploadState.UPLOAD_FAILURE;
        FileOutputStream fos = null;

        try {
            mkDir(path);
            is.reset();
            fos = new FileOutputStream(new File(new File(path), fileName));

            byte[] buffer = new byte[bufferSize];
            int len = 0;
            while ((len = is.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }
            // state = UploadState.UPLOAD_SUCCSSS;
        } finally {
            if (fos != null) {
                fos.flush();
                fos.close();
            }
        }
        // return state;
    }

    /**
     * <b>function:</b> 创建指定的path路径目录
     *
     * @param path 目录、路径
     * @return 是否创建成功
     * @throws IOException
     * @author hoojo
     * @createDate Oct 9, 2010 11:03:49 PM
     */
    public static boolean mkDir(String path) throws IOException {
        File file = null;
        try {
            file = new File(path);
            if (!file.exists()) {
                return file.mkdirs();
            }
        } catch (RuntimeException e) {
            throw e;
        } finally {
            file = null;
        }
        return true;
    }

    public static String getFileSuffix(String filename) {
        if (filename == null || filename.equals(""))
            return "";
        return filename.substring(filename.lastIndexOf("."), filename.length());
    }

}
