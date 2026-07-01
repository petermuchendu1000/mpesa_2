package com.huawei.digitalpayment.customer.dynamics.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0001\u001a\u001a\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003¨\u0006\t"}, d2 = {"subImage", "Landroid/graphics/Bitmap;", "x", "", "y", "width", "height", "grayImage", "scaleImage", "DynamicsView_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BitmapUtilsKt {
    private static int component3 = 0;
    private static int copydefault = 1;

    public static final Bitmap subImage(Bitmap bitmap, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = copydefault + 73;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNullParameter(bitmap, "");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i, i2, i3, i4, (Matrix) null, false);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        int i8 = copydefault + 51;
        component3 = i8 % 128;
        if (i8 % 2 == 0) {
            return bitmapCreateBitmap;
        }
        throw null;
    }

    public static final Bitmap grayImage(Bitmap bitmap) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bitmap, "");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        int i2 = component3 + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return bitmapCreateBitmap;
    }

    public static final Bitmap scaleImage(Bitmap bitmap, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = copydefault + 101;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bitmap, "");
        } else {
            Intrinsics.checkNotNullParameter(bitmap, "");
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "");
        return bitmapCreateScaledBitmap;
    }
}
