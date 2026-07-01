package com.huawei.digitalpayment.consumer.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.login.R;

public class ActivityAnswerOtherQuestionBindingImpl extends ActivityAnswerOtherQuestionBinding {
    private static int ShareDataUIState = 0;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int component4 = 1;
    private static int copy = 1;
    private static final SparseIntArray copydefault;
    private static int getRequestBeneficiariesState;
    private final LinearLayout component1;
    private long component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.ll_content, 1);
        sparseIntArray.put(R.id.btn_continue, 2);
        int i = component4 + 57;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 29 / 0;
        }
    }

    public ActivityAnswerOtherQuestionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, component3, copydefault));
    }

    private ActivityAnswerOtherQuestionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[2], (LinearLayout) objArr[1]);
        this.component2 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component1 = linearLayout;
        linearLayout.setTag(null);
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
        int i4 = copy + 67;
        getRequestBeneficiariesState = i4 % 128;
        return i4 % 2 != 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 11;
        int i4 = i3 % 128;
        copy = i4;
        boolean z = i3 % 2 != 0;
        int i5 = i4 + 123;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
