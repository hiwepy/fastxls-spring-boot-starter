/** 
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved. 
 */
package net.jeebiz.fastxls.spring.boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.jeebiz.fastxls.poi.POIWorkbookConverter;
import net.jeebiz.fastxls.poi.POIWorkbookCopyer;
import net.jeebiz.fastxls.poi.POIWorkbookExtractor;
import net.jeebiz.fastxls.poi.POIWorkbookFiller;
import net.jeebiz.fastxls.poi.POIWorkbookMapper;
import net.jeebiz.fastxls.poi.POIWorkbookReader;
import net.jeebiz.fastxls.poi.POIWorkbookWriter;

@Configuration
@ConditionalOnClass({POIWorkbookConverter.class, POIWorkbookCopyer.class, POIWorkbookExtractor.class, 
	POIWorkbookFiller.class, POIWorkbookMapper.class, POIWorkbookReader.class, POIWorkbookWriter.class})
@EnableConfigurationProperties({ FastxlsExportProperties.class, FastxlsImportProperties.class, FastxlsPOIProperties.class})
public class FastxlsPOIAutoConfiguration {

	@Bean
	public POIWorkbookConverter poiWorkbookConverter() {
		return new POIWorkbookConverter();
	}
	
	@Bean
	public POIWorkbookCopyer poiWorkbookCopyer() {
		return new POIWorkbookCopyer();
	}
	
	@Bean
	public POIWorkbookExtractor poiWorkbookExtractor() {
		return new POIWorkbookExtractor();
	}
	
	@Bean
	public POIWorkbookFiller poiWorkbookFiller() {
		return new POIWorkbookFiller();
	}

	@Bean
	public POIWorkbookMapper poiWorkbookMapper() {
		return new POIWorkbookMapper();
	}

	@Bean
	public POIWorkbookReader poiWorkbookReader() {
		return new POIWorkbookReader();
	}
	
	@Bean
	public POIWorkbookWriter poiWorkbookWriter() {
		return new POIWorkbookWriter();
	}

}
