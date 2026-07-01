package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.recyclerview.HFRecyclerView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.homeui.R;

public class FragmentMyBindingImpl extends FragmentMyBinding {
    private static final SparseIntArray component1;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component4 = 1;
    private static int copy = 1;
    private static int copydefault;
    private static int equals;
    private long ShareDataUIState;
    private final ConstraintLayout component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.clHeader, 1);
        sparseIntArray.put(R.id.topView, 2);
        sparseIntArray.put(R.id.ll_profile, 3);
        sparseIntArray.put(R.id.iv_profile, 4);
        sparseIntArray.put(R.id.tv_name, 5);
        sparseIntArray.put(R.id.tv_phone, 6);
        sparseIntArray.put(R.id.iv_arrow_right, 7);
        sparseIntArray.put(R.id.view_profile, 8);
        sparseIntArray.put(R.id.myFunctionGroupRecycler, 9);
        int i = component4 + 107;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public FragmentMyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, component2, component1));
    }

    private FragmentMyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[1], (ImageView) objArr[7], (RoundImageView) objArr[4], (RoundLinearLayout) objArr[3], (HFRecyclerView) objArr[9], (View) objArr[2], (TextView) objArr[5], (TextView) objArr[6], (View) objArr[8]);
        this.ShareDataUIState = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component3 = constraintLayout;
        constraintLayout.setTag(null);
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
        int i4 = equals;
        int i5 = i4 + 99;
        copy = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 125;
        copy = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 30 / 0;
        }
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 9;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 125;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
