package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundLinearLayout;

public final class CustomToastBinding implements ViewBinding {
    private static int component2 = 1;
    private static int component3;
    private final RoundLinearLayout ShareDataUIState;
    public final ImageView tvIcon;
    public final TextView tvMessage;

    @Override
    public View getRoot() {
        RoundLinearLayout root;
        int i = 2 % 2;
        int i2 = component3 + 35;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            root = getRoot();
            int i3 = 82 / 0;
        } else {
            root = getRoot();
        }
        int i4 = component2 + 51;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private CustomToastBinding(RoundLinearLayout roundLinearLayout, ImageView imageView, TextView textView) {
        this.ShareDataUIState = roundLinearLayout;
        this.tvIcon = imageView;
        this.tvMessage = textView;
    }

    @Override
    public RoundLinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 55;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        RoundLinearLayout roundLinearLayout = this.ShareDataUIState;
        int i5 = i2 + 61;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return roundLinearLayout;
    }

    public static CustomToastBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return inflate(layoutInflater, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[PHI: r4
  0x0022: PHI (r4v2 android.view.View) = (r4v1 android.view.View), (r4v5 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.baselib.databinding.CustomToastBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.databinding.CustomToastBinding.component3
            int r1 = r1 + 89
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.databinding.CustomToastBinding.component2 = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.layout.custom_toast
            android.view.View r4 = r4.inflate(r1, r5, r2)
            if (r6 == 0) goto L2e
            goto L22
        L18:
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.layout.custom_toast
            r3 = 0
            android.view.View r4 = r4.inflate(r1, r5, r3)
            if (r6 == r2) goto L22
            goto L2e
        L22:
            int r6 = com.huawei.digitalpayment.consumer.baselib.databinding.CustomToastBinding.component3
            int r6 = r6 + 47
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.baselib.databinding.CustomToastBinding.component2 = r1
            int r6 = r6 % r0
            r5.addView(r4)
        L2e:
            com.huawei.digitalpayment.consumer.baselib.databinding.CustomToastBinding r4 = bind(r4)
            int r5 = com.huawei.digitalpayment.consumer.baselib.databinding.CustomToastBinding.component3
            int r5 = r5 + 73
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.baselib.databinding.CustomToastBinding.component2 = r6
            int r5 = r5 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.databinding.CustomToastBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.baselib.databinding.CustomToastBinding");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r2
  0x0027: PHI (r2v3 android.widget.ImageView) = (r2v2 android.widget.ImageView), (r2v6 android.widget.ImageView) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.baselib.databinding.CustomToastBinding bind(android.view.View r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.databinding.CustomToastBinding.component3
            int r1 = r1 + 7
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.databinding.CustomToastBinding.component2 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1d
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.id.tvIcon
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r3 = 96
            int r3 = r3 / 0
            if (r2 == 0) goto L42
            goto L27
        L1d:
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.id.tvIcon
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L42
        L27:
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.id.tvMessage
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L42
            com.huawei.digitalpayment.consumer.baselib.databinding.CustomToastBinding r1 = new com.huawei.digitalpayment.consumer.baselib.databinding.CustomToastBinding
            com.huawei.common.widget.round.RoundLinearLayout r4 = (com.huawei.common.widget.round.RoundLinearLayout) r4
            r1.<init>(r4, r2, r3)
            int r4 = com.huawei.digitalpayment.consumer.baselib.databinding.CustomToastBinding.component3
            int r4 = r4 + 75
            int r2 = r4 % 128
            com.huawei.digitalpayment.consumer.baselib.databinding.CustomToastBinding.component2 = r2
            int r4 = r4 % r0
            return r1
        L42:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.databinding.CustomToastBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.baselib.databinding.CustomToastBinding");
    }
}
