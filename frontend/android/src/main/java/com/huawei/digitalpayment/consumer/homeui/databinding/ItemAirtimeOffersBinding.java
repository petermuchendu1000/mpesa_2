package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.homeui.R;

public final class ItemAirtimeOffersBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final ConstraintLayout copydefault;
    public final ImageView ivImage;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = ShareDataUIState + 3;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        throw null;
    }

    private ItemAirtimeOffersBinding(ConstraintLayout constraintLayout, ImageView imageView) {
        this.copydefault = constraintLayout;
        this.ivImage = imageView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 123;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.copydefault;
        int i5 = i2 + 9;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
        return constraintLayout;
    }

    public static ItemAirtimeOffersBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ItemAirtimeOffersBinding itemAirtimeOffersBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 87;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return itemAirtimeOffersBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r4
  0x0022: PHI (r4v4 android.view.View) = (r4v1 android.view.View), (r4v5 android.view.View) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.homeui.databinding.ItemAirtimeOffersBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemAirtimeOffersBinding.component3
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemAirtimeOffersBinding.ShareDataUIState = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1a
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.layout.item_airtime_offers
            r3 = 1
            android.view.View r4 = r4.inflate(r1, r5, r3)
            r6 = r6 ^ r3
            if (r6 == 0) goto L22
            goto L2e
        L1a:
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.layout.item_airtime_offers
            android.view.View r4 = r4.inflate(r1, r5, r2)
            if (r6 == 0) goto L2e
        L22:
            int r6 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemAirtimeOffersBinding.component3
            int r6 = r6 + 7
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemAirtimeOffersBinding.ShareDataUIState = r1
            int r6 = r6 % r0
            r5.addView(r4)
        L2e:
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemAirtimeOffersBinding r4 = bind(r4)
            int r5 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemAirtimeOffersBinding.ShareDataUIState
            int r5 = r5 + 61
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemAirtimeOffersBinding.component3 = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L40
            r5 = 82
            int r5 = r5 / r2
        L40:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.ItemAirtimeOffersBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.homeui.databinding.ItemAirtimeOffersBinding");
    }

    public static ItemAirtimeOffersBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.id.iv_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i3);
            if (imageView != null) {
                ItemAirtimeOffersBinding itemAirtimeOffersBinding = new ItemAirtimeOffersBinding((ConstraintLayout) view, imageView);
                int i4 = component3 + 21;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return itemAirtimeOffersBinding;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
