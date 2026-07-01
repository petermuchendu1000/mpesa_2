package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.baselib.R;

public abstract class DialogCommonBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    public final LoadingButton btnNegative;
    public final LoadingButton btnPositive;
    public final ImageView ivIcon;
    public final RoundTextView line;
    public final TextView tvDescription;
    public final TextView tvTitle;

    protected DialogCommonBinding(Object obj, View view, int i, LoadingButton loadingButton, LoadingButton loadingButton2, ImageView imageView, RoundTextView roundTextView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnNegative = loadingButton;
        this.btnPositive = loadingButton2;
        this.ivIcon = imageView;
        this.line = roundTextView;
        this.tvDescription = textView;
        this.tvTitle = textView2;
    }

    public static DialogCommonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DialogCommonBinding dialogCommonBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        return dialogCommonBindingInflate;
    }

    @Deprecated
    public static DialogCommonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        DialogCommonBinding dialogCommonBinding;
        int i = 2 % 2;
        int i2 = copydefault + 109;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            dialogCommonBinding = (DialogCommonBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_common, viewGroup, z, obj);
            int i3 = 50 / 0;
        } else {
            dialogCommonBinding = (DialogCommonBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_common, viewGroup, z, obj);
        }
        int i4 = ShareDataUIState + 49;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return dialogCommonBinding;
    }

    public static DialogCommonBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DialogCommonBinding dialogCommonBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 119;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return dialogCommonBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static DialogCommonBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        ShareDataUIState = i2 % 128;
        DialogCommonBinding dialogCommonBinding = (DialogCommonBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 != 0 ? R.layout.dialog_common : R.layout.dialog_common, null, false, obj);
        int i3 = copydefault + 99;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return dialogCommonBinding;
    }

    public static DialogCommonBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static DialogCommonBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.dialog_common);
        if (i3 != 0) {
            return (DialogCommonBinding) viewDataBindingBind;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
