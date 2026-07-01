package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.text.MarqueeView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class FragmentTipsBindingImpl extends FragmentTipsBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static final SparseIntArray component3;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.background, 1);
        sparseIntArray.put(R.id.marqueeView, 2);
        int i = ShareDataUIState + 61;
        component1 = i % 128;
        if (i % 2 == 0) {
            int i2 = 62 / 0;
        }
    }

    public FragmentTipsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, component2, component3));
    }

    private FragmentTipsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (MarqueeView) objArr[2], (RoundConstraintLayout) objArr[0]);
        this.copydefault = -1L;
        this.tipsRoot.setTag(null);
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
        int i4 = getRequestBeneficiariesState;
        int i5 = i4 + 61;
        equals = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 113;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 3;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 67;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
