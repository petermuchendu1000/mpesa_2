package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.R;

public final class CommonViewGlobalLoadingStatusBinding implements ViewBinding {
    public final Button btnSearchAgain;
    private final View component3;
    public final ImageView image;
    public final ProgressBar progressBar;
    public final TextView text;

    private CommonViewGlobalLoadingStatusBinding(View view, Button button, ImageView imageView, ProgressBar progressBar, TextView textView) {
        this.component3 = view;
        this.btnSearchAgain = button;
        this.image = imageView;
        this.progressBar = progressBar;
        this.text = textView;
    }

    @Override
    public View getRoot() {
        return this.component3;
    }

    public static CommonViewGlobalLoadingStatusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.common_view_global_loading_status, viewGroup);
        return bind(viewGroup);
    }

    public static CommonViewGlobalLoadingStatusBinding bind(View view) {
        int i = R.id.btn_search_again;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.progress_bar;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                if (progressBar != null) {
                    i = R.id.text;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new CommonViewGlobalLoadingStatusBinding(view, button, imageView, progressBar, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
