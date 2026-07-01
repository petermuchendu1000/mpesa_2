package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.R;

public final class ItemBannerViewLayoutBinding implements ViewBinding {
    private final ConstraintLayout component3;
    public final ImageView imageView;

    private ItemBannerViewLayoutBinding(ConstraintLayout constraintLayout, ImageView imageView) {
        this.component3 = constraintLayout;
        this.imageView = imageView;
    }

    @Override
    public ConstraintLayout getRoot() {
        return this.component3;
    }

    public static ItemBannerViewLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemBannerViewLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_banner_view_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemBannerViewLayoutBinding bind(View view) {
        int i = R.id.imageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            return new ItemBannerViewLayoutBinding((ConstraintLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
