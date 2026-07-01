package com.huawei.digitalpayment.consumer.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.login.R;

public class ActivityResetPinVerifyIdBindingImpl extends ActivityResetPinVerifyIdBinding {
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static final SparseIntArray component3;
    private static int copy = 1;
    private static int copydefault = 0;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private long ShareDataUIState;
    private final ConstraintLayout component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.reset_pin_verify_tip_parent, 1);
        sparseIntArray.put(R.id.reset_pin_verify_tip, 2);
        sparseIntArray.put(R.id.idType, 3);
        sparseIntArray.put(R.id.idNumber, 4);
        sparseIntArray.put(R.id.btn_next, 5);
        int i = copydefault + 17;
        copy = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ActivityResetPinVerifyIdBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, component2, component3));
    }

    private ActivityResetPinVerifyIdBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[5], (CommonInputView) objArr[4], (CommonInputView) objArr[3], (TextView) objArr[2], (RoundLinearLayout) objArr[1]);
        this.ShareDataUIState = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component1 = constraintLayout;
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
        int i4 = equals + 37;
        int i5 = i4 % 128;
        getRequestBeneficiariesState = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 91;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 81;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 9;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
