/** 
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved. 
 */
package com.github.hiwepy.fastxls.spring.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.github.hiwepy.fastxls.jexcel.JXLSettings;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ConfigurationProperties(FastxlsJXLProperties.PREFIX)
@Getter
@Setter
@ToString
public class FastxlsJXLProperties extends JXLSettings {

	public static final String PREFIX = "fastxls.jxl";

}
