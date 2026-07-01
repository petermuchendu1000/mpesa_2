package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.base.ui.widget.SfcManyAmountInputView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ItemSendManyPeopleAmountBindingImpl extends ItemSendManyPeopleAmountBinding {
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static final SparseIntArray component3;
    private static int component4 = 0;
    private static int copydefault = 0;
    private static int equals = 1;
    private static int getRequestBeneficiariesState = 1;
    private long ShareDataUIState;
    private final RelativeLayout component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.iv_avatar, 1);
        sparseIntArray.put(R.id.cardAbbr, 2);
        sparseIntArray.put(R.id.tvAbbr, 3);
        sparseIntArray.put(R.id.name, 4);
        sparseIntArray.put(R.id.phone, 5);
        sparseIntArray.put(R.id.inputAmount, 6);
        int i = equals + 37;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 82 / 0;
        }
    }

    public ItemSendManyPeopleAmountBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, component1, component3));
    }

    private ItemSendManyPeopleAmountBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[2], (SfcManyAmountInputView) objArr[6], (RoundImageView) objArr[1], (TextView) objArr[4], (TextView) objArr[5], (TextView) objArr[3]);
        this.ShareDataUIState = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.component2 = relativeLayout;
        relativeLayout.setTag(null);
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
        int i4 = getRequestBeneficiariesState + 65;
        int i5 = i4 % 128;
        component4 = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 9;
        getRequestBeneficiariesState = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 13;
        int i4 = i3 % 128;
        component4 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 35;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 58 / 0;
        }
        return true;
    }
}
