package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.SingleRadioButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class FragmentPukBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final LoadingButton btnConfirm;
    public final ConstraintLayout constraintLayout2;
    public final CommonInputView inputIdNumber;
    public final CommonInputView inputPhoneNumber;
    public final RoundImageView ivBack;
    public final ImageView ivBundle;
    public final LinearLayout llContainer;
    public final SingleRadioButton rdOtherNumber;
    public final SingleRadioButton rdOwnNumber;
    public final RoundConstraintLayout rlBundleContainer;
    public final TextView tvDesc;
    public final TextView tvIdLabel;
    public final TextView tvRequestTitle;
    public final TextView tvTitle;
    public final TextView tvTitle1;

    protected FragmentPukBinding(Object obj, View view, int i, LoadingButton loadingButton, ConstraintLayout constraintLayout, CommonInputView commonInputView, CommonInputView commonInputView2, RoundImageView roundImageView, ImageView imageView, LinearLayout linearLayout, SingleRadioButton singleRadioButton, SingleRadioButton singleRadioButton2, RoundConstraintLayout roundConstraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.constraintLayout2 = constraintLayout;
        this.inputIdNumber = commonInputView;
        this.inputPhoneNumber = commonInputView2;
        this.ivBack = roundImageView;
        this.ivBundle = imageView;
        this.llContainer = linearLayout;
        this.rdOtherNumber = singleRadioButton;
        this.rdOwnNumber = singleRadioButton2;
        this.rlBundleContainer = roundConstraintLayout;
        this.tvDesc = textView;
        this.tvIdLabel = textView2;
        this.tvRequestTitle = textView3;
        this.tvTitle = textView4;
        this.tvTitle1 = textView5;
    }

    public static FragmentPukBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentPukBinding fragmentPukBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 103;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentPukBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static FragmentPukBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentPukBinding fragmentPukBinding = (FragmentPukBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_puk, viewGroup, z, obj);
        int i4 = component3 + 69;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentPukBinding;
    }

    public static FragmentPukBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 31;
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
    public static FragmentPukBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentPukBinding fragmentPukBinding = (FragmentPukBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_puk, null, false, obj);
        int i4 = component3 + 89;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentPukBinding;
    }

    public static FragmentPukBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentPukBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 3;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentPukBinding fragmentPukBinding = (FragmentPukBinding) bind(obj, view, R.layout.fragment_puk);
        if (i3 != 0) {
            return fragmentPukBinding;
        }
        throw null;
    }
}
