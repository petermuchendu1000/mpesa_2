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

public final class ItemWalletHomeFunctionBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final ConstraintLayout component2;
    public final ImageView ivImage;
    public final MaterialCardView rlContainer;
    public final TextView tvValue;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = copydefault + 19;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ItemWalletHomeFunctionBinding(ConstraintLayout constraintLayout, ImageView imageView, MaterialCardView materialCardView, TextView textView) {
        this.component2 = constraintLayout;
        this.ivImage = imageView;
        this.rlContainer = materialCardView;
        this.tvValue = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 85;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.component2;
        int i5 = i2 + 51;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return constraintLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ItemWalletHomeFunctionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        ShareDataUIState = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v6 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemWalletHomeFunctionBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemWalletHomeFunctionBinding.copydefault
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemWalletHomeFunctionBinding.ShareDataUIState = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.layout.item_wallet_home_function
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L23
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.layout.item_wallet_home_function
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L23
        L20:
            r4.addView(r3)
        L23:
            com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemWalletHomeFunctionBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemWalletHomeFunctionBinding.ShareDataUIState
            int r4 = r4 + 109
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemWalletHomeFunctionBinding.copydefault = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L33
            return r3
        L33:
            r3 = 0
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemWalletHomeFunctionBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemWalletHomeFunctionBinding");
    }

    public static ItemWalletHomeFunctionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.iv_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
        if (imageView != null) {
            i2 = R.id.rl_container;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, i2);
            if (materialCardView != null) {
                int i3 = ShareDataUIState + 15;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                i2 = R.id.tv_value;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                if (textView != null) {
                    ItemWalletHomeFunctionBinding itemWalletHomeFunctionBinding = new ItemWalletHomeFunctionBinding((ConstraintLayout) view, imageView, materialCardView, textView);
                    int i5 = copydefault + 31;
                    ShareDataUIState = i5 % 128;
                    if (i5 % 2 != 0) {
                        return itemWalletHomeFunctionBinding;
                    }
                    throw null;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
