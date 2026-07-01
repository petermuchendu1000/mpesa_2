package com.huawei.digitalpayment.consumer.riskui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.riskui.R;

public class RiskVerificationCodeViewBindingImpl extends RiskVerificationCodeViewBinding {
    private static int ShareDataUIState = 0;
    private static final SparseIntArray component1;
    private static int component2 = 1;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.tv_hint, 3);
        sparseIntArray.put(R.id.tvInput, 4);
        int i = ShareDataUIState + 61;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public RiskVerificationCodeViewBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr) {
        this(dataBindingComponent, viewArr, mapBindings(dataBindingComponent, viewArr, 5, component3, component1));
    }

    private RiskVerificationCodeViewBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr, Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (LoadingButton) objArr[2], (RelativeLayout) objArr[1], (TextView) objArr[3], (EditText) objArr[4], (TextView) objArr[0]);
        this.copydefault = -1L;
        this.btnSend.setTag(null);
        this.rlInput.setTag(null);
        this.tvLabel.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.copydefault = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.copydefault != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.copydefault = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = equals + 105;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 97;
        getAsAtTimestamp = i3 % 128;
        return i3 % 2 != 0;
    }
}
