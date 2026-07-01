package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

public final class ItemComingUpBinding implements ViewBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final ConstraintLayout component2;
    public final ImageView ivImage;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            getRoot();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout root = getRoot();
        int i3 = copydefault + 59;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return root;
    }

    private ItemComingUpBinding(ConstraintLayout constraintLayout, ImageView imageView) {
        this.component2 = constraintLayout;
        this.ivImage = imageView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.component2;
        int i5 = i3 + 11;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return constraintLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ItemComingUpBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemComingUpBinding itemComingUpBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 105;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemComingUpBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
  0x0021: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v6 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.homeui.databinding.ItemComingUpBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemComingUpBinding.copydefault
            int r1 = r1 + 67
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemComingUpBinding.component3 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.layout.item_coming_up
            r2 = 1
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L24
            goto L21
        L18:
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.layout.item_coming_up
            r2 = 0
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L24
        L21:
            r4.addView(r3)
        L24:
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemComingUpBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemComingUpBinding.copydefault
            int r4 = r4 + 101
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemComingUpBinding.component3 = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L34
            return r3
        L34:
            r3 = 0
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.ItemComingUpBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.homeui.databinding.ItemComingUpBinding");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r4 = 64 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(r4.getResources().getResourceName(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = new com.huawei.digitalpayment.consumer.homeui.databinding.ItemComingUpBinding((androidx.constraintlayout.widget.ConstraintLayout) r4, r2);
        r4 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemComingUpBinding.component3 + 55;
        com.huawei.digitalpayment.consumer.homeui.databinding.ItemComingUpBinding.copydefault = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.homeui.databinding.ItemComingUpBinding bind(android.view.View r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemComingUpBinding.copydefault
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemComingUpBinding.component3 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.id.iv_image
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r3 = 55
            int r3 = r3 / 0
            if (r2 == 0) goto L3e
            goto L27
        L1d:
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.id.iv_image
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L3e
        L27:
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemComingUpBinding r1 = new com.huawei.digitalpayment.consumer.homeui.databinding.ItemComingUpBinding
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r1.<init>(r4, r2)
            int r4 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemComingUpBinding.component3
            int r4 = r4 + 55
            int r2 = r4 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemComingUpBinding.copydefault = r2
            int r4 = r4 % r0
            if (r4 != 0) goto L3d
            r4 = 64
            int r4 = r4 / 0
        L3d:
            return r1
        L3e:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.ItemComingUpBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.homeui.databinding.ItemComingUpBinding");
    }
}
