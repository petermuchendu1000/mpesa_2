package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView;
import com.huawei.digitalpayment.consumer.history.R;

public final class HistoryToolbarBinding implements ViewBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final ConstraintLayout component3;
    public final ImageView ivBack;
    public final ConstraintLayout root;
    public final BaseTextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = copydefault + 15;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private HistoryToolbarBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, BaseTextView baseTextView) {
        this.component3 = constraintLayout;
        this.ivBack = imageView;
        this.root = constraintLayout2;
        this.tvTitle = baseTextView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 7;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.component3;
        int i5 = i2 + 9;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static HistoryToolbarBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        component2 = i2 % 128;
        HistoryToolbarBinding historyToolbarBindingInflate = inflate(layoutInflater, null, i2 % 2 != 0);
        int i3 = copydefault + 117;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return historyToolbarBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[PHI: r4
  0x0023: PHI (r4v2 android.view.View) = (r4v1 android.view.View), (r4v6 android.view.View) binds: [B:8:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.history.databinding.HistoryToolbarBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.history.databinding.HistoryToolbarBinding.component2
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.history.databinding.HistoryToolbarBinding.copydefault = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.history.R.layout.history_toolbar
            android.view.View r4 = r4.inflate(r1, r5, r2)
            if (r6 == 0) goto L26
            goto L23
        L18:
            int r1 = com.huawei.digitalpayment.consumer.history.R.layout.history_toolbar
            r3 = 0
            android.view.View r4 = r4.inflate(r1, r5, r3)
            r6 = r6 ^ r2
            if (r6 == 0) goto L23
            goto L26
        L23:
            r5.addView(r4)
        L26:
            com.huawei.digitalpayment.consumer.history.databinding.HistoryToolbarBinding r4 = bind(r4)
            int r5 = com.huawei.digitalpayment.consumer.history.databinding.HistoryToolbarBinding.copydefault
            int r5 = r5 + 19
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.history.databinding.HistoryToolbarBinding.component2 = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L36
            return r4
        L36:
            r4 = 0
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.history.databinding.HistoryToolbarBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.history.databinding.HistoryToolbarBinding");
    }

    public static HistoryToolbarBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.id.ivBack;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i3);
            if (imageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                int i4 = R.id.tvTitle;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i4);
                if (baseTextView != null) {
                    HistoryToolbarBinding historyToolbarBinding = new HistoryToolbarBinding(constraintLayout, imageView, constraintLayout, baseTextView);
                    int i5 = component2 + 79;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                    return historyToolbarBinding;
                }
                i3 = i4;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
