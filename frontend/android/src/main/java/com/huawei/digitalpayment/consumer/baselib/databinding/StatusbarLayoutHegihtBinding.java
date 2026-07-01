package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.baselib.R;

public final class StatusbarLayoutHegihtBinding implements ViewBinding {
    private static int component3 = 1;
    private static int copydefault;
    private final LinearLayout ShareDataUIState;
    public final View viewTag;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getRoot();
            obj.hashCode();
            throw null;
        }
        LinearLayout root = getRoot();
        int i3 = copydefault + 65;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return root;
        }
        throw null;
    }

    private StatusbarLayoutHegihtBinding(LinearLayout linearLayout, View view) {
        this.ShareDataUIState = linearLayout;
        this.viewTag = view;
    }

    @Override
    public LinearLayout getRoot() {
        LinearLayout linearLayout;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 15;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            linearLayout = this.ShareDataUIState;
            int i4 = 93 / 0;
        } else {
            linearLayout = this.ShareDataUIState;
        }
        int i5 = i2 + 7;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return linearLayout;
    }

    public static StatusbarLayoutHegihtBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        StatusbarLayoutHegihtBinding statusbarLayoutHegihtBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 23;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return statusbarLayoutHegihtBindingInflate;
    }

    public static StatusbarLayoutHegihtBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.statusbar_layout_hegiht, viewGroup, false);
        if (z) {
            int i4 = component3 + 5;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            viewGroup.addView(viewInflate);
            int i5 = component3 + 111;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
        }
        return bind(viewInflate);
    }

    public static StatusbarLayoutHegihtBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 51;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.id.viewTag;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, i3);
            if (viewFindChildViewById != null) {
                StatusbarLayoutHegihtBinding statusbarLayoutHegihtBinding = new StatusbarLayoutHegihtBinding((LinearLayout) view, viewFindChildViewById);
                int i4 = component3 + 123;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 69 / 0;
                }
                return statusbarLayoutHegihtBinding;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        ViewBindings.findChildViewById(view, R.id.viewTag);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
