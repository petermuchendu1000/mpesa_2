package com.huawei.digitalpayment.datepicker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.datepicker.R;

public final class DatepickerLayoutDayviewDefaultBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final View bgEnd;
    public final View bgStart;
    private final FrameLayout component1;
    public final RoundTextView tvDay;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout root = getRoot();
        int i4 = copydefault + 61;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private DatepickerLayoutDayviewDefaultBinding(FrameLayout frameLayout, View view, View view2, RoundTextView roundTextView) {
        this.component1 = frameLayout;
        this.bgEnd = view;
        this.bgStart = view2;
        this.tvDay = roundTextView;
    }

    @Override
    public FrameLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        FrameLayout frameLayout = this.component1;
        int i5 = i3 + 59;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return frameLayout;
    }

    public static DatepickerLayoutDayviewDefaultBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return inflate(layoutInflater, null, false);
    }

    public static DatepickerLayoutDayviewDefaultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.datepicker_layout_dayview_default, viewGroup, false);
        if (!(!z)) {
            int i4 = ShareDataUIState + 47;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.addView(viewInflate);
            int i6 = copydefault + 7;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 4;
            }
        }
        return bind(viewInflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r2
  0x0023: PHI (r2v2 android.view.View) = (r2v1 android.view.View), (r2v4 android.view.View) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutDayviewDefaultBinding bind(android.view.View r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutDayviewDefaultBinding.copydefault
            int r1 = r1 + 3
            int r2 = r1 % 128
            com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutDayviewDefaultBinding.ShareDataUIState = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1b
            int r1 = com.huawei.digitalpayment.datepicker.R.id.bgEnd
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            r3 = 88
            int r3 = r3 / 0
            if (r2 == 0) goto L56
            goto L23
        L1b:
            int r1 = com.huawei.digitalpayment.datepicker.R.id.bgEnd
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            if (r2 == 0) goto L56
        L23:
            int r1 = com.huawei.digitalpayment.datepicker.R.id.bgStart
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            if (r3 == 0) goto L56
            int r1 = com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutDayviewDefaultBinding.ShareDataUIState
            int r1 = r1 + 71
            int r4 = r1 % 128
            com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutDayviewDefaultBinding.copydefault = r4
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.datepicker.R.id.tvDay
            android.view.View r4 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r1)
            com.huawei.common.widget.round.RoundTextView r4 = (com.huawei.common.widget.round.RoundTextView) r4
            if (r4 == 0) goto L56
            com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutDayviewDefaultBinding r1 = new com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutDayviewDefaultBinding
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            r1.<init>(r5, r2, r3, r4)
            int r5 = com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutDayviewDefaultBinding.copydefault
            int r5 = r5 + 55
            int r2 = r5 % 128
            com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutDayviewDefaultBinding.ShareDataUIState = r2
            int r5 = r5 % r0
            if (r5 == 0) goto L51
            return r1
        L51:
            r5 = 0
            r5.hashCode()
            throw r5
        L56:
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r5 = r5.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutDayviewDefaultBinding.bind(android.view.View):com.huawei.digitalpayment.datepicker.databinding.DatepickerLayoutDayviewDefaultBinding");
    }
}
