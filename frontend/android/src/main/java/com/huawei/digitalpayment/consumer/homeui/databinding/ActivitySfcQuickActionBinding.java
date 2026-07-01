package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundRecyclerView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ActivitySfcQuickActionBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    public final CommonInputView inputSearch;
    public final RecyclerView lifeRecycler;
    public final RoundRecyclerView myServiceRecycler;
    public final RecyclerView rvCategory;
    public final TextView tvEdit;
    public final TextView tvSubTitle;
    public final TextView tvTitle;

    protected ActivitySfcQuickActionBinding(Object obj, View view, int i, CommonInputView commonInputView, RecyclerView recyclerView, RoundRecyclerView roundRecyclerView, RecyclerView recyclerView2, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.inputSearch = commonInputView;
        this.lifeRecycler = recyclerView;
        this.myServiceRecycler = roundRecyclerView;
        this.rvCategory = recyclerView2;
        this.tvEdit = textView;
        this.tvSubTitle = textView2;
        this.tvTitle = textView3;
    }

    public static ActivitySfcQuickActionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivitySfcQuickActionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_quick_action, viewGroup, z, obj);
        if (i3 == 0) {
            return (ActivitySfcQuickActionBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static ActivitySfcQuickActionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcQuickActionBinding activitySfcQuickActionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 19;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcQuickActionBindingInflate;
    }

    @Deprecated
    public static ActivitySfcQuickActionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 37;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcQuickActionBinding activitySfcQuickActionBinding = (ActivitySfcQuickActionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_quick_action, null, false, obj);
        int i4 = component1 + 107;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcQuickActionBinding;
    }

    public static ActivitySfcQuickActionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcQuickActionBinding activitySfcQuickActionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 119;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcQuickActionBindingBind;
    }

    @Deprecated
    public static ActivitySfcQuickActionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 1;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcQuickActionBinding activitySfcQuickActionBinding = (ActivitySfcQuickActionBinding) bind(obj, view, R.layout.activity_sfc_quick_action);
        int i4 = component2 + 17;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcQuickActionBinding;
    }
}
