package com.huawei.digitalpayment.consumer.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.baselib.widget.code.OtpEditText;
import com.huawei.digitalpayment.consumer.login.R;

public class ActivityOtpLoginBindingImpl extends ActivityOtpLoginBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component1;
    private static int component3 = 0;
    private static int component4 = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp = 1;
    private final ConstraintLayout component2;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.tvWelcome, 1);
        sparseIntArray.put(R.id.tvTitle, 2);
        sparseIntArray.put(R.id.tvDescription, 3);
        sparseIntArray.put(R.id.etCode, 4);
        sparseIntArray.put(R.id.tvError, 5);
        sparseIntArray.put(R.id.btnGetOtp, 6);
        sparseIntArray.put(R.id.btnContinue, 7);
        sparseIntArray.put(R.id.llExt, 8);
        sparseIntArray.put(R.id.btnLoginWay, 9);
        sparseIntArray.put(R.id.line, 10);
        sparseIntArray.put(R.id.btnHelp, 11);
        int i = component3 + 77;
        equals = i % 128;
        int i2 = i % 2;
    }

    public ActivityOtpLoginBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 12, ShareDataUIState, component1));
    }

    private ActivityOtpLoginBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[7], (TextView) objArr[6], (TextView) objArr[11], (TextView) objArr[9], (OtpEditText) objArr[4], (View) objArr[10], (LinearLayout) objArr[8], (TextView) objArr[3], (TextView) objArr[5], (TextView) objArr[2], (TextView) objArr[1]);
        this.copydefault = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component2 = constraintLayout;
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
        int i4 = getAsAtTimestamp;
        int i5 = i4 + 29;
        component4 = i5 % 128;
        boolean z = i5 % 2 != 0;
        int i6 = i4 + 95;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4;
        int i4 = i3 + 77;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 83;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
