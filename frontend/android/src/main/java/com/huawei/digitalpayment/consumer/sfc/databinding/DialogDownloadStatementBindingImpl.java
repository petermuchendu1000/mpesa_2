package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class DialogDownloadStatementBindingImpl extends DialogDownloadStatementBinding {
    private static final SparseIntArray ShareDataUIState;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component3 = 0;
    private static int component4 = 1;
    private static int copy = 1;
    private static int getAsAtTimestamp;
    private final RoundConstraintLayout component2;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.iv_top_bg, 1);
        sparseIntArray.put(R.id.ivBack, 2);
        sparseIntArray.put(R.id.tv_title, 3);
        sparseIntArray.put(R.id.tv_tips_content, 4);
        sparseIntArray.put(R.id.iv_result, 5);
        sparseIntArray.put(R.id.btn_confirm, 6);
        sparseIntArray.put(R.id.tv_left_button, 7);
        sparseIntArray.put(R.id.tv_right_button, 8);
        int i = component3 + 89;
        component4 = i % 128;
        int i2 = i % 2;
    }

    public DialogDownloadStatementBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 9, component1, ShareDataUIState));
    }

    private DialogDownloadStatementBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[6], (RoundImageView) objArr[2], (ImageView) objArr[5], (RoundImageView) objArr[1], (RoundTextView) objArr[7], (RoundTextView) objArr[8], (TextView) objArr[4], (TextView) objArr[3]);
        this.copydefault = -1L;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) objArr[0];
        this.component2 = roundConstraintLayout;
        roundConstraintLayout.setTag(null);
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
        int i4 = copy;
        int i5 = i4 + 115;
        getAsAtTimestamp = i5 % 128;
        boolean z = !(i5 % 2 == 0);
        int i6 = i4 + 105;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 89;
        copy = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
