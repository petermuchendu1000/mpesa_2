package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.baseui.R;

public final class LayoutSaveReceiptBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    public final RoundConstraintLayout clSavingsContainer;
    public final ConstraintLayout clTopContainer;
    private final ConstraintLayout copydefault;
    public final ImageView ivBarcode;
    public final ImageView ivSafaricom;
    public final ImageView ivSavings;
    public final RecyclerView rvReceipt;
    public final TextView tvAmountPaidLabel;
    public final TextView tvAmountPaidValue;
    public final TextView tvNameGreeting;
    public final TextView tvQuestionTips;
    public final TextView tvScanTips;
    public final View viewGuideline;
    public final View viewGuideline1;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 109;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        return root;
    }

    private LayoutSaveReceiptBinding(ConstraintLayout constraintLayout, RoundConstraintLayout roundConstraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, ImageView imageView3, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view, View view2) {
        this.copydefault = constraintLayout;
        this.clSavingsContainer = roundConstraintLayout;
        this.clTopContainer = constraintLayout2;
        this.ivBarcode = imageView;
        this.ivSafaricom = imageView2;
        this.ivSavings = imageView3;
        this.rvReceipt = recyclerView;
        this.tvAmountPaidLabel = textView;
        this.tvAmountPaidValue = textView2;
        this.tvNameGreeting = textView3;
        this.tvQuestionTips = textView4;
        this.tvScanTips = textView5;
        this.viewGuideline = view;
        this.viewGuideline1 = view2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LayoutSaveReceiptBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 19;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LayoutSaveReceiptBinding layoutSaveReceiptBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 37;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return layoutSaveReceiptBindingInflate;
    }

    public static LayoutSaveReceiptBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.layout_save_receipt, viewGroup, false);
        if (z) {
            int i2 = component3 + 123;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
        }
        LayoutSaveReceiptBinding layoutSaveReceiptBindingBind = bind(viewInflate);
        int i4 = ShareDataUIState + 115;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return layoutSaveReceiptBindingBind;
    }

    public static LayoutSaveReceiptBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = 2 % 2;
        int i2 = component3 + 103;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.cl_savings_container;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) ViewBindings.findChildViewById(view, i4);
        if (roundConstraintLayout != null) {
            i4 = R.id.cl_top_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i4);
            if (constraintLayout != null) {
                i4 = R.id.iv_barcode;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i4);
                if (imageView != null) {
                    int i5 = component3 + 29;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    i4 = R.id.iv_safaricom;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i4);
                    if (imageView2 != null) {
                        i4 = R.id.iv_savings;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i4);
                        if (imageView3 != null) {
                            i4 = R.id.rv_receipt;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i4);
                            if (recyclerView != null) {
                                i4 = R.id.tv_amount_paid_label;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
                                if (textView != null) {
                                    i4 = R.id.tv_amount_paid_value;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i4);
                                    if (textView2 != null) {
                                        int i7 = ShareDataUIState + 93;
                                        component3 = i7 % 128;
                                        int i8 = i7 % 2;
                                        i4 = R.id.tv_name_greeting;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i4);
                                        if (textView3 != null) {
                                            i4 = R.id.tv_question_tips;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i4);
                                            if (textView4 != null) {
                                                i4 = R.id.tv_scan_tips;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i4);
                                                if (textView5 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i4 = R.id.view_guideline))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i4 = R.id.view_guideline1))) != null) {
                                                    return new LayoutSaveReceiptBinding((ConstraintLayout) view, roundConstraintLayout, constraintLayout, imageView, imageView2, imageView3, recyclerView, textView, textView2, textView3, textView4, textView5, viewFindChildViewById, viewFindChildViewById2);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
