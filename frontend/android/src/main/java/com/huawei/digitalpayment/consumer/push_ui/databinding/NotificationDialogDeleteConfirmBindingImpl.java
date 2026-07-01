package com.huawei.digitalpayment.consumer.push_ui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.push_ui.R;

public class NotificationDialogDeleteConfirmBindingImpl extends NotificationDialogDeleteConfirmBinding {
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static final SparseIntArray component3;
    private static int component4 = 1;
    private static int copydefault = 0;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private final RoundLinearLayout ShareDataUIState;
    private long component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.tv_confirm, 1);
        sparseIntArray.put(R.id.tv_cancel, 2);
        int i = copydefault + 105;
        component4 = i % 128;
        if (i % 2 == 0) {
            int i2 = 27 / 0;
        }
    }

    public NotificationDialogDeleteConfirmBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, component2, component3));
    }

    private NotificationDialogDeleteConfirmBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[2], (TextView) objArr[1]);
        this.component1 = -1L;
        RoundLinearLayout roundLinearLayout = (RoundLinearLayout) objArr[0];
        this.ShareDataUIState = roundLinearLayout;
        roundLinearLayout.setTag(null);
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
        int i4 = getRequestBeneficiariesState + 61;
        int i5 = i4 % 128;
        equals = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 105;
        getRequestBeneficiariesState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 1;
        equals = i3 % 128;
        return i3 % 2 == 0;
    }
}
