package com.huawei.digitalpayment.consumer.sfcqrcode.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.text.AmountDisplayView;
import com.huawei.digitalpayment.consumer.sfcqrcode.R;

public class LayoutSfcDownloadQrCodeBindingImpl extends LayoutSfcDownloadQrCodeBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static int component1 = 0;
    private static final SparseIntArray component3;
    private static int copy = 1;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private final RoundConstraintLayout component2;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.tv_use_telebirr_scan_to_pay_me, 1);
        sparseIntArray.put(R.id.recivelinear, 2);
        sparseIntArray.put(R.id.amountDisplayView, 3);
        sparseIntArray.put(R.id.tvNotes, 4);
        sparseIntArray.put(R.id.emptyView, 5);
        sparseIntArray.put(R.id.iv_qr, 6);
        sparseIntArray.put(R.id.iv_head, 7);
        sparseIntArray.put(R.id.tv_will, 8);
        sparseIntArray.put(R.id.imageView5, 9);
        int i = copy + 13;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 57 / 0;
        }
    }

    public LayoutSfcDownloadQrCodeBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, ShareDataUIState, component3));
    }

    private LayoutSfcDownloadQrCodeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AmountDisplayView) objArr[3], (View) objArr[5], (ImageView) objArr[9], (RoundImageView) objArr[7], (RoundImageView) objArr[6], (RoundLinearLayout) objArr[2], (TextView) objArr[4], (TextView) objArr[1], (TextView) objArr[8]);
        this.copydefault = -1L;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) objArr[0];
        this.component2 = roundConstraintLayout;
        roundConstraintLayout.setTag(null);
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
        int i4 = equals + 105;
        int i5 = i4 % 128;
        getRequestBeneficiariesState = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 99;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 25;
        getRequestBeneficiariesState = i4 % 128;
        boolean z = i4 % 2 != 0;
        int i5 = i3 + 125;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
