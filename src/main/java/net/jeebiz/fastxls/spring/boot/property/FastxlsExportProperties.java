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
package net.jeebiz.fastxls.spring.boot.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ConfigurationProperties(FastxlsExportProperties.PREFIX)
@Getter
@Setter
@ToString
public class FastxlsExportProperties {

	public static final String PREFIX = "spring.imexport.export";

	/**
	 * 是否在存储导出的文件 . 默认 false.
	 */
	private boolean store = false;
	
	/**
	 * 否在存储导出的文件时，文件名称加上前缀字符串  【前缀字符串-文件名.xls】, 默认 false
	 */
	private boolean storePrefix = false;
	
	/**
	 * 是否在存储导出的文件时，文件名称加上后缀字符串  【文件名-后缀字符串.xls】, 默认 false
	 */
	private boolean storeSuffix = false;
	
	/**
	 * 每次的导出中允许创建的线程池最大容量，默认：20
	 */
	private int threadMax = 20;
	
	/**
	 * 导出xls文件时,单个线程最大处理行,默认 500.
	 */
	private int threadBatchSize = 500;
	
	/**
	 * 导出xls文件时,每个Sheet最大允许有多少行，超过工作簿最大65536时候则以65536为最大值
	 */
	private int rowLimit = 10000;
	
}
