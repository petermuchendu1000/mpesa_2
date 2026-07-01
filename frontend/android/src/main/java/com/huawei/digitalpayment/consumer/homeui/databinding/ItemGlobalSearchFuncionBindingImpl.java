package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class ItemGlobalSearchFuncionBindingImpl extends ItemGlobalSearchFuncionBinding {
    private static int component1 = 0;
    private static final SparseIntArray component2;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int copy = 1;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private long ShareDataUIState;
    private final ConstraintLayout copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.ivFunction, 1);
        sparseIntArray.put(R.id.tvFunction, 2);
        int i = component1 + 33;
        copy = i % 128;
        if (i % 2 == 0) {
            int i2 = 24 / 0;
        }
    }

    public ItemGlobalSearchFuncionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, component3, component2));
    }

    private ItemGlobalSearchFuncionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundImageView) objArr[1], (TextView) objArr[2]);
        this.ShareDataUIState = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.copydefault = constraintLayout;
        constraintLayout.setTag(null);
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

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = equals + 3;
        int i5 = i4 % 128;
        getAsAtTimestamp = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 9;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 61;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 123;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
