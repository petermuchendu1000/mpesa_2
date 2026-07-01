package com.huawei.digitalpayment.consumer.remoteconfig.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.sfcui.components.recipient.RecipientSelectionKt$RecipientSelectionPreview$1$1$$ExternalSyntheticLambda0;
import dagger.hilt.android.internal.managers.BroadcastReceiverComponentManager;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.io.encoding.Base64;
import kotlin.notify;

public abstract class Hilt_PackageUpdateReceiver extends BroadcastReceiver {
    private volatile boolean injected = false;
    private final Object injectedLock = new Object();
    private static final byte[] $$c = {117, -24, -14, 98};
    private static final int $$f = 154;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {66, -42, -1, 80, -14, 57, -76, 5, -4, -10, -25, 3, -21, 9, -27, 66, -67, -13, -14, 7, -21, -4, 5, -19, TarHeader.LF_FIFO, -73, -9, 3, -21, 9, -27, -3, -11, -9, Base64.padSymbol, -73, 5, -25, 6, -21, -12, 13, -9, -18, -1, 47, -41, -27, -25, 6, -21, -12, 13, -9, -18, -1, 6, -26, -13, 2, -19, -16, 45, -53, -14, -1, 2, -5, -25, -15, 77, -71, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, TarHeader.LF_CONTIG, -60, -27, 0, -11, -12, 7, -6, -13, TarHeader.LF_SYMLINK, -65, -13, -5, -3, -9, 47, -70, -11, 6, -11, 46, -76, 5, -22, -4, -14, -5, 7, -10, 47, -65, -10, -5, TarHeader.LF_NORMAL, -33, -42, -5, Ascii.SUB, -54, 9, -30, Ascii.SO, -9, -18, -1, Ascii.CAN, -49, 3, -20, 3, -9, -21};
    private static final int $$h = 223;
    private static final byte[] $$a = {106, 40, -98, -117, -29, -18, -26, 4, -18, -18, -12, -37, -8, -25, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_NORMAL, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK};
    private static final int $$b = 72;
    private static int component1 = 0;
    private static int component3 = 1;
    private static long ShareDataUIState = -7224954843394184924L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r5, int r6, int r7) {
        /*
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.remoteconfig.service.Hilt_PackageUpdateReceiver.$$c
            int r5 = r5 * 3
            int r5 = r5 + 102
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L16
            r5 = r6
            r3 = r7
            goto L2b
        L16:
            r4 = r6
            r6 = r5
            r5 = r4
        L19:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            int r5 = r5 + 1
            r0[r2] = r3
            if (r2 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            return r5
        L29:
            r3 = r1[r5]
        L2b:
            int r6 = r6 + r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.remoteconfig.service.Hilt_PackageUpdateReceiver.$$i(short, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.remoteconfig.service.Hilt_PackageUpdateReceiver.$$a
            int r6 = 46 - r6
            int r8 = r8 * 16
            int r8 = r8 + 83
            int r1 = r7 + 10
            byte[] r1 = new byte[r1]
            int r7 = r7 + 9
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2e
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-17)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.remoteconfig.service.Hilt_PackageUpdateReceiver.b(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.remoteconfig.service.Hilt_PackageUpdateReceiver.$$g
            int r6 = 91 - r6
            int r7 = r7 * 6
            int r7 = 105 - r7
            int r1 = 78 - r5
            byte[] r1 = new byte[r1]
            int r5 = 77 - r5
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r5
            r3 = r6
            r4 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            r3 = r0[r6]
        L27:
            int r6 = r6 + 1
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-8)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.remoteconfig.service.Hilt_PackageUpdateReceiver.c(int, short, byte, java.lang.Object[]):void");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        int i3 = $11 + 77;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (notifyVar.copydefault < cArr.length) {
            int i5 = $11 + 49;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3265 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getScrollBarSize() >> 8) + 33, (char) (60267 - TextUtils.lastIndexOf("", '0', 0)), -834797019, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (ShareDataUIState ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 1;
                    byte b5 = (byte) (b4 - 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 687, 33 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (60372 - ImageFormat.getBitsPerPixel(0)), -1969106284, false, $$i(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i8 = $10 + 73;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                byte b6 = (byte) 1;
                byte b7 = (byte) (b6 - 1);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(687 - ((Process.getThreadPriority(0) + 20) >> 6), 34 - Color.green(0), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 60373), -1969106284, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    @Override
    public void onReceive(Context context, Intent intent) throws Throwable {
        Object[] objArr;
        Object[] objArrComponent3$16dd2b22;
        Context applicationContext;
        Object[] objArr2;
        Object[] objArr3;
        char c2;
        char c3 = 2;
        int i = 2 % 2;
        Object[] objArr4 = new Object[1];
        a((ViewConfiguration.getScrollBarSize() >> 8) + 60493, new char[]{59759, 1325, 12784, 11675, 22613, 29926, 24740, 40763, 35593, 42952, 53794, 52754, 64235, 5780, 1356, 12776, 11699, 22608, 29704, 24790, 40809, 35636}, objArr4);
        String str = (String) objArr4[0];
        Object[] objArr5 = new Object[1];
        a(62981 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{59755, 8039, 1381, 2929, 12649, 10098, 11636, 21375, 22851, 20290, 30032, 31565, 24923, 38690, 40237}, objArr5);
        String str2 = (String) objArr5[0];
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(534243434);
        if (objCopydefault == null) {
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 1184;
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 16;
            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte b2 = (byte) 43;
            byte b3 = (byte) (b2 & 5);
            Object[] objArr6 = new Object[1];
            b(b2, b3, b3, objArr6);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(capsMode, iNormalizeMetaState, maximumFlingVelocity, -628214001, false, (String) objArr6[0], null);
        }
        if (((Field) objCopydefault).getLong(null) != -1) {
            int i2 = component3 + 83;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(989174724);
            if (objCopydefault2 == null) {
                int scrollBarSize = 1184 - (ViewConfiguration.getScrollBarSize() >> 8);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 17;
                char c4 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                byte b4 = (byte) 0;
                Object[] objArr7 = new Object[1];
                b((byte) 33, b4, (byte) (b4 + 1), objArr7);
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarSize, iLastIndexOf, c4, -5487455, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objCopydefault2).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i4 = ((int[]) objArr8[1])[0];
            int i5 = ((int[]) objArr8[2])[0];
            String[] strArr = (String[]) objArr8[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = (-435752520) + ((iIdentityHashCode | 381531344) * (-859)) + (((~(iIdentityHashCode | (-272213009))) | (~(381531344 | i6))) * 859) + (((~((-813426453) | i6)) | 541213444) * 859) + 153316895;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[3])[0] = i9 ^ (i9 << 5);
        } else {
            Context applicationContext2 = context != null ? (!((context instanceof ContextWrapper) ^ true) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            Object[] objArr9 = new Object[1];
            a(View.getDefaultSize(0, 0) + 41443, new char[]{59748, 18572, 43710, 3270, 28332, 49165, 8765, 33877, 58993, 23003, 48003, 7606, 32729, 53757, 13057, 38190}, objArr9);
            Class<?> cls = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            a((ViewConfiguration.getPressedStateDuration() >> 16) + 13463, new char[]{59751, 56829, 32837, 29861, 15142, 61332, 54000, 39254, 19966, 12320, 58523, 43803, 40537, 17098, 2344, 64946}, objArr10);
            int iIntValue = ((Integer) cls.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            int i10 = component1 + 9;
            component3 = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr11 = {applicationContext2, Integer.valueOf(iIntValue), 0, 153316895};
                byte[] bArr = $$g;
                byte b5 = bArr[96];
                byte b6 = b5;
                Object[] objArr12 = new Object[1];
                c(b6, (byte) (b6 | 87), b5, objArr12);
                Class<?> cls2 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                c((byte) (-bArr[16]), (byte) (-bArr[9]), bArr[77], objArr13);
                objArr = (Object[]) cls2.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(989174724);
                if (objCopydefault3 == null) {
                    int mirror = AndroidCharacter.getMirror('0') + 1136;
                    int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 16;
                    char cBlue = (char) Color.blue(0);
                    byte b7 = (byte) 0;
                    Object[] objArr14 = new Object[1];
                    b((byte) 33, b7, (byte) (b7 + 1), objArr14);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(mirror, scrollBarSize2, cBlue, -5487455, false, (String) objArr14[0], null);
                }
                ((Field) objCopydefault3).set(null, objArr);
                try {
                    long jLongValue = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1260029028);
                    if (objCopydefault4 == null) {
                        int iArgb = 1184 - Color.argb(0, 0, 0, 0);
                        int i12 = 16 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                        byte b8 = (byte) 24;
                        Object[] objArr15 = new Object[1];
                        b(b8, (byte) (b8 >>> 2), (byte) 0, objArr15);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iArgb, i12, absoluteGravity, -1908188415, false, (String) objArr15[0], null);
                    }
                    ((Field) objCopydefault4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(534243434);
                    if (objCopydefault5 == null) {
                        int iLastIndexOf2 = 1183 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16;
                        char c5 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte b9 = (byte) 43;
                        byte b10 = (byte) (b9 & 5);
                        Object[] objArr16 = new Object[1];
                        b(b9, b10, b10, objArr16);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf2, scrollDefaultDelay, c5, -628214001, false, (String) objArr16[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf2);
                    c3 = 2;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i13 = ((int[]) objArr[c3])[0];
        int i14 = ((int[]) objArr[1])[0];
        try {
            if (i14 != i13) {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr[0];
                if (strArr2 != null) {
                    int i15 = component3 + 75;
                    component1 = i15 % 128;
                    int i16 = i15 % 2;
                    for (String str3 : strArr2) {
                        arrayList.add(str3);
                    }
                }
                long j = -1;
                long j2 = ((long) (i13 ^ i14)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
                long j3 = 0;
                long j4 = j2 | (((long) 4) << 32) | (j3 - ((j3 >> 63) << 32));
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Color.argb(0, 0, 0, 0) + 42, (char) (ViewConfiguration.getTouchSlop() >> 8), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault6).invoke(null, null);
                Object[] objArr17 = {-1956445576, Long.valueOf(j4), arrayList, null, false, false};
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 6562, TextUtils.indexOf((CharSequence) "", '0') + 57, (char) (MotionEvent.axisFromString("") + 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault7).invoke(objInvoke, objArr17);
                Object[] objArr18 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
                int i17 = ((int[]) objArr[3])[0];
                int i18 = ((int[]) objArr[1])[0];
                int i19 = ((int[]) objArr[2])[0];
                String[] strArr3 = (String[]) objArr[0];
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i20 = i17 + 1251378592 + (((~((-482305072) | iIdentityHashCode2)) | 138028069) * 345) + (((~((-482305072) | (~iIdentityHashCode2))) | 574624656) * 345) + ((~(iIdentityHashCode2 | (-138028070))) * 345);
                int i21 = (i20 << 13) ^ i20;
                int i22 = i21 ^ (i21 >>> 17);
                ((int[]) objArr18[3])[0] = i22 ^ (i22 << 5);
                throw new RuntimeException(String.valueOf(i14));
            }
            Object[] objArr19 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i23 = ((int[]) objArr[3])[0];
            int i24 = ((int[]) objArr[1])[0];
            int i25 = ((int[]) objArr[2])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iMyUid = Process.myUid();
            int i26 = i23 + ((((-75339772) + (((-277457931) | (~iMyUid)) * (-490))) + (((~(iMyUid | (-344583179))) | 67125248) * 490)) - 71735598);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr19[3])[0] = i28 ^ (i28 << 5);
            Object[] objArr20 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i29 = ((int[]) objArr19[3])[0];
            int i30 = ((int[]) objArr19[1])[0];
            int i31 = ((int[]) objArr19[2])[0];
            String[] strArr5 = (String[]) objArr19[0];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i32 = ~iIdentityHashCode3;
            int i33 = i29 + (-247246968) + ((1056537531 | i32) * (-369)) + (((~((-953692732) | i32)) | 241265065) * (-369)) + (((~(iIdentityHashCode3 | 953692731)) | 102844800 | (~(i32 | (-815272467)))) * 369);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr20[3])[0] = i35 ^ (i35 << 5);
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-1215495245);
            if (objCopydefault8 == null) {
                int iAlpha = 2405 - Color.alpha(0);
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26;
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte b11 = (byte) 43;
                byte b12 = (byte) (b11 & 5);
                Object[] objArr21 = new Object[1];
                b(b11, b12, b12, objArr21);
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(iAlpha, minimumFlingVelocity, scrollBarFadeDuration, 1926552790, false, (String) objArr21[0], null);
            }
            if (((Field) objCopydefault8).getLong(null) != -1) {
                Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-1005084067);
                if (objCopydefault9 == null) {
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2405;
                    int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26;
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                    byte b13 = (byte) 0;
                    Object[] objArr22 = new Object[1];
                    b((byte) 9, b13, (byte) (b13 + 1), objArr22);
                    objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(windowTouchSlop, scrollDefaultDelay2, packedPositionChild, 21921080, false, (String) objArr22[0], null);
                }
                Object[] objArr23 = (Object[]) ((Field) objCopydefault9).get(null);
                objArrComponent3$16dd2b22 = new Object[]{new int[]{((int[]) objArr23[0])[0]}, new int[1], new int[]{((int[]) objArr23[2])[0]}, (String[]) objArr23[3]};
                int iIdentityHashCode4 = System.identityHashCode(this);
                int i36 = 1797004049 + ((~(iIdentityHashCode4 | 184524447)) * 216);
                int i37 = ~iIdentityHashCode4;
                int i38 = ((i36 + ((268410591 | i37) * (-216))) + (((~(i37 | 184524447)) | (-121766086)) * 216)) - 274441005;
                int i39 = (i38 << 13) ^ i38;
                int i40 = i39 ^ (i39 >>> 17);
                ((int[]) objArrComponent3$16dd2b22[1])[0] = i40 ^ (i40 << 5);
            } else {
                Object[] objArr24 = new Object[1];
                a(TextUtils.lastIndexOf("", '0') + 41444, new char[]{59748, 18572, 43710, 3270, 28332, 49165, 8765, 33877, 58993, 23003, 48003, 7606, 32729, 53757, 13057, 38190}, objArr24);
                Class<?> cls3 = Class.forName((String) objArr24[0]);
                Object[] objArr25 = new Object[1];
                a(13463 - ExpandableListView.getPackedPositionType(0L), new char[]{59751, 56829, 32837, 29861, 15142, 61332, 54000, 39254, 19966, 12320, 58523, 43803, 40537, 17098, 2344, 64946}, objArr25);
                int iIntValue2 = ((Integer) cls3.getMethod((String) objArr25[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr26 = {-1956445576};
                Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(-2036074497);
                if (objCopydefault10 == null) {
                    objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2393, 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (Color.red(0) + 30139), 1140467866, false, null, new Class[]{Integer.TYPE});
                }
                objArrComponent3$16dd2b22 = RecipientSelectionKt$RecipientSelectionPreview$1$1$$ExternalSyntheticLambda0.component3$16dd2b22(iIntValue2, 0, ((Constructor) objCopydefault10).newInstance(objArr26), -274441005, false, false);
                Object objCopydefault11 = ITrustedWebActivityCallbackDefault.copydefault(-1005084067);
                if (objCopydefault11 == null) {
                    int iLastIndexOf3 = 2404 - TextUtils.lastIndexOf("", '0', 0, 0);
                    int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 26;
                    char gidForName = (char) ((-1) - Process.getGidForName(""));
                    byte b14 = (byte) 0;
                    Object[] objArr27 = new Object[1];
                    b((byte) 9, b14, (byte) (b14 + 1), objArr27);
                    objCopydefault11 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf3, windowTouchSlop2, gidForName, 21921080, false, (String) objArr27[0], null);
                }
                ((Field) objCopydefault11).set(null, objArrComponent3$16dd2b22);
                try {
                    long jLongValue2 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue2);
                    Object objCopydefault12 = ITrustedWebActivityCallbackDefault.copydefault(-873460037);
                    if (objCopydefault12 == null) {
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 2405;
                        int i41 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25;
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                        byte b15 = (byte) 24;
                        Object[] objArr28 = new Object[1];
                        b(b15, (byte) (b15 >>> 2), (byte) 0, objArr28);
                        objCopydefault12 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionType, i41, cIndexOf, 246010334, false, (String) objArr28[0], null);
                    }
                    ((Field) objCopydefault12).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault13 = ITrustedWebActivityCallbackDefault.copydefault(-1215495245);
                    if (objCopydefault13 == null) {
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 2405;
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26;
                        char windowTouchSlop3 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte b16 = (byte) 43;
                        byte b17 = (byte) (b16 & 5);
                        Object[] objArr29 = new Object[1];
                        b(b16, b17, b17, objArr29);
                        objCopydefault13 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, maximumDrawingCacheSize, windowTouchSlop3, 1926552790, false, (String) objArr29[0], null);
                    }
                    ((Field) objCopydefault13).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            }
            int i42 = ((int[]) objArrComponent3$16dd2b22[0])[0];
            int i43 = ((int[]) objArrComponent3$16dd2b22[2])[0];
            if (i43 == i42) {
                int i44 = ((int[]) objArrComponent3$16dd2b22[1])[0];
                Object[] objArr30 = {new int[]{((int[]) objArrComponent3$16dd2b22[0])[0]}, new int[1], new int[]{((int[]) objArrComponent3$16dd2b22[2])[0]}, (String[]) objArrComponent3$16dd2b22[3]};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i45 = ~iUptimeMillis;
                int i46 = (~(985074660 | i45)) | (-1056418815) | (~(1047833022 | i45));
                int i47 = i44 + (-1056899025) + (((~(iUptimeMillis | (-976488869))) | i46) * 590) + (i46 * (-1180)) + (((~((-1047833023) | i45)) | (~(i45 | (-985074661)))) * 590);
                int i48 = (i47 << 13) ^ i47;
                int i49 = i48 ^ (i48 >>> 17);
                ((int[]) objArr30[1])[0] = i49 ^ (i49 << 5);
                int i50 = ((int[]) objArr30[1])[0];
                Object[] objArr31 = {new int[]{((int[]) objArr30[0])[0]}, new int[1], new int[]{((int[]) objArr30[2])[0]}, (String[]) objArr30[3]};
                int iIdentityHashCode5 = System.identityHashCode(this);
                int i51 = i50 + 2125823409 + (((~(754414196 | iIdentityHashCode5)) | 268435466) * 104) + ((~((~iIdentityHashCode5) | (-205677105))) * (-104)) + ((iIdentityHashCode5 | 817172558) * 104);
                int i52 = (i51 << 13) ^ i51;
                int i53 = i52 ^ (i52 >>> 17);
                ((int[]) objArr31[1])[0] = i53 ^ (i53 << 5);
            } else {
                ArrayList arrayList2 = new ArrayList();
                String[] strArr6 = (String[]) objArrComponent3$16dd2b22[3];
                if (strArr6 != null) {
                    for (String str4 : strArr6) {
                        int i54 = component1 + 19;
                        component3 = i54 % 128;
                        int i55 = i54 % 2;
                        arrayList2.add(str4);
                    }
                }
                long j5 = -1;
                long j6 = ((long) (i42 ^ i43)) & ((((long) 0) << 32) | (j5 - ((j5 >> 63) << 32)));
                long j7 = 0;
                long j8 = j6 | (((long) 2) << 32) | (j7 - ((j7 >> 63) << 32));
                Object objCopydefault14 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault14 == null) {
                    objCopydefault14 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6617, 42 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke2 = ((Method) objCopydefault14).invoke(null, null);
                Object[] objArr32 = {-1956445576, Long.valueOf(j8), arrayList2, null, false, false};
                Object objCopydefault15 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault15 == null) {
                    objCopydefault15 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 56, (char) Color.green(0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault15).invoke(objInvoke2, objArr32);
                int i56 = ((int[]) objArrComponent3$16dd2b22[1])[0];
                Object[] objArr33 = {new int[]{((int[]) objArrComponent3$16dd2b22[0])[0]}, new int[1], new int[]{((int[]) objArrComponent3$16dd2b22[2])[0]}, (String[]) objArrComponent3$16dd2b22[3]};
                int iMyUid2 = Process.myUid();
                int i57 = ~iMyUid2;
                int i58 = i56 + (((~(666451294 | i57)) | (~((-729209657) | iMyUid2)) | (~(i57 | 729209656))) * 959) + 44854200 + (((~(iMyUid2 | 729209656)) | (~(i57 | (-729209657))) | (~(666451294 | iMyUid2))) * 959);
                int i59 = (i58 << 13) ^ i58;
                int i60 = i59 ^ (i59 >>> 17);
                ((int[]) objArr33[1])[0] = i60 ^ (i60 << 5);
                int[] iArr = new int[i43];
                int i61 = i43 - 1;
                iArr[i61] = 1;
                Toast.makeText((Context) null, iArr[((i43 * i61) % 2) - 1], 1).show();
                int i62 = ((int[]) objArr33[1])[0];
                Object[] objArr34 = {new int[]{((int[]) objArr33[0])[0]}, new int[1], new int[]{((int[]) objArr33[2])[0]}, (String[]) objArr33[3]};
                int iMyUid3 = Process.myUid();
                int i63 = ~iMyUid3;
                int i64 = ~(201366042 | i63);
                int i65 = i62 + (-1480363839) + (((-205717083) | i64) * (-712)) + (((~(iMyUid3 | (-4351041))) | (~(i63 | 205717082))) * (-712)) + ((138607680 | i64) * 712);
                int i66 = (i65 << 13) ^ i65;
                int i67 = i66 ^ (i66 >>> 17);
                ((int[]) objArr34[1])[0] = i67 ^ (i67 << 5);
            }
            Object objCopydefault16 = ITrustedWebActivityCallbackDefault.copydefault(-1729554888);
            if (objCopydefault16 == null) {
                int i68 = 2985 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 48;
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 54463);
                byte b18 = (byte) 24;
                Object[] objArr35 = new Object[1];
                b(b18, (byte) (b18 >>> 2), (byte) 0, objArr35);
                objCopydefault16 = ITrustedWebActivityCallbackDefault.copydefault(i68, threadPriority, cLastIndexOf, 1571866973, false, (String) objArr35[0], null);
            }
            if (((Field) objCopydefault16).getLong(null) != -1) {
                Object objCopydefault17 = ITrustedWebActivityCallbackDefault.copydefault(524452374);
                if (objCopydefault17 == null) {
                    int i69 = 2984 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0, 0) + 49;
                    char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 54462);
                    byte b19 = (byte) 43;
                    byte b20 = (byte) (b19 & 5);
                    Object[] objArr36 = new Object[1];
                    b(b19, b20, b20, objArr36);
                    objCopydefault17 = ITrustedWebActivityCallbackDefault.copydefault(i69, iLastIndexOf4, keyRepeatTimeout, -635740813, false, (String) objArr36[0], null);
                }
                Object[] objArr37 = (Object[]) ((Field) objCopydefault17).get(null);
                objArr2 = new Object[]{new int[]{((int[]) objArr37[0])[0]}, new int[]{((int[]) objArr37[1])[0]}, new int[1], (String[]) objArr37[3]};
                int iIdentityHashCode6 = System.identityHashCode(this);
                int i70 = (~((-1319325606) | iIdentityHashCode6)) | 237178756;
                int i71 = ~((~iIdentityHashCode6) | 1873539071);
                int i72 = ((1915583451 + ((i70 | i71) * (-470))) + (((~(iIdentityHashCode6 | (-1082146850))) | i71) * 470)) - 1533763564;
                int i73 = (i72 << 13) ^ i72;
                int i74 = i73 ^ (i73 >>> 17);
                ((int[]) objArr2[2])[0] = i74 ^ (i74 << 5);
            } else {
                if (context != null) {
                    int i75 = component1 + 121;
                    component3 = i75 % 128;
                    int i76 = i75 % 2;
                    if ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) {
                        applicationContext = null;
                    } else {
                        applicationContext = context.getApplicationContext();
                        int i77 = component3 + 39;
                        component1 = i77 % 128;
                        if (i77 % 2 != 0) {
                            int i78 = 5 / 3;
                        }
                    }
                } else {
                    applicationContext = context;
                }
                Object[] objArr38 = new Object[1];
                a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 41443, new char[]{59748, 18572, 43710, 3270, 28332, 49165, 8765, 33877, 58993, 23003, 48003, 7606, 32729, 53757, 13057, 38190}, objArr38);
                Class<?> cls4 = Class.forName((String) objArr38[0]);
                Object[] objArr39 = new Object[1];
                a(13463 - TextUtils.indexOf("", ""), new char[]{59751, 56829, 32837, 29861, 15142, 61332, 54000, 39254, 19966, 12320, 58523, 43803, 40537, 17098, 2344, 64946}, objArr39);
                Object[] objArr40 = {applicationContext, Integer.valueOf(((Integer) cls4.getMethod((String) objArr39[0], Object.class).invoke(null, this)).intValue()), 0, -1533763564};
                byte b21 = (byte) ($$h & 55);
                byte[] bArr2 = $$g;
                Object[] objArr41 = new Object[1];
                c(b21, bArr2[96], bArr2[77], objArr41);
                Class<?> cls5 = Class.forName((String) objArr41[0]);
                Object[] objArr42 = new Object[1];
                c((byte) (-bArr2[16]), (byte) (-bArr2[9]), bArr2[77], objArr42);
                objArr2 = (Object[]) cls5.getMethod((String) objArr42[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr40);
                if (applicationContext != null) {
                    Object objCopydefault18 = ITrustedWebActivityCallbackDefault.copydefault(524452374);
                    if (objCopydefault18 == null) {
                        int fadingEdgeLength = 2984 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 48;
                        char c6 = (char) (54463 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        byte b22 = (byte) 43;
                        byte b23 = (byte) (b22 & 5);
                        Object[] objArr43 = new Object[1];
                        b(b22, b23, b23, objArr43);
                        objCopydefault18 = ITrustedWebActivityCallbackDefault.copydefault(fadingEdgeLength, iCombineMeasuredStates, c6, -635740813, false, (String) objArr43[0], null);
                    }
                    ((Field) objCopydefault18).set(null, objArr2);
                    try {
                        long jLongValue3 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue3);
                        Object objCopydefault19 = ITrustedWebActivityCallbackDefault.copydefault(1682519065);
                        if (objCopydefault19 == null) {
                            int scrollBarFadeDuration2 = 2984 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int i79 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 48;
                            char c7 = (char) (54462 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                            byte b24 = (byte) 0;
                            byte b25 = b24;
                            Object[] objArr44 = new Object[1];
                            b(b24, b25, (byte) (b25 + 1), objArr44);
                            objCopydefault19 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarFadeDuration2, i79, c7, -1592726660, false, (String) objArr44[0], null);
                        }
                        ((Field) objCopydefault19).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                        Object objCopydefault20 = ITrustedWebActivityCallbackDefault.copydefault(-1729554888);
                        if (objCopydefault20 == null) {
                            int i80 = 2984 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 48;
                            char doubleTapTimeout = (char) (54462 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                            byte b26 = (byte) 24;
                            Object[] objArr45 = new Object[1];
                            b(b26, (byte) (b26 >>> 2), (byte) 0, objArr45);
                            objCopydefault20 = ITrustedWebActivityCallbackDefault.copydefault(i80, offsetBefore, doubleTapTimeout, 1571866973, false, (String) objArr45[0], null);
                        }
                        ((Field) objCopydefault20).set(null, lValueOf6);
                    } catch (Exception unused3) {
                        throw new RuntimeException();
                    }
                }
            }
            int i81 = ((int[]) objArr2[0])[0];
            int i82 = ((int[]) objArr2[1])[0];
            if (i82 == i81) {
                int i83 = ((int[]) objArr2[2])[0];
                Object[] objArr46 = {new int[]{((int[]) objArr2[0])[0]}, new int[]{((int[]) objArr2[1])[0]}, new int[1], (String[]) objArr2[3]};
                int i84 = ~(((int) Runtime.getRuntime().totalMemory()) | 855615099);
                int i85 = i83 + ((2016477043 | i84) * (-658)) + 1524290329 + ((i84 | 1207982336) * 658);
                int i86 = (i85 << 13) ^ i85;
                int i87 = i86 ^ (i86 >>> 17);
                ((int[]) objArr46[2])[0] = i87 ^ (i87 << 5);
                int i88 = ((int[]) objArr46[2])[0];
                Object[] objArr47 = {new int[]{((int[]) objArr46[0])[0]}, new int[]{((int[]) objArr46[1])[0]}, new int[1], (String[]) objArr46[3]};
                int iIdentityHashCode7 = System.identityHashCode(this);
                int i89 = i88 + (-1831843946) + (((~((-34603073) | (~iIdentityHashCode7))) | (-2076114756)) * (-591)) + ((iIdentityHashCode7 | (-34603073)) * 591);
                int i90 = (i89 << 13) ^ i89;
                int i91 = i90 ^ (i90 >>> 17);
                ((int[]) objArr47[2])[0] = i91 ^ (i91 << 5);
            } else {
                ArrayList arrayList3 = new ArrayList();
                String[] strArr7 = (String[]) objArr2[3];
                if (strArr7 != null) {
                    int i92 = component3 + 75;
                    component1 = i92 % 128;
                    int i93 = i92 % 2;
                    for (String str5 : strArr7) {
                        arrayList3.add(str5);
                    }
                }
                long j9 = -1;
                long j10 = ((long) (i81 ^ i82)) & ((((long) 0) << 32) | (j9 - ((j9 >> 63) << 32)));
                long j11 = 0;
                long j12 = j10 | (((long) 3) << 32) | (j11 - ((j11 >> 63) << 32));
                Object objCopydefault21 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault21 == null) {
                    objCopydefault21 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 6618, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 41, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke3 = ((Method) objCopydefault21).invoke(null, null);
                Object[] objArr48 = {-1956445576, Long.valueOf(j12), arrayList3, null, false, false};
                Object objCopydefault22 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault22 == null) {
                    objCopydefault22 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6561, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 55, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault22).invoke(objInvoke3, objArr48);
                int i94 = ((int[]) objArr2[2])[0];
                Object[] objArr49 = {new int[]{((int[]) objArr2[0])[0]}, new int[]{((int[]) objArr2[1])[0]}, new int[1], (String[]) objArr2[3]};
                int iIdentityHashCode8 = System.identityHashCode(this);
                int i95 = ~((-30474245) | iIdentityHashCode8);
                int i96 = ~iIdentityHashCode8;
                int i97 = i94 + 1575534779 + ((i95 | (~((-1478765690) | i96))) * 920) + (((~((-601477895) | i96)) | 30474244) * 920) + (((~(iIdentityHashCode8 | (-1478765690))) | (~((-30474245) | i96)) | (~((-571003651) | iIdentityHashCode8))) * 920);
                int i98 = (i97 << 13) ^ i97;
                int i99 = i98 ^ (i98 >>> 17);
                ((int[]) objArr49[2])[0] = i99 ^ (i99 << 5);
                int[] iArr2 = new int[i82];
                int i100 = i82 - 1;
                iArr2[i100] = 1;
                Toast.makeText((Context) null, iArr2[((i82 * i100) % 2) - 1], 1).show();
                int i101 = ((int[]) objArr49[2])[0];
                Object[] objArr50 = {new int[]{((int[]) objArr49[0])[0]}, new int[]{((int[]) objArr49[1])[0]}, new int[1], (String[]) objArr49[3]};
                int i102 = ~(((int) SystemClock.elapsedRealtime()) | 1441068104);
                int i103 = i101 + 1067393817 + (((-669649724) | i102) * (-220)) + ((i102 | (-2012151676)) * 220) + 41010026;
                int i104 = (i103 << 13) ^ i103;
                int i105 = i104 ^ (i104 >>> 17);
                ((int[]) objArr50[2])[0] = i105 ^ (i105 << 5);
            }
            Object objCopydefault23 = ITrustedWebActivityCallbackDefault.copydefault(-1718204907);
            if (objCopydefault23 == null) {
                int i106 = 1454 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23;
                char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                byte b27 = (byte) 43;
                byte b28 = (byte) (b27 & 5);
                Object[] objArr51 = new Object[1];
                b(b27, b28, b28, objArr51);
                objCopydefault23 = ITrustedWebActivityCallbackDefault.copydefault(i106, iIndexOf2, packedPositionChild2, 1557109104, false, (String) objArr51[0], null);
            }
            long j13 = ((Field) objCopydefault23).getLong(null);
            long jLongValue4 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objCopydefault24 = ITrustedWebActivityCallbackDefault.copydefault(1887269946);
            if (objCopydefault24 == null) {
                int iLastIndexOf5 = 1453 - TextUtils.lastIndexOf("", '0');
                int trimmedLength = 22 - TextUtils.getTrimmedLength("");
                char size = (char) View.MeasureSpec.getSize(0);
                byte b29 = (byte) 0;
                byte b30 = b29;
                Object[] objArr52 = new Object[1];
                b(b29, b30, (byte) (b30 + 1), objArr52);
                objCopydefault24 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf5, trimmedLength, size, -1255888033, false, (String) objArr52[0], null);
            }
            if (j13 == ((jLongValue4 - ((((Field) objCopydefault24).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objCopydefault25 = ITrustedWebActivityCallbackDefault.copydefault(1886346425);
                if (objCopydefault25 == null) {
                    int fadingEdgeLength2 = 1454 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22;
                    char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte b31 = (byte) 0;
                    Object[] objArr53 = new Object[1];
                    b((byte) 33, b31, (byte) (b31 + 1), objArr53);
                    objCopydefault25 = ITrustedWebActivityCallbackDefault.copydefault(fadingEdgeLength2, maximumDrawingCacheSize2, doubleTapTimeout2, -1254718500, false, (String) objArr53[0], null);
                }
                Object[] objArr54 = (Object[]) ((Field) objCopydefault25).get(null);
                Object[] objArr55 = {new int[1], new int[]{((int[]) objArr54[1])[0]}, new int[]{((int[]) objArr54[2])[0]}, (String[]) objArr54[3]};
                int iMyUid4 = Process.myUid();
                int i107 = ~iMyUid4;
                int i108 = 1134199386 + (((~((-1020187542) | i107)) | (~((-381609786) | iMyUid4))) * 1900) + (((~(i107 | 381609785)) | (~(iMyUid4 | 1020187541))) * (-950)) + (((~(iMyUid4 | 381609785)) | (~(i107 | 1020187541))) * 950) + 1636002714;
                int i109 = (i108 << 13) ^ i108;
                int i110 = i109 ^ (i109 >>> 17);
                ((int[]) objArr55[0])[0] = i110 ^ (i110 << 5);
                objArr3 = objArr55;
                c2 = 2;
            } else {
                Object[] objArr56 = new Object[1];
                a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 41442, new char[]{59748, 18572, 43710, 3270, 28332, 49165, 8765, 33877, 58993, 23003, 48003, 7606, 32729, 53757, 13057, 38190}, objArr56);
                Class<?> cls6 = Class.forName((String) objArr56[0]);
                Object[] objArr57 = new Object[1];
                a(13463 - ExpandableListView.getPackedPositionGroup(0L), new char[]{59751, 56829, 32837, 29861, 15142, 61332, 54000, 39254, 19966, 12320, 58523, 43803, 40537, 17098, 2344, 64946}, objArr57);
                int iIntValue3 = ((Integer) cls6.getMethod((String) objArr57[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr58 = {-1956445576};
                Object objCopydefault26 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                if (objCopydefault26 == null) {
                    objCopydefault26 = ITrustedWebActivityCallbackDefault.copydefault(1663 - Color.green(0), TextUtils.indexOf("", "") + 10, (char) View.resolveSize(0, 0), 1006506020, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr59 = {Integer.valueOf(iIntValue3), 0, 1636002714, ((Constructor) objCopydefault26).newInstance(objArr58), false};
                Object objCopydefault27 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                if (objCopydefault27 == null) {
                    int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0') + 1455;
                    int iBlue = 22 - Color.blue(0);
                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    byte b32 = (byte) 0;
                    Object[] objArr60 = new Object[1];
                    b((byte) 9, b32, (byte) (b32 + 1), objArr60);
                    objCopydefault27 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf3, iBlue, cResolveOpacity, 1908380642, false, (String) objArr60[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(1591 - TextUtils.indexOf("", ""), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 39, (char) (ExpandableListView.getPackedPositionChild(0L) + 1)), Boolean.TYPE});
                }
                objArr3 = (Object[]) ((Method) objCopydefault27).invoke(null, objArr59);
                Object objCopydefault28 = ITrustedWebActivityCallbackDefault.copydefault(1886346425);
                if (objCopydefault28 == null) {
                    int iResolveSize = View.resolveSize(0, 0) + 1454;
                    int iResolveSizeAndState = 22 - View.resolveSizeAndState(0, 0, 0);
                    char cResolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
                    byte b33 = (byte) 0;
                    Object[] objArr61 = new Object[1];
                    b((byte) 33, b33, (byte) (b33 + 1), objArr61);
                    objCopydefault28 = ITrustedWebActivityCallbackDefault.copydefault(iResolveSize, iResolveSizeAndState, cResolveOpacity2, -1254718500, false, (String) objArr61[0], null);
                }
                ((Field) objCopydefault28).set(null, objArr3);
                try {
                    long jLongValue5 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf7 = Long.valueOf(jLongValue5);
                    Object objCopydefault29 = ITrustedWebActivityCallbackDefault.copydefault(1887269946);
                    if (objCopydefault29 == null) {
                        int iIndexOf4 = 1453 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int windowTouchSlop4 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 22;
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        byte b34 = (byte) 0;
                        byte b35 = b34;
                        Object[] objArr62 = new Object[1];
                        b(b34, b35, (byte) (b35 + 1), objArr62);
                        objCopydefault29 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf4, windowTouchSlop4, packedPositionGroup, -1255888033, false, (String) objArr62[0], null);
                    }
                    ((Field) objCopydefault29).set(null, lValueOf7);
                    Long lValueOf8 = Long.valueOf(jLongValue5 >> 12);
                    Object objCopydefault30 = ITrustedWebActivityCallbackDefault.copydefault(-1718204907);
                    if (objCopydefault30 == null) {
                        int mode = View.MeasureSpec.getMode(0) + 1454;
                        int i111 = 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                        byte b36 = (byte) 43;
                        byte b37 = (byte) (b36 & 5);
                        Object[] objArr63 = new Object[1];
                        b(b36, b37, b37, objArr63);
                        objCopydefault30 = ITrustedWebActivityCallbackDefault.copydefault(mode, i111, offsetAfter, 1557109104, false, (String) objArr63[0], null);
                    }
                    ((Field) objCopydefault30).set(null, lValueOf8);
                    int i112 = component3 + 21;
                    component1 = i112 % 128;
                    c2 = 2;
                    int i113 = i112 % 2;
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            }
            int i114 = ((int[]) objArr3[c2])[0];
            int i115 = ((int[]) objArr3[1])[0];
            if (i115 == i114) {
                int i116 = component1 + 121;
                component3 = i116 % 128;
                int i117 = i116 % 2;
                int i118 = ((int[]) objArr3[0])[0];
                Object[] objArr64 = {new int[1], new int[]{((int[]) objArr3[1])[0]}, new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
                int iMyTid = Process.myTid();
                int i119 = (-1335148530) + ((~(iMyTid | 316765091)) * 216);
                int i120 = ~iMyTid;
                int i121 = i118 + i119 + (((-1074529289) | i120) * (-216)) + (((~(i120 | 316765091)) | 1085032235) * 216);
                int i122 = (i121 << 13) ^ i121;
                int i123 = i122 ^ (i122 >>> 17);
                ((int[]) objArr64[0])[0] = i123 ^ (i123 << 5);
                int i124 = ((int[]) objArr64[0])[0];
                Object[] objArr65 = {new int[1], new int[]{((int[]) objArr64[1])[0]}, new int[]{((int[]) objArr64[2])[0]}, (String[]) objArr64[3]};
                int i125 = ~(Process.myUid() | 798667849);
                int i126 = i124 + ((208253644 | i125) * (-658)) + 1105384414 + ((i125 | 6357636) * 658);
                int i127 = (i126 << 13) ^ i126;
                int i128 = i127 ^ (i127 >>> 17);
                ((int[]) objArr65[0])[0] = i128 ^ (i128 << 5);
                inject(context);
                return;
            }
            ArrayList arrayList4 = new ArrayList();
            String[] strArr8 = (String[]) objArr3[3];
            if (strArr8 != null) {
                int i129 = component1 + 97;
                component3 = i129 % 128;
                int i130 = i129 % 2;
                for (String str6 : strArr8) {
                    arrayList4.add(str6);
                }
            }
            long j14 = -1;
            long j15 = ((long) (i114 ^ i115)) & ((((long) 0) << 32) | (j14 - ((j14 >> 63) << 32)));
            long j16 = 0;
            long j17 = j15 | (((long) 1) << 32) | (j16 - ((j16 >> 63) << 32));
            Object objCopydefault31 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault31 == null) {
                objCopydefault31 = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 6618, 43 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ExpandableListView.getPackedPositionGroup(0L), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke4 = ((Method) objCopydefault31).invoke(null, null);
            Object[] objArr66 = {-1956445576, Long.valueOf(j17), arrayList4, null, false, false};
            Object objCopydefault32 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault32 == null) {
                objCopydefault32 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6563, 57 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault32).invoke(objInvoke4, objArr66);
            int i131 = ((int[]) objArr3[0])[0];
            Object[] objArr67 = {new int[1], new int[]{((int[]) objArr3[1])[0]}, new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i132 = ~iIdentityHashCode9;
            int i133 = (-1109926450) + (((~((-145081112) | i132)) | (~(1218835351 | iIdentityHashCode9))) * 520);
            int i134 = ~((-1218835352) | i132);
            int i135 = ~(iIdentityHashCode9 | 182961975);
            int i136 = i131 + i133 + ((i134 | i135) * (-1040)) + ((i135 | (~(i132 | (-182961976))) | 1073754240) * 520);
            int i137 = (i136 << 13) ^ i136;
            int i138 = i137 ^ (i137 >>> 17);
            ((int[]) objArr67[0])[0] = i138 ^ (i138 << 5);
            throw new RuntimeException(String.valueOf(i115));
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    protected void inject(Context context) {
        if (this.injected) {
            return;
        }
        synchronized (this.injectedLock) {
            if (!this.injected) {
                ((PackageUpdateReceiver_GeneratedInjector) BroadcastReceiverComponentManager.generatedComponent(context)).injectPackageUpdateReceiver((PackageUpdateReceiver) UnsafeCasts.unsafeCast(this));
                this.injected = true;
            }
        }
    }
}
