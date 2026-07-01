package com.huawei.digitalpayment.consumer.miniapps.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

public class FragmentSfcMiniappSplashBindingImpl extends FragmentSfcMiniappSplashBinding {
    private static int ShareDataUIState = 107 % 128;
    private static int component1 = 1;
    private static int component3;
    private static int copydefault;
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    public FragmentSfcMiniappSplashBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, sIncludes, sViewsWithIds));
    }

    private FragmentSfcMiniappSplashBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ComposeView) objArr[0]);
        this.mDirtyFlags = -1L;
        this.composeView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.mDirtyFlags != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
    }

    static {
        if (107 % 2 == 0) {
            int i = 1 / 0;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = component1;
        int i5 = i4 + 71;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 67;
        copydefault = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 26 / 0;
        }
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 71;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 93;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
