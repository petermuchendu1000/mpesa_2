package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.CommonCheckBox;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.qrcode.R;

public abstract class ActivityPayCodeBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final LoadingButton btnOk;
    public final LayoutPayCodeBinding cvScanPayView;
    public final CommonCheckBox ivCheck;
    public final RoundLinearLayout llCoollect;
    public final LinearLayout llPayGuide;

    protected ActivityPayCodeBinding(Object obj, View view, int i, LoadingButton loadingButton, LayoutPayCodeBinding layoutPayCodeBinding, CommonCheckBox commonCheckBox, RoundLinearLayout roundLinearLayout, LinearLayout linearLayout) {
        super(obj, view, i);
        this.btnOk = loadingButton;
        this.cvScanPayView = layoutPayCodeBinding;
        this.ivCheck = commonCheckBox;
        this.llCoollect = roundLinearLayout;
        this.llPayGuide = linearLayout;
    }

    public static ActivityPayCodeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 85;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivityPayCodeBinding activityPayCodeBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 25;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return activityPayCodeBindingInflate;
    }

    @Deprecated
    public static ActivityPayCodeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        ActivityPayCodeBinding activityPayCodeBinding;
        int i = 2 % 2;
        int i2 = component1 + 113;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            activityPayCodeBinding = (ActivityPayCodeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pay_code, viewGroup, z, obj);
            int i3 = 63 / 0;
        } else {
            activityPayCodeBinding = (ActivityPayCodeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pay_code, viewGroup, z, obj);
        }
        int i4 = component1 + 89;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return activityPayCodeBinding;
    }

    public static ActivityPayCodeBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPayCodeBinding activityPayCodeBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 19;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityPayCodeBindingInflate;
    }

    @Deprecated
    public static ActivityPayCodeBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return (ActivityPayCodeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pay_code, null, false, obj);
    }

    public static ActivityPayCodeBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityPayCodeBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPayCodeBinding activityPayCodeBinding = (ActivityPayCodeBinding) bind(obj, view, R.layout.activity_pay_code);
        int i4 = component1 + 125;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return activityPayCodeBinding;
    }
}
