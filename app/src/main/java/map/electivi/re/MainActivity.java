package map.electivi.re;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import android.view.Window;
import android.view.WindowManager;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Show the status bar and ensure the system bars are not hidden
        WindowInsetsControllerCompat windowInsetsController =
                ViewCompat.getWindowInsetsController(getWindow().getDecorView());
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsetsCompat.Type.statusBars());
        }

        // Set status bar color to black
        Window window = getWindow();
        window.setStatusBarColor(Color.BLACK);

        // Set up WebView and enable necessary settings
        WebView webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient()); // Prevents loading in an external browser

        // Enable JavaScript and Local Storage in WebView
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true); // Enable Local Storage support
        webSettings.setCacheMode(WebSettings.LOAD_DEFAULT); // Enable caching for faster loading

        // Load the website URL
        webView.loadUrl("https://map.electivi.re"); // Replace with your website URL
    }
}
