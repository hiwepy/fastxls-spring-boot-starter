/** 
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved. 
 */
package net.jeebiz.fastxls.spring.boot.task;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.Builder;
import org.springframework.util.StringUtils;

public class DataImportSQLBuilder implements Builder<String> {

	/**
	 *数据表名称 
	 */
	private String tableName;
	/**
	 *主键名称 
	 */
	private String primarykey;
	/**
	 * 数据列信息,当数据导出的数据为CachedRowSet、List<Map<String,String>> 时，需要用到
	 */
	private List<Map<String, String>> cloumnList;

	public DataImportSQLBuilder tableName(String tableName){
		this.tableName = tableName;
		return this;
	}
	
	public DataImportSQLBuilder primarykey(String primarykey){
		this.primarykey = primarykey;
		return this;
	}
	
	public DataImportSQLBuilder sheetName(List<Map<String, String>> cloumnList){
		this.cloumnList = cloumnList;
		return this;
	}
	
	private String getTransformContent(Map<String, String> values,String column_name){
		String transform = values.get(column_name+"_transform");
		if(null!=transform&&transform.length()>0){
			return StringUtils.quote(transform);
		}
		return StringUtils.quote(values.get(column_name));
	}
	
	@Override
	public String build() {
		/*
		// 生成动态SQL
		StringBuilder prefix = new StringBuilder("INSERT INTO " + this.getTableName() + "(");
		StringBuilder suffix = new StringBuilder(" VALUES(");
		// 主键不为空
		if(StringUtils.hasText(this.getPrimarykey())){
			prefix.append(this.getPrimarykey() + ",");
			//使用占位符取值
			suffix.append(" '#{").append(this.getPrimarykey()).append("}' ,");
		}
		// 遍历字段信息
		for (Map<String,String> column :  this.getCloumnList()) {
			// 匹配字段
			String column_name = column.get("column").toLowerCase();
			// 判断当前字段是否需要动态生成
			boolean auto_key = MapUtils.getBoolean(column, "auto_key");
			
			
			prefix.append(column_name + ",");
			suffix.append(" '#{").append(column_name).append("}' ,");
			//如果做了映射表示此处需要插入ID的同时，也要插入原数据名称，则进一步处理，否则无操作
			String name_mapper = column.get("mapper");
			if(name_mapper!=null){
				prefix.append(name_mapper + ",");
				suffix.append(" '#{").append(name_mapper).append("}' ,");
			}
		}
		prefix = prefix.deleteCharAt(prefix.length() - 1).append(") ");
		suffix = suffix.deleteCharAt(suffix.length() - 1).append(")");
		String SQL = prefix.toString() + prefix.toString();
		
		
		//逐行操作数据
		Map<String, String> values = null;
		Map<String, String> objects = null;
		for (int rowIndex = 0;rowIndex < rows.size() ;rowIndex++) {
			try {
				Row row = rows.get(rowIndex);
				if (row != null) {
					values = new HashMap<String, String>();
					objects = new HashMap<String, String>();
					int lastCellNum = row.getLastCellNum();
					
					//收集当前行记录每个值对应字段关系，并存储在Map中
					for (int i = 0; i < matchColumns.size(); i++) {
						ColumnsModel matchColumn = matchColumns.get(i);
						Cell cell = row.getCell(Integer.parseInt(matchColumn.getIndex()));
						String content = "",content_transform = "";
						if (cell == null){
							content_transform = "";
						} else {
							//请注意，带格式的字符串会出现问题
							if (cell.getCellType() != CellType.STRING) {
								cell.setCellType(CellType.STRING);
							}
							content = cell.getStringCellValue();
							content_transform = transformService.transformValue(matchColumn.getColumn_name(), content);
							values.put(matchColumn.getColumn_name().toLowerCase(), content);
							values.put(matchColumn.getColumn_name().toLowerCase()+"_transform", content_transform);
						}
					}
						
					//主键不为空
					if(StringUtils.hasText(arguments.getPrimarykey())){
						//获取ID
						String sys_guid = row.getCell(lastCellNum - 1).getRichStringCellValue().getString();
						objects.put(arguments.getPrimarykey(), StringUtils.quoteIfString(sys_guid).toString());
					}
					//遍历字段信息
					for (Map<String,String> column : columnsList) {
						//匹配字段
						String column_name = column.get("column_name").toLowerCase();
						// 判断当前字段是否需要动态生成
						String auto_key = column.get("auto_key");
						if(auto_key!=null&&"1".equals(auto_key)){
							//判断当前配置的字段是否是根据其他字段生成值		
							Map<String,String>  key_mapper = queryService.getDynamicColumn(column_name);
							if(key_mapper!=null){
								//生成方式有两种，一种直接根据 key_mapper 的字符内容进行格式化，一种是根据配置的转换sql进行查询
								String key_text = key_mapper.get("auto_key_text");
								String key_sql = key_mapper.get("auto_key_sql");
								String auto_key_val = null;
								//如果做了"auto_key_sql" 的配置， 先采用转换sql进行查询
								if(null!=key_sql&&key_sql.length()>0){
									auto_key_val = transformService.transformValue(key_sql, values);
								}
								//如果采用转换sql进行查询后结果任然是空，尝试用 根据 key_text 的字符内容进行格式化的转换
								if(null==auto_key_val){
									//如果配置了"auto_key_text"，继续采用根据 auto_key_text 的字符内容进行格式化
									if(null!=key_text&&key_text.length()>0){
										//objects.put(column_name, StringUtils.quote(StringPatternFormat.getInstance().format(key_text, values).toLowerCase()));
									}else{
										objects.put(column_name, getTransformContent(values, column_name));
									}
								}else{
									objects.put(column_name,StringUtils.quote(auto_key_val));
								}
							}else{
								//正常的配置
								//拼接默认的导入字段,原始字段或者转换后的ID
								objects.put(column_name,getTransformContent(values, column_name));
							}
						}else{
							objects.put(column_name,getTransformContent(values, column_name));
						}
						//如果做了映射表示此处需要插入ID的同时，也要插入原数据名称，则进一步处理，否则无操作
						String name_mapper = column.get("mapper");
						if(name_mapper!=null){
							//取原值
							objects.put(name_mapper,StringUtils.quote(values.get(column_name)));
						}
					}
					//最终的SQL
					//SQL = StringPatternFormat.getInstance().format(SQL, objects);
					//增加数据
					log.info(" INSERT SQL: ["+SQL+"]");
					importProvider.insertRow(SQL);
					result.addSuccess(arguments.getSheetName(), arguments.getOffset() +rowIndex);
				}
			} catch (Exception e) {
				result.addError(arguments.getSheetName(), arguments.getOffset() +rowIndex);
				e.printStackTrace();
				continue;
			}
		}*/
		
		return null;
	}

	protected String getTableName() {
		return tableName;
	}
	
	public String getPrimarykey() {
		return primarykey;
	}

	protected List<Map<String, String>> getCloumnList() {
		return cloumnList;
	}

}
