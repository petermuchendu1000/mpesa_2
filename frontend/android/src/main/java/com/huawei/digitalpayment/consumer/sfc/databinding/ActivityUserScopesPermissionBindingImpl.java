package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ActivityUserScopesPermissionBindingImpl extends ActivityUserScopesPermissionBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component1;
    private static int component2 = 0;
    private static int copy = 1;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private long component3;
    private final ConstraintLayout copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.view_bg, 1);
        sparseIntArray.put(R.id.iv_back, 2);
        sparseIntArray.put(R.id.tv_title, 3);
        sparseIntArray.put(R.id.csHeader, 4);
        sparseIntArray.put(R.id.imgIcon, 5);
        sparseIntArray.put(R.id.tvAppName, 6);
        sparseIntArray.put(R.id.tvDesc, 7);
        sparseIntArray.put(R.id.rvScopes, 8);
        sparseIntArray.put(R.id.userScopesButtonsContainer, 9);
        sparseIntArray.put(R.id.btnReject, 10);
        sparseIntArray.put(R.id.btnAccept, 11);
        int i = equals + 85;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public ActivityUserScopesPermissionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 12, ShareDataUIState, component1));
    }

    private ActivityUserScopesPermissionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Button) objArr[11], (Button) objArr[10], (ConstraintLayout) objArr[4], (ImageView) objArr[5], (RoundImageView) objArr[2], (RecyclerView) objArr[8], (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[3], (LinearLayout) objArr[9], (View) objArr[1]);
        this.component3 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.copydefault = constraintLayout;
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
        int i4 = copy;
        int i5 = i4 + 87;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 109;
        getAsAtTimestamp = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 101;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 19;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
