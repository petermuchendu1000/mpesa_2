package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentItemAppsSnapshotBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    public final LoadingButton btnEdit;
    public final ImageView imageBg;
    public final LinearLayout llServices;
    public final RoundLinearLayout rlRoot;
    public final TextView tvTitle;

    protected FragmentItemAppsSnapshotBinding(Object obj, View view, int i, LoadingButton loadingButton, ImageView imageView, LinearLayout linearLayout, RoundLinearLayout roundLinearLayout, TextView textView) {
        super(obj, view, i);
        this.btnEdit = loadingButton;
        this.imageBg = imageView;
        this.llServices = linearLayout;
        this.rlRoot = roundLinearLayout;
        this.tvTitle = textView;
    }

    public static FragmentItemAppsSnapshotBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 81;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentItemAppsSnapshotBinding fragmentItemAppsSnapshotBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        return fragmentItemAppsSnapshotBindingInflate;
    }

    @Deprecated
    public static FragmentItemAppsSnapshotBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentItemAppsSnapshotBinding fragmentItemAppsSnapshotBinding = (FragmentItemAppsSnapshotBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_item_apps_snapshot, viewGroup, z, obj);
        if (i3 == 0) {
            return fragmentItemAppsSnapshotBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static FragmentItemAppsSnapshotBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentItemAppsSnapshotBinding fragmentItemAppsSnapshotBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 87;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentItemAppsSnapshotBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static FragmentItemAppsSnapshotBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return (FragmentItemAppsSnapshotBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_item_apps_snapshot, null, false, obj);
    }

    public static FragmentItemAppsSnapshotBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentItemAppsSnapshotBinding fragmentItemAppsSnapshotBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        return fragmentItemAppsSnapshotBindingBind;
    }

    @Deprecated
    public static FragmentItemAppsSnapshotBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentItemAppsSnapshotBinding fragmentItemAppsSnapshotBinding = (FragmentItemAppsSnapshotBinding) bind(obj, view, R.layout.fragment_item_apps_snapshot);
        int i4 = component3 + 107;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentItemAppsSnapshotBinding;
    }
}
