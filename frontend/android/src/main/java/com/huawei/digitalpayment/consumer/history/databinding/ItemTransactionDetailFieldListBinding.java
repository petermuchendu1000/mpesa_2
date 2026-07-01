package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView;
import com.huawei.digitalpayment.consumer.history.R;

public final class ItemTransactionDetailFieldListBinding implements ViewBinding {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final ConstraintLayout component2;
    public final BaseTextView tvName;
    public final BaseTextView tvValue;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return getRoot();
        }
        getRoot();
        throw null;
    }

    private ItemTransactionDetailFieldListBinding(ConstraintLayout constraintLayout, BaseTextView baseTextView, BaseTextView baseTextView2) {
        this.component2 = constraintLayout;
        this.tvName = baseTextView;
        this.tvValue = baseTextView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 39;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayout = this.component2;
        int i4 = i2 + 43;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return constraintLayout;
        }
        obj.hashCode();
        throw null;
    }

    public static ItemTransactionDetailFieldListBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemTransactionDetailFieldListBinding itemTransactionDetailFieldListBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 119;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return itemTransactionDetailFieldListBindingInflate;
    }

    public static ItemTransactionDetailFieldListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_transaction_detail_field_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        ItemTransactionDetailFieldListBinding itemTransactionDetailFieldListBindingBind = bind(viewInflate);
        int i4 = component1 + 5;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemTransactionDetailFieldListBindingBind;
    }

    public static ItemTransactionDetailFieldListBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.id.tvName;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i3);
            if (baseTextView != null) {
                i3 = R.id.tvValue;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i3);
                if (baseTextView2 != null) {
                    ItemTransactionDetailFieldListBinding itemTransactionDetailFieldListBinding = new ItemTransactionDetailFieldListBinding((ConstraintLayout) view, baseTextView, baseTextView2);
                    int i4 = copydefault + 85;
                    component1 = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 67 / 0;
                    }
                    return itemTransactionDetailFieldListBinding;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
