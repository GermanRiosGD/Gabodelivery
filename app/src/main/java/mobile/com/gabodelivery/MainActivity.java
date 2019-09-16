package mobile.com.gabodelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        browser = findViewById(R.id.wvContenido);
        browser.setBackgroundColor(Color.BLACK);
        browser.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                view.loadUrl(url);
                return true;
            }
        });
        browser.getSettings().setJavaScriptEnabled(true);
        browser.loadUrl("https://gabodelivery.com/mobile/");
    }
    @Override
    public void onBackPressed(){
        if(browser.canGoBack()){
            browser.goBack();
        }else{
            super.onBackPressed();
        }
    }
}
