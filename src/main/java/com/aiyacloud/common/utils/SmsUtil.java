package com.aiyacloud.common.utils;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by hx on 2015/11/6.
 */
public class SmsUtil {
    protected static Logger logger = Logger.getLogger(SmsUtil.class);

    /**
     * 发送短信
     *
     * @param phones  接收号码,多个号码用";"分隔,例如:13767216337;13767216337;18380357658
     * @param content 短信内容
     * @return true if success
     * @throws IOException
     */
    public static String sendSms(String phones, String content) {
        String url = (String) CustomizedPropertyPlaceholderConfigurer.getProperty("sms.url");
        Map<String, Object> param = new HashMap<>();
        param.put("phones", phones);
        param.put("content", content);
        param.put("smsId", UUID.randomUUID().toString());
        param.put("verify", DESUtil.DESencodeECB(System.currentTimeMillis() + DESUtil.confusionStr));
        param.put("supplier", (String) CustomizedPropertyPlaceholderConfigurer.getProperty("sms.supplier"));
        param.put("autoswitch", (String) CustomizedPropertyPlaceholderConfigurer.getProperty("sms.autoswitch"));
        param.put("sendchannel", (String) CustomizedPropertyPlaceholderConfigurer.getProperty("sms.sendchannel"));
        param.put("isAsy", (String) CustomizedPropertyPlaceholderConfigurer.getProperty("sms.isAsy"));
        param.put("projectName", "aiyacloud-admin");
        String result = null;
        try {
            result = HttpUtils.post(url, param);
        } catch (IOException e) {
            e.printStackTrace();
            result = e.toString();
        }
        logger.info("短信发送:" + content + "\r\n结果:" + result);
        return result;
    }

}
