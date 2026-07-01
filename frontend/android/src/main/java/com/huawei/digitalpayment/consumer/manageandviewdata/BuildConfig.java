package com.huawei.digitalpayment.consumer.manageandviewdata;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.primitives.SignedBytes;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;

public final class BuildConfig {
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    private static int ShareDataUIState;
    private static byte[] component1;
    private static int component2;
    private static int component3;
    private static int component4;
    private static short[] copydefault;
    private static final byte[] $$a = {5, SignedBytes.MAX_POWER_OF_TWO, 127, 81};
    private static final int $$b = 183;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int equals = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, byte r8) {
        /*
            int r6 = r6 + 112
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.manageandviewdata.BuildConfig.$$a
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r6 = r7
            r3 = r8
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L1f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L1f:
            int r3 = r3 + 1
            int r8 = r8 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L29:
            int r8 = -r8
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.manageandviewdata.BuildConfig.$$c(byte, int, byte):java.lang.String");
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        long j;
        int length;
        byte[] bArr;
        int i4;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(ShareDataUIState)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                int size = View.MeasureSpec.getSize(0) + 999;
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 31;
                char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 61685);
                byte b3 = (byte) ($$b & 1);
                byte b4 = (byte) (b3 - 1);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(size, iNormalizeMetaState, scrollDefaultDelay, 1874745193, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (!z) {
                j = 7083766810336261929L;
            } else {
                byte[] bArr2 = component1;
                if (bArr2 != null) {
                    int i8 = $11 + 77;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i4 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i4 = 0;
                    }
                    while (i4 < length) {
                        int i9 = $11 + 37;
                        $10 = i9 % 128;
                        if (i9 % i6 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i4])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                int i10 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2984;
                                int touchSlop = 48 - (ViewConfiguration.getTouchSlop() >> 8);
                                char touchSlop2 = (char) (54462 - (ViewConfiguration.getTouchSlop() >> 8));
                                byte length2 = (byte) $$a.length;
                                byte b5 = (byte) (length2 - 4);
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i10, touchSlop, touchSlop2, -1178636483, false, $$c(length2, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                            }
                            bArr[i4] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr2[i4])};
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault3 == null) {
                                int threadPriority = 2984 - ((Process.getThreadPriority(0) + 20) >> 6);
                                int i11 = 48 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 54462);
                                byte length3 = (byte) $$a.length;
                                byte b6 = (byte) (length3 - 4);
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(threadPriority, i11, doubleTapTimeout, -1178636483, false, $$c(length3, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
                            }
                            bArr[i4] = ((Byte) ((Method) objCopydefault3).invoke(null, objArr4)).byteValue();
                            i4++;
                        }
                        i6 = 2;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = component1;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(component2)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault4 == null) {
                        int i12 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 999;
                        int iIndexOf = 30 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 61685);
                        byte b7 = (byte) ($$b & 1);
                        byte b8 = (byte) (b7 - 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i12, iIndexOf, scrollBarSize, 1874745193, false, $$c(b7, b8, (byte) (b8 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)));
                    j = 7083766810336261929L;
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) copydefault[i + ((int) (((long) component2) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                int i13 = ((i + iIntValue) - 2) + ((int) (((long) component2) ^ j));
                if (z) {
                    int i14 = $10 + 9;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                getsmalliconid.copydefault = i13 + i5;
                try {
                    Object[] objArr6 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(component3), sb};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                    if (objCopydefault5 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1697, (Process.myTid() >> 22) + 37, (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), -1454191902, false, $$c(b9, b10, (byte) (b10 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objCopydefault5).invoke(null, objArr6)).append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    byte[] bArr4 = component1;
                    if (bArr4 != null) {
                        int i16 = $11 + 85;
                        int i17 = i16 % 128;
                        $10 = i17;
                        int i18 = i16 % 2;
                        int length4 = bArr4.length;
                        byte[] bArr5 = new byte[length4];
                        int i19 = i17 + 37;
                        $11 = i19 % 128;
                        int i20 = i19 % 2;
                        for (int i21 = 0; i21 < length4; i21++) {
                            int i22 = $11 + 19;
                            $10 = i22 % 128;
                            int i23 = i22 % 2;
                            bArr5[i21] = (byte) (((long) bArr4[i21]) ^ 7083766810336261929L);
                        }
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    getsmalliconid.component2 = 1;
                    while (getsmalliconid.component2 < iIntValue) {
                        if (z2) {
                            byte[] bArr6 = component1;
                            getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                            getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                        } else {
                            short[] sArr = copydefault;
                            getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                            getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                        }
                        sb.append(getsmalliconid.component1);
                        getsmalliconid.component3 = getsmalliconid.component1;
                        getsmalliconid.component2++;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static {
        component4 = 0;
        ShareDataUIState();
        Object[] objArr = new Object[1];
        a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 221799463, (-95) - KeyEvent.normalizeMetaState(0), (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 35), (byte) View.MeasureSpec.getMode(0), MotionEvent.axisFromString("") - 599378655, objArr);
        LIBRARY_PACKAGE_NAME = ((String) objArr[0]).intern();
        int i = equals + 63;
        component4 = i % 128;
        if (i % 2 != 0) {
            int i2 = 25 / 0;
        }
    }

    static void ShareDataUIState() {
        component2 = 51178736;
        ShareDataUIState = -238323849;
        component3 = -764232598;
        component1 = new byte[]{-1, -30, -40, -14, -30, -39, -13, -8, -39, -3, -62, -13, -11, -51, -8, -62, -5, TarHeader.LF_BLK, -77, -62, -1, -1, -55, -54, -12, -61, 58, -79, -51, -50, -1, -5, -33, -26, -53, -64, -30, -64, -55, -11, -54, Base64.padSymbol, -118, -53, -27, -35, -29, -62, TarHeader.LF_LINK, -74, -11, -61};
    }
}
