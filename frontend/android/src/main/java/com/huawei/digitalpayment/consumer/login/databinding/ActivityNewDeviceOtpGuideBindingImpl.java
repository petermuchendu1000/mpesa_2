package com.huawei.digitalpayment.consumer.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.login.R;

public class ActivityNewDeviceOtpGuideBindingImpl extends ActivityNewDeviceOtpGuideBinding {
    private static final SparseIntArray ShareDataUIState;
    private static int component2 = 0;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int copy = 1;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private final ConstraintLayout component1;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.iv_new_device_otp_guide, 1);
        sparseIntArray.put(R.id.tv_new_device_otp_guide, 2);
        sparseIntArray.put(R.id.tv_new_device_otp_guide_desc, 3);
        sparseIntArray.put(R.id.btn_confirm, 4);
        int i = component2 + 55;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    public ActivityNewDeviceOtpGuideBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, component3, ShareDataUIState));
    }

    private ActivityNewDeviceOtpGuideBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[4], (RoundImageView) objArr[1], (TextView) objArr[2], (TextView) objArr[3]);
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
        int i4 = copy + 99;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 107;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 95;
        equals = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 15 / 0;
        }
        return true;
    }
}
