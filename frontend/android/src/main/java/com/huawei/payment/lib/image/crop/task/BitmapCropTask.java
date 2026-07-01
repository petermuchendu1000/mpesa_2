package com.huawei.payment.lib.image.crop.task;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.common.util.L;
import com.huawei.payment.lib.image.crop.callback.BitmapCropCallback;
import com.huawei.payment.lib.image.crop.model.CropParameters;
import com.huawei.payment.lib.image.crop.model.ImageState;
import com.huawei.payment.lib.image.crop.util.BitmapLoadUtils;
import com.huawei.payment.lib.image.crop.util.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;

public class BitmapCropTask extends AsyncTask<Void, Void, Throwable> {
    private final String ArtificialStackFrames;
    private final int CoroutineDebuggingKt;
    private final WeakReference<Context> ShareDataUIState;
    private final Uri accessartificialFrame;
    private final BitmapCropCallback component1;
    private final int component2;
    private int component3;
    private int component4;
    private int copy;
    private final Bitmap.CompressFormat copydefault;
    private Bitmap coroutineBoundary;
    private final int coroutineCreation;
    private int equals;
    private final RectF getAsAtTimestamp;
    private float getRequestBeneficiariesState;
    private float getShareableDataState;
    private final Uri getSponsorBeneficiariesState;
    private final String hashCode;
    private final RectF toString;

    public BitmapCropTask(Context context, Bitmap bitmap, ImageState imageState, CropParameters cropParameters, BitmapCropCallback bitmapCropCallback) {
        this.ShareDataUIState = new WeakReference<>(context);
        this.coroutineBoundary = bitmap;
        this.getAsAtTimestamp = imageState.getCropRect();
        this.toString = imageState.getCurrentImageRect();
        this.getShareableDataState = imageState.getCurrentScale();
        this.getRequestBeneficiariesState = imageState.getCurrentAngle();
        this.CoroutineDebuggingKt = cropParameters.getMaxResultImageSizeX();
        this.coroutineCreation = cropParameters.getMaxResultImageSizeY();
        this.copydefault = cropParameters.getCompressFormat();
        this.component2 = cropParameters.getCompressQuality();
        this.hashCode = cropParameters.getImageInputPath();
        this.ArtificialStackFrames = cropParameters.getImageOutputPath();
        this.getSponsorBeneficiariesState = cropParameters.getContentImageInputUri();
        this.accessartificialFrame = cropParameters.getContentImageOutputUri();
        this.component1 = bitmapCropCallback;
    }

    @Override
    public Throwable doInBackground(Void... voidArr) {
        Bitmap bitmap = this.coroutineBoundary;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.toString.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        if (this.accessartificialFrame == null) {
            return new NullPointerException("ImageOutputUri is null");
        }
        try {
            component3();
            this.coroutineBoundary = null;
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    private void component3() throws Throwable {
        Context context = this.ShareDataUIState.get();
        if (context == null) {
            return;
        }
        if (this.CoroutineDebuggingKt > 0 && this.coroutineCreation > 0) {
            float fWidth = this.getAsAtTimestamp.width() / this.getShareableDataState;
            float fHeight = this.getAsAtTimestamp.height() / this.getShareableDataState;
            float f = this.CoroutineDebuggingKt;
            if (fWidth > f || fHeight > this.coroutineCreation) {
                float fMin = Math.min(f / fWidth, this.coroutineCreation / fHeight);
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(this.coroutineBoundary, Math.round(r2.getWidth() * fMin), Math.round(this.coroutineBoundary.getHeight() * fMin), false);
                Bitmap bitmap = this.coroutineBoundary;
                if (bitmap != bitmapCreateScaledBitmap) {
                    bitmap.recycle();
                }
                this.coroutineBoundary = bitmapCreateScaledBitmap;
                this.getShareableDataState /= fMin;
            }
        }
        if (this.getRequestBeneficiariesState != 0.0f) {
            Matrix matrix = new Matrix();
            matrix.setRotate(this.getRequestBeneficiariesState, this.coroutineBoundary.getWidth() / 2, this.coroutineBoundary.getHeight() / 2);
            Bitmap bitmap2 = this.coroutineBoundary;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), this.coroutineBoundary.getHeight(), matrix, true);
            Bitmap bitmap3 = this.coroutineBoundary;
            if (bitmap3 != bitmapCreateBitmap) {
                bitmap3.recycle();
            }
            this.coroutineBoundary = bitmapCreateBitmap;
        }
        this.component3 = Math.round((this.getAsAtTimestamp.left - this.toString.left) / this.getShareableDataState);
        this.component4 = Math.round((this.getAsAtTimestamp.top - this.toString.top) / this.getShareableDataState);
        this.equals = Math.round(this.getAsAtTimestamp.width() / this.getShareableDataState);
        int iRound = Math.round(this.getAsAtTimestamp.height() / this.getShareableDataState);
        this.copy = iRound;
        if (component2(this.equals, iRound)) {
            component3(Bitmap.createBitmap(this.coroutineBoundary, this.component3, this.component4, this.equals, this.copy));
            if (this.copydefault.equals(Bitmap.CompressFormat.JPEG)) {
                ShareDataUIState(context);
                return;
            }
            return;
        }
        BitmapLoadUtils.copyFile(context, this.getSponsorBeneficiariesState, this.accessartificialFrame);
    }

