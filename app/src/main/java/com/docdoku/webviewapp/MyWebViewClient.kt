package com.docdoku.webviewapp

import android.content.Intent
import android.net.Uri
import android.webkit.WebView
import android.webkit.WebViewClient

class MyWebViewClient : WebViewClient() {

    override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
        if (Uri.parse(url).host.endsWith("docdoku.com")) {
            return false
        }
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        view?.getContext()?.startActivity(intent)
        return true
    }
}
