package swiru95.chwat.chawatapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.chawatapi.R;

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
