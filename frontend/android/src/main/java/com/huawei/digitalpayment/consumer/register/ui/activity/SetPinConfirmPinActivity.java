package com.huawei.digitalpayment.consumer.register.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.constant.CacheConstants;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.baselibs2.utils.encrypt.EncryptManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.databinding.ActivityBasePinBinding;
import com.huawei.digitalpayment.consumer.baselib.pin.model.PinType;
import com.huawei.digitalpayment.consumer.baselib.service.ICommonService;
import com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils;
import com.huawei.digitalpayment.consumer.login.util.LoginUtils;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.register.request.SetPinParams;
import com.huawei.digitalpayment.consumer.loginModule.register.viewmodel.SetPinViewModel;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import com.safaricom.mpesa.lifestyle.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;
import kotlin.cancelNotification;
import kotlin.getActiveNotifications;

public class SetPinConfirmPinActivity extends Hilt_SetPinConfirmPinActivity<ActivityBasePinBinding, SetPinViewModel> {
    private static boolean ShareDataUIState;
    private static int[] component1;
    private static char[] component2;
    private static int component3;
    private static char[] component4;
    private static long copy;
    private static boolean copydefault;
    private static int equals;
    private boolean asyncRegisterTag;
    private boolean oneStepRegisterTag;
    private static final byte[] $$l = {19, TarHeader.LF_SYMLINK, -9, 119};
    private static final int $$o = 157;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {111, -53, -88, 102, Ascii.SI, 1, 6, 2, 2, -6, Ascii.FF, 9, -63, Ascii.SI, 1, 6, 2, 2, -6, Ascii.FF, 9, -62, 9, -62, 71, -10, -1, 5, 20, -8, Ascii.DLE, -14, Ascii.SYN, -71, 62, 8, 9, -12, Ascii.DLE, -1, -10, Ascii.SO, -59, 68, 4, -8, Ascii.DLE, -14, Ascii.SYN, -2, 6, 4, -66, 59, 9, 6, Ascii.VT, -19, 4, 13, -4, -52, Ascii.ESC, 41, 6, Ascii.VT, -19, 4, 13, -4, -14, Ascii.DLE, 13, -3, -11, 20, 4, 6, -4, -62, 66, Ascii.SI, 4, Ascii.FF, -18, 4, 4, -2, Ascii.ETB, -6, Ascii.VT};
    private static final int $$t = 57;
    private static final byte[] $$d = {Ascii.SI, -57, -42, 5, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 44;
    private static int hashCode = 1;
    private static int getRequestBeneficiariesState = 0;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r5, short r6, short r7) {
        /*
            int r7 = r7 * 3
            int r0 = r7 + 1
            int r6 = 122 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.register.ui.activity.SetPinConfirmPinActivity.$$l
            int r5 = r5 * 2
            int r5 = 4 - r5
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L20:
            r4 = r1[r5]
            int r3 = r3 + 1
        L24:
            int r5 = r5 + 1
            int r4 = -r4
            int r6 = r6 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SetPinConfirmPinActivity.$$r(int, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r6 = r6 * 2
            int r6 = 103 - r6
            int r0 = r7 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.register.ui.activity.SetPinConfirmPinActivity.$$d
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-8)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SetPinConfirmPinActivity.h(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 9
            int r8 = r8 + 4
            int r7 = r7 * 60
            int r7 = 70 - r7
            int r9 = r9 * 6
            int r9 = 105 - r9
            byte[] r0 = com.huawei.digitalpayment.consumer.register.ui.activity.SetPinConfirmPinActivity.$$s
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r5 = r2
            r9 = r8
            goto L2c
        L17:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L1b:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r9]
        L2c:
            int r8 = r8 + r3
            int r8 = r8 + (-3)
            int r9 = r9 + 1
            r3 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SetPinConfirmPinActivity.j(int, int, short, java.lang.Object[]):void");
    }

    private static void g(char c2, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            int i4 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component4[i2 + i4])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 1758, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 34, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 1159210934, false, $$r(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(copy), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 5);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3608 - (ViewConfiguration.getTouchSlop() >> 8), (Process.myTid() >> 22) + 29, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7171), 1951385784, false, $$r(b4, b5, (byte) (b5 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - TextUtils.indexOf("", "", 0, 0), 24 - ExpandableListView.getPackedPositionGroup(0L), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 27761), -1529629956, false, $$r(b6, b7, b7), new Class[]{Object.class, Object.class});
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
        int i5 = $10 + 117;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (cancelnotification.copydefault < i) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4012, 23 - TextUtils.lastIndexOf("", '0'), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27760), -1529629956, false, $$r(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i7 = $11 + 71;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    private static void i(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = component1;
        int i3 = 684241640;
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $11 + 23;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 4392, TextUtils.indexOf((CharSequence) "", '0') + 38, (char) Color.argb(0, 0, 0, 0), -309236339, false, $$r(b2, (byte) (b2 | Ascii.DLE), b2), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i8++;
                    int i9 = $10 + 45;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    i3 = 684241640;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = component1;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                try {
                    Object[] objArr3 = new Object[i4];
                    objArr3[i5] = Integer.valueOf(iArr5[i11]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) i5;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(i5, i5) + 4391, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 36, (char) ((-1) - Process.getGidForName("")), -309236339, false, $$r(b3, (byte) (b3 | Ascii.DLE), b3), new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i11++;
                    i4 = 1;
                    i5 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        int i12 = i5;
        System.arraycopy(iArr5, i12, iArr4, i12, length2);
        getactivenotifications.component1 = i12;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[i12] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            for (int i13 = 0; i13 < 16; i13++) {
                getactivenotifications.ShareDataUIState ^= iArr4[i13];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2968 - View.combineMeasuredStates(0, 0), Color.green(0) + 16, (char) (49871 - Color.argb(0, 0, 0, 0)), 462826032, false, $$r(b4, (byte) (b4 | Ascii.DC2), b4), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
            }
            int i14 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i14;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i15 = getactivenotifications.ShareDataUIState;
            int i16 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                byte b5 = (byte) 0;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 27637), -1616366948, false, $$r(b5, (byte) (b5 | Ascii.SI), b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            i12 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void f(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component2;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 111;
                $10 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 3760, View.resolveSize(0, 0) + 24, (char) View.MeasureSpec.getMode(0), -1670574543, false, $$r(b2, (byte) (b2 | TarHeader.LF_FIFO), b2), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = 2;
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
        Object[] objArr3 = {Integer.valueOf(component3)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 7140, 13 - Color.blue(0), (char) View.MeasureSpec.getMode(0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        long j = 0;
        if (copydefault) {
            int i7 = $10 + 55;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault3 == null) {
                    byte b3 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 2748, 20 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (7644 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), -327556343, false, $$r(b3, (byte) (b3 | TarHeader.LF_LINK), b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            String str = new String(cArr4);
            int i9 = $10 + 3;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
            return;
        }
        if (!ShareDataUIState) {
            cancelVar.component1 = iArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                cancelVar.component3++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        while (cancelVar.component3 < cancelVar.component1) {
            cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            Object[] objArr5 = {cancelVar, cancelVar};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
            if (objCopydefault4 == null) {
                byte b4 = (byte) 0;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2747 - ImageFormat.getBitsPerPixel(0), 18 - MotionEvent.axisFromString(""), (char) (ExpandableListView.getPackedPositionGroup(j) + 7644), -327556343, false, $$r(b4, (byte) (b4 | TarHeader.LF_LINK), b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            int i10 = $10 + 51;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            j = 0;
        }
        objArr[0] = new String(cArr6);
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952767_res_0x7f13047f).substring(12, 13).length() + 126, new byte[]{-120, -120, -117, -118, -123, -124, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        g((char) (Process.myPid() >> 22), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(22) - 97, ExpandableListView.getPackedPositionChild(0L) + 1, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = getAsAtTimestamp + 21;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952790_res_0x7f130496).substring(7, 8).length() + 126, new byte[]{-125, -127, -117, -124, -110, -111, -112, -114, -122, -113, -122, -114, -118, -115, -121, -116, -116, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                g((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952716_res_0x7f13044c).substring(6, 7).length() + 41526), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131955137_res_0x7f130dc1).substring(0, 3).codePointAt(1) - 97, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952810_res_0x7f1304aa).substring(9, 10).length() + 4, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i4 = getRequestBeneficiariesState + 105;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        try {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 6618, 42 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
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
                    g((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 46), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952016_res_0x7f130190).substring(7, 8).length() + 47, (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer._2131427364_res_0x7f0b0024) & (-3)) + 22, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952716_res_0x7f13044c).substring(6, 7).codePointAt(0) + 95, new byte[]{-103, -102, -103, -108, -101, -103, -108, -102, -101, -104, -101, -98, -100, -127, -109, -125, -107, -99, -99, -104, -107, -103, -101, -118, -118, -107, -125, -117, -100, -118, -101, -106, -100, -102, -101, -102, -108, -125, -118, -101, -108, -106, -104, -106, -100, -101, -106, -108, -118, -118, -102, -103, -105, -107, -104, -109, -118, -118, -105, -106, -107, -108, -125, -109}, null, null, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    g((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952781_res_0x7f13048d).substring(14, 15).length() + 63, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131955137_res_0x7f130dc1).substring(0, 3).codePointAt(1) - 44, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    g((char) (54314 - Drawable.resolveOpacity(0, 0)), (-16777144) - Color.rgb(0, 0, 0), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952747_res_0x7f13046b).substring(22, 23).codePointAt(0) + 103, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954589_res_0x7f130b9d).substring(0, 2).codePointAt(0) + 78, new byte[]{-108, -121, -105, -107, -121, -103}, null, null, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    g((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(11) + 61116), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952847_res_0x7f1304cf).substring(21, 22).length() + 35, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 178, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 6563, TextUtils.lastIndexOf("", '0') + 57, (char) TextUtils.getCapsMode("", 0, 0), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault3 == null) {
            int iMyPid = 2405 - (Process.myPid() >> 22);
            int i6 = 27 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
            Object[] objArr13 = new Object[1];
            h((byte) (-$$d[31]), r3[33], r3[86], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iMyPid, i6, cIndexOf, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2405;
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26;
                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte[] bArr = $$d;
                byte b2 = bArr[31];
                Object[] objArr14 = new Object[1];
                h((byte) (-b2), (byte) (-bArr[8]), (byte) (-b2), objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatDelay, scrollDefaultDelay, fadingEdgeLength, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 98, new byte[]{-93, -117, -114, -120, -112, -94, -121, -95, -126, -127, -96, -121, -127, -113, -127, -97}, null, null, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952716_res_0x7f13044c).substring(6, 7).length() + 126, new byte[]{-117, -125, -123, -91, -110, -120, -127, -92, -112, -114, -122, -114, -126, -117, -125, -122}, null, null, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -1482767810};
                Object[] objArr18 = new Object[1];
                f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952790_res_0x7f130496).substring(7, 8).codePointAt(0) + 95, new byte[]{-125, -127, -117, -124, -110, -111, -112, -114, -122, -113, -122, -114, -118, -115, -121, -116, -116, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                g((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 41526), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952716_res_0x7f13044c).substring(6, 7).codePointAt(0) - 14, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 24, objArr19);
                Object[] objArr20 = new Object[1];
                i(((Context) cls4.getMethod((String) objArr19[0], new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952303_res_0x7f1302af).substring(0, 2).length() + 78, new int[]{-1989713556, 1892250726, -321551162, 1008190948, -714873697, -1618783388, 586681959, -525388037, 1012724204, -1350725867, -1708586776, -1610736245, -814782909, -1726740501, -601994710, -357574232, 2101091131, 1747472706, 509701141, -501265746, 1968838151, 1274219734, -166530061, -1036379171, -16504772, -569667381, -1930555748, -1916502523, 1735860176, -1981809067, 476341128, 2010281766, 895207356, 100694618, -1708586776, -1610736245, 1508984271, -1567981538, -1930555748, -1916502523}, objArr20);
                Class<?> cls5 = Class.forName(((String) objArr20[0]).intern());
                byte b3 = $$s[5];
                byte b4 = b3;
                Object[] objArr21 = new Object[1];
                j(b4, (byte) (b4 - 1), b3, objArr21);
                objArr = (Object[]) cls5.getMethod((String) objArr21[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int i7 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2404;
                    int packedPositionChild = 25 - ExpandableListView.getPackedPositionChild(0L);
                    char size = (char) View.MeasureSpec.getSize(0);
                    byte[] bArr2 = $$d;
                    byte b5 = bArr2[31];
                    Object[] objArr22 = new Object[1];
                    h((byte) (-b5), (byte) (-bArr2[8]), (byte) (-b5), objArr22);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i7, packedPositionChild, size, 24929979, false, (String) objArr22[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr23 = new Object[1];
                    g((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954889_res_0x7f130cc9).substring(0, 1).codePointAt(0) + 28873), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 75, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 214, objArr23);
                    Class<?> cls6 = Class.forName((String) objArr23[0]);
                    Object[] objArr24 = new Object[1];
                    g((char) (Color.argb(0, 0, 0, 0) + 46362), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952717_res_0x7f13044d).substring(6, 7).length() + 14, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952303_res_0x7f1302af).substring(0, 2).length() + 263, objArr24);
                    long jLongValue = ((Long) cls6.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        byte[] bArr3 = $$d;
                        Object[] objArr25 = new Object[1];
                        h(bArr3[33], bArr3[38], bArr3[40], objArr25);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2405 - ((Process.getThreadPriority(0) + 20) >> 6), 26 - View.resolveSizeAndState(0, 0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), -1843538389, false, (String) objArr25[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int iRed = 2405 - Color.red(0);
                        int absoluteGravity = 26 - Gravity.getAbsoluteGravity(0, 0);
                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        Object[] objArr26 = new Object[1];
                        h((byte) (-$$d[31]), r5[33], r5[86], objArr26);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(iRed, absoluteGravity, pressedStateDuration, -2047739879, false, (String) objArr26[0], null);
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
        int i8 = ((int[]) objArr[0])[0];
        int i9 = ((int[]) objArr[2])[0];
        if (i9 != i8) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (Process.myTid() >> 22), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 42, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            try {
                Object[] objArr27 = {1045428189, Long.valueOf(j3), new ArrayList(), null, true};
                Class cls7 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6562 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 56, (char) (ViewConfiguration.getJumpTapTimeout() >> 16));
                byte b6 = $$s[5];
                byte b7 = b6;
                Object[] objArr28 = new Object[1];
                j(b6, b7, b7, objArr28);
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
        this.oneStepRegisterTag = getIntent().getBooleanExtra(KeysConstants.KEY_ONE_STEP_REGISTER_TAG, false);
        this.asyncRegisterTag = getIntent().getBooleanExtra(KeysConstants.KEY_ASYNC_REGISTER_TAG, false);
        addObserve();
    }

    private void addObserve() {
        int i = 2 % 2;
        ((SetPinViewModel) this.viewModel).getData().observe(this, new Observer() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 57;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                SetPinConfirmPinActivity.$r8$lambda$jfkNT23P_8R1Z2rvxbAovmhS6M8(this.f$0, (Resource) obj);
                int i5 = ShareDataUIState + 125;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        int i2 = getAsAtTimestamp + 63;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 43 / 0;
        }
    }

    private void lambda$addObserve$0(Resource resource) {
        int i = 2 % 2;
        Utils.showOrHideLoading((FragmentActivity) this, resource, false);
        if (resource.error()) {
            int i2 = getAsAtTimestamp + 125;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            if (((ICommonService) RouteUtils.getService(ICommonService.class)).dealError(this, resource.getException())) {
                return;
            }
            ((ActivityBasePinBinding) this.binding).etCode.showError(resource.getMessage());
            ((ActivityBasePinBinding) this.binding).etCode.clear();
            return;
        }
        if (resource.success()) {
            LocalLoginInfo localLoginInfo = (LocalLoginInfo) resource.getData();
            if (TextUtils.isEmpty(localLoginInfo.getExecute())) {
                LoginUtils.guideOpenBiometricLogin(((ActivityBasePinBinding) this.binding).etCode.getText().toString(), localLoginInfo);
                return;
            }
            int i4 = getRequestBeneficiariesState + 95;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            RouteUtils.routeWithExecute(this, localLoginInfo.getExecute());
        }
    }

    @Override
    public void onConfirmClick(String str) {
        int i = 2 % 2;
        String strDecrypt = EncryptManager.INSTANCE.decrypt(getIntent().getStringExtra("creationPin"));
        if (!TextUtils.equals(strDecrypt, str)) {
            int i2 = getRequestBeneficiariesState + 33;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            ((ActivityBasePinBinding) this.binding).etCode.showError(getString(com.huawei.digitalpayment.consumer.login.R.string.onboarding_register_pin_tips2));
            ((ActivityBasePinBinding) this.binding).etCode.clear();
            return;
        }
        if (!this.oneStepRegisterTag) {
            ((SetPinViewModel) this.viewModel).setPin(new SetPinParams(EncryptUtils.encryptWithPinKey(strDecrypt)));
            return;
        }
        int i4 = getAsAtTimestamp + 89;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            extras.putString("creationPin", strDecrypt);
        }
        RouteUtils.routeWithExecute(RoutePathConstants.SECURITY_VERIFICATION, extras);
    }

    @Override
    public PinType getPinType() {
        int i = 2 % 2;
        PinType pinType = new PinType(getString(com.huawei.digitalpayment.consumer.login.R.string.onboarding_register_pin_title5), getString(com.huawei.digitalpayment.consumer.login.R.string.onboarding_register_pin_title6), "", getString(com.huawei.digitalpayment.consumer.login.R.string.onboarding_register_pin_button3));
        int i2 = getAsAtTimestamp + 9;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 57 / 0;
        }
        return pinType;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i2 = getRequestBeneficiariesState + 107;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952717_res_0x7f13044d).substring(6, 7).length() + 126, new byte[]{-125, -127, -117, -124, -110, -111, -112, -114, -122, -113, -122, -114, -118, -115, -121, -116, -116, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952767_res_0x7f13047f).substring(12, 13).length() + 41526), 18 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 4 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = getRequestBeneficiariesState + 33;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            baseContext = (!((baseContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - KeyEvent.normalizeMetaState(0), MotionEvent.axisFromString("") + 43, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - ExpandableListView.getPackedPositionGroup(0L), ExpandableListView.getPackedPositionType(0L) + 56, (char) View.MeasureSpec.getMode(0), -699576857, false, "component2", new Class[]{Context.class});
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
        int i6 = getRequestBeneficiariesState + 67;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00fb  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SetPinConfirmPinActivity.onPause():void");
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
            Method dump skipped, instruction units count: 14445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.register.ui.activity.SetPinConfirmPinActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$jfkNT23P_8R1Z2rvxbAovmhS6M8(SetPinConfirmPinActivity setPinConfirmPinActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 5;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        setPinConfirmPinActivity.lambda$addObserve$0(resource);
        int i4 = getRequestBeneficiariesState + 97;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 5;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getAsAtTimestamp + 63;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        equals = 0;
        component1();
        component1 = new int[]{-278945388, 1497117483, -2115742289, 1235330641, -663696935, -1871445917, 1293710088, 104198157, 399807471, -1623519675, 1611181685, -1958746804, 1650990683, 858304400, 1953080213, 1315432232, -152193023, -618987959};
        int i = hashCode + 87;
        equals = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void component1() {
        component2 = new char[]{30675, 30662, 30668, 30658, 30657, 30667, 30598, 30525, 30688, 30669, 30671, 30656, 30707, 30524, 30526, 30523, 30684, 30664, 30594, 30717, 30595, 30592, 30716, 30670, 30715, 30718, 30712, 30674, 30719, 30713, 30666, 30660, 30665, 30685, 30663, 30696, 30701};
        component3 = 321288112;
        ShareDataUIState = true;
        copydefault = true;
        component4 = new char[]{3099, 39798, 8913, 51828, 20982, 44578, 14669, 32961, 26712, 62400, 23410, 8931, 35407, 5625, 64880, 17559, 11291, 46990, 7941, 59051, 20031, 55742, 41254, 3095, 39734, 8885, 51835, 20900, 63772, 32963, 10332, 46990, 24404, 59130, 36476, 5603, 48480, 17549, 60503, 31620, 846, 43713, 12728, 55651, 24744, 2086, 38860, 16154, 50847, 28250, 62849, 40232, 9378, 52286, 23479, 58163, 35470, 4692, 47564, 16704, 59442, 30691, 8056, 42664, 20003, 54684, 32016, 1166, 44036, 15356, 49955, 3142, 39785, 8892, 51833, 20899, 63773, 32914, 10252, 46984, 24404, 59055, 36387, 5613, 48483, 17629, 60419, 31619, 796, 43713, 12728, 55600, 24748, 2088, 38815, 16154, 50883, 28170, 62854, 40238, 9456, 52331, 23479, 58214, 35545, 4615, 47565, 16707, 59503, 30648, 8060, 42665, 20001, 54677, 32018, 1162, 44042, 15354, 49954, 27383, 62056, 39351, 8532, 51411, 20555, 65472, 34539, 11887, 46562, 23844, 58535, 35868, 7063, 41741, 19154, 55348, 20305, 63194, 7751, 34251, 11579, 21669, 64572, 25506, 35624, 13022, 23128, 49603, 26911, 37110, 14462, 45053, 55139, 32492, 58773, 3356, 46214, 56409, 17377, 60202, 4857, 47742, 8685, 18693, 61576, 6150, 36760, 14109, 24246, 50746, 28153, 38207, 15444, 41931, 52033, 29392, 39502, 503, 43386, 53489, 30827, 61319, 5957, 48783, 9754, 19859, 62824, 7337, 33825, 11187, 21132, 64077, 25027, 35153, 12506, 22643, 53245, 30525, 40685, 1582, 44490, 54539, 31873, 58397, 2991, 45886, 55968, 58169, 29717, 52686, 9472, 48781, 5683, 28649, 50980, 22712, 45100, 2519, 24918, 64193, 21077, 44023, 895, 38136, 60514, 17906, 57031, 13853, 36736, 59225, 30895, 53299, 10729, 33059, 6907, 29273, 52188, 9034, 46284, 3100, 26096, 64888, 22246, 40188, 2954, 45579, 23172, 49430, 27049, 4143, 47356, 10042, 53167, 30217, 7933, 34120, 11723, 54391, 31983, 60256, 37847, 14963, 41225, 18826, 61467, 47369, 11897, 38911, 32631, 58619, 19540, 13790, 40305, 705, 59980, 21434, 15147, 41129, 2084, 61847, 3150, 39738, 8892, 51748, 20907, 63768, 32916, 10252, 46983, 24325, 3088, 39734, 8928, 51757, 20977, 63817, 32961, 10254, 47069, 24323, 59049, 36391, 5615, 48480, 17625, 60421, 31696, 842, 43666, 12731, 55651, 24824, 2164, 38813, 16156, 50833, 28171, 62929, 40232, 9456, 52286, 23523, 58223, 35467, 4701, 47561, 16714, 59453, 30645, 7969, 42747, 20004, 54685, 32067, 1241, 44034, 15273, 50037, 27296, 62054, 39346, 8463, 51409, 20510, 65428, 34480, 11885, 46563, 23845, 58530, 35866, 7058, 41819, 19154, 20251, 55403, 25063, 35192, 4851, 47693, 50114, 27476, 62685, 7248, 42413};
        copy = 9190059746937707279L;
    }
}
