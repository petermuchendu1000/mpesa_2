package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;

public final class ItemSelectReasonBinding implements ViewBinding {
    private static int component1 = 1;
    private static int copydefault;
    public final ConstraintLayout clContainer;
    private final ConstraintLayout component3;
    public final ImageView ivStatus;
    public final TextView tvReason;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = copydefault + 63;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemSelectReasonBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView) {
        this.component3 = constraintLayout;
        this.clContainer = constraintLayout2;
        this.ivStatus = imageView;
        this.tvReason = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        ConstraintLayout constraintLayout;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 77;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            constraintLayout = this.component3;
            int i4 = 64 / 0;
        } else {
            constraintLayout = this.component3;
        }
        int i5 = i2 + 105;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return constraintLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ItemSelectReasonBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 111;
        copydefault = i2 % 128;
        ItemSelectReasonBinding itemSelectReasonBindingInflate = inflate(layoutInflater, null, i2 % 2 != 0);
        int i3 = copydefault + 111;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return itemSelectReasonBindingInflate;
        }
        throw null;
    }

    public static ItemSelectReasonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_select_reason, viewGroup, false);
        if (z) {
            int i2 = component1 + 83;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
        }
        ItemSelectReasonBinding itemSelectReasonBindingBind = bind(viewInflate);
        int i4 = copydefault + 49;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return itemSelectReasonBindingBind;
    }

    public static ItemSelectReasonBinding bind(View view) {
        int i = 2 % 2;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i2 = R.id.iv_status;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
        if (imageView != null) {
            int i3 = component1 + 99;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.tv_reason;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
            if (textView != null) {
                ItemSelectReasonBinding itemSelectReasonBinding = new ItemSelectReasonBinding(constraintLayout, constraintLayout, imageView, textView);
                int i5 = component1 + 65;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return itemSelectReasonBinding;
                }
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
