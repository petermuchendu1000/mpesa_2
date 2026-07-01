package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ActivityMyProfileBindingImpl extends ActivityMyProfileBinding {
    private static int ShareDataUIState = 0;
    private static final SparseIntArray component1;
    private static int copy = 1;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private final LinearLayout component2;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.fl_fragment_container, 1);
        int i = ShareDataUIState + 55;
        equals = i % 128;
        if (i % 2 == 0) {
            int i2 = 73 / 0;
        }
    }

    public ActivityMyProfileBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, copydefault, component1));
    }

    private ActivityMyProfileBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[1]);
        this.component3 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component2 = linearLayout;
        linearLayout.setTag(null);
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
        int i4 = copy;
        int i5 = i4 + 61;
        getRequestBeneficiariesState = i5 % 128;
        boolean z = !(i5 % 2 == 0);
        int i6 = i4 + 55;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 29;
        copy = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 41;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
