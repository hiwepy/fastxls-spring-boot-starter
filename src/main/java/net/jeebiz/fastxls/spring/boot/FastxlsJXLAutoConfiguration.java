package net.jeebiz.fastxls.spring.boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.jeebiz.fastxls.jexcel.JXLWorkbookFiller;
import net.jeebiz.fastxls.jexcel.JXLWorkbookMapper;
import net.jeebiz.fastxls.jexcel.JXLWorkbookReader;
import net.jeebiz.fastxls.spring.boot.property.FastxlsExportProperties;
import net.jeebiz.fastxls.spring.boot.property.FastxlsImportProperties;
import net.jeebiz.fastxls.spring.boot.property.FastxlsStoreProperties;
import net.jeebiz.fastxls.spring.boot.property.FastxlsValidationProperties;

@Configuration
@ConditionalOnProperty(prefix = FastxlsProperties.PREFIX, value = "enabled", havingValue = "true")
@EnableConfigurationProperties({ FastxlsProperties.class, FastxlsStoreProperties.class,
		FastxlsImportProperties.class, FastxlsExportProperties.class, FastxlsValidationProperties.class })
public class FastxlsJXLAutoConfiguration  {
	
	@Bean
	public JXLWorkbookFiller jxlWorkbookFiller() {
		return new JXLWorkbookFiller();
	}

	@Bean
	public JXLWorkbookMapper jxlWorkbookMapper() {
		return new JXLWorkbookMapper();
	}

	@Bean
	public JXLWorkbookReader jxlWorkbookReader() {
		return new JXLWorkbookReader();
	}

}
