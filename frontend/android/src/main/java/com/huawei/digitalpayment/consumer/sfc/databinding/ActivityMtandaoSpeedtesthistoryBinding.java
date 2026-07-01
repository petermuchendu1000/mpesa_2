package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityMtandaoSpeedtesthistoryBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component2;
    public final RecyclerView historyRecycler;
    public final ImageView imageView4;
    public final LinearLayout monthContainer;
    public final TextView textView13;
    public final TextView textView15;

    protected ActivityMtandaoSpeedtesthistoryBinding(Object obj, View view, int i, RecyclerView recyclerView, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.historyRecycler = recyclerView;
        this.imageView4 = imageView;
        this.monthContainer = linearLayout;
        this.textView13 = textView;
        this.textView15 = textView2;
    }

    public static ActivityMtandaoSpeedtesthistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 55;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ActivityMtandaoSpeedtesthistoryBinding activityMtandaoSpeedtesthistoryBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 107;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return activityMtandaoSpeedtesthistoryBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivityMtandaoSpeedtesthistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMtandaoSpeedtesthistoryBinding activityMtandaoSpeedtesthistoryBinding = (ActivityMtandaoSpeedtesthistoryBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_mtandao_speedtesthistory, viewGroup, z, obj);
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        return activityMtandaoSpeedtesthistoryBinding;
    }

    public static ActivityMtandaoSpeedtesthistoryBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityMtandaoSpeedtesthistoryBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 39;
        component1 = i2 % 128;
        Object obj2 = null;
        ActivityMtandaoSpeedtesthistoryBinding activityMtandaoSpeedtesthistoryBinding = (ActivityMtandaoSpeedtesthistoryBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 == 0 ? R.layout.activity_mtandao_speedtesthistory : R.layout.activity_mtandao_speedtesthistory, null, false, obj);
        int i3 = component1 + 41;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return activityMtandaoSpeedtesthistoryBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ActivityMtandaoSpeedtesthistoryBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 49;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMtandaoSpeedtesthistoryBinding activityMtandaoSpeedtesthistoryBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 25;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityMtandaoSpeedtesthistoryBindingBind;
    }

    @Deprecated
    public static ActivityMtandaoSpeedtesthistoryBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityMtandaoSpeedtesthistoryBinding activityMtandaoSpeedtesthistoryBinding = (ActivityMtandaoSpeedtesthistoryBinding) bind(obj, view, R.layout.activity_mtandao_speedtesthistory);
        int i4 = component1 + 105;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityMtandaoSpeedtesthistoryBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
