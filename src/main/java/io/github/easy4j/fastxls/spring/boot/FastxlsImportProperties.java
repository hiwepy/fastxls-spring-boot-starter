/** 
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved. 
 */
package io.github.easy4j.fastxls.spring.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

import io.github.easy4j.fastxls.core.property.ImportProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Configuration properties for Fastxls spreadsheet import, bound under the
 * {@value #PREFIX} prefix.
 * <p>Extends the core {@link ImportProperties} to allow the import behaviour to be
 * customised through Spring Boot externalised configuration.</p>
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
@ConfigurationProperties(FastxlsImportProperties.PREFIX)
@Getter
@Setter
@ToString
/**
 * <p>Auto-configuration for FastxlsImportProperties.</p>
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
public class FastxlsImportProperties extends ImportProperties {

	/** Configuration property prefix for Fastxls import options. */
	public static final String PREFIX = "fastxls.import";

}
