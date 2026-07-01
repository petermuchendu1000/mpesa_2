package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class FragmentFunctionsMultipleTemplateBindingImpl extends FragmentFunctionsMultipleTemplateBinding {
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
        sparseIntArray.put(R.id.background, 1);
        sparseIntArray.put(R.id.tv_title, 2);
        sparseIntArray.put(R.id.iv_icon, 3);
        sparseIntArray.put(R.id.barrier, 4);
        sparseIntArray.put(R.id.recyclerView, 5);
        int i = component3 + 31;
        copydefault = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public FragmentFunctionsMultipleTemplateBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, ShareDataUIState, component2));
    }

    private FragmentFunctionsMultipleTemplateBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundImageView) objArr[1], (Barrier) objArr[4], (ImageView) objArr[3], (RecyclerView) objArr[5], (RoundConstraintLayout) objArr[0], (TextView) objArr[2]);
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
        int i5 = i4 + 25;
        copy = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 49;
        copy = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 115;
        copy = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 97;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
