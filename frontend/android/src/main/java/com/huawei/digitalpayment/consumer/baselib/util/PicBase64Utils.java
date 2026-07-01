package com.huawei.digitalpayment.consumer.baselib.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.blankj.utilcode.util.CloseUtils;
import com.huawei.common.util.L;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class PicBase64Utils {
    public static final String BASE64_HEADER_JPG = "data:image/jpg;base64,";
    public static final String BASE64_HEADER_PNG = "data:image/png;base64,";
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static final int component3 = 1000;

    public static String encodeString(Context context, Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String strEncodeString = encodeString(context, uri, 1000);
        int i4 = component1 + 109;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return strEncodeString;
    }

    public static String encodeString(Context context, Uri uri, int i) throws Throwable {
        InputStream inputStreamOpenInputStream;
        int i2 = 2 % 2;
        InputStream inputStream = null;
        try {
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            } catch (FileNotFoundException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            int iComponent2 = component2(context, uri);
            L.d("PicBase64Utils", "encodeString: degree: " + iComponent2);
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
            if (iComponent2 != 0) {
                int i3 = ShareDataUIState + 109;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    component2(bitmapDecodeStream, iComponent2);
                    inputStream.hashCode();
                    throw null;
                }
                bitmapDecodeStream = component2(bitmapDecodeStream, iComponent2);
            }
            String strCompressImageToBase64 = compressImageToBase64(bitmapDecodeStream, i);
            CloseUtils.closeIO(inputStreamOpenInputStream);
            int i4 = component1 + 49;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return strCompressImageToBase64;
        } catch (FileNotFoundException e2) {
            e = e2;
            inputStream = inputStreamOpenInputStream;
            L.d("PicBase64Utils", "encodeString: " + e.getMessage());
            CloseUtils.closeIO(inputStream);
            return "";
        } catch (Throwable th2) {
            th = th2;
            inputStream = inputStreamOpenInputStream;
            CloseUtils.closeIO(inputStream);
            throw th;
        }
    }

    public static String encodeImage(Bitmap bitmap) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        int i = 2 % 2;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            String str = "data:image/jpg;base64," + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            CloseUtils.closeIO(byteArrayOutputStream);
            int i2 = ShareDataUIState + 109;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            byteArrayOutputStream2.hashCode();
            throw null;
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            CloseUtils.closeIO(byteArrayOutputStream2);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap decodeToBitmap(java.lang.String r7) {
        /*
            java.lang.String r0 = "data:image/png;base64,"
            r1 = 2
            int r2 = r1 % r1
            int r2 = com.huawei.digitalpayment.consumer.baselib.util.PicBase64Utils.component1
            int r2 = r2 + 119
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.baselib.util.PicBase64Utils.ShareDataUIState = r3
            int r2 = r2 % r1
            r3 = 0
            java.lang.String r4 = "data:image/jpg;base64,"
            java.lang.String r5 = ""
            if (r2 != 0) goto L1f
            boolean r2 = r7.startsWith(r4)
            r6 = 97
            int r6 = r6 / r3
            if (r2 == 0) goto L26
            goto L31
        L1f:
            boolean r2 = r7.startsWith(r4)
            r6 = 1
            if (r2 == r6) goto L31
        L26:
            boolean r2 = r7.startsWith(r0)
            if (r2 == 0) goto L3e
            java.lang.String r5 = r7.replace(r0, r5)
            goto L3e
        L31:
            int r0 = com.huawei.digitalpayment.consumer.baselib.util.PicBase64Utils.ShareDataUIState
            int r0 = r0 + 29
            int r2 = r0 % 128
            com.huawei.digitalpayment.consumer.baselib.util.PicBase64Utils.component1 = r2
            int r0 = r0 % r1
            java.lang.String r5 = r7.replace(r4, r5)
        L3e:
            byte[] r7 = android.util.Base64.decode(r5, r1)     // Catch: java.lang.Exception -> L48
            int r0 = r7.length     // Catch: java.lang.Exception -> L48
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeByteArray(r7, r3, r0)     // Catch: java.lang.Exception -> L48
            goto L61
        L48:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "decodeToBitmap: "
            r0.<init>(r1)
            java.lang.String r7 = r7.getMessage()
            r0.append(r7)
            java.lang.String r7 = "PicBase64Utils"
            java.lang.String r0 = r0.toString()
            com.huawei.common.util.L.d(r7, r0)
            r7 = 0
        L61:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.PicBase64Utils.decodeToBitmap(java.lang.String):android.graphics.Bitmap");
    }

    public static Bitmap compressImage(Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component1 = i2 % 128;
        return compressImage(bitmap, i2 % 2 != 0 ? 16105 : 1000);
    }

    public static String compressImageToBase64(Bitmap bitmap, int i) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        int i2 = 2 % 2;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                int i3 = 100;
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                int i4 = ShareDataUIState + 99;
                while (true) {
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    if (byteArrayOutputStream.toByteArray().length / 1024 <= i) {
                        String str = "data:image/jpg;base64," + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                        CloseUtils.closeIO(byteArrayOutputStream);
                        return str;
                    }
                    byteArrayOutputStream.reset();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i3, byteArrayOutputStream);
                    i3 -= 10;
                    i4 = ShareDataUIState + 47;
                }
            } catch (Throwable th) {
                th = th;
                CloseUtils.closeIO(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
        }
    }

    public static Bitmap compressImage(Bitmap bitmap, int i) throws Throwable {
        Throwable th;
        ByteArrayInputStream byteArrayInputStream;
        int i2 = 2 % 2;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                int i3 = 100;
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream2);
                int i4 = ShareDataUIState + 63;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 4 / 5;
                }
                while (byteArrayOutputStream2.toByteArray().length / 1024 > i) {
                    int i6 = ShareDataUIState + 61;
                    component1 = i6 % 128;
                    if (i6 % 2 != 0) {
                        byteArrayOutputStream2.reset();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i3, byteArrayOutputStream2);
                        i3 += 114;
                    } else {
                        byteArrayOutputStream2.reset();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i3, byteArrayOutputStream2);
                        i3 -= 10;
                    }
                }
                byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream2.toByteArray());
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(byteArrayInputStream, null, null);
                    CloseUtils.closeIO(byteArrayOutputStream2, byteArrayInputStream);
                    return bitmapDecodeStream;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    CloseUtils.closeIO(byteArrayOutputStream, byteArrayInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayInputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayInputStream = null;
        }
    }

    private static int component2(Context context, Uri uri) {
        int i;
        int i2 = 2 % 2;
        InputStream inputStreamOpenInputStream = null;
        int i3 = 0;
        try {
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            } catch (IOException e) {
                L.d("PicBase64Utils", "getBitmapDegree err: " + e.getMessage());
                CloseUtils.closeIO(null);
            }
            if (inputStreamOpenInputStream != null) {
                int attributeInt = new ExifInterface(inputStreamOpenInputStream).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
                if (attributeInt == 3) {
                    i = 180;
                } else if (attributeInt != 6) {
                    int i4 = component1;
                    int i5 = i4 + 99;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    if (attributeInt != 8) {
                        i = 0;
                    } else {
                        int i7 = i4 + 55;
                        ShareDataUIState = i7 % 128;
                        int i8 = i7 % 2;
                        i = 270;
                    }
                } else {
                    i = 90;
                }
                CloseUtils.closeIO(inputStreamOpenInputStream);
                i3 = i;
                return i3;
            }
            int i9 = component1 + 117;
            ShareDataUIState = i9 % 128;
            if (i9 % 2 != 0) {
                CloseUtils.closeIO(inputStreamOpenInputStream);
                return 0;
            }
            Closeable[] closeableArr = new Closeable[0];
            closeableArr[0] = inputStreamOpenInputStream;
            CloseUtils.closeIO(closeableArr);
            return 1;
        } catch (Throwable th) {
            Closeable[] closeableArr2 = new Closeable[1];
            closeableArr2[i3] = inputStreamOpenInputStream;
            CloseUtils.closeIO(closeableArr2);
            throw th;
        }
    }

    private static Bitmap component2(Bitmap bitmap, int i) {
        Bitmap bitmapCreateBitmap;
        int i2 = 2 % 2;
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        Object obj = null;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (OutOfMemoryError e) {
            L.w("PicBase64Utils", "rotateBitmapByDegree err", e);
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap == null) {
            int i3 = ShareDataUIState + 7;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            bitmapCreateBitmap = bitmap;
        }
        if (bitmap != bitmapCreateBitmap) {
            int i4 = ShareDataUIState + 95;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            bitmap.recycle();
            if (i5 != 0) {
                int i6 = 56 / 0;
            }
        }
        return bitmapCreateBitmap;
    }
}
