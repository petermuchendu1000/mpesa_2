package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ActivitySfcGoMonthlyBindingImpl extends ActivitySfcGoMonthlyBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static int component1 = 0;
    private static final SparseIntArray component3;
    private static int copy = 0;
    private static int copydefault = 1;
    private static int getRequestBeneficiariesState = 1;
    private long component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.iv_back, 1);
        sparseIntArray.put(R.id.tv_title, 2);
        sparseIntArray.put(R.id.iv_go_monthly, 3);
        sparseIntArray.put(R.id.tv_bundle_title, 4);
        sparseIntArray.put(R.id.rv_go_monthly, 5);
        int i = component1 + 41;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public ActivitySfcGoMonthlyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, ShareDataUIState, component3));
    }

    private ActivitySfcGoMonthlyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageButton) objArr[1], (ImageView) objArr[3], (ConstraintLayout) objArr[0], (RecyclerView) objArr[5], (TextView) objArr[4], (TextView) objArr[2]);
        this.component2 = -1L;
        this.root.setTag(null);
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
        int i4 = copy + 113;
        int i5 = i4 % 128;
        getRequestBeneficiariesState = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 3;
        copy = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 80 / 0;
        }
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 33;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 99;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 56 / 0;
        }
        return true;
    }
}
