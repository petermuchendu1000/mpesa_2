package com.huawei.digitalpayment.consumer.basic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.basic.R;

public class ActivityAboutBindingImpl extends ActivityAboutBinding {
    private static final SparseIntArray ShareDataUIState;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component4 = 1;
    private static int copy = 0;
    private static int copydefault = 0;
    private static int equals = 1;
    private long component1;
    private final ConstraintLayout component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.iv_logo, 1);
        sparseIntArray.put(R.id.tv_desc, 2);
        sparseIntArray.put(R.id.tv_version, 3);
        sparseIntArray.put(R.id.btn_check_update, 4);
        sparseIntArray.put(R.id.btn_team_of_service, 5);
        sparseIntArray.put(R.id.tv_version_desc, 6);
        sparseIntArray.put(R.id.tv_reserved_version, 7);
        int i = component4 + 125;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ActivityAboutBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, component2, ShareDataUIState));
    }

    private ActivityAboutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[4], (LoadingButton) objArr[5], (ImageView) objArr[1], (TextView) objArr[2], (TextView) objArr[7], (TextView) objArr[3], (TextView) objArr[6]);
        this.component1 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component3 = constraintLayout;
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
        int i4 = copy + 105;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 45;
        copy = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 99;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 93 / 0;
        }
        return true;
    }
}
