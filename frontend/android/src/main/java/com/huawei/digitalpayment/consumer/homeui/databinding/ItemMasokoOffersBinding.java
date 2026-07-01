package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public final class ItemMasokoOffersBinding implements ViewBinding {
    private static int component2 = 1;
    private static int component3;
    private final RoundConstraintLayout ShareDataUIState;
    public final RoundImageView ivImage;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        RoundConstraintLayout root = getRoot();
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return root;
    }

    private ItemMasokoOffersBinding(RoundConstraintLayout roundConstraintLayout, RoundImageView roundImageView) {
        this.ShareDataUIState = roundConstraintLayout;
        this.ivImage = roundImageView;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        RoundConstraintLayout roundConstraintLayout = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        return roundConstraintLayout;
    }

    public static ItemMasokoOffersBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 41;
        component2 = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r3
  0x0022: PHI (r3v4 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.homeui.databinding.ItemMasokoOffersBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemMasokoOffersBinding.component3
            int r1 = r1 + 25
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemMasokoOffersBinding.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1a
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.layout.item_masoko_offers
            android.view.View r3 = r3.inflate(r1, r4, r2)
            r5 = r5 ^ 1
            if (r5 == 0) goto L22
            goto L2e
        L1a:
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.layout.item_masoko_offers
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2e
        L22:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemMasokoOffersBinding.component2
            int r4 = r4 + 61
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemMasokoOffersBinding.component3 = r5
            int r4 = r4 % r0
        L2e:
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemMasokoOffersBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.ItemMasokoOffersBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.homeui.databinding.ItemMasokoOffersBinding");
    }

    public static ItemMasokoOffersBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.iv_image;
        RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i4);
        if (roundImageView != null) {
            ItemMasokoOffersBinding itemMasokoOffersBinding = new ItemMasokoOffersBinding((RoundConstraintLayout) view, roundImageView);
            int i5 = component2 + 71;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return itemMasokoOffersBinding;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
