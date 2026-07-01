package com.huawei.digitalpayment.consumer.history.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.history.R;

public class FragmentHistoryBindingImpl extends FragmentHistoryBinding {
    private static final SparseIntArray ShareDataUIState;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component2 = 1;
    private static int copy = 0;
    private static int copydefault = 0;
    private static int equals = 1;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.imageBg, 1);
        sparseIntArray.put(R.id.cl_content, 2);
        sparseIntArray.put(R.id.tv_title, 3);
        sparseIntArray.put(R.id.tv_viewall, 4);
        sparseIntArray.put(R.id.ll_nodata, 5);
        sparseIntArray.put(R.id.rv_record, 6);
        int i = component2 + 45;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public FragmentHistoryBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, component1, ShareDataUIState));
    }

    private FragmentHistoryBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[2], (RoundConstraintLayout) objArr[0], (ImageView) objArr[1], (RoundLinearLayout) objArr[5], (RecyclerView) objArr[6], (TextView) objArr[3], (TextView) objArr[4]);
        this.component3 = -1L;
        this.clRoot.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component3 = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component3 != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component3 = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = equals + 107;
        int i5 = i4 % 128;
        copy = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 65;
        equals = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 41;
        int i4 = i3 % 128;
        copy = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 13;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
