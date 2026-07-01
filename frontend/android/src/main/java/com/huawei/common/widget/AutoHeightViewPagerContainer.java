package com.huawei.common.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\r\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0016\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u001b\u001a\u00020\u0010H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/huawei/common/widget/AutoHeightViewPagerContainer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "animator", "Landroid/animation/ValueAnimator;", "pageCallback", "com/huawei/common/widget/AutoHeightViewPagerContainer$pageCallback$1", "Lcom/huawei/common/widget/AutoHeightViewPagerContainer$pageCallback$1;", "onFinishInflate", "", "adjustHeightForPosition", "position", "", "animate", "", "measureAndApplyHeight", "child", "Landroid/view/View;", "applyHeight", TypedValues.AttributesType.S_TARGET, "onDetachedFromWindow", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AutoHeightViewPagerContainer extends FrameLayout {
    private ValueAnimator animator;
    private final AutoHeightViewPagerContainer$pageCallback$1 pageCallback;
    private ViewPager2 viewPager;

    public AutoHeightViewPagerContainer(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoHeightViewPagerContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.pageCallback = new AutoHeightViewPagerContainer$pageCallback$1(this);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        IntRange intRangeUntil = RangesKt.until(0, getChildCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(((IntIterator) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof ViewPager2) {
                arrayList2.add(obj);
            }
        }
        ViewPager2 viewPager2 = (ViewPager2) CollectionsKt.firstOrNull((List) arrayList2);
        if (viewPager2 != null) {
            this.viewPager = viewPager2;
            ViewPager2 viewPager22 = null;
            if (viewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                viewPager2 = null;
            }
            viewPager2.registerOnPageChangeCallback(this.pageCallback);
            ViewPager2 viewPager23 = this.viewPager;
            if (viewPager23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                viewPager22 = viewPager23;
            }
            viewPager22.post(new Runnable() {
                @Override
                public final void run() {
                    AutoHeightViewPagerContainer.onFinishInflate$lambda$1(this.f$0);
                }
            });
            return;
        }
        throw new IllegalStateException("AutoHeightViewPagerContainer 必须有一个 ViewPager2 作为子视图");
    }

    public static final void onFinishInflate$lambda$1(AutoHeightViewPagerContainer autoHeightViewPagerContainer) {
        ViewPager2 viewPager2 = autoHeightViewPagerContainer.viewPager;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewPager2 = null;
        }
        autoHeightViewPagerContainer.adjustHeightForPosition(viewPager2.getCurrentItem(), false);
    }

    public final void adjustHeightForPosition(final int position, final boolean animate) {
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewPager2 = null;
        }
        View childAt = viewPager2.getChildAt(0);
        final RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(position);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            View view = viewHolderFindViewHolderForAdapterPosition.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            measureAndApplyHeight(view, animate);
            return;
        }
        recyclerView.post(new Runnable() {
            @Override
            public final void run() {
                AutoHeightViewPagerContainer.adjustHeightForPosition$lambda$2(recyclerView, position, this, animate);
            }
        });
    }

    public static final void adjustHeightForPosition$lambda$2(RecyclerView recyclerView, int i, AutoHeightViewPagerContainer autoHeightViewPagerContainer, boolean z) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            View view = viewHolderFindViewHolderForAdapterPosition.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            autoHeightViewPagerContainer.measureAndApplyHeight(view, z);
        }
    }

    private final void measureAndApplyHeight(View child, boolean animate) {
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewPager2 = null;
        }
        child.measure(View.MeasureSpec.makeMeasureSpec(viewPager2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        applyHeight(child.getMeasuredHeight(), animate);
    }

    public final void applyHeight(int target, boolean animate) {
        ViewPager2 viewPager2 = this.viewPager;
        ViewPager2 viewPager22 = null;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewPager2 = null;
        }
        final ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(getHeight());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : getMeasuredHeight();
        if (!animate) {
            layoutParams.height = target;
            ViewPager2 viewPager23 = this.viewPager;
            if (viewPager23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                viewPager22 = viewPager23;
            }
            viewPager22.setLayoutParams(layoutParams);
            return;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iIntValue, target);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                AutoHeightViewPagerContainer.applyHeight$lambda$5$lambda$4(layoutParams, this, valueAnimator2);
            }
        });
        valueAnimatorOfInt.start();
        this.animator = valueAnimatorOfInt;
    }

    public static final void applyHeight$lambda$5$lambda$4(ViewGroup.LayoutParams layoutParams, AutoHeightViewPagerContainer autoHeightViewPagerContainer, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        layoutParams.height = ((Integer) animatedValue).intValue();
        ViewPager2 viewPager2 = autoHeightViewPagerContainer.viewPager;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewPager2 = null;
        }
        viewPager2.setLayoutParams(layoutParams);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            ViewPager2 viewPager2 = this.viewPager;
            if (viewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                viewPager2 = null;
            }
            viewPager2.unregisterOnPageChangeCallback(this.pageCallback);
        } catch (Exception unused) {
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AutoHeightViewPagerContainer(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }
}
