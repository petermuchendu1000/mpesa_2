package com.huawei.digitalpayment.consumer.basic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.base.ui.widget.ViewPager2Indicator;
import com.huawei.digitalpayment.consumer.basic.R;

public class ActivitySfcGuideBindingImpl extends ActivitySfcGuideBinding {
    private static int component2 = 0;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int component4 = 0;
    private static int copy = 1;
    private static final SparseIntArray copydefault;
    private static int equals = 1;
    private final ConstraintLayout ShareDataUIState;
    private long component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.viewpager, 1);
        sparseIntArray.put(R.id.lb_start, 2);
        sparseIntArray.put(R.id.indicator, 3);
        int i = component2 + 35;
        equals = i % 128;
        int i2 = i % 2;
    }

    public ActivitySfcGuideBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, component3, copydefault));
    }

    private ActivitySfcGuideBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ViewPager2Indicator) objArr[3], (LoadingButton) objArr[2], (ViewPager2) objArr[1]);
        this.component1 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ShareDataUIState = constraintLayout;
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
        int i4 = component4 + 59;
        int i5 = i4 % 128;
        copy = i5;
        boolean z = i4 % 2 == 0;
        int i6 = i5 + 77;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 109;
        int i4 = i3 % 128;
        copy = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 103;
        component4 = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
