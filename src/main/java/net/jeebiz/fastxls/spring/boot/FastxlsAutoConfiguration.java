/** 
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved. 
 */
package net.jeebiz.fastxls.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.biz.context.NestedMessageSource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.hiwepy.fastxls.core.provider.def.DefaultValidationMessageProvider;

@Configuration
@ConditionalOnClass({DefaultValidationMessageProvider.class})
@EnableConfigurationProperties({ FastxlsExportProperties.class, FastxlsImportProperties.class})
public class FastxlsAutoConfiguration {

	@Bean
	@ConditionalOnMissingBean
	public DefaultValidationMessageProvider validationMessageProvider(
			@Autowired(required = false) NestedMessageSource messageSource) {
		return new DefaultValidationMessageProvider(messageSource);
	}

}
