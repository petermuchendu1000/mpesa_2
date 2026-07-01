package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.qrcode.R;

public final class QrcodeLayoutScanGuideDialogBinding implements ViewBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    public final LoadingButton btnConfirm;
    public final TextView chooseCouponTitle;
    private final RoundConstraintLayout copydefault;
    public final RoundTextView linerselect;
    public final LinearLayout llTypeofcode;
    public final TextView pointtoamera;
    public final ImageView scanlogo;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        RoundConstraintLayout root = getRoot();
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        return root;
    }

    private QrcodeLayoutScanGuideDialogBinding(RoundConstraintLayout roundConstraintLayout, LoadingButton loadingButton, TextView textView, RoundTextView roundTextView, LinearLayout linearLayout, TextView textView2, ImageView imageView) {
        this.copydefault = roundConstraintLayout;
        this.btnConfirm = loadingButton;
        this.chooseCouponTitle = textView;
        this.linerselect = roundTextView;
        this.llTypeofcode = linearLayout;
        this.pointtoamera = textView2;
        this.scanlogo = imageView;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 3;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RoundConstraintLayout roundConstraintLayout = this.copydefault;
        int i4 = i2 + 53;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return roundConstraintLayout;
    }

    public static QrcodeLayoutScanGuideDialogBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        QrcodeLayoutScanGuideDialogBinding qrcodeLayoutScanGuideDialogBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 41;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return qrcodeLayoutScanGuideDialogBindingInflate;
    }

    public static QrcodeLayoutScanGuideDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.qrcode_layout_scan_guide_dialog, viewGroup, false);
        if (!(!z)) {
            int i2 = component3 + 9;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                viewGroup.addView(viewInflate);
            } else {
                viewGroup.addView(viewInflate);
                throw null;
            }
        }
        QrcodeLayoutScanGuideDialogBinding qrcodeLayoutScanGuideDialogBindingBind = bind(viewInflate);
        int i3 = component3 + 67;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return qrcodeLayoutScanGuideDialogBindingBind;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[PHI: r3
  0x0049: PHI (r3v5 com.huawei.common.widget.round.RoundTextView) = (r3v4 com.huawei.common.widget.round.RoundTextView), (r3v13 com.huawei.common.widget.round.RoundTextView) binds: [B:14:0x0047, B:11:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.qrcode.databinding.QrcodeLayoutScanGuideDialogBinding bind(android.view.View r12) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.qrcode.databinding.QrcodeLayoutScanGuideDialogBinding.component3
            int r1 = r1 + 93
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.qrcode.databinding.QrcodeLayoutScanGuideDialogBinding.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto Laa
            int r1 = com.huawei.digitalpayment.consumer.qrcode.R.id.btn_confirm
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r6 = r3
            com.huawei.common.widget.LoadingButton r6 = (com.huawei.common.widget.LoadingButton) r6
            if (r6 == 0) goto L96
            int r1 = com.huawei.digitalpayment.consumer.qrcode.R.id.choose_coupon_title
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r7 = r3
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L96
            int r1 = com.huawei.digitalpayment.consumer.qrcode.databinding.QrcodeLayoutScanGuideDialogBinding.component3
            int r1 = r1 + 61
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.qrcode.databinding.QrcodeLayoutScanGuideDialogBinding.component2 = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L3f
            int r1 = com.huawei.digitalpayment.consumer.qrcode.R.id.linerselect
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            com.huawei.common.widget.round.RoundTextView r3 = (com.huawei.common.widget.round.RoundTextView) r3
            r4 = 90
            int r4 = r4 / 0
            if (r3 == 0) goto L96
            goto L49
        L3f:
            int r1 = com.huawei.digitalpayment.consumer.qrcode.R.id.linerselect
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            com.huawei.common.widget.round.RoundTextView r3 = (com.huawei.common.widget.round.RoundTextView) r3
            if (r3 == 0) goto L96
        L49:
            r8 = r3
            int r1 = com.huawei.digitalpayment.consumer.qrcode.databinding.QrcodeLayoutScanGuideDialogBinding.component3
            int r1 = r1 + 123
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.qrcode.databinding.QrcodeLayoutScanGuideDialogBinding.component2 = r3
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.consumer.qrcode.R.id.ll_typeofcode
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r9 = r3
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            if (r9 == 0) goto L96
            int r1 = com.huawei.digitalpayment.consumer.qrcode.R.id.pointtoamera
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r10 = r3
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L96
            int r1 = com.huawei.digitalpayment.consumer.qrcode.databinding.QrcodeLayoutScanGuideDialogBinding.component3
            int r1 = r1 + 77
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.qrcode.databinding.QrcodeLayoutScanGuideDialogBinding.component2 = r3
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.consumer.qrcode.R.id.scanlogo
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r11 = r3
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            if (r11 == 0) goto L96
            com.huawei.digitalpayment.consumer.qrcode.databinding.QrcodeLayoutScanGuideDialogBinding r1 = new com.huawei.digitalpayment.consumer.qrcode.databinding.QrcodeLayoutScanGuideDialogBinding
            r5 = r12
            com.huawei.common.widget.round.RoundConstraintLayout r5 = (com.huawei.common.widget.round.RoundConstraintLayout) r5
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            int r12 = com.huawei.digitalpayment.consumer.qrcode.databinding.QrcodeLayoutScanGuideDialogBinding.component3
            int r12 = r12 + 79
            int r3 = r12 % 128
            com.huawei.digitalpayment.consumer.qrcode.databinding.QrcodeLayoutScanGuideDialogBinding.component2 = r3
            int r12 = r12 % r0
            if (r12 != 0) goto L92
            return r1
        L92:
            r2.hashCode()
            throw r2
        L96:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        Laa:
            int r0 = com.huawei.digitalpayment.consumer.qrcode.R.id.btn_confirm
            android.view.View r12 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r0)
            com.huawei.common.widget.LoadingButton r12 = (com.huawei.common.widget.LoadingButton) r12
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.databinding.QrcodeLayoutScanGuideDialogBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.qrcode.databinding.QrcodeLayoutScanGuideDialogBinding");
    }
}
