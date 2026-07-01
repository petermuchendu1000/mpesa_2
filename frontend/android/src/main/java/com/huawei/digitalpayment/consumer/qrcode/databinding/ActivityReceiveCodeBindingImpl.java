package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.text.AmountDisplayView;
import com.huawei.digitalpayment.consumer.qrcode.BR;
import com.huawei.digitalpayment.consumer.qrcode.R;

public class ActivityReceiveCodeBindingImpl extends ActivityReceiveCodeBinding {
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component4 = 1;
    private static int copy = 0;
    private static final SparseIntArray copydefault;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private long ShareDataUIState;
    private final RoundImageView component1;
    private final LinearLayout component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.recivelinear, 3);
        sparseIntArray.put(R.id.tv_name, 4);
        sparseIntArray.put(R.id.tv_title_label, 5);
        sparseIntArray.put(R.id.amountDisplayView, 6);
        sparseIntArray.put(R.id.tv_notes, 7);
        sparseIntArray.put(R.id.iv_qr, 8);
        sparseIntArray.put(R.id.tv_set_amount, 9);
        sparseIntArray.put(R.id.tv_save_image, 10);
        sparseIntArray.put(R.id.llRecord, 11);
        int i = copy + 73;
        component4 = i % 128;
        if (i % 2 == 0) {
            int i2 = 72 / 0;
        }
    }

    public ActivityReceiveCodeBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 12, component2, copydefault));
    }

    private ActivityReceiveCodeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AmountDisplayView) objArr[6], (RoundImageView) objArr[2], (RoundImageView) objArr[8], (LinearLayout) objArr[11], (RoundLinearLayout) objArr[3], (TextView) objArr[4], (TextView) objArr[7], (TextView) objArr[10], (TextView) objArr[9], (TextView) objArr[5]);
        this.ShareDataUIState = -1L;
        this.ivHead.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component3 = linearLayout;
        linearLayout.setTag(null);
        RoundImageView roundImageView = (RoundImageView) objArr[1];
        this.component1 = roundImageView;
        roundImageView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.ShareDataUIState = 2L;
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
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 101;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            if (BR.isLoading != i) {
                return false;
            }
            setIsLoading((Boolean) obj);
            int i4 = getRequestBeneficiariesState + 93;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = BR.isLoading;
        throw null;
    }

    @Override
    public void setIsLoading(Boolean bool) {
        this.mIsLoading = bool;
        synchronized (this) {
            this.ShareDataUIState |= 1;
        }
        notifyPropertyChanged(BR.isLoading);
        super.requestRebind();
    }

    @Override
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.ShareDataUIState;
            this.ShareDataUIState = 0L;
        }
        Boolean bool = this.mIsLoading;
        long j2 = j & 3;
        int i = 0;
        if (j2 != 0) {
            boolean zSafeUnbox = ViewDataBinding.safeUnbox(bool);
            if (j2 != 0) {
                j |= zSafeUnbox ? 8L : 4L;
            }
            if (zSafeUnbox) {
                i = 8;
            }
        }
        if ((j & 3) != 0) {
            this.ivHead.setVisibility(i);
            this.component1.setVisibility(i);
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = equals + 81;
        getRequestBeneficiariesState = i4 % 128;
        return i4 % 2 != 0;
    }
}
