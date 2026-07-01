package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.base.ui.widget.SafeInputKeyboard;
import com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ActivitySfcVerifyStartKeyBindingImpl extends ActivitySfcVerifyStartKeyBinding {
    private static int ShareDataUIState = 0;
    private static final SparseIntArray component3;
    private static int copy = 1;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private long component1;
    private final ConstraintLayout component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.view_bg, 1);
        sparseIntArray.put(R.id.iv_back, 2);
        sparseIntArray.put(R.id.tv_title, 3);
        sparseIntArray.put(R.id.ll_user_info, 4);
        sparseIntArray.put(R.id.iv_avatar, 5);
        sparseIntArray.put(R.id.cardAbbr, 6);
        sparseIntArray.put(R.id.tvAbbr, 7);
        sparseIntArray.put(R.id.tv_name, 8);
        sparseIntArray.put(R.id.tv_sub_title, 9);
        sparseIntArray.put(R.id.etCode, 10);
        sparseIntArray.put(R.id.virtualKeyboardView, 11);
        int i = getAsAtTimestamp + 105;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public ActivitySfcVerifyStartKeyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 12, copydefault, component3));
    }

    private ActivitySfcVerifyStartKeyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[6], (CodeEditText) objArr[10], (RoundImageView) objArr[5], (RoundImageView) objArr[2], (LinearLayout) objArr[4], (TextView) objArr[7], (TextView) objArr[8], (TextView) objArr[9], (TextView) objArr[3], (View) objArr[1], (SafeInputKeyboard) objArr[11]);
        this.component1 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component2 = constraintLayout;
        constraintLayout.setTag(null);
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
        int i4 = getRequestBeneficiariesState;
        int i5 = i4 + 21;
        copy = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 43;
        copy = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 36 / 0;
        }
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 93;
        int i4 = i3 % 128;
        copy = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 63;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
