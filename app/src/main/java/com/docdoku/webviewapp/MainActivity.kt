package com.docdoku.webviewapp

import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    /**
     * TODO(1): Add a webview in your activity_main layout
     * TODO(2): Set a new WebViewClient to your WebView
     * TODO(3): Enable Javascript in the webview
     * TODO(4): Load your desired URL (e.g: www.docdoku.com)
     * TODO(5): When user presses the back button, go back in the webview history if any.
     * Otherwise, use the default behavior of onBackPressed
     * TODO(6): Create a new class extending WebViewClient
     * This class should override shouldOverrideUrlLoading
     * Each URL targeting your domain (e.g docdoku.com) are handled by your webview
     * Otherwise, your host application will handle the url. For example, you'd call a startActivity to view the url
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webview.settings.javaScriptEnabled = true
        webview.webViewClient = MyWebViewClient()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            WebView.setWebContentsDebuggingEnabled(true)
        }

    }

    override fun onStart() {
        super.onStart()
        webview.loadUrl("http://www.docdoku.com/")
    }

    override fun onBackPressed() {
        if (webview.canGoBack()) {
            webview.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
