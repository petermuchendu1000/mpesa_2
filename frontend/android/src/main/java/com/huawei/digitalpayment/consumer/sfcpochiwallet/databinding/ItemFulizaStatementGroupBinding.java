package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;

public final class ItemFulizaStatementGroupBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final ConstraintLayout component1;
    public final RecyclerView rvStatements;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = ShareDataUIState + 25;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemFulizaStatementGroupBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView) {
        this.component1 = constraintLayout;
        this.rvStatements = recyclerView;
        this.tvTitle = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.component1;
        int i5 = i3 + 51;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
        return constraintLayout;
    }

    public static ItemFulizaStatementGroupBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemFulizaStatementGroupBinding itemFulizaStatementGroupBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 25;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemFulizaStatementGroupBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r3
  0x0022: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementGroupBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementGroupBinding.ShareDataUIState
            int r1 = r1 + 113
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementGroupBinding.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1a
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.layout.item_fuliza_statement_group
            android.view.View r3 = r3.inflate(r1, r4, r2)
            r1 = 1
            r5 = r5 ^ r1
            if (r5 == r1) goto L25
            goto L22
        L1a:
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.layout.item_fuliza_statement_group
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L25
        L22:
            r4.addView(r3)
        L25:
            com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementGroupBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementGroupBinding.component2
            int r4 = r4 + 125
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementGroupBinding.ShareDataUIState = r5
            int r4 = r4 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementGroupBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemFulizaStatementGroupBinding");
    }

    public static ItemFulizaStatementGroupBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.id.rv_statements;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i3);
            if (recyclerView != null) {
                i3 = R.id.tv_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
                if (textView != null) {
                    ItemFulizaStatementGroupBinding itemFulizaStatementGroupBinding = new ItemFulizaStatementGroupBinding((ConstraintLayout) view, recyclerView, textView);
                    int i4 = component2 + 121;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    return itemFulizaStatementGroupBinding;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        throw null;
    }
}
