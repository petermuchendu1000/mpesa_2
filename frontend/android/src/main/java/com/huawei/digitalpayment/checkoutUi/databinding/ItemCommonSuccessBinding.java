package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.checkoutUi.R;

public final class ItemCommonSuccessBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final ConstraintLayout copydefault;
    public final TextView tvLabel;
    public final TextView tvValue;

    @Override
    public View getRoot() {
        ConstraintLayout root;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            root = getRoot();
            int i3 = 51 / 0;
        } else {
            root = getRoot();
        }
        int i4 = ShareDataUIState + 75;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemCommonSuccessBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.copydefault = constraintLayout;
        this.tvLabel = textView;
        this.tvValue = textView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 119;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.copydefault;
        int i5 = i2 + 63;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static ItemCommonSuccessBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemCommonSuccessBinding itemCommonSuccessBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 115;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemCommonSuccessBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r3
  0x0022: PHI (r3v4 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkoutUi.databinding.ItemCommonSuccessBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.ItemCommonSuccessBinding.ShareDataUIState
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.ItemCommonSuccessBinding.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1a
            int r1 = com.huawei.digitalpayment.checkoutUi.R.layout.item_common_success
            android.view.View r3 = r3.inflate(r1, r4, r2)
            r5 = r5 ^ 1
            if (r5 == 0) goto L22
            goto L2e
        L1a:
            int r1 = com.huawei.digitalpayment.checkoutUi.R.layout.item_common_success
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2e
        L22:
            int r5 = com.huawei.digitalpayment.checkoutUi.databinding.ItemCommonSuccessBinding.component2
            int r5 = r5 + 53
            int r1 = r5 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.ItemCommonSuccessBinding.ShareDataUIState = r1
            int r5 = r5 % r0
            r4.addView(r3)
        L2e:
            com.huawei.digitalpayment.checkoutUi.databinding.ItemCommonSuccessBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutUi.databinding.ItemCommonSuccessBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.checkoutUi.databinding.ItemCommonSuccessBinding");
    }

    public static ItemCommonSuccessBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 111;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.id.tv_label;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
            if (textView != null) {
                i3 = R.id.tv_value;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i3);
                if (textView2 != null) {
                    ItemCommonSuccessBinding itemCommonSuccessBinding = new ItemCommonSuccessBinding((ConstraintLayout) view, textView, textView2);
                    int i4 = ShareDataUIState + 47;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                    return itemCommonSuccessBinding;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
