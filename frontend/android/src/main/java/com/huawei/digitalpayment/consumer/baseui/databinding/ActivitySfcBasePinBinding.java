package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView;
import com.huawei.digitalpayment.consumer.base.ui.widget.SafeInputKeyboard;
import com.huawei.digitalpayment.consumer.baseui.R;

public abstract class ActivitySfcBasePinBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    public final CardView cardAbbr;
    public final RoundImageView ivAvatar;
    public final RoundImageView ivBack;
    public final LinearLayout llContainer;
    public final LinearLayout llUserInfo;
    public final PinPadView pinPadView;
    public final TextView tvAbbr;
    public final TextView tvAmountDisplay;
    public final TextView tvName;
    public final TextView tvPhoneNumber;
    public final TextView tvPinError;
    public final TextView tvSubTitle;
    public final TextView tvTitle;
    public final SafeInputKeyboard virtualKeyboardView;

    protected ActivitySfcBasePinBinding(Object obj, View view, int i, CardView cardView, RoundImageView roundImageView, RoundImageView roundImageView2, LinearLayout linearLayout, LinearLayout linearLayout2, PinPadView pinPadView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, SafeInputKeyboard safeInputKeyboard) {
        super(obj, view, i);
        this.cardAbbr = cardView;
        this.ivAvatar = roundImageView;
        this.ivBack = roundImageView2;
        this.llContainer = linearLayout;
        this.llUserInfo = linearLayout2;
        this.pinPadView = pinPadView;
        this.tvAbbr = textView;
        this.tvAmountDisplay = textView2;
        this.tvName = textView3;
        this.tvPhoneNumber = textView4;
        this.tvPinError = textView5;
        this.tvSubTitle = textView6;
        this.tvTitle = textView7;
        this.virtualKeyboardView = safeInputKeyboard;
    }

    public static ActivitySfcBasePinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcBasePinBinding activitySfcBasePinBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 59;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcBasePinBindingInflate;
    }

    @Deprecated
    public static ActivitySfcBasePinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcBasePinBinding activitySfcBasePinBinding = (ActivitySfcBasePinBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_base_pin, viewGroup, z, obj);
        int i4 = ShareDataUIState + 89;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return activitySfcBasePinBinding;
    }

    public static ActivitySfcBasePinBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 113;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivitySfcBasePinBinding activitySfcBasePinBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 103;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcBasePinBindingInflate;
    }

    @Deprecated
    public static ActivitySfcBasePinBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcBasePinBinding activitySfcBasePinBinding = (ActivitySfcBasePinBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_base_pin, null, false, obj);
        int i4 = component3 + 13;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcBasePinBinding;
    }

    public static ActivitySfcBasePinBinding bind(View view) {
        ActivitySfcBasePinBinding activitySfcBasePinBindingBind;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            activitySfcBasePinBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 44 / 0;
        } else {
            activitySfcBasePinBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = ShareDataUIState + 49;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcBasePinBindingBind;
    }

    @Deprecated
    public static ActivitySfcBasePinBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcBasePinBinding activitySfcBasePinBinding = (ActivitySfcBasePinBinding) bind(obj, view, R.layout.activity_sfc_base_pin);
        int i4 = component3 + 19;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcBasePinBinding;
    }
}
