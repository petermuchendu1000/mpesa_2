package com.huawei.digitalpayment.consumer.base.ui.widget;

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
    private static int component2 = 0;
    private static int copydefault = 1;
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
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onPageSelected(int i2) {
                int i3 = 2 % 2;
                int i4 = component2 + 83;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 80 / 0;
                    if (ViewPager2Indicator.m10200$$Nest$fgetviewPager(ViewPager2Indicator.this).getAdapter() == null) {
                        return;
                    }
                } else if (ViewPager2Indicator.m10200$$Nest$fgetviewPager(ViewPager2Indicator.this).getAdapter() == null) {
                    return;
                }
                if (ViewPager2Indicator.m10200$$Nest$fgetviewPager(ViewPager2Indicator.this).getAdapter().getItemCount() <= 0) {
                    return;
                }
                ViewPager2Indicator.m10201$$Nest$mupdateIndicator(ViewPager2Indicator.this);
                int i6 = component1 + 29;
                component2 = i6 % 128;
                int i7 = i6 % 2;
            }
        };
        init(context, attributeSet, i);
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 53;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        setGravity(17);
        setOrientation(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ViewPager2Indicator);
        this.indicatorWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ViewPager2Indicator_indicator_width, ConvertUtils.dp2px(5.0f));
        this.indicatorHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ViewPager2Indicator_indicator_height, ConvertUtils.dp2px(5.0f));
        this.indicatorMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ViewPager2Indicator_indicator_margin, ConvertUtils.dp2px(5.0f));
        this.indicatorSelectDrawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ViewPager2Indicator_indicator_select_drawable);
        this.indicatorSelectDrawableColor = typedArrayObtainStyledAttributes.getColor(R.styleable.ViewPager2Indicator_indicator_select_drawable_color, ColorUtils.getColor(R.color.colorPrimary));
        this.indicatorUnSelectDrawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ViewPager2Indicator_indicator_unselect_drawable);
        this.indicatorUnSelectDrawableColor = typedArrayObtainStyledAttributes.getColor(R.styleable.ViewPager2Indicator_indicator_unselect_drawable_color, ColorUtils.getColor(R.color.colorFirstLevelBorder));
        typedArrayObtainStyledAttributes.recycle();
        int i5 = copydefault + 89;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void attachToViewPager(ViewPager2 viewPager2) {
        int i = 2 % 2;
        int i2 = component2 + 59;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            this.viewPager = viewPager2;
            if (viewPager2 != null) {
                if (viewPager2.getAdapter() == null) {
                    int i3 = component2 + 61;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                } else {
                    viewPager2.unregisterOnPageChangeCallback(this.onPageChangeListener);
                    viewPager2.registerOnPageChangeCallback(this.onPageChangeListener);
                    viewPager2.post(new Runnable() {
                        private static int component1 = 1;
                        private static int component3;

                        @Override
                        public void run() {
                            int i5 = 2 % 2;
                            int i6 = component1 + 53;
                            component3 = i6 % 128;
                            int i7 = i6 % 2;
                            ViewPager2Indicator.m10201$$Nest$mupdateIndicator(ViewPager2Indicator.this);
                            int i8 = component3 + 95;
                            component1 = i8 % 128;
                            if (i8 % 2 == 0) {
                                throw null;
                            }
                        }
                    });
                    return;
                }
            }
            return;
        }
        this.viewPager = viewPager2;
        throw null;
    }

    private void updateIndicator() {
        int i = 2 % 2;
        removeAllViews();
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            int i2 = component2 + 89;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            setViewPager(viewPager2.getCurrentItem(), this.viewPager.getAdapter());
        }
        int i4 = copydefault + 45;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private void setViewPager(int i, RecyclerView.Adapter adapter) {
        int itemCount;
        int i2;
        int i3 = 2 % 2;
        if (adapter != null) {
            int i4 = copydefault + 51;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                itemCount = adapter.getItemCount();
                i2 = 1;
            } else {
                itemCount = adapter.getItemCount();
                i2 = 0;
            }
            while (i2 < itemCount) {
                RoundImageView roundImageView = new RoundImageView(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.indicatorWidth, this.indicatorHeight);
                int i5 = this.indicatorMargin / 2;
                layoutParams.setMargins(i5, 0, i5, 0);
                roundImageView.setLayoutParams(layoutParams);
                roundImageView.getBaseFilletView().setRoundCorner(this.indicatorHeight);
                if (i == i2) {
                    int i6 = copydefault + 17;
                    component2 = i6 % 128;
                    if (i6 % 2 == 0) {
                        roundImageView.setImageDrawable(this.indicatorSelectDrawable);
                        roundImageView.setColorFilter(this.indicatorSelectDrawableColor);
                    } else {
                        roundImageView.setImageDrawable(this.indicatorSelectDrawable);
                        roundImageView.setColorFilter(this.indicatorSelectDrawableColor);
                        throw null;
                    }
                } else {
                    roundImageView.setImageDrawable(this.indicatorUnSelectDrawable);
                    roundImageView.setColorFilter(this.indicatorUnSelectDrawableColor);
                }
                addView(roundImageView);
                i2++;
            }
        }
    }

    static ViewPager2 m10200$$Nest$fgetviewPager(ViewPager2Indicator viewPager2Indicator) {
        int i = 2 % 2;
        int i2 = component2 + 51;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewPager2 viewPager2 = viewPager2Indicator.viewPager;
        if (i3 != 0) {
            return viewPager2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void m10201$$Nest$mupdateIndicator(ViewPager2Indicator viewPager2Indicator) {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        viewPager2Indicator.updateIndicator();
        int i4 = component2 + 57;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
    }
}
