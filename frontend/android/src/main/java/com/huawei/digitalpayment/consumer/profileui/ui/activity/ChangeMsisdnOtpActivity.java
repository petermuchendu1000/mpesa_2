package com.huawei.digitalpayment.consumer.profileui.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.text.BidiFormatter;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.blankj.utilcode.constant.CacheConstants;
import com.blankj.utilcode.util.KeyboardUtils;
import com.google.common.base.Ascii;
import com.google.firebase.FirebaseError;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.config.IAppConfig;
import com.huawei.digitalpayment.consumer.baselib.databinding.ActivityAbstractOtpBinding;
import com.huawei.digitalpayment.consumer.baselib.otp.model.OtpType;
import com.huawei.digitalpayment.consumer.baselib.util.DialogUtils;
import com.huawei.digitalpayment.consumer.baselib.util.DialogUtils$$ExternalSyntheticLambda1;
import com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity;
import com.huawei.digitalpayment.consumer.profile.model.request.SendChangeMsisdnSmsParams;
import com.huawei.digitalpayment.consumer.profile.model.request.VerifyChangeMsisdnSmsParams;
import com.huawei.digitalpayment.consumer.profile.viewmodel.ChangeMsisdnViewModel;
import com.huawei.digitalpayment.consumer.service.ICheckIdentityService;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import com.safaricom.mpesa.lifestyle.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import kotlin.io.encoding.Base64;
import org.apache.commons.lang3.CharUtils;

