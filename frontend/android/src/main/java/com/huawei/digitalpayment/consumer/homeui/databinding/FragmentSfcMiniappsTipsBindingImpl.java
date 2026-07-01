package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.homeui.R;

public class FragmentSfcMiniappsTipsBindingImpl extends FragmentSfcMiniappsTipsBinding {
    private static final SparseIntArray component2;
    private static int component3 = 0;
    private static int copy = 1;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private long ShareDataUIState;
    private final CardView component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.tv_title, 1);
        sparseIntArray.put(R.id.iv_image, 2);
        sparseIntArray.put(R.id.tv_tips_title, 3);
        sparseIntArray.put(R.id.tv_tips_content, 4);
        int i = copy + 15;
        component3 = i % 128;
        if (i % 2 != 0) {
            int i2 = 49 / 0;
        }
    }

    public FragmentSfcMiniappsTipsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, copydefault, component2));
    }

    private FragmentSfcMiniappsTipsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (TextView) objArr[4], (TextView) objArr[3], (TextView) objArr[1]);
        this.ShareDataUIState = -1L;
        CardView cardView = (CardView) objArr[0];
        this.component1 = cardView;
        cardView.setTag(null);
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
        int i4 = getAsAtTimestamp + 117;
        int i5 = i4 % 128;
        equals = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 37;
        getAsAtTimestamp = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 39;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 41;
        equals = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 9 / 0;
        }
        return true;
    }
}
