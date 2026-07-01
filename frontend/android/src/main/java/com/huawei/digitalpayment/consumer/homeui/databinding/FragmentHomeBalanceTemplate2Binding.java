package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentHomeBalanceTemplate2Binding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    public final RoundImageView ivArrow;
    public final ImageView ivBackground;
    public final ImageView ivBalance;
    public final RoundImageView ivProfile;
    public final RoundLinearLayout llProfile;
    public final RoundConstraintLayout root;
    public final TextView tvBalance;
    public final TextView tvBalanceValue;
    public final TextView tvName;
    public final TextView tvUnit;
    public final RoundTextView tvWarning;

    protected FragmentHomeBalanceTemplate2Binding(Object obj, View view, int i, RoundImageView roundImageView, ImageView imageView, ImageView imageView2, RoundImageView roundImageView2, RoundLinearLayout roundLinearLayout, RoundConstraintLayout roundConstraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, RoundTextView roundTextView) {
        super(obj, view, i);
        this.ivArrow = roundImageView;
        this.ivBackground = imageView;
        this.ivBalance = imageView2;
        this.ivProfile = roundImageView2;
        this.llProfile = roundLinearLayout;
        this.root = roundConstraintLayout;
        this.tvBalance = textView;
        this.tvBalanceValue = textView2;
        this.tvName = textView3;
        this.tvUnit = textView4;
        this.tvWarning = roundTextView;
    }

    public static FragmentHomeBalanceTemplate2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeBalanceTemplate2Binding fragmentHomeBalanceTemplate2BindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 27;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentHomeBalanceTemplate2BindingInflate;
    }

    @Deprecated
    public static FragmentHomeBalanceTemplate2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeBalanceTemplate2Binding fragmentHomeBalanceTemplate2Binding = (FragmentHomeBalanceTemplate2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_home_balance_template2, viewGroup, z, obj);
        if (i3 != 0) {
            return fragmentHomeBalanceTemplate2Binding;
        }
        throw null;
    }

    public static FragmentHomeBalanceTemplate2Binding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        FragmentHomeBalanceTemplate2Binding fragmentHomeBalanceTemplate2BindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 69;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return fragmentHomeBalanceTemplate2BindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentHomeBalanceTemplate2Binding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeBalanceTemplate2Binding fragmentHomeBalanceTemplate2Binding = (FragmentHomeBalanceTemplate2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_home_balance_template2, null, false, obj);
        int i4 = ShareDataUIState + 49;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentHomeBalanceTemplate2Binding;
    }

    public static FragmentHomeBalanceTemplate2Binding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
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
    public static FragmentHomeBalanceTemplate2Binding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentHomeBalanceTemplate2Binding fragmentHomeBalanceTemplate2Binding = (FragmentHomeBalanceTemplate2Binding) bind(obj, view, R.layout.fragment_home_balance_template2);
        int i4 = copydefault + 73;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentHomeBalanceTemplate2Binding;
        }
        throw null;
    }
}
