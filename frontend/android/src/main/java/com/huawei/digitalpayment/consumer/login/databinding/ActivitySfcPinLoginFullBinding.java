package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.base.ui.widget.SafeInputKeyboard;
import com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class ActivitySfcPinLoginFullBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    public final CardView cardAbbr;
    public final CodeEditText etCode;
    public final RoundImageView ivAvatar;
    public final RoundImageView ivBack;
    public final LinearLayout llContainer;
    public final LinearLayout llUserInfo;
    public final TextView tvAbbr;
    public final TextView tvAmountDisplay;
    public final TextView tvName;
    public final TextView tvPhoneNumber;
    public final TextView tvSubTitle;
    public final TextView tvTitle;
    public final SafeInputKeyboard virtualKeyboardView;

    protected ActivitySfcPinLoginFullBinding(Object obj, View view, int i, CardView cardView, CodeEditText codeEditText, RoundImageView roundImageView, RoundImageView roundImageView2, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, SafeInputKeyboard safeInputKeyboard) {
        super(obj, view, i);
        this.cardAbbr = cardView;
        this.etCode = codeEditText;
        this.ivAvatar = roundImageView;
        this.ivBack = roundImageView2;
        this.llContainer = linearLayout;
        this.llUserInfo = linearLayout2;
        this.tvAbbr = textView;
        this.tvAmountDisplay = textView2;
        this.tvName = textView3;
        this.tvPhoneNumber = textView4;
        this.tvSubTitle = textView5;
        this.tvTitle = textView6;
        this.virtualKeyboardView = safeInputKeyboard;
    }

    public static ActivitySfcPinLoginFullBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivitySfcPinLoginFullBinding activitySfcPinLoginFullBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 93;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcPinLoginFullBindingInflate;
    }

    @Deprecated
    public static ActivitySfcPinLoginFullBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcPinLoginFullBinding activitySfcPinLoginFullBinding = (ActivitySfcPinLoginFullBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_pin_login_full, viewGroup, z, obj);
        int i4 = component1 + 25;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcPinLoginFullBinding;
    }

    public static ActivitySfcPinLoginFullBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 75;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivitySfcPinLoginFullBinding activitySfcPinLoginFullBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 103;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return activitySfcPinLoginFullBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySfcPinLoginFullBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcPinLoginFullBinding activitySfcPinLoginFullBinding = (ActivitySfcPinLoginFullBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_pin_login_full, null, false, obj);
        int i4 = component1 + 105;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcPinLoginFullBinding;
    }

    public static ActivitySfcPinLoginFullBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcPinLoginFullBinding activitySfcPinLoginFullBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 51;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return activitySfcPinLoginFullBindingBind;
    }

    @Deprecated
    public static ActivitySfcPinLoginFullBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ActivitySfcPinLoginFullBinding activitySfcPinLoginFullBinding = (ActivitySfcPinLoginFullBinding) bind(obj, view, R.layout.activity_sfc_pin_login_full);
        int i3 = component1 + 101;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcPinLoginFullBinding;
    }
}
