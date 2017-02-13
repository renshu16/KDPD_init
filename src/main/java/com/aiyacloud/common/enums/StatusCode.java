package com.aiyacloud.common.enums;

public enum StatusCode {

    SUCCESS(200,"请求成功"),
    TIMEOUT(408,"请求超时"),
    UN_AUTH(401,"认证失败"),
    OVER_AUTH(411,"签名过期"),
    MISS_ARG(412,"缺少参数"),
    NO_PERMISSION(403,"权限不足"),
    NEED_FORCE(510,"强制补全资料"),
    FAILURE(500,"服务器出错");

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


