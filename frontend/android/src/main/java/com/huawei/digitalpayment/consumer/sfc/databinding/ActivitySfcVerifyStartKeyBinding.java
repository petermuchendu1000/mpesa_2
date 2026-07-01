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
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.base.ui.widget.SafeInputKeyboard;
import com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySfcVerifyStartKeyBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int copydefault = 1;
    public final CardView cardAbbr;
    public final CodeEditText etCode;
    public final RoundImageView ivAvatar;
    public final RoundImageView ivBack;
    public final LinearLayout llUserInfo;
    public final TextView tvAbbr;
    public final TextView tvName;
    public final TextView tvSubTitle;
    public final TextView tvTitle;
    public final View viewBg;
    public final SafeInputKeyboard virtualKeyboardView;

    protected ActivitySfcVerifyStartKeyBinding(Object obj, View view, int i, CardView cardView, CodeEditText codeEditText, RoundImageView roundImageView, RoundImageView roundImageView2, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view2, SafeInputKeyboard safeInputKeyboard) {
        super(obj, view, i);
        this.cardAbbr = cardView;
        this.etCode = codeEditText;
        this.ivAvatar = roundImageView;
        this.ivBack = roundImageView2;
        this.llUserInfo = linearLayout;
        this.tvAbbr = textView;
        this.tvName = textView2;
        this.tvSubTitle = textView3;
        this.tvTitle = textView4;
        this.viewBg = view2;
        this.virtualKeyboardView = safeInputKeyboard;
    }

    public static ActivitySfcVerifyStartKeyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcVerifyStartKeyBinding activitySfcVerifyStartKeyBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 47;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return activitySfcVerifyStartKeyBindingInflate;
    }

    @Deprecated
    public static ActivitySfcVerifyStartKeyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcVerifyStartKeyBinding activitySfcVerifyStartKeyBinding = (ActivitySfcVerifyStartKeyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_verify_start_key, viewGroup, z, obj);
        int i4 = component1 + 103;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcVerifyStartKeyBinding;
    }

    public static ActivitySfcVerifyStartKeyBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 13;
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
    public static ActivitySfcVerifyStartKeyBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcVerifyStartKeyBinding activitySfcVerifyStartKeyBinding = (ActivitySfcVerifyStartKeyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_verify_start_key, null, false, obj);
        int i4 = copydefault + 13;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcVerifyStartKeyBinding;
        }
        throw null;
    }

    public static ActivitySfcVerifyStartKeyBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcVerifyStartKeyBinding activitySfcVerifyStartKeyBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 13;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcVerifyStartKeyBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySfcVerifyStartKeyBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcVerifyStartKeyBinding activitySfcVerifyStartKeyBinding = (ActivitySfcVerifyStartKeyBinding) bind(obj, view, R.layout.activity_sfc_verify_start_key);
        int i4 = component1 + 31;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySfcVerifyStartKeyBinding;
        }
        throw null;
    }
}
