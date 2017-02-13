package com.aiyacloud.common.utils;

import com.aiyacloud.dao.domain.entity.User;
import com.aiyacloud.dao.domain.entity.ext.UserExt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class TBTokenAuth {

	private static final Logger log = LoggerFactory.getLogger(TBTokenAuth.class);
	
	private static final String TB_TOKEN_KEY = "tb-saas-$%^&uytr";
	private static final String TB_TOKEN_SUFFIX = "saas-app-api";

	private static final long TB_TOKEN_AUTH_TIMEINTERVAL = 60*2*1000;


	public static boolean isAuthorized(String tokenEncoded) {
		return isAuthorized(tokenEncoded,false);
	}

	public static boolean isAuthorized(String tokenEncoded,boolean isFromWX) {
		String token = DESUtil.DESdecodeECB(TB_TOKEN_KEY,tokenEncoded);
		log.error("tokenEncoded : " + tokenEncoded +"-----token = " + token);
		if (token == null || token.isEmpty()) {
			return false;
		}
		String[] arrStrs = token.split(";");
		if (arrStrs.length != 2)
			return false;
		if (TB_TOKEN_SUFFIX.equals(arrStrs[1])) {
			long clientTime = Double.valueOf(arrStrs[0]).longValue();
			long serverTime = new Date().getTime();
			long timeInterval = Math.abs(serverTime - clientTime);
			log.error("clientTime - serverTime = timeInterval"+clientTime+" + "+serverTime+" = " +timeInterval);
			long auth_timeInterval = isFromWX ? TB_TOKEN_AUTH_TIMEINTERVAL * 15 : TB_TOKEN_AUTH_TIMEINTERVAL;
			if (timeInterval <= auth_timeInterval) {
				return true;
			}
		}

		return false;
	}

	public static String generateUserToken(User user, Integer mainID){
		return DESUtil.DESencodeECB(user.getId()+"@@"+user.getName()+"@@"+mainID);
	}

	public static UserExt decodeTokenToUser(String token){
		String decodeStr = DESUtil.DESdecodeECB(token);
		String[] strings = decodeStr.split("@@");
		if (strings.length != 3){
			return null;
		}
		UserExt user = new UserExt();

		user.setId(Integer.valueOf(strings[0]));
		user.setName(strings[1]);
		user.setMainId(Integer.valueOf(strings[2]));
		return user;
	}

	public static Integer getUserIdFromToken(String token){
		UserExt user = decodeTokenToUser(token);
		if (user != null){
			return user.getId();
		}else{
			return null;
		}
	}

}
