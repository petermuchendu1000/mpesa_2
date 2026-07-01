package com.huawei.digitalpayment.customer.dynamics.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.date.WheelPicker;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.customer.dynamics.R;

public class DynamicsDialogDatePickerBindingImpl extends DynamicsDialogDatePickerBinding {
    private static final SparseIntArray component2;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int component4 = 1;
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private final RoundConstraintLayout ShareDataUIState;
    private long component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.tv_title, 1);
        sparseIntArray.put(R.id.btn_confirm, 2);
        sparseIntArray.put(R.id.btn_cancel, 3);
        sparseIntArray.put(R.id.ll_date, 4);
        sparseIntArray.put(R.id.wheelyear, 5);
        sparseIntArray.put(R.id.wheelMonth, 6);
        sparseIntArray.put(R.id.wheelDay, 7);
        int i = copydefault + 7;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    public DynamicsDialogDatePickerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, component3, component2));
    }

    private DynamicsDialogDatePickerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[3], (LoadingButton) objArr[2], (LinearLayout) objArr[4], (TextView) objArr[1], (WheelPicker) objArr[7], (WheelPicker) objArr[6], (WheelPicker) objArr[5]);
        this.component1 = -1L;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) objArr[0];
        this.ShareDataUIState = roundConstraintLayout;
        roundConstraintLayout.setTag(null);
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
        int i4 = component4 + 77;
        int i5 = i4 % 128;
        getRequestBeneficiariesState = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 45;
        component4 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 65;
        getRequestBeneficiariesState = i3 % 128;
        return i3 % 2 == 0;
    }
}
