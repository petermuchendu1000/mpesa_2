package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.homeui.R;

public final class ItemCategoryBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final ConstraintLayout component1;
    public final TextView tvCategory;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component3 + 119;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemCategoryBinding(ConstraintLayout constraintLayout, TextView textView) {
        this.component1 = constraintLayout;
        this.tvCategory = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.component1;
        int i5 = i3 + 105;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return constraintLayout;
        }
        throw null;
    }

    public static ItemCategoryBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemCategoryBinding itemCategoryBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 121;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return itemCategoryBindingInflate;
    }

    public static ItemCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_category, viewGroup, false);
        if (!(!z)) {
            int i2 = ShareDataUIState + 23;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
            int i4 = component3 + 11;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
        return bind(viewInflate);
    }

    public static ItemCategoryBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = R.id.tvCategory;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
            if (textView != null) {
                ItemCategoryBinding itemCategoryBinding = new ItemCategoryBinding((ConstraintLayout) view, textView);
                int i4 = ShareDataUIState + 77;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return itemCategoryBinding;
                }
                obj.hashCode();
                throw null;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        throw null;
    }
}
