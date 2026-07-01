package com.huawei.digitalpayment.customer.dynamics.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.camera.view.PreviewView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.customer.dynamics.R;
import com.huawei.digitalpayment.customer.dynamics.widget.ScanIDMarkView;

public abstract class ActivityScanIdBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    public final View areaView;
    public final ImageView ivBack;
    public final ImageView ivTakePhoto;
    public final ScanIDMarkView markView;
    public final PreviewView previewView;
    public final RoundTextView tvTips;

    protected ActivityScanIdBinding(Object obj, View view, int i, View view2, ImageView imageView, ImageView imageView2, ScanIDMarkView scanIDMarkView, PreviewView previewView, RoundTextView roundTextView) {
        super(obj, view, i);
        this.areaView = view2;
        this.ivBack = imageView;
        this.ivTakePhoto = imageView2;
        this.markView = scanIDMarkView;
        this.previewView = previewView;
        this.tvTips = roundTextView;
    }

    public static ActivityScanIdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityScanIdBinding activityScanIdBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 43;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityScanIdBindingInflate;
    }

    @Deprecated
    public static ActivityScanIdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityScanIdBinding activityScanIdBinding = (ActivityScanIdBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_scan_id, viewGroup, z, obj);
        int i4 = ShareDataUIState + 47;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return activityScanIdBinding;
    }

    public static ActivityScanIdBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityScanIdBinding activityScanIdBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 65;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityScanIdBindingInflate;
    }

    @Deprecated
    public static ActivityScanIdBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityScanIdBinding activityScanIdBinding = (ActivityScanIdBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_scan_id, null, false, obj);
        int i4 = ShareDataUIState + 119;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityScanIdBinding;
    }

    public static ActivityScanIdBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityScanIdBinding activityScanIdBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        return activityScanIdBindingBind;
    }

    @Deprecated
    public static ActivityScanIdBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityScanIdBinding activityScanIdBinding = (ActivityScanIdBinding) bind(obj, view, R.layout.activity_scan_id);
        int i4 = copydefault + 27;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityScanIdBinding;
    }
}
