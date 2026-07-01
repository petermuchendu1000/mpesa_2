package com.huawei.digitalpayment.consumer.webviewui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.webviewui.R;
import com.huawei.secure.android.common.webview.SafeWebView;

public abstract class FragmentWebviewBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final ProgressBar progressBar;
    public final SafeWebView webview;

    protected FragmentWebviewBinding(Object obj, View view, int i, ProgressBar progressBar, SafeWebView safeWebView) {
        super(obj, view, i);
        this.progressBar = progressBar;
        this.webview = safeWebView;
    }

    public static FragmentWebviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 17;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        FragmentWebviewBinding fragmentWebviewBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 115;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return fragmentWebviewBindingInflate;
    }

    @Deprecated
    public static FragmentWebviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component1 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        FragmentWebviewBinding fragmentWebviewBinding = (FragmentWebviewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_webview, viewGroup, z, obj);
        int i3 = component1 + 69;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return fragmentWebviewBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static FragmentWebviewBinding inflate(LayoutInflater layoutInflater) {
        FragmentWebviewBinding fragmentWebviewBindingInflate;
        int i = 2 % 2;
        int i2 = component1 + 19;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            fragmentWebviewBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 55 / 0;
        } else {
            fragmentWebviewBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component3 + 103;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentWebviewBindingInflate;
    }

    @Deprecated
    public static FragmentWebviewBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 27;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentWebviewBinding fragmentWebviewBinding = (FragmentWebviewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_webview, null, false, obj);
        int i4 = component3 + 107;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentWebviewBinding;
    }

    public static FragmentWebviewBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        FragmentWebviewBinding fragmentWebviewBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 7;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return fragmentWebviewBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static FragmentWebviewBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 83;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentWebviewBinding fragmentWebviewBinding = (FragmentWebviewBinding) bind(obj, view, R.layout.fragment_webview);
        if (i3 != 0) {
            return fragmentWebviewBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
