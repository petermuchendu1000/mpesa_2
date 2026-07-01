package com.huawei.digitalpayment.consumer.profileui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.profileui.R;

public final class ItemProfileConfirmBinding implements ViewBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    private final ConstraintLayout component2;
    public final TextView image;
    public final TextView name;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            getRoot();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout root = getRoot();
        int i3 = component1 + 59;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return root;
    }

    private ItemProfileConfirmBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.component2 = constraintLayout;
        this.image = textView;
        this.name = textView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        throw null;
    }

    public static ItemProfileConfirmBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 61;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemProfileConfirmBinding itemProfileConfirmBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 61;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemProfileConfirmBindingInflate;
    }

    public static ItemProfileConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_profile_confirm, viewGroup, false);
        if (z) {
            int i2 = component1 + 33;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                viewGroup.addView(viewInflate);
            } else {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        ItemProfileConfirmBinding itemProfileConfirmBindingBind = bind(viewInflate);
        int i3 = component3 + 7;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return itemProfileConfirmBindingBind;
    }

    public static ItemProfileConfirmBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.image;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
        if (textView != null) {
            int i3 = component3 + 113;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.name;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
            if (textView2 != null) {
                ItemProfileConfirmBinding itemProfileConfirmBinding = new ItemProfileConfirmBinding((ConstraintLayout) view, textView, textView2);
                int i5 = component3 + 75;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    return itemProfileConfirmBinding;
                }
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
