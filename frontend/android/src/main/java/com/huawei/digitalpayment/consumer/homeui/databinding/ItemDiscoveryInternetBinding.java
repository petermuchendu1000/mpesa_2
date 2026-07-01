package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.homeui.R;

public final class ItemDiscoveryInternetBinding implements ViewBinding {
    private static int component2 = 1;
    private static int copydefault;
    private final CardView ShareDataUIState;
    public final ImageView ivImage;
    public final TextView tvValue;

    @Override
    public View getRoot() {
        CardView root;
        int i = 2 % 2;
        int i2 = component2 + 115;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            root = getRoot();
            int i3 = 6 / 0;
        } else {
            root = getRoot();
        }
        int i4 = copydefault + 1;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemDiscoveryInternetBinding(CardView cardView, ImageView imageView, TextView textView) {
        this.ShareDataUIState = cardView;
        this.ivImage = imageView;
        this.tvValue = textView;
    }

    @Override
    public CardView getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        CardView cardView = this.ShareDataUIState;
        int i5 = i3 + 51;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return cardView;
        }
        throw null;
    }

    public static ItemDiscoveryInternetBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 15;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemDiscoveryInternetBinding itemDiscoveryInternetBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 27;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemDiscoveryInternetBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[PHI: r4
  0x0022: PHI (r4v5 android.view.View) = (r4v1 android.view.View), (r4v6 android.view.View) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.homeui.databinding.ItemDiscoveryInternetBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemDiscoveryInternetBinding.component2
            int r1 = r1 + 21
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemDiscoveryInternetBinding.copydefault = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.layout.item_discovery_internet
            android.view.View r4 = r4.inflate(r1, r5, r3)
            if (r6 == r2) goto L22
            goto L25
        L19:
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.layout.item_discovery_internet
            android.view.View r4 = r4.inflate(r1, r5, r3)
            if (r6 == r2) goto L22
            goto L25
        L22:
            r5.addView(r4)
        L25:
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemDiscoveryInternetBinding r4 = bind(r4)
            int r5 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemDiscoveryInternetBinding.copydefault
            int r5 = r5 + 79
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemDiscoveryInternetBinding.component2 = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L35
            return r4
        L35:
            r4 = 0
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.ItemDiscoveryInternetBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.homeui.databinding.ItemDiscoveryInternetBinding");
    }

    public static ItemDiscoveryInternetBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.iv_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i4);
        if (imageView != null) {
            i4 = R.id.tv_value;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
            if (textView != null) {
                ItemDiscoveryInternetBinding itemDiscoveryInternetBinding = new ItemDiscoveryInternetBinding((CardView) view, imageView, textView);
                int i5 = component2 + 95;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return itemDiscoveryInternetBinding;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
