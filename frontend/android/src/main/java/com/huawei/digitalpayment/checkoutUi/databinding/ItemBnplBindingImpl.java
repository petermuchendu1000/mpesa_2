package com.huawei.digitalpayment.checkoutUi.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.checkoutUi.R;

public class ItemBnplBindingImpl extends ItemBnplBinding {
    private static int component2 = 0;
    private static final SparseIntArray component3;
    private static int copy = 1;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private final ConstraintLayout ShareDataUIState;
    private long component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.ll_content, 1);
        sparseIntArray.put(R.id.tv_title, 2);
        sparseIntArray.put(R.id.tv_products, 3);
        sparseIntArray.put(R.id.tv_fee, 4);
        int i = copy + 27;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ItemBnplBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, copydefault, component3));
    }

    private ItemBnplBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundLinearLayout) objArr[1], (TextView) objArr[4], (TextView) objArr[3], (TextView) objArr[2]);
        this.component1 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ShareDataUIState = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component1 = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component1 != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component1 = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = getAsAtTimestamp;
        int i5 = i4 + 105;
        equals = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 63;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 51;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 65;
        equals = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
