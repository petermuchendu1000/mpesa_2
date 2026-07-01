package com.huawei.digitalpayment.checkoutModule.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.checkoutModule.R;

public final class DialogInsufficientBalanceBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final RoundConstraintLayout component3;
    public final View line;
    public final LinearLayout llBtn;
    public final TextView tvAlertContent;
    public final TextView tvDialogCancel;
    public final TextView tvDialogCashIn;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return getRoot();
        }
        getRoot();
        throw null;
    }

    private DialogInsufficientBalanceBinding(RoundConstraintLayout roundConstraintLayout, View view, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.component3 = roundConstraintLayout;
        this.line = view;
        this.llBtn = linearLayout;
        this.tvAlertContent = textView;
        this.tvDialogCancel = textView2;
        this.tvDialogCashIn = textView3;
        this.tvTitle = textView4;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        RoundConstraintLayout roundConstraintLayout = this.component3;
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        return roundConstraintLayout;
    }

    public static DialogInsufficientBalanceBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 111;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DialogInsufficientBalanceBinding dialogInsufficientBalanceBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 71;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return dialogInsufficientBalanceBindingInflate;
    }

    public static DialogInsufficientBalanceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.dialog_insufficient_balance, viewGroup, false);
        if (!(!z)) {
            viewGroup.addView(viewInflate);
        }
        DialogInsufficientBalanceBinding dialogInsufficientBalanceBindingBind = bind(viewInflate);
        int i4 = component1 + 81;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return dialogInsufficientBalanceBindingBind;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043 A[PHI: r0
  0x0043: PHI (r0v4 android.widget.TextView) = (r0v3 android.widget.TextView), (r0v10 android.widget.TextView) binds: [B:12:0x0041, B:9:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkoutModule.databinding.DialogInsufficientBalanceBinding bind(android.view.View r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkoutModule.R.id.line
            android.view.View r4 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            if (r4 == 0) goto L6f
            int r1 = com.huawei.digitalpayment.checkoutModule.databinding.DialogInsufficientBalanceBinding.component1
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkoutModule.databinding.DialogInsufficientBalanceBinding.ShareDataUIState = r2
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.checkoutModule.R.id.ll_btn
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            r5 = r2
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L6f
            int r1 = com.huawei.digitalpayment.checkoutModule.databinding.DialogInsufficientBalanceBinding.ShareDataUIState
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkoutModule.databinding.DialogInsufficientBalanceBinding.component1 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L39
            int r1 = com.huawei.digitalpayment.checkoutModule.R.id.tv_alert_content
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2 = 64
            int r2 = r2 / 0
            if (r0 == 0) goto L6f
            goto L43
        L39:
            int r1 = com.huawei.digitalpayment.checkoutModule.R.id.tv_alert_content
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L6f
        L43:
            r6 = r0
            int r1 = com.huawei.digitalpayment.checkoutModule.R.id.tv_dialog_cancel
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L6f
            int r1 = com.huawei.digitalpayment.checkoutModule.R.id.tv_dialog_cash_in
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L6f
            int r1 = com.huawei.digitalpayment.checkoutModule.R.id.tv_title
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L6f
            com.huawei.digitalpayment.checkoutModule.databinding.DialogInsufficientBalanceBinding r0 = new com.huawei.digitalpayment.checkoutModule.databinding.DialogInsufficientBalanceBinding
            r3 = r10
            com.huawei.common.widget.round.RoundConstraintLayout r3 = (com.huawei.common.widget.round.RoundConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L6f:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutModule.databinding.DialogInsufficientBalanceBinding.bind(android.view.View):com.huawei.digitalpayment.checkoutModule.databinding.DialogInsufficientBalanceBinding");
    }
}
