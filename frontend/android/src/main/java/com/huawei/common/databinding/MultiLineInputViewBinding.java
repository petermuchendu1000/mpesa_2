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

public abstract class MultiLineInputViewBinding extends ViewDataBinding {
    public final RoundConstraintLayout clInput;
    public final IconImageView endIconView;
    public final TextView endUnitView;
    public final TextView errorView;
    public final TextView inputLimit;
    public final FixEditText inputView;
    public final LinearLayout inputViewParent;
    public final LinearLayout llButton;
    public final IconImageView startIconView;
    public final TextView startUnitView;
    public final TextView titleView;

    protected MultiLineInputViewBinding(Object obj, View view, int i, RoundConstraintLayout roundConstraintLayout, IconImageView iconImageView, TextView textView, TextView textView2, TextView textView3, FixEditText fixEditText, LinearLayout linearLayout, LinearLayout linearLayout2, IconImageView iconImageView2, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.clInput = roundConstraintLayout;
        this.endIconView = iconImageView;
        this.endUnitView = textView;
        this.errorView = textView2;
        this.inputLimit = textView3;
        this.inputView = fixEditText;
        this.inputViewParent = linearLayout;
        this.llButton = linearLayout2;
        this.startIconView = iconImageView2;
        this.startUnitView = textView4;
        this.titleView = textView5;
    }

    public static MultiLineInputViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static MultiLineInputViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (MultiLineInputViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.multi_line_input_view, viewGroup, z, obj);
    }

    public static MultiLineInputViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static MultiLineInputViewBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (MultiLineInputViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.multi_line_input_view, null, false, obj);
    }

    public static MultiLineInputViewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static MultiLineInputViewBinding bind(View view, Object obj) {
        return (MultiLineInputViewBinding) bind(obj, view, R.layout.multi_line_input_view);
    }
}
