package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.homeui.R;

public class FragmentSfcFrequentBindingImpl extends FragmentSfcFrequentBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component3;
    private static int copydefault = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private long component1;
    private final CardView component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.tv_title, 1);
        sparseIntArray.put(R.id.ll_viewall, 2);
        sparseIntArray.put(R.id.iv_down, 3);
        sparseIntArray.put(R.id.ll_tab, 4);
        sparseIntArray.put(R.id.recyclerView, 5);
        int i = copydefault + 59;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    public FragmentSfcFrequentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, ShareDataUIState, component3));
    }

    private FragmentSfcFrequentBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[3], (RoundLinearLayout) objArr[4], (LinearLayout) objArr[2], (RecyclerView) objArr[5], (TextView) objArr[1]);
        this.component1 = -1L;
        CardView cardView = (CardView) objArr[0];
        this.component2 = cardView;
        cardView.setTag(null);
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
        int i4 = getRequestBeneficiariesState;
        int i5 = i4 + 121;
        equals = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 9;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 73 / 0;
        }
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 111;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 3;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
