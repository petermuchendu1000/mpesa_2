package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityRequestMoneyResultBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final LoadingButton btnConfirm;
    public final CardView cardAbbr;
    public final RoundImageView ivAvatar;
    public final RoundImageView ivDelete;
    public final View ivGuideline;
    public final RoundImageView ivSendAvatar;
    public final LinearLayout llSendContainer;
    public final CardView rlContainer;
    public final RoundConstraintLayout rlReceiveInfo;
    public final RoundConstraintLayout rlSuccessContainer;
    public final RecyclerView rvFunction;
    public final TextView tvAbbr;
    public final TextView tvAmount;
    public final TextView tvDate;
    public final TextView tvPhoneNumber;
    public final TextView tvSendName;
    public final TextView tvSendTo;
    public final TextView tvTitle;

    protected ActivityRequestMoneyResultBinding(Object obj, View view, int i, LoadingButton loadingButton, CardView cardView, RoundImageView roundImageView, RoundImageView roundImageView2, View view2, RoundImageView roundImageView3, LinearLayout linearLayout, CardView cardView2, RoundConstraintLayout roundConstraintLayout, RoundConstraintLayout roundConstraintLayout2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.cardAbbr = cardView;
        this.ivAvatar = roundImageView;
        this.ivDelete = roundImageView2;
        this.ivGuideline = view2;
        this.ivSendAvatar = roundImageView3;
        this.llSendContainer = linearLayout;
        this.rlContainer = cardView2;
        this.rlReceiveInfo = roundConstraintLayout;
        this.rlSuccessContainer = roundConstraintLayout2;
        this.rvFunction = recyclerView;
        this.tvAbbr = textView;
        this.tvAmount = textView2;
        this.tvDate = textView3;
        this.tvPhoneNumber = textView4;
        this.tvSendName = textView5;
        this.tvSendTo = textView6;
        this.tvTitle = textView7;
    }

    public static ActivityRequestMoneyResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityRequestMoneyResultBinding activityRequestMoneyResultBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 107;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityRequestMoneyResultBindingInflate;
    }

    @Deprecated
    public static ActivityRequestMoneyResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityRequestMoneyResultBinding activityRequestMoneyResultBinding = (ActivityRequestMoneyResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_request_money_result, viewGroup, z, obj);
        int i4 = copydefault + 45;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityRequestMoneyResultBinding;
    }

    public static ActivityRequestMoneyResultBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityRequestMoneyResultBinding activityRequestMoneyResultBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 123;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityRequestMoneyResultBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityRequestMoneyResultBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityRequestMoneyResultBinding activityRequestMoneyResultBinding = (ActivityRequestMoneyResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_request_money_result, null, false, obj);
        int i4 = copydefault + 29;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityRequestMoneyResultBinding;
    }

    public static ActivityRequestMoneyResultBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivityRequestMoneyResultBinding activityRequestMoneyResultBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 13;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 31 / 0;
        }
        return activityRequestMoneyResultBindingBind;
    }

    @Deprecated
    public static ActivityRequestMoneyResultBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 115;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ActivityRequestMoneyResultBinding activityRequestMoneyResultBinding = (ActivityRequestMoneyResultBinding) bind(obj, view, R.layout.activity_request_money_result);
        int i3 = copydefault + 77;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return activityRequestMoneyResultBinding;
    }
}
