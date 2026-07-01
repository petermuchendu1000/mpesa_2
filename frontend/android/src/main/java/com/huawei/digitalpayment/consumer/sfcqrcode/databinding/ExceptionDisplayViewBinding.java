package com.huawei.digitalpayment.consumer.sfcqrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;

public final class ExceptionDisplayViewBinding implements ViewBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    public final LoadingButton btnConfirm;
    public final CardView cardContainer;
    private final ConstraintLayout component1;
    public final ImageView exIvBack;
    public final TextView exTvTitle;
    public final View guideLine;
    public final RoundImageView ivIcon;
    public final ConstraintLayout toolbarRoot;
    public final TextView tvTips;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component3 + 11;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return root;
    }

    private ExceptionDisplayViewBinding(ConstraintLayout constraintLayout, LoadingButton loadingButton, CardView cardView, ImageView imageView, TextView textView, View view, RoundImageView roundImageView, ConstraintLayout constraintLayout2, TextView textView2, TextView textView3) {
        this.component1 = constraintLayout;
        this.btnConfirm = loadingButton;
        this.cardContainer = cardView;
        this.exIvBack = imageView;
        this.exTvTitle = textView;
        this.guideLine = view;
        this.ivIcon = roundImageView;
        this.toolbarRoot = constraintLayout2;
        this.tvTips = textView2;
        this.tvTitle = textView3;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 21;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayout = this.component1;
        int i4 = i2 + 63;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return constraintLayout;
        }
        obj.hashCode();
        throw null;
    }

    public static ExceptionDisplayViewBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ExceptionDisplayViewBinding exceptionDisplayViewBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 87;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return exceptionDisplayViewBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r4
  0x0021: PHI (r4v2 android.view.View) = (r4v1 android.view.View), (r4v5 android.view.View) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ExceptionDisplayViewBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ExceptionDisplayViewBinding.component3
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ExceptionDisplayViewBinding.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L19
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.R.layout.exception_display_view
            android.view.View r4 = r4.inflate(r1, r5, r3)
            if (r6 == 0) goto L34
            goto L21
        L19:
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.R.layout.exception_display_view
            android.view.View r4 = r4.inflate(r1, r5, r3)
            if (r6 == 0) goto L34
        L21:
            int r6 = com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ExceptionDisplayViewBinding.copydefault
            int r6 = r6 + 17
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ExceptionDisplayViewBinding.component3 = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L30
            r5.addView(r4)
            goto L34
        L30:
            r5.addView(r4)
            throw r2
        L34:
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ExceptionDisplayViewBinding r4 = bind(r4)
            int r5 = com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ExceptionDisplayViewBinding.component3
            int r5 = r5 + 75
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ExceptionDisplayViewBinding.copydefault = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L44
            return r4
        L44:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ExceptionDisplayViewBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ExceptionDisplayViewBinding");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d A[PHI: r2
  0x003d: PHI (r2v5 androidx.cardview.widget.CardView) = (r2v4 androidx.cardview.widget.CardView), (r2v18 androidx.cardview.widget.CardView) binds: [B:12:0x003b, B:9:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ExceptionDisplayViewBinding bind(android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ExceptionDisplayViewBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.sfcqrcode.databinding.ExceptionDisplayViewBinding");
    }
}
