package com.huawei.digitalpayment.consumer.riskui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.riskui.R;
import com.huawei.digitalpayment.consumer.riskui.widget.VerificationCodeView;

public class ActivityVerifyOtpBindingImpl extends ActivityVerifyOtpBinding {
    private static int component1 = 0;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component4 = 1;
    private static final SparseIntArray copydefault;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private long ShareDataUIState;
    private final ConstraintLayout component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.ll_tips, 1);
        sparseIntArray.put(R.id.codeView, 2);
        sparseIntArray.put(R.id.btnContinue, 3);
        int i = component4 + 1;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public ActivityVerifyOtpBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, component2, copydefault));
    }

    private ActivityVerifyOtpBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[3], (VerificationCodeView) objArr[2], (RoundLinearLayout) objArr[1]);
        this.ShareDataUIState = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component3 = constraintLayout;
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
        int i4 = getAsAtTimestamp;
        int i5 = i4 + 95;
        getRequestBeneficiariesState = i5 % 128;
        boolean z = i5 % 2 == 0;
        int i6 = i4 + 125;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 41;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 55;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
