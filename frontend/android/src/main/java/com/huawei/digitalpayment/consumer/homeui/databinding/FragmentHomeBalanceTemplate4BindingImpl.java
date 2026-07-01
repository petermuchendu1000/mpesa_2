package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.homeui.R;

public class FragmentHomeBalanceTemplate4BindingImpl extends FragmentHomeBalanceTemplate4Binding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static int component1 = 1;
    private static final SparseIntArray component2;
    private static int component4 = 0;
    private static int copy = 1;
    private static int copydefault;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.ivBackground, 1);
        sparseIntArray.put(R.id.tvBalance, 2);
        sparseIntArray.put(R.id.tvUnit, 3);
        sparseIntArray.put(R.id.tvBalanceValue, 4);
        sparseIntArray.put(R.id.ivBalance, 5);
        sparseIntArray.put(R.id.ivArrow, 6);
        int i = component1 + 107;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FragmentHomeBalanceTemplate4BindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, ShareDataUIState, component2));
    }

    private FragmentHomeBalanceTemplate4BindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[6], (ImageView) objArr[1], (ImageView) objArr[5], (RoundConstraintLayout) objArr[0], (TextView) objArr[2], (TextView) objArr[4], (TextView) objArr[3]);
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
        int i4 = component4 + 71;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 1;
        int i4 = i3 % 128;
        copy = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 69;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 14 / 0;
        }
        return true;
    }
}
