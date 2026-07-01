package com.huawei.digitalpayment.checkout.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.CountDownTimer;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.ActivityUtils;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.checkout.model.request.SubscribeOdRequest;
import com.huawei.digitalpayment.checkout.model.response.SubscribeOdResp;
import com.huawei.digitalpayment.checkout.viewmodel.CheckoutViewModel;
import com.huawei.digitalpayment.checkoutUi.R;
import com.huawei.digitalpayment.consumer.baselib.databinding.ActivityBasePinBinding;
import com.huawei.digitalpayment.consumer.baselib.pin.model.PinType;
import com.huawei.digitalpayment.consumer.baselib.service.ILoginService;
import com.huawei.digitalpayment.consumer.baselib.util.PhoneUtils;
import com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils;
import com.huawei.payment.mvvm.Resource;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;
import kotlin.getActiveNotifications;

public class SubscribePinActivity extends Hilt_SubscribePinActivity<ActivityBasePinBinding, CheckoutViewModel> {
    private static final int COUNT_DOWN_TIME = 2;
    private static char ShareDataUIState;
    private static char component1;
    private static int[] component2;
    private static char component3;
    private static long component4;
    private static char copydefault;
    private static char[] equals;
    private static int getShareableDataState;
    protected final CountDownTimer downTimer = new CountDownTimer(2000, 1000) {
        private static int component1 = 1;
        private static int component2;

        @Override
        public void onFinish() {
            int i = 2 % 2;
            int i2 = component1 + 37;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            SubscribePinActivity.m10119$$Nest$mhandOk(SubscribePinActivity.this);
            int i4 = component2 + 11;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 85 / 0;
            }
        }

