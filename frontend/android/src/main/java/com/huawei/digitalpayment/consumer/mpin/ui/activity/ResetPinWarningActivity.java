package com.huawei.digitalpayment.consumer.mpin.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.blankj.utilcode.constant.CacheConstants;
import com.blankj.utilcode.util.CollectionUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.constants.Keys;
import com.huawei.digitalpayment.consumer.login.databinding.ActivityResetPinWarningBinding;
import com.safaricom.mpesa.lifestyle.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.CharUtils;

public class ResetPinWarningActivity extends Hilt_ResetPinWarningActivity<ActivityResetPinWarningBinding, ViewModel> {
    private static final byte[] $$l = {94, -43, -105, 125};
    private static final int $$o = 121;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {79, -7, -1, -17, 20, 6, -55, 59, 19, 5, 1, 7, 9, 7, -43, 59, Ascii.EM, -1, Ascii.NAK, -9, Ascii.NAK, -60, 59, Ascii.ETB, 8, -58, Ascii.ESC, TarHeader.LF_CONTIG, 8, -26, 41, -3, 9, -57, Ascii.SYN, -6, Ascii.NAK, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57};
    private static final int $$k = 125;
    private static final byte[] $$d = {34, -56, Ascii.SUB, -92, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 13;
    private static int copy = 0;
    private static int component4 = 1;
    private static char[] component1 = {2000, 1975, 2007, 2041, 2021, 2019, 1994, 1977, 2029, 1995, 1998, 2018, 2017, 2026, 1999, 2031, 2034, 1974, 2028, 1976, 1992, 2003, 1972, 1966, 1965, 2004, 2025, 1970, 2023, 2037, 2036, 2006, 1973, 1971, 1987, 1993, 2035, 1968, 2032, 2022, 1969, 1996, 2027, 1985, 2005, 2020, 2038, 2001, 2030};
    private static char component2 = 12829;
    private static char copydefault = 58639;
    private static char component3 = 64107;
    private static char ShareDataUIState = 5483;
    private static char getRequestBeneficiariesState = 2698;

    private static String $$r(int i, int i2, byte b2) {
        int i3 = 4 - (i * 3);
        byte[] bArr = $$l;
        int i4 = i2 * 4;
        int i5 = 119 - (b2 * 8);
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i5 = i3 + (-i5);
        }
        while (true) {
            int i7 = i5;
            int i8 = i3;
            i6++;
            bArr2[i6] = (byte) i7;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i3 = i8 + 1;
            i5 = i7 + (-bArr[i8]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 99 - r7
            int r0 = r8 + 4
            int r6 = r6 * 2
            int r6 = r6 + 83
            byte[] r1 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinWarningActivity.$$d
            byte[] r0 = new byte[r0]
            int r8 = r8 + 3
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2f
        L14:
            r3 = r2
        L15:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-8)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinWarningActivity.h(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 24
            int r7 = 34 - r7
            int r8 = r8 * 33
            int r8 = 36 - r8
            int r6 = r6 * 3
            int r6 = r6 + 99
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinWarningActivity.$$j
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r8]
        L2a:
            int r6 = r6 + r3
            int r6 = r6 + (-8)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinWarningActivity.i(short, int, byte, java.lang.Object[]):void");
    }

    private static void g(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 55;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 % 5;
        }
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[i3] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i6 = $10 + 65;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                int i10 = $10 + 39;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i8) ^ ((c3 << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(getRequestBeneficiariesState)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 844, 32 - (ViewConfiguration.getTouchSlop() >> 8), (char) (23251 - Color.red(0)), 592652048, false, $$r(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component3)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 843, (ViewConfiguration.getFadingEdgeLength() >> 16) + 32, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 23251), 592652048, false, $$r(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 465, Color.red(0) + 49, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = copy + 115;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952303_res_0x7f1302af).substring(0, 2).codePointAt(1) - 28, new char[]{CharUtils.CR, '/', AbstractJsonLexerKt.COMMA, 17, 19, 22, AbstractJsonLexerKt.COMMA, 24, 22, '+', 21, 2, 17, 16, 6, 5, 13880, 13880}, (byte) (80 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 24, new char[]{27727, 63317, 46543, 3897, 5367, 8368}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                g(27 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{49387, 53765, 64654, 37746, 62191, 63540, 57296, 13578, 18826, 14702, 20297, 26557, 14888, 57796, 23741, 24121, 8159, 47764, 7389, 37401, 39942, 9582, 47496, 5720, 37985, 30996}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{1, '!', 13809, 13809, 6, '.', 29, AbstractJsonLexerKt.COMMA, 13811, 13811, 19, 25, '\f', 19, '!', 23, 20, '+'}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 20), objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        try {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 42, (char) TextUtils.indexOf("", ""), 428292935, false, "ShareDataUIState", new Class[0]);
                        } catch (Throwable th) {
                            th = th;
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    g((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 48, new char[]{51003, 16147, 28575, 531, 15333, 34754, 32540, 37278, 16781, 38199, 38619, 29149, 45343, 46744, 45329, 17504, 59254, 15822, 28179, 8687, 20214, 56644, 17384, 60111, 60851, 1466, 3281, 45531, 47328, 715, 63804, 16023, 63012, 2402, 21440, 41193, 39759, 59029, 64083, 11246, 1509, 21902, 24732, 16308, 8986, 58914, 42098, 36899}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952718_res_0x7f13044e).substring(6, 7).length() + 63, new char[]{24, '0', '(', '/', '$', 23, 13861, 13861, 25, ')', '$', JSONLexer.EOI, '\n', 14, 13861, 13861, 30, '(', 18, '\f', Typography.amp, '(', '(', 30, JSONLexer.EOI, '\f', '/', 31, 18, 20, 18, '\n', '(', 16, 4, '\f', 3, '.', '/', '\f', '\f', JSONLexer.EOI, '\f', '#', '.', '\'', '!', '\'', '0', 24, CharUtils.CR, '\f', 5, 15, '(', 18, 19, 31, '\f', 14, 28, '\f', 14, '\n'}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 2), objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952805_res_0x7f1304a5).substring(19, 20).codePointAt(0) - 51, new char[]{34865, 16100, 24011, 54815, 51758, 37817, 24405, 55004, 31351, 5425, 40923, 9682, 50760, 34617, 10131, 11717, 6242, 12443, 28179, 8687, 37279, 19095, 12148, 29459, 27311, 24330, 51762, 31617, 58472, 42374, 28701, 40654, 62014, 2014, 40806, 34837, 9693, 37250, 51208, 63950, 63844, 46644, 31561, 43066, 4610, 49255, 6886, 44419, 20022, 8263, 42127, 24015, 55482, 9073, 58397, 38620, 58523, 14237, 63603, 17979, 1509, 21902, 62194, 24924}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    g(72 - TextUtils.indexOf("", "", 0, 0), new char[]{20042, 23469, 28761, 53949, 48079, 2886, 60426, 6434, 44928, 58649, 63844, 31173, 28701, 40654, 42261, 27534, 51758, 37817, 40273, 29334, 8986, 58914, 25193, 7962, 63688, 39184, 54880, 201, 63012, 2402, 47979, 56290, 720, 58719, 13090, 42282, 25583, 45999, 20160, 36141, 38033, 23085, 3438, 32267, 20160, 36141, 65101, 61960, 28129, 63347, 38345, 6365, 18826, 14702, 37141, 22670, 47672, 59394, 45509, 52573, 22897, 27951, 50649, 24710, 47350, 57955, 58539, 50014, 25813, 51829, 60645, 30024}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    g(Process.getGidForName("") + 7, new char[]{32007, 42816, 4698, 4160, 41469, 57828}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952848_res_0x7f1304d0).substring(39, 40).length() + 35, new char[]{'/', Typography.amp, '\n', 19, JSONLexer.EOI, 29, '\n', 18, 23, Typography.amp, '(', 16, Typography.amp, 23, 25, 29, 31, 18, JSONLexer.EOI, '\n', 23, '$', '\n', 25, 18, 3, 25, 1, 15, JSONLexer.EOI, '\n', 14, '\b', JSONLexer.EOI, 2, '$'}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952792_res_0x7f130498).substring(2, 3).length() + 75), objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.lastIndexOf("", '0', 0, 0), 55 - TextUtils.lastIndexOf("", '0'), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault3 == null) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 2405;
            int iRgb = (-16777190) - Color.rgb(0, 0, 0);
            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            byte[] bArr = $$d;
            Object[] objArr13 = new Object[1];
            h(bArr[22], (byte) 96, bArr[33], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iMakeMeasureSpec, iRgb, cMakeMeasureSpec, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) == -1) {
            Object[] objArr14 = new Object[1];
            f((-16777200) - Color.rgb(0, 0, 0), new char[]{7, CharUtils.CR, '/', 11, 25, 16, CharUtils.CR, '/', 30, 21, 24, 0, '%', 29, 1, 11}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952848_res_0x7f1304d0).substring(39, 40).codePointAt(0) + 70), objArr14);
            Class<?> cls3 = Class.forName((String) objArr14[0]);
            Object[] objArr15 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(17) - 99, new char[]{56166, 43808, 25813, 51829, 23741, 24121, 7389, 37401, 21805, 16706, 3095, 64906, 55073, 45814, 18526, 61422}, objArr15);
            try {
                Object[] objArr16 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr15[0], Object.class).invoke(null, this)).intValue()), 0, -1541099557};
                byte[] bArr2 = $$j;
                byte b2 = bArr2[10];
                byte b3 = (byte) (b2 - 1);
                Object[] objArr17 = new Object[1];
                i(b3, b3, b2, objArr17);
                Class<?> cls4 = Class.forName((String) objArr17[0]);
                byte b4 = bArr2[10];
                byte b5 = (byte) (b4 - 1);
                byte b6 = b4;
                Object[] objArr18 = new Object[1];
                i(b5, b6, (byte) (b6 - 1), objArr18);
                objArr = (Object[]) cls4.getMethod((String) objArr18[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr16);
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault4 == null) {
                    int absoluteGravity = 2405 - Gravity.getAbsoluteGravity(0, 0);
                    int iGreen = 26 - Color.green(0);
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                    byte[] bArr3 = $$d;
                    byte b7 = bArr3[22];
                    Object[] objArr19 = new Object[1];
                    h(b7, (byte) (b7 | 85), (byte) (-bArr3[8]), objArr19);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(absoluteGravity, iGreen, cIndexOf, 24929979, false, (String) objArr19[0], null);
                }
                ((Field) objCopydefault4).set(null, objArr);
                try {
                    Object[] objArr20 = new Object[1];
                    f(ExpandableListView.getPackedPositionType(0L) + 22, new char[]{CharUtils.CR, '/', AbstractJsonLexerKt.COMMA, 17, 19, 22, AbstractJsonLexerKt.COMMA, 24, 22, '+', 24, 22, 1, Typography.amp, ' ', 2, CharUtils.CR, 29, 19, 16, 0, '/'}, (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29), objArr20);
                    Class<?> cls5 = Class.forName((String) objArr20[0]);
                    Object[] objArr21 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952826_res_0x7f1304ba).substring(7, 8).codePointAt(0) - 17, new char[]{8306, 59937, 18826, 14702, 1911, 1313, 6286, 20031, 63012, 2402, 31666, 26584, 63014, 28372, 48354, 1154}, objArr21);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr21[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault5 == null) {
                        int i4 = 2406 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26;
                        char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                        Object[] objArr22 = new Object[1];
                        h((byte) ($$e - 3), (byte) 84, $$d[38], objArr22);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i4, keyRepeatDelay, offsetAfter, -1843538389, false, (String) objArr22[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault6 == null) {
                        int iRgb2 = (-16774811) - Color.rgb(0, 0, 0);
                        int iMakeMeasureSpec2 = 26 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        byte[] bArr4 = $$d;
                        Object[] objArr23 = new Object[1];
                        h(bArr4[22], (byte) 96, bArr4[33], objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iRgb2, iMakeMeasureSpec2, cKeyCodeFromString, -2047739879, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 == null) {
                    throw th3;
                }
                throw cause2;
            }
        } else {
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault7 == null) {
                int i5 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2405;
                int minimumFlingVelocity = 26 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                char gidForName = (char) ((-1) - Process.getGidForName(""));
                byte[] bArr5 = $$d;
                byte b8 = bArr5[22];
                Object[] objArr24 = new Object[1];
                h(b8, (byte) (b8 | 85), (byte) (-bArr5[8]), objArr24);
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(i5, minimumFlingVelocity, gidForName, 24929979, false, (String) objArr24[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault7).get(null);
        }
        int i6 = ((int[]) objArr[0])[0];
        int i7 = ((int[]) objArr[2])[0];
        if (i7 != i6) {
            long j = -1;
            long j2 = ((long) (i7 ^ i6)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6617, 'Z' - AndroidCharacter.getMirror('0'), (char) ('0' - AndroidCharacter.getMirror('0')), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            int i8 = component4 + 125;
            copy = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr25 = {-1431983112, Long.valueOf(j4), arrayList, null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6562, 56 - Color.green(0), (char) View.resolveSize(0, 0));
                byte b9 = $$j[10];
                byte b10 = (byte) (b9 - 1);
                byte b11 = b9;
                Object[] objArr26 = new Object[1];
                i(b10, b11, (byte) (b11 - 1), objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th4) {
                Throwable cause3 = th4.getCause();
                if (cause3 == null) {
                    throw th4;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        ((ActivityResetPinWarningBinding) this.binding).btnNext.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final void onClick(View view) {
                int i10 = 2 % 2;
                int i11 = component1 + 5;
                component3 = i11 % 128;
                int i12 = i11 % 2;
                ResetPinWarningActivity.$r8$lambda$IP7uBMwiwjWtqarip4GoQgvGvkc(this.f$0, view);
                int i13 = component1 + 117;
                component3 = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 84 / 0;
                }
            }
        });
    }

    private static void f(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        char c2;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr3 = component1;
        long j = 0;
        if (cArr3 != null) {
            int i4 = $11 + 111;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 53;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7423 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 15 - View.resolveSizeAndState(0, 0, 0), (char) (ExpandableListView.getPackedPositionGroup(j) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i5])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                        if (objCopydefault2 == null) {
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 7422, Color.green(0) + 15, (char) (64291 - View.resolveSize(0, 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        i5++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                j = 0;
            }
            int i7 = $10 + 61;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(component2)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        char c3 = '\b';
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7422 - (ViewConfiguration.getWindowTouchSlop() >> 8), 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i9 = $11 + 113;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i11 = $10 + 49;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    c2 = c3;
                } else {
                    Object[] objArr5 = new Object[13];
                    objArr5[12] = cancelall;
                    objArr5[11] = Integer.valueOf(cCharValue);
                    objArr5[10] = cancelall;
                    objArr5[9] = cancelall;
                    objArr5[c3] = Integer.valueOf(cCharValue);
                    objArr5[7] = cancelall;
                    objArr5[6] = cancelall;
                    objArr5[5] = Integer.valueOf(cCharValue);
                    objArr5[4] = cancelall;
                    objArr5[3] = cancelall;
                    objArr5[2] = Integer.valueOf(cCharValue);
                    objArr5[1] = cancelall;
                    objArr5[0] = cancelall;
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault4 == null) {
                        int i13 = 7117 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int iResolveSize = 14 - View.resolveSize(0, 0);
                        char cBlue = (char) (44463 - Color.blue(0));
                        Class[] clsArr = new Class[13];
                        clsArr[0] = Object.class;
                        clsArr[1] = Object.class;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Object.class;
                        clsArr[4] = Object.class;
                        clsArr[5] = Integer.TYPE;
                        clsArr[6] = Object.class;
                        clsArr[7] = Object.class;
                        clsArr[c3] = Integer.TYPE;
                        clsArr[9] = Object.class;
                        clsArr[10] = Object.class;
                        clsArr[11] = Integer.TYPE;
                        clsArr[12] = Object.class;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i13, iResolveSize, cBlue, 1150140696, false, "x", clsArr);
                    }
                    if (((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue() == cancelall.getAsAtTimestamp) {
                        int i14 = $10 + 119;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        Object[] objArr6 = new Object[11];
                        objArr6[10] = cancelall;
                        objArr6[9] = Integer.valueOf(cCharValue);
                        objArr6[c3] = cancelall;
                        objArr6[7] = Integer.valueOf(cCharValue);
                        objArr6[6] = Integer.valueOf(cCharValue);
                        objArr6[5] = cancelall;
                        objArr6[4] = cancelall;
                        objArr6[3] = Integer.valueOf(cCharValue);
                        objArr6[2] = Integer.valueOf(cCharValue);
                        objArr6[1] = cancelall;
                        objArr6[0] = cancelall;
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault5 == null) {
                            int iIndexOf = TextUtils.indexOf("", "", 0) + 2944;
                            int iAxisFromString = MotionEvent.axisFromString("") + 25;
                            char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 27637);
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            String str$$r = $$r(b3, b4, b4);
                            c2 = '\b';
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iAxisFromString, cMakeMeasureSpec, 794909189, false, str$$r, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = c3;
                        }
                        int iIntValue = ((Integer) ((Method) objCopydefault5).invoke(null, objArr6)).intValue();
                        int i16 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr3[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr3[i16];
                    } else {
                        c2 = c3;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i17 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i18 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr3[i17];
                            cArr4[cancelall.component2 + 1] = cArr3[i18];
                        } else {
                            int i19 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i20 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr3[i19];
                            cArr4[cancelall.component2 + 1] = cArr3[i20];
                        }
                    }
                }
                cancelall.component2 += 2;
                c3 = c2;
            }
        }
        for (int i21 = 0; i21 < i; i21++) {
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = copy + 119;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(com.huawei.digitalpayment.consumer.login.R.string.pinmanage_resetpin_title1));
        int i4 = component4 + 87;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = copy + 3;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = com.huawei.digitalpayment.consumer.login.R.layout.activity_reset_pin_warning;
        int i5 = copy + 11;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public void gotoResetPin(View view) {
        int i = 2 % 2;
        ArrayList<? extends Parcelable> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra(Keys.VERIFY_LIST);
        if (CollectionUtils.isNotEmpty(parcelableArrayListExtra)) {
            Intent intent = new Intent(this, (Class<?>) ForgotPinSelectionActivity.class);
            intent.putParcelableArrayListExtra(Keys.VERIFY_LIST, parcelableArrayListExtra);
            intent.putExtra(KeysConstants.KEY_LOGIN_TYPE, getIntent().getStringExtra(KeysConstants.KEY_LOGIN_TYPE));
            if (getIntent().hasExtra("token")) {
                int i2 = copy + 71;
                component4 = i2 % 128;
                if (i2 % 2 != 0) {
                    intent.putExtra("token", getIntent().getStringExtra("token"));
                } else {
                    intent.putExtra("token", getIntent().getStringExtra("token"));
                    throw null;
                }
            }
            startActivity(intent);
        } else {
            RouteUtils.routeWithExecute(this, RoutePathConstants.RESET_PIN_VERIFY);
        }
        finish();
        int i3 = copy + 25;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c4  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinWarningActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00dd  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinWarningActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r45) {
        /*
            Method dump skipped, instruction units count: 14180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinWarningActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$IP7uBMwiwjWtqarip4GoQgvGvkc(ResetPinWarningActivity resetPinWarningActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 53;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        m10781instrumented$0$onCreate$LandroidosBundleV(resetPinWarningActivity, view);
        int i4 = copy + 71;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void m10781instrumented$0$onCreate$LandroidosBundleV(ResetPinWarningActivity resetPinWarningActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 59;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            resetPinWarningActivity.gotoResetPin(view);
            Callback.onClick_exit();
            int i4 = component4 + 23;
            copy = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component4 + 23;
        copy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = component4 + 17;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
