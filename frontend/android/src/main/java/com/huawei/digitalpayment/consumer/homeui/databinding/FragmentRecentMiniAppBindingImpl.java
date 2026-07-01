package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundRecyclerView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class FragmentRecentMiniAppBindingImpl extends FragmentRecentMiniAppBinding {
    private static final SparseIntArray ShareDataUIState;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component4 = 1;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int getAsAtTimestamp;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.ivBackground, 1);
        sparseIntArray.put(R.id.recyclerView, 2);
        int i = component2 + 73;
        component1 = i % 128;
        if (i % 2 == 0) {
            int i2 = 67 / 0;
        }
    }

    public FragmentRecentMiniAppBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, copydefault, ShareDataUIState));
    }

    private FragmentRecentMiniAppBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (RoundRecyclerView) objArr[2], (RoundConstraintLayout) objArr[0]);
        this.component3 = -1L;
        this.root.setTag(null);
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
        int i4 = getAsAtTimestamp;
        int i5 = i4 + 35;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 63;
        component4 = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 55;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 3;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
