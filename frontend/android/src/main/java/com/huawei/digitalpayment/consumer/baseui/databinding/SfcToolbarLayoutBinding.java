package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.baseui.R;

public final class SfcToolbarLayoutBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final LinearLayout component3;
    public final MaterialCardView cvBack;
    public final ImageView ivBack;
    public final RoundImageView ivEndButton;
    public final ConstraintLayout toolbarRoot;
    public final TextView tvEndButton;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        int i4 = component1 + 13;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private SfcToolbarLayoutBinding(LinearLayout linearLayout, MaterialCardView materialCardView, ImageView imageView, RoundImageView roundImageView, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.component3 = linearLayout;
        this.cvBack = materialCardView;
        this.ivBack = imageView;
        this.ivEndButton = roundImageView;
        this.toolbarRoot = constraintLayout;
        this.tvEndButton = textView;
        this.tvTitle = textView2;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 97;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        LinearLayout linearLayout = this.component3;
        int i5 = i3 + 75;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 4 / 0;
        }
        return linearLayout;
    }

    public static SfcToolbarLayoutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        SfcToolbarLayoutBinding sfcToolbarLayoutBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 89;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return sfcToolbarLayoutBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    public static SfcToolbarLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.sfc_toolbar_layout, viewGroup, false);
        if (z) {
            int i4 = ShareDataUIState + 77;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            viewGroup.addView(viewInflate);
            int i5 = component1 + 119;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }
        return bind(viewInflate);
    }

    public static SfcToolbarLayoutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.cvBack;
        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, i4);
        if (materialCardView != null) {
            i4 = R.id.ivBack;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i4);
            if (imageView != null) {
                int i5 = component1 + 35;
                ShareDataUIState = i5 % 128;
                Object obj = null;
                if (i5 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                i4 = R.id.ivEndButton;
                RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i4);
                if (roundImageView != null) {
                    i4 = R.id.toolbarRoot;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i4);
                    if (constraintLayout != null) {
                        i4 = R.id.tvEndButton;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
                        if (textView != null) {
                            int i6 = ShareDataUIState + 41;
                            component1 = i6 % 128;
                            int i7 = i6 % 2;
                            i4 = R.id.tvTitle;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i4);
                            if (textView2 != null) {
                                SfcToolbarLayoutBinding sfcToolbarLayoutBinding = new SfcToolbarLayoutBinding((LinearLayout) view, materialCardView, imageView, roundImageView, constraintLayout, textView, textView2);
                                int i8 = component1 + 45;
                                ShareDataUIState = i8 % 128;
                                if (i8 % 2 != 0) {
                                    return sfcToolbarLayoutBinding;
                                }
                                obj.hashCode();
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
