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
package net.jeebiz.fastxls.spring.boot.provider;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.List;

import net.jeebiz.fastxls.core.model.DataModel;

/**
 * 数据导出xls文件,数据导入模板生成service层接口
 */
public interface DataExportProvider {

	/**
	 * 通过参数导出数据导入xls模板，写到字节输出流
	 * 
	 * @param bean
	 * @param out
	 * @return
	 * @throws Exception
	 */
	public InputStream templateExport(DataModel bean, ByteArrayOutputStream out) throws Exception;

	/**
	 * 通过参数导出数据导入xls模板，写到指定路径
	 * 
	 * @param bean
	 * 
	 * @return
	 * @throws Exception
	 */
	public InputStream templateExport(DataModel bean, String outPath) throws Exception;

	/**
	 * 快速导出Excel;实现页面所见数据导出功能，直接导出页面所见的列，选择的行
	 * 
	 * @param bean
	 * @param list
	 * @param out
	 * @return
	 * @throws Exception
	 */
	public InputStream dataExportFast(DataModel bean, ByteArrayOutputStream out) throws Exception;

	public InputStream dataExportFast(DataModel bean, File outPath) throws Exception;

	/**
	 * 通过参数导出xls，写到ByteArrayOutputStream
	 * 
	 * @param bean
	 * @param out
	 * @return
	 * @throws Exception
	 */
	public InputStream dataExportComplex(DataModel bean, ByteArrayOutputStream out) throws Exception;

	/**
	 * 通过参数导出xls，写到指定路径
	 * 
	 * @param bean
	 * 
	 * @return
	 * @throws Exception
	 */
	public InputStream dataExportComplex(DataModel bean, File outPath) throws Exception;

	/**
	 * 通过参数依据模板导出xls，写到ByteArrayOutputStream
	 * 
	 * @param bean
	 * @param list
	 * @param out
	 * @return
	 * @throws Exception
	 */
	public InputStream dataExportReflex(DataModel bean, List<Object> list, ByteArrayOutputStream out)
			throws Exception;

	/**
	 * 通过参数依据模板导出xls，写到指定路径
	 * 
	 * @param bean
	 * @param list
	 * @param out
	 * @return
	 * @throws Exception
	 */
	public InputStream dataExportReflex(DataModel bean, List<Object> list, File outPath) throws Exception;

	/**
	 * 通过参数依据模板导出xls，写到输出流
	 * 
	 * @param bean
	 * @param out
	 * @return
	 * @throws Exception
	 */
	public InputStream dataExportComplexWithTemplate(DataModel bean, ByteArrayOutputStream out) throws Exception;

	/**
	 * 通过参数依据模板导出xls，写到指定路径
	 * 
	 * @param bean
	 * 
	 * @return
	 * @throws Exception
	 */
	public InputStream dataExportComplexWithTemplate(DataModel bean, String outPath) throws Exception;

	/**
	 * 通过参数依据模板导出xls，写到ByteArrayOutputStream
	 * 
	 * @param bean
	 * @param list
	 * @param out
	 * @return
	 * @throws Exception
	 */
	public InputStream dataExportReflexWithTemplate(DataModel bean, List<Object> list, ByteArrayOutputStream out)
			throws Exception;

	/**
	 * 通过参数依据模板导出xls，写到ByteArrayOutputStream
	 * 
	 * @param bean
	 * @param list
	 * @param out
	 * @return
	 * @throws Exception
	 */
	public InputStream dataExportReflexWithTemplate(DataModel bean, List<Object> list, String outPath)
			throws Exception;

}
