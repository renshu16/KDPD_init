package com.aiyacloud.common.utils;

import com.fasterxml.jackson.core.type.TypeReference;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by hx on 2016/4/5.
 */
public class RequestHelper {

    public static Map<String, Object> getParamters(HttpServletRequest request) {
        Map<String, Object> params = null;
        if (request.getContentType() == null)
            return null;
        if (request.getContentType().startsWith("application/json")) {
            params = transferJsonRequestParas(request);
        } else if (request.getContentType().startsWith("multipart/form-data")
                || request.getContentType().startsWith("application/x-www-form-urlencoded")) {
            params = transferFormRequestParas(request);
        }
        return params;
    }

    /**
     * 把json请求中的参数组装成map
     *
     * @param request
     * @return
     */
    private static Map<String, Object> transferJsonRequestParas(HttpServletRequest request) {

        try {
            return JsonUtils.is2Object(request.getInputStream(), new TypeReference<Map<String, Object>>() {
            });
        } catch (Exception e) {
            throw new RuntimeException("接口参数不是json", e);
        }

    }

    /**
     * 把form请求中的参数组装成map
     *
     * @param request
     * @return
     */
    private static Map<String, Object> transferFormRequestParas(HttpServletRequest request) {

        Map<String, Object> req = new HashMap<>();

        // 参数Map
        Map<String, String[]> parameterMap = request.getParameterMap();

        Iterator<?> entries = parameterMap.entrySet().iterator();
        while (entries.hasNext()) {
            @SuppressWarnings("rawtypes")
            Map.Entry entry = (Map.Entry) entries.next();
            String key = (String) entry.getKey();
            String value = null;
            Object valueObj = entry.getValue();
            if (null == valueObj) {
                value = null;
            } else if (valueObj instanceof String[]) {
                String[] values = (String[]) valueObj;
                for (int i = 0; i < values.length; i++) {
                    value = values[i] + ",";
                }
                value = value.substring(0, value.length() - 1);
            } else {
                value = valueObj.toString();
            }

            req.put(key, value);
        }

        return req;
    }
}
