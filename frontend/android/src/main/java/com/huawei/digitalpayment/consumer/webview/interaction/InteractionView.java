package com.huawei.digitalpayment.consumer.webview.interaction;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;

public interface InteractionView {
    boolean checkPermission(String str);

    void evaluateJavascript(String str, ValueCallback<String> valueCallback);

    FragmentActivity getHostActivity();

    WebView getWebView();
}
