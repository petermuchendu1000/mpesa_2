package com.huawei.digitalpayment.consumer.sfcqrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.base.ui.widget.SafeInputKeyboard;
import com.huawei.digitalpayment.consumer.base.ui.widget.SfcAmountInputView;
import com.huawei.digitalpayment.consumer.sfcqrcode.R;

public final class QrSetAmountBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    public final LoadingButton btnConfirm;
    private final ConstraintLayout component3;
    public final SfcAmountInputView inputAmount;
    public final SafeInputKeyboard virtualKeyboardView;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = ShareDataUIState + 113;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private QrSetAmountBinding(ConstraintLayout constraintLayout, LoadingButton loadingButton, SfcAmountInputView sfcAmountInputView, SafeInputKeyboard safeInputKeyboard) {
        this.component3 = constraintLayout;
        this.btnConfirm = loadingButton;
        this.inputAmount = sfcAmountInputView;
        this.virtualKeyboardView = safeInputKeyboard;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 11;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.component3;
        int i5 = i2 + 77;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return constraintLayout;
        }
        throw null;
    }

    public static QrSetAmountBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        ShareDataUIState = i2 % 128;
        QrSetAmountBinding qrSetAmountBindingInflate = inflate(layoutInflater, null, i2 % 2 != 0);
        int i3 = ShareDataUIState + 105;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return qrSetAmountBindingInflate;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
  0x0021: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfcqrcode.databinding.QrSetAmountBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.databinding.QrSetAmountBinding.ShareDataUIState
            int r1 = r1 + 37
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.QrSetAmountBinding.copydefault = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.R.layout.qr_set_amount
            r2 = 1
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L36
            goto L21
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.R.layout.qr_set_amount
            r2 = 0
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L36
        L21:
            int r5 = com.huawei.digitalpayment.consumer.sfcqrcode.databinding.QrSetAmountBinding.copydefault
            int r5 = r5 + 109
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.QrSetAmountBinding.ShareDataUIState = r1
            int r5 = r5 % r0
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfcqrcode.databinding.QrSetAmountBinding.copydefault
            int r4 = r4 + 53
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.QrSetAmountBinding.ShareDataUIState = r5
            int r4 = r4 % r0
        L36:
            com.huawei.digitalpayment.consumer.sfcqrcode.databinding.QrSetAmountBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcqrcode.databinding.QrSetAmountBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfcqrcode.databinding.QrSetAmountBinding");
    }

    public static QrSetAmountBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.btn_confirm;
        LoadingButton loadingButton = (LoadingButton) ViewBindings.findChildViewById(view, i2);
        if (loadingButton != null) {
            int i3 = copydefault + 45;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.input_amount;
            SfcAmountInputView sfcAmountInputView = (SfcAmountInputView) ViewBindings.findChildViewById(view, i2);
            if (sfcAmountInputView != null) {
                int i5 = ShareDataUIState + 35;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                i2 = R.id.virtualKeyboardView;
                SafeInputKeyboard safeInputKeyboard = (SafeInputKeyboard) ViewBindings.findChildViewById(view, i2);
                if (safeInputKeyboard != null) {
                    QrSetAmountBinding qrSetAmountBinding = new QrSetAmountBinding((ConstraintLayout) view, loadingButton, sfcAmountInputView, safeInputKeyboard);
                    int i7 = ShareDataUIState + 119;
                    copydefault = i7 % 128;
                    if (i7 % 2 != 0) {
                        return qrSetAmountBinding;
                    }
                    throw null;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
