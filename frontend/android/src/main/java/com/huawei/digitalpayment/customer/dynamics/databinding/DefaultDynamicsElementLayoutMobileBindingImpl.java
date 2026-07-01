package com.huawei.digitalpayment.customer.dynamics.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.baselib.widget.input.MobileInputView;

public class DefaultDynamicsElementLayoutMobileBindingImpl extends DefaultDynamicsElementLayoutMobileBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component1 = null;
    private static int component2 = 123 % 128;
    private static int copy = 1;
    private static int copydefault;
    private static int equals;
    private long component3;

    public DefaultDynamicsElementLayoutMobileBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, ShareDataUIState, component1));
    }

    private DefaultDynamicsElementLayoutMobileBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (MobileInputView) objArr[0]);
        this.component3 = -1L;
        this.commonInputView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component3 = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component3 != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component3 = 0L;
        }
    }

    static {
        int i = 123 % 2;
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = copy + 113;
        int i5 = i4 % 128;
        equals = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 1;
        copy = i7 % 128;
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
        int i3 = copy;
        int i4 = i3 + 57;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 39;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
