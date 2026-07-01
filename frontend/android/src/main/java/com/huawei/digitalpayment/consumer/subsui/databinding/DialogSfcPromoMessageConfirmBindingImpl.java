package com.huawei.digitalpayment.consumer.subsui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.subsui.R;

public class DialogSfcPromoMessageConfirmBindingImpl extends DialogSfcPromoMessageConfirmBinding {
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static final SparseIntArray copydefault;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private long component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.iv_back, 1);
        sparseIntArray.put(R.id.tv_top_title, 2);
        sparseIntArray.put(R.id.llContent, 3);
        sparseIntArray.put(R.id.tv_dialog_message, 4);
        sparseIntArray.put(R.id.llButtons, 5);
        sparseIntArray.put(R.id.btn_cancel, 6);
        sparseIntArray.put(R.id.btn_confirm, 7);
        int i = ShareDataUIState + 31;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public DialogSfcPromoMessageConfirmBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, component3, copydefault));
    }

    private DialogSfcPromoMessageConfirmBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundTextView) objArr[6], (RoundTextView) objArr[7], (CardView) objArr[0], (RoundImageView) objArr[1], (ConstraintLayout) objArr[5], (ConstraintLayout) objArr[3], (TextView) objArr[4], (TextView) objArr[2]);
        this.component2 = -1L;
        this.cardDialogMessage.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component2 = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component2 != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component2 = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = getAsAtTimestamp + 5;
        int i5 = i4 % 128;
        getRequestBeneficiariesState = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 111;
        getAsAtTimestamp = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 33;
        getAsAtTimestamp = i3 % 128;
        return i3 % 2 != 0;
    }
}
