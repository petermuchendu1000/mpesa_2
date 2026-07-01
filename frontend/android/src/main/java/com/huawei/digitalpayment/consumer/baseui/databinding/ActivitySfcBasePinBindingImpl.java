package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView;
import com.huawei.digitalpayment.consumer.base.ui.widget.SafeInputKeyboard;
import com.huawei.digitalpayment.consumer.baseui.R;

public class ActivitySfcBasePinBindingImpl extends ActivitySfcBasePinBinding {
    private static int ShareDataUIState = 0;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static final SparseIntArray component3;
    private static int component4 = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp = 1;
    private final ConstraintLayout component1;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.iv_back, 1);
        sparseIntArray.put(R.id.tv_title, 2);
        sparseIntArray.put(R.id.ll_user_info, 3);
        sparseIntArray.put(R.id.iv_avatar, 4);
        sparseIntArray.put(R.id.cardAbbr, 5);
        sparseIntArray.put(R.id.tvAbbr, 6);
        sparseIntArray.put(R.id.tv_name, 7);
        sparseIntArray.put(R.id.ll_container, 8);
        sparseIntArray.put(R.id.tv_amount_display, 9);
        sparseIntArray.put(R.id.tv_phone_number, 10);
        sparseIntArray.put(R.id.tv_sub_title, 11);
        sparseIntArray.put(R.id.tvPinError, 12);
        sparseIntArray.put(R.id.pinPadView, 13);
        sparseIntArray.put(R.id.virtualKeyboardView, 14);
        int i = ShareDataUIState + 45;
        equals = i % 128;
        int i2 = i % 2;
    }

    public ActivitySfcBasePinBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 15, component2, component3));
    }

    private ActivitySfcBasePinBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[5], (RoundImageView) objArr[4], (RoundImageView) objArr[1], (LinearLayout) objArr[8], (LinearLayout) objArr[3], (PinPadView) objArr[13], (TextView) objArr[6], (TextView) objArr[9], (TextView) objArr[7], (TextView) objArr[10], (TextView) objArr[12], (TextView) objArr[11], (TextView) objArr[2], (SafeInputKeyboard) objArr[14]);
        this.copydefault = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component1 = constraintLayout;
        constraintLayout.setTag(null);
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
        int i4 = getAsAtTimestamp + 99;
        component4 = i4 % 128;
        return i4 % 2 != 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 117;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
