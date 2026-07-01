package com.huawei.digitalpayment.consumer.mpin.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.blankj.utilcode.constant.CacheConstants;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.baselibs2.utils.encrypt.EncryptManager;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.databinding.ActivityBasePinBinding;
import com.huawei.digitalpayment.consumer.baselib.http.HttpStatus;
import com.huawei.digitalpayment.consumer.baselib.service.ICommonService;
import com.huawei.digitalpayment.consumer.baselib.service.ILoginService;
import com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils;
import com.huawei.digitalpayment.consumer.constants.Keys;
import com.huawei.digitalpayment.consumer.login.util.MaximunDialogUtils;
import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ChangePinViewModel;
import com.huawei.digitalpayment.consumer.loginModule.register.request.AuthSensitiveOperationParams;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.mpesa.lifestyle.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;
import org.apache.commons.lang3.CharUtils;

public class ChangePinVerifyOldPinActivity extends Hilt_ChangePinVerifyOldPinActivity<ActivityBasePinBinding, ChangePinViewModel> {
    private static int ShareDataUIState;
    private static int component1;
    private static short[] component2;
    private static byte[] component3;
    private static char[] copy;
    private static int copydefault;
    private static long equals;
    private static int getAsAtTimestamp;
    private static int getShareableDataState;
    private static final byte[] $$c = {Ascii.SI, -57, -42, 5};
    private static final int $$f = 88;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {TarHeader.LF_CHR, -39, 98, -44, -15, -1, 60, -54, -14, 0, 4, -2, -4, -2, TarHeader.LF_NORMAL, -60, -14, 6, -16, Ascii.SO, -16, 65, -65, -6, -8, -3, 8, 1, TarHeader.LF_BLK, -33, -38, -8, -3, 8, 1, Ascii.RS, -49, Ascii.SO, -25, 19, -4, -13, 4, 62, -16, -4, -15, -1, -6, -2, -2, 6, -12, -9, 63, -15, -1, -6, -2, -2, 6, -12, -9, 62, -24, 4, -20, 10, Ascii.RS, -32, -22, Ascii.DLE, 9, 9, -13, -36, Ascii.DLE, -22, Ascii.FF};
    private static final int $$n = 88;
    private static final byte[] $$a = {106, -23, Ascii.FF, -128, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 142;
    private static int toString = 0;
    private static int component4 = 0;
    private static int getRequestBeneficiariesState = 1;
    private boolean verifyOldPin = true;
    private boolean supportForgetPin = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(byte r6, int r7, int r8) {
        /*
            int r8 = 122 - r8
            int r7 = r7 * 3
            int r0 = r7 + 1
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinVerifyOldPinActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinVerifyOldPinActivity.$$i(byte, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinVerifyOldPinActivity.$$a
            int r1 = r7 + 4
            int r8 = 99 - r8
            int r6 = r6 * 2
            int r6 = 103 - r6
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2f
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r6
            r6 = r5
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r3 = r3 + r6
            int r6 = r3 + (-8)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinVerifyOldPinActivity.d(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 16
            int r7 = 99 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinVerifyOldPinActivity.$$m
            int r9 = r9 * 3
            int r9 = 63 - r9
            int r8 = r8 * 3
            int r8 = r8 + 10
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2f
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            int r9 = r9 + 1
            r1[r3] = r5
            if (r4 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2f:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-3)
            r9 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinVerifyOldPinActivity.e(byte, int, short, java.lang.Object[]):void");
    }

    private static void c(char c2, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(copy[i + i4])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.green(0) + 1758, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 34, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 1159210934, false, $$i(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(equals), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 3608, 29 - TextUtils.indexOf("", "", 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 7172), 1951385784, false, $$i(b4, b4, $$c[3]), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 4013, TextUtils.indexOf("", "", 0) + 24, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 27761), -1529629956, false, $$i(b5, b6, b6), new Class[]{Object.class, Object.class});
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
        int i5 = $10 + 79;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (cancelnotification.copydefault < i2) {
            int i7 = $11 + 119;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                try {
                    Object[] objArr5 = {cancelnotification, cancelnotification};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault4 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Color.rgb(0, 0, 0) + 16781229, 24 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (27761 - TextUtils.indexOf("", "")), -1529629956, false, $$i(b7, b8, b8), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                    int i8 = 73 / 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                Object[] objArr6 = {cancelnotification, cancelnotification};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault5 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(4013 - View.combineMeasuredStates(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 24, (char) (27761 - Gravity.getAbsoluteGravity(0, 0)), -1529629956, false, $$i(b9, b10, b10), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(char[] r23, int r24, boolean r25, int r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinVerifyOldPinActivity.b(char[], int, boolean, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a A[PHI: r4
  0x009a: PHI (r4v10 byte[] A[IMMUTABLE_TYPE]) = (r4v9 byte[]), (r4v20 byte[]) binds: [B:22:0x0098, B:19:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(int r26, int r27, short r28, byte r29, int r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinVerifyOldPinActivity.f(int, int, short, byte, int, java.lang.Object[]):void");
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        char c2;
        int i = 2 % 2;
        Object obj = null;
        Object[] objArr2 = new Object[1];
        b(new char[]{16, 16, 2, 0, '\f', 15, 65517, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534}, 19 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), true, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952793_res_0x7f130499).substring(6, 7).codePointAt(0) - 14, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952721_res_0x7f130451).substring(6, 7).length() + 182, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        b(new char[]{17, 5, 65532, 1, 65517}, 2 - ExpandableListView.getPackedPositionGroup(0L), true, 5 - (Process.myTid() >> 22), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952805_res_0x7f1304a5).substring(19, 20).length() + 187, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                b(new char[]{6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, CharUtils.CR, CharUtils.CR, 65534, 65483, 1}, 6 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), true, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 154, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                c((char) (36750 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), ViewConfiguration.getWindowTouchSlop() >> 8, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i2 = getRequestBeneficiariesState + 13;
                component4 = i2 % 128;
                if (i2 % 2 != 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i3 = component4 + 83;
                getRequestBeneficiariesState = i3 % 128;
                int i4 = i3 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 6618, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 42, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b(new char[]{65516, 65522, 65522, 65519, 28, 65513, 30, 28, 65520, 65519, 31, 65514, 65522, JSONLexer.EOI, 27, 65517, 65520, 65517, 65518, 65513, 65517, 65519, JSONLexer.EOI, 28, 65522, 65515, 65514, 65513, JSONLexer.EOI, 30, 31, 31, JSONLexer.EOI, 27, 65517, 31, 65521, 65517, 30, 65519, 65516, JSONLexer.EOI, 65518, 65518, 65514, 27, 65519, 30}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(14) - 95, true, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952812_res_0x7f1304ac).substring(55, 56).length() + 47, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952719_res_0x7f13044f).substring(6, 7).length() + 154, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b(new char[]{'\"', 65524, 65523, 30, 29, 65518, ' ', 65517, 65521, 65521, '\"', 65517, 65525, 65524, 31, 31, 65517, ' ', '!', 30, 31, 65524, 65516, 30, 65522, 65524, 65522, 65519, ' ', 31, 65524, 65519, 65516, '\"', 65516, 30, 65524, 65516, 65519, 31, 31, 65522, 65525, 65520, 65517, '\"', 65518, 31, 31, 65520, 65516, 65517, 65519, ' ', 65518, 65525, 65522, 65525, 65519, 65524, 65525, 65519, 65522, 65524}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 26, true, (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer._2131427364_res_0x7f0b0024) & (-3)) + 63, 152 - (Process.myPid() >> 22), objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    c((char) Color.blue(0), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952781_res_0x7f13048d).substring(14, 15).length() + 63, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b(new char[]{65494, '\n', 11, 65503, 65500, 65498, 65498, 65502, 65497, 65501, 65500, 14, 65499, 65503, 65504, 65501, 65502, 65495, 65495, 65506, 27, 24, 28, 28, 16, 27, 28, 22, CharUtils.CR, 30, CharUtils.CR, 65495, 65498, 30, 65495, 28, 27, CharUtils.CR, 15, 22, 17, 65495, 17, 24, '\t', 65495, 21, 23, 11, 65494, CharUtils.CR, JSONLexer.EOI, '\t', 29, 25, 27, '\f', JSONLexer.EOI, '\t', 29, 15, 65494, 28, 27, '\t', 11, 28, '\t', CharUtils.CR, JSONLexer.EOI, 16, 28}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952717_res_0x7f13044d).substring(6, 7).codePointAt(0) - 7, true, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954659_res_0x7f130be3).substring(6, 9).length() + 69, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952767_res_0x7f13047f).substring(12, 13).codePointAt(0) + 140, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b(new char[]{7, 1, 65532, 2, 65535, 65532}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 28, true, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952832_res_0x7f1304c0).substring(0, 1).codePointAt(0) - 31, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952847_res_0x7f1304cf).substring(21, 22).length() + 133, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    b(new char[]{65520, 65527, 65528, 65528, 65529, 65520, '$', 65527, 65523, '%', 65520, 65529, '(', 65527, '(', 65531, 65527, 65532, 65529, '$', 65527, 65530, 65523, '\'', 65524, '$', 65529, 65527, 65526, '%', 65529, 65520, 65523, 65523, 65531, 65523}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 76, false, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 35, 145 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 6563, 56 - View.combineMeasuredStates(0, 0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                    int i5 = getRequestBeneficiariesState + 83;
                    component4 = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault3 == null) {
            int i7 = 2406 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 26;
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
            byte[] bArr = $$a;
            byte b2 = bArr[31];
            byte b3 = bArr[33];
            Object[] objArr13 = new Object[1];
            d(b2, b3, (byte) (b3 | 96), objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i7, maximumFlingVelocity, cIndexOf, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            int i8 = getRequestBeneficiariesState + 39;
            component4 = i8 % 128;
            if (i8 % 2 != 0) {
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault4 == null) {
                    int keyRepeatTimeout = 2405 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int iLastIndexOf = 25 - TextUtils.lastIndexOf("", '0', 0, 0);
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    byte[] bArr2 = $$a;
                    Object[] objArr14 = new Object[1];
                    d(bArr2[31], bArr2[8], (byte) 93, objArr14);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, iLastIndexOf, longPressTimeout, 24929979, false, (String) objArr14[0], null);
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault5 == null) {
                int iRgb = Color.rgb(0, 0, 0) + 16779621;
                int iRgb2 = Color.rgb(0, 0, 0) + 16777242;
                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                byte[] bArr3 = $$a;
                Object[] objArr15 = new Object[1];
                d(bArr3[31], bArr3[8], (byte) 93, objArr15);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iRgb, iRgb2, scrollBarSize, 24929979, false, (String) objArr15[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault5).get(null);
            c2 = 2;
        } else {
            Object[] objArr16 = new Object[1];
            b(new char[]{'\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5}, 8 - TextUtils.indexOf("", ""), true, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 93, 182 - KeyEvent.keyCodeFromString(""), objArr16);
            Class<?> cls3 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            c((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952716_res_0x7f13044c).substring(6, 7).codePointAt(0) - 32), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952826_res_0x7f1304ba).substring(7, 8).codePointAt(0) + 50, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 93, objArr17);
            try {
                Object[] objArr18 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue()), 0, -1440830873};
                byte[] bArr4 = $$m;
                byte b4 = bArr4[9];
                Object[] objArr19 = new Object[1];
                e(b4, (byte) (b4 | Ascii.VT), (byte) (-bArr4[66]), objArr19);
                Class<?> cls4 = Class.forName((String) objArr19[0]);
                byte b5 = bArr4[9];
                Object[] objArr20 = new Object[1];
                e(b5, b5, bArr4[17], objArr20);
                objArr = (Object[]) cls4.getMethod((String) objArr20[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr18);
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault6 == null) {
                    int maximumFlingVelocity2 = 2405 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int mirror = 'J' - AndroidCharacter.getMirror('0');
                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte[] bArr5 = $$a;
                    Object[] objArr21 = new Object[1];
                    d(bArr5[31], bArr5[8], (byte) 93, objArr21);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(maximumFlingVelocity2, mirror, minimumFlingVelocity, 24929979, false, (String) objArr21[0], null);
                }
                ((Field) objCopydefault6).set(null, objArr);
                try {
                    Object[] objArr22 = new Object[1];
                    b(new char[]{2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n'}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 13, true, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131953980_res_0x7f13093c).substring(0, 4).codePointAt(2) + 147, objArr22);
                    Class<?> cls5 = Class.forName((String) objArr22[0]);
                    Object[] objArr23 = new Object[1];
                    c((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131953980_res_0x7f13093c).substring(0, 4).codePointAt(1) + 49, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131953980_res_0x7f13093c).substring(0, 4).codePointAt(2) - 21, objArr23);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr23[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault7 == null) {
                        int iMyPid = 2405 - (Process.myPid() >> 22);
                        int iMakeMeasureSpec = 26 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        Object[] objArr24 = new Object[1];
                        d(r10[33], (byte) (-$$a[38]), (byte) 84, objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(iMyPid, iMakeMeasureSpec, maximumDrawingCacheSize, -1843538389, false, (String) objArr24[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault8 == null) {
                        int i9 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2404;
                        int iLastIndexOf2 = 25 - TextUtils.lastIndexOf("", '0');
                        char cGreen = (char) Color.green(0);
                        byte[] bArr6 = $$a;
                        byte b6 = bArr6[31];
                        byte b7 = bArr6[33];
                        Object[] objArr25 = new Object[1];
                        d(b6, b7, (byte) (b7 | 96), objArr25);
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(i9, iLastIndexOf2, cGreen, -2047739879, false, (String) objArr25[0], null);
                    }
                    ((Field) objCopydefault8).set(null, lValueOf2);
                    int i10 = getRequestBeneficiariesState + 75;
                    int i11 = i10 % 128;
                    component4 = i11;
                    c2 = 2;
                    int i12 = i10 % 2;
                    int i13 = i11 + 5;
                    getRequestBeneficiariesState = i13 % 128;
                    int i14 = i13 % 2;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i15 = ((int[]) objArr[0])[0];
        int i16 = ((int[]) objArr[c2])[0];
        if (i16 != i15) {
            long j = -1;
            long j2 = ((long) (i16 ^ i15)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault9 == null) {
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6618, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 42, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault9).invoke(null, null);
            try {
                Object[] objArr26 = {-298097296, Long.valueOf(j4), new ArrayList(), null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6563 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 56 - View.combineMeasuredStates(0, 0), (char) TextUtils.indexOf("", ""));
                byte[] bArr7 = $$m;
                byte b8 = bArr7[9];
                Object[] objArr27 = new Object[1];
                e(b8, b8, (byte) (-bArr7[25]), objArr27);
                cls6.getMethod((String) objArr27[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr26);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        this.supportForgetPin = getIntent().getBooleanExtra(KeysConstants.KEY_SUPPORT_FORGET_PIN, this.supportForgetPin);
        super.onCreate(bundle);
        this.verifyOldPin = getIntent().getBooleanExtra(Keys.VERIFY_OLD_PIN, true);
        observe();
    }

    private void observe() {
        int i = 2 % 2;
        ((ChangePinViewModel) this.viewModel).getData().observe(this, new Observer() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 5;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                ChangePinVerifyOldPinActivity.m10753$r8$lambda$pgkdYInIpwPkhlgaDdlr1eQly4(this.f$0, (Resource) obj);
                int i5 = ShareDataUIState + 91;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component4 + 53;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void lambda$observe$0(Resource resource) {
        int i = 2 % 2;
        if (resource.loading()) {
            DialogManager.showLoading(this);
            return;
        }
        DialogManager.hideLoading(this);
        if (!resource.error()) {
            if (resource.success()) {
                int i2 = getRequestBeneficiariesState + 43;
                component4 = i2 % 128;
                int i3 = i2 % 2;
                gotoNext();
                return;
            }
            return;
        }
        int i4 = component4 + 45;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
            if (((ICommonService) RouteUtils.getService(ICommonService.class)).dealError(this, resource.getException())) {
                return;
            }
        } else if (((ICommonService) RouteUtils.getService(ICommonService.class)).dealError(this, resource.getException())) {
            return;
        }
        ((ActivityBasePinBinding) this.binding).etCode.showError(resource.getMessage());
        ((ActivityBasePinBinding) this.binding).etCode.clear();
        if (HttpStatus.CONSUMER_PIN_ERROR_MAXIMUM.equals(resource.getException().getResponseCode())) {
            MaximunDialogUtils.INSTANCE.showMaximunDialog(this, this.supportForgetPin);
        }
    }

    private void gotoNext() {
        int i = 2 % 2;
        Bundle bundle = new Bundle(2);
        bundle.putString("oldPin", EncryptManager.INSTANCE.encrypt(((ActivityBasePinBinding) this.binding).etCode.getText().toString()));
        if (getIntent().hasExtra(Keys.VERIFY_TYPE)) {
            int i2 = component4 + 109;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            bundle.putParcelable(Keys.VERIFY_TYPE, getIntent().getParcelableExtra(Keys.VERIFY_TYPE));
        }
        if (!(!getIntent().hasExtra("token"))) {
            int i4 = getRequestBeneficiariesState + 3;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            bundle.putString("token", getIntent().getStringExtra("token"));
        }
        bundle.putBoolean(KeysConstants.KEY_SUPPORT_FORGET_PIN, this.supportForgetPin);
        RouteUtils.routeWithExecute(RoutePathConstants.CHANGE_PIN_CREATION, bundle);
    }

    @Override
    public void onForgetClick() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 65;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        ((ILoginService) RouteUtils.getService(ILoginService.class)).resetPin(null);
        int i4 = component4 + 111;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onConfirmClick(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 109;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        if (!this.verifyOldPin) {
            gotoNext();
            return;
        }
        ((ChangePinViewModel) this.viewModel).authSensitiveOperation(new AuthSensitiveOperationParams(EncryptUtils.encryptWithPinKey(str)));
        int i4 = component4 + 69;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038 A[PHI: r1 r3
  0x0038: PHI (r1v11 java.lang.String) = (r1v5 java.lang.String), (r1v13 java.lang.String) binds: [B:8:0x0033, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0038: PHI (r3v4 java.lang.String) = (r3v1 java.lang.String), (r3v6 java.lang.String) binds: [B:8:0x0033, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[PHI: r1 r3
  0x0035: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v13 java.lang.String) binds: [B:8:0x0033, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v6 java.lang.String) binds: [B:8:0x0033, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.digitalpayment.consumer.baselib.pin.model.PinType getPinType() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinVerifyOldPinActivity.component4
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinVerifyOldPinActivity.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 != 0) goto L25
            int r1 = com.huawei.digitalpayment.consumer.login.R.string.pinmanage_changepin_title1
            java.lang.String r1 = r6.getString(r1)
            int r3 = com.huawei.digitalpayment.consumer.login.R.string.pinmanage_changepin_tips1
            java.lang.String r3 = r6.getString(r3)
            boolean r4 = r6.supportForgetPin
            r5 = 64
            int r5 = r5 / 0
            r2 = r2 ^ r4
            if (r2 == 0) goto L38
            goto L35
        L25:
            int r1 = com.huawei.digitalpayment.consumer.login.R.string.pinmanage_changepin_title1
            java.lang.String r1 = r6.getString(r1)
            int r3 = com.huawei.digitalpayment.consumer.login.R.string.pinmanage_changepin_tips1
            java.lang.String r3 = r6.getString(r3)
            boolean r4 = r6.supportForgetPin
            if (r4 == r2) goto L38
        L35:
            java.lang.String r2 = ""
            goto L3e
        L38:
            int r2 = com.huawei.digitalpayment.consumer.login.R.string.pinmanage_changepin_forget_pin
            java.lang.String r2 = r6.getString(r2)
        L3e:
            int r4 = com.huawei.digitalpayment.consumer.login.R.string.pinmanage_changepin_button1
            com.huawei.digitalpayment.consumer.baselib.pin.model.PinType r5 = new com.huawei.digitalpayment.consumer.baselib.pin.model.PinType
            java.lang.String r4 = r6.getString(r4)
            r5.<init>(r1, r3, r2, r4)
            int r1 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinVerifyOldPinActivity.component4
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinVerifyOldPinActivity.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L58
            r0 = 8
            int r0 = r0 / 0
        L58:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinVerifyOldPinActivity.getPinType():com.huawei.digitalpayment.consumer.baselib.pin.model.PinType");
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = component4 + 51;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(new char[]{6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, CharUtils.CR, CharUtils.CR, 65534, 65483, 1}, 6 - View.MeasureSpec.makeMeasureSpec(0, 0), true, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952856_res_0x7f1304d8).substring(9, 10).length() + 25, 183 - TextUtils.getOffsetAfter("", 0), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            c((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954889_res_0x7f130cc9).substring(0, 1).length() + 36750), (Process.getThreadPriority(0) + 20) >> 6, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 93, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i4 = getRequestBeneficiariesState + 75;
                component4 = i4 % 128;
                int i5 = i4 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 6618, 43 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 6562, View.MeasureSpec.getMode(0) + 56, (char) (Process.myPid() >> 22), -699576857, false, "component2", new Class[]{Context.class});
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
        super.onResume();
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 9;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = getRequestBeneficiariesState + 5;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            b(new char[]{6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, CharUtils.CR, CharUtils.CR, 65534, 65483, 1}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952812_res_0x7f1304ac).substring(55, 56).length() + 5, true, View.resolveSize(0, 0) + 26, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 154, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            c((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(26) + 36630), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, 18 - View.getDefaultSize(0, 0), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6617, KeyEvent.getDeadChar(0, 0) + 42, (char) (KeyEvent.getMaxKeyCode() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6561, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 56, (char) (ViewConfiguration.getScrollBarSize() >> 8), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i6 = component4 + 87;
                getRequestBeneficiariesState = i6 % 128;
                int i7 = i6 % 2;
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

    /* JADX WARN: Can't wrap try/catch for region: R(57:(55:900|37|38|(1:45)(2:41|(2:43|(0)(1:46))(2:47|48))|84|929|85|(2:880|87)|92|93|922|(5:95|96|(1:98)|99|100)(25:101|102|923|103|104|920|105|(2:840|107)|111|112|916|113|(2:871|115)|119|120|121|(3:123|946|124)|128|129|912|130|(3:132|850|133)(1:135)|136|(1:138)|139)|140|(4:143|(2:145|(2:152|950)(11:153|(3:155|(3:158|159|156)|951)|160|896|161|(1:163)|164|165|886|166|949))(2:150|(0)(0))|167|141)|948|179|213|844|214|(2:919|216)|220|221|941|(5:223|224|(1:226)|227|228)(16:230|231|944|232|(2:908|234)|238|239|240|(2:242|243)|244|245|246|(1:248)(1:249)|250|(1:252)|253)|229|254|(9:257|933|258|(1:260)|261|262|263|925|264)|265|299|910|300|(10:918|302|307|308|907|(5:310|311|(1:313)|314|315)(22:316|317|892|318|(3:320|884|321)|325|326|878|327|(2:901|329)|333|334|335|(2:337|338)|339|340|874|341|(3:343|888|344)(1:346)|347|(2:349|350)|351)|352|(4:355|(2:357|954)(11:358|(3:360|(3:363|364|361)|955)|367|864|368|(1:370)|371|372|848|373|953)|374|353)|952|386)(8:307|308|907|(0)(0)|352|(1:353)|952|386)|418|890|419|(2:905|421)|425|(1:427)|428|429|866|(4:431|432|(1:434)|435)(13:436|(2:438|(1:444)(1:443))(1:446)|(18:448|876|449|(3:451|942|452)|456|457|869|458|(2:882|460)|464|465|466|(2:468|469)|470|(2:472|473)(1:475)|476|(1:478)|479)|526|541|(1:543)|544|(1:546)|547|(3:549|(1:551)|552)(16:554|555|(1:557)|558|(1:560)|561|562|(1:564)|565|858|566|567|(1:569)|570|(1:572)|573)|553|574|(6:576|(1:578)|579|(3:581|(1:583)|584)(14:585|586|(1:588)|589|590|(1:592)|593|842|594|595|(1:597)|598|(1:600)|601)|602|(25:604|873|605|(1:607)|608|(1:610)|611|(3:613|(1:615)|616)(17:617|(2:619|(1:625)(1:624))|(19:627|628|860|629|(1:631)|632|633|846|634|(1:636)|637|638|639|(1:641)|642|(1:644)|645|(1:647)|648)|703|(1:705)|706|(3:708|(1:710)|711)(13:713|894|714|715|(1:717)|718|931|719|720|(1:722)|723|(1:725)|726)|712|727|(6:730|731|(1:733)|734|735|736)|737|(1:739)|740|(2:742|(3:744|(1:746)|747)(3:748|(1:750)|751))(14:753|754|(1:756)|757|758|(1:760)|761|937|762|763|(1:765)|766|(1:768)|769)|752|770|(1:969)(7:773|774|(1:776)|777|778|779|780))|649|(4:652|(3:962|654|965)(12:961|655|(3:657|(3:660|661|658)|966)|662|835|663|(1:665)|666|667|939|668|964)|963|650)|960|703|(0)|706|(0)(0)|712|727|(0)|737|(0)|740|(0)(0)|752|770|(0)(0))(10:790|(3:792|(2:795|793)|967)|796|797|(1:799)|800|(1:802)|803|804|805))(10:808|(3:810|(2:813|811)|968)|814|815|(1:817)|818|(1:820)|821|822|823))|480|(4:483|(2:485|958)(11:486|(3:488|(3:491|492|489)|959)|493|852|494|(1:496)|497|498|838|499|957)|500|481)|956|526|541|(0)|544|(0)|547|(0)(0)|553|574|(0)(0))(1:51)|854|57|(1:59)|60|61|84|929|85|(0)|92|93|922|(0)(0)|140|(1:141)|948|179|213|844|214|(0)|220|221|941|(0)(0)|229|254|(0)|265|299|910|300|(0)(0)|418|890|419|(0)|425|(0)|428|429|866|(0)(0)|480|(1:481)|956|526|541|(0)|544|(0)|547|(0)(0)|553|574|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(61:(55:900|37|38|(1:45)(2:41|(2:43|(0)(1:46))(2:47|48))|84|929|85|(2:880|87)|92|93|922|(5:95|96|(1:98)|99|100)(25:101|102|923|103|104|920|105|(2:840|107)|111|112|916|113|(2:871|115)|119|120|121|(3:123|946|124)|128|129|912|130|(3:132|850|133)(1:135)|136|(1:138)|139)|140|(4:143|(2:145|(2:152|950)(11:153|(3:155|(3:158|159|156)|951)|160|896|161|(1:163)|164|165|886|166|949))(2:150|(0)(0))|167|141)|948|179|213|844|214|(2:919|216)|220|221|941|(5:223|224|(1:226)|227|228)(16:230|231|944|232|(2:908|234)|238|239|240|(2:242|243)|244|245|246|(1:248)(1:249)|250|(1:252)|253)|229|254|(9:257|933|258|(1:260)|261|262|263|925|264)|265|299|910|300|(10:918|302|307|308|907|(5:310|311|(1:313)|314|315)(22:316|317|892|318|(3:320|884|321)|325|326|878|327|(2:901|329)|333|334|335|(2:337|338)|339|340|874|341|(3:343|888|344)(1:346)|347|(2:349|350)|351)|352|(4:355|(2:357|954)(11:358|(3:360|(3:363|364|361)|955)|367|864|368|(1:370)|371|372|848|373|953)|374|353)|952|386)(8:307|308|907|(0)(0)|352|(1:353)|952|386)|418|890|419|(2:905|421)|425|(1:427)|428|429|866|(4:431|432|(1:434)|435)(13:436|(2:438|(1:444)(1:443))(1:446)|(18:448|876|449|(3:451|942|452)|456|457|869|458|(2:882|460)|464|465|466|(2:468|469)|470|(2:472|473)(1:475)|476|(1:478)|479)|526|541|(1:543)|544|(1:546)|547|(3:549|(1:551)|552)(16:554|555|(1:557)|558|(1:560)|561|562|(1:564)|565|858|566|567|(1:569)|570|(1:572)|573)|553|574|(6:576|(1:578)|579|(3:581|(1:583)|584)(14:585|586|(1:588)|589|590|(1:592)|593|842|594|595|(1:597)|598|(1:600)|601)|602|(25:604|873|605|(1:607)|608|(1:610)|611|(3:613|(1:615)|616)(17:617|(2:619|(1:625)(1:624))|(19:627|628|860|629|(1:631)|632|633|846|634|(1:636)|637|638|639|(1:641)|642|(1:644)|645|(1:647)|648)|703|(1:705)|706|(3:708|(1:710)|711)(13:713|894|714|715|(1:717)|718|931|719|720|(1:722)|723|(1:725)|726)|712|727|(6:730|731|(1:733)|734|735|736)|737|(1:739)|740|(2:742|(3:744|(1:746)|747)(3:748|(1:750)|751))(14:753|754|(1:756)|757|758|(1:760)|761|937|762|763|(1:765)|766|(1:768)|769)|752|770|(1:969)(7:773|774|(1:776)|777|778|779|780))|649|(4:652|(3:962|654|965)(12:961|655|(3:657|(3:660|661|658)|966)|662|835|663|(1:665)|666|667|939|668|964)|963|650)|960|703|(0)|706|(0)(0)|712|727|(0)|737|(0)|740|(0)(0)|752|770|(0)(0))(10:790|(3:792|(2:795|793)|967)|796|797|(1:799)|800|(1:802)|803|804|805))(10:808|(3:810|(2:813|811)|968)|814|815|(1:817)|818|(1:820)|821|822|823))|480|(4:483|(2:485|958)(11:486|(3:488|(3:491|492|489)|959)|493|852|494|(1:496)|497|498|838|499|957)|500|481)|956|526|541|(0)|544|(0)|547|(0)(0)|553|574|(0)(0))(1:51)|867|53|(1:55)|56|854|57|(1:59)|60|61|84|929|85|(0)|92|93|922|(0)(0)|140|(1:141)|948|179|213|844|214|(0)|220|221|941|(0)(0)|229|254|(0)|265|299|910|300|(0)(0)|418|890|419|(0)|425|(0)|428|429|866|(0)(0)|480|(1:481)|956|526|541|(0)|544|(0)|547|(0)(0)|553|574|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(67:0|2|(2:(2:9|(2:11|(2:13|(1:19)(1:16))(2:17|18))(0))(1:20)|(9:22|837|23|(1:25)|26|27|28|(1:30)|31)(1:7))(0)|35|(55:900|37|38|(1:45)(2:41|(2:43|(0)(1:46))(2:47|48))|84|929|85|(2:880|87)|92|93|922|(5:95|96|(1:98)|99|100)(25:101|102|923|103|104|920|105|(2:840|107)|111|112|916|113|(2:871|115)|119|120|121|(3:123|946|124)|128|129|912|130|(3:132|850|133)(1:135)|136|(1:138)|139)|140|(4:143|(2:145|(2:152|950)(11:153|(3:155|(3:158|159|156)|951)|160|896|161|(1:163)|164|165|886|166|949))(2:150|(0)(0))|167|141)|948|179|213|844|214|(2:919|216)|220|221|941|(5:223|224|(1:226)|227|228)(16:230|231|944|232|(2:908|234)|238|239|240|(2:242|243)|244|245|246|(1:248)(1:249)|250|(1:252)|253)|229|254|(9:257|933|258|(1:260)|261|262|263|925|264)|265|299|910|300|(10:918|302|307|308|907|(5:310|311|(1:313)|314|315)(22:316|317|892|318|(3:320|884|321)|325|326|878|327|(2:901|329)|333|334|335|(2:337|338)|339|340|874|341|(3:343|888|344)(1:346)|347|(2:349|350)|351)|352|(4:355|(2:357|954)(11:358|(3:360|(3:363|364|361)|955)|367|864|368|(1:370)|371|372|848|373|953)|374|353)|952|386)(8:307|308|907|(0)(0)|352|(1:353)|952|386)|418|890|419|(2:905|421)|425|(1:427)|428|429|866|(4:431|432|(1:434)|435)(13:436|(2:438|(1:444)(1:443))(1:446)|(18:448|876|449|(3:451|942|452)|456|457|869|458|(2:882|460)|464|465|466|(2:468|469)|470|(2:472|473)(1:475)|476|(1:478)|479)|526|541|(1:543)|544|(1:546)|547|(3:549|(1:551)|552)(16:554|555|(1:557)|558|(1:560)|561|562|(1:564)|565|858|566|567|(1:569)|570|(1:572)|573)|553|574|(6:576|(1:578)|579|(3:581|(1:583)|584)(14:585|586|(1:588)|589|590|(1:592)|593|842|594|595|(1:597)|598|(1:600)|601)|602|(25:604|873|605|(1:607)|608|(1:610)|611|(3:613|(1:615)|616)(17:617|(2:619|(1:625)(1:624))|(19:627|628|860|629|(1:631)|632|633|846|634|(1:636)|637|638|639|(1:641)|642|(1:644)|645|(1:647)|648)|703|(1:705)|706|(3:708|(1:710)|711)(13:713|894|714|715|(1:717)|718|931|719|720|(1:722)|723|(1:725)|726)|712|727|(6:730|731|(1:733)|734|735|736)|737|(1:739)|740|(2:742|(3:744|(1:746)|747)(3:748|(1:750)|751))(14:753|754|(1:756)|757|758|(1:760)|761|937|762|763|(1:765)|766|(1:768)|769)|752|770|(1:969)(7:773|774|(1:776)|777|778|779|780))|649|(4:652|(3:962|654|965)(12:961|655|(3:657|(3:660|661|658)|966)|662|835|663|(1:665)|666|667|939|668|964)|963|650)|960|703|(0)|706|(0)(0)|712|727|(0)|737|(0)|740|(0)(0)|752|770|(0)(0))(10:790|(3:792|(2:795|793)|967)|796|797|(1:799)|800|(1:802)|803|804|805))(10:808|(3:810|(2:813|811)|968)|814|815|(1:817)|818|(1:820)|821|822|823))|480|(4:483|(2:485|958)(11:486|(3:488|(3:491|492|489)|959)|493|852|494|(1:496)|497|498|838|499|957)|500|481)|956|526|541|(0)|544|(0)|547|(0)(0)|553|574|(0)(0))(1:51)|52|867|53|(1:55)|56|854|57|(1:59)|60|61|84|929|85|(0)|92|93|922|(0)(0)|140|(1:141)|948|179|213|844|214|(0)|220|221|941|(0)(0)|229|254|(0)|265|299|910|300|(0)(0)|418|890|419|(0)|425|(0)|428|429|866|(0)(0)|480|(1:481)|956|526|541|(0)|544|(0)|547|(0)(0)|553|574|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0c04, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0c09, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0c0a, code lost:
    
        r8 = "currentApplication";
        r4 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x111c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x111d, code lost:
    
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x112a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x112b, code lost:
    
        r7 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x112d, code lost:
    
        r1 = r0;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x16e4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x16e5, code lost:
    
        r7 = r34;
        r10 = com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x1e38, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x1e39, code lost:
    
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x1e53, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x1e54, code lost:
    
        r12 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x1e55, code lost:
    
        r1 = r0;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x1f12, code lost:
    
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 42 - android.view.KeyEvent.getDeadChar(0, 0), (char) android.text.TextUtils.indexOf(r11, r11, 0, 0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x083a A[Catch: all -> 0x0c09, TRY_ENTER, TRY_LEAVE, TryCatch #51 {all -> 0x0c09, blocks: (B:85:0x0772, B:92:0x07d0, B:101:0x083a), top: B:929:0x0772 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0a88  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0ac9 A[PHI: r7
  0x0ac9: PHI (r7v177 ??) = (r7v208 ??), (r7v209 ??) binds: [B:151:0x0ac7, B:146:0x0aa9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0ace A[Catch: all -> 0x0be5, PHI: r2 r5 r6
  0x0ace: PHI (r2v839 java.lang.Object[]) = (r2v838 java.lang.Object[]), (r2v860 java.lang.Object[]) binds: [B:151:0x0ac7, B:146:0x0aa9] A[DONT_GENERATE, DONT_INLINE]
  0x0ace: PHI (r5v806 int) = (r5v805 int), (r5v822 int) binds: [B:151:0x0ac7, B:146:0x0aa9] A[DONT_GENERATE, DONT_INLINE]
  0x0ace: PHI (r6v547 int) = (r6v580 int), (r6v581 int) binds: [B:151:0x0ac7, B:146:0x0aa9] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #41 {all -> 0x0be5, blocks: (B:140:0x0a7e, B:141:0x0a82, B:153:0x0ace, B:150:0x0ab3, B:130:0x09b3, B:136:0x0a18, B:139:0x0a76), top: B:912:0x09b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0ceb A[Catch: all -> 0x0521, TryCatch #1 {all -> 0x0521, blocks: (B:207:0x0ce5, B:209:0x0ceb, B:210:0x0d15, B:412:0x17c9, B:414:0x17cf, B:415:0x17fb, B:535:0x1f0c, B:537:0x1f12, B:538:0x1f3a, B:731:0x3559, B:733:0x355f, B:734:0x358d, B:774:0x3906, B:776:0x390c, B:777:0x3934, B:754:0x373a, B:756:0x375d, B:757:0x37b1, B:697:0x2e11, B:699:0x2e17, B:700:0x2e45, B:797:0x3a19, B:799:0x3a1f, B:800:0x3a4c, B:802:0x3a86, B:803:0x3aca, B:586:0x2607, B:588:0x261c, B:589:0x264a, B:815:0x3baa, B:817:0x3bb0, B:818:0x3bdc, B:820:0x3c16, B:821:0x3c62, B:555:0x2194, B:557:0x21a9, B:558:0x21d6, B:560:0x220a, B:561:0x2289, B:293:0x11ee, B:295:0x11f4, B:296:0x121c, B:78:0x06ba, B:80:0x06c0, B:81:0x06eb, B:23:0x02ab, B:25:0x02b1, B:26:0x02d5, B:28:0x0495, B:30:0x04c7, B:31:0x051b, B:605:0x2895, B:607:0x289b, B:608:0x28de, B:610:0x2905, B:611:0x294a, B:613:0x2960, B:615:0x2969, B:616:0x29ad, B:649:0x2bfa, B:650:0x2bfe, B:652:0x2c04, B:655:0x2c1c, B:658:0x2c33, B:660:0x2c36, B:672:0x2d19, B:674:0x2d1f, B:675:0x2d20, B:677:0x2d22, B:679:0x2d29, B:680:0x2d2a, B:619:0x29bc, B:621:0x29c0, B:625:0x29cc, B:627:0x29d2, B:639:0x2ae2, B:641:0x2ae8, B:642:0x2b27, B:644:0x2b51, B:645:0x2b95, B:647:0x2bab, B:648:0x2bf4, B:682:0x2d2c, B:684:0x2d33, B:685:0x2d34, B:687:0x2d36, B:689:0x2d3d, B:690:0x2d3e, B:37:0x052d, B:43:0x0540, B:64:0x0630, B:66:0x0636, B:67:0x0637, B:69:0x0639, B:71:0x0640, B:72:0x0641, B:47:0x0550, B:48:0x0557, B:45:0x0549), top: B:837:0x02ab, inners: #20, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0e04  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0e62 A[Catch: all -> 0x112a, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x112a, blocks: (B:214:0x0da5, B:220:0x0df7, B:230:0x0e62, B:240:0x0ef6, B:244:0x0f3b), top: B:844:0x0da5 }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x1026  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x11f4 A[Catch: all -> 0x0521, TryCatch #1 {all -> 0x0521, blocks: (B:207:0x0ce5, B:209:0x0ceb, B:210:0x0d15, B:412:0x17c9, B:414:0x17cf, B:415:0x17fb, B:535:0x1f0c, B:537:0x1f12, B:538:0x1f3a, B:731:0x3559, B:733:0x355f, B:734:0x358d, B:774:0x3906, B:776:0x390c, B:777:0x3934, B:754:0x373a, B:756:0x375d, B:757:0x37b1, B:697:0x2e11, B:699:0x2e17, B:700:0x2e45, B:797:0x3a19, B:799:0x3a1f, B:800:0x3a4c, B:802:0x3a86, B:803:0x3aca, B:586:0x2607, B:588:0x261c, B:589:0x264a, B:815:0x3baa, B:817:0x3bb0, B:818:0x3bdc, B:820:0x3c16, B:821:0x3c62, B:555:0x2194, B:557:0x21a9, B:558:0x21d6, B:560:0x220a, B:561:0x2289, B:293:0x11ee, B:295:0x11f4, B:296:0x121c, B:78:0x06ba, B:80:0x06c0, B:81:0x06eb, B:23:0x02ab, B:25:0x02b1, B:26:0x02d5, B:28:0x0495, B:30:0x04c7, B:31:0x051b, B:605:0x2895, B:607:0x289b, B:608:0x28de, B:610:0x2905, B:611:0x294a, B:613:0x2960, B:615:0x2969, B:616:0x29ad, B:649:0x2bfa, B:650:0x2bfe, B:652:0x2c04, B:655:0x2c1c, B:658:0x2c33, B:660:0x2c36, B:672:0x2d19, B:674:0x2d1f, B:675:0x2d20, B:677:0x2d22, B:679:0x2d29, B:680:0x2d2a, B:619:0x29bc, B:621:0x29c0, B:625:0x29cc, B:627:0x29d2, B:639:0x2ae2, B:641:0x2ae8, B:642:0x2b27, B:644:0x2b51, B:645:0x2b95, B:647:0x2bab, B:648:0x2bf4, B:682:0x2d2c, B:684:0x2d33, B:685:0x2d34, B:687:0x2d36, B:689:0x2d3d, B:690:0x2d3e, B:37:0x052d, B:43:0x0540, B:64:0x0630, B:66:0x0636, B:67:0x0637, B:69:0x0639, B:71:0x0640, B:72:0x0641, B:47:0x0550, B:48:0x0557, B:45:0x0549), top: B:837:0x02ab, inners: #20, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x12f7 A[Catch: all -> 0x16e4, PHI: r1 r7
  0x12f7: PHI (r1v672 java.lang.Object) = (r1v665 java.lang.Object), (r1v670 java.lang.Object) binds: [B:301:0x12a4, B:302:0x12a6] A[DONT_GENERATE, DONT_INLINE]
  0x12f7: PHI (r7v116 ??) = (r7v216 ??), (r7v114 ??) binds: [B:301:0x12a4, B:302:0x12a6] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #40 {all -> 0x16e4, blocks: (B:300:0x12a0, B:307:0x12f7, B:316:0x1365, B:335:0x146f, B:339:0x14bd), top: B:910:0x12a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x1304  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x1365 A[Catch: all -> 0x16e4, TRY_ENTER, TRY_LEAVE, TryCatch #40 {all -> 0x16e4, blocks: (B:300:0x12a0, B:307:0x12f7, B:316:0x1365, B:335:0x146f, B:339:0x14bd), top: B:910:0x12a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x159c A[Catch: all -> 0x16c4, TryCatch #21 {all -> 0x16c4, blocks: (B:352:0x1592, B:353:0x1596, B:355:0x159c, B:358:0x15b7, B:341:0x14cc, B:347:0x152f, B:351:0x158a), top: B:874:0x14cc }] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x17cf A[Catch: all -> 0x0521, TryCatch #1 {all -> 0x0521, blocks: (B:207:0x0ce5, B:209:0x0ceb, B:210:0x0d15, B:412:0x17c9, B:414:0x17cf, B:415:0x17fb, B:535:0x1f0c, B:537:0x1f12, B:538:0x1f3a, B:731:0x3559, B:733:0x355f, B:734:0x358d, B:774:0x3906, B:776:0x390c, B:777:0x3934, B:754:0x373a, B:756:0x375d, B:757:0x37b1, B:697:0x2e11, B:699:0x2e17, B:700:0x2e45, B:797:0x3a19, B:799:0x3a1f, B:800:0x3a4c, B:802:0x3a86, B:803:0x3aca, B:586:0x2607, B:588:0x261c, B:589:0x264a, B:815:0x3baa, B:817:0x3bb0, B:818:0x3bdc, B:820:0x3c16, B:821:0x3c62, B:555:0x2194, B:557:0x21a9, B:558:0x21d6, B:560:0x220a, B:561:0x2289, B:293:0x11ee, B:295:0x11f4, B:296:0x121c, B:78:0x06ba, B:80:0x06c0, B:81:0x06eb, B:23:0x02ab, B:25:0x02b1, B:26:0x02d5, B:28:0x0495, B:30:0x04c7, B:31:0x051b, B:605:0x2895, B:607:0x289b, B:608:0x28de, B:610:0x2905, B:611:0x294a, B:613:0x2960, B:615:0x2969, B:616:0x29ad, B:649:0x2bfa, B:650:0x2bfe, B:652:0x2c04, B:655:0x2c1c, B:658:0x2c33, B:660:0x2c36, B:672:0x2d19, B:674:0x2d1f, B:675:0x2d20, B:677:0x2d22, B:679:0x2d29, B:680:0x2d2a, B:619:0x29bc, B:621:0x29c0, B:625:0x29cc, B:627:0x29d2, B:639:0x2ae2, B:641:0x2ae8, B:642:0x2b27, B:644:0x2b51, B:645:0x2b95, B:647:0x2bab, B:648:0x2bf4, B:682:0x2d2c, B:684:0x2d33, B:685:0x2d34, B:687:0x2d36, B:689:0x2d3d, B:690:0x2d3e, B:37:0x052d, B:43:0x0540, B:64:0x0630, B:66:0x0636, B:67:0x0637, B:69:0x0639, B:71:0x0640, B:72:0x0641, B:47:0x0550, B:48:0x0557, B:45:0x0549), top: B:837:0x02ab, inners: #20, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x1909 A[Catch: all -> 0x18dd, TRY_ENTER, TRY_LEAVE, TryCatch #37 {all -> 0x18dd, blocks: (B:421:0x1891, B:427:0x1909, B:432:0x1967, B:434:0x196d, B:435:0x19ae, B:489:0x1d35, B:491:0x1d38, B:438:0x19c1, B:440:0x19c5, B:469:0x1be3, B:473:0x1c51, B:478:0x1cb0, B:444:0x19d1), top: B:905:0x1891 }] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x1964  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x19bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0549 A[Catch: all -> 0x0558, TryCatch #34 {all -> 0x0558, blocks: (B:37:0x052d, B:43:0x0540, B:64:0x0630, B:66:0x0636, B:67:0x0637, B:69:0x0639, B:71:0x0640, B:72:0x0641, B:47:0x0550, B:48:0x0557, B:45:0x0549, B:57:0x05a9, B:59:0x05b6, B:60:0x0625, B:53:0x055e, B:55:0x0573, B:56:0x05a3), top: B:900:0x052d, outer: #1, inners: #10, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:483:0x1d0d A[Catch: all -> 0x1e53, TryCatch #29 {all -> 0x1e53, blocks: (B:419:0x188b, B:425:0x18e2, B:428:0x1950, B:480:0x1d03, B:481:0x1d07, B:483:0x1d0d, B:486:0x1d29, B:448:0x19d9, B:466:0x1bdb, B:470:0x1c26, B:476:0x1c99, B:479:0x1cfd), top: B:890:0x188b }] */
    /* JADX WARN: Removed duplicated region for block: B:537:0x1f12 A[Catch: all -> 0x0521, TryCatch #1 {all -> 0x0521, blocks: (B:207:0x0ce5, B:209:0x0ceb, B:210:0x0d15, B:412:0x17c9, B:414:0x17cf, B:415:0x17fb, B:535:0x1f0c, B:537:0x1f12, B:538:0x1f3a, B:731:0x3559, B:733:0x355f, B:734:0x358d, B:774:0x3906, B:776:0x390c, B:777:0x3934, B:754:0x373a, B:756:0x375d, B:757:0x37b1, B:697:0x2e11, B:699:0x2e17, B:700:0x2e45, B:797:0x3a19, B:799:0x3a1f, B:800:0x3a4c, B:802:0x3a86, B:803:0x3aca, B:586:0x2607, B:588:0x261c, B:589:0x264a, B:815:0x3baa, B:817:0x3bb0, B:818:0x3bdc, B:820:0x3c16, B:821:0x3c62, B:555:0x2194, B:557:0x21a9, B:558:0x21d6, B:560:0x220a, B:561:0x2289, B:293:0x11ee, B:295:0x11f4, B:296:0x121c, B:78:0x06ba, B:80:0x06c0, B:81:0x06eb, B:23:0x02ab, B:25:0x02b1, B:26:0x02d5, B:28:0x0495, B:30:0x04c7, B:31:0x051b, B:605:0x2895, B:607:0x289b, B:608:0x28de, B:610:0x2905, B:611:0x294a, B:613:0x2960, B:615:0x2969, B:616:0x29ad, B:649:0x2bfa, B:650:0x2bfe, B:652:0x2c04, B:655:0x2c1c, B:658:0x2c33, B:660:0x2c36, B:672:0x2d19, B:674:0x2d1f, B:675:0x2d20, B:677:0x2d22, B:679:0x2d29, B:680:0x2d2a, B:619:0x29bc, B:621:0x29c0, B:625:0x29cc, B:627:0x29d2, B:639:0x2ae2, B:641:0x2ae8, B:642:0x2b27, B:644:0x2b51, B:645:0x2b95, B:647:0x2bab, B:648:0x2bf4, B:682:0x2d2c, B:684:0x2d33, B:685:0x2d34, B:687:0x2d36, B:689:0x2d3d, B:690:0x2d3e, B:37:0x052d, B:43:0x0540, B:64:0x0630, B:66:0x0636, B:67:0x0637, B:69:0x0639, B:71:0x0640, B:72:0x0641, B:47:0x0550, B:48:0x0557, B:45:0x0549), top: B:837:0x02ab, inners: #20, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:543:0x1fd4  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x2042  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x209b  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x2176  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x23c4  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x2ecf  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x2f20  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x2f7a  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x353a  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x3618  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x366c  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x371c  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x38e8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:808:0x3b70  */
    /* JADX WARN: Removed duplicated region for block: B:880:0x0778 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:905:0x1891 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:918:0x12a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:919:0x0dab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:969:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v104 */
    /* JADX WARN: Type inference failed for: r10v105 */
    /* JADX WARN: Type inference failed for: r10v106 */
    /* JADX WARN: Type inference failed for: r10v107 */
    /* JADX WARN: Type inference failed for: r10v112 */
    /* JADX WARN: Type inference failed for: r10v113 */
    /* JADX WARN: Type inference failed for: r10v114 */
    /* JADX WARN: Type inference failed for: r10v115 */
    /* JADX WARN: Type inference failed for: r10v116 */
    /* JADX WARN: Type inference failed for: r10v117 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v106 */
    /* JADX WARN: Type inference failed for: r12v107 */
    /* JADX WARN: Type inference failed for: r12v108 */
    /* JADX WARN: Type inference failed for: r12v109 */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v110 */
    /* JADX WARN: Type inference failed for: r12v111 */
    /* JADX WARN: Type inference failed for: r12v112 */
    /* JADX WARN: Type inference failed for: r12v113 */
    /* JADX WARN: Type inference failed for: r12v114 */
    /* JADX WARN: Type inference failed for: r12v115 */
    /* JADX WARN: Type inference failed for: r12v116 */
    /* JADX WARN: Type inference failed for: r12v117 */
    /* JADX WARN: Type inference failed for: r12v118 */
    /* JADX WARN: Type inference failed for: r12v119 */
    /* JADX WARN: Type inference failed for: r12v120 */
    /* JADX WARN: Type inference failed for: r12v121 */
    /* JADX WARN: Type inference failed for: r12v122 */
    /* JADX WARN: Type inference failed for: r12v123 */
    /* JADX WARN: Type inference failed for: r12v124 */
    /* JADX WARN: Type inference failed for: r12v125 */
    /* JADX WARN: Type inference failed for: r12v126 */
    /* JADX WARN: Type inference failed for: r12v127 */
    /* JADX WARN: Type inference failed for: r12v128 */
    /* JADX WARN: Type inference failed for: r12v129 */
    /* JADX WARN: Type inference failed for: r12v130 */
    /* JADX WARN: Type inference failed for: r12v131 */
    /* JADX WARN: Type inference failed for: r12v132 */
    /* JADX WARN: Type inference failed for: r12v133 */
    /* JADX WARN: Type inference failed for: r12v134 */
    /* JADX WARN: Type inference failed for: r12v135 */
    /* JADX WARN: Type inference failed for: r12v136 */
    /* JADX WARN: Type inference failed for: r12v137 */
    /* JADX WARN: Type inference failed for: r12v138 */
    /* JADX WARN: Type inference failed for: r12v139 */
    /* JADX WARN: Type inference failed for: r12v140 */
    /* JADX WARN: Type inference failed for: r12v141 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r12v58 */
    /* JADX WARN: Type inference failed for: r12v59, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v75 */
    /* JADX WARN: Type inference failed for: r12v77 */
    /* JADX WARN: Type inference failed for: r12v78 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r12v96 */
    /* JADX WARN: Type inference failed for: r12v97 */
    /* JADX WARN: Type inference failed for: r12v98 */
    /* JADX WARN: Type inference failed for: r12v99 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v54, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r13v59 */
    /* JADX WARN: Type inference failed for: r13v60 */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r13v62 */
    /* JADX WARN: Type inference failed for: r13v64 */
    /* JADX WARN: Type inference failed for: r13v77 */
    /* JADX WARN: Type inference failed for: r13v78 */
    /* JADX WARN: Type inference failed for: r34v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r34v24 */
    /* JADX WARN: Type inference failed for: r34v25 */
    /* JADX WARN: Type inference failed for: r34v32 */
    /* JADX WARN: Type inference failed for: r34v35 */
    /* JADX WARN: Type inference failed for: r34v36 */
    /* JADX WARN: Type inference failed for: r34v37 */
    /* JADX WARN: Type inference failed for: r34v40 */
    /* JADX WARN: Type inference failed for: r34v5 */
    /* JADX WARN: Type inference failed for: r34v50 */
    /* JADX WARN: Type inference failed for: r34v51 */
    /* JADX WARN: Type inference failed for: r34v6 */
    /* JADX WARN: Type inference failed for: r34v7 */
    /* JADX WARN: Type inference failed for: r34v8 */
    /* JADX WARN: Type inference failed for: r34v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r35v102 */
    /* JADX WARN: Type inference failed for: r35v104 */
    /* JADX WARN: Type inference failed for: r35v105 */
    /* JADX WARN: Type inference failed for: r35v106 */
    /* JADX WARN: Type inference failed for: r35v11 */
    /* JADX WARN: Type inference failed for: r35v116 */
    /* JADX WARN: Type inference failed for: r35v117 */
    /* JADX WARN: Type inference failed for: r35v118 */
    /* JADX WARN: Type inference failed for: r35v119 */
    /* JADX WARN: Type inference failed for: r35v12 */
    /* JADX WARN: Type inference failed for: r35v120 */
    /* JADX WARN: Type inference failed for: r35v123 */
    /* JADX WARN: Type inference failed for: r35v125 */
    /* JADX WARN: Type inference failed for: r35v126 */
    /* JADX WARN: Type inference failed for: r35v13 */
    /* JADX WARN: Type inference failed for: r35v132 */
    /* JADX WARN: Type inference failed for: r35v133 */
    /* JADX WARN: Type inference failed for: r35v134 */
    /* JADX WARN: Type inference failed for: r35v135 */
    /* JADX WARN: Type inference failed for: r35v136 */
    /* JADX WARN: Type inference failed for: r35v137 */
    /* JADX WARN: Type inference failed for: r35v138 */
    /* JADX WARN: Type inference failed for: r35v139 */
    /* JADX WARN: Type inference failed for: r35v14 */
    /* JADX WARN: Type inference failed for: r35v140 */
    /* JADX WARN: Type inference failed for: r35v141 */
    /* JADX WARN: Type inference failed for: r35v144 */
    /* JADX WARN: Type inference failed for: r35v145 */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r4v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v395 */
    /* JADX WARN: Type inference failed for: r4v396 */
    /* JADX WARN: Type inference failed for: r4v397 */
    /* JADX WARN: Type inference failed for: r4v413 */
    /* JADX WARN: Type inference failed for: r4v442 */
    /* JADX WARN: Type inference failed for: r4v443 */
    /* JADX WARN: Type inference failed for: r4v444 */
    /* JADX WARN: Type inference failed for: r6v434 */
    /* JADX WARN: Type inference failed for: r7v110 */
    /* JADX WARN: Type inference failed for: r7v111 */
    /* JADX WARN: Type inference failed for: r7v114 */
    /* JADX WARN: Type inference failed for: r7v115 */
    /* JADX WARN: Type inference failed for: r7v116 */
    /* JADX WARN: Type inference failed for: r7v117 */
    /* JADX WARN: Type inference failed for: r7v118 */
    /* JADX WARN: Type inference failed for: r7v119 */
    /* JADX WARN: Type inference failed for: r7v120 */
    /* JADX WARN: Type inference failed for: r7v126, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v130 */
    /* JADX WARN: Type inference failed for: r7v132 */
    /* JADX WARN: Type inference failed for: r7v133 */
    /* JADX WARN: Type inference failed for: r7v134 */
    /* JADX WARN: Type inference failed for: r7v135 */
    /* JADX WARN: Type inference failed for: r7v138 */
    /* JADX WARN: Type inference failed for: r7v139 */
    /* JADX WARN: Type inference failed for: r7v140 */
    /* JADX WARN: Type inference failed for: r7v141 */
    /* JADX WARN: Type inference failed for: r7v142 */
    /* JADX WARN: Type inference failed for: r7v143 */
    /* JADX WARN: Type inference failed for: r7v149, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v154 */
    /* JADX WARN: Type inference failed for: r7v155 */
    /* JADX WARN: Type inference failed for: r7v174 */
    /* JADX WARN: Type inference failed for: r7v177 */
    /* JADX WARN: Type inference failed for: r7v178 */
    /* JADX WARN: Type inference failed for: r7v197 */
    /* JADX WARN: Type inference failed for: r7v206 */
    /* JADX WARN: Type inference failed for: r7v207 */
    /* JADX WARN: Type inference failed for: r7v208 */
    /* JADX WARN: Type inference failed for: r7v209 */
    /* JADX WARN: Type inference failed for: r7v210 */
    /* JADX WARN: Type inference failed for: r7v211 */
    /* JADX WARN: Type inference failed for: r7v212 */
    /* JADX WARN: Type inference failed for: r7v213 */
    /* JADX WARN: Type inference failed for: r7v214 */
    /* JADX WARN: Type inference failed for: r7v215 */
    /* JADX WARN: Type inference failed for: r7v216 */
    /* JADX WARN: Type inference failed for: r7v217 */
    /* JADX WARN: Type inference failed for: r7v218 */
    /* JADX WARN: Type inference failed for: r7v219 */
    /* JADX WARN: Type inference failed for: r7v220 */
    /* JADX WARN: Type inference failed for: r7v221 */
    /* JADX WARN: Type inference failed for: r7v222 */
    /* JADX WARN: Type inference failed for: r7v223 */
    /* JADX WARN: Type inference failed for: r7v224 */
    /* JADX WARN: Type inference failed for: r7v225 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v113 */
    /* JADX WARN: Type inference failed for: r8v114 */
    /* JADX WARN: Type inference failed for: r8v115 */
    /* JADX WARN: Type inference failed for: r8v116, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v482, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v489 */
    /* JADX WARN: Type inference failed for: r8v490 */
    /* JADX WARN: Type inference failed for: r8v491 */
    /* JADX WARN: Type inference failed for: r8v515 */
    /* JADX WARN: Type inference failed for: r8v516 */
    /* JADX WARN: Type inference failed for: r8v517 */
    /* JADX WARN: Type inference failed for: r8v518 */
    /* JADX WARN: Type inference failed for: r8v519 */
    /* JADX WARN: Type inference failed for: r8v520 */
    /* JADX WARN: Type inference failed for: r8v529 */
    /* JADX WARN: Type inference failed for: r8v530 */
    /* JADX WARN: Type inference failed for: r8v531 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r51) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 16236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ChangePinVerifyOldPinActivity.attachBaseContext(android.content.Context):void");
    }

    public static void m10753$r8$lambda$pgkdYInIpwPkhlgaDdlr1eQly4(ChangePinVerifyOldPinActivity changePinVerifyOldPinActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 79;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        changePinVerifyOldPinActivity.lambda$observe$0(resource);
        if (i3 != 0) {
            throw null;
        }
        int i4 = getRequestBeneficiariesState + 5;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 67;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = component4 + 15;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static {
        getShareableDataState = 1;
        copydefault();
        copydefault = -565792817;
        ShareDataUIState = 1953265912;
        component1 = -842568243;
        component3 = new byte[]{-91, -109, -106, -101, -32, -5, -113, -98, -101, -27, -109, -104, -22, -101, -54, -115, -31, -103, -112, -29, -121, -112, -39, -9, -108, -122, -30, -125, -7, 90, -17, -108, -103, -27, -28, -123, -122, -25, -122, -29, -98, -101, -26, -13, -75, -103, -25, -97, -5, -66, -29, -23, -112, -32, -15, -10, 68, -49, -77, -17, -108, -103, -27, -28, -123, -122, -25, -122, -29, -98, -101, -26, -13, -75, -103, -25, -97, -5, -66, -29, -23, -112, -32, -15, -4, 84, -17, -108, -103, -27, -124, 43, -85, -104, 45, -93, -125, -7, -109, -108, -107, -125, -27, -23, -36, 80, -29, -100, -100, -106, -21, -107, -32, -37, 94, -22, -17, -100, -104, -4, -121, -24, -31, -125, -31, -106, -110, -21, -38, -85, -24, -126, -6, -128, -29, -34, 87, -110, -32};
        int i = toString + 5;
        getShareableDataState = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void copydefault() {
        getAsAtTimestamp = -890926387;
        copy = new char[]{33690, 38407, 43165, 49962, 54704, 59424, 719, 5493, 12241, 17002, 21755, 28521, 33054, 39831, 44567, 49333, 56102, 60844, 3142, 6555, 10072, 19635, 23147, 26615, 36102, 39566, 40984, 52726, 56187, 57577, 3781, 5193, 8665, 20273, 21667, 25134, 36741, 38162, 41624, 51238, 54716, 58173, 2378, 5761, 15454, 18924, 22310, 31994, 35343, 38853, 48422, 51883, 53347, 65095, 3019, 4357, 16108, 17470, 20985, 32515, 33921, 37400, 49058, 50464, 53950, 63632, 1623, 5082, 14643, 18174, 27771, 31105, 34580, 44233, 47743, 51168, 60720, 64333, 212, 11869, 15337, 16672, 3103, 6553, 9989, 19641, 23086, 26536, 36160, 39618, 41062, 52724, 56171, 57575, 3761, 5142, 8584, 20278, 3091, 6545, 9985, 19623, 23081, 26532, 36176, 39657, 41035, 52724, 56180, 57595, 3739, 5140, 8585, 3150, 6600, 10072, 19694, 23139, 26610, 36096, 39566, 40983, 52647, 3138, 6607, 10073, 19683, 23139, 26615, 36099, 39561, 40983, 52643, 56104, 17324, 22048, 26810, 779, 5514, 10271, 49902, 54634, 61428, 33354, 38089};
        equals = -3642106069715576323L;
    }
}
