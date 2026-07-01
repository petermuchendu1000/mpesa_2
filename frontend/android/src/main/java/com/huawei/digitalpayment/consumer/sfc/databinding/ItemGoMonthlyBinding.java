package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemGoMonthlyBinding implements ViewBinding {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final FrameLayout ShareDataUIState;
    public final ImageView ivImage;
    public final TextView tvDes;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getRoot();
            throw null;
        }
        FrameLayout root = getRoot();
        int i3 = component1 + 123;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return root;
        }
        obj.hashCode();
        throw null;
    }

    private ItemGoMonthlyBinding(FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.ShareDataUIState = frameLayout;
        this.ivImage = imageView;
        this.tvDes = textView;
        this.tvTitle = textView2;
    }

    @Override
    public FrameLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 109;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        FrameLayout frameLayout = this.ShareDataUIState;
        int i4 = i2 + 27;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return frameLayout;
        }
        throw null;
    }

    public static ItemGoMonthlyBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        component1 = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r4
  0x0021: PHI (r4v2 android.view.View) = (r4v1 android.view.View), (r4v5 android.view.View) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemGoMonthlyBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemGoMonthlyBinding.copydefault
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemGoMonthlyBinding.component1 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L19
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_go_monthly
            r3 = 1
            android.view.View r4 = r4.inflate(r1, r5, r3)
            if (r6 == 0) goto L2d
            goto L21
        L19:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_go_monthly
            android.view.View r4 = r4.inflate(r1, r5, r2)
            if (r6 == 0) goto L2d
        L21:
            r5.addView(r4)
            int r5 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemGoMonthlyBinding.copydefault
            int r5 = r5 + 43
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemGoMonthlyBinding.component1 = r6
            int r5 = r5 % r0
        L2d:
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemGoMonthlyBinding r4 = bind(r4)
            int r5 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemGoMonthlyBinding.component1
            int r5 = r5 + 121
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemGoMonthlyBinding.copydefault = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L3f
            r5 = 39
            int r5 = r5 / r2
        L3f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemGoMonthlyBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.ItemGoMonthlyBinding");
    }

    public static ItemGoMonthlyBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = R.id.iv_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i3);
        if (imageView != null) {
            i3 = R.id.tv_des;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
            if (textView != null) {
                int i4 = copydefault + 71;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                i3 = R.id.tv_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i3);
                if (textView2 != null) {
                    ItemGoMonthlyBinding itemGoMonthlyBinding = new ItemGoMonthlyBinding((FrameLayout) view, imageView, textView, textView2);
                    int i5 = copydefault + 95;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    return itemGoMonthlyBinding;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
    }
}
