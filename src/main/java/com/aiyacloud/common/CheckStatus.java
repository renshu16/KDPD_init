package com.aiyacloud.common;

/**
 * Created by hx on 2015/12/28.
 */
public interface CheckStatus {
    /**
     * 未审核
     */
    int UNCHECKED = 1;
    /**
     * 默认值--视为未审核
     */
    int DEFAULT=0;
    /**
     * 未通过
     */
    int FAILED = -1;
    /**
     * 已通过
     */
    int SUCCESS = 2;

}
