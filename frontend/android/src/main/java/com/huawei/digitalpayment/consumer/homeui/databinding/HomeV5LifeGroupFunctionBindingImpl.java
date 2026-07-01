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

public class HomeV5LifeGroupFunctionBindingImpl extends HomeV5LifeGroupFunctionBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component2;
    private static int component4 = 1;
    private static int copydefault = 0;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private long component1;
    private final RoundConstraintLayout component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.tvTitle, 1);
        sparseIntArray.put(R.id.ivMarker, 2);
        sparseIntArray.put(R.id.ivArrow, 3);
        sparseIntArray.put(R.id.groupFunctionRecycler, 4);
        int i = copydefault + 51;
        component4 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public HomeV5LifeGroupFunctionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, ShareDataUIState, component2));
    }

    private HomeV5LifeGroupFunctionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[4], (ImageView) objArr[3], (ImageView) objArr[2], (TextView) objArr[1]);
        this.component1 = -1L;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) objArr[0];
        this.component3 = roundConstraintLayout;
        roundConstraintLayout.setTag(null);
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
        int i4 = equals + 121;
        getAsAtTimestamp = i4 % 128;
        return i4 % 2 == 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 9;
        equals = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
