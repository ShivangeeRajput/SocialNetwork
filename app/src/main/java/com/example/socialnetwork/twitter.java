package com.example.socialnetwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class twitter extends AppCompatActivity {

    private WebView webView;
    private SwipeRefreshLayout swipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);

        getSupportActionBar().setTitle("TWITTER");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        swipe = (SwipeRefreshLayout) findViewById(R.id.swipe);
        swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                LoadWeb();
            }
        });

        LoadWeb();
    }
    public void LoadWeb(){

        webView = (WebView) findViewById(R.id.webview1);
        webView.getSettings().setJavaScriptEnabled(true);
        //webView.settings.cacheMode = WebSettings.LOAD_DEFAULT;
        webView.loadUrl("https://www.twitter.com/");
        swipe.setRefreshing(true);
        webView.setWebViewClient(new WebViewClient(){



            public  void  onPageFinished(WebView view, String url){

                //Hide the SwipeRefreshLayout

                swipe.setRefreshing(false);
            }

        });
    }

    @Override
    public void onBackPressed(){

        if (webView.canGoBack()){
            webView.goBack();
        }else {
            finish();
        }
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;

    }
}