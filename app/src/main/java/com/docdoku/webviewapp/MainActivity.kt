package com.docdoku.webviewapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    /**
     * TODO(1): Add a webview in your activity_main layout
     * TODO(2): Enable Javascript in the webview
     * TODO(3): Load your desired URL (e.g: www.docdoku.com)
     * TODO(4): When user presses the back button, go back in the webview history if any.
     * Otherwise, use the default behavior of onBackPressed
     * TODO(5): Add a class extending WebViewClient to your webview
     * This class should override shouldOverrideUrlLoading
     * Each URL targeting your domain (e.g docdoku.com) are handled by your webview
     * Otherwise, your host application will handle the url. For example, you'd call a startActivity to view the url
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
