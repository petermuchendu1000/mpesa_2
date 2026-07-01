package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class CustomTabBinding implements ViewBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    private final ConstraintLayout ShareDataUIState;
    public final RoundTextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 1;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            getRoot();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout root = getRoot();
        int i3 = component1 + 75;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return root;
    }

    private CustomTabBinding(ConstraintLayout constraintLayout, RoundTextView roundTextView) {
        this.ShareDataUIState = constraintLayout;
        this.tvTitle = roundTextView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 1;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static CustomTabBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 107;
        component1 = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 != 0);
    }

    public static CustomTabBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.custom_tab, viewGroup, false);
        if (z) {
            int i4 = component1 + 123;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup.addView(viewInflate);
            } else {
                viewGroup.addView(viewInflate);
                throw null;
            }
        }
        return bind(viewInflate);
    }

    public static CustomTabBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 33;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = R.id.tv_title;
            RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i3);
            if (roundTextView != null) {
                CustomTabBinding customTabBinding = new CustomTabBinding((ConstraintLayout) view, roundTextView);
                int i4 = component2 + 87;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return customTabBinding;
                }
                obj.hashCode();
                throw null;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        throw null;
    }
}
