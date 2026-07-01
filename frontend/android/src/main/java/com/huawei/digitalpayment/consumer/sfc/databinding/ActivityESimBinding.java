package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ActivityESimBinding implements ViewBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    public final FrameLayout container;
    private final FrameLayout copydefault;
    public final FrameLayout rootContainer;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return getRoot();
        }
        getRoot();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ActivityESimBinding(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3) {
        this.copydefault = frameLayout;
        this.container = frameLayout2;
        this.rootContainer = frameLayout3;
    }

    @Override
    public FrameLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 113;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        FrameLayout frameLayout = this.copydefault;
        int i5 = i2 + 39;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return frameLayout;
    }

    public static ActivityESimBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 115;
        component3 = i2 % 128;
        ActivityESimBinding activityESimBindingInflate = inflate(layoutInflater, null, i2 % 2 == 0);
        int i3 = component3 + 47;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return activityESimBindingInflate;
    }

    public static ActivityESimBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.activity_e_sim, viewGroup, false);
        if (!(!z)) {
            int i4 = component3 + 27;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.addView(viewInflate);
            int i6 = component3 + 35;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        return bind(viewInflate);
    }

    public static ActivityESimBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 51;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i4);
        if (frameLayout != null) {
            FrameLayout frameLayout2 = (FrameLayout) view;
            ActivityESimBinding activityESimBinding = new ActivityESimBinding(frameLayout2, frameLayout, frameLayout2);
            int i5 = component3 + 3;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return activityESimBinding;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
