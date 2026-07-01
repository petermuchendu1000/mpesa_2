package com.huawei.digitalpayment.checkoutUi.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.checkoutUi.R;

public class ItemViewAllBindingImpl extends ItemViewAllBinding {
    private static int component1 = 0;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int copy = 1;
    private static final SparseIntArray copydefault;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private final ConstraintLayout ShareDataUIState;
    private long component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.ll_item, 1);
        sparseIntArray.put(R.id.im_viewall, 2);
        sparseIntArray.put(R.id.tv_view_all, 3);
        int i = copy + 103;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public ItemViewAllBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, component3, copydefault));
    }

    private ItemViewAllBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (ConstraintLayout) objArr[1], (TextView) objArr[3]);
        this.component2 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ShareDataUIState = constraintLayout;
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
        int i4 = equals + 119;
        int i5 = i4 % 128;
        getRequestBeneficiariesState = i5;
        boolean z = i4 % 2 != 0;
        int i6 = i5 + 73;
        equals = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 34 / 0;
        }
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 27;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 15;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
