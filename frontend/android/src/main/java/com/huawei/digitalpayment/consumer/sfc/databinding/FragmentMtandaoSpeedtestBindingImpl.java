package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.ekn.gruzer.gaugelibrary.ArcGauge;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class FragmentMtandaoSpeedtestBindingImpl extends FragmentMtandaoSpeedtestBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static int component2 = 0;
    private static final SparseIntArray component3;
    private static int copy = 1;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private long component1;
    private final NestedScrollView copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.cardView45, 1);
        sparseIntArray.put(R.id.ulVolumeSpd, 2);
        sparseIntArray.put(R.id.dlVolumeSpd, 3);
        sparseIntArray.put(R.id.run_speedtest_btn, 4);
        sparseIntArray.put(R.id.textview567, 5);
        sparseIntArray.put(R.id.arcGaugespeed, 6);
        sparseIntArray.put(R.id.dlultextview, 7);
        sparseIntArray.put(R.id.connectingtextview, 8);
        sparseIntArray.put(R.id.pingtextview, 9);
        sparseIntArray.put(R.id.previous_tests_btn, 10);
        sparseIntArray.put(R.id.imageView14, 11);
        sparseIntArray.put(R.id.textView49, 12);
        sparseIntArray.put(R.id.speeddowntextview, 13);
        sparseIntArray.put(R.id.imageView15, 14);
        sparseIntArray.put(R.id.textView51, 15);
        sparseIntArray.put(R.id.speeduptextview, 16);
        int i = component2 + 105;
        copy = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FragmentMtandaoSpeedtestBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 17, ShareDataUIState, component3));
    }

    private FragmentMtandaoSpeedtestBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ArcGauge) objArr[6], (MaterialCardView) objArr[1], (TextView) objArr[8], (LineChart) objArr[3], (TextView) objArr[7], (ImageView) objArr[11], (ImageView) objArr[14], (TextView) objArr[9], (Button) objArr[10], (MaterialButton) objArr[4], (TextView) objArr[13], (TextView) objArr[16], (TextView) objArr[12], (TextView) objArr[15], (TextView) objArr[5], (LineChart) objArr[2]);
        this.component1 = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.copydefault = nestedScrollView;
        nestedScrollView.setTag(null);
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
        int i4 = equals + 61;
        getRequestBeneficiariesState = i4 % 128;
        return i4 % 2 != 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 119;
        equals = i3 % 128;
        return i3 % 2 != 0;
    }
}
