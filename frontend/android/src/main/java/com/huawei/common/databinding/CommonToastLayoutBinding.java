package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.R;
import com.huawei.common.widget.round.RoundTextView;

public final class CommonToastLayoutBinding implements ViewBinding {
    private final FrameLayout component3;
    public final RoundTextView tvContent;

    private CommonToastLayoutBinding(FrameLayout frameLayout, RoundTextView roundTextView) {
        this.component3 = frameLayout;
        this.tvContent = roundTextView;
    }

    @Override
    public FrameLayout getRoot() {
        return this.component3;
    }

    public static CommonToastLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CommonToastLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.common_toast_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static CommonToastLayoutBinding bind(View view) {
        int i = R.id.tv_content;
        RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i);
        if (roundTextView != null) {
            return new CommonToastLayoutBinding((FrameLayout) view, roundTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
