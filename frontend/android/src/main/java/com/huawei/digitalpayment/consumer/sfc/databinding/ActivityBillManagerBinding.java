package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ActivityBillManagerBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final FrameLayout container;
    private final FrameLayout copydefault;
    public final FrameLayout overlayContainer;

    @Override
    public View getRoot() {
        FrameLayout root;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            root = getRoot();
            int i3 = 83 / 0;
        } else {
            root = getRoot();
        }
        int i4 = ShareDataUIState + 85;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return root;
    }

    private ActivityBillManagerBinding(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3) {
        this.copydefault = frameLayout;
        this.container = frameLayout2;
        this.overlayContainer = frameLayout3;
    }

    @Override
    public FrameLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 43;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        FrameLayout frameLayout = this.copydefault;
        int i5 = i2 + 1;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return frameLayout;
    }

    public static ActivityBillManagerBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityBillManagerBinding activityBillManagerBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 27;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return activityBillManagerBindingInflate;
    }

    public static ActivityBillManagerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 121;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.activity_bill_manager, viewGroup, false);
        if (z) {
            int i4 = ShareDataUIState + 23;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                viewGroup.addView(viewInflate);
                int i5 = 65 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
            int i6 = ShareDataUIState + 115;
            component1 = i6 % 128;
            int i7 = i6 % 2;
        }
        return bind(viewInflate);
    }

    public static ActivityBillManagerBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.id.container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i3);
            if (frameLayout != null) {
                i3 = R.id.overlay_container;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i3);
                if (frameLayout2 != null) {
                    ActivityBillManagerBinding activityBillManagerBinding = new ActivityBillManagerBinding((FrameLayout) view, frameLayout, frameLayout2);
                    int i4 = component1 + 69;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    return activityBillManagerBinding;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        throw null;
    }
}
