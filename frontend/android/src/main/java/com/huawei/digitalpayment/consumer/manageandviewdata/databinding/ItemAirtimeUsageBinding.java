package com.huawei.digitalpayment.consumer.manageandviewdata.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;
import com.huawei.digitalpayment.consumer.manageandviewdata.R;

public abstract class ItemAirtimeUsageBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final MaterialCardView cardAppIcon;
    public final ConstraintLayout cardUsageRoot;
    public final ConstraintLayout csTitles;
    public final ImageView imAppIcon;
    public final TextView tvAppName;
    public final ImageView tvBuy;
    public final TextView tvPercentage;
    public final TextView tvUsage;

    protected ItemAirtimeUsageBinding(Object obj, View view, int i, MaterialCardView materialCardView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.cardAppIcon = materialCardView;
        this.cardUsageRoot = constraintLayout;
        this.csTitles = constraintLayout2;
        this.imAppIcon = imageView;
        this.tvAppName = textView;
        this.tvBuy = imageView2;
        this.tvPercentage = textView2;
        this.tvUsage = textView3;
    }

    public static ItemAirtimeUsageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemAirtimeUsageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemAirtimeUsageBinding itemAirtimeUsageBinding = (ItemAirtimeUsageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_airtime_usage, viewGroup, z, obj);
        int i4 = copydefault + 77;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return itemAirtimeUsageBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ItemAirtimeUsageBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ItemAirtimeUsageBinding itemAirtimeUsageBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 29;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return itemAirtimeUsageBindingInflate;
    }

    @Deprecated
    public static ItemAirtimeUsageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 61;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.item_airtime_usage;
            z = true;
        } else {
            i = R.layout.item_airtime_usage;
            z = false;
        }
        return (ItemAirtimeUsageBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static ItemAirtimeUsageBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ItemAirtimeUsageBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ItemAirtimeUsageBinding itemAirtimeUsageBinding = (ItemAirtimeUsageBinding) bind(obj, view, R.layout.item_airtime_usage);
        int i3 = copydefault + 61;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return itemAirtimeUsageBinding;
    }
}
