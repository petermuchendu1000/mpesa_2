package com.huawei.common.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.R;
import com.huawei.common.widget.recyclerview.HFRecyclerView;

public class BasicHorizontalCardviewBindingImpl extends BasicHorizontalCardviewBinding {
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static final SparseIntArray component2;
    private final ConstraintLayout component3;
    private long copydefault;

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.recyclerview, 1);
    }

    public BasicHorizontalCardviewBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, component1, component2));
    }

    private BasicHorizontalCardviewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (HFRecyclerView) objArr[1]);
        this.copydefault = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component3 = constraintLayout;
        constraintLayout.setTag(null);
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
}
