package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.homeui.R;

public class ActivitySfcNewsPaperBindingImpl extends ActivitySfcNewsPaperBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static int component1 = 1;
    private static final SparseIntArray component2;
    private static int component3 = 0;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.compose_view, 1);
        int i = component3 + 115;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public ActivitySfcNewsPaperBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, ShareDataUIState, component2));
    }

    private ActivitySfcNewsPaperBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ComposeView) objArr[1], (ConstraintLayout) objArr[0]);
        this.copydefault = -1L;
        this.main.setTag(null);
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
        int i4 = equals;
        int i5 = i4 + 81;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 39;
        getRequestBeneficiariesState = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 77 / 0;
        }
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 109;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 95;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
