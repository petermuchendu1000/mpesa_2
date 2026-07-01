package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class ActivityAddATransactionBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public final LoadingButton btnContinue;
    public final CommonInputView inputAmount;
    public final CommonInputView inputDate;
    public final CommonInputView inputReferenceNumber;

    protected ActivityAddATransactionBinding(Object obj, View view, int i, LoadingButton loadingButton, CommonInputView commonInputView, CommonInputView commonInputView2, CommonInputView commonInputView3) {
        super(obj, view, i);
        this.btnContinue = loadingButton;
        this.inputAmount = commonInputView;
        this.inputDate = commonInputView2;
        this.inputReferenceNumber = commonInputView3;
    }

    public static ActivityAddATransactionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivityAddATransactionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityAddATransactionBinding activityAddATransactionBinding = (ActivityAddATransactionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_add_a_transaction, viewGroup, z, obj);
        int i4 = ShareDataUIState + 63;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityAddATransactionBinding;
    }

    public static ActivityAddATransactionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityAddATransactionBinding activityAddATransactionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 5;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityAddATransactionBindingInflate;
    }

    @Deprecated
    public static ActivityAddATransactionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityAddATransactionBinding activityAddATransactionBinding = (ActivityAddATransactionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_add_a_transaction, null, false, obj);
        int i4 = ShareDataUIState + 39;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return activityAddATransactionBinding;
    }

    public static ActivityAddATransactionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 39;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityAddATransactionBinding activityAddATransactionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 105;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 69 / 0;
        }
        return activityAddATransactionBindingBind;
    }

    @Deprecated
    public static ActivityAddATransactionBinding bind(View view, Object obj) {
        ActivityAddATransactionBinding activityAddATransactionBinding;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            activityAddATransactionBinding = (ActivityAddATransactionBinding) bind(obj, view, R.layout.activity_add_a_transaction);
            int i3 = 51 / 0;
        } else {
            activityAddATransactionBinding = (ActivityAddATransactionBinding) bind(obj, view, R.layout.activity_add_a_transaction);
        }
        int i4 = component2 + 53;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return activityAddATransactionBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
