package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class FragmentTitleBindingImpl extends FragmentTitleBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.imageBg, 1);
        sparseIntArray.put(R.id.tvTitle, 2);
        int i = component2 + 121;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public FragmentTitleBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, ShareDataUIState, component1));
    }

    private FragmentTitleBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundConstraintLayout) objArr[0], (ImageView) objArr[1], (RoundTextView) objArr[2]);
        this.copydefault = -1L;
        this.clRoot.setTag(null);
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
        int i4 = getAsAtTimestamp;
        int i5 = i4 + 95;
        copy = i5 % 128;
        boolean z = i5 % 2 != 0;
        int i6 = i4 + 125;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 107;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 69;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
