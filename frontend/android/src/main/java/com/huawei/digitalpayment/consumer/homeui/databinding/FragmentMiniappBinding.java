package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentMiniappBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final RecyclerView rvList;
    public final TextView tvFooter;
    public final TextView tvTitle;
    public final RoundTextView vline;

    protected FragmentMiniappBinding(Object obj, View view, int i, RecyclerView recyclerView, TextView textView, TextView textView2, RoundTextView roundTextView) {
        super(obj, view, i);
        this.rvList = recyclerView;
        this.tvFooter = textView;
        this.tvTitle = textView2;
        this.vline = roundTextView;
    }

    public static FragmentMiniappBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentMiniappBinding fragmentMiniappBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 125;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentMiniappBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static FragmentMiniappBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentMiniappBinding fragmentMiniappBinding = (FragmentMiniappBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_miniapp, viewGroup, z, obj);
        int i4 = component1 + 21;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentMiniappBinding;
    }

    public static FragmentMiniappBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        component3 = i2 % 128;
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
    public static FragmentMiniappBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return (FragmentMiniappBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_miniapp, null, false, obj);
    }

    public static FragmentMiniappBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentMiniappBinding fragmentMiniappBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 53;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentMiniappBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentMiniappBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentMiniappBinding fragmentMiniappBinding = (FragmentMiniappBinding) bind(obj, view, R.layout.fragment_miniapp);
        int i4 = component3 + 23;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentMiniappBinding;
    }
}
