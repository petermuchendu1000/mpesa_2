package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemRequestMoneyDoMoreBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final CardView copydefault;
    public final ImageView ivIcon;
    public final TextView tvName;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            getRoot();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CardView root = getRoot();
        int i3 = ShareDataUIState + 87;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return root;
    }

    private ItemRequestMoneyDoMoreBinding(CardView cardView, ImageView imageView, TextView textView) {
        this.copydefault = cardView;
        this.ivIcon = imageView;
        this.tvName = textView;
    }

    @Override
    public CardView getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 41;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        CardView cardView = this.copydefault;
        int i5 = i2 + 93;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return cardView;
    }

    public static ItemRequestMoneyDoMoreBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemRequestMoneyDoMoreBinding itemRequestMoneyDoMoreBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 63;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemRequestMoneyDoMoreBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r3
  0x0022: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemRequestMoneyDoMoreBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemRequestMoneyDoMoreBinding.component2
            int r1 = r1 + 25
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemRequestMoneyDoMoreBinding.ShareDataUIState = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1a
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_request_money_do_more
            android.view.View r3 = r3.inflate(r1, r4, r2)
            r1 = 1
            r5 = r5 ^ r1
            if (r5 == r1) goto L2e
            goto L22
        L1a:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_request_money_do_more
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2e
        L22:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemRequestMoneyDoMoreBinding.component2
            int r4 = r4 + 75
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemRequestMoneyDoMoreBinding.ShareDataUIState = r5
            int r4 = r4 % r0
        L2e:
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemRequestMoneyDoMoreBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemRequestMoneyDoMoreBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.ItemRequestMoneyDoMoreBinding");
    }

    public static ItemRequestMoneyDoMoreBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.ivIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i4);
        if (imageView != null) {
            int i5 = component2 + 113;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            i4 = R.id.tvName;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
            if (textView != null) {
                ItemRequestMoneyDoMoreBinding itemRequestMoneyDoMoreBinding = new ItemRequestMoneyDoMoreBinding((CardView) view, imageView, textView);
                int i7 = ShareDataUIState + 49;
                component2 = i7 % 128;
                if (i7 % 2 != 0) {
                    return itemRequestMoneyDoMoreBinding;
                }
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
