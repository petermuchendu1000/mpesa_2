package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class DialogTransactionCategoryBinding implements ViewBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    private final RoundConstraintLayout copydefault;
    public final RoundImageView ivBack;
    public final RoundTextView line;
    public final RecyclerView rvList;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        RoundConstraintLayout root = getRoot();
        int i4 = component2 + 109;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return root;
    }

    private DialogTransactionCategoryBinding(RoundConstraintLayout roundConstraintLayout, RoundImageView roundImageView, RoundTextView roundTextView, RecyclerView recyclerView, TextView textView) {
        this.copydefault = roundConstraintLayout;
        this.ivBack = roundImageView;
        this.line = roundTextView;
        this.rvList = recyclerView;
        this.tvTitle = textView;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        RoundConstraintLayout roundConstraintLayout;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 7;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            roundConstraintLayout = this.copydefault;
            int i4 = 81 / 0;
        } else {
            roundConstraintLayout = this.copydefault;
        }
        int i5 = i2 + 39;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return roundConstraintLayout;
    }

    public static DialogTransactionCategoryBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 101;
        component2 = i2 % 128;
        DialogTransactionCategoryBinding dialogTransactionCategoryBindingInflate = inflate(layoutInflater, null, i2 % 2 != 0);
        int i3 = component3 + 57;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return dialogTransactionCategoryBindingInflate;
        }
        throw null;
    }

    public static DialogTransactionCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.dialog_transaction_category, viewGroup, false);
        if (z) {
            int i2 = component3 + 87;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            viewGroup.addView(viewInflate);
            int i3 = component3 + 65;
            component2 = i3 % 128;
            int i4 = i3 % 2;
        }
        DialogTransactionCategoryBinding dialogTransactionCategoryBindingBind = bind(viewInflate);
        int i5 = component2 + 119;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return dialogTransactionCategoryBindingBind;
    }

    public static DialogTransactionCategoryBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 35;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.id.iv_back;
            RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i3);
            if (roundImageView != null) {
                int i4 = component2 + 93;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                i3 = R.id.line;
                RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i3);
                if (roundTextView != null) {
                    int i6 = component3 + 85;
                    component2 = i6 % 128;
                    int i7 = i6 % 2;
                    i3 = R.id.rv_list;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i3);
                    if (recyclerView != null) {
                        i3 = R.id.tv_title;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
                        if (textView != null) {
                            return new DialogTransactionCategoryBinding((RoundConstraintLayout) view, roundImageView, roundTextView, recyclerView, textView);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
