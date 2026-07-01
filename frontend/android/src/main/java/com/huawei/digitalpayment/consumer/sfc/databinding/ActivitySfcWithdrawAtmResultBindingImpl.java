package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.widget.CircularProgressView;

public class ActivitySfcWithdrawAtmResultBindingImpl extends ActivitySfcWithdrawAtmResultBinding {
    private static int ShareDataUIState = 0;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static final SparseIntArray component3;
    private static int equals = 1;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private long component1;
    private final ConstraintLayout copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.iv_delete, 1);
        sparseIntArray.put(R.id.rl_container, 2);
        sparseIntArray.put(R.id.rl_success_container, 3);
        sparseIntArray.put(R.id.tv_title, 4);
        sparseIntArray.put(R.id.rl_receive_info, 5);
        sparseIntArray.put(R.id.tv_send_to, 6);
        sparseIntArray.put(R.id.iv_send_avatar, 7);
        sparseIntArray.put(R.id.ll_send_container, 8);
        sparseIntArray.put(R.id.tv_send_name, 9);
        sparseIntArray.put(R.id.tv_phone_number, 10);
        sparseIntArray.put(R.id.rl_container_fail, 11);
        sparseIntArray.put(R.id.tv_fail_title, 12);
        sparseIntArray.put(R.id.tv_fail_tips, 13);
        sparseIntArray.put(R.id.rl_tips, 14);
        sparseIntArray.put(R.id.rl_tips_container, 15);
        sparseIntArray.put(R.id.tv_tips, 16);
        sparseIntArray.put(R.id.tv_code, 17);
        sparseIntArray.put(R.id.iv_guideline, 18);
        sparseIntArray.put(R.id.progress_bar, 19);
        sparseIntArray.put(R.id.iv_avatar, 20);
        sparseIntArray.put(R.id.btn_confirm, 21);
        int i = ShareDataUIState + 39;
        equals = i % 128;
        int i2 = i % 2;
    }

    public ActivitySfcWithdrawAtmResultBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 22, component2, component3));
    }

    private ActivitySfcWithdrawAtmResultBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[21], (RoundImageView) objArr[20], (RoundImageView) objArr[1], (View) objArr[18], (RoundImageView) objArr[7], (LinearLayout) objArr[8], (CircularProgressView) objArr[19], (CardView) objArr[2], (RoundConstraintLayout) objArr[11], (RoundConstraintLayout) objArr[5], (RoundConstraintLayout) objArr[3], (CardView) objArr[14], (RoundConstraintLayout) objArr[15], (TextView) objArr[17], (TextView) objArr[13], (TextView) objArr[12], (TextView) objArr[10], (TextView) objArr[9], (TextView) objArr[6], (TextView) objArr[16], (TextView) objArr[4]);
        this.component1 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.copydefault = constraintLayout;
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
        int i4 = getRequestBeneficiariesState + 15;
        getAsAtTimestamp = i4 % 128;
        return i4 % 2 != 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 59;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 5;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
