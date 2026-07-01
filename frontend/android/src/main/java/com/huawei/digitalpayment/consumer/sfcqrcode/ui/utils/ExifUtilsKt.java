package com.huawei.digitalpayment.consumer.sfcqrcode.ui.utils;

import android.graphics.Matrix;
import android.util.Log;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"TAG", "", "computeExifOrientation", "", "rotationDegrees", "mirrored", "", "decodeExifOrientation", "Landroid/graphics/Matrix;", "exifOrientation", "ConsumerSfcQrCodeUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ExifUtilsKt {
    private static int ShareDataUIState = 1;
    private static final String component2 = "ExifUtils";
    private static int component3;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Matrix decodeExifOrientation(int i) {
        int i2;
        int i3 = 2 % 2;
        Matrix matrix = new Matrix();
        switch (i) {
            case 0:
            case 1:
                return matrix;
            case 2:
                matrix.postScale(-1.0f, 1.0f);
                return matrix;
            case 3:
                matrix.postRotate(180.0f);
                i2 = component3 + 37;
                ShareDataUIState = i2 % 128;
                int i4 = i2 % 2;
                return matrix;
            case 4:
                matrix.postScale(1.0f, -1.0f);
                return matrix;
            case 5:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(270.0f);
                i2 = component3 + 29;
                ShareDataUIState = i2 % 128;
                int i42 = i2 % 2;
                return matrix;
            case 6:
                matrix.postRotate(90.0f);
                return matrix;
            case 7:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(90.0f);
                return matrix;
            case 8:
                matrix.postRotate(270.0f);
                return matrix;
            default:
                Log.e(component2, "Invalid orientation: " + i);
                return matrix;
        }
    }

    public static final int computeExifOrientation(int i, boolean z) {
        int i2 = 2 % 2;
        if (i == 0 && (!z)) {
            return 1;
        }
        if (i == 0) {
            int i3 = component3 + 31;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 8 / 0;
                if (z) {
                    return 2;
                }
            } else if (z) {
                return 2;
            }
        }
        if (i == 180 && !z) {
            int i5 = ShareDataUIState + 31;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return 3;
        }
        if (i == 180 && z) {
            int i7 = ShareDataUIState + 83;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return 4;
        }
        if (i != 270 || !z) {
            if (i == 90) {
                int i9 = ShareDataUIState + 113;
                component3 = i9 % 128;
                if (i9 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!z) {
                    return 6;
                }
            }
            if (i == 90 && z) {
                return 5;
            }
            if (i == 270 && z) {
                int i10 = ShareDataUIState + 75;
                component3 = i10 % 128;
                return i10 % 2 != 0 ? 124 : 8;
            }
            if (i != 270 || z) {
                return 0;
            }
        }
        return 7;
    }
}
