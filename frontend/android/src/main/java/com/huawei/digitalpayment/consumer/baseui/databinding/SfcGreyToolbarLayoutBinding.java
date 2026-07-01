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
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.baseui.R;

public final class SfcGreyToolbarLayoutBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final LinearLayout component1;
    public final ImageView ivBack;
    public final RoundImageView ivEndButton;
    public final ConstraintLayout toolbarRoot;
    public final TextView tvEndButton;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        int i4 = component2 + 95;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private SfcGreyToolbarLayoutBinding(LinearLayout linearLayout, ImageView imageView, RoundImageView roundImageView, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.component1 = linearLayout;
        this.ivBack = imageView;
        this.ivEndButton = roundImageView;
        this.toolbarRoot = constraintLayout;
        this.tvEndButton = textView;
        this.tvTitle = textView2;
    }

    @Override
    public LinearLayout getRoot() {
        LinearLayout linearLayout;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            linearLayout = this.component1;
            int i4 = 5 / 0;
        } else {
            linearLayout = this.component1;
        }
        int i5 = i3 + 103;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
        return linearLayout;
    }

    public static SfcGreyToolbarLayoutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        SfcGreyToolbarLayoutBinding sfcGreyToolbarLayoutBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 15;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return sfcGreyToolbarLayoutBindingInflate;
    }

    public static SfcGreyToolbarLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.sfc_grey_toolbar_layout, viewGroup, false);
        if (z) {
            int i2 = ShareDataUIState + 5;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                viewGroup.addView(viewInflate);
                int i3 = 12 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
        }
        SfcGreyToolbarLayoutBinding sfcGreyToolbarLayoutBindingBind = bind(viewInflate);
        int i4 = ShareDataUIState + 51;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return sfcGreyToolbarLayoutBindingBind;
    }

    public static SfcGreyToolbarLayoutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.ivBack;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
        if (imageView != null) {
            int i3 = ShareDataUIState + 97;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                i2 = R.id.ivEndButton;
                RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i2);
                if (roundImageView != null) {
                    i2 = R.id.toolbarRoot;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i2);
                    if (constraintLayout != null) {
                        int i4 = ShareDataUIState + 79;
                        component2 = i4 % 128;
                        int i5 = i4 % 2;
                        i2 = R.id.tvEndButton;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                        if (textView != null) {
                            i2 = R.id.tvTitle;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
                            if (textView2 != null) {
                                return new SfcGreyToolbarLayoutBinding((LinearLayout) view, imageView, roundImageView, constraintLayout, textView, textView2);
                            }
                        }
                    }
                }
            } else {
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
