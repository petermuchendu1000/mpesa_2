package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySearchPayBillBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final ComposeView composeScreenHeader;
    public final RecyclerView rvBill;
    public final RecyclerView rvCategory;

    protected ActivitySearchPayBillBinding(Object obj, View view, int i, ComposeView composeView, RecyclerView recyclerView, RecyclerView recyclerView2) {
        super(obj, view, i);
        this.composeScreenHeader = composeView;
        this.rvBill = recyclerView;
        this.rvCategory = recyclerView2;
    }

    public static ActivitySearchPayBillBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        ActivitySearchPayBillBinding activitySearchPayBillBindingInflate;
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            activitySearchPayBillBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 73 / 0;
        } else {
            activitySearchPayBillBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 9;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySearchPayBillBindingInflate;
    }

    @Deprecated
    public static ActivitySearchPayBillBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 1;
        copydefault = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        ActivitySearchPayBillBinding activitySearchPayBillBinding = (ActivitySearchPayBillBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_search_pay_bill, viewGroup, z, obj);
        int i3 = component3 + 21;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return activitySearchPayBillBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ActivitySearchPayBillBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 1;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySearchPayBillBinding activitySearchPayBillBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 1;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySearchPayBillBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySearchPayBillBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySearchPayBillBinding activitySearchPayBillBinding = (ActivitySearchPayBillBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_search_pay_bill, null, false, obj);
        int i4 = component3 + 107;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activitySearchPayBillBinding;
    }

    public static ActivitySearchPayBillBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 49;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySearchPayBillBinding activitySearchPayBillBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 75;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activitySearchPayBillBindingBind;
    }

    @Deprecated
    public static ActivitySearchPayBillBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        component3 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        ActivitySearchPayBillBinding activitySearchPayBillBinding = (ActivitySearchPayBillBinding) bind(obj, view, R.layout.activity_search_pay_bill);
        int i3 = copydefault + 81;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return activitySearchPayBillBinding;
        }
        obj2.hashCode();
        throw null;
    }
}
