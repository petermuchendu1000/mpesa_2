package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityManageLineBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int copydefault;
    public final CardView simRegCard;

    protected ActivityManageLineBinding(Object obj, View view, int i, CardView cardView) {
        super(obj, view, i);
        this.simRegCard = cardView;
    }

    public static ActivityManageLineBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityManageLineBinding activityManageLineBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
        return activityManageLineBindingInflate;
    }

    @Deprecated
    public static ActivityManageLineBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        ActivityManageLineBinding activityManageLineBinding;
        int i = 2 % 2;
        int i2 = component1 + 59;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            activityManageLineBinding = (ActivityManageLineBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_manage_line, viewGroup, z, obj);
            int i3 = 82 / 0;
        } else {
            activityManageLineBinding = (ActivityManageLineBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_manage_line, viewGroup, z, obj);
        }
        int i4 = component1 + 37;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activityManageLineBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ActivityManageLineBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityManageLineBinding activityManageLineBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 101;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activityManageLineBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityManageLineBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component1 + 91;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.activity_manage_line;
            z = true;
        } else {
            i = R.layout.activity_manage_line;
            z = false;
        }
        ActivityManageLineBinding activityManageLineBinding = (ActivityManageLineBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = copydefault + 17;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityManageLineBinding;
    }

    public static ActivityManageLineBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityManageLineBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.activity_manage_line);
        if (i3 != 0) {
            return (ActivityManageLineBinding) viewDataBindingBind;
        }
        throw null;
    }
}
