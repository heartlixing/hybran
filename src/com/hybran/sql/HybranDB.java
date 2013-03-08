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
	
	//Yaz�labilir db ba�lant�s�n� a�
	public void open() throws SQLException {
		database = hSqlHelper.getWritableDatabase();
	}

	//Yaz�labilir db ba�lant�s�n� kapat
	public void close() {
		hSqlHelper.close();
	}

	
	//Yeni tablo olu�tur.  �rn createTableValues('table',['name','surname'],['text not null','INTEGER(2)'])
	public void createTable(String TABLE_NAME, String[] values, String[] types) {
		String query = createTableValues(TABLE_NAME, values, types);
		database.execSQL(query);
	}

	// ////////////////////////// GETTER SETTER ///////////////////////////

}
