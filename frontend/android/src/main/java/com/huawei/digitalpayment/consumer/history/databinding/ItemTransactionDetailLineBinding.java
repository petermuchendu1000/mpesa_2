package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import androidx.viewbinding.ViewBinding;

public final class ItemTransactionDetailLineBinding implements ViewBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final View component3;

    private ItemTransactionDetailLineBinding(View view) {
        this.component3 = view;
    }

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 117;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        throw null;
    }

    public static ItemTransactionDetailLineBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ItemTransactionDetailLineBinding itemTransactionDetailLineBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 43;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemTransactionDetailLineBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
  0x0021: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionDetailLineBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionDetailLineBinding.copydefault
            int r1 = r1 + 45
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionDetailLineBinding.component2 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.history.R.layout.item_transaction_detail_line
            r2 = 1
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L24
            goto L21
        L18:
            int r1 = com.huawei.digitalpayment.consumer.history.R.layout.item_transaction_detail_line
            r2 = 0
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L24
        L21:
            r4.addView(r3)
        L24:
            com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionDetailLineBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionDetailLineBinding.copydefault
            int r4 = r4 + 81
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionDetailLineBinding.component2 = r5
            int r4 = r4 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionDetailLineBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionDetailLineBinding");
    }

    public static ItemTransactionDetailLineBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 109;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ItemTransactionDetailLineBinding itemTransactionDetailLineBinding = new ItemTransactionDetailLineBinding(view);
        int i3 = copydefault + 109;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return itemTransactionDetailLineBinding;
    }
}
