package com.huawei.digitalpayment.consumer.manageandviewdata.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

public class UsageSpinnerItemBindingImpl extends UsageSpinnerItemBinding {
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static final SparseIntArray component2 = null;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private long copydefault;

    public UsageSpinnerItemBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, component3, component2));
    }

    private UsageSpinnerItemBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[0]);
        this.copydefault = -1L;
        this.text1.setTag(null);
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
        int i = 1 + 5;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = getRequestBeneficiariesState + 113;
        int i5 = i4 % 128;
        equals = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 105;
        getRequestBeneficiariesState = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 87;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 33;
        equals = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 13 / 0;
        }
        return true;
    }
}
