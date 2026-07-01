package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.SingleRadioButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.qrcode.R;

public class QrcodeActivityManualBindingImpl extends QrcodeActivityManualBinding {
    private static final SparseIntArray ShareDataUIState;
    private static int component1 = 0;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int equals = 1;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private long component2;
    private final ConstraintLayout component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.rl_top, 1);
        sparseIntArray.put(R.id.tv_step1, 2);
        sparseIntArray.put(R.id.view_step1, 3);
        sparseIntArray.put(R.id.rg_manual_type, 4);
        sparseIntArray.put(R.id.ll_pay_to_merchant, 5);
        sparseIntArray.put(R.id.rb_pay_to_merchant, 6);
        sparseIntArray.put(R.id.ll_cash_out_agent, 7);
        sparseIntArray.put(R.id.rb_cash_out_agent, 8);
        sparseIntArray.put(R.id.tv_step2, 9);
        sparseIntArray.put(R.id.view_step2, 10);
        sparseIntArray.put(R.id.inputText, 11);
        sparseIntArray.put(R.id.lb_start, 12);
        int i = component1 + 97;
        equals = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public QrcodeActivityManualBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 13, copydefault, ShareDataUIState));
    }

    private QrcodeActivityManualBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CommonInputView) objArr[11], (LoadingButton) objArr[12], (LinearLayout) objArr[7], (LinearLayout) objArr[5], (SingleRadioButton) objArr[8], (SingleRadioButton) objArr[6], (LinearLayout) objArr[4], (RoundLinearLayout) objArr[1], (TextView) objArr[2], (TextView) objArr[9], (View) objArr[3], (View) objArr[10]);
        this.component2 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component3 = constraintLayout;
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
        int i4 = getAsAtTimestamp + 49;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 109;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 9;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
