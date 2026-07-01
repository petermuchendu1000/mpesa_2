package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemRoamingInternationalBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final CardView component2;
    public final ImageView ivBundle;
    public final ImageView ivChevron;
    public final TextView tvName;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        CardView root = getRoot();
        int i4 = ShareDataUIState + 53;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ItemRoamingInternationalBinding(CardView cardView, ImageView imageView, ImageView imageView2, TextView textView) {
        this.component2 = cardView;
        this.ivBundle = imageView;
        this.ivChevron = imageView2;
        this.tvName = textView;
    }

    @Override
    public CardView getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        CardView cardView = this.component2;
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        return cardView;
    }

    public static ItemRoamingInternationalBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 33;
        ShareDataUIState = i2 % 128;
        ItemRoamingInternationalBinding itemRoamingInternationalBindingInflate = i2 % 2 != 0 ? inflate(layoutInflater, null, true) : inflate(layoutInflater, null, false);
        int i3 = ShareDataUIState + 1;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return itemRoamingInternationalBindingInflate;
    }

    public static ItemRoamingInternationalBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_roaming_international, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        ItemRoamingInternationalBinding itemRoamingInternationalBindingBind = bind(viewInflate);
        int i4 = component1 + 95;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return itemRoamingInternationalBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ItemRoamingInternationalBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.iv_bundle;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i4);
        if (imageView != null) {
            i4 = R.id.iv_chevron;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i4);
            if (imageView2 != null) {
                int i5 = component1 + 11;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                i4 = R.id.tv_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
                if (textView != null) {
                    ItemRoamingInternationalBinding itemRoamingInternationalBinding = new ItemRoamingInternationalBinding((CardView) view, imageView, imageView2, textView);
                    int i7 = ShareDataUIState + 63;
                    component1 = i7 % 128;
                    int i8 = i7 % 2;
                    return itemRoamingInternationalBinding;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
