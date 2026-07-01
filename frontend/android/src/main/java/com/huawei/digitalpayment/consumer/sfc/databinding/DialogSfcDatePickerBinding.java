package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.date.WheelPicker;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;

public final class DialogSfcDatePickerBinding implements ViewBinding {
    private static int component1 = 1;
    private static int copydefault;
    public final LoadingButton btnConfirm;
    private final RoundConstraintLayout component3;
    public final RoundImageView ivBack;
    public final RoundTextView line;
    public final LinearLayout llDate;
    public final TextView tvTitle;
    public final WheelPicker wheelDay;
    public final WheelPicker wheelMonth;
    public final WheelPicker wheelyear;

    @Override
    public View getRoot() {
        RoundConstraintLayout root;
        int i = 2 % 2;
        int i2 = copydefault + 7;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            root = getRoot();
            int i3 = 23 / 0;
        } else {
            root = getRoot();
        }
        int i4 = component1 + 109;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private DialogSfcDatePickerBinding(RoundConstraintLayout roundConstraintLayout, LoadingButton loadingButton, RoundImageView roundImageView, RoundTextView roundTextView, LinearLayout linearLayout, TextView textView, WheelPicker wheelPicker, WheelPicker wheelPicker2, WheelPicker wheelPicker3) {
        this.component3 = roundConstraintLayout;
        this.btnConfirm = loadingButton;
        this.ivBack = roundImageView;
        this.line = roundTextView;
        this.llDate = linearLayout;
        this.tvTitle = textView;
        this.wheelDay = wheelPicker;
        this.wheelMonth = wheelPicker2;
        this.wheelyear = wheelPicker3;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        throw null;
    }

    public static DialogSfcDatePickerBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        component1 = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
  0x0021: PHI (r3v5 android.view.View) = (r3v1 android.view.View), (r3v6 android.view.View) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.DialogSfcDatePickerBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.DialogSfcDatePickerBinding.copydefault
            int r1 = r1 + 21
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.DialogSfcDatePickerBinding.component1 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L19
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.dialog_sfc_date_picker
            android.view.View r3 = r3.inflate(r1, r4, r2)
            r1 = 1
            if (r5 == r1) goto L21
            goto L36
        L19:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.dialog_sfc_date_picker
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L36
        L21:
            int r5 = com.huawei.digitalpayment.consumer.sfc.databinding.DialogSfcDatePickerBinding.component1
            int r5 = r5 + 121
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.DialogSfcDatePickerBinding.copydefault = r1
            int r5 = r5 % r0
            if (r5 == 0) goto L33
            r4.addView(r3)
            r4 = 10
            int r4 = r4 / r2
            goto L36
        L33:
            r4.addView(r3)
        L36:
            com.huawei.digitalpayment.consumer.sfc.databinding.DialogSfcDatePickerBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.DialogSfcDatePickerBinding.copydefault
            int r4 = r4 + 11
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.DialogSfcDatePickerBinding.component1 = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L46
            return r3
        L46:
            r3 = 0
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.DialogSfcDatePickerBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.DialogSfcDatePickerBinding");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        if (r2 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
    
        if (r2 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        r1 = new com.huawei.digitalpayment.consumer.sfc.databinding.DialogSfcDatePickerBinding((com.huawei.common.widget.round.RoundConstraintLayout) r13, r5, r6, r7, r8, r9, r10, r11, r2);
        r13 = com.huawei.digitalpayment.consumer.sfc.databinding.DialogSfcDatePickerBinding.copydefault + 115;
        com.huawei.digitalpayment.consumer.sfc.databinding.DialogSfcDatePickerBinding.component1 = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        if ((r13 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        r13 = 24 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.DialogSfcDatePickerBinding bind(android.view.View r13) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.DialogSfcDatePickerBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.sfc.databinding.DialogSfcDatePickerBinding");
    }
}
