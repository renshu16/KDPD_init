package com.aiyacloud.common.utils;


import org.apache.commons.lang.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by liuchao on 2014/10/15.
 */
public final class DateUtils {

    public static String dateFormatString = "yyyy-MM-dd HH:mm:ss";

    public static final String DATE_FORMAT_DD = "yyyy-MM-dd";

    public static long SECONDS = 1000;

    public static long MINUTE = 60 * SECONDS;

    public static long HOUR = 60 * MINUTE;

    public static long DAY = 24 * HOUR;

    public static long MONTH = 30 * DAY;

    public static long YEAR = 365 * DAY;


    //根据有效期的格式化字符串，转化得到有效期对应的Date对象，如果出现异常，就返回昨天的Date，表示过期
    public static Date StringToDate(String expire) {

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatString);
            Date date = null;
            if (expire == null)
                date = new Date();
            else
                date = dateFormat.parse(expire);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, -1);
        return calendar.getTime();
    }

    /**
     * 重新格式化日期
     *
     * @param ori       日期
     * @param oldFormat 老的格式
     * @param newFormat 新的格式
     * @return
     */
    public static String reformat(String ori, String oldFormat, String newFormat) {
        SimpleDateFormat oldDateFormat = new SimpleDateFormat(oldFormat);
        SimpleDateFormat newDateFormat = new SimpleDateFormat(newFormat);
        try {
            Date date = oldDateFormat.parse(ori);
            return newDateFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 判断两个日期是否为同一天
     *
     * @param date1
     * @param date2
     * @return
     */
    public static boolean isSameDate(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);

        boolean isSameYear = cal1.get(Calendar.YEAR) == cal2
                .get(Calendar.YEAR);
        boolean isSameMonth = isSameYear
                && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
        boolean isSameDate = isSameMonth
                && cal1.get(Calendar.DAY_OF_MONTH) == cal2
                .get(Calendar.DAY_OF_MONTH);

        return isSameDate;
    }

    /**
     * 重新格式化日期 yyyy-mm-dd to yyyymmdd
     *
     * @param ori 日期
     * @return
     */
    public static String reformat(String ori) {
        if (StringUtils.isEmpty(ori))
            return null;
        return reformat(ori, "yyyy-mm-dd", "yyyymmdd");
    }


    /**
     * @param dateTime : 时间
     * @param minutes  : 分钟数
     * @description :时间增加分钟数
     */
    public static final Date addMinutes(Date dateTime, int minutes) {

        Calendar c = Calendar.getInstance();
        c.setTime(dateTime);
        c.add(Calendar.MINUTE, minutes);
        return c.getTime();

    }

    public static String getWeek(String date) {
        String[] weekOfDays = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
        Calendar calendar = Calendar.getInstance();
        Date d = null;

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            d = format.parse(date);
        } catch (ParseException e) {
            return "";
        }
        calendar.setTime(d);
        return weekOfDays[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }

    public static String getDate(String date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date d = null;
        try {
            d = format.parse(date);
        } catch (ParseException e) {
            return "";
        }

        return format.format(d);
    }

    /**
     * 获取时间戳
     */
    public static long getTimestamp(String date) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date oriDate = null;
        try {
            oriDate = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }

        return oriDate.getTime();
    }

    /**
     * 获取时间戳
     *
     * @param date
     * @param format 时间格式
     * @return
     */
    public static long getTimestamp(String date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date oriDate = null;
        try {
            oriDate = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }

        return oriDate.getTime();
    }


    public static int getHour(String date) {
        SimpleDateFormat format = new SimpleDateFormat(dateFormatString);
        Date d = null;
        try {
            d = format.parse(date);
        } catch (ParseException e) {
            return 0;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);

        return calendar.get(Calendar.HOUR_OF_DAY);
    }


    public static int getMinute(String date) {
        SimpleDateFormat format = new SimpleDateFormat(dateFormatString);
        Date d = null;
        try {
            d = format.parse(date);
        } catch (ParseException e) {
            return 0;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);

        return calendar.get(Calendar.MINUTE);
    }

    /**
     * 将毫秒数转换成 mm:ss
     *
     * @return
     */
    public static String millisecondCovertMMss(long mi) {
        if (mi / 1000 > 50) {

        }
        SimpleDateFormat formatter = new SimpleDateFormat("mm:ss");//初始化Formatter的转换格式。
        String hms = formatter.format(mi);
        return hms;
    }

    /**
     * 取得指定年月的当月总天数
     *
     * @param year  年
     * @param month 月
     * @return 当月总天数
     */
    public static int getLastDay(int year, int month) {
        int day = 1;
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        int last = cal.getActualMaximum(Calendar.DATE);
        System.out.println(last);
        return last;
    }


    public static String getStringFromDate(Date date, String format) {
        if (date == null)
            return "";
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }

    public static String getStringFromLongDate(Long date, String format) {
        if (date == null)
            return "";
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(new Date(date));
    }


    /**
     * 获取指定日期截止到现在的时间段
     * 年月日 时分
     *
     * @param strDate
     * @return
     */
    public static String getPeriodStr(String strDate) {
        if (StringUtils.isEmpty(strDate)) {
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date oriDate = null;
        String reDate = null;
        try {
            oriDate = sdf.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
        long currTime = new Date().getTime();//当前时间戳
        long oriTime = oriDate.getTime();//原始时间戳
        long dTime = currTime - oriTime;//差值
        SimpleDateFormat day = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat hourFromat = new SimpleDateFormat("HH:mm");
        if (dTime < MINUTE) {
            reDate = "刚刚";
        } else if (dTime < HOUR) {
            reDate = dTime / MINUTE + "分钟前";
        } else {
            reDate = day.format(oriDate) + " " + hourFromat.format(oriDate);
        }
        return reDate;
    }

    /**
     * 按照给定格式转换日期
     * yyyy-MM-dd kk:mm:ss
     *
     * @param strDate 原日期
     * @param strReg  指定格式
     * @return
     */
    public static String getDateByReg(String strDate, String strReg) {
        SimpleDateFormat sdf = new SimpleDateFormat(strReg);
        Date oriDate = null;
        String reDate = null;
        try {
            oriDate = sdf.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        reDate = sdf.format(oriDate);
        return reDate;
    }

    public static String getDateNow() {
        SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sDateFormat.format(new Date());
        return date;
    }

    public static Date getDateByFormat(String date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getToday() {
        SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = sDateFormat.format(new Date());
        return date;
    }

    public static Date getDateFromString(String time) {
        return getDateFromString(time, dateFormatString);
    }

    /**
     * 获取上一个月的第一天日期
     *
     * @return yyyy-MM-dd
     */
    public static String lastMonthFirstDate() {
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        if (month - 1 == 0) {
            month = 12;
            year -= 1;
        } else {
            month -= 1;
        }
        return getFirstDayOfMonth(year, month);
    }


    /**
     * 获取上一个月最后一天日期
     *
     * @return yyyy-MM-dd
     */
    public static String lastMonthLastDate() {
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        if (month - 1 == 0) {
            month = 12;
            year -= 1;
        } else {
            month -= 1;
        }
        return getLastDayOfMonth(year, month);
    }

    /**
     * 某年某月的第一天
     */
    public static String getFirstDayOfMonth(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DATE, cal.getActualMinimum(Calendar.DATE));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(cal.getTime());
    }

    /**
     * 某年某月的最后一天
     */
    public static String getLastDayOfMonth(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DATE));
        // 某年某月的最后一天
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(cal.getTime());
    }

    public static Date getNow() {
        return new Date(System.currentTimeMillis());
    }

    public static Date getDateFromString(String time, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = sdf.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static String getYMDHMSDateString(String date) {
        SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sDateFormat.format(new Date(Long.parseLong(date)));
    }

    public static String getYMDDateString(String date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(str2Date(date));
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        return String.format("%04d-%02d-%02d", year, month + 1, day);
    }

    public static Date str2Date(String value) {
        Date date = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            date = formatter.parse(value);
        } catch (ParseException e) {
            e.printStackTrace();
            return new Date();
        }

        return date;
    }

    public static String getUploadTopicPicTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        Date curDate = new Date(System.currentTimeMillis());// 获取当前时间
        String str = formatter.format(curDate);
        return str;
    }

    /**
     * 将秒数转换成时分
     *
     * @param s
     * @return
     */
    public static String secondsToHM(int s) {
        long hours = (s % (60 * 60 * 24)) / (60 * 60);
        long minutes = (s % (60 * 60)) / (60);
        StringBuilder builder = new StringBuilder();
        if (hours >= 1) {
            builder.append(hours + "小时");
        }
        if (minutes >= 1 && minutes < 9) {
            builder.append(minutes + "分钟");
        } else {
            builder.append(minutes + "分钟");
        }
        return builder.toString();
    }


    /**
     * 比较2个日期相差多少天
     *
     * @param c1
     * @param c2
     * @return
     */
    public static long compareDays(Calendar c1, Calendar c2) {
        long milliseconds1 = c1.getTimeInMillis();
        long milliseconds2 = c2.getTimeInMillis();
        long diff = milliseconds2 - milliseconds1;
//        long diffSeconds = diff / 1000;
//        long diffMinutes = diff / (60 * 1000);
//        long diffHours = diff / (60 * 60 * 1000);
        long diffDays = diff / (24 * 60 * 60 * 1000);
        return diffDays;
    }

    /**
     * 比较给入的时间是否经过了x分钟
     *
     * @param date
     * @param minute 分钟数
     * @return 如果过了, 返回true
     */
    public static boolean afterMinute(Date date, int minute) {
        return compareDates(date, getNow(), minute * MINUTE);
    }

    /**
     * 判断给定日期是否超过现在的时间
     *
     * @param date
     * @return 是的话返回true
     */
    public static boolean exceedNow(Date date) {
        return date.getTime() > System.currentTimeMillis();
    }

    /**
     * 比较两个日期对象的差值是否大于指定值
     *
     * @param earlyDate 早的时间
     * @param lateDate  晚的时间
     * @param diff      差值
     * @return 如果大于, 返回true
     */
    public static boolean compareDates(Date earlyDate, Date lateDate, long diff) {
        return (lateDate.getTime() - earlyDate.getTime()) > diff;
    }

    /**
     * 获取本周第一天日期(sunday)
     *
     * @return yyyy-MM-dd
     */
    public static String thisWeekFristDate() {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setFirstDayOfWeek(Calendar.SUNDAY);
        calendar1.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(calendar1.getTime());
    }

    /**
     * 获取本周最后一天日期(saturday)
     *
     * @return yyyy-MM-dd
     */
    public static String thisWeekLastDate() {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setFirstDayOfWeek(Calendar.SUNDAY);
        calendar1.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(calendar1.getTime());
    }

    /**
     * 获取今天日期
     *
     * @return yyyy-MM-dd
     */
    public static String todayDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date());
    }

    /**
     * 获取今年1月1日日期
     *
     * @return yyyy-MM-dd
     */
    public static String thisYearFirstDate() {
        Calendar calendar3 = Calendar.getInstance();
        int year = calendar3.get(Calendar.YEAR);
        calendar3.clear();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        calendar3.set(Calendar.YEAR, year);
        return sdf.format(calendar3.getTime());
    }


    /**
     * 获取当年的最后一天日期
     *
     * @return yyyy-MM-dd
     */
    public static String thisYearLastDate() {
        Calendar currCal = Calendar.getInstance();
        int currentYear = currCal.get(Calendar.YEAR);
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, currentYear);
        calendar.roll(Calendar.DAY_OF_YEAR, -1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(calendar.getTime());
    }


    /**
     * 获取本月第一天日期
     *
     * @return yyyy-MM-dd
     */
    public static String thisMonthFirstDate() {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.DATE, calendar2.getActualMinimum(Calendar.DATE));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(calendar2.getTime());
    }

    /**
     * 获取本月最后一天日期
     *
     * @return yyyy-MM-dd
     */
    public static String thisMonthLastDate() {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.DATE, calendar2.getActualMaximum(Calendar.DATE));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(calendar2.getTime());
    }

    /**
     * 取两个时间的差值
     *
     * @param stime
     * @param etime
     * @param format 时间格式
     * @return 差值, 单位:分钟
     */
    public static Short diff(String stime, String etime, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            Date sDate = dateFormat.parse(stime);
            Date eDate = dateFormat.parse(etime);
            long diff = Math.abs(sDate.getTime() - eDate.getTime()) / MINUTE;
            return Short.parseShort(diff + "");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
    /**
     * 取两个时间的差值
     *
     * @param stime
     * @param etime
     * @return 差值, 单位:年
     */
    public static int diffByYear(Long stime, Long etime) {
        return (int) ((etime - stime) / YEAR);
    }


    /**
     * 取两个时间的差值
     *
     * @param stime
     * @param etime
     * @param format 时间格式
     * @return 差值, 单位:天
     */
    public static int diffOfDays(String stime, String etime, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            Date sDate = dateFormat.parse(stime);
            Date eDate = dateFormat.parse(etime);
            long diff = Math.abs(sDate.getTime() - eDate.getTime()) / DAY;
            return (int) diff + 1;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static String addDays(String drq, String format, int n) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        drq = drq.replace("-", "");
        String year = drq.substring(0, 4);
        String month = drq.substring(4, 6);
        String day = drq.substring(6, 8);
        LocalDate date = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        LocalDate localDate = date.plusDays(n);
        return reformat(localDate.toString(), format, format);

    }


    /**
     * 凌晨
     *
     * @param date
     * @return
     * @flag 0 返回yyyy-MM-dd 00:00:00日期<br>
     * 1 返回yyyy-MM-dd 23:59:59日期
     */
    public static Date weeHours(Date date, int flag) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        // 时分秒（毫秒数）
        long millisecond = hour * 60 * 60 * 1000 + minute * 60 * 1000 + second * 1000;
        // 凌晨00:00:00
        cal.setTimeInMillis(cal.getTimeInMillis() - millisecond);

        if (flag == 0) {
            return cal.getTime();
        } else if (flag == 1) {
            // 凌晨23:59:59
            cal.setTimeInMillis(cal.getTimeInMillis() + 23 * 60 * 60 * 1000 + 59 * 60 * 1000 + 59 * 1000);
        }
        return cal.getTime();
    }

    /**
     * 获取指定月份的天数
     *
     * @param year
     * @param month
     * @return
     */
    public static int getMothDays(int year, int month) {
        Calendar cl = Calendar.getInstance();
        cl.set(Calendar.YEAR, year);
        cl.set(Calendar.MONTH, month - 1);
        return cl.getActualMaximum(Calendar.DATE);
    }
}
