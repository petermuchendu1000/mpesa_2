package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.R;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.round.RoundTextView;

public final class DialogBoxBinding implements ViewBinding {
    public final RoundTextView btnLeft;
    public final RoundTextView btnRight;
    public final ConstraintLayout clContent;
    private final RoundConstraintLayout copydefault;
    public final RoundLinearLayout hLine;
    public final ImageView ivIcon;
    public final View space;
    public final RoundTextView tvContent;
    public final RoundTextView tvTitle;
    public final CommonInputView vInput;
    public final RoundLinearLayout vLine;

    private DialogBoxBinding(RoundConstraintLayout roundConstraintLayout, RoundTextView roundTextView, RoundTextView roundTextView2, ConstraintLayout constraintLayout, RoundLinearLayout roundLinearLayout, ImageView imageView, View view, RoundTextView roundTextView3, RoundTextView roundTextView4, CommonInputView commonInputView, RoundLinearLayout roundLinearLayout2) {
        this.copydefault = roundConstraintLayout;
        this.btnLeft = roundTextView;
        this.btnRight = roundTextView2;
        this.clContent = constraintLayout;
        this.hLine = roundLinearLayout;
        this.ivIcon = imageView;
        this.space = view;
        this.tvContent = roundTextView3;
        this.tvTitle = roundTextView4;
        this.vInput = commonInputView;
        this.vLine = roundLinearLayout2;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        return this.copydefault;
    }

    public static DialogBoxBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogBoxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_box, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static DialogBoxBinding bind(View view) {
        View viewFindChildViewById;
        int i = R.id.btn_left;
        RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i);
        if (roundTextView != null) {
            i = R.id.btn_right;
            RoundTextView roundTextView2 = (RoundTextView) ViewBindings.findChildViewById(view, i);
            if (roundTextView2 != null) {
                i = R.id.cl_content;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R.id.h_line;
                    RoundLinearLayout roundLinearLayout = (RoundLinearLayout) ViewBindings.findChildViewById(view, i);
                    if (roundLinearLayout != null) {
                        i = R.id.iv_icon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.space))) != null) {
                            i = R.id.tv_content;
                            RoundTextView roundTextView3 = (RoundTextView) ViewBindings.findChildViewById(view, i);
                            if (roundTextView3 != null) {
                                i = R.id.tv_title;
                                RoundTextView roundTextView4 = (RoundTextView) ViewBindings.findChildViewById(view, i);
                                if (roundTextView4 != null) {
                                    i = R.id.v_input;
                                    CommonInputView commonInputView = (CommonInputView) ViewBindings.findChildViewById(view, i);
                                    if (commonInputView != null) {
                                        i = R.id.v_line;
                                        RoundLinearLayout roundLinearLayout2 = (RoundLinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (roundLinearLayout2 != null) {
                                            return new DialogBoxBinding((RoundConstraintLayout) view, roundTextView, roundTextView2, constraintLayout, roundLinearLayout, imageView, viewFindChildViewById, roundTextView3, roundTextView4, commonInputView, roundLinearLayout2);
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
