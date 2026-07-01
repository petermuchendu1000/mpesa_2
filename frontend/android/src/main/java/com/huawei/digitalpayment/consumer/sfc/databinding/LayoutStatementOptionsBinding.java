package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class LayoutStatementOptionsBinding implements ViewBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    private final ConstraintLayout copydefault;
    public final RoundImageView ivExportStatement;
    public final RoundImageView ivStatementCancel;
    public final RoundImageView ivStatementViewMySpend;
    public final RoundImageView ivVerifyStatement;
    public final TextView tvExportStatement;
    public final TextView tvVerifyStatement;
    public final TextView tvViewMySpend;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component2 + 39;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private LayoutStatementOptionsBinding(ConstraintLayout constraintLayout, RoundImageView roundImageView, RoundImageView roundImageView2, RoundImageView roundImageView3, RoundImageView roundImageView4, TextView textView, TextView textView2, TextView textView3) {
        this.copydefault = constraintLayout;
        this.ivExportStatement = roundImageView;
        this.ivStatementCancel = roundImageView2;
        this.ivStatementViewMySpend = roundImageView3;
        this.ivVerifyStatement = roundImageView4;
        this.tvExportStatement = textView;
        this.tvVerifyStatement = textView2;
        this.tvViewMySpend = textView3;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 29;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayout = this.copydefault;
        int i4 = i3 + 41;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return constraintLayout;
        }
        throw null;
    }

    public static LayoutStatementOptionsBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LayoutStatementOptionsBinding layoutStatementOptionsBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 77;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return layoutStatementOptionsBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v6 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.LayoutStatementOptionsBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.LayoutStatementOptionsBinding.component1
            int r1 = r1 + 23
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.LayoutStatementOptionsBinding.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.layout_statement_options
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L23
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.layout_statement_options
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L23
        L20:
            r4.addView(r3)
        L23:
            com.huawei.digitalpayment.consumer.sfc.databinding.LayoutStatementOptionsBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.LayoutStatementOptionsBinding.component2
            int r4 = r4 + 17
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.LayoutStatementOptionsBinding.component1 = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L33
            return r3
        L33:
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.LayoutStatementOptionsBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.LayoutStatementOptionsBinding");
    }

    public static LayoutStatementOptionsBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.iv_export_statement;
        RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i2);
        if (roundImageView != null) {
            i2 = R.id.iv_statement_cancel;
            RoundImageView roundImageView2 = (RoundImageView) ViewBindings.findChildViewById(view, i2);
            if (roundImageView2 != null) {
                i2 = R.id.iv_statement_view_my_spend;
                RoundImageView roundImageView3 = (RoundImageView) ViewBindings.findChildViewById(view, i2);
                if (roundImageView3 != null) {
                    i2 = R.id.iv_verify_statement;
                    RoundImageView roundImageView4 = (RoundImageView) ViewBindings.findChildViewById(view, i2);
                    if (roundImageView4 != null) {
                        i2 = R.id.tv_export_statement;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                        if (textView != null) {
                            int i3 = component2 + 123;
                            component1 = i3 % 128;
                            if (i3 % 2 != 0) {
                                throw null;
                            }
                            i2 = R.id.tv_verify_statement;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
                            if (textView2 != null) {
                                i2 = R.id.tv_view_my_spend;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i2);
                                if (textView3 != null) {
                                    LayoutStatementOptionsBinding layoutStatementOptionsBinding = new LayoutStatementOptionsBinding((ConstraintLayout) view, roundImageView, roundImageView2, roundImageView3, roundImageView4, textView, textView2, textView3);
                                    int i4 = component1 + 37;
                                    component2 = i4 % 128;
                                    int i5 = i4 % 2;
                                    return layoutStatementOptionsBinding;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
