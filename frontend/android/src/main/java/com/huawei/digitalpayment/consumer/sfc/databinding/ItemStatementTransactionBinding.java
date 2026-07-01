package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemStatementTransactionBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final ConstraintLayout copydefault;
    public final RoundTextView tvCopy;
    public final TextView tvLabel;
    public final TextView tvValue;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component1 + 55;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemStatementTransactionBinding(ConstraintLayout constraintLayout, RoundTextView roundTextView, TextView textView, TextView textView2) {
        this.copydefault = constraintLayout;
        this.tvCopy = roundTextView;
        this.tvLabel = textView;
        this.tvValue = textView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 93;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.copydefault;
        int i5 = i2 + 121;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return constraintLayout;
        }
        throw null;
    }

    public static ItemStatementTransactionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 87;
        ShareDataUIState = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 != 0);
    }

    public static ItemStatementTransactionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_statement_transaction, viewGroup, false);
        if (z) {
            int i4 = ShareDataUIState + 101;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                viewGroup.addView(viewInflate);
                int i5 = 64 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
            int i6 = component1 + 27;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        return bind(viewInflate);
    }

    public static ItemStatementTransactionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = R.id.tv_copy;
            RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i3);
            if (roundTextView != null) {
                i3 = R.id.tv_label;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
                if (textView != null) {
                    int i4 = component1 + 5;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 == 0) {
                        i3 = R.id.tv_value;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i3);
                        if (textView2 != null) {
                            return new ItemStatementTransactionBinding((ConstraintLayout) view, roundTextView, textView, textView2);
                        }
                    } else {
                        obj.hashCode();
                        throw null;
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        obj.hashCode();
        throw null;
    }
}
