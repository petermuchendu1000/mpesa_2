package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundRecyclerView;

public class ItemHomePinGroupFunctionBindingImpl extends ItemHomePinGroupFunctionBinding {
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component2 = 1;
    private static final SparseIntArray component3 = null;
    private static int copy = 1;
    private static int copydefault;
    private static int getRequestBeneficiariesState;
    private long ShareDataUIState;

    public ItemHomePinGroupFunctionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, component1, component3));
    }

    private ItemHomePinGroupFunctionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundRecyclerView) objArr[0]);
        this.ShareDataUIState = -1L;
        this.groupFunctionRecycler.setTag(null);
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
        int i = 1 + 15;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = getRequestBeneficiariesState;
        int i5 = i4 + 3;
        copy = i5 % 128;
        boolean z = !(i5 % 2 != 0);
        int i6 = i4 + 41;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 105;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 11;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
