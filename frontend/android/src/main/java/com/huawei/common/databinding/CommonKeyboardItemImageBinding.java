package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.R;
import com.huawei.common.widget.round.RoundImageView;

public final class CommonKeyboardItemImageBinding implements ViewBinding {
    private final LinearLayout component3;
    public final RoundImageView tvContent;

    private CommonKeyboardItemImageBinding(LinearLayout linearLayout, RoundImageView roundImageView) {
        this.component3 = linearLayout;
        this.tvContent = roundImageView;
    }

    @Override
    public LinearLayout getRoot() {
        return this.component3;
    }

    public static CommonKeyboardItemImageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CommonKeyboardItemImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.common_keyboard_item_image, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static CommonKeyboardItemImageBinding bind(View view) {
        int i = R.id.tv_content;
        RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i);
        if (roundImageView != null) {
            return new CommonKeyboardItemImageBinding((LinearLayout) view, roundImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
