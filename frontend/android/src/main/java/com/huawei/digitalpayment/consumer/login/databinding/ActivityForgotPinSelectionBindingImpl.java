package com.huawei.digitalpayment.consumer.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

public class ActivityForgotPinSelectionBindingImpl extends ActivityForgotPinSelectionBinding {
    private static int ShareDataUIState = 119 % 128;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static final SparseIntArray component3 = null;
    private static int copy = 0;
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 1;
    private long component2;

    public ActivityForgotPinSelectionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, component1, component3));
    }

    private ActivityForgotPinSelectionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[0]);
        this.component2 = -1L;
        this.llContent.setTag(null);
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
        int i = 119 % 2;
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = getAsAtTimestamp + 81;
        int i5 = i4 % 128;
        copy = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 109;
        getAsAtTimestamp = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 31;
        int i4 = i3 % 128;
        copy = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 109;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
