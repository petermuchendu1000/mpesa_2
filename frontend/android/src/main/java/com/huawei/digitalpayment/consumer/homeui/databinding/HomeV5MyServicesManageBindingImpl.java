package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundRecyclerView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class HomeV5MyServicesManageBindingImpl extends HomeV5MyServicesManageBinding {
    private static int component2 = 0;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int component4 = 1;
    private static int copy = 0;
    private static final SparseIntArray copydefault;
    private static int getAsAtTimestamp = 1;
    private long ShareDataUIState;
    private final ConstraintLayout component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.tvTitle, 1);
        sparseIntArray.put(R.id.tvSubTitle, 2);
        sparseIntArray.put(R.id.myServiceRecycler, 3);
        sparseIntArray.put(R.id.lifeRecycler, 4);
        int i = getAsAtTimestamp + 91;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public HomeV5MyServicesManageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, component3, copydefault));
    }

    private HomeV5MyServicesManageBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[4], (RoundRecyclerView) objArr[3], (TextView) objArr[2], (TextView) objArr[1]);
        this.ShareDataUIState = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component1 = constraintLayout;
        constraintLayout.setTag(null);
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
        int i4 = component4;
        int i5 = i4 + 99;
        copy = i5 % 128;
        boolean z = i5 % 2 != 0;
        int i6 = i4 + 93;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 73;
        int i4 = i3 % 128;
        component4 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 5;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
