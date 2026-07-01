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

public class DynamicsPhoneInputEditTextBindingArImpl extends DynamicsPhoneInputEditTextBinding {
    private static int ShareDataUIState = 1;
    private static final SparseIntArray component2;
    private static int component3 = 0;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private long component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.startIconView, 3);
        sparseIntArray.put(R.id.startUnitView, 4);
        sparseIntArray.put(R.id.inputView, 5);
        sparseIntArray.put(R.id.endIconView, 6);
        sparseIntArray.put(R.id.endUnitView, 7);
        int i = ShareDataUIState + 45;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public DynamicsPhoneInputEditTextBindingArImpl(DataBindingComponent dataBindingComponent, View[] viewArr) {
        this(dataBindingComponent, viewArr, mapBindings(dataBindingComponent, viewArr, 8, copydefault, component2));
    }

    private DynamicsPhoneInputEditTextBindingArImpl(DataBindingComponent dataBindingComponent, View[] viewArr, Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (RoundConstraintLayout) objArr[1], (IconImageView) objArr[6], (TextView) objArr[7], (TextView) objArr[2], (FixEditText) objArr[5], (IconImageView) objArr[3], (TextView) objArr[4], (TextView) objArr[0]);
        this.component1 = -1L;
        this.clInput.setTag(null);
        this.errorView.setTag(null);
        this.titleView.setTag(null);
        setRootTag(viewArr);
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
        int i4 = getAsAtTimestamp + 1;
        equals = i4 % 128;
        return i4 % 2 != 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 17;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 31;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
