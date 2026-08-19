/** 
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved. 
 */
package io.github.easy4j.fastxls.spring.boot;

import org.apache.commons.lang3.SystemUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Configuration properties for the Fastxls Apache POI integration, bound under the
 * {@value #PREFIX} prefix.
 * <p>Holds environment-specific options such as the default encoding and the temporary
 * directory used by POI when processing workbooks.</p>
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
@ConfigurationProperties(FastxlsPOIProperties.PREFIX)
@Getter
@Setter
@ToString
/**
 * <p>Auto-configuration for FastxlsPOIProperties.</p>
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
public class FastxlsPOIProperties {

	/** Configuration property prefix for Fastxls POI options. */
	public static final String PREFIX = "fastxls.poi";
	/** Default character encoding used when reading or writing workbooks. */
	private String encoding = "UTF-8";
	/** Temporary directory used by Apache POI for intermediate workbook files. */
	private String tempdir = SystemUtils.getUserDir().getAbsolutePath();

}
