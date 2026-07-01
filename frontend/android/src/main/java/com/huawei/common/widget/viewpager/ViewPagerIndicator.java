package com.huawei.common.widget.viewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.blankj.utilcode.util.ConvertUtils;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.R;
import com.huawei.common.widget.round.RoundImageView;

public class ViewPagerIndicator extends LinearLayout {
    private int indicatorHeight;
    private int indicatorMargin;
    private Drawable indicatorSelectDrawable;
    private Drawable indicatorUnSelectDrawable;
    private int indicatorWidth;
    private final ViewPager.OnPageChangeListener onPageChangeListener;
    private ViewPager viewPager;

    public ViewPagerIndicator(Context context) {
        this(context, null);
    }

    public ViewPagerIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewPagerIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onPageChangeListener = new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrollStateChanged(int i2) {
            }

            @Override
            public void onPageScrolled(int i2, float f, int i3) {
            }

            @Override
            public void onPageSelected(int i2) {
                Callback.onPageSelected_enter(i2);
                try {
                    if (ViewPagerIndicator.this.viewPager.getAdapter() != null && ViewPagerIndicator.this.viewPager.getAdapter().getCount() > 0) {
                        ViewPagerIndicator.this.updateIndicator();
                    }
                } finally {
                    Callback.onPageSelected_exit();
                }
            }
        };
        init(context, attributeSet, i);
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        setGravity(17);
        setOrientation(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ViewPagerIndicator);
        this.indicatorWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ViewPagerIndicator_indicator_width, ConvertUtils.dp2px(5.0f));
        this.indicatorHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ViewPagerIndicator_indicator_height, ConvertUtils.dp2px(5.0f));
        this.indicatorMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ViewPagerIndicator_indicator_margin, ConvertUtils.dp2px(5.0f));
        this.indicatorSelectDrawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ViewPagerIndicator_indicator_select_drawable);
        this.indicatorUnSelectDrawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ViewPagerIndicator_indicator_unselect_drawable);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void attachToViewPager(ViewPager viewPager) {
        this.viewPager = viewPager;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        viewPager.removeOnPageChangeListener(this.onPageChangeListener);
        viewPager.addOnPageChangeListener(this.onPageChangeListener);
        this.onPageChangeListener.onPageSelected(viewPager.getCurrentItem());
        updateIndicator();
    }

    public void updateIndicator() {
        removeAllViews();
        ViewPager viewPager = this.viewPager;
        if (viewPager != null) {
            setViewPager(viewPager.getCurrentItem(), this.viewPager.getAdapter());
        }
    }

    private void setViewPager(int i, PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                RoundImageView roundImageView = new RoundImageView(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.indicatorWidth, this.indicatorHeight);
                int i3 = this.indicatorMargin / 2;
                layoutParams.setMargins(i3, 0, i3, 0);
                roundImageView.setLayoutParams(layoutParams);
                roundImageView.getBaseFilletView().setRoundCorner(this.indicatorHeight);
                if (i == i2) {
                    roundImageView.setImageDrawable(this.indicatorSelectDrawable);
                } else {
                    roundImageView.setImageDrawable(this.indicatorUnSelectDrawable);
                }
                addView(roundImageView);
            }
        }
    }
}
