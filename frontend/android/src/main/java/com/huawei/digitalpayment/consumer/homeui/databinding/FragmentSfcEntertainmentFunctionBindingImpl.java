package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class FragmentSfcEntertainmentFunctionBindingImpl extends FragmentSfcEntertainmentFunctionBinding {
    private static int ShareDataUIState = 1;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static final SparseIntArray component3;
    private static int copydefault = 0;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private long component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.tv_title, 1);
        sparseIntArray.put(R.id.recyclerView, 2);
        int i = copydefault + 19;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public FragmentSfcEntertainmentFunctionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, component1, component3));
    }

    private FragmentSfcEntertainmentFunctionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[0], (RecyclerView) objArr[2], (TextView) objArr[1]);
        this.component2 = -1L;
        this.miniAppCard.setTag(null);
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
        int i4 = equals;
        int i5 = i4 + 75;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 15;
        getRequestBeneficiariesState = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 19 / 0;
        }
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 11;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 95;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
