package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySfcRoamingInternationalBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    public final RoundImageView ivBack;
    public final RecyclerView rvRoamingIntl;
    public final TextView tvTitle;
    public final View viewBg;

    protected ActivitySfcRoamingInternationalBinding(Object obj, View view, int i, RoundImageView roundImageView, RecyclerView recyclerView, TextView textView, View view2) {
        super(obj, view, i);
        this.ivBack = roundImageView;
        this.rvRoamingIntl = recyclerView;
        this.tvTitle = textView;
        this.viewBg = view2;
    }

    public static ActivitySfcRoamingInternationalBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        ActivitySfcRoamingInternationalBinding activitySfcRoamingInternationalBindingInflate;
        int i = 2 % 2;
        int i2 = copydefault + 65;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            activitySfcRoamingInternationalBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 59 / 0;
        } else {
            activitySfcRoamingInternationalBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 63;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcRoamingInternationalBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySfcRoamingInternationalBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        ActivitySfcRoamingInternationalBinding activitySfcRoamingInternationalBinding;
        int i = 2 % 2;
        int i2 = copydefault + 49;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            activitySfcRoamingInternationalBinding = (ActivitySfcRoamingInternationalBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_roaming_international, viewGroup, z, obj);
            int i3 = 21 / 0;
        } else {
            activitySfcRoamingInternationalBinding = (ActivitySfcRoamingInternationalBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_roaming_international, viewGroup, z, obj);
        }
        int i4 = ShareDataUIState + 97;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySfcRoamingInternationalBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ActivitySfcRoamingInternationalBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivitySfcRoamingInternationalBinding activitySfcRoamingInternationalBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 115;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcRoamingInternationalBindingInflate;
    }

    @Deprecated
    public static ActivitySfcRoamingInternationalBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcRoamingInternationalBinding activitySfcRoamingInternationalBinding = (ActivitySfcRoamingInternationalBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_roaming_international, null, false, obj);
        int i4 = ShareDataUIState + 117;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcRoamingInternationalBinding;
    }

    public static ActivitySfcRoamingInternationalBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcRoamingInternationalBinding activitySfcRoamingInternationalBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 85;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcRoamingInternationalBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySfcRoamingInternationalBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcRoamingInternationalBinding activitySfcRoamingInternationalBinding = (ActivitySfcRoamingInternationalBinding) bind(obj, view, R.layout.activity_sfc_roaming_international);
        int i4 = copydefault + 123;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcRoamingInternationalBinding;
        }
        throw null;
    }
}
