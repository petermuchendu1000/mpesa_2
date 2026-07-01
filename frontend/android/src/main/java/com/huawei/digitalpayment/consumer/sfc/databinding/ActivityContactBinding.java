package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityContactBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final CommonInputView inputSearch;
    public final RoundImageView ivBack;
    public final ProgressBar progressBar;
    public final RecyclerView rvContact;
    public final TextView tvTitle;
    public final TextView tvTitleHeader;

    protected ActivityContactBinding(Object obj, View view, int i, CommonInputView commonInputView, RoundImageView roundImageView, ProgressBar progressBar, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.inputSearch = commonInputView;
        this.ivBack = roundImageView;
        this.progressBar = progressBar;
        this.rvContact = recyclerView;
        this.tvTitle = textView;
        this.tvTitleHeader = textView2;
    }

    public static ActivityContactBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivityContactBinding activityContactBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 69;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 31 / 0;
        }
        return activityContactBindingInflate;
    }

    @Deprecated
    public static ActivityContactBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 113;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_contact, viewGroup, z, obj);
        if (i3 != 0) {
            return (ActivityContactBinding) viewDataBindingInflateInternal;
        }
        int i4 = 43 / 0;
        return (ActivityContactBinding) viewDataBindingInflateInternal;
    }

    public static ActivityContactBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityContactBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component3 + 39;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.activity_contact;
            z = true;
        } else {
            i = R.layout.activity_contact;
            z = false;
        }
        ActivityContactBinding activityContactBinding = (ActivityContactBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component3 + 59;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityContactBinding;
    }

    public static ActivityContactBinding bind(View view) {
        ActivityContactBinding activityContactBindingBind;
        int i = 2 % 2;
        int i2 = component1 + 55;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            activityContactBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 22 / 0;
        } else {
            activityContactBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component1 + 91;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityContactBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivityContactBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 13;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ActivityContactBinding activityContactBinding = (ActivityContactBinding) bind(obj, view, R.layout.activity_contact);
        int i3 = component1 + 43;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return activityContactBinding;
    }
}
