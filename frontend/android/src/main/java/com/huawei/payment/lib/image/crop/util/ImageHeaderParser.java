package com.huawei.payment.lib.image.crop.util;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.view.MotionEventCompat;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public class ImageHeaderParser {
    private static final String ArtificialStackFrames = "ImageHeaderParser";
    private static final int ShareDataUIState = 225;
    public static final int UNKNOWN_ORIENTATION = -1;
    private static final int component1 = 18761;
    private static final int component4 = 217;
    private static final int copy = 19789;
    private static final int copydefault = 65496;
    private static final int getAsAtTimestamp = 274;
    private static final int getRequestBeneficiariesState = 218;
    private static final int getSponsorBeneficiariesState = 255;
    private final component1 hashCode;
    private static final String component3 = "Exif\u0000\u0000";
    private static final byte[] equals = component3.getBytes(Charset.forName("UTF-8"));
    private static final int[] component2 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    interface component1 {
        int ShareDataUIState() throws IOException;

        int component2(byte[] bArr, int i) throws IOException;

        long copydefault(long j) throws IOException;

        short copydefault() throws IOException;
    }

    private static int component1(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    private static boolean component3(int i) {
        return (i & copydefault) == copydefault || i == copy || i == component1;
    }

    public ImageHeaderParser(InputStream inputStream) {
        this.hashCode = new component2(inputStream);
    }

    private static int copydefault(component3 component3Var) {
        ByteOrder byteOrder;
        short sComponent2;
        int iShareDataUIState;
        int i;
        int i2;
        short sComponent22 = component3Var.component2(6);
        if (sComponent22 != copy && sComponent22 == component1) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        component3Var.component3(byteOrder);
        int iShareDataUIState2 = component3Var.ShareDataUIState(10) + 6;
        short sComponent23 = component3Var.component2(iShareDataUIState2);
        for (int i3 = 0; i3 < sComponent23; i3++) {
            int iComponent1 = component1(iShareDataUIState2, i3);
            if (component3Var.component2(iComponent1) == getAsAtTimestamp && (sComponent2 = component3Var.component2(iComponent1 + 2)) >= 1 && sComponent2 <= 12 && (iShareDataUIState = component3Var.ShareDataUIState(iComponent1 + 4)) >= 0 && (i = iShareDataUIState + component2[sComponent2]) <= 4 && (i2 = iComponent1 + 8) >= 0 && i2 <= component3Var.component3() && i >= 0 && i + i2 <= component3Var.component3()) {
                return component3Var.component2(i2);
            }
        }
        return -1;
    }

    public static void copyExif(ExifInterface exifInterface, int i, int i2, String str) throws Throwable {
        try {
            component3(exifInterface, new ExifInterface(str), i, i2);
        } catch (IOException e) {
            Log.d(ArtificialStackFrames, e.getMessage());
        }
    }

    public static void copyExif(Context context, int i, int i2, Uri uri, String str) {
        if (context == null) {
            return;
        }
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                component3(new ExifInterface(inputStreamOpenInputStream), new ExifInterface(str), i, i2);
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
            } finally {
            }
        } catch (IOException e) {
            Log.d(ArtificialStackFrames, e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void copyExif(android.content.Context r4, int r5, int r6, android.net.Uri r7, android.net.Uri r8) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "ImageHeaderParser"
            if (r4 != 0) goto L5
            return
        L5:
            r1 = 0
            android.content.ContentResolver r2 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            java.io.InputStream r7 = r2.openInputStream(r7)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            androidx.exifinterface.media.ExifInterface r2 = new androidx.exifinterface.media.ExifInterface     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L41
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L41
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L41
            java.lang.String r3 = "rw"
            android.os.ParcelFileDescriptor r1 = r4.openFileDescriptor(r8, r3)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L41
            androidx.exifinterface.media.ExifInterface r4 = new androidx.exifinterface.media.ExifInterface     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L41
            java.io.FileDescriptor r8 = r1.getFileDescriptor()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L41
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L41
            component3(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L41
            if (r7 == 0) goto L37
            r7.close()     // Catch: java.io.IOException -> L2f
            goto L37
        L2f:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            android.util.Log.d(r0, r4)
        L37:
            if (r1 == 0) goto L6d
            r1.close()     // Catch: java.io.IOException -> L65
            goto L6d
        L3d:
            r4 = move-exception
            r5 = r1
            r1 = r7
            goto L6f
        L41:
            r4 = move-exception
            r5 = r1
            r1 = r7
            goto L4a
        L45:
            r4 = move-exception
            r5 = r1
            goto L6f
        L48:
            r4 = move-exception
            r5 = r1
        L4a:
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L6e
            android.util.Log.d(r0, r4)     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L5f
            r1.close()     // Catch: java.io.IOException -> L57
            goto L5f
        L57:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            android.util.Log.d(r0, r4)
        L5f:
            if (r5 == 0) goto L6d
            r5.close()     // Catch: java.io.IOException -> L65
            goto L6d
        L65:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            android.util.Log.d(r0, r4)
        L6d:
            return
        L6e:
            r4 = move-exception
        L6f:
            if (r1 == 0) goto L7d
            r1.close()     // Catch: java.io.IOException -> L75
            goto L7d
        L75:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            android.util.Log.d(r0, r6)
        L7d:
            if (r5 == 0) goto L8b
            r5.close()     // Catch: java.io.IOException -> L83
            goto L8b
        L83:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            android.util.Log.d(r0, r5)
        L8b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.payment.lib.image.crop.util.ImageHeaderParser.copyExif(android.content.Context, int, int, android.net.Uri, android.net.Uri):void");
    }

    public static void copyExif(Context context, ExifInterface exifInterface, int i, int i2, Uri uri) {
        if (context == null) {
            return;
        }
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = null;
        try {
            try {
                parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
                component3(exifInterface, new ExifInterface(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), i, i2);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    return;
                }
            } catch (IOException e) {
                Log.d(ArtificialStackFrames, e.getMessage());
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    return;
                }
            }
            try {
                parcelFileDescriptorOpenFileDescriptor.close();
            } catch (IOException e2) {
                Log.d(ArtificialStackFrames, e2.getMessage());
            }
        } catch (Throwable th) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (IOException e3) {
                    Log.d(ArtificialStackFrames, e3.getMessage());
                }
            }
            throw th;
        }
    }

    private static void component3(ExifInterface exifInterface, ExifInterface exifInterface2, int i, int i2) throws Throwable {
        String[] strArr = {ExifInterface.TAG_F_NUMBER, ExifInterface.TAG_DATETIME, ExifInterface.TAG_DATETIME_DIGITIZED, ExifInterface.TAG_EXPOSURE_TIME, ExifInterface.TAG_FLASH, ExifInterface.TAG_FOCAL_LENGTH, ExifInterface.TAG_GPS_ALTITUDE, ExifInterface.TAG_GPS_ALTITUDE_REF, ExifInterface.TAG_GPS_DATESTAMP, ExifInterface.TAG_GPS_LATITUDE, ExifInterface.TAG_GPS_LATITUDE_REF, ExifInterface.TAG_GPS_LONGITUDE, ExifInterface.TAG_GPS_LONGITUDE_REF, ExifInterface.TAG_GPS_PROCESSING_METHOD, ExifInterface.TAG_GPS_TIMESTAMP, ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, ExifInterface.TAG_MAKE, ExifInterface.TAG_MODEL, ExifInterface.TAG_SUBSEC_TIME, ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, ExifInterface.TAG_WHITE_BALANCE};
        for (int i3 = 0; i3 < 22; i3++) {
            String str = strArr[i3];
            String attribute = exifInterface.getAttribute(str);
            if (!TextUtils.isEmpty(attribute)) {
                exifInterface2.setAttribute(str, attribute);
            }
        }
        exifInterface2.setAttribute(ExifInterface.TAG_IMAGE_WIDTH, String.valueOf(i));
        exifInterface2.setAttribute(ExifInterface.TAG_IMAGE_LENGTH, String.valueOf(i2));
        exifInterface2.setAttribute(ExifInterface.TAG_ORIENTATION, "0");
        exifInterface2.saveAttributes();
    }

    public int getOrientation() throws IOException {
        int iComponent3;
        if (component3(this.hashCode.ShareDataUIState()) && (iComponent3 = component3()) != -1) {
            return component3(new byte[iComponent3], iComponent3);
        }
        return -1;
    }

    private int component3(byte[] bArr, int i) throws IOException {
        if (this.hashCode.component2(bArr, i) == i && component2(bArr, i)) {
            return copydefault(new component3(bArr, i));
        }
        return -1;
    }

    private boolean component2(byte[] bArr, int i) {
        boolean z = bArr != null && i > equals.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = equals;
                if (i2 >= bArr2.length) {
                    break;
                }
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
                i2++;
            }
        }
        return z;
    }

    private int component3() throws IOException {
        short sCopydefault;
        while (this.hashCode.copydefault() == 255 && (sCopydefault = this.hashCode.copydefault()) != getRequestBeneficiariesState && sCopydefault != 217) {
            int iShareDataUIState = this.hashCode.ShareDataUIState() - 2;
            if (sCopydefault == ShareDataUIState) {
                return iShareDataUIState;
            }
            long j = iShareDataUIState;
            if (this.hashCode.copydefault(j) != j) {
                return -1;
            }
        }
        return -1;
    }

    static class component3 {
        private final ByteBuffer component2;

        public component3(byte[] bArr, int i) {
            this.component2 = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        public void component3(ByteOrder byteOrder) {
            this.component2.order(byteOrder);
        }

        public int component3() {
            return this.component2.remaining();
        }

        public int ShareDataUIState(int i) {
            return this.component2.getInt(i);
        }

        public short component2(int i) {
            return this.component2.getShort(i);
        }
    }

    static class component2 implements component1 {
        private final InputStream ShareDataUIState;

        public component2(InputStream inputStream) {
            this.ShareDataUIState = inputStream;
        }

        @Override
        public int ShareDataUIState() throws IOException {
            return ((this.ShareDataUIState.read() << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (this.ShareDataUIState.read() & 255);
        }

        @Override
        public short copydefault() throws IOException {
            return (short) (this.ShareDataUIState.read() & 255);
        }

        @Override
        public long copydefault(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long jSkip = this.ShareDataUIState.skip(j2);
                if (jSkip <= 0) {
                    if (this.ShareDataUIState.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j2 -= jSkip;
            }
            return j - j2;
        }

        @Override
        public int component2(byte[] bArr, int i) throws IOException {
            int i2 = i;
            while (i2 > 0) {
                int i3 = this.ShareDataUIState.read(bArr, i - i2, i2);
                if (i3 == -1) {
                    break;
                }
                i2 -= i3;
            }
            return i - i2;
        }
    }
}
