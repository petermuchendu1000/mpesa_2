package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemRequestFunctionBinding implements ViewBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    private final LinearLayout ShareDataUIState;
    public final ImageView ivIcon;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return root;
    }

    private ItemRequestFunctionBinding(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.ShareDataUIState = linearLayout;
        this.ivIcon = imageView;
        this.tvTitle = textView;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 13;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayout = this.ShareDataUIState;
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        return linearLayout;
    }

    public static ItemRequestFunctionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ItemRequestFunctionBinding itemRequestFunctionBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 115;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemRequestFunctionBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    public static ItemRequestFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_request_function, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
            int i4 = component3 + 45;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
        return bind(viewInflate);
    }

    public static ItemRequestFunctionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i4);
        if (imageView != null) {
            int i5 = component3 + 75;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            i4 = R.id.tv_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
            if (textView != null) {
                return new ItemRequestFunctionBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
