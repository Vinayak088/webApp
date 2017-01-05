package loginapp.moblie.jspider.com.myfirstapp;

import android.os.ParcelFileDescriptor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public WebView webview;
    Button button1;
    Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webview=(WebView)findViewById(R.id.b1);
        button1=(Button)findViewById(R.id.b2);
        button2=(Button)findViewById(R.id.b3);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                webview.loadUrl("https://paytm.com/");
                requestWindowFeature(Window.FEATURE_NO_TITLE);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.loadUrl("http://youtube.com/");
            }
        });

        WebSettings webSetting=webview.getSettings();
        webSetting.setJavaScriptEnabled(true);


    }


}
