package com.huawei.digitalpayment.consumer.mpin.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.text.BidiFormatter;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.constant.CacheConstants;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.baselibs2.utils.encrypt.EncryptManager;
import com.huawei.common.util.color.ColorUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.pin.model.PinType;
import com.huawei.digitalpayment.consumer.baselib.util.PhoneUtils;
import com.huawei.digitalpayment.consumer.constants.Keys;
import com.huawei.digitalpayment.consumer.login.databinding.ActivityResetPinTempPinBinding;
import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ResetPinTempPinViewModel;
import com.safaricom.mpesa.lifestyle.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.notify;

public class ResetPinTempPinActivity extends Hilt_ResetPinTempPinActivity<ActivityResetPinTempPinBinding, ResetPinTempPinViewModel> {
    private static final byte[] $$l = {1, -128, 109, -128};
    private static final int $$o = 113;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {107, -21, -54, -113, 10, -61, 72, -9, 0, 6, Ascii.NAK, -7, 17, -13, Ascii.ETB, -70, 63, 9, 10, -11, 17, 0, -9, Ascii.SI, -58, 69, 5, -7, 17, -13, Ascii.ETB, -1, 7, 5, -65, 60, 10, 7, Ascii.FF, -18, 5, Ascii.SO, -3, -51, Ascii.FS, 42, 7, Ascii.FF, -18, 5, Ascii.SO, -3, -13, 17, Ascii.SO, -2, -10, Ascii.NAK, 5, 7, -3, -61, 67, Ascii.DLE, 5, 13, -17, 5, 5, -1, Ascii.CAN, -5, Ascii.FF, Ascii.DLE, 2, 7, 3, 3, -5, 13, 10, -62, Ascii.DLE, 2, 7, 3, 3, -5, 13, 10, -61, Ascii.DLE, 2, -59, 63, -4, 19, -62, TarHeader.LF_CONTIG, 6, -49, TarHeader.LF_CONTIG, 17, -6, Ascii.DC2, 1, -2, -1, -50, TarHeader.LF_CONTIG, 6, 20, -65, 69, 5, -7, 17, -13, Ascii.ETB, -7, 10, 3, -60, 56, Ascii.VT, Ascii.NAK, -72, 72, -9, 6, 6, 10, 3, -60, 69, 5, -7, 17, -13, Ascii.ETB, -7, 10, 3, -60, 72, -9, Ascii.SI, 3, 8, -6, Ascii.SI, -1, 7, Ascii.VT, -71, Ascii.FS, 35, 19, -13, 9, -35, 47, 4, -39, TarHeader.LF_CHR, 4, 7, -29, Ascii.ETB, Ascii.DLE, 8, -12, Ascii.DC2, 5, Ascii.DLE, 5, 13, -17, 5, 5, -1, Ascii.CAN, -5, Ascii.FF};
    private static final int $$t = 50;
    private static final byte[] $$d = {79, Ascii.ETB, 89, Ascii.VT, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 248;
    private static int copy = 0;
    private static int equals = 1;
    private static long component3 = 5711491777611779580L;
    private static char component1 = 50353;
    private static char component2 = 36735;
    private static char ShareDataUIState = 1749;
    private static char copydefault = 29216;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r7, int r8, int r9) {
        /*
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r9 = r9 * 3
            int r9 = r9 + 102
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinTempPinActivity.$$l
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinTempPinActivity.$$r(int, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinTempPinActivity.$$d
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r7 = 103 - r7
            int r8 = 100 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r5 = r2
            r7 = r6
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r8]
        L25:
            int r8 = r8 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-8)
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinTempPinActivity.h(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = 174 - r5
            int r0 = 84 - r6
            int r7 = r7 * 6
            int r7 = r7 + 99
            byte[] r1 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinTempPinActivity.$$s
            byte[] r0 = new byte[r0]
            int r6 = 83 - r6
            r2 = -1
            if (r1 != 0) goto L14
            r7 = r5
            r3 = r6
            goto L29
        L14:
            r4 = r7
            r7 = r5
            r5 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r0[r2] = r3
            if (r2 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L27:
            r3 = r1[r7]
        L29:
            int r5 = r5 + r3
            int r7 = r7 + 1
            int r5 = r5 + (-4)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinTempPinActivity.i(int, int, short, java.lang.Object[]):void");
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $10 + 65;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) ($$l[0] - 1);
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3266 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 33, (char) (60268 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), -834797019, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component3 ^ 5431355972723572778L);
                try {
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        int iBlue = Color.blue(0) + 687;
                        int trimmedLength = 34 - TextUtils.getTrimmedLength("");
                        char cArgb = (char) (Color.argb(0, 0, 0, 0) + 60373);
                        byte b4 = $$l[0];
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iBlue, trimmedLength, cArgb, -1969106284, false, $$r(b5, b5, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 688;
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 34;
                char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 60373);
                byte b6 = $$l[0];
                byte b7 = (byte) (b6 - 1);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(bitsPerPixel, iResolveOpacity, maximumDrawingCacheSize, -1969106284, false, $$r(b7, b7, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i6 = $10 + 3;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    private static void g(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i6 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i7 = $10 + 59;
            $11 = i7 % 128;
            if (i7 % i4 == 0) {
                cArr3[i6] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 % 1];
                i2 = 1;
            } else {
                cArr3[i6] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
                i2 = i6;
            }
            int i8 = 58224;
            while (i2 < 16) {
                int i9 = $10 + 117;
                $11 = i9 % 128;
                int i10 = i9 % i4;
                char c2 = cArr3[1];
                char c3 = cArr3[i6];
                int i11 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(copydefault);
                    objArr2[i4] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i6] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int mode = View.MeasureSpec.getMode(i6) + 844;
                        int i13 = (ExpandableListView.getPackedPositionForChild(i6, i6) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i6, i6) == 0L ? 0 : -1)) + 33;
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', i6, i6) + 23252);
                        byte b2 = (byte) ($$l[i6] - 1);
                        byte b3 = b2;
                        String str$$r = $$r(b2, b3, (byte) (b3 + 3));
                        Class[] clsArr = new Class[4];
                        clsArr[i6] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(mode, i13, cIndexOf, 592652048, false, str$$r, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        int iKeyCodeFromString = 844 - KeyEvent.keyCodeFromString("");
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 32;
                        char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 23251);
                        byte b4 = (byte) ($$l[0] - 1);
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, longPressTimeout, touchSlop, 592652048, false, $$r(b4, b5, (byte) (b5 + 3)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 2;
                    i6 = 0;
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
                i3 = 2;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - ExpandableListView.getPackedPositionGroup(0L), 49 - Color.green(0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            } else {
                i3 = 2;
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i4 = i3;
            cArr3 = cArr5;
            i6 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = copy + 13;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = new Object[1];
        f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952718_res_0x7f13044e).substring(6, 7).codePointAt(0) + 59721, new char[]{52663, 9425, 8032, 29087, 26653, 17074, 46532, 44071, 34545, 63764, 54242, 51717, 15688, 6124, 3595, 24724, 23349, 45660}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        g((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 4, new char[]{51491, 48318, 59902, 40188, 42594, 43654}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952856_res_0x7f1304d8).substring(9, 10).codePointAt(0) + 64185, new char[]{52663, 14177, 14336, 15663, 9949, 11138, 11428, 5655, 7039, 7175, 476, 2731, 4027, 28848, 31356, 32520, 24624, 26070, 28384, 21428, 21878, 24179, 17154, 17612, 18927, 45699}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952785_res_0x7f130491).substring(2, 3).codePointAt(0) - 14, new char[]{21299, 53030, 47447, 8607, 54972, 13148, 61903, 46282, 23180, 21139, 57699, 8899, 35056, 43308, 30434, 8475, 37094, 24662}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i4 = copy + 51;
                equals = i4 % 128;
                if (i4 % 2 == 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Process.getGidForName("") + 6619, Color.alpha(0) + 42, (char) Color.green(0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    f((ViewConfiguration.getJumpTapTimeout() >> 16) + 35617, new char[]{52663, 18126, 56229, 27859, 57700, 31300, 36723, 'T', 38126, 10652, 41642, 14212, 18531, 56648, 22141, 60175, 32676, 61654, 1457, 40592, 4899, 42064, 14646, 45636, 50938, 23511, 60650, 24985, 64040, 3850, 32878, 5455, 43411, 8950, 46980, 51300, 23872, 54826, 27475, 65456, 28872, 34219, 7820, 37736, 9294, 47404, 12812, 18107}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952718_res_0x7f13044e).substring(6, 7).length() + 63, new char[]{53089, 11779, 49119, 14145, 51319, 59841, 31864, 10747, 5933, 54470, 58496, 10908, 34724, 53355, 31864, 10747, 1262, 11578, 36296, 17712, 7824, 4719, 24464, 14615, 36469, 51538, 44554, 57816, 36612, 22047, 46475, 53069, 17123, 23102, 31871, 29745, 58973, 1794, 30321, 62255, 45845, 11194, 15376, 41511, 8057, 32030, 46442, 56503, 2889, 4741, 22322, 14833, 5688, 60123, 9198, 37662, 59884, 44386, 14855, 14029, 6041, 17370, 60088, 8186}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    f(Color.argb(0, 0, 0, 0) + 64067, new char[]{52710, 14323, 14696, 9083, 9451, 11951, 4214, 6710, 8184, 494, 2859, 3409, 30405, 30849, 25161, 25689, 27011, 21446, 21845, 24346, 16600, 19102, 19500, 45541, 48042, 48441, 42798, 43252, 37606, 38002, 40511, 33709, 34182, 36675, 61779, 64207, 64651, 58909, 59420, 60806, 55193, 55643, 49937, 50336, 52834, 12328, 13806, 16376, 8567, 11058, 11427, 5814, 6267, 569, 1988, 2513, 29471, 30040, 32448, 24725, 27220, 27669, 20953, 23496}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952721_res_0x7f130451).substring(6, 7).length() + 71, new char[]{22026, 58495, 48318, 20594, 54564, 19102, 48570, 20729, 8972, 44531, 37556, 5889, 42282, 56459, 16886, 16291, 8720, 39448, 46904, 38187, 59623, 62993, 31871, 29745, 57025, 57837, 31735, 64977, 30023, 29954, 20267, 52093, 15407, 58560, 9498, 51472, 49972, 40150, 46690, 54782, 63723, 37381, 48255, 24774, 46690, 54782, 62064, 27392, 48208, 15308, 39194, 11523, 55718, 25911, 38075, 14109, 1693, 46845, 59754, 14964, 46011, 58595, 53960, 9425, 14266, 42963, 22646, 28607, 54972, 13148, 57494, 13100}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 23288, new char[]{52719, 38559, 31529, 57303, 41060, 1254}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(26) + 58668, new char[]{52658, 10306, 1789, 32015, 23414, 45532, 44138, 35427, 57555, 57131, 13716, 5113, 3674, 25754, 17124, 47432, 38835, 61973, 59489, 50824, 15622, 7023, 29082, 27688, 19096, 41134, 40736, 62932, 54242, 52819, 9401, 795, 30999, 22439, 45579, 43113}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 56 - (Process.myPid() >> 22), (char) (ViewConfiguration.getPressedStateDuration() >> 16), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
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
            int offsetAfter = 2405 - TextUtils.getOffsetAfter("", 0);
            int iIndexOf = TextUtils.indexOf("", "") + 26;
            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            byte[] bArr = $$d;
            Object[] objArr13 = new Object[1];
            h(bArr[33], bArr[31], (byte) ($$e & 352), objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(offsetAfter, iIndexOf, cMakeMeasureSpec, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int offsetAfter2 = 2405 - TextUtils.getOffsetAfter("", 0);
                int i5 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25;
                char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                byte[] bArr2 = $$d;
                Object[] objArr14 = new Object[1];
                h(bArr2[8], bArr2[31], (byte) 93, objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(offsetAfter2, i5, c2, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952812_res_0x7f1304ac).substring(55, 56).length() + 15, new char[]{19478, 28087, 11192, 24254, 21062, 46460, 14156, 16200, 801, 7600, 37050, 45470, 46011, 58595, 48876, 22317}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952715_res_0x7f13044b).substring(6, 7).length() + 12526, new char[]{52671, 64861, 44141, 24437, 3614, 14612, 59448, 39718, 19174, 30160, 9459, 55291, 34465, 45466, 24736, 5042}, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i6 = copy + 79;
            equals = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, -377868138};
                byte[] bArr3 = $$s;
                Object[] objArr18 = new Object[1];
                i((short) 170, bArr3[41], bArr3[105], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                i((short) 101, (byte) 74, bArr3[8], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int iRgb = (-16774811) - Color.rgb(0, 0, 0);
                    int i8 = 27 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte[] bArr4 = $$d;
                    Object[] objArr20 = new Object[1];
                    h(bArr4[8], bArr4[31], (byte) 93, objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iRgb, i8, c3, 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    f(6421 - KeyEvent.keyCodeFromString(""), new char[]{52663, 54445, 65432, 34459, 43501, 45270, 23500, 25195, 1297, 11288, 14122, 56930, 57683, 35764, 37508, 46472, 23787, 26608, 3776, 4406, 14353, 49924}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) + 16954, new char[]{52659, 36647, 18573, 2673, 51153, 32930, 16924, 8143, 55643, 39474, 22424, 4381, 53987, 44098, 26917}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int gidForName = 2404 - Process.getGidForName("");
                        int iBlue = Color.blue(0) + 26;
                        char cAlpha = (char) Color.alpha(0);
                        byte[] bArr5 = $$d;
                        byte b2 = (byte) (-bArr5[38]);
                        byte b3 = bArr5[33];
                        Object[] objArr23 = new Object[1];
                        h(b2, b3, (byte) (b3 | 84), objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(gidForName, iBlue, cAlpha, -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 2405;
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 26;
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte[] bArr6 = $$d;
                        Object[] objArr24 = new Object[1];
                        h(bArr6[33], bArr6[31], (byte) ($$e & 352), objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(tapTimeout, touchSlop, longPressTimeout, -2047739879, false, (String) objArr24[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
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
        int i9 = ((int[]) objArr[0])[0];
        int i10 = ((int[]) objArr[2])[0];
        if (i10 != i9) {
            long j = -1;
            long j2 = ((long) (i10 ^ i9)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6618 - Drawable.resolveOpacity(0, 0), ExpandableListView.getPackedPositionType(0L) + 42, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            try {
                Object[] objArr25 = {-1341300283, Long.valueOf(j4), new ArrayList(), null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 6563, 56 - KeyEvent.keyCodeFromString(""), (char) TextUtils.getOffsetBefore("", 0));
                Object[] objArr26 = new Object[1];
                i((short) 92, (byte) 74, $$s[8], objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
                int i11 = copy + 79;
                equals = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 5 / 2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        ((ActivityResetPinTempPinBinding) this.binding).llResetPinTempTip.setBackgroundColor(ColorUtils.INSTANCE.withAlpha(0.2f, com.blankj.utilcode.util.ColorUtils.getColor(com.huawei.digitalpayment.consumer.login.R.color.colorWarningDisable)));
        ((ActivityResetPinTempPinBinding) this.binding).resetPinTempTip.setText(String.format(getString(com.huawei.digitalpayment.consumer.login.R.string.pinmanage_temporay_tips), BidiFormatter.getInstance().unicodeWrap("+" + PhoneUtils.getRecentDesensitizationPhone())));
    }

    @Override
    public void onConfirmClick(String str) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putString("oldPin", EncryptManager.INSTANCE.encrypt(((ActivityResetPinTempPinBinding) this.binding).etCode.getText().toString()));
        if (getIntent().hasExtra(Keys.VERIFY_TYPE)) {
            int i2 = equals + 63;
            copy = i2 % 128;
            int i3 = i2 % 2;
            bundle.putParcelable(Keys.VERIFY_TYPE, getIntent().getParcelableExtra(Keys.VERIFY_TYPE));
            int i4 = equals + 79;
            copy = i4 % 128;
            int i5 = i4 % 2;
        }
        if (getIntent().hasExtra("token")) {
            int i6 = equals + 11;
            copy = i6 % 128;
            int i7 = i6 % 2;
            bundle.putString("token", getIntent().getStringExtra("token"));
        }
        RouteUtils.routeWithExecute(this, RoutePathConstants.RESET_PIN_CREATION, bundle);
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = equals + 63;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = com.huawei.digitalpayment.consumer.login.R.layout.activity_reset_pin_temp_pin;
        int i5 = equals + 91;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = copy + 45;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        if (this.viewModel != 0) {
            ((ResetPinTempPinViewModel) this.viewModel).cancelRequest();
        }
        int i4 = equals + 105;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public PinType getPinType() {
        int i = 2 % 2;
        PinType pinType = new PinType(getString(com.huawei.digitalpayment.consumer.login.R.string.pinmanage_temporay_title1), getString(com.huawei.digitalpayment.consumer.login.R.string.pinmanage_temporay_title2), "", getString(com.huawei.digitalpayment.consumer.login.R.string.pinmanage_temporay_button2));
        int i2 = equals + 67;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return pinType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = equals + 45;
            copy = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954589_res_0x7f130b9d).substring(0, 2).codePointAt(0) + 64168, new char[]{52663, 14177, 14336, 15663, 9949, 11138, 11428, 5655, 7039, 7175, 476, 2731, 4027, 28848, 31356, 32520, 24624, 26070, 28384, 21428, 21878, 24179, 17154, 17612, 18927, 45699}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{21299, 53030, 47447, 8607, 54972, 13148, 61903, 46282, 23180, 21139, 57699, 8899, 35056, 43308, 30434, 8475, 37094, 24662}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i4 = equals + 99;
                copy = i4 % 128;
                int i5 = i4 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i6 = equals + 91;
            copy = i6 % 128;
            try {
                if (i6 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 6618, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42, (char) TextUtils.getOffsetBefore("", 0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 55 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((-1) - Process.getGidForName("")), -699576857, false, "component2", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    int i7 = 32 / 0;
                } else {
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6618, 41 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(6562 - View.resolveSize(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 55, (char) View.resolveSizeAndState(0, 0, 0), -699576857, false, "component2", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault4).invoke(objInvoke2, objArr4);
                }
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
        int i2 = copy + 39;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(15) + 64105, new char[]{52663, 14177, 14336, 15663, 9949, 11138, 11428, 5655, 7039, 7175, 476, 2731, 4027, 28848, 31356, 32520, 24624, 26070, 28384, 21428, 21878, 24179, 17154, 17612, 18927, 45699}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952812_res_0x7f1304ac).substring(55, 56).length() + 17, new char[]{21299, 53030, 47447, 8607, 54972, 13148, 61903, 46282, 23180, 21139, 57699, 8899, 35056, 43308, 30434, 8475, 37094, 24662}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i3 = copy + 29;
            equals = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.makeMeasureSpec(0, 0) + 6618, 43 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6562, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 56, (char) Color.blue(0), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    int i4 = 36 / 0;
                } else {
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 6618, 42 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 6562, (KeyEvent.getMaxKeyCode() >> 16) + 56, (char) (Process.myTid() >> 22), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault4).invoke(objInvoke2, objArr4);
                }
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1033:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0857 A[Catch: all -> 0x034c, TryCatch #19 {all -> 0x034c, blocks: (B:148:0x0851, B:150:0x0857, B:151:0x087e, B:311:0x0f5e, B:313:0x0f64, B:314:0x0f8b, B:539:0x1bba, B:541:0x1bc0, B:542:0x1bee, B:759:0x2c93, B:761:0x2c99, B:762:0x2cc2, B:793:0x2fc5, B:795:0x2fcb, B:796:0x2ff2, B:830:0x330f, B:832:0x3315, B:833:0x333b, B:810:0x3144, B:812:0x3167, B:813:0x31b8, B:853:0x340d, B:855:0x3413, B:856:0x3435, B:858:0x346f, B:859:0x34ae, B:608:0x24c1, B:610:0x24d6, B:611:0x250a, B:590:0x21ab, B:592:0x21b1, B:593:0x21d9, B:595:0x2213, B:596:0x225c, B:560:0x1e4f, B:562:0x1e64, B:563:0x1e97, B:565:0x1ecb, B:566:0x1f4a, B:424:0x1608, B:426:0x160e, B:427:0x1632, B:379:0x13f3, B:381:0x13f9, B:382:0x1420, B:21:0x013f, B:23:0x0145, B:24:0x016f, B:26:0x02ba, B:28:0x02eb, B:29:0x0346), top: B:908:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0969 A[Catch: all -> 0x0eef, PHI: r1
  0x0969: PHI (r1v599 java.lang.Object) = (r1v598 java.lang.Object), (r1v645 java.lang.Object) binds: [B:156:0x0913, B:158:0x0916] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #43 {all -> 0x0eef, blocks: (B:155:0x090f, B:163:0x0969), top: B:953:0x090f }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x09ed  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0134 A[PHI: r15
  0x0134: PHI (r15v29 int) = (r15v105 int), (r15v106 int) binds: [B:8:0x0115, B:12:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0a6a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0d6b A[Catch: all -> 0x0ea5, TryCatch #3 {all -> 0x0ea5, blocks: (B:240:0x0d61, B:241:0x0d65, B:243:0x0d6b, B:246:0x0d87, B:235:0x0cfa, B:239:0x0d59), top: B:879:0x0cfa }] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0f64 A[Catch: all -> 0x034c, TryCatch #19 {all -> 0x034c, blocks: (B:148:0x0851, B:150:0x0857, B:151:0x087e, B:311:0x0f5e, B:313:0x0f64, B:314:0x0f8b, B:539:0x1bba, B:541:0x1bc0, B:542:0x1bee, B:759:0x2c93, B:761:0x2c99, B:762:0x2cc2, B:793:0x2fc5, B:795:0x2fcb, B:796:0x2ff2, B:830:0x330f, B:832:0x3315, B:833:0x333b, B:810:0x3144, B:812:0x3167, B:813:0x31b8, B:853:0x340d, B:855:0x3413, B:856:0x3435, B:858:0x346f, B:859:0x34ae, B:608:0x24c1, B:610:0x24d6, B:611:0x250a, B:590:0x21ab, B:592:0x21b1, B:593:0x21d9, B:595:0x2213, B:596:0x225c, B:560:0x1e4f, B:562:0x1e64, B:563:0x1e97, B:565:0x1ecb, B:566:0x1f4a, B:424:0x1608, B:426:0x160e, B:427:0x1632, B:379:0x13f3, B:381:0x13f9, B:382:0x1420, B:21:0x013f, B:23:0x0145, B:24:0x016f, B:26:0x02ba, B:28:0x02eb, B:29:0x0346), top: B:908:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x1011 A[Catch: all -> 0x1364, TryCatch #34 {all -> 0x1364, blocks: (B:318:0x100b, B:320:0x1011, B:321:0x1053, B:323:0x1060, B:325:0x1069, B:326:0x10af, B:345:0x1255, B:353:0x12c0, B:359:0x1348, B:361:0x134e, B:362:0x134f, B:364:0x1351, B:366:0x1358, B:367:0x1359, B:328:0x10bb, B:335:0x113d, B:337:0x1143, B:338:0x1186, B:340:0x11b0, B:341:0x11f4, B:343:0x120a, B:344:0x124d, B:369:0x135b, B:371:0x1362, B:372:0x1363, B:355:0x12c6, B:349:0x1289, B:351:0x128f, B:352:0x12b9, B:330:0x10db, B:332:0x10ed, B:333:0x1131), top: B:936:0x100b, outer: #14, inners: #17, #20, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x1060 A[Catch: all -> 0x1364, TryCatch #34 {all -> 0x1364, blocks: (B:318:0x100b, B:320:0x1011, B:321:0x1053, B:323:0x1060, B:325:0x1069, B:326:0x10af, B:345:0x1255, B:353:0x12c0, B:359:0x1348, B:361:0x134e, B:362:0x134f, B:364:0x1351, B:366:0x1358, B:367:0x1359, B:328:0x10bb, B:335:0x113d, B:337:0x1143, B:338:0x1186, B:340:0x11b0, B:341:0x11f4, B:343:0x120a, B:344:0x124d, B:369:0x135b, B:371:0x1362, B:372:0x1363, B:355:0x12c6, B:349:0x1289, B:351:0x128f, B:352:0x12b9, B:330:0x10db, B:332:0x10ed, B:333:0x1131), top: B:936:0x100b, outer: #14, inners: #17, #20, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x10bb A[Catch: all -> 0x1364, TRY_LEAVE, TryCatch #34 {all -> 0x1364, blocks: (B:318:0x100b, B:320:0x1011, B:321:0x1053, B:323:0x1060, B:325:0x1069, B:326:0x10af, B:345:0x1255, B:353:0x12c0, B:359:0x1348, B:361:0x134e, B:362:0x134f, B:364:0x1351, B:366:0x1358, B:367:0x1359, B:328:0x10bb, B:335:0x113d, B:337:0x1143, B:338:0x1186, B:340:0x11b0, B:341:0x11f4, B:343:0x120a, B:344:0x124d, B:369:0x135b, B:371:0x1362, B:372:0x1363, B:355:0x12c6, B:349:0x1289, B:351:0x128f, B:352:0x12b9, B:330:0x10db, B:332:0x10ed, B:333:0x1131), top: B:936:0x100b, outer: #14, inners: #17, #20, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0350 A[PHI: r15
  0x0350: PHI (r15v85 int) = (r15v11 int), (r15v87 int) binds: [B:19:0x013a, B:5:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x1267  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x14bb  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x14d2 A[Catch: all -> 0x159b, TryCatch #71 {all -> 0x159b, blocks: (B:399:0x14bd, B:401:0x14d2, B:402:0x1503), top: B:1007:0x14bd, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:405:0x1516 A[Catch: all -> 0x1591, TryCatch #63 {all -> 0x1591, blocks: (B:403:0x1509, B:405:0x1516, B:406:0x1589), top: B:991:0x1509, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x16ba  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x1709 A[Catch: all -> 0x1b24, PHI: r2 r9 r33
  0x1709: PHI (r2v458 java.lang.Object) = (r2v457 java.lang.Object), (r2v526 java.lang.Object) binds: [B:432:0x16b8, B:434:0x16bb] A[DONT_GENERATE, DONT_INLINE]
  0x1709: PHI (r9v150 ??) = (r9v270 ??), (r9v173 ??) binds: [B:432:0x16b8, B:434:0x16bb] A[DONT_GENERATE, DONT_INLINE]
  0x1709: PHI (r33v36 ??) = (r33v116 ??), (r33v117 ??) binds: [B:432:0x16b8, B:434:0x16bb] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x1b24, blocks: (B:431:0x16b4, B:438:0x1709, B:447:0x1770, B:465:0x1877, B:468:0x18c3), top: B:877:0x16b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x1716  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x1770 A[Catch: all -> 0x1b24, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x1b24, blocks: (B:431:0x16b4, B:438:0x1709, B:447:0x1770, B:465:0x1877, B:468:0x18c3), top: B:877:0x16b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x19ad A[Catch: all -> 0x1aff, TryCatch #51 {all -> 0x1aff, blocks: (B:479:0x19a3, B:480:0x19a7, B:482:0x19ad, B:485:0x19c9, B:470:0x18d2, B:475:0x193b, B:478:0x199b), top: B:969:0x18d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:541:0x1bc0 A[Catch: all -> 0x034c, TryCatch #19 {all -> 0x034c, blocks: (B:148:0x0851, B:150:0x0857, B:151:0x087e, B:311:0x0f5e, B:313:0x0f64, B:314:0x0f8b, B:539:0x1bba, B:541:0x1bc0, B:542:0x1bee, B:759:0x2c93, B:761:0x2c99, B:762:0x2cc2, B:793:0x2fc5, B:795:0x2fcb, B:796:0x2ff2, B:830:0x330f, B:832:0x3315, B:833:0x333b, B:810:0x3144, B:812:0x3167, B:813:0x31b8, B:853:0x340d, B:855:0x3413, B:856:0x3435, B:858:0x346f, B:859:0x34ae, B:608:0x24c1, B:610:0x24d6, B:611:0x250a, B:590:0x21ab, B:592:0x21b1, B:593:0x21d9, B:595:0x2213, B:596:0x225c, B:560:0x1e4f, B:562:0x1e64, B:563:0x1e97, B:565:0x1ecb, B:566:0x1f4a, B:424:0x1608, B:426:0x160e, B:427:0x1632, B:379:0x13f3, B:381:0x13f9, B:382:0x1420, B:21:0x013f, B:23:0x0145, B:24:0x016f, B:26:0x02ba, B:28:0x02eb, B:29:0x0346), top: B:908:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:547:0x1c7f  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x1cec  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x1d30  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x1d45  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x1e31  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x208b  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x2168  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x2377  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x23ca  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x24a2  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x2653  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x27f4  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x2809  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x2858  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0111 A[PHI: r15
  0x0111: PHI (r15v10 int) = (r15v9 int), (r15v86 int) binds: [B:3:0x010a, B:5:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:700:0x2abd  */
    /* JADX WARN: Removed duplicated region for block: B:761:0x2c99 A[Catch: all -> 0x034c, TryCatch #19 {all -> 0x034c, blocks: (B:148:0x0851, B:150:0x0857, B:151:0x087e, B:311:0x0f5e, B:313:0x0f64, B:314:0x0f8b, B:539:0x1bba, B:541:0x1bc0, B:542:0x1bee, B:759:0x2c93, B:761:0x2c99, B:762:0x2cc2, B:793:0x2fc5, B:795:0x2fcb, B:796:0x2ff2, B:830:0x330f, B:832:0x3315, B:833:0x333b, B:810:0x3144, B:812:0x3167, B:813:0x31b8, B:853:0x340d, B:855:0x3413, B:856:0x3435, B:858:0x346f, B:859:0x34ae, B:608:0x24c1, B:610:0x24d6, B:611:0x250a, B:590:0x21ab, B:592:0x21b1, B:593:0x21d9, B:595:0x2213, B:596:0x225c, B:560:0x1e4f, B:562:0x1e64, B:563:0x1e97, B:565:0x1ecb, B:566:0x1f4a, B:424:0x1608, B:426:0x160e, B:427:0x1632, B:379:0x13f3, B:381:0x13f9, B:382:0x1420, B:21:0x013f, B:23:0x0145, B:24:0x016f, B:26:0x02ba, B:28:0x02eb, B:29:0x0346), top: B:908:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:767:0x2d49  */
    /* JADX WARN: Removed duplicated region for block: B:770:0x2d9d  */
    /* JADX WARN: Removed duplicated region for block: B:775:0x2df6  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x2fa4  */
    /* JADX WARN: Removed duplicated region for block: B:801:0x3081  */
    /* JADX WARN: Removed duplicated region for block: B:804:0x30d5  */
    /* JADX WARN: Removed duplicated region for block: B:809:0x3126  */
    /* JADX WARN: Removed duplicated region for block: B:829:0x32ef  */
    /* JADX WARN: Removed duplicated region for block: B:846:0x33d5  */
    /* JADX WARN: Removed duplicated region for block: B:893:0x14a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:923:0x0992 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:951:0x27ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v213, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v214 */
    /* JADX WARN: Type inference failed for: r10v215 */
    /* JADX WARN: Type inference failed for: r10v216 */
    /* JADX WARN: Type inference failed for: r10v217 */
    /* JADX WARN: Type inference failed for: r10v222 */
    /* JADX WARN: Type inference failed for: r10v223 */
    /* JADX WARN: Type inference failed for: r10v226 */
    /* JADX WARN: Type inference failed for: r10v227 */
    /* JADX WARN: Type inference failed for: r10v71 */
    /* JADX WARN: Type inference failed for: r10v74, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v94 */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r11v63 */
    /* JADX WARN: Type inference failed for: r11v64 */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Type inference failed for: r11v71 */
    /* JADX WARN: Type inference failed for: r11v72 */
    /* JADX WARN: Type inference failed for: r11v73 */
    /* JADX WARN: Type inference failed for: r11v74 */
    /* JADX WARN: Type inference failed for: r11v75 */
    /* JADX WARN: Type inference failed for: r11v76 */
    /* JADX WARN: Type inference failed for: r11v77 */
    /* JADX WARN: Type inference failed for: r11v78 */
    /* JADX WARN: Type inference failed for: r11v79 */
    /* JADX WARN: Type inference failed for: r11v80 */
    /* JADX WARN: Type inference failed for: r11v81 */
    /* JADX WARN: Type inference failed for: r11v82 */
    /* JADX WARN: Type inference failed for: r13v100 */
    /* JADX WARN: Type inference failed for: r13v101 */
    /* JADX WARN: Type inference failed for: r13v102 */
    /* JADX WARN: Type inference failed for: r13v103 */
    /* JADX WARN: Type inference failed for: r13v104 */
    /* JADX WARN: Type inference failed for: r13v105 */
    /* JADX WARN: Type inference failed for: r13v106 */
    /* JADX WARN: Type inference failed for: r13v109 */
    /* JADX WARN: Type inference failed for: r13v110 */
    /* JADX WARN: Type inference failed for: r13v111 */
    /* JADX WARN: Type inference failed for: r13v112 */
    /* JADX WARN: Type inference failed for: r13v113 */
    /* JADX WARN: Type inference failed for: r13v114 */
    /* JADX WARN: Type inference failed for: r13v115 */
    /* JADX WARN: Type inference failed for: r13v116 */
    /* JADX WARN: Type inference failed for: r13v117 */
    /* JADX WARN: Type inference failed for: r13v118 */
    /* JADX WARN: Type inference failed for: r13v119 */
    /* JADX WARN: Type inference failed for: r13v120 */
    /* JADX WARN: Type inference failed for: r13v121 */
    /* JADX WARN: Type inference failed for: r13v122 */
    /* JADX WARN: Type inference failed for: r13v127 */
    /* JADX WARN: Type inference failed for: r13v128 */
    /* JADX WARN: Type inference failed for: r13v129 */
    /* JADX WARN: Type inference failed for: r13v130 */
    /* JADX WARN: Type inference failed for: r13v147 */
    /* JADX WARN: Type inference failed for: r13v153 */
    /* JADX WARN: Type inference failed for: r13v154 */
    /* JADX WARN: Type inference failed for: r13v155 */
    /* JADX WARN: Type inference failed for: r13v156 */
    /* JADX WARN: Type inference failed for: r13v157 */
    /* JADX WARN: Type inference failed for: r13v158 */
    /* JADX WARN: Type inference failed for: r13v159 */
    /* JADX WARN: Type inference failed for: r13v160 */
    /* JADX WARN: Type inference failed for: r13v161 */
    /* JADX WARN: Type inference failed for: r13v162 */
    /* JADX WARN: Type inference failed for: r13v163 */
    /* JADX WARN: Type inference failed for: r13v164 */
    /* JADX WARN: Type inference failed for: r13v165 */
    /* JADX WARN: Type inference failed for: r13v166 */
    /* JADX WARN: Type inference failed for: r13v167 */
    /* JADX WARN: Type inference failed for: r13v168 */
    /* JADX WARN: Type inference failed for: r13v169 */
    /* JADX WARN: Type inference failed for: r13v170 */
    /* JADX WARN: Type inference failed for: r13v171 */
    /* JADX WARN: Type inference failed for: r13v172 */
    /* JADX WARN: Type inference failed for: r13v173 */
    /* JADX WARN: Type inference failed for: r13v174 */
    /* JADX WARN: Type inference failed for: r13v175 */
    /* JADX WARN: Type inference failed for: r13v176 */
    /* JADX WARN: Type inference failed for: r13v177 */
    /* JADX WARN: Type inference failed for: r13v178 */
    /* JADX WARN: Type inference failed for: r13v179 */
    /* JADX WARN: Type inference failed for: r13v180 */
    /* JADX WARN: Type inference failed for: r13v181 */
    /* JADX WARN: Type inference failed for: r13v182 */
    /* JADX WARN: Type inference failed for: r13v183 */
    /* JADX WARN: Type inference failed for: r13v184 */
    /* JADX WARN: Type inference failed for: r13v185 */
    /* JADX WARN: Type inference failed for: r13v186 */
    /* JADX WARN: Type inference failed for: r13v187 */
    /* JADX WARN: Type inference failed for: r13v188 */
    /* JADX WARN: Type inference failed for: r13v189 */
    /* JADX WARN: Type inference failed for: r13v190 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r13v58, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v64 */
    /* JADX WARN: Type inference failed for: r13v66 */
    /* JADX WARN: Type inference failed for: r13v67 */
    /* JADX WARN: Type inference failed for: r13v68 */
    /* JADX WARN: Type inference failed for: r13v69 */
    /* JADX WARN: Type inference failed for: r13v70 */
    /* JADX WARN: Type inference failed for: r13v71 */
    /* JADX WARN: Type inference failed for: r13v72 */
    /* JADX WARN: Type inference failed for: r13v83 */
    /* JADX WARN: Type inference failed for: r13v88 */
    /* JADX WARN: Type inference failed for: r13v92 */
    /* JADX WARN: Type inference failed for: r13v93 */
    /* JADX WARN: Type inference failed for: r13v94 */
    /* JADX WARN: Type inference failed for: r13v95 */
    /* JADX WARN: Type inference failed for: r13v96 */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v101 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v89 */
    /* JADX WARN: Type inference failed for: r15v90 */
    /* JADX WARN: Type inference failed for: r15v91 */
    /* JADX WARN: Type inference failed for: r15v92 */
    /* JADX WARN: Type inference failed for: r15v93 */
    /* JADX WARN: Type inference failed for: r15v94 */
    /* JADX WARN: Type inference failed for: r15v95 */
    /* JADX WARN: Type inference failed for: r15v96 */
    /* JADX WARN: Type inference failed for: r15v97 */
    /* JADX WARN: Type inference failed for: r15v98 */
    /* JADX WARN: Type inference failed for: r15v99 */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v12 */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r24v15 */
    /* JADX WARN: Type inference failed for: r24v16 */
    /* JADX WARN: Type inference failed for: r24v17 */
    /* JADX WARN: Type inference failed for: r24v18 */
    /* JADX WARN: Type inference failed for: r24v19 */
    /* JADX WARN: Type inference failed for: r24v20 */
    /* JADX WARN: Type inference failed for: r24v24 */
    /* JADX WARN: Type inference failed for: r24v27 */
    /* JADX WARN: Type inference failed for: r24v28 */
    /* JADX WARN: Type inference failed for: r24v29 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v30 */
    /* JADX WARN: Type inference failed for: r24v31 */
    /* JADX WARN: Type inference failed for: r24v32 */
    /* JADX WARN: Type inference failed for: r24v36 */
    /* JADX WARN: Type inference failed for: r24v37 */
    /* JADX WARN: Type inference failed for: r24v38 */
    /* JADX WARN: Type inference failed for: r24v39 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v40 */
    /* JADX WARN: Type inference failed for: r24v41 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r26v104 */
    /* JADX WARN: Type inference failed for: r26v110 */
    /* JADX WARN: Type inference failed for: r26v111 */
    /* JADX WARN: Type inference failed for: r26v112 */
    /* JADX WARN: Type inference failed for: r26v115 */
    /* JADX WARN: Type inference failed for: r26v116 */
    /* JADX WARN: Type inference failed for: r26v117 */
    /* JADX WARN: Type inference failed for: r26v120 */
    /* JADX WARN: Type inference failed for: r26v121 */
    /* JADX WARN: Type inference failed for: r26v122 */
    /* JADX WARN: Type inference failed for: r26v123 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v67 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v90 */
    /* JADX WARN: Type inference failed for: r26v93 */
    /* JADX WARN: Type inference failed for: r26v94 */
    /* JADX WARN: Type inference failed for: r26v95 */
    /* JADX WARN: Type inference failed for: r26v96 */
    /* JADX WARN: Type inference failed for: r33v10 */
    /* JADX WARN: Type inference failed for: r33v103 */
    /* JADX WARN: Type inference failed for: r33v104 */
    /* JADX WARN: Type inference failed for: r33v105 */
    /* JADX WARN: Type inference failed for: r33v106 */
    /* JADX WARN: Type inference failed for: r33v107 */
    /* JADX WARN: Type inference failed for: r33v108 */
    /* JADX WARN: Type inference failed for: r33v109 */
    /* JADX WARN: Type inference failed for: r33v11 */
    /* JADX WARN: Type inference failed for: r33v110 */
    /* JADX WARN: Type inference failed for: r33v111 */
    /* JADX WARN: Type inference failed for: r33v112 */
    /* JADX WARN: Type inference failed for: r33v113 */
    /* JADX WARN: Type inference failed for: r33v114 */
    /* JADX WARN: Type inference failed for: r33v115 */
    /* JADX WARN: Type inference failed for: r33v116 */
    /* JADX WARN: Type inference failed for: r33v117 */
    /* JADX WARN: Type inference failed for: r33v118 */
    /* JADX WARN: Type inference failed for: r33v119 */
    /* JADX WARN: Type inference failed for: r33v12 */
    /* JADX WARN: Type inference failed for: r33v120 */
    /* JADX WARN: Type inference failed for: r33v121 */
    /* JADX WARN: Type inference failed for: r33v13 */
    /* JADX WARN: Type inference failed for: r33v14 */
    /* JADX WARN: Type inference failed for: r33v18 */
    /* JADX WARN: Type inference failed for: r33v22 */
    /* JADX WARN: Type inference failed for: r33v23 */
    /* JADX WARN: Type inference failed for: r33v24 */
    /* JADX WARN: Type inference failed for: r33v25 */
    /* JADX WARN: Type inference failed for: r33v26 */
    /* JADX WARN: Type inference failed for: r33v27 */
    /* JADX WARN: Type inference failed for: r33v28 */
    /* JADX WARN: Type inference failed for: r33v29 */
    /* JADX WARN: Type inference failed for: r33v30 */
    /* JADX WARN: Type inference failed for: r33v31 */
    /* JADX WARN: Type inference failed for: r33v32 */
    /* JADX WARN: Type inference failed for: r33v33 */
    /* JADX WARN: Type inference failed for: r33v34 */
    /* JADX WARN: Type inference failed for: r33v35 */
    /* JADX WARN: Type inference failed for: r33v36 */
    /* JADX WARN: Type inference failed for: r33v37 */
    /* JADX WARN: Type inference failed for: r33v38 */
    /* JADX WARN: Type inference failed for: r33v39 */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r33v41 */
    /* JADX WARN: Type inference failed for: r33v42 */
    /* JADX WARN: Type inference failed for: r33v48 */
    /* JADX WARN: Type inference failed for: r33v49 */
    /* JADX WARN: Type inference failed for: r33v50 */
    /* JADX WARN: Type inference failed for: r33v51 */
    /* JADX WARN: Type inference failed for: r33v52 */
    /* JADX WARN: Type inference failed for: r33v54 */
    /* JADX WARN: Type inference failed for: r33v56 */
    /* JADX WARN: Type inference failed for: r33v57 */
    /* JADX WARN: Type inference failed for: r33v6 */
    /* JADX WARN: Type inference failed for: r33v7 */
    /* JADX WARN: Type inference failed for: r33v8 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v157, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v241, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v281 */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v466 */
    /* JADX WARN: Type inference failed for: r3v467 */
    /* JADX WARN: Type inference failed for: r3v468 */
    /* JADX WARN: Type inference failed for: r3v481 */
    /* JADX WARN: Type inference failed for: r3v482 */
    /* JADX WARN: Type inference failed for: r3v483 */
    /* JADX WARN: Type inference failed for: r3v484 */
    /* JADX WARN: Type inference failed for: r3v485 */
    /* JADX WARN: Type inference failed for: r3v50, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v346 */
    /* JADX WARN: Type inference failed for: r5v347 */
    /* JADX WARN: Type inference failed for: r5v348 */
    /* JADX WARN: Type inference failed for: r5v371 */
    /* JADX WARN: Type inference failed for: r5v397 */
    /* JADX WARN: Type inference failed for: r5v445 */
    /* JADX WARN: Type inference failed for: r5v477 */
    /* JADX WARN: Type inference failed for: r5v478 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v308 */
    /* JADX WARN: Type inference failed for: r6v309 */
    /* JADX WARN: Type inference failed for: r6v310 */
    /* JADX WARN: Type inference failed for: r6v327 */
    /* JADX WARN: Type inference failed for: r6v328 */
    /* JADX WARN: Type inference failed for: r6v331 */
    /* JADX WARN: Type inference failed for: r6v333 */
    /* JADX WARN: Type inference failed for: r6v334 */
    /* JADX WARN: Type inference failed for: r6v337, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v338 */
    /* JADX WARN: Type inference failed for: r6v339 */
    /* JADX WARN: Type inference failed for: r6v340 */
    /* JADX WARN: Type inference failed for: r6v342 */
    /* JADX WARN: Type inference failed for: r6v348 */
    /* JADX WARN: Type inference failed for: r6v349 */
    /* JADX WARN: Type inference failed for: r6v350 */
    /* JADX WARN: Type inference failed for: r6v351 */
    /* JADX WARN: Type inference failed for: r6v352 */
    /* JADX WARN: Type inference failed for: r6v353 */
    /* JADX WARN: Type inference failed for: r6v354 */
    /* JADX WARN: Type inference failed for: r7v108 */
    /* JADX WARN: Type inference failed for: r7v109 */
    /* JADX WARN: Type inference failed for: r7v110, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v137 */
    /* JADX WARN: Type inference failed for: r7v139 */
    /* JADX WARN: Type inference failed for: r7v146 */
    /* JADX WARN: Type inference failed for: r7v147 */
    /* JADX WARN: Type inference failed for: r7v148 */
    /* JADX WARN: Type inference failed for: r7v149 */
    /* JADX WARN: Type inference failed for: r7v151 */
    /* JADX WARN: Type inference failed for: r7v153 */
    /* JADX WARN: Type inference failed for: r7v174 */
    /* JADX WARN: Type inference failed for: r7v175 */
    /* JADX WARN: Type inference failed for: r7v180 */
    /* JADX WARN: Type inference failed for: r7v181 */
    /* JADX WARN: Type inference failed for: r7v192 */
    /* JADX WARN: Type inference failed for: r7v211 */
    /* JADX WARN: Type inference failed for: r7v433 */
    /* JADX WARN: Type inference failed for: r7v434 */
    /* JADX WARN: Type inference failed for: r7v435 */
    /* JADX WARN: Type inference failed for: r7v436 */
    /* JADX WARN: Type inference failed for: r7v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v145 */
    /* JADX WARN: Type inference failed for: r9v149 */
    /* JADX WARN: Type inference failed for: r9v150 */
    /* JADX WARN: Type inference failed for: r9v151 */
    /* JADX WARN: Type inference failed for: r9v152 */
    /* JADX WARN: Type inference failed for: r9v153 */
    /* JADX WARN: Type inference failed for: r9v156 */
    /* JADX WARN: Type inference failed for: r9v157 */
    /* JADX WARN: Type inference failed for: r9v161, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v165 */
    /* JADX WARN: Type inference failed for: r9v166 */
    /* JADX WARN: Type inference failed for: r9v167 */
    /* JADX WARN: Type inference failed for: r9v168 */
    /* JADX WARN: Type inference failed for: r9v170 */
    /* JADX WARN: Type inference failed for: r9v173 */
    /* JADX WARN: Type inference failed for: r9v174 */
    /* JADX WARN: Type inference failed for: r9v175 */
    /* JADX WARN: Type inference failed for: r9v181 */
    /* JADX WARN: Type inference failed for: r9v182, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v183 */
    /* JADX WARN: Type inference failed for: r9v184 */
    /* JADX WARN: Type inference failed for: r9v186 */
    /* JADX WARN: Type inference failed for: r9v188 */
    /* JADX WARN: Type inference failed for: r9v189 */
    /* JADX WARN: Type inference failed for: r9v191 */
    /* JADX WARN: Type inference failed for: r9v192 */
    /* JADX WARN: Type inference failed for: r9v193 */
    /* JADX WARN: Type inference failed for: r9v202 */
    /* JADX WARN: Type inference failed for: r9v206 */
    /* JADX WARN: Type inference failed for: r9v213 */
    /* JADX WARN: Type inference failed for: r9v215 */
    /* JADX WARN: Type inference failed for: r9v216, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v221 */
    /* JADX WARN: Type inference failed for: r9v222 */
    /* JADX WARN: Type inference failed for: r9v223 */
    /* JADX WARN: Type inference failed for: r9v224 */
    /* JADX WARN: Type inference failed for: r9v225 */
    /* JADX WARN: Type inference failed for: r9v226 */
    /* JADX WARN: Type inference failed for: r9v228 */
    /* JADX WARN: Type inference failed for: r9v229 */
    /* JADX WARN: Type inference failed for: r9v252 */
    /* JADX WARN: Type inference failed for: r9v253 */
    /* JADX WARN: Type inference failed for: r9v254 */
    /* JADX WARN: Type inference failed for: r9v255 */
    /* JADX WARN: Type inference failed for: r9v256 */
    /* JADX WARN: Type inference failed for: r9v257 */
    /* JADX WARN: Type inference failed for: r9v258 */
    /* JADX WARN: Type inference failed for: r9v259 */
    /* JADX WARN: Type inference failed for: r9v260 */
    /* JADX WARN: Type inference failed for: r9v261 */
    /* JADX WARN: Type inference failed for: r9v262 */
    /* JADX WARN: Type inference failed for: r9v263 */
    /* JADX WARN: Type inference failed for: r9v264 */
    /* JADX WARN: Type inference failed for: r9v265 */
    /* JADX WARN: Type inference failed for: r9v266 */
    /* JADX WARN: Type inference failed for: r9v267 */
    /* JADX WARN: Type inference failed for: r9v268 */
    /* JADX WARN: Type inference failed for: r9v269 */
    /* JADX WARN: Type inference failed for: r9v270 */
    /* JADX WARN: Type inference failed for: r9v271 */
    /* JADX WARN: Type inference failed for: r9v272 */
    /* JADX WARN: Type inference failed for: r9v273 */
    /* JADX WARN: Type inference failed for: r9v274 */
    /* JADX WARN: Type inference failed for: r9v275 */
    /* JADX WARN: Type inference failed for: r9v276 */
    /* JADX WARN: Type inference failed for: r9v277 */
    /* JADX WARN: Type inference failed for: r9v278 */
    /* JADX WARN: Type inference failed for: r9v279 */
    /* JADX WARN: Type inference failed for: r9v280 */
    /* JADX WARN: Type inference failed for: r9v281 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinTempPinActivity.attachBaseContext(android.content.Context):void");
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 101;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = copy + 115;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
    }
}
