package com.huawei.digitalpayment.consumer.push_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.push_ui.R;

public abstract class NotificationRecordsEmptyLayoutBinding extends ViewDataBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    public final RoundLinearLayout llEmpty;

    protected NotificationRecordsEmptyLayoutBinding(Object obj, View view, int i, RoundLinearLayout roundLinearLayout) {
        super(obj, view, i);
        this.llEmpty = roundLinearLayout;
    }

    public static NotificationRecordsEmptyLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        NotificationRecordsEmptyLayoutBinding notificationRecordsEmptyLayoutBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 105;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return notificationRecordsEmptyLayoutBindingInflate;
    }

    @Deprecated
    public static NotificationRecordsEmptyLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        NotificationRecordsEmptyLayoutBinding notificationRecordsEmptyLayoutBinding = (NotificationRecordsEmptyLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.notification_records_empty_layout, viewGroup, z, obj);
        int i4 = copydefault + 21;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return notificationRecordsEmptyLayoutBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static NotificationRecordsEmptyLayoutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 109;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        NotificationRecordsEmptyLayoutBinding notificationRecordsEmptyLayoutBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 119;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return notificationRecordsEmptyLayoutBindingInflate;
    }

    @Deprecated
    public static NotificationRecordsEmptyLayoutBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        NotificationRecordsEmptyLayoutBinding notificationRecordsEmptyLayoutBinding = (NotificationRecordsEmptyLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.notification_records_empty_layout, null, false, obj);
        int i4 = copydefault + 55;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return notificationRecordsEmptyLayoutBinding;
    }

    public static NotificationRecordsEmptyLayoutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        NotificationRecordsEmptyLayoutBinding notificationRecordsEmptyLayoutBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        return notificationRecordsEmptyLayoutBindingBind;
    }

    @Deprecated
    public static NotificationRecordsEmptyLayoutBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        NotificationRecordsEmptyLayoutBinding notificationRecordsEmptyLayoutBinding = (NotificationRecordsEmptyLayoutBinding) bind(obj, view, R.layout.notification_records_empty_layout);
        if (i3 != 0) {
            int i4 = 71 / 0;
        }
        return notificationRecordsEmptyLayoutBinding;
    }
}
