package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.R;
import com.huawei.common.widget.input.IconImageView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.text.FixEditText;

public abstract class BasicInputEditTextBinding extends ViewDataBinding {
    public final RoundConstraintLayout clInput;
    public final IconImageView endIconView;
    public final TextView endUnitView;
    public final TextView errorView;
    public final FixEditText inputView;
    public final LinearLayout llButton;
    public final IconImageView startIconView;
    public final TextView startUnitView;
    public final View tagView;
    public final TextView titleView;

    protected BasicInputEditTextBinding(Object obj, View view, int i, RoundConstraintLayout roundConstraintLayout, IconImageView iconImageView, TextView textView, TextView textView2, FixEditText fixEditText, LinearLayout linearLayout, IconImageView iconImageView2, TextView textView3, View view2, TextView textView4) {
        super(obj, view, i);
        this.clInput = roundConstraintLayout;
        this.endIconView = iconImageView;
        this.endUnitView = textView;
        this.errorView = textView2;
        this.inputView = fixEditText;
        this.llButton = linearLayout;
        this.startIconView = iconImageView2;
        this.startUnitView = textView3;
        this.tagView = view2;
        this.titleView = textView4;
    }

    public static BasicInputEditTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BasicInputEditTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (BasicInputEditTextBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.basic_input_edit_text, viewGroup, z, obj);
    }

    public static BasicInputEditTextBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BasicInputEditTextBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (BasicInputEditTextBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.basic_input_edit_text, null, false, obj);
    }

    public static BasicInputEditTextBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BasicInputEditTextBinding bind(View view, Object obj) {
        return (BasicInputEditTextBinding) bind(obj, view, R.layout.basic_input_edit_text);
    }
}
