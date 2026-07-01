package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemChangeThemeBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final ConstraintLayout clContainer;
    private final ConstraintLayout component2;
    public final RoundImageView ivImage;
    public final ImageView ivSelected;
    public final TextView tvName;

    @Override
    public View getRoot() {
        ConstraintLayout root;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            root = getRoot();
            int i3 = 62 / 0;
        } else {
            root = getRoot();
        }
        int i4 = component1 + 85;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemChangeThemeBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RoundImageView roundImageView, ImageView imageView, TextView textView) {
        this.component2 = constraintLayout;
        this.clContainer = constraintLayout2;
        this.ivImage = roundImageView;
        this.ivSelected = imageView;
        this.tvName = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        ConstraintLayout constraintLayout;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 39;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            constraintLayout = this.component2;
            int i4 = 77 / 0;
        } else {
            constraintLayout = this.component2;
        }
        int i5 = i2 + 95;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return constraintLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ItemChangeThemeBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemChangeThemeBinding itemChangeThemeBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 49;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemChangeThemeBindingInflate;
    }

    public static ItemChangeThemeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_change_theme, viewGroup, false);
        if (z) {
            int i4 = component1 + 43;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                viewGroup.addView(viewInflate);
            } else {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return bind(viewInflate);
    }

    public static ItemChangeThemeBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.cl_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i2);
        if (constraintLayout != null) {
            i2 = R.id.iv_image;
            RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i2);
            if (roundImageView != null) {
                i2 = R.id.iv_selected;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
                if (imageView != null) {
                    int i3 = component1 + 15;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    i2 = R.id.tv_name;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                    if (textView != null) {
                        ItemChangeThemeBinding itemChangeThemeBinding = new ItemChangeThemeBinding((ConstraintLayout) view, constraintLayout, roundImageView, imageView, textView);
                        int i5 = ShareDataUIState + 87;
                        component1 = i5 % 128;
                        if (i5 % 2 != 0) {
                            return itemChangeThemeBinding;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
