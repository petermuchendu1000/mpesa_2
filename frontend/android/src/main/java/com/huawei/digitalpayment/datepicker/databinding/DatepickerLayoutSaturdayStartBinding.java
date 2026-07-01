package com.huawei.digitalpayment.datepicker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;

public final class DatepickerLayoutSaturdayStartBinding implements ViewBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    private final LinearLayout copydefault;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return root;
    }

    private DatepickerLayoutSaturdayStartBinding(LinearLayout linearLayout) {
        this.copydefault = linearLayout;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 69;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        LinearLayout linearLayout = this.copydefault;
        int i5 = i2 + 5;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return linearLayout;
    }

    public static DatepickerLayoutSaturdayStartBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DatepickerLayoutSaturdayStartBinding datepickerLayoutSaturdayStartBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 7;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return datepickerLayoutSaturdayStartBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r4
  0x0021: PHI (r4v2 android.view.View) = (r4v1 android.view.View), (r4v5 android.view.View) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutSaturdayStartBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutSaturdayStartBinding.component3
            int r1 = r1 + 21
            int r2 = r1 % 128
            com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutSaturdayStartBinding.component1 = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L19
            int r1 = com.huawei.digitalpayment.datepicker.R.layout.datepicker_layout_saturday_start
            android.view.View r4 = r4.inflate(r1, r5, r2)
            if (r6 == 0) goto L37
            goto L21
        L19:
            int r1 = com.huawei.digitalpayment.datepicker.R.layout.datepicker_layout_saturday_start
            android.view.View r4 = r4.inflate(r1, r5, r2)
            if (r6 == 0) goto L37
        L21:
            int r6 = com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutSaturdayStartBinding.component3
            int r6 = r6 + 33
            int r1 = r6 % 128
            com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutSaturdayStartBinding.component1 = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L30
            r5.addView(r4)
            goto L37
        L30:
            r5.addView(r4)
            r3.hashCode()
            throw r3
        L37:
            com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutSaturdayStartBinding r4 = bind(r4)
            int r5 = com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutSaturdayStartBinding.component3
            int r5 = r5 + 67
            int r6 = r5 % 128
            com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutSaturdayStartBinding.component1 = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L47
            return r4
        L47:
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutSaturdayStartBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutSaturdayStartBinding");
    }

    public static DatepickerLayoutSaturdayStartBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        DatepickerLayoutSaturdayStartBinding datepickerLayoutSaturdayStartBinding = new DatepickerLayoutSaturdayStartBinding((LinearLayout) view);
        int i4 = component3 + 37;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return datepickerLayoutSaturdayStartBinding;
    }
}
