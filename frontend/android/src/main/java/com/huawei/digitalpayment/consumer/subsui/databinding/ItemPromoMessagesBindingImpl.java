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

public class ItemPromoMessagesBindingImpl extends ItemPromoMessagesBinding {
    private static int component1 = 1;
    private static final SparseIntArray component2;
    private static int component3 = 0;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private long ShareDataUIState;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.iv_bundle, 1);
        sparseIntArray.put(R.id.ll_container, 2);
        sparseIntArray.put(R.id.tvTitle, 3);
        sparseIntArray.put(R.id.tv_buy, 4);
        int i = component3 + 53;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public ItemPromoMessagesBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, copydefault, component2));
    }

    private ItemPromoMessagesBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[0], (ImageView) objArr[1], (LinearLayout) objArr[2], (RoundTextView) objArr[4], (TextView) objArr[3]);
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
        int i4 = equals + 23;
        int i5 = i4 % 128;
        getRequestBeneficiariesState = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 79;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 5;
        equals = i4 % 128;
        boolean z = i4 % 2 == 0;
        int i5 = i3 + 15;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }
}
