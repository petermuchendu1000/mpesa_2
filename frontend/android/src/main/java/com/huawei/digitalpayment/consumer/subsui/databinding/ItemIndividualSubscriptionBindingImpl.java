package com.huawei.digitalpayment.consumer.subsui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.subsui.R;

public class ItemIndividualSubscriptionBindingImpl extends ItemIndividualSubscriptionBinding {
    private static final SparseIntArray ShareDataUIState;
    private static int component1 = 0;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component3 = 1;
    private static int copy = 1;
    private static int getAsAtTimestamp;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.iv_bundle, 1);
        sparseIntArray.put(R.id.ll_container, 2);
        sparseIntArray.put(R.id.tvTitle, 3);
        sparseIntArray.put(R.id.btnUnsubscribe, 4);
        int i = component1 + 9;
        component3 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ItemIndividualSubscriptionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, component2, ShareDataUIState));
    }

    private ItemIndividualSubscriptionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundTextView) objArr[4], (CardView) objArr[0], (ImageView) objArr[1], (LinearLayout) objArr[2], (TextView) objArr[3]);
        this.copydefault = -1L;
        this.cvRoot.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.copydefault = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.copydefault != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.copydefault = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = getAsAtTimestamp + 125;
        int i5 = i4 % 128;
        copy = i5;
        boolean z = i4 % 2 == 0;
        int i6 = i5 + 117;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 55;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 15;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
