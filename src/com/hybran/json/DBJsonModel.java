package com.hybran.json;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class DBJsonModel {
	
	@SerializedName("table_name")
	private String tableName;
	@SerializedName("fields")
	private List<String> fieldsName = new ArrayList<String>();
	
	
	public void addArrayToList(String[] fields){
		for (String field : fields) {
			fieldsName.add(field);
		}
	}
	
	//////// CONSTRUCTORS //////////
	public DBJsonModel(String tableName, String[] fields) {
		super();
		setTableName(tableName);
		addArrayToList(fields);
	}
	////////////////	GETTER AND SETTER
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public List<String> getFieldsName() {
		return fieldsName;
	}
	public void setFieldsName(List<String> fieldsName) {
		this.fieldsName = fieldsName;
	}
	
	
}
