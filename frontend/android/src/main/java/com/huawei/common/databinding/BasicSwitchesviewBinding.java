package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.R;
import com.huawei.common.widget.round.RoundImageView;

public abstract class BasicSwitchesviewBinding extends ViewDataBinding {
    public final RoundImageView imageView;

    protected BasicSwitchesviewBinding(Object obj, View view, int i, RoundImageView roundImageView) {
        super(obj, view, i);
        this.imageView = roundImageView;
    }

    public static BasicSwitchesviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BasicSwitchesviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (BasicSwitchesviewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.basic_switchesview, viewGroup, z, obj);
    }

    public static BasicSwitchesviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BasicSwitchesviewBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (BasicSwitchesviewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.basic_switchesview, null, false, obj);
    }

    public static BasicSwitchesviewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BasicSwitchesviewBinding bind(View view, Object obj) {
        return (BasicSwitchesviewBinding) bind(obj, view, R.layout.basic_switchesview);
    }
}
