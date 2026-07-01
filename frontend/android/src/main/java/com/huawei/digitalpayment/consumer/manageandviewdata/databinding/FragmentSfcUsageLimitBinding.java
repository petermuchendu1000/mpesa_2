package com.huawei.digitalpayment.consumer.manageandviewdata.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.huawei.digitalpayment.consumer.manageandviewdata.R;

public abstract class FragmentSfcUsageLimitBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component2;
    public final RecyclerView rcUsageLimit;
    public final SwipeRefreshLayout swRefresh;

    protected FragmentSfcUsageLimitBinding(Object obj, View view, int i, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, i);
        this.rcUsageLimit = recyclerView;
        this.swRefresh = swipeRefreshLayout;
    }

    public static FragmentSfcUsageLimitBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcUsageLimitBinding fragmentSfcUsageLimitBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        return fragmentSfcUsageLimitBindingInflate;
    }

    @Deprecated
    public static FragmentSfcUsageLimitBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 27;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcUsageLimitBinding fragmentSfcUsageLimitBinding = (FragmentSfcUsageLimitBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_usage_limit, viewGroup, z, obj);
        int i4 = component2 + 69;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentSfcUsageLimitBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static FragmentSfcUsageLimitBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcUsageLimitBinding fragmentSfcUsageLimitBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 31;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentSfcUsageLimitBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentSfcUsageLimitBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 123;
        component1 = i2 % 128;
        FragmentSfcUsageLimitBinding fragmentSfcUsageLimitBinding = (FragmentSfcUsageLimitBinding) (i2 % 2 == 0 ? ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_usage_limit, null, true, obj) : ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_usage_limit, null, false, obj));
        int i3 = component2 + 117;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 18 / 0;
        }
        return fragmentSfcUsageLimitBinding;
    }

    public static FragmentSfcUsageLimitBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcUsageLimitBinding fragmentSfcUsageLimitBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 121;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcUsageLimitBindingBind;
    }

    @Deprecated
    public static FragmentSfcUsageLimitBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcUsageLimitBinding fragmentSfcUsageLimitBinding = (FragmentSfcUsageLimitBinding) bind(obj, view, R.layout.fragment_sfc_usage_limit);
        int i4 = component2 + 19;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcUsageLimitBinding;
    }
}
