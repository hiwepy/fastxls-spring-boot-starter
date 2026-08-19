/** 
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved. 
 */
package io.github.easy4j.fastxls.spring.boot;


import org.springframework.boot.context.properties.ConfigurationProperties;

import io.github.easy4j.fastxls.core.property.ExportProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Configuration properties for Fastxls spreadsheet export, bound under the
 * {@value #PREFIX} prefix.
 * <p>Extends the core {@link ExportProperties} to allow the export behaviour to be
 * customised through Spring Boot externalised configuration.</p>
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
@ConfigurationProperties(FastxlsExportProperties.PREFIX)
@Getter
@Setter
@ToString
/**
 * <p>Auto-configuration for FastxlsExportProperties.</p>
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
public class FastxlsExportProperties extends ExportProperties {

	/** Configuration property prefix for Fastxls export options. */
	public static final String PREFIX = "fastxls.export";

}
