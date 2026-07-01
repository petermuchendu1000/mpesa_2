package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ActivityManageLineBindingImpl extends ActivityManageLineBinding {
    private static int ShareDataUIState = 0;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static final SparseIntArray copydefault;
    private static int equals = 1;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private final ConstraintLayout component1;
    private long component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.sim_reg_card, 1);
        int i = ShareDataUIState + 57;
        equals = i % 128;
        if (i % 2 == 0) {
            int i2 = 29 / 0;
        }
    }

    public ActivityManageLineBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, component3, copydefault));
    }

    private ActivityManageLineBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[1]);
        this.component2 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component1 = constraintLayout;
        constraintLayout.setTag(null);
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
        int i4 = getRequestBeneficiariesState + 53;
        int i5 = i4 % 128;
        getAsAtTimestamp = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 67;
        getRequestBeneficiariesState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 81;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 101;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
