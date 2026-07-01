package com.huawei.digitalpayment.consumer.sfcqrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfcqrcode.R;

public final class PreviewDisplayViewBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final ConstraintLayout component1;
    public final Guideline guideline;
    public final ImageView icon;
    public final RoundTextView tvRetakePhoto;
    public final RoundTextView tvScan;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 121;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        return root;
    }

    private PreviewDisplayViewBinding(ConstraintLayout constraintLayout, Guideline guideline, ImageView imageView, RoundTextView roundTextView, RoundTextView roundTextView2) {
        this.component1 = constraintLayout;
        this.guideline = guideline;
        this.icon = imageView;
        this.tvRetakePhoto = roundTextView;
        this.tvScan = roundTextView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.component1;
        int i5 = i3 + 7;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static PreviewDisplayViewBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return inflate(layoutInflater, null, false);
    }

    public static PreviewDisplayViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.preview_display_view, viewGroup, false);
        if (z) {
            int i4 = ShareDataUIState + 87;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.addView(viewInflate);
            int i6 = component2 + 51;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        return bind(viewInflate);
    }

    public static PreviewDisplayViewBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.guideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i4);
        if (guideline != null) {
            i4 = R.id.icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i4);
            if (imageView != null) {
                i4 = R.id.tv_retake_photo;
                RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i4);
                if (roundTextView != null) {
                    int i5 = ShareDataUIState + 71;
                    component2 = i5 % 128;
                    if (i5 % 2 == 0) {
                        i4 = R.id.tv_scan;
                        RoundTextView roundTextView2 = (RoundTextView) ViewBindings.findChildViewById(view, i4);
                        if (roundTextView2 != null) {
                            return new PreviewDisplayViewBinding((ConstraintLayout) view, guideline, imageView, roundTextView, roundTextView2);
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
