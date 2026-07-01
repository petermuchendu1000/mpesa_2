package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityMtandaoReportSuccessBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final Button btnDone;
    public final ImageView imageView3;
    public final RoundImageView ivDelete;
    public final CardView rlContainer;
    public final RoundConstraintLayout rlContainerInside;
    public final ConstraintLayout tvAvatar;
    public final TextView tvTips;
    public final TextView tvTitle;

    protected ActivityMtandaoReportSuccessBinding(Object obj, View view, int i, Button button, ImageView imageView, RoundImageView roundImageView, CardView cardView, RoundConstraintLayout roundConstraintLayout, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnDone = button;
        this.imageView3 = imageView;
        this.ivDelete = roundImageView;
        this.rlContainer = cardView;
        this.rlContainerInside = roundConstraintLayout;
        this.tvAvatar = constraintLayout;
        this.tvTips = textView;
        this.tvTitle = textView2;
    }

    public static ActivityMtandaoReportSuccessBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 27;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityMtandaoReportSuccessBinding activityMtandaoReportSuccessBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 41;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityMtandaoReportSuccessBindingInflate;
    }

    @Deprecated
    public static ActivityMtandaoReportSuccessBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMtandaoReportSuccessBinding activityMtandaoReportSuccessBinding = (ActivityMtandaoReportSuccessBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_mtandao_report_success, viewGroup, z, obj);
        int i4 = component3 + 13;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activityMtandaoReportSuccessBinding;
        }
        throw null;
    }

    public static ActivityMtandaoReportSuccessBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityMtandaoReportSuccessBinding activityMtandaoReportSuccessBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 59;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityMtandaoReportSuccessBindingInflate;
    }

    @Deprecated
    public static ActivityMtandaoReportSuccessBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityMtandaoReportSuccessBinding activityMtandaoReportSuccessBinding = (ActivityMtandaoReportSuccessBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_mtandao_report_success, null, false, obj);
        int i4 = component3 + 119;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityMtandaoReportSuccessBinding;
    }

    public static ActivityMtandaoReportSuccessBinding bind(View view) {
        ActivityMtandaoReportSuccessBinding activityMtandaoReportSuccessBindingBind;
        int i = 2 % 2;
        int i2 = copydefault + 89;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            activityMtandaoReportSuccessBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 39 / 0;
        } else {
            activityMtandaoReportSuccessBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component3 + 27;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityMtandaoReportSuccessBindingBind;
    }

    @Deprecated
    public static ActivityMtandaoReportSuccessBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.activity_mtandao_report_success);
        if (i3 == 0) {
            return (ActivityMtandaoReportSuccessBinding) viewDataBindingBind;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
