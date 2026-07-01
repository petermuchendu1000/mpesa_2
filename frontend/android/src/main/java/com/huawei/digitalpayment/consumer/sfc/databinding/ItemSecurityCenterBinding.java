package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

public final class ItemSecurityCenterBinding implements ViewBinding {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final FrameLayout ShareDataUIState;
    public final ImageView ivIcon;
    public final ConstraintLayout ivIconContainer;
    public final TextView tvContent;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout root = getRoot();
        int i4 = component1 + 49;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemSecurityCenterBinding(FrameLayout frameLayout, ImageView imageView, ConstraintLayout constraintLayout, TextView textView) {
        this.ShareDataUIState = frameLayout;
        this.ivIcon = imageView;
        this.ivIconContainer = constraintLayout;
        this.tvContent = textView;
    }

    @Override
    public FrameLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout frameLayout = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return frameLayout;
    }

    public static ItemSecurityCenterBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemSecurityCenterBinding itemSecurityCenterBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 63;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return itemSecurityCenterBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r4
  0x0021: PHI (r4v2 android.view.View) = (r4v1 android.view.View), (r4v5 android.view.View) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemSecurityCenterBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemSecurityCenterBinding.copydefault
            int r1 = r1 + 15
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSecurityCenterBinding.component1 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L19
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_security_center
            r3 = 1
            android.view.View r4 = r4.inflate(r1, r5, r3)
            if (r6 == 0) goto L24
            goto L21
        L19:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_security_center
            android.view.View r4 = r4.inflate(r1, r5, r2)
            if (r6 == 0) goto L24
        L21:
            r5.addView(r4)
        L24:
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSecurityCenterBinding r4 = bind(r4)
            int r5 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemSecurityCenterBinding.component1
            int r5 = r5 + 91
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSecurityCenterBinding.copydefault = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L36
            r5 = 17
            int r5 = r5 / r2
        L36:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemSecurityCenterBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.ItemSecurityCenterBinding");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r0 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r0 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        return new com.huawei.digitalpayment.consumer.sfc.databinding.ItemSecurityCenterBinding((android.widget.FrameLayout) r5, r2, r3, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemSecurityCenterBinding bind(android.view.View r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemSecurityCenterBinding.component1
            int r1 = r1 + 27
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSecurityCenterBinding.copydefault = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L62
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.iv_icon
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L4e
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.iv_icon_container
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            if (r3 == 0) goto L4e
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemSecurityCenterBinding.copydefault
            int r1 = r1 + 75
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSecurityCenterBinding.component1 = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L3c
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_content
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4 = 11
            int r4 = r4 / 0
            if (r0 == 0) goto L4e
            goto L46
        L3c:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_content
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L4e
        L46:
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSecurityCenterBinding r1 = new com.huawei.digitalpayment.consumer.sfc.databinding.ItemSecurityCenterBinding
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            r1.<init>(r5, r2, r3, r0)
            return r1
        L4e:
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r5 = r5.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        L62:
            int r0 = com.huawei.digitalpayment.consumer.sfc.R.id.iv_icon
            android.view.View r5 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r0)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r5 = 0
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemSecurityCenterBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.sfc.databinding.ItemSecurityCenterBinding");
    }
}
