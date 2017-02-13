package com.aiyacloud.common.log;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Priority;

/**
 * 按照日志级别输出日志文件
 * Created by hx on 2015/10/26.
 */
public class PriorityAppender extends DailyRollingFileAppender {
    @Override
    public boolean isAsSevereAsThreshold(Priority priority) {
        return threshold.equals(priority);//级别相等时才输出,而不是大于等于
    }
}
