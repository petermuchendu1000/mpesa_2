package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemPayBillCategoryBinding implements ViewBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    private final ConstraintLayout component3;
    public final TextView tvCategory;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 13;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component1 + 49;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemPayBillCategoryBinding(ConstraintLayout constraintLayout, TextView textView) {
        this.component3 = constraintLayout;
        this.tvCategory = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 109;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.component3;
        int i5 = i3 + 73;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static ItemPayBillCategoryBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 69;
        component2 = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
  0x0021: PHI (r3v4 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemPayBillCategoryBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemPayBillCategoryBinding.component2
            int r1 = r1 + 53
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemPayBillCategoryBinding.component1 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_pay_bill_category
            r2 = 1
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == r2) goto L21
            goto L2d
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_pay_bill_category
            r2 = 0
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2d
        L21:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemPayBillCategoryBinding.component2
            int r4 = r4 + 75
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemPayBillCategoryBinding.component1 = r5
            int r4 = r4 % r0
        L2d:
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemPayBillCategoryBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemPayBillCategoryBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.ItemPayBillCategoryBinding");
    }

    public static ItemPayBillCategoryBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 39;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.tvCategory;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
        if (textView != null) {
            ItemPayBillCategoryBinding itemPayBillCategoryBinding = new ItemPayBillCategoryBinding((ConstraintLayout) view, textView);
            int i5 = component1 + 115;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return itemPayBillCategoryBinding;
            }
            throw null;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
