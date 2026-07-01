package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.qrcode.R;

public final class LayoutBarCodeBigBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final LinearLayout component1;
    public final LinearLayout contentLayout;
    public final ImageView ivBarCodeBig;
    public final LinearLayout llContent;
    public final TextView tvBarCodeNum;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return root;
    }

    private LayoutBarCodeBigBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, LinearLayout linearLayout3, TextView textView) {
        this.component1 = linearLayout;
        this.contentLayout = linearLayout2;
        this.ivBarCodeBig = imageView;
        this.llContent = linearLayout3;
        this.tvBarCodeNum = textView;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        LinearLayout linearLayout = this.component1;
        int i4 = i3 + 119;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return linearLayout;
        }
        throw null;
    }

    public static LayoutBarCodeBigBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 97;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LayoutBarCodeBigBinding layoutBarCodeBigBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 37;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return layoutBarCodeBigBindingInflate;
        }
        throw null;
    }

    public static LayoutBarCodeBigBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 5;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.layout_bar_code_big, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
            int i4 = component3 + 69;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
        return bind(viewInflate);
    }

    public static LayoutBarCodeBigBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.content_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i2);
        if (linearLayout != null) {
            int i3 = component3 + 3;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.iv_bar_code_big;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
            if (imageView != null) {
                LinearLayout linearLayout2 = (LinearLayout) view;
                i2 = R.id.tv_bar_code_num;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                if (textView != null) {
                    LayoutBarCodeBigBinding layoutBarCodeBigBinding = new LayoutBarCodeBigBinding(linearLayout2, linearLayout, imageView, linearLayout2, textView);
                    int i5 = component3 + 55;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    return layoutBarCodeBigBinding;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
