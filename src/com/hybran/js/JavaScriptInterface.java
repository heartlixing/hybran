package com.hybran.js;


import android.content.Context;
import android.widget.Toast;

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
    
    
}
