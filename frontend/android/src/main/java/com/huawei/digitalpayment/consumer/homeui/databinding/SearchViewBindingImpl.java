package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class SearchViewBindingImpl extends SearchViewBinding {
    private static int component1 = 0;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static final SparseIntArray component3;
    private static int component4 = 0;
    private static int copy = 1;
    private static int copydefault = 1;
    private long ShareDataUIState;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.rl_search, 1);
        sparseIntArray.put(R.id.searchfind, 2);
        sparseIntArray.put(R.id.edittext, 3);
        sparseIntArray.put(R.id.ivClear, 4);
        sparseIntArray.put(R.id.ll_right, 5);
        sparseIntArray.put(R.id.tv_search, 6);
        int i = copydefault + 21;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public SearchViewBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, component2, component3));
    }

    private SearchViewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (CommonInputView) objArr[3], (ImageView) objArr[4], (LinearLayout) objArr[5], (ConstraintLayout) objArr[1], (ImageView) objArr[2], (TextView) objArr[6]);
        this.ShareDataUIState = -1L;
        this.clSearch.setTag(null);
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
        int i4 = component4 + 79;
        copy = i4 % 128;
        return i4 % 2 == 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 59;
        int i4 = i3 % 128;
        copy = i4;
        boolean z = i3 % 2 != 0;
        int i5 = i4 + 31;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
