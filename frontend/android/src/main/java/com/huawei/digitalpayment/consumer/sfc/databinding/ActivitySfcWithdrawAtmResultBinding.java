package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.widget.CircularProgressView;

public abstract class ActivitySfcWithdrawAtmResultBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final LoadingButton btnConfirm;
    public final RoundImageView ivAvatar;
    public final RoundImageView ivDelete;
    public final View ivGuideline;
    public final RoundImageView ivSendAvatar;
    public final LinearLayout llSendContainer;
    public final CircularProgressView progressBar;
    public final CardView rlContainer;
    public final RoundConstraintLayout rlContainerFail;
    public final RoundConstraintLayout rlReceiveInfo;
    public final RoundConstraintLayout rlSuccessContainer;
    public final CardView rlTips;
    public final RoundConstraintLayout rlTipsContainer;
    public final TextView tvCode;
    public final TextView tvFailTips;
    public final TextView tvFailTitle;
    public final TextView tvPhoneNumber;
    public final TextView tvSendName;
    public final TextView tvSendTo;
    public final TextView tvTips;
    public final TextView tvTitle;

    protected ActivitySfcWithdrawAtmResultBinding(Object obj, View view, int i, LoadingButton loadingButton, RoundImageView roundImageView, RoundImageView roundImageView2, View view2, RoundImageView roundImageView3, LinearLayout linearLayout, CircularProgressView circularProgressView, CardView cardView, RoundConstraintLayout roundConstraintLayout, RoundConstraintLayout roundConstraintLayout2, RoundConstraintLayout roundConstraintLayout3, CardView cardView2, RoundConstraintLayout roundConstraintLayout4, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.ivAvatar = roundImageView;
        this.ivDelete = roundImageView2;
        this.ivGuideline = view2;
        this.ivSendAvatar = roundImageView3;
        this.llSendContainer = linearLayout;
        this.progressBar = circularProgressView;
        this.rlContainer = cardView;
        this.rlContainerFail = roundConstraintLayout;
        this.rlReceiveInfo = roundConstraintLayout2;
        this.rlSuccessContainer = roundConstraintLayout3;
        this.rlTips = cardView2;
        this.rlTipsContainer = roundConstraintLayout4;
        this.tvCode = textView;
        this.tvFailTips = textView2;
        this.tvFailTitle = textView3;
        this.tvPhoneNumber = textView4;
        this.tvSendName = textView5;
        this.tvSendTo = textView6;
        this.tvTips = textView7;
        this.tvTitle = textView8;
    }

    public static ActivitySfcWithdrawAtmResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySfcWithdrawAtmResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 65;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_withdraw_atm_result, viewGroup, z, obj);
        if (i3 != 0) {
            return (ActivitySfcWithdrawAtmResultBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static ActivitySfcWithdrawAtmResultBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcWithdrawAtmResultBinding activitySfcWithdrawAtmResultBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 23;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcWithdrawAtmResultBindingInflate;
    }

    @Deprecated
    public static ActivitySfcWithdrawAtmResultBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ActivitySfcWithdrawAtmResultBinding activitySfcWithdrawAtmResultBinding = (ActivitySfcWithdrawAtmResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_withdraw_atm_result, null, false, obj);
        int i4 = component1 + 43;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcWithdrawAtmResultBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ActivitySfcWithdrawAtmResultBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcWithdrawAtmResultBinding activitySfcWithdrawAtmResultBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 47;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcWithdrawAtmResultBindingBind;
    }

    @Deprecated
    public static ActivitySfcWithdrawAtmResultBinding bind(View view, Object obj) {
        ActivitySfcWithdrawAtmResultBinding activitySfcWithdrawAtmResultBinding;
        int i = 2 % 2;
        int i2 = component1 + 89;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            activitySfcWithdrawAtmResultBinding = (ActivitySfcWithdrawAtmResultBinding) bind(obj, view, R.layout.activity_sfc_withdraw_atm_result);
            int i3 = 46 / 0;
        } else {
            activitySfcWithdrawAtmResultBinding = (ActivitySfcWithdrawAtmResultBinding) bind(obj, view, R.layout.activity_sfc_withdraw_atm_result);
        }
        int i4 = component1 + 13;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return activitySfcWithdrawAtmResultBinding;
    }
}
