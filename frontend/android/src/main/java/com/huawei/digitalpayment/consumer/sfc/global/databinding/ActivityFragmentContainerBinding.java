package com.huawei.digitalpayment.consumer.sfc.global.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.global.R;

public final class ActivityFragmentContainerBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component2;
    public final FrameLayout container;
    private final FrameLayout copydefault;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout root = getRoot();
        int i4 = component2 + 19;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ActivityFragmentContainerBinding(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.copydefault = frameLayout;
        this.container = frameLayout2;
    }

    @Override
    public FrameLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 71;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        FrameLayout frameLayout = this.copydefault;
        int i5 = i3 + 73;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return frameLayout;
    }

    public static ActivityFragmentContainerBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityFragmentContainerBinding activityFragmentContainerBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 17;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityFragmentContainerBindingInflate;
    }

    public static ActivityFragmentContainerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 7;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.activity_fragment_container, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        ActivityFragmentContainerBinding activityFragmentContainerBindingBind = bind(viewInflate);
        int i4 = component2 + 1;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return activityFragmentContainerBindingBind;
        }
        throw null;
    }

    public static ActivityFragmentContainerBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i4);
        if (frameLayout != null) {
            ActivityFragmentContainerBinding activityFragmentContainerBinding = new ActivityFragmentContainerBinding((FrameLayout) view, frameLayout);
            int i5 = ShareDataUIState + 105;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return activityFragmentContainerBinding;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
