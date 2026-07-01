package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.R;
import com.huawei.common.widget.recyclerview.HFRecyclerView;

public abstract class BasicHorizontalCardviewBinding extends ViewDataBinding {
    public final HFRecyclerView recyclerview;

    protected BasicHorizontalCardviewBinding(Object obj, View view, int i, HFRecyclerView hFRecyclerView) {
        super(obj, view, i);
        this.recyclerview = hFRecyclerView;
    }

    public static BasicHorizontalCardviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BasicHorizontalCardviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (BasicHorizontalCardviewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.basic_horizontal_cardview, viewGroup, z, obj);
    }

    public static BasicHorizontalCardviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BasicHorizontalCardviewBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (BasicHorizontalCardviewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.basic_horizontal_cardview, null, false, obj);
    }

    public static BasicHorizontalCardviewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BasicHorizontalCardviewBinding bind(View view, Object obj) {
        return (BasicHorizontalCardviewBinding) bind(obj, view, R.layout.basic_horizontal_cardview);
    }
}
