package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView;
import com.huawei.digitalpayment.consumer.history.R;

public final class ItemHistorySelectedTypeBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final RoundLinearLayout copydefault;
    public final ImageView ivClose;
    public final RoundLinearLayout tagAll;
    public final BaseTextView tvName;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        RoundLinearLayout root = getRoot();
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        return root;
    }

    private ItemHistorySelectedTypeBinding(RoundLinearLayout roundLinearLayout, ImageView imageView, RoundLinearLayout roundLinearLayout2, BaseTextView baseTextView) {
        this.copydefault = roundLinearLayout;
        this.ivClose = imageView;
        this.tagAll = roundLinearLayout2;
        this.tvName = baseTextView;
    }

    @Override
    public RoundLinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 25;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ItemHistorySelectedTypeBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemHistorySelectedTypeBinding itemHistorySelectedTypeBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 73;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemHistorySelectedTypeBindingInflate;
    }

    public static ItemHistorySelectedTypeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_history_selected_type, viewGroup, false);
        if (z) {
            int i2 = ShareDataUIState + 109;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            viewGroup.addView(viewInflate);
            int i3 = ShareDataUIState + 7;
            component3 = i3 % 128;
            int i4 = i3 % 2;
        }
        return bind(viewInflate);
    }

    public static ItemHistorySelectedTypeBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.ivClose;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i4);
        if (imageView != null) {
            int i5 = ShareDataUIState + 33;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            RoundLinearLayout roundLinearLayout = (RoundLinearLayout) view;
            int i7 = R.id.tvName;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i7);
            if (baseTextView != null) {
                ItemHistorySelectedTypeBinding itemHistorySelectedTypeBinding = new ItemHistorySelectedTypeBinding(roundLinearLayout, imageView, roundLinearLayout, baseTextView);
                int i8 = component3 + 43;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
                return itemHistorySelectedTypeBinding;
            }
            i4 = i7;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
