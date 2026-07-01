package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

public final class ItemDetailFieldBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final ConstraintLayout component3;
    public final TextView tvFieldName;
    public final TextView tvFieldValue;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = ShareDataUIState + 89;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemDetailFieldBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.component3 = constraintLayout;
        this.tvFieldName = textView;
        this.tvFieldValue = textView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 81;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.component3;
        int i5 = i3 + 83;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static ItemDetailFieldBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemDetailFieldBinding itemDetailFieldBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 91;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
        return itemDetailFieldBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r4
  0x0021: PHI (r4v2 android.view.View) = (r4v1 android.view.View), (r4v6 android.view.View) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.history.databinding.ItemDetailFieldBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.history.databinding.ItemDetailFieldBinding.component2
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.history.databinding.ItemDetailFieldBinding.ShareDataUIState = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L19
            int r1 = com.huawei.digitalpayment.consumer.history.R.layout.item_detail_field
            r3 = 1
            android.view.View r4 = r4.inflate(r1, r5, r3)
            if (r6 == 0) goto L38
            goto L21
        L19:
            int r1 = com.huawei.digitalpayment.consumer.history.R.layout.item_detail_field
            android.view.View r4 = r4.inflate(r1, r5, r2)
            if (r6 == 0) goto L38
        L21:
            int r6 = com.huawei.digitalpayment.consumer.history.databinding.ItemDetailFieldBinding.component2
            int r6 = r6 + 113
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.history.databinding.ItemDetailFieldBinding.ShareDataUIState = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L30
            r5.addView(r4)
            goto L38
        L30:
            r5.addView(r4)
            r4 = 0
            r4.hashCode()
            throw r4
        L38:
            com.huawei.digitalpayment.consumer.history.databinding.ItemDetailFieldBinding r4 = bind(r4)
            int r5 = com.huawei.digitalpayment.consumer.history.databinding.ItemDetailFieldBinding.ShareDataUIState
            int r5 = r5 + 5
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.history.databinding.ItemDetailFieldBinding.component2 = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L4a
            r5 = 45
            int r5 = r5 / r2
        L4a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.history.databinding.ItemDetailFieldBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.history.databinding.ItemDetailFieldBinding");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r2
  0x0027: PHI (r2v3 android.widget.TextView) = (r2v2 android.widget.TextView), (r2v5 android.widget.TextView) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.history.databinding.ItemDetailFieldBinding bind(android.view.View r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.history.databinding.ItemDetailFieldBinding.ShareDataUIState
            int r1 = r1 + 21
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.history.databinding.ItemDetailFieldBinding.component2 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.tv_field_name
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 63
            int r3 = r3 / 0
            if (r2 == 0) goto L51
            goto L27
        L1d:
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.tv_field_name
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L51
        L27:
            int r1 = com.huawei.digitalpayment.consumer.history.databinding.ItemDetailFieldBinding.component2
            int r1 = r1 + 29
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.history.databinding.ItemDetailFieldBinding.ShareDataUIState = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L44
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.tv_field_value
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L51
            com.huawei.digitalpayment.consumer.history.databinding.ItemDetailFieldBinding r1 = new com.huawei.digitalpayment.consumer.history.databinding.ItemDetailFieldBinding
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r1.<init>(r4, r2, r0)
            return r1
        L44:
            int r0 = com.huawei.digitalpayment.consumer.history.R.id.tv_field_value
            android.view.View r4 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4 = 0
            r4.hashCode()
            throw r4
        L51:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.history.databinding.ItemDetailFieldBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.history.databinding.ItemDetailFieldBinding");
    }
}
