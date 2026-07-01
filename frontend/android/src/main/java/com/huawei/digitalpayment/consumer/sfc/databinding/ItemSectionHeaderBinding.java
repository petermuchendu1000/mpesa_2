package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemSectionHeaderBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component2;
    public final TextView categoryTitle;
    private final ConstraintLayout component1;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component2 + 45;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ItemSectionHeaderBinding(ConstraintLayout constraintLayout, TextView textView) {
        this.component1 = constraintLayout;
        this.categoryTitle = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        throw null;
    }

    public static ItemSectionHeaderBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 65;
        ShareDataUIState = i2 % 128;
        ItemSectionHeaderBinding itemSectionHeaderBindingInflate = inflate(layoutInflater, null, i2 % 2 == 0);
        int i3 = ShareDataUIState + 81;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return itemSectionHeaderBindingInflate;
    }

    public static ItemSectionHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_section_header, viewGroup, false);
        if (!(!z)) {
            viewGroup.addView(viewInflate);
        }
        ItemSectionHeaderBinding itemSectionHeaderBindingBind = bind(viewInflate);
        int i4 = ShareDataUIState + 89;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemSectionHeaderBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ItemSectionHeaderBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.category_title;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
        if (textView != null) {
            ItemSectionHeaderBinding itemSectionHeaderBinding = new ItemSectionHeaderBinding((ConstraintLayout) view, textView);
            int i5 = ShareDataUIState + 117;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return itemSectionHeaderBinding;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
