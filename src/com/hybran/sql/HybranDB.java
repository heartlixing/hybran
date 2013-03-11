package com.hybran.sql;

import java.util.Enumeration;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;

public class HybranDB extends SQLQueryParser {

	private SQLiteDatabase database;
	private HybranSQLHelper hSqlHelper;
	
	public HybranDB(Context context) {
		hSqlHelper = new HybranSQLHelper(context);
	}
	
	//open db
	public void open() throws SQLException {
		database = hSqlHelper.getWritableDatabase();
	}

	//close db
	public void close() {
		hSqlHelper.close();
	}

	
	// ---------------------- 		CRUD	--------------------
	
	//Create new table.  Exp: createTableValues('table',['name','surname'],['text not null','INTEGER(2)'])
	public void createTable(String TABLE_NAME, String[] values, String[] types) {
		String query = createTableValues(TABLE_NAME, values, types);
		database.execSQL(query);
	}
	
	public void insert(String TABLE_NAME){
		ContentValues values = new ContentValues();
		
	}

	// ////////////////////////// GETTER SETTER ///////////////////////////

}
