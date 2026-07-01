package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemConfirmBinding implements ViewBinding {
    private static int component1 = 1;
    private static int copydefault;
    private final ConstraintLayout component2;
    public final TextView tvTitle;
    public final TextView tvValue;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            getRoot();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout root = getRoot();
        int i3 = copydefault + 87;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return root;
    }

    private ItemConfirmBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.component2 = constraintLayout;
        this.tvTitle = textView;
        this.tvValue = textView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        ConstraintLayout constraintLayout;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 89;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            constraintLayout = this.component2;
            int i4 = 64 / 0;
        } else {
            constraintLayout = this.component2;
        }
        int i5 = i2 + 83;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return constraintLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ItemConfirmBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemConfirmBinding itemConfirmBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 93;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemConfirmBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemConfirmBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemConfirmBinding.copydefault
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemConfirmBinding.component1 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_confirm
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_confirm
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
        L20:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemConfirmBinding.component1
            int r4 = r4 + 105
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemConfirmBinding.copydefault = r5
            int r4 = r4 % r0
        L2c:
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemConfirmBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemConfirmBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.ItemConfirmBinding");
    }

    public static ItemConfirmBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = R.id.tv_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
            if (textView != null) {
                int i4 = copydefault + 109;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    i3 = R.id.tv_value;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i3);
                    if (textView2 != null) {
                        return new ItemConfirmBinding((ConstraintLayout) view, textView, textView2);
                    }
                } else {
                    obj.hashCode();
                    throw null;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        obj.hashCode();
        throw null;
    }
}
