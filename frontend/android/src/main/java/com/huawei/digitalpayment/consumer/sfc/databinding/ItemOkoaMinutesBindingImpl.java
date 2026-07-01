package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ItemOkoaMinutesBindingImpl extends ItemOkoaMinutesBinding {
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static final SparseIntArray component2;
    private static int component3 = 1;
    private static int copydefault = 0;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private long ShareDataUIState;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.iv_bundle, 1);
        sparseIntArray.put(R.id.ll_container, 2);
        sparseIntArray.put(R.id.tv_bundle_title, 3);
        sparseIntArray.put(R.id.tv_bundle_amount, 4);
        sparseIntArray.put(R.id.tv_buy, 5);
        int i = component3 + 111;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 28 / 0;
        }
    }

    public ItemOkoaMinutesBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, component1, component2));
    }

    private ItemOkoaMinutesBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[0], (ImageView) objArr[1], (LinearLayout) objArr[2], (TextView) objArr[4], (TextView) objArr[3], (RoundTextView) objArr[5]);
        this.ShareDataUIState = -1L;
        this.cvRoot.setTag(null);
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
        int i4 = getAsAtTimestamp + 51;
        int i5 = i4 % 128;
        equals = i5;
        boolean z = i4 % 2 != 0;
        int i6 = i5 + 53;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 95;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 71;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
