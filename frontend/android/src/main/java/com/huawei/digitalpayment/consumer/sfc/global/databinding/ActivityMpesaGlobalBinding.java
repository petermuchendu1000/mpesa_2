package com.huawei.digitalpayment.consumer.sfc.global.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.sfc.global.R;

public final class ActivityMpesaGlobalBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final FrameLayout component2;
    public final FrameLayout container;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 41;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            getRoot();
            throw null;
        }
        FrameLayout root = getRoot();
        int i3 = ShareDataUIState + 99;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 22 / 0;
        }
        return root;
    }

    private ActivityMpesaGlobalBinding(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.component2 = frameLayout;
        this.container = frameLayout2;
    }

    @Override
    public FrameLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        FrameLayout frameLayout = this.component2;
        int i5 = i3 + 91;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return frameLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ActivityMpesaGlobalBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityMpesaGlobalBinding activityMpesaGlobalBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 39;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return activityMpesaGlobalBindingInflate;
    }

    public static ActivityMpesaGlobalBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.activity_mpesa_global, viewGroup, false);
        if (!(!z)) {
            int i4 = ShareDataUIState + 37;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup.addView(viewInflate);
                throw null;
            }
            viewGroup.addView(viewInflate);
        }
        ActivityMpesaGlobalBinding activityMpesaGlobalBindingBind = bind(viewInflate);
        int i5 = ShareDataUIState + 39;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
        return activityMpesaGlobalBindingBind;
    }

    public static ActivityMpesaGlobalBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i4);
        if (frameLayout != null) {
            ActivityMpesaGlobalBinding activityMpesaGlobalBinding = new ActivityMpesaGlobalBinding((FrameLayout) view, frameLayout);
            int i5 = component3 + 15;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return activityMpesaGlobalBinding;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
