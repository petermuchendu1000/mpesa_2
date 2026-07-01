package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.R;
import com.huawei.common.widget.round.RoundImageView;

public final class LayoutCommonItemBinding implements ViewBinding {
    public final ImageView commonItemIvArrow;
    public final RoundImageView commonItemIvIcon;
    public final ConstraintLayout commonItemLayoutExtra;
    public final LinearLayout commonItemLlTitle;
    public final TextView commonItemTvSubTitle;
    public final TextView commonItemTvTitle;
    private final View component3;

    private LayoutCommonItemBinding(View view, ImageView imageView, RoundImageView roundImageView, ConstraintLayout constraintLayout, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.component3 = view;
        this.commonItemIvArrow = imageView;
        this.commonItemIvIcon = roundImageView;
        this.commonItemLayoutExtra = constraintLayout;
        this.commonItemLlTitle = linearLayout;
        this.commonItemTvSubTitle = textView;
        this.commonItemTvTitle = textView2;
    }

    @Override
    public View getRoot() {
        return this.component3;
    }

    public static LayoutCommonItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.layout_common_item, viewGroup);
        return bind(viewGroup);
    }

    public static LayoutCommonItemBinding bind(View view) {
        int i = R.id.common_item_iv_arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.common_item_iv_icon;
            RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i);
            if (roundImageView != null) {
                i = R.id.common_item_layout_extra;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R.id.common_item_ll_title;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.common_item_tv_subTitle;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.common_item_tv_title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new LayoutCommonItemBinding(view, imageView, roundImageView, constraintLayout, linearLayout, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
