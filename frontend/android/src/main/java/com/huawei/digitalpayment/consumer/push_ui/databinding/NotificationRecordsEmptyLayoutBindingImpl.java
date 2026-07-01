package com.huawei.digitalpayment.consumer.push_ui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.push_ui.R;

public class NotificationRecordsEmptyLayoutBindingImpl extends NotificationRecordsEmptyLayoutBinding {
    private static int component1 = 0;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int component4 = 0;
    private static int copy = 1;
    private static final SparseIntArray copydefault;
    private static int getRequestBeneficiariesState = 1;
    private long ShareDataUIState;
    private final FrameLayout component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.ll_empty, 1);
        int i = getRequestBeneficiariesState + 33;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public NotificationRecordsEmptyLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, component3, copydefault));
    }

    private NotificationRecordsEmptyLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundLinearLayout) objArr[1]);
        this.ShareDataUIState = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.component2 = frameLayout;
        frameLayout.setTag(null);
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
        int i4 = component4 + 67;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 85;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 21;
        component4 = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
