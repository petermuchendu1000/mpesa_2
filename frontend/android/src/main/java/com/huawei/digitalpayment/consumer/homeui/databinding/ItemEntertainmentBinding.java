package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.huawei.digitalpayment.consumer.homeui.R;

public final class ItemEntertainmentBinding implements ViewBinding {
    private static int component2 = 1;
    private static int copydefault;
    private final LinearLayout component3;
    public final ImageView ivFunction;
    public final MaterialCardView ivFunctionBg;
    public final TextView tvName;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 107;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return getRoot();
        }
        getRoot();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ItemEntertainmentBinding(LinearLayout linearLayout, ImageView imageView, MaterialCardView materialCardView, TextView textView) {
        this.component3 = linearLayout;
        this.ivFunction = imageView;
        this.ivFunctionBg = materialCardView;
        this.tvName = textView;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        throw null;
    }

    public static ItemEntertainmentBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return inflate(layoutInflater, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r3
  0x0022: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.homeui.databinding.ItemEntertainmentBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemEntertainmentBinding.component2
            int r1 = r1 + 117
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemEntertainmentBinding.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1a
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.layout.item_entertainment
            android.view.View r3 = r3.inflate(r1, r4, r2)
            r1 = 1
            r5 = r5 ^ r1
            if (r5 == r1) goto L2e
            goto L22
        L1a:
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.layout.item_entertainment
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2e
        L22:
            int r5 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemEntertainmentBinding.component2
            int r5 = r5 + 87
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemEntertainmentBinding.copydefault = r1
            int r5 = r5 % r0
            r4.addView(r3)
        L2e:
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemEntertainmentBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.ItemEntertainmentBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.homeui.databinding.ItemEntertainmentBinding");
    }

    public static ItemEntertainmentBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.iv_function;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i4);
        if (imageView != null) {
            int i5 = component2 + 51;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            i4 = R.id.iv_function_bg;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, i4);
            if (materialCardView != null) {
                i4 = R.id.tvName;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
                if (textView != null) {
                    ItemEntertainmentBinding itemEntertainmentBinding = new ItemEntertainmentBinding((LinearLayout) view, imageView, materialCardView, textView);
                    int i7 = copydefault + 63;
                    component2 = i7 % 128;
                    int i8 = i7 % 2;
                    return itemEntertainmentBinding;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
