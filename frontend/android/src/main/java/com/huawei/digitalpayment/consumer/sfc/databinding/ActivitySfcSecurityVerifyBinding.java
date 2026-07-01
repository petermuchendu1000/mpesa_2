package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySfcSecurityVerifyBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final LoadingButton btnConfirm;
    public final RoundImageView ivBack;
    public final ImageView ivPinLocked;
    public final LinearLayout llContainer;
    public final TextView tvPinTitle;
    public final TextView tvTitle;
    public final View viewBg;

    protected ActivitySfcSecurityVerifyBinding(Object obj, View view, int i, LoadingButton loadingButton, RoundImageView roundImageView, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, View view2) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.ivBack = roundImageView;
        this.ivPinLocked = imageView;
        this.llContainer = linearLayout;
        this.tvPinTitle = textView;
        this.tvTitle = textView2;
        this.viewBg = view2;
    }

    public static ActivitySfcSecurityVerifyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivitySfcSecurityVerifyBinding activitySfcSecurityVerifyBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 27;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return activitySfcSecurityVerifyBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySfcSecurityVerifyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcSecurityVerifyBinding activitySfcSecurityVerifyBinding = (ActivitySfcSecurityVerifyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_security_verify, viewGroup, z, obj);
        int i4 = copydefault + 43;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcSecurityVerifyBinding;
    }

    public static ActivitySfcSecurityVerifyBinding inflate(LayoutInflater layoutInflater) {
        ActivitySfcSecurityVerifyBinding activitySfcSecurityVerifyBindingInflate;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            activitySfcSecurityVerifyBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 59 / 0;
        } else {
            activitySfcSecurityVerifyBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 93;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return activitySfcSecurityVerifyBindingInflate;
    }

    @Deprecated
    public static ActivitySfcSecurityVerifyBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcSecurityVerifyBinding activitySfcSecurityVerifyBinding = (ActivitySfcSecurityVerifyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_security_verify, null, false, obj);
        int i4 = copydefault + 67;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySfcSecurityVerifyBinding;
        }
        throw null;
    }

    public static ActivitySfcSecurityVerifyBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcSecurityVerifyBinding activitySfcSecurityVerifyBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 51;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return activitySfcSecurityVerifyBindingBind;
    }

    @Deprecated
    public static ActivitySfcSecurityVerifyBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcSecurityVerifyBinding activitySfcSecurityVerifyBinding = (ActivitySfcSecurityVerifyBinding) bind(obj, view, R.layout.activity_sfc_security_verify);
        int i4 = copydefault + 47;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcSecurityVerifyBinding;
    }
}
