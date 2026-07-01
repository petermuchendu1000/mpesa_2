package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemTopUpAmountBinding implements ViewBinding {
    private static int component1 = 1;
    private static int copydefault;
    private final ConstraintLayout component2;
    public final RoundTextView tvAmount;

    @Override
    public View getRoot() {
        ConstraintLayout root;
        int i = 2 % 2;
        int i2 = component1 + 87;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            root = getRoot();
            int i3 = 2 / 0;
        } else {
            root = getRoot();
        }
        int i4 = copydefault + 103;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemTopUpAmountBinding(ConstraintLayout constraintLayout, RoundTextView roundTextView) {
        this.component2 = constraintLayout;
        this.tvAmount = roundTextView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayout = this.component2;
        int i4 = i3 + 31;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return constraintLayout;
    }

    public static ItemTopUpAmountBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ItemTopUpAmountBinding itemTopUpAmountBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 119;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemTopUpAmountBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    public static ItemTopUpAmountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_top_up_amount, viewGroup, false);
        if (z) {
            int i2 = copydefault + 45;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
            int i4 = component1 + 87;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 4;
            }
        }
        return bind(viewInflate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(r4.getResources().getResourceName(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = new com.huawei.digitalpayment.consumer.sfc.databinding.ItemTopUpAmountBinding((androidx.constraintlayout.widget.ConstraintLayout) r4, r2);
        r4 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemTopUpAmountBinding.component1 + 45;
        com.huawei.digitalpayment.consumer.sfc.databinding.ItemTopUpAmountBinding.copydefault = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemTopUpAmountBinding bind(android.view.View r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemTopUpAmountBinding.component1
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemTopUpAmountBinding.copydefault = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_amount
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            com.huawei.common.widget.round.RoundTextView r2 = (com.huawei.common.widget.round.RoundTextView) r2
            r3 = 22
            int r3 = r3 / 0
            if (r2 == 0) goto L3c
            goto L27
        L1d:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_amount
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            com.huawei.common.widget.round.RoundTextView r2 = (com.huawei.common.widget.round.RoundTextView) r2
            if (r2 == 0) goto L3c
        L27:
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemTopUpAmountBinding r1 = new com.huawei.digitalpayment.consumer.sfc.databinding.ItemTopUpAmountBinding
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r1.<init>(r4, r2)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemTopUpAmountBinding.component1
            int r4 = r4 + 45
            int r2 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemTopUpAmountBinding.copydefault = r2
            int r4 = r4 % r0
            if (r4 != 0) goto L3a
            return r1
        L3a:
            r4 = 0
            throw r4
        L3c:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemTopUpAmountBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.sfc.databinding.ItemTopUpAmountBinding");
    }
}
