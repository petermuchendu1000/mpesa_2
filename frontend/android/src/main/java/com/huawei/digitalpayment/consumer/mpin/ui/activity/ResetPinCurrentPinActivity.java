package com.huawei.digitalpayment.consumer.mpin.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
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
import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.blankj.utilcode.constant.CacheConstants;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.baselib.PaymentTranslucentActivity;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.safaricom.mpesa.lifestyle.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import org.apache.commons.lang3.CharUtils;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/mpin/ui/activity/ResetPinCurrentPinActivity;", "Lcom/huawei/digitalpayment/consumer/baselib/PaymentTranslucentActivity;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResetPinCurrentPinActivity extends PaymentTranslucentActivity<ViewModel> {
    public static final int $stable = 0;
    private static char ShareDataUIState;
    private static char component1;
    private static char component2;
    private static char component3;
    private static int component4;
    private static int copy;
    private static int copydefault;
    private static char equals;
    private static long getRequestBeneficiariesState;
    private static final byte[] $$c = {1, -128, 109, -128};
    private static final int $$f = 86;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {80, 83, -21, -55, -39, -25, -30, -26, -26, -18, -36, -33, 40, -39, -25, -30, -26, -26, -18, -36, -33, 38};
    private static final int $$e = WSContextConstant.HANDSHAKE_SEND_SIZE;
    private static final byte[] $$a = {0, -128, 34, -14, 68, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$b = 27;
    private static int toString = 0;
    private static int hashCode = 1;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(int r7, short r8, byte r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinCurrentPinActivity.$$c
            int r8 = 111 - r8
            int r7 = r7 * 4
            int r7 = r7 + 1
            int r9 = r9 * 2
            int r9 = 4 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r4 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L28:
            int r9 = -r9
            int r8 = r8 + r9
            int r9 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinCurrentPinActivity.$$i(int, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = 100 - r8
            int r9 = 28 - r9
            int r7 = r7 * 2
            int r7 = r7 + 83
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinCurrentPinActivity.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2a:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-8)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinCurrentPinActivity.d(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 99
            int r7 = r7 * 4
            int r0 = 10 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinCurrentPinActivity.$$d
            int r8 = r8 * 9
            int r8 = 13 - r8
            byte[] r0 = new byte[r0]
            int r7 = 9 - r7
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2e:
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-27)
            int r6 = r6 + 1
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinCurrentPinActivity.f(byte, int, short, java.lang.Object[]):void");
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i5 = $11 + 15;
            $10 = i5 % 128;
            int i6 = 58224;
            if (i5 % i2 != 0) {
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3 >> 1];
            } else {
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            }
            int i7 = i4;
            while (i7 < 16) {
                int i8 = $10 + 1;
                $11 = i8 % 128;
                int i9 = i8 % i2;
                char c2 = cArr3[1];
                char c3 = cArr3[i4];
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) component3) ^ 4374495167426960553L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(component1);
                    objArr2[i2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i4] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int gidForName = 843 - Process.getGidForName("");
                        int iIndexOf = 32 - TextUtils.indexOf("", "", i4);
                        char cMyPid = (char) (23251 - (Process.myPid() >> 22));
                        byte b2 = (byte) ($$c[i4] - 1);
                        byte b3 = b2;
                        String str$$i = $$i(b2, b3, b3);
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(gidForName, iIndexOf, cMyPid, 592652048, false, str$$i, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        int i12 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 843;
                        int iMyPid = 32 - (Process.myPid() >> 22);
                        char cIndexOf = (char) (23251 - TextUtils.indexOf("", "", 0));
                        byte b4 = (byte) ($$c[0] - 1);
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i12, iMyPid, cIndexOf, 592652048, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i13 = $11 + 51;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    cArr3 = cArr4;
                    i2 = 2;
                    i4 = 0;
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - Drawable.resolveOpacity(0, 0), 50 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i15 = $11 + 13;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            i2 = 2;
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void c(char[] cArr, int i, char[] cArr2, char c2, char[] cArr3, Object[] objArr) throws Throwable {
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
            int i4 = $10 + 3;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int threadPriority = 4037 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int i6 = 31 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 19181);
                    byte b2 = $$c[0];
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(threadPriority, i6, edgeSlop, 1912513118, false, $$i(b3, (byte) (b3 | Ascii.FF), (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.combineMeasuredStates(0, 0) + 7567, 11 - TextUtils.getOffsetAfter("", 0), (char) TextUtils.getCapsMode("", 0, 0), 2006389106, false, "e", new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 2459;
                            int iBlue = Color.blue(0) + 28;
                            char cIndexOf = (char) TextUtils.indexOf("", "");
                            byte b4 = $$c[0];
                            byte b5 = (byte) (b4 - 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(threadPriority2, iBlue, cIndexOf, 931716605, false, $$i(b5, (byte) (b5 | 13), (byte) (b4 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7566, 10 - TextUtils.indexOf((CharSequence) "", '0'), (char) Color.alpha(0), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iNotificationSideChannel.copydefault])) ^ (getRequestBeneficiariesState ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component4) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) equals) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            i2 = 2;
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i7 = $10 + 117;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void e(char[] cArr, int i, int i2, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            int i5 = $11 + 59;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(copydefault)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3784;
                    int iNormalizeMetaState = 38 - KeyEvent.normalizeMetaState(0);
                    char c2 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26860);
                    byte b2 = $$c[0];
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay, iNormalizeMetaState, c2, 2015799920, false, $$i(b3, (byte) (b3 | 46), (byte) (b2 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 7406, 16 - Gravity.getAbsoluteGravity(0, 0), (char) TextUtils.indexOf("", "", 0, 0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            int i8 = $11 + 17;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            iTrustedWebActivityServiceStub.component1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i2 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            int i10 = $10 + 45;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7407 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (Process.myTid() >> 22) + 16, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        String str;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        b((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18, new char[]{33216, 53085, 16538, 62811, 62908, 33015, 58334, 52908, 45976, 37158, 15544, 39889, 40128, 60366, 50638, 38155, 41910, 63405}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        c(new char[]{55820, 47996, 2565, 65488, 19113}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 775177468, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952785_res_0x7f130491).substring(2, 3).codePointAt(0) + 25134), new char[]{6569, 13381, 20014, 37986}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = toString + 105;
                hashCode = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 3, new char[]{33216, 53085, 16538, 62811, 62908, 33015, 58334, 52908, 26832, 32041, 10885, 40214, ')', 21448, 14312, 40890, 30861, 18556, 18779, 28384, 6072, 19513, 11512, 64529, 35476, 23141}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                c(new char[]{31759, 36563, 55865, 8036, 44705, 59567, 43653, 48387, 5899, 29856, 18129, 49365, 60168, 59187, 27413, 62567, 59197, 60698}, ViewConfiguration.getFadingEdgeLength() >> 16, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) + 14091), new char[]{46803, 1311, 28386, 12599}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            Context applicationContext = baseContext;
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            if (applicationContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 6618, 43 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(17) - 67, new char[]{7884, 4960, 7138, 13435, 30354, 3033, 50638, 38155, 45689, 40883, 18286, 46912, 50661, 57573, 315, 45879, 24867, 30278, 58383, 57798, 32809, 11237, 44093, 30116, 48459, 3491, 41512, 57656, 56662, 49355, 64666, 19658, 7446, 31331, 1113, 3954, 36064, 62670, 45192, '6', 41047, 36882, 54464, 42672, 61445, 14911, 62637, 3070}, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952303_res_0x7f1302af).substring(0, 2).length() + 62, new char[]{42357, 49486, 19455, 61829, 17187, 57172, 56195, 58244, 13091, 3886, 9305, 61910, 46550, 52909, 56195, 58244, 41160, 53427, 53731, 18195, 12029, 17686, 47982, 42787, 55055, 53593, 40282, 49703, 18782, 60827, 64859, 14871, 11949, 32800, 60153, 59877, 65354, 39866, 64472, 55648, 24652, 21594, 60521, 39002, 13997, 18566, 11387, 60596, 48623, 51498, 15568, 7081, 62053, 30704, 42203, 28142, 12941, 30585, 13705, 48846, 26969, 43950, 18286, 46912}, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954659_res_0x7f130be3).substring(6, 9).length() + 61, new char[]{12029, 17686, 9360, 36798, 18271, 38789, 25511, 24194, 30266, 12016, 3932, 33462, 44763, 58547, 56088, 44690, 11971, 17082, 58383, 57798, 63487, 16199, 3702, 34998, 26934, 1992, 12941, 30585, 40282, 49703, 22454, 24106, 23928, 29026, 35847, 38107, 56381, 49889, 61962, 2032, 23320, 21062, 51083, 48743, 35044, 39187, 22070, 56083, 32730, 55262, 53277, 31888, 15731, 1446, 4026, 42193, 15423, 10950, 51415, 3015, 41047, 36882, 15484, 52441}, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b(((Process.getThreadPriority(0) + 20) >> 6) + 72, new char[]{20923, 63196, 28202, 53203, 42726, 49848, 40121, 56607, 41230, 62397, 46041, 38387, 22454, 24106, 28836, 33888, 18271, 38789, 59393, 15825, 61445, 14911, 60153, 59877, 7869, 38598, 45284, 30471, 7446, 31331, 9513, 52543, 47349, 34372, 5639, 23564, 27161, 39778, 25065, 1620, 24326, 30004, 25597, 34893, 25065, 1620, 41526, 62067, 9908, 50166, 35373, 583, 26832, 32041, 36274, 242, 53438, 20600, 53629, 30156, 46922, 27407, 22451, 15083, 50461, 36781, 32555, 22189, 30668, 8096, 54813, 37871}, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    c(new char[]{2359, 64113, 8361, 4377, 59673, 20530}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(12) - 109, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 30115), new char[]{42271, 9432, 49250, 8053}, objArr10);
                    String str6 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    c(new char[]{50291, 5730, 24128, 53010, 17523, 56979, 11151, 22597, 48543, 4082, 20072, 14214, 40105, 6272, 60915, 45799, 40438, 12069, 15864, 3241, 59731, 24739, 47847, 9306, 29612, 34872, 36434, 'b', 39543, 33913, 2244, 25275, 50486, 35720, 11923, 48801}, (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{0, 0, 0, 0}, (char) (ViewConfiguration.getPressedStateDuration() >> 16), new char[]{61803, 50852, 9500, 55765}, objArr11);
                    Object[] objArr12 = {applicationContext, str2, str3, str4, str5, true, str6, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 6562, (Process.myPid() >> 22) + 56, (char) View.getDefaultSize(0, 0), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            byte[] bArr = $$a;
            Object[] objArr13 = new Object[1];
            d(bArr[23], (byte) 96, bArr[39], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 2357, 26 - View.MeasureSpec.getMode(0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int fadingEdgeLength = 2405 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 26;
                char cResolveSize = (char) View.resolveSize(0, 0);
                byte[] bArr2 = $$a;
                byte b2 = bArr2[23];
                Object[] objArr14 = new Object[1];
                d(b2, (byte) (b2 | 85), (byte) (-bArr2[96]), objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(fadingEdgeLength, edgeSlop, cResolveSize, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            c(new char[]{23161, 39633, 42919, 35168, 7741, 48445, 61377, 3329, 45171, 16308, 37741, 57464, 29039, 56026, 34815, 23004}, View.resolveSizeAndState(0, 0, 0), new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952790_res_0x7f130496).substring(7, 8).codePointAt(0) + 19783), new char[]{4982, 1531, 26461, 28237}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            c(new char[]{5020, 34233, 14888, 59095, 9910, 43488, 23926, 45316, 1736, 40821, 38159, 63738, 5714, 47078, 65459, 40544}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952810_res_0x7f1304aa).substring(9, 10).length() - 1, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 53795), new char[]{58477, 20934, 16441, 49362}, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i4 = toString + 111;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, 1290747797};
                char[] cArr = {18, 6, 3, 11, 3, 65484, 65520, 65474, 16, 65535, 21, 1, CharUtils.CR, 11, 65484, 6, 19, 65535, 21, 3, 7, 65484, 2, 7, 5, 7, 18, 65535, '\n', 14, 65535, 23, 11, 3, '\f', 18, 65484, 1, CharUtils.CR, 11, 11, CharUtils.CR, '\f', 65484};
                int i6 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 270;
                int iAxisFromString = 43 - MotionEvent.axisFromString("");
                Object[] objArr18 = new Object[1];
                b(View.resolveSizeAndState(0, 0, 0) + 26, new char[]{33216, 53085, 16538, 62811, 62908, 33015, 58334, 52908, 26832, 32041, 10885, 40214, ')', 21448, 14312, 40890, 30861, 18556, 18779, 28384, 6072, 19513, 11512, 64529, 35476, 23141}, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                c(new char[]{31759, 36563, 55865, 8036, 44705, 59567, 43653, 48387, 5899, 29856, 18129, 49365, 60168, 59187, 27413, 62567, 59197, 60698}, TextUtils.getCapsMode("", 0, 0), new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 14161), new char[]{46803, 1311, 28386, 12599}, objArr19);
                int iCodePointAt = ((Context) cls4.getMethod((String) objArr19[0], new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(25) - 105;
                Object[] objArr20 = new Object[1];
                e(cArr, i6, iAxisFromString, iCodePointAt, false, objArr20);
                Class<?> cls5 = Class.forName(((String) objArr20[0]).intern());
                byte b3 = (byte) 0;
                byte b4 = b3;
                Object[] objArr21 = new Object[1];
                f(b3, b4, (byte) (b4 + 1), objArr21);
                objArr = (Object[]) cls5.getMethod((String) objArr21[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int i7 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2404;
                    int offsetBefore = 26 - TextUtils.getOffsetBefore("", 0);
                    char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte[] bArr3 = $$a;
                    byte b5 = bArr3[23];
                    Object[] objArr22 = new Object[1];
                    d(b5, (byte) (b5 | 85), (byte) (-bArr3[96]), objArr22);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i7, offsetBefore, cMakeMeasureSpec, 24929979, false, (String) objArr22[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr23 = new Object[1];
                    c(new char[]{34704, 23730, 14886, 9792, 30502, 38595, 48054, 58969, 10843, 60677, 2623, 39636, 62945, 5330, 55695, 9049, 1121, 64230, 57668, 28042, 62661, 11824}, View.combineMeasuredStates(0, 0), new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), new char[]{54187, 63668, 10890, 49437}, objArr23);
                    Class<?> cls6 = Class.forName((String) objArr23[0]);
                    Object[] objArr24 = new Object[1];
                    c(new char[]{28397, 57380, 26658, 3407, 4781, 63250, 43436, 17910, 9761, 1238, 24739, 51031, 52136, 30462, 17767}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(22) - 505745321, new char[]{0, 0, 0, 0}, (char) (24112 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), new char[]{48487, 56048, 12513, 38750}, objArr24);
                    long jLongValue = ((Long) cls6.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 2405;
                        int packedPositionGroup = 26 - ExpandableListView.getPackedPositionGroup(0L);
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        Object[] objArr25 = new Object[1];
                        d((byte) ($$b & 46), (byte) 84, $$a[0], objArr25);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(maxKeyCode, packedPositionGroup, cNormalizeMetaState, -1843538389, false, (String) objArr25[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 2405;
                        int iMyPid = 26 - (Process.myPid() >> 22);
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                        byte[] bArr4 = $$a;
                        Object[] objArr26 = new Object[1];
                        d(bArr4[23], (byte) 96, bArr4[39], objArr26);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(capsMode, iMyPid, cIndexOf, -2047739879, false, (String) objArr26[0], null);
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
        if (i9 == i8) {
            str = null;
        } else {
            long j = -1;
            long j2 = 0;
            long j3 = (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & ((long) (i9 ^ i8))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 6618, 42 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) Color.argb(0, 0, 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            int i10 = toString + 121;
            hashCode = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr27 = {587135166, Long.valueOf(j3), arrayList, null, true};
                str = null;
                Class cls7 = (Class) ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 6562, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 56, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                byte b6 = (byte) 0;
                byte b7 = b6;
                Object[] objArr28 = new Object[1];
                f(b6, b7, b7, objArr28);
                cls7.getMethod((String) objArr28[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr27);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(savedInstanceState);
        Pair[] pairArr = new Pair[1];
        Intent intent = getIntent();
        pairArr[0] = TuplesKt.to("token", intent != null ? intent.getStringExtra("token") : str);
        RouteUtils.routeWithExecute(RoutePathConstants.RESET_PIN_TEMP_PIN, BundleKt.bundleOf(pairArr));
        finish();
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = hashCode + 67;
        toString = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getBaseContext();
            obj.hashCode();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952781_res_0x7f13048d).substring(14, 15).length() + 25, new char[]{33216, 53085, 16538, 62811, 62908, 33015, 58334, 52908, 26832, 32041, 10885, 40214, ')', 21448, 14312, 40890, 30861, 18556, 18779, 28384, 6072, 19513, 11512, 64529, 35476, 23141}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            c(new char[]{31759, 36563, 55865, 8036, 44705, 59567, 43653, 48387, 5899, 29856, 18129, 49365, 60168, 59187, 27413, 62567, 59197, 60698}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 14079), new char[]{46803, 1311, 28386, 12599}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i3 = toString + 95;
            hashCode = i3 % 128;
            if (i3 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            baseContext = (((baseContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) baseContext).getBaseContext() != null) ? baseContext.getApplicationContext() : null;
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 6618, 42 - Color.green(0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getPressedStateDuration() >> 16), 57 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ('0' - AndroidCharacter.getMirror('0')), -699576857, false, "component2", new Class[]{Context.class});
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
            b(25 - TextUtils.lastIndexOf("", '0'), new char[]{33216, 53085, 16538, 62811, 62908, 33015, 58334, 52908, 26832, 32041, 10885, 40214, ')', 21448, 14312, 40890, 30861, 18556, 18779, 28384, 6072, 19513, 11512, 64529, 35476, 23141}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            c(new char[]{31759, 36563, 55865, 8036, 44705, 59567, 43653, 48387, 5899, 29856, 18129, 49365, 60168, 59187, 27413, 62567, 59197, 60698}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954889_res_0x7f130cc9).substring(0, 1).length() - 1, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(24) + 14075), new char[]{46803, 1311, 28386, 12599}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i2 = hashCode + 107;
            toString = i2 % 128;
            int i3 = i2 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 6618, 41 - MotionEvent.axisFromString(""), (char) KeyEvent.getDeadChar(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 6562, (KeyEvent.getMaxKeyCode() >> 16) + 56, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), -960739708, false, "component3", new Class[]{Context.class});
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
        int i4 = hashCode + 59;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r40) {
        /*
            Method dump skipped, instruction units count: 14765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.ResetPinCurrentPinActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        copy = 0;
        component2();
        component3();
        int i = getAsAtTimestamp + 107;
        copy = i % 128;
        if (i % 2 != 0) {
            int i2 = 4 / 0;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = toString + 37;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = toString + 101;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component3() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 9;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        copydefault = -890926542;
        int i5 = i2 + 17;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static void component2() {
        ShareDataUIState = (char) 40195;
        component2 = (char) 33707;
        component3 = (char) 36997;
        component1 = (char) 21055;
        getRequestBeneficiariesState = -3780477796495014671L;
        component4 = -736308922;
        equals = (char) 50417;
    }
}
