package com.huawei.digitalpayment.consumer.profileui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.profileui.R;

public class ProfileActivityCurrentMsisdnBindingImpl extends ProfileActivityCurrentMsisdnBinding {
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component2 = 0;
    private static final SparseIntArray component3;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState = 1;
    private long ShareDataUIState;
    private final ConstraintLayout copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.tvLoginTitle, 1);
        sparseIntArray.put(R.id.tvDescription, 2);
        sparseIntArray.put(R.id.phone_number_input, 3);
        sparseIntArray.put(R.id.btn_next, 4);
        int i = getRequestBeneficiariesState + 113;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public ProfileActivityCurrentMsisdnBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, component1, component3));
    }

    private ProfileActivityCurrentMsisdnBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[4], (CommonInputView) objArr[3], (TextView) objArr[2], (TextView) objArr[1]);
        this.ShareDataUIState = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.copydefault = constraintLayout;
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
        int i4 = getAsAtTimestamp + 89;
        equals = i4 % 128;
        return i4 % 2 != 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 1;
        int i4 = i3 % 128;
        equals = i4;
        boolean z = i3 % 2 == 0;
        int i5 = i4 + 55;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
