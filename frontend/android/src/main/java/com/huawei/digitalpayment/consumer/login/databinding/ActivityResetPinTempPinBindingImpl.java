package com.huawei.digitalpayment.consumer.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText;
import com.huawei.digitalpayment.consumer.baselib.widget.code.SafeInputKeyboard;
import com.huawei.digitalpayment.consumer.login.R;

public class ActivityResetPinTempPinBindingImpl extends ActivityResetPinTempPinBinding {
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component2 = 0;
    private static final SparseIntArray copydefault;
    private static int equals = 1;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private final LinearLayout ShareDataUIState;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.ll_reset_pin_temp_tip, 1);
        sparseIntArray.put(R.id.reset_pin_temp_tip, 2);
        sparseIntArray.put(R.id.tvTitle, 3);
        sparseIntArray.put(R.id.tvDescription, 4);
        sparseIntArray.put(R.id.etCode, 5);
        sparseIntArray.put(R.id.tvError, 6);
        sparseIntArray.put(R.id.tvForgot, 7);
        sparseIntArray.put(R.id.btnContinue, 8);
        sparseIntArray.put(R.id.pin_input_keyboard, 9);
        int i = component2 + 45;
        equals = i % 128;
        int i2 = i % 2;
    }

    public ActivityResetPinTempPinBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, component1, copydefault));
    }

    private ActivityResetPinTempPinBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[8], (CodeEditText) objArr[5], (RoundLinearLayout) objArr[1], (SafeInputKeyboard) objArr[9], (TextView) objArr[2], (TextView) objArr[4], (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[3]);
        this.component3 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.ShareDataUIState = linearLayout;
        linearLayout.setTag(null);
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
        int i4 = getAsAtTimestamp;
        int i5 = i4 + 119;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 31;
        getRequestBeneficiariesState = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 51;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 51;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
