package com.huawei.digitalpayment.consumer.developer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.developer.R;

public final class ItemLogsBinding implements ViewBinding {
    private static int component1 = 1;
    private static int copydefault;
    private final LinearLayout ShareDataUIState;
    public final TextView tvName;
    public final TextView tvShare;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        int i4 = copydefault + 35;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemLogsBinding(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.ShareDataUIState = linearLayout;
        this.tvName = textView;
        this.tvShare = textView2;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 53;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        LinearLayout linearLayout = this.ShareDataUIState;
        int i5 = i2 + 27;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return linearLayout;
        }
        throw null;
    }

    public static ItemLogsBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemLogsBinding itemLogsBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 3;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return itemLogsBindingInflate;
    }

    public static ItemLogsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_logs, viewGroup, false);
        if (!(!z)) {
            int i2 = component1 + 123;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
            int i4 = copydefault + 37;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
        return bind(viewInflate);
    }

    public static ItemLogsBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.id.tv_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
            if (textView != null) {
                int i4 = component1 + 97;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                i3 = R.id.tv_share;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i3);
                if (textView2 != null) {
                    return new ItemLogsBinding((LinearLayout) view, textView, textView2);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        throw null;
    }
}
