package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemOnboardingPageBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final ConstraintLayout component2;
    public final ImageView ivOnboardingImage;
    public final TextView tvOnboardingDescription;
    public final TextView tvOnboardingTitle;
    public final TextView tvTermsLink;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = ShareDataUIState + 75;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemOnboardingPageBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.component2 = constraintLayout;
        this.ivOnboardingImage = imageView;
        this.tvOnboardingDescription = textView;
        this.tvOnboardingTitle = textView2;
        this.tvTermsLink = textView3;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 49;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.component2;
        int i5 = i3 + 9;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static ItemOnboardingPageBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 117;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ItemOnboardingPageBinding itemOnboardingPageBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 99;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return itemOnboardingPageBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    public static ItemOnboardingPageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_onboarding_page, viewGroup, false);
        if (z) {
            int i2 = ShareDataUIState + 71;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
        }
        ItemOnboardingPageBinding itemOnboardingPageBindingBind = bind(viewInflate);
        int i4 = component3 + 97;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemOnboardingPageBindingBind;
    }

    public static ItemOnboardingPageBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i3 = R.id.iv_onboarding_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i3);
        if (imageView != null) {
            int i4 = component3 + 73;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            i3 = R.id.tv_onboarding_description;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
            if (textView != null) {
                i3 = R.id.tv_onboarding_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i3);
                if (textView2 != null) {
                    i3 = R.id.tv_terms_link;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i3);
                    if (textView3 != null) {
                        ItemOnboardingPageBinding itemOnboardingPageBinding = new ItemOnboardingPageBinding((ConstraintLayout) view, imageView, textView, textView2, textView3);
                        int i5 = ShareDataUIState + 45;
                        component3 = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 70 / 0;
                        }
                        return itemOnboardingPageBinding;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
    }
}
