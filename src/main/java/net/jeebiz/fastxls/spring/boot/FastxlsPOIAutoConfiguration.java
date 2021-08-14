/** 
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved. 
 */
package net.jeebiz.fastxls.spring.boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.hiwepy.fastxls.poi.POIWorkbookConverter;
import com.github.hiwepy.fastxls.poi.POIWorkbookCopyer;
import com.github.hiwepy.fastxls.poi.POIWorkbookExtractor;
import com.github.hiwepy.fastxls.poi.POIWorkbookFiller;
import com.github.hiwepy.fastxls.poi.POIWorkbookMapper;
import com.github.hiwepy.fastxls.poi.POIWorkbookReader;
import com.github.hiwepy.fastxls.poi.POIWorkbookWriter;

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
