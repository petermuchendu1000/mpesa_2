package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;

public final class ComposeViewLayoutBinding implements ViewBinding {
    private static int component3 = 1;
    private static int copydefault;
    private final ComposeView component2;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return getRoot();
        }
        getRoot();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ComposeViewLayoutBinding(ComposeView composeView) {
        this.component2 = composeView;
    }

    @Override
    public ComposeView getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        ComposeView composeView = this.component2;
        int i5 = i3 + 95;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return composeView;
    }

    public static ComposeViewLayoutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ComposeViewLayoutBinding composeViewLayoutBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 41;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return composeViewLayoutBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v6 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ComposeViewLayoutBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ComposeViewLayoutBinding.copydefault
            int r1 = r1 + 87
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ComposeViewLayoutBinding.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.compose_view_layout
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L23
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.compose_view_layout
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L23
        L20:
            r4.addView(r3)
        L23:
            com.huawei.digitalpayment.consumer.sfc.databinding.ComposeViewLayoutBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.ComposeViewLayoutBinding.copydefault
            int r4 = r4 + 27
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ComposeViewLayoutBinding.component3 = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L33
            return r3
        L33:
            r3 = 0
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ComposeViewLayoutBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.ComposeViewLayoutBinding");
    }

    public static ComposeViewLayoutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ComposeViewLayoutBinding composeViewLayoutBinding = new ComposeViewLayoutBinding((ComposeView) view);
        int i3 = component3 + 45;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return composeViewLayoutBinding;
    }
}
