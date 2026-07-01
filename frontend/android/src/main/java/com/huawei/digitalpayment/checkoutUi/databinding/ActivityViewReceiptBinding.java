package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.github.barteksc.pdfviewer.PDFView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.checkoutUi.R;

public abstract class ActivityViewReceiptBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final RoundImageView ivBack;
    public final ImageView ivDownload;
    public final ImageView ivShare;
    public final PDFView pdfView;
    public final TextView tvTitle;

    protected ActivityViewReceiptBinding(Object obj, View view, int i, RoundImageView roundImageView, ImageView imageView, ImageView imageView2, PDFView pDFView, TextView textView) {
        super(obj, view, i);
        this.ivBack = roundImageView;
        this.ivDownload = imageView;
        this.ivShare = imageView2;
        this.pdfView = pDFView;
        this.tvTitle = textView;
    }

    public static ActivityViewReceiptBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 121;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityViewReceiptBinding activityViewReceiptBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 29;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityViewReceiptBindingInflate;
    }

    @Deprecated
    public static ActivityViewReceiptBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 117;
        component3 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        ActivityViewReceiptBinding activityViewReceiptBinding = (ActivityViewReceiptBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_view_receipt, viewGroup, z, obj);
        int i3 = component3 + 111;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return activityViewReceiptBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ActivityViewReceiptBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityViewReceiptBinding activityViewReceiptBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 93;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityViewReceiptBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivityViewReceiptBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 65;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityViewReceiptBinding activityViewReceiptBinding = (ActivityViewReceiptBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_view_receipt, null, false, obj);
        int i4 = component3 + 59;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityViewReceiptBinding;
    }

    public static ActivityViewReceiptBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivityViewReceiptBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityViewReceiptBinding activityViewReceiptBinding = (ActivityViewReceiptBinding) bind(obj, view, R.layout.activity_view_receipt);
        if (i3 != 0) {
            return activityViewReceiptBinding;
        }
        throw null;
    }
}
