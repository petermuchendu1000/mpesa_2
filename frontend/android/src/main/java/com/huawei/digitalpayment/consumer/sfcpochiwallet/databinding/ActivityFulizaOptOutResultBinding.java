package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;

public abstract class ActivityFulizaOptOutResultBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    public final LoadingButton btnConfirm;
    public final ImageView ivBack;
    public final ImageView ivResult;
    public final TextView tvContent;
    public final TextView tvTitle;

    protected ActivityFulizaOptOutResultBinding(Object obj, View view, int i, LoadingButton loadingButton, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.ivBack = imageView;
        this.ivResult = imageView2;
        this.tvContent = textView;
        this.tvTitle = textView2;
    }

    public static ActivityFulizaOptOutResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        ActivityFulizaOptOutResultBinding activityFulizaOptOutResultBindingInflate;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            activityFulizaOptOutResultBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 58 / 0;
        } else {
            activityFulizaOptOutResultBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 123;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityFulizaOptOutResultBindingInflate;
    }

    @Deprecated
    public static ActivityFulizaOptOutResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityFulizaOptOutResultBinding activityFulizaOptOutResultBinding = (ActivityFulizaOptOutResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_fuliza_opt_out_result, viewGroup, z, obj);
        int i4 = copydefault + 111;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return activityFulizaOptOutResultBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ActivityFulizaOptOutResultBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivityFulizaOptOutResultBinding activityFulizaOptOutResultBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 7;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return activityFulizaOptOutResultBindingInflate;
    }

    @Deprecated
    public static ActivityFulizaOptOutResultBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return (ActivityFulizaOptOutResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_fuliza_opt_out_result, null, false, obj);
    }

    public static ActivityFulizaOptOutResultBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityFulizaOptOutResultBinding activityFulizaOptOutResultBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 89;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return activityFulizaOptOutResultBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivityFulizaOptOutResultBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityFulizaOptOutResultBinding activityFulizaOptOutResultBinding = (ActivityFulizaOptOutResultBinding) bind(obj, view, R.layout.activity_fuliza_opt_out_result);
        int i4 = copydefault + 97;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return activityFulizaOptOutResultBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
