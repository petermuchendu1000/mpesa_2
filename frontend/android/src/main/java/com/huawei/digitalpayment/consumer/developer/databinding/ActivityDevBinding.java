package com.huawei.digitalpayment.consumer.developer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.developer.R;

public abstract class ActivityDevBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int copydefault = 1;
    public final Button btnLogs;
    public final Button copyToken;
    public final Button mockCrash;
    public final Button netConfig;
    public final TextView tvTime;

    protected ActivityDevBinding(Object obj, View view, int i, Button button, Button button2, Button button3, Button button4, TextView textView) {
        super(obj, view, i);
        this.btnLogs = button;
        this.copyToken = button2;
        this.mockCrash = button3;
        this.netConfig = button4;
        this.tvTime = textView;
    }

    public static ActivityDevBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityDevBinding activityDevBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 103;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return activityDevBindingInflate;
    }

    @Deprecated
    public static ActivityDevBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityDevBinding activityDevBinding = (ActivityDevBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_dev, viewGroup, z, obj);
        int i4 = copydefault + 59;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityDevBinding;
        }
        throw null;
    }

    public static ActivityDevBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityDevBinding activityDevBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 9;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return activityDevBindingInflate;
    }

    @Deprecated
    public static ActivityDevBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityDevBinding activityDevBinding = (ActivityDevBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_dev, null, false, obj);
        int i4 = copydefault + 19;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return activityDevBinding;
    }

    public static ActivityDevBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityDevBinding activityDevBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 1;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityDevBindingBind;
    }

    @Deprecated
    public static ActivityDevBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityDevBinding activityDevBinding = (ActivityDevBinding) bind(obj, view, R.layout.activity_dev);
        int i4 = copydefault + 87;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityDevBinding;
    }
}
