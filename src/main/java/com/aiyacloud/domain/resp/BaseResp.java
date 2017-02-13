package com.aiyacloud.domain.resp;

import com.aiyacloud.common.enums.StatusCode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by hx on 2015/11/3.
 */
@JsonIgnoreProperties
public class BaseResp {
   public String msg;
   public int code;

    public <T extends BaseResp> T success() {

        return setRtrCode(StatusCode.SUCCESS);
    }


    public <T extends BaseResp> T failure() {

        return setRtrCode(StatusCode.FAILURE);
    }

    public <T extends BaseResp> T missArg() {

        return setRtrCode(StatusCode.MISS_ARG);
    }

    public <T extends BaseResp> T unAuth() {

        return setRtrCode(StatusCode.UN_AUTH);
    }

    public <T extends BaseResp> T noPermission() {

        return setRtrCode(StatusCode.NO_PERMISSION);
    }


    public <T extends BaseResp> T setRtrCode(StatusCode code) {
        msg = code.getMsg();
        this.code = code.getCode();
        return (T) this;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
