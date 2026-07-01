package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.text.AmountInputView2;
import com.huawei.digitalpayment.consumer.qrcode.BR;
import com.huawei.digitalpayment.consumer.qrcode.R;

public class ActivityBuyGoodsConfirmBindingImpl extends ActivityBuyGoodsConfirmBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component3;
    private static int component4 = 1;
    private static int copy = 1;
    private static int copydefault;
    private static int getAsAtTimestamp;
    private final ConstraintLayout component1;
    private long component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.iv_head, 2);
        sparseIntArray.put(R.id.tv_org_name, 3);
        sparseIntArray.put(R.id.tv_transfer_to, 4);
        sparseIntArray.put(R.id.cl_bottom, 5);
        sparseIntArray.put(R.id.input_amount, 6);
        sparseIntArray.put(R.id.line, 7);
        sparseIntArray.put(R.id.tvAddNotes, 8);
        sparseIntArray.put(R.id.lbOk, 9);
        int i = copydefault + 113;
        component4 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ActivityBuyGoodsConfirmBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, ShareDataUIState, component3));
    }

    private ActivityBuyGoodsConfirmBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[5], (AmountInputView2) objArr[6], (RoundImageView) objArr[2], (LoadingButton) objArr[9], (View) objArr[7], (TextView) objArr[8], (TextView) objArr[1], (TextView) objArr[3], (TextView) objArr[4]);
        this.component2 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component1 = constraintLayout;
        constraintLayout.setTag(null);
        this.tvAmend.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component2 = 2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component2 != 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean setVariable(int r6, java.lang.Object r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.qrcode.databinding.ActivityBuyGoodsConfirmBindingImpl.getAsAtTimestamp
            r2 = 1
            int r1 = r1 + r2
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.qrcode.databinding.ActivityBuyGoodsConfirmBindingImpl.copy = r3
            int r1 = r1 % r0
            r3 = 0
            if (r1 != 0) goto L17
            int r1 = com.huawei.digitalpayment.consumer.qrcode.BR.isAmend
            r4 = 81
            int r4 = r4 / r3
            if (r1 != r6) goto L33
            goto L1b
        L17:
            int r1 = com.huawei.digitalpayment.consumer.qrcode.BR.isAmend
            if (r1 != r6) goto L33
        L1b:
            int r6 = com.huawei.digitalpayment.consumer.qrcode.databinding.ActivityBuyGoodsConfirmBindingImpl.copy
            int r6 = r6 + 79
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.qrcode.databinding.ActivityBuyGoodsConfirmBindingImpl.getAsAtTimestamp = r1
            int r6 = r6 % r0
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r5.setIsAmend(r7)
            int r6 = com.huawei.digitalpayment.consumer.qrcode.databinding.ActivityBuyGoodsConfirmBindingImpl.getAsAtTimestamp
            int r6 = r6 + 17
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.qrcode.databinding.ActivityBuyGoodsConfirmBindingImpl.copy = r7
            int r6 = r6 % r0
            goto L34
        L33:
            r2 = r3
        L34:
            int r6 = com.huawei.digitalpayment.consumer.qrcode.databinding.ActivityBuyGoodsConfirmBindingImpl.copy
            int r6 = r6 + 69
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.qrcode.databinding.ActivityBuyGoodsConfirmBindingImpl.getAsAtTimestamp = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L40
            return r2
        L40:
            r6 = 0
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.databinding.ActivityBuyGoodsConfirmBindingImpl.setVariable(int, java.lang.Object):boolean");
    }

    @Override
    public void setIsAmend(Boolean bool) {
        this.mIsAmend = bool;
        synchronized (this) {
            this.component2 |= 1;
        }
        notifyPropertyChanged(BR.isAmend);
        super.requestRebind();
    }

    @Override
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.component2;
            this.component2 = 0L;
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
        int i4 = getAsAtTimestamp + 61;
        int i5 = i4 % 128;
        copy = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 109;
        getAsAtTimestamp = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
