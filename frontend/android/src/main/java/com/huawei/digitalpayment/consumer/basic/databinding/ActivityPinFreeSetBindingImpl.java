package com.huawei.digitalpayment.consumer.basic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.SwitchView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.common.widget.text.AmountInputView;
import com.huawei.digitalpayment.consumer.basic.R;

public class ActivityPinFreeSetBindingImpl extends ActivityPinFreeSetBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component1;
    private static int component4 = 1;
    private static int copydefault = 0;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private final ConstraintLayout component2;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.textView, 1);
        sparseIntArray.put(R.id.cv_switch, 2);
        sparseIntArray.put(R.id.tv_fingerprint_login, 3);
        sparseIntArray.put(R.id.cb_pin_free, 4);
        sparseIntArray.put(R.id.ll_amount, 5);
        sparseIntArray.put(R.id.tv_hint, 6);
        sparseIntArray.put(R.id.lb_confirm, 7);
        int i = getRequestBeneficiariesState + 109;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 77 / 0;
        }
    }

    public ActivityPinFreeSetBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, ShareDataUIState, component1));
    }

    private ActivityPinFreeSetBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (SwitchView) objArr[4], (RoundConstraintLayout) objArr[2], (LoadingButton) objArr[7], (AmountInputView) objArr[5], (RoundTextView) objArr[1], (TextView) objArr[3], (TextView) objArr[6]);
        this.component3 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component2 = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component3 = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component3 != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component3 = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = component4;
        int i5 = i4 + 1;
        equals = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 83;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 35;
        equals = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
