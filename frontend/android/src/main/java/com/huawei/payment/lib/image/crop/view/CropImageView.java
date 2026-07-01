package com.huawei.payment.lib.image.crop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import com.huawei.payment.lib.image.R;
import com.huawei.payment.lib.image.crop.callback.BitmapCropCallback;
import com.huawei.payment.lib.image.crop.callback.CropBoundsChangeListener;
import com.huawei.payment.lib.image.crop.model.CropParameters;
import com.huawei.payment.lib.image.crop.model.ImageState;
import com.huawei.payment.lib.image.crop.task.BitmapCropTask;
import com.huawei.payment.lib.image.crop.util.CubicEasing;
import com.huawei.payment.lib.image.crop.util.RectUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class CropImageView extends TransformView {
    public static final float DEFAULT_ASPECT_RATIO = 0.0f;
    public static final int DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION = 500;
    public static final int DEFAULT_MAX_BITMAP_SIZE = 0;
    public static final float DEFAULT_MAX_SCALE_MULTIPLIER = 10.0f;
    public static final float SOURCE_IMAGE_ASPECT_RATIO = 0.0f;
    private CropBoundsChangeListener cropBoundsChangeListener;
    private final RectF cropRect;
    private long imageToWrapCropBoundsAnimDuration;
    private int maxResultImageSizeX;
    private int maxResultImageSizeY;
    private float maxScale;
    private float maxScaleMultiplier;
    private float minScale;
    private float targetAspectRatio;
    private final Matrix tempMatrix;
    private Runnable wrapCropBoundsRunnable;
    private Runnable zoomImageToPositionRunnable;

    public CropImageView(Context context) {
        this(context, null);
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.cropRect = new RectF();
        this.tempMatrix = new Matrix();
        this.maxScaleMultiplier = 10.0f;
        this.maxResultImageSizeX = 0;
        this.maxResultImageSizeY = 0;
        this.imageToWrapCropBoundsAnimDuration = 500L;
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void cropAndSaveImage(Bitmap.CompressFormat compressFormat, int i, BitmapCropCallback bitmapCropCallback) {
        cancelAllAnimations();
        setImageToWrapCropBound(false);
        ImageState imageState = new ImageState(this.cropRect, RectUtils.trapToRect(this.currentImageCorners), getCurrentScale(), getCurrentAngle());
        CropParameters cropParameters = new CropParameters(this.maxResultImageSizeX, this.maxResultImageSizeY, compressFormat, i, getImageInputPath(), getImageOutputPath(), getExifInfo());
        cropParameters.setContentImageInputUri(getImageInputUri());
        cropParameters.setContentImageOutputUri(getImageOutputUri());
        new BitmapCropTask(getContext(), getViewBitmap(), imageState, cropParameters, bitmapCropCallback).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public float getMaxScale() {
        return this.maxScale;
    }

    public float getMinScale() {
        return this.minScale;
    }

    public float getTargetAspectRatio() {
        return this.targetAspectRatio;
    }

    public void setTargetAspectRatio(float f) {
        if (getDrawable() == null) {
            this.targetAspectRatio = f;
            return;
        }
        if (f == 0.0f) {
            this.targetAspectRatio = r0.getIntrinsicWidth() / r0.getIntrinsicHeight();
        } else {
            this.targetAspectRatio = f;
        }
        CropBoundsChangeListener cropBoundsChangeListener = this.cropBoundsChangeListener;
        if (cropBoundsChangeListener != null) {
            cropBoundsChangeListener.onCropAspectRatioChanged(this.targetAspectRatio);
        }
    }

    public void setCropRect(RectF rectF) {
        this.targetAspectRatio = rectF.width() / rectF.height();
        this.cropRect.set(rectF.left - getPaddingLeft(), rectF.top - getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        calculateImageScaleBounds();
        setImageToWrapCropBound();
    }

    public CropBoundsChangeListener getCropBoundsChangeListener() {
        return this.cropBoundsChangeListener;
    }

    public void setCropBoundsChangeListener(CropBoundsChangeListener cropBoundsChangeListener) {
        this.cropBoundsChangeListener = cropBoundsChangeListener;
    }

    public void setMaxResultImageSizeX(int i) {
        this.maxResultImageSizeX = i;
    }

    public void setMaxResultImageSizeY(int i) {
        this.maxResultImageSizeY = i;
    }

    public void setImageToWrapCropBoundsAnimDuration(long j) {
        if (j > 0) {
            this.imageToWrapCropBoundsAnimDuration = j;
            return;
        }
        throw new IllegalArgumentException("Animation duration cannot be negative value.");
    }

    public void setMaxScaleMultiplier(float f) {
        this.maxScaleMultiplier = f;
    }

    public void zoomOutImage(float f) {
        zoomOutImage(f, this.cropRect.centerX(), this.cropRect.centerY());
    }

    public void zoomOutImage(float f, float f2, float f3) {
        if (f >= getMinScale()) {
            postScale(f / getCurrentScale(), f2, f3);
        }
    }

    public void zoomInImage(float f) {
        zoomInImage(f, this.cropRect.centerX(), this.cropRect.centerY());
    }

    public void zoomInImage(float f, float f2, float f3) {
        if (f <= getMaxScale()) {
            postScale(f / getCurrentScale(), f2, f3);
        }
    }

    @Override
    public void postScale(float f, float f2, float f3) {
        if (f > 1.0f && getCurrentScale() * f <= getMaxScale()) {
            super.postScale(f, f2, f3);
        } else {
            if (f >= 1.0f || getCurrentScale() * f < getMinScale()) {
                return;
            }
            super.postScale(f, f2, f3);
        }
    }

    public void postRotate(float f) {
        postRotate(f, this.cropRect.centerX(), this.cropRect.centerY());
    }

    public void cancelAllAnimations() {
        removeCallbacks(this.wrapCropBoundsRunnable);
        removeCallbacks(this.zoomImageToPositionRunnable);
    }

    public void setImageToWrapCropBound() {
        setImageToWrapCropBound(true);
    }

    public void setImageToWrapCropBound(boolean z) {
        float f;
        float fMax;
        float f2;
        if (!this.bitmapLaidOut || isImageWrapCropBounds()) {
            return;
        }
        float f3 = this.currentImageCenter[0];
        float f4 = this.currentImageCenter[1];
        float currentScale = getCurrentScale();
        float fCenterX = this.cropRect.centerX() - f3;
        float fCenterY = this.cropRect.centerY() - f4;
        this.tempMatrix.reset();
        this.tempMatrix.setTranslate(fCenterX, fCenterY);
        float[] fArrCopyOf = Arrays.copyOf(this.currentImageCorners, this.currentImageCorners.length);
        this.tempMatrix.mapPoints(fArrCopyOf);
        boolean zIsImageWrapCropBounds = isImageWrapCropBounds(fArrCopyOf);
        if (zIsImageWrapCropBounds) {
            float[] fArrCalculateImageIndents = calculateImageIndents();
            float f5 = -(fArrCalculateImageIndents[0] + fArrCalculateImageIndents[2]);
            f2 = -(fArrCalculateImageIndents[1] + fArrCalculateImageIndents[3]);
            f = f5;
            fMax = 0.0f;
        } else {
            RectF rectF = new RectF(this.cropRect);
            this.tempMatrix.reset();
            this.tempMatrix.setRotate(getCurrentAngle());
            this.tempMatrix.mapRect(rectF);
            float[] rectSidesFromCorners = RectUtils.getRectSidesFromCorners(this.currentImageCorners);
            f = fCenterX;
            fMax = (Math.max(rectF.width() / rectSidesFromCorners[0], rectF.height() / rectSidesFromCorners[1]) * currentScale) - currentScale;
            f2 = fCenterY;
        }
        if (z) {
            ShareDataUIState shareDataUIState = new ShareDataUIState(this, this.imageToWrapCropBoundsAnimDuration, f3, f4, f, f2, currentScale, fMax, zIsImageWrapCropBounds);
            this.wrapCropBoundsRunnable = shareDataUIState;
            post(shareDataUIState);
        } else {
            postTranslate(f, f2);
            if (zIsImageWrapCropBounds) {
                return;
            }
            zoomInImage(currentScale + fMax, this.cropRect.centerX(), this.cropRect.centerY());
        }
    }

    private float[] calculateImageIndents() {
        this.tempMatrix.reset();
        this.tempMatrix.setRotate(-getCurrentAngle());
        float[] fArrCopyOf = Arrays.copyOf(this.currentImageCorners, this.currentImageCorners.length);
        float[] cornersFromRect = RectUtils.getCornersFromRect(this.cropRect);
        this.tempMatrix.mapPoints(fArrCopyOf);
        this.tempMatrix.mapPoints(cornersFromRect);
        RectF rectFTrapToRect = RectUtils.trapToRect(fArrCopyOf);
        RectF rectFTrapToRect2 = RectUtils.trapToRect(cornersFromRect);
        float f = rectFTrapToRect.left - rectFTrapToRect2.left;
        float f2 = rectFTrapToRect.top - rectFTrapToRect2.top;
        float f3 = rectFTrapToRect.right - rectFTrapToRect2.right;
        float f4 = rectFTrapToRect.bottom - rectFTrapToRect2.bottom;
        if (f <= 0.0f) {
            f = 0.0f;
        }
        if (f2 <= 0.0f) {
            f2 = 0.0f;
        }
        if (f3 >= 0.0f) {
            f3 = 0.0f;
        }
        if (f4 >= 0.0f) {
            f4 = 0.0f;
        }
        float[] fArr = {f, f2, f3, f4};
        this.tempMatrix.reset();
        this.tempMatrix.setRotate(getCurrentAngle());
        this.tempMatrix.mapPoints(fArr);
        return fArr;
    }

    @Override
    protected void onImageLaidOut() {
        super.onImageLaidOut();
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight == 0.0f) {
            return;
        }
        if (this.targetAspectRatio == 0.0f) {
            this.targetAspectRatio = intrinsicWidth / intrinsicHeight;
        }
        if (this.targetAspectRatio == 0.0f) {
            return;
        }
        int i = (int) (this.thisWidth / this.targetAspectRatio);
        if (i > this.thisHeight) {
            this.cropRect.set((this.thisWidth - ((int) (this.thisHeight * this.targetAspectRatio))) / 2, 0.0f, r3 + r4, this.thisHeight);
        } else {
            this.cropRect.set(0.0f, (this.thisHeight - i) / 2, this.thisWidth, i + r4);
        }
        calculateImageScaleBounds(intrinsicWidth, intrinsicHeight);
        setupInitialImagePosition(intrinsicWidth, intrinsicHeight);
        CropBoundsChangeListener cropBoundsChangeListener = this.cropBoundsChangeListener;
        if (cropBoundsChangeListener != null) {
            cropBoundsChangeListener.onCropAspectRatioChanged(this.targetAspectRatio);
        }
        if (this.transformImageListener != null) {
            this.transformImageListener.onScale(getCurrentScale());
            this.transformImageListener.onRotate(getCurrentAngle());
        }
    }

    protected boolean isImageWrapCropBounds() {
        return isImageWrapCropBounds(this.currentImageCorners);
    }

    protected boolean isImageWrapCropBounds(float[] fArr) {
        this.tempMatrix.reset();
        this.tempMatrix.setRotate(-getCurrentAngle());
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        this.tempMatrix.mapPoints(fArrCopyOf);
        float[] cornersFromRect = RectUtils.getCornersFromRect(this.cropRect);
        this.tempMatrix.mapPoints(cornersFromRect);
        return RectUtils.trapToRect(fArrCopyOf).contains(RectUtils.trapToRect(cornersFromRect));
    }

    protected void zoomImageToPosition(float f, float f2, float f3, long j) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        float currentScale = getCurrentScale();
        copydefault copydefaultVar = new copydefault(this, j, currentScale, f - currentScale, f2, f3);
        this.zoomImageToPositionRunnable = copydefaultVar;
        post(copydefaultVar);
    }

    private void calculateImageScaleBounds() {
        if (getDrawable() == null) {
            return;
        }
        calculateImageScaleBounds(r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
    }

    private void calculateImageScaleBounds(float f, float f2) {
        float fMin = Math.min(Math.min(this.cropRect.width() / f, this.cropRect.width() / f2), Math.min(this.cropRect.height() / f2, this.cropRect.height() / f));
        this.minScale = fMin;
        this.maxScale = fMin * this.maxScaleMultiplier;
    }

    private void setupInitialImagePosition(float f, float f2) {
        float fWidth = this.cropRect.width();
        float fHeight = this.cropRect.height();
        float fMax = Math.max(this.cropRect.width() / f, this.cropRect.height() / f2);
        float f3 = this.cropRect.top;
        this.currentImageMatrix.reset();
        this.currentImageMatrix.postScale(fMax, fMax);
        this.currentImageMatrix.postTranslate(((fWidth - (f * fMax)) / 2.0f) + this.cropRect.left, ((fHeight - (f2 * fMax)) / 2.0f) + f3);
        setImageMatrix(this.currentImageMatrix);
    }

    protected void processStyledAttributes(TypedArray typedArray) {
        float fAbs = Math.abs(typedArray.getFloat(R.styleable.ucrop_UCropView_ucrop_aspect_ratio_x, 0.0f));
        float fAbs2 = Math.abs(typedArray.getFloat(R.styleable.ucrop_UCropView_ucrop_aspect_ratio_y, 0.0f));
        if (fAbs == 0.0f || fAbs2 == 0.0f) {
            this.targetAspectRatio = 0.0f;
        } else {
            this.targetAspectRatio = fAbs / fAbs2;
        }
    }

    static class ShareDataUIState implements Runnable {
        private final WeakReference<CropImageView> ShareDataUIState;
        private final float component1;
        private final float component2;
        private final long component3;
        private final long component4 = System.currentTimeMillis();
        private final float copy;
        private final float copydefault;
        private final float equals;
        private final float getAsAtTimestamp;
        private final boolean getRequestBeneficiariesState;

        public ShareDataUIState(CropImageView cropImageView, long j, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
            this.ShareDataUIState = new WeakReference<>(cropImageView);
            this.component3 = j;
            this.getAsAtTimestamp = f;
            this.equals = f2;
            this.component2 = f3;
            this.copydefault = f4;
            this.copy = f5;
            this.component1 = f6;
            this.getRequestBeneficiariesState = z;
        }

        @Override
        public void run() {
            CropImageView cropImageView = this.ShareDataUIState.get();
            if (cropImageView == null) {
                return;
            }
            float fMin = Math.min(this.component3, System.currentTimeMillis() - this.component4);
            float fEaseOut = CubicEasing.easeOut(fMin, 0.0f, this.component2, this.component3);
            float fEaseOut2 = CubicEasing.easeOut(fMin, 0.0f, this.copydefault, this.component3);
            float fEaseInOut = CubicEasing.easeInOut(fMin, 0.0f, this.component1, this.component3);
            if (fMin < this.component3) {
                cropImageView.postTranslate(fEaseOut - (cropImageView.currentImageCenter[0] - this.getAsAtTimestamp), fEaseOut2 - (cropImageView.currentImageCenter[1] - this.equals));
                if (!this.getRequestBeneficiariesState) {
                    cropImageView.zoomInImage(this.copy + fEaseInOut, cropImageView.cropRect.centerX(), cropImageView.cropRect.centerY());
                }
                if (cropImageView.isImageWrapCropBounds()) {
                    return;
                }
                cropImageView.post(this);
            }
        }
    }

    static class copydefault implements Runnable {
        private final WeakReference<CropImageView> ShareDataUIState;
        private final float component1;
        private final float component2;
        private final long component3;
        private final float copydefault;
        private final long getAsAtTimestamp = System.currentTimeMillis();
        private final float getRequestBeneficiariesState;

        public copydefault(CropImageView cropImageView, long j, float f, float f2, float f3, float f4) {
            this.ShareDataUIState = new WeakReference<>(cropImageView);
            this.component3 = j;
            this.getRequestBeneficiariesState = f;
            this.component1 = f2;
            this.component2 = f3;
            this.copydefault = f4;
        }

        @Override
        public void run() {
            CropImageView cropImageView = this.ShareDataUIState.get();
            if (cropImageView == null) {
                return;
            }
            float fMin = Math.min(this.component3, System.currentTimeMillis() - this.getAsAtTimestamp);
            float fEaseInOut = CubicEasing.easeInOut(fMin, 0.0f, this.component1, this.component3);
            if (fMin < this.component3) {
                cropImageView.zoomInImage(this.getRequestBeneficiariesState + fEaseInOut, this.component2, this.copydefault);
                cropImageView.post(this);
            } else {
                cropImageView.setImageToWrapCropBound();
            }
        }
    }
}
