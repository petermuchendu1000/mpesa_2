package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ActivitySendMoneyConfirmBindingImpl extends ActivitySendMoneyConfirmBinding {
    private static int component2 = 0;
    private static final SparseIntArray component3;
    private static int component4 = 0;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState = 1;
    private final ConstraintLayout ShareDataUIState;
    private long component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.rl_container, 1);
        sparseIntArray.put(R.id.tv_title, 2);
        sparseIntArray.put(R.id.view_divider, 3);
        sparseIntArray.put(R.id.rv_confirm, 4);
        sparseIntArray.put(R.id.iv_guideline, 5);
        sparseIntArray.put(R.id.iv_avatar, 6);
        sparseIntArray.put(R.id.btn_confirm, 7);
        int i = getRequestBeneficiariesState + 113;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ActivitySendMoneyConfirmBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, copydefault, component3));
    }

    private ActivitySendMoneyConfirmBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[7], (RoundImageView) objArr[6], (View) objArr[5], (RoundConstraintLayout) objArr[1], (RecyclerView) objArr[4], (TextView) objArr[2], (View) objArr[3]);
        this.component1 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ShareDataUIState = constraintLayout;
        constraintLayout.setTag(null);
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
        int i4 = getAsAtTimestamp;
        int i5 = i4 + 83;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 89;
        component4 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 3;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 103;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
