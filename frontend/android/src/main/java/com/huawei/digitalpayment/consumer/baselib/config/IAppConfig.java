package com.huawei.digitalpayment.consumer.baselib.config;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
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
import androidx.collection.SieveCacheKt;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.blankj.utilcode.util.ObjectUtils;
import com.blankj.utilcode.util.StringUtils;
import com.blankj.utilcode.util.Utils;
import com.google.common.base.Ascii;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.R;
import com.huawei.digitalpayment.consumer.baselib.config.model.ServiceConfigKt;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.mobileapp.resourcelib.ResourceStringUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.cancelNotification;
import org.apache.commons.lang3.CharUtils;

public interface IAppConfig {
    public static final String DEFAULT_KEY_VERSION = "00";
    public static final byte[] $$c = {79, -25, -14, 102};
    public static final int $$f = 239;
    public static final byte[] $$d = {115, 102, 60, 8, Ascii.NAK, -7, 17, -13, -33, Ascii.GS, 19, -19, -12, -12, 10, 33, -19, 19, -15};
    public static final int $$e = 106;
    public static final byte[] $$a = {TarHeader.LF_CHR, -39, 98, -44, -39, -25, -30, -26, -26, -18, -36, -33, 39, -39, -25, -30, -26, -26, -18, -36, -33, 40, -39, -31, -7, -38, -34};
    public static final int $$b = 84;
    public static final int component3 = -890926463;
    public static final char[] copydefault = {27087, 53242, 9651, 39721, 61728, 22212, 35995, 57940, 22529, 45508, 6072, 19899, 41833, 6446, 32475, 54415, 2653, 24585, 55774, 16374, 38305, 52076, 8495, 34525, 64640, 21011, 34821, 57792, 18430, 48554, 4983, 18726, 44777, 1159, 31248, 53268, 2510, 28658, 50607, 15210, 37226, 63230, 11423, 33362, 63491, 20936, 47072, 60863, 17202, 47382, 7911, 29850, 43643, 0, 31192, 57335, 13712, 27512, 49458, 9962, 40083, 62029, 10251, 33220, 59266, 23942, 45949, 59701, 20205, 42132, 6740, 28712, 43472, 4041, 25989, 56182, 12589, 38602, 52371, 8777, 38936, 61921, 22411, 36259, 58237, 22818, 48894, 5274, 19035, 40979, 6645, 32652, 54690, 2940, 24871, 50917, 15592, 37383, 51290, 8579, 34733, 64937, 21358, 35110, 61174, 17571, 47703, 4115, 18931, 44944, 1468, 31599, 53556, 14048, 27834, 49758, 14363, 37357, 63371, 11710, 33654, 63801, 24295, 46335};
    public static final long component2 = -2764619471201523121L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r5, short r6, int r7) {
        /*
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r7 = r7 + 4
            int r5 = r5 + 65
            byte[] r1 = com.huawei.digitalpayment.consumer.baselib.config.IAppConfig.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            int r7 = r7 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L20:
            int r3 = r3 + 1
            r4 = r1[r7]
        L24:
            int r4 = -r4
            int r5 = r5 + r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.config.IAppConfig.$$g(int, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 6
            int r8 = r8 * 2
            int r8 = r8 + 99
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.config.IAppConfig.$$a
            int r6 = r6 * 9
            int r6 = 21 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2e
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
            r6 = r5
        L2e:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-27)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.config.IAppConfig.a(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r5 = r5 * 4
            int r5 = r5 + 83
            int r7 = r7 * 3
            int r7 = 16 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.config.IAppConfig.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r4 = r0[r6]
        L28:
            int r5 = r5 + r4
            int r6 = r6 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.config.IAppConfig.d(byte, int, short, java.lang.Object[]):void");
    }

    String getBaseUrl();

    String getPinKey();

    String getPinTransformation();

    String getSignKey();

    String getSignKeyVersion();

    String getSignTransformation();

    boolean miniAppSupportRTL();

    default String getH5BaseUrl() {
        int i = 2 % 2;
        return getH5BaseUrlByBaseUrl();
    }

    default String getH5BaseUrlByBaseUrl() {
        int i = 2 % 2;
        String baseUrl = getBaseUrl();
        try {
            return baseUrl.substring(0, baseUrl.indexOf("/appgateway"));
        } catch (Exception unused) {
            return "";
        }
    }

    default String getPinKeyVersion() {
        int i = 2 % 2;
        return "01";
    }

    default String getNewestPinKeyVersion() {
        int i = 2 % 2;
        return "00";
    }

    private static void c(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(copydefault[i + i4])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1758 - ExpandableListView.getPackedPositionType(0L), 34 - TextUtils.indexOf("", "", 0), (char) View.MeasureSpec.getSize(0), 1159210934, false, $$g((byte) 56, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(component2), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) 0;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 3560, View.combineMeasuredStates(0, 0) + 29, (char) (KeyEvent.normalizeMetaState(0) + 7171), 1951385784, false, $$g((byte) 52, b3, (byte) (b3 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27761), -1529629956, false, $$g((byte) 57, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
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
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b5 = (byte) 0;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 4013, 24 - TextUtils.indexOf("", "", 0), (char) (27760 - TextUtils.indexOf((CharSequence) "", '0')), -1529629956, false, $$g((byte) 57, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    default String getH5SignKeyVersion() {
        int i = 2 % 2;
        return "00";
    }

    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i3];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i5 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 3784, 38 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (26860 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 2015799920, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 7406, (Process.myPid() >> 22) + 16, (char) (ViewConfiguration.getTouchSlop() >> 8), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i3 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            char[] cArr4 = new char[i3];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i3 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                try {
                    Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7405, TextUtils.getTrimmedLength("") + 16, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    default String getH5SignTransformation() {
        int i = 2 % 2;
        return "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
    }

    default String getH5SignKey() {
        int i = 2 % 2;
        return SPUtils.getInstance().getString(SPConstant.H5_SIGN_KEY);
    }

    default String getPhoneNumberCode() {
        int i = 2 % 2;
        return "86";
    }

    default String getPhoneNumberRegular() {
        int i = 2 % 2;
        return "^([0-9]{11})$";
    }

    default String getCurrency() {
        int i = 2 % 2;
        return Utils.getApp().getString(R.string.base_default_unit);
    }

    default String getSymbol() {
        int i = 2 % 2;
        return "$";
    }

    default String getString(int i) {
        int i2 = 2 % 2;
        return ResourceStringUtils.getResStringOrNull(i);
    }

    default int getColor(int i, Resources.Theme theme) {
        int i2 = 2 % 2;
        return ColorConfigManager.INSTANCE.getColor(i, theme);
    }

    default String getOperatorNameRegular() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-412868303);
        if (objCopydefault == null) {
            int scrollBarSize = 1115 - (ViewConfiguration.getScrollBarSize() >> 8);
            int iIndexOf = TextUtils.indexOf("", "") + 22;
            char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte b2 = (byte) 2;
            byte b3 = (byte) (b2 - 1);
            Object[] objArr3 = new Object[1];
            a(b2, b3, (byte) (b3 - 1), objArr3);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(scrollBarSize, iIndexOf, c2, 574488148, false, (String) objArr3[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr4 = new Object[1];
        b(123 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12, new char[]{65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16}, 22 - View.resolveSizeAndState(0, 0, 0), false, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        b(View.resolveSize(0, 0) + 127, 3 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{65530, 5, 65534, 65534, 6, 2, CharUtils.CR, 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t'}, TextUtils.lastIndexOf("", '0', 0) + 16, true, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-413791824);
        if (objCopydefault2 == null) {
            int iResolveOpacity = 1115 - Drawable.resolveOpacity(0, 0);
            int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 22;
            char trimmedLength = (char) TextUtils.getTrimmedLength("");
            byte b4 = (byte) 1;
            byte b5 = b4;
            Object[] objArr6 = new Object[1];
            a(b4, b5, (byte) (b5 - 1), objArr6);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iResolveOpacity, iResolveOpacity2, trimmedLength, 571463381, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1207399525);
            if (objCopydefault3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                Object[] objArr7 = new Object[1];
                a(b6, b7, (byte) (b7 + 1), objArr7);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1115 - Gravity.getAbsoluteGravity(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.ETB, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 2102482174, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i2 = 1613345068 + ((~((~iIdentityHashCode) | (-138544130))) * 433) + (((~((-53602719) | iIdentityHashCode)) | (-139594770)) * (-433)) + (((~(iIdentityHashCode | (-139594770))) | (-192146848)) * 433) + 1750660549;
            int i3 = (i2 << 13) ^ i2;
            int i4 = i3 ^ (i3 >>> 17);
            ((int[]) objArr[0])[0] = i4 ^ (i4 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            b(View.resolveSize(0, 0) + 123, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21, new char[]{'\f', 6, 1, 65483, 65534, CharUtils.CR, CharUtils.CR, 65483, 65502, 0, 17, 6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26, false, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            b(130 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2, new char[]{5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535}, (Process.myTid() >> 22) + 18, false, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            b((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 122, 5 - ExpandableListView.getPackedPositionType(0L), new char[]{23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521}, TextUtils.getOffsetAfter("", 0) + 16, false, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            b(Drawable.resolveOpacity(0, 0) + 126, Color.argb(0, 0, 0, 0) + 6, new char[]{CharUtils.CR, 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531}, 16 - KeyEvent.getDeadChar(0, 0), false, objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 1750660549};
                Object[] objArr14 = new Object[1];
                c((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 123, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 26074), objArr14);
                Class<?> cls4 = Class.forName(((String) objArr14[0]).intern());
                byte b8 = (byte) 0;
                byte b9 = b8;
                Object[] objArr15 = new Object[1];
                d(b8, b9, b9, objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (applicationContext != null) {
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1207399525);
                    if (objCopydefault4 == null) {
                        int scrollBarFadeDuration = 1115 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int packedPositionGroup = 22 - ExpandableListView.getPackedPositionGroup(0L);
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                        Object[] objArr17 = new Object[1];
                        a(b8, b9, (byte) (b9 + 1), objArr17);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarFadeDuration, packedPositionGroup, cIndexOf, 2102482174, false, (String) objArr17[0], null);
                    }
                    ((Field) objCopydefault4).set(null, objArr16);
                    try {
                        Object[] objArr18 = new Object[1];
                        b(122 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 13, new char[]{65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16}, View.getDefaultSize(0, 0) + 22, false, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        b(127 - Color.argb(0, 0, 0, 0), MotionEvent.axisFromString("") + 4, new char[]{65530, 5, 65534, 65534, 6, 2, CharUtils.CR, 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t'}, 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), true, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-413791824);
                        if (objCopydefault5 == null) {
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1115;
                            int mirror = 'F' - AndroidCharacter.getMirror('0');
                            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            byte b10 = (byte) 1;
                            byte b11 = b10;
                            Object[] objArr20 = new Object[1];
                            a(b10, b11, (byte) (b11 - 1), objArr20);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay, mirror, doubleTapTimeout, 571463381, false, (String) objArr20[0], null);
                        }
                        ((Field) objCopydefault5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-412868303);
                        if (objCopydefault6 == null) {
                            int packedPositionChild = 1114 - ExpandableListView.getPackedPositionChild(0L);
                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 22;
                            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            byte b12 = (byte) 2;
                            byte b13 = (byte) (b12 - 1);
                            Object[] objArr21 = new Object[1];
                            a(b12, b13, (byte) (b13 - 1), objArr21);
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionChild, tapTimeout, edgeSlop, 574488148, false, (String) objArr21[0], null);
                        }
                        ((Field) objCopydefault6).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr16;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i5 = ((int[]) objArr[1])[0];
        int i6 = ((int[]) objArr[2])[0];
        if (i6 == i5) {
            int i7 = ((int[]) objArr[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i8 = i7 + 937575327 + (((~((-568484464) | startElapsedRealtime)) | 564134464) * 1504) + ((~(startElapsedRealtime | (-4350000))) * (-1504)) + 1200912912;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr22[0])[0] = i10 ^ (i10 << 5);
            int i11 = ((int[]) objArr22[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr22[1])[0]}, new int[]{((int[]) objArr22[2])[0]}, (String[]) objArr22[3]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i12 = i11 + (((1188776944 + (((~((-226754737) | startUptimeMillis)) | (~((-33557249) | startUptimeMillis))) * 69)) + (((~(startUptimeMillis | (-844304143))) | ((~((-1037501631) | startUptimeMillis)) | 810746894)) * (-69))) - 888618619);
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr2[0])[0] = i14 ^ (i14 << 5);
        } else {
            long j2 = -1;
            long j3 = ((long) (i5 ^ i6)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 7) << 32) | (j4 - ((j4 >> 63) << 32));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6618 - TextUtils.getCapsMode("", 0, 0), 41 - TextUtils.lastIndexOf("", '0', 0), (char) (Process.myTid() >> 22), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                Object[] objArr23 = {-396018619, Long.valueOf(j5), new ArrayList(), null, false, false};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getTapTimeout() >> 16), 56 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) Color.argb(0, 0, 0, 0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault8).invoke(objInvoke, objArr23);
                int i15 = ((int[]) objArr[0])[0];
                Object[] objArr24 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i16 = ~iIdentityHashCode2;
                int i17 = i15 + (-843358842) + ((~(811000798 | i16)) * 979) + ((iIdentityHashCode2 | 1004198286) * (-979)) + (((~(iIdentityHashCode2 | 811000798)) | (~(i16 | 1004198286))) * 979);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr24[0])[0] = i19 ^ (i19 << 5);
                int[] iArr = new int[i6];
                int i20 = i6 - 1;
                iArr[i20] = 1;
                Toast.makeText((Context) null, iArr[((i6 * i20) % 2) - 1], 1).show();
                int i21 = ((int[]) objArr24[0])[0];
                Object[] objArr25 = {new int[1], new int[]{((int[]) objArr24[1])[0]}, new int[]{((int[]) objArr24[2])[0]}, (String[]) objArr24[3]};
                int iMyPid = Process.myPid();
                int i22 = ~iMyPid;
                int i23 = i21 + (-814883652) + (((~(863702009 | i22)) | (-1073679354)) * 98) + (((~(i22 | (-1056899498))) | 863702009 | (~(1056899497 | iMyPid))) * (-49)) + (((~(iMyPid | 863702009)) | 16779856) * 49);
                int i24 = (i23 << 13) ^ i23;
                int i25 = i24 ^ (i24 >>> 17);
                ((int[]) objArr25[0])[0] = i25 ^ (i25 << 5);
                objArr2 = objArr25;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        String strConcat = "28;2;31;4;17;".concat(ServiceConfigKt.OPERATOR_NAME_REGULAR);
        int i26 = ((int[]) objArr2[0])[0];
        int i27 = i26 * i26;
        int i28 = -(1877995304 * i26);
        int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
        int i30 = -(i26 * (-693505760));
        int i31 = (i29 & i30) + (i30 | i29);
        int i32 = (i31 ^ 1319339280) + ((1319339280 & i31) << 1);
        int i33 = i32 >> 15;
        int i34 = ((i33 & (-262143)) + (i33 | (-262143))) / 131072;
        int i35 = (i34 ^ 1) + ((i34 & 1) << 1);
        int i36 = (i32 ^ i35) + ((i35 & i32) << 1);
        int i37 = i32 >> 24;
        int i38 = ((i37 & (-511)) + (i37 | (-511))) / 256;
        int i39 = (-(((i38 & 1) + (i38 | 1)) ^ i36)) + 3;
        int i40 = i39 >> 27;
        return strConcat.substring(56940 / ((i39 & (-(((((i40 | (-63)) << 1) - (i40 ^ (-63))) / 32) + 2))) * 1460));
    }

    default String getShortCodeRegular() {
        int i = 2 % 2;
        return ServiceConfigKt.SHORT_CODE_REGULAR;
    }

    default String getIVRNumber() {
        int i = 2 % 2;
        return "";
    }

    default String getDesensitizationPhone(String str, boolean z) {
        int i = 2 % 2;
        if (ObjectUtils.isEmpty((CharSequence) str)) {
            return "";
        }
        return mask(str, z ? 3 + AppConfigManager.getAppConfig().getPhoneNumberCode().length() : 3, 4);
    }

    default String mask(String str, int i, int i2) {
        int i3 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int length = StringUtils.length(str);
        String mask = getMask();
        if (length < 3) {
            sb.append(mask);
        } else if (length < 5) {
            sb.append(mask);
            sb.append(str.substring(str.length() - 1));
        } else if (length <= i2) {
            sb.append(mask);
            sb.append(str.substring(str.length() - 3));
        } else {
            String strSubstring = str.substring(str.length() - i2);
            if (length <= i2 + i) {
                sb.append(mask);
                sb.append(strSubstring);
            } else {
                sb.append(str.substring(0, i));
                sb.append(mask);
                sb.append(strSubstring);
            }
        }
        return sb.toString();
    }

    default String getMask() {
        int i = 2 % 2;
        return "******";
    }

    default String getPINInputStyle() {
        int i = 2 % 2;
        int minPINLength = AppConfigManager.getAppConfig().getMinPINLength();
        int maxPINLength = AppConfigManager.getAppConfig().getMaxPINLength();
        return (minPINLength != maxPINLength || maxPINLength > getPINInputMultiBoxMaxLen()) ? "3" : "1";
    }

    default boolean isMiniAppActivity(Activity activity) {
        int i = 2 % 2;
        return activity.getClass().getName().contains("SingleProcessBaseActivity") || activity.getClass().getName().contains("MultiProcessBaseActivity");
    }

    default boolean closeSoftInputOnClick() {
        int i = 2 % 2;
        return false;
    }

    default int delayAppletPreload() {
        int i = 2 % 2;
        return 30;
    }

    default boolean enableAutoPreloadApplets() {
        int i = 2 % 2;
        return true;
    }

    default int getAmountLen() {
        int i = 2 % 2;
        return 10;
    }

    default int getAmountPoint() {
        int i = 2 % 2;
        return 2;
    }

    default float getBaseWidth() {
        int i = 2 % 2;
        return 360.0f;
    }

    default int getBiometricPayGuideCountRemind() {
        int i = 2 % 2;
        return 10;
    }

    default long getDelayRemindTime() {
        int i = 2 % 2;
        return 86400000L;
    }

    default int getMaxPINLength() {
        int i = 2 % 2;
        return 6;
    }

    default int getMinPINLength() {
        int i = 2 % 2;
        return 4;
    }

    default int getOtpLimit() {
        int i = 2 % 2;
        return 6;
    }

    default int getPINInputMultiBoxMaxLen() {
        int i = 2 % 2;
        return 6;
    }

    default int getPhoneNumberMaxLength() {
        int i = 2 % 2;
        return 11;
    }

    default int getPinLimit() {
        int i = 2 % 2;
        return 6;
    }

    default long getResendOtpTime() {
        int i = 2 % 2;
        return 60000L;
    }

    default long getSessionOutTimeSecond() {
        int i = 2 % 2;
        return SieveCacheKt.NodeLinkMask;
    }

    default long getTimeoutInSecond() {
        int i = 2 % 2;
        return 30L;
    }

    default boolean isDebug() {
        int i = 2 % 2;
        return false;
    }

    default boolean isFilterLoginSettingMenu() {
        int i = 2 % 2;
        return true;
    }

    default boolean isFilterPaySettingMenu() {
        int i = 2 % 2;
        return true;
    }

    default boolean isSecurityDetectEnabled() {
        int i = 2 % 2;
        return true;
    }

    default boolean isShowDefaultFeatures() {
        int i = 2 % 2;
        return true;
    }

    default boolean isUploadRecentMiniAppToServer() {
        int i = 2 % 2;
        return true;
    }

    default boolean onlySupport3D() {
        int i = 2 % 2;
        return true;
    }

    default boolean supportUnlimitedLengthPIN() {
        int i = 2 % 2;
        return true;
    }

    default boolean useTheme() {
        int i = 2 % 2;
        return false;
    }
}
