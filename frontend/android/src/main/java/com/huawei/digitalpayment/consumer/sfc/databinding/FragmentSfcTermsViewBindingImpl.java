package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.card.MaterialCardView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class FragmentSfcTermsViewBindingImpl extends FragmentSfcTermsViewBinding {
    private static final SparseIntArray ShareDataUIState;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component4 = 0;
    private static int copy = 1;
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 1;
    private long component2;
    private final LinearLayout component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.cvBack, 1);
        sparseIntArray.put(R.id.ivBack, 2);
        sparseIntArray.put(R.id.tv_title, 3);
        sparseIntArray.put(R.id.pdfView, 4);
        int i = getAsAtTimestamp + 59;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 5 / 0;
        }
    }

    public FragmentSfcTermsViewBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, component1, ShareDataUIState));
    }

    private FragmentSfcTermsViewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (MaterialCardView) objArr[1], (ImageView) objArr[2], (PDFView) objArr[4], (TextView) objArr[3]);
        this.component2 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component3 = linearLayout;
        linearLayout.setTag(null);
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
        int i4 = copy;
        int i5 = i4 + 39;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 113;
        component4 = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 73;
        int i4 = i3 % 128;
        component4 = i4;
        boolean z = i3 % 2 == 0;
        int i5 = i4 + 25;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
