package com.huawei.digitalpayment.consumer.developer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.developer.R;

public abstract class ActivityLogWebviewBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    public final WebView webView;

    protected ActivityLogWebviewBinding(Object obj, View view, int i, WebView webView) {
        super(obj, view, i);
        this.webView = webView;
    }

    public static ActivityLogWebviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        ActivityLogWebviewBinding activityLogWebviewBindingInflate;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            activityLogWebviewBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 78 / 0;
        } else {
            activityLogWebviewBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = ShareDataUIState + 43;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityLogWebviewBindingInflate;
    }

    @Deprecated
    public static ActivityLogWebviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityLogWebviewBinding activityLogWebviewBinding = (ActivityLogWebviewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_log_webview, viewGroup, z, obj);
        int i4 = copydefault + 61;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return activityLogWebviewBinding;
        }
        throw null;
    }

    public static ActivityLogWebviewBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityLogWebviewBinding activityLogWebviewBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 59;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return activityLogWebviewBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivityLogWebviewBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        copydefault = i2 % 128;
        ActivityLogWebviewBinding activityLogWebviewBinding = (ActivityLogWebviewBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 == 0 ? R.layout.activity_log_webview : R.layout.activity_log_webview, null, false, obj);
        int i3 = ShareDataUIState + 57;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return activityLogWebviewBinding;
    }

    public static ActivityLogWebviewBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityLogWebviewBinding activityLogWebviewBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 51;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityLogWebviewBindingBind;
    }

    @Deprecated
    public static ActivityLogWebviewBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        copydefault = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        ActivityLogWebviewBinding activityLogWebviewBinding = (ActivityLogWebviewBinding) bind(obj, view, R.layout.activity_log_webview);
        int i3 = ShareDataUIState + 75;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return activityLogWebviewBinding;
        }
        throw null;
    }
}
