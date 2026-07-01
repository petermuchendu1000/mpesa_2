package com.huawei.digitalpayment.consumer.subsui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.subsui.R;

public class ItemSkizaTuneBindingImpl extends ItemSkizaTuneBinding {
    private static int ShareDataUIState = 0;
    private static final SparseIntArray component1;
    private static int component2 = 1;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.iv_bundle, 1);
        sparseIntArray.put(R.id.ll_container, 2);
        sparseIntArray.put(R.id.tvTitle, 3);
        sparseIntArray.put(R.id.tvDesc, 4);
        sparseIntArray.put(R.id.tv_buy, 5);
        int i = ShareDataUIState + 1;
        component2 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ItemSkizaTuneBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, copydefault, component1));
    }

    private ItemSkizaTuneBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[0], (ImageView) objArr[1], (LinearLayout) objArr[2], (CheckBox) objArr[5], (TextView) objArr[4], (TextView) objArr[3]);
        this.component3 = -1L;
        this.cvRoot.setTag(null);
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
        int i4 = getRequestBeneficiariesState + 21;
        int i5 = i4 % 128;
        equals = i5;
        boolean z = !(i4 % 2 != 0);
        int i6 = i5 + 51;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 92 / 0;
        }
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 61;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 107;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
