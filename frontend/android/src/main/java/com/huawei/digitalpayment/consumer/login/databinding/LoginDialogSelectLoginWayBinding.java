package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundTextView;

public final class LoginDialogSelectLoginWayBinding implements ViewBinding {
    private static int component1 = 1;
    private static int component3;
    private final RoundConstraintLayout component2;
    public final RoundTextView line;
    public final RecyclerView rvList;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        RoundConstraintLayout root = getRoot();
        int i4 = component3 + 15;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private LoginDialogSelectLoginWayBinding(RoundConstraintLayout roundConstraintLayout, RoundTextView roundTextView, RecyclerView recyclerView, TextView textView) {
        this.component2 = roundConstraintLayout;
        this.line = roundTextView;
        this.rvList = recyclerView;
        this.tvTitle = textView;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        RoundConstraintLayout roundConstraintLayout = this.component2;
        int i5 = i3 + 47;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return roundConstraintLayout;
        }
        throw null;
    }

    public static LoginDialogSelectLoginWayBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 1;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LoginDialogSelectLoginWayBinding loginDialogSelectLoginWayBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 103;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return loginDialogSelectLoginWayBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r4
  0x0021: PHI (r4v4 android.view.View) = (r4v1 android.view.View), (r4v6 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.login.databinding.LoginDialogSelectLoginWayBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.login.databinding.LoginDialogSelectLoginWayBinding.component3
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.login.databinding.LoginDialogSelectLoginWayBinding.component1 = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.login.R.layout.login_dialog_select_login_way
            android.view.View r4 = r4.inflate(r1, r5, r2)
            if (r6 == r2) goto L21
            goto L3d
        L18:
            int r1 = com.huawei.digitalpayment.consumer.login.R.layout.login_dialog_select_login_way
            r3 = 0
            android.view.View r4 = r4.inflate(r1, r5, r3)
            if (r6 == 0) goto L3d
        L21:
            int r6 = com.huawei.digitalpayment.consumer.login.databinding.LoginDialogSelectLoginWayBinding.component1
            int r6 = r6 + r2
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.login.databinding.LoginDialogSelectLoginWayBinding.component3 = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L38
            r5.addView(r4)
            int r5 = com.huawei.digitalpayment.consumer.login.databinding.LoginDialogSelectLoginWayBinding.component1
            int r5 = r5 + 3
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.login.databinding.LoginDialogSelectLoginWayBinding.component3 = r6
            int r5 = r5 % r0
            goto L3d
        L38:
            r5.addView(r4)
            r4 = 0
            throw r4
        L3d:
            com.huawei.digitalpayment.consumer.login.databinding.LoginDialogSelectLoginWayBinding r4 = bind(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.databinding.LoginDialogSelectLoginWayBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.login.databinding.LoginDialogSelectLoginWayBinding");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r2
  0x0027: PHI (r2v3 com.huawei.common.widget.round.RoundTextView) = (r2v2 com.huawei.common.widget.round.RoundTextView), (r2v6 com.huawei.common.widget.round.RoundTextView) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.login.databinding.LoginDialogSelectLoginWayBinding bind(android.view.View r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.login.databinding.LoginDialogSelectLoginWayBinding.component1
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.login.databinding.LoginDialogSelectLoginWayBinding.component3 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            int r1 = com.huawei.digitalpayment.consumer.login.R.id.line
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            com.huawei.common.widget.round.RoundTextView r2 = (com.huawei.common.widget.round.RoundTextView) r2
            r3 = 16
            int r3 = r3 / 0
            if (r2 == 0) goto L61
            goto L27
        L1d:
            int r1 = com.huawei.digitalpayment.consumer.login.R.id.line
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            com.huawei.common.widget.round.RoundTextView r2 = (com.huawei.common.widget.round.RoundTextView) r2
            if (r2 == 0) goto L61
        L27:
            int r1 = com.huawei.digitalpayment.consumer.login.R.id.rv_list
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            if (r3 == 0) goto L61
            int r1 = com.huawei.digitalpayment.consumer.login.databinding.LoginDialogSelectLoginWayBinding.component1
            int r1 = r1 + 69
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.login.databinding.LoginDialogSelectLoginWayBinding.component3 = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L57
            int r1 = com.huawei.digitalpayment.consumer.login.R.id.tv_title
            android.view.View r4 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L61
            com.huawei.digitalpayment.consumer.login.databinding.LoginDialogSelectLoginWayBinding r1 = new com.huawei.digitalpayment.consumer.login.databinding.LoginDialogSelectLoginWayBinding
            com.huawei.common.widget.round.RoundConstraintLayout r5 = (com.huawei.common.widget.round.RoundConstraintLayout) r5
            r1.<init>(r5, r2, r3, r4)
            int r5 = com.huawei.digitalpayment.consumer.login.databinding.LoginDialogSelectLoginWayBinding.component3
            int r5 = r5 + 75
            int r2 = r5 % 128
            com.huawei.digitalpayment.consumer.login.databinding.LoginDialogSelectLoginWayBinding.component1 = r2
            int r5 = r5 % r0
            return r1
        L57:
            int r0 = com.huawei.digitalpayment.consumer.login.R.id.tv_title
            android.view.View r5 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r5 = 0
            throw r5
        L61:
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r5 = r5.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.databinding.LoginDialogSelectLoginWayBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.login.databinding.LoginDialogSelectLoginWayBinding");
    }
}
