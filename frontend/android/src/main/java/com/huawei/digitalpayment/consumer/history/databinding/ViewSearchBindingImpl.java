package com.huawei.digitalpayment.consumer.history.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.history.R;

public class ViewSearchBindingImpl extends ViewSearchBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component1;
    private static int component3 = 0;
    private static int component4 = 1;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private long component2;
    private final ConstraintLayout copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.et_search, 1);
        int i = component3 + 105;
        component4 = i % 128;
        if (i % 2 == 0) {
            int i2 = 79 / 0;
        }
    }

    public ViewSearchBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, ShareDataUIState, component1));
    }

    private ViewSearchBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (EditText) objArr[1]);
        this.component2 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.copydefault = constraintLayout;
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
        int i4 = equals + 43;
        int i5 = i4 % 128;
        getRequestBeneficiariesState = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 79;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 107;
        getRequestBeneficiariesState = i4 % 128;
        boolean z = i4 % 2 != 0;
        int i5 = i3 + 73;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return z;
    }
}
