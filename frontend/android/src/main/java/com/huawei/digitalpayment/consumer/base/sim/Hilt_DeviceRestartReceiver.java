package com.huawei.digitalpayment.consumer.base.sim;

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
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import dagger.hilt.android.internal.managers.BroadcastReceiverComponentManager;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.cancel;
import org.bouncycastle.crypto.macs.CMac;

public abstract class Hilt_DeviceRestartReceiver extends BroadcastReceiver {
    private static boolean ShareDataUIState;
    private static char[] component1;
    private static char[] component2;
    private static boolean component3;
    private static int copydefault;
    private static int getAsAtTimestamp;
    private volatile boolean injected = false;
    private final Object injectedLock = new Object();
    private static final byte[] $$l = {60, -123, -116, -1};
    private static final int $$m = 99;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {126, 1, Ascii.SUB, -71, Ascii.SO, -57, 76, -5, 4, 10, Ascii.EM, -3, Ascii.NAK, -9, Ascii.ESC, -66, 67, 13, Ascii.SO, -7, Ascii.NAK, 4, -5, 19, -54, 73, 9, -3, Ascii.NAK, -9, Ascii.ESC, 3, Ascii.VT, 9, -61, 73, -5, Ascii.EM, -6, Ascii.NAK, Ascii.FF, -13, 9, Ascii.DC2, 1, -47, 41, Ascii.ESC, Ascii.EM, -6, Ascii.NAK, Ascii.FF, -13, 9, Ascii.DC2, 1, -6, Ascii.SUB, 13, -2, 19, Ascii.DLE, -45, TarHeader.LF_DIR, Ascii.SO, 1, -2, 5, Ascii.EM, Ascii.SI, -77, 71, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58};
    private static final int $$k = 73;
    private static final byte[] $$d = {70, 83, 77, 1, Ascii.GS, Ascii.DC2, Ascii.SUB, -4, Ascii.DC2, Ascii.DC2, Ascii.FF, 37, 8, Ascii.EM, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -50, 38, 10, 34, 4, -16, 46, 36, -2, 5, 5, Ascii.ESC, TarHeader.LF_SYMLINK, -2, 36, 2, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -48, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -49};
    private static final int $$e = 23;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 0;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(short r7, int r8, byte r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.base.sim.Hilt_DeviceRestartReceiver.$$l
            int r8 = r8 + 68
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r9 = r9 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r9
            r5 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L20:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r9 = -r9
            int r8 = r8 + r9
            r9 = r3
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.sim.Hilt_DeviceRestartReceiver.$$n(short, int, byte):java.lang.String");
    }

