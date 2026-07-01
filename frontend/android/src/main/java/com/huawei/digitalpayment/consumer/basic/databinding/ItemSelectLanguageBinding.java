package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.SingleRadioButton;
import com.huawei.digitalpayment.consumer.basic.R;

public final class ItemSelectLanguageBinding implements ViewBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final ConstraintLayout component2;
    public final SingleRadioButton ivSelected;
    public final TextView tvContent;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component3 + 83;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ItemSelectLanguageBinding(ConstraintLayout constraintLayout, SingleRadioButton singleRadioButton, TextView textView) {
        this.component2 = constraintLayout;
        this.ivSelected = singleRadioButton;
        this.tvContent = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 69;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        ConstraintLayout constraintLayout = this.component2;
        int i4 = i2 + 37;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayout;
    }

    public static ItemSelectLanguageBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component3 = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[PHI: r4
  0x0023: PHI (r4v4 android.view.View) = (r4v1 android.view.View), (r4v6 android.view.View) binds: [B:8:0x0020, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.basic.databinding.ItemSelectLanguageBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.basic.databinding.ItemSelectLanguageBinding.copydefault
            int r1 = r1 + 53
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.databinding.ItemSelectLanguageBinding.component3 = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            int r1 = com.huawei.digitalpayment.consumer.basic.R.layout.item_select_language
            android.view.View r4 = r4.inflate(r1, r5, r3)
            if (r6 == r2) goto L23
            goto L31
        L19:
            int r1 = com.huawei.digitalpayment.consumer.basic.R.layout.item_select_language
            android.view.View r4 = r4.inflate(r1, r5, r3)
            r6 = r6 ^ r2
            if (r6 == 0) goto L23
            goto L31
        L23:
            int r6 = com.huawei.digitalpayment.consumer.basic.databinding.ItemSelectLanguageBinding.copydefault
            int r6 = r6 + 113
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.basic.databinding.ItemSelectLanguageBinding.component3 = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L36
            r5.addView(r4)
        L31:
            com.huawei.digitalpayment.consumer.basic.databinding.ItemSelectLanguageBinding r4 = bind(r4)
            return r4
        L36:
            r5.addView(r4)
            r4 = 0
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.databinding.ItemSelectLanguageBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.basic.databinding.ItemSelectLanguageBinding");
    }

    public static ItemSelectLanguageBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.iv_selected;
        SingleRadioButton singleRadioButton = (SingleRadioButton) ViewBindings.findChildViewById(view, i4);
        if (singleRadioButton != null) {
            i4 = R.id.tv_content;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
            if (textView != null) {
                ItemSelectLanguageBinding itemSelectLanguageBinding = new ItemSelectLanguageBinding((ConstraintLayout) view, singleRadioButton, textView);
                int i5 = copydefault + 55;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 35 / 0;
                }
                return itemSelectLanguageBinding;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
