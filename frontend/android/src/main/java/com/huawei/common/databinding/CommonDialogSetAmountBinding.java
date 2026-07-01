package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.R;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundTextView;

public final class CommonDialogSetAmountBinding implements ViewBinding {
    public final RoundConstraintLayout clInput;
    private final RoundConstraintLayout component3;
    public final EditText etInputAmount;
    public final ImageView ivClose;
    public final RoundTextView line;
    public final LinearLayout llKeybroad;
    public final RecyclerView rvRecyclerView;
    public final TextView tvError;
    public final TextView tvTitle;
    public final TextView tvUnit;

    private CommonDialogSetAmountBinding(RoundConstraintLayout roundConstraintLayout, RoundConstraintLayout roundConstraintLayout2, EditText editText, ImageView imageView, RoundTextView roundTextView, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        this.component3 = roundConstraintLayout;
        this.clInput = roundConstraintLayout2;
        this.etInputAmount = editText;
        this.ivClose = imageView;
        this.line = roundTextView;
        this.llKeybroad = linearLayout;
        this.rvRecyclerView = recyclerView;
        this.tvError = textView;
        this.tvTitle = textView2;
        this.tvUnit = textView3;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        return this.component3;
    }

    public static CommonDialogSetAmountBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CommonDialogSetAmountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.common_dialog_set_amount, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static CommonDialogSetAmountBinding bind(View view) {
        int i = R.id.cl_input;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (roundConstraintLayout != null) {
            i = R.id.et_input_amount;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
            if (editText != null) {
                i = R.id.iv_close;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.line;
                    RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i);
                    if (roundTextView != null) {
                        i = R.id.ll_keybroad;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = R.id.rv_recycler_view;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = R.id.tvError;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = R.id.tv_title;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = R.id.tv_unit;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            return new CommonDialogSetAmountBinding((RoundConstraintLayout) view, roundConstraintLayout, editText, imageView, roundTextView, linearLayout, recyclerView, textView, textView2, textView3);
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
