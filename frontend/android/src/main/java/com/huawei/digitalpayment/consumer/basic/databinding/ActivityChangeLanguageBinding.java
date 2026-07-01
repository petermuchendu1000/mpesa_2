package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.basic.R;

public abstract class ActivityChangeLanguageBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final RecyclerView recyclerView;

    protected ActivityChangeLanguageBinding(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.recyclerView = recyclerView;
    }

    public static ActivityChangeLanguageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityChangeLanguageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 83;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ActivityChangeLanguageBinding activityChangeLanguageBinding = (ActivityChangeLanguageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_change_language, viewGroup, z, obj);
        int i3 = component1 + 109;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return activityChangeLanguageBinding;
    }

    public static ActivityChangeLanguageBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityChangeLanguageBinding activityChangeLanguageBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 35;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityChangeLanguageBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivityChangeLanguageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityChangeLanguageBinding activityChangeLanguageBinding = (ActivityChangeLanguageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_change_language, null, false, obj);
        int i4 = component1 + 87;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityChangeLanguageBinding;
    }

    public static ActivityChangeLanguageBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivityChangeLanguageBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityChangeLanguageBinding activityChangeLanguageBinding = (ActivityChangeLanguageBinding) bind(obj, view, R.layout.activity_change_language);
        int i4 = component3 + 65;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return activityChangeLanguageBinding;
    }
}
