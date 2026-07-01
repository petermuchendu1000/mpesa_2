package com.huawei.digitalpayment.consumer.subsui.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.huawei.digitalpayment.consumer.subsui.BR;
import com.huawei.digitalpayment.consumer.subsui.R;

public class LayoutSusbcriptionBindingImpl extends LayoutSusbcriptionBinding {
    private static int ShareDataUIState = 0;
    private static final SparseIntArray component1;
    private static int component3 = 1;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private long component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.ll_container, 3);
        sparseIntArray.put(R.id.tv_buy, 4);
        int i = ShareDataUIState + 57;
        component3 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LayoutSusbcriptionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, copydefault, component1));
    }

    private LayoutSusbcriptionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[0], (ImageView) objArr[1], (LinearLayout) objArr[3], (ImageView) objArr[4], (TextView) objArr[2]);
        this.component2 = -1L;
        this.cvRoot.setTag(null);
        this.ivBundle.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component2 = 4L;
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
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        if (BR.title != i) {
            if (BR.icon != i) {
                return false;
            }
            setIcon((Drawable) obj);
            int i3 = getAsAtTimestamp + 59;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = getAsAtTimestamp + 79;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            setTitle((String) obj);
        }
        int i7 = getAsAtTimestamp + 63;
        getRequestBeneficiariesState = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    @Override
    public void setTitle(String str) {
        this.mTitle = str;
        synchronized (this) {
            this.component2 |= 1;
        }
        notifyPropertyChanged(BR.title);
        super.requestRebind();
    }

    @Override
    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
        synchronized (this) {
            this.component2 |= 2;
        }
        notifyPropertyChanged(BR.icon);
        super.requestRebind();
    }

    @Override
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.component2;
            this.component2 = 0L;
        }
        String str = this.mTitle;
        Drawable drawable = this.mIcon;
        if ((6 & j) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.ivBundle, drawable);
        }
        if ((j & 5) != 0) {
            TextViewBindingAdapter.setText(this.tvTitle, str);
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = getRequestBeneficiariesState + 85;
        int i5 = i4 % 128;
        getAsAtTimestamp = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 57;
        getRequestBeneficiariesState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }
}
