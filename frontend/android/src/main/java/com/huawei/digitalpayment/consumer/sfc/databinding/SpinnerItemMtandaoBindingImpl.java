package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public class SpinnerItemMtandaoBindingImpl extends SpinnerItemMtandaoBinding {
    private static int ShareDataUIState = 0;
    private static final SparseIntArray component2;
    private static int component4 = 1;
    private static int copy = 0;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int getAsAtTimestamp = 1;
    private final ConstraintLayout component1;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.text1, 1);
        sparseIntArray.put(R.id.separator, 2);
        int i = component4 + 93;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public SpinnerItemMtandaoBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, copydefault, component2));
    }

    private SpinnerItemMtandaoBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (View) objArr[2], (TextView) objArr[1]);
        this.component3 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component1 = constraintLayout;
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
        int i4 = copy + 1;
        int i5 = i4 % 128;
        getAsAtTimestamp = i5;
        boolean z = i4 % 2 == 0;
        int i6 = i5 + 93;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            return z;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 41;
        getAsAtTimestamp = i3 % 128;
        return i3 % 2 != 0;
    }
}
