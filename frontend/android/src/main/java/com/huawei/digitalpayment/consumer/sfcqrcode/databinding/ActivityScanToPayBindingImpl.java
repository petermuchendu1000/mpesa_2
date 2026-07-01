package com.huawei.digitalpayment.consumer.sfcqrcode.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.huawei.digitalpayment.consumer.sfcqrcode.R;

public class ActivityScanToPayBindingImpl extends ActivityScanToPayBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component3;
    private static int copy = 1;
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private long component1;
    private final ConstraintLayout component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.fragment_container, 1);
        sparseIntArray.put(R.id.toolbarRoot, 2);
        sparseIntArray.put(R.id.ivBack, 3);
        sparseIntArray.put(R.id.tvTitle, 4);
        sparseIntArray.put(R.id.compose_tabs, 5);
        int i = getRequestBeneficiariesState + 69;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public ActivityScanToPayBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, ShareDataUIState, component3));
    }

    private ActivityScanToPayBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ComposeView) objArr[5], (FragmentContainerView) objArr[1], (ImageView) objArr[3], (ConstraintLayout) objArr[2], (TextView) objArr[4]);
        this.component1 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component2 = constraintLayout;
        constraintLayout.setTag(null);
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
        int i4 = copy + 37;
        getAsAtTimestamp = i4 % 128;
        return i4 % 2 != 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 39;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 61;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 25 / 0;
        }
        return true;
    }
}
