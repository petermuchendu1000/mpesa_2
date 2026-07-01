package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentFunctionsTemplate1Binding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public final RoundImageView background;
    public final RecyclerView recyclerView;
    public final RoundConstraintLayout root;

    protected FragmentFunctionsTemplate1Binding(Object obj, View view, int i, RoundImageView roundImageView, RecyclerView recyclerView, RoundConstraintLayout roundConstraintLayout) {
        super(obj, view, i);
        this.background = roundImageView;
        this.recyclerView = recyclerView;
        this.root = roundConstraintLayout;
    }

    public static FragmentFunctionsTemplate1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 5;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentFunctionsTemplate1Binding fragmentFunctionsTemplate1BindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 35;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentFunctionsTemplate1BindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static FragmentFunctionsTemplate1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        ShareDataUIState = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        FragmentFunctionsTemplate1Binding fragmentFunctionsTemplate1Binding = (FragmentFunctionsTemplate1Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_functions_template1, viewGroup, z, obj);
        int i3 = component2 + 105;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return fragmentFunctionsTemplate1Binding;
        }
        obj2.hashCode();
        throw null;
    }

    public static FragmentFunctionsTemplate1Binding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FragmentFunctionsTemplate1Binding fragmentFunctionsTemplate1BindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 47;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return fragmentFunctionsTemplate1BindingInflate;
    }

    @Deprecated
    public static FragmentFunctionsTemplate1Binding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 121;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentFunctionsTemplate1Binding fragmentFunctionsTemplate1Binding = (FragmentFunctionsTemplate1Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_functions_template1, null, false, obj);
        int i4 = component2 + 121;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentFunctionsTemplate1Binding;
    }

    public static FragmentFunctionsTemplate1Binding bind(View view) {
        FragmentFunctionsTemplate1Binding fragmentFunctionsTemplate1BindingBind;
        int i = 2 % 2;
        int i2 = component2 + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            fragmentFunctionsTemplate1BindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 15 / 0;
        } else {
            fragmentFunctionsTemplate1BindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = ShareDataUIState + 1;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentFunctionsTemplate1BindingBind;
        }
        throw null;
    }

    @Deprecated
    public static FragmentFunctionsTemplate1Binding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentFunctionsTemplate1Binding fragmentFunctionsTemplate1Binding = (FragmentFunctionsTemplate1Binding) bind(obj, view, R.layout.fragment_functions_template1);
        int i4 = component2 + 97;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentFunctionsTemplate1Binding;
    }
}
