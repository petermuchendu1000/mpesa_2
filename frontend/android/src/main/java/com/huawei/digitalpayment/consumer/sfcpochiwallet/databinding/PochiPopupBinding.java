package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;

public final class PochiPopupBinding implements ViewBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    private final CardView ShareDataUIState;
    public final CardView cvPochiCodeContainer;
    public final ImageView ivOptOut;
    public final ImageView ivPochiCode;
    public final LinearLayout llOptOutContainer;
    public final LinearLayout llPochiCodeContainer;
    public final TextView tvOptOut;
    public final TextView tvPochiCode;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        CardView root = getRoot();
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        return root;
    }

    private PochiPopupBinding(CardView cardView, CardView cardView2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.ShareDataUIState = cardView;
        this.cvPochiCodeContainer = cardView2;
        this.ivOptOut = imageView;
        this.ivPochiCode = imageView2;
        this.llOptOutContainer = linearLayout;
        this.llPochiCodeContainer = linearLayout2;
        this.tvOptOut = textView;
        this.tvPochiCode = textView2;
    }

    @Override
    public CardView getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        CardView cardView = this.ShareDataUIState;
        int i5 = i3 + 107;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
        return cardView;
    }

    public static PochiPopupBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        PochiPopupBinding pochiPopupBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 51;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return pochiPopupBindingInflate;
        }
        throw null;
    }

    public static PochiPopupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.pochi_popup, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        PochiPopupBinding pochiPopupBindingBind = bind(viewInflate);
        int i4 = component3 + 23;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return pochiPopupBindingBind;
    }

    public static PochiPopupBinding bind(View view) {
        int i = 2 % 2;
        CardView cardView = (CardView) view;
        int i2 = R.id.iv_opt_out;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
        if (imageView != null) {
            int i3 = component2 + 117;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.iv_pochi_code;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i2);
            if (imageView2 != null) {
                i2 = R.id.ll_opt_out_container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i2);
                if (linearLayout != null) {
                    int i5 = component3 + 23;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = R.id.ll_pochi_code_container;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i2);
                    if (linearLayout2 != null) {
                        int i7 = component2 + 13;
                        component3 = i7 % 128;
                        if (i7 % 2 == 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        i2 = R.id.tv_opt_out;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                        if (textView != null) {
                            i2 = R.id.tv_pochi_code;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
                            if (textView2 != null) {
                                return new PochiPopupBinding(cardView, cardView, imageView, imageView2, linearLayout, linearLayout2, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
