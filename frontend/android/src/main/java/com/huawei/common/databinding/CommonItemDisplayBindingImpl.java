package com.huawei.common.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.DisplayView;

public class CommonItemDisplayBindingImpl extends CommonItemDisplayBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component2 = null;
    private long component1;

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        return true;
    }

    public CommonItemDisplayBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, ShareDataUIState, component2));
    }

    private CommonItemDisplayBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (DisplayView) objArr[0]);
        this.component1 = -1L;
        this.displayView.setTag(null);
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
}
