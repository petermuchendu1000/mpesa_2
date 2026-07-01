package com.huawei.digitalpayment.consumer.manageandviewdata.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.manageandviewdata.R;

public class ItemIndividualUsageBindingImpl extends ItemIndividualUsageBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static int component1 = 0;
    private static final SparseIntArray component3;
    private static int copy = 1;
    private static int copydefault = 1;
    private static int getAsAtTimestamp;
    private long component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.csTotals, 1);
        sparseIntArray.put(R.id.tvAppName, 2);
        sparseIntArray.put(R.id.tvPercentage, 3);
        sparseIntArray.put(R.id.tvUsage, 4);
        int i = component1 + 95;
        copydefault = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public ItemIndividualUsageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, ShareDataUIState, component3));
    }

    private ItemIndividualUsageBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[1], (TextView) objArr[2], (TextView) objArr[3], (TextView) objArr[4]);
        this.component2 = -1L;
        this.cardUsageRoot.setTag(null);
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

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = getAsAtTimestamp + 115;
        int i5 = i4 % 128;
        copy = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 59;
        getAsAtTimestamp = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 121;
        copy = i4 % 128;
        boolean z = i4 % 2 != 0;
        int i5 = i3 + 57;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
