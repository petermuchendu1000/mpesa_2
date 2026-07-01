package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.huawei.common.R;

public final class HomeBannerCycleViewBinding implements ViewBinding {
    private final RelativeLayout component3;
    public final LinearLayout cycleIndicator;
    public final TextView cycleTitle;
    public final ViewPager cycleViewPager;

    private HomeBannerCycleViewBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, TextView textView, ViewPager viewPager) {
        this.component3 = relativeLayout;
        this.cycleIndicator = linearLayout;
        this.cycleTitle = textView;
        this.cycleViewPager = viewPager;
    }

    @Override
    public RelativeLayout getRoot() {
        return this.component3;
    }

    public static HomeBannerCycleViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static HomeBannerCycleViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.home_banner_cycle_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static HomeBannerCycleViewBinding bind(View view) {
        int i = R.id.cycle_indicator;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.cycle_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.cycle_view_pager;
                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
                if (viewPager != null) {
                    return new HomeBannerCycleViewBinding((RelativeLayout) view, linearLayout, textView, viewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
