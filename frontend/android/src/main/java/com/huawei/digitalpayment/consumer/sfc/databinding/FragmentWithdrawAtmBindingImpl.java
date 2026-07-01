package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class FragmentWithdrawAtmBindingImpl extends FragmentWithdrawAtmBinding {
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component2 = 0;
    private static int copy = 1;
    private static final SparseIntArray copydefault;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private final ConstraintLayout ShareDataUIState;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.input_atm_number, 1);
        sparseIntArray.put(R.id.tv_atm_tips, 2);
        sparseIntArray.put(R.id.btn_confirm, 3);
        int i = getAsAtTimestamp + 71;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public FragmentWithdrawAtmBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, component1, copydefault));
    }

    private FragmentWithdrawAtmBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[3], (CommonInputView) objArr[1], (TextView) objArr[2]);
        this.component3 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ShareDataUIState = constraintLayout;
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
        int i4 = copy;
        int i5 = i4 + 91;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 89;
        getRequestBeneficiariesState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 95;
        copy = i4 % 128;
        boolean z = !(i4 % 2 == 0);
        int i5 = i3 + 21;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
