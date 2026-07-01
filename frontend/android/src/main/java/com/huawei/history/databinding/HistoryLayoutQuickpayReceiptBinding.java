package com.huawei.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.history.R;

public final class HistoryLayoutQuickpayReceiptBinding implements ViewBinding {
    public final ConstraintLayout clContent;
    public final ConstraintLayout clTitle;
    private final FrameLayout component2;
    public final View dashLine;
    public final ImageView ivKbzpay;
    public final LinearLayout llDetails;
    public final RoundImageView semicircleLeft;
    public final RoundImageView semicircleRight;
    public final TextView tvAmount;
    public final TextView tvCurrency;
    public final TextView tvReceiptTitle;
    public final TextView tvThanks;

    private HistoryLayoutQuickpayReceiptBinding(FrameLayout frameLayout, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, ImageView imageView, LinearLayout linearLayout, RoundImageView roundImageView, RoundImageView roundImageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.component2 = frameLayout;
        this.clContent = constraintLayout;
        this.clTitle = constraintLayout2;
        this.dashLine = view;
        this.ivKbzpay = imageView;
        this.llDetails = linearLayout;
        this.semicircleLeft = roundImageView;
        this.semicircleRight = roundImageView2;
        this.tvAmount = textView;
        this.tvCurrency = textView2;
        this.tvReceiptTitle = textView3;
        this.tvThanks = textView4;
    }

    @Override
    public FrameLayout getRoot() {
        return this.component2;
    }

    public static HistoryLayoutQuickpayReceiptBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static HistoryLayoutQuickpayReceiptBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.history_layout_quickpay_receipt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static HistoryLayoutQuickpayReceiptBinding bind(View view) {
        View viewFindChildViewById;
        int i = R.id.cl_content;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.cl_title;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.dash_line))) != null) {
                i = R.id.iv_kbzpay;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.ll_details;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.semicircle_left;
                        RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i);
                        if (roundImageView != null) {
                            i = R.id.semicircle_right;
                            RoundImageView roundImageView2 = (RoundImageView) ViewBindings.findChildViewById(view, i);
                            if (roundImageView2 != null) {
                                i = R.id.tv_amount;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = R.id.tv_currency;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = R.id.tv_receipt_title;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = R.id.tv_thanks;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                return new HistoryLayoutQuickpayReceiptBinding((FrameLayout) view, constraintLayout, constraintLayout2, viewFindChildViewById, imageView, linearLayout, roundImageView, roundImageView2, textView, textView2, textView3, textView4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
