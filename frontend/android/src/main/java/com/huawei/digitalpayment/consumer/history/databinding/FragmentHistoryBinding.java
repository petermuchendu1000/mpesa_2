package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.history.R;

public abstract class FragmentHistoryBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final ConstraintLayout clContent;
    public final RoundConstraintLayout clRoot;
    public final ImageView imageBg;
    public final RoundLinearLayout llNodata;
    public final RecyclerView rvRecord;
    public final TextView tvTitle;
    public final TextView tvViewall;

    protected FragmentHistoryBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, RoundConstraintLayout roundConstraintLayout, ImageView imageView, RoundLinearLayout roundLinearLayout, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.clContent = constraintLayout;
        this.clRoot = roundConstraintLayout;
        this.imageBg = imageView;
        this.llNodata = roundLinearLayout;
        this.rvRecord = recyclerView;
        this.tvTitle = textView;
        this.tvViewall = textView2;
    }

    public static FragmentHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_history, viewGroup, z, obj);
        if (i3 == 0) {
            return (FragmentHistoryBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static FragmentHistoryBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static FragmentHistoryBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentHistoryBinding fragmentHistoryBinding = (FragmentHistoryBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_history, null, false, obj);
        int i4 = copydefault + 29;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentHistoryBinding;
    }

    public static FragmentHistoryBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentHistoryBinding fragmentHistoryBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 23;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return fragmentHistoryBindingBind;
    }

    @Deprecated
    public static FragmentHistoryBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentHistoryBinding fragmentHistoryBinding = (FragmentHistoryBinding) bind(obj, view, R.layout.fragment_history);
        int i4 = copydefault + 65;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
        return fragmentHistoryBinding;
    }
}
