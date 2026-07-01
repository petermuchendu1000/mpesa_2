package com.huawei.digitalpayment.consumer.qrcode.utils;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.encoder.Encoder;
import java.util.Map;

public final class QRCodeWriter {
    private static int component3 = 1;
    private static int copydefault;

    public BitMatrix encode(String str, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        ErrorCorrectionLevel errorCorrectionLevel;
        int i3 = 2 % 2;
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        if (!(!str.isEmpty())) {
            throw new IllegalArgumentException("Found empty contents");
        }
        int i4 = copydefault + 1;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        ErrorCorrectionLevel errorCorrectionLevel2 = ErrorCorrectionLevel.L;
        if (map != null && (errorCorrectionLevel = (ErrorCorrectionLevel) map.get(EncodeHintType.ERROR_CORRECTION)) != null) {
            int i6 = component3 + 7;
            int i7 = i6 % 128;
            copydefault = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 61;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            errorCorrectionLevel2 = errorCorrectionLevel;
        }
        BitMatrix bitMatrixComponent3 = component3(Encoder.encode(str, errorCorrectionLevel2, map), i, i2);
        int i11 = copydefault + 101;
        component3 = i11 % 128;
        int i12 = i11 % 2;
        return bitMatrixComponent3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r5 < 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        r12 = r12 - (r5 * 2);
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if (r6 < 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        r13 = r13 - (r6 * 2);
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        r7 = new com.google.zxing.common.BitMatrix(r12, r13);
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r12 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        r13 = com.huawei.digitalpayment.consumer.qrcode.utils.QRCodeWriter.component3 + 65;
        com.huawei.digitalpayment.consumer.qrcode.utils.QRCodeWriter.copydefault = r13 % 128;
        r13 = r13 % 2;
        r13 = 0;
        r8 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (r13 >= r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        if (r11.get(r13, r12) != 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        r7.setRegion(r8, r6, r4, r4);
        r9 = com.huawei.digitalpayment.consumer.qrcode.utils.QRCodeWriter.copydefault + 111;
        com.huawei.digitalpayment.consumer.qrcode.utils.QRCodeWriter.component3 = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        r13 = r13 + 1;
        r8 = r8 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        r12 = r12 + 1;
        r6 = r6 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r11 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r11 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r1 = r11.getWidth();
        r3 = r11.getHeight();
        r12 = java.lang.Math.max(r12, r1);
        r13 = java.lang.Math.max(r13, r3);
        r4 = java.lang.Math.min(r12 / r1, r13 / r3);
        r5 = (r12 - (r1 * r4)) / 2;
        r6 = (r13 - (r3 * r4)) / 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.zxing.common.BitMatrix component3(com.google.zxing.qrcode.encoder.QRCode r11, int r12, int r13) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.qrcode.utils.QRCodeWriter.copydefault
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.qrcode.utils.QRCodeWriter.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L19
            com.google.zxing.qrcode.encoder.ByteMatrix r11 = r11.getMatrix()
            r1 = 76
            int r1 = r1 / r2
            if (r11 == 0) goto L7e
            goto L1f
        L19:
            com.google.zxing.qrcode.encoder.ByteMatrix r11 = r11.getMatrix()
            if (r11 == 0) goto L7e
        L1f:
            int r1 = r11.getWidth()
            int r3 = r11.getHeight()
            int r12 = java.lang.Math.max(r12, r1)
            int r13 = java.lang.Math.max(r13, r3)
            int r4 = r12 / r1
            int r5 = r13 / r3
            int r4 = java.lang.Math.min(r4, r5)
            int r5 = r1 * r4
            int r5 = r12 - r5
            int r5 = r5 / r0
            int r6 = r3 * r4
            int r6 = r13 - r6
            int r6 = r6 / r0
            if (r5 < 0) goto L47
            int r5 = r5 * 2
            int r12 = r12 - r5
            r5 = r2
        L47:
            if (r6 < 0) goto L4d
            int r6 = r6 * 2
            int r13 = r13 - r6
            r6 = r2
        L4d:
            com.google.zxing.common.BitMatrix r7 = new com.google.zxing.common.BitMatrix
            r7.<init>(r12, r13)
            r12 = r2
        L53:
            if (r12 >= r1) goto L7d
            int r13 = com.huawei.digitalpayment.consumer.qrcode.utils.QRCodeWriter.component3
            int r13 = r13 + 65
            int r8 = r13 % 128
            com.huawei.digitalpayment.consumer.qrcode.utils.QRCodeWriter.copydefault = r8
            int r13 = r13 % r0
            r13 = r2
            r8 = r5
        L60:
            if (r13 >= r3) goto L79
            byte r9 = r11.get(r13, r12)
            r10 = 1
            if (r9 != r10) goto L75
            r7.setRegion(r8, r6, r4, r4)
            int r9 = com.huawei.digitalpayment.consumer.qrcode.utils.QRCodeWriter.copydefault
            int r9 = r9 + 111
            int r10 = r9 % 128
            com.huawei.digitalpayment.consumer.qrcode.utils.QRCodeWriter.component3 = r10
            int r9 = r9 % r0
        L75:
            int r13 = r13 + 1
            int r8 = r8 + r4
            goto L60
        L79:
            int r12 = r12 + 1
            int r6 = r6 + r4
            goto L53
        L7d:
            return r7
        L7e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.utils.QRCodeWriter.component3(com.google.zxing.qrcode.encoder.QRCode, int, int):com.google.zxing.common.BitMatrix");
    }
}
