package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;

public final class ItemTvHistoryBinding implements ViewBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final RoundTextView ShareDataUIState;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        RoundTextView root = getRoot();
        int i4 = copydefault + 51;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return root;
    }

    private ItemTvHistoryBinding(RoundTextView roundTextView) {
        this.ShareDataUIState = roundTextView;
    }

    @Override
    public RoundTextView getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        RoundTextView roundTextView = this.ShareDataUIState;
        int i5 = i3 + 15;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return roundTextView;
    }

    public static ItemTvHistoryBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemTvHistoryBinding itemTvHistoryBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 65;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return itemTvHistoryBindingInflate;
    }

    public static ItemTvHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_tv_history, viewGroup, false);
        if (z) {
            int i2 = component2 + 73;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                viewGroup.addView(viewInflate);
            } else {
                viewGroup.addView(viewInflate);
                throw null;
            }
        }
        ItemTvHistoryBinding itemTvHistoryBindingBind = bind(viewInflate);
        int i3 = copydefault + 69;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return itemTvHistoryBindingBind;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        throw new java.lang.NullPointerException("rootView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = new com.huawei.digitalpayment.consumer.homeui.databinding.ItemTvHistoryBinding((com.huawei.common.widget.round.RoundTextView) r3);
        r3 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemTvHistoryBinding.copydefault + 107;
        com.huawei.digitalpayment.consumer.homeui.databinding.ItemTvHistoryBinding.component2 = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.homeui.databinding.ItemTvHistoryBinding bind(android.view.View r3) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemTvHistoryBinding.component2
            int r1 = r1 + 71
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemTvHistoryBinding.copydefault = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L15
            r1 = 34
            int r1 = r1 / 0
            if (r3 == 0) goto L28
            goto L17
        L15:
            if (r3 == 0) goto L28
        L17:
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemTvHistoryBinding r1 = new com.huawei.digitalpayment.consumer.homeui.databinding.ItemTvHistoryBinding
            com.huawei.common.widget.round.RoundTextView r3 = (com.huawei.common.widget.round.RoundTextView) r3
            r1.<init>(r3)
            int r3 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemTvHistoryBinding.copydefault
            int r3 = r3 + 107
            int r2 = r3 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemTvHistoryBinding.component2 = r2
            int r3 = r3 % r0
            return r1
        L28:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "rootView"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.ItemTvHistoryBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.homeui.databinding.ItemTvHistoryBinding");
    }
}
