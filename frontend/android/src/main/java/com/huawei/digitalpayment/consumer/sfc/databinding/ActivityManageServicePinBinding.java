package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ActivityManageServicePinBinding implements ViewBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final FrameLayout component2;
    public final FrameLayout container;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout root = getRoot();
        int i4 = copydefault + 111;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ActivityManageServicePinBinding(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.component2 = frameLayout;
        this.container = frameLayout2;
    }

    @Override
    public FrameLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 123;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        throw null;
    }

    public static ActivityManageServicePinBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 77;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityManageServicePinBinding activityManageServicePinBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 53;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityManageServicePinBindingInflate;
    }

    public static ActivityManageServicePinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.activity_manage_service_pin, viewGroup, false);
        if (!(!z)) {
            int i2 = copydefault + 19;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                viewGroup.addView(viewInflate);
                int i3 = 18 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
            int i4 = component3 + 3;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
        return bind(viewInflate);
    }

    public static ActivityManageServicePinBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i4);
        if (frameLayout != null) {
            ActivityManageServicePinBinding activityManageServicePinBinding = new ActivityManageServicePinBinding((FrameLayout) view, frameLayout);
            int i5 = component3 + 27;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return activityManageServicePinBinding;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
