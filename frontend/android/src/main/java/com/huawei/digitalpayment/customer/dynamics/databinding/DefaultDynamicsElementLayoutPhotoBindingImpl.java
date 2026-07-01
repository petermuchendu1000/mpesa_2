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

public class DefaultDynamicsElementLayoutPhotoBindingImpl extends DefaultDynamicsElementLayoutPhotoBinding {
    private static final SparseIntArray component1;
    private static int component3 = 0;
    private static int component4 = 1;
    private static int copy = 0;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int getAsAtTimestamp = 1;
    private final ConstraintLayout ShareDataUIState;
    private long component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.commonInputView, 1);
        sparseIntArray.put(R.id.imageView, 2);
        sparseIntArray.put(R.id.iv_camera, 3);
        sparseIntArray.put(R.id.iv_delete, 4);
        sparseIntArray.put(R.id.tv_title, 5);
        int i = component3 + 21;
        component4 = i % 128;
        int i2 = i % 2;
    }

    public DefaultDynamicsElementLayoutPhotoBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, copydefault, component1));
    }

    private DefaultDynamicsElementLayoutPhotoBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CommonInputView) objArr[1], (RoundImageView) objArr[2], (ImageView) objArr[3], (ImageView) objArr[4], (TextView) objArr[5]);
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
        int i4 = getAsAtTimestamp + 85;
        copy = i4 % 128;
        return i4 % 2 != 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 79;
        copy = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
