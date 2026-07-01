package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.R;

public final class CommonKeyboardItemEmptyBinding implements ViewBinding {
    private final ImageView component3;
    public final ImageView tvContent;

    private CommonKeyboardItemEmptyBinding(ImageView imageView, ImageView imageView2) {
        this.component3 = imageView;
        this.tvContent = imageView2;
    }

    @Override
    public ImageView getRoot() {
        return this.component3;
    }

    public static CommonKeyboardItemEmptyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CommonKeyboardItemEmptyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.common_keyboard_item_empty, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static CommonKeyboardItemEmptyBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) view;
        return new CommonKeyboardItemEmptyBinding(imageView, imageView);
    }
}
