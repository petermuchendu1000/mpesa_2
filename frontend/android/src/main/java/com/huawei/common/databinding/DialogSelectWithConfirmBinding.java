package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.R;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;

public final class DialogSelectWithConfirmBinding implements ViewBinding {
    public final LoadingButton btnSelect;
    private final RoundConstraintLayout component1;
    public final ImageView ivClose;
    public final RecyclerView rvList;
    public final ScrollView scrollView;
    public final TextView tvTitle;

    private DialogSelectWithConfirmBinding(RoundConstraintLayout roundConstraintLayout, LoadingButton loadingButton, ImageView imageView, RecyclerView recyclerView, ScrollView scrollView, TextView textView) {
        this.component1 = roundConstraintLayout;
        this.btnSelect = loadingButton;
        this.ivClose = imageView;
        this.rvList = recyclerView;
        this.scrollView = scrollView;
        this.tvTitle = textView;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        return this.component1;
    }

    public static DialogSelectWithConfirmBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogSelectWithConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_select_with_confirm, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static DialogSelectWithConfirmBinding bind(View view) {
        int i = R.id.btnSelect;
        LoadingButton loadingButton = (LoadingButton) ViewBindings.findChildViewById(view, i);
        if (loadingButton != null) {
            i = R.id.ivClose;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.rv_list;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = R.id.scrollView;
                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                    if (scrollView != null) {
                        i = R.id.tv_title;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            return new DialogSelectWithConfirmBinding((RoundConstraintLayout) view, loadingButton, imageView, recyclerView, scrollView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
