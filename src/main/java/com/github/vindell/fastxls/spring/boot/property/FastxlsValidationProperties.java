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
package com.github.vindell.fastxls.spring.boot.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ConfigurationProperties(FastxlsValidationProperties.PREFIX)
@Getter
@Setter
@ToString
public class FastxlsValidationProperties {

	public static final String PREFIX = "spring.imexport.validation";

	/**
	 * 每次的数据验证中允许创建的线程池最大容量，默认：20
	 */
	private int threadMax = 20;
	
	/**
	 * 验证xls文件时,单个线程最大处理行,默认 500.
	 */
	private int threadBatchSize = 500;
	
}
