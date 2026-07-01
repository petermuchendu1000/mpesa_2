package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemRequestMoneyRecordBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    public final CardView cardAbbr;
    private final ConstraintLayout copydefault;
    public final RoundImageView ivAvatar;
    public final TextView tvAbbr;
    public final TextView tvAmount;
    public final TextView tvName;
    public final TextView tvOrderStatus;
    public final TextView tvPhoneNo;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component3 + 1;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemRequestMoneyRecordBinding(ConstraintLayout constraintLayout, CardView cardView, RoundImageView roundImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.copydefault = constraintLayout;
        this.cardAbbr = cardView;
        this.ivAvatar = roundImageView;
        this.tvAbbr = textView;
        this.tvAmount = textView2;
        this.tvName = textView3;
        this.tvOrderStatus = textView4;
        this.tvPhoneNo = textView5;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 75;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.copydefault;
        int i5 = i2 + 57;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static ItemRequestMoneyRecordBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component3 = i2 % 128;
        ItemRequestMoneyRecordBinding itemRequestMoneyRecordBindingInflate = inflate(layoutInflater, null, i2 % 2 != 0);
        int i3 = component3 + 87;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return itemRequestMoneyRecordBindingInflate;
    }

    public static ItemRequestMoneyRecordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 73;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_request_money_record, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
            int i4 = ShareDataUIState + 95;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
        return bind(viewInflate);
    }

    public static ItemRequestMoneyRecordBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.cardAbbr;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i2);
        if (cardView != null) {
            int i3 = ShareDataUIState + 89;
            component3 = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            i2 = R.id.ivAvatar;
            RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i2);
            if (roundImageView != null) {
                i2 = R.id.tvAbbr;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                if (textView != null) {
                    i2 = R.id.tvAmount;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
                    if (textView2 != null) {
                        i2 = R.id.tvName;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i2);
                        if (textView3 != null) {
                            i2 = R.id.tvOrderStatus;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i2);
                            if (textView4 != null) {
                                i2 = R.id.tvPhoneNo;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i2);
                                if (textView5 != null) {
                                    ItemRequestMoneyRecordBinding itemRequestMoneyRecordBinding = new ItemRequestMoneyRecordBinding((ConstraintLayout) view, cardView, roundImageView, textView, textView2, textView3, textView4, textView5);
                                    int i4 = component3 + 89;
                                    ShareDataUIState = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        return itemRequestMoneyRecordBinding;
                                    }
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
