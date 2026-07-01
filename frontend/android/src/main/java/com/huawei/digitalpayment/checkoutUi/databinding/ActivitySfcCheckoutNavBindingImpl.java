package com.huawei.digitalpayment.checkoutUi.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.huawei.digitalpayment.checkoutUi.R;

public class ActivitySfcCheckoutNavBindingImpl extends ActivitySfcCheckoutNavBinding {
    private static final SparseIntArray ShareDataUIState;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int component4 = 0;
    private static int equals = 1;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.ll_container, 1);
        sparseIntArray.put(R.id.nav_host_fragment, 2);
        int i = component2 + 17;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public ActivitySfcCheckoutNavBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, component1, ShareDataUIState));
    }

    private ActivitySfcCheckoutNavBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[1], (FragmentContainerView) objArr[2], (FrameLayout) objArr[0]);
        this.copydefault = -1L;
        this.root.setTag(null);
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
        int i4 = component4 + 41;
        equals = i4 % 128;
        return i4 % 2 == 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 83;
        component4 = i3 % 128;
        return true ^ (i3 % 2 != 0);
    }
}
