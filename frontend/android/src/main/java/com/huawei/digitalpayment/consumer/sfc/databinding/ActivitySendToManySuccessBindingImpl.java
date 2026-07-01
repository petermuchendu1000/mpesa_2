package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.RotateImageView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ActivitySendToManySuccessBindingImpl extends ActivitySendToManySuccessBinding {
    private static int ShareDataUIState = 0;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static final SparseIntArray component3;
    private static int copy = 0;
    private static int copydefault = 1;
    private static int equals = 1;
    private long component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.rlTop, 1);
        sparseIntArray.put(R.id.iv_delete, 2);
        sparseIntArray.put(R.id.rlContent, 3);
        sparseIntArray.put(R.id.tv_title, 4);
        sparseIntArray.put(R.id.tvDate, 5);
        sparseIntArray.put(R.id.line1, 6);
        sparseIntArray.put(R.id.llAllContainer, 7);
        sparseIntArray.put(R.id.successRecipients, 8);
        sparseIntArray.put(R.id.successId, 9);
        sparseIntArray.put(R.id.successAmount, 10);
        sparseIntArray.put(R.id.rvSuccess, 11);
        sparseIntArray.put(R.id.line2, 12);
        sparseIntArray.put(R.id.llFailedContainer, 13);
        sparseIntArray.put(R.id.failedRecipients, 14);
        sparseIntArray.put(R.id.failedAmount, 15);
        sparseIntArray.put(R.id.rvFailed, 16);
        sparseIntArray.put(R.id.line3, 17);
        sparseIntArray.put(R.id.amout, 18);
        sparseIntArray.put(R.id.fee, 19);
        sparseIntArray.put(R.id.imStatusFinal, 20);
        sparseIntArray.put(R.id.imStatusLoading, 21);
        sparseIntArray.put(R.id.btn_confirm, 22);
        int i = copydefault + 119;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public ActivitySendToManySuccessBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 23, component2, component3));
    }

    private ActivitySendToManySuccessBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[18], (LoadingButton) objArr[22], (TextView) objArr[15], (TextView) objArr[14], (TextView) objArr[19], (RoundImageView) objArr[20], (RotateImageView) objArr[21], (RoundImageView) objArr[2], (View) objArr[6], (View) objArr[12], (View) objArr[17], (LinearLayout) objArr[7], (LinearLayout) objArr[13], (RelativeLayout) objArr[3], (RelativeLayout) objArr[1], (ConstraintLayout) objArr[0], (RecyclerView) objArr[16], (RecyclerView) objArr[11], (TextView) objArr[10], (TextView) objArr[9], (TextView) objArr[8], (TextView) objArr[5], (TextView) objArr[4]);
        this.component1 = -1L;
        this.rootView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component1 = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component1 != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component1 = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = copy + 31;
        equals = i4 % 128;
        return i4 % 2 == 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 77;
        copy = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 125;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
