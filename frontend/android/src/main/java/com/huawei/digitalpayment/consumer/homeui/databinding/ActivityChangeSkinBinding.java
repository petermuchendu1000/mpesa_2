package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ActivityChangeSkinBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public final LoadingButton btnConfirm;
    public final ConstraintLayout constraintLayout;
    public final LinearLayout cycleIndicator;
    public final ViewPager cycleViewPager;
    public final ImageView ivBack;
    public final LinearLayout llTop;
    public final TextView title;

    protected ActivityChangeSkinBinding(Object obj, View view, int i, LoadingButton loadingButton, ConstraintLayout constraintLayout, LinearLayout linearLayout, ViewPager viewPager, ImageView imageView, LinearLayout linearLayout2, TextView textView) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.constraintLayout = constraintLayout;
        this.cycleIndicator = linearLayout;
        this.cycleViewPager = viewPager;
        this.ivBack = imageView;
        this.llTop = linearLayout2;
        this.title = textView;
    }

    public static ActivityChangeSkinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityChangeSkinBinding activityChangeSkinBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 57;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityChangeSkinBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityChangeSkinBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityChangeSkinBinding activityChangeSkinBinding = (ActivityChangeSkinBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_change_skin, viewGroup, z, obj);
        int i4 = ShareDataUIState + 75;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
        return activityChangeSkinBinding;
    }

    public static ActivityChangeSkinBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityChangeSkinBinding activityChangeSkinBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 23;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityChangeSkinBindingInflate;
    }

    @Deprecated
    public static ActivityChangeSkinBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityChangeSkinBinding activityChangeSkinBinding = (ActivityChangeSkinBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_change_skin, null, false, obj);
        int i4 = component2 + 69;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return activityChangeSkinBinding;
    }

    public static ActivityChangeSkinBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityChangeSkinBinding activityChangeSkinBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 85;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityChangeSkinBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityChangeSkinBinding bind(View view, Object obj) {
        ActivityChangeSkinBinding activityChangeSkinBinding;
        int i = 2 % 2;
        int i2 = component2 + 7;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            activityChangeSkinBinding = (ActivityChangeSkinBinding) bind(obj, view, R.layout.activity_change_skin);
            int i3 = 72 / 0;
        } else {
            activityChangeSkinBinding = (ActivityChangeSkinBinding) bind(obj, view, R.layout.activity_change_skin);
        }
        int i4 = ShareDataUIState + 101;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityChangeSkinBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
