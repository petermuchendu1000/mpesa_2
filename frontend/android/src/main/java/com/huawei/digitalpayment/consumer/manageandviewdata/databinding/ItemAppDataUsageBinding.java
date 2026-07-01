package com.huawei.digitalpayment.consumer.manageandviewdata.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.manageandviewdata.R;

public abstract class ItemAppDataUsageBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final ConstraintLayout cardUsageRoot;
    public final ConstraintLayout csTitles;
    public final ConstraintLayout flAppIcon;
    public final ImageView imAppIcon;
    public final ProgressBar prgUsage;
    public final TextView tvAppName;
    public final TextView tvUsage;
    public final View view4;

    protected ItemAppDataUsageBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ImageView imageView, ProgressBar progressBar, TextView textView, TextView textView2, View view2) {
        super(obj, view, i);
        this.cardUsageRoot = constraintLayout;
        this.csTitles = constraintLayout2;
        this.flAppIcon = constraintLayout3;
        this.imAppIcon = imageView;
        this.prgUsage = progressBar;
        this.tvAppName = textView;
        this.tvUsage = textView2;
        this.view4 = view2;
    }

    public static ItemAppDataUsageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemAppDataUsageBinding itemAppDataUsageBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 53;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemAppDataUsageBindingInflate;
    }

    @Deprecated
    public static ItemAppDataUsageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 111;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemAppDataUsageBinding itemAppDataUsageBinding = (ItemAppDataUsageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_app_data_usage, viewGroup, z, obj);
        if (i3 == 0) {
            return itemAppDataUsageBinding;
        }
        throw null;
    }

    public static ItemAppDataUsageBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemAppDataUsageBinding itemAppDataUsageBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 29;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemAppDataUsageBindingInflate;
    }

    @Deprecated
    public static ItemAppDataUsageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component3 + 117;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.item_app_data_usage;
            z = true;
        } else {
            i = R.layout.item_app_data_usage;
            z = false;
        }
        return (ItemAppDataUsageBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static ItemAppDataUsageBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemAppDataUsageBinding itemAppDataUsageBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 121;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemAppDataUsageBindingBind;
    }

    @Deprecated
    public static ItemAppDataUsageBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemAppDataUsageBinding itemAppDataUsageBinding = (ItemAppDataUsageBinding) bind(obj, view, R.layout.item_app_data_usage);
        int i4 = component3 + 21;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return itemAppDataUsageBinding;
    }
}
