package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

public final class ItemMpesaStatementBinding implements ViewBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    private final ConstraintLayout ShareDataUIState;
    public final ComposeView flAvatarContainer;
    public final LinearLayout llAmountContainer;
    public final LinearLayout llNameContainer;
    public final TextView tvAmount;
    public final TextView tvDate;
    public final TextView tvName;
    public final TextView tvNumber;

    @Override
    public View getRoot() {
        ConstraintLayout root;
        int i = 2 % 2;
        int i2 = component3 + 125;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            root = getRoot();
            int i3 = 78 / 0;
        } else {
            root = getRoot();
        }
        int i4 = component3 + 13;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemMpesaStatementBinding(ConstraintLayout constraintLayout, ComposeView composeView, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.ShareDataUIState = constraintLayout;
        this.flAvatarContainer = composeView;
        this.llAmountContainer = linearLayout;
        this.llNameContainer = linearLayout2;
        this.tvAmount = textView;
        this.tvDate = textView2;
        this.tvName = textView3;
        this.tvNumber = textView4;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.ShareDataUIState;
        int i5 = i3 + 11;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return constraintLayout;
        }
        throw null;
    }

    public static ItemMpesaStatementBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemMpesaStatementBinding itemMpesaStatementBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 105;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemMpesaStatementBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[PHI: r4
  0x0023: PHI (r4v2 android.view.View) = (r4v1 android.view.View), (r4v5 android.view.View) binds: [B:8:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding.component2
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding.component3 = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_mpesa_statement
            android.view.View r4 = r4.inflate(r1, r5, r2)
            if (r6 == 0) goto L26
            goto L23
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_mpesa_statement
            r3 = 0
            android.view.View r4 = r4.inflate(r1, r5, r3)
            r6 = r6 ^ r2
            if (r6 == 0) goto L23
            goto L26
        L23:
            r5.addView(r4)
        L26:
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding r4 = bind(r4)
            int r5 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding.component2
            int r5 = r5 + 61
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding.component3 = r6
            int r5 = r5 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        return new com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding((androidx.constraintlayout.widget.ConstraintLayout) r12, r5, r6, r7, r8, r9, r10, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[PHI: r2
  0x0051: PHI (r2v7 android.widget.TextView) = (r2v6 android.widget.TextView), (r2v15 android.widget.TextView) binds: [B:14:0x004f, B:11:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding bind(android.view.View r12) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding.component3
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding.component2 = r2
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.fl_avatar_container
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r5 = r2
            androidx.compose.ui.platform.ComposeView r5 = (androidx.compose.ui.platform.ComposeView) r5
            if (r5 == 0) goto Lb0
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.ll_amount_container
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r6 = r2
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            if (r6 == 0) goto Lb0
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.ll_name_container
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r7 = r2
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            if (r7 == 0) goto Lb0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding.component3
            int r1 = r1 + 117
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding.component2 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L47
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_amount
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 37
            int r3 = r3 / 0
            if (r2 == 0) goto Lb0
            goto L51
        L47:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_amount
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto Lb0
        L51:
            r8 = r2
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_date
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto Lb0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding.component2
            int r1 = r1 + 57
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding.component3 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto La3
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_name
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto Lb0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding.component3
            int r1 = r1 + 89
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding.component2 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L8e
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_number
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2 = 44
            int r2 = r2 / 0
            if (r0 == 0) goto Lb0
        L8c:
            r11 = r0
            goto L99
        L8e:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_number
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto Lb0
            goto L8c
        L99:
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding r0 = new com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding
            r4 = r12
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        La3:
            int r0 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_name
            android.view.View r12 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r0)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12 = 0
            r12.hashCode()
            throw r12
        Lb0:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementBinding");
    }
}
