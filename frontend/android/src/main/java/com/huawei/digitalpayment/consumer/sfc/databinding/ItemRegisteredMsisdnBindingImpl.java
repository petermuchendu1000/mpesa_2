package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ItemRegisteredMsisdnBindingImpl extends ItemRegisteredMsisdnBinding {
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component3 = 0;
    private static int copy = 0;
    private static final SparseIntArray copydefault;
    private static int equals = 1;
    private static int getRequestBeneficiariesState = 1;
    private long ShareDataUIState;
    private final LinearLayout component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.tv_msisdn, 1);
        int i = component3 + 53;
        equals = i % 128;
        int i2 = i % 2;
    }

    public ItemRegisteredMsisdnBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, component2, copydefault));
    }

    private ItemRegisteredMsisdnBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[1]);
        this.ShareDataUIState = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component1 = linearLayout;
        linearLayout.setTag(null);
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
        int i4 = getRequestBeneficiariesState + 17;
        int i5 = i4 % 128;
        copy = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 69;
        getRequestBeneficiariesState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 35;
        int i4 = i3 % 128;
        copy = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 95;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 22 / 0;
        }
        return true;
    }
}
