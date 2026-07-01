package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ItemAppSettingCardBindingImpl extends ItemAppSettingCardBinding {
    private static int ShareDataUIState = 0;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static final SparseIntArray component3;
    private static int component4 = 1;
    private static int copy = 0;
    private static int equals = 1;
    private long component2;
    private final MaterialCardView copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.csImgIcon, 1);
        sparseIntArray.put(R.id.imgIcon, 2);
        sparseIntArray.put(R.id.tvTitle, 3);
        int i = equals + 15;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public ItemAppSettingCardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, component1, component3));
    }

    private ItemAppSettingCardBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[1], (ImageView) objArr[2], (TextView) objArr[3]);
        this.component2 = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.copydefault = materialCardView;
        materialCardView.setTag(null);
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
        int i4 = copy + 75;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 27;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
