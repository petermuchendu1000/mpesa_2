package com.huawei.common.widget.viewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.ConvertUtils;
import com.huawei.common.R;
import com.huawei.common.widget.round.RoundImageView;

public class ViewPager2Indicator extends LinearLayout {
    private int indicatorHeight;
    private int indicatorMargin;
    private Drawable indicatorSelectDrawable;
    private int indicatorSelectDrawableColor;
    private Drawable indicatorUnSelectDrawable;
    private int indicatorUnSelectDrawableColor;
    private int indicatorWidth;
    private final ViewPager2.OnPageChangeCallback onPageChangeListener;
    private ViewPager2 viewPager;

    public ViewPager2Indicator(Context context) {
        this(context, null);
    }

    public ViewPager2Indicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewPager2Indicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onPageChangeListener = new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int i2) {
                if (ViewPager2Indicator.this.viewPager.getAdapter() == null || ViewPager2Indicator.this.viewPager.getAdapter().getItemCount() <= 0) {
                    return;
                }
                ViewPager2Indicator.this.updateIndicator();
            }
        };
        init(context, attributeSet, i);
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        setGravity(17);
        setOrientation(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ViewPager2Indicator);
        this.indicatorWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ViewPager2Indicator_indicator_width, ConvertUtils.dp2px(5.0f));
        this.indicatorHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ViewPager2Indicator_indicator_height, ConvertUtils.dp2px(5.0f));
        this.indicatorMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ViewPager2Indicator_indicator_margin, ConvertUtils.dp2px(5.0f));
        this.indicatorSelectDrawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ViewPager2Indicator_indicator_select_drawable);
        this.indicatorSelectDrawableColor = typedArrayObtainStyledAttributes.getColor(R.styleable.ViewPager2Indicator_indicator_select_drawable_color, ColorUtils.getColor(R.color.colorPrimary));
        this.indicatorUnSelectDrawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ViewPager2Indicator_indicator_unselect_drawable);
        this.indicatorUnSelectDrawableColor = typedArrayObtainStyledAttributes.getColor(R.styleable.ViewPager2Indicator_indicator_select_drawable_color, ColorUtils.getColor(R.color.colorFirstLevelBorder));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void attachToViewPager(ViewPager2 viewPager2) {
        this.viewPager = viewPager2;
        if (viewPager2 == null || viewPager2.getAdapter() == null) {
            return;
        }
        viewPager2.unregisterOnPageChangeCallback(this.onPageChangeListener);
        viewPager2.registerOnPageChangeCallback(this.onPageChangeListener);
        viewPager2.post(new Runnable() {
            @Override
            public void run() {
                ViewPager2Indicator.this.updateIndicator();
            }
        });
    }

    public void updateIndicator() {
        removeAllViews();
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            setViewPager(viewPager2.getCurrentItem(), this.viewPager.getAdapter());
        }
    }

    private void setViewPager(int i, RecyclerView.Adapter adapter) {
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i2 = 0; i2 < itemCount; i2++) {
                RoundImageView roundImageView = new RoundImageView(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.indicatorWidth, this.indicatorHeight);
                int i3 = this.indicatorMargin / 2;
                layoutParams.setMargins(i3, 0, i3, 0);
                roundImageView.setLayoutParams(layoutParams);
                roundImageView.getBaseFilletView().setRoundCorner(this.indicatorHeight);
                if (i == i2) {
                    roundImageView.setImageDrawable(this.indicatorSelectDrawable);
                    roundImageView.setColorFilter(this.indicatorSelectDrawableColor);
                } else {
                    roundImageView.setImageDrawable(this.indicatorUnSelectDrawable);
                    roundImageView.setColorFilter(this.indicatorUnSelectDrawableColor);
                }
                addView(roundImageView);
            }
        }
    }
}
