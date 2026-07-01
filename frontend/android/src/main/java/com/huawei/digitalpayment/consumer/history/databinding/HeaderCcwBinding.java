package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.digitalpayment.consumer.history.R;

public final class HeaderCcwBinding implements ViewBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    private final ConstraintLayout ShareDataUIState;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component1 + 11;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private HeaderCcwBinding(ConstraintLayout constraintLayout) {
        this.ShareDataUIState = constraintLayout;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 39;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public static HeaderCcwBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        HeaderCcwBinding headerCcwBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 33;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return headerCcwBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    public static HeaderCcwBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.header_ccw, viewGroup, false);
        if (z) {
            int i2 = component1 + 3;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
        }
        HeaderCcwBinding headerCcwBindingBind = bind(viewInflate);
        int i4 = component1 + 47;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return headerCcwBindingBind;
    }

    public static HeaderCcwBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 23;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        HeaderCcwBinding headerCcwBinding = new HeaderCcwBinding((ConstraintLayout) view);
        int i3 = component2 + 33;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return headerCcwBinding;
    }
}
