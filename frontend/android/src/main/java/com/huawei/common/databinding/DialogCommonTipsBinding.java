package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.R;
import com.huawei.common.widget.round.RoundConstraintLayout;

public final class DialogCommonTipsBinding implements ViewBinding {
    private final RoundConstraintLayout component1;
    public final AppCompatTextView tvLeftButton;
    public final AppCompatTextView tvRightButton;
    public final AppCompatTextView tvTipsContent;
    public final AppCompatTextView tvTipsTitle;
    public final View viewDivider;

    private DialogCommonTipsBinding(RoundConstraintLayout roundConstraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, View view) {
        this.component1 = roundConstraintLayout;
        this.tvLeftButton = appCompatTextView;
        this.tvRightButton = appCompatTextView2;
        this.tvTipsContent = appCompatTextView3;
        this.tvTipsTitle = appCompatTextView4;
        this.viewDivider = view;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        return this.component1;
    }

    public static DialogCommonTipsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogCommonTipsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_common_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static DialogCommonTipsBinding bind(View view) {
        View viewFindChildViewById;
        int i = R.id.tv_left_button;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = R.id.tv_right_button;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null) {
                i = R.id.tv_tips_content;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView3 != null) {
                    i = R.id.tv_tips_title;
                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView4 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view_divider))) != null) {
                        return new DialogCommonTipsBinding((RoundConstraintLayout) view, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, viewFindChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
