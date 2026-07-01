package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class ItemFunctionsTemplate2BindingImpl extends ItemFunctionsTemplate2Binding {
    private static int component1 = 0;
    private static int component2 = 1;
    private static final SparseIntArray component3;
    private static int component4 = 1;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int equals;
    private long ShareDataUIState;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.viewMarginStartTop, 1);
        sparseIntArray.put(R.id.viewMarginEndBottom, 2);
        sparseIntArray.put(R.id.viewPaddingStartTop, 3);
        sparseIntArray.put(R.id.viewPaddingEndBottom, 4);
        sparseIntArray.put(R.id.background, 5);
        sparseIntArray.put(R.id.iv_icon, 6);
        sparseIntArray.put(R.id.guideline, 7);
        sparseIntArray.put(R.id.guideline2, 8);
        sparseIntArray.put(R.id.viewSpace, 9);
        sparseIntArray.put(R.id.tv_title, 10);
        int i = component2 + 89;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public ItemFunctionsTemplate2BindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 11, copydefault, component3));
    }

    private ItemFunctionsTemplate2BindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundImageView) objArr[5], (View) objArr[7], (View) objArr[8], (RoundImageView) objArr[6], (RoundConstraintLayout) objArr[0], (TextView) objArr[10], (View) objArr[2], (View) objArr[1], (View) objArr[4], (View) objArr[3], (View) objArr[9]);
        this.ShareDataUIState = -1L;
        this.root.setTag(null);
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
        int i4 = equals + 123;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 21;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 7;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
