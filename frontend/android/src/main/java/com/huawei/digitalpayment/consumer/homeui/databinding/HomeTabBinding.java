package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;

public final class HomeTabBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final ConstraintLayout component3;
    public final RoundImageView ivIndicator;
    public final RoundTextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getRoot();
            obj.hashCode();
            throw null;
        }
        ConstraintLayout root = getRoot();
        int i3 = component2 + 9;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return root;
        }
        obj.hashCode();
        throw null;
    }

    private HomeTabBinding(ConstraintLayout constraintLayout, RoundImageView roundImageView, RoundTextView roundTextView) {
        this.component3 = constraintLayout;
        this.ivIndicator = roundImageView;
        this.tvTitle = roundTextView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.component3;
        int i5 = i3 + 7;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static HomeTabBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 23;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        HomeTabBinding homeTabBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 9;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return homeTabBindingInflate;
    }

    public static HomeTabBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.home_tab, viewGroup, false);
        if (z) {
            int i2 = ShareDataUIState + 125;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                viewGroup.addView(viewInflate);
            } else {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        HomeTabBinding homeTabBindingBind = bind(viewInflate);
        int i3 = component2 + 119;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return homeTabBindingBind;
    }

    public static HomeTabBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 91;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = R.id.iv_indicator;
            RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i3);
            if (roundImageView != null) {
                int i4 = component2 + 63;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                i3 = R.id.tv_title;
                RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i3);
                if (roundTextView != null) {
                    HomeTabBinding homeTabBinding = new HomeTabBinding((ConstraintLayout) view, roundImageView, roundTextView);
                    int i6 = ShareDataUIState + 107;
                    component2 = i6 % 128;
                    if (i6 % 2 == 0) {
                        return homeTabBinding;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        throw null;
    }
}
