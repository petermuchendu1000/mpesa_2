package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.homeui.R;

public final class ItemDoMoreBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final ConstraintLayout copydefault;
    public final ImageView ivFunction;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component1 + 47;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ItemDoMoreBinding(ConstraintLayout constraintLayout, ImageView imageView) {
        this.copydefault = constraintLayout;
        this.ivFunction = imageView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 7;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.copydefault;
        int i5 = i2 + 33;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return constraintLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ItemDoMoreBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        component1 = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 != 0);
    }

    public static ItemDoMoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_do_more, viewGroup, false);
        if (z) {
            int i2 = ShareDataUIState + 91;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
        }
        ItemDoMoreBinding itemDoMoreBindingBind = bind(viewInflate);
        int i4 = ShareDataUIState + 81;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemDoMoreBindingBind;
    }

    public static ItemDoMoreBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.iv_function;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i4);
        if (imageView != null) {
            ItemDoMoreBinding itemDoMoreBinding = new ItemDoMoreBinding((ConstraintLayout) view, imageView);
            int i5 = component1 + 45;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return itemDoMoreBinding;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
