/** 
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved. 
 */
package io.github.easy4j.fastxls.spring.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

import io.github.easy4j.fastxls.jexcel.JXLSettings;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Configuration properties for the Fastxls JExcelAPI (JXL) integration, bound under
 * the {@value #PREFIX} prefix.
 * <p>Extends the core {@link JXLSettings} to allow JXL-specific behaviour to be
 * customised through Spring Boot externalised configuration.</p>
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
@ConfigurationProperties(FastxlsJXLProperties.PREFIX)
@Getter
@Setter
@ToString
/**
 * <p>Auto-configuration for FastxlsJXLProperties.</p>
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
public class FastxlsJXLProperties extends JXLSettings {

	/** Configuration property prefix for Fastxls JXL options. */
	public static final String PREFIX = "fastxls.jxl";

}
