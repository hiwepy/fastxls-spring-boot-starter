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

import java.util.List;
import java.util.Map;
/**
 * 数据查询service层接口
 */
public interface DataQueryProvider {
	
	/**
	 * 得到真实表名
	 * @param table_alias
	 * @return
	 */
	public String getName(String table_alias);
	
	/**
	 * 根据别名得到视图名称
	 * @param tableAlias
	 * @return
	 */
	public String getViewName(String tableAlias);
	
	/**
	 * 
	 * @description: 得到表描述信息
	 * @author : wandalong
	 * @date : 2014-4-11
	 * @time : 下午03:13:32 
	 * @param table_name
	 * @return
	 */
	public String getComments(String table_alias);
	
	/**
	 * 
	 * @description: 得到表名的动态转换表名
	 * @author : wandalong
	 * @date : 2014-4-11
	 * @time : 下午03:13:43 
	 * @param table_name
	 * @return
	 */
	public String getDynamicName(String table_name);
	
	/**
	 * 
	 * @description: 得到模板信息
	 * @author : wandalong
	 * @date : 2014-4-22
	 * @time : 上午09:23:17 
	 * @param table_alias
	 * @return
	 */
	public String getTemplate(String table_alias);
	
	/**
	 * 
	 * @description: 得到表名对应的字段关系
	 * @author : wandalong
	 * @date : 2014-4-11
	 * @time : 下午03:14:01 
	 * @param table_name
	 * @return
	 */
	public List<Map<String,String>> getMapperColumnsList(String table_name);
	
	/**
	 * 
	 * @description: 得到表名对应的导入字段关系
	 * 				  定义了指定了readonly的字段且readonly=false
	 * @author : wandalong
	 * @date : 2014-4-11
	 * @time : 下午03:14:01 
	 * @param table_name
	 * @return
	 */
	public List<Map<String,String>> getImportMapperColumnsList(String table_name);
	
	
	/**
	 * 
	 * @description: 根据表名和字段得到配置对应的字段信息
	 * @author : wandalong
	 * @date : 2014-4-11
	 * @time : 下午03:14:08 
	 * @param table_name
	 * @param column_name
	 * @return
	 */
	public Map<String,String> getMapperColumns(String table_name,String column_name);
	
	/**
	 * 
	 * @description: 得到字段的直接转换SQL
	 * @author : wandalong
	 * @date : 2014-4-11
	 * @time : 下午03:14:17 
	 * @param column_name
	 * @return
	 */
	public String getColumnTransformSQL(String column_name);
	
	/**
	 * 
	 * @description: 表名对应的特殊列转换SQL集合
	 * @author : wandalong
	 * @date : 2014-4-15
	 * @time : 上午11:20:16 
	 * @return
	 */
	public Map<String,String> getColumnTransformMap();
	
	/**
	 * 
	 * @description: 得到字段的动态转换信息
	 * @author : wandalong
	 * @date : 2014-4-11
	 * @time : 下午03:14:28 
	 * @param column_name
	 * @return
	 */
	public Map<String,String> getDynamicColumn(String column_name);

	/**
	 * 
	 * @description: 根据SQL和参数查询某字段在当前表中的记录数
	 * @author : wandalong
	 * @date : 2014-4-15
	 * @time : 下午03:51:43 
	 * @param string
	 * @param params
	 * @return
	 */
	public int getUniqueColumns(String sql, List<Object> params);

	public String getSysGuid();
	
	
}
