/** 
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved. 
 */
package net.jeebiz.fastxls.spring.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ConfigurationProperties(FastxlsProperties.PREFIX)
@Getter
@Setter
@ToString
public class FastxlsProperties {

	public static final String PREFIX = "fastxls";
  
	/** Whether Enable Fastxls. */
	private boolean enabled = false;
	
}
