package com.huawei.digitalpayment.consumer.scheduleui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

public class ScheduleActivitySelectTypeBindingImpl extends ScheduleActivitySelectTypeBinding {
    private static int ShareDataUIState = 1;
    private static final SparseIntArray component1 = null;
    private static int component3 = 0;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private long component2;

    public ScheduleActivitySelectTypeBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, copydefault, component1));
    }

    private ScheduleActivitySelectTypeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[0]);
        this.component2 = -1L;
        this.recyclerView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component2 = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component2 != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component2 = 0L;
        }
    }

    static {
        int i = 1 + 107;
        component3 = i % 128;
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
        int i4 = getRequestBeneficiariesState + 83;
        int i5 = i4 % 128;
        getAsAtTimestamp = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 87;
        getRequestBeneficiariesState = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 49;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 119;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
