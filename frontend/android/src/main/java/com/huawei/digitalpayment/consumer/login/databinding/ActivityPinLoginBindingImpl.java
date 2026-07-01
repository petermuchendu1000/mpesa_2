package com.huawei.digitalpayment.consumer.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText;
import com.huawei.digitalpayment.consumer.baselib.widget.code.SafeInputKeyboard;
import com.huawei.digitalpayment.consumer.login.R;

public class ActivityPinLoginBindingImpl extends ActivityPinLoginBinding {
    private static int ShareDataUIState = 0;
    private static final SparseIntArray component1;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component4 = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState = 1;
    private long component3;
    private final LinearLayout copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.tvWelcome, 1);
        sparseIntArray.put(R.id.tvTitle, 2);
        sparseIntArray.put(R.id.tvDescription, 3);
        sparseIntArray.put(R.id.etCode, 4);
        sparseIntArray.put(R.id.tvError, 5);
        sparseIntArray.put(R.id.tvForgot, 6);
        sparseIntArray.put(R.id.btnContinue, 7);
        sparseIntArray.put(R.id.llExt, 8);
        sparseIntArray.put(R.id.btnLoginWay, 9);
        sparseIntArray.put(R.id.btnHelp, 10);
        sparseIntArray.put(R.id.pin_input_keyboard, 11);
        int i = getRequestBeneficiariesState + 103;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public ActivityPinLoginBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 12, component2, component1));
    }

    private ActivityPinLoginBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[7], (TextView) objArr[10], (TextView) objArr[9], (CodeEditText) objArr[4], (LinearLayout) objArr[8], (SafeInputKeyboard) objArr[11], (TextView) objArr[3], (TextView) objArr[5], (TextView) objArr[6], (TextView) objArr[2], (TextView) objArr[1]);
        this.component3 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.copydefault = linearLayout;
        linearLayout.setTag(null);
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
        int i4 = getAsAtTimestamp;
        int i5 = i4 + 23;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 99;
        component4 = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 73;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 19;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 40 / 0;
        }
        return true;
    }
}
