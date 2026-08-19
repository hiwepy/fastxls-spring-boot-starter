/** 
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved. 
 */
package io.github.easy4j.fastxls.spring.boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.easy4j.fastxls.jexcel.JXLWorkbookFiller;
import io.github.easy4j.fastxls.jexcel.JXLWorkbookMapper;
import io.github.easy4j.fastxls.jexcel.JXLWorkbookReader;

/**
 * Spring Boot auto-configuration for the Fastxls JExcelAPI (JXL) integration.
 * <p>Activates when the JXL workbook filler, mapper and reader classes are present on
 * the classpath and registers the corresponding JXL workbook beans.</p>
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
@Configuration
@ConditionalOnClass({JXLWorkbookFiller.class, JXLWorkbookMapper.class, JXLWorkbookReader.class})
@EnableConfigurationProperties({ FastxlsExportProperties.class, FastxlsImportProperties.class, FastxlsJXLProperties.class})
/**
 * <p>Auto-configuration for FastxlsJXLAutoConfiguration.</p>
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
public class FastxlsJXLAutoConfiguration  {

	/**
	 * Creates the JXL workbook filler used to populate spreadsheet templates with data.
	 * @return the JXL workbook filler bean
	 */
	@Bean
	/**
	 * <p>Jxl workbook filler.</p>
	 * @return the result
	 */
	public JXLWorkbookFiller jxlWorkbookFiller() {
		return new JXLWorkbookFiller();
	}

	/**
	 * Creates the JXL workbook mapper used to map Java objects onto spreadsheet rows.
	 * @return the JXL workbook mapper bean
	 */
	@Bean
	/**
	 * <p>Jxl workbook mapper.</p>
	 * @return the result
	 */
	public JXLWorkbookMapper jxlWorkbookMapper() {
		return new JXLWorkbookMapper();
	}

	/**
	 * Creates the JXL workbook reader used to read spreadsheet content into Java objects.
	 * @return the JXL workbook reader bean
	 */
	@Bean
	/**
	 * <p>Jxl workbook reader.</p>
	 * @return the result
	 */
	public JXLWorkbookReader jxlWorkbookReader() {
		return new JXLWorkbookReader();
	}

}
