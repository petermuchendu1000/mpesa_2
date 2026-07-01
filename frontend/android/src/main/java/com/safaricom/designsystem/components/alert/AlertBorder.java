package com.safaricom.designsystem.components.alert;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.compose.ui.unit.Dp;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.iap.ac.android.acs.operation.log.LogConstants;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.notify;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\nJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001d\u001a\u00020\u001eH×\u0001J\t\u0010\u001f\u001a\u00020 H×\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006!"}, d2 = {"Lcom/safaricom/designsystem/components/alert/AlertBorder;", "", "width", "Landroidx/compose/ui/unit/Dp;", CdpConstants.CONTENT_CORNER_RADIUS, "dashLength", "gapLength", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getWidth-D9Ej5fM", "()F", LogConstants.RESULT_FALSE, "getCornerRadius-D9Ej5fM", "getDashLength-D9Ej5fM", "getGapLength-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "component3", "component3-D9Ej5fM", "component4", "component4-D9Ej5fM", "copy", "copy-a9UjIt4", "(FFFF)Lcom/safaricom/designsystem/components/alert/AlertBorder;", "equals", "", "other", "hashCode", "", "toString", "", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AlertBorder {
    public static final int $stable = 0;
    private static long component2;
    private static int copy;
    private final float ShareDataUIState;
    private final float component1;
    private final float component3;
    private final float copydefault;
    private static final byte[] $$c = {Ascii.SI, -74, 84, -51};
    private static final int $$f = 123;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {70, 83, 77, 1, 10, -4, -50, 59, 20, 13, 0, -4, Ascii.GS, -15, 5, Ascii.EM, 8, -1, 0, -48, 60, Ascii.SYN, Ascii.SO, -2, Ascii.VT, 2, -58, 62, Ascii.DLE, 0, 9, Ascii.FF, -2, Ascii.NAK, -62, 47, -2, 10, -6, Ascii.SI, Ascii.SI, -11, -7, Ascii.EM, TarHeader.LF_NORMAL, 0, 9, Ascii.FF, -2, 19, 8, Ascii.DLE, -14, 8, 8, 2, Ascii.ESC, -2, Ascii.SI};
    private static final int $$e = 3;
    private static final byte[] $$a = {Ascii.SI, 58, -59, 38, 10, 34, 4, -16, 46, 36, -2, 5, 5, Ascii.ESC, TarHeader.LF_SYMLINK, -2, 36, 2, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -50, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -49};
    private static final int $$b = 162;
    private static int component4 = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r5, short r6, byte r7) {
        /*
            int r5 = r5 + 4
            int r7 = r7 * 3
            int r7 = 105 - r7
            byte[] r0 = com.safaricom.designsystem.components.alert.AlertBorder.$$c
            int r6 = r6 * 4
            int r6 = 1 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            int r5 = r5 + 1
            r4 = r0[r5]
        L27:
            int r7 = r7 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.designsystem.components.alert.AlertBorder.$$g(byte, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 6
            int r0 = 16 - r6
            int r8 = r8 * 16
            int r8 = r8 + 83
            int r7 = r7 * 3
            int r7 = 27 - r7
            byte[] r1 = com.safaricom.designsystem.components.alert.AlertBorder.$$a
            byte[] r0 = new byte[r0]
            int r6 = 15 - r6
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + (-17)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.designsystem.components.alert.AlertBorder.a(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 45
            int r7 = 48 - r7
            byte[] r0 = com.safaricom.designsystem.components.alert.AlertBorder.$$d
            int r6 = r6 * 35
            int r1 = 46 - r6
            int r8 = r8 * 12
            int r8 = 111 - r8
            byte[] r1 = new byte[r1]
            int r6 = 45 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r6
            r8 = r7
            r3 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L30:
            int r7 = r7 + r4
            int r7 = r7 + (-7)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.designsystem.components.alert.AlertBorder.c(byte, byte, short, java.lang.Object[]):void");
    }

    private AlertBorder(float f, float f2, float f3, float f4) {
        this.copydefault = f;
        this.ShareDataUIState = f2;
        this.component3 = f3;
        this.component1 = f4;
    }

    public final float m12341getWidthD9Ej5fM() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 121;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        float f = this.copydefault;
        int i4 = i2 + 47;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return f;
    }

    public final float m12338getCornerRadiusD9Ej5fM() {
        float f;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 61;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            f = this.ShareDataUIState;
            int i4 = 80 / 0;
        } else {
            f = this.ShareDataUIState;
        }
        int i5 = i2 + 37;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float m12339getDashLengthD9Ej5fM() {
        int i = 2 % 2;
        int i2 = component4 + 121;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        float f = this.component3;
        int i5 = i3 + 83;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float m12340getGapLengthD9Ej5fM() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 19;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        float f = this.component1;
        if (i3 != 0) {
            int i4 = 11 / 0;
        }
        return f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AlertBorder(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            f = Dp.m8795constructorimpl(0);
            int i2 = 2 % 2;
        }
        float f5 = f;
        if ((i & 2) != 0) {
            int i3 = component4 + 1;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            f2 = Dp.m8795constructorimpl(0);
            int i5 = 2 % 2;
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            f3 = Dp.m8795constructorimpl(0);
            int i6 = getAsAtTimestamp + 27;
            component4 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            int i9 = component4 + 63;
            getAsAtTimestamp = i9 % 128;
            int i10 = i9 % 2;
            f4 = Dp.m8795constructorimpl(0);
        }
        this(f5, f6, f7, f4, null);
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $10 + 79;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3265 - TextUtils.lastIndexOf("", '0', 0), 33 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 60267), -834797019, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component2 ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0') + 688, 34 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 60374), -1969106284, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
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
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            try {
                Object[] objArr4 = {notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 687, 34 - KeyEvent.keyCodeFromString(""), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 60373), -1969106284, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                int i6 = $11 + 65;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2);
    }

    public final float m12334component2D9Ej5fM() throws Throwable {
        Object[] objArr;
        char c2;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-862225659);
        if (objCopydefault == null) {
            int i2 = 2026 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0');
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 6165);
            byte b2 = (byte) 0;
            Object[] objArr2 = new Object[1];
            a(b2, $$a[23], b2, objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i2, iIndexOf, cLastIndexOf, 163751008, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b(32909 - TextUtils.getOffsetAfter("", 0), new char[]{45717, 12823, 45962, 13089, 45231, 12380, 45534, 12545, 46835, 13938, 46936, 13480, 46097, 13742, 46390, 15058, 47689, 15338, 47986, 14572, 47507, 14606}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b((ViewConfiguration.getKeyRepeatDelay() >> 16) + 52859, new char[]{45713, 31971, 11875, 55797, 35691, 47862, 25714, 6139, 49481, 61638, 41558, 28105, 8025, 52902, 63531}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-744988891);
        if (objCopydefault2 == null) {
            int iAxisFromString = 2025 - MotionEvent.axisFromString("");
            int i3 = 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            char cArgb = (char) (Color.argb(0, 0, 0, 0) + 6164);
            byte b3 = (byte) ($$a[17] - 1);
            byte b4 = (byte) (b3 + 2);
            Object[] objArr5 = new Object[1];
            a(b3, b4, (byte) (b4 - 2), objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iAxisFromString, i3, cArgb, 381780032, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-744065370);
            if (objCopydefault3 == null) {
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2026;
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 23;
                char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 6164);
                byte b5 = (byte) ($$a[17] - 1);
                byte b6 = (byte) (b5 - 1);
                Object[] objArr6 = new Object[1];
                a(b5, b6, (byte) (b6 + 1), objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, pressedStateDuration, longPressTimeout, 385853891, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new int[1], new int[]{i}, strArr, new int[]{i}};
            int i4 = ((int[]) objArr7[1])[0];
            int i5 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[2];
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = 1767173013 + ((iIdentityHashCode | 914213114) * (-50));
            int i7 = ~((-104677513) | iIdentityHashCode);
            int i8 = ~iIdentityHashCode;
            int i9 = i6 + (((~(i8 | (-1073742850))) | i7) * 50) + (((~((-1178420362) | i8)) | 1073742849 | (~(i8 | 914213114))) * 50) + 323650634;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
            int i12 = component4 + 41;
            getAsAtTimestamp = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 2 / 5;
            }
            c2 = 3;
        } else {
            Object[] objArr8 = new Object[1];
            b(View.resolveSize(0, 0) + 6007, new char[]{45726, 42466, 40044, 62704, 61190, 51147, 15967, 5851, 2347, 25077, 22529, 45200, 43795, 33675, 64019, 60768}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(41850 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{45725, 4585, 62563, 22769, 16228, 33728, 26198, 51906, 43380, 3540, 53309, 46255, 6939, 65470, 16910, 9862}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i14 = getAsAtTimestamp + 31;
            component4 = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, 323650634};
                byte[] bArr = $$d;
                byte b7 = bArr[10];
                Object[] objArr11 = new Object[1];
                c(b7, bArr[3], b7, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b8 = bArr[3];
                Object[] objArr12 = new Object[1];
                c(b8, bArr[10], b8, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-744065370);
                if (objCopydefault4 == null) {
                    int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 2026;
                    int iIndexOf3 = 22 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    char c3 = (char) (6164 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    byte b9 = (byte) ($$a[17] - 1);
                    byte b10 = (byte) (b9 - 1);
                    Object[] objArr14 = new Object[1];
                    a(b9, b10, (byte) (b10 + 1), objArr14);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf2, iIndexOf3, c3, 385853891, false, (String) objArr14[0], null);
                }
                ((Field) objCopydefault4).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    b(32909 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{45717, 12823, 45962, 13089, 45231, 12380, 45534, 12545, 46835, 13938, 46936, 13480, 46097, 13742, 46390, 15058, 47689, 15338, 47986, 14572, 47507, 14606}, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    b(Color.argb(0, 0, 0, 0) + 52859, new char[]{45713, 31971, 11875, 55797, 35691, 47862, 25714, 6139, 49481, 61638, 41558, 28105, 8025, 52902, 63531}, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-744988891);
                    if (objCopydefault5 == null) {
                        int iArgb = 2026 - Color.argb(0, 0, 0, 0);
                        int i16 = 24 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 6164);
                        byte b11 = (byte) ($$a[17] - 1);
                        byte b12 = (byte) (b11 + 2);
                        Object[] objArr17 = new Object[1];
                        a(b11, b12, (byte) (b12 - 2), objArr17);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iArgb, i16, offsetAfter, 381780032, false, (String) objArr17[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-862225659);
                    if (objCopydefault6 == null) {
                        int minimumFlingVelocity = 2026 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24;
                        char gidForName = (char) (6163 - Process.getGidForName(""));
                        byte b13 = (byte) 0;
                        Object[] objArr18 = new Object[1];
                        a(b13, $$a[23], b13, objArr18);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(minimumFlingVelocity, iIndexOf4, gidForName, 163751008, false, (String) objArr18[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf2);
                    int i17 = getAsAtTimestamp + 49;
                    component4 = i17 % 128;
                    int i18 = i17 % 2;
                    objArr = objArr13;
                    c2 = 3;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i19 = ((int[]) objArr[c2])[0];
        int i20 = ((int[]) objArr[1])[0];
        if (i20 == i19) {
            Object[] objArr19 = {new int[1], new int[]{i}, strArr, new int[]{i}};
            int i21 = ((int[]) objArr[0])[0];
            int i22 = ((int[]) objArr[1])[0];
            int i23 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[2];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i24 = ~iIdentityHashCode2;
            int i25 = i21 + 1771859338 + (((~((-1135354722) | i24)) | 957278754) * (-90)) + (((~((-1135354722) | iIdentityHashCode2)) | (-2075061092)) * (-45)) + (((~(iIdentityHashCode2 | (-957278755))) | (-1135354722) | (~(i24 | 957278754))) * 45);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr19[0])[0] = i27 ^ (i27 << 5);
            Object[] objArr20 = {new int[1], new int[]{i}, strArr2, new int[]{i}};
            int i28 = ((int[]) objArr19[0])[0];
            int i29 = ((int[]) objArr19[1])[0];
            int i30 = ((int[]) objArr19[3])[0];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i31 = ~iIdentityHashCode3;
            int i32 = i28 + 1771859338 + (((~((-1545928656) | i31)) | 546704820) * (-90)) + (((~((-1545928656) | iIdentityHashCode3)) | (-2092367872)) * (-45)) + (((~(iIdentityHashCode3 | (-546704821))) | (-1545928656) | (~(i31 | 546704820))) * 45);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr20[0])[0] = i34 ^ (i34 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[2];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            long j2 = -1;
            long j3 = 0;
            long j4 = (((j2 - ((j2 >> 63) << 32)) | (((long) 0) << 32)) & ((long) (i19 ^ i20))) | (((long) 10) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6619 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), Color.argb(0, 0, 0, 0) + 42, (char) KeyEvent.keyCodeFromString(""), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                Object[] objArr21 = {254888661, Long.valueOf(j4), arrayList, null, false, false};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 6562, Color.alpha(0) + 56, (char) (ViewConfiguration.getTouchSlop() >> 8), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault8).invoke(objInvoke, objArr21);
                Object[] objArr22 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                int i35 = ((int[]) objArr[0])[0];
                int i36 = ((int[]) objArr[1])[0];
                int i37 = ((int[]) objArr[3])[0];
                String[] strArr4 = (String[]) objArr[2];
                int i38 = ~((int) Process.getElapsedCpuTime());
                int i39 = i35 + (-373636809) + (((~(1876880767 | i38)) | 215752708) * (-828)) + ((i38 | 1876880767) * (-828)) + 720885248;
                int i40 = (i39 << 13) ^ i39;
                int i41 = i40 ^ (i40 >>> 17);
                ((int[]) objArr22[0])[0] = i41 ^ (i41 << 5);
                int[] iArr = new int[i20];
                int i42 = i20 - 1;
                iArr[i42] = 1;
                Toast.makeText((Context) null, iArr[((i42 * i20) % 2) - 1], 1).show();
                Object[] objArr23 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                int i43 = ((int[]) objArr22[0])[0];
                int i44 = ((int[]) objArr22[1])[0];
                int i45 = ((int[]) objArr22[3])[0];
                String[] strArr5 = (String[]) objArr22[2];
                int iIdentityHashCode4 = System.identityHashCode(this);
                int i46 = (~((-980577834) | iIdentityHashCode4)) | 37752328;
                int i47 = i43 + (-766451789) + (i46 * 992) + ((i46 | (~((~iIdentityHashCode4) | 2054881147))) * (-496)) + ((iIdentityHashCode4 | 1112055642) * 496);
                int i48 = (i47 << 13) ^ i47;
                int i49 = i48 ^ (i48 >>> 17);
                ((int[]) objArr23[0])[0] = i49 ^ (i49 << 5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        return this.ShareDataUIState;
    }

    static {
        copy = 0;
        ShareDataUIState();
        int i = getRequestBeneficiariesState + 95;
        copy = i % 128;
        if (i % 2 != 0) {
            int i2 = 59 / 0;
        }
    }

    public AlertBorder(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    public static AlertBorder m12332copya9UjIt4$default(AlertBorder alertBorder, float f, float f2, float f3, float f4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 35;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            f = alertBorder.copydefault;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 105;
            component4 = i5 % 128;
            if (i5 % 2 != 0) {
                float f5 = alertBorder.ShareDataUIState;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            f2 = alertBorder.ShareDataUIState;
        }
        if ((i & 4) != 0) {
            int i6 = component4 + 39;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            f3 = alertBorder.component3;
        }
        if ((i & 8) != 0) {
            f4 = alertBorder.component1;
        }
        return alertBorder.m12337copya9UjIt4(f, f2, f3, f4);
    }

    public final float m12333component1D9Ej5fM() {
        float f;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 103;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            f = this.copydefault;
            int i4 = 56 / 0;
        } else {
            f = this.copydefault;
        }
        int i5 = i3 + 91;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 80 / 0;
        }
        return f;
    }

    public final float m12335component3D9Ej5fM() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 99;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        float f = this.component3;
        int i5 = i2 + 19;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float m12336component4D9Ej5fM() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 23;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AlertBorder m12337copya9UjIt4(float width, float cornerRadius, float dashLength, float gapLength) {
        int i = 2 % 2;
        AlertBorder alertBorder = new AlertBorder(width, cornerRadius, dashLength, gapLength, null);
        int i2 = getAsAtTimestamp + 103;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return alertBorder;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertBorder)) {
            return false;
        }
        AlertBorder alertBorder = (AlertBorder) other;
        if (!Dp.m8800equalsimpl0(this.copydefault, alertBorder.copydefault)) {
            int i2 = component4 + 125;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Dp.m8800equalsimpl0(this.ShareDataUIState, alertBorder.ShareDataUIState)) {
            int i4 = getAsAtTimestamp + 111;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Dp.m8800equalsimpl0(this.component3, alertBorder.component3)) {
            int i6 = component4 + 25;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Dp.m8800equalsimpl0(this.component1, alertBorder.component1)) {
            int i8 = getAsAtTimestamp + 41;
            component4 = i8 % 128;
            return i8 % 2 != 0;
        }
        int i9 = component4 + 75;
        getAsAtTimestamp = i9 % 128;
        if (i9 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component4 + 19;
        getAsAtTimestamp = i2 % 128;
        int iM8801hashCodeimpl = i2 % 2 == 0 ? (((((Dp.m8801hashCodeimpl(this.copydefault) % 31) >> Dp.m8801hashCodeimpl(this.ShareDataUIState)) >> 74) * Dp.m8801hashCodeimpl(this.component3)) + 112) - Dp.m8801hashCodeimpl(this.component1) : (((((Dp.m8801hashCodeimpl(this.copydefault) * 31) + Dp.m8801hashCodeimpl(this.ShareDataUIState)) * 31) + Dp.m8801hashCodeimpl(this.component3)) * 31) + Dp.m8801hashCodeimpl(this.component1);
        int i3 = component4 + 39;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            return iM8801hashCodeimpl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AlertBorder(width=" + Dp.m8806toStringimpl(this.copydefault) + ", cornerRadius=" + Dp.m8806toStringimpl(this.ShareDataUIState) + ", dashLength=" + Dp.m8806toStringimpl(this.component3) + ", gapLength=" + Dp.m8806toStringimpl(this.component1) + ")";
        int i2 = getAsAtTimestamp + 41;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void ShareDataUIState() {
        component2 = 1075857714156614366L;
    }
}
