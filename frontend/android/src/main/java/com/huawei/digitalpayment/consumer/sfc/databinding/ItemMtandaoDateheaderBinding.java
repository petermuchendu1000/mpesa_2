package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemMtandaoDateheaderBinding implements ViewBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    private final ConstraintLayout ShareDataUIState;
    public final TextView dateText;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        return root;
    }

    private ItemMtandaoDateheaderBinding(ConstraintLayout constraintLayout, TextView textView) {
        this.ShareDataUIState = constraintLayout;
        this.dateText = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 57;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        ConstraintLayout constraintLayout = this.ShareDataUIState;
        int i4 = i2 + 103;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayout;
    }

    public static ItemMtandaoDateheaderBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemMtandaoDateheaderBinding itemMtandaoDateheaderBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 81;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemMtandaoDateheaderBindingInflate;
    }

    public static ItemMtandaoDateheaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_mtandao_dateheader, viewGroup, false);
        if (z) {
            int i4 = component3 + 53;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup.addView(viewInflate);
                int i5 = 28 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
        }
        return bind(viewInflate);
    }

    public static ItemMtandaoDateheaderBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 115;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.id.dateText;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
            if (textView != null) {
                ItemMtandaoDateheaderBinding itemMtandaoDateheaderBinding = new ItemMtandaoDateheaderBinding((ConstraintLayout) view, textView);
                int i4 = component3 + 1;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return itemMtandaoDateheaderBinding;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        throw null;
    }
}
