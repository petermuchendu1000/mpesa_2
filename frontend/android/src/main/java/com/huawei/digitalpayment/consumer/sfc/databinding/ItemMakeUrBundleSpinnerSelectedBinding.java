package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemMakeUrBundleSpinnerSelectedBinding implements ViewBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final TextView component1;
    public final TextView tvSpinnerOption;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            getRoot();
            throw null;
        }
        TextView root = getRoot();
        int i3 = component2 + 35;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return root;
    }

    private ItemMakeUrBundleSpinnerSelectedBinding(TextView textView, TextView textView2) {
        this.component1 = textView;
        this.tvSpinnerOption = textView2;
    }

    @Override
    public TextView getRoot() {
        TextView textView;
        int i = 2 % 2;
        int i2 = copydefault + 53;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            textView = this.component1;
            int i4 = 94 / 0;
        } else {
            textView = this.component1;
        }
        int i5 = i3 + 9;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return textView;
    }

    public static ItemMakeUrBundleSpinnerSelectedBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 123;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemMakeUrBundleSpinnerSelectedBinding itemMakeUrBundleSpinnerSelectedBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 11;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemMakeUrBundleSpinnerSelectedBindingInflate;
    }

    public static ItemMakeUrBundleSpinnerSelectedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_make_ur_bundle_spinner_selected, viewGroup, false);
        if (z) {
            int i4 = copydefault + 41;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup.addView(viewInflate);
                throw null;
            }
            viewGroup.addView(viewInflate);
            int i5 = copydefault + 93;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }
        return bind(viewInflate);
    }

    public static ItemMakeUrBundleSpinnerSelectedBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        ItemMakeUrBundleSpinnerSelectedBinding itemMakeUrBundleSpinnerSelectedBinding = new ItemMakeUrBundleSpinnerSelectedBinding(textView, textView);
        int i4 = copydefault + 27;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemMakeUrBundleSpinnerSelectedBinding;
    }
}
