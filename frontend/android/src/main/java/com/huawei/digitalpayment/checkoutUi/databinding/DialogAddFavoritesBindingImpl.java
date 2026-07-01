package com.huawei.digitalpayment.checkoutUi.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.checkoutUi.R;

public class DialogAddFavoritesBindingImpl extends DialogAddFavoritesBinding {
    private static final SparseIntArray ShareDataUIState;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component3 = 0;
    private static int component4 = 1;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private long component2;
    private final RoundConstraintLayout copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.iv_top_bg, 1);
        sparseIntArray.put(R.id.ivBack, 2);
        sparseIntArray.put(R.id.tv_title, 3);
        sparseIntArray.put(R.id.iv_image, 4);
        sparseIntArray.put(R.id.cardAbbr, 5);
        sparseIntArray.put(R.id.tvAbbr, 6);
        sparseIntArray.put(R.id.tv_name, 7);
        sparseIntArray.put(R.id.tv_tips_content, 8);
        sparseIntArray.put(R.id.input_name, 9);
        sparseIntArray.put(R.id.btn_confirm, 10);
        int i = component4 + 91;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public DialogAddFavoritesBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 11, component1, ShareDataUIState));
    }

    private DialogAddFavoritesBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[10], (CardView) objArr[5], (CommonInputView) objArr[9], (RoundImageView) objArr[2], (ImageView) objArr[4], (RoundImageView) objArr[1], (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[8], (TextView) objArr[3]);
        this.component2 = -1L;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) objArr[0];
        this.copydefault = roundConstraintLayout;
        roundConstraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component2 = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component2 != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component2 = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = getAsAtTimestamp + 21;
        int i5 = i4 % 128;
        equals = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 59;
        getAsAtTimestamp = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 23;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
