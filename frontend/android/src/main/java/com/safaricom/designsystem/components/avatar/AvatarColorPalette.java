package com.safaricom.designsystem.components.avatar;

import android.graphics.Color;
import android.media.AudioTrack;
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
import com.alibaba.griver.image.framework.utils.FileUtils;
import com.google.common.base.Ascii;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.notify;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\nJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001d\u001a\u00020\u001eH×\u0001J\t\u0010\u001f\u001a\u00020 H×\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006!"}, d2 = {"Lcom/safaricom/designsystem/components/avatar/AvatarColorPalette;", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", CdpConstants.CONTENT_TEXT_COLOR, "darkModeBackgroundColor", "darkModeTextColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundColor-0d7_KjU", "()J", "J", "getTextColor-0d7_KjU", "getDarkModeBackgroundColor-0d7_KjU", "getDarkModeTextColor-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "copy", "copy-jRlVdoo", "(JJJJ)Lcom/safaricom/designsystem/components/avatar/AvatarColorPalette;", "equals", "", "other", "hashCode", "", "toString", "", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AvatarColorPalette {
    public static final int $stable = 0;
    private static long copydefault;
    private static int getAsAtTimestamp;
    private final long ShareDataUIState;
    private final long component1;
    private final long component2;
    private final long component3;
    private static final byte[] $$c = {40, 108, -113, 75};
    private static final int $$f = 62;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {13, 38, -109, 117, -11, -12, 1, -4, -12, -17, 67, -66, -13, 58, -27, -58, 8, -7, -6, -20, -8, 33, -48, -28, 0, -24, 6, Ascii.SUB, -36, -26, Ascii.FF, 5, 5, -17, -40, Ascii.FF, -26, 8};
    private static final int $$e = 14;
    private static final byte[] $$a = {Ascii.SI, -57, -42, 5, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK};
    private static final int $$b = 45;
    private static int component4 = 0;
    private static int copy = 1;
    private static int getRequestBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r6, int r7, int r8) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r8 = r8 + 4
            int r6 = r6 * 3
            int r6 = 105 - r6
            byte[] r1 = com.safaricom.designsystem.components.avatar.AvatarColorPalette.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            int r8 = r8 + 1
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.designsystem.components.avatar.AvatarColorPalette.$$g(int, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 16
            int r7 = r7 + 83
            int r8 = r8 * 3
            int r8 = 28 - r8
            byte[] r0 = com.safaricom.designsystem.components.avatar.AvatarColorPalette.$$a
            int r9 = r9 * 6
            int r9 = r9 + 10
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L2c:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-17)
            int r7 = r7 + 1
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.designsystem.components.avatar.AvatarColorPalette.a(short, short, int, java.lang.Object[]):void");
    }

    private static void c(byte b2, byte b3, byte b4, Object[] objArr) {
        int i = b2 * 4;
        int i2 = 107 - (b4 * 24);
        byte[] bArr = $$d;
        int i3 = 23 - (b3 * 19);
        byte[] bArr2 = new byte[20 - i];
        int i4 = 19 - i;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i2 + (-i4)) - 7;
            i3++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + (-bArr[i3])) - 7;
                i3++;
            }
        }
    }

    private AvatarColorPalette(long j, long j2, long j3, long j4) {
        this.component1 = j;
        this.component2 = j2;
        this.component3 = j3;
        this.ShareDataUIState = j4;
    }

    public final long m12362getBackgroundColor0d7_KjU() {
        int i = 2 % 2;
        int i2 = component4 + 83;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        throw null;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $10 + 11;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3266 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 33, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 60268), -834797019, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() / (copydefault % 5431355972723572778L);
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(687 - View.MeasureSpec.makeMeasureSpec(0, 0), 34 - KeyEvent.keyCodeFromString(""), (char) (TextUtils.indexOf("", "", 0) + 60373), -1969106284, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
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
                int i5 = notifyVar.copydefault;
                Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3266 - (ViewConfiguration.getEdgeSlop() >> 16), Color.green(0) + 33, (char) (60268 - View.combineMeasuredStates(0, 0)), -834797019, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (copydefault ^ 5431355972723572778L);
                Object[] objArr5 = {notifyVar, notifyVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 687, 35 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 60373), -1969106284, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i6 = $10 + 29;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            try {
                Object[] objArr6 = {notifyVar, notifyVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(688 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Process.getGidForName("") + 35, (char) (60374 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), -1969106284, false, $$g(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
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

    public final long m12365getTextColor0d7_KjU() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-862225659);
        if (objCopydefault == null) {
            int iResolveSizeAndState = 2026 - View.resolveSizeAndState(0, 0, 0);
            int iIndexOf = 23 - TextUtils.indexOf("", "");
            char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 6164);
            Object[] objArr2 = new Object[1];
            a((byte) 0, (byte) (-$$a[24]), (byte) ($$b & 3), objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iResolveSizeAndState, iIndexOf, packedPositionGroup, 163751008, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b(21820 - MotionEvent.axisFromString(""), new char[]{34740, 53894, 11723, 30736, 54094, 11661, 30943, 54096, 11858, 30851, 54169, 11801, 31088, 54207, 12023, 31011, 54376, 11931, 31219, 54333, 12146, 31167}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(TextUtils.lastIndexOf("", '0') + 53718, new char[]{34736, 22124, 9246, 62170, 49394, 40601, 27983, 15188, 2328, 59337, 46571, 33670, 21056, 8297, 65046}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-744988891);
        if (objCopydefault2 == null) {
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2026;
            int i2 = 23 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            char scrollDefaultDelay = (char) (6164 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
            byte b2 = (byte) ($$b & 3);
            byte b3 = (byte) (b2 + 2);
            Object[] objArr5 = new Object[1];
            a(b2, b3, (byte) (b3 - 3), objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, i2, scrollDefaultDelay, 381780032, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-744065370);
            if (objCopydefault3 == null) {
                int iIndexOf2 = TextUtils.indexOf("", "") + 2026;
                int iNormalizeMetaState = 23 - KeyEvent.normalizeMetaState(0);
                char cRed = (char) (Color.red(0) + 6164);
                byte b4 = (byte) ($$b & 3);
                byte b5 = (byte) (b4 - 1);
                Object[] objArr6 = new Object[1];
                a(b4, b5, b5, objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf2, iNormalizeMetaState, cRed, 385853891, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new int[1], new int[]{i}, strArr, new int[]{i}};
            int i3 = ((int[]) objArr7[1])[0];
            int i4 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[2];
            int iMyUid = Process.myUid();
            int i5 = ~iMyUid;
            int i6 = (((631795802 + (((~((-229818191) | i5)) | (~((-1862815286) | iMyUid))) * FileUtils.JPEG_MARKER_EOI)) + (((~(iMyUid | (-229818191))) | 218107396) * FileUtils.JPEG_MARKER_EOI)) + (((~((-1862815286) | i5)) | 229818190) * FileUtils.JPEG_MARKER_EOI)) - 893074948;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b((ViewConfiguration.getEdgeSlop() >> 16) + 32063, new char[]{34751, 64139, 32221, 61449, 29447, 62850, 26830, 60162, 28234, 57548, 25584, 58905, 22866, 56210, 24258, 53513}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(35910 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{34748, 3062, 40766, 9070, 46781, 15071, 52747, 21085, 58789, 27083, 64864, 32944, 5314, 38945, 11347, 49049}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i9 = copy + 101;
            component4 = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, -893074948};
                byte[] bArr = $$d;
                byte b6 = bArr[24];
                Object[] objArr11 = new Object[1];
                c(b6, bArr[6], b6, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr[6];
                Object[] objArr12 = new Object[1];
                c(b7, bArr[24], b7, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-744065370);
                if (objCopydefault4 == null) {
                    int minimumFlingVelocity = 2026 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
                    char keyRepeatDelay = (char) (6164 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    byte b8 = (byte) ($$b & 3);
                    byte b9 = (byte) (b8 - 1);
                    Object[] objArr13 = new Object[1];
                    a(b8, b9, b9, objArr13);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(minimumFlingVelocity, maximumDrawingCacheSize, keyRepeatDelay, 385853891, false, (String) objArr13[0], null);
                }
                ((Field) objCopydefault4).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    b(Color.green(0) + 21821, new char[]{34740, 53894, 11723, 30736, 54094, 11661, 30943, 54096, 11858, 30851, 54169, 11801, 31088, 54207, 12023, 31011, 54376, 11931, 31219, 54333, 12146, 31167}, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    b(53717 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{34736, 22124, 9246, 62170, 49394, 40601, 27983, 15188, 2328, 59337, 46571, 33670, 21056, 8297, 65046}, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-744988891);
                    if (objCopydefault5 == null) {
                        int i11 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2027;
                        int defaultSize = View.getDefaultSize(0, 0) + 23;
                        char c2 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6164);
                        byte b10 = (byte) ($$b & 3);
                        byte b11 = (byte) (b10 + 2);
                        Object[] objArr16 = new Object[1];
                        a(b10, b11, (byte) (b11 - 3), objArr16);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i11, defaultSize, c2, 381780032, false, (String) objArr16[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-862225659);
                    if (objCopydefault6 == null) {
                        int keyRepeatDelay2 = 2026 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 23;
                        char scrollDefaultDelay2 = (char) (6164 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                        Object[] objArr17 = new Object[1];
                        a((byte) 0, (byte) (-$$a[24]), (byte) ($$b & 3), objArr17);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatDelay2, capsMode, scrollDefaultDelay2, 163751008, false, (String) objArr17[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf2);
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
        int i12 = ((int[]) objArr[3])[0];
        int i13 = ((int[]) objArr[1])[0];
        if (i13 == i12) {
            int i14 = component4 + 65;
            copy = i14 % 128;
            int i15 = i14 % 2;
            Object[] objArr18 = {new int[1], new int[]{i}, strArr, new int[]{i}};
            int i16 = ((int[]) objArr[0])[0];
            int i17 = ((int[]) objArr[1])[0];
            int i18 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[2];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i19 = i16 + 1484397379 + (((~((-1976309092) | startUptimeMillis)) | 116324384) * (-366)) + (((~(startUptimeMillis | (-1895826756))) | 35842048) * 366);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr18[0])[0] = i21 ^ (i21 << 5);
            Object[] objArr19 = {new int[1], new int[]{i}, strArr2, new int[]{i}};
            int i22 = ((int[]) objArr18[0])[0];
            int i23 = ((int[]) objArr18[1])[0];
            int i24 = ((int[]) objArr18[3])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i25 = ~iIdentityHashCode;
            int i26 = i22 + (-1890780168) + (((~((-182065537) | i25)) | (~((-1910567940) | iIdentityHashCode))) * FileUtils.JPEG_MARKER_EOI) + (((~(iIdentityHashCode | (-182065537))) | 12587008) * FileUtils.JPEG_MARKER_EOI) + (((~((-1910567940) | i25)) | 182065536) * FileUtils.JPEG_MARKER_EOI);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr19[0])[0] = i28 ^ (i28 << 5);
            return this.component2;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = (String[]) objArr[2];
        if (strArr3 != null) {
            int i29 = copy + 1;
            component4 = i29 % 128;
            int i30 = i29 % 2;
            int i31 = 0;
            while (i31 < strArr3.length) {
                int i32 = component4 + 57;
                copy = i32 % 128;
                int i33 = i32 % 2;
                arrayList.add(strArr3[i31]);
                i31++;
                int i34 = copy + 31;
                component4 = i34 % 128;
                int i35 = i34 % 2;
            }
        }
        long j2 = -1;
        long j3 = 0;
        long j4 = (((j2 - ((j2 >> 63) << 32)) | (((long) 0) << 32)) & ((long) (i12 ^ i13))) | (((long) 10) << 32) | (j3 - ((j3 >> 63) << 32));
        try {
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault7 == null) {
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 6618, TextUtils.getTrimmedLength("") + 42, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
            Object[] objArr20 = {2046793565, Long.valueOf(j4), arrayList, null, false, false};
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 6562, 56 - View.getDefaultSize(0, 0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault8).invoke(objInvoke, objArr20);
            Object[] objArr21 = {new int[1], new int[]{i}, strArr, new int[]{i}};
            int i36 = ((int[]) objArr[0])[0];
            int i37 = ((int[]) objArr[1])[0];
            int i38 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[2];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i39 = i36 + 1688590328 + (((~((-897167102) | iIdentityHashCode2)) | 88149636) * 345) + (((~((-897167102) | (~iIdentityHashCode2))) | 1107316738) * 345) + ((~(iIdentityHashCode2 | (-88149637))) * 345);
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr21[0])[0] = i41 ^ (i41 << 5);
            throw null;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    public final long m12363getDarkModeBackgroundColor0d7_KjU() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 35;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        long j = this.component3;
        int i5 = i2 + 111;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long m12364getDarkModeTextColor0d7_KjU() {
        int i = 2 % 2;
        int i2 = component4 + 15;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        long j = this.ShareDataUIState;
        int i5 = i3 + 55;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    static {
        getAsAtTimestamp = 0;
        component2();
        int i = getRequestBeneficiariesState + 63;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    public AvatarColorPalette(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    public static AvatarColorPalette m12356copyjRlVdoo$default(AvatarColorPalette avatarColorPalette, long j, long j2, long j3, long j4, int i, Object obj) {
        long j5;
        long j6;
        int i2 = 2 % 2;
        int i3 = copy + 109;
        int i4 = i3 % 128;
        component4 = i4;
        int i5 = i3 % 2;
        long j7 = (i & 1) != 0 ? avatarColorPalette.component1 : j;
        if ((i & 2) != 0) {
            int i6 = i4 + 111;
            copy = i6 % 128;
            int i7 = i6 % 2;
            j5 = avatarColorPalette.component2;
        } else {
            j5 = j2;
        }
        if ((i & 4) != 0) {
            int i8 = i4 + 55;
            copy = i8 % 128;
            int i9 = i8 % 2;
            j6 = avatarColorPalette.component3;
        } else {
            j6 = j3;
        }
        return avatarColorPalette.m12361copyjRlVdoo(j7, j5, j6, (i & 8) != 0 ? avatarColorPalette.ShareDataUIState : j4);
    }

    public final long m12357component10d7_KjU() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 67;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.component1;
        int i4 = i2 + 77;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long m12358component20d7_KjU() {
        int i = 2 % 2;
        int i2 = copy + 41;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        int i3 = 88 / 0;
        return this.component2;
    }

    public final long m12359component30d7_KjU() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 59;
        copy = i3 % 128;
        int i4 = i3 % 2;
        long j = this.component3;
        int i5 = i2 + 79;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long m12360component40d7_KjU() {
        int i = 2 % 2;
        int i2 = copy + 75;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.ShareDataUIState;
        int i4 = i3 + 63;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return j;
    }

    public final AvatarColorPalette m12361copyjRlVdoo(long backgroundColor, long textColor, long darkModeBackgroundColor, long darkModeTextColor) {
        int i = 2 % 2;
        AvatarColorPalette avatarColorPalette = new AvatarColorPalette(backgroundColor, textColor, darkModeBackgroundColor, darkModeTextColor, null);
        int i2 = copy + 49;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return avatarColorPalette;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvatarColorPalette)) {
            int i2 = component4 + 121;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        AvatarColorPalette avatarColorPalette = (AvatarColorPalette) other;
        if (!androidx.compose.ui.graphics.Color.m6055equalsimpl0(this.component1, avatarColorPalette.component1)) {
            int i4 = component4 + 23;
            copy = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!androidx.compose.ui.graphics.Color.m6055equalsimpl0(this.component2, avatarColorPalette.component2)) {
            int i6 = copy + 17;
            component4 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!androidx.compose.ui.graphics.Color.m6055equalsimpl0(this.component3, avatarColorPalette.component3)) {
            int i8 = copy + 65;
            component4 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!androidx.compose.ui.graphics.Color.m6055equalsimpl0(this.ShareDataUIState, avatarColorPalette.ShareDataUIState)) {
            return false;
        }
        int i10 = copy + 93;
        component4 = i10 % 128;
        if (i10 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 91;
        component4 = i2 % 128;
        return i2 % 2 != 0 ? (((((androidx.compose.ui.graphics.Color.m6061hashCodeimpl(this.component1) * 70) * androidx.compose.ui.graphics.Color.m6061hashCodeimpl(this.component2)) - 108) / androidx.compose.ui.graphics.Color.m6061hashCodeimpl(this.component3)) * 56) / androidx.compose.ui.graphics.Color.m6061hashCodeimpl(this.ShareDataUIState) : (((((androidx.compose.ui.graphics.Color.m6061hashCodeimpl(this.component1) * 31) + androidx.compose.ui.graphics.Color.m6061hashCodeimpl(this.component2)) * 31) + androidx.compose.ui.graphics.Color.m6061hashCodeimpl(this.component3)) * 31) + androidx.compose.ui.graphics.Color.m6061hashCodeimpl(this.ShareDataUIState);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AvatarColorPalette(backgroundColor=" + androidx.compose.ui.graphics.Color.m6062toStringimpl(this.component1) + ", textColor=" + androidx.compose.ui.graphics.Color.m6062toStringimpl(this.component2) + ", darkModeBackgroundColor=" + androidx.compose.ui.graphics.Color.m6062toStringimpl(this.component3) + ", darkModeTextColor=" + androidx.compose.ui.graphics.Color.m6062toStringimpl(this.ShareDataUIState) + ")";
        int i2 = copy + 45;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static void component2() {
        copydefault = -1128306955383076865L;
    }
}
