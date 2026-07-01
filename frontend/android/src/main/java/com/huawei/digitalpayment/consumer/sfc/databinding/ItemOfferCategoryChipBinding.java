package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemOfferCategoryChipBinding implements ViewBinding {
    private static int component2 = 1;
    private static int component3;
    public final CardView cardCategory;
    private final CardView copydefault;
    public final TextView tvCategoryName;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        CardView root = getRoot();
        int i4 = component2 + 109;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return root;
        }
        throw null;
    }

    private ItemOfferCategoryChipBinding(CardView cardView, CardView cardView2, TextView textView) {
        this.copydefault = cardView;
        this.cardCategory = cardView2;
        this.tvCategoryName = textView;
    }

    @Override
    public CardView getRoot() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 5;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        CardView cardView = this.copydefault;
        int i4 = i2 + 55;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return cardView;
        }
        obj.hashCode();
        throw null;
    }

    public static ItemOfferCategoryChipBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemOfferCategoryChipBinding itemOfferCategoryChipBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 103;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemOfferCategoryChipBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferCategoryChipBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferCategoryChipBinding.component2
            int r1 = r1 + 3
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferCategoryChipBinding.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_offer_category_chip
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L23
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_offer_category_chip
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L23
        L20:
            r4.addView(r3)
        L23:
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferCategoryChipBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferCategoryChipBinding.component3
            int r4 = r4 + 9
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferCategoryChipBinding.component2 = r5
            int r4 = r4 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferCategoryChipBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferCategoryChipBinding");
    }

    public static ItemOfferCategoryChipBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 35;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            CardView cardView = (CardView) view;
            int i3 = R.id.tv_category_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
            if (textView != null) {
                ItemOfferCategoryChipBinding itemOfferCategoryChipBinding = new ItemOfferCategoryChipBinding(cardView, cardView, textView);
                int i4 = component2 + 89;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return itemOfferCategoryChipBinding;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        throw null;
    }
}
