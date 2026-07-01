package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class ItemFunctionsTemplateDefaultBindingImpl extends ItemFunctionsTemplateDefaultBinding {
    private static int ShareDataUIState = 0;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static final SparseIntArray component2;
    private static int component3 = 1;
    private static int component4 = 0;
    private static int getAsAtTimestamp = 1;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.viewMarginStartTop, 1);
        sparseIntArray.put(R.id.viewMarginEndBottom, 2);
        sparseIntArray.put(R.id.viewPaddingStartTop, 3);
        sparseIntArray.put(R.id.viewPaddingEndBottom, 4);
        sparseIntArray.put(R.id.background, 5);
        sparseIntArray.put(R.id.iv_icon, 6);
        sparseIntArray.put(R.id.tvHot, 7);
        sparseIntArray.put(R.id.ivHot, 8);
        sparseIntArray.put(R.id.guideline, 9);
        sparseIntArray.put(R.id.guideline2, 10);
        sparseIntArray.put(R.id.viewSpace, 11);
        sparseIntArray.put(R.id.tv_title, 12);
        int i = component3 + 55;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public ItemFunctionsTemplateDefaultBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 13, component1, component2));
    }

    private ItemFunctionsTemplateDefaultBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundImageView) objArr[5], (Guideline) objArr[9], (View) objArr[10], (RoundImageView) objArr[8], (RoundImageView) objArr[6], (RoundConstraintLayout) objArr[0], (RoundTextView) objArr[7], (TextView) objArr[12], (View) objArr[2], (View) objArr[1], (View) objArr[4], (View) objArr[3], (View) objArr[11]);
        this.copydefault = -1L;
        this.root.setTag(null);
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
        component4 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 49;
        component4 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4;
        int i4 = i3 + 91;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 57;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
