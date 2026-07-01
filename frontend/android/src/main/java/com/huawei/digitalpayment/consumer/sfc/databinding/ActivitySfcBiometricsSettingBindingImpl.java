package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

public class ActivitySfcBiometricsSettingBindingImpl extends ActivitySfcBiometricsSettingBinding {
    private static int ShareDataUIState = 1;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component2 = 0;
    private static final SparseIntArray component3 = null;
    private static int copy = 1;
    private static int getRequestBeneficiariesState;
    private long copydefault;

    public ActivitySfcBiometricsSettingBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, component1, component3));
    }

    private ActivitySfcBiometricsSettingBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ComposeView) objArr[0]);
        this.copydefault = -1L;
        this.composeScreen.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.copydefault = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.copydefault != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.copydefault = 0L;
        }
    }

    static {
        int i = 1 + 107;
        component2 = i % 128;
        int i2 = i % 2;
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = getRequestBeneficiariesState + 37;
        int i5 = i4 % 128;
        copy = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 17;
        getRequestBeneficiariesState = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 79;
        getRequestBeneficiariesState = i4 % 128;
        boolean z = i4 % 2 == 0;
        int i5 = i3 + 95;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }
}
