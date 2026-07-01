package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectUIState;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.CharUtils;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectDashboardUiState;", "", GriverMonitorConstants.KEY_IS_LOADING, "", "errorMessage", "", "uiState", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/FamilyConnectUIState;", "<init>", "(ZLjava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/FamilyConnectUIState;)V", "()Z", "getErrorMessage", "()Ljava/lang/String;", "getUiState", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/FamilyConnectUIState;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FamilyConnectDashboardUiState {
    public static final int $stable = 8;
    private static int component2;
    private static int getAsAtTimestamp;
    private final boolean component1;
    private final FamilyConnectUIState component3;
    private final String copydefault;
    private static final byte[] $$c = {46, -35, 45, 111};
    private static final int $$f = 175;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {32, 13, -54, -47, 9, -5, -66, TarHeader.LF_FIFO, 5, -3, -11, 2, -10, -58, 73, -5, -18, 2, -10, -60, TarHeader.LF_SYMLINK, 6, -6, -7, 6, 3, -73, TarHeader.LF_NORMAL, 10, -13, Ascii.VT, -6, -9, -8, -57, 33, -49, 60, 9, -6, 0, 0, 9, -2, 6, -24, -2, -2, -8, 17, -12, 5};
    private static final int $$e = 199;
    private static final byte[] $$a = {40, 108, -113, 75, 38, 10, 34, 4, -16, 46, 36, -2, 5, 5, Ascii.ESC, TarHeader.LF_SYMLINK, -2, 36, 2, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -50, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -49};
    private static final int $$b = 178;
    private static int getRequestBeneficiariesState = 0;
    private static int component4 = 1;
    private static int ShareDataUIState = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(short r5, int r6, int r7) {
        /*
            int r5 = r5 * 3
            int r0 = r5 + 1
            int r7 = r7 * 2
            int r7 = 65 - r7
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardUiState.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r7 = r5
            r3 = r6
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L25:
            r3 = r1[r6]
        L27:
            int r6 = r6 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardUiState.$$g(short, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = 28 - r7
            int r8 = r8 * 6
            int r8 = 16 - r8
            int r6 = r6 * 16
            int r6 = 99 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardUiState.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r6 = r8
            r4 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r7]
        L29:
            int r6 = r6 + r3
            int r6 = r6 + (-17)
            int r7 = r7 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardUiState.a(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 38
            int r5 = r5 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardUiState.$$d
            int r6 = r6 * 3
            int r6 = 99 - r6
            int r7 = r7 * 28
            int r1 = r7 + 11
            byte[] r1 = new byte[r1]
            int r7 = r7 + 10
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r4 = r0[r5]
            int r3 = r3 + 1
        L2a:
            int r5 = r5 + 1
            int r6 = r6 + r4
            int r6 = r6 + 3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDashboardUiState.c(short, short, byte, java.lang.Object[]):void");
    }

    public FamilyConnectDashboardUiState(boolean z, String str, FamilyConnectUIState familyConnectUIState) {
        this.component1 = z;
        this.copydefault = str;
        this.component3 = familyConnectUIState;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FamilyConnectDashboardUiState(boolean z, String str, FamilyConnectUIState familyConnectUIState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component4 + 93;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        }
        if ((i & 2) != 0) {
            int i4 = component4 + 45;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str = null;
        }
        if ((i & 4) != 0) {
            int i7 = getRequestBeneficiariesState + 109;
            component4 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            familyConnectUIState = null;
        }
        this(z, str, familyConnectUIState);
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 69;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.component1;
        int i4 = i2 + 41;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final String getErrorMessage() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 79;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 93;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final FamilyConnectUIState getUiState() {
        int i = 2 % 2;
        int i2 = component4 + 65;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        FamilyConnectUIState familyConnectUIState = this.component3;
        int i4 = i3 + 67;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return familyConnectUIState;
        }
        obj.hashCode();
        throw null;
    }

    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
            int i5 = $11 + 41;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - View.resolveSizeAndState(0, 0, 0), View.resolveSizeAndState(0, 0, 0) + 38, (char) (MotionEvent.axisFromString("") + 26861), 2015799920, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.makeMeasureSpec(0, 0) + 7406, 15 - TextUtils.lastIndexOf("", '0'), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
        if (i2 > 0) {
            iTrustedWebActivityServiceStub.component1 = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i - iTrustedWebActivityServiceStub.component1);
            int i8 = $11 + 83;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 / 4;
            }
        }
        if (z) {
            int i10 = $11 + 27;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7407 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), View.getDefaultSize(0, 0) + 16, (char) TextUtils.indexOf("", ""), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    public boolean equals(Object other) throws Throwable {
        Object[] objArr;
        char c2;
        Object[] objArr2;
        int i;
        int i2 = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-862225659);
        if (objCopydefault == null) {
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2027;
            int iArgb = 23 - Color.argb(0, 0, 0, 0);
            char capsMode = (char) (6164 - TextUtils.getCapsMode("", 0, 0));
            Object[] objArr3 = new Object[1];
            a((byte) ($$a[18] - 1), r3[24], (byte) 0, objArr3);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iArgb, capsMode, 163751008, false, (String) objArr3[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr4 = new Object[1];
        b(23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1}, 137 - View.resolveSize(0, 0), false, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        b(View.resolveSize(0, 0) + 15, 16 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{65534, 6, 2, CharUtils.CR, 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534}, TextUtils.indexOf((CharSequence) "", '0', 0) + 142, true, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-744988891);
        if (objCopydefault2 == null) {
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 2026;
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23;
            char cRgb = (char) ((-16771052) - Color.rgb(0, 0, 0));
            byte b2 = (byte) 0;
            byte b3 = (byte) (b2 + 3);
            Object[] objArr6 = new Object[1];
            a(b2, b3, (byte) (b3 - 2), objArr6);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionGroup, minimumFlingVelocity, cRgb, 381780032, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-744065370);
            if (objCopydefault3 == null) {
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 2026;
                int iMyTid = 23 - (Process.myTid() >> 22);
                char cIndexOf = (char) (TextUtils.indexOf("", "") + 6164);
                byte b4 = (byte) 0;
                byte b5 = b4;
                Object[] objArr7 = new Object[1];
                a(b4, b5, (byte) (b5 + 1), objArr7);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iResolveOpacity, iMyTid, cIndexOf, 385853891, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new int[1], new int[]{i}, strArr, new int[]{i}};
            int i3 = ((int[]) objArr8[1])[0];
            int i4 = ((int[]) objArr8[3])[0];
            String[] strArr = (String[]) objArr8[2];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i5 = (~((-56050152) | iMaxMemory)) | 21184900;
            int i6 = (-766451789) + (i5 * 992) + ((i5 | (~((~iMaxMemory) | 2071448575))) * (-496)) + ((iMaxMemory | 2036583324) * 496) + 295009775;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
            c2 = 3;
        } else {
            Object[] objArr9 = new Object[1];
            b(15 - Process.getGidForName(""), 16 - TextUtils.indexOf("", "", 0), new char[]{11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b'}, 135 - TextUtils.lastIndexOf("", '0', 0), true, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            b(ExpandableListView.getPackedPositionChild(0L) + 17, 12 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{3, 14, 19, 65506, 65531, CharUtils.CR, 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14}, 140 - TextUtils.indexOf("", ""), false, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            int i9 = getRequestBeneficiariesState + 99;
            component4 = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr11 = {null, Integer.valueOf(iIntValue), 0, 295009775};
                byte[] bArr = $$d;
                byte b6 = bArr[40];
                byte b7 = b6;
                Object[] objArr12 = new Object[1];
                c(b6, b7, (byte) (b7 + 1), objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b8 = (byte) ($$e & 1);
                byte b9 = bArr[40];
                Object[] objArr13 = new Object[1];
                c(b8, b9, b9, objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-744065370);
                if (objCopydefault4 == null) {
                    int iIndexOf2 = 2025 - TextUtils.indexOf((CharSequence) "", '0');
                    int i11 = 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    char maxKeyCode = (char) (6164 - (KeyEvent.getMaxKeyCode() >> 16));
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr14 = new Object[1];
                    a(b10, b11, (byte) (b11 + 1), objArr14);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf2, i11, maxKeyCode, 385853891, false, (String) objArr14[0], null);
                }
                ((Field) objCopydefault4).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    b((ViewConfiguration.getLongPressTimeout() >> 16) + 22, View.combineMeasuredStates(0, 0) + 15, new char[]{65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1}, 138 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), false, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    b(16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15, new char[]{65534, 6, 2, CharUtils.CR, 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534}, 141 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), true, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-744988891);
                    if (objCopydefault5 == null) {
                        int iMyTid2 = (Process.myTid() >> 22) + 2026;
                        int size = View.MeasureSpec.getSize(0) + 23;
                        char scrollBarSize = (char) (6164 - (ViewConfiguration.getScrollBarSize() >> 8));
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 + 3);
                        Object[] objArr17 = new Object[1];
                        a(b12, b13, (byte) (b13 - 2), objArr17);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iMyTid2, size, scrollBarSize, 381780032, false, (String) objArr17[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-862225659);
                    if (objCopydefault6 == null) {
                        int absoluteGravity = 2026 - Gravity.getAbsoluteGravity(0, 0);
                        int i12 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23;
                        char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 6164);
                        Object[] objArr18 = new Object[1];
                        a((byte) ($$a[18] - 1), r3[24], (byte) 0, objArr18);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(absoluteGravity, i12, cMakeMeasureSpec, 163751008, false, (String) objArr18[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf2);
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
        int i13 = ((int[]) objArr[c2])[0];
        int i14 = ((int[]) objArr[1])[0];
        if (i14 == i13) {
            Object[] objArr19 = {new int[1], new int[]{i}, strArr, new int[]{i}};
            int i15 = ((int[]) objArr[0])[0];
            int i16 = ((int[]) objArr[1])[0];
            int i17 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[2];
            int iIdentityHashCode = System.identityHashCode(this);
            int i18 = i15 + 1163186954 + (((-4206609) | iIdentityHashCode) * (-381)) + (((~((~iIdentityHashCode) | 2008928235)) | (-1933636212)) * 381) + 1602717648;
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr19[0])[0] = i20 ^ (i20 << 5);
            objArr2 = new Object[]{new int[1], new int[]{i}, strArr2, new int[]{i}};
            int i21 = ((int[]) objArr19[0])[0];
            int i22 = ((int[]) objArr19[1])[0];
            int i23 = ((int[]) objArr19[3])[0];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i24 = ~iElapsedRealtime;
            int i25 = i21 + 740891477 + (((~((-1353790471) | i24)) | (~((-738843006) | iElapsedRealtime))) * 210) + (((~(iElapsedRealtime | (-1353720835))) | (~(i24 | (-738773370)))) * 210);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr2[0])[0] = i27 ^ (i27 << 5);
            i = 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[2];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            long j2 = -1;
            long j3 = ((long) (i13 ^ i14)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 10) << 32) | (j4 - ((j4 >> 63) << 32));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 41 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) View.MeasureSpec.getSize(0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                Object[] objArr20 = {-135794226, Long.valueOf(j5), arrayList, null, false, false};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 6563, 56 - View.combineMeasuredStates(0, 0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault8).invoke(objInvoke, objArr20);
                Object[] objArr21 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                int i28 = ((int[]) objArr[0])[0];
                int i29 = ((int[]) objArr[1])[0];
                int i30 = ((int[]) objArr[3])[0];
                String[] strArr4 = (String[]) objArr[2];
                int iNextInt = new Random().nextInt();
                int i31 = ~iNextInt;
                int i32 = i28 + 1002506283 + (((~((-307395404) | i31)) | 37753352 | (~((-1785238073) | i31))) * (-1136)) + (((~((-307395404) | iNextInt)) | (~((-1785238073) | iNextInt)) | (~(2054880123 | i31))) * (-568)) + (((~(iNextInt | (-37753353))) | (~(i31 | 1785238072)) | (~(307395403 | i31))) * 568);
                int i33 = (i32 << 13) ^ i32;
                int i34 = i33 ^ (i33 >>> 17);
                ((int[]) objArr21[0])[0] = i34 ^ (i34 << 5);
                int[] iArr = new int[i14];
                int i35 = i14 - 1;
                iArr[i35] = 1;
                Toast.makeText((Context) null, iArr[((i14 * i35) % 2) - 1], 1).show();
                objArr2 = new Object[]{new int[1], new int[]{i}, strArr, new int[]{i}};
                int i36 = ((int[]) objArr21[0])[0];
                int i37 = ((int[]) objArr21[1])[0];
                int i38 = ((int[]) objArr21[3])[0];
                String[] strArr5 = (String[]) objArr21[2];
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i39 = ~iIdentityHashCode2;
                int i40 = i36 + (((~(i39 | 1052731146)) | (~((-1039902330) | i39)) | 21004401) * (-397)) + 1545747817 + ((iIdentityHashCode2 | 54837619) * 397);
                int i41 = (i40 << 13) ^ i40;
                int i42 = i41 ^ (i41 >>> 17);
                ((int[]) objArr2[0])[0] = i42 ^ (i42 << 5);
                i = 2;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        if (this == other) {
            int i43 = component4 + 101;
            getRequestBeneficiariesState = i43 % 128;
            return i43 % i == 0;
        }
        if (other instanceof FamilyConnectDashboardUiState) {
            FamilyConnectDashboardUiState familyConnectDashboardUiState = (FamilyConnectDashboardUiState) other;
            if (this.component1 != familyConnectDashboardUiState.component1) {
                int i44 = getRequestBeneficiariesState;
                int i45 = i44 + 23;
                component4 = i45 % 128;
                int i46 = i45 % 2;
                int i47 = i44 + 121;
                component4 = i47 % 128;
                int i48 = i47 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.copydefault, familyConnectDashboardUiState.copydefault)) {
                return false;
            }
            if (!(!Intrinsics.areEqual(this.component3, familyConnectDashboardUiState.component3))) {
                return true;
            }
            int i49 = component4 + 65;
            getRequestBeneficiariesState = i49 % 128;
            int i50 = i49 % 2;
            return false;
        }
        int i51 = getRequestBeneficiariesState + 15;
        component4 = i51 % 128;
        int i52 = i51 % 2;
        int i53 = ((int[]) objArr2[0])[0];
        int i54 = i53 * i53;
        int i55 = -(1074747846 * i53);
        int i56 = (i54 ^ i55) + ((i54 & i55) << 1);
        int i57 = -(i53 * (-1602844402));
        int i58 = ((i56 & i57) + (i57 | i56)) - (-508608484);
        int i59 = i58 >> 25;
        int i60 = ((i59 ^ (-255)) + ((i59 & (-255)) << 1)) / 128;
        int i61 = (i60 ^ 1) + ((i60 & 1) << 1);
        int i62 = (i58 ^ i61) + ((i61 & i58) << 1);
        int i63 = i58 >> 27;
        int i64 = -(i62 ^ ((((i63 & (-63)) + (i63 | (-63))) / 32) + 1));
        int i65 = (i64 ^ 1) + ((i64 & 1) << 1);
        int i66 = i65 >> 20;
        int i67 = ((i66 ^ (-8191)) + ((i66 & (-8191)) << 1)) / 4096;
        int i68 = (i67 & 1) + (i67 | 1);
        return 0 / (((-(((i68 | 1) << 1) - (i68 ^ 1))) & i65) * 766);
    }

    static {
        getAsAtTimestamp = 1;
        copydefault();
        int i = ShareDataUIState + 91;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    public FamilyConnectDashboardUiState() {
        this(false, null, null, 7, null);
    }

    public static FamilyConnectDashboardUiState copy$default(FamilyConnectDashboardUiState familyConnectDashboardUiState, boolean z, String str, FamilyConnectUIState familyConnectUIState, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = getRequestBeneficiariesState + 87;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            z = familyConnectDashboardUiState.component1;
        }
        if ((i & 2) != 0) {
            int i5 = component4 + 63;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            str = familyConnectDashboardUiState.copydefault;
        }
        if ((i & 4) != 0) {
            familyConnectUIState = familyConnectDashboardUiState.component3;
        }
        return familyConnectDashboardUiState.copy(z, str, familyConnectUIState);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 73;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.component1;
        int i4 = i3 + 111;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return z;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = component4 + 75;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            str = this.copydefault;
            int i4 = 41 / 0;
        } else {
            str = this.copydefault;
        }
        int i5 = i3 + 45;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final FamilyConnectUIState component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 47;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        FamilyConnectUIState familyConnectUIState = this.component3;
        int i4 = i2 + 89;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return familyConnectUIState;
    }

    public final FamilyConnectDashboardUiState copy(boolean isLoading, String errorMessage, FamilyConnectUIState uiState) {
        int i = 2 % 2;
        FamilyConnectDashboardUiState familyConnectDashboardUiState = new FamilyConnectDashboardUiState(isLoading, errorMessage, uiState);
        int i2 = getRequestBeneficiariesState + 57;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return familyConnectDashboardUiState;
    }

    public int hashCode() {
        int i = 2 % 2;
        int iHashCode = 1;
        int i2 = getRequestBeneficiariesState + 1;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Boolean.hashCode(this.component1);
        String str = this.copydefault;
        if (str == null) {
            int i4 = component4 + 17;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                iHashCode = 0;
            }
        } else {
            iHashCode = str.hashCode();
        }
        FamilyConnectUIState familyConnectUIState = this.component3;
        int iHashCode3 = familyConnectUIState != null ? familyConnectUIState.hashCode() : 0;
        int i5 = component4 + 45;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return (((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FamilyConnectDashboardUiState(isLoading=" + this.component1 + ", errorMessage=" + this.copydefault + ", uiState=" + this.component3 + ")";
        int i2 = getRequestBeneficiariesState + 39;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault() {
        component2 = -890926401;
    }
}
