/** 
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved. 
 */
package io.github.easy4j.fastxls.spring.boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.easy4j.fastxls.poi.POIWorkbookConverter;
import io.github.easy4j.fastxls.poi.POIWorkbookCopyer;
import io.github.easy4j.fastxls.poi.POIWorkbookExtractor;
import io.github.easy4j.fastxls.poi.POIWorkbookFiller;
import io.github.easy4j.fastxls.poi.POIWorkbookMapper;
import io.github.easy4j.fastxls.poi.POIWorkbookReader;
import io.github.easy4j.fastxls.poi.POIWorkbookWriter;

/**
 * Spring Boot auto-configuration for the Fastxls Apache POI integration.
 * <p>Activates when the POI workbook classes are present on the classpath and registers
 * the full set of POI workbook components (converter, copyer, extractor, filler, mapper,
 * reader and writer).</p>
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
@Configuration
@ConditionalOnClass({POIWorkbookConverter.class, POIWorkbookCopyer.class, POIWorkbookExtractor.class,
	POIWorkbookFiller.class, POIWorkbookMapper.class, POIWorkbookReader.class, POIWorkbookWriter.class})
@EnableConfigurationProperties({ FastxlsExportProperties.class, FastxlsImportProperties.class, FastxlsPOIProperties.class})
/**
 * <p>Auto-configuration for FastxlsPOIAutoConfiguration.</p>
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
public class FastxlsPOIAutoConfiguration {

	/**
	 * Creates the POI workbook converter used to convert between spreadsheet formats.
	 * @return the POI workbook converter bean
	 */
	@Bean
	/**
	 * <p>Poi workbook converter.</p>
	 * @return the result
	 */
	public POIWorkbookConverter poiWorkbookConverter() {
		return new POIWorkbookConverter();
	}

	/**
	 * Creates the POI workbook copyer used to duplicate spreadsheet content.
	 * @return the POI workbook copyer bean
	 */
	@Bean
	/**
	 * <p>Poi workbook copyer.</p>
	 * @return the result
	 */
	public POIWorkbookCopyer poiWorkbookCopyer() {
		return new POIWorkbookCopyer();
	}

	/**
	 * Creates the POI workbook extractor used to extract text and metadata from spreadsheets.
	 * @return the POI workbook extractor bean
	 */
	@Bean
	/**
	 * <p>Poi workbook extractor.</p>
	 * @return the result
	 */
	public POIWorkbookExtractor poiWorkbookExtractor() {
		return new POIWorkbookExtractor();
	}

	/**
	 * Creates the POI workbook filler used to populate spreadsheet templates with data.
	 * @return the POI workbook filler bean
	 */
	@Bean
	/**
	 * <p>Poi workbook filler.</p>
	 * @return the result
	 */
	public POIWorkbookFiller poiWorkbookFiller() {
		return new POIWorkbookFiller();
	}

	/**
	 * Creates the POI workbook mapper used to map Java objects onto spreadsheet rows.
	 * @return the POI workbook mapper bean
	 */
	@Bean
	/**
	 * <p>Poi workbook mapper.</p>
	 * @return the result
	 */
	public POIWorkbookMapper poiWorkbookMapper() {
		return new POIWorkbookMapper();
	}

	/**
	 * Creates the POI workbook reader used to read spreadsheet content into Java objects.
	 * @return the POI workbook reader bean
	 */
	@Bean
	/**
	 * <p>Poi workbook reader.</p>
	 * @return the result
	 */
	public POIWorkbookReader poiWorkbookReader() {
		return new POIWorkbookReader();
	}

	/**
	 * Creates the POI workbook writer used to write Java objects out to a spreadsheet.
	 * @return the POI workbook writer bean
	 */
	@Bean
	/**
	 * <p>Poi workbook writer.</p>
	 * @return the result
	 */
	public POIWorkbookWriter poiWorkbookWriter() {
		return new POIWorkbookWriter();
	}

}
