package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.R;

public final class CommonViewDisplayBinding implements ViewBinding {
    private final View component2;
    public final ImageView ivIcon;
    public final TextView tvContent;
    public final TextView tvTitle;

    private CommonViewDisplayBinding(View view, ImageView imageView, TextView textView, TextView textView2) {
        this.component2 = view;
        this.ivIcon = imageView;
        this.tvContent = textView;
        this.tvTitle = textView2;
    }

    @Override
    public View getRoot() {
        return this.component2;
    }

    public static CommonViewDisplayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.common_view_display, viewGroup);
        return bind(viewGroup);
    }

    public static CommonViewDisplayBinding bind(View view) {
        int i = R.id.ivIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.tvContent;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.tvTitle;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new CommonViewDisplayBinding(view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
