package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ItemBundleFavBindingImpl extends ItemBundleFavBinding {
    private static int ShareDataUIState = 0;
    private static final SparseIntArray component1;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int equals = 1;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private final ConstraintLayout component2;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.iv_avatar, 1);
        sparseIntArray.put(R.id.tv_name, 2);
        int i = ShareDataUIState + 65;
        getAsAtTimestamp = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public ItemBundleFavBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, component3, component1));
    }

    private ItemBundleFavBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundImageView) objArr[1], (TextView) objArr[2]);
        this.copydefault = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component2 = constraintLayout;
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
        int i4 = getRequestBeneficiariesState + 55;
        equals = i4 % 128;
        return i4 % 2 == 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 87;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 73;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
