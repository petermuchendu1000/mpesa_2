package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityRequestMoneySendConfirmBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final LoadingButton btnConfirm;
    public final LoadingButton btnReject;
    public final CardView cardAbbr;
    public final RoundImageView ivAvatar;
    public final RoundImageView ivBack;
    public final View ivGuideline;
    public final ConstraintLayout rlAvatar;
    public final CardView rlContainer;
    public final ConstraintLayout rlRoot;
    public final RecyclerView rvConfirm;
    public final TextView tvAbbr;
    public final TextView tvDes;
    public final TextView tvTitle;
    public final TextView tvTopTitle;
    public final View viewBg;
    public final View viewDivider;

    protected ActivityRequestMoneySendConfirmBinding(Object obj, View view, int i, LoadingButton loadingButton, LoadingButton loadingButton2, CardView cardView, RoundImageView roundImageView, RoundImageView roundImageView2, View view2, ConstraintLayout constraintLayout, CardView cardView2, ConstraintLayout constraintLayout2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view3, View view4) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.btnReject = loadingButton2;
        this.cardAbbr = cardView;
        this.ivAvatar = roundImageView;
        this.ivBack = roundImageView2;
        this.ivGuideline = view2;
        this.rlAvatar = constraintLayout;
        this.rlContainer = cardView2;
        this.rlRoot = constraintLayout2;
        this.rvConfirm = recyclerView;
        this.tvAbbr = textView;
        this.tvDes = textView2;
        this.tvTitle = textView3;
        this.tvTopTitle = textView4;
        this.viewBg = view3;
        this.viewDivider = view4;
    }

    public static ActivityRequestMoneySendConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityRequestMoneySendConfirmBinding activityRequestMoneySendConfirmBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 9;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return activityRequestMoneySendConfirmBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivityRequestMoneySendConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityRequestMoneySendConfirmBinding activityRequestMoneySendConfirmBinding = (ActivityRequestMoneySendConfirmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_request_money_send_confirm, viewGroup, z, obj);
        int i4 = copydefault + 85;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return activityRequestMoneySendConfirmBinding;
        }
        throw null;
    }

    public static ActivityRequestMoneySendConfirmBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityRequestMoneySendConfirmBinding activityRequestMoneySendConfirmBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 117;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return activityRequestMoneySendConfirmBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivityRequestMoneySendConfirmBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityRequestMoneySendConfirmBinding activityRequestMoneySendConfirmBinding = (ActivityRequestMoneySendConfirmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_request_money_send_confirm, null, false, obj);
        int i4 = copydefault + 5;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityRequestMoneySendConfirmBinding;
    }

    public static ActivityRequestMoneySendConfirmBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityRequestMoneySendConfirmBinding activityRequestMoneySendConfirmBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        return activityRequestMoneySendConfirmBindingBind;
    }

    @Deprecated
    public static ActivityRequestMoneySendConfirmBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityRequestMoneySendConfirmBinding activityRequestMoneySendConfirmBinding = (ActivityRequestMoneySendConfirmBinding) bind(obj, view, R.layout.activity_request_money_send_confirm);
        int i4 = copydefault + 105;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return activityRequestMoneySendConfirmBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
