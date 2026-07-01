package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.CommonCheckBox;
import com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView;
import com.huawei.digitalpayment.consumer.history.R;

public final class ItemTransactionTypeBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final ConstraintLayout component1;
    public final CommonCheckBox ivCheck;
    public final RelativeLayout tag;
    public final BaseTextView transactionTypeName;

    @Override
    public View getRoot() {
        ConstraintLayout root;
        int i = 2 % 2;
        int i2 = component3 + 103;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            root = getRoot();
            int i3 = 74 / 0;
        } else {
            root = getRoot();
        }
        int i4 = ShareDataUIState + 105;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return root;
    }

    private ItemTransactionTypeBinding(ConstraintLayout constraintLayout, CommonCheckBox commonCheckBox, RelativeLayout relativeLayout, BaseTextView baseTextView) {
        this.component1 = constraintLayout;
        this.ivCheck = commonCheckBox;
        this.tag = relativeLayout;
        this.transactionTypeName = baseTextView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        ConstraintLayout constraintLayout = this.component1;
        int i4 = i3 + 53;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayout;
    }

    public static ItemTransactionTypeBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return inflate(layoutInflater, null, false);
    }

    public static ItemTransactionTypeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 65;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_transaction_type, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        ItemTransactionTypeBinding itemTransactionTypeBindingBind = bind(viewInflate);
        int i4 = ShareDataUIState + 113;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return itemTransactionTypeBindingBind;
    }

    public static ItemTransactionTypeBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.ivCheck;
        CommonCheckBox commonCheckBox = (CommonCheckBox) ViewBindings.findChildViewById(view, i4);
        if (commonCheckBox != null) {
            int i5 = ShareDataUIState + 87;
            component3 = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                throw null;
            }
            i4 = R.id.tag;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i4);
            if (relativeLayout != null) {
                i4 = R.id.transactionTypeName;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i4);
                if (baseTextView != null) {
                    ItemTransactionTypeBinding itemTransactionTypeBinding = new ItemTransactionTypeBinding((ConstraintLayout) view, commonCheckBox, relativeLayout, baseTextView);
                    int i6 = ShareDataUIState + 115;
                    component3 = i6 % 128;
                    if (i6 % 2 == 0) {
                        return itemTransactionTypeBinding;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
