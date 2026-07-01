package com.huawei.digitalpayment.consumer.login.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.constant.CacheConstants;
import com.blankj.utilcode.util.KeyboardUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.gson.Gson;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.module.UserLifecycleManager;
import com.huawei.common.util.ViewUtils;
import com.huawei.common.util.color.ColorUtils;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.dialog.SingleSelectDialog;
import com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity;
import com.huawei.digitalpayment.consumer.login.databinding.ActivityNewDeviceBinding;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.IdentityVerifyParams;
import com.huawei.digitalpayment.consumer.loginModule.login.viewmodel.NewDeviceViewModel;
import com.huawei.digitalpayment.consumer.loginModule.register.model.LocalIdType;
import com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyParams;
import com.huawei.digitalpayment.consumer.service.ILoginModuleService;
import com.huawei.digitalpayment.consumer.service.IRiskService;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import com.safaricom.mpesa.lifestyle.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;
import kotlin.getActiveNotifications;

public class NewDeviceActivity extends Hilt_NewDeviceActivity<ActivityNewDeviceBinding, NewDeviceViewModel> {
    private LocalIdType currentIdType;
    private SingleSelectDialog<LocalIdType> dialog;
    private List<LocalIdType> idTypes;
    private String loginType;
    private String newToken;
    private boolean showSelectIdTypeDialog;
    private static final byte[] $$l = {78, -86, -128, -128};
    private static final int $$o = 254;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {69, -50, 81, 75, Ascii.SI, Ascii.DLE, 3, 8, Ascii.DLE, Ascii.NAK, -63, SignedBytes.MAX_POWER_OF_TWO, Ascii.ETB, Ascii.SO, 8, 17, 10, 0, Ascii.DLE, 2, Ascii.EM, -58, SignedBytes.MAX_POWER_OF_TWO, Ascii.DLE, 4, Ascii.CAN, Ascii.VT, 2, Ascii.DC2, Ascii.DC2, -58, 45, 45, 8, 0, Ascii.FS, -7, 13, Ascii.CAN, -20, Ascii.ESC, Ascii.ETB, Ascii.FF, 0, -54, 43, 44, Ascii.FF, 6, Ascii.US, 2, 19, -32, 47, Ascii.SO, 7, Ascii.DC2, Ascii.ETB, 9, Ascii.SO, 10, 10, 2, 20, 17, -55, Ascii.ETB, 9, Ascii.SO, 10, 10, 2, 20, 17, -54, Ascii.ETB, 9, -52, 68, 19, Ascii.VT, 3, Ascii.DLE, 4, -44, 62, Ascii.CAN, 1, Ascii.EM, 8, 5, 6, -43, 74, -1, Ascii.RS, -4, Ascii.CAN, 2, 3, Ascii.SYN, -51, 70, Ascii.DLE, 17, -4, Ascii.CAN, 7, -2, Ascii.SYN, -51, 45, Ascii.FS, Ascii.FS, -4, 13, Ascii.DC2, 0, Ascii.FF, Ascii.NAK, 4, -7, 40, -4, Ascii.FS, Ascii.FF, -3, -17, TarHeader.LF_NORMAL, 17, -40, 60, Ascii.VT, -6, 35, -74, Ascii.CAN, Ascii.ETB, 9, Ascii.SO, 10, 10, 2, 20, 17, -56};
    private static final int $$k = 88;
    private static final byte[] $$d = {77, -67, -125, 9, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 5;
    private static int getAsAtTimestamp = 0;
    private static int equals = 1;
    private static char[] component2 = {30316, 30307, 30313, 30303, 30306, 30308, 30243, 30302, 30333, 30318, 30312, 30304, 30292, 30328, 30239, 30238, 30236, 30237, 30233, 30315, 30228, 30235, 30229, 30319, 30232, 30234, 30297, 30213, 30309, 30222, 30305, 30301, 30335};
    private static int component3 = 321287885;
    private static boolean ShareDataUIState = true;
    private static boolean copydefault = true;
    private static int[] component1 = {890831756, -88904861, -1566487900, -1233621138, -1942118110, -732563843, -1923357319, -2106366949, -1909188778, 1680408754, 768601673, 1531541130, 234538841, 135896022, 1508811389, 1642620798, -21376859, 1381910459};

    private static String $$r(short s, byte b2, short s2) {
        int i = 3 - (s * 4);
        int i2 = s2 * 4;
        byte[] bArr = $$l;
        int i3 = b2 + 68;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i3 += i2;
        }
        while (true) {
            i4++;
            i++;
            bArr2[i4] = (byte) i3;
            if (i4 == i2) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 + 4
            int r6 = r6 * 2
            int r6 = 103 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.login.ui.activity.NewDeviceActivity.$$d
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r8 = r8 + 1
            r3 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2c:
            int r8 = r8 + r6
            int r6 = r8 + (-8)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.NewDeviceActivity.h(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = 137 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.login.ui.activity.NewDeviceActivity.$$j
            int r7 = 63 - r7
            int r9 = r9 * 8
            int r9 = r9 + 99
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            r6 = r9
            r9 = r8
            r8 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L2b:
            int r8 = r8 + 1
            int r9 = r9 + r3
            int r9 = r9 + (-11)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.NewDeviceActivity.i(byte, short, int, java.lang.Object[]):void");
    }

    private static void g(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = component1;
        int i4 = 684241640;
        float f = 0.0f;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 13;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault == null) {
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 4392;
                        int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 38;
                        char c2 = (char) (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1));
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(modifierMetaStateMask, modifierMetaStateMask2, c2, -309236339, false, $$r(b2, (byte) (b2 | 38), b2), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i7++;
                    int i10 = $11 + 51;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    i4 = 684241640;
                    f = 0.0f;
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
            int i12 = 0;
            while (i12 < length3) {
                try {
                    Object[] objArr3 = new Object[i5];
                    objArr3[i6] = Integer.valueOf(iArr5[i12]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) i6;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 4391, (ViewConfiguration.getFadingEdgeLength() >> 16) + 37, (char) KeyEvent.getDeadChar(i6, i6), -309236339, false, $$r(b3, (byte) (b3 | 38), b3), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i12++;
                    i5 = 1;
                    i6 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        getactivenotifications.component1 = i2;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[i2] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                int i15 = $11 + 9;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                getactivenotifications.ShareDataUIState ^= iArr4[i13];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2968 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf("", "", 0, 0) + 16, (char) (KeyEvent.keyCodeFromString("") + 49871), 462826032, false, $$r(b4, (byte) (b4 | 36), b4), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i13++;
            }
            int i17 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i17;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i18 = getactivenotifications.ShareDataUIState;
            int i19 = getactivenotifications.component2;
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
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getTrimmedLength("") + 24, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27637), -1616366948, false, $$r(b5, (byte) (b5 | 39), b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void f(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component2;
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3761 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 24 - TextUtils.indexOf("", "", i3, i3), (char) KeyEvent.keyCodeFromString(""), -1670574543, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    i3 = 0;
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
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 7140, Color.green(0) + 13, (char) Color.blue(0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i5 = 689978476;
        if (!(!copydefault)) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i5);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 5);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetAfter("", 0) + 2748, 19 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (Gravity.getAbsoluteGravity(0, 0) + 7644), -327556343, false, $$r(b4, b5, (byte) (b5 - 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                i5 = 689978476;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (ShareDataUIState) {
            int i6 = $10 + 81;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cancelVar.component1 = cArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 5);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 2749, 19 - View.resolveSize(0, 0), (char) (7643 - TextUtils.indexOf((CharSequence) "", '0')), -327556343, false, $$r(b6, b7, (byte) (b7 - 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i8 = 0;
        cancelVar.component1 = iArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        while (true) {
            cancelVar.component3 = i8;
            if (cancelVar.component3 >= cancelVar.component1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i9 = $11 + 55;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            i8 = cancelVar.component3 + 1;
        }
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 15;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        f(View.MeasureSpec.getMode(0) + 127, new byte[]{-120, -120, -117, -118, -123, -124, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        f((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, new byte[]{-125, -122, -114, -115, -116}, null, null, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952716_res_0x7f13044c).substring(6, 7).length() + 25, new int[]{641928917, 1576585822, 1805437909, -880836873, 357309847, 707734707, -1654597919, -472426493, -185819224, 677788079, -66350146, 1502293057, -795419139, 472730186}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new int[]{498655117, 1686159996, 739049064, 1953280665, 598472172, 1486570319, -1430701416, -1902915460, -26018473, -1560793283}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i4 = equals + 101;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6617 - TextUtils.lastIndexOf("", '0', 0, 0), 42 - ExpandableListView.getPackedPositionGroup(0L), (char) ((-16777216) - Color.rgb(0, 0, 0)), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    g(48 - TextUtils.getCapsMode("", 0, 0), new int[]{-851542620, -858263940, 1449764576, -2040547799, -1033011905, 241158257, 342162123, -241796513, -1655127683, -1350373468, 1417663217, -1497938040, 1730208501, 1477284167, -550894543, 347763444, -991395840, 823585228, -1812397814, -2021769864, 53641648, 1735367127, 800842230, -765547649}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f(127 - Gravity.getAbsoluteGravity(0, 0), new byte[]{-107, -106, -107, -112, -105, -107, -112, -106, -105, -108, -105, -102, -104, -127, -113, -125, -111, -103, -103, -108, -111, -107, -105, -118, -118, -111, -125, -117, -104, -118, -105, -110, -104, -106, -105, -106, -112, -125, -118, -105, -112, -110, -108, -110, -104, -105, -110, -112, -118, -118, -106, -107, -109, -111, -108, -113, -118, -118, -109, -110, -111, -112, -125, -113}, null, null, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 35, new int[]{-1608942829, -1196843557, -1406952865, 1360421215, 820649398, -27341113, 27203146, 748122909, -154784341, -1739454948, 1431551227, -460453217, 932171689, 244129711, -172567269, -1999230381, 1596420890, -512742934, -115045127, -803642626, -1005476070, -415591271, -2090666349, -1937742715, 666098869, -535206786, -1011316743, 119032842, 1869750481, 1287081938, -2003549075, -2109986561}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    g(72 - ((Process.getThreadPriority(0) + 20) >> 6), new int[]{-1674497325, -842470881, -1070531522, 1752022271, -574147058, -748473921, -903817156, 560777763, 483018305, -704777381, -320662136, -1769481680, -1167083900, -8924012, -112641225, 475035949, 1828656957, 2074711027, -1061358271, 822594221, 310096557, -1106998549, -2049747096, -892284910, 163242785, 241807699, -287800501, -1376356881, -2012365468, 603836425, -2011127507, 857659171, 803896339, -1042853384, 2114326206, -1238441625}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f((((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer._2131427364_res_0x7f0b0024) & (-3)) + 126, new byte[]{-112, -121, -109, -111, -121, -107}, null, null, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 7, new int[]{-1198733463, 1886981644, 308256134, -333787734, -640330370, 468150948, 706659979, -986418686, -1927648993, -18197520, 1112453014, -1639891807, 379681569, 1138559048, 1770039561, 1206107460, -1540937767, 561163376}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6561 - Process.getGidForName(""), (Process.myTid() >> 22) + 56, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                    int i6 = equals + 61;
                    getAsAtTimestamp = i6 % 128;
                    int i7 = i6 % 2;
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
            int i8 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2404;
            int iRgb = (-16777190) - Color.rgb(0, 0, 0);
            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
            byte[] bArr = $$d;
            Object[] objArr13 = new Object[1];
            h(bArr[31], bArr[33], bArr[12], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i8, iRgb, threadPriority, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 2405;
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26;
                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte b2 = $$d[31];
                Object[] objArr14 = new Object[1];
                h(b2, r6[8], b2, objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(tapTimeout, keyRepeatTimeout, windowTouchSlop, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 13, new int[]{527732498, 710922495, -1297838376, 130126481, -485227674, -1699685594, 1798794489, 1109538715}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 98, new byte[]{-117, -125, -123, -98, -99, -120, -127, -100, -115, -101, -122, -101, -126, -117, -125, -122}, null, null, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -655707179};
                byte[] bArr2 = $$j;
                Object[] objArr18 = new Object[1];
                i(bArr2[58], (short) 133, bArr2[87], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                i((byte) 53, (short) ($$k & 500), bArr2[17], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int iMyTid = (Process.myTid() >> 22) + 2405;
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26;
                    char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    byte b3 = $$d[31];
                    Object[] objArr20 = new Object[1];
                    h(b3, r7[8], b3, objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iMyTid, scrollDefaultDelay, c2, 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 89, new int[]{641928917, 1576585822, 1805437909, -880836873, -832175515, 1018911140, 1419657958, 1274817976, 1805870688, -361353927, 746497285, -614060499}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(15) + 15, new byte[]{-117, -116, -122, -101, -97, -127, -117, -95, -125, -117, -120, -96, -127, -97, -117}, null, null, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int iMakeMeasureSpec = 2405 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int iGreen = 26 - Color.green(0);
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                        Object[] objArr23 = new Object[1];
                        h(r10[33], (byte) (-$$d[38]), r10[9], objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iMakeMeasureSpec, iGreen, cLastIndexOf, -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int defaultSize = 2405 - View.getDefaultSize(0, 0);
                        int iAxisFromString = 25 - MotionEvent.axisFromString("");
                        char c3 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                        byte[] bArr3 = $$d;
                        Object[] objArr24 = new Object[1];
                        h(bArr3[31], bArr3[33], bArr3[12], objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(defaultSize, iAxisFromString, c3, -2047739879, false, (String) objArr24[0], null);
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
        if (i10 == i9) {
            int i11 = equals + 115;
            getAsAtTimestamp = i11 % 128;
            int i12 = i11 % 2;
        } else {
            long j = -1;
            long j2 = ((long) (i10 ^ i9)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getScrollBarSize() >> 8), ExpandableListView.getPackedPositionGroup(0L) + 42, (char) (KeyEvent.getMaxKeyCode() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            try {
                Object[] objArr25 = {-495890709, Long.valueOf(j4), new ArrayList(), null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 6562, 56 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                Object[] objArr26 = new Object[1];
                i((byte) 53, (short) ($$j[102] + 1), r6[17], objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        ViewUtils.softInputAdjustResize(getWindow(), ((ActivityNewDeviceBinding) this.binding).getRoot());
        ((ActivityNewDeviceBinding) this.binding).llTips.setBackgroundColor(ColorUtils.INSTANCE.withAlpha(0.2f, com.blankj.utilcode.util.ColorUtils.getColor(com.huawei.digitalpayment.consumer.login.R.color.colorWarningDisable)));
        this.loginType = getIntent().getStringExtra(KeysConstants.KEY_LOGIN_TYPE);
        this.newToken = getIntent().getStringExtra("token");
        initEvent();
        ((ActivityNewDeviceBinding) this.binding).btnConfirm.setEnabled(false);
        queryDataDict(false);
        addObserver();
    }

    private void queryDataDict(boolean z) {
        int i = 2 % 2;
        int i2 = equals + 57;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            this.showSelectIdTypeDialog = z;
            ((NewDeviceViewModel) this.viewModel).queryDataDict();
            int i3 = getAsAtTimestamp + 25;
            equals = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 88 / 0;
                return;
            }
            return;
        }
        this.showSelectIdTypeDialog = z;
        ((NewDeviceViewModel) this.viewModel).queryDataDict();
        throw null;
    }

    private void addObserver() {
        int i = 2 % 2;
        ((NewDeviceViewModel) this.viewModel).getData().observe(this, new Observer() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 117;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                NewDeviceActivity.$r8$lambda$IUwDnK8I5quQzq3QoWG6iXKxdH0(this.f$0, (Resource) obj);
                if (i4 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        ((NewDeviceViewModel) this.viewModel).getDataDict().observe(this, new Observer() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 93;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                NewDeviceActivity.$r8$lambda$PjPF8uqBLf1_R2guuBnc50t_4sY(this.f$0, (Resource) obj);
                int i5 = component2 + 19;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = getAsAtTimestamp + 19;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private void lambda$addObserver$0(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = equals + 91;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        ((NewDeviceViewModel) this.viewModel).cancel();
        int i4 = equals + 3;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void lambda$addObserver$1(Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 121;
        getAsAtTimestamp = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (resource.loading()) {
                if (this.showSelectIdTypeDialog) {
                    Utils.showOrHideLoading(this, resource, new DialogInterface.OnCancelListener() {
                        private static int component1 = 1;
                        private static int copydefault;

                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            int i3 = 2 % 2;
                            int i4 = component1 + 39;
                            copydefault = i4 % 128;
                            int i5 = i4 % 2;
                            NewDeviceActivity.m10636$r8$lambda$q83og4awJIfk64YPMN1OT3EGd8(this.f$0, dialogInterface);
                            if (i5 != 0) {
                                int i6 = 56 / 0;
                            }
                        }
                    });
                }
            } else {
                Utils.showOrHideLoading(this, resource);
            }
            if (!resource.error()) {
                if (resource.success()) {
                    DialogManager.hideLoading(this);
                    List<LocalIdType> list = (List) resource.getData();
                    this.idTypes = list;
                    if (list.isEmpty()) {
                        return;
                    }
                    this.currentIdType = this.idTypes.get(0);
                    ((ActivityNewDeviceBinding) this.binding).idType.getEditText().setText(this.currentIdType.getShowContext());
                    if (this.showSelectIdTypeDialog) {
                        showSelectIdType();
                        this.showSelectIdTypeDialog = false;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = equals + 95;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 == 0) {
                if (this.showSelectIdTypeDialog) {
                    Utils.toastError(resource);
                    this.showSelectIdTypeDialog = false;
                    return;
                }
                return;
            }
            obj.hashCode();
            throw null;
        }
        resource.loading();
        throw null;
    }

    private void lambda$onLoginResponse$2(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = equals + 55;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        ((NewDeviceViewModel) this.viewModel).cancel();
        int i4 = getAsAtTimestamp + 39;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    private void onLoginResponse(Resource<LocalLoginInfo> resource) {
        int i = 2 % 2;
        Utils.showOrHideLoading(this, resource, new DialogInterface.OnCancelListener() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                int i2 = 2 % 2;
                int i3 = component1 + 43;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                NewDeviceActivity.$r8$lambda$I_SRKDBxnloIvNkVGm43Rl3_lHY(this.f$0, dialogInterface);
                int i5 = component1 + 97;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        Utils.toastError(resource);
        if (resource.success()) {
            int i2 = equals + 1;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            LocalLoginInfo data = resource.getData();
            if (!TextUtils.isEmpty(data.getExecute())) {
                DialogManager.hideLoading(this);
                RouteUtils.routeWithExecute(this, data.getExecute());
                finish();
                return;
            }
            UserLifecycleManager.get().loginSuccess(this, new Gson().toJson(data), false);
            RouteUtils.routeWithExecute(RoutePathConstants.MAIN);
        }
        int i4 = equals + 95;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 85;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = com.huawei.digitalpayment.consumer.login.R.layout.activity_new_device;
            throw null;
        }
        int i4 = com.huawei.digitalpayment.consumer.login.R.layout.activity_new_device;
        int i5 = equals + 103;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    private void lambda$initEvent$3(View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 39;
        equals = i2 % 128;
        int i3 = i2 % 2;
        preShowSelectIdType();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void initEvent() {
        int i = 2 % 2;
        ((ActivityNewDeviceBinding) this.binding).idNumber.getEditText().addTextChangedListener(new MPTextWatcher() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                int i5 = 2 % 2;
                int i6 = component2 + 1;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                super.onTextChanged(charSequence, i2, i3, i4);
                NewDeviceActivity.m10638$$Nest$mcheckConfirmClickable(NewDeviceActivity.this);
                int i8 = component1 + 11;
                component2 = i8 % 128;
                if (i8 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        ((ActivityNewDeviceBinding) this.binding).idType.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component3 + 75;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                NewDeviceActivity.$r8$lambda$zZ179E2e4o75Iwy_q7rKzCSo56E(this.f$0, view);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        ((ActivityNewDeviceBinding) this.binding).idType.getEditText().setEnabled(false);
        ((ActivityNewDeviceBinding) this.binding).btnConfirm.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component1 + 11;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    NewDeviceActivity.$r8$lambda$WtxpvwRTUEUQ1KTM6EQhhrPlnm8(this.f$0, view);
                    throw null;
                }
                NewDeviceActivity.$r8$lambda$WtxpvwRTUEUQ1KTM6EQhhrPlnm8(this.f$0, view);
                int i4 = component1 + 19;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = getAsAtTimestamp + 53;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private void lambda$initEvent$4(View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 7;
        equals = i2 % 128;
        int i3 = i2 % 2;
        newDevice();
        int i4 = getAsAtTimestamp + 117;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    private void preShowSelectIdType() {
        int i = 2 % 2;
        int i2 = equals + 19;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            if (this.idTypes != null) {
                showSelectIdType();
                int i3 = getAsAtTimestamp + 41;
                equals = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 / 2;
                    return;
                }
                return;
            }
            queryDataDict(true);
            return;
        }
        throw null;
    }

    private void checkConfirmClickable() {
        int i = 2 % 2;
        int i2 = equals + 37;
        getAsAtTimestamp = i2 % 128;
        ((ActivityNewDeviceBinding) this.binding).btnConfirm.setEnabled(i2 % 2 != 0 ? checkIDNumber() : !checkIDNumber());
    }

    private boolean checkIDNumber() {
        int i = 2 % 2;
        int i2 = equals + 93;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        if (this.currentIdType == null) {
            int i5 = i3 + 61;
            equals = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 47 / 0;
            }
            return true;
        }
        if (!TextUtils.isEmpty(((ActivityNewDeviceBinding) this.binding).idNumber.getText().trim())) {
            return false;
        }
        int i7 = getAsAtTimestamp + 123;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    private void newDevice() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 89;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            KeyboardUtils.hideSoftInput(this);
            String strTrim = ((String) Objects.requireNonNull(((ActivityNewDeviceBinding) this.binding).idNumber.getText().trim())).trim();
            if (this.loginType != null) {
                ProcessVerifyParams processVerifyParams = new ProcessVerifyParams(this.loginType);
                processVerifyParams.setIdType(this.currentIdType.getId());
                processVerifyParams.setIdNo(strTrim);
                if (!TextUtils.isEmpty(this.newToken)) {
                    processVerifyParams.setToken(this.newToken);
                }
                doRiskProcess(processVerifyParams);
                int i3 = equals + 89;
                getAsAtTimestamp = i3 % 128;
                int i4 = i3 % 2;
            } else {
                ((NewDeviceViewModel) this.viewModel).identityVerifyAndLogin(new IdentityVerifyParams(this.currentIdType.getId(), strTrim));
            }
            int i5 = getAsAtTimestamp + 115;
            equals = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        KeyboardUtils.hideSoftInput(this);
        ((String) Objects.requireNonNull(((ActivityNewDeviceBinding) this.binding).idNumber.getText().trim())).trim();
        throw null;
    }

    private void doRiskProcess(ProcessVerifyParams processVerifyParams) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putSerializable(KeysConstants.KEY_RISK_PARAMS, processVerifyParams);
        ((IRiskService) RouteUtils.getService(IRiskService.class)).startProcess(bundle, new ApiCallback<Bundle>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public void onSuccess(Bundle bundle2) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 5;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                component2(bundle2);
                int i5 = ShareDataUIState + 57;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 3 / 0;
                }
            }

            public void component2(Bundle bundle2) {
                int i2 = 2 % 2;
                String string = bundle2.getString(KeysConstants.KEY_FORWARD);
                if (TextUtils.isEmpty(string) || !string.endsWith(RoutePathConstants.NEW_MAIN)) {
                    RouteUtils.routeWithExecute(NewDeviceActivity.this, string, bundle2);
                } else {
                    int i3 = ShareDataUIState + 113;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    NewDeviceActivity.m10637$$Nest$mautoLogin(NewDeviceActivity.this);
                }
                int i5 = ShareDataUIState + 123;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 51;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    NewDeviceActivity.m10639$$Nest$monLoginResponse(NewDeviceActivity.this, Resource.error(baseException, null));
                    int i4 = 77 / 0;
                } else {
                    NewDeviceActivity.m10639$$Nest$monLoginResponse(NewDeviceActivity.this, Resource.error(baseException, null));
                }
                int i5 = ShareDataUIState + 23;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 83 / 0;
                }
            }
        });
        int i2 = getAsAtTimestamp + 83;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void autoLogin() {
        int i = 2 % 2;
        Object obj = null;
        onLoginResponse(Resource.loading(null));
        ((ILoginModuleService) RouteUtils.getService(ILoginModuleService.class)).autoLogin(new ApiCallback<BaseResp>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 103;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                component1(baseResp);
                if (i4 == 0) {
                    int i5 = 99 / 0;
                }
            }

            public void component1(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 73;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                if (!(!(baseResp instanceof LocalLoginInfo))) {
                    NewDeviceActivity.m10639$$Nest$monLoginResponse(NewDeviceActivity.this, Resource.success((LocalLoginInfo) baseResp));
                } else {
                    NewDeviceActivity.m10639$$Nest$monLoginResponse(NewDeviceActivity.this, Resource.error(new BaseException(NewDeviceActivity.this.getString(com.huawei.digitalpayment.consumer.login.R.string.login_auto_login_failed)), null));
                    int i5 = component2 + 115;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                }
                int i7 = copydefault + 85;
                component2 = i7 % 128;
                int i8 = i7 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 51;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                NewDeviceActivity.m10639$$Nest$monLoginResponse(NewDeviceActivity.this, Resource.error(baseException, null));
                int i5 = component2 + 39;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = equals + 85;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void lambda$showSelectIdType$5(LocalIdType localIdType) {
        int i = 2 % 2;
        int i2 = equals + 101;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        this.dialog.dismiss();
        this.currentIdType = localIdType;
        ((ActivityNewDeviceBinding) this.binding).idType.getEditText().setText(localIdType.getName());
        int i4 = equals + 3;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    private void showSelectIdType() {
        int i = 2 % 2;
        SingleSelectDialog<LocalIdType> singleSelectDialog = new SingleSelectDialog<>(getString(com.huawei.digitalpayment.consumer.login.R.string.onboarding_register_kyc_title3), getString(com.huawei.digitalpayment.consumer.login.R.string.onboarding_register_kyc_button2), this.idTypes, new SingleSelectDialog.OnItemSelectedListener() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public final void onItemSelected(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 41;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    NewDeviceActivity.$r8$lambda$C5kfYa9DQnSt2M8MjP8l3ERWL5M(this.f$0, (LocalIdType) obj);
                    int i4 = 99 / 0;
                } else {
                    NewDeviceActivity.$r8$lambda$C5kfYa9DQnSt2M8MjP8l3ERWL5M(this.f$0, (LocalIdType) obj);
                }
                int i5 = component2 + 47;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        }, this.currentIdType);
        this.dialog = singleSelectDialog;
        singleSelectDialog.show(getSupportFragmentManager(), CheckIdentityActivity.ID_TYPE);
        int i2 = equals + 19;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = getAsAtTimestamp + 97;
            equals = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 3, new int[]{641928917, 1576585822, 1805437909, -880836873, 357309847, 707734707, -1654597919, -472426493, -185819224, 677788079, -66350146, 1502293057, -795419139, 472730186}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 96, new int[]{498655117, 1686159996, 739049064, 1953280665, 598472172, 1486570319, -1430701416, -1902915460, -26018473, -1560793283}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = getAsAtTimestamp + 63;
            equals = i4 % 128;
            int i5 = i4 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i6 = getAsAtTimestamp + 65;
            equals = i6 % 128;
            try {
                if (i6 % 2 == 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 6618, TextUtils.indexOf("", "", 0, 0) + 42, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6561, 56 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewConfiguration.getLongPressTimeout() >> 16), -699576857, false, "component2", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    throw null;
                }
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(6617 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 42 - Color.alpha(0), (char) (Process.getGidForName("") + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 6562, (Process.myTid() >> 22) + 56, (char) (TextUtils.lastIndexOf("", '0') + 1), -699576857, false, "component2", new Class[]{Context.class});
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
        int i7 = getAsAtTimestamp + 49;
        equals = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 3, new int[]{641928917, 1576585822, 1805437909, -880836873, 357309847, 707734707, -1654597919, -472426493, -185819224, 677788079, -66350146, 1502293057, -795419139, 472730186}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(18 - View.combineMeasuredStates(0, 0), new int[]{498655117, 1686159996, 739049064, 1953280665, 598472172, 1486570319, -1430701416, -1902915460, -26018473, -1560793283}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i2 = getAsAtTimestamp + 43;
            equals = i2 % 128;
            int i3 = i2 % 2;
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = getAsAtTimestamp + 35;
            equals = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getPressedStateDuration() >> 16), 42 - KeyEvent.normalizeMetaState(0), (char) (ViewConfiguration.getTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6561, Color.blue(0) + 56, (char) Color.green(0), -960739708, false, "component3", new Class[]{Context.class});
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

    /* JADX WARN: Can't wrap try/catch for region: R(56:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|825|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|(10:768|32|(2:846|34)|38|39|816|(5:41|42|(1:44)|45|46)(21:47|48|836|49|(2:774|51)|55|56|821|57|(2:784|59)|63|64|65|(1:67)|68|69|70|(1:72)|73|(1:75)|76)|77|(6:81|82|(3:853|84|856)(12:852|85|(3:87|(3:90|91|88)|857)|92|800|93|(1:95)|96|97|790|98|855)|854|78|79)|851)|139|(8:783|140|(1:142)|143|(3:145|(1:147)|148)(14:150|151|772|152|(1:154)|155|156|157|(1:159)|160|(1:162)|163|(1:165)|166)|149|167|(9:170|849|171|(1:173)|174|175|176|830|177))|178|(40:778|209|(2:211|(2:213|(2:215|219)(1:216))(2:217|218))(1:219)|256|777|257|(1:259)|260|(3:262|(1:264)|265)(19:266|267|764|268|(1:270)|271|272|834|273|(1:275)|276|277|278|(1:280)|281|(1:283)(1:284)|285|(1:287)|288)|289|(4:293|(2:295|860)(11:296|(3:298|(3:301|302|299)|861)|303|817|304|(1:306)|307|308|802|309|859)|310|290)|858|292|344|767|345|(1:347)|348|(1:350)|351|(3:353|(1:355)|356)(18:357|(2:359|(1:365)(1:364))(1:366)|(18:368|842|369|(1:371)|372|373|826|374|(1:376)|377|378|379|(1:381)|382|(1:384)(1:385)|386|(1:388)|389)|448|(1:450)|451|(3:453|(1:455)|456)(14:457|458|(1:460)|461|462|(1:464)|465|792|466|467|(1:469)|470|(1:472)|473)|474|(1:476)(9:477|(3:479|(2:482|480)|877)|483|484|(1:486)|487|(1:489)|490|491)|492|(1:494)|495|(1:497)|498|(3:500|(1:502)|503)(16:505|506|(1:508)|509|(1:511)|512|513|(1:515)|516|810|517|518|(1:520)|521|(1:523)|524)|504|525|(28:527|781|528|(2:838|530)|534|(1:536)|537|538|776|(4:540|541|(1:543)|544)(18:545|(2:547|(1:553)(1:552))|(19:555|556|847|557|(2:788|559)|563|564|828|565|(2:832|567)|571|572|573|(2:575|576)|577|(2:579|580)|581|(1:583)|584)|639|654|(1:656)|657|(3:659|(1:661)|662)(13:664|770|665|666|(1:668)|669|796|670|671|(1:673)|674|(1:676)|677)|663|678|(6:681|682|(1:684)|685|686|687)|688|(1:690)|691|(3:693|(1:695)|696)(14:698|699|(1:701)|702|703|(1:705)|706|786|707|708|(1:710)|711|(1:713)|714)|697|715|(1:878)(7:718|719|(1:721)|722|723|724|725))|585|(4:588|(2:590|(2:595|873)(11:596|(5:598|(1:600)(1:601)|875|(3:604|605|602)|874)|606|814|607|(1:609)|610|611|798|612|872))(2:593|(0)(0))|613|586)|871|639|654|(0)|657|(0)(0)|663|678|(0)|688|(0)|691|(0)(0)|697|715|(0)(0))(10:735|(3:737|(2:740|738)|876)|741|742|(1:744)|745|(1:747)|748|749|750))|390|(4:394|(2:396|864)(11:397|(3:399|(4:402|(3:867|404|870)(4:866|405|406|869)|868|400)|865)|407|812|408|(1:410)|411|412|794|413|863)|414|391)|862|393|448|(0)|451|(0)(0)|474|(0)(0)|492|(0)|495|(0)|498|(0)(0)|504|525|(0)(0))(1:223)|224|819|225|(1:227)|228|806|229|(1:231)|232|256|777|257|(0)|260|(0)(0)|289|(1:290)|858|292|344|767|345|(0)|348|(0)|351|(0)(0)|390|(1:391)|862|393|448|(0)|451|(0)(0)|474|(0)(0)|492|(0)|495|(0)|498|(0)(0)|504|525|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(65:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|825|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|768|32|(2:846|34)|38|39|816|(5:41|42|(1:44)|45|46)(21:47|48|836|49|(2:774|51)|55|56|821|57|(2:784|59)|63|64|65|(1:67)|68|69|70|(1:72)|73|(1:75)|76)|77|(6:81|82|(3:853|84|856)(12:852|85|(3:87|(3:90|91|88)|857)|92|800|93|(1:95)|96|97|790|98|855)|854|78|79)|851|139|(8:783|140|(1:142)|143|(3:145|(1:147)|148)(14:150|151|772|152|(1:154)|155|156|157|(1:159)|160|(1:162)|163|(1:165)|166)|149|167|(9:170|849|171|(1:173)|174|175|176|830|177))|178|(40:778|209|(2:211|(2:213|(2:215|219)(1:216))(2:217|218))(1:219)|256|777|257|(1:259)|260|(3:262|(1:264)|265)(19:266|267|764|268|(1:270)|271|272|834|273|(1:275)|276|277|278|(1:280)|281|(1:283)(1:284)|285|(1:287)|288)|289|(4:293|(2:295|860)(11:296|(3:298|(3:301|302|299)|861)|303|817|304|(1:306)|307|308|802|309|859)|310|290)|858|292|344|767|345|(1:347)|348|(1:350)|351|(3:353|(1:355)|356)(18:357|(2:359|(1:365)(1:364))(1:366)|(18:368|842|369|(1:371)|372|373|826|374|(1:376)|377|378|379|(1:381)|382|(1:384)(1:385)|386|(1:388)|389)|448|(1:450)|451|(3:453|(1:455)|456)(14:457|458|(1:460)|461|462|(1:464)|465|792|466|467|(1:469)|470|(1:472)|473)|474|(1:476)(9:477|(3:479|(2:482|480)|877)|483|484|(1:486)|487|(1:489)|490|491)|492|(1:494)|495|(1:497)|498|(3:500|(1:502)|503)(16:505|506|(1:508)|509|(1:511)|512|513|(1:515)|516|810|517|518|(1:520)|521|(1:523)|524)|504|525|(28:527|781|528|(2:838|530)|534|(1:536)|537|538|776|(4:540|541|(1:543)|544)(18:545|(2:547|(1:553)(1:552))|(19:555|556|847|557|(2:788|559)|563|564|828|565|(2:832|567)|571|572|573|(2:575|576)|577|(2:579|580)|581|(1:583)|584)|639|654|(1:656)|657|(3:659|(1:661)|662)(13:664|770|665|666|(1:668)|669|796|670|671|(1:673)|674|(1:676)|677)|663|678|(6:681|682|(1:684)|685|686|687)|688|(1:690)|691|(3:693|(1:695)|696)(14:698|699|(1:701)|702|703|(1:705)|706|786|707|708|(1:710)|711|(1:713)|714)|697|715|(1:878)(7:718|719|(1:721)|722|723|724|725))|585|(4:588|(2:590|(2:595|873)(11:596|(5:598|(1:600)(1:601)|875|(3:604|605|602)|874)|606|814|607|(1:609)|610|611|798|612|872))(2:593|(0)(0))|613|586)|871|639|654|(0)|657|(0)(0)|663|678|(0)|688|(0)|691|(0)(0)|697|715|(0)(0))(10:735|(3:737|(2:740|738)|876)|741|742|(1:744)|745|(1:747)|748|749|750))|390|(4:394|(2:396|864)(11:397|(3:399|(4:402|(3:867|404|870)(4:866|405|406|869)|868|400)|865)|407|812|408|(1:410)|411|412|794|413|863)|414|391)|862|393|448|(0)|451|(0)(0)|474|(0)(0)|492|(0)|495|(0)|498|(0)(0)|504|525|(0)(0))(1:223)|224|819|225|(1:227)|228|806|229|(1:231)|232|256|777|257|(0)|260|(0)(0)|289|(1:290)|858|292|344|767|345|(0)|348|(0)|351|(0)(0)|390|(1:391)|862|393|448|(0)|451|(0)(0)|474|(0)(0)|492|(0)|495|(0)|498|(0)(0)|504|525|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x13ab, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x13ac, code lost:
    
        r5 = new java.lang.Object[1];
        g((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 10, new int[]{1058665896, -1459064007, -686228509, 653984916, 1414699770, 1739913772}, r5);
        r3 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x13c7, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x13de, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x13e2, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r14 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r14 - ((r14 >> 63) << 32)));
        r14 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r14 - ((r14 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x1411, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x1415, code lost:
    
        if (r5 == null) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x1417, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - android.text.TextUtils.getOffsetBefore("", 0), 43 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x1444, code lost:
    
        r5 = ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x144c, code lost:
    
        r7 = new java.lang.Object[]{1343528050, java.lang.Long.valueOf(r3), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6563 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), 55 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
        r8 = new java.lang.Object[1];
        i((byte) 53, (short) (com.huawei.digitalpayment.consumer.login.ui.activity.NewDeviceActivity.$$j[102(0x66, float:1.43E-43)] + 1), r3[17], r8);
        r1.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x1a26, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x1a27, code lost:
    
        r5 = new java.lang.Object[1];
        f(((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954659_res_0x7f130be3).substring(6, 9).codePointAt(1) + 11, new byte[]{-105, -106, -112, -105, -112, -102, -107, -103, -112, -109, -112}, null, null, r5);
        r3 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x1a6d, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x1a84, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x1a88, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r14 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r14 - ((r14 >> 63) << 32)));
        r14 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r14 - ((r14 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x1ab7, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x1abb, code lost:
    
        if (r5 == null) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x1abd, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.graphics.Color.argb(0, 0, 0, 0) + 6618, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 42, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x1ae5, code lost:
    
        r5 = ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x1aed, code lost:
    
        r7 = new java.lang.Object[]{1343528050, java.lang.Long.valueOf(r3), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 6563, 56 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) android.view.View.resolveSize(0, 0));
        r8 = new java.lang.Object[1];
        i((byte) 53, (short) (com.huawei.digitalpayment.consumer.login.ui.activity.NewDeviceActivity.$$j[102(0x66, float:1.43E-43)] + 1), r3[17], r8);
        r1.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r5, r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x07d5 A[Catch: all -> 0x0350, TryCatch #34 {all -> 0x0350, blocks: (B:648:0x2af6, B:650:0x2afc, B:651:0x2b26, B:682:0x2e24, B:684:0x2e2a, B:685:0x2e57, B:719:0x316c, B:721:0x3172, B:722:0x3197, B:699:0x2fb2, B:701:0x2fd5, B:702:0x3029, B:742:0x3268, B:744:0x326e, B:745:0x3299, B:747:0x32d3, B:748:0x3315, B:506:0x227b, B:508:0x2290, B:509:0x22be, B:511:0x22f2, B:512:0x236a, B:484:0x1f44, B:486:0x1f4a, B:487:0x1f72, B:489:0x1fac, B:490:0x1ff3, B:458:0x1c8e, B:460:0x1ca3, B:461:0x1cd7, B:442:0x1ab7, B:444:0x1abd, B:445:0x1ae5, B:338:0x1411, B:340:0x1417, B:341:0x1444, B:250:0x0ee3, B:252:0x0ee9, B:253:0x0f12, B:201:0x0c82, B:203:0x0c88, B:204:0x0cb6, B:133:0x07cf, B:135:0x07d5, B:136:0x0801, B:19:0x0177, B:21:0x017d, B:22:0x01a7, B:24:0x02bf, B:26:0x02f0, B:27:0x034a), top: B:825:0x0177 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x088b A[Catch: all -> 0x0bf3, TryCatch #12 {all -> 0x0bf3, blocks: (B:140:0x0885, B:142:0x088b, B:143:0x08d2, B:145:0x08df, B:147:0x08e8, B:148:0x092e, B:167:0x0ae6, B:175:0x0b50, B:181:0x0bd7, B:183:0x0bdd, B:184:0x0bde, B:186:0x0be0, B:188:0x0be7, B:189:0x0be8, B:150:0x093a, B:157:0x09c4, B:159:0x09ca, B:160:0x0a12, B:162:0x0a3c, B:163:0x0a83, B:165:0x0a99, B:166:0x0ade, B:191:0x0bea, B:193:0x0bf1, B:194:0x0bf2, B:152:0x095a, B:154:0x096c, B:155:0x09b8, B:177:0x0b56, B:171:0x0b19, B:173:0x0b1f, B:174:0x0b49), top: B:783:0x0885, outer: #1, inners: #5, #37, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x08df A[Catch: all -> 0x0bf3, TryCatch #12 {all -> 0x0bf3, blocks: (B:140:0x0885, B:142:0x088b, B:143:0x08d2, B:145:0x08df, B:147:0x08e8, B:148:0x092e, B:167:0x0ae6, B:175:0x0b50, B:181:0x0bd7, B:183:0x0bdd, B:184:0x0bde, B:186:0x0be0, B:188:0x0be7, B:189:0x0be8, B:150:0x093a, B:157:0x09c4, B:159:0x09ca, B:160:0x0a12, B:162:0x0a3c, B:163:0x0a83, B:165:0x0a99, B:166:0x0ade, B:191:0x0bea, B:193:0x0bf1, B:194:0x0bf2, B:152:0x095a, B:154:0x096c, B:155:0x09b8, B:177:0x0b56, B:171:0x0b19, B:173:0x0b1f, B:174:0x0b49), top: B:783:0x0885, outer: #1, inners: #5, #37, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x093a A[Catch: all -> 0x0bf3, TRY_LEAVE, TryCatch #12 {all -> 0x0bf3, blocks: (B:140:0x0885, B:142:0x088b, B:143:0x08d2, B:145:0x08df, B:147:0x08e8, B:148:0x092e, B:167:0x0ae6, B:175:0x0b50, B:181:0x0bd7, B:183:0x0bdd, B:184:0x0bde, B:186:0x0be0, B:188:0x0be7, B:189:0x0be8, B:150:0x093a, B:157:0x09c4, B:159:0x09ca, B:160:0x0a12, B:162:0x0a3c, B:163:0x0a83, B:165:0x0a99, B:166:0x0ade, B:191:0x0bea, B:193:0x0bf1, B:194:0x0bf2, B:152:0x095a, B:154:0x096c, B:155:0x09b8, B:177:0x0b56, B:171:0x0b19, B:173:0x0b1f, B:174:0x0b49), top: B:783:0x0885, outer: #1, inners: #5, #37, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0af8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0d70  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0d87 A[Catch: all -> 0x0e4d, TryCatch #31 {all -> 0x0e4d, blocks: (B:225:0x0d72, B:227:0x0d87, B:228:0x0db8), top: B:819:0x0d72, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0dcb A[Catch: all -> 0x0e43, TryCatch #24 {all -> 0x0e43, blocks: (B:229:0x0dbe, B:231:0x0dcb, B:232:0x0e3b), top: B:806:0x0dbe, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0f9e A[Catch: all -> 0x13ab, TryCatch #8 {all -> 0x13ab, blocks: (B:257:0x0f98, B:259:0x0f9e, B:260:0x0fe1, B:262:0x0fee, B:264:0x0ff7, B:265:0x103b, B:289:0x1268, B:290:0x126c, B:293:0x1275, B:296:0x128e, B:299:0x129b, B:301:0x129e, B:313:0x1385, B:315:0x138b, B:316:0x138c, B:318:0x138e, B:320:0x1395, B:321:0x1396, B:266:0x1046, B:278:0x114d, B:280:0x1153, B:281:0x1196, B:283:0x11c0, B:285:0x1207, B:287:0x121d, B:288:0x1260, B:323:0x1398, B:325:0x139f, B:326:0x13a0, B:328:0x13a2, B:330:0x13a9, B:331:0x13aa, B:268:0x1066, B:270:0x107b, B:271:0x10af, B:309:0x1306, B:304:0x12cd, B:306:0x12d3, B:307:0x12fe, B:273:0x10b6, B:275:0x10d2, B:276:0x1141), top: B:777:0x0f98, outer: #1, inners: #0, #22, #30, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0fee A[Catch: all -> 0x13ab, TryCatch #8 {all -> 0x13ab, blocks: (B:257:0x0f98, B:259:0x0f9e, B:260:0x0fe1, B:262:0x0fee, B:264:0x0ff7, B:265:0x103b, B:289:0x1268, B:290:0x126c, B:293:0x1275, B:296:0x128e, B:299:0x129b, B:301:0x129e, B:313:0x1385, B:315:0x138b, B:316:0x138c, B:318:0x138e, B:320:0x1395, B:321:0x1396, B:266:0x1046, B:278:0x114d, B:280:0x1153, B:281:0x1196, B:283:0x11c0, B:285:0x1207, B:287:0x121d, B:288:0x1260, B:323:0x1398, B:325:0x139f, B:326:0x13a0, B:328:0x13a2, B:330:0x13a9, B:331:0x13aa, B:268:0x1066, B:270:0x107b, B:271:0x10af, B:309:0x1306, B:304:0x12cd, B:306:0x12d3, B:307:0x12fe, B:273:0x10b6, B:275:0x10d2, B:276:0x1141), top: B:777:0x0f98, outer: #1, inners: #0, #22, #30, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x1046 A[Catch: all -> 0x13ab, TRY_LEAVE, TryCatch #8 {all -> 0x13ab, blocks: (B:257:0x0f98, B:259:0x0f9e, B:260:0x0fe1, B:262:0x0fee, B:264:0x0ff7, B:265:0x103b, B:289:0x1268, B:290:0x126c, B:293:0x1275, B:296:0x128e, B:299:0x129b, B:301:0x129e, B:313:0x1385, B:315:0x138b, B:316:0x138c, B:318:0x138e, B:320:0x1395, B:321:0x1396, B:266:0x1046, B:278:0x114d, B:280:0x1153, B:281:0x1196, B:283:0x11c0, B:285:0x1207, B:287:0x121d, B:288:0x1260, B:323:0x1398, B:325:0x139f, B:326:0x13a0, B:328:0x13a2, B:330:0x13a9, B:331:0x13aa, B:268:0x1066, B:270:0x107b, B:271:0x10af, B:309:0x1306, B:304:0x12cd, B:306:0x12d3, B:307:0x12fe, B:273:0x10b6, B:275:0x10d2, B:276:0x1141), top: B:777:0x0f98, outer: #1, inners: #0, #22, #30, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x1275 A[Catch: all -> 0x13ab, TryCatch #8 {all -> 0x13ab, blocks: (B:257:0x0f98, B:259:0x0f9e, B:260:0x0fe1, B:262:0x0fee, B:264:0x0ff7, B:265:0x103b, B:289:0x1268, B:290:0x126c, B:293:0x1275, B:296:0x128e, B:299:0x129b, B:301:0x129e, B:313:0x1385, B:315:0x138b, B:316:0x138c, B:318:0x138e, B:320:0x1395, B:321:0x1396, B:266:0x1046, B:278:0x114d, B:280:0x1153, B:281:0x1196, B:283:0x11c0, B:285:0x1207, B:287:0x121d, B:288:0x1260, B:323:0x1398, B:325:0x139f, B:326:0x13a0, B:328:0x13a2, B:330:0x13a9, B:331:0x13aa, B:268:0x1066, B:270:0x107b, B:271:0x10af, B:309:0x1306, B:304:0x12cd, B:306:0x12d3, B:307:0x12fe, B:273:0x10b6, B:275:0x10d2, B:276:0x1141), top: B:777:0x0f98, outer: #1, inners: #0, #22, #30, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x14d1 A[Catch: all -> 0x1a26, TryCatch #2 {all -> 0x1a26, blocks: (B:345:0x14cb, B:347:0x14d1, B:348:0x150d, B:350:0x1534, B:351:0x157a, B:353:0x1590, B:355:0x1599, B:356:0x15dd, B:390:0x18c1, B:391:0x18c5, B:394:0x18ce, B:397:0x18e8, B:400:0x18fe, B:404:0x190d, B:405:0x1915, B:417:0x1a00, B:419:0x1a06, B:420:0x1a07, B:422:0x1a09, B:424:0x1a10, B:425:0x1a11, B:359:0x15f0, B:361:0x15f6, B:368:0x160a, B:379:0x17a3, B:381:0x17a9, B:382:0x17ec, B:384:0x1816, B:386:0x1861, B:388:0x1877, B:389:0x18bb, B:427:0x1a13, B:429:0x1a1a, B:430:0x1a1b, B:432:0x1a1d, B:434:0x1a24, B:435:0x1a25, B:365:0x1602, B:413:0x197f, B:408:0x1943, B:410:0x1949, B:411:0x1977, B:374:0x16f3, B:376:0x1717, B:377:0x1797, B:369:0x16a2, B:371:0x16b6, B:372:0x16ec), top: B:767:0x14cb, outer: #1, inners: #18, #27, #35, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x1534 A[Catch: all -> 0x1a26, TryCatch #2 {all -> 0x1a26, blocks: (B:345:0x14cb, B:347:0x14d1, B:348:0x150d, B:350:0x1534, B:351:0x157a, B:353:0x1590, B:355:0x1599, B:356:0x15dd, B:390:0x18c1, B:391:0x18c5, B:394:0x18ce, B:397:0x18e8, B:400:0x18fe, B:404:0x190d, B:405:0x1915, B:417:0x1a00, B:419:0x1a06, B:420:0x1a07, B:422:0x1a09, B:424:0x1a10, B:425:0x1a11, B:359:0x15f0, B:361:0x15f6, B:368:0x160a, B:379:0x17a3, B:381:0x17a9, B:382:0x17ec, B:384:0x1816, B:386:0x1861, B:388:0x1877, B:389:0x18bb, B:427:0x1a13, B:429:0x1a1a, B:430:0x1a1b, B:432:0x1a1d, B:434:0x1a24, B:435:0x1a25, B:365:0x1602, B:413:0x197f, B:408:0x1943, B:410:0x1949, B:411:0x1977, B:374:0x16f3, B:376:0x1717, B:377:0x1797, B:369:0x16a2, B:371:0x16b6, B:372:0x16ec), top: B:767:0x14cb, outer: #1, inners: #18, #27, #35, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x1590 A[Catch: all -> 0x1a26, TryCatch #2 {all -> 0x1a26, blocks: (B:345:0x14cb, B:347:0x14d1, B:348:0x150d, B:350:0x1534, B:351:0x157a, B:353:0x1590, B:355:0x1599, B:356:0x15dd, B:390:0x18c1, B:391:0x18c5, B:394:0x18ce, B:397:0x18e8, B:400:0x18fe, B:404:0x190d, B:405:0x1915, B:417:0x1a00, B:419:0x1a06, B:420:0x1a07, B:422:0x1a09, B:424:0x1a10, B:425:0x1a11, B:359:0x15f0, B:361:0x15f6, B:368:0x160a, B:379:0x17a3, B:381:0x17a9, B:382:0x17ec, B:384:0x1816, B:386:0x1861, B:388:0x1877, B:389:0x18bb, B:427:0x1a13, B:429:0x1a1a, B:430:0x1a1b, B:432:0x1a1d, B:434:0x1a24, B:435:0x1a25, B:365:0x1602, B:413:0x197f, B:408:0x1943, B:410:0x1949, B:411:0x1977, B:374:0x16f3, B:376:0x1717, B:377:0x1797, B:369:0x16a2, B:371:0x16b6, B:372:0x16ec), top: B:767:0x14cb, outer: #1, inners: #18, #27, #35, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x15ec  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x18ce A[Catch: all -> 0x1a26, TryCatch #2 {all -> 0x1a26, blocks: (B:345:0x14cb, B:347:0x14d1, B:348:0x150d, B:350:0x1534, B:351:0x157a, B:353:0x1590, B:355:0x1599, B:356:0x15dd, B:390:0x18c1, B:391:0x18c5, B:394:0x18ce, B:397:0x18e8, B:400:0x18fe, B:404:0x190d, B:405:0x1915, B:417:0x1a00, B:419:0x1a06, B:420:0x1a07, B:422:0x1a09, B:424:0x1a10, B:425:0x1a11, B:359:0x15f0, B:361:0x15f6, B:368:0x160a, B:379:0x17a3, B:381:0x17a9, B:382:0x17ec, B:384:0x1816, B:386:0x1861, B:388:0x1877, B:389:0x18bb, B:427:0x1a13, B:429:0x1a1a, B:430:0x1a1b, B:432:0x1a1d, B:434:0x1a24, B:435:0x1a25, B:365:0x1602, B:413:0x197f, B:408:0x1943, B:410:0x1949, B:411:0x1977, B:374:0x16f3, B:376:0x1717, B:377:0x1797, B:369:0x16a2, B:371:0x16b6, B:372:0x16ec), top: B:767:0x14cb, outer: #1, inners: #18, #27, #35, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x1b70  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x1bbc  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x1c6f  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x1e13  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x1efa  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x20e1  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x2147  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x21a1  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x225d  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x249b  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x2940  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x2944 A[Catch: all -> 0x2a71, PHI: r2 r4 r5
  0x2944: PHI (r2v420 java.lang.Object[]) = (r2v419 java.lang.Object[]), (r2v440 java.lang.Object[]) binds: [B:594:0x293e, B:591:0x2926] A[DONT_GENERATE, DONT_INLINE]
  0x2944: PHI (r4v322 int) = (r4v321 int), (r4v338 int) binds: [B:594:0x293e, B:591:0x2926] A[DONT_GENERATE, DONT_INLINE]
  0x2944: PHI (r5v385 int) = (r5v384 int), (r5v401 int) binds: [B:594:0x293e, B:591:0x2926] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #11 {all -> 0x2a71, blocks: (B:528:0x2590, B:534:0x25e0, B:537:0x264a, B:585:0x28fc, B:586:0x2900, B:596:0x2944, B:593:0x2929, B:555:0x26cf, B:573:0x27e8, B:577:0x2832, B:581:0x289e, B:584:0x28f6), top: B:781:0x2590 }] */
    /* JADX WARN: Removed duplicated region for block: B:650:0x2afc A[Catch: all -> 0x0350, TryCatch #34 {all -> 0x0350, blocks: (B:648:0x2af6, B:650:0x2afc, B:651:0x2b26, B:682:0x2e24, B:684:0x2e2a, B:685:0x2e57, B:719:0x316c, B:721:0x3172, B:722:0x3197, B:699:0x2fb2, B:701:0x2fd5, B:702:0x3029, B:742:0x3268, B:744:0x326e, B:745:0x3299, B:747:0x32d3, B:748:0x3315, B:506:0x227b, B:508:0x2290, B:509:0x22be, B:511:0x22f2, B:512:0x236a, B:484:0x1f44, B:486:0x1f4a, B:487:0x1f72, B:489:0x1fac, B:490:0x1ff3, B:458:0x1c8e, B:460:0x1ca3, B:461:0x1cd7, B:442:0x1ab7, B:444:0x1abd, B:445:0x1ae5, B:338:0x1411, B:340:0x1417, B:341:0x1444, B:250:0x0ee3, B:252:0x0ee9, B:253:0x0f12, B:201:0x0c82, B:203:0x0c88, B:204:0x0cb6, B:133:0x07cf, B:135:0x07d5, B:136:0x0801, B:19:0x0177, B:21:0x017d, B:22:0x01a7, B:24:0x02bf, B:26:0x02f0, B:27:0x034a), top: B:825:0x0177 }] */
    /* JADX WARN: Removed duplicated region for block: B:656:0x2bb4  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x2c05  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x2c5e  */
    /* JADX WARN: Removed duplicated region for block: B:681:0x2e01  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x2eea  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x2f3a  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x2f94  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x314e  */
    /* JADX WARN: Removed duplicated region for block: B:735:0x3231  */
    /* JADX WARN: Removed duplicated region for block: B:778:0x0d40 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:878:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r27v142 */
    /* JADX WARN: Type inference failed for: r27v143 */
    /* JADX WARN: Type inference failed for: r27v144 */
    /* JADX WARN: Type inference failed for: r27v145 */
    /* JADX WARN: Type inference failed for: r27v146 */
    /* JADX WARN: Type inference failed for: r27v147 */
    /* JADX WARN: Type inference failed for: r27v148 */
    /* JADX WARN: Type inference failed for: r27v149 */
    /* JADX WARN: Type inference failed for: r27v150 */
    /* JADX WARN: Type inference failed for: r27v151 */
    /* JADX WARN: Type inference failed for: r27v152 */
    /* JADX WARN: Type inference failed for: r27v153 */
    /* JADX WARN: Type inference failed for: r27v154 */
    /* JADX WARN: Type inference failed for: r27v155 */
    /* JADX WARN: Type inference failed for: r27v156 */
    /* JADX WARN: Type inference failed for: r27v157 */
    /* JADX WARN: Type inference failed for: r27v158 */
    /* JADX WARN: Type inference failed for: r27v159 */
    /* JADX WARN: Type inference failed for: r27v160 */
    /* JADX WARN: Type inference failed for: r27v161 */
    /* JADX WARN: Type inference failed for: r27v162 */
    /* JADX WARN: Type inference failed for: r27v163 */
    /* JADX WARN: Type inference failed for: r27v32 */
    /* JADX WARN: Type inference failed for: r27v33 */
    /* JADX WARN: Type inference failed for: r27v34 */
    /* JADX WARN: Type inference failed for: r27v35 */
    /* JADX WARN: Type inference failed for: r27v36 */
    /* JADX WARN: Type inference failed for: r27v37 */
    /* JADX WARN: Type inference failed for: r27v38 */
    /* JADX WARN: Type inference failed for: r27v39 */
    /* JADX WARN: Type inference failed for: r27v45 */
    /* JADX WARN: Type inference failed for: r27v47 */
    /* JADX WARN: Type inference failed for: r27v48 */
    /* JADX WARN: Type inference failed for: r27v49 */
    /* JADX WARN: Type inference failed for: r27v61 */
    /* JADX WARN: Type inference failed for: r27v63 */
    /* JADX WARN: Type inference failed for: r27v64 */
    /* JADX WARN: Type inference failed for: r27v65 */
    /* JADX WARN: Type inference failed for: r27v66 */
    /* JADX WARN: Type inference failed for: r27v76 */
    /* JADX WARN: Type inference failed for: r27v77 */
    /* JADX WARN: Type inference failed for: r27v78 */
    /* JADX WARN: Type inference failed for: r27v81 */
    /* JADX WARN: Type inference failed for: r27v84 */
    /* JADX WARN: Type inference failed for: r27v87 */
    /* JADX WARN: Type inference failed for: r8v100 */
    /* JADX WARN: Type inference failed for: r8v101, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v107, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v120 */
    /* JADX WARN: Type inference failed for: r8v128 */
    /* JADX WARN: Type inference failed for: r8v129 */
    /* JADX WARN: Type inference failed for: r8v130 */
    /* JADX WARN: Type inference failed for: r8v131 */
    /* JADX WARN: Type inference failed for: r8v263 */
    /* JADX WARN: Type inference failed for: r8v264 */
    /* JADX WARN: Type inference failed for: r8v81, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v144 */
    /* JADX WARN: Type inference failed for: r9v148 */
    /* JADX WARN: Type inference failed for: r9v149 */
    /* JADX WARN: Type inference failed for: r9v164 */
    /* JADX WARN: Type inference failed for: r9v165 */
    /* JADX WARN: Type inference failed for: r9v171 */
    /* JADX WARN: Type inference failed for: r9v172 */
    /* JADX WARN: Type inference failed for: r9v173 */
    /* JADX WARN: Type inference failed for: r9v174 */
    /* JADX WARN: Type inference failed for: r9v175 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 13785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.ui.activity.NewDeviceActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$C5kfYa9DQnSt2M8MjP8l3ERWL5M(NewDeviceActivity newDeviceActivity, LocalIdType localIdType) {
        int i = 2 % 2;
        int i2 = equals + 29;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        newDeviceActivity.lambda$showSelectIdType$5(localIdType);
        if (i3 != 0) {
            throw null;
        }
    }

    public static void $r8$lambda$IUwDnK8I5quQzq3QoWG6iXKxdH0(NewDeviceActivity newDeviceActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 69;
        equals = i2 % 128;
        int i3 = i2 % 2;
        newDeviceActivity.onLoginResponse(resource);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$I_SRKDBxnloIvNkVGm43Rl3_lHY(NewDeviceActivity newDeviceActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = equals + 37;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        newDeviceActivity.lambda$onLoginResponse$2(dialogInterface);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$PjPF8uqBLf1_R2guuBnc50t_4sY(NewDeviceActivity newDeviceActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 81;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        newDeviceActivity.lambda$addObserver$1(resource);
        int i4 = getAsAtTimestamp + 57;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
    }

    public static void $r8$lambda$WtxpvwRTUEUQ1KTM6EQhhrPlnm8(NewDeviceActivity newDeviceActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 53;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m10641instrumented$1$initEvent$V(newDeviceActivity, view);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void m10636$r8$lambda$q83og4awJIfk64YPMN1OT3EGd8(NewDeviceActivity newDeviceActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = equals + 51;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        newDeviceActivity.lambda$addObserver$0(dialogInterface);
        if (i3 != 0) {
            throw null;
        }
    }

    public static void $r8$lambda$zZ179E2e4o75Iwy_q7rKzCSo56E(NewDeviceActivity newDeviceActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 103;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        m10640instrumented$0$initEvent$V(newDeviceActivity, view);
        if (i3 != 0) {
            throw null;
        }
    }

    static void m10637$$Nest$mautoLogin(NewDeviceActivity newDeviceActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 33;
        equals = i2 % 128;
        int i3 = i2 % 2;
        newDeviceActivity.autoLogin();
        int i4 = getAsAtTimestamp + 101;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void m10638$$Nest$mcheckConfirmClickable(NewDeviceActivity newDeviceActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 51;
        equals = i2 % 128;
        int i3 = i2 % 2;
        newDeviceActivity.checkConfirmClickable();
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
    }

    static void m10639$$Nest$monLoginResponse(NewDeviceActivity newDeviceActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 121;
        equals = i2 % 128;
        int i3 = i2 % 2;
        newDeviceActivity.onLoginResponse(resource);
        int i4 = getAsAtTimestamp + 55;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
    }

    private static void m10640instrumented$0$initEvent$V(NewDeviceActivity newDeviceActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 45;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            newDeviceActivity.lambda$initEvent$3(view);
            Callback.onClick_exit();
            int i4 = equals + 91;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 11 / 0;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void m10641instrumented$1$initEvent$V(NewDeviceActivity newDeviceActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 13;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                newDeviceActivity.lambda$initEvent$4(view);
                Callback.onClick_exit();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            newDeviceActivity.lambda$initEvent$4(view);
            Callback.onClick_exit();
            int i4 = equals + 51;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 37;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
