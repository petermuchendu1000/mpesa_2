package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.github.barteksc.pdfviewer.PDFView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityViewStatementBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    public final RoundImageView ivBack;
    public final PDFView pdfView;
    public final TextView tvTitle;

    protected ActivityViewStatementBinding(Object obj, View view, int i, RoundImageView roundImageView, PDFView pDFView, TextView textView) {
        super(obj, view, i);
        this.ivBack = roundImageView;
        this.pdfView = pDFView;
        this.tvTitle = textView;
    }

    public static ActivityViewStatementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityViewStatementBinding activityViewStatementBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 61;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityViewStatementBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivityViewStatementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 3;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityViewStatementBinding activityViewStatementBinding = (ActivityViewStatementBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_view_statement, viewGroup, z, obj);
        int i4 = component3 + 13;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityViewStatementBinding;
        }
        throw null;
    }

    public static ActivityViewStatementBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityViewStatementBinding activityViewStatementBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 111;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityViewStatementBindingInflate;
    }

    @Deprecated
    public static ActivityViewStatementBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ActivityViewStatementBinding activityViewStatementBinding = (ActivityViewStatementBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_view_statement, null, false, obj);
        int i4 = component2 + 27;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityViewStatementBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ActivityViewStatementBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityViewStatementBinding activityViewStatementBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 5;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityViewStatementBindingBind;
    }

    @Deprecated
    public static ActivityViewStatementBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 83;
        component3 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        ActivityViewStatementBinding activityViewStatementBinding = (ActivityViewStatementBinding) bind(obj, view, R.layout.activity_view_statement);
        int i3 = component2 + 85;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return activityViewStatementBinding;
        }
        throw null;
    }
}
