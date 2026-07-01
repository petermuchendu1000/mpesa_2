package com.huawei.digitalpayment.consumer.profileui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.profileui.R;

public abstract class ActivityChangeMsisdnResultBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public final LoadingButton btnNext;
    public final ImageView ivSuccess;

    protected ActivityChangeMsisdnResultBinding(Object obj, View view, int i, LoadingButton loadingButton, ImageView imageView) {
        super(obj, view, i);
        this.btnNext = loadingButton;
        this.ivSuccess = imageView;
    }

    public static ActivityChangeMsisdnResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        ActivityChangeMsisdnResultBinding activityChangeMsisdnResultBindingInflate;
        int i = 2 % 2;
        int i2 = component2 + 35;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            activityChangeMsisdnResultBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 36 / 0;
        } else {
            activityChangeMsisdnResultBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = ShareDataUIState + 21;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return activityChangeMsisdnResultBindingInflate;
    }

    @Deprecated
    public static ActivityChangeMsisdnResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityChangeMsisdnResultBinding activityChangeMsisdnResultBinding = (ActivityChangeMsisdnResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_change_msisdn_result, viewGroup, z, obj);
        int i4 = ShareDataUIState + 91;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityChangeMsisdnResultBinding;
        }
        throw null;
    }

    public static ActivityChangeMsisdnResultBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityChangeMsisdnResultBinding activityChangeMsisdnResultBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 125;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return activityChangeMsisdnResultBindingInflate;
    }

    @Deprecated
    public static ActivityChangeMsisdnResultBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 101;
        ShareDataUIState = i2 % 128;
        return (ActivityChangeMsisdnResultBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 != 0 ? R.layout.activity_change_msisdn_result : R.layout.activity_change_msisdn_result, null, false, obj);
    }

    public static ActivityChangeMsisdnResultBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityChangeMsisdnResultBinding activityChangeMsisdnResultBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 49;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return activityChangeMsisdnResultBindingBind;
    }

    @Deprecated
    public static ActivityChangeMsisdnResultBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityChangeMsisdnResultBinding activityChangeMsisdnResultBinding = (ActivityChangeMsisdnResultBinding) bind(obj, view, R.layout.activity_change_msisdn_result);
        int i4 = component2 + 75;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityChangeMsisdnResultBinding;
    }
}
