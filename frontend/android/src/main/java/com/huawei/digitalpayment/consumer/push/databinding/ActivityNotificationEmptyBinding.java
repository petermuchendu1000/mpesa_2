package com.huawei.digitalpayment.consumer.push.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.push.R;

public abstract class ActivityNotificationEmptyBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    protected ActivityNotificationEmptyBinding(Object obj, View view, int i) {
        super(obj, view, i);
    }

    public static ActivityNotificationEmptyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityNotificationEmptyBinding activityNotificationEmptyBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 81;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityNotificationEmptyBindingInflate;
    }

    @Deprecated
    public static ActivityNotificationEmptyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        ShareDataUIState = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        ActivityNotificationEmptyBinding activityNotificationEmptyBinding = (ActivityNotificationEmptyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_notification_empty, viewGroup, z, obj);
        int i3 = ShareDataUIState + 91;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return activityNotificationEmptyBinding;
        }
        throw null;
    }

    public static ActivityNotificationEmptyBinding inflate(LayoutInflater layoutInflater) {
        ActivityNotificationEmptyBinding activityNotificationEmptyBindingInflate;
        int i = 2 % 2;
        int i2 = copydefault + 107;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            activityNotificationEmptyBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 94 / 0;
        } else {
            activityNotificationEmptyBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 57;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return activityNotificationEmptyBindingInflate;
    }

    @Deprecated
    public static ActivityNotificationEmptyBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityNotificationEmptyBinding activityNotificationEmptyBinding = (ActivityNotificationEmptyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_notification_empty, null, false, obj);
        int i4 = ShareDataUIState + 109;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activityNotificationEmptyBinding;
        }
        throw null;
    }

    public static ActivityNotificationEmptyBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
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
    public static ActivityNotificationEmptyBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityNotificationEmptyBinding activityNotificationEmptyBinding = (ActivityNotificationEmptyBinding) bind(obj, view, R.layout.activity_notification_empty);
        int i4 = copydefault + 121;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return activityNotificationEmptyBinding;
    }
}
