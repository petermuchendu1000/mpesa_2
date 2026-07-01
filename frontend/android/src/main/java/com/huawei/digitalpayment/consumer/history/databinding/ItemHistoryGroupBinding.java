package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.history.R;

public final class ItemHistoryGroupBinding implements ViewBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    public final ConstraintLayout clTop;
    private final RoundConstraintLayout component1;
    public final RecyclerView recyclerView;
    public final RoundTextView tvTips;
    public final RoundTextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        RoundConstraintLayout root = getRoot();
        int i4 = copydefault + 35;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ItemHistoryGroupBinding(RoundConstraintLayout roundConstraintLayout, ConstraintLayout constraintLayout, RecyclerView recyclerView, RoundTextView roundTextView, RoundTextView roundTextView2) {
        this.component1 = roundConstraintLayout;
        this.clTop = constraintLayout;
        this.recyclerView = recyclerView;
        this.tvTips = roundTextView;
        this.tvTitle = roundTextView2;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ItemHistoryGroupBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        component3 = i2 % 128;
        ItemHistoryGroupBinding itemHistoryGroupBindingInflate = inflate(layoutInflater, null, i2 % 2 != 0);
        int i3 = copydefault + 27;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return itemHistoryGroupBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.history.databinding.ItemHistoryGroupBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.history.databinding.ItemHistoryGroupBinding.copydefault
            int r1 = r1 + 87
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.history.databinding.ItemHistoryGroupBinding.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.history.R.layout.item_history_group
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L23
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.history.R.layout.item_history_group
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L23
        L20:
            r4.addView(r3)
        L23:
            com.huawei.digitalpayment.consumer.history.databinding.ItemHistoryGroupBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.history.databinding.ItemHistoryGroupBinding.component3
            int r4 = r4 + 79
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.history.databinding.ItemHistoryGroupBinding.copydefault = r5
            int r4 = r4 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.history.databinding.ItemHistoryGroupBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.history.databinding.ItemHistoryGroupBinding");
    }

    public static ItemHistoryGroupBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.clTop;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i2);
        if (constraintLayout != null) {
            i2 = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i2);
            if (recyclerView != null) {
                i2 = R.id.tvTips;
                RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                if (roundTextView != null) {
                    int i3 = copydefault + 83;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    i2 = R.id.tvTitle;
                    RoundTextView roundTextView2 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                    if (roundTextView2 != null) {
                        ItemHistoryGroupBinding itemHistoryGroupBinding = new ItemHistoryGroupBinding((RoundConstraintLayout) view, constraintLayout, recyclerView, roundTextView, roundTextView2);
                        int i5 = component3 + 35;
                        copydefault = i5 % 128;
                        int i6 = i5 % 2;
                        return itemHistoryGroupBinding;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
