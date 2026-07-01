package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemOfferBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final ConstraintLayout component1;
    public final CardView cvContainer;
    public final ImageView ivAvatar;
    public final View ivGuideline;
    public final TextView tvTitle;
    public final TextView tvUntilTime;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component2 + 111;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemOfferBinding(ConstraintLayout constraintLayout, CardView cardView, ImageView imageView, View view, TextView textView, TextView textView2) {
        this.component1 = constraintLayout;
        this.cvContainer = cardView;
        this.ivAvatar = imageView;
        this.ivGuideline = view;
        this.tvTitle = textView;
        this.tvUntilTime = textView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.component1;
        int i5 = i3 + 99;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static ItemOfferBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemOfferBinding itemOfferBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 123;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemOfferBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferBinding.ShareDataUIState
            int r1 = r1 + 41
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferBinding.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_offer
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_offer
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
        L20:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferBinding.ShareDataUIState
            int r4 = r4 + 109
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferBinding.component2 = r5
            int r4 = r4 % r0
        L2c:
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferBinding.ShareDataUIState
            int r4 = r4 + 19
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferBinding.component2 = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L3e
            r4 = 12
            int r4 = r4 / r2
        L3e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferBinding");
    }

    public static ItemOfferBinding bind(View view) {
        View viewFindChildViewById;
        int i = 2 % 2;
        int i2 = R.id.cv_container;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i2);
        if (cardView != null) {
            int i3 = ShareDataUIState + 119;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            i2 = R.id.iv_avatar;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
            if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i2 = R.id.iv_guideline))) != null) {
                i2 = R.id.tv_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                if (textView != null) {
                    i2 = R.id.tv_until_time;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
                    if (textView2 != null) {
                        ItemOfferBinding itemOfferBinding = new ItemOfferBinding((ConstraintLayout) view, cardView, imageView, viewFindChildViewById, textView, textView2);
                        int i4 = component2 + 85;
                        ShareDataUIState = i4 % 128;
                        int i5 = i4 % 2;
                        return itemOfferBinding;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
