package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemPaymentMethodBinding implements ViewBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final ConstraintLayout component1;
    public final ImageView ivIcon;
    public final ImageView ivSelected;
    public final TextView tvContent;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            getRoot();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout root = getRoot();
        int i3 = copydefault + 33;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return root;
    }

    private ItemPaymentMethodBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.component1 = constraintLayout;
        this.ivIcon = imageView;
        this.ivSelected = imageView2;
        this.tvContent = textView;
        this.tvTitle = textView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 69;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.component1;
        int i5 = i2 + 59;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
        return constraintLayout;
    }

    public static ItemPaymentMethodBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemPaymentMethodBinding itemPaymentMethodBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 107;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemPaymentMethodBindingInflate;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r3
  0x0022: PHI (r3v4 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemPaymentMethodBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemPaymentMethodBinding.copydefault
            int r1 = r1 + 51
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemPaymentMethodBinding.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1a
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_payment_method
            android.view.View r3 = r3.inflate(r1, r4, r2)
            r5 = r5 ^ 1
            if (r5 == 0) goto L22
            goto L2e
        L1a:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_payment_method
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2e
        L22:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemPaymentMethodBinding.component2
            int r4 = r4 + 63
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemPaymentMethodBinding.copydefault = r5
            int r4 = r4 % r0
        L2e:
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemPaymentMethodBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemPaymentMethodBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.ItemPaymentMethodBinding");
    }

    public static ItemPaymentMethodBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 113;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = R.id.ivIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i3);
        if (imageView != null) {
            i3 = R.id.ivSelected;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i3);
            if (imageView2 != null) {
                int i4 = copydefault + 41;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                i3 = R.id.tvContent;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
                if (textView != null) {
                    i3 = R.id.tvTitle;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i3);
                    if (textView2 != null) {
                        ItemPaymentMethodBinding itemPaymentMethodBinding = new ItemPaymentMethodBinding((ConstraintLayout) view, imageView, imageView2, textView, textView2);
                        int i6 = copydefault + 73;
                        component2 = i6 % 128;
                        int i7 = i6 % 2;
                        return itemPaymentMethodBinding;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
    }
}
