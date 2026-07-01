package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

public class FragmentBillManagerDashboardBindingImpl extends FragmentBillManagerDashboardBinding {
    private static int component1 = 0;
    private static final SparseIntArray component2 = null;
    private static int component3 = 41 % 128;
    private static int component4 = 0;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int equals = 1;
    private long ShareDataUIState;

    public FragmentBillManagerDashboardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, copydefault, component2));
    }

    private FragmentBillManagerDashboardBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ComposeView) objArr[0]);
        this.ShareDataUIState = -1L;
        this.composeView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.ShareDataUIState = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ShareDataUIState != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.ShareDataUIState = 0L;
        }
    }

    static {
        if (41 % 2 == 0) {
            int i = 79 / 0;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = component4;
        int i5 = i4 + 71;
        equals = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 107;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 49 / 0;
        }
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4;
        int i4 = i3 + 79;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 123;
        equals = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
