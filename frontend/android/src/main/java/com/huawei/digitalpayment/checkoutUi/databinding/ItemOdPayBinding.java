package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.checkoutUi.R;

public final class ItemOdPayBinding implements ViewBinding {
    private static int component3 = 1;
    private static int copydefault;
    private final ConstraintLayout ShareDataUIState;
    public final TextView tvName;
    public final TextView tvValue;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = copydefault + 23;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemOdPayBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.ShareDataUIState = constraintLayout;
        this.tvName = textView;
        this.tvValue = textView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        ConstraintLayout constraintLayout;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 35;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            constraintLayout = this.ShareDataUIState;
            int i4 = 33 / 0;
        } else {
            constraintLayout = this.ShareDataUIState;
        }
        int i5 = i2 + 27;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static ItemOdPayBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemOdPayBinding itemOdPayBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 29;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemOdPayBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
  0x0021: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v6 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkoutUi.databinding.ItemOdPayBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.ItemOdPayBinding.component3
            int r1 = r1 + 93
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.ItemOdPayBinding.copydefault = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.checkoutUi.R.layout.item_od_pay
            r2 = 1
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L35
            goto L21
        L18:
            int r1 = com.huawei.digitalpayment.checkoutUi.R.layout.item_od_pay
            r2 = 0
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L35
        L21:
            int r5 = com.huawei.digitalpayment.checkoutUi.databinding.ItemOdPayBinding.component3
            int r5 = r5 + 95
            int r1 = r5 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.ItemOdPayBinding.copydefault = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L30
            r4.addView(r3)
            goto L35
        L30:
            r4.addView(r3)
            r3 = 0
            throw r3
        L35:
            com.huawei.digitalpayment.checkoutUi.databinding.ItemOdPayBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutUi.databinding.ItemOdPayBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.checkoutUi.databinding.ItemOdPayBinding");
    }

    public static ItemOdPayBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.tv_name;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
        if (textView != null) {
            int i5 = copydefault + 19;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i4 = R.id.tv_value;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i4);
            if (textView2 != null) {
                ItemOdPayBinding itemOdPayBinding = new ItemOdPayBinding((ConstraintLayout) view, textView, textView2);
                int i6 = copydefault + 11;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return itemOdPayBinding;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
