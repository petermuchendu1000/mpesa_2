package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ItemFaqsCardBindingImpl extends ItemFaqsCardBinding {
    private static final SparseIntArray ShareDataUIState;
    private static int component1 = 0;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component4 = 1;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private long component3;
    private final CardView copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.csTitle, 1);
        sparseIntArray.put(R.id.tvTitle, 2);
        sparseIntArray.put(R.id.iv_chevron, 3);
        sparseIntArray.put(R.id.tvDescription, 4);
        int i = component1 + 65;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 == 0) {
            int i2 = 4 / 0;
        }
    }

    public ItemFaqsCardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, component2, ShareDataUIState));
    }

    private ItemFaqsCardBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[1], (ImageView) objArr[3], (TextView) objArr[4], (TextView) objArr[2]);
        this.component3 = -1L;
        CardView cardView = (CardView) objArr[0];
        this.copydefault = cardView;
        cardView.setTag(null);
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
        int i4 = equals;
        int i5 = i4 + 31;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 55;
        component4 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 87;
        int i4 = i3 % 128;
        component4 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 115;
        equals = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 68 / 0;
        }
        return true;
    }
}
