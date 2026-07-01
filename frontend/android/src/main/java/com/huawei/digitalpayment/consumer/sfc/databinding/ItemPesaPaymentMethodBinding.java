package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemPesaPaymentMethodBinding implements ViewBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final CardView ShareDataUIState;
    public final ImageView ivIcon;
    public final ImageView ivSelected;
    public final ConstraintLayout tvContainer;
    public final TextView tvContent;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            getRoot();
            throw null;
        }
        CardView root = getRoot();
        int i3 = copydefault + 95;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return root;
        }
        throw null;
    }

    private ItemPesaPaymentMethodBinding(CardView cardView, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.ShareDataUIState = cardView;
        this.ivIcon = imageView;
        this.ivSelected = imageView2;
        this.tvContainer = constraintLayout;
        this.tvContent = textView;
        this.tvTitle = textView2;
    }

    @Override
    public CardView getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 29;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        CardView cardView = this.ShareDataUIState;
        int i5 = i3 + 45;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return cardView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ItemPesaPaymentMethodBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemPesaPaymentMethodBinding itemPesaPaymentMethodBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 91;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemPesaPaymentMethodBindingInflate;
    }

    public static ItemPesaPaymentMethodBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_pesa_payment_method, viewGroup, false);
        if (z) {
            int i2 = component2 + 45;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
        }
        ItemPesaPaymentMethodBinding itemPesaPaymentMethodBindingBind = bind(viewInflate);
        int i4 = component2 + 81;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemPesaPaymentMethodBindingBind;
    }

    public static ItemPesaPaymentMethodBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.ivIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
        if (imageView != null) {
            int i3 = copydefault + 33;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.ivSelected;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i2);
            if (imageView2 != null) {
                i2 = R.id.tvContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i2);
                if (constraintLayout != null) {
                    i2 = R.id.tvContent;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                    if (textView != null) {
                        i2 = R.id.tvTitle;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
                        if (textView2 != null) {
                            ItemPesaPaymentMethodBinding itemPesaPaymentMethodBinding = new ItemPesaPaymentMethodBinding((CardView) view, imageView, imageView2, constraintLayout, textView, textView2);
                            int i5 = copydefault + 29;
                            component2 = i5 % 128;
                            int i6 = i5 % 2;
                            return itemPesaPaymentMethodBinding;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
