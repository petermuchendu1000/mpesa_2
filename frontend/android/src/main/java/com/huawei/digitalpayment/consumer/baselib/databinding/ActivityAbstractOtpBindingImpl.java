package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.baselib.R;
import com.huawei.digitalpayment.consumer.baselib.widget.code.OtpEditText;

public class ActivityAbstractOtpBindingImpl extends ActivityAbstractOtpBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static int component2 = 0;
    private static final SparseIntArray component3;
    private static int copy = 0;
    private static int equals = 1;
    private static int getRequestBeneficiariesState = 1;
    private final ConstraintLayout component1;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.tvTitle, 1);
        sparseIntArray.put(R.id.tvDescription, 2);
        sparseIntArray.put(R.id.etCode, 3);
        sparseIntArray.put(R.id.tvError, 4);
        sparseIntArray.put(R.id.btnGetOtp, 5);
        sparseIntArray.put(R.id.btnContinue, 6);
        int i = getRequestBeneficiariesState + 11;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ActivityAbstractOtpBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, ShareDataUIState, component3));
    }

    private ActivityAbstractOtpBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[6], (TextView) objArr[5], (OtpEditText) objArr[3], (TextView) objArr[2], (TextView) objArr[4], (TextView) objArr[1]);
        this.copydefault = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component1 = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
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
        int i4 = copy;
        int i5 = i4 + 35;
        equals = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 51;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 23;
        copy = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 59;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
