package com.aiyacloud.common;

import com.aiyacloud.common.utils.DateUtils;

import java.util.Date;

/**
 * Created by hx on 2016-11-21.
 */
public class ResumeConstant {

    public static String getSalary(Integer salary) {
        if (salary == null)
            return "";

        switch (salary) {
            case 0:
            case 1:
                return "面议";
            case 2:
                return "1000以下";
            case 3:
                return "1000-1999";
            case 4:
                return "2000-2999";
            case 5:
                return "4000-5999";
            case 6:
                return "6000-7999";
            case 7:
                return "8000-9999";
            case 8:
                return "10000-19999";
            case 9:
                return "20000及以上";
            default:
                return "";
        }
    }

    public static String getEducation(Integer edu) {
        if (edu == null)
            return "";

        switch (edu) {
            case 1:
                return "博士及以上";
            case 2:
                return "硕士";
            case 3:
                return "本科";
            case 4:
                return "大专";
            case 5:
                return "中专";
            case 6:
                return "高中及以下";
            default:
                return "";
        }
    }

    public static String getEduLevel(Integer edu) {
        if (edu == null)
            return "";

        switch (edu) {
            case 1:
                return "博士";
            case 2:
                return "硕士";
            case 3:
                return "本科";
            case 4:
                return "大专";
            case 5:
                return "中专";
            case 6:
                return "高中";
            case 7:
                return "初中";
            default:
                return "";
        }
    }
    public static String getWorkTime(Integer work) {
        if (work == null)
            return "";

        switch (work) {
            case 1:
                return "应届毕业生";
            case 2:
                return "1-3年";
            case 3:
                return "4-5年";
            case 4:
                return "6-10年";
            case 5:
                return "10年以上";
            default:
                return "";
        }
    }

    public static String getWorkKind(Integer kind) {
        if (kind == null)
            return "";

        switch (kind) {
            case 1:
                return "全职";
            case 2:
                return "兼职";
            case 3:
                return "实习";
            default:
                return "";
        }
    }

    public static String getPeriod(Long start, Long end) {
        String per = "";
        if (start != null)
            per += DateUtils.getStringFromDate(new Date(start), "yyyy年MM月");
        if (end != null)
            per += "至<BR><BR>" + DateUtils.getStringFromDate(new Date(end), "yyyy年MM月");
        return per;
    }

}
