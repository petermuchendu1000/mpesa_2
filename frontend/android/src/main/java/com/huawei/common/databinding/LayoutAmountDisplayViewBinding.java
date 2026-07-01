package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.R;

public final class LayoutAmountDisplayViewBinding implements ViewBinding {
    public final TextView amountDisplayViewTvAmount;
    public final TextView amountDisplayViewTvUnit;
    public final TextView amountDisplayViewTvUnitPrefix;
    private final View copydefault;

    private LayoutAmountDisplayViewBinding(View view, TextView textView, TextView textView2, TextView textView3) {
        this.copydefault = view;
        this.amountDisplayViewTvAmount = textView;
        this.amountDisplayViewTvUnit = textView2;
        this.amountDisplayViewTvUnitPrefix = textView3;
    }

    @Override
    public View getRoot() {
        return this.copydefault;
    }

    public static LayoutAmountDisplayViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.layout_amount_display_view, viewGroup);
        return bind(viewGroup);
    }

    public static LayoutAmountDisplayViewBinding bind(View view) {
        int i = R.id.amountDisplayView_tv_amount;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.amountDisplayView_tv_unit;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.amountDisplayView_tv_unit_prefix;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    return new LayoutAmountDisplayViewBinding(view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
