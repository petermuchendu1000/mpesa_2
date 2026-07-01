package com.huawei.digitalpayment.consumer.manageandviewdata.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.manageandviewdata.R;

public class ItemAppDataUsageBindingImpl extends ItemAppDataUsageBinding {
    private static int ShareDataUIState = 0;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component2 = 1;
    private static int copy = 0;
    private static final SparseIntArray copydefault;
    private static int getRequestBeneficiariesState = 1;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.flAppIcon, 1);
        sparseIntArray.put(R.id.imAppIcon, 2);
        sparseIntArray.put(R.id.csTitles, 3);
        sparseIntArray.put(R.id.tvAppName, 4);
        sparseIntArray.put(R.id.tvUsage, 5);
        sparseIntArray.put(R.id.prgUsage, 6);
        sparseIntArray.put(R.id.view4, 7);
        int i = ShareDataUIState + 119;
        component2 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public ItemAppDataUsageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, component1, copydefault));
    }

    private ItemAppDataUsageBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[3], (ConstraintLayout) objArr[1], (ImageView) objArr[2], (ProgressBar) objArr[6], (TextView) objArr[4], (TextView) objArr[5], (View) objArr[7]);
        this.component3 = -1L;
        this.cardUsageRoot.setTag(null);
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
        int i4 = getRequestBeneficiariesState;
        int i5 = i4 + 55;
        copy = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 65;
        copy = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 61;
        copy = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 67;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
