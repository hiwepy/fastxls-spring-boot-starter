package net.jeebiz.fastxls.spring.boot;

import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

import net.jeebiz.fastxls.spring.boot.property.FastxlsExportProperties;
import net.jeebiz.fastxls.spring.boot.property.FastxlsImportProperties;
import net.jeebiz.fastxls.spring.boot.property.FastxlsStoreProperties;
import net.jeebiz.fastxls.spring.boot.property.FastxlsValidationProperties;

@Configuration
@ConditionalOnProperty(prefix = FastxlsProperties.PREFIX, value = "enabled", havingValue = "true")
@EnableConfigurationProperties({ FastxlsProperties.class, FastxlsStoreProperties.class,
		FastxlsImportProperties.class, FastxlsExportProperties.class, FastxlsValidationProperties.class })
public class FastxlsAutoConfiguration implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

}
