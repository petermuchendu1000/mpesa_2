package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemMakeUrBundleSpinnerDropdownBinding implements ViewBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    private final LinearLayout ShareDataUIState;
    public final View dividerBottom;
    public final TextView tvSpinnerOption;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            getRoot();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LinearLayout root = getRoot();
        int i3 = component2 + 19;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return root;
    }

    private ItemMakeUrBundleSpinnerDropdownBinding(LinearLayout linearLayout, View view, TextView textView) {
        this.ShareDataUIState = linearLayout;
        this.dividerBottom = view;
        this.tvSpinnerOption = textView;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        LinearLayout linearLayout = this.ShareDataUIState;
        int i5 = i3 + 107;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return linearLayout;
        }
        throw null;
    }

    public static ItemMakeUrBundleSpinnerDropdownBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemMakeUrBundleSpinnerDropdownBinding itemMakeUrBundleSpinnerDropdownBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 61;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return itemMakeUrBundleSpinnerDropdownBindingInflate;
    }

    public static ItemMakeUrBundleSpinnerDropdownBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_make_ur_bundle_spinner_dropdown, viewGroup, false);
        if (!(!z)) {
            int i4 = component3 + 111;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemMakeUrBundleSpinnerDropdownBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.divider_bottom;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i4);
        if (viewFindChildViewById != null) {
            i4 = R.id.tv_spinner_option;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
            if (textView != null) {
                ItemMakeUrBundleSpinnerDropdownBinding itemMakeUrBundleSpinnerDropdownBinding = new ItemMakeUrBundleSpinnerDropdownBinding((LinearLayout) view, viewFindChildViewById, textView);
                int i5 = component2 + 121;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 47 / 0;
                }
                return itemMakeUrBundleSpinnerDropdownBinding;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
