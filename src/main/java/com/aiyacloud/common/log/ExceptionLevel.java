package com.aiyacloud.common.log;

import org.apache.log4j.Level;

/**
 * 记录异常
 * Created by hx on 2015/10/26.
 */
public class ExceptionLevel extends Level {
    public static final ExceptionLevel EXCEPTION = new ExceptionLevel(70000, "EXCEPTION", 0);
    public ExceptionLevel(int level, String levelStr, int syslogEquivalent) {
        super(level, levelStr, syslogEquivalent);
    }

    /**
     *  log4J内部调用这个方法来对应log4j.properties
     * @param val
     * @param defaultLevel
     * @return
     */
    public static ExceptionLevel toLevel(int val, Level defaultLevel) {
        return EXCEPTION;
    }

    public static ExceptionLevel toLevel(String sArg, Level defaultLevel) {
        return EXCEPTION;
    }
}
