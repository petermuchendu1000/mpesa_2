package com.huawei.digitalpayment.consumer.profileui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.profileui.R;

public abstract class ActivityPhotoCropBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final FrameLayout container;
    public final ImageView ivBack;
    public final RoundTextView tvTakeAnotherOne;
    public final RoundTextView tvUseThisPicture;

    protected ActivityPhotoCropBinding(Object obj, View view, int i, FrameLayout frameLayout, ImageView imageView, RoundTextView roundTextView, RoundTextView roundTextView2) {
        super(obj, view, i);
        this.container = frameLayout;
        this.ivBack = imageView;
        this.tvTakeAnotherOne = roundTextView;
        this.tvUseThisPicture = roundTextView2;
    }

    public static ActivityPhotoCropBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivityPhotoCropBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        ActivityPhotoCropBinding activityPhotoCropBinding;
        int i = 2 % 2;
        int i2 = component3 + 97;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            activityPhotoCropBinding = (ActivityPhotoCropBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_photo_crop, viewGroup, z, obj);
            int i3 = 34 / 0;
        } else {
            activityPhotoCropBinding = (ActivityPhotoCropBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_photo_crop, viewGroup, z, obj);
        }
        int i4 = component3 + 1;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return activityPhotoCropBinding;
        }
        throw null;
    }

    public static ActivityPhotoCropBinding inflate(LayoutInflater layoutInflater) {
        ActivityPhotoCropBinding activityPhotoCropBindingInflate;
        int i = 2 % 2;
        int i2 = component3 + 65;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            activityPhotoCropBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 54 / 0;
        } else {
            activityPhotoCropBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = ShareDataUIState + 69;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityPhotoCropBindingInflate;
    }

    @Deprecated
    public static ActivityPhotoCropBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPhotoCropBinding activityPhotoCropBinding = (ActivityPhotoCropBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_photo_crop, null, false, obj);
        int i4 = component3 + 17;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityPhotoCropBinding;
    }

    public static ActivityPhotoCropBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivityPhotoCropBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 65;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityPhotoCropBinding activityPhotoCropBinding = (ActivityPhotoCropBinding) bind(obj, view, R.layout.activity_photo_crop);
        if (i3 == 0) {
            return activityPhotoCropBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
