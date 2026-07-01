package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityBaseComposeBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final ComposeView composeView;

    protected ActivityBaseComposeBinding(Object obj, View view, int i, ComposeView composeView) {
        super(obj, view, i);
        this.composeView = composeView;
    }

    public static ActivityBaseComposeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        ActivityBaseComposeBinding activityBaseComposeBindingInflate;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            activityBaseComposeBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 95 / 0;
        } else {
            activityBaseComposeBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = ShareDataUIState + 15;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return activityBaseComposeBindingInflate;
    }

    @Deprecated
    public static ActivityBaseComposeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityBaseComposeBinding activityBaseComposeBinding = (ActivityBaseComposeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_base_compose, viewGroup, z, obj);
        int i4 = component3 + 123;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityBaseComposeBinding;
    }

    public static ActivityBaseComposeBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityBaseComposeBinding activityBaseComposeBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        return activityBaseComposeBindingInflate;
    }

    @Deprecated
    public static ActivityBaseComposeBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityBaseComposeBinding activityBaseComposeBinding = (ActivityBaseComposeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_base_compose, null, false, obj);
        int i4 = component3 + 67;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return activityBaseComposeBinding;
    }

    public static ActivityBaseComposeBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityBaseComposeBinding activityBaseComposeBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 19;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityBaseComposeBindingBind;
    }

    @Deprecated
    public static ActivityBaseComposeBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        component3 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        ActivityBaseComposeBinding activityBaseComposeBinding = (ActivityBaseComposeBinding) bind(obj, view, R.layout.activity_base_compose);
        int i3 = component3 + 27;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return activityBaseComposeBinding;
        }
        obj2.hashCode();
        throw null;
    }
}