    private static void e(byte b2, byte b3, int i, Object[] objArr) {
        int i2 = 99 - (b3 * 16);
        byte[] bArr = $$d;
        int i3 = i + 4;
        byte[] bArr2 = new byte[16 - b2];
        int i4 = 15 - b2;
        int i5 = -1;
        if (bArr == null) {
            int i6 = i2 + i3;
            i3++;
            i2 = i6 - 17;
            i5 = -1;
        }
        while (true) {
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3++;
            i2 = (i2 + bArr[i3]) - 17;
            i5 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.base.sim.Hilt_DeviceRestartReceiver.$$j
            int r7 = r7 + 4
            int r1 = r8 + 10
            int r6 = r6 * 6
            int r6 = r6 + 99
            byte[] r1 = new byte[r1]
            int r8 = r8 + 9
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2d:
            int r6 = r6 + r7
            int r6 = r6 + (-8)
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.sim.Hilt_DeviceRestartReceiver.f(short, byte, short, java.lang.Object[]):void");
    }

    private static void g(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component1;
        char c2 = 3;
        char c3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[c3] = Integer.valueOf(cArr2[i3]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 3760;
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 24;
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        byte b2 = $$l[c2];
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(fadingEdgeLength, maxKeyCode, touchSlop, -1670574543, false, $$n(b3, b3, b2), new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i3++;
                    c2 = 3;
                    c3 = 0;
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
        Object[] objArr3 = {Integer.valueOf(copydefault)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((Process.myTid() >> 22) + 7140, 13 - ExpandableListView.getPackedPositionGroup(0L), (char) (Process.myTid() >> 22), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i4 = 689978476;
        if (ShareDataUIState) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i5 = $11 + 77;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i4);
                if (objCopydefault3 == null) {
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2748;
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 19;
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 7645);
                    byte b4 = $$l[3];
                    byte b5 = (byte) (b4 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, scrollDefaultDelay, cIndexOf, -327556343, false, $$n(b5, (byte) (b5 + 5), b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                i4 = 689978476;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!component3) {
            cancelVar.component1 = iArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                cancelVar.component3++;
                int i7 = $11 + 125;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 4 / 4;
                }
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = $11 + 121;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        while (cancelVar.component3 < cancelVar.component1) {
            cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            Object[] objArr5 = {cancelVar, cancelVar};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
            if (objCopydefault4 == null) {
                int iRgb = Color.rgb(0, 0, 0) + 16779964;
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 19;
                char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 7644);
                byte b6 = $$l[3];
                byte b7 = (byte) (b6 + 1);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iRgb, packedPositionGroup, packedPositionType, -327556343, false, $$n(b7, (byte) (b7 + 5), b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            int i11 = $10 + 99;
            $11 = i11 % 128;
            int i12 = i11 % 2;
        }
        objArr[0] = new String(cArr6);
    }

    private static void d(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        char[] cArr;
        char c2;
        int i = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = component2;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(((Process.getThreadPriority(0) + 20) >> 6) + 657, (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 13, (char) (65117 - ExpandableListView.getPackedPositionChild(j)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $10 + 51;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 / 3;
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i3];
        System.arraycopy(cArr2, i2, cArr4, 0, i3);
        if (bArr != null) {
            int i9 = $10 + 69;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr = new char[i3];
                iTrustedWebActivityService_Parcel.copydefault = 1;
                c2 = 1;
            } else {
                cArr = new char[i3];
                iTrustedWebActivityService_Parcel.copydefault = 0;
                c2 = 0;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                int i10 = $10 + 57;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault2 == null) {
                            int i13 = 4502 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i14 = 37 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            char cCombineMeasuredStates = (char) (27897 - View.combineMeasuredStates(0, 0));
                            byte b2 = $$l[3];
                            byte b3 = (byte) (b2 + 1);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i13, i14, cCombineMeasuredStates, -1464227204, false, $$n(b3, (byte) (b3 | 42), b2), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i12] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i15 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        int i16 = 3579 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int i17 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        byte b4 = $$l[3];
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i16, i17, cNormalizeMetaState, 1180380354, false, $$n(b5, (byte) (b5 | 47), b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i15] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1859;
                    int i18 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 35;
                    char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    byte b6 = $$l[3];
                    byte b7 = (byte) (b6 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iNormalizeMetaState, i18, threadPriority, 80302927, false, $$n(b7, (byte) (b7 | 46), b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr4, 0, cArr5, 0, i3);
            int i19 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr4, i19, i5);
            System.arraycopy(cArr5, i5, cArr4, 0, i19);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                int i20 = $10 + 111;
                $11 = i20 % 128;
                int i21 = i20 % 2;
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr4[(i3 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr4 = cArr6;
        }
        if (i4 > 0) {
            int i22 = $11 + 99;
            $10 = i22 % 128;
            int i23 = i22 % 2;
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Override
    public void onReceive(Context context, Intent intent) throws Throwable {
        Object[] objArr;
        Object[] objArrComponent3$16dd2b22;
        char c2;
        int i;
        Object[] objArr2;
        Object[] objArr3;
        char c3;
        char c4 = 2;
        int i2 = 2 % 2;
        Object[] objArr4 = new Object[1];
        d(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, new int[]{32, 22, 0, 0}, false, objArr4);
        String str = (String) objArr4[0];
        Object[] objArr5 = new Object[1];
        d(new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, new int[]{54, 15, 67, 0}, false, objArr5);
        String str2 = (String) objArr5[0];
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(534243434);
        if (objCopydefault == null) {
            int i3 = 1183 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 16;
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            byte b2 = $$d[31];
            byte b3 = (byte) (b2 - 5);
            Object[] objArr6 = new Object[1];
            e(b2, b3, b3, objArr6);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3, threadPriority, touchSlop, -628214001, false, (String) objArr6[0], null);
        }
        if (((Field) objCopydefault).getLong(null) != -1) {
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(989174724);
            if (objCopydefault2 == null) {
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1184;
                int i4 = 17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                byte b4 = (byte) ($$e & 14);
                byte[] bArr = $$d;
                Object[] objArr7 = new Object[1];
                e(b4, (byte) (bArr[3] - 1), bArr[24], objArr7);
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatDelay, i4, packedPositionChild, -5487455, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objCopydefault2).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i5 = ((int[]) objArr8[1])[0];
            int i6 = ((int[]) objArr8[2])[0];
            String[] strArr = (String[]) objArr8[0];
            int i7 = (int) Runtime.getRuntime().totalMemory();
            int i8 = 1742784660 + ((~(i7 | 698167555)) * 216);
            int i9 = ~i7;
            int i10 = i8 + (((-335563489) | i9) * (-216)) + (((~(i9 | 698167555)) | 496790241) * 216) + 1466089811;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[3])[0] = i12 ^ (i12 << 5);
        } else {
            Context applicationContext = context != null ? (!((context instanceof ContextWrapper) ^ true) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            Object[] objArr9 = new Object[1];
            d(new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{0, 16, 48, 0}, true, objArr9);
            Class<?> cls = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            d(new byte[]{0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0}, new int[]{16, 16, 36, 15}, true, objArr10);
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(((Integer) cls.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue()), 0, 1466089811};
                byte[] bArr2 = $$j;
                byte b5 = bArr2[1];
                byte b6 = bArr2[77];
                Object[] objArr12 = new Object[1];
                f(b5, b6, (byte) (b6 & 68), objArr12);
                Class<?> cls2 = Class.forName((String) objArr12[0]);
                byte b7 = bArr2[1];
                Object[] objArr13 = new Object[1];
                f((byte) (b7 - 1), bArr2[6], b7, objArr13);
                objArr = (Object[]) cls2.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(989174724);
                if (objCopydefault3 == null) {
                    int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 1184;
                    int iRed = 16 - Color.red(0);
                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    Object[] objArr14 = new Object[1];
                    e((byte) ($$e & 14), (byte) ($$d[3] - 1), r11[24], objArr14);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(touchSlop2, iRed, fadingEdgeLength, -5487455, false, (String) objArr14[0], null);
                }
                ((Field) objCopydefault3).set(null, objArr);
                try {
                    long jLongValue = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1260029028);
                    if (objCopydefault4 == null) {
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1184;
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 16;
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        byte b8 = $$d[3];
                        byte b9 = (byte) (b8 - 1);
                        byte b10 = b8;
                        Object[] objArr15 = new Object[1];
                        e(b9, b10, (byte) (b10 | Ascii.DC2), objArr15);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(longPressTimeout, edgeSlop, packedPositionGroup, -1908188415, false, (String) objArr15[0], null);
                    }
                    ((Field) objCopydefault4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(534243434);
                    if (objCopydefault5 == null) {
                        int iLastIndexOf = 1183 - TextUtils.lastIndexOf("", '0');
                        int i13 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16;
                        char c5 = (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                        byte b11 = $$d[31];
                        byte b12 = (byte) (b11 - 5);
                        Object[] objArr16 = new Object[1];
                        e(b11, b12, b12, objArr16);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, i13, c5, -628214001, false, (String) objArr16[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf2);
                    c4 = 2;
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
        int i14 = ((int[]) objArr[c4])[0];
        int i15 = ((int[]) objArr[1])[0];
        if (i15 == i14) {
            Object[] objArr17 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i16 = ((int[]) objArr[3])[0];
            int i17 = ((int[]) objArr[1])[0];
            int i18 = ((int[]) objArr[2])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i19 = ~iFreeMemory;
            int i20 = i16 + (((~(i19 | 577784790)) | (~((-617173007) | i19)) | (~((-577784791) | iFreeMemory))) * 959) + 1988741417 + (((~(iFreeMemory | 577784790)) | (~(i19 | (-577784791))) | (~((-617173007) | iFreeMemory))) * 959);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr17[3])[0] = i22 ^ (i22 << 5);
            Object[] objArr18 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
            int i23 = ((int[]) objArr17[3])[0];
            int i24 = ((int[]) objArr17[1])[0];
            int i25 = ((int[]) objArr17[2])[0];
            String[] strArr3 = (String[]) objArr17[0];
            int iNextInt = new Random().nextInt();
            int i26 = ~iNextInt;
            int i27 = i23 + (-1641111292) + ((~(876116143 | i26)) * (-560)) + ((~(iNextInt | (-50397969))) * (-560)) + (((~(318841653 | i26)) | 607672458) * 560);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr18[3])[0] = i29 ^ (i29 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr4 = (String[]) objArr[0];
            if (strArr4 != null) {
                int i30 = getRequestBeneficiariesState + 41;
                component4 = i30 % 128;
                int i31 = 2;
                int i32 = i30 % 2;
                int i33 = 0;
                while (i33 < strArr4.length) {
                    int i34 = component4 + 59;
                    getRequestBeneficiariesState = i34 % 128;
                    int i35 = i34 % i31;
                    arrayList.add(strArr4[i33]);
                    i33++;
                    int i36 = getRequestBeneficiariesState + 41;
                    component4 = i36 % 128;
                    int i37 = i36 % 2;
                    i31 = 2;
                }
            }
            long j = -1;
            long j2 = 0;
            long j3 = (((j - ((j >> 63) << 32)) | (((long) 0) << 32)) & ((long) (i14 ^ i15))) | (((long) 4) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6618 - Drawable.resolveOpacity(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 42, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault6).invoke(null, null);
                Object[] objArr19 = {1921516709, Long.valueOf(j3), arrayList, null, false, false};
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6562 - TextUtils.getOffsetBefore("", 0), KeyEvent.normalizeMetaState(0) + 56, (char) KeyEvent.normalizeMetaState(0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault7).invoke(objInvoke, objArr19);
                Object[] objArr20 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
                int i38 = ((int[]) objArr[3])[0];
                int i39 = ((int[]) objArr[1])[0];
                int i40 = ((int[]) objArr[2])[0];
                String[] strArr5 = (String[]) objArr[0];
                int iIdentityHashCode = System.identityHashCode(this);
                int i41 = i38 + (-1770950140) + (((~((~iIdentityHashCode) | (-10617217))) | (~(1039658938 | iIdentityHashCode))) * (-302)) + ((~((-10617217) | iIdentityHashCode)) * (-604)) + (((~(iIdentityHashCode | 1029041722)) | 873742864) * 302);
                int i42 = (i41 << 13) ^ i41;
                int i43 = i42 ^ (i42 >>> 17);
                ((int[]) objArr20[3])[0] = i43 ^ (i43 << 5);
                int[] iArr = new int[i15];
                int i44 = i15 - 1;
                iArr[i44] = 1;
                Toast.makeText((Context) null, iArr[((i15 * i44) % 2) - 1], 1).show();
                Object[] objArr21 = {strArr, new int[]{i}, new int[]{i}, new int[1]};
                int i45 = ((int[]) objArr20[3])[0];
                int i46 = ((int[]) objArr20[1])[0];
                int i47 = ((int[]) objArr20[2])[0];
                String[] strArr6 = (String[]) objArr20[0];
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i48 = i45 + (((94034660 + (((~((-385599906) | iMaxMemory)) | 272220161) * 576)) + (((~((~iMaxMemory) | (-113379745))) | 537137730) * 576)) - 2114977216);
                int i49 = (i48 << 13) ^ i48;
                int i50 = i49 ^ (i49 >>> 17);
                ((int[]) objArr21[3])[0] = i50 ^ (i50 << 5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-1215495245);
        if (objCopydefault8 == null) {
            int doubleTapTimeout = 2405 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int i51 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25;
            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            byte b13 = $$d[31];
            byte b14 = (byte) (b13 - 5);
            Object[] objArr22 = new Object[1];
            e(b13, b14, b14, objArr22);
            objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(doubleTapTimeout, i51, jumpTapTimeout, 1926552790, false, (String) objArr22[0], null);
        }
        if (((Field) objCopydefault8).getLong(null) != -1) {
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-1005084067);
            if (objCopydefault9 == null) {
                int jumpTapTimeout2 = 2405 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i52 = 27 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                Object[] objArr23 = new Object[1];
                e((byte) ($$e & 14), (byte) ($$d[3] - 1), r6[25], objArr23);
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(jumpTapTimeout2, i52, scrollDefaultDelay, 21921080, false, (String) objArr23[0], null);
            }
            Object[] objArr24 = (Object[]) ((Field) objCopydefault9).get(null);
            objArrComponent3$16dd2b22 = new Object[]{new int[]{((int[]) objArr24[0])[0]}, new int[1], new int[]{((int[]) objArr24[2])[0]}, (String[]) objArr24[3]};
            int i53 = ~((~new Random().nextInt(1610948732)) | (-591266511));
            int i54 = (((((-671064815) | i53) * (-970)) + 1869973251) + ((i53 | 79798304) * 970)) - 778299120;
            int i55 = (i54 << 13) ^ i54;
            int i56 = i55 ^ (i55 >>> 17);
            ((int[]) objArrComponent3$16dd2b22[1])[0] = i56 ^ (i56 << 5);
            c2 = 0;
        } else {
            Object[] objArr25 = new Object[1];
            d(new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{0, 16, 48, 0}, true, objArr25);
            Class<?> cls3 = Class.forName((String) objArr25[0]);
            Object[] objArr26 = new Object[1];
            d(new byte[]{0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0}, new int[]{16, 16, 36, 15}, true, objArr26);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr26[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr27 = {1921516709};
            Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(-2036074497);
            if (objCopydefault10 == null) {
                objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 2393, ((byte) KeyEvent.getModifierMetaStateMask()) + 13, (char) (30139 - View.MeasureSpec.makeMeasureSpec(0, 0)), 1140467866, false, null, new Class[]{Integer.TYPE});
            }
            objArrComponent3$16dd2b22 = CMac.component3$16dd2b22(iIntValue, 0, ((Constructor) objCopydefault10).newInstance(objArr27), -778299120, false, false);
            Object objCopydefault11 = ITrustedWebActivityCallbackDefault.copydefault(-1005084067);
            if (objCopydefault11 == null) {
                int trimmedLength = TextUtils.getTrimmedLength("") + 2405;
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 27;
                char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                Object[] objArr28 = new Object[1];
                e((byte) ($$e & 14), (byte) ($$d[3] - 1), r8[25], objArr28);
                objCopydefault11 = ITrustedWebActivityCallbackDefault.copydefault(trimmedLength, iLastIndexOf2, absoluteGravity, 21921080, false, (String) objArr28[0], null);
            }
            ((Field) objCopydefault11).set(null, objArrComponent3$16dd2b22);
            try {
                long jLongValue2 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue2);
                Object objCopydefault12 = ITrustedWebActivityCallbackDefault.copydefault(-873460037);
                if (objCopydefault12 == null) {
                    int scrollBarSize = 2405 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int iIndexOf = TextUtils.indexOf("", "", 0) + 26;
                    char gidForName = (char) (Process.getGidForName("") + 1);
                    byte b15 = $$d[3];
                    byte b16 = (byte) (b15 - 1);
                    byte b17 = b15;
                    Object[] objArr29 = new Object[1];
                    e(b16, b17, (byte) (b17 | Ascii.DC2), objArr29);
                    objCopydefault12 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarSize, iIndexOf, gidForName, 246010334, false, (String) objArr29[0], null);
                }
                ((Field) objCopydefault12).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                Object objCopydefault13 = ITrustedWebActivityCallbackDefault.copydefault(-1215495245);
                if (objCopydefault13 == null) {
                    int i57 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2405;
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 26;
                    char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                    byte b18 = $$d[31];
                    byte b19 = (byte) (b18 - 5);
                    Object[] objArr30 = new Object[1];
                    e(b18, b19, b19, objArr30);
                    objCopydefault13 = ITrustedWebActivityCallbackDefault.copydefault(i57, capsMode, absoluteGravity2, 1926552790, false, (String) objArr30[0], null);
                }
                ((Field) objCopydefault13).set(null, lValueOf4);
                c2 = 0;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i58 = ((int[]) objArrComponent3$16dd2b22[c2])[c2];
        int i59 = ((int[]) objArrComponent3$16dd2b22[2])[c2];
        if (i59 == i58) {
            Object[] objArr31 = new Object[4];
            int[] iArr2 = new int[1];
            objArr31[c2] = iArr2;
            objArr31[1] = new int[1];
            int[] iArr3 = new int[1];
            objArr31[2] = iArr3;
            int i60 = ((int[]) objArrComponent3$16dd2b22[1])[c2];
            int i61 = ((int[]) objArrComponent3$16dd2b22[2])[c2];
            int i62 = ((int[]) objArrComponent3$16dd2b22[c2])[c2];
            String[] strArr7 = (String[]) objArrComponent3$16dd2b22[3];
            iArr3[c2] = i61;
            iArr2[c2] = i62;
            objArr31[3] = strArr7;
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i63 = ~startUptimeMillis;
            int i64 = i60 + (((~(692046200 | i63)) | (~((-754804563) | startUptimeMillis)) | (~(i63 | 754804562))) * 959) + 938426394 + (((~(startUptimeMillis | 754804562)) | (~(i63 | (-754804563))) | (~(692046200 | startUptimeMillis))) * 959);
            int i65 = (i64 << 13) ^ i64;
            int i66 = i65 ^ (i65 >>> 17);
            ((int[]) objArr31[1])[0] = i66 ^ (i66 << 5);
            int i67 = ((int[]) objArr31[1])[0];
            Object[] objArr32 = {new int[]{((int[]) objArr31[0])[0]}, new int[1], new int[]{((int[]) objArr31[2])[0]}, (String[]) objArr31[3]};
            int iNextInt2 = new Random().nextInt(916563229);
            int i68 = (-2112903461) + (((~((-440065938) | iNextInt2)) | 305676689 | (~((-377307576) | iNextInt2))) * (-754));
            int i69 = ~((-305676690) | iNextInt2);
            int i70 = ~iNextInt2;
            int i71 = i67 + i68 + ((i69 | (~((-71630887) | i70))) * (-754)) + ((i70 | (-440065938)) * 754);
            int i72 = (i71 << 13) ^ i71;
            int i73 = i72 ^ (i72 >>> 17);
            i = 0;
            ((int[]) objArr32[1])[0] = i73 ^ (i73 << 5);
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr8 = (String[]) objArrComponent3$16dd2b22[3];
            if (strArr8 != null) {
                int i74 = 0;
                while (i74 < strArr8.length) {
                    int i75 = getRequestBeneficiariesState + 7;
                    component4 = i75 % 128;
                    if (i75 % 2 == 0) {
                        arrayList2.add(strArr8[i74]);
                        i74 += 89;
                    } else {
                        arrayList2.add(strArr8[i74]);
                        i74++;
                    }
                }
            }
            long j4 = -1;
            long j5 = 0;
            long j6 = (((long) (i58 ^ i59)) & ((((long) 0) << 32) | (j4 - ((j4 >> 63) << 32)))) | (((long) 2) << 32) | (j5 - ((j5 >> 63) << 32));
            Object objCopydefault14 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault14 == null) {
                objCopydefault14 = ITrustedWebActivityCallbackDefault.copydefault(6617 - TextUtils.lastIndexOf("", '0', 0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 43, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault14).invoke(null, null);
            Object[] objArr33 = {1921516709, Long.valueOf(j6), arrayList2, null, false, false};
            Object objCopydefault15 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault15 == null) {
                objCopydefault15 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.indexOf((CharSequence) "", '0', 0), 56 - (KeyEvent.getMaxKeyCode() >> 16), (char) KeyEvent.keyCodeFromString(""), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault15).invoke(objInvoke2, objArr33);
            int i76 = ((int[]) objArrComponent3$16dd2b22[1])[0];
            Object[] objArr34 = {new int[]{((int[]) objArrComponent3$16dd2b22[0])[0]}, new int[1], new int[]{((int[]) objArrComponent3$16dd2b22[2])[0]}, (String[]) objArrComponent3$16dd2b22[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i77 = (-355118025) + (((~((-287339686) | iIdentityHashCode2)) | 224581323) * (-318));
            int i78 = ~(224581323 | iIdentityHashCode2);
            int i79 = ~iIdentityHashCode2;
            int i80 = i76 + i77 + ((i78 | (~((-205685323) | i79))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode2 | (-205685323))) | (~(493025007 | i79))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i81 = i80 ^ (i80 << 13);
            int i82 = i81 ^ (i81 >>> 17);
            ((int[]) objArr34[1])[0] = i82 ^ (i82 << 5);
            Toast.makeText((Context) null, i59 / (((i59 - 1) * i59) % 2), 0).show();
            int i83 = ((int[]) objArr34[1])[0];
            Object[] objArr35 = {new int[]{((int[]) objArr34[0])[0]}, new int[1], new int[]{((int[]) objArr34[2])[0]}, (String[]) objArr34[3]};
            int i84 = ~((int) Process.getStartElapsedRealtime());
            int i85 = i83 + (-1277631167) + (((-61345793) | i84) * 184) + (((~(i84 | 1404345)) | (-62741914)) * 184);
            int i86 = (i85 << 13) ^ i85;
            int i87 = i86 ^ (i86 >>> 17);
            i = 0;
            ((int[]) objArr35[1])[0] = i87 ^ (i87 << 5);
        }
        Object objCopydefault16 = ITrustedWebActivityCallbackDefault.copydefault(-1718204907);
        if (objCopydefault16 == null) {
            int i88 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1453;
            int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', i) + 23;
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', i, i) + 1);
            byte b20 = $$d[31];
            byte b21 = (byte) (b20 - 5);
            Object[] objArr36 = new Object[1];
            e(b20, b21, b21, objArr36);
            objCopydefault16 = ITrustedWebActivityCallbackDefault.copydefault(i88, iLastIndexOf3, cLastIndexOf, 1557109104, false, (String) objArr36[0], null);
        }
        long j7 = ((Field) objCopydefault16).getLong(null);
        long jLongValue3 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault17 = ITrustedWebActivityCallbackDefault.copydefault(1887269946);
        if (objCopydefault17 == null) {
            int iMakeMeasureSpec = 1454 - View.MeasureSpec.makeMeasureSpec(0, 0);
            int edgeSlop2 = 22 - (ViewConfiguration.getEdgeSlop() >> 16);
            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
            byte b22 = (byte) ($$e & 14);
            byte b23 = (byte) ($$d[3] - 1);
            Object[] objArr37 = new Object[1];
            e(b22, b23, (byte) (b23 | 43), objArr37);
            objCopydefault17 = ITrustedWebActivityCallbackDefault.copydefault(iMakeMeasureSpec, edgeSlop2, maxKeyCode, -1255888033, false, (String) objArr37[0], null);
        }
        if (j7 == ((jLongValue3 - ((((Field) objCopydefault17).getLong(null) << 52) >>> 52)) >> 12)) {
            int i89 = component4 + 1;
            getRequestBeneficiariesState = i89 % 128;
            int i90 = i89 % 2;
            Object objCopydefault18 = ITrustedWebActivityCallbackDefault.copydefault(1886346425);
            if (objCopydefault18 == null) {
                int packedPositionGroup2 = 1454 - ExpandableListView.getPackedPositionGroup(0L);
                int iResolveOpacity = 22 - Drawable.resolveOpacity(0, 0);
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                Object[] objArr38 = new Object[1];
                e((byte) ($$e & 14), (byte) ($$d[3] - 1), r6[24], objArr38);
                objCopydefault18 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionGroup2, iResolveOpacity, cResolveSizeAndState, -1254718500, false, (String) objArr38[0], null);
            }
            Object[] objArr39 = (Object[]) ((Field) objCopydefault18).get(null);
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr39[1])[0]}, new int[]{((int[]) objArr39[2])[0]}, (String[]) objArr39[3]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i91 = ~iIdentityHashCode3;
            int i92 = 375765130 + (((~((-1209931821) | i91)) | (~((-191865507) | iIdentityHashCode3))) * (-370)) + (((~(iIdentityHashCode3 | (-1209931821))) | (~(i91 | (-191865507))) | (-1266662063)) * (-370)) + 937433636;
            int i93 = (i92 << 13) ^ i92;
            int i94 = i93 ^ (i93 >>> 17);
            ((int[]) objArr2[0])[0] = i94 ^ (i94 << 5);
        } else {
            Object[] objArr40 = new Object[1];
            d(new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{0, 16, 48, 0}, true, objArr40);
            Class<?> cls4 = Class.forName((String) objArr40[0]);
            Object[] objArr41 = new Object[1];
            d(new byte[]{0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0}, new int[]{16, 16, 36, 15}, true, objArr41);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr41[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr42 = {1921516709};
            Object objCopydefault19 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
            if (objCopydefault19 == null) {
                objCopydefault19 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1663, 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 1006506020, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr43 = {Integer.valueOf(iIntValue2), 0, 1450961682, ((Constructor) objCopydefault19).newInstance(objArr42), false};
            Object objCopydefault20 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
            if (objCopydefault20 == null) {
                int i95 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1453;
                int iArgb = 22 - Color.argb(0, 0, 0, 0);
                char edgeSlop3 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                Object[] objArr44 = new Object[1];
                e((byte) ($$e & 14), (byte) ($$d[3] - 1), r8[25], objArr44);
                objCopydefault20 = ITrustedWebActivityCallbackDefault.copydefault(i95, iArgb, edgeSlop3, 1908380642, false, (String) objArr44[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 1591, MotionEvent.axisFromString("") + 40, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L))), Boolean.TYPE});
            }
            objArr2 = (Object[]) ((Method) objCopydefault20).invoke(null, objArr43);
            Object objCopydefault21 = ITrustedWebActivityCallbackDefault.copydefault(1886346425);
            if (objCopydefault21 == null) {
                int i96 = 1455 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22;
                char defaultSize = (char) View.getDefaultSize(0, 0);
                Object[] objArr45 = new Object[1];
                e((byte) ($$e & 14), (byte) ($$d[3] - 1), r8[24], objArr45);
                objCopydefault21 = ITrustedWebActivityCallbackDefault.copydefault(i96, minimumFlingVelocity, defaultSize, -1254718500, false, (String) objArr45[0], null);
            }
            ((Field) objCopydefault21).set(null, objArr2);
            try {
                long jLongValue4 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objCopydefault22 = ITrustedWebActivityCallbackDefault.copydefault(1887269946);
                if (objCopydefault22 == null) {
                    int i97 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1454;
                    int touchSlop3 = (ViewConfiguration.getTouchSlop() >> 8) + 22;
                    char touchSlop4 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    byte b24 = (byte) ($$e & 14);
                    byte b25 = (byte) ($$d[3] - 1);
                    Object[] objArr46 = new Object[1];
                    e(b24, b25, (byte) (b25 | 43), objArr46);
                    objCopydefault22 = ITrustedWebActivityCallbackDefault.copydefault(i97, touchSlop3, touchSlop4, -1255888033, false, (String) objArr46[0], null);
                }
                ((Field) objCopydefault22).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objCopydefault23 = ITrustedWebActivityCallbackDefault.copydefault(-1718204907);
                if (objCopydefault23 == null) {
                    int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1454;
                    int i98 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
                    char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte b26 = $$d[31];
                    byte b27 = (byte) (b26 - 5);
                    Object[] objArr47 = new Object[1];
                    e(b26, b27, b27, objArr47);
                    objCopydefault23 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatDelay2, i98, windowTouchSlop, 1557109104, false, (String) objArr47[0], null);
                }
                ((Field) objCopydefault23).set(null, lValueOf6);
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
        }
        int i99 = ((int[]) objArr2[2])[0];
        int i100 = ((int[]) objArr2[1])[0];
        if (i100 != i99) {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr9 = (String[]) objArr2[3];
            if (strArr9 != null) {
                int i101 = component4 + 61;
                getRequestBeneficiariesState = i101 % 128;
                int i102 = i101 % 2;
                for (String str3 : strArr9) {
                    arrayList3.add(str3);
                }
            }
            long j8 = -1;
            long j9 = ((long) (i100 ^ i99)) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)));
            long j10 = 0;
            long j11 = j9 | (((long) 1) << 32) | (j10 - ((j10 >> 63) << 32));
            Object objCopydefault24 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault24 == null) {
                objCopydefault24 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetAfter("", 0) + 6618, 41 - TextUtils.indexOf((CharSequence) "", '0'), (char) View.combineMeasuredStates(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke3 = ((Method) objCopydefault24).invoke(null, null);
            Object[] objArr48 = {1921516709, Long.valueOf(j11), arrayList3, null, false, false};
            Object objCopydefault25 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault25 == null) {
                objCopydefault25 = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 6563, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 56, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault25).invoke(objInvoke3, objArr48);
            int i103 = ((int[]) objArr2[0])[0];
            Object[] objArr49 = {new int[1], new int[]{((int[]) objArr2[1])[0]}, new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            int i104 = ~((int) Runtime.getRuntime().maxMemory());
            int i105 = ~(143589743 | i104);
            int i106 = i103 + 1039373066 + ((i105 | 1258207583) * 764) + (((~(i104 | 1258207583)) | 65568) * (-1528)) + ((1114748976 | i105) * 764);
            int i107 = (i106 << 13) ^ i106;
            int i108 = i107 ^ (i107 >>> 17);
            ((int[]) objArr49[0])[0] = i108 ^ (i108 << 5);
            throw new RuntimeException(String.valueOf(i100));
        }
        int i109 = ((int[]) objArr2[0])[0];
        Object[] objArr50 = {new int[1], new int[]{((int[]) objArr2[1])[0]}, new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
        int i110 = ~((int) SystemClock.uptimeMillis());
        int i111 = i109 + (-268308285) + (((~((-1050920689) | i110)) | (-350876639)) * (-983)) + (((~(i110 | (-350876639))) | 4731150) * 983);
        int i112 = (i111 << 13) ^ i111;
        int i113 = i112 ^ (i112 >>> 17);
        ((int[]) objArr50[0])[0] = i113 ^ (i113 << 5);
        int i114 = ((int[]) objArr50[0])[0];
        Object[] objArr51 = {new int[1], new int[]{((int[]) objArr50[1])[0]}, new int[]{((int[]) objArr50[2])[0]}, (String[]) objArr50[3]};
        int i115 = ~System.identityHashCode(this);
        int i116 = i114 + 1264212334 + (((~(i115 | 292320207)) | (-1399683072)) * (-160)) + (((~(i115 | (-1109477120))) | 292320207) * 160);
        int i117 = (i116 << 13) ^ i116;
        int i118 = i117 ^ (i117 >>> 17);
        ((int[]) objArr51[0])[0] = i118 ^ (i118 << 5);
        Object objCopydefault26 = ITrustedWebActivityCallbackDefault.copydefault(-1729554888);
        if (objCopydefault26 == null) {
            int i119 = 2985 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int iCombineMeasuredStates = 48 - View.combineMeasuredStates(0, 0);
            char c6 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 54463);
            byte b28 = $$d[3];
            byte b29 = (byte) (b28 - 1);
            byte b30 = b28;
            Object[] objArr52 = new Object[1];
            e(b29, b30, (byte) (b30 | Ascii.DC2), objArr52);
            objCopydefault26 = ITrustedWebActivityCallbackDefault.copydefault(i119, iCombineMeasuredStates, c6, 1571866973, false, (String) objArr52[0], null);
        }
        if (((Field) objCopydefault26).getLong(null) != -1) {
            int i120 = getRequestBeneficiariesState + 67;
            component4 = i120 % 128;
            int i121 = i120 % 2;
            Object objCopydefault27 = ITrustedWebActivityCallbackDefault.copydefault(524452374);
            if (objCopydefault27 == null) {
                int defaultSize2 = 2984 - View.getDefaultSize(0, 0);
                int i122 = 49 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                char cAlpha = (char) (54462 - Color.alpha(0));
                byte b31 = $$d[31];
                byte b32 = (byte) (b31 - 5);
                Object[] objArr53 = new Object[1];
                e(b31, b32, b32, objArr53);
                objCopydefault27 = ITrustedWebActivityCallbackDefault.copydefault(defaultSize2, i122, cAlpha, -635740813, false, (String) objArr53[0], null);
            }
            Object[] objArr54 = (Object[]) ((Field) objCopydefault27).get(null);
            objArr3 = new Object[]{new int[]{((int[]) objArr54[0])[0]}, new int[]{((int[]) objArr54[1])[0]}, new int[1], (String[]) objArr54[3]};
            int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
            int i123 = ((217153934 + (((~((-133) | (~iFreeMemory2))) | (-2110717696)) * (-591))) + ((iFreeMemory2 | (-133)) * 591)) - 1557064306;
            int i124 = (i123 << 13) ^ i123;
            int i125 = i124 ^ (i124 >>> 17);
            ((int[]) objArr3[2])[0] = i125 ^ (i125 << 5);
            c3 = 0;
        } else {
            Context applicationContext2 = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            Object[] objArr55 = new Object[1];
            d(new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{0, 16, 48, 0}, true, objArr55);
            Class<?> cls5 = Class.forName((String) objArr55[0]);
            Object[] objArr56 = new Object[1];
            d(new byte[]{0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0}, new int[]{16, 16, 36, 15}, true, objArr56);
            Object[] objArr57 = {applicationContext2, Integer.valueOf(((Integer) cls5.getMethod((String) objArr56[0], Object.class).invoke(null, this)).intValue()), 0, -1557064306};
            Object[] objArr58 = new Object[1];
            g(127 - ExpandableListView.getPackedPositionType(0L), null, new byte[]{-119, -114, -122, -117, -126, -108, -110, -117, -111, -118, -100, -101, -110, -119, -114, -122, -117, -126, -108, -115, -114, -118, -102, -103, -114, -119, -117, -126, -108, -120, -119, -118, -104, -111, -118, -105, -115, -119, -106, -124, -114, -119, -117, -126, -125, -120, -119, -118, -107, -124, -109, -119, -115, -110, -118, -116, -119, -109, -124, -119, -114, -122, -117, -126, -108, -111, -118, -116, -126, -114, -124, -109, -119, -125, -122, -110, -111, -126, -127, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr58);
            Class<?> cls6 = Class.forName(((String) objArr58[0]).intern());
            byte b33 = $$j[1];
            byte b34 = (byte) (b33 - 1);
            Object[] objArr59 = new Object[1];
            f(b34, (byte) (b34 | 86), (byte) (b33 - 1), objArr59);
            Object[] objArr60 = (Object[]) cls6.getMethod((String) objArr59[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr57);
            if (applicationContext2 != null) {
                Object objCopydefault28 = ITrustedWebActivityCallbackDefault.copydefault(524452374);
                if (objCopydefault28 == null) {
                    int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 2984;
                    int i126 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 47;
                    char absoluteGravity3 = (char) (54462 - Gravity.getAbsoluteGravity(0, 0));
                    byte b35 = $$d[31];
                    byte b36 = (byte) (b35 - 5);
                    Object[] objArr61 = new Object[1];
                    e(b35, b36, b36, objArr61);
                    objCopydefault28 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf2, i126, absoluteGravity3, -635740813, false, (String) objArr61[0], null);
                }
                ((Field) objCopydefault28).set(null, objArr60);
                try {
                    long jLongValue5 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf7 = Long.valueOf(jLongValue5);
                    Object objCopydefault29 = ITrustedWebActivityCallbackDefault.copydefault(1682519065);
                    if (objCopydefault29 == null) {
                        int absoluteGravity4 = Gravity.getAbsoluteGravity(0, 0) + 2984;
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 48;
                        char threadPriority2 = (char) (54462 - ((Process.getThreadPriority(0) + 20) >> 6));
                        byte b37 = (byte) ($$e & 14);
                        byte b38 = (byte) ($$d[3] - 1);
                        Object[] objArr62 = new Object[1];
                        e(b37, b38, (byte) (b38 | 43), objArr62);
                        objCopydefault29 = ITrustedWebActivityCallbackDefault.copydefault(absoluteGravity4, offsetAfter, threadPriority2, -1592726660, false, (String) objArr62[0], null);
                    }
                    ((Field) objCopydefault29).set(null, lValueOf7);
                    Long lValueOf8 = Long.valueOf(jLongValue5 >> 12);
                    Object objCopydefault30 = ITrustedWebActivityCallbackDefault.copydefault(-1729554888);
                    if (objCopydefault30 == null) {
                        int i127 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2985;
                        int i128 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 48;
                        char cIndexOf = (char) (TextUtils.indexOf("", "") + 54462);
                        byte b39 = $$d[3];
                        byte b40 = (byte) (b39 - 1);
                        byte b41 = b39;
                        Object[] objArr63 = new Object[1];
                        e(b40, b41, (byte) (b41 | Ascii.DC2), objArr63);
                        objCopydefault30 = ITrustedWebActivityCallbackDefault.copydefault(i127, i128, cIndexOf, 1571866973, false, (String) objArr63[0], null);
                    }
                    ((Field) objCopydefault30).set(null, lValueOf8);
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            }
            objArr3 = objArr60;
            c3 = 0;
        }
        int i129 = ((int[]) objArr3[c3])[c3];
        int i130 = ((int[]) objArr3[1])[c3];
        if (i130 == i129) {
            int i131 = getRequestBeneficiariesState + 51;
            component4 = i131 % 128;
            int i132 = i131 % 2;
            int i133 = ((int[]) objArr3[2])[0];
            Object[] objArr64 = {new int[]{((int[]) objArr3[0])[0]}, new int[]{((int[]) objArr3[1])[0]}, new int[1], (String[]) objArr3[3]};
            int iFreeMemory3 = (int) Runtime.getRuntime().freeMemory();
            int i134 = i133 + 1328404809 + (((~((~iFreeMemory3) | (-1451954244))) | 100859968) * 446) + (((~(iFreeMemory3 | (-1351094276))) | 557903616) * 446) + 2033872768;
            int i135 = (i134 << 13) ^ i134;
            int i136 = i135 ^ (i135 >>> 17);
            ((int[]) objArr64[2])[0] = i136 ^ (i136 << 5);
            int i137 = ((int[]) objArr64[2])[0];
            Object[] objArr65 = {new int[]{((int[]) objArr64[0])[0]}, new int[]{((int[]) objArr64[1])[0]}, new int[1], (String[]) objArr64[3]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i138 = i137 + (-176423797) + (((~(iUptimeMillis | 1182390773)) | (-928327055)) * (-465)) + ((1182390773 | (~((-928327055) | iUptimeMillis))) * 930) + ((iUptimeMillis | (-822354955)) * 465);
            int i139 = i138 ^ (i138 << 13);
            int i140 = i139 ^ (i139 >>> 17);
            ((int[]) objArr65[2])[0] = i140 ^ (i140 << 5);
            inject(context);
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        String[] strArr10 = (String[]) objArr3[3];
        if (strArr10 != null) {
            int i141 = 0;
            while (i141 < strArr10.length) {
                int i142 = component4 + 77;
                getRequestBeneficiariesState = i142 % 128;
                if (i142 % 2 != 0) {
                    arrayList4.add(strArr10[i141]);
                    i141 += 5;
                } else {
                    arrayList4.add(strArr10[i141]);
                    i141++;
                }
            }
        }
        long j12 = -1;
        long j13 = ((long) (i130 ^ i129)) & ((((long) 0) << 32) | (j12 - ((j12 >> 63) << 32)));
        long j14 = 0;
        long j15 = j13 | (((long) 3) << 32) | (j14 - ((j14 >> 63) << 32));
        Object objCopydefault31 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
        if (objCopydefault31 == null) {
            objCopydefault31 = ITrustedWebActivityCallbackDefault.copydefault(6619 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 42 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
        }
        Object objInvoke4 = ((Method) objCopydefault31).invoke(null, null);
        Object[] objArr66 = {1921516709, Long.valueOf(j15), arrayList4, null, false, false};
        Object objCopydefault32 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
        if (objCopydefault32 == null) {
            objCopydefault32 = ITrustedWebActivityCallbackDefault.copydefault(6562 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 56, (char) (ViewConfiguration.getLongPressTimeout() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
        }
        ((Method) objCopydefault32).invoke(objInvoke4, objArr66);
        int i143 = ((int[]) objArr3[2])[0];
        Object[] objArr67 = {new int[]{((int[]) objArr3[0])[0]}, new int[]{((int[]) objArr3[1])[0]}, new int[1], (String[]) objArr3[3]};
        int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
        int i144 = i143 + ((((-1409130483) + (((~iMaxMemory2) | (-2039414660)) * 1444)) + (((~(iMaxMemory2 | 1789152513)) | ((~(321565314 | iMaxMemory2)) | (-2075066244))) * (-1444))) - 716398730);
        int i145 = (i144 << 13) ^ i144;
        int i146 = i145 ^ (i145 >>> 17);
        ((int[]) objArr67[2])[0] = i146 ^ (i146 << 5);
        throw new RuntimeException(String.valueOf(i130));
    }

    protected void inject(Context context) {
        if (this.injected) {
            return;
        }
        synchronized (this.injectedLock) {
            if (!this.injected) {
                ((DeviceRestartReceiver_GeneratedInjector) BroadcastReceiverComponentManager.generatedComponent(context)).injectDeviceRestartReceiver((DeviceRestartReceiver) UnsafeCasts.unsafeCast(this));
                this.injected = true;
            }
        }
    }

    static {
        getAsAtTimestamp = 1;
        component1();
        component1 = new char[]{30323, 30311, 30309, 30244, 30318, 30301, 30321, 30303, 30317, 30313, 30322, 30319, 30306, 30314, 30310, 30297, 30308, 30307, 30304, 30213, 30300, 30211, 30214, 30332, 30327, 30222, 30258, 30224};
        copydefault = 321287894;
        component3 = true;
        ShareDataUIState = true;
        int i = equals + 25;
        getAsAtTimestamp = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component1() {
        component2 = new char[]{33425, 33350, 33347, 33404, 33401, 33353, 33455, 33445, 33349, 33352, 33353, 33442, 33448, 33348, 33348, 33354, 33435, 33362, 33442, 33446, 33358, 33361, 33447, 33371, 33349, 33357, 33357, 33354, 33362, 33367, 33365, 33364, 33519, 33464, 33462, 33460, 33455, 33459, 33465, 33430, 33425, 33454, 33423, 33439, 33465, 33449, 33452, 33459, 33462, 33415, 33416, 33458, 33462, 33464, 33419, 33396, 33398, 33396, 33387, 33392, 33400, 33345, 33345, 33401, 33398, 33388, 33390, 33393, 33395};
    }
}
