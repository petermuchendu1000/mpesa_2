package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ekn.gruzer.gaugelibrary.ArcGauge;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class FragmentMtandaoSpeedtestBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final ArcGauge arcGaugespeed;
    public final MaterialCardView cardView45;
    public final TextView connectingtextview;
    public final LineChart dlVolumeSpd;
    public final TextView dlultextview;
    public final ImageView imageView14;
    public final ImageView imageView15;
    public final TextView pingtextview;
    public final Button previousTestsBtn;
    public final MaterialButton runSpeedtestBtn;
    public final TextView speeddowntextview;
    public final TextView speeduptextview;
    public final TextView textView49;
    public final TextView textView51;
    public final TextView textview567;
    public final LineChart ulVolumeSpd;

    protected FragmentMtandaoSpeedtestBinding(Object obj, View view, int i, ArcGauge arcGauge, MaterialCardView materialCardView, TextView textView, LineChart lineChart, TextView textView2, ImageView imageView, ImageView imageView2, TextView textView3, Button button, MaterialButton materialButton, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, LineChart lineChart2) {
        super(obj, view, i);
        this.arcGaugespeed = arcGauge;
        this.cardView45 = materialCardView;
        this.connectingtextview = textView;
        this.dlVolumeSpd = lineChart;
        this.dlultextview = textView2;
        this.imageView14 = imageView;
        this.imageView15 = imageView2;
        this.pingtextview = textView3;
        this.previousTestsBtn = button;
        this.runSpeedtestBtn = materialButton;
        this.speeddowntextview = textView4;
        this.speeduptextview = textView5;
        this.textView49 = textView6;
        this.textView51 = textView7;
        this.textview567 = textView8;
        this.ulVolumeSpd = lineChart2;
    }

    public static FragmentMtandaoSpeedtestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        throw null;
    }

    @Deprecated
    public static FragmentMtandaoSpeedtestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        FragmentMtandaoSpeedtestBinding fragmentMtandaoSpeedtestBinding;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            fragmentMtandaoSpeedtestBinding = (FragmentMtandaoSpeedtestBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_mtandao_speedtest, viewGroup, z, obj);
            int i3 = 90 / 0;
        } else {
            fragmentMtandaoSpeedtestBinding = (FragmentMtandaoSpeedtestBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_mtandao_speedtest, viewGroup, z, obj);
        }
        int i4 = ShareDataUIState + 89;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentMtandaoSpeedtestBinding;
    }

    public static FragmentMtandaoSpeedtestBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static FragmentMtandaoSpeedtestBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return (FragmentMtandaoSpeedtestBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_mtandao_speedtest, null, false, obj);
    }

    public static FragmentMtandaoSpeedtestBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentMtandaoSpeedtestBinding fragmentMtandaoSpeedtestBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 9;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentMtandaoSpeedtestBindingBind;
    }

    @Deprecated
    public static FragmentMtandaoSpeedtestBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        FragmentMtandaoSpeedtestBinding fragmentMtandaoSpeedtestBinding = (FragmentMtandaoSpeedtestBinding) bind(obj, view, R.layout.fragment_mtandao_speedtest);
        int i3 = copydefault + 85;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return fragmentMtandaoSpeedtestBinding;
    }
}
