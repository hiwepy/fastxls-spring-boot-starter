/*
 * Copyright (c) 2018, vindell (https://github.com/vindell).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package net.jeebiz.fastxls.spring.boot;

import org.apache.commons.lang3.SystemUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ConfigurationProperties(FastxlsPOIProperties.PREFIX)
@Getter
@Setter
@ToString
public class FastxlsPOIProperties {

	public static final String PREFIX = "spring.fastxls.poi";
	
	/** Whether Enable Imexport. */
	private boolean enabled = false;
	/**
	 * 编码格式 ，默认： UTF-8
	 */
	private String encoding = "UTF-8";
	
	/**
	 * 临时目录
	 */
	private String tempdir = SystemUtils.getUserDir().getAbsolutePath();
	
}
