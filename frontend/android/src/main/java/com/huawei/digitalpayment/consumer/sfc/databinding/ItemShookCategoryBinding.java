package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemShookCategoryBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final ConstraintLayout copydefault;
    public final TextView tvCategory;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = ShareDataUIState + 35;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemShookCategoryBinding(ConstraintLayout constraintLayout, TextView textView) {
        this.copydefault = constraintLayout;
        this.tvCategory = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.copydefault;
        int i5 = i3 + 109;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static ItemShookCategoryBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ItemShookCategoryBinding itemShookCategoryBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 89;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemShookCategoryBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    public static ItemShookCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_shook_category, viewGroup, false);
        if (!(!z)) {
            int i2 = ShareDataUIState + 121;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                viewGroup.addView(viewInflate);
                throw null;
            }
            viewGroup.addView(viewInflate);
            int i3 = component3 + 123;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 / 2;
            }
        }
        return bind(viewInflate);
    }

    public static ItemShookCategoryBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.id.tvCategory;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
            if (textView != null) {
                ItemShookCategoryBinding itemShookCategoryBinding = new ItemShookCategoryBinding((ConstraintLayout) view, textView);
                int i4 = ShareDataUIState + 1;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return itemShookCategoryBinding;
                }
                throw null;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        throw null;
    }
}
