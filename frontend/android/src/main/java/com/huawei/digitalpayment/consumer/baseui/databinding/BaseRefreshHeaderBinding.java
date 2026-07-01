package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.baseui.R;

public final class BaseRefreshHeaderBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final LinearLayout copydefault;
    public final LinearLayout fgWallet;
    public final ImageView ivImg;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        int i4 = ShareDataUIState + 113;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return root;
    }

    private BaseRefreshHeaderBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView) {
        this.copydefault = linearLayout;
        this.fgWallet = linearLayout2;
        this.ivImg = imageView;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 29;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        LinearLayout linearLayout = this.copydefault;
        int i5 = i3 + 15;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return linearLayout;
        }
        throw null;
    }

    public static BaseRefreshHeaderBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return inflate(layoutInflater, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.baseui.databinding.BaseRefreshHeaderBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baseui.databinding.BaseRefreshHeaderBinding.ShareDataUIState
            int r1 = r1 + 45
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baseui.databinding.BaseRefreshHeaderBinding.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.baseui.R.layout.base_refresh_header
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.baseui.R.layout.base_refresh_header
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
        L20:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.baseui.databinding.BaseRefreshHeaderBinding.component2
            int r4 = r4 + 119
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.baseui.databinding.BaseRefreshHeaderBinding.ShareDataUIState = r5
            int r4 = r4 % r0
        L2c:
            com.huawei.digitalpayment.consumer.baseui.databinding.BaseRefreshHeaderBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baseui.databinding.BaseRefreshHeaderBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.baseui.databinding.BaseRefreshHeaderBinding");
    }

    public static BaseRefreshHeaderBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.iv_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i4);
        if (imageView != null) {
            BaseRefreshHeaderBinding baseRefreshHeaderBinding = new BaseRefreshHeaderBinding(linearLayout, linearLayout, imageView);
            int i5 = ShareDataUIState + 119;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return baseRefreshHeaderBinding;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
