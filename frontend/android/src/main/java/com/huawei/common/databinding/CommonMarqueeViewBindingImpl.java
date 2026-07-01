package com.huawei.common.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.R;
import com.huawei.common.widget.round.RoundConstraintLayout;

public class CommonMarqueeViewBindingImpl extends CommonMarqueeViewBinding {
    private static final SparseIntArray component1;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private long ShareDataUIState;
    private final RoundConstraintLayout copydefault;

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
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.ivIcon, 1);
        sparseIntArray.put(R.id.tvContent, 2);
        sparseIntArray.put(R.id.tvTime, 3);
    }

    public CommonMarqueeViewBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, component2, component1));
    }

    private CommonMarqueeViewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (TextView) objArr[2], (TextView) objArr[3]);
        this.ShareDataUIState = -1L;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) objArr[0];
        this.copydefault = roundConstraintLayout;
        roundConstraintLayout.setTag(null);
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
}
