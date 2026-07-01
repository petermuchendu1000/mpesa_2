package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.input.IconImageView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.text.FixEditText;
import com.huawei.digitalpayment.consumer.baseui.R;

public class PhoneInputEditTextBindingImpl extends PhoneInputEditTextBinding {
    private static final SparseIntArray ShareDataUIState;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component2 = 0;
    private static int component4 = 0;
    private static int copydefault = 1;
    private static int getAsAtTimestamp = 1;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.startIconView, 3);
        sparseIntArray.put(R.id.startUnitView, 4);
        sparseIntArray.put(R.id.inputView, 5);
        sparseIntArray.put(R.id.endIconView, 6);
        sparseIntArray.put(R.id.endUnitView, 7);
        int i = copydefault + 101;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 6 / 0;
        }
    }

    public PhoneInputEditTextBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr) {
        this(dataBindingComponent, viewArr, mapBindings(dataBindingComponent, viewArr, 8, component1, ShareDataUIState));
    }

    private PhoneInputEditTextBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr, Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (RoundConstraintLayout) objArr[1], (IconImageView) objArr[6], (TextView) objArr[7], (TextView) objArr[2], (FixEditText) objArr[5], (IconImageView) objArr[3], (TextView) objArr[4], (TextView) objArr[0]);
        this.component3 = -1L;
        this.clInput.setTag(null);
        this.errorView.setTag(null);
        this.titleView.setTag(null);
        setRootTag(viewArr);
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
        int i4 = getAsAtTimestamp + 105;
        int i5 = i4 % 128;
        component4 = i5;
        boolean z = i4 % 2 != 0;
        int i6 = i5 + 47;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 53;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
