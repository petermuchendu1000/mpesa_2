package com.huawei.payment.lib.image.crop.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.payment.lib.image.R;

public class HorizontalProgressView extends View {
    public static int copydefault = -310356102;
    private final Rect canvasClipBounds;
    private float lastTouchedPosition;
    private int middleLineColor;
    private int progressLineHeight;
    private int progressLineMargin;
    private Paint progressLinePaint;
    private int progressLineWidth;
    private Paint progressMiddleLinePaint;
    private boolean scrollStarted;
    private ScrollingListener scrollingListener;
    private float totalScrollDistance;

    public interface ScrollingListener {
        void onScroll(float f, float f2);

        void onScrollEnd();

        void onScrollStart();
    }

    public HorizontalProgressView(Context context) {
        this(context, null);
    }

    public HorizontalProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.canvasClipBounds = new Rect();
        init();
    }

    public HorizontalProgressView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.canvasClipBounds = new Rect();
    }

    public void setScrollingListener(ScrollingListener scrollingListener) {
        this.scrollingListener = scrollingListener;
    }

    public void setMiddleLineColor(int i) {
        this.middleLineColor = i;
        this.progressMiddleLinePaint.setColor(i);
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.lastTouchedPosition = motionEvent.getX();
        } else if (action == 1) {
            ScrollingListener scrollingListener = this.scrollingListener;
            if (scrollingListener != null) {
                this.scrollStarted = false;
                scrollingListener.onScrollEnd();
            }
        } else if (action == 2) {
            handMove(motionEvent);
        }
        return true;
    }

    private void handMove(MotionEvent motionEvent) {
        float x = motionEvent.getX() - this.lastTouchedPosition;
        if (x != 0.0f) {
            if (!this.scrollStarted) {
                this.scrollStarted = true;
                ScrollingListener scrollingListener = this.scrollingListener;
                if (scrollingListener != null) {
                    scrollingListener.onScrollStart();
                }
            }
            onScroll(motionEvent, x);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.getClipBounds(this.canvasClipBounds);
        int iWidth = this.canvasClipBounds.width();
        int i = this.progressLineWidth + this.progressLineMargin;
        int i2 = iWidth / i;
        float f = this.totalScrollDistance;
        float f2 = i;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i2 / 4;
            if (i3 < i4) {
                this.progressLinePaint.setAlpha((int) ((i3 / i4) * 255.0f));
            } else if (i3 > (i2 * 3) / 4) {
                this.progressLinePaint.setAlpha((int) (((i2 - i3) / i4) * 255.0f));
            } else {
                this.progressLinePaint.setAlpha(255);
            }
            float f3 = -(f % f2);
            float f4 = this.canvasClipBounds.left;
            float f5 = this.canvasClipBounds.left;
            canvas.drawLine(f4 + f3 + ((this.progressLineWidth + this.progressLineMargin) * i3), this.canvasClipBounds.centerY() - (this.progressLineHeight / 4.0f), f3 + f5 + ((this.progressLineWidth + this.progressLineMargin) * i3), this.canvasClipBounds.centerY() + (this.progressLineHeight / 4.0f), this.progressLinePaint);
        }
        canvas.drawLine(this.canvasClipBounds.centerX(), this.canvasClipBounds.centerY() - (this.progressLineHeight / 2.0f), this.canvasClipBounds.centerX(), this.canvasClipBounds.centerY() + (this.progressLineHeight / 2.0f), this.progressMiddleLinePaint);
    }

    private void onScroll(MotionEvent motionEvent, float f) {
        this.totalScrollDistance -= f;
        postInvalidate();
        this.lastTouchedPosition = motionEvent.getX();
        ScrollingListener scrollingListener = this.scrollingListener;
        if (scrollingListener != null) {
            scrollingListener.onScroll(-f, this.totalScrollDistance);
        }
    }

    private void init() {
        this.middleLineColor = ContextCompat.getColor(getContext(), R.color.ucrop_color_widget_rotate_mid_line);
        this.progressLineWidth = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_width_horizontal_wheel_progress_line);
        this.progressLineHeight = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_height_horizontal_wheel_progress_line);
        this.progressLineMargin = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_margin_horizontal_wheel_progress_line);
        Paint paint = new Paint(1);
        this.progressLinePaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.progressLinePaint.setStrokeWidth(this.progressLineWidth);
        this.progressLinePaint.setColor(getResources().getColor(R.color.ucrop_color_progress_wheel_line));
        Paint paint2 = new Paint(this.progressLinePaint);
        this.progressMiddleLinePaint = paint2;
        paint2.setColor(this.middleLineColor);
        this.progressMiddleLinePaint.setStrokeCap(Paint.Cap.ROUND);
        this.progressMiddleLinePaint.setStrokeWidth(getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_width_middle_wheel_progress_line));
    }
}
