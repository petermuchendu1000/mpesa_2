package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.homeui.R;

public class FragmentSfcForHomeBindingImpl extends FragmentSfcForHomeBinding {
    private static final SparseIntArray ShareDataUIState;
    private static int component1 = 1;
    private static int component3 = 0;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private long component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.rl_root, 1);
        sparseIntArray.put(R.id.compose_balance_section, 2);
        sparseIntArray.put(R.id.viewpager_barrier, 3);
        sparseIntArray.put(R.id.homeFunction, 4);
        int i = component1 + 93;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public FragmentSfcForHomeBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, copydefault, ShareDataUIState));
    }

    private FragmentSfcForHomeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ComposeView) objArr[2], (LinearLayout) objArr[4], (LinearLayout) objArr[1], (NestedScrollView) objArr[0], (Barrier) objArr[3]);
        this.component2 = -1L;
        this.scrollView.setTag(null);
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
        int i4 = getAsAtTimestamp;
        int i5 = i4 + 53;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 93;
        getRequestBeneficiariesState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 73;
        getAsAtTimestamp = i4 % 128;
        boolean z = !(i4 % 2 == 0);
        int i5 = i3 + 75;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
