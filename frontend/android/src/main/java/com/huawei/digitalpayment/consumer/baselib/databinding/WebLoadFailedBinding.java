package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.baselib.R;

public abstract class WebLoadFailedBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int copydefault;
    public final BaseToolbarLayoutBinding toobar;
    public final TextView tvTips;

    protected WebLoadFailedBinding(Object obj, View view, int i, BaseToolbarLayoutBinding baseToolbarLayoutBinding, TextView textView) {
        super(obj, view, i);
        this.toobar = baseToolbarLayoutBinding;
        this.tvTips = textView;
    }

    public static WebLoadFailedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        WebLoadFailedBinding webLoadFailedBindingInflate;
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            webLoadFailedBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 31 / 0;
        } else {
            webLoadFailedBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 25;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return webLoadFailedBindingInflate;
    }

    @Deprecated
    public static WebLoadFailedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        WebLoadFailedBinding webLoadFailedBinding = (WebLoadFailedBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.web_load_failed, viewGroup, z, obj);
        if (i3 == 0) {
            return webLoadFailedBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static WebLoadFailedBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 15;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        WebLoadFailedBinding webLoadFailedBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        return webLoadFailedBindingInflate;
    }

    @Deprecated
    public static WebLoadFailedBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return (WebLoadFailedBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.web_load_failed, null, false, obj);
    }

    public static WebLoadFailedBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        WebLoadFailedBinding webLoadFailedBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 91;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return webLoadFailedBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static WebLoadFailedBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        WebLoadFailedBinding webLoadFailedBinding = (WebLoadFailedBinding) bind(obj, view, R.layout.web_load_failed);
        int i4 = component2 + 35;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return webLoadFailedBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
