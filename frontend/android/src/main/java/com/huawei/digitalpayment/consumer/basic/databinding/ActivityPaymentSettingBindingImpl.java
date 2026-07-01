package com.huawei.digitalpayment.consumer.basic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.basic.R;

public class ActivityPaymentSettingBindingImpl extends ActivityPaymentSettingBinding {
    private static final SparseIntArray ShareDataUIState;
    private static int component3 = 0;
    private static int component4 = 1;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private long component1;
    private final LinearLayout component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.ll_prority_payment, 1);
        sparseIntArray.put(R.id.ll_biometric_payment, 2);
        sparseIntArray.put(R.id.cl_pin_free, 3);
        sparseIntArray.put(R.id.cl_auto_deduction_manager, 4);
        sparseIntArray.put(R.id.clAutomaticPayment, 5);
        int i = component3 + 67;
        equals = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public ActivityPaymentSettingBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, copydefault, ShareDataUIState));
    }

    private ActivityPaymentSettingBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundLinearLayout) objArr[4], (RoundLinearLayout) objArr[5], (RoundLinearLayout) objArr[3], (RoundLinearLayout) objArr[2], (RoundLinearLayout) objArr[1]);
        this.component1 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component2 = linearLayout;
        linearLayout.setTag(null);
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
        int i4 = component4;
        int i5 = i4 + 7;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 107;
        getRequestBeneficiariesState = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 93;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 3;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
