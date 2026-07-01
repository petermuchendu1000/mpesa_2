package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class FragmentUserinfoTemplate1BindingImpl extends FragmentUserinfoTemplate1Binding {
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component2 = 1;
    private static final SparseIntArray component3;
    private static int component4 = 0;
    private static int copy = 1;
    private static int copydefault;
    private long ShareDataUIState;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.background, 1);
        sparseIntArray.put(R.id.clHeader, 2);
        sparseIntArray.put(R.id.topView, 3);
        sparseIntArray.put(R.id.iv_profile, 4);
        sparseIntArray.put(R.id.tv_name, 5);
        sparseIntArray.put(R.id.tv_phone, 6);
        sparseIntArray.put(R.id.iv_right, 7);
        sparseIntArray.put(R.id.view_profile, 8);
        int i = component2 + 27;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FragmentUserinfoTemplate1BindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 9, component1, component3));
    }

    private FragmentUserinfoTemplate1BindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundImageView) objArr[1], (ConstraintLayout) objArr[2], (RoundImageView) objArr[4], (RoundImageView) objArr[7], (RoundConstraintLayout) objArr[0], (View) objArr[3], (TextView) objArr[5], (TextView) objArr[6], (View) objArr[8]);
        this.ShareDataUIState = -1L;
        this.root.setTag(null);
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
        int i4 = copy + 5;
        component4 = i4 % 128;
        return i4 % 2 != 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 97;
        copy = i3 % 128;
        return i3 % 2 != 0;
    }
}
