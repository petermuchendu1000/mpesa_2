package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.login.R;

public final class ItemForgotPinSelectionBinding implements ViewBinding {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final RoundConstraintLayout ShareDataUIState;
    public final ImageView ivIcon;
    public final ImageView ivMore;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        RoundConstraintLayout root;
        int i = 2 % 2;
        int i2 = copydefault + 25;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            root = getRoot();
            int i3 = 0 / 0;
        } else {
            root = getRoot();
        }
        int i4 = component1 + 35;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        throw null;
    }

    private ItemForgotPinSelectionBinding(RoundConstraintLayout roundConstraintLayout, ImageView imageView, ImageView imageView2, TextView textView) {
        this.ShareDataUIState = roundConstraintLayout;
        this.ivIcon = imageView;
        this.ivMore = imageView2;
        this.tvTitle = textView;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        RoundConstraintLayout roundConstraintLayout = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        return roundConstraintLayout;
    }

    public static ItemForgotPinSelectionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 47;
        copydefault = i2 % 128;
        ItemForgotPinSelectionBinding itemForgotPinSelectionBindingInflate = inflate(layoutInflater, null, i2 % 2 == 0);
        int i3 = component1 + 3;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return itemForgotPinSelectionBindingInflate;
    }

    public static ItemForgotPinSelectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_forgot_pin_selection, viewGroup, false);
        if (z) {
            int i2 = component1 + 79;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                viewGroup.addView(viewInflate);
            } else {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        ItemForgotPinSelectionBinding itemForgotPinSelectionBindingBind = bind(viewInflate);
        int i3 = component1 + 107;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 21 / 0;
        }
        return itemForgotPinSelectionBindingBind;
    }

    public static ItemForgotPinSelectionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i4);
        if (imageView != null) {
            i4 = R.id.iv_more;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i4);
            if (imageView2 != null) {
                int i5 = component1 + 111;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    i4 = R.id.tv_title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
                    if (textView != null) {
                        return new ItemForgotPinSelectionBinding((RoundConstraintLayout) view, imageView, imageView2, textView);
                    }
                } else {
                    throw null;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
