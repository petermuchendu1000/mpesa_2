package com.huawei.digitalpayment.consumer.scheduleui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundRecyclerView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.scheduleui.R;

public class ScheduleItemAutomaticPaymentBindingImpl extends ScheduleItemAutomaticPaymentBinding {
    private static final SparseIntArray ShareDataUIState;
    private static int component3 = 0;
    private static int component4 = 0;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int equals = 1;
    private static int getAsAtTimestamp = 1;
    private long component1;
    private final RoundConstraintLayout component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.ivDelete, 1);
        sparseIntArray.put(R.id.tvAutomaticPaymentName, 2);
        sparseIntArray.put(R.id.tvFrequency, 3);
        sparseIntArray.put(R.id.displayRecycler, 4);
        int i = getAsAtTimestamp + 123;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public ScheduleItemAutomaticPaymentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, copydefault, ShareDataUIState));
    }

    private ScheduleItemAutomaticPaymentBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundRecyclerView) objArr[4], (ImageView) objArr[1], (TextView) objArr[2], (RoundTextView) objArr[3]);
        this.component1 = -1L;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) objArr[0];
        this.component2 = roundConstraintLayout;
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
        int i4 = equals + 21;
        int i5 = i4 % 128;
        component4 = i5;
        boolean z = i4 % 2 != 0;
        int i6 = i5 + 53;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 9;
        int i4 = i3 % 128;
        component4 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 119;
        equals = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 49 / 0;
        }
        return true;
    }
}
