package com.aiyacloud.common;

/** ״̬��ö��
 * Created by lc on 2015/9/23.
 */
public enum StatusCode {



    SUCCESS(1,"请求成功"),

    UN_AUTH(-2,"认证失败"),

    FAILURE(-1,"服务器出错");

    private  int code;
    private  String msg;

    StatusCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode(){
        return code;
    }

    public String getMsg(){
        return msg;
    }

}


