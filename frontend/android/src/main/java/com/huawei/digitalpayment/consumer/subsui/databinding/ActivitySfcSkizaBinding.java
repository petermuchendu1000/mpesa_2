package com.huawei.digitalpayment.consumer.subsui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.subsui.R;

public abstract class ActivitySfcSkizaBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int copydefault;
    public final LoadingButton btnConfirm;
    public final ConstraintLayout csEmpty;
    public final ConstraintLayout csList;
    public final ImageView ivPromotionalMessages;
    public final RecyclerView rcList;
    public final SwipeRefreshLayout swpRefresh;
    public final TextView txEmptyTitle;
    public final TextView txTitle;

    protected ActivitySfcSkizaBinding(Object obj, View view, int i, LoadingButton loadingButton, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.csEmpty = constraintLayout;
        this.csList = constraintLayout2;
        this.ivPromotionalMessages = imageView;
        this.rcList = recyclerView;
        this.swpRefresh = swipeRefreshLayout;
        this.txEmptyTitle = textView;
        this.txTitle = textView2;
    }

    public static ActivitySfcSkizaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcSkizaBinding activitySfcSkizaBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 13;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return activitySfcSkizaBindingInflate;
    }

    @Deprecated
    public static ActivitySfcSkizaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_skiza, viewGroup, z, obj);
        if (i3 != 0) {
            return (ActivitySfcSkizaBinding) viewDataBindingInflateInternal;
        }
        int i4 = 56 / 0;
        return (ActivitySfcSkizaBinding) viewDataBindingInflateInternal;
    }

    public static ActivitySfcSkizaBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcSkizaBinding activitySfcSkizaBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 73;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcSkizaBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySfcSkizaBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        component2 = i2 % 128;
        return (ActivitySfcSkizaBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 == 0 ? R.layout.activity_sfc_skiza : R.layout.activity_sfc_skiza, null, false, obj);
    }

    public static ActivitySfcSkizaBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 51;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcSkizaBinding activitySfcSkizaBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 75;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcSkizaBindingBind;
    }

    @Deprecated
    public static ActivitySfcSkizaBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcSkizaBinding activitySfcSkizaBinding = (ActivitySfcSkizaBinding) bind(obj, view, R.layout.activity_sfc_skiza);
        if (i3 != 0) {
            return activitySfcSkizaBinding;
        }
        throw null;
    }
}
