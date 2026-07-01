package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.base.ui.widget.SafeInputKeyboard;
import com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText;
import com.huawei.digitalpayment.consumer.sfc.R;

public class FragmentEsimOtpValidationBindingImpl extends FragmentEsimOtpValidationBinding {
    private static final SparseIntArray ShareDataUIState;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component4 = 1;
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private final ConstraintLayout component1;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.iv_back, 1);
        sparseIntArray.put(R.id.iv_message, 2);
        sparseIntArray.put(R.id.tv_tips, 3);
        sparseIntArray.put(R.id.etCode, 4);
        sparseIntArray.put(R.id.tv_error, 5);
        sparseIntArray.put(R.id.rl_tips_container, 6);
        sparseIntArray.put(R.id.tv_count_down, 7);
        sparseIntArray.put(R.id.tv_not_receive_code_tips, 8);
        sparseIntArray.put(R.id.tv_resend, 9);
        sparseIntArray.put(R.id.loadingView, 10);
        sparseIntArray.put(R.id.btnConfirm, 11);
        sparseIntArray.put(R.id.virtualKeyboardView, 12);
        int i = copydefault + 27;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    public FragmentEsimOtpValidationBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 13, component2, ShareDataUIState));
    }

    private FragmentEsimOtpValidationBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[11], (CodeEditText) objArr[4], (RoundImageView) objArr[1], (ImageView) objArr[2], (ProgressBar) objArr[10], (ConstraintLayout) objArr[6], (TextView) objArr[7], (TextView) objArr[5], (TextView) objArr[8], (TextView) objArr[9], (TextView) objArr[3], (SafeInputKeyboard) objArr[12]);
        this.component3 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component1 = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component3 = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component3 != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component3 = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = component4;
        int i5 = i4 + 13;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 107;
        getAsAtTimestamp = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 123;
        getAsAtTimestamp = i3 % 128;
        return i3 % 2 == 0;
    }
}
