package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LifecycleOwner;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.baselib.R;
import com.huawei.digitalpayment.consumer.baselib.databinding.BaseToolbarLayoutBinding;
import com.huawei.digitalpayment.consumer.qrcode.BR;

public class ActivityScanAndPayBindingImpl extends ActivityScanAndPayBinding {
    private static final ViewDataBinding.IncludedLayouts component2;
    private static int component3 = 0;
    private static int copy = 1;
    private static final SparseIntArray copydefault;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private final FrameLayout ShareDataUIState;
    private long component1;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        component2 = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"base_toolbar_layout"}, new int[]{1}, new int[]{R.layout.base_toolbar_layout});
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(com.huawei.digitalpayment.consumer.qrcode.R.id.scanFragment, 2);
        sparseIntArray.put(com.huawei.digitalpayment.consumer.qrcode.R.id.ll_bottom, 3);
        sparseIntArray.put(com.huawei.digitalpayment.consumer.qrcode.R.id.ll_scan, 4);
        sparseIntArray.put(com.huawei.digitalpayment.consumer.qrcode.R.id.ll_manual, 5);
        int i = equals + 61;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public ActivityScanAndPayBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, component2, copydefault));
    }

    private ActivityScanAndPayBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (RoundLinearLayout) objArr[3], (LinearLayout) objArr[5], (LinearLayout) objArr[4], (FragmentContainerView) objArr[2], (BaseToolbarLayoutBinding) objArr[1]);
        this.component1 = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.ShareDataUIState = frameLayout;
        frameLayout.setTag(null);
        setContainedBinding(this.toolbar);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component1 = 2L;
        }
        this.toolbar.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.component1 != 0) {
                return true;
            }
            return this.toolbar.hasPendingBindings();
        }
    }

    @Override
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        int i = 2 % 2;
        int i2 = copy + 89;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            super.setLifecycleOwner(lifecycleOwner);
            this.toolbar.setLifecycleOwner(lifecycleOwner);
            int i3 = getAsAtTimestamp + 59;
            copy = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.setLifecycleOwner(lifecycleOwner);
        this.toolbar.setLifecycleOwner(lifecycleOwner);
        throw null;
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = copy;
        int i5 = i4 + 67;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (i == 0) {
            return ShareDataUIState((BaseToolbarLayoutBinding) obj, i2);
        }
        int i6 = i4 + 55;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 36 / 0;
        }
        return false;
    }

    private boolean ShareDataUIState(BaseToolbarLayoutBinding baseToolbarLayoutBinding, int i) {
        if (i != BR._all) {
            return false;
        }
        synchronized (this) {
            this.component1 |= 1;
        }
        return true;
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component1 = 0L;
        }
        executeBindingsOn(this.toolbar);
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 53;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
