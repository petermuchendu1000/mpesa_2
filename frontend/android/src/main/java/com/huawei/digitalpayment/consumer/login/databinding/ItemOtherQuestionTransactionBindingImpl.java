package com.huawei.digitalpayment.consumer.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.login.R;

public class ItemOtherQuestionTransactionBindingImpl extends ItemOtherQuestionTransactionBinding {
    private static int component1 = 0;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static final SparseIntArray component3;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState = 1;
    private final ConstraintLayout ShareDataUIState;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.iv_icon, 1);
        sparseIntArray.put(R.id.iv_clear, 2);
        sparseIntArray.put(R.id.tv_amount, 3);
        sparseIntArray.put(R.id.tv_date, 4);
        sparseIntArray.put(R.id.tv_number, 5);
        int i = getRequestBeneficiariesState + 113;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 81 / 0;
        }
    }

    public ItemOtherQuestionTransactionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, component2, component3));
    }

    private ItemOtherQuestionTransactionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (ImageView) objArr[1], (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[5]);
        this.copydefault = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ShareDataUIState = constraintLayout;
        constraintLayout.setTag(null);
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

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = copy + 7;
        int i5 = i4 % 128;
        getAsAtTimestamp = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 101;
        copy = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 9;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 57;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
