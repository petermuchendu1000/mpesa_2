package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class ActivitySfcSearchBindingImpl extends ActivitySfcSearchBinding {
    private static final SparseIntArray ShareDataUIState;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component4 = 1;
    private static int copy = 1;
    private static int copydefault;
    private static int equals;
    private final ConstraintLayout component1;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.input_search, 1);
        sparseIntArray.put(R.id.rv_category, 2);
        sparseIntArray.put(R.id.lifeRecycler, 3);
        sparseIntArray.put(R.id.cl_empty_view, 4);
        sparseIntArray.put(R.id.iv_empty_view, 5);
        sparseIntArray.put(R.id.tv_no_result_title, 6);
        sparseIntArray.put(R.id.tv_no_result_tips, 7);
        int i = component4 + 69;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public ActivitySfcSearchBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, component2, ShareDataUIState));
    }

    private ActivitySfcSearchBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[4], (CommonInputView) objArr[1], (ImageView) objArr[5], (RecyclerView) objArr[3], (RecyclerView) objArr[2], (TextView) objArr[7], (TextView) objArr[6]);
        this.component3 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component1 = constraintLayout;
        constraintLayout.setTag(null);
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
        int i4 = equals;
        int i5 = i4 + 125;
        copy = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 93;
        copy = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 89;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 85;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
