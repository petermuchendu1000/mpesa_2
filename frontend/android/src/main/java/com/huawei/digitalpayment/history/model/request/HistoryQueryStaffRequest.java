package com.huawei.digitalpayment.history.model.request;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.http.BaseRequestParams;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import org.bouncycastle.crypto.signers.PSSSigner;

public class HistoryQueryStaffRequest extends BaseRequestParams {
    private String initiatorOperatorCode;
    private String initiatorShortCode;
    private static final byte[] $$c = {80, 83, -21, -55};
    private static final int $$f = 85;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {TarHeader.LF_SYMLINK, -82, -81, 124, -3, Ascii.VT, 57, -52, -13, -6, 7, Ascii.VT, -22, Ascii.SYN, 2, -18, -1, 8, 7, TarHeader.LF_CONTIG, -60, 7, 2, -9, 7, -2, TarHeader.LF_CONTIG, -66, -2, 3, -7, 13, 5, -1, -13, 68, -51, -18, -6, Ascii.FF, 0, 8, -15, 2, 9, 6, TarHeader.LF_DIR, PSSSigner.TRAILER_IMPLICIT, -1, Ascii.DC2, TarHeader.LF_CHR, -22, -37, 2, 2, -14, -1, 33, -22, 2, -7, 13, -19, -1, 3, 13, Ascii.DC2, -29, 7, -21, 7, -17, 13, 33, -29, -19, 19, Ascii.FF, Ascii.FF, -10, -33, 19, -19, Ascii.SI};
    private static final int $$e = 40;
    private static final byte[] $$a = {70, 83, 77, 1, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK};
    private static final int $$b = 28;
    private static int component1 = 0;
    private static int getAsAtTimestamp = 1;
    private static char component2 = 2729;
    private static char ShareDataUIState = 45999;
    private static char component3 = 2046;
    private static char copydefault = 43435;

