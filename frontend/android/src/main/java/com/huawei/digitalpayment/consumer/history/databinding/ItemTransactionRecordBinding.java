package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.item.CommonItemView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.history.R;

public final class ItemTransactionRecordBinding implements ViewBinding {
    private static int component2 = 1;
    private static int component3;
    public final RoundConstraintLayout clItem;
    private final RoundConstraintLayout component1;
    public final CommonItemView itemView;
    public final RoundTextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        RoundConstraintLayout root = getRoot();
        int i4 = component3 + 17;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemTransactionRecordBinding(RoundConstraintLayout roundConstraintLayout, RoundConstraintLayout roundConstraintLayout2, CommonItemView commonItemView, RoundTextView roundTextView) {
        this.component1 = roundConstraintLayout;
        this.clItem = roundConstraintLayout2;
        this.itemView = commonItemView;
        this.tvTitle = roundTextView;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 73;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        RoundConstraintLayout roundConstraintLayout = this.component1;
        int i5 = i3 + 7;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return roundConstraintLayout;
    }

    public static ItemTransactionRecordBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemTransactionRecordBinding itemTransactionRecordBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 69;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return itemTransactionRecordBindingInflate;
    }

    public static ItemTransactionRecordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_transaction_record, viewGroup, false);
        if (z) {
            int i4 = component2 + 1;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                viewGroup.addView(viewInflate);
            } else {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return bind(viewInflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r1 r3
  0x002d: PHI (r1v6 com.huawei.common.widget.round.RoundConstraintLayout) = 
  (r1v5 com.huawei.common.widget.round.RoundConstraintLayout)
  (r1v9 com.huawei.common.widget.round.RoundConstraintLayout)
 binds: [B:8:0x002b, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x002d: PHI (r3v2 com.huawei.common.widget.item.CommonItemView) = (r3v1 com.huawei.common.widget.item.CommonItemView), (r3v4 com.huawei.common.widget.item.CommonItemView) binds: [B:8:0x002b, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionRecordBinding bind(android.view.View r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionRecordBinding.component2
            int r1 = r1 + 57
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionRecordBinding.component3 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L20
            r1 = r5
            com.huawei.common.widget.round.RoundConstraintLayout r1 = (com.huawei.common.widget.round.RoundConstraintLayout) r1
            int r2 = com.huawei.digitalpayment.consumer.history.R.id.itemView
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r2)
            com.huawei.common.widget.item.CommonItemView r3 = (com.huawei.common.widget.item.CommonItemView) r3
            r4 = 25
            int r4 = r4 / 0
            if (r3 == 0) goto L55
            goto L2d
        L20:
            r1 = r5
            com.huawei.common.widget.round.RoundConstraintLayout r1 = (com.huawei.common.widget.round.RoundConstraintLayout) r1
            int r2 = com.huawei.digitalpayment.consumer.history.R.id.itemView
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r2)
            com.huawei.common.widget.item.CommonItemView r3 = (com.huawei.common.widget.item.CommonItemView) r3
            if (r3 == 0) goto L55
        L2d:
            int r2 = com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionRecordBinding.component3
            int r2 = r2 + 91
            int r4 = r2 % 128
            com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionRecordBinding.component2 = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L48
            int r2 = com.huawei.digitalpayment.consumer.history.R.id.tv_title
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r2)
            com.huawei.common.widget.round.RoundTextView r0 = (com.huawei.common.widget.round.RoundTextView) r0
            if (r0 == 0) goto L55
            com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionRecordBinding r5 = new com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionRecordBinding
            r5.<init>(r1, r1, r3, r0)
            return r5
        L48:
            int r0 = com.huawei.digitalpayment.consumer.history.R.id.tv_title
            android.view.View r5 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r0)
            com.huawei.common.widget.round.RoundTextView r5 = (com.huawei.common.widget.round.RoundTextView) r5
            r5 = 0
            r5.hashCode()
            throw r5
        L55:
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r5 = r5.getResourceName(r2)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionRecordBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.history.databinding.ItemTransactionRecordBinding");
    }
}
