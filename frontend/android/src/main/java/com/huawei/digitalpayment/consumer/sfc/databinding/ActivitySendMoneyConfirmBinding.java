package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySendMoneyConfirmBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final LoadingButton btnConfirm;
    public final RoundImageView ivAvatar;
    public final View ivGuideline;
    public final RoundConstraintLayout rlContainer;
    public final RecyclerView rvConfirm;
    public final TextView tvTitle;
    public final View viewDivider;

    protected ActivitySendMoneyConfirmBinding(Object obj, View view, int i, LoadingButton loadingButton, RoundImageView roundImageView, View view2, RoundConstraintLayout roundConstraintLayout, RecyclerView recyclerView, TextView textView, View view3) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.ivAvatar = roundImageView;
        this.ivGuideline = view2;
        this.rlContainer = roundConstraintLayout;
        this.rvConfirm = recyclerView;
        this.tvTitle = textView;
        this.viewDivider = view3;
    }

    public static ActivitySendMoneyConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySendMoneyConfirmBinding activitySendMoneyConfirmBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 41;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySendMoneyConfirmBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySendMoneyConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_send_money_confirm, viewGroup, z, obj);
        if (i3 != 0) {
            return (ActivitySendMoneyConfirmBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static ActivitySendMoneyConfirmBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySendMoneyConfirmBinding activitySendMoneyConfirmBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 79;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activitySendMoneyConfirmBindingInflate;
    }

    @Deprecated
    public static ActivitySendMoneyConfirmBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 53;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySendMoneyConfirmBinding activitySendMoneyConfirmBinding = (ActivitySendMoneyConfirmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_send_money_confirm, null, false, obj);
        int i4 = component1 + 79;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
        return activitySendMoneyConfirmBinding;
    }

    public static ActivitySendMoneyConfirmBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySendMoneyConfirmBinding activitySendMoneyConfirmBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 7;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySendMoneyConfirmBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySendMoneyConfirmBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ActivitySendMoneyConfirmBinding activitySendMoneyConfirmBinding = (ActivitySendMoneyConfirmBinding) bind(obj, view, R.layout.activity_send_money_confirm);
        int i3 = component1 + 79;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return activitySendMoneyConfirmBinding;
    }
}
