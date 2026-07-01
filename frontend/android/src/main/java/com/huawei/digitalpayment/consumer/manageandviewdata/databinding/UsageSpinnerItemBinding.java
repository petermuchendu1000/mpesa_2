package com.huawei.digitalpayment.consumer.manageandviewdata.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.manageandviewdata.R;

public abstract class UsageSpinnerItemBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int copydefault;
    public final TextView text1;

    protected UsageSpinnerItemBinding(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.text1 = textView;
    }

    public static UsageSpinnerItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        UsageSpinnerItemBinding usageSpinnerItemBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 101;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return usageSpinnerItemBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static UsageSpinnerItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        UsageSpinnerItemBinding usageSpinnerItemBinding = (UsageSpinnerItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.usage_spinner_item, viewGroup, z, obj);
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        return usageSpinnerItemBinding;
    }

    public static UsageSpinnerItemBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static UsageSpinnerItemBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = copydefault + 11;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.usage_spinner_item;
            z = true;
        } else {
            i = R.layout.usage_spinner_item;
            z = false;
        }
        return (UsageSpinnerItemBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static UsageSpinnerItemBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static UsageSpinnerItemBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 97;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        UsageSpinnerItemBinding usageSpinnerItemBinding = (UsageSpinnerItemBinding) bind(obj, view, R.layout.usage_spinner_item);
        int i3 = component1 + 87;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return usageSpinnerItemBinding;
    }
}
