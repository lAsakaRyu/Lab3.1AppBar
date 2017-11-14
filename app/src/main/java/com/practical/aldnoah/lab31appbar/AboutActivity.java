package com.practical.aldnoah.lab31appbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutActivity extends AppCompatActivity {
    private WebView webViewAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        webViewAbout = (WebView)findViewById(R.id.webViewAbout);
        webViewAbout.loadUrl("http://bait2073.000webhostapp.com/welcome.html");
    }
}
