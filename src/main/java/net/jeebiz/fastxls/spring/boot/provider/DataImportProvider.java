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

import java.io.File;
import java.io.IOException;

import net.jeebiz.fastxls.core.model.DataModel;
import net.jeebiz.fastxls.core.model.RowMapper;
import net.jeebiz.fastxls.core.model.ConstraintViolationResult;

/**
 * TODO
 * @author 		： <a href="https://github.com/vindell">wandl</a>
 */
public interface DataImportProvider<M extends RowMapper> {

	void insertRow(String sQL);
	
	/**
	 * 生成每行数据主键ID
	 */
	public void initializeSysGuid(DataModel arguments) throws IOException;

	/**
	 * 对导入的数据进行字段不为空检查
	 * 
	 * @param <T>
	 * @param arguments
	 * @return
	 * @throws Exception
	 */
	public <T> ConstraintViolationResult<M> dataEmptyFieldCheck(DataModel arguments) throws Exception;

	/**
	 * 对导入的数据进行字段唯一约束检查
	 * 
	 * @param <T>
	 * @param arguments
	 * @return
	 * @throws Exception
	 */
	public <T> ConstraintViolationResult<M> dataUniqueColumnsCheck(DataModel arguments) throws Exception;

	/**
	 * 对导入的数据进行数据库新增操作
	 * 
	 * @param <T>
	 * @param arguments
	 * @return
	 * @throws Exception
	 */
	public <T> ConstraintViolationResult<M> dataImport(File file) throws Exception;

	/**
	 * 对导入的数据进行数据库更新操作
	 * 
	 * @param <T>
	 * @param arguments
	 * @return
	 * @throws Exception
	 */
	public <T> ConstraintViolationResult<M> dataImportUpdate(File file) throws Exception;

	/**
	 * 完成操作后清除数据中的临时列
	 */
	public void clearSysGuid(DataModel arguments) throws IOException;

}
