package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.base.ui.widget.SfcAmountInputView;
import com.huawei.digitalpayment.consumer.base.ui.widget.SfcSpinnerInputView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySfcMakeUrBundleBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component2;
    public final LoadingButton btnContinue;
    public final SfcAmountInputView inputAmount;
    public final RoundImageView ivBack;
    public final ImageView ivBundle;
    public final LinearLayout linearLayout;
    public final LinearLayout llContainer;
    public final RoundConstraintLayout rlBundleContainer;
    public final RecyclerView rvBundles;
    public final SfcSpinnerInputView spinnerValidityOptions;
    public final TextView tvAmountSupportingTitle;
    public final TextView tvAmountTitle;
    public final TextView tvBundleButton;
    public final TextView tvBundleTitle;
    public final TextView tvPreferredVisibilityTitle;
    public final TextView tvTitle;
    public final View viewBg;

    protected ActivitySfcMakeUrBundleBinding(Object obj, View view, int i, LoadingButton loadingButton, SfcAmountInputView sfcAmountInputView, RoundImageView roundImageView, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, RoundConstraintLayout roundConstraintLayout, RecyclerView recyclerView, SfcSpinnerInputView sfcSpinnerInputView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, View view2) {
        super(obj, view, i);
        this.btnContinue = loadingButton;
        this.inputAmount = sfcAmountInputView;
        this.ivBack = roundImageView;
        this.ivBundle = imageView;
        this.linearLayout = linearLayout;
        this.llContainer = linearLayout2;
        this.rlBundleContainer = roundConstraintLayout;
        this.rvBundles = recyclerView;
        this.spinnerValidityOptions = sfcSpinnerInputView;
        this.tvAmountSupportingTitle = textView;
        this.tvAmountTitle = textView2;
        this.tvBundleButton = textView3;
        this.tvBundleTitle = textView4;
        this.tvPreferredVisibilityTitle = textView5;
        this.tvTitle = textView6;
        this.viewBg = view2;
    }

    public static ActivitySfcMakeUrBundleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        ActivitySfcMakeUrBundleBinding activitySfcMakeUrBundleBindingInflate;
        int i = 2 % 2;
        int i2 = component1 + 9;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            activitySfcMakeUrBundleBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 7 / 0;
        } else {
            activitySfcMakeUrBundleBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component1 + 7;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcMakeUrBundleBindingInflate;
    }

    @Deprecated
    public static ActivitySfcMakeUrBundleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 87;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcMakeUrBundleBinding activitySfcMakeUrBundleBinding = (ActivitySfcMakeUrBundleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_make_ur_bundle, viewGroup, z, obj);
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        return activitySfcMakeUrBundleBinding;
    }

    public static ActivitySfcMakeUrBundleBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcMakeUrBundleBinding activitySfcMakeUrBundleBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 13;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcMakeUrBundleBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySfcMakeUrBundleBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 39;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcMakeUrBundleBinding activitySfcMakeUrBundleBinding = (ActivitySfcMakeUrBundleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_make_ur_bundle, null, false, obj);
        int i4 = component1 + 25;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return activitySfcMakeUrBundleBinding;
    }

    public static ActivitySfcMakeUrBundleBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcMakeUrBundleBinding activitySfcMakeUrBundleBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 3;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return activitySfcMakeUrBundleBindingBind;
    }

    @Deprecated
    public static ActivitySfcMakeUrBundleBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 121;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ActivitySfcMakeUrBundleBinding activitySfcMakeUrBundleBinding = (ActivitySfcMakeUrBundleBinding) bind(obj, view, R.layout.activity_sfc_make_ur_bundle);
        int i3 = component2 + 93;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcMakeUrBundleBinding;
    }
}
