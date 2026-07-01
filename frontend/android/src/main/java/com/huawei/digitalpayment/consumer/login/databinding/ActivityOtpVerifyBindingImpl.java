package com.huawei.digitalpayment.consumer.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.base.ui.widget.SafeOtpInputKeyboard;
import com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText;
import com.huawei.digitalpayment.consumer.login.R;

public class ActivityOtpVerifyBindingImpl extends ActivityOtpVerifyBinding {
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component2 = 0;
    private static final SparseIntArray component3;
    private static int component4 = 1;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private final ConstraintLayout ShareDataUIState;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.iv_back, 1);
        sparseIntArray.put(R.id.csContent, 2);
        sparseIntArray.put(R.id.iv_message, 3);
        sparseIntArray.put(R.id.tv_title, 4);
        sparseIntArray.put(R.id.tv_tips, 5);
        sparseIntArray.put(R.id.etCode, 6);
        sparseIntArray.put(R.id.rl_tips_container, 7);
        sparseIntArray.put(R.id.tv_count_down, 8);
        sparseIntArray.put(R.id.tv_not_receive_code_tips, 9);
        sparseIntArray.put(R.id.tv_resend, 10);
        sparseIntArray.put(R.id.btn_confirm, 11);
        sparseIntArray.put(R.id.virtualKeyboardView, 12);
        int i = component2 + 55;
        equals = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public ActivityOtpVerifyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 13, component1, component3));
    }

    private ActivityOtpVerifyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[11], (ConstraintLayout) objArr[2], (CodeEditText) objArr[6], (RoundImageView) objArr[1], (ImageView) objArr[3], (ConstraintLayout) objArr[7], (TextView) objArr[8], (TextView) objArr[9], (TextView) objArr[10], (TextView) objArr[5], (TextView) objArr[4], (SafeOtpInputKeyboard) objArr[12]);
        this.copydefault = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ShareDataUIState = constraintLayout;
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
        int i4 = component4;
        int i5 = i4 + 71;
        getRequestBeneficiariesState = i5 % 128;
        boolean z = i5 % 2 != 0;
        int i6 = i4 + 61;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 88 / 0;
        }
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 77;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 93;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
