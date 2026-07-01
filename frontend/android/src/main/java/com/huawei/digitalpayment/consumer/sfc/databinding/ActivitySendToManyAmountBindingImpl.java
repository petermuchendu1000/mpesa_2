package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.base.ui.widget.SfcManyAmountInputView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ActivitySendToManyAmountBindingImpl extends ActivitySendToManyAmountBinding {
    private static final SparseIntArray ShareDataUIState;
    private static int component1 = 1;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int component4 = 1;
    private static int copydefault;
    private static int getRequestBeneficiariesState;
    private long component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.view_bg, 1);
        sparseIntArray.put(R.id.iv_back, 2);
        sparseIntArray.put(R.id.tv_title, 3);
        sparseIntArray.put(R.id.llAmout, 4);
        sparseIntArray.put(R.id.tvTotal, 5);
        sparseIntArray.put(R.id.input_amount, 6);
        sparseIntArray.put(R.id.tvAmountTips, 7);
        sparseIntArray.put(R.id.llPeople, 8);
        sparseIntArray.put(R.id.btn_confirm, 9);
        int i = copydefault + 49;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public ActivitySendToManyAmountBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, component3, ShareDataUIState));
    }

    private ActivitySendToManyAmountBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[9], (SfcManyAmountInputView) objArr[6], (RoundImageView) objArr[2], (LinearLayout) objArr[4], (LinearLayout) objArr[8], (ConstraintLayout) objArr[0], (TextView) objArr[7], (TextView) objArr[3], (TextView) objArr[5], (View) objArr[1]);
        this.component2 = -1L;
        this.rlRoot.setTag(null);
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
        int i4 = getRequestBeneficiariesState;
        int i5 = i4 + 31;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 21;
        component4 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 35;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 39;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
