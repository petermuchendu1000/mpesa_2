package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemSfcOfferCategoryBinding implements ViewBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    private final LinearLayout component1;
    public final Button tvFreshFriday;
    public final Button tvOfaMoto;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            getRoot();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LinearLayout root = getRoot();
        int i3 = component2 + 117;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return root;
    }

    private ItemSfcOfferCategoryBinding(LinearLayout linearLayout, Button button, Button button2) {
        this.component1 = linearLayout;
        this.tvFreshFriday = button;
        this.tvOfaMoto = button2;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        LinearLayout linearLayout = this.component1;
        int i5 = i3 + 87;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return linearLayout;
    }

    public static ItemSfcOfferCategoryBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemSfcOfferCategoryBinding itemSfcOfferCategoryBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 5;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemSfcOfferCategoryBindingInflate;
        }
        throw null;
    }

    public static ItemSfcOfferCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_sfc_offer_category, viewGroup, false);
        if (z) {
            int i4 = component2 + 71;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.addView(viewInflate);
        }
        ItemSfcOfferCategoryBinding itemSfcOfferCategoryBindingBind = bind(viewInflate);
        int i6 = component2 + 35;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return itemSfcOfferCategoryBindingBind;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r2
  0x0027: PHI (r2v3 android.widget.Button) = (r2v2 android.widget.Button), (r2v6 android.widget.Button) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferCategoryBinding bind(android.view.View r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferCategoryBinding.component3
            int r1 = r1 + 11
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferCategoryBinding.component2 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_fresh_friday
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            android.widget.Button r2 = (android.widget.Button) r2
            r3 = 92
            int r3 = r3 / 0
            if (r2 == 0) goto L42
            goto L27
        L1d:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_fresh_friday
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            android.widget.Button r2 = (android.widget.Button) r2
            if (r2 == 0) goto L42
        L27:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_ofa_moto
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            android.widget.Button r3 = (android.widget.Button) r3
            if (r3 == 0) goto L42
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferCategoryBinding r1 = new com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferCategoryBinding
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r1.<init>(r4, r2, r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferCategoryBinding.component3
            int r4 = r4 + 99
            int r2 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferCategoryBinding.component2 = r2
            int r4 = r4 % r0
            return r1
        L42:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferCategoryBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.sfc.databinding.ItemSfcOfferCategoryBinding");
    }
}
