package com.huawei.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.history.R;

public final class HistoryItemQuickpayReceiptBinding implements ViewBinding {
    private final LinearLayout component3;
    public final TextView tvLabel;
    public final TextView tvValue;

    private HistoryItemQuickpayReceiptBinding(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.component3 = linearLayout;
        this.tvLabel = textView;
        this.tvValue = textView2;
    }

    @Override
    public LinearLayout getRoot() {
        return this.component3;
    }

    public static HistoryItemQuickpayReceiptBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static HistoryItemQuickpayReceiptBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.history_item_quickpay_receipt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static HistoryItemQuickpayReceiptBinding bind(View view) {
        int i = R.id.tv_label;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.tv_value;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                return new HistoryItemQuickpayReceiptBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
