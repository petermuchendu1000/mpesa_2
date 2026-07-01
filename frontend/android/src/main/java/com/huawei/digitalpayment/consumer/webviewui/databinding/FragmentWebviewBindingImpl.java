package com.huawei.digitalpayment.consumer.webviewui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.webviewui.R;
import com.huawei.secure.android.common.webview.SafeWebView;

public class FragmentWebviewBindingImpl extends FragmentWebviewBinding {
    private static final SparseIntArray ShareDataUIState;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component2 = 0;
    private static int component4 = 1;
    private static int copy = 0;
    private static int equals = 1;
    private final ConstraintLayout component3;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.webview, 1);
        sparseIntArray.put(R.id.progress_bar, 2);
        int i = equals + 113;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FragmentWebviewBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, component1, ShareDataUIState));
    }

    private FragmentWebviewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ProgressBar) objArr[2], (SafeWebView) objArr[1]);
        this.copydefault = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component3 = constraintLayout;
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
        int i4 = copy + 61;
        component4 = i4 % 128;
        return i4 % 2 == 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 105;
        copy = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
