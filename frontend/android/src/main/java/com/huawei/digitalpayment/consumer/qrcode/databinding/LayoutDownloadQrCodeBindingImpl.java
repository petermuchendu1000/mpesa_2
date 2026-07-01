package com.huawei.digitalpayment.consumer.qrcode.databinding;

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
import com.huawei.digitalpayment.consumer.qrcode.R;

public class LayoutDownloadQrCodeBindingImpl extends LayoutDownloadQrCodeBinding {
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component3 = 0;
    private static int component4 = 1;
    private static int copy = 0;
    private static final SparseIntArray copydefault;
    private static int equals = 1;
    private long ShareDataUIState;
    private final RoundConstraintLayout component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.tv_use_telebirr_scan_to_pay_me, 1);
        sparseIntArray.put(R.id.recivelinear, 2);
        sparseIntArray.put(R.id.amountDisplayView, 3);
        sparseIntArray.put(R.id.tvNotes, 4);
        sparseIntArray.put(R.id.emptyView, 5);
        sparseIntArray.put(R.id.iv_qr, 6);
        sparseIntArray.put(R.id.iv_head, 7);
        sparseIntArray.put(R.id.tv_will, 8);
        sparseIntArray.put(R.id.imageView5, 9);
        int i = component3 + 119;
        component4 = i % 128;
        int i2 = i % 2;
    }

    public LayoutDownloadQrCodeBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, component2, copydefault));
    }

    private LayoutDownloadQrCodeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AmountDisplayView) objArr[3], (View) objArr[5], (ImageView) objArr[9], (RoundImageView) objArr[7], (RoundImageView) objArr[6], (RoundLinearLayout) objArr[2], (TextView) objArr[4], (TextView) objArr[1], (TextView) objArr[8]);
        this.ShareDataUIState = -1L;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) objArr[0];
        this.component1 = roundConstraintLayout;
        roundConstraintLayout.setTag(null);
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
        int i4 = equals;
        int i5 = i4 + 65;
        copy = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 35;
        copy = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 37;
        equals = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
