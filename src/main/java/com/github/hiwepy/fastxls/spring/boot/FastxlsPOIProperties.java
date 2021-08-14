/** 
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved. 
 */
package com.github.hiwepy.fastxls.spring.boot;

import org.apache.commons.lang3.SystemUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ConfigurationProperties(FastxlsPOIProperties.PREFIX)
@Getter
@Setter
@ToString
public class FastxlsPOIProperties {
	
	public static final String PREFIX = "fastxls.poi";
	/**
	 * 编码格式 ，默认： UTF-8
	 */
	private String encoding = "UTF-8";
	/**
	 * 临时目录
	 */
	private String tempdir = SystemUtils.getUserDir().getAbsolutePath();
	
}
