package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;

public final class CustomButtonBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final ConstraintLayout component3;
    public final RoundTextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return root;
    }

    private CustomButtonBinding(ConstraintLayout constraintLayout, RoundTextView roundTextView) {
        this.component3 = constraintLayout;
        this.tvTitle = roundTextView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.component3;
        int i5 = i3 + 29;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static CustomButtonBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        CustomButtonBinding customButtonBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 73;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return customButtonBindingInflate;
    }

    public static CustomButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.custom_button, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        CustomButtonBinding customButtonBindingBind = bind(viewInflate);
        int i4 = component2 + 97;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return customButtonBindingBind;
    }

    public static CustomButtonBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.tv_title;
        RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i4);
        if (roundTextView != null) {
            CustomButtonBinding customButtonBinding = new CustomButtonBinding((ConstraintLayout) view, roundTextView);
            int i5 = ShareDataUIState + 85;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return customButtonBinding;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
