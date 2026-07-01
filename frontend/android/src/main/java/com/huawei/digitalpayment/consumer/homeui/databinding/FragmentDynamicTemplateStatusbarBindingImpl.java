package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

public class FragmentDynamicTemplateStatusbarBindingImpl extends FragmentDynamicTemplateStatusbarBinding {
    private static final SparseIntArray ShareDataUIState = null;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component2 = 1;
    private static int component4 = 1;
    private static int copydefault;
    private static int equals;
    private long component3;

    public FragmentDynamicTemplateStatusbarBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, component1, ShareDataUIState));
    }

    private FragmentDynamicTemplateStatusbarBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (View) objArr[0]);
        this.component3 = -1L;
        this.root.setTag(null);
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
        int i = 1 + 55;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 3 / 0;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = equals;
        int i5 = i4 + 83;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 49;
        component4 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 67;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 7;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
