package com.huawei.digitalpayment.consumer.profileui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.profileui.R;

public final class ItemMgtBinding implements ViewBinding {
    private static int component2 = 1;
    private static int component3;
    private final ConstraintLayout copydefault;
    public final ImageView image;
    public final TextView name;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component3 + 85;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemMgtBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.copydefault = constraintLayout;
        this.image = imageView;
        this.name = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 121;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayout = this.copydefault;
        int i4 = i3 + 115;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return constraintLayout;
    }

    public static ItemMgtBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 15;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemMgtBinding itemMgtBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 9;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemMgtBindingInflate;
    }

    public static ItemMgtBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_mgt, viewGroup, false);
        if (z) {
            int i2 = component2 + 11;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
        }
        ItemMgtBinding itemMgtBindingBind = bind(viewInflate);
        int i4 = component2 + 31;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemMgtBindingBind;
    }

    public static ItemMgtBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
        if (imageView != null) {
            int i3 = component2 + 63;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
            if (textView != null) {
                ItemMgtBinding itemMgtBinding = new ItemMgtBinding((ConstraintLayout) view, imageView, textView);
                int i5 = component2 + 1;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 77 / 0;
                }
                return itemMgtBinding;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
