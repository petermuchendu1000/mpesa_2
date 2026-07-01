package com.huawei.digitalpayment.consumer.baselib.webview;

import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alibaba.ariver.permission.PermissionConstant;
import com.blankj.utilcode.util.Utils;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.service.IThemeService;
import com.huawei.secure.android.common.ssl.WebViewSSLCheck;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001 B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J \u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016J\u001c\u0010\u0018\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0016J\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J \u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u001fH\u0016R\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/webview/BaseWebViewClient;", "Landroid/webkit/WebViewClient;", "schemes", "", "", "onReceivedErrorListener", "Lcom/huawei/digitalpayment/consumer/baselib/webview/BaseWebViewClient$OnReceivedErrorListener;", "<init>", "([Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/baselib/webview/BaseWebViewClient$OnReceivedErrorListener;)V", "[Ljava/lang/String;", "onReceivedError", "", "view", "Landroid/webkit/WebView;", PermissionConstant.ACTION_REQUEST, "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "shouldOverrideUrlLoading", "", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "url", "onPageFinished", "shouldInterceptRequest", "getFontInputStream", "Ljava/io/InputStream;", "onReceivedSslError", "handler", "Landroid/webkit/SslErrorHandler;", "Landroid/net/http/SslError;", "OnReceivedErrorListener", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseWebViewClient extends WebViewClient {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final OnReceivedErrorListener component2;
    private final String[] copydefault;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J&\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u001c\u0010\r\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/webview/BaseWebViewClient$OnReceivedErrorListener;", "", "onReceivedError", "", "view", "Landroid/webkit/WebView;", PermissionConstant.ACTION_REQUEST, "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "shouldOverrideUrlLoading", "", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnReceivedErrorListener {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class DefaultImpls {
            private static int ShareDataUIState = 1;
            private static int component1;

            public static boolean shouldOverrideUrlLoading(OnReceivedErrorListener onReceivedErrorListener, WebView webView, WebResourceRequest webResourceRequest) {
                int i = 2 % 2;
                int i2 = component1 + 23;
                int i3 = i2 % 128;
                ShareDataUIState = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 5;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
        }

        void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error);

        void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse);

        boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request);
    }

    public BaseWebViewClient(String[] strArr, OnReceivedErrorListener onReceivedErrorListener) {
        Intrinsics.checkNotNullParameter(strArr, "");
        this.copydefault = strArr;
        this.component2 = onReceivedErrorListener;
    }

    @Override
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(error, "");
        super.onReceivedError(view, request, error);
        OnReceivedErrorListener onReceivedErrorListener = this.component2;
        if (onReceivedErrorListener != null) {
            int i4 = component3 + 95;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            onReceivedErrorListener.onReceivedError(view, request, error);
            int i6 = ShareDataUIState + 9;
            component3 = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        int i = 2 % 2;
        int i2 = component3 + 103;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        OnReceivedErrorListener onReceivedErrorListener = this.component2;
        if (onReceivedErrorListener != null) {
            int i5 = i3 + 65;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            if (onReceivedErrorListener.shouldOverrideUrlLoading(view, request)) {
                return true;
            }
        }
        boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, request);
        int i7 = component3 + 53;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        return zShouldOverrideUrlLoading;
    }

    @Override
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(errorResponse, "");
        super.onReceivedHttpError(view, request, errorResponse);
        OnReceivedErrorListener onReceivedErrorListener = this.component2;
        if (onReceivedErrorListener != null) {
            int i4 = component3 + 63;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            onReceivedErrorListener.onReceivedHttpError(view, request, errorResponse);
            if (i5 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        r1 = r8.copydefault;
        r2 = r1.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r4 >= r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        r5 = com.huawei.digitalpayment.consumer.baselib.webview.BaseWebViewClient.ShareDataUIState + 61;
        com.huawei.digitalpayment.consumer.baselib.webview.BaseWebViewClient.component3 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if ((r5 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r10, r1[r4], false, 5, (java.lang.Object) null) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r10, r1[r4], false, 2, (java.lang.Object) null) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        com.huawei.digitalpayment.consumer.baselib.util.AppConfigUtils.startBrowser(r9.getContext(), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (android.text.TextUtils.isEmpty(r10) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (android.text.TextUtils.isEmpty(r10) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        return false;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean shouldOverrideUrlLoading(android.webkit.WebView r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.webview.BaseWebViewClient.ShareDataUIState
            int r1 = r1 + 37
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.webview.BaseWebViewClient.component3 = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            if (r1 != 0) goto L24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r2)
            r1 = r10
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 24
            int r2 = r2 / r3
            if (r1 == 0) goto L34
            goto L33
        L24:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r2)
            r1 = r10
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L34
        L33:
            return r3
        L34:
            java.lang.String[] r1 = r8.copydefault
            int r2 = r1.length
            r4 = r3
        L38:
            if (r4 >= r2) goto L64
            int r5 = com.huawei.digitalpayment.consumer.baselib.webview.BaseWebViewClient.ShareDataUIState
            int r5 = r5 + 61
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.baselib.webview.BaseWebViewClient.component3 = r6
            int r5 = r5 % r0
            r6 = 0
            if (r5 != 0) goto L50
            r5 = r1[r4]
            r7 = 5
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r10, r5, r3, r7, r6)
            if (r5 == 0) goto L61
            goto L58
        L50:
            r5 = r1[r4]
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r10, r5, r3, r0, r6)
            if (r5 == 0) goto L61
        L58:
            android.content.Context r9 = r9.getContext()
            com.huawei.digitalpayment.consumer.baselib.util.AppConfigUtils.startBrowser(r9, r10)
            r9 = 1
            return r9
        L61:
            int r4 = r4 + 1
            goto L38
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.webview.BaseWebViewClient.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (view != null) {
            view.loadUrl("javascript:!function(){s=document.createElement('style');s.innerHTML=\"@font-face{font-family:CustomFont;src:url('****/fonts/customFont.ttf');}*{font-family:CustomFont !important;}\";document.getElementsByTagName('head')[0].appendChild(s);document.getElementsByTagName('body')[0].style.fontFamily = \"CustomFont\";}()");
        }
        super.onPageFinished(view, url);
        int i4 = component3 + 13;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Uri url;
        int i = 2 % 2;
        Object obj = null;
        if (request != null) {
            int i2 = ShareDataUIState + 119;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                request.getUrl();
                obj.hashCode();
                throw null;
            }
            url = request.getUrl();
            int i3 = component3 + 25;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
        } else {
            url = null;
        }
        if (!StringsKt.contains$default((CharSequence) String.valueOf(url), (CharSequence) "customFont.ttf", false, 2, (Object) null)) {
            return super.shouldInterceptRequest(view, request);
        }
        InputStream inputStreamShareDataUIState = ShareDataUIState(view);
        if (inputStreamShareDataUIState == null) {
            int i5 = ShareDataUIState + 73;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return super.shouldInterceptRequest(view, request);
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse("application/x-font-ttf", "UTF-8", inputStreamShareDataUIState);
        int i7 = component3 + 125;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        return webResourceResponse;
    }

    private final InputStream ShareDataUIState(WebView webView) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object service = RouteUtils.getService(IThemeService.class);
        if (i3 != 0) {
            return ((IThemeService) service).getFontInputStreamForH5();
        }
        ((IThemeService) service).getFontInputStreamForH5();
        throw null;
    }

    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(handler, "");
        Intrinsics.checkNotNullParameter(error, "");
        L.e("BaseWebViewClient", "onReceivedSslError: " + error);
        WebViewSSLCheck.checkServerCertificateNew(handler, error, Utils.getApp());
        int i2 = ShareDataUIState + 17;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }
}
