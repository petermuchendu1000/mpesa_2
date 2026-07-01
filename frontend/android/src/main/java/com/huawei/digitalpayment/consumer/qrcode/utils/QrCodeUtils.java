package com.huawei.digitalpayment.consumer.qrcode.utils;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.huawei.common.util.L;
import java.util.Hashtable;

public class QrCodeUtils {
    private static int component2 = 1;
    private static int copydefault;

    public static Bitmap generateBitmap(String str, int i, int i2, float f) {
        int i3 = 2 % 2;
        int i4 = component2 + 101;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (!TextUtils.isEmpty(str)) {
            Hashtable hashtable = new Hashtable();
            hashtable.put(EncodeHintType.CHARACTER_SET, "utf-8");
            hashtable.put(EncodeHintType.MARGIN, 0);
            try {
                BitMatrix bitMatrixEncode = new QRCodeWriter().encode(str, i, i2, hashtable);
                int width = bitMatrixEncode.getWidth();
                int height = bitMatrixEncode.getHeight();
                int[] iArrComponent3 = component3(bitMatrixEncode, -16777216, -1, width, height);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.setPixels(iArrComponent3, 0, width, 0, 0, width, height);
                Bitmap roundedCornerBitmap = getRoundedCornerBitmap(bitmapCreateBitmap, f);
                int i6 = copydefault + 7;
                component2 = i6 % 128;
                if (i6 % 2 != 0) {
                    return roundedCornerBitmap;
                }
                obj.hashCode();
                throw null;
            } catch (WriterException e) {
                L.d("QrCodeUtils", "generateBitmap: " + e.getMessage());
                return null;
            }
        }
        int i7 = copydefault + 113;
        component2 = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    private static int[] component3(BitMatrix bitMatrix, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int[] iArr = new int[i3 * i4];
        int i6 = 0;
        while (i6 < i4) {
            int i7 = component2 + 119;
            int i8 = i7 % 128;
            copydefault = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 39;
            component2 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 3 / 2;
            }
            for (int i12 = 0; i12 < i3; i12++) {
                if (bitMatrix.get(i12, i6)) {
                    iArr[(i6 * i3) + i12] = i;
                } else {
                    iArr[(i6 * i3) + i12] = i2;
                }
            }
            i6++;
            int i13 = component2 + 97;
            copydefault = i13 % 128;
            int i14 = i13 % 2;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r10 != 0.0f) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 39;
        com.huawei.digitalpayment.consumer.qrcode.utils.QrCodeUtils.copydefault = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r0 = android.graphics.Bitmap.createBitmap(r9.getWidth(), r9.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        r1 = new android.graphics.Canvas(r0);
        r2 = new android.graphics.Paint();
        r5 = new android.graphics.Rect(0, 0, r9.getWidth(), r9.getHeight());
        r6 = new android.graphics.RectF(new android.graphics.Rect(0, 0, r9.getWidth(), r9.getHeight()));
        r2.setAntiAlias(true);
        r1.drawARGB(0, 0, 0, 0);
        r2.setColor(-16777216);
        r1.drawRoundRect(r6, r10, r10, r2);
        r2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        r1.drawBitmap(r9, new android.graphics.Rect(0, 0, r9.getWidth(), r9.getHeight()), r5, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r9 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r9 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap getRoundedCornerBitmap(android.graphics.Bitmap r9, float r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.qrcode.utils.QrCodeUtils.component2
            int r2 = r1 + 31
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.qrcode.utils.QrCodeUtils.copydefault = r3
            int r2 = r2 % r0
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 56
            int r2 = r2 / r4
            if (r9 != 0) goto L19
            goto L18
        L16:
            if (r9 != 0) goto L19
        L18:
            return r3
        L19:
            r2 = 0
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 != 0) goto L2c
            int r1 = r1 + 39
            int r10 = r1 % 128
            com.huawei.digitalpayment.consumer.qrcode.utils.QrCodeUtils.copydefault = r10
            int r1 = r1 % r0
            if (r1 != 0) goto L28
            return r9
        L28:
            r3.hashCode()
            throw r3
        L2c:
            int r0 = r9.getWidth()
            int r1 = r9.getHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            int r3 = r9.getWidth()
            android.graphics.Rect r5 = new android.graphics.Rect
            int r6 = r9.getHeight()
            r5.<init>(r4, r4, r3, r6)
            int r3 = r9.getWidth()
            android.graphics.RectF r6 = new android.graphics.RectF
            android.graphics.Rect r7 = new android.graphics.Rect
            int r8 = r9.getHeight()
            r7.<init>(r4, r4, r3, r8)
            r6.<init>(r7)
            r3 = 1
            r2.setAntiAlias(r3)
            r1.drawARGB(r4, r4, r4, r4)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setColor(r3)
            r1.drawRoundRect(r6, r10, r10, r2)
            android.graphics.PorterDuffXfermode r10 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            r10.<init>(r3)
            r2.setXfermode(r10)
            int r10 = r9.getWidth()
            android.graphics.Rect r3 = new android.graphics.Rect
            int r6 = r9.getHeight()
            r3.<init>(r4, r4, r10, r6)
            r1.drawBitmap(r9, r3, r5, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.utils.QrCodeUtils.getRoundedCornerBitmap(android.graphics.Bitmap, float):android.graphics.Bitmap");
    }

    public static String getRefreshText(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = Integer.parseInt(str);
        if (i2 >= 60) {
            int i3 = component2 + 67;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            int i6 = i2 % 60;
            if (i6 != 0) {
                return String.format(str3, Integer.valueOf(i2 / 60), Integer.valueOf(i6));
            }
            int i7 = i4 + 5;
            component2 = i7 % 128;
            if (i7 % 2 != 0) {
                return String.format(str2, Integer.valueOf(i2 / 60));
            }
            Object[] objArr = new Object[0];
            objArr[1] = Integer.valueOf(i2 / 121);
            return String.format(str2, objArr);
        }
        String str5 = String.format(str4, Integer.valueOf(i2));
        int i8 = component2 + 79;
        copydefault = i8 % 128;
        int i9 = i8 % 2;
        return str5;
    }
}
