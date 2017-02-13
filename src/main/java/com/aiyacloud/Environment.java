package com.aiyacloud;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Lazy(value = false)
public class Environment {
//    @Autowired
//    AiyaSystemConfigService aiyaSystemConfigService;
    private static final String SYS_VERSION = "20991231";
    private static String openfireUrl;
    private static String openfireDomain;
    private static String serverAddress;
    private static String openfireServerListenerAddress;
    private static String openfireRegisterUrl;
    private static String aiyaUrl;
    private static String schoolSignupUrl;
    private static String umengAuthToken;

    @PostConstruct
    public void init() {
//        openfireUrl = aiyaSystemConfigService.getJsOpenFileUrl();
//        openfireDomain = aiyaSystemConfigService.getValue("OpenfireUrl").getConfigValue();
//        serverAddress = aiyaSystemConfigService.getValue("OpenfireServerAddress").getConfigValue();
//        openfireServerListenerAddress = aiyaSystemConfigService.getValue("OpenfireServerListenerAddress").getConfigValue();
//        openfireRegisterUrl = aiyaSystemConfigService.getValue("OpenfireRegisterUrl").getConfigValue();
//        aiyaUrl = aiyaSystemConfigService.getAiyaUrl();
//        schoolSignupUrl = aiyaSystemConfigService.getSchoolSignupUrl();
//        umengAuthToken = aiyaSystemConfigService.getUmengAuthToken();
    }

    public String getSysVersion() {

        return SYS_VERSION;
    }

    public static String getOpenfireUrl() {
        return openfireUrl;
    }

    public static String getOpenfireDomain() {
        return openfireDomain;
    }

    public static String getServerAddress() {
        return serverAddress;
    }

    public static String getOpenfireServerListenerAddress() {
        return openfireServerListenerAddress;
    }

    public static String getOpenfireRegisterUrl() {
        return openfireRegisterUrl;
    }

    public static String getSchoolSignupUrl() {
        return schoolSignupUrl;
    }

    public static String getAiyaUrl() {
        return aiyaUrl;
    }

    public static String getUmengAuthToken() {
        return umengAuthToken;
    }
}
