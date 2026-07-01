package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemSfcBundleBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final FrameLayout component2;
    public final ImageView ivBundle;
    public final TextView tvName;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getRoot();
            obj.hashCode();
            throw null;
        }
        FrameLayout root = getRoot();
        int i3 = ShareDataUIState + 19;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return root;
        }
        obj.hashCode();
        throw null;
    }

    private ItemSfcBundleBinding(FrameLayout frameLayout, ImageView imageView, TextView textView) {
        this.component2 = frameLayout;
        this.ivBundle = imageView;
        this.tvName = textView;
    }

    @Override
    public FrameLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 125;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        FrameLayout frameLayout = this.component2;
        int i4 = i2 + 3;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return frameLayout;
        }
        throw null;
    }

    public static ItemSfcBundleBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemSfcBundleBinding itemSfcBundleBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 87;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemSfcBundleBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
  0x0021: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcBundleBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcBundleBinding.ShareDataUIState
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcBundleBinding.component3 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_sfc_bundle
            r2 = 1
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2d
            goto L21
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_sfc_bundle
            r2 = 0
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2d
        L21:
            int r5 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcBundleBinding.component3
            int r5 = r5 + 7
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcBundleBinding.ShareDataUIState = r1
            int r5 = r5 % r0
            r4.addView(r3)
        L2d:
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcBundleBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcBundleBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcBundleBinding");
    }

    public static ItemSfcBundleBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.id.iv_bundle;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i3);
            if (imageView != null) {
                i3 = R.id.tv_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
                if (textView != null) {
                    ItemSfcBundleBinding itemSfcBundleBinding = new ItemSfcBundleBinding((FrameLayout) view, imageView, textView);
                    int i4 = ShareDataUIState + 63;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    return itemSfcBundleBinding;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
