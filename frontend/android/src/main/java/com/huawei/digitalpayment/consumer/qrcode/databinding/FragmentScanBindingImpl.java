package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.qrcode.R;

public class FragmentScanBindingImpl extends FragmentScanBinding {
    private static final SparseIntArray ShareDataUIState;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component2 = 0;
    private static int copy = 0;
    private static int copydefault = 1;
    private static int equals = 1;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.iv_scan_line, 1);
        sparseIntArray.put(R.id.tipsView, 2);
        sparseIntArray.put(R.id.ll_pay, 3);
        sparseIntArray.put(R.id.iv_pay, 4);
        sparseIntArray.put(R.id.tv_pay, 5);
        sparseIntArray.put(R.id.ll_album, 6);
        sparseIntArray.put(R.id.iv_flashlight, 7);
        int i = copydefault + 11;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public FragmentScanBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, component1, ShareDataUIState));
    }

    private FragmentScanBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (ImageView) objArr[7], (ImageView) objArr[4], (ImageView) objArr[1], (LinearLayout) objArr[6], (LinearLayout) objArr[3], (RoundTextView) objArr[2], (RoundTextView) objArr[5]);
        this.component3 = -1L;
        this.contentLayout.setTag(null);
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
        int i4 = copy + 91;
        int i5 = i4 % 128;
        equals = i5;
        boolean z = i4 % 2 == 0;
        int i6 = i5 + 39;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 105;
        copy = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 33;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
