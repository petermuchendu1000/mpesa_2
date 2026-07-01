package com.huawei.digitalpayment.pwaui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

public class LayoutTransparentBindingImpl extends LayoutTransparentBinding {
    private static final SparseIntArray ShareDataUIState = null;
    private static int component1 = 0;
    private static int component3 = 35 % 128;
    private static int component4 = 1;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int getRequestBeneficiariesState;
    private long component2;

    public LayoutTransparentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, copydefault, ShareDataUIState));
    }

    private LayoutTransparentBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[0]);
        this.component2 = -1L;
        this.transparentContent.setTag(null);
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
        if (35 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = component4;
        int i5 = i4 + 13;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 31;
        getRequestBeneficiariesState = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 17;
        getRequestBeneficiariesState = i3 % 128;
        return i3 % 2 == 0;
    }
}
