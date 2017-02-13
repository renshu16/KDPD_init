package com.aiyacloud.common.utils;

import com.squareup.okhttp.*;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.File;
import java.io.IOException;
import java.net.FileNameMap;
import java.net.URLConnection;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.Properties;

/**
 * Created by hx on 2015/11/2.
 */
public class HttpUtils {
    private static OkHttpClient client = new OkHttpClient();

    static {
        try {
            Properties properties = new Properties();
            try {
                properties.load(HttpUtils.class.getClassLoader().getResourceAsStream("aiyacloud.properties"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            String dev = properties.getProperty("Dev");
            if (dev.equalsIgnoreCase("true")) {
                //信任所有https
                SSLContext sc = SSLContext.getInstance("TLS");
                sc.init(null, new TrustManager[]{new MyTrustManager()}, new SecureRandom());
                client.setSslSocketFactory(sc.getSocketFactory());
                client.setHostnameVerifier((s, sslSession) -> true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private HttpUtils() {
    }

    /**
     * 发起一次get请求
     *
     * @param url
     * @return
     * @throws IOException
     */

    public static String get(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        Response response = null;
        response = client.newCall(request).execute();
        return response.body().string();
    }

    /**
     * 发起一次post请求,不支持utf-8编码,请用 {@link HttpUtils#post(String, Map)}
     *
     * @param url
     * @param body {@link FormEncodingBuilder}
     * @return
     * @throws IOException
     */
    @Deprecated
    public static String post(String url, RequestBody body) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();

        return getResult(request);
    }

    private static String getResult(Request request) throws IOException {
        return client.newCall(request).execute().body().string();
    }

    /**
     * 发起一次post请求,utf-8编码
     *
     * @param url
     * @param params
     * @return
     * @throws IOException
     */
    public static String post(String url, Map<String, Object> params) throws IOException {
        StringBuilder builder = new StringBuilder();
        int index = 0;
        for (String key : params.keySet()) {
            if (index > 0)
                builder.append("&");
            builder.append(key);
            builder.append("=");
            builder.append(params.get(key));
            index++;
        }
        Request request = new Request.Builder().url(url)
                .post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded; charset=utf-8"), builder.toString())).build();
        return getResult(request);
    }

    /**
     * 发起一次json请求
     *
     * @param url
     * @param bean
     * @return
     * @throws IOException
     */
    public static <T> String json(String url, T bean) throws IOException {
        final String json = JsonUtils.object2Json(bean);
        Request request = new Request.Builder()
                .url(url)
                .post(RequestBody.create(MediaType.parse("application/json"), json))
                .build();
        return getResult(request);
    }

    /**
     * 发起一次json请求
     *
     * @param url
     * @param params
     * @return
     * @throws IOException
     */
    public static String json(String url, Map<String, Object> params) throws IOException {
        final String json = JsonUtils.object2Json(params);
        Request request = new Request.Builder()
                .url(url)
                .post(RequestBody.create(MediaType.parse("application/json"), json))
                .build();
        return getResult(request);
    }


    private static class MyTrustManager implements X509TrustManager {
        @Override
        public void checkClientTrusted(X509Certificate[] chain, String authType)
                throws CertificateException {
        }

        @Override
        public void checkServerTrusted(X509Certificate[] chain, String authType)

                throws CertificateException {
        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }

    }

    /**
     * post的表单提交，多文件且携带其他form参数上传
     * @param url
     * @param files 文件
     * @param fileKeys 文件key
     * @param params form参数
     * @return
     */
    public static String postMultipartFormRequest(String url, MultipartFile[] files, String[] fileKeys, Map<String, Object> params) throws IOException {
        MultipartBuilder builder = new MultipartBuilder().type(MultipartBuilder.FORM);

        if (params != null){
            for (String key : params.keySet()) {
                builder.addPart(Headers.of("Content-Disposition", "form-data; name=\"" + key + "\""),
                        RequestBody.create(null, params.get(key).toString()));
            }
        }

        if (files != null)
        {
            RequestBody fileBody = null;
            for (int i = 0; i < files.length; i++)
            {
                MultipartFile file = files[i];
                String fileType = file.getContentType();
                String fileName = file.getOriginalFilename();
                CommonsMultipartFile cf= (CommonsMultipartFile)file;
                DiskFileItem fi = (DiskFileItem)cf.getFileItem();
                File f = fi.getStoreLocation();
                fileBody = RequestBody.create(MediaType.parse(fileType),f);
                builder.addPart(Headers.of("Content-Disposition",
                        "form-data; name=\"" + fileKeys[i] + "\"; filename=\"" + fileName + "\""),
                        fileBody);
            }
        }

        RequestBody requestBody = builder.build();
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();
        return getResult(request);
    }

    private static String guessMimeType(String path)
    {
        FileNameMap fileNameMap = URLConnection.getFileNameMap();
        String contentTypeFor = fileNameMap.getContentTypeFor(path);
        if (contentTypeFor == null)
        {
            contentTypeFor = "application/octet-stream";
        }
        return contentTypeFor;
    }


}
