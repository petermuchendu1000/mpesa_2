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

public final class ItemSambazaOptionBinding implements ViewBinding {
    private static int component2 = 1;
    private static int component3;
    private final CardView ShareDataUIState;
    public final ImageView checkBg;
    public final ImageView checkMark;
    public final ConstraintLayout container;
    public final ImageView ivIcon;
    public final TextView optionBalance;
    public final TextView optionName;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        CardView root = getRoot();
        int i4 = component2 + 15;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemSambazaOptionBinding(CardView cardView, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, ImageView imageView3, TextView textView, TextView textView2) {
        this.ShareDataUIState = cardView;
        this.checkBg = imageView;
        this.checkMark = imageView2;
        this.container = constraintLayout;
        this.ivIcon = imageView3;
        this.optionBalance = textView;
        this.optionName = textView2;
    }

    @Override
    public CardView getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public static ItemSambazaOptionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 67;
        component3 = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 != 0);
    }

    public static ItemSambazaOptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 21;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_sambaza_option, viewGroup, false);
        if (z) {
            int i4 = component3 + 89;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemSambazaOptionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.check_bg;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
        if (imageView != null) {
            int i3 = component3 + 105;
            component2 = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            i2 = R.id.check_mark;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i2);
            if (imageView2 != null) {
                int i4 = component3 + 51;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                i2 = R.id.container;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i2);
                if (constraintLayout != null) {
                    int i6 = component3 + 9;
                    component2 = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = R.id.ivIcon;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i2);
                    if (imageView3 != null) {
                        int i8 = component2 + 89;
                        component3 = i8 % 128;
                        if (i8 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        i2 = R.id.option_balance;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                        if (textView != null) {
                            i2 = R.id.option_name;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
                            if (textView2 != null) {
                                return new ItemSambazaOptionBinding((CardView) view, imageView, imageView2, constraintLayout, imageView3, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
