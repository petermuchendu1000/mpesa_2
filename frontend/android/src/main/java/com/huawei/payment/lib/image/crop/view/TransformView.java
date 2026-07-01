package com.huawei.payment.lib.image.crop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.payment.lib.image.crop.callback.BitmapLoadCallback;
import com.huawei.payment.lib.image.crop.model.ExifInfo;
import com.huawei.payment.lib.image.crop.util.BitmapLoadUtils;
import com.huawei.payment.lib.image.crop.util.FastBitmapDrawable;
import com.huawei.payment.lib.image.crop.util.RectUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;

public class TransformView extends AppCompatImageView {
    private static final int MATRIX_VALUES_COUNT = 9;
    private static final int RECT_CENTER_POINT_COORDS = 2;
    private static final int RECT_CORNER_POINTS_COORDS = 8;
    protected boolean bitmapDecoded;
    protected boolean bitmapLaidOut;
    protected final float[] currentImageCenter;
    protected final float[] currentImageCorners;
    protected Matrix currentImageMatrix;
    private ExifInfo exifInfo;
    private String imageInputPath;
    private Uri imageInputUri;
    private String imageOutputPath;
    private Uri imageOutputUri;
    private float[] initialImageCenter;
    private float[] initialImageCorners;
    private final float[] matrixValues;
    private int maxBitmapSize;
    protected int thisHeight;
    protected int thisWidth;
    protected TransformImageListener transformImageListener;

    public interface TransformImageListener {
        void onLoadComplete();

        void onLoadFailure(Exception exc);

        void onRotate(float f);

        void onScale(float f);
    }

    public TransformView(Context context) {
        this(context, null);
    }

