package net.jeebiz.fastxls.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.biz.context.NestedMessageSource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.jeebiz.fastxls.core.provider.def.DefaultValidationMessageProvider;
import net.jeebiz.fastxls.spring.boot.property.FastxlsExportProperties;
import net.jeebiz.fastxls.spring.boot.property.FastxlsImportProperties;
import net.jeebiz.fastxls.spring.boot.property.FastxlsStoreProperties;
import net.jeebiz.fastxls.spring.boot.property.FastxlsValidationProperties;

@Configuration
@ConditionalOnProperty(prefix = FastxlsProperties.PREFIX, value = "enabled", havingValue = "true")
@EnableConfigurationProperties({ FastxlsProperties.class, FastxlsStoreProperties.class,
		FastxlsImportProperties.class, FastxlsExportProperties.class, FastxlsValidationProperties.class })
public class FastxlsAutoConfiguration {

	@Bean
	@ConditionalOnMissingBean
	public DefaultValidationMessageProvider validationMessageProvider(
			@Autowired(required = false) NestedMessageSource messageSource) {
		return new DefaultValidationMessageProvider(messageSource);
	}

}
