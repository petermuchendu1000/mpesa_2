package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemSendToManyFailedBinding implements ViewBinding {
    private static int component2 = 1;
    private static int component3;
    public final TextView amount;
    private final LinearLayout component1;
    public final ImageView imStatus;
    public final TextView name;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 89;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        int i4 = component2 + 21;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return root;
    }

    private ItemSendToManyFailedBinding(LinearLayout linearLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.component1 = linearLayout;
        this.amount = textView;
        this.imStatus = imageView;
        this.name = textView2;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        LinearLayout linearLayout = this.component1;
        int i4 = i3 + 105;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return linearLayout;
    }

    public static ItemSendToManyFailedBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 89;
        component3 = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 != 0);
    }

    public static ItemSendToManyFailedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_send_to_many_failed, viewGroup, false);
        if (z) {
            int i4 = component2 + 99;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemSendToManyFailedBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.amount;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
        if (textView != null) {
            int i3 = component2 + 29;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.imStatus;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
            if (imageView != null) {
                int i5 = component2 + 11;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                i2 = R.id.name;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
                if (textView2 != null) {
                    return new ItemSendToManyFailedBinding((LinearLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
