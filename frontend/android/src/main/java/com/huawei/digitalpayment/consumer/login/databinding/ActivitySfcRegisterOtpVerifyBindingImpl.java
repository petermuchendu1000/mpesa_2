package com.huawei.digitalpayment.consumer.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.base.ui.widget.SafeInputKeyboard;
import com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText;
import com.huawei.digitalpayment.consumer.login.R;

public class ActivitySfcRegisterOtpVerifyBindingImpl extends ActivitySfcRegisterOtpVerifyBinding {
    private static final SparseIntArray ShareDataUIState;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int copy = 1;
    private static int copydefault = 0;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private final ConstraintLayout component1;
    private long component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.llContent, 1);
        sparseIntArray.put(R.id.iv_back, 2);
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
        int i = getAsAtTimestamp + 103;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public ActivitySfcRegisterOtpVerifyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 13, component3, ShareDataUIState));
    }

    private ActivitySfcRegisterOtpVerifyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[11], (CodeEditText) objArr[6], (ImageView) objArr[2], (ImageView) objArr[3], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[7], (TextView) objArr[8], (TextView) objArr[9], (TextView) objArr[10], (TextView) objArr[5], (TextView) objArr[4], (SafeInputKeyboard) objArr[12]);
        this.component2 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component1 = constraintLayout;
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
        int i4 = copy;
        int i5 = i4 + 9;
        equals = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 81;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 83;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 107;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
