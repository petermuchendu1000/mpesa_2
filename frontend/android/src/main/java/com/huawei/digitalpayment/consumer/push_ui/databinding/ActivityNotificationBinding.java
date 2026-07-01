package com.huawei.digitalpayment.consumer.push_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.common.widget.tab.CommonTabView;
import com.huawei.digitalpayment.consumer.push_ui.R;

public abstract class ActivityNotificationBinding extends ViewDataBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    public final CommonTabView tabLayout;
    public final ViewPager2 viewPager;

    protected ActivityNotificationBinding(Object obj, View view, int i, CommonTabView commonTabView, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.tabLayout = commonTabView;
        this.viewPager = viewPager2;
    }

    public static ActivityNotificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i3 = 2 / 0;
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityNotificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityNotificationBinding activityNotificationBinding = (ActivityNotificationBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_notification, viewGroup, z, obj);
        int i4 = copydefault + 59;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return activityNotificationBinding;
    }

    public static ActivityNotificationBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityNotificationBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return (ActivityNotificationBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_notification, null, false, obj);
    }

    public static ActivityNotificationBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityNotificationBinding activityNotificationBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 75;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return activityNotificationBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivityNotificationBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityNotificationBinding activityNotificationBinding = (ActivityNotificationBinding) bind(obj, view, R.layout.activity_notification);
        int i4 = component3 + 75;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityNotificationBinding;
    }
}
