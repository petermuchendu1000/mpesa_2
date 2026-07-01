package com.huawei.payment.lib.image.crop.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.huawei.payment.lib.image.R;
import com.huawei.payment.lib.image.crop.callback.OverlayViewChangeListener;
import com.huawei.payment.lib.image.crop.util.RectUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class OverlayView extends View {
    public static final boolean DEFAULT_CIRCLE_DIMMED_LAYER = false;
    public static final int DEFAULT_CROP_GRID_COLUMN_COUNT = 2;
    public static final int DEFAULT_CROP_GRID_ROW_COUNT = 2;
    public static final int DEFAULT_FREESTYLE_CROP_MODE = 0;
    public static final boolean DEFAULT_SHOW_CROP_FRAME = true;
    public static final boolean DEFAULT_SHOW_CROP_GRID = false;
    public static final int FREESTYLE_CROP_MODE_DISABLE = 0;
    public static final int FREESTYLE_CROP_MODE_ENABLE = 1;
    public static final int FREESTYLE_CROP_MODE_ENABLE_WITH_PASS_THROUGH = 2;
    private boolean circleDimmedLayer;
    private final Path circularPath;
    private final Paint cropFrameCornersPaint;
    private final Paint cropFramePaint;
    protected float[] cropGridCenter;
    private int cropGridColumnCount;
    protected float[] cropGridCorners;
    private final Paint cropGridPaint;
    private int cropGridRowCount;
    private final int cropRectCornerTouchAreaLineLength;
    private final int cropRectMinSize;
    private final RectF cropViewRect;
    private int currentTouchCornerIndex;
    private int dimmedColor;
    private final Paint dimmedStrokePaint;
    private int freestyleCropMode;
    private float[] gridPoints;
    private OverlayViewChangeListener overlayViewChangeListener;
    private float previousTouchX;
    private float previousTouchY;
    private boolean shouldSetupCropBounds;
    private boolean showCropFrame;
    private boolean showCropGrid;
    private float targetAspectRatio;
    private final RectF tempRect;
    protected int thisHeight;
    protected int thisWidth;
    private final int touchPointThreshold;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FreestyleMode {
    }

    public OverlayView(Context context) {
        this(context, null);
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.cropViewRect = new RectF();
        this.tempRect = new RectF();
        this.circularPath = new Path();
        this.dimmedStrokePaint = new Paint(1);
        this.cropGridPaint = new Paint(1);
        this.cropFramePaint = new Paint(1);
        this.cropFrameCornersPaint = new Paint(1);
        this.gridPoints = null;
        this.freestyleCropMode = 0;
        this.previousTouchX = -1.0f;
        this.previousTouchY = -1.0f;
        this.currentTouchCornerIndex = -1;
        this.touchPointThreshold = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_threshold);
        this.cropRectMinSize = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_min_size);
        this.cropRectCornerTouchAreaLineLength = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_area_line_length);
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayViewChangeListener getOverlayViewChangeListener() {
        return this.overlayViewChangeListener;
    }

    public void setOverlayViewChangeListener(OverlayViewChangeListener overlayViewChangeListener) {
        this.overlayViewChangeListener = overlayViewChangeListener;
    }

    public RectF getCropViewRect() {
        return this.cropViewRect;
    }

    public boolean isFreestyleCropEnabled() {
        return this.freestyleCropMode == 1;
    }

    public void setFreestyleCropEnabled(boolean z) {
        this.freestyleCropMode = z ? 1 : 0;
    }

    public int getFreestyleCropMode() {
        return this.freestyleCropMode;
    }

    public void setFreestyleCropMode(int i) {
        this.freestyleCropMode = i;
        postInvalidate();
    }

    public void setCircleDimmedLayer(boolean z) {
        this.circleDimmedLayer = z;
    }

    public void setCropGridRowCount(int i) {
        this.cropGridRowCount = i;
        this.gridPoints = null;
    }

    public void setCropGridColumnCount(int i) {
        this.cropGridColumnCount = i;
        this.gridPoints = null;
    }

    public void setShowCropFrame(boolean z) {
        this.showCropFrame = z;
    }

    public void setShowCropGrid(boolean z) {
        this.showCropGrid = z;
    }

    public void setDimmedColor(int i) {
        this.dimmedColor = i;
    }

    public void setCropFrameStrokeWidth(int i) {
        this.cropFramePaint.setStrokeWidth(i);
    }

    public void setCropGridStrokeWidth(int i) {
        this.cropGridPaint.setStrokeWidth(i);
    }

    public void setCropFrameColor(int i) {
        this.cropFramePaint.setColor(i);
    }

    public void setCropGridColor(int i) {
        this.cropGridPaint.setColor(i);
    }

    public void setTargetAspectRatio(float f) {
        this.targetAspectRatio = f;
        if (this.thisWidth > 0) {
            setupCropBounds();
            postInvalidate();
        } else {
            this.shouldSetupCropBounds = true;
        }
    }

    public void setupCropBounds() {
        float f = this.targetAspectRatio;
        if (f == 0.0f) {
            return;
        }
        int i = this.thisWidth;
        int i2 = (int) (i / f);
        int i3 = this.thisHeight;
        if (i2 > i3) {
            int i4 = (i - ((int) (i3 * f))) / 2;
            this.cropViewRect.set(getPaddingLeft() + i4, getPaddingTop(), getPaddingLeft() + r0 + i4, getPaddingTop() + this.thisHeight);
        } else {
            int i5 = (i3 - i2) / 2;
            this.cropViewRect.set(getPaddingLeft(), getPaddingTop() + i5, getPaddingLeft() + this.thisWidth, getPaddingTop() + i2 + i5);
        }
        OverlayViewChangeListener overlayViewChangeListener = this.overlayViewChangeListener;
        if (overlayViewChangeListener != null) {
            overlayViewChangeListener.onCropRect(this.cropViewRect);
        }
        updateGridPoints();
    }

    private void updateGridPoints() {
        this.cropGridCorners = RectUtils.getCornersFromRect(this.cropViewRect);
        this.cropGridCenter = RectUtils.getCenterFromRect(this.cropViewRect);
        this.gridPoints = null;
        this.circularPath.reset();
        this.circularPath.addCircle(this.cropViewRect.centerX(), this.cropViewRect.centerY(), (Math.min(this.cropViewRect.width(), this.cropViewRect.height()) / 2.0f) - dp2px(12.0f), Path.Direction.CW);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth();
            int paddingRight = getPaddingRight();
            int height = getHeight();
            int paddingBottom = getPaddingBottom();
            this.thisWidth = (width - paddingRight) - paddingLeft;
            this.thisHeight = (height - paddingBottom) - paddingTop;
            if (this.shouldSetupCropBounds) {
                this.shouldSetupCropBounds = false;
                setTargetAspectRatio(this.targetAspectRatio);
            }
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawDimmedLayer(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.cropViewRect.isEmpty() && this.freestyleCropMode != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int currentTouchIndex = getCurrentTouchIndex(x, y);
                this.currentTouchCornerIndex = currentTouchIndex;
                boolean z = currentTouchIndex != -1;
                if (!z) {
                    this.previousTouchX = -1.0f;
                    this.previousTouchY = -1.0f;
                } else if (this.previousTouchX < 0.0f) {
                    this.previousTouchX = x;
                    this.previousTouchY = y;
                }
                return z;
            }
            if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.currentTouchCornerIndex != -1) {
                float fMin = Math.min(Math.max(x, getPaddingLeft()), getWidth() - getPaddingRight());
                float fMin2 = Math.min(Math.max(y, getPaddingTop()), getHeight() - getPaddingBottom());
                updateCropViewRect(fMin, fMin2);
                this.previousTouchX = fMin;
                this.previousTouchY = fMin2;
                return true;
            }
            if ((motionEvent.getAction() & 255) == 1) {
                this.previousTouchX = -1.0f;
                this.previousTouchY = -1.0f;
                this.currentTouchCornerIndex = -1;
                OverlayViewChangeListener overlayViewChangeListener = this.overlayViewChangeListener;
                if (overlayViewChangeListener != null) {
                    overlayViewChangeListener.onCropRect(this.cropViewRect);
                }
            }
        }
        return false;
    }

    private void updateCropViewRect(float f, float f2) {
        this.tempRect.set(this.cropViewRect);
        int i = this.currentTouchCornerIndex;
        if (i == 0) {
            this.tempRect.set(f, f2, this.cropViewRect.right, this.cropViewRect.bottom);
        } else if (i == 1) {
            this.tempRect.set(this.cropViewRect.left, f2, f, this.cropViewRect.bottom);
        } else if (i == 2) {
            this.tempRect.set(this.cropViewRect.left, this.cropViewRect.top, f, f2);
        } else if (i == 3) {
            this.tempRect.set(f, this.cropViewRect.top, this.cropViewRect.right, f2);
        } else if (i == 4) {
            this.tempRect.offset(f - this.previousTouchX, f2 - this.previousTouchY);
            if (this.tempRect.left <= getLeft() || this.tempRect.top <= getTop() || this.tempRect.right >= getRight() || this.tempRect.bottom >= getBottom()) {
                return;
            }
            this.cropViewRect.set(this.tempRect);
            updateGridPoints();
            postInvalidate();
            return;
        }
        boolean z = this.tempRect.height() >= ((float) this.cropRectMinSize);
        boolean z2 = this.tempRect.width() >= ((float) this.cropRectMinSize);
        RectF rectF = this.cropViewRect;
        rectF.set(z2 ? this.tempRect.left : rectF.left, (z ? this.tempRect : this.cropViewRect).top, (z2 ? this.tempRect : this.cropViewRect).right, (z ? this.tempRect : this.cropViewRect).bottom);
        if (z || z2) {
            updateGridPoints();
            postInvalidate();
        }
    }

    private int getCurrentTouchIndex(float f, float f2) {
        double d2 = this.touchPointThreshold;
        int i = -1;
        for (int i2 = 0; i2 < 8; i2 += 2) {
            double dSqrt = Math.sqrt(Math.pow(f - this.cropGridCorners[i2], 2.0d) + Math.pow(f2 - this.cropGridCorners[i2 + 1], 2.0d));
            if (dSqrt < d2) {
                i = i2 / 2;
                d2 = dSqrt;
            }
        }
        if (this.freestyleCropMode == 1 && i < 0 && this.cropViewRect.contains(f, f2)) {
            return 4;
        }
        return i;
    }

    protected void drawDimmedLayer(Canvas canvas) {
        canvas.save();
        if (this.circleDimmedLayer) {
            canvas.clipPath(this.circularPath, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.cropViewRect, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.dimmedColor);
        canvas.restore();
        if (this.circleDimmedLayer) {
            canvas.drawCircle(this.cropViewRect.centerX(), this.cropViewRect.centerY(), (Math.min(this.cropViewRect.width(), this.cropViewRect.height()) / 2.0f) - dp2px(12.0f), this.dimmedStrokePaint);
        }
    }

    protected void drawCropGrid(Canvas canvas) {
        if (this.showCropGrid) {
            if (this.gridPoints == null && !this.cropViewRect.isEmpty()) {
                this.gridPoints = new float[(this.cropGridRowCount * 4) + (this.cropGridColumnCount * 4)];
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (i3 < this.cropGridRowCount) {
                    this.gridPoints[i2] = this.cropViewRect.left;
                    float f = i3 + 1.0f;
                    this.gridPoints[i2 + 1] = (this.cropViewRect.height() * (f / (this.cropGridRowCount + 1))) + this.cropViewRect.top;
                    this.gridPoints[i2 + 2] = this.cropViewRect.right;
                    this.gridPoints[i2 + 3] = (this.cropViewRect.height() * (f / (this.cropGridRowCount + 1))) + this.cropViewRect.top;
                    i3++;
                    i2 += 4;
                }
                while (i < this.cropGridColumnCount) {
                    float f2 = i + 1.0f;
                    this.gridPoints[i2] = (this.cropViewRect.width() * (f2 / (this.cropGridColumnCount + 1))) + this.cropViewRect.left;
                    this.gridPoints[i2 + 1] = this.cropViewRect.top;
                    this.gridPoints[i2 + 2] = (this.cropViewRect.width() * (f2 / (this.cropGridColumnCount + 1))) + this.cropViewRect.left;
                    this.gridPoints[i2 + 3] = this.cropViewRect.bottom;
                    i++;
                    i2 += 4;
                }
            }
            float[] fArr = this.gridPoints;
            if (fArr != null) {
                canvas.drawLines(fArr, this.cropGridPaint);
            }
        }
        if (this.showCropFrame) {
            canvas.drawRect(this.cropViewRect, this.cropFramePaint);
        }
        if (this.freestyleCropMode != 0) {
            canvas.save();
            this.tempRect.set(this.cropViewRect);
            this.tempRect.inset(this.cropRectCornerTouchAreaLineLength, -r1);
            canvas.clipRect(this.tempRect, Region.Op.DIFFERENCE);
            this.tempRect.set(this.cropViewRect);
            this.tempRect.inset(-r1, this.cropRectCornerTouchAreaLineLength);
            canvas.clipRect(this.tempRect, Region.Op.DIFFERENCE);
            canvas.drawRect(this.cropViewRect, this.cropFrameCornersPaint);
            canvas.restore();
        }
    }

    protected void processStyledAttributes(TypedArray typedArray) {
        this.circleDimmedLayer = typedArray.getBoolean(R.styleable.ucrop_UCropView_ucrop_circle_dimmed_layer, false);
        this.dimmedColor = typedArray.getColor(R.styleable.ucrop_UCropView_ucrop_dimmed_color, getResources().getColor(R.color.ucrop_color_default_dimmed));
        this.dimmedStrokePaint.setColor(-1);
        this.dimmedStrokePaint.setStyle(Paint.Style.STROKE);
        this.dimmedStrokePaint.setStrokeWidth(dp2px(1.0f));
        initCropFrameStyle(typedArray);
        this.showCropFrame = typedArray.getBoolean(R.styleable.ucrop_UCropView_ucrop_show_frame, true);
        initCropGridStyle(typedArray);
        this.showCropGrid = typedArray.getBoolean(R.styleable.ucrop_UCropView_ucrop_show_grid, false);
    }

    private void initCropFrameStyle(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.ucrop_UCropView_ucrop_frame_stroke_size, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width));
        int color = typedArray.getColor(R.styleable.ucrop_UCropView_ucrop_frame_color, getResources().getColor(R.color.ucrop_color_default_crop_frame));
        this.cropFramePaint.setStrokeWidth(dimensionPixelSize);
        this.cropFramePaint.setColor(color);
        this.cropFramePaint.setStyle(Paint.Style.STROKE);
        this.cropFrameCornersPaint.setStrokeWidth(dimensionPixelSize * 3);
        this.cropFrameCornersPaint.setColor(color);
        this.cropFrameCornersPaint.setStyle(Paint.Style.STROKE);
    }

    public static int dp2px(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    private void initCropGridStyle(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.ucrop_UCropView_ucrop_grid_stroke_size, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width));
        int color = typedArray.getColor(R.styleable.ucrop_UCropView_ucrop_grid_color, getResources().getColor(R.color.ucrop_color_default_crop_grid));
        this.cropGridPaint.setStrokeWidth(dimensionPixelSize);
        this.cropGridPaint.setColor(color);
        this.cropGridRowCount = typedArray.getInt(R.styleable.ucrop_UCropView_ucrop_grid_row_count, 2);
        this.cropGridColumnCount = typedArray.getInt(R.styleable.ucrop_UCropView_ucrop_grid_column_count, 2);
    }
}
