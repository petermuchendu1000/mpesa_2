package com.huawei.digitalpayment.consumer.manageandviewdata.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.manageandviewdata.R;

public abstract class ActivitySfcDataManagerBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final ConstraintLayout csContent;
    public final ConstraintLayout csTitleBack;
    public final RoundImageView ivBack;
    public final LayoutDataUsageItemBinding lwDataManager;
    public final LayoutDataUsageItemBinding lwUsageLimit;
    public final LayoutDataUsageItemBinding lwViewUsage;
    public final TextView tvTopTitle;

    protected ActivitySfcDataManagerBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RoundImageView roundImageView, LayoutDataUsageItemBinding layoutDataUsageItemBinding, LayoutDataUsageItemBinding layoutDataUsageItemBinding2, LayoutDataUsageItemBinding layoutDataUsageItemBinding3, TextView textView) {
        super(obj, view, i);
        this.csContent = constraintLayout;
        this.csTitleBack = constraintLayout2;
        this.ivBack = roundImageView;
        this.lwDataManager = layoutDataUsageItemBinding;
        this.lwUsageLimit = layoutDataUsageItemBinding2;
        this.lwViewUsage = layoutDataUsageItemBinding3;
        this.tvTopTitle = textView;
    }

    public static ActivitySfcDataManagerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcDataManagerBinding activitySfcDataManagerBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 3;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return activitySfcDataManagerBindingInflate;
    }

    @Deprecated
    public static ActivitySfcDataManagerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_data_manager, viewGroup, z, obj);
        if (i3 == 0) {
            return (ActivitySfcDataManagerBinding) viewDataBindingInflateInternal;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ActivitySfcDataManagerBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcDataManagerBinding activitySfcDataManagerBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 79;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return activitySfcDataManagerBindingInflate;
    }

    @Deprecated
    public static ActivitySfcDataManagerBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcDataManagerBinding activitySfcDataManagerBinding = (ActivitySfcDataManagerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_data_manager, null, false, obj);
        int i4 = component1 + 93;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcDataManagerBinding;
        }
        throw null;
    }

    public static ActivitySfcDataManagerBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 67;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ActivitySfcDataManagerBinding activitySfcDataManagerBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 39;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return activitySfcDataManagerBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySfcDataManagerBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.activity_sfc_data_manager);
        if (i3 == 0) {
            return (ActivitySfcDataManagerBinding) viewDataBindingBind;
        }
        throw null;
    }
}
