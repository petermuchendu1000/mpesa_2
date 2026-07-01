package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.R;
import com.huawei.common.widget.round.RoundImageView;

public abstract class BasicCommonCheckboxBinding extends ViewDataBinding {
    public final LinearLayout clRoot;
    public final RoundImageView ivCheckBox;
    public final TextView tvCheckBox;

    protected BasicCommonCheckboxBinding(Object obj, View view, int i, LinearLayout linearLayout, RoundImageView roundImageView, TextView textView) {
        super(obj, view, i);
        this.clRoot = linearLayout;
        this.ivCheckBox = roundImageView;
        this.tvCheckBox = textView;
    }

    public static BasicCommonCheckboxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BasicCommonCheckboxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (BasicCommonCheckboxBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.basic_common_checkbox, viewGroup, z, obj);
    }

    public static BasicCommonCheckboxBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BasicCommonCheckboxBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (BasicCommonCheckboxBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.basic_common_checkbox, null, false, obj);
    }

    public static BasicCommonCheckboxBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BasicCommonCheckboxBinding bind(View view, Object obj) {
        return (BasicCommonCheckboxBinding) bind(obj, view, R.layout.basic_common_checkbox);
    }
}
