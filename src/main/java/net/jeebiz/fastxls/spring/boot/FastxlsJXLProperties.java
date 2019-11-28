/** 
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved. 
 */
package net.jeebiz.fastxls.spring.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.jeebiz.fastxls.jexcel.JXLSettings;

@ConfigurationProperties(FastxlsJXLProperties.PREFIX)
@Getter
@Setter
@ToString
public class FastxlsJXLProperties extends JXLSettings {

	public static final String PREFIX = "fastxls.jxl";

}
