package com.huawei.digitalpayment.customer.dynamics.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.input.IconImageView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.text.FixEditText;
import com.huawei.digitalpayment.customer.dynamics.R;

public class DynamicsPhoneInputEditTextBindingImpl extends DynamicsPhoneInputEditTextBinding {
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static final SparseIntArray component3;
    private static int copy = 1;
    private static int getAsAtTimestamp;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.startIconView, 3);
        sparseIntArray.put(R.id.startUnitView, 4);
        sparseIntArray.put(R.id.inputView, 5);
        sparseIntArray.put(R.id.endIconView, 6);
        sparseIntArray.put(R.id.endUnitView, 7);
        int i = ShareDataUIState + 67;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public DynamicsPhoneInputEditTextBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr) {
        this(dataBindingComponent, viewArr, mapBindings(dataBindingComponent, viewArr, 8, component2, component3));
    }

    private DynamicsPhoneInputEditTextBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr, Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (RoundConstraintLayout) objArr[1], (IconImageView) objArr[6], (TextView) objArr[7], (TextView) objArr[2], (FixEditText) objArr[5], (IconImageView) objArr[3], (TextView) objArr[4], (TextView) objArr[0]);
        this.copydefault = -1L;
        this.clInput.setTag(null);
        this.errorView.setTag(null);
        this.titleView.setTag(null);
        setRootTag(viewArr);
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
        int i4 = getAsAtTimestamp + 7;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 71;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
