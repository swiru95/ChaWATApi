package com.example.chawatapi;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class site_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site_activity);
        WebView webView = (WebView) findViewById(R.id.main_site);
        if(webView==null)
            throw new RuntimeException("NULL webView");
        webView.setWebViewClient(new WebViewClient());
        String url=getIntent().getStringExtra("URL_VAR");
        webView.loadUrl(url);
    }
}
