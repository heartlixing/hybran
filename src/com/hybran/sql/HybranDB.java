package com.hybran.sql;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class HybranDB extends SQLParser {

	private SQLiteDatabase database;
	private HybranSQLHelper hSqlHelper;

	public HybranDB(Context context) {
		hSqlHelper = new HybranSQLHelper(context);
	}
	
	//Yazýlabilir db baðlantýsýný aç
	public void open() throws SQLException {
		database = hSqlHelper.getWritableDatabase();
	}

	//Yazýlabilir db baðlantýsýný kapat
	public void close() {
		hSqlHelper.close();
	}

	
	//Yeni tablo oluþtur.  Örn createTableValues('table',['name','surname'],['text not null','INTEGER(2)'])
	public void createTable(String TABLE_NAME, String[] values, String[] types) {
		String query = createTableValues(TABLE_NAME, values, types);
		database.execSQL(query);
	}

	// ////////////////////////// GETTER SETTER ///////////////////////////

}