    private static String $$g(int i, short s, short s2) {
        int i2 = i + 4;
        int i3 = s * 3;
        int i4 = 111 - (s2 * 4);
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i4 = (-i2) + i4;
            i2 = i2;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i4;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            int i7 = i2 + 1;
            i5 = i6;
            i4 = (-bArr[i7]) + i4;
            i2 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 6
            int r0 = r6 + 10
            byte[] r1 = com.huawei.digitalpayment.history.model.request.HistoryQueryStaffRequest.$$a
            int r7 = r7 * 3
            int r7 = 27 - r7
            int r8 = r8 * 16
            int r8 = 99 - r8
            byte[] r0 = new byte[r0]
            int r6 = r6 + 9
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L30
        L19:
            r3 = r2
        L1a:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L30:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-17)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.model.request.HistoryQueryStaffRequest.a(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 50
            int r8 = r8 + 16
            int r7 = r7 * 28
            int r7 = 111 - r7
            byte[] r0 = com.huawei.digitalpayment.history.model.request.HistoryQueryStaffRequest.$$d
            int r6 = r6 * 65
            int r6 = 69 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r6]
        L29:
            int r3 = -r3
            int r6 = r6 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.model.request.HistoryQueryStaffRequest.c(int, byte, int, java.lang.Object[]):void");
    }

    public String getInitiatorShortCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 123;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.initiatorShortCode;
        int i5 = i3 + 85;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setInitiatorShortCode(String str) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 43;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.initiatorShortCode = str;
        if (i4 != 0) {
            int i5 = 46 / 0;
        }
        int i6 = i2 + 99;
        component1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public String getInitiatorOperatorCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 87;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.initiatorOperatorCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 85;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i6 = $11 + 75;
            $10 = i6 % 128;
            int i7 = i6 % i2;
            int i8 = 58224;
            int i9 = 0;
            while (i9 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i10 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) component3) ^ 4374495167426960553L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(copydefault);
                    objArr2[i2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 843, 32 - View.MeasureSpec.getMode(0), (char) (23251 - TextUtils.indexOf("", "")), 592652048, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) component2) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 796, Color.green(0) + 32, (char) (23251 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 592652048, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 465, 49 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i2 = 2;
        }
        String str = new String(cArr2, 0, i);
        int i12 = $11 + 41;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        objArr[0] = str;
    }

    public void setInitiatorOperatorCode(String str) throws Throwable {
        int length;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = component1 + 107;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-862225659);
        if (objCopydefault == null) {
            int i4 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2025;
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 23;
            char cMakeMeasureSpec = (char) (6164 - View.MeasureSpec.makeMeasureSpec(0, 0));
            byte[] bArr = $$a;
            byte b2 = bArr[3];
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (-bArr[24]), b2, objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4, absoluteGravity, cMakeMeasureSpec, 163751008, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b(View.resolveSizeAndState(0, 0, 0) + 22, new char[]{21107, 43837, 800, 52243, 19996, 10049, 6543, 39622, 50982, 61242, 41914, 1531, 51385, 46967, 11282, 59585, 54742, 51406, 21862, 44486, 49711, 47800}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{23044, 7046, 18445, 64060, 48972, 62659, 35336, 46314, 59439, 64852, 39525, 1665, 38197, 36285, 35213, 24767}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-744988891);
        if (objCopydefault2 == null) {
            int maximumFlingVelocity = 2026 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int trimmedLength = 23 - TextUtils.getTrimmedLength("");
            char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6163);
            byte b3 = (byte) ($$a[3] - 1);
            byte b4 = (byte) (b3 + 3);
            Object[] objArr5 = new Object[1];
            a(b3, b4, (byte) (b4 - 3), objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(maximumFlingVelocity, trimmedLength, c2, 381780032, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-744065370);
            if (objCopydefault3 == null) {
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2026;
                int i5 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23;
                char packedPositionGroup = (char) (6164 - ExpandableListView.getPackedPositionGroup(0L));
                byte b5 = (byte) ($$a[3] - 1);
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                a(b5, b6, b6, objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, i5, packedPositionGroup, 385853891, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new int[1], new int[]{i}, strArr, new int[]{i}};
            int i6 = ((int[]) objArr7[1])[0];
            int i7 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[2];
            int iNextInt = new Random().nextInt();
            int i8 = ~iNextInt;
            int i9 = 324906916 + ((~((-1762316261) | i8)) * 979) + ((iNextInt | 330317215) * (-979)) + (((~((-1762316261) | iNextInt)) | (~(i8 | 330317215))) * 979) + 782132144;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
        } else {
            if (str != null) {
                int i12 = component1 + 47;
                getAsAtTimestamp = i12 % 128;
                if (i12 % 2 == 0) {
                    str.length();
                    obj.hashCode();
                    throw null;
                }
                length = str.length();
            } else {
                length = 0;
            }
            int i13 = getAsAtTimestamp + 85;
            component1 = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr8 = {null, Integer.valueOf(length), 0, 782132144};
                byte[] bArr2 = $$d;
                byte b7 = bArr2[16];
                Object[] objArr9 = new Object[1];
                c((byte) (-b7), bArr2[40], (byte) (-b7), objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                byte b8 = bArr2[40];
                Object[] objArr10 = new Object[1];
                c(b8, (byte) (-bArr2[16]), b8, objArr10);
                objArr = (Object[]) cls2.getMethod((String) objArr10[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-744065370);
                if (objCopydefault4 == null) {
                    int offsetBefore = 2026 - TextUtils.getOffsetBefore("", 0);
                    int packedPositionChild = 22 - ExpandableListView.getPackedPositionChild(0L);
                    char cLastIndexOf = (char) (6163 - TextUtils.lastIndexOf("", '0'));
                    byte b9 = (byte) ($$a[3] - 1);
                    byte b10 = b9;
                    Object[] objArr11 = new Object[1];
                    a(b9, b10, b10, objArr11);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, packedPositionChild, cLastIndexOf, 385853891, false, (String) objArr11[0], null);
                }
                ((Field) objCopydefault4).set(null, objArr);
                try {
                    Object[] objArr12 = new Object[1];
                    b(KeyEvent.normalizeMetaState(0) + 22, new char[]{21107, 43837, 800, 52243, 19996, 10049, 6543, 39622, 50982, 61242, 41914, 1531, 51385, 46967, 11282, 59585, 54742, 51406, 21862, 44486, 49711, 47800}, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    b((ViewConfiguration.getLongPressTimeout() >> 16) + 15, new char[]{23044, 7046, 18445, 64060, 48972, 62659, 35336, 46314, 59439, 64852, 39525, 1665, 38197, 36285, 35213, 24767}, objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-744988891);
                    if (objCopydefault5 == null) {
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2026;
                        int iIndexOf = TextUtils.indexOf("", "") + 23;
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6165);
                        byte b11 = (byte) ($$a[3] - 1);
                        byte b12 = (byte) (b11 + 3);
                        Object[] objArr14 = new Object[1];
                        a(b11, b12, (byte) (b12 - 3), objArr14);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatDelay, iIndexOf, cIndexOf, 381780032, false, (String) objArr14[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-862225659);
                    if (objCopydefault6 == null) {
                        int iIndexOf2 = 2026 - TextUtils.indexOf("", "");
                        int touchSlop = 23 - (ViewConfiguration.getTouchSlop() >> 8);
                        char c3 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6163);
                        byte[] bArr3 = $$a;
                        byte b13 = bArr3[3];
                        Object[] objArr15 = new Object[1];
                        a(b13, (byte) (-bArr3[24]), b13, objArr15);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf2, touchSlop, c3, 163751008, false, (String) objArr15[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf2);
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
        int i15 = ((int[]) objArr[3])[0];
        int i16 = ((int[]) objArr[1])[0];
        if (i16 == i15) {
            Object[] objArr16 = {new int[1], new int[]{i}, strArr, new int[]{i}};
            int i17 = ((int[]) objArr[0])[0];
            int i18 = ((int[]) objArr[1])[0];
            int i19 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[2];
            int iIdentityHashCode = System.identityHashCode(this);
            int i20 = i17 + 390290611 + (((~((-158972530) | iIdentityHashCode)) | 21041680) * 1504) + ((~(iIdentityHashCode | (-137930850))) * (-1504)) + 120427216;
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr16[0])[0] = i22 ^ (i22 << 5);
            Object[] objArr17 = {new int[1], new int[]{i}, strArr2, new int[]{i}};
            int i23 = ((int[]) objArr16[0])[0];
            int i24 = ((int[]) objArr16[1])[0];
            int i25 = ((int[]) objArr16[3])[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i26 = ~((-51958547) | iIdentityHashCode2);
            int i27 = (-1449753201) + ((35176706 | i26) * (-280)) + ((i26 | (~((-2040674930) | iIdentityHashCode2))) * 140);
            int i28 = ~((-16781841) | iIdentityHashCode2);
            int i29 = ~iIdentityHashCode2;
            int i30 = i23 + i27 + (((~(i29 | (-2023893090))) | i28 | (~((-35176707) | i29))) * 140);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr17[0])[0] = i32 ^ (i32 << 5);
            this.initiatorOperatorCode = str;
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = (String[]) objArr[2];
        if (strArr3 != null) {
            int i33 = 0;
            while (i33 < strArr3.length) {
                int i34 = component1 + 97;
                getAsAtTimestamp = i34 % 128;
                if (i34 % 2 == 0) {
                    arrayList.add(strArr3[i33]);
                    i33 += 112;
                } else {
                    arrayList.add(strArr3[i33]);
                    i33++;
                }
            }
        }
        long j2 = -1;
        long j3 = ((long) (i15 ^ i16)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
        long j4 = 0;
        long j5 = j3 | (((long) 10) << 32) | (j4 - ((j4 >> 63) << 32));
        try {
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault7 == null) {
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 6618, 42 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
            Object[] objArr18 = {-2067161691, Long.valueOf(j5), arrayList, null, false, false};
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6561, 57 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault8).invoke(objInvoke, objArr18);
            Object[] objArr19 = {new int[1], new int[]{i}, strArr, new int[]{i}};
            int i35 = ((int[]) objArr[0])[0];
            int i36 = ((int[]) objArr[1])[0];
            int i37 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[2];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i38 = (-1995406491) + (((~((-18282079) | iIdentityHashCode3)) | 1237082 | (~(2074351397 | iIdentityHashCode3))) * (-754));
            int i39 = ~((-1237083) | iIdentityHashCode3);
            int i40 = ~iIdentityHashCode3;
            int i41 = i35 + i38 + ((i39 | (~(2075588479 | i40))) * (-754)) + ((i40 | (-18282079)) * 754);
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr19[0])[0] = i43 ^ (i43 << 5);
            throw null;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}
