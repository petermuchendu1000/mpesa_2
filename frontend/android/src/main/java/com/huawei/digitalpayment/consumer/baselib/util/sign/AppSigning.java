package com.huawei.digitalpayment.consumer.baselib.util.sign;

import android.content.Context;
import android.content.pm.Signature;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.common.util.L;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public class AppSigning {
    public static final String SHA256 = "SHA256";
    private static final byte[] $$c = {35, -27, -128, TarHeader.LF_SYMLINK};
    private static final int $$f = 36;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {62, TarHeader.LF_FIFO, 60, 44, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.FS, 36};
    private static final int $$e = 161;
    private static final byte[] $$a = {74, 75, -50, -9, 2, -15, 36, -17, -2, -8, 10, -6, 2, Ascii.FS, -37, 8, -9};
    private static final int $$b = 104;
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 1;
    private static char[] component3 = {30611, 30616, 30599, 30287, 30605, 30607, 30614, 30603, 30612, 30615, 30618, 30597, 30636, 30609, 30606, 30613, 30608, 30602, 30639, 30635, 30596, 30629, 30592, 30601, 30633, 30604};
    private static int component2 = 321287801;
    private static boolean component1 = true;
    private static boolean ShareDataUIState = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r6, int r7, short r8) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r8 = r8 * 5
            int r8 = r8 + 68
            int r6 = r6 * 4
            int r6 = 1 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.util.sign.AppSigning.$$c
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.sign.AppSigning.$$g(int, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 103 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.util.sign.AppSigning.$$a
            int r7 = r7 * 4
            int r7 = 14 - r7
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L30
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.sign.AppSigning.a(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 3
            int r0 = 10 - r7
            int r6 = 100 - r6
            int r5 = r5 * 9
            int r5 = 13 - r5
            byte[] r1 = com.huawei.digitalpayment.consumer.baselib.util.sign.AppSigning.$$d
            byte[] r0 = new byte[r0]
            int r7 = 9 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r6
            r3 = r2
            r6 = r5
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r5]
        L29:
            int r5 = r5 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-27)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.sign.AppSigning.b(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x02a7, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.baselib.util.sign.AppSigning.getAsAtTimestamp + 23;
        com.huawei.digitalpayment.consumer.baselib.util.sign.AppSigning.copydefault = r1 % 128;
        r1 = r1 % 2;
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x02b8, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x02ba, code lost:
    
        r1 = android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 1342;
        r21 = 'Q' - android.text.AndroidCharacter.getMirror('0');
        r3 = (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 6425);
        r8 = (byte) (com.huawei.digitalpayment.consumer.baselib.util.sign.AppSigning.$$e & 7);
        r9 = r8;
        r14 = new java.lang.Object[1];
        b(r8, r9, (byte) (r9 - 1), r14);
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r1, r21, r3, 1443979249, false, (java.lang.String) r14[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x02f7, code lost:
    
        ((java.lang.reflect.Field) r1).set(null, r12);
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0304, code lost:
    
        if (r1 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0306, code lost:
    
        r1 = android.text.TextUtils.getTrimmedLength("") + 1342;
        r21 = 34 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1));
        r3 = (char) ((android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 6424);
        r8 = (byte) (com.huawei.digitalpayment.consumer.baselib.util.sign.AppSigning.$$e & 7);
        r9 = r8;
        r13 = new java.lang.Object[1];
        b(r8, r9, (byte) (r9 - 1), r13);
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r1, r21, r3, 1443979249, false, (java.lang.String) r13[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x034c, code lost:
    
        r8 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r1).get(null)};
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0361, code lost:
    
        if (r1 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0363, code lost:
    
        r1 = (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1342;
        r21 = 33 - android.text.TextUtils.indexOf("", "", 0, 0);
        r3 = (char) (android.view.View.combineMeasuredStates(0, 0) + 6425);
        r12 = new java.lang.Object[1];
        b(r6, r7, (byte) (r7 + 3), r12);
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r1, r21, r3, -181198845, false, (java.lang.String) r12[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x03a3, code lost:
    
        ((java.lang.Long) ((java.lang.reflect.Method) r1).invoke(null, r8)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x068e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x068f, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0693, code lost:
    
        if (r1 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0695, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0696, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.pm.Signature[] getSignatures(android.content.Context r27, java.lang.String r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.sign.AppSigning.getSignatures(android.content.Context, java.lang.String):android.content.pm.Signature[]");
    }

    public static String getSignatureString(Signature signature, String str) {
        int i = 2 % 2;
        try {
            byte[] bArrDigest = MessageDigest.getInstance(str).digest(signature.toByteArray());
            StringBuilder sb = new StringBuilder();
            int length = bArrDigest.length;
            int i2 = getAsAtTimestamp + 53;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 0;
            while (i4 < length) {
                int i5 = getAsAtTimestamp + 49;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    sb.append(Integer.toHexString((bArrDigest[i4] & 5793) | 25010).substring(1, 2));
                    i4 += 14;
                } else {
                    sb.append(Integer.toHexString((bArrDigest[i4] & 255) | 256).substring(1, 3));
                    i4++;
                }
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            L.e("NoSuchAlgorithmException catched");
            return "error!";
        }
    }

    private static void c(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component3;
        int i3 = 0;
        if (cArr2 != null) {
            int i4 = $10 + 9;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i6]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 3761, 24 - (KeyEvent.getMaxKeyCode() >> 16), (char) TextUtils.getOffsetAfter("", i3), -1670574543, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(component2)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Process.getGidForName("") + 7141, MotionEvent.axisFromString("") + 14, (char) (MotionEvent.axisFromString("") + 1), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i7 = 689978476;
        if (ShareDataUIState) {
            int i8 = $10 + 79;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i7);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2748 - TextUtils.getOffsetAfter("", 0), Color.blue(0) + 19, (char) (7644 - View.MeasureSpec.getSize(0)), -327556343, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                i7 = 689978476;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!component1) {
            cancelVar.component1 = iArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            int i10 = $10 + 45;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (cancelVar.component3 < cancelVar.component1) {
                int i12 = $11 + 11;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                cancelVar.component3++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        while (cancelVar.component3 < cancelVar.component1) {
            cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            Object[] objArr5 = {cancelVar, cancelVar};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
            if (objCopydefault4 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2747, 19 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (7644 - TextUtils.getTrimmedLength("")), -327556343, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        String str = new String(cArr6);
        int i14 = $10 + 105;
        $11 = i14 % 128;
        int i15 = i14 % 2;
        objArr[0] = str;
    }

    public static ArrayList<String> getSingInfo(Context context, String str) throws Throwable {
        int i = 2 % 2;
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Signature[] signatures = getSignatures(context, str);
            if (signatures != null) {
                int i2 = copydefault + 107;
                getAsAtTimestamp = i2 % 128;
                int i3 = i2 % 2;
                for (Signature signature : signatures) {
                    arrayList.add(getSignatureString(signature, "SHA256"));
                }
            }
        } catch (Exception e) {
            L.d("AppSigning", "getSingInfo: " + e.getMessage());
        }
        int i4 = copydefault + 53;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return arrayList;
    }
}
