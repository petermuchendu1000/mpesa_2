package com.huawei.digitalpayment.consumer.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.login.R;

public class ActivityResetPinWarningBindingImpl extends ActivityResetPinWarningBinding {
    private static final SparseIntArray component1;
    private static int component2 = 0;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int copy = 1;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private long ShareDataUIState;
    private final ConstraintLayout copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.imageView2, 1);
        sparseIntArray.put(R.id.textView6, 2);
        sparseIntArray.put(R.id.tv_tips, 3);
        sparseIntArray.put(R.id.btn_next, 4);
        int i = component2 + 73;
        copy = i % 128;
        if (i % 2 == 0) {
            int i2 = 10 / 0;
        }
    }

    public ActivityResetPinWarningBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, component3, component1));
    }

    private ActivityResetPinWarningBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[4], (ImageView) objArr[1], (TextView) objArr[2], (TextView) objArr[3]);
        this.ShareDataUIState = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.copydefault = constraintLayout;
        constraintLayout.setTag(null);
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
        int i4 = getAsAtTimestamp;
        int i5 = i4 + 7;
        equals = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 33;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 9;
        equals = i3 % 128;
        return i3 % 2 == 0;
    }
}
