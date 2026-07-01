package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;

public class ActivityFulizaOptOutBindingImpl extends ActivityFulizaOptOutBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static int component1 = 0;
    private static int copy = 1;
    private static final SparseIntArray copydefault;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private long component2;
    private final ConstraintLayout component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.iv_back, 1);
        sparseIntArray.put(R.id.tv_title, 2);
        sparseIntArray.put(R.id.tv_reason_title, 3);
        sparseIntArray.put(R.id.rv_reason, 4);
        sparseIntArray.put(R.id.compose_button_container, 5);
        int i = component1 + 27;
        copy = i % 128;
        if (i % 2 == 0) {
            int i2 = 38 / 0;
        }
    }

    public ActivityFulizaOptOutBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, ShareDataUIState, copydefault));
    }

    private ActivityFulizaOptOutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ComposeView) objArr[5], (ImageView) objArr[1], (RecyclerView) objArr[4], (TextView) objArr[3], (TextView) objArr[2]);
        this.component2 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component3 = constraintLayout;
        constraintLayout.setTag(null);
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
        int i4 = equals;
        int i5 = i4 + 77;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 125;
        getAsAtTimestamp = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 53;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 89;
        equals = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 90 / 0;
        }
        return true;
    }
}
