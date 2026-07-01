package com.huawei.payment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;

public final class NestedScrollableHost extends FrameLayout {
    private View child;
    private float initialX;
    private float initialY;
    private ViewPager2 parent;
    private final int touchSlop;

    public NestedScrollableHost(Context context) {
        super(context);
        this.touchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public NestedScrollableHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.touchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private ViewPager2 getParentViewPager() {
        ViewPager2 viewPager2 = this.parent;
        if (viewPager2 != null) {
            return viewPager2;
        }
        ViewPager2 viewPager2FindParentViewPager2 = findParentViewPager2();
        this.parent = viewPager2FindParentViewPager2;
        return viewPager2FindParentViewPager2;
    }

    private ViewPager2 findParentViewPager2() {
        Object parent = getParent();
        if (!(parent instanceof View)) {
            parent = null;
        }
        View view = (View) parent;
        while (view != null && !(view instanceof ViewPager2)) {
            Object parent2 = view.getParent();
            if (!(parent2 instanceof View)) {
                parent2 = null;
            }
            view = (View) parent2;
        }
        return (ViewPager2) view;
    }

    private View getChild() {
        View view = this.child;
        if (view != null) {
            return view;
        }
        View childAt = getChildCount() > 0 ? getChildAt(0) : null;
        this.child = childAt;
        return childAt;
    }

    private boolean canChildScroll(int i, float f) {
        int i2 = -((int) Math.signum(f));
        if (i == 0) {
            View child = getChild();
            if (child != null && child.canScrollHorizontally(i2)) {
                return true;
            }
        } else {
            if (i != 1) {
                return false;
            }
            View child2 = getChild();
            if (child2 != null && child2.canScrollVertically(i2)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        handleInterceptTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    private void handleInterceptTouchEvent(MotionEvent motionEvent) {
        ViewPager2 parentViewPager = getParentViewPager();
        if (parentViewPager == null) {
            return;
        }
        int orientation = parentViewPager.getOrientation();
        if (canChildScroll(orientation, -1.0f) || canChildScroll(orientation, 1.0f)) {
            handleAction(motionEvent, orientation);
        }
    }

    private void handleAction(MotionEvent motionEvent, int i) {
        if (motionEvent.getAction() == 0) {
            this.initialX = motionEvent.getX();
            this.initialY = motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
            return;
        }
        if (motionEvent.getAction() == 2) {
            float x = motionEvent.getX() - this.initialX;
            float y = motionEvent.getY() - this.initialY;
            boolean z = i == 0;
            float fAbs = Math.abs(x) * (z ? 0.5f : 1.0f);
            float fAbs2 = Math.abs(y) * (z ? 1.0f : 0.5f);
            float f = this.touchSlop;
            if (fAbs > f || fAbs2 > f) {
                if (z == (fAbs2 > fAbs)) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    return;
                }
                ViewParent parent = getParent();
                if (!z) {
                    x = y;
                }
                parent.requestDisallowInterceptTouchEvent(canChildScroll(i, x));
            }
        }
    }
}
