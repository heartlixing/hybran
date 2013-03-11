package com.hybran.js;



import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.json.JSONObject;

import android.content.Context;
import android.os.Environment;
import android.widget.Toast;

import com.google.gson.Gson;
import com.hybran.json.DBJsonModel;

public class JavaScriptInterface{
	
	Context mContext;
    public JavaScriptInterface(Context c) {
        mContext = c;
    }
    
    public void showToast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
    }
    
    public String returnable(String toast) {
        return toast;
    }
    
    public boolean returnbool(){
    	return true;
    }
    
    public void asd(){
    	showToast(Environment.getExternalStorageDirectory().getPath());
    }
    
    @SuppressWarnings("unchecked")
	public void writeJson(){
    	try{
    		Gson gson = new Gson();
    		DBJsonModel dbModel = new DBJsonModel("asd",new String[]{"asd","www"});
        	String json =gson.toJson(dbModel);
        	
        	FileWriter file = new FileWriter(Environment.getExternalStorageDirectory().getPath()+File.separator+"test.json");
    		file.write(json);
    		file.flush();
    		file.close();
    		
    		showToast(json);
		} catch (Exception e) {
			showToast("-------------->>>>>>>");
		}
    }
    
    
    public void reader(){
    	try {
    		JSONObject o = new JSONObject();
    		FileReader f = new FileReader(Environment.getExternalStorageDirectory().getPath()+File.separator+"test.json");
    		showToast("okok");
		} catch (Exception e) {
			showToast("hatavar");
		}
    	
    }
    
    
}
