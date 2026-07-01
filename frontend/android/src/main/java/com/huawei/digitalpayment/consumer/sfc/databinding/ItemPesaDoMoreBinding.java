package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundImageView;

public final class ItemPesaDoMoreBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final FrameLayout component1;
    public final RoundImageView ivIcon;
    public final TextView tvName;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout root = getRoot();
        int i4 = ShareDataUIState + 75;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ItemPesaDoMoreBinding(FrameLayout frameLayout, RoundImageView roundImageView, TextView textView) {
        this.component1 = frameLayout;
        this.ivIcon = roundImageView;
        this.tvName = textView;
    }

    @Override
    public FrameLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 103;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout frameLayout = this.component1;
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return frameLayout;
    }

    public static ItemPesaDoMoreBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemPesaDoMoreBinding itemPesaDoMoreBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 51;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemPesaDoMoreBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r4
  0x0022: PHI (r4v2 android.view.View) = (r4v1 android.view.View), (r4v5 android.view.View) binds: [B:8:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding.ShareDataUIState
            int r1 = r1 + 89
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding.component3 = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_pesa_do_more
            android.view.View r4 = r4.inflate(r1, r5, r2)
            if (r6 == 0) goto L2e
            goto L22
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_pesa_do_more
            r3 = 0
            android.view.View r4 = r4.inflate(r1, r5, r3)
            r6 = r6 ^ r2
            if (r6 == r2) goto L2e
        L22:
            int r6 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding.component3
            int r6 = r6 + 71
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding.ShareDataUIState = r1
            int r6 = r6 % r0
            r5.addView(r4)
        L2e:
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding r4 = bind(r4)
            int r5 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding.ShareDataUIState
            int r5 = r5 + 75
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding.component3 = r6
            int r5 = r5 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r3 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r1 = new com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding((android.widget.FrameLayout) r5, r2, r3);
        r5 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding.ShareDataUIState + 67;
        com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding.component3 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r3 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding bind(android.view.View r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.ivIcon
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            com.huawei.common.widget.round.RoundImageView r2 = (com.huawei.common.widget.round.RoundImageView) r2
            if (r2 == 0) goto L42
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding.ShareDataUIState
            int r1 = r1 + 55
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding.component3 = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L27
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tvName
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 69
            int r4 = r4 / 0
            if (r3 == 0) goto L42
            goto L31
        L27:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tvName
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L42
        L31:
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding r1 = new com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            r1.<init>(r5, r2, r3)
            int r5 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding.ShareDataUIState
            int r5 = r5 + 67
            int r2 = r5 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding.component3 = r2
            int r5 = r5 % r0
            return r1
        L42:
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r5 = r5.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.sfc.databinding.ItemPesaDoMoreBinding");
    }
}
