package com.huawei.digitalpayment.consumer.manageandviewdata.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;
import com.huawei.digitalpayment.consumer.manageandviewdata.R;

public class ItemAirtimeUsageBindingImpl extends ItemAirtimeUsageBinding {
    private static int ShareDataUIState = 1;
    private static final SparseIntArray component1;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component3 = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.cardAppIcon, 1);
        sparseIntArray.put(R.id.imAppIcon, 2);
        sparseIntArray.put(R.id.csTitles, 3);
        sparseIntArray.put(R.id.tvAppName, 4);
        sparseIntArray.put(R.id.tvUsage, 5);
        sparseIntArray.put(R.id.tvPercentage, 6);
        sparseIntArray.put(R.id.tv_buy, 7);
        int i = ShareDataUIState + 67;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public ItemAirtimeUsageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, component2, component1));
    }

    private ItemAirtimeUsageBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (MaterialCardView) objArr[1], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[3], (ImageView) objArr[2], (TextView) objArr[4], (ImageView) objArr[7], (TextView) objArr[6], (TextView) objArr[5]);
        this.copydefault = -1L;
        this.cardUsageRoot.setTag(null);
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
        int i4 = getRequestBeneficiariesState;
        int i5 = i4 + 5;
        getAsAtTimestamp = i5 % 128;
        boolean z = i5 % 2 == 0;
        int i6 = i4 + 63;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 113;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 119;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 55 / 0;
        }
        return true;
    }
}
