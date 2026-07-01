package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.base.ui.widget.SfcAmountInputView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class FragmentWithdrawAgentBindingImpl extends FragmentWithdrawAgentBinding {
    private static final SparseIntArray component2;
    private static int component3 = 0;
    private static int copy = 0;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState = 1;
    private final ConstraintLayout ShareDataUIState;
    private long component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.input_agent_number, 1);
        sparseIntArray.put(R.id.tv_user_name, 2);
        sparseIntArray.put(R.id.input_store_number, 3);
        sparseIntArray.put(R.id.input_amount, 4);
        sparseIntArray.put(R.id.rv_amount_tips, 5);
        sparseIntArray.put(R.id.tv_amount_tips, 6);
        sparseIntArray.put(R.id.tv_amount_min_tips, 7);
        sparseIntArray.put(R.id.btn_confirm, 8);
        int i = component3 + 73;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FragmentWithdrawAgentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 9, copydefault, component2));
    }

    private FragmentWithdrawAgentBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[8], (CommonInputView) objArr[1], (SfcAmountInputView) objArr[4], (CommonInputView) objArr[3], (ConstraintLayout) objArr[5], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[2]);
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
        int i4 = copy;
        int i5 = i4 + 37;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 85;
        getAsAtTimestamp = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 25;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 19;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 91 / 0;
        }
        return true;
    }
}
