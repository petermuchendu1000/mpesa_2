package com.huawei.common.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.R;
import com.huawei.common.widget.input.IconImageView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.text.FixEditText;

public class MultiLineInputViewBindingImpl extends MultiLineInputViewBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component2;
    private long copydefault;

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.startIconView, 3);
        sparseIntArray.put(R.id.startUnitView, 4);
        sparseIntArray.put(R.id.inputViewParent, 5);
        sparseIntArray.put(R.id.inputView, 6);
        sparseIntArray.put(R.id.endIconView, 7);
        sparseIntArray.put(R.id.endUnitView, 8);
        sparseIntArray.put(R.id.llButton, 9);
        sparseIntArray.put(R.id.inputLimit, 10);
    }

    public MultiLineInputViewBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr) {
        this(dataBindingComponent, viewArr, mapBindings(dataBindingComponent, viewArr, 11, ShareDataUIState, component2));
    }

    private MultiLineInputViewBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr, Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (RoundConstraintLayout) objArr[1], (IconImageView) objArr[7], (TextView) objArr[8], (TextView) objArr[2], (TextView) objArr[10], (FixEditText) objArr[6], (LinearLayout) objArr[5], (LinearLayout) objArr[9], (IconImageView) objArr[3], (TextView) objArr[4], (TextView) objArr[0]);
        this.copydefault = -1L;
        this.clInput.setTag(null);
        this.errorView.setTag(null);
        this.titleView.setTag(null);
        setRootTag(viewArr);
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
}
