package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ActivityContactBindingImpl extends ActivityContactBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component1;
    private static int copy = 0;
    private static int copydefault = 0;
    private static int equals = 1;
    private static int getRequestBeneficiariesState = 1;
    private final ConstraintLayout component2;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.iv_back, 1);
        sparseIntArray.put(R.id.tv_title_header, 2);
        sparseIntArray.put(R.id.input_search, 3);
        sparseIntArray.put(R.id.tv_title, 4);
        sparseIntArray.put(R.id.rv_contact, 5);
        sparseIntArray.put(R.id.progressBar, 6);
        int i = getRequestBeneficiariesState + 81;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public ActivityContactBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, ShareDataUIState, component1));
    }

    private ActivityContactBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CommonInputView) objArr[3], (RoundImageView) objArr[1], (ProgressBar) objArr[6], (RecyclerView) objArr[5], (TextView) objArr[4], (TextView) objArr[2]);
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
        int i4 = equals + 15;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 71;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 123;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 93 / 0;
        }
        return true;
    }
}
