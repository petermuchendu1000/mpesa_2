package com.safaricom.sharedui.compose.bottomsheetdialog;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.safaricom.sharedui.compose.bottomsheetdialog.CommonBottomSheetDialogFragment;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.notify;

public final class CommonBottomSheetDialogFragment$Companion$$ExternalSyntheticLambda1 implements Function0 {
    private static final byte[] $$c = {113, 46, 90, -12};
    private static final int $$f = 251;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {Ascii.GS, -59, -25, -119, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.FS, 36};
    private static final int $$e = 87;
    private static final byte[] $$a = {TarHeader.LF_NORMAL, -22, 122, 126, -2, 10, -10};
    private static final int $$b = 188;
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private static long component1 = -7190391092451918768L;

    private static String $$g(int i, byte b2, short s) {
        int i2 = 4 - (b2 * 4);
        int i3 = s * 2;
        byte[] bArr = $$c;
        int i4 = 105 - (i * 3);
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 += i2;
            i2++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i4;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            int i7 = i2;
            i4 += bArr[i2];
            i2 = i7 + 1;
            i5 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.safaricom.sharedui.compose.bottomsheetdialog.CommonBottomSheetDialogFragment$Companion$$ExternalSyntheticLambda1.$$a
            int r6 = r6 * 3
            int r6 = r6 + 111
            int r7 = r7 * 3
            int r1 = 4 - r7
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            int r7 = 3 - r7
            r2 = -1
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2f
        L18:
            r3 = r2
        L19:
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L29:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + r2
            int r8 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.sharedui.compose.bottomsheetdialog.CommonBottomSheetDialogFragment$Companion$$ExternalSyntheticLambda1.a(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.safaricom.sharedui.compose.bottomsheetdialog.CommonBottomSheetDialogFragment$Companion$$ExternalSyntheticLambda1.$$d
            int r6 = r6 + 98
            int r7 = r7 * 3
            int r1 = r7 + 1
            int r8 = r8 * 9
            int r8 = 13 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2a:
            int r6 = r6 + r8
            int r6 = r6 + (-27)
            int r8 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.sharedui.compose.bottomsheetdialog.CommonBottomSheetDialogFragment$Companion$$ExternalSyntheticLambda1.b(int, byte, byte, java.lang.Object[]):void");
    }

    @Override
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = component3 + 85;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent1 = CommonBottomSheetDialogFragment.Companion.component1();
        int i4 = ShareDataUIState + 17;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return unitComponent1;
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $11 + 21;
            $10 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        int i5 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3266;
                        int iMyPid = 33 - (Process.myPid() >> 22);
                        char cIndexOf = (char) (60268 - TextUtils.indexOf("", ""));
                        byte b2 = (byte) ($$f & 5);
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5, iMyPid, cIndexOf, -834797019, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component1 ^ 5431355972723572778L);
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 686, Color.red(0) + 34, (char) (60373 - ((Process.getThreadPriority(0) + 20) >> 6)), -1969106284, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = notifyVar.copydefault;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault3 == null) {
                        int i7 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3265;
                        int iRed = Color.red(0) + 33;
                        char trimmedLength = (char) (60268 - TextUtils.getTrimmedLength(""));
                        byte b6 = (byte) ($$f & 5);
                        byte b7 = (byte) (b6 - 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i7, iRed, trimmedLength, -834797019, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() & (component1 + 5431355972723572778L);
                    try {
                        Object[] objArr5 = {notifyVar, notifyVar};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                        if (objCopydefault4 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(MotionEvent.axisFromString("") + 688, TextUtils.indexOf((CharSequence) "", '0', 0) + 35, (char) (60373 - Color.blue(0)), -1969106284, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault4).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr6 = {notifyVar, notifyVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(687 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 34, (char) (60373 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), -1969106284, false, $$g(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        String str = new String(cArr2);
        int i8 = $10 + 93;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x08c9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x08ca, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x08ce, code lost:
    
        if (r1 != null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x08d0, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x08d1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0550, code lost:
    
        r0 = com.safaricom.sharedui.compose.bottomsheetdialog.CommonBottomSheetDialogFragment$Companion$$ExternalSyntheticLambda1.component3 + 19;
        com.safaricom.sharedui.compose.bottomsheetdialog.CommonBottomSheetDialogFragment$Companion$$ExternalSyntheticLambda1.ShareDataUIState = r0 % 128;
        r0 = r0 % 2;
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0561, code lost:
    
        if (r0 != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0563, code lost:
    
        r0 = 1342 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
        r24 = 34 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
        r2 = (char) (6424 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)));
        r3 = (byte) (com.safaricom.sharedui.compose.bottomsheetdialog.CommonBottomSheetDialogFragment$Companion$$ExternalSyntheticLambda1.$$e & 1);
        r8 = (byte) (r3 + 2);
        r11 = new java.lang.Object[1];
        b(r3, r8, (byte) (r8 - 2), r11);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r24, r2, 1443979249, false, (java.lang.String) r11[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x05a6, code lost:
    
        ((java.lang.reflect.Field) r0).set(null, r12);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x05b3, code lost:
    
        if (r0 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x05b5, code lost:
    
        r10 = 1342 - android.widget.ExpandableListView.getPackedPositionType(0);
        r11 = android.graphics.Color.alpha(0) + 33;
        r12 = (char) (6425 - android.text.TextUtils.indexOf("", ""));
        r0 = (byte) (com.safaricom.sharedui.compose.bottomsheetdialog.CommonBottomSheetDialogFragment$Companion$$ExternalSyntheticLambda1.$$e & 1);
        r3 = (byte) (r0 + 2);
        r8 = new java.lang.Object[1];
        b(r0, r3, (byte) (r3 - 2), r8);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r10, r11, r12, 1443979249, false, (java.lang.String) r8[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x05f3, code lost:
    
        r3 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r0).get(null)};
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0608, code lost:
    
        if (r0 != null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x060a, code lost:
    
        r10 = 1341 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0);
        r11 = 33 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
        r12 = (char) (6425 - (android.view.ViewConfiguration.getTouchSlop() >> 8));
        r0 = (byte) (com.safaricom.sharedui.compose.bottomsheetdialog.CommonBottomSheetDialogFragment$Companion$$ExternalSyntheticLambda1.$$e & 10);
        r2 = (byte) (r0 - 2);
        r15 = new java.lang.Object[1];
        b(r0, r2, r2, r15);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r10, r11, r12, -181198845, false, (java.lang.String) r15[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x064e, code lost:
    
        ((java.lang.Long) ((java.lang.reflect.Method) r0).invoke(null, r3)).longValue();
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x088c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int copydefault(java.util.List r30) {
        /*
            Method dump skipped, instruction units count: 2496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.sharedui.compose.bottomsheetdialog.CommonBottomSheetDialogFragment$Companion$$ExternalSyntheticLambda1.copydefault(java.util.List):int");
    }
}
