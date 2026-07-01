package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.homeui.R;

public final class ItemRecommendedBinding implements ViewBinding {
    private static int component2 = 1;
    private static int copydefault;
    private final ConstraintLayout ShareDataUIState;
    public final ImageView ivFunction;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            getRoot();
            throw null;
        }
        ConstraintLayout root = getRoot();
        int i3 = component2 + 119;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return root;
        }
        throw null;
    }

    private ItemRecommendedBinding(ConstraintLayout constraintLayout, ImageView imageView) {
        this.ShareDataUIState = constraintLayout;
        this.ivFunction = imageView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 21;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.ShareDataUIState;
        int i5 = i2 + 107;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static ItemRecommendedBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemRecommendedBinding itemRecommendedBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 65;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemRecommendedBindingInflate;
    }

    public static ItemRecommendedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_recommended, viewGroup, false);
        if (z) {
            int i2 = component2 + 81;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
            int i4 = copydefault + 37;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
        return bind(viewInflate);
    }

    public static ItemRecommendedBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 61;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.id.iv_function;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i3);
            if (imageView != null) {
                ItemRecommendedBinding itemRecommendedBinding = new ItemRecommendedBinding((ConstraintLayout) view, imageView);
                int i4 = component2 + 31;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return itemRecommendedBinding;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
