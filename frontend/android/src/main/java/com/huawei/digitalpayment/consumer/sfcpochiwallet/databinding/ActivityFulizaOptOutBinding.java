package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;

public abstract class ActivityFulizaOptOutBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int copydefault;
    public final ComposeView composeButtonContainer;
    public final ImageView ivBack;
    public final RecyclerView rvReason;
    public final TextView tvReasonTitle;
    public final TextView tvTitle;

    protected ActivityFulizaOptOutBinding(Object obj, View view, int i, ComposeView composeView, ImageView imageView, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.composeButtonContainer = composeView;
        this.ivBack = imageView;
        this.rvReason = recyclerView;
        this.tvReasonTitle = textView;
        this.tvTitle = textView2;
    }

    public static ActivityFulizaOptOutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivityFulizaOptOutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        ActivityFulizaOptOutBinding activityFulizaOptOutBinding;
        int i = 2 % 2;
        int i2 = copydefault + 61;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            activityFulizaOptOutBinding = (ActivityFulizaOptOutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_fuliza_opt_out, viewGroup, z, obj);
            int i3 = 81 / 0;
        } else {
            activityFulizaOptOutBinding = (ActivityFulizaOptOutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_fuliza_opt_out, viewGroup, z, obj);
        }
        int i4 = component2 + 21;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activityFulizaOptOutBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ActivityFulizaOptOutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 69;
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
    public static ActivityFulizaOptOutBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityFulizaOptOutBinding activityFulizaOptOutBinding = (ActivityFulizaOptOutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_fuliza_opt_out, null, false, obj);
        int i4 = component2 + 77;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return activityFulizaOptOutBinding;
    }

    public static ActivityFulizaOptOutBinding bind(View view) {
        ActivityFulizaOptOutBinding activityFulizaOptOutBindingBind;
        int i = 2 % 2;
        int i2 = copydefault + 115;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            activityFulizaOptOutBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 10 / 0;
        } else {
            activityFulizaOptOutBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component2 + 83;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityFulizaOptOutBindingBind;
    }

    @Deprecated
    public static ActivityFulizaOptOutBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ActivityFulizaOptOutBinding activityFulizaOptOutBinding = (ActivityFulizaOptOutBinding) bind(obj, view, R.layout.activity_fuliza_opt_out);
        int i3 = component2 + 115;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return activityFulizaOptOutBinding;
    }
}
