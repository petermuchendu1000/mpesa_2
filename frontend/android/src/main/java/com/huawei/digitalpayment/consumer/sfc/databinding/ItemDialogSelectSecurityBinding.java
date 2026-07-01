package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.baselib.widget.imageview.StateListImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemDialogSelectSecurityBinding implements ViewBinding {
    private static int component1 = 1;
    private static int component3;
    private final ConstraintLayout component2;
    public final StateListImageView ivSelected;
    public final ConstraintLayout layoutItem;
    public final TextView tvContent;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component1 + 81;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return root;
    }

    private ItemDialogSelectSecurityBinding(ConstraintLayout constraintLayout, StateListImageView stateListImageView, ConstraintLayout constraintLayout2, TextView textView) {
        this.component2 = constraintLayout;
        this.ivSelected = stateListImageView;
        this.layoutItem = constraintLayout2;
        this.tvContent = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 71;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.component2;
        int i5 = i2 + 121;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return constraintLayout;
    }

    public static ItemDialogSelectSecurityBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 35;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemDialogSelectSecurityBinding itemDialogSelectSecurityBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 123;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemDialogSelectSecurityBindingInflate;
    }

    public static ItemDialogSelectSecurityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_dialog_select_security, viewGroup, false);
        Object obj = null;
        if (!(!z)) {
            int i2 = component3 + 11;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                viewGroup.addView(viewInflate);
                throw null;
            }
            viewGroup.addView(viewInflate);
        }
        ItemDialogSelectSecurityBinding itemDialogSelectSecurityBindingBind = bind(viewInflate);
        int i3 = component1 + 25;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return itemDialogSelectSecurityBindingBind;
        }
        obj.hashCode();
        throw null;
    }

    public static ItemDialogSelectSecurityBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 73;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.iv_selected;
        StateListImageView stateListImageView = (StateListImageView) ViewBindings.findChildViewById(view, i4);
        if (stateListImageView != null) {
            int i5 = component1 + 119;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i4 = R.id.tv_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
                if (textView != null) {
                    return new ItemDialogSelectSecurityBinding(constraintLayout, stateListImageView, constraintLayout, textView);
                }
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
