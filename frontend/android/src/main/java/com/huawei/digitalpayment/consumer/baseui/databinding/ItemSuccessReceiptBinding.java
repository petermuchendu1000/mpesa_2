package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.digitalpayment.consumer.baseui.R;

public final class ItemSuccessReceiptBinding implements ViewBinding {
    private static int component2 = 1;
    private static int copydefault;
    private final ConstraintLayout component3;
    public final TextView tvLabel;
    public final TextView tvValue;

    @Override
    public View getRoot() {
        ConstraintLayout root;
        int i = 2 % 2;
        int i2 = component2 + 9;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            root = getRoot();
            int i3 = 24 / 0;
        } else {
            root = getRoot();
        }
        int i4 = copydefault + 9;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ItemSuccessReceiptBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.component3 = constraintLayout;
        this.tvLabel = textView;
        this.tvValue = textView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 117;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.component3;
        int i5 = i2 + 111;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static ItemSuccessReceiptBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemSuccessReceiptBinding itemSuccessReceiptBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 17;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemSuccessReceiptBindingInflate;
    }

    public static ItemSuccessReceiptBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_success_receipt, viewGroup, false);
        if (z) {
            int i4 = component2 + 113;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r2
  0x0027: PHI (r2v3 android.widget.TextView) = (r2v2 android.widget.TextView), (r2v6 android.widget.TextView) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.baseui.databinding.ItemSuccessReceiptBinding bind(android.view.View r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baseui.databinding.ItemSuccessReceiptBinding.component2
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baseui.databinding.ItemSuccessReceiptBinding.copydefault = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            int r1 = com.huawei.digitalpayment.consumer.baseui.R.id.tv_label
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 70
            int r3 = r3 / 0
            if (r2 == 0) goto L42
            goto L27
        L1d:
            int r1 = com.huawei.digitalpayment.consumer.baseui.R.id.tv_label
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L42
        L27:
            int r1 = com.huawei.digitalpayment.consumer.baseui.R.id.tv_value
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L42
            com.huawei.digitalpayment.consumer.baseui.databinding.ItemSuccessReceiptBinding r1 = new com.huawei.digitalpayment.consumer.baseui.databinding.ItemSuccessReceiptBinding
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r1.<init>(r4, r2, r3)
            int r4 = com.huawei.digitalpayment.consumer.baseui.databinding.ItemSuccessReceiptBinding.component2
            int r4 = r4 + 13
            int r2 = r4 % 128
            com.huawei.digitalpayment.consumer.baseui.databinding.ItemSuccessReceiptBinding.copydefault = r2
            int r4 = r4 % r0
            return r1
        L42:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baseui.databinding.ItemSuccessReceiptBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.baseui.databinding.ItemSuccessReceiptBinding");
    }
}
