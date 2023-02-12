package com.nsp.sun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    WebView wvShowSite;
    WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        wvShowSite = (WebView) findViewById(R.id.wvShowSite);

        webSettings = wvShowSite.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);

        wvShowSite.setWebViewClient(new MyWebViewClient());

        Uri url = getIntent().getData();
        wvShowSite.loadUrl(url.toString());
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent keyEvent) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && this.wvShowSite.canGoBack()){
            this.wvShowSite.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, keyEvent);
    }

    @Override
    public void onBackPressed() {
        if (wvShowSite.canGoBack()){
            wvShowSite.goBack();
        }
        super.onBackPressed();
    }

    private static class MyWebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (url.contains("nsp-sun.com")){
                return false;
            }

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            view.getContext().startActivity(intent);
            return true;
        }
    }
}