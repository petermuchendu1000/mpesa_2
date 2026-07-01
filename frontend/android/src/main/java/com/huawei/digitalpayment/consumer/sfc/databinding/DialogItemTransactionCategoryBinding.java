package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class DialogItemTransactionCategoryBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final ConstraintLayout component3;
    public final ImageView ivImage;
    public final TextView tvCategory;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = ShareDataUIState + 81;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private DialogItemTransactionCategoryBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.component3 = constraintLayout;
        this.ivImage = imageView;
        this.tvCategory = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayout = this.component3;
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        return constraintLayout;
    }

    public static DialogItemTransactionCategoryBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DialogItemTransactionCategoryBinding dialogItemTransactionCategoryBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 89;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return dialogItemTransactionCategoryBindingInflate;
    }

    public static DialogItemTransactionCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.dialog_item_transaction_category, viewGroup, false);
        if (z) {
            int i4 = component1 + 85;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static DialogItemTransactionCategoryBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.id.iv_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i3);
            if (imageView != null) {
                i3 = R.id.tv_category;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
                if (textView != null) {
                    DialogItemTransactionCategoryBinding dialogItemTransactionCategoryBinding = new DialogItemTransactionCategoryBinding((ConstraintLayout) view, imageView, textView);
                    int i4 = component1 + 41;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 8 / 0;
                    }
                    return dialogItemTransactionCategoryBinding;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
