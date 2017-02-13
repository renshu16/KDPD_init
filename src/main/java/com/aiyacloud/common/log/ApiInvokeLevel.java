package com.aiyacloud.common.log;

import org.apache.log4j.Level;

/**
 * 用于记录api调用记录
 * Created by hx on 2015/10/26.
 */
public class ApiInvokeLevel extends Level {

    public static final ApiInvokeLevel APIINVOKE = new ApiInvokeLevel(60000, "APIINVOKE", 0);
    public ApiInvokeLevel(int level, String levelStr, int syslogEquivalent) {
        super(level, levelStr, syslogEquivalent);
    }

    /**
     *  log4J内部调用这个方法来对应log4j.properties
     * @param val
     * @param defaultLevel
     * @return
     */
    public static ApiInvokeLevel toLevel(int val, Level defaultLevel) {
        return APIINVOKE;
    }

    public static ApiInvokeLevel toLevel(String sArg, Level defaultLevel) {

        return APIINVOKE;

    }


}
