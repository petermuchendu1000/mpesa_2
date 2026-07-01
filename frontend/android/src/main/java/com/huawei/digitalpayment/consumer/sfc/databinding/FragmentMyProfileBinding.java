package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class FragmentMyProfileBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final LayoutProfileCardBinding lyProfileCard;
    public final RecyclerView rvAccountSettings;
    public final RecyclerView rvQuickActions;
    public final RecyclerView rvQuickCare;
    public final TextView tvAccountSettings;
    public final TextView tvAppVersion;
    public final TextView tvLogout;
    public final TextView tvQuickActions;
    public final TextView tvQuickCare;

    protected FragmentMyProfileBinding(Object obj, View view, int i, LayoutProfileCardBinding layoutProfileCardBinding, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.lyProfileCard = layoutProfileCardBinding;
        this.rvAccountSettings = recyclerView;
        this.rvQuickActions = recyclerView2;
        this.rvQuickCare = recyclerView3;
        this.tvAccountSettings = textView;
        this.tvAppVersion = textView2;
        this.tvLogout = textView3;
        this.tvQuickActions = textView4;
        this.tvQuickCare = textView5;
    }

    public static FragmentMyProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 83;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentMyProfileBinding fragmentMyProfileBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 65;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentMyProfileBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentMyProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 39;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentMyProfileBinding fragmentMyProfileBinding = (FragmentMyProfileBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_my_profile, viewGroup, z, obj);
        int i4 = component1 + 17;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentMyProfileBinding;
    }

    public static FragmentMyProfileBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentMyProfileBinding fragmentMyProfileBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 93;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentMyProfileBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static FragmentMyProfileBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 101;
        component3 = i2 % 128;
        return (FragmentMyProfileBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 == 0 ? R.layout.fragment_my_profile : R.layout.fragment_my_profile, null, false, obj);
    }

    public static FragmentMyProfileBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FragmentMyProfileBinding fragmentMyProfileBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 97;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentMyProfileBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static FragmentMyProfileBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 33;
        component1 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        FragmentMyProfileBinding fragmentMyProfileBinding = (FragmentMyProfileBinding) bind(obj, view, R.layout.fragment_my_profile);
        int i3 = component1 + 55;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return fragmentMyProfileBinding;
        }
        obj2.hashCode();
        throw null;
    }
}
