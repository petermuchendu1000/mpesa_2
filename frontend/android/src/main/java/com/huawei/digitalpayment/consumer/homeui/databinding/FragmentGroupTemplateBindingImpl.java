package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.homeui.R;

public class FragmentGroupTemplateBindingImpl extends FragmentGroupTemplateBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component2;
    private static int component3 = 0;
    private static int copy = 0;
    private static int copydefault = 1;
    private static int equals = 1;
    private long component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.ivBackground, 1);
        sparseIntArray.put(R.id.container, 2);
        int i = component3 + 83;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FragmentGroupTemplateBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, ShareDataUIState, component2));
    }

    private FragmentGroupTemplateBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[2], (ImageView) objArr[1], (RoundConstraintLayout) objArr[0]);
        this.component1 = -1L;
        this.root.setTag(null);
        setRootTag(view);
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

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = equals;
        int i5 = i4 + 101;
        copy = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 69;
        copy = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 17;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 113;
        equals = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
