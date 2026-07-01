package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class DealItemPlaceholderBinding implements ViewBinding {
    private static int component1 = 1;
    private static int component2;
    private final FrameLayout ShareDataUIState;
    public final LinearLayout dealContent;
    public final ImageView imgDealThumbnail;
    public final TextView tvDealPrice;
    public final TextView tvDealTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout root = getRoot();
        int i4 = component1 + 97;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private DealItemPlaceholderBinding(FrameLayout frameLayout, LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.ShareDataUIState = frameLayout;
        this.dealContent = linearLayout;
        this.imgDealThumbnail = imageView;
        this.tvDealPrice = textView;
        this.tvDealTitle = textView2;
    }

    @Override
    public FrameLayout getRoot() {
        FrameLayout frameLayout;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 107;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            frameLayout = this.ShareDataUIState;
            int i4 = 4 / 0;
        } else {
            frameLayout = this.ShareDataUIState;
        }
        int i5 = i2 + 55;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return frameLayout;
    }

    public static DealItemPlaceholderBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 13;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DealItemPlaceholderBinding dealItemPlaceholderBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 55;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return dealItemPlaceholderBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
  0x0021: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.DealItemPlaceholderBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.DealItemPlaceholderBinding.component2
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.DealItemPlaceholderBinding.component1 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.deal_item_placeholder
            r2 = 1
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L24
            goto L21
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.deal_item_placeholder
            r2 = 0
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L24
        L21:
            r4.addView(r3)
        L24:
            com.huawei.digitalpayment.consumer.sfc.databinding.DealItemPlaceholderBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.DealItemPlaceholderBinding.component1
            int r4 = r4 + 39
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.DealItemPlaceholderBinding.component2 = r5
            int r4 = r4 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.DealItemPlaceholderBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.DealItemPlaceholderBinding");
    }

    public static DealItemPlaceholderBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.deal_content;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i2);
        if (linearLayout != null) {
            int i3 = component2 + 47;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.img_deal_thumbnail;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
            if (imageView != null) {
                int i5 = component2 + 105;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                i2 = R.id.tv_deal_price;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                if (textView != null) {
                    i2 = R.id.tv_deal_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
                    if (textView2 != null) {
                        DealItemPlaceholderBinding dealItemPlaceholderBinding = new DealItemPlaceholderBinding((FrameLayout) view, linearLayout, imageView, textView, textView2);
                        int i6 = component1 + 27;
                        component2 = i6 % 128;
                        int i7 = i6 % 2;
                        return dealItemPlaceholderBinding;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
