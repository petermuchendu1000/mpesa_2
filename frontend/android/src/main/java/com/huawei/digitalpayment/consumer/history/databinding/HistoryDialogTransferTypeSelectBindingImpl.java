package com.huawei.digitalpayment.consumer.history.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.history.R;

public class HistoryDialogTransferTypeSelectBindingImpl extends HistoryDialogTransferTypeSelectBinding {
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static final SparseIntArray component3;
    private static int copy = 0;
    private static int copydefault = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp = 1;
    private final RoundConstraintLayout ShareDataUIState;
    private long component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.rl_top, 1);
        sparseIntArray.put(R.id.tv_title, 2);
        sparseIntArray.put(R.id.im_close, 3);
        sparseIntArray.put(R.id.recycler_view, 4);
        sparseIntArray.put(R.id.btn_confirm, 5);
        int i = getAsAtTimestamp + 23;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public HistoryDialogTransferTypeSelectBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, component2, component3));
    }

    private HistoryDialogTransferTypeSelectBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[5], (ImageView) objArr[3], (RecyclerView) objArr[4], (RelativeLayout) objArr[1], (TextView) objArr[2]);
        this.component1 = -1L;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) objArr[0];
        this.ShareDataUIState = roundConstraintLayout;
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
        int i4 = copy + 43;
        int i5 = i4 % 128;
        equals = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 99;
        copy = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 1;
        copy = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 7;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
