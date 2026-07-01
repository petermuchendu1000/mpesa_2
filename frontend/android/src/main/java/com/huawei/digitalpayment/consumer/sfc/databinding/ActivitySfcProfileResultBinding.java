package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySfcProfileResultBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int copydefault = 1;
    public final Barrier barrier;
    public final LoadingButton btnConfirm;
    public final ImageView ivStatus;
    public final RoundLinearLayout llPukContainer;
    public final TextView tvContent;
    public final RoundTextView tvCopy;
    public final TextView tvId;
    public final TextView tvStatus;

    protected ActivitySfcProfileResultBinding(Object obj, View view, int i, Barrier barrier, LoadingButton loadingButton, ImageView imageView, RoundLinearLayout roundLinearLayout, TextView textView, RoundTextView roundTextView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.barrier = barrier;
        this.btnConfirm = loadingButton;
        this.ivStatus = imageView;
        this.llPukContainer = roundLinearLayout;
        this.tvContent = textView;
        this.tvCopy = roundTextView;
        this.tvId = textView2;
        this.tvStatus = textView3;
    }

    public static ActivitySfcProfileResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcProfileResultBinding activitySfcProfileResultBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        return activitySfcProfileResultBindingInflate;
    }

    @Deprecated
    public static ActivitySfcProfileResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        ActivitySfcProfileResultBinding activitySfcProfileResultBinding;
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            activitySfcProfileResultBinding = (ActivitySfcProfileResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_profile_result, viewGroup, z, obj);
            int i3 = 42 / 0;
        } else {
            activitySfcProfileResultBinding = (ActivitySfcProfileResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_profile_result, viewGroup, z, obj);
        }
        int i4 = copydefault + 19;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcProfileResultBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ActivitySfcProfileResultBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcProfileResultBinding activitySfcProfileResultBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 39;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySfcProfileResultBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySfcProfileResultBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcProfileResultBinding activitySfcProfileResultBinding = (ActivitySfcProfileResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_profile_result, null, false, obj);
        int i4 = copydefault + 5;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcProfileResultBinding;
    }

    public static ActivitySfcProfileResultBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcProfileResultBinding activitySfcProfileResultBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 11;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return activitySfcProfileResultBindingBind;
    }

    @Deprecated
    public static ActivitySfcProfileResultBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 9;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ActivitySfcProfileResultBinding activitySfcProfileResultBinding = (ActivitySfcProfileResultBinding) bind(obj, view, R.layout.activity_sfc_profile_result);
        int i3 = component1 + 19;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return activitySfcProfileResultBinding;
        }
        throw null;
    }
}
