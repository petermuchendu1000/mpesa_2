package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.date.WheelPicker;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.baselib.R;

public class BaseDialogDatePickerBindingImpl extends BaseDialogDatePickerBinding {
    private static final SparseIntArray component1;
    private static int component2 = 0;
    private static int copy = 1;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private long ShareDataUIState;
    private final RoundConstraintLayout component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.tv_title, 1);
        sparseIntArray.put(R.id.btn_confirm, 2);
        sparseIntArray.put(R.id.btn_cancel, 3);
        sparseIntArray.put(R.id.ll_date, 4);
        sparseIntArray.put(R.id.wheelyear, 5);
        sparseIntArray.put(R.id.wheelMonth, 6);
        sparseIntArray.put(R.id.wheelDay, 7);
        int i = getAsAtTimestamp + 21;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public BaseDialogDatePickerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, copydefault, component1));
    }

    private BaseDialogDatePickerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundTextView) objArr[3], (RoundTextView) objArr[2], (LinearLayout) objArr[4], (RoundTextView) objArr[1], (WheelPicker) objArr[7], (WheelPicker) objArr[6], (WheelPicker) objArr[5]);
        this.ShareDataUIState = -1L;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) objArr[0];
        this.component3 = roundConstraintLayout;
        roundConstraintLayout.setTag(null);
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
        int i4 = copy + 21;
        int i5 = i4 % 128;
        equals = i5;
        boolean z = i4 % 2 != 0;
        int i6 = i5 + 89;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 41;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 81;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
