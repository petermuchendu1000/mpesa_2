package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class ItemHomePinFunctionBindingImpl extends ItemHomePinFunctionBinding {
    private static final SparseIntArray ShareDataUIState;
    private static int component2 = 0;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int copy = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp = 1;
    private long component1;
    private final RoundConstraintLayout copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.ivFunctionIcon, 1);
        sparseIntArray.put(R.id.tvRedDot, 2);
        sparseIntArray.put(R.id.viewNotification, 3);
        sparseIntArray.put(R.id.tvFunctionName, 4);
        int i = getAsAtTimestamp + 29;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public ItemHomePinFunctionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, component3, ShareDataUIState));
    }

    private ItemHomePinFunctionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (TextView) objArr[4], (RoundTextView) objArr[2], (View) objArr[3]);
        this.component1 = -1L;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) objArr[0];
        this.copydefault = roundConstraintLayout;
        roundConstraintLayout.setTag(null);
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
        int i4 = copy + 79;
        equals = i4 % 128;
        return i4 % 2 == 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 43;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 119;
        equals = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
