package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class FragmentSecurityCenterBindingImpl extends FragmentSecurityCenterBinding {
    private static int ShareDataUIState = 0;
    private static final SparseIntArray component1;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component4 = 1;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;
    private final ConstraintLayout component3;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.guideTop, 1);
        sparseIntArray.put(R.id.iv_back, 2);
        sparseIntArray.put(R.id.tv_top_title, 3);
        sparseIntArray.put(R.id.iv_pin_locked, 4);
        sparseIntArray.put(R.id.tv_pin_title, 5);
        sparseIntArray.put(R.id.rvSecurity, 6);
        int i = ShareDataUIState + 83;
        component4 = i % 128;
        int i2 = i % 2;
    }

    public FragmentSecurityCenterBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, component2, component1));
    }

    private FragmentSecurityCenterBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Guideline) objArr[1], (RoundImageView) objArr[2], (RoundImageView) objArr[4], (RecyclerView) objArr[6], (TextView) objArr[5], (TextView) objArr[3]);
        this.copydefault = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component3 = constraintLayout;
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
        int i4 = copy;
        int i5 = i4 + 5;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 73;
        getAsAtTimestamp = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 119;
        int i4 = i3 % 128;
        copy = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 29;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
