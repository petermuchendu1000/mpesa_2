package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentHomeTopFunctionBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final RecyclerView recyclerView;
    public final RoundTextView topFunctionBottom;

    protected FragmentHomeTopFunctionBinding(Object obj, View view, int i, RecyclerView recyclerView, RoundTextView roundTextView) {
        super(obj, view, i);
        this.recyclerView = recyclerView;
        this.topFunctionBottom = roundTextView;
    }

    public static FragmentHomeTopFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeTopFunctionBinding fragmentHomeTopFunctionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        return fragmentHomeTopFunctionBindingInflate;
    }

    @Deprecated
    public static FragmentHomeTopFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeTopFunctionBinding fragmentHomeTopFunctionBinding = (FragmentHomeTopFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_home_top_function, viewGroup, z, obj);
        int i4 = component1 + 31;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentHomeTopFunctionBinding;
    }

    public static FragmentHomeTopFunctionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeTopFunctionBinding fragmentHomeTopFunctionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 47;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentHomeTopFunctionBindingInflate;
    }

    @Deprecated
    public static FragmentHomeTopFunctionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeTopFunctionBinding fragmentHomeTopFunctionBinding = (FragmentHomeTopFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_home_top_function, null, false, obj);
        int i4 = ShareDataUIState + 31;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentHomeTopFunctionBinding;
        }
        throw null;
    }

    public static FragmentHomeTopFunctionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 83;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeTopFunctionBinding fragmentHomeTopFunctionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 63;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentHomeTopFunctionBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentHomeTopFunctionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeTopFunctionBinding fragmentHomeTopFunctionBinding = (FragmentHomeTopFunctionBinding) bind(obj, view, R.layout.fragment_home_top_function);
        int i4 = component1 + 97;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentHomeTopFunctionBinding;
    }
}
