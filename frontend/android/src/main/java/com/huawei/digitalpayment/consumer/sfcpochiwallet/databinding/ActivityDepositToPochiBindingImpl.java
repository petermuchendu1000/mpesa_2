package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.base.ui.widget.SfcAmountInputView;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;

public class ActivityDepositToPochiBindingImpl extends ActivityDepositToPochiBinding {
    private static final SparseIntArray ShareDataUIState;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component4 = 0;
    private static int copydefault = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp = 1;
    private final ConstraintLayout component1;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.input_amount, 1);
        sparseIntArray.put(R.id.rv_amout, 2);
        sparseIntArray.put(R.id.tv_balance, 3);
        sparseIntArray.put(R.id.btn_confirm, 4);
        int i = getAsAtTimestamp + 39;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public ActivityDepositToPochiBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, component2, ShareDataUIState));
    }

    private ActivityDepositToPochiBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[4], (SfcAmountInputView) objArr[1], (ConstraintLayout) objArr[2], (TextView) objArr[3]);
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
        int i4 = equals;
        int i5 = i4 + 9;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 69;
        component4 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 49 / 0;
        }
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 27;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
