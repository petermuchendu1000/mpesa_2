package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;

public final class DialogUploadHeaderBinding implements ViewBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    public final RoundTextView btnSkip;
    public final RoundTextView btnTakePhoto;
    private final ConstraintLayout component3;
    public final View line;
    public final RoundConstraintLayout rlLayout;
    public final TextView tvTipsContent;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return root;
    }

    private DialogUploadHeaderBinding(ConstraintLayout constraintLayout, RoundTextView roundTextView, RoundTextView roundTextView2, View view, RoundConstraintLayout roundConstraintLayout, TextView textView, TextView textView2) {
        this.component3 = constraintLayout;
        this.btnSkip = roundTextView;
        this.btnTakePhoto = roundTextView2;
        this.line = view;
        this.rlLayout = roundConstraintLayout;
        this.tvTipsContent = textView;
        this.tvTitle = textView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 63;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static DialogUploadHeaderBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DialogUploadHeaderBinding dialogUploadHeaderBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 97;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return dialogUploadHeaderBindingInflate;
    }

    public static DialogUploadHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 3;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.dialog_upload_header, viewGroup, false);
        if (!(!z)) {
            int i4 = component1 + 49;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                viewGroup.addView(viewInflate);
                int i5 = 84 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
        }
        return bind(viewInflate);
    }

    public static DialogUploadHeaderBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.btn_skip;
        RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i2);
        if (roundTextView != null) {
            int i3 = component1 + 117;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.btnTakePhoto;
            RoundTextView roundTextView2 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
            if (roundTextView2 != null) {
                int i5 = component1 + 31;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                i2 = R.id.line;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, i2);
                if (viewFindChildViewById != null) {
                    i2 = R.id.rl_layout;
                    RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) ViewBindings.findChildViewById(view, i2);
                    if (roundConstraintLayout != null) {
                        i2 = R.id.tv_tips_content;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                        if (textView != null) {
                            i2 = R.id.tv_title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
                            if (textView2 != null) {
                                return new DialogUploadHeaderBinding((ConstraintLayout) view, roundTextView, roundTextView2, viewFindChildViewById, roundConstraintLayout, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
