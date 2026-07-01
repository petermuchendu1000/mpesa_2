package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundTextView;

public final class TabPesaBinding implements ViewBinding {
    private static int component2 = 1;
    private static int component3;
    private final ConstraintLayout ShareDataUIState;
    public final RoundTextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component2 + 1;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return root;
        }
        throw null;
    }

    private TabPesaBinding(ConstraintLayout constraintLayout, RoundTextView roundTextView) {
        this.ShareDataUIState = constraintLayout;
        this.tvTitle = roundTextView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.ShareDataUIState;
        int i5 = i3 + 115;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return constraintLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TabPesaBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        TabPesaBinding tabPesaBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 51;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return tabPesaBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.TabPesaBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.TabPesaBinding.component2
            int r1 = r1 + 115
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.TabPesaBinding.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.tab_pesa
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.tab_pesa
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
        L20:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.TabPesaBinding.component2
            int r4 = r4 + 121
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.TabPesaBinding.component3 = r5
            int r4 = r4 % r0
        L2c:
            com.huawei.digitalpayment.consumer.sfc.databinding.TabPesaBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.TabPesaBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.TabPesaBinding");
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
    
        r1 = new com.huawei.digitalpayment.consumer.sfc.databinding.TabPesaBinding((androidx.constraintlayout.widget.ConstraintLayout) r4, r2);
        r4 = com.huawei.digitalpayment.consumer.sfc.databinding.TabPesaBinding.component2 + 97;
        com.huawei.digitalpayment.consumer.sfc.databinding.TabPesaBinding.component3 = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.TabPesaBinding bind(android.view.View r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.TabPesaBinding.component2
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.TabPesaBinding.component3 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_title
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            com.huawei.common.widget.round.RoundTextView r2 = (com.huawei.common.widget.round.RoundTextView) r2
            r3 = 60
            int r3 = r3 / 0
            if (r2 == 0) goto L3c
            goto L27
        L1d:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_title
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            com.huawei.common.widget.round.RoundTextView r2 = (com.huawei.common.widget.round.RoundTextView) r2
            if (r2 == 0) goto L3c
        L27:
            com.huawei.digitalpayment.consumer.sfc.databinding.TabPesaBinding r1 = new com.huawei.digitalpayment.consumer.sfc.databinding.TabPesaBinding
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r1.<init>(r4, r2)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.TabPesaBinding.component2
            int r4 = r4 + 97
            int r2 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.TabPesaBinding.component3 = r2
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
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.TabPesaBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.sfc.databinding.TabPesaBinding");
    }
}
