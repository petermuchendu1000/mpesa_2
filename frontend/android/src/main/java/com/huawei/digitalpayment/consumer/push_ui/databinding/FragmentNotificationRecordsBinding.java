package com.huawei.digitalpayment.consumer.push_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.push_ui.R;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

public abstract class FragmentNotificationRecordsBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final LinearLayout llEmpty;
    public final RecyclerView rvSystemInfo;
    public final SmartRefreshLayout srlRefresh;

    protected FragmentNotificationRecordsBinding(Object obj, View view, int i, LinearLayout linearLayout, RecyclerView recyclerView, SmartRefreshLayout smartRefreshLayout) {
        super(obj, view, i);
        this.llEmpty = linearLayout;
        this.rvSystemInfo = recyclerView;
        this.srlRefresh = smartRefreshLayout;
    }

    public static FragmentNotificationRecordsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        FragmentNotificationRecordsBinding fragmentNotificationRecordsBindingInflate;
        int i = 2 % 2;
        int i2 = component1 + 13;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            fragmentNotificationRecordsBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 32 / 0;
        } else {
            fragmentNotificationRecordsBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component1 + 123;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentNotificationRecordsBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentNotificationRecordsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentNotificationRecordsBinding fragmentNotificationRecordsBinding = (FragmentNotificationRecordsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_notification_records, viewGroup, z, obj);
        if (i3 != 0) {
            return fragmentNotificationRecordsBinding;
        }
        throw null;
    }

    public static FragmentNotificationRecordsBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 83;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentNotificationRecordsBinding fragmentNotificationRecordsBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 25;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentNotificationRecordsBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static FragmentNotificationRecordsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentNotificationRecordsBinding fragmentNotificationRecordsBinding = (FragmentNotificationRecordsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_notification_records, null, false, obj);
        int i4 = component3 + 11;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return fragmentNotificationRecordsBinding;
    }

    public static FragmentNotificationRecordsBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentNotificationRecordsBinding fragmentNotificationRecordsBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 85;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return fragmentNotificationRecordsBindingBind;
    }

    @Deprecated
    public static FragmentNotificationRecordsBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 119;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        FragmentNotificationRecordsBinding fragmentNotificationRecordsBinding = (FragmentNotificationRecordsBinding) bind(obj, view, R.layout.fragment_notification_records);
        int i3 = component1 + 19;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 42 / 0;
        }
        return fragmentNotificationRecordsBinding;
    }
}
