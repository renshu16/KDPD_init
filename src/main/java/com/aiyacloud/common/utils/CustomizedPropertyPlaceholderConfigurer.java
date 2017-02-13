package com.aiyacloud.common.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class CustomizedPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
	private static Map<String, Object>	ctxProps;

	protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props) throws BeansException {
		super.processProperties(beanFactoryToProcess, props);
		ctxProps = new HashMap<String, Object>();
		for (Object key : props.keySet()) {
			String keyStr = key.toString();
			String value = props.getProperty(keyStr);
			ctxProps.put(keyStr, value);
		}
	}

	public static Object getProperty(String name) {
		return ctxProps.get(name);
	}

}
