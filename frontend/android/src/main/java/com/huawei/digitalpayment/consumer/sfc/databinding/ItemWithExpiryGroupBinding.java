package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemWithExpiryGroupBinding implements ViewBinding {
    private static int component3 = 1;
    private static int copydefault;
    private final ConstraintLayout ShareDataUIState;
    public final RecyclerView rvBundle;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return getRoot();
        }
        getRoot();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ItemWithExpiryGroupBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView) {
        this.ShareDataUIState = constraintLayout;
        this.rvBundle = recyclerView;
        this.tvTitle = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        ConstraintLayout constraintLayout = this.ShareDataUIState;
        int i4 = i3 + 15;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayout;
    }

    public static ItemWithExpiryGroupBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component3 = i2 % 128;
        ItemWithExpiryGroupBinding itemWithExpiryGroupBindingInflate = inflate(layoutInflater, null, i2 % 2 == 0);
        int i3 = component3 + 105;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return itemWithExpiryGroupBindingInflate;
        }
        throw null;
    }

    public static ItemWithExpiryGroupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_with_expiry_group, viewGroup, false);
        if (!(!z)) {
            int i4 = copydefault + 105;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.addView(viewInflate);
        }
        ItemWithExpiryGroupBinding itemWithExpiryGroupBindingBind = bind(viewInflate);
        int i6 = copydefault + 17;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            return itemWithExpiryGroupBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ItemWithExpiryGroupBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.rv_bundle;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i4);
        if (recyclerView != null) {
            int i5 = component3 + 83;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            i4 = R.id.tv_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
            if (textView != null) {
                ItemWithExpiryGroupBinding itemWithExpiryGroupBinding = new ItemWithExpiryGroupBinding((ConstraintLayout) view, recyclerView, textView);
                int i6 = copydefault + 75;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return itemWithExpiryGroupBinding;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
