package com.huawei.common.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.R;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.date.WheelPicker;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundTextView;

public class CommonDialogDatePickerBindingImpl extends CommonDialogDatePickerBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component3;
    private final RoundConstraintLayout component2;
    private long copydefault;

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.line, 1);
        sparseIntArray.put(R.id.tv_title, 2);
        sparseIntArray.put(R.id.ll_date, 3);
        sparseIntArray.put(R.id.wheelyear, 4);
        sparseIntArray.put(R.id.wheelMonth, 5);
        sparseIntArray.put(R.id.wheelDay, 6);
        sparseIntArray.put(R.id.btn_confirm, 7);
    }

    public CommonDialogDatePickerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, ShareDataUIState, component3));
    }

    private CommonDialogDatePickerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[7], (RoundTextView) objArr[1], (LinearLayout) objArr[3], (TextView) objArr[2], (WheelPicker) objArr[6], (WheelPicker) objArr[5], (WheelPicker) objArr[4]);
        this.copydefault = -1L;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) objArr[0];
        this.component2 = roundConstraintLayout;
        roundConstraintLayout.setTag(null);
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
}
