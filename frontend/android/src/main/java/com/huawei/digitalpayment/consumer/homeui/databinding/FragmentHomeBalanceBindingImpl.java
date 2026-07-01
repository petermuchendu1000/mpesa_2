package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.homeui.R;

public class FragmentHomeBalanceBindingImpl extends FragmentHomeBalanceBinding {
    private static int component1 = 0;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component3 = 1;
    private static int component4 = 0;
    private static final SparseIntArray copydefault;
    private static int getAsAtTimestamp = 1;
    private long ShareDataUIState;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.ivBackground, 1);
        sparseIntArray.put(R.id.tvBalance, 2);
        sparseIntArray.put(R.id.tvUnit, 3);
        sparseIntArray.put(R.id.tvBalanceValue, 4);
        sparseIntArray.put(R.id.tvBalanceValueTag, 5);
        sparseIntArray.put(R.id.ivBalance, 6);
        int i = component3 + 101;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FragmentHomeBalanceBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, component2, copydefault));
    }

    private FragmentHomeBalanceBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (ImageView) objArr[6], (RoundConstraintLayout) objArr[0], (TextView) objArr[2], (TextView) objArr[4], (TextView) objArr[5], (TextView) objArr[3]);
        this.ShareDataUIState = -1L;
        this.root.setTag(null);
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
        int i4 = getAsAtTimestamp;
        int i5 = i4 + 1;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 79;
        component4 = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4;
        int i4 = i3 + 111;
        getAsAtTimestamp = i4 % 128;
        boolean z = i4 % 2 != 0;
        int i5 = i3 + 67;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
