package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ActivityExportStatementBindingImpl extends ActivityExportStatementBinding {
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
        sparseIntArray.put(R.id.ivBack, 1);
        sparseIntArray.put(R.id.tv_toolbar_title, 2);
        sparseIntArray.put(R.id.iv_avatar, 3);
        sparseIntArray.put(R.id.cardAbbr, 4);
        sparseIntArray.put(R.id.tvAbbr, 5);
        sparseIntArray.put(R.id.tv_name, 6);
        sparseIntArray.put(R.id.ll_phone_number, 7);
        sparseIntArray.put(R.id.tv_phone_number_value, 8);
        sparseIntArray.put(R.id.tv_email_notice, 9);
        sparseIntArray.put(R.id.select_start_date, 10);
        sparseIntArray.put(R.id.select_end_date, 11);
        sparseIntArray.put(R.id.rg_export_method, 12);
        sparseIntArray.put(R.id.rb_view_in_app, 13);
        sparseIntArray.put(R.id.rb_send_via_email, 14);
        sparseIntArray.put(R.id.btn_confirm, 15);
        int i = getRequestBeneficiariesState + 41;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ActivityExportStatementBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 16, component2, component3));
    }

    private ActivityExportStatementBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[15], (CardView) objArr[4], (RoundImageView) objArr[3], (RoundImageView) objArr[1], (LinearLayout) objArr[7], (RadioButton) objArr[14], (RadioButton) objArr[13], (RadioGroup) objArr[12], (CommonInputView) objArr[11], (CommonInputView) objArr[10], (TextView) objArr[5], (TextView) objArr[9], (TextView) objArr[6], (TextView) objArr[8], (TextView) objArr[2]);
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
        int i4 = equals + 109;
        int i5 = i4 % 128;
        getAsAtTimestamp = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 85;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 93;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 21;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
