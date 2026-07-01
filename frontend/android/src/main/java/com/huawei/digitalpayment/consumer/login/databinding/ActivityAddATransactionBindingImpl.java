package com.huawei.digitalpayment.consumer.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.login.R;

public class ActivityAddATransactionBindingImpl extends ActivityAddATransactionBinding {
    private static final SparseIntArray ShareDataUIState;
    private static int component1 = 0;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int copy = 1;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private long component3;
    private final ConstraintLayout copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.input_amount, 1);
        sparseIntArray.put(R.id.input_reference_number, 2);
        sparseIntArray.put(R.id.input_date, 3);
        sparseIntArray.put(R.id.btn_continue, 4);
        int i = component1 + 47;
        equals = i % 128;
        if (i % 2 == 0) {
            int i2 = 28 / 0;
        }
    }

    public ActivityAddATransactionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, component2, ShareDataUIState));
    }

    private ActivityAddATransactionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[4], (CommonInputView) objArr[1], (CommonInputView) objArr[3], (CommonInputView) objArr[2]);
        this.component3 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.copydefault = constraintLayout;
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
        int i4 = copy + 57;
        int i5 = i4 % 128;
        getAsAtTimestamp = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 35;
        copy = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 34 / 0;
        }
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 1;
        copy = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 11;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 96 / 0;
        }
        return true;
    }
}
