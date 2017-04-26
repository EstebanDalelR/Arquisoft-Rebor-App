package com.example.esteban.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Create Webview
        mWebView = (WebView) findViewById(R.id.activity_main_webview);
        WebSettings webSettings = mWebView.getSettings();
        //allow JS
        webSettings.setJavaScriptEnabled(true);
        //URL to be loaded
        mWebView.loadUrl("http://estebandalelr.co/");
        //force links in web view
        mWebView.setWebViewClient(new WebViewClient());
    }
}
