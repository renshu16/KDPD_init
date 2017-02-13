package com.aiyacloud.common.utils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.util.Base64;

public class DESUtil {


    public static final String confusionStr = "com.aiya.sendsms";
    public static final String ALGORITHM_DES_ECB = "DES/ECB/PKCS5Padding";


    public static String DESencodeECB(String data) {
        return DESencodeECB(confusionStr, data);
    }

    public static String DESdecodeECB(String data) {
        return DESdecodeECB(confusionStr, data);
    }


    public static String DESencodeECB(String key, String data) {
        try {
            if (isBlank(data)) {
                return "";
            }
            DESKeySpec dks = new DESKeySpec(key.getBytes());
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey secretKey = keyFactory.generateSecret(dks);
            Cipher cipher = Cipher.getInstance(ALGORITHM_DES_ECB);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] bytes = cipher.doFinal(data.getBytes("utf-8"));
            return encode(bytes);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }


    public static String DESdecodeECB(String key, String data) {
        try {
            if (isBlank(data)) {
                return "";
            }
            DESKeySpec dks = new DESKeySpec(key.getBytes());
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey secretKey = keyFactory.generateSecret(dks);
            Cipher cipher = Cipher.getInstance(ALGORITHM_DES_ECB);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] result = cipher.doFinal(decode(data));
            return new String(result, "utf-8");
        } catch (Exception e) {
            return "";
        }
    }

    private static byte[] decode(String data) {
        return Base64.getDecoder().decode(data);
    }

    private static String encode(byte[] bytes) {

        return Base64.getEncoder().encodeToString(bytes);
    }

    public static boolean isBlank(CharSequence s) {
        if (s == null) {
            return true;
        } else {
            for (int i = 0; i < s.length(); ++i) {
                if (!Character.isWhitespace(s.charAt(i))) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {
        String s = DESUtil.DESencodeECB("tb-aiya-$%^&uytr", "abc");
        System.out.printf(s);
        System.out.printf(DESUtil.DESdecodeECB("tb-aiya-$%^&uytr", s));
    }

}
