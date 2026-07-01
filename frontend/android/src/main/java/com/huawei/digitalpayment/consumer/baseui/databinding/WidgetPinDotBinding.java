package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.huawei.digitalpayment.consumer.baseui.R;

public final class WidgetPinDotBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final FrameLayout component1;
    public final LottieAnimationView dotAnimation;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 9;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            getRoot();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FrameLayout root = getRoot();
        int i3 = ShareDataUIState + 3;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return root;
    }

    private WidgetPinDotBinding(FrameLayout frameLayout, LottieAnimationView lottieAnimationView) {
        this.component1 = frameLayout;
        this.dotAnimation = lottieAnimationView;
    }

    @Override
    public FrameLayout getRoot() {
        FrameLayout frameLayout;
        int i = 2 % 2;
        int i2 = component3 + 57;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            frameLayout = this.component1;
            int i4 = 34 / 0;
        } else {
            frameLayout = this.component1;
        }
        int i5 = i3 + 115;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return frameLayout;
    }

    public static WidgetPinDotBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        WidgetPinDotBinding widgetPinDotBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 101;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return widgetPinDotBindingInflate;
    }

    public static WidgetPinDotBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.widget_pin_dot, viewGroup, false);
        if (z) {
            int i2 = component3 + 95;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
        }
        WidgetPinDotBinding widgetPinDotBindingBind = bind(viewInflate);
        int i4 = ShareDataUIState + 67;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
        return widgetPinDotBindingBind;
    }

    public static WidgetPinDotBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.dotAnimation;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i4);
        if (lottieAnimationView != null) {
            WidgetPinDotBinding widgetPinDotBinding = new WidgetPinDotBinding((FrameLayout) view, lottieAnimationView);
            int i5 = component3 + 41;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return widgetPinDotBinding;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
