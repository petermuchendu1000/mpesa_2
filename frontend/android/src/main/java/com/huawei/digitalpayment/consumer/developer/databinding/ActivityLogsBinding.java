package com.huawei.digitalpayment.consumer.developer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.developer.R;

public abstract class ActivityLogsBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final RecyclerView rvRecyclerView;

    protected ActivityLogsBinding(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.rvRecyclerView = recyclerView;
    }

    public static ActivityLogsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityLogsBinding activityLogsBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 23;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityLogsBindingInflate;
    }

    @Deprecated
    public static ActivityLogsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component3 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        ActivityLogsBinding activityLogsBinding = (ActivityLogsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_logs, viewGroup, z, obj);
        int i3 = copydefault + 83;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return activityLogsBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ActivityLogsBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 51;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivityLogsBinding activityLogsBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 59;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 33 / 0;
        }
        return activityLogsBindingInflate;
    }

    @Deprecated
    public static ActivityLogsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return (ActivityLogsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_logs, null, false, obj);
    }

    public static ActivityLogsBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ActivityLogsBinding activityLogsBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 79;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return activityLogsBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivityLogsBinding bind(View view, Object obj) {
        ActivityLogsBinding activityLogsBinding;
        int i = 2 % 2;
        int i2 = component3 + 43;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            activityLogsBinding = (ActivityLogsBinding) bind(obj, view, R.layout.activity_logs);
            int i3 = 86 / 0;
        } else {
            activityLogsBinding = (ActivityLogsBinding) bind(obj, view, R.layout.activity_logs);
        }
        int i4 = component3 + 15;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityLogsBinding;
    }
}
