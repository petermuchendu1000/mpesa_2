package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.homeui.R;

public class NewActivityHomeBindingImpl extends NewActivityHomeBinding {
    private static final SparseIntArray component2;
    private static int component3 = 0;
    private static int copy = 1;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private long ShareDataUIState;
    private final FrameLayout component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.fl_fragment_container, 1);
        sparseIntArray.put(R.id.welcomeTutorialHighlightView, 2);
        int i = component3 + 17;
        equals = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public NewActivityHomeBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, copydefault, component2));
    }

    private NewActivityHomeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[1], (ComposeView) objArr[2]);
        this.ShareDataUIState = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.component1 = frameLayout;
        frameLayout.setTag(null);
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

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = getRequestBeneficiariesState;
        int i5 = i4 + 103;
        copy = i5 % 128;
        boolean z = i5 % 2 == 0;
        int i6 = i4 + 93;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 1;
        copy = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 67;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
