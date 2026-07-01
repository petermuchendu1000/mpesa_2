package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.R;

public final class ItemDialogSelectBinding implements ViewBinding {
    private final ConstraintLayout component1;
    public final ImageView ivSelected;
    public final ConstraintLayout layoutItem;
    public final TextView tvContent;

    private ItemDialogSelectBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, TextView textView) {
        this.component1 = constraintLayout;
        this.ivSelected = imageView;
        this.layoutItem = constraintLayout2;
        this.tvContent = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        return this.component1;
    }

    public static ItemDialogSelectBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDialogSelectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_dialog_select, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemDialogSelectBinding bind(View view) {
        int i = R.id.iv_selected;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = R.id.tv_content;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
            if (textView != null) {
                return new ItemDialogSelectBinding(constraintLayout, imageView, constraintLayout, textView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