public class ChangeMsisdnOtpActivity extends Hilt_ChangeMsisdnOtpActivity<ActivityAbstractOtpBinding, ChangeMsisdnViewModel> {
    private static char ShareDataUIState;
    private static long component1;
    private static int component2;
    private static char[] component3;
    private static int component4;
    private static char copydefault;
    private static int getRequestBeneficiariesState;
    private String msisdn;
    private static final byte[] $$l = {111, -17, Ascii.VT, -125};
    private static final int $$o = 16;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {44, 39, Base64.padSymbol, Ascii.GS, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_NORMAL, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2};
    private static final int $$t = 145;
    private static final byte[] $$d = {120, -62, 63, 57, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 106;
    private static int copy = 1;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(short r7, int r8, int r9) {
        /*
            int r9 = 119 - r9
            byte[] r0 = com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnOtpActivity.$$l
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r4 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L28:
            int r8 = r8 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnOtpActivity.$$r(short, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 83
            int r0 = 28 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnOtpActivity.$$d
            int r5 = 100 - r5
            byte[] r0 = new byte[r0]
            int r7 = 27 - r7
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r1[r5]
            int r3 = r3 + 1
        L26:
            int r6 = r6 + r4
            int r5 = r5 + 1
            int r6 = r6 + (-8)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnOtpActivity.h(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 6
            int r0 = 16 - r7
            int r6 = r6 * 9
            int r6 = 21 - r6
            int r8 = r8 * 16
            int r8 = r8 + 83
            byte[] r1 = com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnOtpActivity.$$s
            byte[] r0 = new byte[r0]
            int r7 = 15 - r7
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L32
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L32:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-17)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnOtpActivity.j(int, byte, short, java.lang.Object[]):void");
    }

    private static void f(char[] cArr, int i, char[] cArr2, char c2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i4 = $10 + 21;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            int i6 = $11 + 1;
            $10 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 4037, TextUtils.indexOf((CharSequence) "", '0') + 32, (char) (TextUtils.lastIndexOf("", '0') + 19182), 1912513118, false, $$r(b2, b3, (byte) (b3 & 20)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 11, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2458 - Process.getGidForName(""), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 931716605, false, $$r(b4, b5, (byte) (b5 & Ascii.NAK)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (ViewConfiguration.getScrollBarSize() >> 8), 11 - (ViewConfiguration.getTouchSlop() >> 8), (char) Color.blue(0), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component1 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) copydefault) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i8 = $11 + 83;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(char[] r23, int r24, boolean r25, int r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnOtpActivity.g(char[], int, boolean, int, int, java.lang.Object[]):void");
    }

    private static void i(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component3;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 95;
                $11 = i6 % 128;
                int i7 = i6 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7422 - (Process.myTid() >> 22), 15 - Color.blue(0), (char) (64291 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i5++;
                    i3 = 2;
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
        Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 15 - View.resolveSizeAndState(0, 0, 0), (char) (64291 - KeyEvent.keyCodeFromString("")), 682917265, false, "v", new Class[]{Integer.TYPE});
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
            int i8 = $11 + 33;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    int i10 = $11 + 119;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    obj = obj2;
                } else {
                    Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7117 - (ViewConfiguration.getTouchSlop() >> 8), 14 - Color.argb(0, 0, 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 44464), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        int i12 = $10 + 49;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 - 1);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2992 - AndroidCharacter.getMirror('0'), 25 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (KeyEvent.getDeadChar(0, 0) + 27637), 794909189, false, $$r(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i14];
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i15 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i16 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i15];
                            cArr4[cancelall.component2 + 1] = cArr2[i16];
                        } else {
                            int i17 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i18 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i17];
                            cArr4[cancelall.component2 + 1] = cArr2[i18];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
            }
        }
        int i19 = 0;
        while (i19 < i) {
            int i20 = $10 + 87;
            $11 = i20 % 128;
            if (i20 % 2 == 0) {
                cArr4[i19] = (char) (cArr4[i19] ^ 8204);
                i19 += 61;
            } else {
                cArr4[i19] = (char) (cArr4[i19] ^ 13722);
                i19++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object obj = null;
        Object[] objArr2 = new Object[1];
        f(new char[]{29091, 37256, 9857, 36028, 9075, 57428, 48683, 58023, 8140, 62564, 47301, 30364, 19500, 5573, 45565, 42796, 31072, '#'}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952804_res_0x7f1304a4).substring(10, 11).length() - 1, new char[]{41550, 42521, 12663, 43790}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(24) + 54666), new char[]{15860, 11399, 64786, 40917}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        g(new char[]{5, 17, 65517, 1, 65532}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(17) - 110, false, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 24, View.MeasureSpec.getSize(0) + 187, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                f(new char[]{64091, 63169, 27448, 37677, 50696, 59680, 36775, 9217, 46265, 16650, 2983, 6871, 63059, 25122, 39890, 42741, 6932, 21905, 54140, 60660, 48797, 55157, 25307, 38470, 21889, 58180}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, new char[]{41550, 42521, 12663, 43790}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952303_res_0x7f1302af).substring(0, 2).codePointAt(1) + FirebaseError.ERROR_USER_DISABLED), new char[]{35443, 38747, 39859, 12866}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                g(new char[]{11, 65529, 4, 5, 65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b'}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952792_res_0x7f130498).substring(2, 3).length() + 1, true, Color.green(0) + 18, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(16) + 88, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if (baseContext instanceof ContextWrapper) {
                    int i2 = getAsAtTimestamp + 105;
                    equals = i2 % 128;
                    if (i2 % 2 != 0) {
                        ((ContextWrapper) baseContext).getBaseContext();
                        obj.hashCode();
                        throw null;
                    }
                    if (((ContextWrapper) baseContext).getBaseContext() == null) {
                        int i3 = equals + 87;
                        getAsAtTimestamp = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i4 = 4 / 3;
                        }
                        baseContext = null;
                    }
                }
                baseContext = baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        try {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - ExpandableListView.getPackedPositionType(0L), View.MeasureSpec.getSize(0) + 42, (char) KeyEvent.keyCodeFromString(""), 428292935, false, "ShareDataUIState", new Class[0]);
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
                    f(new char[]{5593, 52800, 14493, 29242, 1848, 52095, 22607, 64376, 47962, 19057, 52393, 754, 40150, 48499, 18433, 14685, 60612, 30088, 11712, 36999, 43303, 32477, 12917, 34719, 53795, 2199, 33272, 44250, 10755, 59768, 9076, 40600, 22464, 58037, 52215, 37130, 516, 12483, 3899, 36722, 6589, 31296, 41415, 9686, 58687, 34561, 3487, 7130}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{41550, 42521, 12663, 43790}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952856_res_0x7f1304d8).substring(9, 10).length() - 1), new char[]{8572, 50394, 9215, 63849}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    g(new char[]{65525, 65522, 31, 31, 65519, 65516, 65524, 30, 65516, '\"', 65516, 65519, 65524, 31, ' ', 65519, 65522, 65524, 65522, 30, 65516, 65524, 31, 30, '!', ' ', 65517, 31, 31, 65524, 65525, 65517, '\"', 65521, 65521, 65517, ' ', 65518, 29, 30, 65523, 65524, '\"', 65524, 65522, 65519, 65525, 65524, 65519, 65525, 65522, 65525, 65518, ' ', 65519, 65517, 65516, 65520, 31, 31, 65518, '\"', 65517, 65520}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131953647_res_0x7f1307ef).substring(0, 4).length() + 48, false, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952767_res_0x7f13047f).substring(12, 13).length() + 63, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952826_res_0x7f1304ba).substring(7, 8).length() + 150, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    g(new char[]{65526, 65517, 65524, 65526, 65523, 65524, '\"', 65525, '!', 65518, 65517, ' ', 65523, 65517, '#', 65520, 65520, '!', 65520, 65523, '!', 65521, 65523, 65525, 65524, 65519, 65522, 65522, ' ', '\"', 31, 65522, 65517, 65524, '#', ' ', ' ', 65523, 65522, 65519, 65523, 65518, '!', 65525, '#', 65517, ' ', 65522, 65521, 65523, 65519, 65525, '\"', 30, 31, 65517, 65517, 65518, 65526, ' ', 65524, 65518, ' ', 65519}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131955137_res_0x7f130dc1).substring(0, 3).length() + 43, true, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(18) - 33, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 121, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    g(new char[]{28, 27, CharUtils.CR, 15, 22, 17, 65495, 17, 24, '\t', 65495, 21, 23, 11, 65494, CharUtils.CR, JSONLexer.EOI, '\t', 29, 25, 27, '\f', JSONLexer.EOI, '\t', 29, 15, 65494, 28, 27, '\t', 11, 28, '\t', CharUtils.CR, JSONLexer.EOI, 16, 28, 65494, '\n', 11, 65503, 65500, 65498, 65498, 65502, 65497, 65501, 65500, 14, 65499, 65503, 65504, 65501, 65502, 65495, 65495, 65506, 27, 24, 28, 28, 16, 27, 28, 22, CharUtils.CR, 30, CharUtils.CR, 65495, 65498, 30, 65495}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(16) - 39, true, 71 - TextUtils.indexOf((CharSequence) "", '0', 0), 170 - ExpandableListView.getPackedPositionChild(0L), objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    g(new char[]{1, 7, 65532, 65535, 2, 65532}, Color.rgb(0, 0, 0) + 16777217, false, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 23, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954659_res_0x7f130be3).substring(6, 9).length() + 130, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f(new char[]{41244, 49625, 28782, 6812, 28225, 31650, 54185, 51472, 6630, 20694, 2666, 54310, 60298, 32764, 15084, 42326, 17116, 436, 10508, 63896, 62969, 22632, 47102, 31701, 28704, 20923, 49541, 64659, 63071, 12635, 35460, 51606, 40548, 7301, 51363, 18842}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{41550, 42521, 12663, 43790}, (char) (Color.rgb(0, 0, 0) + 16777216), new char[]{48563, 45040, 8670, 53682}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 56, (char) ((Process.getThreadPriority(0) + 20) >> 6), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault3 == null) {
            int i5 = 2406 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int iIndexOf = 25 - TextUtils.indexOf((CharSequence) "", '0', 0);
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            byte b2 = (byte) ($$e & 496);
            byte[] bArr = $$d;
            Object[] objArr13 = new Object[1];
            h(b2, (byte) (-bArr[22]), (byte) (-bArr[38]), objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i5, iIndexOf, cResolveOpacity, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int mirror = AndroidCharacter.getMirror('0') + 2357;
                int iLastIndexOf = 25 - TextUtils.lastIndexOf("", '0');
                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                Object[] objArr14 = new Object[1];
                h((byte) 93, (byte) (-$$d[22]), r1[95], objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(mirror, iLastIndexOf, minimumFlingVelocity, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            g(new char[]{17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23}, 4 - Gravity.getAbsoluteGravity(0, 0), false, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(28) - 85, (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer._2131427364_res_0x7f0b0024) & (-3)) + 180, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            f(new char[]{10315, 18403, 19688, 58788, 60868, 14367, 15518, 23985, 62404, 55605, 18014, 8710, 5119, 56737, 54534, 43955}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 99, new char[]{41550, 42521, 12663, 43790}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 34571), new char[]{51488, 5900, 32066, 46471}, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i6 = equals + 117;
            int i7 = i6 % 128;
            getAsAtTimestamp = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 5;
            equals = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, 808337726};
                char[] cArr = {2, 21, 30, 22, 0, 14, 14, '\"', 31, 27, 19, 18, 28, 19, JSONLexer.EOI, 25, 22, '\"', '\n', '\f', ' ', '#', '#', 3, 30, 24, 2, 21, 13837, 13837, 23, 2, 24, 30, 3, ' ', '#', '\"', 19, 0, '#', '\f', 14, '\"'};
                byte b3 = (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21);
                Object[] objArr18 = new Object[1];
                f(new char[]{64091, 63169, 27448, 37677, 50696, 59680, 36775, 9217, 46265, 16650, 2983, 6871, 63059, 25122, 39890, 42741, 6932, 21905, 54140, 60660, 48797, 55157, 25307, 38470, 21889, 58180}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952790_res_0x7f130496).substring(7, 8).length() - 1, new char[]{41550, 42521, 12663, 43790}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952810_res_0x7f1304aa).substring(9, 10).codePointAt(0) + 17019), new char[]{35443, 38747, 39859, 12866}, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                g(new char[]{11, 65529, 4, 5, 65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b'}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954589_res_0x7f130b9d).substring(0, 2).codePointAt(0) - 47, true, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952715_res_0x7f13044b).substring(6, 7).codePointAt(0) - 14, 189 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr19);
                Object[] objArr20 = new Object[1];
                i(cArr, b3, ((Context) cls4.getMethod((String) objArr19[0], new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952721_res_0x7f130451).substring(6, 7).codePointAt(0) + 12, objArr20);
                Class<?> cls5 = Class.forName(((String) objArr20[0]).intern());
                byte b4 = $$s[29];
                byte b5 = (byte) (b4 - 1);
                Object[] objArr21 = new Object[1];
                j(b4, b5, b5, objArr21);
                objArr = (Object[]) cls5.getMethod((String) objArr21[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int packedPositionType = 2405 - ExpandableListView.getPackedPositionType(0L);
                    int defaultSize = 26 - View.getDefaultSize(0, 0);
                    char c2 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    Object[] objArr22 = new Object[1];
                    h((byte) 93, (byte) (-$$d[22]), r5[95], objArr22);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionType, defaultSize, c2, 24929979, false, (String) objArr22[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr23 = new Object[1];
                    f(new char[]{30670, 47534, 18852, 64089, 6576, 31875, 54275, 4747, 48481, 42653, 7156, 37381, 53589, 36709, 6043, 44854, 61781, 14552, 44967, 38253, 13331, 44629}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(19) - 46, new char[]{41550, 42521, 12663, 43790}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952721_res_0x7f130451).substring(6, 7).codePointAt(0) - 32), new char[]{58065, 26440, 7973, 10285}, objArr23);
                    Class<?> cls6 = Class.forName((String) objArr23[0]);
                    Object[] objArr24 = new Object[1];
                    g(new char[]{65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, CharUtils.CR, 5, 65530, 65534, 65515, 65533}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(16) - 95, true, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952303_res_0x7f1302af).substring(0, 2).length() + 13, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 157, objArr24);
                    long jLongValue = ((Long) cls6.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int mirror2 = AndroidCharacter.getMirror('0') + 2357;
                        int gidForName = 25 - Process.getGidForName("");
                        char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        Object[] objArr25 = new Object[1];
                        h((byte) 84, (byte) ($$e & 31), $$d[33], objArr25);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(mirror2, gidForName, c3, -1843538389, false, (String) objArr25[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 2406;
                        int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26;
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                        byte b6 = (byte) ($$e & 496);
                        byte[] bArr2 = $$d;
                        Object[] objArr26 = new Object[1];
                        h(b6, (byte) (-bArr2[22]), (byte) (-bArr2[38]), objArr26);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(modifierMetaStateMask, minimumFlingVelocity2, packedPositionChild, -2047739879, false, (String) objArr26[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
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
        }
        int i11 = ((int[]) objArr[0])[0];
        int i12 = ((int[]) objArr[2])[0];
        if (i12 != i11) {
            long j = -1;
            long j2 = ((long) (i12 ^ i11)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6618 - TextUtils.getTrimmedLength(""), 41 - TextUtils.lastIndexOf("", '0'), (char) View.resolveSizeAndState(0, 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            try {
                Object[] objArr27 = {968781674, Long.valueOf(j4), new ArrayList(), null, true};
                Class cls7 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.lastIndexOf("", '0'), 55 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ImageFormat.getBitsPerPixel(0) + 1));
                byte b7 = (byte) ($$t & 7);
                byte b8 = b7;
                Object[] objArr28 = new Object[1];
                j(b7, b8, b8, objArr28);
                cls7.getMethod((String) objArr28[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr27);
            } catch (Throwable th4) {
                Throwable cause3 = th4.getCause();
                if (cause3 == null) {
                    throw th4;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        this.tvDescription.setText(new SpannableString(String.format(mo10749getOtpType().getDescription(), BidiFormatter.getInstance().unicodeWrap("(+" + AppConfigManager.getAppConfig().getPhoneNumberCode() + ") " + ((IAppConfig) RouteUtils.getService(IAppConfig.class)).getDesensitizationPhone(this.msisdn.replaceFirst(AppConfigManager.getAppConfig().getPhoneNumberCode(), ""), false)))));
        addObserver();
    }

    @Override
    public void onConfirmClick(String str) {
        int i = 2 % 2;
        KeyboardUtils.hideSoftInput(this);
        ((ChangeMsisdnViewModel) this.viewModel).verifyChangeMsisdnSms(new VerifyChangeMsisdnSmsParams(this.msisdn, str));
        int i2 = equals + 69;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void getSmsCode() {
        int i = 2 % 2;
        this.msisdn = getIntent().getStringExtra("msisdn");
        ((ChangeMsisdnViewModel) this.viewModel).sendChangeMsisdnSms(new SendChangeMsisdnSmsParams(this.msisdn));
        int i2 = getAsAtTimestamp + 33;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private void lambda$addObserver$0(Resource resource) {
        int i = 2 % 2;
        Utils.showOrHideLoading(this, resource);
        if (resource.error()) {
            ((ActivityAbstractOtpBinding) this.binding).etCode.showError(resource.getMessage());
            ((ActivityAbstractOtpBinding) this.binding).etCode.clear();
            if ("timeout".equals(resource.getException().getResponseCode())) {
                DialogUtils.showConnectTimeOutDialog(this, new DialogUtils$$ExternalSyntheticLambda1());
                return;
            }
            return;
        }
        if (resource.success()) {
            int i2 = getAsAtTimestamp + 91;
            equals = i2 % 128;
            int i3 = i2 % 2;
            checkIdentity();
        }
        int i4 = equals + 55;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void addObserver() {
        int i = 2 % 2;
        ((ChangeMsisdnViewModel) this.viewModel).getVerifySms().observe(this, new Observer() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 69;
                component3 = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 != 0) {
                    ChangeMsisdnOtpActivity.$r8$lambda$pquJXqHX_hjvoJGhZygv4REZR6s(this.f$0, (Resource) obj);
                    throw null;
                }
                ChangeMsisdnOtpActivity.$r8$lambda$pquJXqHX_hjvoJGhZygv4REZR6s(this.f$0, (Resource) obj);
                int i4 = component1 + 67;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            }
        });
        ((ChangeMsisdnViewModel) this.viewModel).getSmsData().observe(this, new Observer() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 9;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    ChangeMsisdnOtpActivity.$r8$lambda$R74GGLW11J95oyWaB6c27u969eQ(this.f$0, (Resource) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ChangeMsisdnOtpActivity.$r8$lambda$R74GGLW11J95oyWaB6c27u969eQ(this.f$0, (Resource) obj);
                int i4 = component1 + 69;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = equals + 43;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void lambda$addObserver$1(Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 61;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            Utils.showOrHideLoading(this, resource);
            Utils.toastError(resource);
            if (resource.success()) {
                startTimer();
            }
            int i3 = getAsAtTimestamp + 115;
            equals = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        Utils.showOrHideLoading(this, resource);
        Utils.toastError(resource);
        resource.success();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void checkIdentity() {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putString("title", getString(com.huawei.digitalpayment.consumer.profileui.R.string.profile_mobile_title4));
        bundle.putString("tips", getString(com.huawei.digitalpayment.consumer.profileui.R.string.profile_mobile_tips6));
        bundle.putString(CheckIdentityActivity.ID_TYPE, getString(com.huawei.digitalpayment.consumer.profileui.R.string.profile_mobile_title5));
        bundle.putString(CheckIdentityActivity.ID_TYPE_TIPS, getString(com.huawei.digitalpayment.consumer.profileui.R.string.profile_mobile_tips7));
        bundle.putString(CheckIdentityActivity.ID_NUMBER, getString(com.huawei.digitalpayment.consumer.profileui.R.string.profile_mobile_title6));
        bundle.putString(CheckIdentityActivity.ID_NUMBER_TIPS, getString(com.huawei.digitalpayment.consumer.profileui.R.string.profile_mobile_tips8));
        bundle.putString("button", getString(com.huawei.digitalpayment.consumer.profileui.R.string.profile_mobile_button5));
        bundle.putString(CheckIdentityActivity.ID_TYPE_DIALOG_TITLE, getString(com.huawei.digitalpayment.consumer.profileui.R.string.profile_mobile_title7));
        bundle.putString(CheckIdentityActivity.ID_TYPE_DIALOG_BUTTON, getString(com.huawei.digitalpayment.consumer.profileui.R.string.profile_mobile_button6));
        ((ICheckIdentityService) RouteUtils.getService(ICheckIdentityService.class)).checkIdentity(bundle, new ApiCallback<Map<String, String>>() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public void onSuccess(Map<String, String> map) {
                int i2 = 2 % 2;
                int i3 = component2 + 45;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                ShareDataUIState(map);
                int i5 = component3 + 111;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void ShareDataUIState(Map<String, String> map) {
                int i2 = 2 % 2;
                super.onSuccess(map);
                Intent intent = new Intent(ChangeMsisdnOtpActivity.this, (Class<?>) ChangeMsisdnActivity.class);
                intent.putExtra("msisdn", ChangeMsisdnOtpActivity.m10862$$Nest$fgetmsisdn(ChangeMsisdnOtpActivity.this));
                ChangeMsisdnOtpActivity.this.startActivity(intent);
                int i3 = component3 + 71;
                component2 = i3 % 128;
                int i4 = i3 % 2;
            }
        });
        int i2 = getAsAtTimestamp + 1;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public OtpType mo10749getOtpType() {
        int i = 2 % 2;
        OtpType otpType = new OtpType(getString(com.huawei.digitalpayment.consumer.profileui.R.string.profile_mobile_title3), getString(com.huawei.digitalpayment.consumer.profileui.R.string.profile_mobile_tips4), getString(com.huawei.digitalpayment.consumer.profileui.R.string.profile_mobile_tips5), getString(com.huawei.digitalpayment.consumer.profileui.R.string.profile_mobile_button3), getString(com.huawei.digitalpayment.consumer.profileui.R.string.profile_mobile_button4));
        int i2 = getAsAtTimestamp + 103;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return otpType;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnOtpActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = equals + 51;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f(new char[]{64091, 63169, 27448, 37677, 50696, 59680, 36775, 9217, 46265, 16650, 2983, 6871, 63059, 25122, 39890, 42741, 6932, 21905, 54140, 60660, 48797, 55157, 25307, 38470, 21889, 58180}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{41550, 42521, 12663, 43790}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(14) + 16942), new char[]{35443, 38747, 39859, 12866}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(new char[]{11, 65529, 4, 5, 65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b'}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2, true, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954589_res_0x7f130b9d).substring(0, 2).codePointAt(1) - 28, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952754_res_0x7f130472).substring(2, 3).length() + 188, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = equals + 37;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            int i6 = getAsAtTimestamp + 1;
            equals = i6 % 128;
            int i7 = i6 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6666 - AndroidCharacter.getMirror('0'), 41 - TextUtils.indexOf((CharSequence) "", '0'), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 56, (char) View.resolveSizeAndState(0, 0, 0), -960739708, false, "component3", new Class[]{Context.class});
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

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r41) {
        /*
            Method dump skipped, instruction units count: 15982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ChangeMsisdnOtpActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$R74GGLW11J95oyWaB6c27u969eQ(ChangeMsisdnOtpActivity changeMsisdnOtpActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 123;
        equals = i2 % 128;
        int i3 = i2 % 2;
        changeMsisdnOtpActivity.lambda$addObserver$1(resource);
        int i4 = equals + 11;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$pquJXqHX_hjvoJGhZygv4REZR6s(ChangeMsisdnOtpActivity changeMsisdnOtpActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 117;
        equals = i2 % 128;
        int i3 = i2 % 2;
        changeMsisdnOtpActivity.lambda$addObserver$0(resource);
        int i4 = getAsAtTimestamp + 107;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    static String m10862$$Nest$fgetmsisdn(ChangeMsisdnOtpActivity changeMsisdnOtpActivity) {
        int i = 2 % 2;
        int i2 = equals + 97;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = changeMsisdnOtpActivity.msisdn;
        int i5 = i3 + 35;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 11;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        int i5 = equals + 45;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static {
        component4 = 0;
        component2();
        component3 = new char[]{1996, 2002, 2024, 2019, 1975, 2030, 2032, 2022, 2003, 1968, 1997, 1988, 2037, 1970, 2018, 1989, 2017, 2034, 1966, 1995, 2031, 2040, 2023, 2020, 2036, 2025, 1986, 2035, 2028, 1987, 1956, 2041, 2039, 2021, 2029, 1990};
        ShareDataUIState = (char) 12828;
        int i = copy + 41;
        component4 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void component2() {
        component1 = 6955591985406174911L;
        component2 = 1386857713;
        copydefault = (char) 50417;
        getRequestBeneficiariesState = -890926390;
    }
}
