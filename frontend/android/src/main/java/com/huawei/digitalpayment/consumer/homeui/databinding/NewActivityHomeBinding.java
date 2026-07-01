package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class NewActivityHomeBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    public final FrameLayout flFragmentContainer;
    public final ComposeView welcomeTutorialHighlightView;

    protected NewActivityHomeBinding(Object obj, View view, int i, FrameLayout frameLayout, ComposeView composeView) {
        super(obj, view, i);
        this.flFragmentContainer = frameLayout;
        this.welcomeTutorialHighlightView = composeView;
    }

    public static NewActivityHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        NewActivityHomeBinding newActivityHomeBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 29;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return newActivityHomeBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static NewActivityHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        NewActivityHomeBinding newActivityHomeBinding;
        int i = 2 % 2;
        int i2 = component1 + 121;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            newActivityHomeBinding = (NewActivityHomeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.new_activity_home, viewGroup, z, obj);
            int i3 = 56 / 0;
        } else {
            newActivityHomeBinding = (NewActivityHomeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.new_activity_home, viewGroup, z, obj);
        }
        int i4 = component1 + 31;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return newActivityHomeBinding;
        }
        throw null;
    }

    public static NewActivityHomeBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        NewActivityHomeBinding newActivityHomeBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 65;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return newActivityHomeBindingInflate;
    }

    @Deprecated
    public static NewActivityHomeBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        NewActivityHomeBinding newActivityHomeBinding = (NewActivityHomeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.new_activity_home, null, false, obj);
        int i4 = component1 + 115;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return newActivityHomeBinding;
    }

    public static NewActivityHomeBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        NewActivityHomeBinding newActivityHomeBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 95;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return newActivityHomeBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static NewActivityHomeBinding bind(View view, Object obj) {
        NewActivityHomeBinding newActivityHomeBinding;
        int i = 2 % 2;
        int i2 = component2 + 43;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            newActivityHomeBinding = (NewActivityHomeBinding) bind(obj, view, R.layout.new_activity_home);
            int i3 = 39 / 0;
        } else {
            newActivityHomeBinding = (NewActivityHomeBinding) bind(obj, view, R.layout.new_activity_home);
        }
        int i4 = component2 + 5;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return newActivityHomeBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
