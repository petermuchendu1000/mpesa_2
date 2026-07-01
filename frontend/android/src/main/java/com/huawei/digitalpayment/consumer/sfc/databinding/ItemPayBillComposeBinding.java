package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;

public final class ItemPayBillComposeBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final ComposeView component2;
    public final ComposeView composeBillItem;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ComposeView root = getRoot();
        int i4 = ShareDataUIState + 119;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemPayBillComposeBinding(ComposeView composeView, ComposeView composeView2) {
        this.component2 = composeView;
        this.composeBillItem = composeView2;
    }

    @Override
    public ComposeView getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        ComposeView composeView = this.component2;
        int i5 = i3 + 13;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
        return composeView;
    }

    public static ItemPayBillComposeBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component3 = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemPayBillComposeBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemPayBillComposeBinding.ShareDataUIState
            int r1 = r1 + 103
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemPayBillComposeBinding.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_pay_bill_compose
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_pay_bill_compose
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
        L20:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemPayBillComposeBinding.component3
            int r4 = r4 + 69
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemPayBillComposeBinding.ShareDataUIState = r5
            int r4 = r4 % r0
        L2c:
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemPayBillComposeBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemPayBillComposeBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.ItemPayBillComposeBinding");
    }

    public static ItemPayBillComposeBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 105;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ComposeView composeView = (ComposeView) view;
        ItemPayBillComposeBinding itemPayBillComposeBinding = new ItemPayBillComposeBinding(composeView, composeView);
        int i3 = ShareDataUIState + 73;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return itemPayBillComposeBinding;
    }
}
