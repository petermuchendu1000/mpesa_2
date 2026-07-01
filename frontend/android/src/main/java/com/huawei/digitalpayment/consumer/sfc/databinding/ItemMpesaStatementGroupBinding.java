package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemMpesaStatementGroupBinding implements ViewBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final ConstraintLayout ShareDataUIState;
    public final RecyclerView rvStatements;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        return root;
    }

    private ItemMpesaStatementGroupBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView) {
        this.ShareDataUIState = constraintLayout;
        this.rvStatements = recyclerView;
        this.tvTitle = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayout = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        return constraintLayout;
    }

    public static ItemMpesaStatementGroupBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ItemMpesaStatementGroupBinding itemMpesaStatementGroupBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 123;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemMpesaStatementGroupBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementGroupBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementGroupBinding.copydefault
            int r1 = r1 + 21
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementGroupBinding.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_mpesa_statement_group
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_mpesa_statement_group
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
        L20:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementGroupBinding.copydefault
            int r4 = r4 + 41
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementGroupBinding.component2 = r5
            int r4 = r4 % r0
        L2c:
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementGroupBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementGroupBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.ItemMpesaStatementGroupBinding");
    }

    public static ItemMpesaStatementGroupBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.id.rv_statements;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i3);
            if (recyclerView != null) {
                i3 = R.id.tv_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
                if (textView != null) {
                    ItemMpesaStatementGroupBinding itemMpesaStatementGroupBinding = new ItemMpesaStatementGroupBinding((ConstraintLayout) view, recyclerView, textView);
                    int i4 = component2 + 101;
                    copydefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 25 / 0;
                    }
                    return itemMpesaStatementGroupBinding;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
