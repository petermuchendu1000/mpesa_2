package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.R;
import com.huawei.common.widget.round.RoundImageView;

public final class CommonTabItemViewBinding implements ViewBinding {
    public final RoundImageView commonTabIndicatorView;
    public final ImageView commonTabIvIcon;
    public final TextView commonTabTvTitle;
    private final View component3;

    private CommonTabItemViewBinding(View view, RoundImageView roundImageView, ImageView imageView, TextView textView) {
        this.component3 = view;
        this.commonTabIndicatorView = roundImageView;
        this.commonTabIvIcon = imageView;
        this.commonTabTvTitle = textView;
    }

    @Override
    public View getRoot() {
        return this.component3;
    }

    public static CommonTabItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.common_tab_item_view, viewGroup);
        return bind(viewGroup);
    }

    public static CommonTabItemViewBinding bind(View view) {
        int i = R.id.common_tab_indicator_view;
        RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i);
        if (roundImageView != null) {
            i = R.id.common_tab_iv_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.common_tab_tv_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new CommonTabItemViewBinding(view, roundImageView, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
