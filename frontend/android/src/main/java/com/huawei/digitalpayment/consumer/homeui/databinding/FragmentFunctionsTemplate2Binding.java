package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentFunctionsTemplate2Binding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final RoundImageView background;
    public final RecyclerView recyclerView;
    public final RoundConstraintLayout root;

    protected FragmentFunctionsTemplate2Binding(Object obj, View view, int i, RoundImageView roundImageView, RecyclerView recyclerView, RoundConstraintLayout roundConstraintLayout) {
        super(obj, view, i);
        this.background = roundImageView;
        this.recyclerView = recyclerView;
        this.root = roundConstraintLayout;
    }

    public static FragmentFunctionsTemplate2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentFunctionsTemplate2Binding fragmentFunctionsTemplate2BindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 15;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return fragmentFunctionsTemplate2BindingInflate;
    }

    @Deprecated
    public static FragmentFunctionsTemplate2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentFunctionsTemplate2Binding fragmentFunctionsTemplate2Binding = (FragmentFunctionsTemplate2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_functions_template2, viewGroup, z, obj);
        int i4 = component1 + 7;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentFunctionsTemplate2Binding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static FragmentFunctionsTemplate2Binding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentFunctionsTemplate2Binding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component3 + 31;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.fragment_functions_template2;
            z = true;
        } else {
            i = R.layout.fragment_functions_template2;
            z = false;
        }
        return (FragmentFunctionsTemplate2Binding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static FragmentFunctionsTemplate2Binding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentFunctionsTemplate2Binding fragmentFunctionsTemplate2BindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 107;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return fragmentFunctionsTemplate2BindingBind;
    }

    @Deprecated
    public static FragmentFunctionsTemplate2Binding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 45;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        FragmentFunctionsTemplate2Binding fragmentFunctionsTemplate2Binding = (FragmentFunctionsTemplate2Binding) bind(obj, view, R.layout.fragment_functions_template2);
        int i3 = component3 + 31;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return fragmentFunctionsTemplate2Binding;
    }
}
