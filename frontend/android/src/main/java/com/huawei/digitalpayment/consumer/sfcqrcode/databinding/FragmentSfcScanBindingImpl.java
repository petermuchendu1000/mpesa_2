package com.huawei.digitalpayment.consumer.sfcqrcode.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfcqrcode.R;

public class FragmentSfcScanBindingImpl extends FragmentSfcScanBinding {
    private static final SparseIntArray component1;
    private static int component2 = 0;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int copydefault = 1;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private long ShareDataUIState;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.iv_scan_line, 1);
        sparseIntArray.put(R.id.iv_gallery, 2);
        sparseIntArray.put(R.id.iv_flashlight, 3);
        int i = component2 + 7;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public FragmentSfcScanBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, component3, component1));
    }

    private FragmentSfcScanBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (ImageView) objArr[3], (ImageView) objArr[2], (ImageView) objArr[1]);
        this.ShareDataUIState = -1L;
        this.contentLayout.setTag(null);
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
        int i4 = equals + 7;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 3;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 29;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 66 / 0;
        }
        return true;
    }
}
