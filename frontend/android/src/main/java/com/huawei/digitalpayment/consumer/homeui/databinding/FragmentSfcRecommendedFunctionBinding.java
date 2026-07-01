package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentSfcRecommendedFunctionBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final RecyclerView recyclerView;
    public final TextView tvTitle;

    protected FragmentSfcRecommendedFunctionBinding(Object obj, View view, int i, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i);
        this.recyclerView = recyclerView;
        this.tvTitle = textView;
    }

    public static FragmentSfcRecommendedFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static FragmentSfcRecommendedFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcRecommendedFunctionBinding fragmentSfcRecommendedFunctionBinding = (FragmentSfcRecommendedFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_recommended_function, viewGroup, z, obj);
        int i4 = component1 + 55;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return fragmentSfcRecommendedFunctionBinding;
    }

    public static FragmentSfcRecommendedFunctionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 17;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcRecommendedFunctionBinding fragmentSfcRecommendedFunctionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 91;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return fragmentSfcRecommendedFunctionBindingInflate;
    }

    @Deprecated
    public static FragmentSfcRecommendedFunctionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 125;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcRecommendedFunctionBinding fragmentSfcRecommendedFunctionBinding = (FragmentSfcRecommendedFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_recommended_function, null, false, obj);
        int i4 = component3 + 65;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return fragmentSfcRecommendedFunctionBinding;
    }

    public static FragmentSfcRecommendedFunctionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static FragmentSfcRecommendedFunctionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcRecommendedFunctionBinding fragmentSfcRecommendedFunctionBinding = (FragmentSfcRecommendedFunctionBinding) bind(obj, view, R.layout.fragment_sfc_recommended_function);
        int i4 = component3 + 9;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentSfcRecommendedFunctionBinding;
        }
        throw null;
    }
}
