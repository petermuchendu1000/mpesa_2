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

public abstract class BasicSingleRadiobuttonBinding extends ViewDataBinding {
    public final LinearLayout clRoot;
    public final RoundImageView ivRadionButton;
    public final TextView tvRadioButton;

    protected BasicSingleRadiobuttonBinding(Object obj, View view, int i, LinearLayout linearLayout, RoundImageView roundImageView, TextView textView) {
        super(obj, view, i);
        this.clRoot = linearLayout;
        this.ivRadionButton = roundImageView;
        this.tvRadioButton = textView;
    }

    public static BasicSingleRadiobuttonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BasicSingleRadiobuttonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (BasicSingleRadiobuttonBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.basic_single_radiobutton, viewGroup, z, obj);
    }

    public static BasicSingleRadiobuttonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BasicSingleRadiobuttonBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (BasicSingleRadiobuttonBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.basic_single_radiobutton, null, false, obj);
    }

    public static BasicSingleRadiobuttonBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BasicSingleRadiobuttonBinding bind(View view, Object obj) {
        return (BasicSingleRadiobuttonBinding) bind(obj, view, R.layout.basic_single_radiobutton);
    }
}
