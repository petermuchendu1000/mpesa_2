package com.huawei.digitalpayment.consumer.home.ui.dialog;

import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class UploadHeaderDialog$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final UploadHeaderDialog f$0;
    private static final byte[] $$c = {40, 108, -113, 75};
    private static final int $$f = 6;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {68, -59, -116, 119, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.FS, 36};
    private static final int $$e = 132;
    private static final byte[] $$a = {57, Ascii.SYN, -21, -92, -1, -31, Ascii.VT, -33, SignedBytes.MAX_POWER_OF_TWO, -63, -25, -17, -1, -14, -5, TarHeader.LF_CONTIG, -31, -48, -17, -2, -7, -23, -21, Ascii.US, -45, -15, 3, -21};
    private static final int $$b = 234;
    private static int component1 = 0;
    private static int component3 = 1;
    private static long ShareDataUIState = -3780477796495014671L;
    private static int component2 = -2143293965;
    private static char copydefault = 50417;

    private static String $$g(byte b2, int i, int i2) {
        byte[] bArr = $$c;
        int i3 = i * 2;
        int i4 = b2 + 98;
        int i5 = 4 - (i2 * 3);
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 += -i3;
            i5++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            i4 += -bArr[i5];
            i5++;
        }
    }

    public UploadHeaderDialog$$ExternalSyntheticLambda0(UploadHeaderDialog uploadHeaderDialog) {
        this.f$0 = uploadHeaderDialog;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 12
            int r0 = r8 + 7
            int r7 = r7 * 6
            int r7 = r7 + 100
            byte[] r1 = com.huawei.digitalpayment.consumer.home.ui.dialog.UploadHeaderDialog$$ExternalSyntheticLambda0.$$a
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r8 = r8 + 6
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2e:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-10)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.dialog.UploadHeaderDialog$$ExternalSyntheticLambda0.a(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.dialog.UploadHeaderDialog$$ExternalSyntheticLambda0.$$d
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r6 = r6 + 98
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r6 = r7
            r4 = r2
            goto L27
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r8]
        L27:
            int r6 = r6 + r3
            int r6 = r6 + (-27)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.dialog.UploadHeaderDialog$$ExternalSyntheticLambda0.b(int, byte, byte, java.lang.Object[]):void");
    }

    @Override
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = component3 + 77;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            UploadHeaderDialog.m10509$r8$lambda$wgquPthlrUwPbpr3zSaxCT67PI(this.f$0, view);
            int i3 = 41 / 0;
        } else {
            UploadHeaderDialog.m10509$r8$lambda$wgquPthlrUwPbpr3zSaxCT67PI(this.f$0, view);
        }
        int i4 = component3 + 93;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void c(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c3;
        int i2 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i4 = $11 + 57;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            int i6 = $11 + 125;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int iAxisFromString = MotionEvent.axisFromString("") + 4038;
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31;
                    char mirror = (char) (AndroidCharacter.getMirror('0') + 19133);
                    byte b2 = (byte) ($$f - 5);
                    byte b3 = (byte) (b2 - 1);
                    String str$$g = $$g(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iAxisFromString, maximumDrawingCacheSize, mirror, 1912513118, false, str$$g, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 7567;
                    int iMyTid = 11 - (Process.myTid() >> 22);
                    char c4 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i3] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(windowTouchSlop, iMyTid, c4, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i8 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i8);
                objArr4[i3] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) i3;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2458, (Process.myTid() >> 22) + 28, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 931716605, false, $$g(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    c3 = 2;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 10 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    c3 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (ShareDataUIState ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) copydefault) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x08e1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x08e2, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x08e6, code lost:
    
        if (r1 != null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x08e8, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x08e9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x05ad, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x05b4, code lost:
    
        if (r1 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x05b6, code lost:
    
        r1 = 1342 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
        r26 = 32 - ((byte) android.view.KeyEvent.getModifierMetaStateMask());
        r3 = (char) (6425 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
        r5 = (byte) 1;
        r7 = (byte) (r5 + 2);
        r9 = new java.lang.Object[1];
        b(r5, r7, (byte) (r7 - 4), r9);
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r1, r26, r3, 1443979249, false, (java.lang.String) r9[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x05ef, code lost:
    
        ((java.lang.reflect.Field) r1).set(null, r12);
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x05fc, code lost:
    
        if (r1 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x05fe, code lost:
    
        r7 = 1342 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
        r8 = android.text.TextUtils.lastIndexOf("", '0') + 34;
        r9 = (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 6425);
        r1 = (byte) 1;
        r3 = (byte) (r1 + 2);
        r12 = new java.lang.Object[1];
        b(r1, r3, (byte) (r3 - 4), r12);
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r7, r8, r9, 1443979249, false, (java.lang.String) r12[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0637, code lost:
    
        r5 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r1).get(null)};
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x064a, code lost:
    
        if (r1 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x064c, code lost:
    
        r7 = android.text.TextUtils.getTrimmedLength("") + 1342;
        r8 = 33 - android.text.TextUtils.getOffsetBefore("", 0);
        r9 = (char) (6425 - android.text.TextUtils.getCapsMode("", 0, 0));
        r1 = (byte) 2;
        r0 = (byte) (r1 - 2);
        r12 = new java.lang.Object[1];
        b(r1, r0, (byte) (r0 | 8), r12);
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r7, r8, r9, -181198845, false, (java.lang.String) r12[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0684, code lost:
    
        ((java.lang.Long) ((java.lang.reflect.Method) r1).invoke(null, r5)).longValue();
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0691  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int copydefault(java.util.List r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.dialog.UploadHeaderDialog$$ExternalSyntheticLambda0.copydefault(java.util.List):int");
    }
}
