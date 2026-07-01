package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.BubblesView;
import com.huawei.common.widget.SearchView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentTemplateTopBarBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    public final ConstraintLayout clRoot;
    public final ConstraintLayout endCl;
    public final ImageView endIcon;
    public final SearchView homeSearch;
    public final BubblesView ivHomeNotificationUnRead;
    public final RoundImageView ivMiddle;
    public final RoundLinearLayout llRoot;
    public final LinearLayout llStart;
    public final LinearLayout llStartText;
    public final RoundImageView startIcon;
    public final RoundTextView subText;
    public final RoundTextView text;
    public final RoundImageView topBarBg;

    protected FragmentTemplateTopBarBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, SearchView searchView, BubblesView bubblesView, RoundImageView roundImageView, RoundLinearLayout roundLinearLayout, LinearLayout linearLayout, LinearLayout linearLayout2, RoundImageView roundImageView2, RoundTextView roundTextView, RoundTextView roundTextView2, RoundImageView roundImageView3) {
        super(obj, view, i);
        this.clRoot = constraintLayout;
        this.endCl = constraintLayout2;
        this.endIcon = imageView;
        this.homeSearch = searchView;
        this.ivHomeNotificationUnRead = bubblesView;
        this.ivMiddle = roundImageView;
        this.llRoot = roundLinearLayout;
        this.llStart = linearLayout;
        this.llStartText = linearLayout2;
        this.startIcon = roundImageView2;
        this.subText = roundTextView;
        this.text = roundTextView2;
        this.topBarBg = roundImageView3;
    }

    public static FragmentTemplateTopBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 63;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FragmentTemplateTopBarBinding fragmentTemplateTopBarBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 41;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return fragmentTemplateTopBarBindingInflate;
    }

    @Deprecated
    public static FragmentTemplateTopBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentTemplateTopBarBinding fragmentTemplateTopBarBinding = (FragmentTemplateTopBarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_template_top_bar, viewGroup, z, obj);
        int i4 = component3 + 7;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentTemplateTopBarBinding;
    }

    public static FragmentTemplateTopBarBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentTemplateTopBarBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        FragmentTemplateTopBarBinding fragmentTemplateTopBarBinding = (FragmentTemplateTopBarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_template_top_bar, null, false, obj);
        int i4 = component3 + 19;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentTemplateTopBarBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static FragmentTemplateTopBarBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 59;
        ShareDataUIState = i2 % 128;
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
    public static FragmentTemplateTopBarBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentTemplateTopBarBinding fragmentTemplateTopBarBinding = (FragmentTemplateTopBarBinding) bind(obj, view, R.layout.fragment_template_top_bar);
        int i4 = component3 + 97;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentTemplateTopBarBinding;
    }
}