    public TransformView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TransformView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.currentImageCorners = new float[8];
        this.currentImageCenter = new float[2];
        this.matrixValues = new float[9];
        this.currentImageMatrix = new Matrix();
        this.bitmapDecoded = false;
        this.bitmapLaidOut = false;
        this.maxBitmapSize = 0;
        init();
    }

    @Override
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        }
    }

    public int getMaxBitmapSize() {
        if (this.maxBitmapSize <= 0) {
            this.maxBitmapSize = BitmapLoadUtils.calculateMaxBitmapSize(getContext());
        }
        return this.maxBitmapSize;
    }

    public void setMaxBitmapSize(int i) {
        this.maxBitmapSize = i;
    }

    public void setTransformImageListener(TransformImageListener transformImageListener) {
        this.transformImageListener = transformImageListener;
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new FastBitmapDrawable(bitmap));
    }

    public String getImageInputPath() {
        return this.imageInputPath;
    }

    public String getImageOutputPath() {
        return this.imageOutputPath;
    }

    public Uri getImageInputUri() {
        return this.imageInputUri;
    }

    public Uri getImageOutputUri() {
        return this.imageOutputUri;
    }

    public ExifInfo getExifInfo() {
        return this.exifInfo;
    }

    public void setImageUri(Uri uri, Uri uri2) throws Exception {
        int maxBitmapSize = getMaxBitmapSize();
        BitmapLoadUtils.decodeBitmapInBackground(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new BitmapLoadCallback() {
            @Override
            public void onBitmapLoaded(Bitmap bitmap, ExifInfo exifInfo, Uri uri3, Uri uri4) {
                TransformView.this.imageInputUri = uri3;
                TransformView.this.imageOutputUri = uri4;
                TransformView.this.imageInputPath = uri3.getPath();
                TransformView.this.imageOutputPath = uri4 != null ? uri4.getPath() : null;
                TransformView.this.exifInfo = exifInfo;
                TransformView.this.bitmapDecoded = true;
                TransformView.this.setImageBitmap(bitmap);
            }

            @Override
            public void onFailure(Exception exc) {
                if (TransformView.this.transformImageListener != null) {
                    TransformView.this.transformImageListener.onLoadFailure(exc);
                }
            }
        });
    }

    public float getCurrentScale() {
        return getMatrixScale(this.currentImageMatrix);
    }

    public float getMatrixScale(Matrix matrix) {
        return (float) Math.sqrt(Math.pow(getMatrixValue(matrix, 0), 2.0d) + Math.pow(getMatrixValue(matrix, 3), 2.0d));
    }

    public float getCurrentAngle() {
        return getMatrixAngle(this.currentImageMatrix);
    }

    public float getMatrixAngle(Matrix matrix) {
        return (float) (-(Math.atan2(getMatrixValue(matrix, 1), getMatrixValue(matrix, 0)) * 57.29577951308232d));
    }

    @Override
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.currentImageMatrix.set(matrix);
        updateCurrentImagePoint();
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof FastBitmapDrawable)) {
            return null;
        }
        return ((FastBitmapDrawable) getDrawable()).getBitmap();
    }

    public void postTranslate(float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            return;
        }
        this.currentImageMatrix.postTranslate(f, f2);
        setImageMatrix(this.currentImageMatrix);
    }

    public void postScale(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.currentImageMatrix.postScale(f, f, f2, f3);
            setImageMatrix(this.currentImageMatrix);
            TransformImageListener transformImageListener = this.transformImageListener;
            if (transformImageListener != null) {
                transformImageListener.onScale(getMatrixScale(this.currentImageMatrix));
            }
        }
    }

    public void postRotate(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.currentImageMatrix.postRotate(f, f2, f3);
            setImageMatrix(this.currentImageMatrix);
            TransformImageListener transformImageListener = this.transformImageListener;
            if (transformImageListener != null) {
                transformImageListener.onRotate(getMatrixAngle(this.currentImageMatrix));
            }
        }
    }

    private void init() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || (this.bitmapDecoded && !this.bitmapLaidOut)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth();
            int paddingRight = getPaddingRight();
            int height = getHeight();
            int paddingBottom = getPaddingBottom();
            this.thisWidth = (width - paddingRight) - paddingLeft;
            this.thisHeight = (height - paddingBottom) - paddingTop;
            onImageLaidOut();
        }
    }

    protected void onImageLaidOut() {
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(((Process.getThreadPriority(0) + 20) >> 6) + 67, TextUtils.indexOf("", "") + 33, (char) (19696 - Color.red(0)), 518907119, false, "component3", null);
        }
        int i = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37, (ViewConfiguration.getWindowTouchSlop() >> 8) + 30, (char) ExpandableListView.getPackedPositionType(0L), 55511118, false, "component2", null);
        }
        int i2 = ((Field) objCopydefault2).getInt(null);
        long j = i2;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - KeyEvent.getDeadChar(0, 0), Process.getGidForName("") + 31, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 58536393, false, "component3", null);
        }
        int i3 = ((Field) objCopydefault3).getInt(null);
        long j2 = 220;
        long j3 = -1;
        long jUptimeMillis = (int) SystemClock.uptimeMillis();
        long j4 = jUptimeMillis ^ j3;
        long j5 = (((long) 221) * 2748653033338932915L) + (((long) (-219)) * (-1955949579694728491L)) + (((((j3 ^ 2748653033338932915L) | (j3 ^ (-1955949579694728491L))) ^ j3) | ((j4 | (-1801651511499972873L)) ^ j3)) * j2) + (((long) (-440)) * (((j4 | (-1955949579694728491L)) ^ j3) | 2748653033338932915L)) + (j2 * ((-1801651511499972873L) | jUptimeMillis));
        long j6 = j;
        int i4 = 0;
        while (true) {
            for (int i5 = 0; i5 != 8; i5++) {
                i3 = (((((int) (j6 >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j6 = j5;
        }
        if (i3 != i) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(View.getDefaultSize(0, 0) + 67, 33 - View.resolveSize(0, 0), (char) (19696 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault4).get(null);
            long j7 = -1;
            long j8 = 0;
            long j9 = (((long) (i2 ^ i)) & ((((long) 0) << 32) | (j7 - ((j7 >> 63) << 32)))) | (((long) 1) << 32) | (j8 - ((j8 >> 63) << 32));
            try {
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault5 == null) {
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 6618, 42 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (ViewConfiguration.getTouchSlop() >> 8), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                Object[] objArr = {1448831415, Long.valueOf(j9), obj, null, false, false};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6561 - MotionEvent.axisFromString(""), 57 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault6).invoke(objInvoke, objArr);
                int[] iArr = new int[i2];
                int i6 = i2 - 1;
                iArr[i6] = 1;
                Toast.makeText((Context) null, iArr[((i6 * i2) % 2) - 1], 1).show();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (getDrawable() == null) {
            return;
        }
        RectF rectF = new RectF(0, 0, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        this.initialImageCorners = RectUtils.getCornersFromRect(rectF);
        this.initialImageCenter = RectUtils.getCenterFromRect(rectF);
        this.bitmapLaidOut = true;
        TransformImageListener transformImageListener = this.transformImageListener;
        if (transformImageListener != null) {
            transformImageListener.onLoadComplete();
        }
    }

    protected float getMatrixValue(Matrix matrix, int i) {
        matrix.getValues(this.matrixValues);
        return this.matrixValues[i];
    }

    private void updateCurrentImagePoint() {
        this.currentImageMatrix.mapPoints(this.currentImageCorners, this.initialImageCorners);
        this.currentImageMatrix.mapPoints(this.currentImageCenter, this.initialImageCenter);
    }
}
