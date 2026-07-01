package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class SfcSecurityInputViewBinding implements ViewBinding {
    private static int component1 = 1;
    private static int component2;
    public final CommonInputView answer;
    private final ConstraintLayout copydefault;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return root;
    }

    private SfcSecurityInputViewBinding(ConstraintLayout constraintLayout, CommonInputView commonInputView) {
        this.copydefault = constraintLayout;
        this.answer = commonInputView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 51;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.copydefault;
        int i5 = i2 + 119;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return constraintLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static SfcSecurityInputViewBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 111;
        component1 = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
  0x0021: PHI (r3v4 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.SfcSecurityInputViewBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.SfcSecurityInputViewBinding.component2
            int r1 = r1 + 41
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.SfcSecurityInputViewBinding.component1 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.sfc_security_input_view
            r2 = 1
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == r2) goto L21
            goto L2d
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.sfc_security_input_view
            r2 = 0
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2d
        L21:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.SfcSecurityInputViewBinding.component1
            int r4 = r4 + 105
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.SfcSecurityInputViewBinding.component2 = r5
            int r4 = r4 % r0
        L2d:
            com.huawei.digitalpayment.consumer.sfc.databinding.SfcSecurityInputViewBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.SfcSecurityInputViewBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.SfcSecurityInputViewBinding");
    }

    public static SfcSecurityInputViewBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.answer;
        CommonInputView commonInputView = (CommonInputView) ViewBindings.findChildViewById(view, i4);
        if (commonInputView != null) {
            SfcSecurityInputViewBinding sfcSecurityInputViewBinding = new SfcSecurityInputViewBinding((ConstraintLayout) view, commonInputView);
            int i5 = component1 + 39;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return sfcSecurityInputViewBinding;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
