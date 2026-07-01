package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.BubblesView;
import com.huawei.common.widget.SearchView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class FragmentTemplateTopBarBindingImpl extends FragmentTemplateTopBarBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    private static final SparseIntArray component3;
    private static int component4 = 1;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int getAsAtTimestamp;
    private long ShareDataUIState;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.topBarBg, 1);
        sparseIntArray.put(R.id.clRoot, 2);
        sparseIntArray.put(R.id.llStart, 3);
        sparseIntArray.put(R.id.startIcon, 4);
        sparseIntArray.put(R.id.llStartText, 5);
        sparseIntArray.put(R.id.text, 6);
        sparseIntArray.put(R.id.subText, 7);
        sparseIntArray.put(R.id.homeSearch, 8);
        sparseIntArray.put(R.id.ivMiddle, 9);
        sparseIntArray.put(R.id.endCl, 10);
        sparseIntArray.put(R.id.endIcon, 11);
        sparseIntArray.put(R.id.ivHomeNotificationUnRead, 12);
        int i = component2 + 119;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public FragmentTemplateTopBarBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 13, copydefault, component3));
    }

    private FragmentTemplateTopBarBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[10], (ImageView) objArr[11], (SearchView) objArr[8], (BubblesView) objArr[12], (RoundImageView) objArr[9], (RoundLinearLayout) objArr[0], (LinearLayout) objArr[3], (LinearLayout) objArr[5], (RoundImageView) objArr[4], (RoundTextView) objArr[7], (RoundTextView) objArr[6], (RoundImageView) objArr[1]);
        this.ShareDataUIState = -1L;
        this.llRoot.setTag(null);
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
        int i4 = getAsAtTimestamp + 81;
        int i5 = i4 % 128;
        component4 = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 65;
        getAsAtTimestamp = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 59;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 103;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
