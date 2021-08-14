/** 
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved. 
 */
package net.jeebiz.fastxls.spring.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.github.hiwepy.fastxls.core.property.ImportProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ConfigurationProperties(FastxlsImportProperties.PREFIX)
@Getter
@Setter
@ToString
public class FastxlsImportProperties extends ImportProperties {

	public static final String PREFIX = "fastxls.import";

}
