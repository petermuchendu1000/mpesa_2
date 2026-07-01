package com.huawei.digitalpayment.consumer.mpin.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.blankj.utilcode.constant.CacheConstants;
import com.blankj.utilcode.util.KeyboardUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.baselibs2.utils.encrypt.EncryptManager;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.ViewUtils;
import com.huawei.common.util.color.ColorUtils;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.common.widget.toast.CommonToast;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.dialog.SingleSelectDialog;
import com.huawei.digitalpayment.consumer.baselib.service.ILoginService;
import com.huawei.digitalpayment.consumer.constants.Keys;
import com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity;
import com.huawei.digitalpayment.consumer.login.databinding.ActivityResetPinVerifyIdBinding;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType;
import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.ResetPinVerifyIdViewModel;
import com.huawei.digitalpayment.consumer.loginModule.register.model.LocalIdType;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ReSetPinParams;
import com.huawei.digitalpayment.consumer.loginModule.register.request.VerifyConfig;
import com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyParams;
import com.huawei.digitalpayment.consumer.service.IRiskService;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import com.safaricom.mpesa.lifestyle.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.io.encoding.Base64;

public class ResetPinVerifyIdActivity extends Hilt_ResetPinVerifyIdActivity<ActivityResetPinVerifyIdBinding, ResetPinVerifyIdViewModel> {
    private LocalIdType currentIdType;
    private SingleSelectDialog<LocalIdType> dialogFragment;
    private List<LocalIdType> idTypes;
    private boolean showSelectIdTypeDialog;
    private static final byte[] $$l = {62, TarHeader.LF_FIFO, 60, 44};
    private static final int $$o = 26;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {77, -67, -125, 9, -16, -2, 59, -61, -12, -4, 4, -9, 3, TarHeader.LF_CHR, -55, -17, 6, -18, -1, 2, 1, TarHeader.LF_SYMLINK, -61, -10, -10, 65, -57, -16, -2, -4, -6, -3, 60, -63, -9, -10, Ascii.VT, -17, 0, 9, -15, 58, -80, -4, Ascii.VT, -25, 3, -21, 9, Ascii.GS, -33, -23, Ascii.SI, 8, 8, -14, -37, Ascii.SI, -23, Ascii.VT, -16, -2, -7, -3, -3, 5, -13, -10, Base64.padSymbol, -16, -2, 59, -62, -17, Ascii.DLE, -26, Ascii.SO, -8, TarHeader.LF_CONTIG, -58, -9, -2, -6, -15, Ascii.SI, -15, -8, Ascii.VT, -28, 8, 4, -13, -10, 66, -57, -16, -3, -9, -6, 4, 4, -17, SignedBytes.MAX_POWER_OF_TWO, -77, Ascii.SO, -1, -24, 9, 0, -22, 69, -63, -9, -10, Ascii.VT, -17, 13, -6, -21, 7, -10, -3, 60, -60, -19, 3, 7, -21, 7, -10, -3, 60, -41, -37, Ascii.SI, -21, -6, 32, -21, -28, 81, -21, -16, -5, -13, 17, -5, -5, 1, -24, 5, -12};
    private static final int $$k = WSContextConstant.HANDSHAKE_RECEIVE_SIZE;
    private static final byte[] $$d = {93, TarHeader.LF_LINK, 76, -114, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 81;
    private static int getRequestBeneficiariesState = 0;
    private static int equals = 1;
    private static long component2 = 4527838596019539391L;
    private static int copydefault = 1386857713;
    private static char ShareDataUIState = 50417;
    private static char component1 = 16811;
    private static char component3 = 48666;
    private static char getAsAtTimestamp = 38469;
    private static char component4 = 47609;
    private String newToken = null;
    private String forward = null;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(byte r6, short r7, int r8) {
        /*
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifyIdActivity.$$l
            int r8 = r8 + 98
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r8 = r8 + 1
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifyIdActivity.$$r(byte, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            int r9 = 28 - r9
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifyIdActivity.$$d
            int r7 = r7 * 2
            int r7 = r7 + 83
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r8
            r3 = r9
            r5 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            r6 = r8
            r8 = r7
            r7 = r6
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L2b:
            int r8 = r8 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-8)
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifyIdActivity.h(short, short, byte, java.lang.Object[]):void");
    }

    private static void i(byte b2, int i, int i2, Object[] objArr) {
        byte[] bArr = $$j;
        int i3 = 99 - (b2 * 16);
        int i4 = 141 - i2;
        byte[] bArr2 = new byte[74 - i];
        int i5 = 73 - i;
        int i6 = -1;
        if (bArr == null) {
            i3 = (i3 + (-i5)) - 4;
        }
        while (true) {
            i6++;
            i4++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = (i3 + (-bArr[i4])) - 4;
        }
    }

    private static void g(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                int i5 = $11 + 71;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i3) ^ ((c3 << 4) + ((char) (((long) getAsAtTimestamp) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(component4)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(844 - (ViewConfiguration.getPressedStateDuration() >> 16), (Process.myTid() >> 22) + 32, (char) (TextUtils.lastIndexOf("", '0', 0) + 23252), 592652048, false, $$r(b2, b3, (byte) (b3 | 13)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component3)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(844 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 32 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 23251), 592652048, false, $$r(b4, b5, (byte) (b5 | 13)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
                    i4++;
                    int i7 = $10 + 3;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 49 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) View.MeasureSpec.getSize(0), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
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
        while (iNotificationSideChannel.copydefault < length3) {
            int i4 = $10 + 85;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4036, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31, (char) (19181 - (ViewConfiguration.getTapTimeout() >> 16)), 1912513118, false, $$r(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7567 - Color.red(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 2411, Drawable.resolveOpacity(0, 0) + 28, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 931716605, false, $$r(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7566 - ImageFormat.getBitsPerPixel(0), 10 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component2 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) copydefault) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) ShareDataUIState) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 119;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    private void lambda$onCreate$0(View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 125;
        equals = i2 % 128;
        int i3 = i2 % 2;
        preShowSelectIdType();
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
    }

    private void lambda$onCreate$1(View view) {
        int i = 2 % 2;
        int i2 = equals + 57;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        onConfirmClick();
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
    }

    private void lambda$onCreate$2() {
        int i = 2 % 2;
        int i2 = equals + 37;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        KeyboardUtils.showSoftInput(this);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = equals + 19;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        f(new char[]{14774, 10278, 17251, 1770, 37044, 13250, 2381, 31688, 11586, 12796, 63683, 32712, 46732, 20950, 10369, 24845, 36466, 21975}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952715_res_0x7f13044b).substring(6, 7).codePointAt(0) - 32, new char[]{35150, 65189, 5711, 62815}, (char) (TextUtils.lastIndexOf("", '0', 0) + 37497), new char[]{50459, 27462, 30954, 48786}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        f(new char[]{43671, 2039, 43803, 1434, 27928}, (Process.myTid() >> 22) + 1055424456, new char[]{35150, 65189, 5711, 62815}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(15) + 64397), new char[]{51340, 59519, 64830, 1787}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = equals + 79;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                f(new char[]{35995, 21591, 35410, 26047, 23324, 56835, 47652, 21414, 5539, 137, 22323, 23852, 50484, 22356, 48860, 47171, 27732, 56876, 27403, 13934, 19180, 48322, 8870, 1438, 31433, 47687}, ViewConfiguration.getEdgeSlop() >> 16, new char[]{35150, 65189, 5711, 62815}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 6188), new char[]{47329, 3499, 18932, 1048}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                f(new char[]{58738, 36107, 30984, 5941, 48748, 19197, 31232, 52905, 26298, 39565, 3587, 40989, 23945, 24504, 38957, 44208, 40728, 5394}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(20) - 108, new char[]{35150, 65189, 5711, 62815}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952303_res_0x7f1302af).substring(0, 2).length() + 43531), new char[]{23693, 9480, 3366, 23210}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i4 = equals + 79;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 6618, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 41, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    f(new char[]{51038, 15036, 38095, 16345, 13954, 57570, 62248, 26366, 59062, 52964, 56739, 5854, 40742, 50712, 19874, 53463, 64690, 1023, 55616, 10881, 60868, 48701, 6486, 44449, 11144, 55319, 33783, 20330, 23744, 15895, 21834, 8457, 31810, 17536, 53640, 62326, 34574, 53140, 50422, 59507, 36483, 61492, 55672, 37551, 12948, 954, 21105, 22629}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 114, new char[]{35150, 65189, 5711, 62815}, (char) (Process.myPid() >> 22), new char[]{14935, 50177, 1983, 13404}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f(new char[]{21279, 37020, 46193, 49738, 54515, 5715, 35621, 3721, 22403, 17167, 40026, 60403, 9330, 20944, 24182, 40152, 50678, 47969, 9264, 38841, 20627, 11299, 9809, 14974, 11509, 33849, 48133, 24573, 22662, 886, 1509, 63211, 12933, 12585, 34559, 58410, 36962, 51089, 52785, 11630, 62488, 52106, 27982, 58558, 55058, 5163, 57841, 45272, 17054, 28986, 8604, 22935, 37494, 53123, 5770, 4539, 42672, 42733, 40668, 39691, 37013, 36145, 36343, 32775}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952719_res_0x7f13044f).substring(6, 7).length() - 1, new char[]{35150, 65189, 5711, 62815}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), new char[]{19507, 2828, 44233, 31043}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    f(new char[]{21444, 4396, 56983, 26275, 23146, 26215, 62405, 21085, 13201, 42920, 40563, 4155, 26590, 20960, 29845, 61213, 57503, 54338, 41187, 34591, 10368, 41120, 61242, 19218, 59083, '2', 62535, 37694, 22522, 63105, 14602, 40972, 50359, 22895, 49738, 17618, 56976, 39798, 11151, 11766, 20633, 41433, 8505, 47386, 32346, 26855, 45159, 845, 62427, 31207, 10204, 60611, 14118, 24576, 17600, 33233, 34195, 8073, 48851, 31014, 28020, 19090, 22758, 35431}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952754_res_0x7f130472).substring(2, 3).length() - 1, new char[]{35150, 65189, 5711, 62815}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 99), new char[]{2956, 30084, 28702, 41602}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f(new char[]{4053, 20088, 42205, 64301, 12427, 27231, 24022, 42871, 17038, 12880, 361, 28800, 61296, 6802, 3809, 33061, 25927, 62232, 8941, 8141, 54271, 16442, 4332, 56818, 27135, 31611, 29274, 54501, 23478, 18006, 23120, 52516, 6627, 3776, 14067, 57502, 57176, 15356, 19485, 41449, 43623, 33003, 32054, 34354, 42064, 59534, 5507, 42206, 43689, 17722, 53667, 63817, 38489, 32215, 16179, 40889, 54758, 21395, 34388, 25256, 51357, 9893, 59980, 56838, 35151, 64029, 61492, 11934, 24534, 40355, 18391, 41822}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952717_res_0x7f13044d).substring(6, 7).length() - 1, new char[]{35150, 65189, 5711, 62815}, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), new char[]{53037, 5213, 33396, 28336}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    g((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6, new char[]{24301, 28232, 4621, 28794, 18323, 53782}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(19) - 10, new char[]{41568, 28369, 29766, 23837, 44606, 14174, 62688, 3869, 4618, 42181, 7775, 11613, 3416, 60407, 30304, 20150, 31822, 42635, 17246, 47463, 40226, 4191, 3066, 23648, 42029, 17803, 16105, 10852, 40445, 47447, 59501, 64496, 25110, 44329, 54922, 64845}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - TextUtils.getCapsMode("", 0, 0), 56 - Color.argb(0, 0, 0, 0), (char) (ViewConfiguration.getScrollBarSize() >> 8), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2406;
            int i6 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26;
            char size = (char) View.MeasureSpec.getSize(0);
            byte[] bArr = $$d;
            Object[] objArr13 = new Object[1];
            h((byte) (-bArr[22]), bArr[33], (byte) (-bArr[38]), objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, i6, size, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int i7 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2404;
                int minimumFlingVelocity = 26 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                char cResolveSize = (char) View.resolveSize(0, 0);
                Object[] objArr14 = new Object[1];
                h((byte) (-$$d[22]), r3[67], r3[95], objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i7, minimumFlingVelocity, cResolveSize, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            g(Color.argb(0, 0, 0, 0) + 16, new char[]{29443, 47112, 2375, 62413, 22237, 48149, 34743, 15473, 1102, 61943, 11224, 7535, 23319, 47481, 29298, 13411}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            f(new char[]{48854, 10105, 44142, 25012, 36877, 60969, 55046, 15172, 4050, 23237, 47913, 38357, 54818, 7497, 55776, 47228}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952719_res_0x7f13044f).substring(6, 7).codePointAt(0) - 32, new char[]{35150, 65189, 5711, 62815}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(25) + 48425), new char[]{47587, 29600, 40199, 5053}, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -1073915065};
                byte[] bArr2 = $$j;
                Object[] objArr18 = new Object[1];
                i(bArr2[38], bArr2[137], (short) 138, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                i(bArr2[20], bArr2[41], (short) 97, objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 2405;
                    int iRgb = Color.rgb(0, 0, 0) + 16777242;
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                    Object[] objArr20 = new Object[1];
                    h((byte) (-$$d[22]), r5[67], r5[95], objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionType, iRgb, cIndexOf, 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    f(new char[]{61076, 16433, 42296, 25943, 11528, 10082, 42153, 24210, 51887, 35877, 7404, 36778, 59037, 48694, 48925, 14879, 22413, 46631, 65000, 34072, 44001, 21283}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{35150, 65189, 5711, 62815}, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{19438, 63152, 2616, 63731}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    f(new char[]{16514, 22562, 8704, 19336, 21648, 17374, 19242, 29003, 11141, 25257, 26994, 25903, 30787, 30903, 50803}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952792_res_0x7f130498).substring(2, 3).codePointAt(0) - 461223819, new char[]{35150, 65189, 5711, 62815}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131953647_res_0x7f1307ef).substring(0, 4).codePointAt(1) + 3424), new char[]{38256, 33352, 36580, 1037}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int defaultSize = View.getDefaultSize(0, 0) + 2405;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 27;
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                        Object[] objArr23 = new Object[1];
                        h((byte) ($$d[9] - 1), r7[21], r7[33], objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(defaultSize, iIndexOf, cAxisFromString, -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int size2 = 2405 - View.MeasureSpec.getSize(0);
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 26;
                        char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                        byte[] bArr3 = $$d;
                        Object[] objArr24 = new Object[1];
                        h((byte) (-bArr3[22]), bArr3[33], (byte) (-bArr3[38]), objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(size2, maxKeyCode, cIndexOf2, -2047739879, false, (String) objArr24[0], null);
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
        int i8 = ((int[]) objArr[0])[0];
        int i9 = ((int[]) objArr[2])[0];
        if (i9 != i8) {
            long j = -1;
            long j2 = ((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 6618, (ViewConfiguration.getTapTimeout() >> 16) + 42, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            try {
                Object[] objArr25 = {895402118, Long.valueOf(j4), new ArrayList(), null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6562 - View.resolveSize(0, 0), Color.red(0) + 56, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16));
                byte[] bArr4 = $$j;
                byte b2 = bArr4[38];
                byte b3 = bArr4[102];
                Object[] objArr26 = new Object[1];
                i(b2, b3, (short) (b3 | Ascii.DC2), objArr26);
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
        ViewUtils.softInputAdjustResize(getWindow(), ((ActivityResetPinVerifyIdBinding) this.binding).getRoot());
        ((ActivityResetPinVerifyIdBinding) this.binding).resetPinVerifyTipParent.setBackgroundColor(ColorUtils.INSTANCE.withAlpha(0.2f, com.blankj.utilcode.util.ColorUtils.getColor(com.huawei.digitalpayment.consumer.login.R.color.colorWarningDisable)));
        ((ActivityResetPinVerifyIdBinding) this.binding).idType.setOnInputViewParentClickListener(new View.OnClickListener() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i10 = 2 % 2;
                int i11 = copydefault + 3;
                component1 = i11 % 128;
                int i12 = i11 % 2;
                ResetPinVerifyIdActivity.m10765$r8$lambda$Q2atE5coEd2WEaorsddpSoqkLI(this.f$0, view);
                int i13 = copydefault + 93;
                component1 = i13 % 128;
                if (i13 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        ((ActivityResetPinVerifyIdBinding) this.binding).btnNext.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public final void onClick(View view) {
                int i10 = 2 % 2;
                int i11 = component2 + 97;
                component1 = i11 % 128;
                int i12 = i11 % 2;
                ResetPinVerifyIdActivity.$r8$lambda$VU9xaydo85NcZ4uWYjJHkHF9g2k(this.f$0, view);
                int i13 = component2 + 71;
                component1 = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 62 / 0;
                }
            }
        });
        ((ActivityResetPinVerifyIdBinding) this.binding).btnNext.setEnabled(false);
        MPTextWatcher mPTextWatcher = new MPTextWatcher() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public void afterTextChanged(Editable editable) {
                int i10 = 2 % 2;
                int i11 = component1 + 123;
                component3 = i11 % 128;
                int i12 = i11 % 2;
                ResetPinVerifyIdActivity.m10771$$Nest$mcheckConfirmClickable(ResetPinVerifyIdActivity.this);
                if (i12 != 0) {
                    int i13 = 16 / 0;
                }
            }
        };
        ((ActivityResetPinVerifyIdBinding) this.binding).idNumber.getEditText().addTextChangedListener(mPTextWatcher);
        ((ActivityResetPinVerifyIdBinding) this.binding).idType.getEditText().addTextChangedListener(mPTextWatcher);
        addObserver();
        queryDataDict(false);
        ((ActivityResetPinVerifyIdBinding) this.binding).idNumber.getEditText().requestFocus();
        ((ActivityResetPinVerifyIdBinding) this.binding).idNumber.getEditText().postDelayed(new Runnable() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final void run() {
                int i10 = 2 % 2;
                int i11 = component3 + 61;
                component1 = i11 % 128;
                int i12 = i11 % 2;
                ResetPinVerifyIdActivity.m10766$r8$lambda$Vrt5yQrqPuNITWhVIfcsgTic4c(this.f$0);
                if (i12 == 0) {
                    int i13 = 97 / 0;
                }
            }
        }, 200L);
    }

    private void queryDataDict(boolean z) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 93;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            this.showSelectIdTypeDialog = z;
            ((ResetPinVerifyIdViewModel) this.viewModel).queryDataDict();
        } else {
            this.showSelectIdTypeDialog = z;
            ((ResetPinVerifyIdViewModel) this.viewModel).queryDataDict();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private void checkConfirmClickable() {
        int i = 2 % 2;
        int i2 = equals + 85;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            if (TextUtils.isEmpty(((ActivityResetPinVerifyIdBinding) this.binding).idType.getText().trim())) {
                ((ActivityResetPinVerifyIdBinding) this.binding).btnNext.setEnabled(false);
                int i3 = getRequestBeneficiariesState + 47;
                equals = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            ((ActivityResetPinVerifyIdBinding) this.binding).btnNext.setEnabled(!TextUtils.isEmpty(((ActivityResetPinVerifyIdBinding) this.binding).idNumber.getText().trim()));
            return;
        }
        TextUtils.isEmpty(((ActivityResetPinVerifyIdBinding) this.binding).idType.getText().trim());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void onConfirmClick() {
        int i = 2 % 2;
        KeyboardUtils.hideSoftInput(this);
        String stringExtra = getIntent().getStringExtra("token");
        if (TextUtils.isEmpty(stringExtra)) {
            int i2 = getRequestBeneficiariesState + 117;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                resetPin(null);
                return;
            } else {
                resetPin(null);
                int i3 = 36 / 0;
                return;
            }
        }
        String stringExtra2 = getIntent().getStringExtra(KeysConstants.KEY_LOGIN_TYPE);
        String strTrim = ((ActivityResetPinVerifyIdBinding) this.binding).idNumber.getText().trim();
        if (stringExtra2 == null) {
            int i4 = equals + 23;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            stringExtra2 = "";
        }
        ProcessVerifyParams processVerifyParams = new ProcessVerifyParams(stringExtra2);
        processVerifyParams.setIdType(this.currentIdType.getId());
        processVerifyParams.setIdNo(strTrim);
        processVerifyParams.setToken(stringExtra);
        Bundle bundle = new Bundle();
        bundle.putSerializable(KeysConstants.KEY_RISK_PARAMS, processVerifyParams);
        ((IRiskService) RouteUtils.getService(IRiskService.class)).startProcess(bundle, new ApiCallback<Bundle>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(Bundle bundle2) {
                int i6 = 2 % 2;
                int i7 = component3 + 61;
                component1 = i7 % 128;
                int i8 = i7 % 2;
                component2(bundle2);
                if (i8 != 0) {
                    int i9 = 14 / 0;
                }
                int i10 = component1 + 45;
                component3 = i10 % 128;
                if (i10 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void component2(Bundle bundle2) {
                int i6 = 2 % 2;
                int i7 = component1 + 65;
                component3 = i7 % 128;
                int i8 = i7 % 2;
                ResetPinVerifyIdActivity.m10770$$Nest$fputnewToken(ResetPinVerifyIdActivity.this, bundle2.getString("token"));
                ResetPinVerifyIdActivity.m10769$$Nest$fputforward(ResetPinVerifyIdActivity.this, bundle2.getString(KeysConstants.KEY_FORWARD));
                ResetPinVerifyIdActivity resetPinVerifyIdActivity = ResetPinVerifyIdActivity.this;
                ResetPinVerifyIdActivity.m10772$$Nest$mresetPin(resetPinVerifyIdActivity, ResetPinVerifyIdActivity.m10768$$Nest$fgetnewToken(resetPinVerifyIdActivity));
                int i9 = component1 + 109;
                component3 = i9 % 128;
                if (i9 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException baseException) {
                int i6 = 2 % 2;
                int i7 = component3 + 7;
                component1 = i7 % 128;
                int i8 = i7 % 2;
                CommonToast.showText(baseException.getMessage());
                if (i8 != 0) {
                    int i9 = 60 / 0;
                }
            }
        });
    }

    private void resetPin(String str) {
        String verifyType;
        int i = 2 % 2;
        int i2 = equals + 11;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String strTrim = ((ActivityResetPinVerifyIdBinding) this.binding).idNumber.getText().trim();
        if (!(!getIntent().hasExtra(Keys.VERIFY_TYPE))) {
            int i4 = equals + 1;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                ((VerifyType) getIntent().getParcelableExtra(Keys.VERIFY_TYPE)).getVerifyType();
                verifyConfig.hashCode();
                throw null;
            }
            verifyType = ((VerifyType) getIntent().getParcelableExtra(Keys.VERIFY_TYPE)).getVerifyType();
        } else {
            verifyType = null;
        }
        ReSetPinParams reSetPinParams = new ReSetPinParams(this.currentIdType.getId(), strTrim, TextUtils.isEmpty(verifyType) ? null : new VerifyConfig(verifyType));
        if (!TextUtils.isEmpty(str)) {
            int i5 = equals + 77;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            reSetPinParams.addParams("token", str);
        }
        ((ResetPinVerifyIdViewModel) this.viewModel).resetPin(reSetPinParams);
    }

    private void preShowSelectIdType() {
        int i = 2 % 2;
        if (this.idTypes != null) {
            int i2 = equals + 115;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            showSelectIdType();
        } else {
            queryDataDict(true);
            int i4 = equals + 105;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = equals + 17;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
    }

    private void lambda$showSelectIdType$3(LocalIdType localIdType) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 123;
        equals = i2 % 128;
        int i3 = i2 % 2;
        this.dialogFragment.dismiss();
        this.currentIdType = localIdType;
        ((ActivityResetPinVerifyIdBinding) this.binding).idType.getEditText().setText(localIdType.getName());
        int i4 = getRequestBeneficiariesState + 125;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    private void showSelectIdType() {
        int i = 2 % 2;
        SingleSelectDialog<LocalIdType> singleSelectDialog = new SingleSelectDialog<>(getString(com.huawei.digitalpayment.consumer.login.R.string.pinmanage_recurity_title2), getString(com.huawei.digitalpayment.consumer.login.R.string.onboarding_register_kyc_button2), this.idTypes, new SingleSelectDialog.OnItemSelectedListener() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public final void onItemSelected(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 51;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    ResetPinVerifyIdActivity.$r8$lambda$8EBGO99SAeePSsGurj5qBiEd3xE(this.f$0, (LocalIdType) obj);
                    throw null;
                }
                ResetPinVerifyIdActivity.$r8$lambda$8EBGO99SAeePSsGurj5qBiEd3xE(this.f$0, (LocalIdType) obj);
                int i4 = component3 + 95;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            }
        }, this.currentIdType);
        this.dialogFragment = singleSelectDialog;
        singleSelectDialog.show(getSupportFragmentManager(), CheckIdentityActivity.ID_TYPE);
        int i2 = getRequestBeneficiariesState + 95;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private void onCheckSuccess() {
        int i = 2 % 2;
        int i2 = equals + 85;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        if (((ILoginService) RouteUtils.getService(ILoginService.class)).dealResetPinSuccessResult()) {
            return;
        }
        Bundle bundle = new Bundle();
        String strTrim = ((ActivityResetPinVerifyIdBinding) this.binding).idNumber.getText().trim();
        bundle.putString("idTypeKey", EncryptManager.INSTANCE.encrypt(this.currentIdType.getId()));
        bundle.putString(CheckIdentityActivity.ID_NUMBER, EncryptManager.INSTANCE.encrypt(strTrim));
        if (!TextUtils.isEmpty(this.newToken)) {
            bundle.putString("token", this.newToken);
            int i4 = equals + 79;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        }
        if (!TextUtils.isEmpty(this.forward)) {
            RouteUtils.routeWithExecute(this.forward, bundle);
            return;
        }
        if (getIntent().hasExtra(Keys.VERIFY_TYPE)) {
            int i6 = equals + 57;
            getRequestBeneficiariesState = i6 % 128;
            if (i6 % 2 != 0) {
                bundle.putParcelable(Keys.VERIFY_TYPE, getIntent().getParcelableExtra(Keys.VERIFY_TYPE));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            bundle.putParcelable(Keys.VERIFY_TYPE, getIntent().getParcelableExtra(Keys.VERIFY_TYPE));
        }
        RouteUtils.routeWithExecute(this, RoutePathConstants.RESET_PIN_TEMP_PIN, bundle);
    }

    private void lambda$addObserver$4(Resource resource) {
        int i = 2 % 2;
        if (resource.loading()) {
            DialogManager.showLoading(this.activity);
            int i2 = getRequestBeneficiariesState + 103;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 % 4;
            }
        } else {
            DialogManager.hideLoading(this.activity);
        }
        Utils.toastError(resource);
        if (resource.success()) {
            int i4 = equals + 45;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            onCheckSuccess();
            finish();
        }
    }

    private void addObserver() {
        int i = 2 % 2;
        ((ResetPinVerifyIdViewModel) this.viewModel).getData().observe(this, new Observer() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 43;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    ResetPinVerifyIdActivity.$r8$lambda$lTevj7sRZtEmJFHoMH87_kyzK8o(this.f$0, (Resource) obj);
                    int i4 = 31 / 0;
                } else {
                    ResetPinVerifyIdActivity.$r8$lambda$lTevj7sRZtEmJFHoMH87_kyzK8o(this.f$0, (Resource) obj);
                }
                int i5 = component3 + 73;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((ResetPinVerifyIdViewModel) this.viewModel).getQueryDataDict().observe(this, new Observer() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 107;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                ResetPinVerifyIdActivity resetPinVerifyIdActivity = this.f$0;
                Resource resource = (Resource) obj;
                if (i4 != 0) {
                    ResetPinVerifyIdActivity.m10767$r8$lambda$vemkDK0sFL6kWQ1bYHqQUPUStk(resetPinVerifyIdActivity, resource);
                } else {
                    ResetPinVerifyIdActivity.m10767$r8$lambda$vemkDK0sFL6kWQ1bYHqQUPUStk(resetPinVerifyIdActivity, resource);
                    throw null;
                }
            }
        });
        int i2 = equals + 15;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void lambda$addObserver$5(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 3;
        equals = i2 % 128;
        int i3 = i2 % 2;
        ((ResetPinVerifyIdViewModel) this.viewModel).cancelQueryDataDict();
        int i4 = getRequestBeneficiariesState + 115;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void lambda$addObserver$6(com.huawei.payment.mvvm.Resource r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r6.loading()
            r2 = 1
            if (r1 == 0) goto L17
            boolean r1 = r5.showSelectIdTypeDialog
            if (r1 == 0) goto L1a
            com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifyIdActivity$$ExternalSyntheticLambda6 r1 = new com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifyIdActivity$$ExternalSyntheticLambda6
            r1.<init>()
            com.huawei.payment.mvvm.Utils.showOrHideLoading(r5, r6, r2, r1)
            goto L1a
        L17:
            com.huawei.payment.mvvm.Utils.showOrHideLoading(r5, r6)
        L1a:
            boolean r1 = r6.error()
            r3 = 0
            if (r1 == 0) goto L48
            int r1 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifyIdActivity.getRequestBeneficiariesState
            int r1 = r1 + 73
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifyIdActivity.equals = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L35
            boolean r1 = r5.showSelectIdTypeDialog
            r4 = 33
            int r4 = r4 / r3
            r1 = r1 ^ r2
            if (r1 == r2) goto L3e
            goto L39
        L35:
            boolean r1 = r5.showSelectIdTypeDialog
            if (r1 == 0) goto L3e
        L39:
            com.huawei.payment.mvvm.Utils.toastError(r6)
            r5.showSelectIdTypeDialog = r3
        L3e:
            int r6 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifyIdActivity.getRequestBeneficiariesState
            int r6 = r6 + 89
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifyIdActivity.equals = r1
            int r6 = r6 % r0
            return
        L48:
            boolean r1 = r6.success()
            if (r1 == 0) goto L8f
            com.huawei.common.widget.dialog.DialogManager.hideLoading(r5)
            java.lang.Object r6 = r6.getData()
            java.util.List r6 = (java.util.List) r6
            r5.idTypes = r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L69
            int r6 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifyIdActivity.equals
            int r6 = r6 + 117
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifyIdActivity.getRequestBeneficiariesState = r1
            int r6 = r6 % r0
            return
        L69:
            java.util.List<com.huawei.digitalpayment.consumer.loginModule.register.model.LocalIdType> r6 = r5.idTypes
            java.lang.Object r6 = r6.get(r3)
            com.huawei.digitalpayment.consumer.loginModule.register.model.LocalIdType r6 = (com.huawei.digitalpayment.consumer.loginModule.register.model.LocalIdType) r6
            r5.currentIdType = r6
            Binding extends androidx.databinding.ViewDataBinding r6 = r5.binding
            com.huawei.digitalpayment.consumer.login.databinding.ActivityResetPinVerifyIdBinding r6 = (com.huawei.digitalpayment.consumer.login.databinding.ActivityResetPinVerifyIdBinding) r6
            com.huawei.common.widget.input.CommonInputView r6 = r6.idType
            android.widget.EditText r6 = r6.getEditText()
            com.huawei.digitalpayment.consumer.loginModule.register.model.LocalIdType r0 = r5.currentIdType
            java.lang.String r0 = r0.getShowContext()
            r6.setText(r0)
            boolean r6 = r5.showSelectIdTypeDialog
            if (r6 == 0) goto L8f
            r5.showSelectIdType()
            r5.showSelectIdTypeDialog = r3
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifyIdActivity.lambda$addObserver$6(com.huawei.payment.mvvm.Resource):void");
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = equals + 43;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(com.huawei.digitalpayment.consumer.login.R.string.pinmanage_recurity_title1));
        int i4 = equals + 77;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = equals + 51;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = com.huawei.digitalpayment.consumer.login.R.layout.activity_reset_pin_verify_id;
        int i5 = getRequestBeneficiariesState + 99;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0111  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifyIdActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014b  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifyIdActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r43) {
        /*
            Method dump skipped, instruction units count: 15324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinVerifyIdActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$8EBGO99SAeePSsGurj5qBiEd3xE(ResetPinVerifyIdActivity resetPinVerifyIdActivity, LocalIdType localIdType) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 83;
        equals = i2 % 128;
        int i3 = i2 % 2;
        resetPinVerifyIdActivity.lambda$showSelectIdType$3(localIdType);
        int i4 = getRequestBeneficiariesState + 121;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
    }

    public static void $r8$lambda$Jvupav_Oos0fZu4fTfHL7f7G5Ww(ResetPinVerifyIdActivity resetPinVerifyIdActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = equals + 119;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        resetPinVerifyIdActivity.lambda$addObserver$5(dialogInterface);
        int i4 = equals + 67;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
    }

    public static void m10765$r8$lambda$Q2atE5coEd2WEaorsddpSoqkLI(ResetPinVerifyIdActivity resetPinVerifyIdActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 39;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m10773instrumented$0$onCreate$LandroidosBundleV(resetPinVerifyIdActivity, view);
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        int i5 = getRequestBeneficiariesState + 59;
        equals = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void $r8$lambda$VU9xaydo85NcZ4uWYjJHkHF9g2k(ResetPinVerifyIdActivity resetPinVerifyIdActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 85;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        m10774instrumented$1$onCreate$LandroidosBundleV(resetPinVerifyIdActivity, view);
        int i4 = getRequestBeneficiariesState + 103;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void m10766$r8$lambda$Vrt5yQrqPuNITWhVIfcsgTic4c(ResetPinVerifyIdActivity resetPinVerifyIdActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 31;
        equals = i2 % 128;
        int i3 = i2 % 2;
        resetPinVerifyIdActivity.lambda$onCreate$2();
        int i4 = equals + 117;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$lTevj7sRZtEmJFHoMH87_kyzK8o(ResetPinVerifyIdActivity resetPinVerifyIdActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 65;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        resetPinVerifyIdActivity.lambda$addObserver$4(resource);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = getRequestBeneficiariesState + 103;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static void m10767$r8$lambda$vemkDK0sFL6kWQ1bYHqQUPUStk(ResetPinVerifyIdActivity resetPinVerifyIdActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 97;
        equals = i2 % 128;
        int i3 = i2 % 2;
        resetPinVerifyIdActivity.lambda$addObserver$6(resource);
        if (i3 == 0) {
            throw null;
        }
        int i4 = equals + 125;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
    }

    static String m10768$$Nest$fgetnewToken(ResetPinVerifyIdActivity resetPinVerifyIdActivity) {
        int i = 2 % 2;
        int i2 = equals + 99;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = resetPinVerifyIdActivity.newToken;
        int i5 = i3 + 125;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static void m10769$$Nest$fputforward(ResetPinVerifyIdActivity resetPinVerifyIdActivity, String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 73;
        equals = i2 % 128;
        int i3 = i2 % 2;
        resetPinVerifyIdActivity.forward = str;
        if (i3 == 0) {
            throw null;
        }
    }

    static void m10770$$Nest$fputnewToken(ResetPinVerifyIdActivity resetPinVerifyIdActivity, String str) {
        int i = 2 % 2;
        int i2 = equals + 3;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        resetPinVerifyIdActivity.newToken = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void m10771$$Nest$mcheckConfirmClickable(ResetPinVerifyIdActivity resetPinVerifyIdActivity) {
        int i = 2 % 2;
        int i2 = equals + 85;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        resetPinVerifyIdActivity.checkConfirmClickable();
        int i4 = equals + 87;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    static void m10772$$Nest$mresetPin(ResetPinVerifyIdActivity resetPinVerifyIdActivity, String str) {
        int i = 2 % 2;
        int i2 = equals + 69;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        resetPinVerifyIdActivity.resetPin(str);
        int i4 = getRequestBeneficiariesState + 77;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Finally extract failed */
    private static void m10773instrumented$0$onCreate$LandroidosBundleV(ResetPinVerifyIdActivity resetPinVerifyIdActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 57;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                resetPinVerifyIdActivity.lambda$onCreate$0(view);
                Callback.onClick_exit();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            resetPinVerifyIdActivity.lambda$onCreate$0(view);
            Callback.onClick_exit();
            int i4 = equals + 59;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10774instrumented$1$onCreate$LandroidosBundleV(ResetPinVerifyIdActivity resetPinVerifyIdActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 77;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            resetPinVerifyIdActivity.lambda$onCreate$1(view);
            Callback.onClick_exit();
            int i4 = getRequestBeneficiariesState + 95;
            equals = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 123;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = equals + 45;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }
}
