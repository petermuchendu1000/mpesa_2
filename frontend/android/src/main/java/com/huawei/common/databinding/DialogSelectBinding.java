package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.R;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundTextView;

public final class DialogSelectBinding implements ViewBinding {
    private final RoundConstraintLayout ShareDataUIState;
    public final RoundTextView line;
    public final RecyclerView rvList;
    public final TextView tvTitle;

    private DialogSelectBinding(RoundConstraintLayout roundConstraintLayout, RoundTextView roundTextView, RecyclerView recyclerView, TextView textView) {
        this.ShareDataUIState = roundConstraintLayout;
        this.line = roundTextView;
        this.rvList = recyclerView;
        this.tvTitle = textView;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        return this.ShareDataUIState;
    }

    public static DialogSelectBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogSelectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_select, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static DialogSelectBinding bind(View view) {
        int i = R.id.line;
        RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i);
        if (roundTextView != null) {
            i = R.id.rv_list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.tv_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new DialogSelectBinding((RoundConstraintLayout) view, roundTextView, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
