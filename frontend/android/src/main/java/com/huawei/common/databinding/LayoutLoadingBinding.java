package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.R;
import com.huawei.common.widget.RotateImageView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.round.RoundTextView;

public final class LayoutLoadingBinding implements ViewBinding {
    private final LinearLayout ShareDataUIState;
    public final RotateImageView ivLoading;
    public final RoundLinearLayout rlBg;
    public final RoundTextView tipTextView;

    private LayoutLoadingBinding(LinearLayout linearLayout, RotateImageView rotateImageView, RoundLinearLayout roundLinearLayout, RoundTextView roundTextView) {
        this.ShareDataUIState = linearLayout;
        this.ivLoading = rotateImageView;
        this.rlBg = roundLinearLayout;
        this.tipTextView = roundTextView;
    }

    @Override
    public LinearLayout getRoot() {
        return this.ShareDataUIState;
    }

    public static LayoutLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static LayoutLoadingBinding bind(View view) {
        int i = R.id.iv_loading;
        RotateImageView rotateImageView = (RotateImageView) ViewBindings.findChildViewById(view, i);
        if (rotateImageView != null) {
            i = R.id.rl_bg;
            RoundLinearLayout roundLinearLayout = (RoundLinearLayout) ViewBindings.findChildViewById(view, i);
            if (roundLinearLayout != null) {
                i = R.id.tipTextView;
                RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i);
                if (roundTextView != null) {
                    return new LayoutLoadingBinding((LinearLayout) view, rotateImageView, roundLinearLayout, roundTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
