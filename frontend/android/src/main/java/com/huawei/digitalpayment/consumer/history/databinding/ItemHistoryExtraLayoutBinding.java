package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.history.R;

public final class ItemHistoryExtraLayoutBinding implements ViewBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final View component1;
    public final TextView tvAmount;

    private ItemHistoryExtraLayoutBinding(View view, TextView textView) {
        this.component1 = view;
        this.tvAmount = textView;
    }

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 119;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        View view = this.component1;
        int i5 = i2 + 21;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    public static ItemHistoryExtraLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.item_history_extra_layout, viewGroup);
        ItemHistoryExtraLayoutBinding itemHistoryExtraLayoutBindingBind = bind(viewGroup);
        int i3 = component2 + 91;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 16 / 0;
        }
        return itemHistoryExtraLayoutBindingBind;
    }

    public static ItemHistoryExtraLayoutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.id.tvAmount;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
            if (textView != null) {
                ItemHistoryExtraLayoutBinding itemHistoryExtraLayoutBinding = new ItemHistoryExtraLayoutBinding(view, textView);
                int i4 = component2 + 81;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 91 / 0;
                }
                return itemHistoryExtraLayoutBinding;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        throw null;
    }
}
