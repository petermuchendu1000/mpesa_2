package com.huawei.digitalpayment.datepicker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class DatepickerLayoutMondayStartBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final LinearLayout component2;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        return root;
    }

    private DatepickerLayoutMondayStartBinding(LinearLayout linearLayout) {
        this.component2 = linearLayout;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static DatepickerLayoutMondayStartBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 19;
        ShareDataUIState = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r3
  0x0022: PHI (r3v4 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x0020, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutMondayStartBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutMondayStartBinding.ShareDataUIState
            int r1 = r1 + 37
            int r2 = r1 % 128
            com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutMondayStartBinding.component3 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L19
            int r1 = com.huawei.digitalpayment.datepicker.R.layout.datepicker_layout_monday_start
            r2 = 1
            android.view.View r3 = r3.inflate(r1, r4, r2)
            r5 = r5 ^ r2
            if (r5 == 0) goto L22
            goto L25
        L19:
            int r1 = com.huawei.digitalpayment.datepicker.R.layout.datepicker_layout_monday_start
            r2 = 0
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L25
        L22:
            r4.addView(r3)
        L25:
            com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutMondayStartBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutMondayStartBinding.component3
            int r4 = r4 + 91
            int r5 = r4 % 128
            com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutMondayStartBinding.ShareDataUIState = r5
            int r4 = r4 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutMondayStartBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutMondayStartBinding");
    }

    public static DatepickerLayoutMondayStartBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        DatepickerLayoutMondayStartBinding datepickerLayoutMondayStartBinding = new DatepickerLayoutMondayStartBinding((LinearLayout) view);
        int i3 = ShareDataUIState + 109;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return datepickerLayoutMondayStartBinding;
        }
        throw null;
    }
}
