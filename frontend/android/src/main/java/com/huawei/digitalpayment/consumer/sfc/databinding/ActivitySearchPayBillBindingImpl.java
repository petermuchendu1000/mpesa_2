package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ActivitySearchPayBillBindingImpl extends ActivitySearchPayBillBinding {
    private static int ShareDataUIState = 0;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static final SparseIntArray component2;
    private static int component4 = 1;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;
    private final ConstraintLayout component3;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.compose_screen_header, 1);
        sparseIntArray.put(R.id.rvCategory, 2);
        sparseIntArray.put(R.id.rvBill, 3);
        int i = ShareDataUIState + 25;
        component4 = i % 128;
        int i2 = i % 2;
    }

    public ActivitySearchPayBillBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, component1, component2));
    }

    private ActivitySearchPayBillBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ComposeView) objArr[1], (RecyclerView) objArr[3], (RecyclerView) objArr[2]);
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

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = getAsAtTimestamp + 27;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 61;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 81;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
