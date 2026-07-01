package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.base.ui.widget.SfcManyAmountInputView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySendToManyAmountBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int copydefault;
    public final LoadingButton btnConfirm;
    public final SfcManyAmountInputView inputAmount;
    public final RoundImageView ivBack;
    public final LinearLayout llAmout;
    public final LinearLayout llPeople;
    public final ConstraintLayout rlRoot;
    public final TextView tvAmountTips;
    public final TextView tvTitle;
    public final TextView tvTotal;
    public final View viewBg;

    protected ActivitySendToManyAmountBinding(Object obj, View view, int i, LoadingButton loadingButton, SfcManyAmountInputView sfcManyAmountInputView, RoundImageView roundImageView, LinearLayout linearLayout, LinearLayout linearLayout2, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, View view2) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.inputAmount = sfcManyAmountInputView;
        this.ivBack = roundImageView;
        this.llAmout = linearLayout;
        this.llPeople = linearLayout2;
        this.rlRoot = constraintLayout;
        this.tvAmountTips = textView;
        this.tvTitle = textView2;
        this.tvTotal = textView3;
        this.viewBg = view2;
    }

    public static ActivitySendToManyAmountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 83;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivitySendToManyAmountBinding activitySendToManyAmountBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 87;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return activitySendToManyAmountBindingInflate;
    }

    @Deprecated
    public static ActivitySendToManyAmountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySendToManyAmountBinding activitySendToManyAmountBinding = (ActivitySendToManyAmountBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_send_to_many_amount, viewGroup, z, obj);
        int i4 = copydefault + 63;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySendToManyAmountBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ActivitySendToManyAmountBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySendToManyAmountBinding activitySendToManyAmountBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 25;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySendToManyAmountBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySendToManyAmountBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component2 + 83;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.activity_send_to_many_amount;
            z = true;
        } else {
            i = R.layout.activity_send_to_many_amount;
            z = false;
        }
        return (ActivitySendToManyAmountBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static ActivitySendToManyAmountBinding bind(View view) {
        ActivitySendToManyAmountBinding activitySendToManyAmountBindingBind;
        int i = 2 % 2;
        int i2 = copydefault + 13;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            activitySendToManyAmountBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 21 / 0;
        } else {
            activitySendToManyAmountBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 65;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activitySendToManyAmountBindingBind;
    }

    @Deprecated
    public static ActivitySendToManyAmountBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySendToManyAmountBinding activitySendToManyAmountBinding = (ActivitySendToManyAmountBinding) bind(obj, view, R.layout.activity_send_to_many_amount);
        int i4 = component2 + 81;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activitySendToManyAmountBinding;
    }
}
