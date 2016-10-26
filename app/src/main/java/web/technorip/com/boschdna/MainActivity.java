package web.technorip.com.boschdna;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView myWebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myWebview =(WebView)findViewById(R.id.bosh);
        WebSettings webSettings = myWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebview.loadUrl("http://boschdna.makervillage.in/signup/");
        myWebview.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(myWebview.canGoBack())
        {
          myWebview.goBack();
        }else {
            super.onBackPressed();
        }

    }
}
