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
/**
 * 动态导出的字段查询接口，用户需要实现此接口
 */
public interface DynamicQueryProvider {
	
	/**
	 * 给出用户可扩展的导出列对象接口
	 * @param table_name
	 * @return
	 */
	public List<Object> getDynamicColumnsList(String table_name);
	
	
}
