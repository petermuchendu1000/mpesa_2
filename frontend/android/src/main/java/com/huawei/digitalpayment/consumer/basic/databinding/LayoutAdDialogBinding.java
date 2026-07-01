package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.basic.R;

public final class LayoutAdDialogBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final LinearLayout component2;
    public final ImageView ivAdvertisement;
    public final ImageView ivClose;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return getRoot();
        }
        getRoot();
        throw null;
    }

    private LayoutAdDialogBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2) {
        this.component2 = linearLayout;
        this.ivAdvertisement = imageView;
        this.ivClose = imageView2;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 121;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LinearLayout linearLayout = this.component2;
        int i4 = i2 + 79;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return linearLayout;
    }

    public static LayoutAdDialogBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LayoutAdDialogBinding layoutAdDialogBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 23;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return layoutAdDialogBindingInflate;
    }

    public static LayoutAdDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.layout_ad_dialog, viewGroup, false);
        if (z) {
            int i2 = ShareDataUIState + 27;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
            int i4 = component3 + 101;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
        return bind(viewInflate);
    }

    public static LayoutAdDialogBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.iv_advertisement;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i4);
        if (imageView != null) {
            i4 = R.id.iv_close;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i4);
            if (imageView2 != null) {
                LayoutAdDialogBinding layoutAdDialogBinding = new LayoutAdDialogBinding((LinearLayout) view, imageView, imageView2);
                int i5 = component3 + 31;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return layoutAdDialogBinding;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
