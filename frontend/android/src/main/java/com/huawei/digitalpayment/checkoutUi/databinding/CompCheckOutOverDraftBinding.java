package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.digitalpayment.checkoutUi.R;

public final class CompCheckOutOverDraftBinding implements ViewBinding {
    private static int component3 = 1;
    private static int copydefault;
    private final ConstraintLayout ShareDataUIState;
    public final ImageView ivWallet;
    public final TextView tvBalance;
    public final TextView tvBalanceAmount;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component3 + 27;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return root;
        }
        throw null;
    }

    private CompCheckOutOverDraftBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.ShareDataUIState = constraintLayout;
        this.ivWallet = imageView;
        this.tvBalance = textView;
        this.tvBalanceAmount = textView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        ConstraintLayout constraintLayout;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 71;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            constraintLayout = this.ShareDataUIState;
            int i4 = 67 / 0;
        } else {
            constraintLayout = this.ShareDataUIState;
        }
        int i5 = i2 + 111;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static CompCheckOutOverDraftBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        CompCheckOutOverDraftBinding compCheckOutOverDraftBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 59;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return compCheckOutOverDraftBindingInflate;
    }

    public static CompCheckOutOverDraftBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.comp_check_out_over_draft, viewGroup, false);
        if (z) {
            int i4 = copydefault + 51;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                viewGroup.addView(viewInflate);
                int i5 = 13 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
        }
        CompCheckOutOverDraftBinding compCheckOutOverDraftBindingBind = bind(viewInflate);
        int i6 = copydefault + 95;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            return compCheckOutOverDraftBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d A[PHI: r4
  0x003d: PHI (r4v3 android.widget.TextView) = (r4v2 android.widget.TextView), (r4v5 android.widget.TextView) binds: [B:12:0x003b, B:9:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkoutUi.databinding.CompCheckOutOverDraftBinding bind(android.view.View r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.CompCheckOutOverDraftBinding.component3
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.CompCheckOutOverDraftBinding.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L6f
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.iv_wallet
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r6, r1)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r3 == 0) goto L5b
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.CompCheckOutOverDraftBinding.component3
            int r1 = r1 + 123
            int r4 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.CompCheckOutOverDraftBinding.copydefault = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L33
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.tv_balance
            android.view.View r4 = androidx.viewbinding.ViewBindings.findChildViewById(r6, r1)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 70
            int r5 = r5 / 0
            if (r4 == 0) goto L5b
            goto L3d
        L33:
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.tv_balance
            android.view.View r4 = androidx.viewbinding.ViewBindings.findChildViewById(r6, r1)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L5b
        L3d:
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.tv_balance_amount
            android.view.View r5 = androidx.viewbinding.ViewBindings.findChildViewById(r6, r1)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L5b
            com.huawei.digitalpayment.checkoutUi.databinding.CompCheckOutOverDraftBinding r1 = new com.huawei.digitalpayment.checkoutUi.databinding.CompCheckOutOverDraftBinding
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            r1.<init>(r6, r3, r4, r5)
            int r6 = com.huawei.digitalpayment.checkoutUi.databinding.CompCheckOutOverDraftBinding.copydefault
            int r6 = r6 + 71
            int r3 = r6 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.CompCheckOutOverDraftBinding.component3 = r3
            int r6 = r6 % r0
            if (r6 == 0) goto L5a
            return r1
        L5a:
            throw r2
        L5b:
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String r6 = r6.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r6 = r1.concat(r6)
            r0.<init>(r6)
            throw r0
        L6f:
            int r0 = com.huawei.digitalpayment.checkoutUi.R.id.iv_wallet
            android.view.View r6 = androidx.viewbinding.ViewBindings.findChildViewById(r6, r0)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutUi.databinding.CompCheckOutOverDraftBinding.bind(android.view.View):com.huawei.digitalpayment.checkoutUi.databinding.CompCheckOutOverDraftBinding");
    }
}
