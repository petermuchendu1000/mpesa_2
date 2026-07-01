package com.huawei.digitalpayment.consumer.fixeddata.ui.screen;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.safaricom.designsystem.components.radio.IRadioButton;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancelNotification;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/ShareTypeOption;", "Lcom/safaricom/designsystem/components/radio/IRadioButton;", "name", "", "displayName", "enabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getDisplayName", "getEnabled", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShareTypeOption implements IRadioButton {
    public static final int $stable = 0;
    private static char[] component1;
    private static long copydefault;
    private static int equals;
    private final boolean ShareDataUIState;
    private final String component2;
    private final String component3;
    private static final byte[] $$c = {Ascii.VT, -55, -20, -91};
    private static final int $$d = 51;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {111, -17, Ascii.VT, -125, 38, 10, 34, 4, -16, 46, 36, -2, 5, 5, Ascii.ESC, TarHeader.LF_SYMLINK, -2, 36, 2, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -50, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -49, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -48};
    private static final int $$b = 122;
    private static int getAsAtTimestamp = 0;
    private static int copy = 1;
    private static int getRequestBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(byte r6, short r7, int r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.screen.ShareTypeOption.$$c
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r6 = r6 + 117
            int r8 = r8 * 3
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.screen.ShareTypeOption.$$e(byte, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.screen.ShareTypeOption.$$a
            int r9 = r9 * 6
            int r9 = r9 + 10
            int r7 = r7 * 16
            int r7 = r7 + 83
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2c:
            int r8 = r8 + r7
            int r7 = r8 + (-17)
            r8 = r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.screen.ShareTypeOption.a(short, int, int, java.lang.Object[]):void");
    }

    public ShareTypeOption(String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component3 = str;
        this.component2 = str2;
        this.ShareDataUIState = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShareTypeOption(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = copy;
            int i3 = i2 + 49;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 51;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z = true;
        }
        this(str, str2, z);
    }

    @Override
    public String getCopydefault() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 11;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 65;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override
    public String getComponent2() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 63;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 95;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
        return str;
    }

    @Override
    public boolean getComponent3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 31;
        copy = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i2 + 79;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    private static void b(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            int i4 = $10 + 103;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component1[i2 + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1758;
                    int iResolveSizeAndState = 34 - View.resolveSizeAndState(0, 0, 0);
                    char cRgb = (char) ((-16777216) - Color.rgb(0, 0, 0));
                    byte length = (byte) $$c.length;
                    byte b2 = (byte) (length - 4);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, iResolveSizeAndState, cRgb, 1159210934, false, $$e(length, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(copydefault), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3608 - ExpandableListView.getPackedPositionType(0L), 28 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (TextUtils.getOffsetAfter("", 0) + 7171), 1951385784, false, $$e(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b5 = (byte) 5;
                    byte b6 = (byte) (b5 - 5);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4013, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27760), -1529629956, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            int i7 = $11 + 75;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b7 = (byte) 5;
                byte b8 = (byte) (b7 - 5);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4013 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 24, (char) (27761 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), -1529629956, false, $$e(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i9 = $10 + 33;
        $11 = i9 % 128;
        if (i9 % 2 != 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final ShareTypeOption copy(String name, String displayName, boolean enabled) throws Throwable {
        Object[] objArr;
        char c2;
        Object[] objArr2;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
        if (objCopydefault == null) {
            int maximumFlingVelocity = 999 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31;
            char cAlpha = (char) (Color.alpha(0) + 61685);
            byte b2 = (byte) 0;
            byte b3 = (byte) (b2 - 1);
            Object[] objArr3 = new Object[1];
            a(b2, b3, (byte) (-b3), objArr3);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(maximumFlingVelocity, keyRepeatTimeout, cAlpha, -1638177773, false, (String) objArr3[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr4 = new Object[1];
        b(22 - TextUtils.getTrimmedLength(""), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 20399), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        b((Process.myPid() >> 22) + 15, 22 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
        if (objCopydefault2 == null) {
            int bitsPerPixel = 998 - ImageFormat.getBitsPerPixel(0);
            int iResolveSize = 31 - View.resolveSize(0, 0);
            char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 61685);
            Object[] objArr6 = new Object[1];
            a((byte) (r15[18] - 1), (byte) ($$a[20] - 1), (byte) 0, objArr6);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(bitsPerPixel, iResolveSize, offsetAfter, 1267259187, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
            if (objCopydefault3 == null) {
                int iCombineMeasuredStates = 999 - View.combineMeasuredStates(0, 0);
                int keyRepeatTimeout2 = 31 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 61685);
                Object[] objArr7 = new Object[1];
                a((byte) ($$a[18] - 1), r2[26], (byte) 0, objArr7);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iCombineMeasuredStates, keyRepeatTimeout2, absoluteGravity, 1267122354, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i2 = ((int[]) objArr8[2])[0];
            int i3 = ((int[]) objArr8[1])[0];
            int i4 = (int) Runtime.getRuntime().totalMemory();
            int i5 = ~i4;
            int i6 = (((~((-136529929) | i5)) | (~(732429661 | i4))) * 988) + 1428553001 + (((~(i4 | (-153573661))) | 17043732 | (~(i5 | 732429661))) * 988) + 914902634;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[3])[0] = i8 ^ (i8 << 5);
            int i9 = getAsAtTimestamp + 89;
            copy = i9 % 128;
            int i10 = i9 % 2;
        } else {
            try {
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1123955845);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 2217, (ViewConfiguration.getLongPressTimeout() >> 16) + 45, (char) View.MeasureSpec.makeMeasureSpec(0, 0), -2019038240, false, null, new Class[0]);
                }
                Object[] objArr9 = {null, ((Constructor) objCopydefault4).newInstance(null), 914902634, 1};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-44327625);
                if (objCopydefault5 == null) {
                    int iRgb = (-16776217) - Color.rgb(0, 0, 0);
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 31;
                    char edgeSlop2 = (char) (61685 - (ViewConfiguration.getEdgeSlop() >> 16));
                    Object[] objArr10 = new Object[1];
                    a((byte) ($$a[18] - 1), (byte) ($$b & 160), (byte) 0, objArr10);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iRgb, edgeSlop, edgeSlop2, 939672146, false, (String) objArr10[0], new Class[]{(Class) ITrustedWebActivityCallbackDefault.copydefault(1030 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 41, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (Class) ITrustedWebActivityCallbackDefault.copydefault(1073 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 43, (char) (Color.alpha(0) + 33531)), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr11 = (Object[]) ((Method) objCopydefault5).invoke(null, objArr9);
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
                if (objCopydefault6 == null) {
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 999;
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 31;
                    char cIndexOf = (char) (TextUtils.indexOf("", "") + 61685);
                    Object[] objArr12 = new Object[1];
                    a((byte) ($$a[18] - 1), r11[26], (byte) 0, objArr12);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionGroup, iResolveOpacity, cIndexOf, 1267122354, false, (String) objArr12[0], null);
                }
                ((Field) objCopydefault6).set(null, objArr11);
                try {
                    Object[] objArr13 = new Object[1];
                    b((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21, KeyEvent.keyCodeFromString(""), (char) (20399 - View.MeasureSpec.getSize(0)), objArr13);
                    Class<?> cls2 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    b((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15, 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr14);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
                    if (objCopydefault7 == null) {
                        int packedPositionType = 999 - ExpandableListView.getPackedPositionType(0L);
                        int fadingEdgeLength = 31 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        char scrollDefaultDelay = (char) (61685 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                        byte[] bArr = $$a;
                        Object[] objArr15 = new Object[1];
                        a((byte) (bArr[18] - 1), (byte) (bArr[20] - 1), (byte) 0, objArr15);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionType, fadingEdgeLength, scrollDefaultDelay, 1267259187, false, (String) objArr15[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
                    if (objCopydefault8 == null) {
                        int i11 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 998;
                        int iMyPid = 31 - (Process.myPid() >> 22);
                        char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 61685);
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        Object[] objArr16 = new Object[1];
                        a(b4, b5, (byte) (-b5), objArr16);
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(i11, iMyPid, keyRepeatDelay, -1638177773, false, (String) objArr16[0], null);
                    }
                    ((Field) objCopydefault8).set(null, lValueOf2);
                    objArr = objArr11;
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 == i12) {
            Object[] objArr17 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i14 = ((int[]) objArr[3])[0];
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[1])[0];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i17 = i14 + (-908991247) + (((~(305565942 | startUptimeMillis)) | (-1055039337)) * (-964)) + (((~((~startUptimeMillis) | 305565942)) | (-1056350207)) * (-964));
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr17[3])[0] = i19 ^ (i19 << 5);
            objArr2 = new Object[]{new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i20 = ((int[]) objArr17[3])[0];
            int i21 = ((int[]) objArr17[2])[0];
            int i22 = ((int[]) objArr17[1])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i23 = i20 + (((~((-663957464) | iIdentityHashCode)) | 579019077) * (-566)) + 2056756479 + ((~(iIdentityHashCode | (-84938387))) * 566);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr2[3])[0] = i25 ^ (i25 << 5);
            c2 = 3;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[0];
            if (strArr != null) {
                for (String str : strArr) {
                    int i26 = getAsAtTimestamp + 37;
                    copy = i26 % 128;
                    int i27 = i26 % 2;
                    arrayList.add(str);
                }
            }
            long j2 = -1;
            long j3 = ((long) (i12 ^ i13)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 11) << 32) | (j4 - ((j4 >> 63) << 32));
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault9 == null) {
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 6618, 42 - ExpandableListView.getPackedPositionGroup(0L), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault9).invoke(null, null);
            Object[] objArr18 = {1509312919, Long.valueOf(j5), arrayList, null, false, false};
            Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault10 == null) {
                objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 6562, 57 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault10).invoke(objInvoke, objArr18);
            Object[] objArr19 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i28 = ((int[]) objArr[3])[0];
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[1])[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i31 = i28 + (-1131448261) + (((~((~iIdentityHashCode2) | (-571575337))) | (~(736099951 | iIdentityHashCode2))) * (-302)) + ((~((-571575337) | iIdentityHashCode2)) * (-604)) + (((~(iIdentityHashCode2 | 164524615)) | 151151173) * 302);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr19[3])[0] = i33 ^ (i33 << 5);
            int[] iArr = new int[i13];
            int i34 = i13 - 1;
            iArr[i34] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i34) % 2) - 1], 1).show();
            Object[] objArr20 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i35 = ((int[]) objArr19[3])[0];
            int i36 = ((int[]) objArr19[2])[0];
            int i37 = ((int[]) objArr19[1])[0];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i38 = ~iIdentityHashCode3;
            int i39 = i35 + (-919994399) + (((~(i38 | 766334490)) | (~(16861096 | i38)) | (-766334907)) * 464) + (((-749473811) | iIdentityHashCode3) * (-464)) + (((~(iIdentityHashCode3 | 766334490)) | (-766334907)) * 464);
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            c2 = 3;
            ((int[]) objArr20[3])[0] = i41 ^ (i41 << 5);
            objArr2 = objArr20;
        }
        Intrinsics.checkNotNullParameter(name, "name");
        String strConcat = "6\\4\\30\\26\\".concat("displayName");
        int i42 = ((int[]) objArr2[c2])[0];
        int i43 = i42 * i42;
        int i44 = -(1888659686 * i42);
        int i45 = (((i43 & i44) + (i43 | i44)) - (~(-(i42 * (-1017674784))))) - 1;
        int i46 = (i45 & 829631049) + (829631049 | i45);
        int i47 = ((i46 >> 19) - 16383) / 8192;
        int i48 = (i47 ^ 1) + ((i47 & 1) << 1);
        int i49 = ((i46 | i48) << 1) - (i48 ^ i46);
        int i50 = i46 >> 27;
        int i51 = -(i49 ^ ((((i50 & (-63)) + (i50 | (-63))) / 32) - (-1)));
        int i52 = (i51 & 1) + (i51 | 1);
        int i53 = i52 >> 28;
        int i54 = ((i53 ^ (-31)) + ((i53 & (-31)) << 1)) / 16;
        int i55 = ((i54 | 1) << 1) - (i54 ^ 1);
        Intrinsics.checkNotNullParameter(displayName, strConcat.substring(18800 / (((-(((i55 | 1) << 1) - (i55 ^ 1))) & i52) * 1880)));
        ShareTypeOption shareTypeOption = new ShareTypeOption(name, displayName, enabled);
        int i56 = getAsAtTimestamp + 43;
        copy = i56 % 128;
        int i57 = i56 % 2;
        return shareTypeOption;
    }

    static {
        equals = 0;
        copydefault();
        int i = getRequestBeneficiariesState + 29;
        equals = i % 128;
        int i2 = i % 2;
    }

    public static ShareTypeOption copy$default(ShareTypeOption shareTypeOption, String str, String str2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = shareTypeOption.component3;
        }
        if ((i & 2) != 0) {
            int i3 = getAsAtTimestamp + 53;
            copy = i3 % 128;
            int i4 = i3 % 2;
            str2 = shareTypeOption.component2;
        }
        if ((i & 4) != 0) {
            int i5 = getAsAtTimestamp + 1;
            copy = i5 % 128;
            if (i5 % 2 == 0) {
                z = shareTypeOption.ShareDataUIState;
                int i6 = 58 / 0;
            } else {
                z = shareTypeOption.ShareDataUIState;
            }
        }
        return shareTypeOption.copy(str, str2, z);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 71;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.component3;
            int i4 = 86 / 0;
        } else {
            str = this.component3;
        }
        int i5 = i2 + 93;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 15;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component2;
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        return str;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 81;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.ShareDataUIState;
        int i4 = i3 + 97;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.fixeddata.ui.screen.ShareTypeOption) == true) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.fixeddata.ui.screen.ShareTypeOption) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component3, r6.component3) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.fixeddata.ui.screen.ShareTypeOption.copy + 7;
        com.huawei.digitalpayment.consumer.fixeddata.ui.screen.ShareTypeOption.getAsAtTimestamp = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if ((r6 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component2, r6.component2) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r5.ShareDataUIState == r6.ShareDataUIState) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.fixeddata.ui.screen.ShareTypeOption.copy + 97;
        com.huawei.digitalpayment.consumer.fixeddata.ui.screen.ShareTypeOption.getAsAtTimestamp = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.screen.ShareTypeOption.getAsAtTimestamp
            int r1 = r1 + 71
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.fixeddata.ui.screen.ShareTypeOption.copy = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            r1 = 23
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.fixeddata.ui.screen.ShareTypeOption
            if (r1 == r2) goto L1e
            return r3
        L1e:
            com.huawei.digitalpayment.consumer.fixeddata.ui.screen.ShareTypeOption r6 = (com.huawei.digitalpayment.consumer.fixeddata.ui.screen.ShareTypeOption) r6
            java.lang.String r1 = r5.component3
            java.lang.String r4 = r6.component3
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L37
            int r6 = com.huawei.digitalpayment.consumer.fixeddata.ui.screen.ShareTypeOption.copy
            int r6 = r6 + 7
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.fixeddata.ui.screen.ShareTypeOption.getAsAtTimestamp = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L36
            return r2
        L36:
            return r3
        L37:
            java.lang.String r1 = r5.component2
            java.lang.String r4 = r6.component2
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L42
            return r3
        L42:
            boolean r1 = r5.ShareDataUIState
            boolean r6 = r6.ShareDataUIState
            if (r1 == r6) goto L49
            return r3
        L49:
            int r6 = com.huawei.digitalpayment.consumer.fixeddata.ui.screen.ShareTypeOption.copy
            int r6 = r6 + 97
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.fixeddata.ui.screen.ShareTypeOption.getAsAtTimestamp = r1
            int r6 = r6 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.screen.ShareTypeOption.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 117;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.component3.hashCode() * 31) + this.component2.hashCode()) * 31) + Boolean.hashCode(this.ShareDataUIState);
        int i4 = copy + 117;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShareTypeOption(name=" + this.component3 + ", displayName=" + this.component2 + ", enabled=" + this.ShareDataUIState + ")";
        int i2 = copy + 103;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static void copydefault() {
        component1 = new char[]{17336, 51010, 19031, 52596, 20578, 56185, 24067, 57668, 25630, 61239, 29285, 62733, 30940, 33755, 1739, 35303, 3300, 38879, 6799, 40345, 8350, 43947, 3091, 35055, 1533, 33497, 8145, 38106, 4524, 44695, 11195, 41098, 15752, 47749, 14179, 52330, 18805};
        copydefault = -4601087829865953149L;
    }
}
