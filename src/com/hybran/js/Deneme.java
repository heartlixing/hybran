package com.hybran.js;

import android.content.Context;
import android.widget.Toast;

public class Deneme {
	
	Context mContext;
    public Deneme(Context c) {
        mContext = c;
    }
    
    public void showToast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
    }

}
