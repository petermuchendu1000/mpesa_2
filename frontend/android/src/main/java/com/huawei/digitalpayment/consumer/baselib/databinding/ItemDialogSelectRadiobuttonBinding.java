package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.baselib.R;
import com.huawei.digitalpayment.consumer.baselib.widget.imageview.StateListImageView;

public final class ItemDialogSelectRadiobuttonBinding implements ViewBinding {
    private static int component1 = 1;
    private static int copydefault;
    private final ConstraintLayout component3;
    public final StateListImageView ivSelected;
    public final ConstraintLayout layoutItem;
    public final TextView tvContent;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 83;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component1 + 55;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemDialogSelectRadiobuttonBinding(ConstraintLayout constraintLayout, StateListImageView stateListImageView, ConstraintLayout constraintLayout2, TextView textView) {
        this.component3 = constraintLayout;
        this.ivSelected = stateListImageView;
        this.layoutItem = constraintLayout2;
        this.tvContent = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        ConstraintLayout constraintLayout = this.component3;
        int i4 = i3 + 45;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayout;
    }

    public static ItemDialogSelectRadiobuttonBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemDialogSelectRadiobuttonBinding itemDialogSelectRadiobuttonBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 69;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return itemDialogSelectRadiobuttonBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.baselib.databinding.ItemDialogSelectRadiobuttonBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.databinding.ItemDialogSelectRadiobuttonBinding.copydefault
            int r1 = r1 + 13
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.databinding.ItemDialogSelectRadiobuttonBinding.component1 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.layout.item_dialog_select_radiobutton
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L31
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.layout.item_dialog_select_radiobutton
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L31
        L20:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.baselib.databinding.ItemDialogSelectRadiobuttonBinding.component1
            int r4 = r4 + 119
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.baselib.databinding.ItemDialogSelectRadiobuttonBinding.copydefault = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L31
            r4 = 4
            int r4 = r4 / 3
        L31:
            com.huawei.digitalpayment.consumer.baselib.databinding.ItemDialogSelectRadiobuttonBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.databinding.ItemDialogSelectRadiobuttonBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.baselib.databinding.ItemDialogSelectRadiobuttonBinding");
    }

    public static ItemDialogSelectRadiobuttonBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.iv_selected;
        StateListImageView stateListImageView = (StateListImageView) ViewBindings.findChildViewById(view, i4);
        if (stateListImageView != null) {
            int i5 = copydefault + 1;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i7 = R.id.tv_content;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i7);
            if (textView != null) {
                ItemDialogSelectRadiobuttonBinding itemDialogSelectRadiobuttonBinding = new ItemDialogSelectRadiobuttonBinding(constraintLayout, stateListImageView, constraintLayout, textView);
                int i8 = copydefault + 61;
                component1 = i8 % 128;
                int i9 = i8 % 2;
                return itemDialogSelectRadiobuttonBinding;
            }
            i4 = i7;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
