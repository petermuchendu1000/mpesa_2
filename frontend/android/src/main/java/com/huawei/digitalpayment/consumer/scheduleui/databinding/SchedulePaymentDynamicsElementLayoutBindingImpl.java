package com.huawei.digitalpayment.consumer.scheduleui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.input.CommonInputView;

public class SchedulePaymentDynamicsElementLayoutBindingImpl extends SchedulePaymentDynamicsElementLayoutBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component2 = null;
    private static int component3 = 0;
    private static int copydefault = 1;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private long component1;

    public SchedulePaymentDynamicsElementLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, ShareDataUIState, component2));
    }

    private SchedulePaymentDynamicsElementLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CommonInputView) objArr[0]);
        this.component1 = -1L;
        this.commonInputView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component1 = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component1 != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component1 = 0L;
        }
    }

    static {
        int i = 1 + 39;
        component3 = i % 128;
        int i2 = i % 2;
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = getRequestBeneficiariesState;
        int i5 = i4 + 103;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 111;
        getAsAtTimestamp = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 55;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 71;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 63 / 0;
        }
        return true;
    }
}
