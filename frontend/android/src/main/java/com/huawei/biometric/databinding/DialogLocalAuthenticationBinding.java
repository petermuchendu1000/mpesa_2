package com.huawei.biometric.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.biometric.R;
import com.huawei.common.widget.round.RoundConstraintLayout;

public final class DialogLocalAuthenticationBinding implements ViewBinding {
    public final RoundConstraintLayout clEnd;
    public final RoundConstraintLayout clStart;
    private final ConstraintLayout component1;
    public final ImageView ivFaceId;
    public final ImageView ivFaceIdLogo;
    public final View lineBottom;
    public final View lineTop;
    public final TextView tvCancel;
    public final TextView tvErrorMessage;
    public final TextView tvTryAgain;

    private DialogLocalAuthenticationBinding(ConstraintLayout constraintLayout, RoundConstraintLayout roundConstraintLayout, RoundConstraintLayout roundConstraintLayout2, ImageView imageView, ImageView imageView2, View view, View view2, TextView textView, TextView textView2, TextView textView3) {
        this.component1 = constraintLayout;
        this.clEnd = roundConstraintLayout;
        this.clStart = roundConstraintLayout2;
        this.ivFaceId = imageView;
        this.ivFaceIdLogo = imageView2;
        this.lineBottom = view;
        this.lineTop = view2;
        this.tvCancel = textView;
        this.tvErrorMessage = textView2;
        this.tvTryAgain = textView3;
    }

    @Override
    public ConstraintLayout getRoot() {
        return this.component1;
    }

    public static DialogLocalAuthenticationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogLocalAuthenticationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_local_authentication, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static DialogLocalAuthenticationBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.cl_end;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (roundConstraintLayout != null) {
            i = R.id.cl_start;
            RoundConstraintLayout roundConstraintLayout2 = (RoundConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (roundConstraintLayout2 != null) {
                i = R.id.iv_face_id;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.iv_face_id_logo;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line_bottom))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.line_top))) != null) {
                        i = R.id.tv_cancel;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.tv_error_message;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.tv_try_again;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    return new DialogLocalAuthenticationBinding((ConstraintLayout) view, roundConstraintLayout, roundConstraintLayout2, imageView, imageView2, viewFindChildViewById, viewFindChildViewById2, textView, textView2, textView3);
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
