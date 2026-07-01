package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.SearchView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentLifeBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    public final FragmentContainerView homeServiceSnapshot;
    public final RecyclerView lifeRecycler;
    public final SearchView lifeSearch;
    public final RoundTextView tvTitle;
    public final View viewStatusBar;

    protected FragmentLifeBinding(Object obj, View view, int i, FragmentContainerView fragmentContainerView, RecyclerView recyclerView, SearchView searchView, RoundTextView roundTextView, View view2) {
        super(obj, view, i);
        this.homeServiceSnapshot = fragmentContainerView;
        this.lifeRecycler = recyclerView;
        this.lifeSearch = searchView;
        this.tvTitle = roundTextView;
        this.viewStatusBar = view2;
    }

    public static FragmentLifeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static FragmentLifeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 57;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        FragmentLifeBinding fragmentLifeBinding = (FragmentLifeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_life, viewGroup, z, obj);
        int i3 = copydefault + 27;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return fragmentLifeBinding;
        }
        throw null;
    }

    public static FragmentLifeBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentLifeBinding fragmentLifeBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 81;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentLifeBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static FragmentLifeBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return (FragmentLifeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_life, null, false, obj);
    }

    public static FragmentLifeBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentLifeBinding fragmentLifeBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 95;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentLifeBindingBind;
    }

    @Deprecated
    public static FragmentLifeBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentLifeBinding fragmentLifeBinding = (FragmentLifeBinding) bind(obj, view, R.layout.fragment_life);
        int i4 = component2 + 69;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentLifeBinding;
        }
        throw null;
    }
}
