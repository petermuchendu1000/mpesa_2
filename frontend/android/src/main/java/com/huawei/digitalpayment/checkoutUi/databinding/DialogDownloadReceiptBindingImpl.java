package com.huawei.digitalpayment.checkoutUi.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.checkoutUi.R;

public class DialogDownloadReceiptBindingImpl extends DialogDownloadReceiptBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component1;
    private static int component3 = 0;
    private static int component4 = 1;
    private static int copy = 1;
    private static int getAsAtTimestamp;
    private final RoundConstraintLayout component2;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.iv_top_bg, 1);
        sparseIntArray.put(R.id.ivBack, 2);
        sparseIntArray.put(R.id.tv_title, 3);
        sparseIntArray.put(R.id.ivResult, 4);
        sparseIntArray.put(R.id.tvStatus, 5);
        sparseIntArray.put(R.id.llButtons, 6);
        sparseIntArray.put(R.id.btn_cancel, 7);
        sparseIntArray.put(R.id.btn_confirm, 8);
        sparseIntArray.put(R.id.btn_cancel_request, 9);
        int i = component3 + 49;
        component4 = i % 128;
        if (i % 2 == 0) {
            int i2 = 33 / 0;
        }
    }

    public DialogDownloadReceiptBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, ShareDataUIState, component1));
    }

    private DialogDownloadReceiptBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundTextView) objArr[7], (LoadingButton) objArr[9], (LoadingButton) objArr[8], (RoundImageView) objArr[2], (ImageView) objArr[4], (RoundImageView) objArr[1], (ConstraintLayout) objArr[6], (TextView) objArr[5], (TextView) objArr[3]);
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
        int i4 = getAsAtTimestamp + 85;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 123;
        int i4 = i3 % 128;
        copy = i4;
        boolean z = i3 % 2 != 0;
        int i5 = i4 + 47;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }
}
