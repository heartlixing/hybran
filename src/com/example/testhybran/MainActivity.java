package com.example.testhybran;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.hybran.js.Deneme;
import com.hybran.js.JavaScriptInterface;

@SuppressLint("SetJavaScriptEnabled")
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		WebView webView = (WebView) findViewById(R.id.webView1);
		  WebSettings webSettings = webView.getSettings();
		  webSettings.setJavaScriptEnabled(true);
		  webView.addJavascriptInterface(new JavaScriptInterface(this), "furkan");
		  webView.addJavascriptInterface(new Deneme(this), "remazan");
		  webView.loadUrl("file:///android_asset/html/index.html");
		  
	}

}
