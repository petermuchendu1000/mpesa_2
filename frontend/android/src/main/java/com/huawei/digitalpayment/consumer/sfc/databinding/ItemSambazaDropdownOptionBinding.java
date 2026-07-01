package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemSambazaDropdownOptionBinding implements ViewBinding {
    private static int component1 = 1;
    private static int component3;
    private final LinearLayout copydefault;
    public final TextView tvOption;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return getRoot();
        }
        getRoot();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ItemSambazaDropdownOptionBinding(LinearLayout linearLayout, TextView textView) {
        this.copydefault = linearLayout;
        this.tvOption = textView;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ItemSambazaDropdownOptionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemSambazaDropdownOptionBinding itemSambazaDropdownOptionBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 33;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return itemSambazaDropdownOptionBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r4
  0x0021: PHI (r4v2 android.view.View) = (r4v1 android.view.View), (r4v6 android.view.View) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemSambazaDropdownOptionBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemSambazaDropdownOptionBinding.component3
            int r1 = r1 + 81
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSambazaDropdownOptionBinding.component1 = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L19
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_sambaza_dropdown_option
            android.view.View r4 = r4.inflate(r1, r5, r3)
            if (r6 == 0) goto L34
            goto L21
        L19:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_sambaza_dropdown_option
            android.view.View r4 = r4.inflate(r1, r5, r2)
            if (r6 == 0) goto L34
        L21:
            int r6 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemSambazaDropdownOptionBinding.component3
            int r6 = r6 + r3
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSambazaDropdownOptionBinding.component1 = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L31
            r5.addView(r4)
            int r5 = r0 / 0
            goto L34
        L31:
            r5.addView(r4)
        L34:
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSambazaDropdownOptionBinding r4 = bind(r4)
            int r5 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemSambazaDropdownOptionBinding.component1
            int r5 = r5 + 35
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSambazaDropdownOptionBinding.component3 = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L44
            return r4
        L44:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemSambazaDropdownOptionBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.ItemSambazaDropdownOptionBinding");
    }

    public static ItemSambazaDropdownOptionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 59;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.id.tvOption;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
            if (textView != null) {
                ItemSambazaDropdownOptionBinding itemSambazaDropdownOptionBinding = new ItemSambazaDropdownOptionBinding((LinearLayout) view, textView);
                int i4 = component3 + 81;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return itemSambazaDropdownOptionBinding;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        throw null;
    }
}
