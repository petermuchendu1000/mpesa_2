package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class ItemFunctionsTemplate3BindingImpl extends ItemFunctionsTemplate3Binding {
    private static int ShareDataUIState = 1;
    private static final SparseIntArray component1;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int copy = 1;
    private static int copydefault;
    private static int getRequestBeneficiariesState;
    private long component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.viewMarginStartTop, 1);
        sparseIntArray.put(R.id.viewPaddingStartTop, 2);
        sparseIntArray.put(R.id.background, 3);
        sparseIntArray.put(R.id.iv_icon, 4);
        sparseIntArray.put(R.id.guideline, 5);
        sparseIntArray.put(R.id.guideline2, 6);
        sparseIntArray.put(R.id.viewSpace, 7);
        sparseIntArray.put(R.id.tv_title, 8);
        sparseIntArray.put(R.id.ivArrow, 9);
        sparseIntArray.put(R.id.viewMarginEndBottom, 10);
        sparseIntArray.put(R.id.viewPaddingEndBottom, 11);
        int i = ShareDataUIState + 71;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public ItemFunctionsTemplate3BindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 12, component3, component1));
    }

    private ItemFunctionsTemplate3BindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundImageView) objArr[3], (View) objArr[5], (View) objArr[6], (ImageView) objArr[9], (RoundImageView) objArr[4], (RoundConstraintLayout) objArr[0], (TextView) objArr[8], (View) objArr[10], (View) objArr[1], (View) objArr[11], (View) objArr[2], (View) objArr[7]);
        this.component2 = -1L;
        this.root.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component2 = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component2 != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component2 = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = copy + 15;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 7;
        int i4 = i3 % 128;
        copy = i4;
        boolean z = i3 % 2 != 0;
        int i5 = i4 + 19;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
