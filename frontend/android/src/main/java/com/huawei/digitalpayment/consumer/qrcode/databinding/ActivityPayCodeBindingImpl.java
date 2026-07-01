package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.CommonCheckBox;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.qrcode.R;

public class ActivityPayCodeBindingImpl extends ActivityPayCodeBinding {
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component4 = 1;
    private static int copy = 0;
    private static final SparseIntArray copydefault;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private final LinearLayout ShareDataUIState;
    private final FrameLayout component1;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.cv_scan_pay_view, 2);
        sparseIntArray.put(R.id.ll_pay_guide, 3);
        sparseIntArray.put(R.id.btn_ok, 4);
        sparseIntArray.put(R.id.iv_check, 5);
        sparseIntArray.put(R.id.llCoollect, 6);
        int i = getAsAtTimestamp + 107;
        component4 = i % 128;
        int i2 = i % 2;
    }

    public ActivityPayCodeBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, component2, copydefault));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private ActivityPayCodeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        LayoutPayCodeBinding layoutPayCodeBinding;
        LoadingButton loadingButton = (LoadingButton) objArr[4];
        Object obj = objArr[2];
        if (obj != null) {
            int i = copy + 115;
            getRequestBeneficiariesState = i % 128;
            if (i % 2 == 0) {
                LayoutPayCodeBinding.bind((View) obj);
                throw null;
            }
            LayoutPayCodeBinding layoutPayCodeBindingBind = LayoutPayCodeBinding.bind((View) obj);
            int i2 = copy + 87;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            layoutPayCodeBinding = layoutPayCodeBindingBind;
        } else {
            int i5 = 2 % 2;
            layoutPayCodeBinding = null;
        }
        super(dataBindingComponent, view, 0, loadingButton, layoutPayCodeBinding, (CommonCheckBox) objArr[5], (RoundLinearLayout) objArr[6], (LinearLayout) objArr[3]);
        this.component3 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.ShareDataUIState = linearLayout;
        linearLayout.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[1];
        this.component1 = frameLayout;
        frameLayout.setTag(null);
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
        int i4 = copy;
        int i5 = i4 + 69;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 27;
        getRequestBeneficiariesState = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 71;
        copy = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 119;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 65 / 0;
        }
        return true;
    }
}
