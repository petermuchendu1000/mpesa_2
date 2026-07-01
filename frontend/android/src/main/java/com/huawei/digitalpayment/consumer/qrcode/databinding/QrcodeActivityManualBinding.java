package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.SingleRadioButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.qrcode.R;

public abstract class QrcodeActivityManualBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public final CommonInputView inputText;
    public final LoadingButton lbStart;
    public final LinearLayout llCashOutAgent;
    public final LinearLayout llPayToMerchant;
    public final SingleRadioButton rbCashOutAgent;
    public final SingleRadioButton rbPayToMerchant;
    public final LinearLayout rgManualType;
    public final RoundLinearLayout rlTop;
    public final TextView tvStep1;
    public final TextView tvStep2;
    public final View viewStep1;
    public final View viewStep2;

    protected QrcodeActivityManualBinding(Object obj, View view, int i, CommonInputView commonInputView, LoadingButton loadingButton, LinearLayout linearLayout, LinearLayout linearLayout2, SingleRadioButton singleRadioButton, SingleRadioButton singleRadioButton2, LinearLayout linearLayout3, RoundLinearLayout roundLinearLayout, TextView textView, TextView textView2, View view2, View view3) {
        super(obj, view, i);
        this.inputText = commonInputView;
        this.lbStart = loadingButton;
        this.llCashOutAgent = linearLayout;
        this.llPayToMerchant = linearLayout2;
        this.rbCashOutAgent = singleRadioButton;
        this.rbPayToMerchant = singleRadioButton2;
        this.rgManualType = linearLayout3;
        this.rlTop = roundLinearLayout;
        this.tvStep1 = textView;
        this.tvStep2 = textView2;
        this.viewStep1 = view2;
        this.viewStep2 = view3;
    }

    public static QrcodeActivityManualBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        QrcodeActivityManualBinding qrcodeActivityManualBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 21;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return qrcodeActivityManualBindingInflate;
    }

    @Deprecated
    public static QrcodeActivityManualBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.qrcode_activity_manual, viewGroup, z, obj);
        if (i3 == 0) {
            return (QrcodeActivityManualBinding) viewDataBindingInflateInternal;
        }
        int i4 = 90 / 0;
        return (QrcodeActivityManualBinding) viewDataBindingInflateInternal;
    }

    public static QrcodeActivityManualBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        QrcodeActivityManualBinding qrcodeActivityManualBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 115;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return qrcodeActivityManualBindingInflate;
    }

    @Deprecated
    public static QrcodeActivityManualBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        QrcodeActivityManualBinding qrcodeActivityManualBinding = (QrcodeActivityManualBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.qrcode_activity_manual, null, false, obj);
        int i4 = component2 + 107;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return qrcodeActivityManualBinding;
    }

    public static QrcodeActivityManualBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        QrcodeActivityManualBinding qrcodeActivityManualBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 115;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return qrcodeActivityManualBindingBind;
    }

    @Deprecated
    public static QrcodeActivityManualBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        QrcodeActivityManualBinding qrcodeActivityManualBinding = (QrcodeActivityManualBinding) bind(obj, view, R.layout.qrcode_activity_manual);
        if (i3 != 0) {
            return qrcodeActivityManualBinding;
        }
        throw null;
    }
}
