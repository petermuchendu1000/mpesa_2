package com.huawei.digitalpayment.checkoutUi.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.checkoutUi.R;

public class ItemAddOtherBankBindingImpl extends ItemAddOtherBankBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static int component3 = 0;
    private static int component4 = 0;
    private static int copy = 1;
    private static final SparseIntArray copydefault;
    private static int getAsAtTimestamp = 1;
    private final LinearLayout component1;
    private long component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.ll_view_all, 1);
        sparseIntArray.put(R.id.im_viewall, 2);
        sparseIntArray.put(R.id.tv_viewall, 3);
        int i = getAsAtTimestamp + 107;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public ItemAddOtherBankBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, ShareDataUIState, copydefault));
    }

    private ItemAddOtherBankBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (LinearLayout) objArr[1], (TextView) objArr[3]);
        this.component2 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component1 = linearLayout;
        linearLayout.setTag(null);
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
        int i4 = copy + 69;
        int i5 = i4 % 128;
        component4 = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 97;
        copy = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 109;
        component4 = i3 % 128;
        return i3 % 2 == 0;
    }
}
