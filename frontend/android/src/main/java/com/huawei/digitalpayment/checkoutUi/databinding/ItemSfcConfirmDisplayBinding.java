package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.checkoutUi.R;

public final class ItemSfcConfirmDisplayBinding implements ViewBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    private final ConstraintLayout component1;
    public final TextView tvLabel;
    public final TextView tvValue;

    @Override
    public View getRoot() {
        ConstraintLayout root;
        int i = 2 % 2;
        int i2 = component3 + 101;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            root = getRoot();
            int i3 = 81 / 0;
        } else {
            root = getRoot();
        }
        int i4 = component3 + 35;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemSfcConfirmDisplayBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.component1 = constraintLayout;
        this.tvLabel = textView;
        this.tvValue = textView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayout = this.component1;
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        return constraintLayout;
    }

    public static ItemSfcConfirmDisplayBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemSfcConfirmDisplayBinding itemSfcConfirmDisplayBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 109;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return itemSfcConfirmDisplayBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkoutUi.databinding.ItemSfcConfirmDisplayBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.ItemSfcConfirmDisplayBinding.component3
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.ItemSfcConfirmDisplayBinding.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.checkoutUi.R.layout.item_sfc_confirm_display
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L35
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.checkoutUi.R.layout.item_sfc_confirm_display
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L35
        L20:
            int r5 = com.huawei.digitalpayment.checkoutUi.databinding.ItemSfcConfirmDisplayBinding.component3
            int r5 = r5 + 51
            int r1 = r5 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.ItemSfcConfirmDisplayBinding.component2 = r1
            int r5 = r5 % r0
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.checkoutUi.databinding.ItemSfcConfirmDisplayBinding.component3
            int r4 = r4 + 13
            int r5 = r4 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.ItemSfcConfirmDisplayBinding.component2 = r5
            int r4 = r4 % r0
        L35:
            com.huawei.digitalpayment.checkoutUi.databinding.ItemSfcConfirmDisplayBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutUi.databinding.ItemSfcConfirmDisplayBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.checkoutUi.databinding.ItemSfcConfirmDisplayBinding");
    }

    public static ItemSfcConfirmDisplayBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 47;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i3 = R.id.tv_label;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
        if (textView != null) {
            int i4 = component3 + 9;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            i3 = R.id.tv_value;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i3);
            if (textView2 != null) {
                ItemSfcConfirmDisplayBinding itemSfcConfirmDisplayBinding = new ItemSfcConfirmDisplayBinding((ConstraintLayout) view, textView, textView2);
                int i5 = component3 + 95;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return itemSfcConfirmDisplayBinding;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
    }
}
