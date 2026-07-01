package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemSelectContactBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final ConstraintLayout copydefault;
    public final RoundImageView ivAvatar;
    public final LinearLayout llContainer;
    public final TextView tvName;
    public final TextView tvPhoneNumber;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = ShareDataUIState + 117;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemSelectContactBinding(ConstraintLayout constraintLayout, RoundImageView roundImageView, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.copydefault = constraintLayout;
        this.ivAvatar = roundImageView;
        this.llContainer = linearLayout;
        this.tvName = textView;
        this.tvPhoneNumber = textView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public static ItemSelectContactBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemSelectContactBinding itemSelectContactBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 15;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemSelectContactBindingInflate;
        }
        throw null;
    }

    public static ItemSelectContactBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_select_contact, viewGroup, false);
        if (z) {
            int i4 = component3 + 115;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.addView(viewInflate);
        }
        ItemSelectContactBinding itemSelectContactBindingBind = bind(viewInflate);
        int i6 = ShareDataUIState + 63;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            return itemSelectContactBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ItemSelectContactBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.id.iv_avatar;
            RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i3);
            if (roundImageView != null) {
                i3 = R.id.ll_container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i3);
                if (linearLayout != null) {
                    i3 = R.id.tv_name;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
                    if (textView != null) {
                        int i4 = component3 + 25;
                        ShareDataUIState = i4 % 128;
                        int i5 = i4 % 2;
                        i3 = R.id.tv_phone_number;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i3);
                        if (textView2 != null) {
                            ItemSelectContactBinding itemSelectContactBinding = new ItemSelectContactBinding((ConstraintLayout) view, roundImageView, linearLayout, textView, textView2);
                            int i6 = ShareDataUIState + 121;
                            component3 = i6 % 128;
                            if (i6 % 2 == 0) {
                                int i7 = 31 / 0;
                            }
                            return itemSelectContactBinding;
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        throw null;
    }
}
