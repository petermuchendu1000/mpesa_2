package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundRecyclerView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class ActivitySfcQuickActionBindingImpl extends ActivitySfcQuickActionBinding {
    private static int component1 = 0;
    private static final SparseIntArray component2;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int component4 = 0;
    private static int copy = 1;
    private static int getRequestBeneficiariesState = 1;
    private final ConstraintLayout ShareDataUIState;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.input_search, 1);
        sparseIntArray.put(R.id.tvTitle, 2);
        sparseIntArray.put(R.id.tvSubTitle, 3);
        sparseIntArray.put(R.id.tv_edit, 4);
        sparseIntArray.put(R.id.myServiceRecycler, 5);
        sparseIntArray.put(R.id.rv_category, 6);
        sparseIntArray.put(R.id.lifeRecycler, 7);
        int i = copy + 63;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public ActivitySfcQuickActionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, component3, component2));
    }

    private ActivitySfcQuickActionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CommonInputView) objArr[1], (RecyclerView) objArr[7], (RoundRecyclerView) objArr[5], (RecyclerView) objArr[6], (TextView) objArr[4], (TextView) objArr[3], (TextView) objArr[2]);
        this.copydefault = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ShareDataUIState = constraintLayout;
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
        int i4 = getRequestBeneficiariesState + 95;
        component4 = i4 % 128;
        return i4 % 2 != 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 125;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 71;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 99 / 0;
        }
        return true;
    }
}
