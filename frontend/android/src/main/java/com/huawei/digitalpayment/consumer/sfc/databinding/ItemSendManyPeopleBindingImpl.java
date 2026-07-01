package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ItemSendManyPeopleBindingImpl extends ItemSendManyPeopleBinding {
    private static final SparseIntArray component2;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int copy = 1;
    private static int copydefault = 0;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private long ShareDataUIState;
    private final ConstraintLayout component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.iv_avatar, 1);
        sparseIntArray.put(R.id.cardAbbr, 2);
        sparseIntArray.put(R.id.tvAbbr, 3);
        sparseIntArray.put(R.id.tv_name, 4);
        sparseIntArray.put(R.id.ivRemove, 5);
        int i = copy + 27;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public ItemSendManyPeopleBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, component3, component2));
    }

    private ItemSendManyPeopleBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[2], (RoundImageView) objArr[1], (ImageView) objArr[5], (TextView) objArr[3], (TextView) objArr[4]);
        this.ShareDataUIState = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component1 = constraintLayout;
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
        int i4 = equals + 69;
        int i5 = i4 % 128;
        getAsAtTimestamp = i5;
        boolean z = i4 % 2 == 0;
        int i6 = i5 + 125;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 21;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 27;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
