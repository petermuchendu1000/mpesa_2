package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundRecyclerView;

public class ItemMyFunctionGroupBindingImpl extends ItemMyFunctionGroupBinding {
    private static int ShareDataUIState = 1;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static final SparseIntArray component2 = null;
    private static int component3 = 0;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;
    private long copydefault;

    public ItemMyFunctionGroupBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, component1, component2));
    }

    private ItemMyFunctionGroupBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundRecyclerView) objArr[0]);
        this.copydefault = -1L;
        this.myRecycler.setTag(null);
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
        int i = 1 + 99;
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
        int i4 = getAsAtTimestamp;
        int i5 = i4 + 125;
        copy = i5 % 128;
        boolean z = i5 % 2 != 0;
        int i6 = i4 + 67;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 44 / 0;
        }
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 113;
        getAsAtTimestamp = i3 % 128;
        return i3 % 2 != 0;
    }
}
