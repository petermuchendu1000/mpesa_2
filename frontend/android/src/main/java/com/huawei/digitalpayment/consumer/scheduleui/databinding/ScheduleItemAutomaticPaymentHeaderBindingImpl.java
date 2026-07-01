package com.huawei.digitalpayment.consumer.scheduleui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.scheduleui.R;

public class ScheduleItemAutomaticPaymentHeaderBindingImpl extends ScheduleItemAutomaticPaymentHeaderBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component2;
    private static int component3 = 0;
    private static int component4 = 1;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private long component1;
    private final RoundLinearLayout copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.ivIcon, 1);
        sparseIntArray.put(R.id.tvTitle, 2);
        int i = component3 + 13;
        component4 = i % 128;
        if (i % 2 == 0) {
            int i2 = 3 / 0;
        }
    }

    public ScheduleItemAutomaticPaymentHeaderBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, ShareDataUIState, component2));
    }

    private ScheduleItemAutomaticPaymentHeaderBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundImageView) objArr[1], (TextView) objArr[2]);
        this.component1 = -1L;
        RoundLinearLayout roundLinearLayout = (RoundLinearLayout) objArr[0];
        this.copydefault = roundLinearLayout;
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
        int i4 = getAsAtTimestamp + 57;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 39;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 3;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
