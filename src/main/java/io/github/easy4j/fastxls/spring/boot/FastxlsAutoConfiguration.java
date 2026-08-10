/** 
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved. 
 */
package io.github.easy4j.fastxls.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.biz.context.NestedMessageSource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.easy4j.fastxls.core.provider.def.DefaultValidationMessageProvider;

/**
 * Spring Boot auto-configuration for the Fastxls core module.
 * <p>Activates when {@link DefaultValidationMessageProvider} is on the classpath and
 * registers the default validation message provider bean used to resolve
 * cell-level validation messages during spreadsheet import and export.</p>
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
@Configuration
@ConditionalOnClass({DefaultValidationMessageProvider.class})
@EnableConfigurationProperties({ FastxlsExportProperties.class, FastxlsImportProperties.class})
public class FastxlsAutoConfiguration {

	/**
	 * Creates the default validation message provider used to resolve
	 * cell-level validation messages when exporting or importing spreadsheets.
	 * @param messageSource optional nested message source used for i18n
	 * resolution, may be {@code null} when no source is configured
	 * @return the default validation message provider bean
	 */
	@Bean
	@ConditionalOnMissingBean
	public DefaultValidationMessageProvider validationMessageProvider(
			@Autowired(required = false) NestedMessageSource messageSource) {
		return new DefaultValidationMessageProvider(messageSource);
	}

}
