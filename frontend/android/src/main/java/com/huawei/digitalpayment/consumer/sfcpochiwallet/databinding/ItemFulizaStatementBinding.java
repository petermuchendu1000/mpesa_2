package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

public final class ItemFulizaStatementBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final ConstraintLayout copydefault;
    public final ImageView ivImage;
    public final LinearLayout llAmountContainer;
    public final TextView tvAmount;
    public final TextView tvBusinessType;
    public final TextView tvFee;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getRoot();
            obj.hashCode();
            throw null;
        }
        ConstraintLayout root = getRoot();
        int i3 = ShareDataUIState + 119;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return root;
        }
        throw null;
    }

    private ItemFulizaStatementBinding(ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.copydefault = constraintLayout;
        this.ivImage = imageView;
        this.llAmountContainer = linearLayout;
        this.tvAmount = textView;
        this.tvBusinessType = textView2;
        this.tvFee = textView3;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayout = this.copydefault;
        int i4 = i3 + 25;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return constraintLayout;
    }

    public static ItemFulizaStatementBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemFulizaStatementBinding itemFulizaStatementBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 67;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemFulizaStatementBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[PHI: r4
  0x0023: PHI (r4v2 android.view.View) = (r4v1 android.view.View), (r4v6 android.view.View) binds: [B:8:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementBinding.ShareDataUIState
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementBinding.component2 = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.layout.item_fuliza_statement
            android.view.View r4 = r4.inflate(r1, r5, r2)
            if (r6 == 0) goto L26
            goto L23
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.layout.item_fuliza_statement
            r3 = 0
            android.view.View r4 = r4.inflate(r1, r5, r3)
            r6 = r6 ^ r2
            if (r6 == 0) goto L23
            goto L26
        L23:
            r5.addView(r4)
        L26:
            com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementBinding r4 = bind(r4)
            int r5 = com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementBinding.component2
            int r5 = r5 + 55
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementBinding.ShareDataUIState = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L36
            return r4
        L36:
            r4 = 0
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementBinding");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[PHI: r2
  0x005c: PHI (r2v8 android.widget.TextView) = (r2v7 android.widget.TextView), (r2v12 android.widget.TextView) binds: [B:16:0x005a, B:13:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementBinding bind(android.view.View r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementBinding.component2
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementBinding.ShareDataUIState = r2
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.id.iv_image
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            r5 = r2
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L88
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementBinding.component2
            int r1 = r1 + 3
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementBinding.ShareDataUIState = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L7b
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.id.ll_amount_container
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            r6 = r2
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            if (r6 == 0) goto L88
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.id.tv_amount
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L88
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementBinding.component2
            int r1 = r1 + 27
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementBinding.ShareDataUIState = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L52
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.id.tv_business_type
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 76
            int r3 = r3 / 0
            if (r2 == 0) goto L88
            goto L5c
        L52:
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.id.tv_business_type
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L88
        L5c:
            r8 = r2
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.id.tv_fee
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L88
            com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementBinding r1 = new com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementBinding
            r4 = r10
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r10 = com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementBinding.component2
            int r10 = r10 + 31
            int r2 = r10 % 128
            com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementBinding.ShareDataUIState = r2
            int r10 = r10 % r0
            return r1
        L7b:
            int r0 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.id.ll_amount_container
            android.view.View r10 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r0)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r10 = 0
            r10.hashCode()
            throw r10
        L88:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementBinding");
    }
}
