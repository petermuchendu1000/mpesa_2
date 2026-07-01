package com.huawei.digitalpayment.consumer.developer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.developer.R;

public abstract class ActivityNetConfigBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final CommonInputView baseUrl;
    public final LoadingButton confirm;
    public final CommonInputView pinTransformation;
    public final CommonInputView signTransformation;

    protected ActivityNetConfigBinding(Object obj, View view, int i, CommonInputView commonInputView, LoadingButton loadingButton, CommonInputView commonInputView2, CommonInputView commonInputView3) {
        super(obj, view, i);
        this.baseUrl = commonInputView;
        this.confirm = loadingButton;
        this.pinTransformation = commonInputView2;
        this.signTransformation = commonInputView3;
    }

    public static ActivityNetConfigBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityNetConfigBinding activityNetConfigBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 119;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityNetConfigBindingInflate;
    }

    @Deprecated
    public static ActivityNetConfigBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityNetConfigBinding activityNetConfigBinding = (ActivityNetConfigBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_net_config, viewGroup, z, obj);
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        return activityNetConfigBinding;
    }

    public static ActivityNetConfigBinding inflate(LayoutInflater layoutInflater) {
        ActivityNetConfigBinding activityNetConfigBindingInflate;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            activityNetConfigBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 85 / 0;
        } else {
            activityNetConfigBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 9;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityNetConfigBindingInflate;
    }

    @Deprecated
    public static ActivityNetConfigBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityNetConfigBinding activityNetConfigBinding = (ActivityNetConfigBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_net_config, null, false, obj);
        int i4 = ShareDataUIState + 81;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityNetConfigBinding;
    }

    public static ActivityNetConfigBinding bind(View view) {
        ActivityNetConfigBinding activityNetConfigBindingBind;
        int i = 2 % 2;
        int i2 = copydefault + 87;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            activityNetConfigBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 62 / 0;
        } else {
            activityNetConfigBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 21;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return activityNetConfigBindingBind;
    }

    @Deprecated
    public static ActivityNetConfigBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityNetConfigBinding activityNetConfigBinding = (ActivityNetConfigBinding) bind(obj, view, R.layout.activity_net_config);
        if (i3 == 0) {
            return activityNetConfigBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
