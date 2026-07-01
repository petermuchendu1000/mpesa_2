package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemMyRequestCategoryBinding implements ViewBinding {
    private static int component1 = 1;
    private static int component2;
    private final ConstraintLayout copydefault;
    public final TextView tvCategory;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 85;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component2 + 67;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemMyRequestCategoryBinding(ConstraintLayout constraintLayout, TextView textView) {
        this.copydefault = constraintLayout;
        this.tvCategory = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 9;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.copydefault;
        int i5 = i2 + 103;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return constraintLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ItemMyRequestCategoryBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemMyRequestCategoryBinding itemMyRequestCategoryBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 69;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemMyRequestCategoryBindingInflate;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[PHI: r3
  0x0022: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v6 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemMyRequestCategoryBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemMyRequestCategoryBinding.component1
            int r1 = r1 + 3
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemMyRequestCategoryBinding.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_my_request_category
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2e
            goto L22
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_my_request_category
            android.view.View r3 = r3.inflate(r1, r4, r2)
            r1 = 1
            if (r5 == r1) goto L22
            goto L2e
        L22:
            int r5 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemMyRequestCategoryBinding.component1
            int r5 = r5 + 103
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemMyRequestCategoryBinding.component2 = r1
            int r5 = r5 % r0
            r4.addView(r3)
        L2e:
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemMyRequestCategoryBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemMyRequestCategoryBinding.component2
            int r4 = r4 + 101
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemMyRequestCategoryBinding.component1 = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L3e
            return r3
        L3e:
            r3 = 0
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemMyRequestCategoryBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.ItemMyRequestCategoryBinding");
    }

    public static ItemMyRequestCategoryBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.tvCategory;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
        if (textView != null) {
            ItemMyRequestCategoryBinding itemMyRequestCategoryBinding = new ItemMyRequestCategoryBinding((ConstraintLayout) view, textView);
            int i5 = component2 + 71;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return itemMyRequestCategoryBinding;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
