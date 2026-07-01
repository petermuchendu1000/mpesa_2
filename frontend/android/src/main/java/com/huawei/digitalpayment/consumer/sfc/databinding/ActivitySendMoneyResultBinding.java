package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySendMoneyResultBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int copydefault = 1;
    public final LoadingButton btnConfirm;
    public final RoundImageView ivAvatar;
    public final ImageView ivDelete;
    public final View ivGuideline;
    public final RoundImageView ivSendAvatar;
    public final RoundConstraintLayout rlContainer;
    public final RecyclerView rvFunction;
    public final TextView tvAmount;
    public final TextView tvCopy;
    public final TextView tvDate;
    public final TextView tvId;
    public final RoundLinearLayout tvIdContainer;
    public final TextView tvPhoneNumber;
    public final TextView tvSendName;
    public final TextView tvSendTo;
    public final TextView tvTitle;
    public final TextView tvTransactionCost;

    protected ActivitySendMoneyResultBinding(Object obj, View view, int i, LoadingButton loadingButton, RoundImageView roundImageView, ImageView imageView, View view2, RoundImageView roundImageView2, RoundConstraintLayout roundConstraintLayout, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, RoundLinearLayout roundLinearLayout, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.ivAvatar = roundImageView;
        this.ivDelete = imageView;
        this.ivGuideline = view2;
        this.ivSendAvatar = roundImageView2;
        this.rlContainer = roundConstraintLayout;
        this.rvFunction = recyclerView;
        this.tvAmount = textView;
        this.tvCopy = textView2;
        this.tvDate = textView3;
        this.tvId = textView4;
        this.tvIdContainer = roundLinearLayout;
        this.tvPhoneNumber = textView5;
        this.tvSendName = textView6;
        this.tvSendTo = textView7;
        this.tvTitle = textView8;
        this.tvTransactionCost = textView9;
    }

    public static ActivitySendMoneyResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySendMoneyResultBinding activitySendMoneyResultBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        return activitySendMoneyResultBindingInflate;
    }

    @Deprecated
    public static ActivitySendMoneyResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySendMoneyResultBinding activitySendMoneyResultBinding = (ActivitySendMoneyResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_send_money_result, viewGroup, z, obj);
        if (i3 == 0) {
            return activitySendMoneyResultBinding;
        }
        throw null;
    }

    public static ActivitySendMoneyResultBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySendMoneyResultBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySendMoneyResultBinding activitySendMoneyResultBinding = (ActivitySendMoneyResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_send_money_result, null, false, obj);
        int i4 = component1 + 125;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySendMoneyResultBinding;
        }
        throw null;
    }

    public static ActivitySendMoneyResultBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivitySendMoneyResultBinding activitySendMoneyResultBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 63;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return activitySendMoneyResultBindingBind;
    }

    @Deprecated
    public static ActivitySendMoneyResultBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySendMoneyResultBinding activitySendMoneyResultBinding = (ActivitySendMoneyResultBinding) bind(obj, view, R.layout.activity_send_money_result);
        if (i3 != 0) {
            return activitySendMoneyResultBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
