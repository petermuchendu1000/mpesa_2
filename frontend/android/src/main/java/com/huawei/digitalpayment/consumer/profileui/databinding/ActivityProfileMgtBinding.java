package com.huawei.digitalpayment.consumer.profileui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.profileui.R;

public abstract class ActivityProfileMgtBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final LoadingButton lbNext;
    public final Button lbSkip;
    public final LinearLayout llBottom;
    public final RecyclerView recycleview;

    protected ActivityProfileMgtBinding(Object obj, View view, int i, LoadingButton loadingButton, Button button, LinearLayout linearLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.lbNext = loadingButton;
        this.lbSkip = button;
        this.llBottom = linearLayout;
        this.recycleview = recyclerView;
    }

    public static ActivityProfileMgtBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityProfileMgtBinding activityProfileMgtBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 15;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return activityProfileMgtBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivityProfileMgtBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 113;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityProfileMgtBinding activityProfileMgtBinding = (ActivityProfileMgtBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_profile_mgt, viewGroup, z, obj);
        int i4 = ShareDataUIState + 93;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityProfileMgtBinding;
    }

    public static ActivityProfileMgtBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 27;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityProfileMgtBinding activityProfileMgtBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 89;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return activityProfileMgtBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityProfileMgtBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ActivityProfileMgtBinding activityProfileMgtBinding = (ActivityProfileMgtBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_profile_mgt, null, false, obj);
        int i4 = ShareDataUIState + 49;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityProfileMgtBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ActivityProfileMgtBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityProfileMgtBinding activityProfileMgtBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 63;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityProfileMgtBindingBind;
    }

    @Deprecated
    public static ActivityProfileMgtBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityProfileMgtBinding activityProfileMgtBinding = (ActivityProfileMgtBinding) bind(obj, view, R.layout.activity_profile_mgt);
        int i4 = ShareDataUIState + 61;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityProfileMgtBinding;
    }
}
