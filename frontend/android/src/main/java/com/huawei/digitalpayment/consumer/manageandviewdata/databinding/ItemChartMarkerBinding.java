package com.huawei.digitalpayment.consumer.manageandviewdata.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.manageandviewdata.R;

public abstract class ItemChartMarkerBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    public final TextView txChartMarker;

    protected ItemChartMarkerBinding(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.txChartMarker = textView;
    }

    public static ItemChartMarkerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemChartMarkerBinding itemChartMarkerBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 11;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemChartMarkerBindingInflate;
    }

    @Deprecated
    public static ItemChartMarkerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemChartMarkerBinding itemChartMarkerBinding = (ItemChartMarkerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_chart_marker, viewGroup, z, obj);
        int i4 = component3 + 125;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemChartMarkerBinding;
    }

    public static ItemChartMarkerBinding inflate(LayoutInflater layoutInflater) {
        ItemChartMarkerBinding itemChartMarkerBindingInflate;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            itemChartMarkerBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 99 / 0;
        } else {
            itemChartMarkerBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component3 + 51;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemChartMarkerBindingInflate;
    }

    @Deprecated
    public static ItemChartMarkerBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemChartMarkerBinding itemChartMarkerBinding = (ItemChartMarkerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_chart_marker, null, false, obj);
        int i4 = ShareDataUIState + 91;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemChartMarkerBinding;
        }
        throw null;
    }

    public static ItemChartMarkerBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ItemChartMarkerBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 121;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemChartMarkerBinding itemChartMarkerBinding = (ItemChartMarkerBinding) bind(obj, view, R.layout.item_chart_marker);
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return itemChartMarkerBinding;
    }
}
