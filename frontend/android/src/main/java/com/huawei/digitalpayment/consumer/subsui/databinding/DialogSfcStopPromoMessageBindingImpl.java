package com.huawei.digitalpayment.consumer.subsui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.subsui.R;

public class DialogSfcStopPromoMessageBindingImpl extends DialogSfcStopPromoMessageBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static int component1 = 1;
    private static final SparseIntArray component3;
    private static int copy = 1;
    private static int copydefault;
    private static int equals;
    private long component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.iv_back, 1);
        sparseIntArray.put(R.id.tv_top_title, 2);
        sparseIntArray.put(R.id.llContent, 3);
        sparseIntArray.put(R.id.etInput, 4);
        sparseIntArray.put(R.id.llButtons, 5);
        sparseIntArray.put(R.id.btn_confirm, 6);
        int i = component1 + 5;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public DialogSfcStopPromoMessageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, ShareDataUIState, component3));
    }

    private DialogSfcStopPromoMessageBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[6], (CardView) objArr[0], (CommonInputView) objArr[4], (RoundImageView) objArr[1], (ConstraintLayout) objArr[5], (ConstraintLayout) objArr[3], (TextView) objArr[2]);
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
        int i4 = copy + 121;
        int i5 = i4 % 128;
        equals = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 103;
        copy = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 125;
        int i4 = i3 % 128;
        copy = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 63;
        equals = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