    private void ShareDataUIState(Context context) throws Throwable {
        boolean zHasContentScheme = BitmapLoadUtils.hasContentScheme(this.getSponsorBeneficiariesState);
        boolean zHasContentScheme2 = BitmapLoadUtils.hasContentScheme(this.accessartificialFrame);
        if (zHasContentScheme && zHasContentScheme2) {
            ImageHeaderParser.copyExif(context, this.equals, this.copy, this.getSponsorBeneficiariesState, this.accessartificialFrame);
            return;
        }
        if (zHasContentScheme) {
            ImageHeaderParser.copyExif(context, this.equals, this.copy, this.getSponsorBeneficiariesState, this.ArtificialStackFrames);
        } else if (zHasContentScheme2) {
            ImageHeaderParser.copyExif(context, new ExifInterface(this.hashCode), this.equals, this.copy, this.accessartificialFrame);
        } else {
            ImageHeaderParser.copyExif(new ExifInterface(this.hashCode), this.equals, this.copy, this.ArtificialStackFrames);
        }
    }

    private void component3(Bitmap bitmap) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        OutputStream outputStreamOpenOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        Context context = this.ShareDataUIState.get();
        if (context == null) {
            return;
        }
        OutputStream outputStream = null;
        byteArrayOutputStream = null;
        byteArrayOutputStream = null;
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        try {
            outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(this.accessartificialFrame);
            try {
                try {
                    byteArrayOutputStream2 = new ByteArrayOutputStream();
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                bitmap.compress(this.copydefault, this.component2, byteArrayOutputStream2);
                outputStreamOpenOutputStream.write(byteArrayOutputStream2.toByteArray());
                bitmap.recycle();
                BitmapLoadUtils.close(outputStreamOpenOutputStream);
            } catch (IOException e2) {
                e = e2;
                byteArrayOutputStream3 = byteArrayOutputStream2;
                L.e(e.getMessage());
                BitmapLoadUtils.close(outputStreamOpenOutputStream);
                byteArrayOutputStream2 = byteArrayOutputStream3;
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream3 = byteArrayOutputStream2;
                ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream3;
                outputStream = outputStreamOpenOutputStream;
                byteArrayOutputStream = byteArrayOutputStream4;
                BitmapLoadUtils.close(outputStream);
                BitmapLoadUtils.close(byteArrayOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            outputStreamOpenOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            BitmapLoadUtils.close(outputStream);
            BitmapLoadUtils.close(byteArrayOutputStream);
            throw th;
        }
        BitmapLoadUtils.close(byteArrayOutputStream2);
    }

    private boolean component2(int i, int i2) {
        int iRound = Math.round(Math.max(i, i2) / 1000.0f) + 1;
        if (this.CoroutineDebuggingKt > 0 && this.coroutineCreation > 0) {
            return true;
        }
        float f = iRound;
        return Math.abs(this.getAsAtTimestamp.left - this.toString.left) > f || Math.abs(this.getAsAtTimestamp.top - this.toString.top) > f || Math.abs(this.getAsAtTimestamp.bottom - this.toString.bottom) > f || Math.abs(this.getAsAtTimestamp.right - this.toString.right) > f || this.getRequestBeneficiariesState != 0.0f;
    }

    @Override
    public void onPostExecute(Throwable th) {
        Uri uriFromFile;
        BitmapCropCallback bitmapCropCallback = this.component1;
        if (bitmapCropCallback != null) {
            if (th == null) {
                if (BitmapLoadUtils.hasContentScheme(this.accessartificialFrame)) {
                    uriFromFile = this.accessartificialFrame;
                } else {
                    uriFromFile = Uri.fromFile(new File(this.ArtificialStackFrames));
                }
                this.component1.onBitmapCropped(uriFromFile, this.component3, this.component4, this.equals, this.copy);
                return;
            }
            bitmapCropCallback.onCropFailure(th);
        }
    }
}
