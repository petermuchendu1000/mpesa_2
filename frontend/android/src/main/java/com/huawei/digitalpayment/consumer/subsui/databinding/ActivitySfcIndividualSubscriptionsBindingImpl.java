package com.huawei.digitalpayment.consumer.subsui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.huawei.digitalpayment.consumer.subsui.R;

public class ActivitySfcIndividualSubscriptionsBindingImpl extends ActivitySfcIndividualSubscriptionsBinding {
    private static final SparseIntArray ShareDataUIState;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component3 = 1;
    private static int copy = 0;
    private static int copydefault = 0;
    private static int getRequestBeneficiariesState = 1;
    private long component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.csList, 1);
        sparseIntArray.put(R.id.txTitle, 2);
        sparseIntArray.put(R.id.rcList, 3);
        sparseIntArray.put(R.id.csEmpty, 4);
        sparseIntArray.put(R.id.ivPromotionalMessages, 5);
        sparseIntArray.put(R.id.txEmptyTitle, 6);
        int i = copydefault + 107;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public ActivitySfcIndividualSubscriptionsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, component2, ShareDataUIState));
    }

    private ActivitySfcIndividualSubscriptionsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[4], (ConstraintLayout) objArr[1], (ImageView) objArr[5], (RecyclerView) objArr[3], (SwipeRefreshLayout) objArr[0], (TextView) objArr[6], (TextView) objArr[2]);
        this.component1 = -1L;
        this.swpRefresh.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component1 = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.component1 = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = copy;
        int i5 = i4 + 67;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 33;
        getRequestBeneficiariesState = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 109;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 99;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
