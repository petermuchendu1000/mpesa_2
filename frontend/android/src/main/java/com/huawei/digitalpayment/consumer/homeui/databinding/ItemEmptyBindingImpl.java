package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

public class ItemEmptyBindingImpl extends ItemEmptyBinding {
    private static int component2 = 0;
    private static final SparseIntArray component3 = null;
    private static int copy = 0;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int equals = 1;
    private static int getRequestBeneficiariesState = 1;
    private final View ShareDataUIState;
    private long component1;

    public ItemEmptyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, copydefault, component3));
    }

    private ItemEmptyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.component1 = -1L;
        View view2 = (View) objArr[0];
        this.ShareDataUIState = view2;
        view2.setTag(null);
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
        int i = 1 + 109;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = copy + 99;
        equals = i4 % 128;
        return i4 % 2 == 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 13;
        int i4 = i3 % 128;
        equals = i4;
        boolean z = i3 % 2 != 0;
        int i5 = i4 + 11;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return z;
    }
}
