package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;

public class ActivityPochiStatementsDetailsBindingImpl extends ActivityPochiStatementsDetailsBinding {
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component2 = 0;
    private static int component4 = 1;
    private static int copy = 1;
    private static final SparseIntArray copydefault;
    private static int equals;
    private long ShareDataUIState;
    private final ConstraintLayout component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.iv_delete, 1);
        sparseIntArray.put(R.id.rl_container, 2);
        sparseIntArray.put(R.id.rl_success_container, 3);
        sparseIntArray.put(R.id.tv_title, 4);
        sparseIntArray.put(R.id.tv_date, 5);
        sparseIntArray.put(R.id.tv_amount, 6);
        sparseIntArray.put(R.id.tv_transaction_cost, 7);
        sparseIntArray.put(R.id.tv_id_container, 8);
        sparseIntArray.put(R.id.tv_id, 9);
        sparseIntArray.put(R.id.tv_id_value, 10);
        sparseIntArray.put(R.id.tv_copy, 11);
        sparseIntArray.put(R.id.rl_receive_info, 12);
        sparseIntArray.put(R.id.tv_send_to, 13);
        sparseIntArray.put(R.id.fl_avatar_container, 14);
        sparseIntArray.put(R.id.iv_send_avatar, 15);
        sparseIntArray.put(R.id.paidCardAbbr, 16);
        sparseIntArray.put(R.id.tvPaidAbbr, 17);
        sparseIntArray.put(R.id.ll_send_container, 18);
        sparseIntArray.put(R.id.tv_send_name, 19);
        sparseIntArray.put(R.id.tv_phone_number, 20);
        sparseIntArray.put(R.id.iv_guideline, 21);
        sparseIntArray.put(R.id.iv_avatar_container, 22);
        sparseIntArray.put(R.id.iv_avatar, 23);
        sparseIntArray.put(R.id.cardAbbr, 24);
        sparseIntArray.put(R.id.tvAbbr, 25);
        sparseIntArray.put(R.id.rv_function, 26);
        int i = copy + 109;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public ActivityPochiStatementsDetailsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 27, component1, copydefault));
    }

    private ActivityPochiStatementsDetailsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[24], (FrameLayout) objArr[14], (RoundImageView) objArr[23], (RoundConstraintLayout) objArr[22], (RoundImageView) objArr[1], (View) objArr[21], (RoundImageView) objArr[15], (LinearLayout) objArr[18], (CardView) objArr[16], (CardView) objArr[2], (RoundConstraintLayout) objArr[12], (RoundConstraintLayout) objArr[3], (RecyclerView) objArr[26], (TextView) objArr[25], (TextView) objArr[6], (TextView) objArr[11], (TextView) objArr[5], (TextView) objArr[9], (RoundLinearLayout) objArr[8], (TextView) objArr[10], (TextView) objArr[17], (TextView) objArr[20], (TextView) objArr[19], (TextView) objArr[13], (RoundTextView) objArr[4], (TextView) objArr[7]);
        this.ShareDataUIState = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component3 = constraintLayout;
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
        int i4 = component4 + 69;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 1;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 53;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
