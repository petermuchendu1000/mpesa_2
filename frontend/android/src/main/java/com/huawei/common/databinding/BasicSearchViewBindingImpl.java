package com.huawei.common.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.R;
import com.huawei.common.widget.input.CommonInputView;

public class BasicSearchViewBindingImpl extends BasicSearchViewBinding {
    private static final SparseIntArray component2;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
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
        sparseIntArray.put(R.id.rl_search, 1);
        sparseIntArray.put(R.id.im_search, 2);
        sparseIntArray.put(R.id.edittext, 3);
        sparseIntArray.put(R.id.im_clear, 4);
        sparseIntArray.put(R.id.imSearchEnd, 5);
        sparseIntArray.put(R.id.ll_right_search, 6);
        sparseIntArray.put(R.id.view_divider, 7);
        sparseIntArray.put(R.id.tv_search, 8);
        sparseIntArray.put(R.id.vUnEnableRoot, 9);
    }

    public BasicSearchViewBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, component3, component2));
    }

    private BasicSearchViewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (CommonInputView) objArr[3], (ImageView) objArr[4], (ImageView) objArr[2], (ImageView) objArr[5], (LinearLayout) objArr[6], (ConstraintLayout) objArr[1], (TextView) objArr[8], (View) objArr[9], (View) objArr[7]);
        this.copydefault = -1L;
        this.clSearchRoot.setTag(null);
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
}
