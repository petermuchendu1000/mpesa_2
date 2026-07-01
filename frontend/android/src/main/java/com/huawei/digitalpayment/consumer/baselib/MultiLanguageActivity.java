package com.huawei.digitalpayment.consumer.baselib;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.common.language.LanguageUtils;
import com.huawei.secure.android.common.activity.SafeAppCompatActivity;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.CharUtils;

public class MultiLanguageActivity extends SafeAppCompatActivity {
    private static final byte[] $$V = {65, -53, 110, -39};
    private static final int $$W = 105;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$K = {112, 44, -46, -27, Ascii.SO, Ascii.SI, 2, 7, Ascii.SI, 20, -64, 63, Ascii.SYN, 13, 7, Ascii.DLE, 9, -1, Ascii.SI, 1, Ascii.CAN, -59, 63, Ascii.SI, 3, Ascii.ETB, 10, 1, 17, 17, -59, 44, 44, 7, -1, Ascii.ESC, -8, Ascii.FF, Ascii.ETB, -21, Ascii.SUB, Ascii.SYN, Ascii.VT, -1, -55, 42, 43, Ascii.VT, 5, Ascii.RS, 1, Ascii.DC2, -33, 46, 13, 6, 17, Ascii.SYN, 8, 13, 9, 9, 1, 19, Ascii.DLE, -56, Ascii.SYN, 8, 13, 9, 9, 1, 19, Ascii.DLE, -55};
    private static final int $$L = 9;
    private static final byte[] $$p = {89, 120, -98, -110, Ascii.SUB, Ascii.SI, Ascii.ETB, Ascii.SUB, Ascii.FF, 17, 13, 13, 5, Ascii.ETB, 20, -50, Ascii.FF, Ascii.GS, -20, 33, Ascii.SUB, Ascii.DC2, -2, Ascii.FS, Ascii.SI, -36, TarHeader.LF_LINK, Ascii.ETB, 5, Ascii.SI, 17, 8, 20, 6, Ascii.US, 5, 10, Ascii.FS, -18, 47, -5, 33, -1};
    private static final int $$q = 21;
    private static int component4 = 0;
    private static int copy = 1;
    private static char[] copydefault = {1966, 2003, 2030, 2028, 1987, 1964, 2024, 2025, 1973, 1952, 2029, 1971, 2031, 1955, 2036, 1968, 2034, 1969, 1954, 1965, 1992, 1953, 2023, 2021, 2032, 1972, 1959, 1976, 1958, 2027, 2035, 2041, 2018, 2038, 2026, 1974, 1970, 2000, 2004, 1975, 2022, 2017, 1977, 1967, 1985, 2002, 2019, 2037, 2020};
    private static char component2 = 12829;
    private static char component3 = 40809;
    private static char component1 = 34478;
    private static char ShareDataUIState = 48549;
    private static char equals = 17211;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$X(short r7, byte r8, byte r9) {
        /*
            int r9 = r9 * 8
            int r9 = r9 + 111
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.MultiLanguageActivity.$$V
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r9 = r7
            r3 = r8
            r5 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r7 = r7 + r3
            int r9 = r9 + 1
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.MultiLanguageActivity.$$X(short, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void A(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 44
            int r8 = 54 - r8
            int r6 = 65 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.MultiLanguageActivity.$$K
            int r7 = r7 * 8
            int r7 = 107 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r7 = r8
            r4 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
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
            int r7 = r7 + r3
            int r7 = r7 + (-10)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.MultiLanguageActivity.A(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void z(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.MultiLanguageActivity.$$p
            int r7 = r7 * 4
            int r7 = r7 + 99
            int r8 = r8 * 6
            int r8 = r8 + 4
            int r9 = r9 * 3
            int r9 = 16 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r7 = r9
            r5 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r6
        L2c:
            int r9 = r9 + r3
            int r7 = r7 + 1
            int r9 = r9 + (-14)
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.MultiLanguageActivity.z(short, int, short, java.lang.Object[]):void");
    }

    @Override
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = component4 + 61;
        copy = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(LanguageUtils.getInstance().attach(context));
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void y(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i4 = $10 + 93;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                int i8 = $10 + 45;
                $11 = i8 % 128;
                int i9 = i8 % i2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(equals);
                    objArr2[i2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 845, View.getDefaultSize(0, 0) + 32, (char) (23251 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 592652048, false, $$X(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) component3) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component1)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 845, 32 - (ViewConfiguration.getTouchSlop() >> 8), (char) (23251 - View.MeasureSpec.getMode(0)), 592652048, false, $$X(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i12 = $11 + 117;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 466, 49 - Color.alpha(0), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i14 = $11 + 85;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            i2 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b4  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r29) {
        /*
            Method dump skipped, instruction units count: 2555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.MultiLanguageActivity.onCreate(android.os.Bundle):void");
    }

    private static void x(int i, byte b2, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = copydefault;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 7422, 15 - (ViewConfiguration.getTouchSlop() >> 8), (char) (64291 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
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
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 15 - TextUtils.getCapsMode("", 0, 0), (char) ((Process.myTid() >> 22) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                int i5 = $11 + 125;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    int i7 = $10 + 13;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    obj = obj2;
                } else {
                    Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 7117, View.combineMeasuredStates(0, 0) + 14, (char) (44463 - (Process.myPid() >> 22)), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2944 - KeyEvent.keyCodeFromString(""), ImageFormat.getBitsPerPixel(0) + 25, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 27637), 794909189, false, $$X(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i9 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i9];
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            int i10 = $10 + 105;
                            $11 = i10 % 128;
                            int i11 = i10 % 2;
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i12 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i13 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i12];
                            cArr4[cancelall.component2 + 1] = cArr2[i13];
                            int i14 = $10 + 37;
                            $11 = i14 % 128;
                            if (i14 % 2 == 0) {
                                int i15 = 2 % 5;
                            }
                        } else {
                            int i16 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i17 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i16];
                            cArr4[cancelall.component2 + 1] = cArr2[i17];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override
    public void onResume() {
        int i = 2 % 2;
        int i2 = copy + 81;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            x(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(19) - 20, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(25) - 45), new char[]{'%', 6, AbstractJsonLexerKt.COMMA, 20, CharUtils.CR, '\b', '*', 6, Typography.amp, 27, 21, 3, '-', '/', 21, 14, 28, '\f', 17, 28, ')', 3, 23, 30, '0', 6}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            x(17 - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) (22 - (ViewConfiguration.getEdgeSlop() >> 16)), new char[]{'/', '0', 13822, 13822, 30, '\t', 16, '*', 13824, 13824, 0, '\n', '0', '\'', 21, 14, '\t', 5}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = copy + 77;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i6 = copy + 95;
            component4 = i6 % 128;
            try {
                if (i6 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - KeyEvent.normalizeMetaState(0), TextUtils.indexOf("", "", 0) + 42, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 6562, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 56, (char) View.MeasureSpec.getMode(0), -699576857, false, "component2", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    obj.hashCode();
                    throw null;
                }
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(6618 - View.MeasureSpec.getMode(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 42, (char) (Process.getGidForName("") + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(MotionEvent.axisFromString("") + 6563, KeyEvent.keyCodeFromString("") + 56, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault4).invoke(objInvoke2, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
        int i7 = component4 + 107;
        copy = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override
    public void onPause() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            x(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952717_res_0x7f13044d).substring(6, 7).length() + 25, (byte) (71 - (KeyEvent.getMaxKeyCode() >> 16)), new char[]{'%', 6, AbstractJsonLexerKt.COMMA, 20, CharUtils.CR, '\b', '*', 6, Typography.amp, 27, 21, 3, '-', '/', 21, 14, 28, '\f', 17, 28, ')', 3, 23, 30, '0', 6}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            x(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 7), new char[]{'/', '0', 13822, 13822, 30, '\t', 16, '*', 13824, 13824, 0, '\n', '0', '\'', 21, 14, '\t', 5}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = component4 + 103;
            copy = i2 % 128;
            if (i2 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i3 = copy + 115;
                component4 = i3 % 128;
                int i4 = i3 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 6619, TextUtils.lastIndexOf("", '0', 0) + 43, (char) (KeyEvent.getMaxKeyCode() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6561, 55 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (MotionEvent.axisFromString("") + 1), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component4 + 21;
        copy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = copy + 71;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }
}
