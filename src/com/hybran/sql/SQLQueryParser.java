package com.hybran.sql;

public class SQLQueryParser {

	
	
	public String createTableValues(String TABLE_NAME, String[] values, String[] types){
		String toString="";
		String TABLE_ID = "__id";
		for (int i = 0; i < values.length; i++) {
			if (i!=values.length-1) {
				toString=toString+values[i]+" "+types[i]+", ";
			}
			else {
				toString=toString+values[i]+" "+types[i];
			}
		}
		
		String query = "create table " + TABLE_NAME
				+ "(" 
				+ TABLE_ID
				+ " integer primary key autoincrement, "
				+toString
				+");";
		
		return query;
	}
	
}
