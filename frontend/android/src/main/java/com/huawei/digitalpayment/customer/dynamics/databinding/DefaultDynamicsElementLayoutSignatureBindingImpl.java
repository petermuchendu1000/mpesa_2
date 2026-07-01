package com.huawei.digitalpayment.customer.dynamics.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.customer.dynamics.R;

public class DefaultDynamicsElementLayoutSignatureBindingImpl extends DefaultDynamicsElementLayoutSignatureBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static int component2 = 0;
    private static int component4 = 0;
    private static int copy = 1;
    private static final SparseIntArray copydefault;
    private static int getRequestBeneficiariesState = 1;
    private final ConstraintLayout component1;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.commonInputView, 1);
        sparseIntArray.put(R.id.imageView, 2);
        sparseIntArray.put(R.id.iv_camera, 3);
        sparseIntArray.put(R.id.iv_delete, 4);
        sparseIntArray.put(R.id.tv_title, 5);
        int i = component2 + 87;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    public DefaultDynamicsElementLayoutSignatureBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, ShareDataUIState, copydefault));
    }

    private DefaultDynamicsElementLayoutSignatureBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CommonInputView) objArr[1], (RoundImageView) objArr[2], (ImageView) objArr[3], (ImageView) objArr[4], (TextView) objArr[5]);
        this.component3 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component1 = constraintLayout;
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
        int i4 = copy;
        int i5 = i4 + 31;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 67;
        component4 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 35;
        component4 = i3 % 128;
        return i3 % 2 == 0;
    }
}
