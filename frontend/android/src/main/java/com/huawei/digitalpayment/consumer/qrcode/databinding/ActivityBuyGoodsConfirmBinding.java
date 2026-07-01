package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.text.AmountInputView2;
import com.huawei.digitalpayment.consumer.qrcode.R;

public abstract class ActivityBuyGoodsConfirmBinding extends ViewDataBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    public final ConstraintLayout clBottom;
    public final AmountInputView2 inputAmount;
    public final RoundImageView ivHead;
    public final LoadingButton lbOk;
    public final View line;

    @Bindable
    protected Boolean mIsAmend;
    public final TextView tvAddNotes;
    public final TextView tvAmend;
    public final TextView tvOrgName;
    public final TextView tvTransferTo;

    public abstract void setIsAmend(Boolean bool);

    protected ActivityBuyGoodsConfirmBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, AmountInputView2 amountInputView2, RoundImageView roundImageView, LoadingButton loadingButton, View view2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.clBottom = constraintLayout;
        this.inputAmount = amountInputView2;
        this.ivHead = roundImageView;
        this.lbOk = loadingButton;
        this.line = view2;
        this.tvAddNotes = textView;
        this.tvAmend = textView2;
        this.tvOrgName = textView3;
        this.tvTransferTo = textView4;
    }

    public Boolean getIsAmend() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.mIsAmend;
        }
        throw null;
    }

    public static ActivityBuyGoodsConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityBuyGoodsConfirmBinding activityBuyGoodsConfirmBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 109;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return activityBuyGoodsConfirmBindingInflate;
    }

    @Deprecated
    public static ActivityBuyGoodsConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityBuyGoodsConfirmBinding activityBuyGoodsConfirmBinding = (ActivityBuyGoodsConfirmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_buy_goods_confirm, viewGroup, z, obj);
        int i4 = component3 + 87;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return activityBuyGoodsConfirmBinding;
    }

    public static ActivityBuyGoodsConfirmBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityBuyGoodsConfirmBinding activityBuyGoodsConfirmBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 69;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return activityBuyGoodsConfirmBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityBuyGoodsConfirmBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityBuyGoodsConfirmBinding activityBuyGoodsConfirmBinding = (ActivityBuyGoodsConfirmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_buy_goods_confirm, null, false, obj);
        int i4 = component3 + 63;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityBuyGoodsConfirmBinding;
    }

    public static ActivityBuyGoodsConfirmBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 79;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityBuyGoodsConfirmBinding activityBuyGoodsConfirmBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        return activityBuyGoodsConfirmBindingBind;
    }

    @Deprecated
    public static ActivityBuyGoodsConfirmBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityBuyGoodsConfirmBinding activityBuyGoodsConfirmBinding = (ActivityBuyGoodsConfirmBinding) bind(obj, view, R.layout.activity_buy_goods_confirm);
        if (i3 != 0) {
            return activityBuyGoodsConfirmBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
