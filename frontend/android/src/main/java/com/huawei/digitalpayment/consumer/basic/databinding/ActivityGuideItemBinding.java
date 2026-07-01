package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.basic.R;

public abstract class ActivityGuideItemBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    public final ConstraintLayout content;
    public final Guideline guidelineLeft;
    public final Guideline guidelineRight;
    public final Guideline guidelineTop;
    public final ImageView ivGuideImage;
    public final ImageView ivGuideText;

    protected ActivityGuideItemBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, Guideline guideline3, ImageView imageView, ImageView imageView2) {
        super(obj, view, i);
        this.content = constraintLayout;
        this.guidelineLeft = guideline;
        this.guidelineRight = guideline2;
        this.guidelineTop = guideline3;
        this.ivGuideImage = imageView;
        this.ivGuideText = imageView2;
    }

    public static ActivityGuideItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityGuideItemBinding activityGuideItemBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 125;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityGuideItemBindingInflate;
    }

    @Deprecated
    public static ActivityGuideItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityGuideItemBinding activityGuideItemBinding = (ActivityGuideItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_guide_item, viewGroup, z, obj);
        int i4 = component3 + 37;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityGuideItemBinding;
    }

    public static ActivityGuideItemBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityGuideItemBinding activityGuideItemBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 103;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityGuideItemBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityGuideItemBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 47;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityGuideItemBinding activityGuideItemBinding = (ActivityGuideItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_guide_item, null, false, obj);
        int i4 = component3 + 87;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityGuideItemBinding;
        }
        throw null;
    }

    public static ActivityGuideItemBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 111;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityGuideItemBinding activityGuideItemBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 51;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return activityGuideItemBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivityGuideItemBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityGuideItemBinding activityGuideItemBinding = (ActivityGuideItemBinding) bind(obj, view, R.layout.activity_guide_item);
        int i4 = component3 + 7;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityGuideItemBinding;
        }
        throw null;
    }
}
