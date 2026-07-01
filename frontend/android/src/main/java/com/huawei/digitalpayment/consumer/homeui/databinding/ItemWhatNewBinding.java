package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

public final class ItemWhatNewBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final ConstraintLayout component1;
    public final ImageView ivImage;
    public final TextView tvValue;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = copydefault + 123;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ItemWhatNewBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.component1 = constraintLayout;
        this.ivImage = imageView;
        this.tvValue = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayout = this.component1;
        int i4 = i3 + 41;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayout;
    }

    public static ItemWhatNewBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        copydefault = i2 % 128;
        ItemWhatNewBinding itemWhatNewBindingInflate = i2 % 2 != 0 ? inflate(layoutInflater, null, true) : inflate(layoutInflater, null, false);
        int i3 = ShareDataUIState + 109;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 20 / 0;
        }
        return itemWhatNewBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r3
  0x0022: PHI (r3v5 android.view.View) = (r3v1 android.view.View), (r3v6 android.view.View) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.homeui.databinding.ItemWhatNewBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemWhatNewBinding.ShareDataUIState
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemWhatNewBinding.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1a
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.layout.item_what_new
            android.view.View r3 = r3.inflate(r1, r4, r2)
            r5 = r5 ^ 1
            if (r5 == 0) goto L22
            goto L25
        L1a:
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.layout.item_what_new
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L25
        L22:
            r4.addView(r3)
        L25:
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemWhatNewBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemWhatNewBinding.copydefault
            int r4 = r4 + 69
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemWhatNewBinding.ShareDataUIState = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L35
            return r3
        L35:
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.ItemWhatNewBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.homeui.databinding.ItemWhatNewBinding");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r3 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r1 = new com.huawei.digitalpayment.consumer.homeui.databinding.ItemWhatNewBinding((androidx.constraintlayout.widget.ConstraintLayout) r5, r2, r3);
        r5 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemWhatNewBinding.ShareDataUIState + 43;
        com.huawei.digitalpayment.consumer.homeui.databinding.ItemWhatNewBinding.copydefault = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if ((r5 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r3 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.homeui.databinding.ItemWhatNewBinding bind(android.view.View r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.id.iv_image
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L49
            int r1 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemWhatNewBinding.ShareDataUIState
            int r1 = r1 + 113
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemWhatNewBinding.copydefault = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L27
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.id.tv_value
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 39
            int r4 = r4 / 0
            if (r3 == 0) goto L49
            goto L31
        L27:
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.id.tv_value
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L49
        L31:
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemWhatNewBinding r1 = new com.huawei.digitalpayment.consumer.homeui.databinding.ItemWhatNewBinding
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r1.<init>(r5, r2, r3)
            int r5 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemWhatNewBinding.ShareDataUIState
            int r5 = r5 + 43
            int r2 = r5 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemWhatNewBinding.copydefault = r2
            int r5 = r5 % r0
            if (r5 != 0) goto L44
            return r1
        L44:
            r5 = 0
            r5.hashCode()
            throw r5
        L49:
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r5 = r5.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.ItemWhatNewBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.homeui.databinding.ItemWhatNewBinding");
    }
}
