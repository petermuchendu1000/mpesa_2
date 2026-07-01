package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ActivitySfcProfileResultBindingImpl extends ActivitySfcProfileResultBinding {
    private static int component1 = 0;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static final SparseIntArray component3;
    private static int component4 = 0;
    private static int copy = 1;
    private static int getAsAtTimestamp = 1;
    private long ShareDataUIState;
    private final ConstraintLayout copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.iv_status, 1);
        sparseIntArray.put(R.id.tv_status, 2);
        sparseIntArray.put(R.id.tv_content, 3);
        sparseIntArray.put(R.id.ll_puk_container, 4);
        sparseIntArray.put(R.id.tv_id, 5);
        sparseIntArray.put(R.id.tv_copy, 6);
        sparseIntArray.put(R.id.barrier, 7);
        sparseIntArray.put(R.id.btn_confirm, 8);
        int i = component1 + 61;
        copy = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public ActivitySfcProfileResultBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 9, component2, component3));
    }

    private ActivitySfcProfileResultBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Barrier) objArr[7], (LoadingButton) objArr[8], (ImageView) objArr[1], (RoundLinearLayout) objArr[4], (TextView) objArr[3], (RoundTextView) objArr[6], (TextView) objArr[5], (TextView) objArr[2]);
        this.ShareDataUIState = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.copydefault = constraintLayout;
        constraintLayout.setTag(null);
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
        int i4 = getAsAtTimestamp + 59;
        component4 = i4 % 128;
        return i4 % 2 != 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 123;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
