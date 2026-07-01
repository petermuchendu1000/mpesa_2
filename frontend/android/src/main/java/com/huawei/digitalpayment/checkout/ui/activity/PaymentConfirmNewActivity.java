package com.huawei.digitalpayment.checkout.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
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
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.checkout.constants.PayTradeTypeEnum;
import com.huawei.digitalpayment.checkout.constants.TradeTypeEnum;
import com.huawei.digitalpayment.checkout.manager.PayManager;
import com.huawei.digitalpayment.checkout.model.request.H5CheckoutRequest;
import com.huawei.digitalpayment.checkout.model.response.CheckoutResp;
import com.huawei.digitalpayment.checkout.model.response.TransferResp;
import com.huawei.digitalpayment.checkout.ui.adapter.ConfirmDisplayItemAdapter;
import com.huawei.digitalpayment.checkout.viewmodel.CheckoutViewModel;
import com.huawei.digitalpayment.checkoutUi.databinding.ActivityPaymentNewBinding;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.safaricom.mpesa.lifestyle.R;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.io.encoding.Base64;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.crypto.signers.PSSSigner;

public class PaymentConfirmNewActivity extends Hilt_PaymentConfirmNewActivity<ActivityPaymentNewBinding, CheckoutViewModel> {
    private ConfirmDisplayItemAdapter adapter;
    private String appId;
    private String businessType;
    private CheckoutResp checkOutResp;
    private String from;
    private String merchCode;
    private String operatorCode;
    private String payToken;
    private String prepayId;
    private String rawRequest;
    private boolean showDialog = false;
    private String tradeType;
    private static final byte[] $$l = {44, 39, Base64.padSymbol, Ascii.GS};
    private static final int $$o = 19;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {35, -27, -128, TarHeader.LF_SYMLINK, 9, -5, -66, TarHeader.LF_FIFO, 5, -3, -11, 2, -10, -58, TarHeader.LF_DIR, 0, 6, -16, -6, -4, Ascii.SI, -17, -58, 66, -17, Ascii.VT, -3, -13, 3, -4, 2, -72, TarHeader.LF_CHR, -6, 3, -3, -5, 10, -71, 56, 2, 3, -18, 10, -7, -16, 8, -65, Ascii.US, Ascii.US, -16, -5, 9, -4, -13, 2, 8, -14, 3, -4, 2, Ascii.DC2, -10, Ascii.SO, -16, -36, Ascii.SUB, Ascii.DLE, -22, -15, -15, 7, Ascii.RS, -22, Ascii.DLE, -18, 9, -5, 0, -4, -4, -12, 6, 3, PSSSigner.TRAILER_IMPLICIT, 9, -5, -66, TarHeader.LF_FIFO, 5, -3, -11, 2, -10, -58, 73, -5, -18, 2, -10, -60, 63, -15, -1, -53, -6, 3, -12, TarHeader.LF_CHR, -2, -5, 9, -14, -2, 10, -71, 17, Ascii.FS, Ascii.SO, -18, 9, -14, -2, -27, Ascii.NAK, Ascii.FF, -22, 0, -6, Ascii.DLE, -22};
    private static final int $$k = 197;
    private static final byte[] $$d = {40, 108, -113, 75, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 43;
    private static int component2 = 0;
    private static int equals = 1;
    private static long copydefault = -2146884394941681278L;
    private static long component3 = -3780477796495014671L;
    private static int component1 = -910691643;
    private static char ShareDataUIState = 50417;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(short r7, short r8, short r9) {
        /*
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r9 = r9 * 3
            int r9 = r9 + 1
            int r7 = r7 + 98
            byte[] r0 = com.huawei.digitalpayment.checkout.ui.activity.PaymentConfirmNewActivity.$$l
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L27
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L27:
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.PaymentConfirmNewActivity.$$r(short, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 99 - r6
            byte[] r0 = com.huawei.digitalpayment.checkout.ui.activity.PaymentConfirmNewActivity.$$d
            int r1 = 28 - r7
            int r8 = r8 * 2
            int r8 = r8 + 83
            byte[] r1 = new byte[r1]
            int r7 = 27 - r7
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L2f
        L14:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r8 = r8 + 1
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r6 = r6 + r8
            int r6 = r6 + (-8)
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.PaymentConfirmNewActivity.i(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 16
            int r8 = r8 + 83
            byte[] r0 = com.huawei.digitalpayment.checkout.ui.activity.PaymentConfirmNewActivity.$$j
            int r6 = r6 + 4
            int r7 = r7 + 10
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r5 = r2
            r8 = r7
            goto L27
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r6 = r6 + 1
            r3 = r0[r6]
        L27:
            int r8 = r8 + r3
            int r8 = r8 + 3
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.PaymentConfirmNewActivity.j(int, byte, byte, java.lang.Object[]):void");
    }

    private static void g(int i, char[] cArr, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(copydefault ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (true) {
            obj = null;
            if (iTrustedWebActivityServiceDefault.copydefault >= cArrComponent2.length) {
                break;
            }
            int i3 = $11 + 71;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(copydefault)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 7033, 34 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (63441 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 5;
                    byte b3 = (byte) (b2 - 5);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 1390, (ViewConfiguration.getWindowTouchSlop() >> 8) + 18, (char) (51269 - Gravity.getAbsoluteGravity(0, 0)), -1883291598, false, $$r(b2, b3, b3), new Class[]{Object.class, Object.class});
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
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i6 = $11 + 37;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    private static void h(int i, char[] cArr, char[] cArr2, char[] cArr3, char c2, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int offsetBefore = TextUtils.getOffsetBefore("", i3) + 4037;
                    int modifierMetaStateMask = 30 - ((byte) KeyEvent.getModifierMetaStateMask());
                    char cIndexOf = (char) (TextUtils.indexOf("", "") + 19181);
                    byte b2 = (byte) ($$o & 5);
                    byte b3 = (byte) (b2 - 1);
                    String str$$r = $$r(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, modifierMetaStateMask, cIndexOf, 1912513118, false, str$$r, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 7567;
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 11;
                    char c3 = (char) (TypedValue.complexToFloat(i3) > 0.0f ? 1 : (TypedValue.complexToFloat(i3) == 0.0f ? 0 : -1));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i3] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatDelay, pressedStateDuration, c3, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i4 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i4);
                objArr4[i3] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) i3;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", i3, i3) + 2459, (ViewConfiguration.getWindowTouchSlop() >> 8) + 28, (char) (ViewConfiguration.getTouchSlop() >> 8), 931716605, false, $$r(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 7568, 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) View.resolveSize(0, 0), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component3 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component1) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) ShareDataUIState) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i5 = $11 + 13;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 4 % 5;
                }
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i7 = $11 + 43;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952785_res_0x7f130491).substring(2, 3).codePointAt(0) - 31, new char[]{37879, 49152, 37782, 7549, 53917, 26847, 2737, 59348, 40442, 37174, 64651, 38481, 31488, 1496, 28685, 57979, 53089, 63896, 50676, 27010, 17076, 28208}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952847_res_0x7f1304cf).substring(21, 22).length(), new char[]{14728, 37753, 14821, 19987, 14404, 33335, 64816, 19872, 27232}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 28, new char[]{36946, 50380, 36915, 6577, 25375, 55645, 48026, 58481, 11473, 38394, 19721, 10106, 30891, 279, 49617, 21294, 52471, 64856, 29793, 55461, 16660, 27366, 59453, 17601, 54650, 58923, 40143, 61441, 10747, 21107}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 28, new char[]{58353, 12575, 58258, 60537, 33197, 15353, 38634, 38872, 417, 24622, 44971, 2661, 2841, 62660, 9087, 32281, 49014, 2185, 38611, 62933, 12974, 40754}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
                int i2 = equals + 123;
                component2 = i2 % 128;
                int i3 = i2 % 2;
            }
            if (baseContext != null) {
                int i4 = equals + 77;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    throw null;
                }
                baseContext = (!((baseContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionType(0L) + 6618, 42 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952720_res_0x7f130450).substring(6, 7).codePointAt(0) - 32, new char[]{27656, 22231, 39033, 14399, 39535, 17922, 53268, 18870, 59624, 31139, 51877, 28197, 64528, 8919, 10828, 57181, 5009, 17219, 23641, 30214, 61751, 46276, 28455, 37164, 24873, 37085, 26670, 58370, 42050, 53283, 33262, 50787, 61067, 63397, 46946, 23404, 49626, 20732, 36536, 25909, 63731, 3940, 8769, 61072, 9919, 52727, 35443, 31610}, new char[]{57786, 3834, 52638, 36000}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952718_res_0x7f13044e).substring(6, 7).codePointAt(0) - 32), objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    h(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{23045, 921, 64145, 61588, 18119, 37059, 1021, 11790, 37451, 57776, 10242, 58310, 31687, 13732, 9090, 12855, 32792, 22566, 8013, 26002, 32898, 54912, 12930, 65420, 34566, 19810, 49637, 61623, 10181, 50367, 58454, 48634, 50018, 27509, 16666, 50126, 33938, 57176, 34707, 7407, 23860, 13456, 1974, 8949, 41595, 8683, 49889, 50381, 23776, 50801, 11328, 61301, 19463, 39970, 52684, 17195, 45667, 41899, 7128, 21199, 32665, 54099, 30963, 60616}, new char[]{8047, 21142, 44699, 23512}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952810_res_0x7f1304aa).substring(9, 10).length() - 1), objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    g(1 - (Process.myPid() >> 22), new char[]{60581, 51915, 60565, 6078, 41600, 6302, 10518, 39128, 48715, 39842, 36032, 46587, 1035, 3843, AbstractJsonLexerKt.END_LIST, 49660, 45174, 62220, 46527, 18996, 15856, 25835, 10723, 54807, 43499, 59507, 23834, 25288, 21849, 23668, 53592, 61305, 49877, 49631, 19081, 31584, 20213, 46478, 65125, 34786, 64056, 14608, 29290, 5067, 26218, 41718, 59303, 40013, 5073, 5797, 7128, 10325, 40708, 39519, 36693, 46267, 2888, 3604, 178, 49468, 45292, 62357, 46326, 19736, 15591, 26488, 10287, 55685}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    g(View.MeasureSpec.getMode(0) + 1, new char[]{39603, 34638, 39643, 23081, 34107, 16233, 20054, 61068, 55583, 54827, 43878, 53941, 29213, 17104, 10173, 42745, 50788, 48863, 37381, 11575, 19378, 10555, 3679, 45380, 57339, 42486, 31482, 1480, 9045, 4577, 63165, 34924, 46274, 35848, 28021, 7217, 14514, 63566, 55753, 57512, 35960, 29828, 21896, 29832, 4143, 61238, 49236, 64347, 26006, 23403, 15412, 20300, 59712, 55170, 43232, 54265, 32014, 17361, 10064, 42533, 50930, 48667, 37650, 10779, 19124, 10941, 3982, 48836, 56897, 42674, 31672, 656, 9178, 4415, 63101, 35113}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952832_res_0x7f1304c0).substring(0, 1).codePointAt(0) - 37, new char[]{41269, 34255, 18522, 5192, 53196, 27151}, new char[]{2148, 49085, 32644, 36421}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952790_res_0x7f130496).substring(7, 8).codePointAt(0) + 17759), objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(13) - 46, new char[]{25300, 55632, 53933, 61075, 18408, 53783, 8479, 24028, 25794, 3640, 41054, 45115, 24625, 8384, 40534, 10689, 28166, 43082, 53720, 63691, 17103, 60919, 27910, 27535, 27010, 42006, 25404, 32786, 21486, 33410, 48354, 16708, 17901, 58251, 32765, 54069}, new char[]{63112, 24693, 29241, 11299}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131953368_res_0x7f1306d8).substring(0, 6).codePointAt(2) - 67), objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6562, (Process.myPid() >> 22) + 56, (char) View.MeasureSpec.getMode(0), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            int i5 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2405;
            int iLastIndexOf = 25 - TextUtils.lastIndexOf("", '0', 0, 0);
            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte[] bArr = $$d;
            Object[] objArr13 = new Object[1];
            i((byte) 96, (byte) (-bArr[38]), (byte) (-bArr[22]), objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i5, iLastIndexOf, keyRepeatDelay, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 2406;
                int i6 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 26;
                char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                Object[] objArr14 = new Object[1];
                i((byte) 93, r1[95], (byte) (-$$d[22]), objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf2, i6, c2, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954589_res_0x7f130b9d).substring(0, 2).codePointAt(0) - 49, new char[]{29556, 64224, 17487, 36141, 13126, 41653, 4110, 6655, 10228, 11799, 42383, 7957, 50951, 22807, 15140, 38289}, new char[]{36350, 13920, 13595, 41184}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952790_res_0x7f130496).substring(7, 8).length() + 57396), objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952804_res_0x7f1304a4).substring(10, 11).codePointAt(0) - 32, new char[]{30787, 58246, 44447, 32013, 11074, 12496, 28448, 34733, 22308, 61452, 43029, 27739, 18438, 42436, 19658, 27209}, new char[]{7162, 52406, 60532, 54962}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952716_res_0x7f13044c).substring(6, 7).codePointAt(0) + 45772), objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i7 = component2 + 7;
            equals = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, -19924366};
                byte b2 = $$j[103];
                byte b3 = b2;
                Object[] objArr18 = new Object[1];
                j(b3, (byte) (b3 & TarHeader.LF_NORMAL), (byte) (-b2), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                j(r0[39], r0[16], r0[15], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int i9 = 2406 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 26;
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    Object[] objArr20 = new Object[1];
                    i((byte) 93, r4[95], (byte) (-$$d[22]), objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i9, doubleTapTimeout, scrollBarFadeDuration, 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    h((((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer._2131427364_res_0x7f0b0024) & (-3)) - 1, new char[]{23822, 42611, 55106, 49808, 14027, 34351, 50743, 25247, 27220, 12904, 46676, 7530, 60759, 26752, 6474, 54285, 30632, 25245, 23555, 57614, 13284, 9824}, new char[]{38501, 28211, 49534, 48768}, new char[]{0, 0, 0, 0}, (char) View.resolveSizeAndState(0, 0, 0), objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 330415199, new char[]{4338, 52684, 883, 6339, 19549, 64055, 51237, 18444, 42760, 49009, 49707, 53879, 36049, 45693, 38393}, new char[]{5068, 20036, 16108, 15276}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(28) + 43993), objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int iResolveSize = 2405 - View.resolveSize(0, 0);
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 26;
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        byte b4 = $$d[33];
                        Object[] objArr23 = new Object[1];
                        i((byte) 84, b4, (byte) (b4 | 10), objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iResolveSize, fadingEdgeLength, touchSlop, -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        byte[] bArr2 = $$d;
                        Object[] objArr24 = new Object[1];
                        i((byte) 96, (byte) (-bArr2[38]), (byte) (-bArr2[22]), objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(2404 - MotionEvent.axisFromString(""), 26 - View.getDefaultSize(0, 0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), -2047739879, false, (String) objArr24[0], null);
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
        int i10 = ((int[]) objArr[0])[0];
        int i11 = ((int[]) objArr[2])[0];
        if (i11 != i10) {
            long j = -1;
            long j2 = ((long) (i11 ^ i10)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32)) | j2;
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6619 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 42 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            int i12 = component2 + 109;
            equals = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr25 = {-1816620431, Long.valueOf(j4), arrayList, null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6561, Drawable.resolveOpacity(0, 0) + 56, (char) Color.green(0));
                byte[] bArr3 = $$j;
                Object[] objArr26 = new Object[1];
                j((byte) (-bArr3[38]), bArr3[15], (byte) (-bArr3[103]), objArr26);
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
        initView();
        initObserver();
    }

    private void initObserver() {
        int i = 2 % 2;
        ((CheckoutViewModel) this.viewModel).getCheckoutRespLiveData().observe(this, new Observer<CheckoutResp>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public void onChanged(CheckoutResp checkoutResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 19;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                ShareDataUIState(checkoutResp);
                if (i4 == 0) {
                    throw null;
                }
                int i5 = component1 + 111;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            public void ShareDataUIState(CheckoutResp checkoutResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 53;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                DialogManager.hideLoading(PaymentConfirmNewActivity.this);
                PaymentConfirmNewActivity.m10090$$Nest$mcheckoutResult(PaymentConfirmNewActivity.this, checkoutResp);
                int i5 = component1 + 51;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((CheckoutViewModel) this.viewModel).getCheckOutExceptionLiveData().observe(this, new Observer<BaseException>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public void onChanged(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 7;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Object obj = null;
                component3(baseException);
                if (i4 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = component1 + 111;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            public void component3(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component1 + 115;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                DialogManager.hideLoading(PaymentConfirmNewActivity.this);
                ToastUtils.showShort(baseException.getResponseDesc());
                int i5 = ShareDataUIState + 29;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component2 + 103;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = equals + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String string = getString(com.huawei.digitalpayment.checkoutUi.R.string.design_confirm);
        if (i3 == 0) {
            super.initToolbar(string);
        } else {
            super.initToolbar(string);
            int i4 = 69 / 0;
        }
    }

    private void lambda$initView$0(View view) {
        int i = 2 % 2;
        int i2 = equals + 61;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        startCheckOut(true);
    }

    private void lambda$initView$1(View view) {
        int i = 2 % 2;
        int i2 = equals + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        finish();
        int i4 = component2 + 15;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
    }

    protected void initView() {
        int i = 2 % 2;
        int i2 = component2 + 43;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        this.prepayId = intent.getStringExtra(KeysConstants.PREPAY_ID);
        this.rawRequest = intent.getStringExtra(KeysConstants.PAY_RAW_REQUEST);
        this.merchCode = intent.getStringExtra(com.huawei.digitalpayment.consumer.base.constants.KeysConstants.KEY_MERCH_CODE);
        this.appId = intent.getStringExtra("appId");
        this.payToken = intent.getStringExtra("payToken");
        this.tradeType = intent.getStringExtra("tradeType");
        this.businessType = intent.getStringExtra("businessType");
        this.operatorCode = intent.getStringExtra("OperatorCode");
        this.from = intent.getStringExtra("from");
        Serializable serializableExtra = intent.getSerializableExtra("checkOutResp");
        if (serializableExtra instanceof CheckoutResp) {
            int i4 = equals + 99;
            int i5 = i4 % 128;
            component2 = i5;
            if (i4 % 2 != 0) {
                this.checkOutResp = (CheckoutResp) serializableExtra;
                throw null;
            }
            this.checkOutResp = (CheckoutResp) serializableExtra;
            int i6 = i5 + 23;
            equals = i6 % 128;
            int i7 = i6 % 2;
        }
        ((ActivityPaymentNewBinding) this.binding).confirm.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i8 = 2 % 2;
                int i9 = copydefault + 53;
                component1 = i9 % 128;
                if (i9 % 2 == 0) {
                    PaymentConfirmNewActivity.m10089$r8$lambda$XW8rGpnpB5Cw3AJJR8nsmSkE6I(this.f$0, view);
                    throw null;
                }
                PaymentConfirmNewActivity.m10089$r8$lambda$XW8rGpnpB5Cw3AJJR8nsmSkE6I(this.f$0, view);
                int i10 = copydefault + 99;
                component1 = i10 % 128;
                int i11 = i10 % 2;
            }
        });
        ((ActivityPaymentNewBinding) this.binding).ivClose.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final void onClick(View view) {
                int i8 = 2 % 2;
                int i9 = component1 + 125;
                component3 = i9 % 128;
                int i10 = i9 % 2;
                PaymentConfirmNewActivity.m10088$r8$lambda$Q_Od7Pi3XudQSEK0GRPTOWktr4(this.f$0, view);
                int i11 = component3 + 89;
                component1 = i11 % 128;
                int i12 = i11 % 2;
            }
        });
        CheckoutResp checkoutResp = this.checkOutResp;
        if (checkoutResp == null) {
            startCheckOut(false);
            return;
        }
        int i8 = component2 + 57;
        equals = i8 % 128;
        if (i8 % 2 != 0) {
            buildUi(checkoutResp);
        } else {
            buildUi(checkoutResp);
            throw null;
        }
    }

    private void buildUi(CheckoutResp checkoutResp) {
        int i = 2 % 2;
        ((ActivityPaymentNewBinding) this.binding).tvTitle.setText(checkoutResp.getOppositeName());
        ((ActivityPaymentNewBinding) this.binding).tvAmount.setText(checkoutResp.getActualAmountDisplay());
        ((ActivityPaymentNewBinding) this.binding).tvAmountUnit.setText(checkoutResp.getCurrency());
        this.adapter = new ConfirmDisplayItemAdapter(checkoutResp.getConfirmDisplayItems());
        ((ActivityPaymentNewBinding) this.binding).rvRecyclerView.setAdapter(this.adapter);
        int i2 = equals + 69;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 97 / 0;
        }
    }

    private void startCheckOut(boolean z) {
        int i = 2 % 2;
        this.showDialog = z;
        H5CheckoutRequest h5CheckoutRequest = new H5CheckoutRequest();
        h5CheckoutRequest.setPrepayId(this.prepayId);
        h5CheckoutRequest.setRawRequest(this.rawRequest);
        h5CheckoutRequest.setMerchCode(this.merchCode);
        h5CheckoutRequest.setAppId(this.appId);
        h5CheckoutRequest.setPayToken(this.payToken);
        h5CheckoutRequest.setTradeType(this.tradeType);
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.businessType)) {
            int i2 = component2 + 77;
            equals = i2 % 128;
            int i3 = i2 % 2;
            map.put("businessType", this.businessType);
        }
        if (!TextUtils.isEmpty(this.operatorCode)) {
            int i4 = equals + 105;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            map.put("requesterOperatorCode", this.operatorCode);
        }
        h5CheckoutRequest.setExtension(map);
        DialogManager.showLoading(this);
        ((CheckoutViewModel) this.viewModel).h5Checkout(h5CheckoutRequest);
    }

    private void checkoutResult(CheckoutResp checkoutResp) {
        TradeTypeEnum tradeTypeEnum;
        int i = 2 % 2;
        int i2 = component2 + 117;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        if (checkoutResp == null) {
            int i5 = i3 + 5;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        this.checkOutResp = checkoutResp;
        buildUi(checkoutResp);
        if ("selectCoupon".equals(this.from) || !this.showDialog) {
            return;
        }
        if (!(!"h5PayOrder".equals(this.from))) {
            int i7 = component2 + 35;
            equals = i7 % 128;
            if (i7 % 2 == 0) {
                TradeTypeEnum tradeTypeEnum2 = TradeTypeEnum.H5_CHECKOUT;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            tradeTypeEnum = TradeTypeEnum.H5_CHECKOUT;
            int i8 = component2 + 19;
            equals = i8 % 128;
            int i9 = i8 % 2;
        } else {
            tradeTypeEnum = TradeTypeEnum.CUSTOMER_BUY_GOODS;
        }
        HashMap map = new HashMap();
        map.put("tradeType", PayTradeTypeEnum.NATIVE_APP.getTradeType());
        PayManager.get().startPay(this, map, checkoutResp, tradeTypeEnum, (ApiCallback<TransferResp>) null);
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = equals + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = com.huawei.digitalpayment.checkoutUi.R.layout.activity_payment_new;
        if (i3 == 0) {
            return i4;
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
            Object[] objArr = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952718_res_0x7f13044e).substring(6, 7).codePointAt(0) - 31, new char[]{36946, 50380, 36915, 6577, 25375, 55645, 48026, 58481, 11473, 38394, 19721, 10106, 30891, 279, 49617, 21294, 52471, 64856, 29793, 55461, 16660, 27366, 59453, 17601, 54650, 58923, 40143, 61441, 10747, 21107}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, new char[]{58353, 12575, 58258, 60537, 33197, 15353, 38634, 38872, 417, 24622, 44971, 2661, 2841, 62660, 9087, 32281, 49014, 2185, 38611, 62933, 12974, 40754}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i2 = component2 + 25;
                equals = i2 % 128;
                int i3 = i2 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i4 = component2 + 93;
            equals = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 6618, 42 - View.combineMeasuredStates(0, 0), (char) TextUtils.getOffsetAfter("", 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 6562, (ViewConfiguration.getScrollBarSize() >> 8) + 56, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), -699576857, false, "component2", new Class[]{Context.class});
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
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952805_res_0x7f1304a5).substring(19, 20).length(), new char[]{36946, 50380, 36915, 6577, 25375, 55645, 48026, 58481, 11473, 38394, 19721, 10106, 30891, 279, 49617, 21294, 52471, 64856, 29793, 55461, 16660, 27366, 59453, 17601, 54650, 58923, 40143, 61441, 10747, 21107}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer._2131427364_res_0x7f0b0024) & (-3), new char[]{58353, 12575, 58258, 60537, 33197, 15353, 38634, 38872, 417, 24622, 44971, 2661, 2841, 62660, 9087, 32281, 49014, 2185, 38611, 62933, 12974, 40754}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i2 = component2 + 81;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 5;
            }
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i4 = component2 + 37;
                equals = i4 % 128;
                int i5 = i4 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i6 = equals + 95;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 6619, 41 - Process.getGidForName(""), (char) ExpandableListView.getPackedPositionGroup(0L), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - TextUtils.getOffsetAfter("", 0), 56 - View.MeasureSpec.getSize(0), (char) (ViewConfiguration.getEdgeSlop() >> 16), -960739708, false, "component3", new Class[]{Context.class});
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0980 A[Catch: all -> 0x0abf, TryCatch #22 {all -> 0x0abf, blocks: (B:110:0x0976, B:111:0x097a, B:113:0x0980, B:116:0x099b, B:78:0x068a, B:95:0x084c, B:99:0x089a, B:105:0x090f, B:109:0x096e), top: B:891:0x068a }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0bc8 A[Catch: all -> 0x0484, TryCatch #54 {all -> 0x0484, blocks: (B:175:0x0bc2, B:177:0x0bc8, B:178:0x0bf5, B:292:0x1181, B:294:0x1187, B:295:0x11b3, B:784:0x3453, B:786:0x3459, B:787:0x3481, B:821:0x37bc, B:823:0x37c2, B:824:0x37eb, B:801:0x35e5, B:803:0x3608, B:804:0x365b, B:750:0x310b, B:752:0x3111, B:753:0x313f, B:632:0x29fb, B:634:0x2a01, B:635:0x2a29, B:637:0x2a63, B:638:0x2aad, B:605:0x274c, B:607:0x2761, B:608:0x2791, B:587:0x2422, B:589:0x2428, B:590:0x2455, B:592:0x248f, B:593:0x24d7, B:557:0x20c9, B:559:0x20de, B:560:0x210e, B:562:0x2142, B:563:0x21c4, B:537:0x1e58, B:539:0x1e5e, B:540:0x1e86, B:423:0x18ab, B:425:0x18b1, B:426:0x18e0, B:378:0x1658, B:380:0x165e, B:381:0x168a, B:17:0x01fe, B:19:0x0204, B:20:0x022a, B:22:0x03ed, B:24:0x041f, B:25:0x047e, B:386:0x1713, B:388:0x1717, B:409:0x1818, B:411:0x181e, B:412:0x181f, B:414:0x1821, B:416:0x1828, B:417:0x1829, B:392:0x1723, B:398:0x172e, B:400:0x1743, B:401:0x1777, B:402:0x177d, B:404:0x178a, B:405:0x17ff), top: B:948:0x01fe, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0ccc A[Catch: all -> 0x10c7, PHI: r1 r35
  0x0ccc: PHI (r1v590 java.lang.Object) = (r1v583 java.lang.Object), (r1v588 java.lang.Object) binds: [B:183:0x0c7e, B:184:0x0c80] A[DONT_GENERATE, DONT_INLINE]
  0x0ccc: PHI (r35v69 ??) = (r35v116 ??), (r35v117 ??) binds: [B:183:0x0c7e, B:184:0x0c80] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #30 {all -> 0x10c7, blocks: (B:182:0x0c7a, B:189:0x0ccc, B:198:0x0d2f, B:216:0x0e3d, B:220:0x0e87), top: B:904:0x0c7a }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0cd9  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0d2f A[Catch: all -> 0x10c7, TRY_ENTER, TRY_LEAVE, TryCatch #30 {all -> 0x10c7, blocks: (B:182:0x0c7a, B:189:0x0ccc, B:198:0x0d2f, B:216:0x0e3d, B:220:0x0e87), top: B:904:0x0c7a }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0f70 A[Catch: all -> 0x10a9, TryCatch #8 {all -> 0x10a9, blocks: (B:233:0x0f66, B:234:0x0f6a, B:236:0x0f70, B:239:0x0f8d, B:222:0x0e96, B:228:0x0efb, B:232:0x0f5e), top: B:865:0x0e96 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x1187 A[Catch: all -> 0x0484, TryCatch #54 {all -> 0x0484, blocks: (B:175:0x0bc2, B:177:0x0bc8, B:178:0x0bf5, B:292:0x1181, B:294:0x1187, B:295:0x11b3, B:784:0x3453, B:786:0x3459, B:787:0x3481, B:821:0x37bc, B:823:0x37c2, B:824:0x37eb, B:801:0x35e5, B:803:0x3608, B:804:0x365b, B:750:0x310b, B:752:0x3111, B:753:0x313f, B:632:0x29fb, B:634:0x2a01, B:635:0x2a29, B:637:0x2a63, B:638:0x2aad, B:605:0x274c, B:607:0x2761, B:608:0x2791, B:587:0x2422, B:589:0x2428, B:590:0x2455, B:592:0x248f, B:593:0x24d7, B:557:0x20c9, B:559:0x20de, B:560:0x210e, B:562:0x2142, B:563:0x21c4, B:537:0x1e58, B:539:0x1e5e, B:540:0x1e86, B:423:0x18ab, B:425:0x18b1, B:426:0x18e0, B:378:0x1658, B:380:0x165e, B:381:0x168a, B:17:0x01fe, B:19:0x0204, B:20:0x022a, B:22:0x03ed, B:24:0x041f, B:25:0x047e, B:386:0x1713, B:388:0x1717, B:409:0x1818, B:411:0x181e, B:412:0x181f, B:414:0x1821, B:416:0x1828, B:417:0x1829, B:392:0x1723, B:398:0x172e, B:400:0x1743, B:401:0x1777, B:402:0x177d, B:404:0x178a, B:405:0x17ff), top: B:948:0x01fe, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x1299  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x12f9 A[Catch: all -> 0x15cb, TRY_ENTER, TRY_LEAVE, TryCatch #31 {all -> 0x15cb, blocks: (B:299:0x123d, B:305:0x128c, B:315:0x12f9, B:325:0x1386, B:329:0x13d1), top: B:906:0x123d }] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x14c6  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x165e A[Catch: all -> 0x0484, TryCatch #54 {all -> 0x0484, blocks: (B:175:0x0bc2, B:177:0x0bc8, B:178:0x0bf5, B:292:0x1181, B:294:0x1187, B:295:0x11b3, B:784:0x3453, B:786:0x3459, B:787:0x3481, B:821:0x37bc, B:823:0x37c2, B:824:0x37eb, B:801:0x35e5, B:803:0x3608, B:804:0x365b, B:750:0x310b, B:752:0x3111, B:753:0x313f, B:632:0x29fb, B:634:0x2a01, B:635:0x2a29, B:637:0x2a63, B:638:0x2aad, B:605:0x274c, B:607:0x2761, B:608:0x2791, B:587:0x2422, B:589:0x2428, B:590:0x2455, B:592:0x248f, B:593:0x24d7, B:557:0x20c9, B:559:0x20de, B:560:0x210e, B:562:0x2142, B:563:0x21c4, B:537:0x1e58, B:539:0x1e5e, B:540:0x1e86, B:423:0x18ab, B:425:0x18b1, B:426:0x18e0, B:378:0x1658, B:380:0x165e, B:381:0x168a, B:17:0x01fe, B:19:0x0204, B:20:0x022a, B:22:0x03ed, B:24:0x041f, B:25:0x047e, B:386:0x1713, B:388:0x1717, B:409:0x1818, B:411:0x181e, B:412:0x181f, B:414:0x1821, B:416:0x1828, B:417:0x1829, B:392:0x1723, B:398:0x172e, B:400:0x1743, B:401:0x1777, B:402:0x177d, B:404:0x178a, B:405:0x17ff), top: B:948:0x01fe, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x172c  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x1743 A[Catch: all -> 0x1820, TryCatch #0 {all -> 0x1820, blocks: (B:398:0x172e, B:400:0x1743, B:401:0x1777), top: B:850:0x172e, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x178a A[Catch: all -> 0x1816, TryCatch #61 {all -> 0x1816, blocks: (B:402:0x177d, B:404:0x178a, B:405:0x17ff), top: B:960:0x177d, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x19ca A[Catch: all -> 0x1dd2, PHI: r2 r8
  0x19ca: PHI (r2v494 java.lang.Object) = (r2v489 java.lang.Object), (r2v493 java.lang.Object) binds: [B:431:0x1979, B:432:0x197b] A[DONT_GENERATE, DONT_INLINE]
  0x19ca: PHI (r8v73 ??) = (r8v171 ??), (r8v72 ??) binds: [B:431:0x1979, B:432:0x197b] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #36 {all -> 0x1dd2, blocks: (B:430:0x1975, B:436:0x19ca, B:445:0x1a2e, B:463:0x1b49, B:466:0x1b93), top: B:915:0x1975 }] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x19d7  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x1a2e A[Catch: all -> 0x1dd2, TRY_ENTER, TRY_LEAVE, TryCatch #36 {all -> 0x1dd2, blocks: (B:430:0x1975, B:436:0x19ca, B:445:0x1a2e, B:463:0x1b49, B:466:0x1b93), top: B:915:0x1975 }] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x1c7b A[Catch: all -> 0x1db0, TryCatch #13 {all -> 0x1db0, blocks: (B:478:0x1c69, B:479:0x1c6d, B:482:0x1c7b, B:485:0x1c96, B:468:0x1ba2, B:474:0x1c05, B:477:0x1c61), top: B:875:0x1ba2 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x1e5e A[Catch: all -> 0x0484, TryCatch #54 {all -> 0x0484, blocks: (B:175:0x0bc2, B:177:0x0bc8, B:178:0x0bf5, B:292:0x1181, B:294:0x1187, B:295:0x11b3, B:784:0x3453, B:786:0x3459, B:787:0x3481, B:821:0x37bc, B:823:0x37c2, B:824:0x37eb, B:801:0x35e5, B:803:0x3608, B:804:0x365b, B:750:0x310b, B:752:0x3111, B:753:0x313f, B:632:0x29fb, B:634:0x2a01, B:635:0x2a29, B:637:0x2a63, B:638:0x2aad, B:605:0x274c, B:607:0x2761, B:608:0x2791, B:587:0x2422, B:589:0x2428, B:590:0x2455, B:592:0x248f, B:593:0x24d7, B:557:0x20c9, B:559:0x20de, B:560:0x210e, B:562:0x2142, B:563:0x21c4, B:537:0x1e58, B:539:0x1e5e, B:540:0x1e86, B:423:0x18ab, B:425:0x18b1, B:426:0x18e0, B:378:0x1658, B:380:0x165e, B:381:0x168a, B:17:0x01fe, B:19:0x0204, B:20:0x022a, B:22:0x03ed, B:24:0x041f, B:25:0x047e, B:386:0x1713, B:388:0x1717, B:409:0x1818, B:411:0x181e, B:412:0x181f, B:414:0x1821, B:416:0x1828, B:417:0x1829, B:392:0x1723, B:398:0x172e, B:400:0x1743, B:401:0x1777, B:402:0x177d, B:404:0x178a, B:405:0x17ff), top: B:948:0x01fe, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:545:0x1f23  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x1f8e  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x1fe3  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x20a9  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x2311  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x23e0  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x2600  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x264f  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x272a  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x28d8  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x29af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x2c23  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x2c7a  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x2cd3  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x2f2d A[Catch: all -> 0x306a, TryCatch #45 {all -> 0x306a, blocks: (B:694:0x2f23, B:695:0x2f27, B:697:0x2f2d, B:700:0x2f45, B:703:0x2f52, B:707:0x2f61, B:708:0x2f69, B:720:0x3058, B:722:0x305e, B:723:0x305f, B:725:0x3061, B:727:0x3068, B:728:0x3069, B:671:0x2cfb, B:683:0x2e05, B:685:0x2e0b, B:686:0x2e4a, B:688:0x2e74, B:690:0x2ebe, B:692:0x2ed5, B:693:0x2f1b, B:732:0x306d, B:734:0x3074, B:735:0x3075, B:737:0x3077, B:739:0x307e, B:740:0x307f, B:716:0x2fd0, B:711:0x2f98, B:713:0x2f9e, B:714:0x2fc8, B:678:0x2d5e, B:680:0x2d7d, B:681:0x2df9, B:673:0x2d0f, B:675:0x2d24, B:676:0x2d57), top: B:932:0x2cfb, inners: #37, #41, #47, #50 }] */
    /* JADX WARN: Removed duplicated region for block: B:752:0x3111 A[Catch: all -> 0x0484, TryCatch #54 {all -> 0x0484, blocks: (B:175:0x0bc2, B:177:0x0bc8, B:178:0x0bf5, B:292:0x1181, B:294:0x1187, B:295:0x11b3, B:784:0x3453, B:786:0x3459, B:787:0x3481, B:821:0x37bc, B:823:0x37c2, B:824:0x37eb, B:801:0x35e5, B:803:0x3608, B:804:0x365b, B:750:0x310b, B:752:0x3111, B:753:0x313f, B:632:0x29fb, B:634:0x2a01, B:635:0x2a29, B:637:0x2a63, B:638:0x2aad, B:605:0x274c, B:607:0x2761, B:608:0x2791, B:587:0x2422, B:589:0x2428, B:590:0x2455, B:592:0x248f, B:593:0x24d7, B:557:0x20c9, B:559:0x20de, B:560:0x210e, B:562:0x2142, B:563:0x21c4, B:537:0x1e58, B:539:0x1e5e, B:540:0x1e86, B:423:0x18ab, B:425:0x18b1, B:426:0x18e0, B:378:0x1658, B:380:0x165e, B:381:0x168a, B:17:0x01fe, B:19:0x0204, B:20:0x022a, B:22:0x03ed, B:24:0x041f, B:25:0x047e, B:386:0x1713, B:388:0x1717, B:409:0x1818, B:411:0x181e, B:412:0x181f, B:414:0x1821, B:416:0x1828, B:417:0x1829, B:392:0x1723, B:398:0x172e, B:400:0x1743, B:401:0x1777, B:402:0x177d, B:404:0x178a, B:405:0x17ff), top: B:948:0x01fe, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:758:0x31d1  */
    /* JADX WARN: Removed duplicated region for block: B:761:0x3222  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x327f  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x3436  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x3523  */
    /* JADX WARN: Removed duplicated region for block: B:795:0x3578  */
    /* JADX WARN: Removed duplicated region for block: B:800:0x35c7  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x379c  */
    /* JADX WARN: Removed duplicated region for block: B:862:0x1713 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:899:0x197b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:903:0x0c80 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:943:0x2bae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:949:0x1243 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:996:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v10 */
    /* JADX WARN: Type inference failed for: r30v11 */
    /* JADX WARN: Type inference failed for: r30v14 */
    /* JADX WARN: Type inference failed for: r30v15 */
    /* JADX WARN: Type inference failed for: r30v16 */
    /* JADX WARN: Type inference failed for: r30v17 */
    /* JADX WARN: Type inference failed for: r30v18 */
    /* JADX WARN: Type inference failed for: r30v19 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v20 */
    /* JADX WARN: Type inference failed for: r30v21 */
    /* JADX WARN: Type inference failed for: r30v22 */
    /* JADX WARN: Type inference failed for: r30v23 */
    /* JADX WARN: Type inference failed for: r30v24 */
    /* JADX WARN: Type inference failed for: r30v25 */
    /* JADX WARN: Type inference failed for: r30v26 */
    /* JADX WARN: Type inference failed for: r30v27 */
    /* JADX WARN: Type inference failed for: r30v28 */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v30 */
    /* JADX WARN: Type inference failed for: r30v32, types: [long] */
    /* JADX WARN: Type inference failed for: r30v33 */
    /* JADX WARN: Type inference failed for: r30v34 */
    /* JADX WARN: Type inference failed for: r30v35 */
    /* JADX WARN: Type inference failed for: r30v36 */
    /* JADX WARN: Type inference failed for: r30v37 */
    /* JADX WARN: Type inference failed for: r30v38 */
    /* JADX WARN: Type inference failed for: r30v39 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r30v40 */
    /* JADX WARN: Type inference failed for: r30v41 */
    /* JADX WARN: Type inference failed for: r30v43, types: [long] */
    /* JADX WARN: Type inference failed for: r30v44 */
    /* JADX WARN: Type inference failed for: r30v45 */
    /* JADX WARN: Type inference failed for: r30v46 */
    /* JADX WARN: Type inference failed for: r30v47 */
    /* JADX WARN: Type inference failed for: r30v48 */
    /* JADX WARN: Type inference failed for: r30v49 */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r30v50 */
    /* JADX WARN: Type inference failed for: r30v51 */
    /* JADX WARN: Type inference failed for: r30v52 */
    /* JADX WARN: Type inference failed for: r30v53 */
    /* JADX WARN: Type inference failed for: r30v54 */
    /* JADX WARN: Type inference failed for: r30v55 */
    /* JADX WARN: Type inference failed for: r30v56 */
    /* JADX WARN: Type inference failed for: r30v57 */
    /* JADX WARN: Type inference failed for: r30v58 */
    /* JADX WARN: Type inference failed for: r30v59 */
    /* JADX WARN: Type inference failed for: r30v6 */
    /* JADX WARN: Type inference failed for: r30v60 */
    /* JADX WARN: Type inference failed for: r30v61 */
    /* JADX WARN: Type inference failed for: r30v62 */
    /* JADX WARN: Type inference failed for: r30v63 */
    /* JADX WARN: Type inference failed for: r30v64 */
    /* JADX WARN: Type inference failed for: r30v65 */
    /* JADX WARN: Type inference failed for: r30v7 */
    /* JADX WARN: Type inference failed for: r30v8 */
    /* JADX WARN: Type inference failed for: r30v9 */
    /* JADX WARN: Type inference failed for: r33v10 */
    /* JADX WARN: Type inference failed for: r33v12 */
    /* JADX WARN: Type inference failed for: r33v9 */
    /* JADX WARN: Type inference failed for: r35v101 */
    /* JADX WARN: Type inference failed for: r35v102 */
    /* JADX WARN: Type inference failed for: r35v103 */
    /* JADX WARN: Type inference failed for: r35v105 */
    /* JADX WARN: Type inference failed for: r35v113 */
    /* JADX WARN: Type inference failed for: r35v114 */
    /* JADX WARN: Type inference failed for: r35v115 */
    /* JADX WARN: Type inference failed for: r35v116 */
    /* JADX WARN: Type inference failed for: r35v117 */
    /* JADX WARN: Type inference failed for: r35v118 */
    /* JADX WARN: Type inference failed for: r35v119 */
    /* JADX WARN: Type inference failed for: r35v120 */
    /* JADX WARN: Type inference failed for: r35v121 */
    /* JADX WARN: Type inference failed for: r35v122 */
    /* JADX WARN: Type inference failed for: r35v123 */
    /* JADX WARN: Type inference failed for: r35v124 */
    /* JADX WARN: Type inference failed for: r35v15 */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r35v4 */
    /* JADX WARN: Type inference failed for: r35v52 */
    /* JADX WARN: Type inference failed for: r35v64 */
    /* JADX WARN: Type inference failed for: r35v68 */
    /* JADX WARN: Type inference failed for: r35v69 */
    /* JADX WARN: Type inference failed for: r35v70 */
    /* JADX WARN: Type inference failed for: r35v71 */
    /* JADX WARN: Type inference failed for: r35v72 */
    /* JADX WARN: Type inference failed for: r35v74 */
    /* JADX WARN: Type inference failed for: r35v75 */
    /* JADX WARN: Type inference failed for: r35v8 */
    /* JADX WARN: Type inference failed for: r35v80 */
    /* JADX WARN: Type inference failed for: r35v81 */
    /* JADX WARN: Type inference failed for: r35v82 */
    /* JADX WARN: Type inference failed for: r35v9 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v332, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v376 */
    /* JADX WARN: Type inference failed for: r3v399, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v433 */
    /* JADX WARN: Type inference failed for: r3v559 */
    /* JADX WARN: Type inference failed for: r3v560 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v175 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v215 */
    /* JADX WARN: Type inference failed for: r4v216 */
    /* JADX WARN: Type inference failed for: r4v217 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v236 */
    /* JADX WARN: Type inference failed for: r4v237 */
    /* JADX WARN: Type inference failed for: r4v238 */
    /* JADX WARN: Type inference failed for: r4v239 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v240 */
    /* JADX WARN: Type inference failed for: r4v241 */
    /* JADX WARN: Type inference failed for: r4v244, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v245 */
    /* JADX WARN: Type inference failed for: r4v246 */
    /* JADX WARN: Type inference failed for: r4v247 */
    /* JADX WARN: Type inference failed for: r4v248 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v264 */
    /* JADX WARN: Type inference failed for: r4v265 */
    /* JADX WARN: Type inference failed for: r4v266 */
    /* JADX WARN: Type inference failed for: r4v267 */
    /* JADX WARN: Type inference failed for: r4v268 */
    /* JADX WARN: Type inference failed for: r4v269 */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v270 */
    /* JADX WARN: Type inference failed for: r4v271 */
    /* JADX WARN: Type inference failed for: r4v272 */
    /* JADX WARN: Type inference failed for: r4v273 */
    /* JADX WARN: Type inference failed for: r4v274 */
    /* JADX WARN: Type inference failed for: r4v275 */
    /* JADX WARN: Type inference failed for: r4v276 */
    /* JADX WARN: Type inference failed for: r4v277 */
    /* JADX WARN: Type inference failed for: r4v58, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v59, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v121, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v122 */
    /* JADX WARN: Type inference failed for: r6v150 */
    /* JADX WARN: Type inference failed for: r6v151, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v176 */
    /* JADX WARN: Type inference failed for: r6v177 */
    /* JADX WARN: Type inference failed for: r6v178 */
    /* JADX WARN: Type inference failed for: r6v182 */
    /* JADX WARN: Type inference failed for: r6v184, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v185 */
    /* JADX WARN: Type inference failed for: r6v186 */
    /* JADX WARN: Type inference failed for: r6v187 */
    /* JADX WARN: Type inference failed for: r6v192 */
    /* JADX WARN: Type inference failed for: r6v199 */
    /* JADX WARN: Type inference failed for: r6v494 */
    /* JADX WARN: Type inference failed for: r6v495 */
    /* JADX WARN: Type inference failed for: r6v496 */
    /* JADX WARN: Type inference failed for: r6v497 */
    /* JADX WARN: Type inference failed for: r6v498 */
    /* JADX WARN: Type inference failed for: r6v95, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v96 */
    /* JADX WARN: Type inference failed for: r8v100 */
    /* JADX WARN: Type inference failed for: r8v101 */
    /* JADX WARN: Type inference failed for: r8v102 */
    /* JADX WARN: Type inference failed for: r8v112 */
    /* JADX WARN: Type inference failed for: r8v113 */
    /* JADX WARN: Type inference failed for: r8v129 */
    /* JADX WARN: Type inference failed for: r8v130 */
    /* JADX WARN: Type inference failed for: r8v131 */
    /* JADX WARN: Type inference failed for: r8v132 */
    /* JADX WARN: Type inference failed for: r8v135 */
    /* JADX WARN: Type inference failed for: r8v146 */
    /* JADX WARN: Type inference failed for: r8v157 */
    /* JADX WARN: Type inference failed for: r8v158 */
    /* JADX WARN: Type inference failed for: r8v159 */
    /* JADX WARN: Type inference failed for: r8v160 */
    /* JADX WARN: Type inference failed for: r8v161 */
    /* JADX WARN: Type inference failed for: r8v162 */
    /* JADX WARN: Type inference failed for: r8v163 */
    /* JADX WARN: Type inference failed for: r8v164 */
    /* JADX WARN: Type inference failed for: r8v165 */
    /* JADX WARN: Type inference failed for: r8v166 */
    /* JADX WARN: Type inference failed for: r8v167 */
    /* JADX WARN: Type inference failed for: r8v168 */
    /* JADX WARN: Type inference failed for: r8v169 */
    /* JADX WARN: Type inference failed for: r8v170 */
    /* JADX WARN: Type inference failed for: r8v171 */
    /* JADX WARN: Type inference failed for: r8v172 */
    /* JADX WARN: Type inference failed for: r8v173 */
    /* JADX WARN: Type inference failed for: r8v174 */
    /* JADX WARN: Type inference failed for: r8v175 */
    /* JADX WARN: Type inference failed for: r8v176 */
    /* JADX WARN: Type inference failed for: r8v177 */
    /* JADX WARN: Type inference failed for: r8v178 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v68 */
    /* JADX WARN: Type inference failed for: r8v69 */
    /* JADX WARN: Type inference failed for: r8v72 */
    /* JADX WARN: Type inference failed for: r8v73 */
    /* JADX WARN: Type inference failed for: r8v74 */
    /* JADX WARN: Type inference failed for: r8v75 */
    /* JADX WARN: Type inference failed for: r8v76 */
    /* JADX WARN: Type inference failed for: r8v79 */
    /* JADX WARN: Type inference failed for: r8v81 */
    /* JADX WARN: Type inference failed for: r8v85, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v90 */
    /* JADX WARN: Type inference failed for: r8v91 */
    /* JADX WARN: Type inference failed for: r8v92 */
    /* JADX WARN: Type inference failed for: r8v93 */
    /* JADX WARN: Type inference failed for: r8v97 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.PaymentConfirmNewActivity.attachBaseContext(android.content.Context):void");
    }

    public static void m10088$r8$lambda$Q_Od7Pi3XudQSEK0GRPTOWktr4(PaymentConfirmNewActivity paymentConfirmNewActivity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 65;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m10092instrumented$1$initView$V(paymentConfirmNewActivity, view);
        int i4 = equals + 29;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
    }

    public static void m10089$r8$lambda$XW8rGpnpB5Cw3AJJR8nsmSkE6I(PaymentConfirmNewActivity paymentConfirmNewActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        m10091instrumented$0$initView$V(paymentConfirmNewActivity, view);
        if (i3 != 0) {
            throw null;
        }
    }

    static void m10090$$Nest$mcheckoutResult(PaymentConfirmNewActivity paymentConfirmNewActivity, CheckoutResp checkoutResp) {
        int i = 2 % 2;
        int i2 = equals + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        paymentConfirmNewActivity.checkoutResult(checkoutResp);
        if (i3 != 0) {
            throw null;
        }
    }

    private static void m10091instrumented$0$initView$V(PaymentConfirmNewActivity paymentConfirmNewActivity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 75;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                paymentConfirmNewActivity.lambda$initView$0(view);
                Callback.onClick_exit();
            } else {
                paymentConfirmNewActivity.lambda$initView$0(view);
                Callback.onClick_exit();
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void m10092instrumented$1$initView$V(PaymentConfirmNewActivity paymentConfirmNewActivity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 61;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                paymentConfirmNewActivity.lambda$initView$1(view);
                Callback.onClick_exit();
                obj.hashCode();
                throw null;
            }
            paymentConfirmNewActivity.lambda$initView$1(view);
            Callback.onClick_exit();
            int i4 = equals + 121;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = equals + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = component2 + 109;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
