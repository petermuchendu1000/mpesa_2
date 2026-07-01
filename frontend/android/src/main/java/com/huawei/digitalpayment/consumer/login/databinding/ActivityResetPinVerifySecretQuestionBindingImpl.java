package com.huawei.digitalpayment.consumer.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.login.R;

public class ActivityResetPinVerifySecretQuestionBindingImpl extends ActivityResetPinVerifySecretQuestionBinding {
    private static int component1 = 0;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component4 = 1;
    private static final SparseIntArray copydefault;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private final ConstraintLayout ShareDataUIState;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.reset_pin_verify_tip_parent, 1);
        sparseIntArray.put(R.id.reset_pin_verify_tip, 2);
        sparseIntArray.put(R.id.input_question, 3);
        sparseIntArray.put(R.id.input_answer, 4);
        sparseIntArray.put(R.id.tv_forget_answer, 5);
        sparseIntArray.put(R.id.tv_call_title, 6);
        sparseIntArray.put(R.id.group_call, 7);
        sparseIntArray.put(R.id.btn_next, 8);
        int i = equals + 37;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public ActivityResetPinVerifySecretQuestionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 9, component2, copydefault));
    }

    private ActivityResetPinVerifySecretQuestionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[8], (Group) objArr[7], (CommonInputView) objArr[4], (CommonInputView) objArr[3], (TextView) objArr[2], (RoundLinearLayout) objArr[1], (TextView) objArr[6], (TextView) objArr[5]);
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
        int i4 = component4 + 17;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 71;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
