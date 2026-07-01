package com.huawei.digitalpayment.consumer.webviewui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.webviewui.R;

public abstract class ActivityWebviewBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    public final FrameLayout flContainer;

    protected ActivityWebviewBinding(Object obj, View view, int i, FrameLayout frameLayout) {
        super(obj, view, i);
        this.flContainer = frameLayout;
    }

    public static ActivityWebviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivityWebviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_webview, viewGroup, z, obj);
        if (i3 != 0) {
            return (ActivityWebviewBinding) viewDataBindingInflateInternal;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ActivityWebviewBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 115;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivityWebviewBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityWebviewBinding activityWebviewBinding = (ActivityWebviewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_webview, null, false, obj);
        int i4 = component3 + 63;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return activityWebviewBinding;
        }
        throw null;
    }

    public static ActivityWebviewBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 5;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityWebviewBinding activityWebviewBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 81;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return activityWebviewBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivityWebviewBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 43;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityWebviewBinding activityWebviewBinding = (ActivityWebviewBinding) bind(obj, view, R.layout.activity_webview);
        if (i3 != 0) {
            return activityWebviewBinding;
        }
        throw null;
    }
}
