package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.baselib.R;
import com.huawei.digitalpayment.consumer.baselib.widget.imageview.StateListImageView;

public final class ItemDialogSelectBinding implements ViewBinding {
    private static int component1 = 1;
    private static int component3;
    private final ConstraintLayout copydefault;
    public final StateListImageView ivSelected;
    public final ConstraintLayout layoutItem;
    public final TextView tvContent;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component1 + 21;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return root;
    }

    private ItemDialogSelectBinding(ConstraintLayout constraintLayout, StateListImageView stateListImageView, ConstraintLayout constraintLayout2, TextView textView) {
        this.copydefault = constraintLayout;
        this.ivSelected = stateListImageView;
        this.layoutItem = constraintLayout2;
        this.tvContent = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 17;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.copydefault;
        int i5 = i2 + 105;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return constraintLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ItemDialogSelectBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemDialogSelectBinding itemDialogSelectBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 57;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemDialogSelectBindingInflate;
    }

    public static ItemDialogSelectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_dialog_select, viewGroup, false);
        Object obj = null;
        if (z) {
            int i2 = component3 + 121;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                viewGroup.addView(viewInflate);
                obj.hashCode();
                throw null;
            }
            viewGroup.addView(viewInflate);
            int i3 = component3 + 3;
            component1 = i3 % 128;
            int i4 = i3 % 2;
        }
        ItemDialogSelectBinding itemDialogSelectBindingBind = bind(viewInflate);
        int i5 = component1 + 45;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return itemDialogSelectBindingBind;
        }
        obj.hashCode();
        throw null;
    }

    public static ItemDialogSelectBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.iv_selected;
        StateListImageView stateListImageView = (StateListImageView) ViewBindings.findChildViewById(view, i2);
        if (stateListImageView != null) {
            int i3 = component1 + 25;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i5 = R.id.tv_content;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i5);
            if (textView != null) {
                ItemDialogSelectBinding itemDialogSelectBinding = new ItemDialogSelectBinding(constraintLayout, stateListImageView, constraintLayout, textView);
                int i6 = component3 + 37;
                component1 = i6 % 128;
                if (i6 % 2 != 0) {
                    return itemDialogSelectBinding;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 = i5;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
