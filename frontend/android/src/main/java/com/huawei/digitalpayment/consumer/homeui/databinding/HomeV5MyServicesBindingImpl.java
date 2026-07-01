package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class HomeV5MyServicesBindingImpl extends HomeV5MyServicesBinding {
    private static final SparseIntArray ShareDataUIState;
    private static int component1 = 0;
    private static int copy = 0;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int equals = 1;
    private static int getAsAtTimestamp = 1;
    private final ConstraintLayout component2;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.lifeRecycler, 1);
        int i = component1 + 93;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    public HomeV5MyServicesBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, copydefault, ShareDataUIState));
    }

    private HomeV5MyServicesBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[1]);
        this.component3 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component2 = constraintLayout;
        constraintLayout.setTag(null);
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

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = equals + 31;
        int i5 = i4 % 128;
        copy = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 111;
        equals = i7 % 128;
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
        int i3 = equals;
        int i4 = i3 + 41;
        copy = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 119;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
