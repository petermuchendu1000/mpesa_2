package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;

public final class ItemSpinnerBinding implements ViewBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final TextView component1;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        TextView root = getRoot();
        int i4 = copydefault + 57;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemSpinnerBinding(TextView textView) {
        this.component1 = textView;
    }

    @Override
    public TextView getRoot() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 57;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        TextView textView = this.component1;
        int i4 = i2 + 49;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return textView;
        }
        throw null;
    }

    public static ItemSpinnerBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemSpinnerBinding itemSpinnerBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 59;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemSpinnerBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.login.databinding.ItemSpinnerBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.login.databinding.ItemSpinnerBinding.component3
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.login.databinding.ItemSpinnerBinding.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.login.R.layout.item_spinner
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.login.R.layout.item_spinner
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
        L20:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.login.databinding.ItemSpinnerBinding.component3
            int r4 = r4 + 73
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.login.databinding.ItemSpinnerBinding.copydefault = r5
            int r4 = r4 % r0
        L2c:
            com.huawei.digitalpayment.consumer.login.databinding.ItemSpinnerBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.login.databinding.ItemSpinnerBinding.copydefault
            int r4 = r4 + 47
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.login.databinding.ItemSpinnerBinding.component3 = r5
            int r4 = r4 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.databinding.ItemSpinnerBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.login.databinding.ItemSpinnerBinding");
    }

    public static ItemSpinnerBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ItemSpinnerBinding itemSpinnerBinding = new ItemSpinnerBinding((TextView) view);
        int i3 = copydefault + 29;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return itemSpinnerBinding;
    }
}
