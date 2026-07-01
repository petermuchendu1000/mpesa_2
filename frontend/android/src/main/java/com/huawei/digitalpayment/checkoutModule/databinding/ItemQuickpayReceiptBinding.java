package com.huawei.digitalpayment.checkoutModule.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.checkoutModule.R;

public final class ItemQuickpayReceiptBinding implements ViewBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final LinearLayout component1;
    public final TextView tvLabel;
    public final TextView tvValue;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        int i4 = copydefault + 29;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemQuickpayReceiptBinding(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.component1 = linearLayout;
        this.tvLabel = textView;
        this.tvValue = textView2;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 33;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        LinearLayout linearLayout = this.component1;
        int i5 = i2 + 17;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return linearLayout;
    }

    public static ItemQuickpayReceiptBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemQuickpayReceiptBinding itemQuickpayReceiptBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 103;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return itemQuickpayReceiptBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r3
  0x0022: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x0020, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkoutModule.databinding.ItemQuickpayReceiptBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkoutModule.databinding.ItemQuickpayReceiptBinding.component3
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkoutModule.databinding.ItemQuickpayReceiptBinding.copydefault = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L19
            int r1 = com.huawei.digitalpayment.checkoutModule.R.layout.item_quickpay_receipt
            r2 = 1
            android.view.View r3 = r3.inflate(r1, r4, r2)
            r5 = r5 ^ r2
            if (r5 == r2) goto L25
            goto L22
        L19:
            int r1 = com.huawei.digitalpayment.checkoutModule.R.layout.item_quickpay_receipt
            r2 = 0
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L25
        L22:
            r4.addView(r3)
        L25:
            com.huawei.digitalpayment.checkoutModule.databinding.ItemQuickpayReceiptBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.checkoutModule.databinding.ItemQuickpayReceiptBinding.copydefault
            int r4 = r4 + 15
            int r5 = r4 % 128
            com.huawei.digitalpayment.checkoutModule.databinding.ItemQuickpayReceiptBinding.component3 = r5
            int r4 = r4 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutModule.databinding.ItemQuickpayReceiptBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.checkoutModule.databinding.ItemQuickpayReceiptBinding");
    }

    public static ItemQuickpayReceiptBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.tv_label;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
        if (textView != null) {
            int i3 = component3 + 1;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.tv_value;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
            if (textView2 != null) {
                ItemQuickpayReceiptBinding itemQuickpayReceiptBinding = new ItemQuickpayReceiptBinding((LinearLayout) view, textView, textView2);
                int i5 = copydefault + 87;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 53 / 0;
                }
                return itemQuickpayReceiptBinding;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
