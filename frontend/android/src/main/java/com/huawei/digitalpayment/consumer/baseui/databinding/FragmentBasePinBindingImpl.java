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

public class FragmentBasePinBindingImpl extends FragmentBasePinBinding {
    private static int ShareDataUIState = 0;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static final SparseIntArray component3;
    private static int equals = 1;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private long component2;
    private final ConstraintLayout copydefault;

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
        sparseIntArray.put(R.id.tvPinError, 11);
        sparseIntArray.put(R.id.pinPadView, 12);
        sparseIntArray.put(R.id.virtualKeyboardView, 13);
        int i = equals + 33;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public FragmentBasePinBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 14, component1, component3));
    }

    private FragmentBasePinBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[5], (RoundImageView) objArr[4], (RoundImageView) objArr[1], (LinearLayout) objArr[8], (LinearLayout) objArr[3], (PinPadView) objArr[12], (TextView) objArr[6], (TextView) objArr[9], (TextView) objArr[7], (TextView) objArr[10], (TextView) objArr[11], (TextView) objArr[2], (SafeInputKeyboard) objArr[13]);
        this.component2 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.copydefault = constraintLayout;
        constraintLayout.setTag(null);
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
        int i4 = getAsAtTimestamp;
        int i5 = i4 + 49;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 17;
        getRequestBeneficiariesState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 79;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        boolean z = i3 % 2 == 0;
        int i5 = i4 + 43;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
