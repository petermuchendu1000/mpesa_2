package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

public final class PopupDatePickerBinding implements ViewBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final LinearLayout ShareDataUIState;
    public final TextView btnOk;
    public final ConstraintLayout clDatePicker;
    public final TextView endTime;
    public final TextView endTimeString;
    public final TextView fromTime;
    public final TextView fromTimeString;
    public final ImageView iconDeleteHistory;
    public final View line;
    public final LinearLayout llContent;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        int i4 = copydefault + 33;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private PopupDatePickerBinding(LinearLayout linearLayout, TextView textView, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ImageView imageView, View view, LinearLayout linearLayout2) {
        this.ShareDataUIState = linearLayout;
        this.btnOk = textView;
        this.clDatePicker = constraintLayout;
        this.endTime = textView2;
        this.endTimeString = textView3;
        this.fromTime = textView4;
        this.fromTimeString = textView5;
        this.iconDeleteHistory = imageView;
        this.line = view;
        this.llContent = linearLayout2;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static PopupDatePickerBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        PopupDatePickerBinding popupDatePickerBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 9;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return popupDatePickerBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r3
  0x0022: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x0020, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.history.databinding.PopupDatePickerBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.history.databinding.PopupDatePickerBinding.copydefault
            int r1 = r1 + 119
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.history.databinding.PopupDatePickerBinding.component2 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L19
            int r1 = com.huawei.digitalpayment.consumer.history.R.layout.popup_date_picker
            r2 = 1
            android.view.View r3 = r3.inflate(r1, r4, r2)
            r5 = r5 ^ r2
            if (r5 == r2) goto L25
            goto L22
        L19:
            int r1 = com.huawei.digitalpayment.consumer.history.R.layout.popup_date_picker
            r2 = 0
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L25
        L22:
            r4.addView(r3)
        L25:
            com.huawei.digitalpayment.consumer.history.databinding.PopupDatePickerBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.history.databinding.PopupDatePickerBinding.component2
            int r4 = r4 + 119
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.history.databinding.PopupDatePickerBinding.copydefault = r5
            int r4 = r4 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.history.databinding.PopupDatePickerBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.history.databinding.PopupDatePickerBinding");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[PHI: r2
  0x0079: PHI (r2v11 android.widget.ImageView) = (r2v10 android.widget.ImageView), (r2v14 android.widget.ImageView) binds: [B:20:0x0077, B:17:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.history.databinding.PopupDatePickerBinding bind(android.view.View r14) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.btn_ok
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r1)
            r5 = r2
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L96
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.cl_date_picker
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r1)
            r6 = r2
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            if (r6 == 0) goto L96
            int r1 = com.huawei.digitalpayment.consumer.history.databinding.PopupDatePickerBinding.copydefault
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.history.databinding.PopupDatePickerBinding.component2 = r2
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.end_time
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r1)
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L96
            int r1 = com.huawei.digitalpayment.consumer.history.databinding.PopupDatePickerBinding.copydefault
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.history.databinding.PopupDatePickerBinding.component2 = r2
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.end_time_string
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r1)
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L96
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.from_time
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r1)
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L96
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.from_time_string
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r1)
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L96
            int r1 = com.huawei.digitalpayment.consumer.history.databinding.PopupDatePickerBinding.copydefault
            int r1 = r1 + 67
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.history.databinding.PopupDatePickerBinding.component2 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L6f
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.icon_delete_history
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            int r3 = r0 / 0
            if (r2 == 0) goto L96
            goto L79
        L6f:
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.icon_delete_history
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L96
        L79:
            r11 = r2
            int r1 = com.huawei.digitalpayment.consumer.history.databinding.PopupDatePickerBinding.copydefault
            int r1 = r1 + 117
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.history.databinding.PopupDatePickerBinding.component2 = r2
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.line
            android.view.View r12 = androidx.viewbinding.ViewBindings.findChildViewById(r14, r1)
            if (r12 == 0) goto L96
            r13 = r14
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            com.huawei.digitalpayment.consumer.history.databinding.PopupDatePickerBinding r14 = new com.huawei.digitalpayment.consumer.history.databinding.PopupDatePickerBinding
            r3 = r14
            r4 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        L96:
            android.content.res.Resources r14 = r14.getResources()
            java.lang.String r14 = r14.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.history.databinding.PopupDatePickerBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.history.databinding.PopupDatePickerBinding");
    }
}
