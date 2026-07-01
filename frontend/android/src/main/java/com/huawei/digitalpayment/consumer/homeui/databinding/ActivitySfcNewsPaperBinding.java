package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class ActivitySfcNewsPaperBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final ComposeView composeView;
    public final ConstraintLayout main;

    protected ActivitySfcNewsPaperBinding(Object obj, View view, int i, ComposeView composeView, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.composeView = composeView;
        this.main = constraintLayout;
    }

    public static ActivitySfcNewsPaperBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcNewsPaperBinding activitySfcNewsPaperBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 55;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySfcNewsPaperBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySfcNewsPaperBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcNewsPaperBinding activitySfcNewsPaperBinding = (ActivitySfcNewsPaperBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_news_paper, viewGroup, z, obj);
        if (i3 != 0) {
            return activitySfcNewsPaperBinding;
        }
        throw null;
    }

    public static ActivitySfcNewsPaperBinding inflate(LayoutInflater layoutInflater) {
        ActivitySfcNewsPaperBinding activitySfcNewsPaperBindingInflate;
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            activitySfcNewsPaperBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 12 / 0;
        } else {
            activitySfcNewsPaperBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 39;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcNewsPaperBindingInflate;
    }

    @Deprecated
    public static ActivitySfcNewsPaperBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 31;
        copydefault = i2 % 128;
        ActivitySfcNewsPaperBinding activitySfcNewsPaperBinding = (ActivitySfcNewsPaperBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 != 0 ? R.layout.activity_sfc_news_paper : R.layout.activity_sfc_news_paper, null, false, obj);
        int i3 = copydefault + 5;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcNewsPaperBinding;
    }

    public static ActivitySfcNewsPaperBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcNewsPaperBinding activitySfcNewsPaperBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 79;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcNewsPaperBindingBind;
    }

    @Deprecated
    public static ActivitySfcNewsPaperBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcNewsPaperBinding activitySfcNewsPaperBinding = (ActivitySfcNewsPaperBinding) bind(obj, view, R.layout.activity_sfc_news_paper);
        if (i3 != 0) {
            return activitySfcNewsPaperBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
