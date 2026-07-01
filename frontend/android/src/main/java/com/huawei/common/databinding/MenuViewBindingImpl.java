package com.huawei.common.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.BubblesView;

public class MenuViewBindingImpl extends MenuViewBinding {
    private static final SparseIntArray ShareDataUIState = null;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private long component1;

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        return true;
    }

    public MenuViewBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr) {
        this(dataBindingComponent, viewArr, mapBindings(dataBindingComponent, viewArr, 5, component3, ShareDataUIState));
    }

    private MenuViewBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr, Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (ImageView) objArr[1], (ImageView) objArr[3], (TextView) objArr[2], (BubblesView) objArr[4], (View) objArr[0]);
        this.component1 = -1L;
        this.ivFunctionIcon.setTag(null);
        this.ivMarker.setTag(null);
        this.tvFunctionName.setTag(null);
        this.tvRedDot.setTag(null);
        this.viewGuideLine.setTag(null);
        setRootTag(viewArr);
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
}
