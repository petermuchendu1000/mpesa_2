package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;
import com.huawei.digitalpayment.consumer.basic.R;

public abstract class ActivityAppShareBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    public final ImageView arrow1;
    public final ImageView arrow2;
    public final View iconBg1;
    public final View iconBg2;
    public final MaterialCardView shareByMessage;
    public final MaterialCardView shareToOtherApp;

    protected ActivityAppShareBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, View view2, View view3, MaterialCardView materialCardView, MaterialCardView materialCardView2) {
        super(obj, view, i);
        this.arrow1 = imageView;
        this.arrow2 = imageView2;
        this.iconBg1 = view2;
        this.iconBg2 = view3;
        this.shareByMessage = materialCardView;
        this.shareToOtherApp = materialCardView2;
    }

    public static ActivityAppShareBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityAppShareBinding activityAppShareBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 123;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityAppShareBindingInflate;
    }

    @Deprecated
    public static ActivityAppShareBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 7;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityAppShareBinding activityAppShareBinding = (ActivityAppShareBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_app_share, viewGroup, z, obj);
        if (i3 != 0) {
            return activityAppShareBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ActivityAppShareBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivityAppShareBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component1 + 97;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.activity_app_share;
            z = true;
        } else {
            i = R.layout.activity_app_share;
            z = false;
        }
        ActivityAppShareBinding activityAppShareBinding = (ActivityAppShareBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component2 + 47;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityAppShareBinding;
    }

    public static ActivityAppShareBinding bind(View view) {
        ActivityAppShareBinding activityAppShareBindingBind;
        int i = 2 % 2;
        int i2 = component2 + 121;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            activityAppShareBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 17 / 0;
        } else {
            activityAppShareBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component1 + 37;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityAppShareBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivityAppShareBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityAppShareBinding activityAppShareBinding = (ActivityAppShareBinding) bind(obj, view, R.layout.activity_app_share);
        if (i3 == 0) {
            return activityAppShareBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
