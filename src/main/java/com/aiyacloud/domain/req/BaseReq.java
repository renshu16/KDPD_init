package com.aiyacloud.domain.req;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by hx on 2015/11/3.
 */
@JsonIgnoreProperties
public class BaseReq {
    String token="";
    Integer version=1;
    Integer pageno;

    public Integer getPageno() {
        return pageno;
    }

    public void setPageno(Integer pageno) {
        this.pageno = pageno;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
