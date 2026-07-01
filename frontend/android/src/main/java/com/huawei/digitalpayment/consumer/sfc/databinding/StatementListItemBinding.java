package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

public final class StatementListItemBinding implements ViewBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final ConstraintLayout ShareDataUIState;
    public final ImageView imgIcon;
    public final LinearLayout llDateBalance;
    public final LinearLayout llDetails;
    public final TextView tvBalanceDesc;
    public final TextView tvDate;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getRoot();
            obj.hashCode();
            throw null;
        }
        ConstraintLayout root = getRoot();
        int i3 = copydefault + 91;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return root;
        }
        obj.hashCode();
        throw null;
    }

    private StatementListItemBinding(ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.ShareDataUIState = constraintLayout;
        this.imgIcon = imageView;
        this.llDateBalance = linearLayout;
        this.llDetails = linearLayout2;
        this.tvBalanceDesc = textView;
        this.tvDate = textView2;
        this.tvTitle = textView3;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 27;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.ShareDataUIState;
        int i5 = i2 + 121;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static StatementListItemBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        StatementListItemBinding statementListItemBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 9;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return statementListItemBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.StatementListItemBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.StatementListItemBinding.component3
            int r1 = r1 + 39
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.StatementListItemBinding.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.statement_list_item
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L35
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.statement_list_item
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L35
        L20:
            int r5 = com.huawei.digitalpayment.consumer.sfc.databinding.StatementListItemBinding.component3
            int r5 = r5 + 49
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.StatementListItemBinding.copydefault = r1
            int r5 = r5 % r0
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.StatementListItemBinding.copydefault
            int r4 = r4 + 17
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.StatementListItemBinding.component3 = r5
            int r4 = r4 % r0
        L35:
            com.huawei.digitalpayment.consumer.sfc.databinding.StatementListItemBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.StatementListItemBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.StatementListItemBinding");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[PHI: r3
  0x005f: PHI (r3v6 android.widget.TextView) = (r3v5 android.widget.TextView), (r3v11 android.widget.TextView) binds: [B:18:0x005d, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.StatementListItemBinding bind(android.view.View r11) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.img_icon
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r1)
            r5 = r2
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L8d
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.StatementListItemBinding.component3
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.StatementListItemBinding.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L84
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.ll_date_balance
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r1)
            r6 = r3
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            if (r6 == 0) goto L8d
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.ll_details
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r1)
            r7 = r3
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            if (r7 == 0) goto L8d
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_balance_desc
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r1)
            r8 = r3
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L8d
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.StatementListItemBinding.copydefault
            int r1 = r1 + 59
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.StatementListItemBinding.component3 = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L55
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_date
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 39
            int r4 = r4 / 0
            if (r3 == 0) goto L8d
            goto L5f
        L55:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_date
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L8d
        L5f:
            r9 = r3
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_title
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r1)
            r10 = r3
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L8d
            com.huawei.digitalpayment.consumer.sfc.databinding.StatementListItemBinding r1 = new com.huawei.digitalpayment.consumer.sfc.databinding.StatementListItemBinding
            r4 = r11
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            int r11 = com.huawei.digitalpayment.consumer.sfc.databinding.StatementListItemBinding.copydefault
            int r11 = r11 + 87
            int r3 = r11 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.StatementListItemBinding.component3 = r3
            int r11 = r11 % r0
            if (r11 != 0) goto L80
            return r1
        L80:
            r2.hashCode()
            throw r2
        L84:
            int r0 = com.huawei.digitalpayment.consumer.sfc.R.id.ll_date_balance
            android.view.View r11 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r0)
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            throw r2
        L8d:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.StatementListItemBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.sfc.databinding.StatementListItemBinding");
    }
}
