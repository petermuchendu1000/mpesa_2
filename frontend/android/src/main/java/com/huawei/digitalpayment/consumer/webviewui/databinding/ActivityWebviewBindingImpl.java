package com.huawei.digitalpayment.consumer.webviewui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

public class ActivityWebviewBindingImpl extends ActivityWebviewBinding {
    private static final SparseIntArray ShareDataUIState = null;
    private static int component1 = 117 % 128;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component3 = 0;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private long copydefault;

    public ActivityWebviewBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, component2, ShareDataUIState));
    }

    private ActivityWebviewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[0]);
        this.copydefault = -1L;
        this.flContainer.setTag(null);
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

    static {
        int i = 117 % 2;
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = equals;
        int i5 = i4 + 99;
        getAsAtTimestamp = i5 % 128;
        boolean z = i5 % 2 == 0;
        int i6 = i4 + 11;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 37;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 117;
        equals = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 48 / 0;
        }
        return true;
    }
}
