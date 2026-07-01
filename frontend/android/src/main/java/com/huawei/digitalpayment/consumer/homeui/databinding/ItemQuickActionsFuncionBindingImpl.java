package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.BubblesView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class ItemQuickActionsFuncionBindingImpl extends ItemQuickActionsFuncionBinding {
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component2 = 1;
    private static final SparseIntArray component3;
    private static int copydefault = 0;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private long ShareDataUIState;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.ivFunctionIcon, 1);
        sparseIntArray.put(R.id.tvFunctionName, 2);
        sparseIntArray.put(R.id.guideline, 3);
        sparseIntArray.put(R.id.guideline2, 4);
        sparseIntArray.put(R.id.tvRedDot, 5);
        sparseIntArray.put(R.id.ivMarker, 6);
        int i = component2 + 21;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public ItemQuickActionsFuncionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, component1, component3));
    }

    private ItemQuickActionsFuncionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Guideline) objArr[3], (View) objArr[4], (RoundImageView) objArr[1], (RoundImageView) objArr[6], (ConstraintLayout) objArr[0], (TextView) objArr[2], (BubblesView) objArr[5]);
        this.ShareDataUIState = -1L;
        this.rlRoot.setTag(null);
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
        int i4 = getRequestBeneficiariesState;
        int i5 = i4 + 77;
        equals = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 85;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 123;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 95;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
