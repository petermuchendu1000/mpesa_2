package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.homeui.R;

public final class ItemQuickActionsCategoryBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final ConstraintLayout component2;
    public final TextView tvCategory;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component3 + 1;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ItemQuickActionsCategoryBinding(ConstraintLayout constraintLayout, TextView textView) {
        this.component2 = constraintLayout;
        this.tvCategory = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        ConstraintLayout constraintLayout;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            constraintLayout = this.component2;
            int i4 = 40 / 0;
        } else {
            constraintLayout = this.component2;
        }
        int i5 = i3 + 47;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return constraintLayout;
    }

    public static ItemQuickActionsCategoryBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemQuickActionsCategoryBinding itemQuickActionsCategoryBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 99;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemQuickActionsCategoryBindingInflate;
    }

    public static ItemQuickActionsCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_quick_actions_category, viewGroup, false);
        if (z) {
            int i2 = ShareDataUIState + 37;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
            int i4 = component3 + 9;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
        return bind(viewInflate);
    }

    public static ItemQuickActionsCategoryBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 97;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.id.tvCategory;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
            if (textView != null) {
                ItemQuickActionsCategoryBinding itemQuickActionsCategoryBinding = new ItemQuickActionsCategoryBinding((ConstraintLayout) view, textView);
                int i4 = ShareDataUIState + 23;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 90 / 0;
                }
                return itemQuickActionsCategoryBinding;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        throw null;
    }
}
