package com.huawei.digitalpayment.consumer.base.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J \u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\u000e\u0010\r\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/ui/widget/ViewPagerContainer;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mViewPager", "Landroidx/viewpager/widget/ViewPager;", "disallowParentInterceptDownEvent", "", "startX", "startY", "onFinishInflate", "", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onHorizontalActionMove", "endX", "disX", "disY", "onVerticalActionMove", "endY", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewPagerContainer extends RelativeLayout {
    private static int component1 = 0;
    private static int copydefault = 1;
    private boolean disallowParentInterceptDownEvent;
    private ViewPager mViewPager;
    private int startX;
    private int startY;

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewPagerContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = copydefault + 107;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = copydefault + 79;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPagerContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.disallowParentInterceptDownEvent = true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewPagerContainer(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = component1;
            int i3 = i2 + 7;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 103;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewPagerContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override
    protected void onFinishInflate() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        super.onFinishInflate();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (!(!(childAt instanceof ViewPager))) {
                this.mViewPager = (ViewPager) childAt;
                break;
            }
            i4++;
        }
        if (this.mViewPager == null) {
            throw new IllegalStateException("The root child of ViewPager2Container must contains a ViewPager2");
        }
        int i5 = component1 + 119;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            androidx.viewpager.widget.ViewPager r1 = r6.mViewPager
            r2 = 3
            r3 = 0
            if (r1 == 0) goto L13
            androidx.viewpager.widget.PagerAdapter r1 = r1.getAdapter()
            goto L21
        L13:
            int r1 = com.huawei.digitalpayment.consumer.base.ui.widget.ViewPagerContainer.component1
            int r1 = r1 + 13
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.base.ui.widget.ViewPagerContainer.copydefault = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L20
            r1 = 2
            int r1 = r1 % r2
        L20:
            r1 = r3
        L21:
            r4 = 1
            if (r1 == 0) goto L43
            androidx.viewpager.widget.ViewPager r1 = r6.mViewPager
            if (r1 == 0) goto L35
            int r3 = com.huawei.digitalpayment.consumer.base.ui.widget.ViewPagerContainer.component1
            int r3 = r3 + 103
            int r5 = r3 % 128
            com.huawei.digitalpayment.consumer.base.ui.widget.ViewPagerContainer.copydefault = r5
            int r3 = r3 % r0
            androidx.viewpager.widget.PagerAdapter r3 = r1.getAdapter()
        L35:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r1 = r3.getCount()
            if (r1 > r4) goto L43
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
        L43:
            int r1 = r7.getAction()
            if (r1 == 0) goto L84
            if (r1 == r4) goto L7b
            if (r1 == r0) goto L5e
            int r3 = com.huawei.digitalpayment.consumer.base.ui.widget.ViewPagerContainer.copydefault
            int r3 = r3 + 51
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.base.ui.widget.ViewPagerContainer.component1 = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L5b
            if (r1 == r0) goto L7b
            goto L9c
        L5b:
            if (r1 == r2) goto L7b
            goto L9c
        L5e:
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            int r2 = r6.startX
            int r2 = r0 - r2
            int r2 = java.lang.Math.abs(r2)
            int r3 = r6.startY
            int r1 = r1 - r3
            int r1 = java.lang.Math.abs(r1)
            r6.onHorizontalActionMove(r0, r2, r1)
            goto L9c
        L7b:
            android.view.ViewParent r0 = r6.getParent()
            r1 = 0
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L9c
        L84:
            float r0 = r7.getX()
            int r0 = (int) r0
            r6.startX = r0
            float r0 = r7.getY()
            int r0 = (int) r0
            r6.startY = r0
            android.view.ViewParent r0 = r6.getParent()
            boolean r1 = r6.disallowParentInterceptDownEvent
            r1 = r1 ^ r4
            r0.requestDisallowInterceptTouchEvent(r1)
        L9c:
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.ui.widget.ViewPagerContainer.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    private final void onHorizontalActionMove(int endX, int disX, int disY) {
        PagerAdapter adapter;
        int i = 2 % 2;
        ViewPager viewPager = this.mViewPager;
        PagerAdapter adapter2 = null;
        if (viewPager != null) {
            int i2 = component1 + 63;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            adapter = viewPager.getAdapter();
        } else {
            adapter = null;
        }
        if (adapter == null) {
            return;
        }
        if (disX <= disY) {
            if (disY > disX) {
                getParent().requestDisallowInterceptTouchEvent(false);
                return;
            }
            return;
        }
        ViewPager viewPager2 = this.mViewPager;
        Integer numValueOf = viewPager2 != null ? Integer.valueOf(viewPager2.getCurrentItem()) : null;
        ViewPager viewPager3 = this.mViewPager;
        if (viewPager3 != null) {
            int i4 = copydefault + 15;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                viewPager3.getAdapter();
                throw null;
            }
            adapter2 = viewPager3.getAdapter();
        }
        Intrinsics.checkNotNull(adapter2);
        int count = adapter2.getCount();
        if (numValueOf != null && numValueOf.intValue() == 0) {
            int i5 = component1 + 75;
            int i6 = i5 % 128;
            copydefault = i6;
            int i7 = i5 % 2;
            if (endX - this.startX > 0) {
                int i8 = i6 + 17;
                component1 = i8 % 128;
                int i9 = i8 % 2;
                getParent().requestDisallowInterceptTouchEvent(false);
                return;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(numValueOf == null || numValueOf.intValue() != count - 1 || endX - this.startX >= 0);
        int i10 = component1 + 73;
        copydefault = i10 % 128;
        int i11 = i10 % 2;
    }

    private final void onVerticalActionMove(int endY, int disX, int disY) {
        PagerAdapter adapter;
        int i = 2 % 2;
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            int i2 = component1 + 109;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                viewPager.getAdapter();
                throw null;
            }
            adapter = viewPager.getAdapter();
        } else {
            adapter = null;
        }
        if (adapter == null) {
            return;
        }
        ViewPager viewPager2 = this.mViewPager;
        Integer numValueOf = viewPager2 != null ? Integer.valueOf(viewPager2.getCurrentItem()) : null;
        ViewPager viewPager3 = this.mViewPager;
        PagerAdapter adapter2 = viewPager3 != null ? viewPager3.getAdapter() : null;
        Intrinsics.checkNotNull(adapter2);
        int count = adapter2.getCount();
        boolean z = false;
        if (disY <= disX) {
            if (disX > disY) {
                int i3 = component1 + 15;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                getParent().requestDisallowInterceptTouchEvent(false);
                return;
            }
            return;
        }
        int i5 = copydefault + 77;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        if (numValueOf != null && numValueOf.intValue() == 0 && endY - this.startY > 0) {
            getParent().requestDisallowInterceptTouchEvent(false);
            return;
        }
        ViewParent parent = getParent();
        if (numValueOf == null || numValueOf.intValue() != count - 1 || endY - this.startY >= 0) {
            int i7 = copydefault + 49;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        }
        parent.requestDisallowInterceptTouchEvent(z);
    }

    public final void disallowParentInterceptDownEvent(boolean disallowParentInterceptDownEvent) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.disallowParentInterceptDownEvent = disallowParentInterceptDownEvent;
        int i5 = i3 + 91;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }
}
