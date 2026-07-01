package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.R;
import com.huawei.common.widget.round.RoundTextView;

public final class CommonKeyboardItemTextBinding implements ViewBinding {
    private final LinearLayout component3;
    public final RoundTextView tvContent;

    private CommonKeyboardItemTextBinding(LinearLayout linearLayout, RoundTextView roundTextView) {
        this.component3 = linearLayout;
        this.tvContent = roundTextView;
    }

    @Override
    public LinearLayout getRoot() {
        return this.component3;
    }

    public static CommonKeyboardItemTextBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CommonKeyboardItemTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.common_keyboard_item_text, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static CommonKeyboardItemTextBinding bind(View view) {
        int i = R.id.tv_content;
        RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i);
        if (roundTextView != null) {
            return new CommonKeyboardItemTextBinding((LinearLayout) view, roundTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
