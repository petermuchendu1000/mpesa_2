package com.huawei.digitalpayment.consumer.basic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.item.CommonItemView;
import com.huawei.digitalpayment.consumer.basic.R;

public class ActivityHelpFeedbackBindingImpl extends ActivityHelpFeedbackBinding {
    private static int component1 = 0;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int component4 = 1;
    private static final SparseIntArray copydefault;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private long ShareDataUIState;
    private final LinearLayout component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.tv_help, 1);
        sparseIntArray.put(R.id.tv_feedback, 2);
        sparseIntArray.put(R.id.tv_faq, 3);
        int i = component1 + 9;
        component4 = i % 128;
        int i2 = i % 2;
    }

    public ActivityHelpFeedbackBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, component3, copydefault));
    }

    private ActivityHelpFeedbackBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CommonItemView) objArr[3], (CommonItemView) objArr[2], (CommonItemView) objArr[1]);
        this.ShareDataUIState = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component2 = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.ShareDataUIState = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ShareDataUIState != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.ShareDataUIState = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = equals + 27;
        int i5 = i4 % 128;
        getRequestBeneficiariesState = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 1;
        equals = i7 % 128;
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
        int i3 = getRequestBeneficiariesState + 3;
        equals = i3 % 128;
        return i3 % 2 != 0;
    }
}
