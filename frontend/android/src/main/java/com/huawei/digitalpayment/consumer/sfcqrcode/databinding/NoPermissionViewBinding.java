package com.huawei.digitalpayment.consumer.sfcqrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfcqrcode.R;

public final class NoPermissionViewBinding implements ViewBinding {
    private static int component1 = 1;
    private static int component2;
    private final ConstraintLayout ShareDataUIState;
    public final TextView tvAccessCameraTips;
    public final RoundTextView tvGoToSettings;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component2 + 1;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private NoPermissionViewBinding(ConstraintLayout constraintLayout, TextView textView, RoundTextView roundTextView) {
        this.ShareDataUIState = constraintLayout;
        this.tvAccessCameraTips = textView;
        this.tvGoToSettings = roundTextView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 101;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.ShareDataUIState;
        int i5 = i2 + 77;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static NoPermissionViewBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 123;
        component2 = i2 % 128;
        NoPermissionViewBinding noPermissionViewBindingInflate = inflate(layoutInflater, null, i2 % 2 != 0);
        int i3 = component1 + 49;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return noPermissionViewBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r3
  0x0022: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfcqrcode.databinding.NoPermissionViewBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.databinding.NoPermissionViewBinding.component1
            int r1 = r1 + 13
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.NoPermissionViewBinding.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.R.layout.no_permission_view
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L37
            goto L22
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.R.layout.no_permission_view
            android.view.View r3 = r3.inflate(r1, r4, r2)
            r1 = 1
            r5 = r5 ^ r1
            if (r5 == r1) goto L37
        L22:
            int r5 = com.huawei.digitalpayment.consumer.sfcqrcode.databinding.NoPermissionViewBinding.component2
            int r5 = r5 + 55
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.NoPermissionViewBinding.component1 = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L34
            r4.addView(r3)
            r4 = 15
            int r4 = r4 / r2
            goto L37
        L34:
            r4.addView(r3)
        L37:
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.NoPermissionViewBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcqrcode.databinding.NoPermissionViewBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfcqrcode.databinding.NoPermissionViewBinding");
    }

    public static NoPermissionViewBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.tv_access_camera_tips;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
        if (textView != null) {
            int i3 = component2 + 7;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 = R.id.tv_go_to_settings;
            RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i2);
            if (roundTextView != null) {
                NoPermissionViewBinding noPermissionViewBinding = new NoPermissionViewBinding((ConstraintLayout) view, textView, roundTextView);
                int i4 = component1 + 25;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return noPermissionViewBinding;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
