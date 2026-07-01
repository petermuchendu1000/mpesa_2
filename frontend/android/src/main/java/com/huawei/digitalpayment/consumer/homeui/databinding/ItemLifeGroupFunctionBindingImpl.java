package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.homeui.R;

public class ItemLifeGroupFunctionBindingImpl extends ItemLifeGroupFunctionBinding {
    private static final SparseIntArray ShareDataUIState;
    private static int component2 = 0;
    private static int copy = 1;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private final RoundConstraintLayout component1;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.tvTitle, 1);
        sparseIntArray.put(R.id.viewMargin, 2);
        sparseIntArray.put(R.id.ivMarker, 3);
        sparseIntArray.put(R.id.ivArrow, 4);
        sparseIntArray.put(R.id.groupFunctionRecycler, 5);
        int i = getAsAtTimestamp + 87;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ItemLifeGroupFunctionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, copydefault, ShareDataUIState));
    }

    private ItemLifeGroupFunctionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[5], (ImageView) objArr[4], (ImageView) objArr[3], (TextView) objArr[1], (View) objArr[2]);
        this.component3 = -1L;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) objArr[0];
        this.component1 = roundConstraintLayout;
        roundConstraintLayout.setTag(null);
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
        int i4 = equals + 15;
        copy = i4 % 128;
        return i4 % 2 == 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 117;
        equals = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
