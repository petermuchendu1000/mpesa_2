package com.huawei.digitalpayment.consumer.subsui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

public class FragmentMySubscriptionsBindingImpl extends FragmentMySubscriptionsBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static int component1 = 0;
    private static int copy = 0;
    private static final SparseIntArray copydefault = null;
    private static int equals = 1;
    private static int getRequestBeneficiariesState = 1;
    private final SmartRefreshLayout component2;
    private long component3;

    public FragmentMySubscriptionsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, ShareDataUIState, copydefault));
    }

    private FragmentMySubscriptionsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.component3 = -1L;
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) objArr[0];
        this.component2 = smartRefreshLayout;
        smartRefreshLayout.setTag(null);
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
        int i = 1 + 119;
        component1 = i % 128;
        int i2 = i % 2;
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = copy + 47;
        int i5 = i4 % 128;
        getRequestBeneficiariesState = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 49;
        copy = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 121;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 61;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
