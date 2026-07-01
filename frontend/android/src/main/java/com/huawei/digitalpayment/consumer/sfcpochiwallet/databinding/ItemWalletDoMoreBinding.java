package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;

public final class ItemWalletDoMoreBinding implements ViewBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    private final ConstraintLayout ShareDataUIState;
    public final ImageView ivImage;
    public final MaterialCardView rlContainer;
    public final TextView tvValue;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return getRoot();
        }
        getRoot();
        throw null;
    }

    private ItemWalletDoMoreBinding(ConstraintLayout constraintLayout, ImageView imageView, MaterialCardView materialCardView, TextView textView) {
        this.ShareDataUIState = constraintLayout;
        this.ivImage = imageView;
        this.rlContainer = materialCardView;
        this.tvValue = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 27;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public static ItemWalletDoMoreBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return inflate(layoutInflater, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
  0x0021: PHI (r3v4 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemWalletDoMoreBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemWalletDoMoreBinding.component2
            int r1 = r1 + 77
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemWalletDoMoreBinding.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L19
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.layout.item_wallet_do_more
            android.view.View r3 = r3.inflate(r1, r4, r2)
            r1 = 1
            if (r5 == r1) goto L21
            goto L2d
        L19:
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.layout.item_wallet_do_more
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2d
        L21:
            int r5 = com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemWalletDoMoreBinding.component2
            int r5 = r5 + 17
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemWalletDoMoreBinding.component3 = r1
            int r5 = r5 % r0
            r4.addView(r3)
        L2d:
            com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemWalletDoMoreBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemWalletDoMoreBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemWalletDoMoreBinding");
    }

    public static ItemWalletDoMoreBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 89;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.iv_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i4);
        if (imageView != null) {
            i4 = R.id.rl_container;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, i4);
            if (materialCardView != null) {
                int i5 = component3 + 67;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                i4 = R.id.tv_value;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
                if (textView != null) {
                    return new ItemWalletDoMoreBinding((ConstraintLayout) view, imageView, materialCardView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
