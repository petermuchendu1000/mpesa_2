package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class CustomTabV2Binding implements ViewBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    private final ConstraintLayout ShareDataUIState;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 13;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        return root;
    }

    private CustomTabV2Binding(ConstraintLayout constraintLayout, TextView textView) {
        this.ShareDataUIState = constraintLayout;
        this.tvTitle = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 63;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.ShareDataUIState;
        int i5 = i3 + 97;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return constraintLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static CustomTabV2Binding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        CustomTabV2Binding customTabV2BindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 121;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
        return customTabV2BindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[PHI: r3
  0x0023: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.CustomTabV2Binding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.CustomTabV2Binding.component2
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.CustomTabV2Binding.component1 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.custom_tab_v2
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L26
            goto L23
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.custom_tab_v2
            android.view.View r3 = r3.inflate(r1, r4, r2)
            r5 = r5 ^ 1
            if (r5 == 0) goto L23
            goto L26
        L23:
            r4.addView(r3)
        L26:
            com.huawei.digitalpayment.consumer.sfc.databinding.CustomTabV2Binding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.CustomTabV2Binding.component2
            int r4 = r4 + 53
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.CustomTabV2Binding.component1 = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L38
            r4 = 50
            int r4 = r4 / r2
        L38:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.CustomTabV2Binding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.CustomTabV2Binding");
    }

    public static CustomTabV2Binding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 35;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.id.tv_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
            if (textView != null) {
                CustomTabV2Binding customTabV2Binding = new CustomTabV2Binding((ConstraintLayout) view, textView);
                int i4 = component2 + 33;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return customTabV2Binding;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        throw null;
    }
}
