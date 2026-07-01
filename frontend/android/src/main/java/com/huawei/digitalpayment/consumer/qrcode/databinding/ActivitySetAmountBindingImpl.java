package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.text.AmountInputView2;
import com.huawei.digitalpayment.consumer.qrcode.BR;
import com.huawei.digitalpayment.consumer.qrcode.R;

public class ActivitySetAmountBindingImpl extends ActivitySetAmountBinding {
    private static int ShareDataUIState = 0;
    private static final SparseIntArray component1;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int copy = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp = 1;
    private final RoundConstraintLayout component3;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.input_amount, 2);
        sparseIntArray.put(R.id.line, 3);
        sparseIntArray.put(R.id.tvAddNotes, 4);
        sparseIntArray.put(R.id.btnConfirm, 5);
        int i = equals + 85;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ActivitySetAmountBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, component2, component1));
    }

    private ActivitySetAmountBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[5], (AmountInputView2) objArr[2], (View) objArr[3], (TextView) objArr[4], (TextView) objArr[1]);
        this.copydefault = -1L;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) objArr[0];
        this.component3 = roundConstraintLayout;
        roundConstraintLayout.setTag(null);
        this.tvAmend.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.copydefault = 2L;
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
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 5;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            if (BR.isAmend != i) {
                int i4 = getAsAtTimestamp + 89;
                copy = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = copy + 65;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            setIsAmend((Boolean) obj);
            return true;
        }
        int i8 = BR.isAmend;
        throw null;
    }

    @Override
    public void setIsAmend(Boolean bool) {
        this.mIsAmend = bool;
        synchronized (this) {
            this.copydefault |= 1;
        }
        notifyPropertyChanged(BR.isAmend);
        super.requestRebind();
    }

    @Override
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.copydefault;
            this.copydefault = 0L;
        }
        Boolean bool = this.mIsAmend;
        long j2 = j & 3;
        int i = 0;
        if (j2 != 0) {
            boolean zSafeUnbox = ViewDataBinding.safeUnbox(bool);
            if (j2 != 0) {
                j |= zSafeUnbox ? 8L : 4L;
            }
            if (!zSafeUnbox) {
                i = 8;
            }
        }
        if ((j & 3) != 0) {
            this.tvAmend.setVisibility(i);
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = getAsAtTimestamp + 105;
        int i5 = i4 % 128;
        copy = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 121;
        getAsAtTimestamp = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }
}
