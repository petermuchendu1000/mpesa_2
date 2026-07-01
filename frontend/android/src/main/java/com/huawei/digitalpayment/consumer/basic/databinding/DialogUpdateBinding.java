package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.round.RoundTextView;

public final class DialogUpdateBinding implements ViewBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final LinearLayout ShareDataUIState;
    public final RoundTextView btnUpdate;
    public final RoundTextView btnUpdateLater;
    public final ImageView ivBgUpdate;
    public final RoundLinearLayout lineView;
    public final RoundTextView newVersionFound;
    public final RoundTextView tvContent;
    public final RoundTextView tvNewVersions;
    public final RoundTextView tvVersion;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return getRoot();
        }
        getRoot();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private DialogUpdateBinding(LinearLayout linearLayout, RoundTextView roundTextView, RoundTextView roundTextView2, ImageView imageView, RoundLinearLayout roundLinearLayout, RoundTextView roundTextView3, RoundTextView roundTextView4, RoundTextView roundTextView5, RoundTextView roundTextView6) {
        this.ShareDataUIState = linearLayout;
        this.btnUpdate = roundTextView;
        this.btnUpdateLater = roundTextView2;
        this.ivBgUpdate = imageView;
        this.lineView = roundLinearLayout;
        this.newVersionFound = roundTextView3;
        this.tvContent = roundTextView4;
        this.tvNewVersions = roundTextView5;
        this.tvVersion = roundTextView6;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        LinearLayout linearLayout = this.ShareDataUIState;
        int i5 = i3 + 105;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return linearLayout;
        }
        throw null;
    }

    public static DialogUpdateBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DialogUpdateBinding dialogUpdateBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 15;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return dialogUpdateBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.basic.databinding.DialogUpdateBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.basic.databinding.DialogUpdateBinding.component2
            int r1 = r1 + 51
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.databinding.DialogUpdateBinding.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.basic.R.layout.dialog_update
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L31
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.basic.R.layout.dialog_update
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L31
        L20:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.basic.databinding.DialogUpdateBinding.component2
            int r4 = r4 + 59
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.basic.databinding.DialogUpdateBinding.copydefault = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L31
            r4 = 3
            int r4 = r4 / 4
        L31:
            com.huawei.digitalpayment.consumer.basic.databinding.DialogUpdateBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.databinding.DialogUpdateBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.basic.databinding.DialogUpdateBinding");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[PHI: r2
  0x0031: PHI (r2v4 com.huawei.common.widget.round.RoundTextView) = (r2v3 com.huawei.common.widget.round.RoundTextView), (r2v15 com.huawei.common.widget.round.RoundTextView) binds: [B:10:0x002f, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.basic.databinding.DialogUpdateBinding bind(android.view.View r13) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.basic.R.id.btn_update
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r13, r1)
            r5 = r2
            com.huawei.common.widget.round.RoundTextView r5 = (com.huawei.common.widget.round.RoundTextView) r5
            if (r5 == 0) goto L9d
            int r1 = com.huawei.digitalpayment.consumer.basic.databinding.DialogUpdateBinding.copydefault
            int r1 = r1 + 121
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.databinding.DialogUpdateBinding.component2 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L27
            int r1 = com.huawei.digitalpayment.consumer.basic.R.id.btnUpdateLater
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r13, r1)
            com.huawei.common.widget.round.RoundTextView r2 = (com.huawei.common.widget.round.RoundTextView) r2
            r3 = 1
            int r3 = r3 / 0
            if (r2 == 0) goto L9d
            goto L31
        L27:
            int r1 = com.huawei.digitalpayment.consumer.basic.R.id.btnUpdateLater
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r13, r1)
            com.huawei.common.widget.round.RoundTextView r2 = (com.huawei.common.widget.round.RoundTextView) r2
            if (r2 == 0) goto L9d
        L31:
            r6 = r2
            int r1 = com.huawei.digitalpayment.consumer.basic.R.id.iv_bg_update
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r13, r1)
            r7 = r2
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L9d
            int r1 = com.huawei.digitalpayment.consumer.basic.R.id.line_view
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r13, r1)
            r8 = r2
            com.huawei.common.widget.round.RoundLinearLayout r8 = (com.huawei.common.widget.round.RoundLinearLayout) r8
            if (r8 == 0) goto L9d
            int r1 = com.huawei.digitalpayment.consumer.basic.databinding.DialogUpdateBinding.component2
            int r1 = r1 + 119
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.databinding.DialogUpdateBinding.copydefault = r2
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.consumer.basic.R.id.new_version_found
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r13, r1)
            r9 = r2
            com.huawei.common.widget.round.RoundTextView r9 = (com.huawei.common.widget.round.RoundTextView) r9
            if (r9 == 0) goto L9d
            int r1 = com.huawei.digitalpayment.consumer.basic.R.id.tvContent
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r13, r1)
            r10 = r2
            com.huawei.common.widget.round.RoundTextView r10 = (com.huawei.common.widget.round.RoundTextView) r10
            if (r10 == 0) goto L9d
            int r1 = com.huawei.digitalpayment.consumer.basic.R.id.tv_new_versions
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r13, r1)
            r11 = r2
            com.huawei.common.widget.round.RoundTextView r11 = (com.huawei.common.widget.round.RoundTextView) r11
            if (r11 == 0) goto L9d
            int r1 = com.huawei.digitalpayment.consumer.basic.databinding.DialogUpdateBinding.copydefault
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.databinding.DialogUpdateBinding.component2 = r2
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.consumer.basic.R.id.tv_version
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r13, r1)
            r12 = r2
            com.huawei.common.widget.round.RoundTextView r12 = (com.huawei.common.widget.round.RoundTextView) r12
            if (r12 == 0) goto L9d
            com.huawei.digitalpayment.consumer.basic.databinding.DialogUpdateBinding r1 = new com.huawei.digitalpayment.consumer.basic.databinding.DialogUpdateBinding
            r4 = r13
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            int r13 = com.huawei.digitalpayment.consumer.basic.databinding.DialogUpdateBinding.copydefault
            int r13 = r13 + 117
            int r2 = r13 % 128
            com.huawei.digitalpayment.consumer.basic.databinding.DialogUpdateBinding.component2 = r2
            int r13 = r13 % r0
            if (r13 != 0) goto L9b
            return r1
        L9b:
            r13 = 0
            throw r13
        L9d:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.databinding.DialogUpdateBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.basic.databinding.DialogUpdateBinding");
    }
}
