package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText;
import com.huawei.digitalpayment.consumer.baselib.widget.code.SafeInputKeyboard;

public final class FragmentCheckOutBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final ConstraintLayout clContent;
    private final ConstraintLayout copydefault;
    public final CodeEditText editPin;
    public final ImageView ivClose;
    public final RoundTextView line;
    public final LinearLayout llPayMethod;
    public final RoundTextView tvAmount;
    public final RoundTextView tvCurrency;
    public final RoundTextView tvCurrencyPre;
    public final RoundTextView tvDisplayItem;
    public final RoundTextView tvSubTitle;
    public final RoundTextView tvTitle;
    public final SafeInputKeyboard virtualKeyboardView;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 9;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return getRoot();
        }
        getRoot();
        throw null;
    }

    private FragmentCheckOutBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, CodeEditText codeEditText, ImageView imageView, RoundTextView roundTextView, LinearLayout linearLayout, RoundTextView roundTextView2, RoundTextView roundTextView3, RoundTextView roundTextView4, RoundTextView roundTextView5, RoundTextView roundTextView6, RoundTextView roundTextView7, SafeInputKeyboard safeInputKeyboard) {
        this.copydefault = constraintLayout;
        this.clContent = constraintLayout2;
        this.editPin = codeEditText;
        this.ivClose = imageView;
        this.line = roundTextView;
        this.llPayMethod = linearLayout;
        this.tvAmount = roundTextView2;
        this.tvCurrency = roundTextView3;
        this.tvCurrencyPre = roundTextView4;
        this.tvDisplayItem = roundTextView5;
        this.tvSubTitle = roundTextView6;
        this.tvTitle = roundTextView7;
        this.virtualKeyboardView = safeInputKeyboard;
    }

    @Override
    public ConstraintLayout getRoot() {
        ConstraintLayout constraintLayout;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 9;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            constraintLayout = this.copydefault;
            int i4 = 76 / 0;
        } else {
            constraintLayout = this.copydefault;
        }
        int i5 = i2 + 33;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static FragmentCheckOutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentCheckOutBinding fragmentCheckOutBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 113;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentCheckOutBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r4
  0x0023: PHI (r4v2 android.view.View) = (r4v1 android.view.View), (r4v5 android.view.View) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckOutBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckOutBinding.ShareDataUIState
            int r1 = r1 + 101
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckOutBinding.component3 = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 != 0) goto L19
            int r1 = com.huawei.digitalpayment.checkoutUi.R.layout.fragment_check_out
            android.view.View r4 = r4.inflate(r1, r5, r2)
            r6 = r6 ^ r2
            if (r6 == r2) goto L33
            goto L23
        L19:
            int r1 = com.huawei.digitalpayment.checkoutUi.R.layout.fragment_check_out
            r3 = 0
            android.view.View r4 = r4.inflate(r1, r5, r3)
            r6 = r6 ^ r2
            if (r6 == r2) goto L33
        L23:
            r5.addView(r4)
            int r5 = com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckOutBinding.ShareDataUIState
            int r5 = r5 + 81
            int r6 = r5 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckOutBinding.component3 = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L33
            r5 = 4
            int r5 = r5 / r5
        L33:
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckOutBinding r4 = bind(r4)
            int r5 = com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckOutBinding.ShareDataUIState
            int r5 = r5 + 31
            int r6 = r5 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckOutBinding.component3 = r6
            int r5 = r5 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckOutBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckOutBinding");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[PHI: r3
  0x0037: PHI (r3v4 android.widget.ImageView) = (r3v3 android.widget.ImageView), (r3v14 android.widget.ImageView) binds: [B:10:0x0035, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckOutBinding bind(android.view.View r17) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckOutBinding.bind(android.view.View):com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckOutBinding");
    }
}
