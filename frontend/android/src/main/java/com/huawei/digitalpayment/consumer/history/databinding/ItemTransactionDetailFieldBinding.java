package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView;
import com.huawei.digitalpayment.consumer.history.R;

public final class ItemTransactionDetailFieldBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final ConstraintLayout component2;
    public final BaseTextView tvName;
    public final BaseTextView tvValue;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return getRoot();
        }
        getRoot();
        throw null;
    }

    private ItemTransactionDetailFieldBinding(ConstraintLayout constraintLayout, BaseTextView baseTextView, BaseTextView baseTextView2) {
        this.component2 = constraintLayout;
        this.tvName = baseTextView;
        this.tvValue = baseTextView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.component2;
        int i5 = i3 + 9;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
        return constraintLayout;
    }

    public static ItemTransactionDetailFieldBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemTransactionDetailFieldBinding itemTransactionDetailFieldBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 65;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemTransactionDetailFieldBindingInflate;
    }

    public static ItemTransactionDetailFieldBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_transaction_detail_field, viewGroup, false);
        if (z) {
            int i2 = copydefault + 3;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
            int i4 = ShareDataUIState + 87;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
        return bind(viewInflate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r3 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r1 = new com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionDetailFieldBinding((androidx.constraintlayout.widget.ConstraintLayout) r5, r2, r3);
        r5 = com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionDetailFieldBinding.ShareDataUIState + 103;
        com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionDetailFieldBinding.copydefault = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r3 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionDetailFieldBinding bind(android.view.View r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.tvName
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView r2 = (com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView) r2
            if (r2 == 0) goto L42
            int r1 = com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionDetailFieldBinding.copydefault
            int r1 = r1 + 103
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionDetailFieldBinding.ShareDataUIState = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L27
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.tvValue
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView r3 = (com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView) r3
            r4 = 82
            int r4 = r4 / 0
            if (r3 == 0) goto L42
            goto L31
        L27:
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.tvValue
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView r3 = (com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView) r3
            if (r3 == 0) goto L42
        L31:
            com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionDetailFieldBinding r1 = new com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionDetailFieldBinding
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r1.<init>(r5, r2, r3)
            int r5 = com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionDetailFieldBinding.ShareDataUIState
            int r5 = r5 + 103
            int r2 = r5 % 128
            com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionDetailFieldBinding.copydefault = r2
            int r5 = r5 % r0
            return r1
        L42:
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r5 = r5.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionDetailFieldBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionDetailFieldBinding");
    }
}
