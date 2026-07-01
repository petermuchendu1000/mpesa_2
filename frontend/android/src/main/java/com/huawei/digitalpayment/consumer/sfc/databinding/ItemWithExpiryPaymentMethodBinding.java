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

public final class ItemWithExpiryPaymentMethodBinding implements ViewBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    private final CardView copydefault;
    public final ImageView ivIcon;
    public final ImageView ivSelected;
    public final ConstraintLayout tvContainer;
    public final TextView tvContent;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        CardView root = getRoot();
        int i4 = component1 + 119;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ItemWithExpiryPaymentMethodBinding(CardView cardView, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.copydefault = cardView;
        this.ivIcon = imageView;
        this.ivSelected = imageView2;
        this.tvContainer = constraintLayout;
        this.tvContent = textView;
        this.tvTitle = textView2;
    }

    @Override
    public CardView getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 39;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CardView cardView = this.copydefault;
        int i4 = i3 + 31;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return cardView;
    }

    public static ItemWithExpiryPaymentMethodBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemWithExpiryPaymentMethodBinding itemWithExpiryPaymentMethodBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 21;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemWithExpiryPaymentMethodBindingInflate;
    }

    public static ItemWithExpiryPaymentMethodBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_with_expiry_payment_method, viewGroup, false);
        if (z) {
            int i2 = component3 + 35;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
        }
        ItemWithExpiryPaymentMethodBinding itemWithExpiryPaymentMethodBindingBind = bind(viewInflate);
        int i4 = component1 + 49;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemWithExpiryPaymentMethodBindingBind;
    }

    public static ItemWithExpiryPaymentMethodBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.ivIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i4);
        if (imageView != null) {
            int i5 = component3 + 103;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            i4 = R.id.ivSelected;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i4);
            if (imageView2 != null) {
                int i7 = component1 + 15;
                component3 = i7 % 128;
                int i8 = i7 % 2;
                i4 = R.id.tvContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i4);
                if (constraintLayout != null) {
                    int i9 = component3 + 37;
                    component1 = i9 % 128;
                    int i10 = i9 % 2;
                    i4 = R.id.tvContent;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
                    if (textView != null) {
                        i4 = R.id.tvTitle;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i4);
                        if (textView2 != null) {
                            return new ItemWithExpiryPaymentMethodBinding((CardView) view, imageView, imageView2, constraintLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
