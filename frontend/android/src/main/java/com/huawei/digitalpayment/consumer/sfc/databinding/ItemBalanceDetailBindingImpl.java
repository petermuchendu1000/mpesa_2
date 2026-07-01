package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.base.resp.BalanceDetails;
import com.huawei.digitalpayment.consumer.sfc.BR;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ItemBalanceDetailBindingImpl extends ItemBalanceDetailBinding {
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component3 = 0;
    private static int component4 = 0;
    private static int copy = 1;
    private static final SparseIntArray copydefault;
    private static int equals = 1;
    private final ConstraintLayout ShareDataUIState;
    private long component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.vLine1, 1);
        sparseIntArray.put(R.id.csAmountLabel, 2);
        sparseIntArray.put(R.id.tvAmountLabel, 3);
        sparseIntArray.put(R.id.tvAmountValue, 4);
        sparseIntArray.put(R.id.csExpiryLabel, 5);
        sparseIntArray.put(R.id.tvExpiryLabel, 6);
        sparseIntArray.put(R.id.tvExpiryValue, 7);
        int i = copy + 79;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ItemBalanceDetailBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, component2, copydefault));
    }

    private ItemBalanceDetailBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[5], (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[6], (TextView) objArr[7], (View) objArr[1]);
        this.component1 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ShareDataUIState = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component1 = 2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component1 != 0;
        }
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        boolean z = false;
        if (BR.balanceDetails == i) {
            int i3 = component4 + 97;
            equals = i3 % 128;
            int i4 = i3 % 2;
            setBalanceDetails((BalanceDetails) obj);
            if (i4 != 0) {
                z = true;
            }
        }
        int i5 = equals + 69;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override
    public void setBalanceDetails(BalanceDetails balanceDetails) {
        int i = 2 % 2;
        int i2 = equals + 63;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        this.mBalanceDetails = balanceDetails;
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = component4 + 51;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component1 = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = component4;
        int i5 = i4 + 49;
        equals = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 77;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }
}
