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
import net.jeebiz.fastxls.core.FilenameSuffix;

@ConfigurationProperties(FastxlsStoreProperties.PREFIX)
@Getter
@Setter
@ToString
public class FastxlsStoreProperties {

	public static final String PREFIX = "spring.imexport.store";
	
	/**
	 * Imexport组件使用的根目录  ，默认 ：imexportDir
	 */
	private String dir = "imexportDir";
	/**
	 * xls 临时文件存储路径 ，默认 ：tmpDir
	 */
	private String tmpdir = "tmpDir";
	/**
	 * xls 模板文件存储路径 ，默认 ：templateDir
	 */
	private String template = "templateDir";
	/**
	 * xls 文件存储时，文件名后的前缀字符串 【前缀字符串-文件名.xls】 ，默认 ：空
	 */
	private String prefix = "";
	/**
	 * xls 文件存储时，文件名后的后缀字符串 【文件名-后缀字符串.xls】生成方式 ，可选【Date,UUID】，默认 ：UUID
	 */
	private FilenameSuffix suffix = FilenameSuffix.UUID;
	
}
