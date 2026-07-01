package com.huawei.digitalpayment.consumer.manageandviewdata.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.manageandviewdata.R;

public abstract class ItemIndividualUsageBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final ConstraintLayout cardUsageRoot;
    public final ConstraintLayout csTotals;
    public final TextView tvAppName;
    public final TextView tvPercentage;
    public final TextView tvUsage;

    protected ItemIndividualUsageBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.cardUsageRoot = constraintLayout;
        this.csTotals = constraintLayout2;
        this.tvAppName = textView;
        this.tvPercentage = textView2;
        this.tvUsage = textView3;
    }

    public static ItemIndividualUsageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 57;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemIndividualUsageBinding itemIndividualUsageBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 45;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return itemIndividualUsageBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemIndividualUsageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemIndividualUsageBinding itemIndividualUsageBinding = (ItemIndividualUsageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_individual_usage, viewGroup, z, obj);
        int i4 = component3 + 109;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemIndividualUsageBinding;
    }

    public static ItemIndividualUsageBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemIndividualUsageBinding itemIndividualUsageBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return itemIndividualUsageBindingInflate;
    }

    @Deprecated
    public static ItemIndividualUsageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component3 + 105;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.item_individual_usage;
            z = true;
        } else {
            i = R.layout.item_individual_usage;
            z = false;
        }
        ItemIndividualUsageBinding itemIndividualUsageBinding = (ItemIndividualUsageBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component3 + 75;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return itemIndividualUsageBinding;
        }
        throw null;
    }

    public static ItemIndividualUsageBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 85;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemIndividualUsageBinding itemIndividualUsageBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 85;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemIndividualUsageBindingBind;
    }

    @Deprecated
    public static ItemIndividualUsageBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemIndividualUsageBinding itemIndividualUsageBinding = (ItemIndividualUsageBinding) bind(obj, view, R.layout.item_individual_usage);
        if (i3 != 0) {
            return itemIndividualUsageBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
