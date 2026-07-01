package com.huawei.digitalpayment.consumer.scheduleui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.recyclerview.HFRecyclerView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.scheduleui.R;

public class ScheduleActivityAutomaticPaymentListBindingImpl extends ScheduleActivityAutomaticPaymentListBinding {
    private static final SparseIntArray ShareDataUIState;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int copy = 1;
    private static int copydefault = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private final LinearLayout component1;
    private long component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.llCreateSchedulePayment, 1);
        sparseIntArray.put(R.id.tvTitle, 2);
        sparseIntArray.put(R.id.recyclerview, 3);
        sparseIntArray.put(R.id.noResult, 4);
        int i = copy + 17;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public ScheduleActivityAutomaticPaymentListBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, component3, ShareDataUIState));
    }

    private ScheduleActivityAutomaticPaymentListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundLinearLayout) objArr[1], (LinearLayout) objArr[4], (HFRecyclerView) objArr[3], (RoundTextView) objArr[2]);
        this.component2 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component1 = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component2 = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component2 != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component2 = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = getAsAtTimestamp + 21;
        int i5 = i4 % 128;
        equals = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 75;
        getAsAtTimestamp = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 93;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 43;
        equals = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 23 / 0;
        }
        return true;
    }
}