        @Override
        public void onTick(long j) {
            int i = 2 % 2;
            int i2 = component1 + 123;
            component2 = i2 % 128;
            int i3 = i2 % 2;
        }
    };
    private int type;
    private static final byte[] $$l = {Ascii.SI, -74, 84, -51};
    private static final int $$o = 179;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {105, -91, -115, Ascii.US, Ascii.SI, 1, -60, TarHeader.LF_FIFO, Ascii.SO, 0, -4, 2, 4, 2, -48, 60, Ascii.SO, -6, Ascii.DLE, -14, Ascii.DLE, -65, 65, 6, 8, 3, -8, -1, -52, 33, 38, 8, 3, -8, -1, -30, TarHeader.LF_LINK, -14, Ascii.EM, -19, 4, 13, -4, -62, Ascii.DLE, 4, Ascii.SI, 1, 6, 2, 2, -6, Ascii.FF, 9, -63, Ascii.SI, 1, 6, 2, 2, -6, Ascii.FF, 9, -62, Ascii.SI, 1, 6, 2, 2, -6, Ascii.FF, 9, -64};
    private static final int $$t = 141;
    private static final byte[] $$d = {102, -86, -98, TarHeader.LF_DIR, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 35;
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 0;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(byte r7, int r8, byte r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.checkout.ui.activity.SubscribePinActivity.$$l
            int r8 = 122 - r8
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r9 = r9 * 3
            int r9 = r9 + 1
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = r7 + r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.SubscribePinActivity.$$r(byte, int, byte):java.lang.String");
    }

    private static void h(byte b2, short s, byte b3, Object[] objArr) {
        int i = b3 + 4;
        byte[] bArr = $$d;
        int i2 = 103 - (b2 * 2);
        byte[] bArr2 = new byte[s + 4];
        int i3 = s + 3;
        int i4 = -1;
        if (bArr == null) {
            i++;
            i2 = (i2 + (-i3)) - 8;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b4 = bArr[i];
                i++;
                i2 = (i2 + (-b4)) - 8;
            }
        }
    }

    private static void i(byte b2, int i, short s, Object[] objArr) {
        int i2 = b2 * 33;
        int i3 = (s * 2) + 99;
        byte[] bArr = $$s;
        int i4 = (i * 3) + 4;
        byte[] bArr2 = new byte[43 - i2];
        int i5 = 42 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 = (i4 + i3) - 3;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i3;
            i3 = (i7 + bArr[i4]) - 3;
            i4++;
        }
    }

    private static void g(char c2, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            int i4 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(equals[i2 + i4])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((Process.myTid() >> 22) + 1758, 35 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) View.MeasureSpec.getMode(0), 1159210934, false, $$r(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(component4), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 5);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 3608, 29 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 7171), 1951385784, false, $$r(b4, b5, (byte) (b5 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24, (char) (27762 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), -1529629956, false, $$r(b6, b7, b7), new Class[]{Object.class, Object.class});
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
        while (cancelnotification.copydefault < i) {
            int i5 = $11 + 65;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                Object[] objArr5 = {cancelnotification, cancelnotification};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4012, 24 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (27761 - TextUtils.indexOf("", "")), -1529629956, false, $$r(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                int i6 = 76 / 0;
            } else {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                Object[] objArr6 = {cancelnotification, cancelnotification};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 24 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27762), -1529629956, false, $$r(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
        }
        String str = new String(cArr);
        int i7 = $11 + 101;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    private static void j(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i4 = $10 + 95;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 73;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[i3];
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) component3) ^ 4374495167426960553L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(ShareDataUIState);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 845;
                        int iIndexOf = TextUtils.indexOf("", "", i3) + 32;
                        char cResolveSizeAndState = (char) (View.resolveSizeAndState(i3, i3, i3) + 23251);
                        byte b2 = (byte) i3;
                        String str$$r = $$r(b2, (byte) (b2 | Ascii.VT), b2);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, iIndexOf, cResolveSizeAndState, 592652048, false, str$$r, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(copydefault)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(845 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 32, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 23252), 592652048, false, $$r(b3, (byte) (b3 | Ascii.VT), b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 465, 50 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ExpandableListView.getPackedPositionGroup(0L), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void f(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = component2;
        int i3 = 684241640;
        long j = 0;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $10 + 47;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i8 = 0;
            while (i8 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4392 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 37, (char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) - 1), -309236339, false, $$r(b2, (byte) (b2 | Ascii.DLE), b2), new Class[]{Integer.TYPE});
                    }
                    iArr4[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i8++;
                    i3 = 684241640;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = component2;
        if (iArr6 != null) {
            int i9 = $10 + 95;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i10 = 0;
            while (i10 < length) {
                Object[] objArr3 = new Object[i4];
                objArr3[i5] = Integer.valueOf(iArr6[i10]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) i5;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.green(i5) + 4391, 37 - TextUtils.getOffsetAfter("", i5), (char) Color.red(i5), -309236339, false, $$r(b3, (byte) (b3 | Ascii.DLE), b3), new Class[]{Integer.TYPE});
                }
                iArr2[i10] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i10++;
                i4 = 1;
                i5 = 0;
            }
            iArr6 = iArr2;
        }
        int i11 = i5;
        System.arraycopy(iArr6, i11, iArr5, i11, length3);
        getactivenotifications.component1 = i11;
        while (getactivenotifications.component1 < iArr.length) {
            int i12 = $11 + 73;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i14 = 0;
            while (i14 < 16) {
                getactivenotifications.ShareDataUIState ^= iArr5[i14];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2968 - Color.green(0), 16 - Color.blue(0), (char) (49870 - TextUtils.lastIndexOf("", '0', 0)), 462826032, false, $$r(b4, (byte) (b4 | Ascii.DC2), b4), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i14++;
                int i15 = $10 + 31;
                $11 = i15 % 128;
                int i16 = i15 % 2;
            }
            int i17 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i17;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i18 = getactivenotifications.ShareDataUIState;
            int i19 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                byte b5 = (byte) 0;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 2944, TextUtils.lastIndexOf("", '0') + 25, (char) (ExpandableListView.getPackedPositionChild(0L) + 27638), -1616366948, false, $$r(b5, $$l[0], b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00aa  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.SubscribePinActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void onForgetClick() {
        int i = 2 % 2;
        ((ILoginService) RouteUtils.getService(ILoginService.class)).resetPin(new ApiCallback<Boolean>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = component1 + 5;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                component1(bool);
                if (i4 == 0) {
                    throw null;
                }
                int i5 = component3 + 105;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void component1(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = component1 + 35;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                ActivityUtils.finishToActivity((Activity) SubscribePinActivity.this, false, true);
                int i5 = component3 + 11;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = getRequestBeneficiariesState + 19;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 73 / 0;
        }
    }

    private void initObserver() {
        int i = 2 % 2;
        ((CheckoutViewModel) this.viewModel).getSubscribeLiveData().observe(this, new Observer<Resource<SubscribeOdResp>>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public void onChanged(Resource<SubscribeOdResp> resource) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 59;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                component3(resource);
                int i5 = ShareDataUIState + 115;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void component3(Resource<SubscribeOdResp> resource) {
                int i2 = 2 % 2;
                int i3 = component2 + 115;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                if (resource.loading()) {
                    int i5 = component2 + 15;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    DialogManager.showLoading(SubscribePinActivity.this);
                    return;
                }
                if (resource.error()) {
                    int i7 = ShareDataUIState + 3;
                    component2 = i7 % 128;
                    if (i7 % 2 != 0) {
                        DialogManager.hideLoading(SubscribePinActivity.this);
                        SubscribePinActivity.m10118$$Nest$mhandError(SubscribePinActivity.this, resource.getException());
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    DialogManager.hideLoading(SubscribePinActivity.this);
                    SubscribePinActivity.m10118$$Nest$mhandError(SubscribePinActivity.this, resource.getException());
                }
                if (resource.success()) {
                    int i8 = ShareDataUIState + 115;
                    component2 = i8 % 128;
                    int i9 = i8 % 2;
                    SubscribePinActivity.this.downTimer.start();
                }
            }
        });
        int i2 = getAsAtTimestamp + 87;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private void handOk() {
        int i = 2 % 2;
        DialogManager.hideLoading(this);
        setResult(-1, new Intent());
        finish();
        int i2 = getAsAtTimestamp + 103;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        ((com.huawei.digitalpayment.consumer.baselib.databinding.ActivityBasePinBinding) r3.binding).etCode.showError(r4.getMessage());
        ((com.huawei.digitalpayment.consumer.baselib.databinding.ActivityBasePinBinding) r3.binding).etCode.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r4.getResponseCode().equals(com.huawei.digitalpayment.consumer.baselib.http.HttpStatus.SUBSCRIBE_ERROR) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r4.getResponseCode().equals(com.huawei.digitalpayment.consumer.baselib.http.HttpStatus.SUBSCRIBE_ERROR) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        setResult(1000013);
        finish();
        r4 = com.huawei.digitalpayment.checkout.ui.activity.SubscribePinActivity.getAsAtTimestamp + 59;
        com.huawei.digitalpayment.checkout.ui.activity.SubscribePinActivity.getRequestBeneficiariesState = r4 % 128;
        r4 = r4 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void handError(com.huawei.common.exception.BaseException r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkout.ui.activity.SubscribePinActivity.getRequestBeneficiariesState
            int r1 = r1 + 101
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkout.ui.activity.SubscribePinActivity.getAsAtTimestamp = r2
            int r1 = r1 % r0
            java.lang.String r2 = "60750023"
            if (r1 != 0) goto L1f
            java.lang.String r1 = r4.getResponseCode()
            boolean r1 = r1.equals(r2)
            r2 = 55
            int r2 = r2 / 0
            if (r1 == 0) goto L3c
            goto L29
        L1f:
            java.lang.String r1 = r4.getResponseCode()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3c
        L29:
            r4 = 1000013(0xf424d, float:1.401317E-39)
            r3.setResult(r4)
            r3.finish()
            int r4 = com.huawei.digitalpayment.checkout.ui.activity.SubscribePinActivity.getAsAtTimestamp
            int r4 = r4 + 59
            int r1 = r4 % 128
            com.huawei.digitalpayment.checkout.ui.activity.SubscribePinActivity.getRequestBeneficiariesState = r1
            int r4 = r4 % r0
            return
        L3c:
            Binding extends androidx.databinding.ViewDataBinding r0 = r3.binding
            com.huawei.digitalpayment.consumer.baselib.databinding.ActivityBasePinBinding r0 = (com.huawei.digitalpayment.consumer.baselib.databinding.ActivityBasePinBinding) r0
            com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText r0 = r0.etCode
            java.lang.String r4 = r4.getMessage()
            r0.showError(r4)
            Binding extends androidx.databinding.ViewDataBinding r4 = r3.binding
            com.huawei.digitalpayment.consumer.baselib.databinding.ActivityBasePinBinding r4 = (com.huawei.digitalpayment.consumer.baselib.databinding.ActivityBasePinBinding) r4
            com.huawei.digitalpayment.consumer.baselib.widget.code.CodeEditText r4 = r4.etCode
            r4.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.SubscribePinActivity.handError(com.huawei.common.exception.BaseException):void");
    }

    @Override
    public void onConfirmClick(String str) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 109;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        subscribe(str);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getAsAtTimestamp + 123;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
    }

    private void subscribe(String str) {
        SubscribeOdRequest subscribeOdRequest;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 69;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0 ? this.type == 4 : this.type == 3) {
            subscribeOdRequest = new SubscribeOdRequest("finance_od", "Subscribe", PhoneUtils.getRecentLoginPhone(), EncryptUtils.encryptWithPinKey(str));
            int i3 = getRequestBeneficiariesState + 15;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
        } else {
            subscribeOdRequest = new SubscribeOdRequest("micro_loan", "SubscribeBnpl", PhoneUtils.getRecentLoginPhone(), EncryptUtils.encryptWithPinKey(str));
        }
        ((CheckoutViewModel) this.viewModel).subscribe(subscribeOdRequest);
    }

    @Override
    public PinType getPinType() {
        String string;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 77;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0 ? this.type == 4 : this.type == 5) {
            string = getString(R.string.payment_paymethod_tips5_od);
            int i3 = getRequestBeneficiariesState + 3;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
        } else {
            string = getString(R.string.payment_paymethod_tips5);
        }
        return new PinType(getString(R.string.payment_paymethod_title2), string, getString(R.string.payment_paymethod_button3), getString(R.string.payment_paymethod_button4));
    }

    @Override
    public void onDestroy() {
        CountDownTimer countDownTimer;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 25;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            countDownTimer = this.downTimer;
            int i3 = 74 / 0;
            if (countDownTimer == null) {
                return;
            }
        } else {
            super.onDestroy();
            countDownTimer = this.downTimer;
            if (countDownTimer == null) {
                return;
            }
        }
        int i4 = getRequestBeneficiariesState + 77;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        countDownTimer.cancel();
        int i6 = getRequestBeneficiariesState + 123;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 57;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            g((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952720_res_0x7f130450).substring(6, 7).length() + 22997), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952718_res_0x7f13044e).substring(6, 7).length() + 25, ExpandableListView.getPackedPositionGroup(0L), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new int[]{-735285003, -661503010, 378499031, 1136992931, 1907624928, 367914649, 546255164, -1025560844, 1597455812, -2064755628}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = getRequestBeneficiariesState + 33;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i6 = getRequestBeneficiariesState + 101;
            getAsAtTimestamp = i6 % 128;
            try {
                if (i6 % 2 == 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6617 - ExpandableListView.getPackedPositionChild(0L), Color.red(0) + 42, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6561, 57 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -699576857, false, "component2", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    int i7 = 32 / 0;
                } else {
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(6617 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42, (char) ExpandableListView.getPackedPositionGroup(0L), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(6562 - ((Process.getThreadPriority(0) + 20) >> 6), 56 - TextUtils.getTrimmedLength(""), (char) TextUtils.getOffsetBefore("", 0), -699576857, false, "component2", new Class[]{Context.class});
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
        int i2 = getRequestBeneficiariesState + 119;
        getAsAtTimestamp = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getBaseContext();
            obj.hashCode();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            g((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952793_res_0x7f130499).substring(6, 7).codePointAt(0) + 22966), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952826_res_0x7f1304ba).substring(7, 8).length() + 25, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131955137_res_0x7f130dc1).substring(0, 3).codePointAt(0) - 37, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952754_res_0x7f130472).substring(2, 3).length() + 17, new int[]{-735285003, -661503010, 378499031, 1136992931, 1907624928, 367914649, 546255164, -1025560844, 1597455812, -2064755628}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i3 = getAsAtTimestamp + 35;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = getAsAtTimestamp + 75;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - KeyEvent.keyCodeFromString(""), 42 - ExpandableListView.getPackedPositionGroup(0L), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 6562, 56 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), -960739708, false, "component3", new Class[]{Context.class});
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
    /* JADX WARN: Removed duplicated region for block: B:1010:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0929 A[Catch: all -> 0x04ba, TryCatch #10 {all -> 0x04ba, blocks: (B:246:0x0ec1, B:248:0x0ec7, B:249:0x0ef4, B:445:0x1828, B:447:0x182e, B:449:0x185a, B:555:0x1d6f, B:557:0x1d75, B:558:0x1da1, B:759:0x2f33, B:761:0x2f39, B:762:0x2f65, B:796:0x326d, B:798:0x3273, B:799:0x3295, B:776:0x30b8, B:778:0x30db, B:779:0x312e, B:725:0x2bfa, B:727:0x2c00, B:728:0x2c2a, B:819:0x3372, B:821:0x3378, B:822:0x33a0, B:824:0x33da, B:825:0x341b, B:603:0x2384, B:605:0x2399, B:606:0x23cb, B:608:0x23ff, B:609:0x247e, B:837:0x34c2, B:839:0x34c8, B:840:0x34ef, B:842:0x3529, B:843:0x3569, B:571:0x1f67, B:573:0x1f7c, B:574:0x1fac, B:291:0x10dc, B:293:0x10e2, B:294:0x110f, B:130:0x0923, B:132:0x0929, B:133:0x0955, B:19:0x022c, B:21:0x0232, B:22:0x025e, B:24:0x0429, B:26:0x045b, B:27:0x04b4, B:625:0x2692, B:627:0x2698, B:628:0x26da, B:630:0x2701, B:631:0x2747, B:633:0x275a, B:635:0x2763, B:636:0x27a2, B:669:0x29f9, B:670:0x29fd, B:674:0x2a0f, B:680:0x2a3f, B:686:0x2a5b, B:688:0x2a5e, B:700:0x2b3f, B:702:0x2b45, B:703:0x2b46, B:705:0x2b48, B:707:0x2b4f, B:708:0x2b50, B:677:0x2a27, B:639:0x27b1, B:641:0x27b5, B:645:0x27c1, B:647:0x27c7, B:659:0x28de, B:661:0x28e4, B:662:0x2926, B:664:0x2950, B:665:0x2999, B:667:0x29af, B:668:0x29f3, B:710:0x2b52, B:712:0x2b59, B:713:0x2b5a, B:715:0x2b5c, B:717:0x2b63, B:718:0x2b64, B:254:0x0f77, B:256:0x0f7b, B:277:0x1066, B:279:0x106c, B:280:0x106d, B:282:0x106f, B:284:0x1076, B:285:0x1077, B:260:0x0f87), top: B:875:0x022c, inners: #27, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0a2e A[Catch: all -> 0x0e2c, PHI: r1 r10 r27
  0x0a2e: PHI (r1v588 java.lang.Object) = (r1v587 java.lang.Object), (r1v636 java.lang.Object) binds: [B:138:0x09dd, B:140:0x09e1] A[DONT_GENERATE, DONT_INLINE]
  0x0a2e: PHI (r10v70 ??) = (r10v125 ??), (r10v126 ??) binds: [B:138:0x09dd, B:140:0x09e1] A[DONT_GENERATE, DONT_INLINE]
  0x0a2e: PHI (r27v68 ??) = (r27v137 ??), (r27v138 ??) binds: [B:138:0x09dd, B:140:0x09e1] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x0e2c, blocks: (B:137:0x09d9, B:144:0x0a2e, B:153:0x0a95, B:171:0x0b9f, B:175:0x0beb), top: B:869:0x09d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0a3b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0a95 A[Catch: all -> 0x0e2c, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x0e2c, blocks: (B:137:0x09d9, B:144:0x0a2e, B:153:0x0a95, B:171:0x0b9f, B:175:0x0beb), top: B:869:0x09d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0cd2 A[Catch: all -> 0x0e09, TryCatch #55 {all -> 0x0e09, blocks: (B:187:0x0cc8, B:188:0x0ccc, B:190:0x0cd2, B:193:0x0cee, B:177:0x0bf9, B:182:0x0c61, B:186:0x0cc0), top: B:960:0x0bf9 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0ec7 A[Catch: all -> 0x04ba, TryCatch #10 {all -> 0x04ba, blocks: (B:246:0x0ec1, B:248:0x0ec7, B:249:0x0ef4, B:445:0x1828, B:447:0x182e, B:449:0x185a, B:555:0x1d6f, B:557:0x1d75, B:558:0x1da1, B:759:0x2f33, B:761:0x2f39, B:762:0x2f65, B:796:0x326d, B:798:0x3273, B:799:0x3295, B:776:0x30b8, B:778:0x30db, B:779:0x312e, B:725:0x2bfa, B:727:0x2c00, B:728:0x2c2a, B:819:0x3372, B:821:0x3378, B:822:0x33a0, B:824:0x33da, B:825:0x341b, B:603:0x2384, B:605:0x2399, B:606:0x23cb, B:608:0x23ff, B:609:0x247e, B:837:0x34c2, B:839:0x34c8, B:840:0x34ef, B:842:0x3529, B:843:0x3569, B:571:0x1f67, B:573:0x1f7c, B:574:0x1fac, B:291:0x10dc, B:293:0x10e2, B:294:0x110f, B:130:0x0923, B:132:0x0929, B:133:0x0955, B:19:0x022c, B:21:0x0232, B:22:0x025e, B:24:0x0429, B:26:0x045b, B:27:0x04b4, B:625:0x2692, B:627:0x2698, B:628:0x26da, B:630:0x2701, B:631:0x2747, B:633:0x275a, B:635:0x2763, B:636:0x27a2, B:669:0x29f9, B:670:0x29fd, B:674:0x2a0f, B:680:0x2a3f, B:686:0x2a5b, B:688:0x2a5e, B:700:0x2b3f, B:702:0x2b45, B:703:0x2b46, B:705:0x2b48, B:707:0x2b4f, B:708:0x2b50, B:677:0x2a27, B:639:0x27b1, B:641:0x27b5, B:645:0x27c1, B:647:0x27c7, B:659:0x28de, B:661:0x28e4, B:662:0x2926, B:664:0x2950, B:665:0x2999, B:667:0x29af, B:668:0x29f3, B:710:0x2b52, B:712:0x2b59, B:713:0x2b5a, B:715:0x2b5c, B:717:0x2b63, B:718:0x2b64, B:254:0x0f77, B:256:0x0f7b, B:277:0x1066, B:279:0x106c, B:280:0x106d, B:282:0x106f, B:284:0x1076, B:285:0x1077, B:260:0x0f87), top: B:875:0x022c, inners: #27, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0f90  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0fa7 A[Catch: all -> 0x106e, TryCatch #32 {all -> 0x106e, blocks: (B:266:0x0f92, B:268:0x0fa7, B:269:0x0fd7), top: B:916:0x0f92, outer: #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0fea A[Catch: all -> 0x1064, TryCatch #26 {all -> 0x1064, blocks: (B:270:0x0fdd, B:272:0x0fea, B:273:0x105b), top: B:905:0x0fdd, outer: #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x11e3 A[Catch: all -> 0x17a7, PHI: r2
  0x11e3: PHI (r2v557 java.lang.Object) = (r2v543 java.lang.Object), (r2v555 java.lang.Object) binds: [B:299:0x1198, B:300:0x119a] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x17a7, blocks: (B:298:0x1194, B:305:0x11e3), top: B:862:0x1194 }] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x125b  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x1273  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x12d5  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x163c A[Catch: all -> 0x1777, TryCatch #40 {all -> 0x1777, blocks: (B:379:0x1632, B:380:0x1636, B:382:0x163c, B:385:0x1657, B:348:0x1332, B:365:0x1506, B:368:0x1557, B:374:0x15cd, B:378:0x162a), top: B:931:0x1332 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x182e A[Catch: all -> 0x04ba, TryCatch #10 {all -> 0x04ba, blocks: (B:246:0x0ec1, B:248:0x0ec7, B:249:0x0ef4, B:445:0x1828, B:447:0x182e, B:449:0x185a, B:555:0x1d6f, B:557:0x1d75, B:558:0x1da1, B:759:0x2f33, B:761:0x2f39, B:762:0x2f65, B:796:0x326d, B:798:0x3273, B:799:0x3295, B:776:0x30b8, B:778:0x30db, B:779:0x312e, B:725:0x2bfa, B:727:0x2c00, B:728:0x2c2a, B:819:0x3372, B:821:0x3378, B:822:0x33a0, B:824:0x33da, B:825:0x341b, B:603:0x2384, B:605:0x2399, B:606:0x23cb, B:608:0x23ff, B:609:0x247e, B:837:0x34c2, B:839:0x34c8, B:840:0x34ef, B:842:0x3529, B:843:0x3569, B:571:0x1f67, B:573:0x1f7c, B:574:0x1fac, B:291:0x10dc, B:293:0x10e2, B:294:0x110f, B:130:0x0923, B:132:0x0929, B:133:0x0955, B:19:0x022c, B:21:0x0232, B:22:0x025e, B:24:0x0429, B:26:0x045b, B:27:0x04b4, B:625:0x2692, B:627:0x2698, B:628:0x26da, B:630:0x2701, B:631:0x2747, B:633:0x275a, B:635:0x2763, B:636:0x27a2, B:669:0x29f9, B:670:0x29fd, B:674:0x2a0f, B:680:0x2a3f, B:686:0x2a5b, B:688:0x2a5e, B:700:0x2b3f, B:702:0x2b45, B:703:0x2b46, B:705:0x2b48, B:707:0x2b4f, B:708:0x2b50, B:677:0x2a27, B:639:0x27b1, B:641:0x27b5, B:645:0x27c1, B:647:0x27c7, B:659:0x28de, B:661:0x28e4, B:662:0x2926, B:664:0x2950, B:665:0x2999, B:667:0x29af, B:668:0x29f3, B:710:0x2b52, B:712:0x2b59, B:713:0x2b5a, B:715:0x2b5c, B:717:0x2b63, B:718:0x2b64, B:254:0x0f77, B:256:0x0f7b, B:277:0x1066, B:279:0x106c, B:280:0x106d, B:282:0x106f, B:284:0x1076, B:285:0x1077, B:260:0x0f87), top: B:875:0x022c, inners: #27, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x1858  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x18e4  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x193d  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x1992 A[Catch: all -> 0x1d08, TRY_ENTER, TRY_LEAVE, TryCatch #54 {all -> 0x1d08, blocks: (B:453:0x18de, B:460:0x1930, B:500:0x1bbf, B:501:0x1bc3, B:503:0x1bc9, B:506:0x1be3, B:469:0x1992, B:487:0x1aa5, B:491:0x1ae9, B:496:0x1b5e, B:499:0x1bb7), top: B:958:0x18de }] */
    /* JADX WARN: Removed duplicated region for block: B:503:0x1bc9 A[Catch: all -> 0x1d08, TryCatch #54 {all -> 0x1d08, blocks: (B:453:0x18de, B:460:0x1930, B:500:0x1bbf, B:501:0x1bc3, B:503:0x1bc9, B:506:0x1be3, B:469:0x1992, B:487:0x1aa5, B:491:0x1ae9, B:496:0x1b5e, B:499:0x1bb7), top: B:958:0x18de }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x05e0 A[Catch: all -> 0x0899, TRY_ENTER, TRY_LEAVE, TryCatch #65 {all -> 0x0899, blocks: (B:32:0x04c7, B:38:0x051a, B:54:0x05e0), top: B:977:0x04c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:557:0x1d75 A[Catch: all -> 0x04ba, TryCatch #10 {all -> 0x04ba, blocks: (B:246:0x0ec1, B:248:0x0ec7, B:249:0x0ef4, B:445:0x1828, B:447:0x182e, B:449:0x185a, B:555:0x1d6f, B:557:0x1d75, B:558:0x1da1, B:759:0x2f33, B:761:0x2f39, B:762:0x2f65, B:796:0x326d, B:798:0x3273, B:799:0x3295, B:776:0x30b8, B:778:0x30db, B:779:0x312e, B:725:0x2bfa, B:727:0x2c00, B:728:0x2c2a, B:819:0x3372, B:821:0x3378, B:822:0x33a0, B:824:0x33da, B:825:0x341b, B:603:0x2384, B:605:0x2399, B:606:0x23cb, B:608:0x23ff, B:609:0x247e, B:837:0x34c2, B:839:0x34c8, B:840:0x34ef, B:842:0x3529, B:843:0x3569, B:571:0x1f67, B:573:0x1f7c, B:574:0x1fac, B:291:0x10dc, B:293:0x10e2, B:294:0x110f, B:130:0x0923, B:132:0x0929, B:133:0x0955, B:19:0x022c, B:21:0x0232, B:22:0x025e, B:24:0x0429, B:26:0x045b, B:27:0x04b4, B:625:0x2692, B:627:0x2698, B:628:0x26da, B:630:0x2701, B:631:0x2747, B:633:0x275a, B:635:0x2763, B:636:0x27a2, B:669:0x29f9, B:670:0x29fd, B:674:0x2a0f, B:680:0x2a3f, B:686:0x2a5b, B:688:0x2a5e, B:700:0x2b3f, B:702:0x2b45, B:703:0x2b46, B:705:0x2b48, B:707:0x2b4f, B:708:0x2b50, B:677:0x2a27, B:639:0x27b1, B:641:0x27b5, B:645:0x27c1, B:647:0x27c7, B:659:0x28de, B:661:0x28e4, B:662:0x2926, B:664:0x2950, B:665:0x2999, B:667:0x29af, B:668:0x29f3, B:710:0x2b52, B:712:0x2b59, B:713:0x2b5a, B:715:0x2b5c, B:717:0x2b63, B:718:0x2b64, B:254:0x0f77, B:256:0x0f7b, B:277:0x1066, B:279:0x106c, B:280:0x106d, B:282:0x106f, B:284:0x1076, B:285:0x1077, B:260:0x0f87), top: B:875:0x022c, inners: #27, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:563:0x1e27  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x1e76  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x1f47  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x20e6  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x2a4b  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x2a90 A[Catch: all -> 0x2b47, TryCatch #14 {all -> 0x2b47, blocks: (B:691:0x2a8a, B:693:0x2a90, B:694:0x2aba), top: B:882:0x2a8a, outer: #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:733:0x2cb0  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x2cfe  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x2d5a  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x2f12  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x2ff2  */
    /* JADX WARN: Removed duplicated region for block: B:770:0x3047  */
    /* JADX WARN: Removed duplicated region for block: B:775:0x309a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:795:0x324f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:830:0x348b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x073a A[Catch: all -> 0x071c, TRY_ENTER, TRY_LEAVE, TryCatch #66 {all -> 0x071c, blocks: (B:78:0x06dd, B:85:0x073a), top: B:979:0x06dd }] */
    /* JADX WARN: Removed duplicated region for block: B:888:0x120a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:897:0x119a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:964:0x0f77 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v114 */
    /* JADX WARN: Type inference failed for: r10v117 */
    /* JADX WARN: Type inference failed for: r10v118 */
    /* JADX WARN: Type inference failed for: r10v119 */
    /* JADX WARN: Type inference failed for: r10v120 */
    /* JADX WARN: Type inference failed for: r10v121 */
    /* JADX WARN: Type inference failed for: r10v122 */
    /* JADX WARN: Type inference failed for: r10v123 */
    /* JADX WARN: Type inference failed for: r10v124 */
    /* JADX WARN: Type inference failed for: r10v125 */
    /* JADX WARN: Type inference failed for: r10v126 */
    /* JADX WARN: Type inference failed for: r10v127 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v47, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v69 */
    /* JADX WARN: Type inference failed for: r10v70 */
    /* JADX WARN: Type inference failed for: r10v71 */
    /* JADX WARN: Type inference failed for: r10v72 */
    /* JADX WARN: Type inference failed for: r10v73 */
    /* JADX WARN: Type inference failed for: r10v75 */
    /* JADX WARN: Type inference failed for: r10v76 */
    /* JADX WARN: Type inference failed for: r10v82, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v87 */
    /* JADX WARN: Type inference failed for: r10v88 */
    /* JADX WARN: Type inference failed for: r10v89 */
    /* JADX WARN: Type inference failed for: r10v90 */
    /* JADX WARN: Type inference failed for: r10v93 */
    /* JADX WARN: Type inference failed for: r12v167, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v168 */
    /* JADX WARN: Type inference failed for: r12v181 */
    /* JADX WARN: Type inference failed for: r12v182 */
    /* JADX WARN: Type inference failed for: r12v183 */
    /* JADX WARN: Type inference failed for: r12v184 */
    /* JADX WARN: Type inference failed for: r12v185 */
    /* JADX WARN: Type inference failed for: r12v186 */
    /* JADX WARN: Type inference failed for: r12v205 */
    /* JADX WARN: Type inference failed for: r12v206 */
    /* JADX WARN: Type inference failed for: r12v207 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r13v117 */
    /* JADX WARN: Type inference failed for: r13v119 */
    /* JADX WARN: Type inference failed for: r13v120 */
    /* JADX WARN: Type inference failed for: r13v121 */
    /* JADX WARN: Type inference failed for: r13v127 */
    /* JADX WARN: Type inference failed for: r13v130 */
    /* JADX WARN: Type inference failed for: r13v134 */
    /* JADX WARN: Type inference failed for: r13v135 */
    /* JADX WARN: Type inference failed for: r13v136 */
    /* JADX WARN: Type inference failed for: r13v142 */
    /* JADX WARN: Type inference failed for: r13v145 */
    /* JADX WARN: Type inference failed for: r13v147 */
    /* JADX WARN: Type inference failed for: r13v148 */
    /* JADX WARN: Type inference failed for: r13v149 */
    /* JADX WARN: Type inference failed for: r13v150 */
    /* JADX WARN: Type inference failed for: r13v151 */
    /* JADX WARN: Type inference failed for: r13v152 */
    /* JADX WARN: Type inference failed for: r13v153 */
    /* JADX WARN: Type inference failed for: r13v154 */
    /* JADX WARN: Type inference failed for: r13v155 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r14v100 */
    /* JADX WARN: Type inference failed for: r14v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v82 */
    /* JADX WARN: Type inference failed for: r14v83 */
    /* JADX WARN: Type inference failed for: r14v84 */
    /* JADX WARN: Type inference failed for: r14v85 */
    /* JADX WARN: Type inference failed for: r14v86 */
    /* JADX WARN: Type inference failed for: r14v93 */
    /* JADX WARN: Type inference failed for: r14v94 */
    /* JADX WARN: Type inference failed for: r14v95 */
    /* JADX WARN: Type inference failed for: r14v96 */
    /* JADX WARN: Type inference failed for: r14v97 */
    /* JADX WARN: Type inference failed for: r14v98 */
    /* JADX WARN: Type inference failed for: r14v99 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r27v125 */
    /* JADX WARN: Type inference failed for: r27v126 */
    /* JADX WARN: Type inference failed for: r27v127 */
    /* JADX WARN: Type inference failed for: r27v128 */
    /* JADX WARN: Type inference failed for: r27v129 */
    /* JADX WARN: Type inference failed for: r27v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v130 */
    /* JADX WARN: Type inference failed for: r27v131 */
    /* JADX WARN: Type inference failed for: r27v132 */
    /* JADX WARN: Type inference failed for: r27v133 */
    /* JADX WARN: Type inference failed for: r27v134 */
    /* JADX WARN: Type inference failed for: r27v135 */
    /* JADX WARN: Type inference failed for: r27v136 */
    /* JADX WARN: Type inference failed for: r27v137 */
    /* JADX WARN: Type inference failed for: r27v138 */
    /* JADX WARN: Type inference failed for: r27v27 */
    /* JADX WARN: Type inference failed for: r27v28 */
    /* JADX WARN: Type inference failed for: r27v29 */
    /* JADX WARN: Type inference failed for: r27v30 */
    /* JADX WARN: Type inference failed for: r27v31 */
    /* JADX WARN: Type inference failed for: r27v33 */
    /* JADX WARN: Type inference failed for: r27v34 */
    /* JADX WARN: Type inference failed for: r27v39 */
    /* JADX WARN: Type inference failed for: r27v42 */
    /* JADX WARN: Type inference failed for: r27v43 */
    /* JADX WARN: Type inference failed for: r27v44 */
    /* JADX WARN: Type inference failed for: r27v46 */
    /* JADX WARN: Type inference failed for: r27v48 */
    /* JADX WARN: Type inference failed for: r27v49 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v51 */
    /* JADX WARN: Type inference failed for: r27v52 */
    /* JADX WARN: Type inference failed for: r27v53 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v63 */
    /* JADX WARN: Type inference failed for: r27v64 */
    /* JADX WARN: Type inference failed for: r27v65 */
    /* JADX WARN: Type inference failed for: r27v66 */
    /* JADX WARN: Type inference failed for: r27v67 */
    /* JADX WARN: Type inference failed for: r27v68 */
    /* JADX WARN: Type inference failed for: r27v69 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v70 */
    /* JADX WARN: Type inference failed for: r27v71 */
    /* JADX WARN: Type inference failed for: r27v73 */
    /* JADX WARN: Type inference failed for: r27v74 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v80 */
    /* JADX WARN: Type inference failed for: r27v81 */
    /* JADX WARN: Type inference failed for: r27v82 */
    /* JADX WARN: Type inference failed for: r27v85 */
    /* JADX WARN: Type inference failed for: r27v86 */
    /* JADX WARN: Type inference failed for: r27v87 */
    /* JADX WARN: Type inference failed for: r27v89 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r4v127 */
    /* JADX WARN: Type inference failed for: r4v128 */
    /* JADX WARN: Type inference failed for: r4v131 */
    /* JADX WARN: Type inference failed for: r4v132, types: [long] */
    /* JADX WARN: Type inference failed for: r4v133 */
    /* JADX WARN: Type inference failed for: r4v134 */
    /* JADX WARN: Type inference failed for: r4v135 */
    /* JADX WARN: Type inference failed for: r4v136 */
    /* JADX WARN: Type inference failed for: r4v139, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v140 */
    /* JADX WARN: Type inference failed for: r4v141 */
    /* JADX WARN: Type inference failed for: r4v142 */
    /* JADX WARN: Type inference failed for: r4v143 */
    /* JADX WARN: Type inference failed for: r4v144 */
    /* JADX WARN: Type inference failed for: r4v179 */
    /* JADX WARN: Type inference failed for: r4v180 */
    /* JADX WARN: Type inference failed for: r4v181 */
    /* JADX WARN: Type inference failed for: r4v193 */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v222 */
    /* JADX WARN: Type inference failed for: r4v223 */
    /* JADX WARN: Type inference failed for: r4v224 */
    /* JADX WARN: Type inference failed for: r4v225 */
    /* JADX WARN: Type inference failed for: r4v226 */
    /* JADX WARN: Type inference failed for: r4v227 */
    /* JADX WARN: Type inference failed for: r4v228 */
    /* JADX WARN: Type inference failed for: r4v229 */
    /* JADX WARN: Type inference failed for: r4v230 */
    /* JADX WARN: Type inference failed for: r4v231 */
    /* JADX WARN: Type inference failed for: r4v232 */
    /* JADX WARN: Type inference failed for: r4v233 */
    /* JADX WARN: Type inference failed for: r4v234 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v514 */
    /* JADX WARN: Type inference failed for: r5v515 */
    /* JADX WARN: Type inference failed for: r5v516 */
    /* JADX WARN: Type inference failed for: r5v533 */
    /* JADX WARN: Type inference failed for: r5v534 */
    /* JADX WARN: Type inference failed for: r8v103 */
    /* JADX WARN: Type inference failed for: r8v119 */
    /* JADX WARN: Type inference failed for: r8v120 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.CharSequence, java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.SubscribePinActivity.attachBaseContext(android.content.Context):void");
    }

    static void m10118$$Nest$mhandError(SubscribePinActivity subscribePinActivity, BaseException baseException) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 1;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        subscribePinActivity.handError(baseException);
        int i4 = getRequestBeneficiariesState + 121;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
    }

    static void m10119$$Nest$mhandOk(SubscribePinActivity subscribePinActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 107;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        subscribePinActivity.handOk();
        int i4 = getAsAtTimestamp + 31;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 39;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getAsAtTimestamp + 75;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
    }

    static {
        getShareableDataState = 1;
        component3();
        component1 = (char) 38529;
        copydefault = (char) 39928;
        component3 = (char) 26398;
        ShareDataUIState = (char) 64583;
        int i = copy + 37;
        getShareableDataState = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3() {
        component2 = new int[]{1504486477, 247112332, 1627748645, -760192616, -907068817, -31720984, -2003558467, -719847679, -1821749437, -962523682, 966439643, 593991503, -707139505, 502388683, -993680728, -531913071, -234576157, 1751372313};
        equals = new char[]{21953, 41164, 49088, 35540, 33223, 40131, 60360, 59008, 64977, 51394, 51140, 53912, 10745, 9433, 13256, 3799, 1526, 4331, 28656, 31487, 29148, 19682, 23550, 22251, 44529, 47350, 31546, 36462, 37183, 42047, 44848, 45622, 50535, 51301, 54058, 59004, 59693, 64554, 1833, 2596, 7543, 8309, 11035, 15898, 16660, 21580, 24336, 25156, 29972, 30741, 33536, 38489, 39256, 44045, 46854, 47626, 52482, 53332, 56184, 61042, 61743, 1068, 3877, 4646, 9589, 10277, 13115, 18018, 18789, 23663, 26422, 27239, 32097, 32871, 35596, 40536, 41229, 46092, 48983, 49754, 54530, 55390, 58190, 63049, 63813, 3142, 5955, 6731, 11586, 12367, 19115, 49151, 41127, 38393, 40610, 33703, 62629, 63904, 58045, 55274, 55532, 52715, 14004, 15281, 11442, 4583, 6878, 4058, 28810, 25992, 28289, 21382, 17551, 18819, 45727, 42957, 43161, 40350, 34503, 35730, 64660, 57795, 60139, 57327, 49340, 13805, 16098, 9141, 5359, 6576, 764, 30719, 30966, 28154, 22259, 23544, 19701, 45478, 47818, 45006, 37020, 34244, 36546, 62401, 58567, 59799, 53898, 51084, 51415, 15839, 9941, 11221, 7378, 390, 47642, 20301, 20507, 25934, 28226, 29511, 1040, 2374, 4675, 10076, 10330, 15696, 50774, 52041, 56406, 57685, 60011, 65386, 32887, 38201, 40546, 41828, 46128, 47485, 17016, 22313, 22654, 27949, 30334, 31600, 3195, 4470, 6751, 12040, 12301, 50440, 63916, 3237, 5044, 9889, 11744, 12448, 18347, 19110, 20913, 25850, 27521, 32425, 34221, 34984, 40895, 41653, 3103, 63760, 58903, 54046, 55306, 50453, 45582, 48897, 42030, 37125, 40465, 35592, 28717, 32003, 27150, 22285, 3095, 63770, 58902, 54018, 55313, 50453, 45598, 48982, 41993, 37143, 40524, 35635, 28695, 32031, 27166, 22285, 23611, 18711, 13886, 9023, 10301, 5431, 43288, 23580, 17180, 30232, 32024, 24603, 5907, 6686, 264, 13315, 15113, 3138, 63814, 58955, 54084, 55367, 50506, 45645, 48970, 42079, 37202, 40530, 3088, 63821, 58902, 54080, 55325, 50462, 45595, 48975, 41989, 37200, 40455, 35586, 28763, 32095, 27227, 22284, 23648, 18785, 13876, 9062, 10303, 5439, 574, 3948, 62580, 57714, 61045, 56100, 49196, 52607, 47660, 42874, 44047, 39248, 34315, 29444, 30726, 25866, 21007, 24320, 17475, 12567, 15891, 11078, 4173, 7453, 2635, 63260, 64624, 59693, 54900, 50034, 51245, 46457, 41598, 44833, 37989, 33120, 36411, 31543, 24638, 27965, 23145, 18283, 17153, 46597, 43272, 39943, 38660, 35337, 64782, 61449, 60188, 56849};
        component4 = -1051557962954376844L;
    }
}
