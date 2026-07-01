package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.text.FixEditText;
import com.huawei.digitalpayment.consumer.homeui.R;

public final class HomeSearchBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    public final RoundConstraintLayout clSearch;
    private final RoundConstraintLayout component3;
    public final FixEditText etSearch;
    public final ImageView ivStartSearch;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return getRoot();
        }
        getRoot();
        throw null;
    }

    private HomeSearchBinding(RoundConstraintLayout roundConstraintLayout, RoundConstraintLayout roundConstraintLayout2, FixEditText fixEditText, ImageView imageView) {
        this.component3 = roundConstraintLayout;
        this.clSearch = roundConstraintLayout2;
        this.etSearch = fixEditText;
        this.ivStartSearch = imageView;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 61;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        RoundConstraintLayout roundConstraintLayout = this.component3;
        int i5 = i3 + 15;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return roundConstraintLayout;
    }

    public static HomeSearchBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return inflate(layoutInflater, null, false);
    }

    public static HomeSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.home_search, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
            int i4 = ShareDataUIState + 87;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 4;
            }
        }
        return bind(viewInflate);
    }

    public static HomeSearchBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) view;
            int i3 = R.id.etSearch;
            FixEditText fixEditText = (FixEditText) ViewBindings.findChildViewById(view, i3);
            if (fixEditText != null) {
                int i4 = ShareDataUIState + 67;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    i3 = R.id.iv_start_search;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i3);
                    if (imageView != null) {
                        HomeSearchBinding homeSearchBinding = new HomeSearchBinding(roundConstraintLayout, roundConstraintLayout, fixEditText, imageView);
                        int i5 = component1 + 25;
                        ShareDataUIState = i5 % 128;
                        int i6 = i5 % 2;
                        return homeSearchBinding;
                    }
                } else {
                    obj.hashCode();
                    throw null;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        throw null;
    }
}
