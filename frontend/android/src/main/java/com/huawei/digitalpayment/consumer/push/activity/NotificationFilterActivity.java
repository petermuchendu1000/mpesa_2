package com.huawei.digitalpayment.consumer.push.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
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
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.constant.CacheConstants;
import com.blankj.utilcode.util.BarUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.safe.SafeUri;
import com.huawei.digitalpayment.consumer.baselib.PaymentBaseActivity;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.push.databinding.ActivityNotificationEmptyBinding;
import com.safaricom.mpesa.lifestyle.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;
import kotlin.io.encoding.Base64;

public class NotificationFilterActivity extends PaymentBaseActivity<ActivityNotificationEmptyBinding, ViewModel> {
    private static final byte[] $$c = {70, -47, -65, TarHeader.LF_BLK};
    private static final int $$f = 54;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {4, -80, 45, 109, 5, -66, 67, -14, -5, 1, Ascii.DLE, -12, Ascii.FF, -18, Ascii.DC2, -75, 58, 4, 5, -16, Ascii.FF, -5, -14, 10, -63, SignedBytes.MAX_POWER_OF_TWO, 0, -12, Ascii.FF, -18, Ascii.DC2, -6, 2, 0, -70, TarHeader.LF_CONTIG, 5, 2, 7, -23, 0, 9, -8, -56, Ascii.ETB, 37, 2, 7, -23, 0, 9, -8, -18, Ascii.FF, 9, -7, -15, Ascii.DLE, 0, 2, -8, -66, 62, Ascii.VT, 0, 8, -22, 0, 0, -6, 19, -10, 7, Ascii.VT, -3, 2, -2, -2, -10, 8, 5, -67, Ascii.VT, -3, 2, -2, -2, -10, 8, 5, -66, Ascii.VT, -3, -64, 56, 7, -1, -9, 4, -8, -56, 75, -3, -16, 4, -8, -58, 65, -13, 1, -51, -4, 5, -10, TarHeader.LF_DIR, 0, -3, Ascii.VT, -12, 0, Ascii.FF, -69, 19, Ascii.RS, Ascii.DLE, -16, Ascii.VT, -12, 0, -25, Ascii.ETB, Ascii.SO, -20, 2, -4, Ascii.DC2, -20, 20, -8, Ascii.DLE, -14, -34, Ascii.FS, Ascii.DC2, -20, -13, -13, 9, 32, -20, Ascii.DC2, -16};
    private static final int $$e = 242;
    private static final byte[] $$a = {Base64.padSymbol, -49, -70, 93, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 232;
    private static int getRequestBeneficiariesState = 0;
    private static int copy = 1;
    private static char[] component3 = {30224, 30215, 30221, 30211, 30214, 30216, 30407, 30210, 30241, 30226, 30220, 30212, 30328, 30236, 30209, 30256, 30333, 30335, 30237, 30217, 30332, 30213, 30264, 30400, 30223, 30271, 30270, 30401, 30402, 30227, 30268, 30269, 30265, 30403, 30267, 30406, 30222, 30208, 30249, 30258};
    private static int copydefault = 321287921;
    private static boolean component2 = true;
    private static boolean component1 = true;
    private static char ShareDataUIState = 59547;
    private static char equals = 3287;
    private static char component4 = 684;
    private static char getAsAtTimestamp = 57480;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r7, int r8, int r9) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 1
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.push.activity.NotificationFilterActivity.$$c
            int r7 = 111 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r8
            r3 = r9
            r5 = r2
            goto L2a
        L15:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L19:
            byte r4 = (byte) r8
            int r7 = r7 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r7]
        L2a:
            int r8 = r8 + r3
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.push.activity.NotificationFilterActivity.$$i(short, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = 103 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.push.activity.NotificationFilterActivity.$$a
            int r1 = r8 + 4
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r3 = r3 + r6
            int r6 = r3 + (-8)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.push.activity.NotificationFilterActivity.d(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = 105 - r7
            int r6 = 137 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.push.activity.NotificationFilterActivity.$$d
            int r1 = r8 + 10
            byte[] r1 = new byte[r1]
            int r8 = r8 + 9
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r6
            int r6 = r3 + 1
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.push.activity.NotificationFilterActivity.e(short, short, int, java.lang.Object[]):void");
    }

    public static Intent newIntent(Context context, String str) {
        int i = 2 % 2;
        Intent intent = new Intent(context, (Class<?>) NotificationFilterActivity.class);
        intent.putExtra(KeysConstants.KEY_EXECUTE, str);
        int i2 = copy + 123;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return intent;
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        String str;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i5 = $11 + 71;
            $10 = i5 % 128;
            if (i5 % i3 != 0) {
                int i6 = 4 % 4;
            }
            int i7 = 58224;
            int i8 = 0;
            while (i8 < 16) {
                int i9 = $11 + 17;
                $10 = i9 % 128;
                int i10 = i9 % i3;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i11 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) component4) ^ 4374495167426960553L)));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getAsAtTimestamp);
                    objArr2[i3] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        str = "";
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode(str, 0, 0) + 844, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31, (char) (TextUtils.indexOf(str, str, 0, 0) + 23251), 592652048, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    } else {
                        str = "";
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(equals)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(843 - TextUtils.lastIndexOf(str, '0', 0), Process.getGidForName(str) + 33, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 23251), 592652048, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    i3 = 2;
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
                i2 = 2;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - TextUtils.indexOf("", "", 0, 0), 49 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i3 = i2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void b(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr2;
        int length;
        char[] cArr3;
        int i3;
        int i4 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr4 = component3;
        char c2 = '0';
        int i5 = 0;
        if (cArr4 != null) {
            int i6 = $11 + 75;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = cArr4.length;
                cArr3 = new char[length];
                i3 = 1;
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(cArr4[i3]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i5;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3760 - (TypedValue.complexToFloat(i5) > 0.0f ? 1 : (TypedValue.complexToFloat(i5) == 0.0f ? 0 : -1)), TextUtils.indexOf("", c2) + 25, (char) Color.red(i5), -1670574543, false, $$i((byte) 43, b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i3++;
                    c2 = '0';
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $11 + 11;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 % 5;
            }
            cArr4 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(copydefault)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7139 - MotionEvent.axisFromString(""), 14 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i9 = 689978476;
        if (component1) {
            int i10 = $10 + 81;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cancelVar.component1 = bArr.length;
                cArr2 = new char[cancelVar.component1];
                i2 = 0;
            } else {
                i2 = 0;
                cancelVar.component1 = bArr.length;
                cArr2 = new char[cancelVar.component1];
            }
            cancelVar.component3 = i2;
            int i11 = $10 + 117;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr2[cancelVar.component3] = (char) (cArr4[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                try {
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i9);
                    if (objCopydefault3 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 2748, 16777235 + Color.rgb(0, 0, 0), (char) (View.resolveSizeAndState(0, 0, 0) + 7644), -327556343, false, $$i((byte) ($$f & 239), b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    i9 = 689978476;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (component2) {
            cancelVar.component1 = cArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr4[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2747 - TextUtils.lastIndexOf("", '0', 0, 0), 20 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (7644 - TextUtils.indexOf("", "")), -327556343, false, $$i((byte) ($$f & 239), b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i13 = 0;
        cancelVar.component1 = iArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        while (true) {
            cancelVar.component3 = i13;
            if (cancelVar.component3 >= cancelVar.component1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i14 = $10 + 41;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr6[cancelVar.component3] = (char) (cArr4[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            i13 = cancelVar.component3 + 1;
        }
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        b(null, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, new byte[]{-120, -120, -117, -118, -123, -124, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, null, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        b(null, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, new byte[]{-125, -122, -114, -115, -116}, null, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = copy + 89;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                b(null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new byte[]{-125, -127, -117, -124, -108, -109, -115, -111, -122, -110, -122, -111, -118, -112, -121, -113, -113, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b(null, 127 - Color.blue(0), new byte[]{-126, -123, -122, -111, -127, -118, -122, -106, -113, -113, -112, -111, -126, -117, -124, -124, -107, -118}, null, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i4 = getRequestBeneficiariesState + 65;
                copy = i4 % 128;
                int i5 = i4 % 2;
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    int i6 = copy + 47;
                    getRequestBeneficiariesState = i6 % 128;
                    int i7 = i6 % 2;
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                }
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 6618, 43 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b(null, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 98, new byte[]{-98, -96, -101, -96, -97, -100, -96, -102, -127, -118, -105, -94, -104, -100, -127, -117, -103, -103, -127, -98, -96, -103, -95, -96, -117, -102, -99, -127, -97, -97, -104, -98, -102, -117, -99, -105, -105, -102, -118, -100, -117, -118, -101, -102, -103, -104, -105, -127}, null, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b(null, 127 - View.resolveSize(0, 0), new byte[]{-105, -102, -105, -99, -95, -105, -99, -102, -95, -103, -95, -101, -98, -127, -94, -125, -104, -97, -97, -103, -104, -105, -95, -118, -118, -104, -125, -117, -98, -118, -95, -100, -98, -102, -95, -102, -99, -125, -118, -95, -99, -100, -103, -100, -98, -95, -100, -99, -118, -118, -102, -105, -96, -104, -103, -94, -118, -118, -96, -100, -104, -99, -125, -94}, null, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    c(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(15) - 48, new char[]{42087, 14736, 64548, 529, 22846, 32678, 36699, 51990, 45007, 14893, 55331, 54716, 50993, 42325, 32997, 40540, 24237, 44926, 36132, 36223, 42328, 4212, 47117, 3570, 28742, 53838, 21765, 11888, 30472, 53185, 28174, 50758, 12901, 11534, 61899, 40894, 38840, 44692, 16330, 61096, 25264, 21834, 29115, 45855, 53411, 34998, 48278, 3940, 29364, 16293, 1772, 8916, 12158, 46940, 8985, 52561, 15880, 21194, 30222, 44123, 9921, 55683, 36401, 46561}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b(null, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(11) + 16, new byte[]{-120, -111, -126, -117, -110, -117, -92, -94, -110, -92, -111, -120, -117, -91, -126, -122, -92, -122, -113, -127, -92, -116, -123, -118, -121, -117, -124, -127, -107, -90, -120, -125, -124, -127, -107, -91, -121, -111, -120, -127, -118, -111, -127, -117, -124, -108, -111, -121, -98, -118, -101, -96, -94, -94, -102, -104, -97, -96, -103, -99, -101, -95, -97, -102, -92, -92, -93, -120, -113, -111, -111, -108}, null, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b(null, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952719_res_0x7f13044f).substring(6, 7).codePointAt(0) + 95, new byte[]{-99, -121, -96, -104, -121, -105}, null, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    c(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 61, new char[]{41165, 13346, 43928, 5689, 8945, 23741, 48497, 49746, 42085, 9757, 51426, 43678, 45456, 55596, 54471, 10207, 40119, 65091, 7660, 7809, 6668, 44381, 56534, 48590, 39020, 12524, 3647, 17675, 5059, 6435, 5124, 42003, 56805, 59832, 50993, 42325}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getWindowTouchSlop() >> 8), 57 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2405;
            int touchSlop = 26 - (ViewConfiguration.getTouchSlop() >> 8);
            char cBlue = (char) Color.blue(0);
            byte[] bArr = $$a;
            Object[] objArr13 = new Object[1];
            d(bArr[12], bArr[31], bArr[33], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(maximumDrawingCacheSize, touchSlop, cBlue, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                byte b2 = $$a[31];
                Object[] objArr14 = new Object[1];
                d(b2, b2, r3[8], objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2405 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), KeyEvent.getDeadChar(0, 0) + 26, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            c(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 30, new char[]{18563, 60186, 11848, 45362, 18165, 10584, 27358, 49082, 20843, 41965, 30270, 17758, 53784, 2345, 52460, 50679}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            b(null, Drawable.resolveOpacity(0, 0) + 127, new byte[]{-117, -125, -123, -88, -108, -120, -127, -89, -115, -111, -122, -111, -126, -117, -125, -122}, null, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i8 = getRequestBeneficiariesState + 35;
            copy = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, 545415047};
                byte[] bArr2 = $$d;
                byte b3 = bArr2[26];
                Object[] objArr18 = new Object[1];
                e((short) 133, b3, (byte) (b3 | 60), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                e(bArr2[25], (byte) (-bArr2[74]), bArr2[26], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int iBlue = 2405 - Color.blue(0);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 26;
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                    byte b4 = $$a[31];
                    Object[] objArr20 = new Object[1];
                    d(b4, b4, r7[8], objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iBlue, maximumFlingVelocity, bitsPerPixel, 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    c(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952303_res_0x7f1302af).substring(0, 2).length() + 20, new char[]{27358, 49082, 7131, 23892, 14841, 21308, 29582, 45063, 15487, 46138, 63857, 42985, 12286, 24494, 34420, 6249, 50207, 60457, 23203, 39564, 53965, 44996}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    c(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 14, new char[]{35388, 63342, 6260, 37022, 35007, 63963, 52926, 5651, 64670, 8822, 59575, 36457, 46821, 59845, 60620, 5109}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int i10 = 2406 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.ESC;
                        char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        Object[] objArr23 = new Object[1];
                        d(r10[9], r10[33], (byte) (-$$a[38]), objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(i10, modifierMetaStateMask, c2, -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int windowTouchSlop = 2405 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int i11 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 26;
                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte[] bArr3 = $$a;
                        Object[] objArr24 = new Object[1];
                        d(bArr3[12], bArr3[31], bArr3[33], objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(windowTouchSlop, i11, fadingEdgeLength, -2047739879, false, (String) objArr24[0], null);
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
        int i12 = ((int[]) objArr[0])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 == i12) {
            int i14 = copy + 55;
            getRequestBeneficiariesState = i14 % 128;
            int i15 = i14 % 2;
        } else {
            long j = -1;
            long j2 = ((long) (i12 ^ i13)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 6618, 42 - (KeyEvent.getMaxKeyCode() >> 16), (char) View.combineMeasuredStates(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            int i16 = copy + 113;
            getRequestBeneficiariesState = i16 % 128;
            int i17 = i16 % 2;
            try {
                Object[] objArr25 = {1037449750, Long.valueOf(j4), arrayList, null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 6562, 56 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) KeyEvent.normalizeMetaState(0));
                Object[] objArr26 = new Object[1];
                e(r3[35], (byte) (-$$d[74]), r3[26], objArr26);
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
        initData();
    }

    private void initView() {
        int i = 2 % 2;
        int i2 = copy + 91;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        BarUtils.transparentStatusBar(getWindow());
        int i4 = getRequestBeneficiariesState + 47;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    private void initData() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 61;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            Intent intent = getIntent();
            if (intent != null) {
                int i3 = getRequestBeneficiariesState + 23;
                copy = i3 % 128;
                int i4 = i3 % 2;
                String stringExtra = intent.getStringExtra(KeysConstants.KEY_EXECUTE);
                Uri uri = SafeUri.parse(stringExtra);
                if (TextUtils.isEmpty(stringExtra) || uri == null || uri.getScheme() == null) {
                    finish();
                    return;
                } else {
                    RouteUtils.routeWithExecute(uri.toString());
                    finish();
                    return;
                }
            }
            return;
        }
        getIntent();
        throw null;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 103;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = com.huawei.digitalpayment.consumer.push.R.layout.activity_notification_empty;
        if (i3 == 0) {
            int i5 = 46 / 0;
        }
        return i4;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = copy + 87;
        getRequestBeneficiariesState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getBaseContext();
            obj.hashCode();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(null, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, new byte[]{-125, -127, -117, -124, -108, -109, -115, -111, -122, -110, -122, -111, -118, -112, -121, -113, -113, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new byte[]{-126, -123, -122, -111, -127, -118, -122, -106, -113, -113, -112, -111, -126, -117, -124, -124, -107, -118}, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i3 = getRequestBeneficiariesState + 97;
            copy = i3 % 128;
            int i4 = i3 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i5 = getRequestBeneficiariesState + 69;
            copy = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6618, 42 - ExpandableListView.getPackedPositionGroup(0L), (char) Color.green(0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - ExpandableListView.getPackedPositionGroup(0L), 57 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -699576857, false, "component2", new Class[]{Context.class});
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
        int i7 = getRequestBeneficiariesState + 53;
        copy = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 37 / 0;
        }
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 63;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(null, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, new byte[]{-125, -127, -117, -124, -108, -109, -115, -111, -122, -110, -122, -111, -118, -112, -121, -113, -113, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(null, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952717_res_0x7f13044d).substring(6, 7).length() + 126, new byte[]{-126, -123, -122, -111, -127, -118, -122, -106, -113, -113, -112, -111, -126, -117, -124, -124, -107, -118}, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = getRequestBeneficiariesState + 7;
            copy = i4 % 128;
            int i5 = i4 % 2;
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i6 = copy + 101;
                getRequestBeneficiariesState = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6617, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 42, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 6562, Gravity.getAbsoluteGravity(0, 0) + 56, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -960739708, false, "component3", new Class[]{Context.class});
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

    /* JADX WARN: Can't wrap try/catch for region: R(93:0|2|(2:4|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|881|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0))(0)|31|(2:932|32)|(14:840|34|39|40|927|41|(2:938|43)|47|48|892|(2:50|(5:52|53|(1:55)|56|57)(3:58|(1:60)|61))(15:62|(2:64|(1:70)(1:69))(1:72)|(24:74|75|918|76|77|912|78|897|79|(2:929|81)|85|86|893|87|(2:876|89)|93|94|95|(2:848|97)|101|(3:103|104|105)(1:106)|107|(1:109)|110)(1:161)|167|168|169|910|170|173|174|(1:176)|177|178|853|179)|111|(4:114|(2:116|948)(11:117|(3:119|(3:122|123|120)|949)|124|885|125|(1:127)|128|129|874|130|947)|131|112)|946)(12:39|40|927|41|(0)|47|48|892|(0)(0)|111|(1:112)|946)|162|(79:182|931|183|(2:185|(2:187|(2:189|193)(1:190))(2:191|192))(1:193)|230|866|231|(3:233|926|234)|238|239|852|(5:241|242|(1:244)|245|246)(16:248|249|854|250|(3:252|914|253)|257|258|259|(1:261)|262|263|264|(1:266)(1:267)|268|(1:270)|271)|247|272|(9:275|844|276|(1:278)|279|280|281|944|282)|283|317|890|318|(3:320|883|321)|325|326|887|(4:328|329|(1:331)|332)(19:334|335|878|336|(2:838|338)|342|343|862|344|(2:858|346)|350|351|352|(1:354)|355|(2:357|358)(1:360)|361|(1:363)|364)|365|(4:368|(2:370|965)(11:371|(3:373|(3:376|377|374)|966)|378|850|379|(1:381)|382|383|836|384|964)|385|366)|963|397|426|880|427|(1:429)|430|(3:432|(1:434)|435)(22:436|437|868|438|(1:440)|441|442|860|443|(1:445)|446|447|448|(1:450)|451|452|856|453|(2:920|455)(1:457)|458|(1:460)|461)|462|(4:465|(2:467|(2:474|952)(11:475|(3:477|(3:480|481|478)|953)|482|842|483|(1:485)|486|487|940|488|951))(2:472|(0)(0))|489|463)|950|501|527|(1:529)|530|(1:532)(1:533)|534|(3:536|(1:538)|539)(16:541|542|(1:544)|545|(1:547)|548|549|(1:551)|552|901|553|554|(1:556)|557|(1:559)|560)|540|561|(1:563)(9:564|(3:566|(2:569|567)|962)|570|571|(1:573)|574|(1:576)|577|578)|579|(1:581)|582|(3:584|(1:586)|587)(14:588|589|(1:591)|592|593|(1:595)|596|906|597|598|(1:600)(1:601)|602|(1:604)|605)|606|(1:608)(9:609|(3:611|(2:614|612)|961)|615|616|(1:618)|619|(1:621)|622|623)|624|924|625|(2:939|627)|631|(1:633)|634|635|(4:637|638|(1:640)|641)(27:642|(2:644|(1:650)(1:649))|(22:652|653|905|654|655|922|656|(1:658)|659|660|908|661|(1:663)|664|665|666|(1:668)|669|(1:671)|672|(1:674)|675)(15:721|736|(1:738)|739|(2:741|(12:743|(1:745)|746|766|(6:769|770|(1:772)|773|774|775)|776|(1:778)|779|(3:781|(1:783)|784)(14:786|787|(1:789)|790|791|(1:793)|794|864|795|796|(1:798)|799|(1:801)|802)|785|803|(1:967)(7:806|807|(1:809)|810|811|812|813))(3:747|(1:749)|750))(13:752|942|753|754|(1:756)|757|872|758|759|(1:761)|762|(1:764)|765)|751|766|(0)|776|(0)|779|(0)(0)|785|803|(0)(0))|724|725|870|726|729|730|(1:732)|733|734|735|736|(0)|739|(0)(0)|751|766|(0)|776|(0)|779|(0)(0)|785|803|(0)(0))|676|(4:679|(3:956|681|959)(12:955|682|(3:684|(4:687|688|689|685)|960)|690|899|691|(1:693)|694|695|895|696|958)|957|677)|954|736|(0)|739|(0)(0)|751|766|(0)|776|(0)|779|(0)(0)|785|803|(0)(0))(1:197)|198|916|199|(1:201)|202|903|203|(1:205)|206|230|866|231|(0)|238|239|852|(0)(0)|247|272|(0)|283|317|890|318|(0)|325|326|887|(0)(0)|365|(1:366)|963|397|426|880|427|(0)|430|(0)(0)|462|(1:463)|950|501|527|(0)|530|(0)(0)|534|(0)(0)|540|561|(0)(0)|579|(0)|582|(0)(0)|606|(0)(0)|624|924|625|(0)|631|(0)|634|635|(0)(0)|676|(1:677)|954|736|(0)|739|(0)(0)|751|766|(0)|776|(0)|779|(0)(0)|785|803|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x2e8f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x2e90, code lost:
    
        r3 = r27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0823 A[Catch: all -> 0x095a, TryCatch #30 {all -> 0x095a, blocks: (B:111:0x0819, B:112:0x081d, B:114:0x0823, B:117:0x083d, B:120:0x0849, B:122:0x084c, B:134:0x0948, B:136:0x094e, B:137:0x094f, B:139:0x0951, B:141:0x0958, B:142:0x0959, B:105:0x0797, B:107:0x07b4, B:109:0x07cb, B:110:0x0813, B:147:0x0962, B:149:0x0968, B:150:0x0969, B:153:0x0970, B:155:0x0976, B:156:0x0977, B:130:0x08bf, B:125:0x087a, B:127:0x0880, B:128:0x08ad), top: B:892:0x0439, inners: #20, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0a31 A[Catch: all -> 0x034c, TryCatch #24 {all -> 0x034c, blocks: (B:311:0x114e, B:313:0x1154, B:314:0x117b, B:420:0x16db, B:422:0x16e1, B:423:0x1709, B:770:0x329c, B:772:0x32a2, B:773:0x32cc, B:807:0x35e0, B:809:0x35e6, B:810:0x3606, B:787:0x3418, B:789:0x343b, B:790:0x348b, B:730:0x2ef3, B:732:0x2ef9, B:733:0x2f23, B:616:0x2800, B:618:0x2806, B:619:0x2834, B:621:0x286e, B:622:0x28ba, B:589:0x256c, B:591:0x2581, B:592:0x25af, B:571:0x223f, B:573:0x2245, B:574:0x2272, B:576:0x22ac, B:577:0x22ef, B:542:0x1eb3, B:544:0x1ec8, B:545:0x1ef6, B:547:0x1f2a, B:548:0x1fa6, B:521:0x1c4c, B:523:0x1c52, B:524:0x1c79, B:224:0x0c8c, B:226:0x0c92, B:227:0x0cb9, B:174:0x0a2b, B:176:0x0a31, B:177:0x0a55, B:19:0x015e, B:21:0x0164, B:22:0x0190, B:24:0x02ba, B:26:0x02ec, B:27:0x0346), top: B:881:0x015e }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0ae3  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0b1a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0b31 A[Catch: all -> 0x0bfb, TryCatch #43 {all -> 0x0bfb, blocks: (B:199:0x0b1c, B:201:0x0b31, B:202:0x0b62), top: B:916:0x0b1c, outer: #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0b75 A[Catch: all -> 0x0bf1, TryCatch #36 {all -> 0x0bf1, blocks: (B:203:0x0b68, B:205:0x0b75, B:206:0x0be9), top: B:903:0x0b68, outer: #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0d4c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0da3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0dfe A[Catch: all -> 0x10c0, TRY_ENTER, TRY_LEAVE, TryCatch #16 {all -> 0x10c0, blocks: (B:231:0x0d46, B:238:0x0d96, B:248:0x0dfe, B:259:0x0e8a, B:262:0x0ed2), top: B:866:0x0d46 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0fbb  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x1154 A[Catch: all -> 0x034c, TryCatch #24 {all -> 0x034c, blocks: (B:311:0x114e, B:313:0x1154, B:314:0x117b, B:420:0x16db, B:422:0x16e1, B:423:0x1709, B:770:0x329c, B:772:0x32a2, B:773:0x32cc, B:807:0x35e0, B:809:0x35e6, B:810:0x3606, B:787:0x3418, B:789:0x343b, B:790:0x348b, B:730:0x2ef3, B:732:0x2ef9, B:733:0x2f23, B:616:0x2800, B:618:0x2806, B:619:0x2834, B:621:0x286e, B:622:0x28ba, B:589:0x256c, B:591:0x2581, B:592:0x25af, B:571:0x223f, B:573:0x2245, B:574:0x2272, B:576:0x22ac, B:577:0x22ef, B:542:0x1eb3, B:544:0x1ec8, B:545:0x1ef6, B:547:0x1f2a, B:548:0x1fa6, B:521:0x1c4c, B:523:0x1c52, B:524:0x1c79, B:224:0x0c8c, B:226:0x0c92, B:227:0x0cb9, B:174:0x0a2b, B:176:0x0a31, B:177:0x0a55, B:19:0x015e, B:21:0x0164, B:22:0x0190, B:24:0x02ba, B:26:0x02ec, B:27:0x0346), top: B:881:0x015e }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x1205  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x1262  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x12bb A[Catch: all -> 0x1659, TRY_ENTER, TRY_LEAVE, TryCatch #29 {all -> 0x1659, blocks: (B:318:0x11ff, B:325:0x1255, B:365:0x14f7, B:366:0x14fb, B:368:0x1501, B:371:0x151e, B:334:0x12bb, B:352:0x13cc, B:355:0x1418, B:361:0x148f, B:364:0x14ef), top: B:890:0x11ff }] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x1501 A[Catch: all -> 0x1659, TryCatch #29 {all -> 0x1659, blocks: (B:318:0x11ff, B:325:0x1255, B:365:0x14f7, B:366:0x14fb, B:368:0x1501, B:371:0x151e, B:334:0x12bb, B:352:0x13cc, B:355:0x1418, B:361:0x148f, B:364:0x14ef), top: B:890:0x11ff }] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x16e1 A[Catch: all -> 0x034c, TryCatch #24 {all -> 0x034c, blocks: (B:311:0x114e, B:313:0x1154, B:314:0x117b, B:420:0x16db, B:422:0x16e1, B:423:0x1709, B:770:0x329c, B:772:0x32a2, B:773:0x32cc, B:807:0x35e0, B:809:0x35e6, B:810:0x3606, B:787:0x3418, B:789:0x343b, B:790:0x348b, B:730:0x2ef3, B:732:0x2ef9, B:733:0x2f23, B:616:0x2800, B:618:0x2806, B:619:0x2834, B:621:0x286e, B:622:0x28ba, B:589:0x256c, B:591:0x2581, B:592:0x25af, B:571:0x223f, B:573:0x2245, B:574:0x2272, B:576:0x22ac, B:577:0x22ef, B:542:0x1eb3, B:544:0x1ec8, B:545:0x1ef6, B:547:0x1f2a, B:548:0x1fa6, B:521:0x1c4c, B:523:0x1c52, B:524:0x1c79, B:224:0x0c8c, B:226:0x0c92, B:227:0x0cb9, B:174:0x0a2b, B:176:0x0a31, B:177:0x0a55, B:19:0x015e, B:21:0x0164, B:22:0x0190, B:24:0x02ba, B:26:0x02ec, B:27:0x0346), top: B:881:0x015e }] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x1796 A[Catch: all -> 0x1bcc, TryCatch #23 {all -> 0x1bcc, blocks: (B:427:0x1790, B:429:0x1796, B:430:0x17d4, B:432:0x17e1, B:434:0x17ea, B:435:0x182a, B:492:0x1b9e, B:494:0x1ba4, B:495:0x1ba5, B:497:0x1ba7, B:499:0x1bae, B:500:0x1baf, B:436:0x1837, B:448:0x193d, B:450:0x1943, B:451:0x197b, B:505:0x1bb9, B:507:0x1bc0, B:508:0x1bc1, B:510:0x1bc3, B:512:0x1bca, B:513:0x1bcb, B:483:0x1ade, B:485:0x1ae4, B:486:0x1b0f, B:443:0x18a4, B:445:0x18c0, B:446:0x1931, B:438:0x1857, B:440:0x186c, B:441:0x189d, B:488:0x1b17), top: B:880:0x1790, inners: #3, #13, #17, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x17e1 A[Catch: all -> 0x1bcc, TryCatch #23 {all -> 0x1bcc, blocks: (B:427:0x1790, B:429:0x1796, B:430:0x17d4, B:432:0x17e1, B:434:0x17ea, B:435:0x182a, B:492:0x1b9e, B:494:0x1ba4, B:495:0x1ba5, B:497:0x1ba7, B:499:0x1bae, B:500:0x1baf, B:436:0x1837, B:448:0x193d, B:450:0x1943, B:451:0x197b, B:505:0x1bb9, B:507:0x1bc0, B:508:0x1bc1, B:510:0x1bc3, B:512:0x1bca, B:513:0x1bcb, B:483:0x1ade, B:485:0x1ae4, B:486:0x1b0f, B:443:0x18a4, B:445:0x18c0, B:446:0x1931, B:438:0x1857, B:440:0x186c, B:441:0x189d, B:488:0x1b17), top: B:880:0x1790, inners: #3, #13, #17, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x1837 A[Catch: all -> 0x1bcc, TRY_LEAVE, TryCatch #23 {all -> 0x1bcc, blocks: (B:427:0x1790, B:429:0x1796, B:430:0x17d4, B:432:0x17e1, B:434:0x17ea, B:435:0x182a, B:492:0x1b9e, B:494:0x1ba4, B:495:0x1ba5, B:497:0x1ba7, B:499:0x1bae, B:500:0x1baf, B:436:0x1837, B:448:0x193d, B:450:0x1943, B:451:0x197b, B:505:0x1bb9, B:507:0x1bc0, B:508:0x1bc1, B:510:0x1bc3, B:512:0x1bca, B:513:0x1bcb, B:483:0x1ade, B:485:0x1ae4, B:486:0x1b0f, B:443:0x18a4, B:445:0x18c0, B:446:0x1931, B:438:0x1857, B:440:0x186c, B:441:0x189d, B:488:0x1b17), top: B:880:0x1790, inners: #3, #13, #17, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x1a5a  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x1a9a  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x1a9e A[Catch: all -> 0x1bb4, PHI: r2 r4 r5
  0x1a9e: PHI (r2v489 java.lang.Object[]) = (r2v488 java.lang.Object[]), (r2v510 java.lang.Object[]) binds: [B:473:0x1a98, B:468:0x1a7b] A[DONT_GENERATE, DONT_INLINE]
  0x1a9e: PHI (r4v455 int) = (r4v454 int), (r4v470 int) binds: [B:473:0x1a98, B:468:0x1a7b] A[DONT_GENERATE, DONT_INLINE]
  0x1a9e: PHI (r5v433 int) = (r5v432 int), (r5v454 int) binds: [B:473:0x1a98, B:468:0x1a7b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #11 {all -> 0x1bb4, blocks: (B:462:0x1a50, B:463:0x1a54, B:475:0x1a9e, B:472:0x1a84, B:453:0x198a, B:458:0x19eb, B:461:0x1a48), top: B:856:0x198a }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x1c52 A[Catch: all -> 0x034c, TryCatch #24 {all -> 0x034c, blocks: (B:311:0x114e, B:313:0x1154, B:314:0x117b, B:420:0x16db, B:422:0x16e1, B:423:0x1709, B:770:0x329c, B:772:0x32a2, B:773:0x32cc, B:807:0x35e0, B:809:0x35e6, B:810:0x3606, B:787:0x3418, B:789:0x343b, B:790:0x348b, B:730:0x2ef3, B:732:0x2ef9, B:733:0x2f23, B:616:0x2800, B:618:0x2806, B:619:0x2834, B:621:0x286e, B:622:0x28ba, B:589:0x256c, B:591:0x2581, B:592:0x25af, B:571:0x223f, B:573:0x2245, B:574:0x2272, B:576:0x22ac, B:577:0x22ef, B:542:0x1eb3, B:544:0x1ec8, B:545:0x1ef6, B:547:0x1f2a, B:548:0x1fa6, B:521:0x1c4c, B:523:0x1c52, B:524:0x1c79, B:224:0x0c8c, B:226:0x0c92, B:227:0x0cb9, B:174:0x0a2b, B:176:0x0a31, B:177:0x0a55, B:19:0x015e, B:21:0x0164, B:22:0x0190, B:24:0x02ba, B:26:0x02ec, B:27:0x0346), top: B:881:0x015e }] */
    /* JADX WARN: Removed duplicated region for block: B:529:0x1d08  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x1d71  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x1db6  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x1dce  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x1e95  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x20e1  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x21fc  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x240c  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x245f  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x254b  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x26fa  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x27bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x2a48 A[Catch: all -> 0x2a1b, TRY_ENTER, TRY_LEAVE, TryCatch #56 {all -> 0x2a1b, blocks: (B:627:0x29d9, B:633:0x2a48, B:638:0x2ab1, B:640:0x2ab7, B:641:0x2afa, B:644:0x2b0b, B:646:0x2b0f, B:650:0x2b1b), top: B:939:0x29d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:637:0x2aa4  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x2b07  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x2d50 A[Catch: all -> 0x2e75, TryCatch #37 {all -> 0x2e75, blocks: (B:676:0x2d46, B:677:0x2d4a, B:679:0x2d50, B:682:0x2d68, B:685:0x2d75, B:688:0x2d82, B:700:0x2e63, B:702:0x2e69, B:703:0x2e6a, B:705:0x2e6c, B:707:0x2e73, B:708:0x2e74, B:654:0x2b2f, B:666:0x2c30, B:668:0x2c36, B:669:0x2c7d, B:671:0x2ca7, B:672:0x2ce6, B:674:0x2cfc, B:675:0x2d40, B:712:0x2e78, B:714:0x2e7f, B:715:0x2e80, B:717:0x2e82, B:719:0x2e89, B:720:0x2e8a, B:696:0x2de5, B:691:0x2dad, B:693:0x2db3, B:694:0x2ddd, B:661:0x2b8e, B:663:0x2bad, B:664:0x2c24, B:656:0x2b43, B:658:0x2b58, B:659:0x2b87), top: B:905:0x2b2f, inners: #32, #34, #39, #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:732:0x2ef9 A[Catch: all -> 0x034c, TryCatch #24 {all -> 0x034c, blocks: (B:311:0x114e, B:313:0x1154, B:314:0x117b, B:420:0x16db, B:422:0x16e1, B:423:0x1709, B:770:0x329c, B:772:0x32a2, B:773:0x32cc, B:807:0x35e0, B:809:0x35e6, B:810:0x3606, B:787:0x3418, B:789:0x343b, B:790:0x348b, B:730:0x2ef3, B:732:0x2ef9, B:733:0x2f23, B:616:0x2800, B:618:0x2806, B:619:0x2834, B:621:0x286e, B:622:0x28ba, B:589:0x256c, B:591:0x2581, B:592:0x25af, B:571:0x223f, B:573:0x2245, B:574:0x2272, B:576:0x22ac, B:577:0x22ef, B:542:0x1eb3, B:544:0x1ec8, B:545:0x1ef6, B:547:0x1f2a, B:548:0x1fa6, B:521:0x1c4c, B:523:0x1c52, B:524:0x1c79, B:224:0x0c8c, B:226:0x0c92, B:227:0x0cb9, B:174:0x0a2b, B:176:0x0a31, B:177:0x0a55, B:19:0x015e, B:21:0x0164, B:22:0x0190, B:24:0x02ba, B:26:0x02ec, B:27:0x0346), top: B:881:0x015e }] */
    /* JADX WARN: Removed duplicated region for block: B:738:0x2fb2  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x3007  */
    /* JADX WARN: Removed duplicated region for block: B:752:0x30bf  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x327e  */
    /* JADX WARN: Removed duplicated region for block: B:778:0x3358  */
    /* JADX WARN: Removed duplicated region for block: B:781:0x33ab  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x33fa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x012d A[PHI: r15
  0x012d: PHI (r15v77 char) = (r15v11 char), (r15v78 char) binds: [B:17:0x0159, B:5:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:806:0x35c2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0137 A[PHI: r15
  0x0137: PHI (r15v10 char) = (r15v9 char), (r15v80 char) binds: [B:3:0x0125, B:5:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:938:0x03d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:939:0x29d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:967:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v100 */
    /* JADX WARN: Type inference failed for: r11v101 */
    /* JADX WARN: Type inference failed for: r11v104 */
    /* JADX WARN: Type inference failed for: r11v105 */
    /* JADX WARN: Type inference failed for: r11v106 */
    /* JADX WARN: Type inference failed for: r11v107 */
    /* JADX WARN: Type inference failed for: r11v108 */
    /* JADX WARN: Type inference failed for: r11v109 */
    /* JADX WARN: Type inference failed for: r11v110 */
    /* JADX WARN: Type inference failed for: r11v111 */
    /* JADX WARN: Type inference failed for: r11v112 */
    /* JADX WARN: Type inference failed for: r11v113 */
    /* JADX WARN: Type inference failed for: r11v114 */
    /* JADX WARN: Type inference failed for: r11v115 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Type inference failed for: r11v81 */
    /* JADX WARN: Type inference failed for: r11v82 */
    /* JADX WARN: Type inference failed for: r11v84 */
    /* JADX WARN: Type inference failed for: r11v85 */
    /* JADX WARN: Type inference failed for: r11v86 */
    /* JADX WARN: Type inference failed for: r11v93 */
    /* JADX WARN: Type inference failed for: r11v94 */
    /* JADX WARN: Type inference failed for: r11v95 */
    /* JADX WARN: Type inference failed for: r11v96 */
    /* JADX WARN: Type inference failed for: r11v97 */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v101 */
    /* JADX WARN: Type inference failed for: r15v102 */
    /* JADX WARN: Type inference failed for: r15v103 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v105 */
    /* JADX WARN: Type inference failed for: r15v106 */
    /* JADX WARN: Type inference failed for: r15v107 */
    /* JADX WARN: Type inference failed for: r15v108 */
    /* JADX WARN: Type inference failed for: r15v109 */
    /* JADX WARN: Type inference failed for: r15v110 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v69, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v85 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v87 */
    /* JADX WARN: Type inference failed for: r15v88 */
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
    /* JADX WARN: Type inference failed for: r27v18 */
    /* JADX WARN: Type inference failed for: r27v19 */
    /* JADX WARN: Type inference failed for: r27v24 */
    /* JADX WARN: Type inference failed for: r27v25 */
    /* JADX WARN: Type inference failed for: r27v47 */
    /* JADX WARN: Type inference failed for: r27v48 */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1 */
    /* JADX WARN: Type inference failed for: r34v14 */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v10 */
    /* JADX WARN: Type inference failed for: r35v11 */
    /* JADX WARN: Type inference failed for: r35v12 */
    /* JADX WARN: Type inference failed for: r35v13 */
    /* JADX WARN: Type inference failed for: r35v14 */
    /* JADX WARN: Type inference failed for: r35v15 */
    /* JADX WARN: Type inference failed for: r35v16 */
    /* JADX WARN: Type inference failed for: r35v17 */
    /* JADX WARN: Type inference failed for: r35v18 */
    /* JADX WARN: Type inference failed for: r35v19 */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r35v20 */
    /* JADX WARN: Type inference failed for: r35v21 */
    /* JADX WARN: Type inference failed for: r35v22 */
    /* JADX WARN: Type inference failed for: r35v23 */
    /* JADX WARN: Type inference failed for: r35v24 */
    /* JADX WARN: Type inference failed for: r35v25 */
    /* JADX WARN: Type inference failed for: r35v26 */
    /* JADX WARN: Type inference failed for: r35v27 */
    /* JADX WARN: Type inference failed for: r35v28 */
    /* JADX WARN: Type inference failed for: r35v29 */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r35v30 */
    /* JADX WARN: Type inference failed for: r35v31 */
    /* JADX WARN: Type inference failed for: r35v32 */
    /* JADX WARN: Type inference failed for: r35v33 */
    /* JADX WARN: Type inference failed for: r35v34 */
    /* JADX WARN: Type inference failed for: r35v35 */
    /* JADX WARN: Type inference failed for: r35v36 */
    /* JADX WARN: Type inference failed for: r35v38 */
    /* JADX WARN: Type inference failed for: r35v39 */
    /* JADX WARN: Type inference failed for: r35v4 */
    /* JADX WARN: Type inference failed for: r35v40 */
    /* JADX WARN: Type inference failed for: r35v41 */
    /* JADX WARN: Type inference failed for: r35v46 */
    /* JADX WARN: Type inference failed for: r35v47 */
    /* JADX WARN: Type inference failed for: r35v48 */
    /* JADX WARN: Type inference failed for: r35v49 */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r35v50 */
    /* JADX WARN: Type inference failed for: r35v51 */
    /* JADX WARN: Type inference failed for: r35v52 */
    /* JADX WARN: Type inference failed for: r35v53 */
    /* JADX WARN: Type inference failed for: r35v54 */
    /* JADX WARN: Type inference failed for: r35v55 */
    /* JADX WARN: Type inference failed for: r35v56 */
    /* JADX WARN: Type inference failed for: r35v57 */
    /* JADX WARN: Type inference failed for: r35v58 */
    /* JADX WARN: Type inference failed for: r35v59 */
    /* JADX WARN: Type inference failed for: r35v6 */
    /* JADX WARN: Type inference failed for: r35v60 */
    /* JADX WARN: Type inference failed for: r35v7 */
    /* JADX WARN: Type inference failed for: r35v8 */
    /* JADX WARN: Type inference failed for: r35v9 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v116 */
    /* JADX WARN: Type inference failed for: r3v117 */
    /* JADX WARN: Type inference failed for: r3v118 */
    /* JADX WARN: Type inference failed for: r3v127 */
    /* JADX WARN: Type inference failed for: r3v130, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v131 */
    /* JADX WARN: Type inference failed for: r3v132 */
    /* JADX WARN: Type inference failed for: r3v133 */
    /* JADX WARN: Type inference failed for: r3v139 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v282 */
    /* JADX WARN: Type inference failed for: r3v295 */
    /* JADX WARN: Type inference failed for: r3v296 */
    /* JADX WARN: Type inference failed for: r3v297 */
    /* JADX WARN: Type inference failed for: r3v298 */
    /* JADX WARN: Type inference failed for: r3v299 */
    /* JADX WARN: Type inference failed for: r3v300 */
    /* JADX WARN: Type inference failed for: r3v301 */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r3v75, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v277, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v550 */
    /* JADX WARN: Type inference failed for: r6v551 */
    /* JADX WARN: Type inference failed for: r6v72, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v73, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v108, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v111 */
    /* JADX WARN: Type inference failed for: r8v112 */
    /* JADX WARN: Type inference failed for: r8v113 */
    /* JADX WARN: Type inference failed for: r8v114 */
    /* JADX WARN: Type inference failed for: r8v115 */
    /* JADX WARN: Type inference failed for: r8v120 */
    /* JADX WARN: Type inference failed for: r8v135 */
    /* JADX WARN: Type inference failed for: r8v140 */
    /* JADX WARN: Type inference failed for: r8v141 */
    /* JADX WARN: Type inference failed for: r8v147, types: [long] */
    /* JADX WARN: Type inference failed for: r8v148 */
    /* JADX WARN: Type inference failed for: r8v149 */
    /* JADX WARN: Type inference failed for: r8v153 */
    /* JADX WARN: Type inference failed for: r8v154 */
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
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v70, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v75, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v95 */
    /* JADX WARN: Type inference failed for: r9v254 */
    /* JADX WARN: Type inference failed for: r9v257 */
    /* JADX WARN: Type inference failed for: r9v258 */
    /* JADX WARN: Type inference failed for: r9v259 */
    /* JADX WARN: Type inference failed for: r9v260 */
    /* JADX WARN: Type inference failed for: r9v261 */
    /* JADX WARN: Type inference failed for: r9v262 */
    /* JADX WARN: Type inference failed for: r9v263, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v266 */
    /* JADX WARN: Type inference failed for: r9v270 */
    /* JADX WARN: Type inference failed for: r9v271 */
    /* JADX WARN: Type inference failed for: r9v275 */
    /* JADX WARN: Type inference failed for: r9v343 */
    /* JADX WARN: Type inference failed for: r9v344 */
    /* JADX WARN: Type inference failed for: r9v345 */
    /* JADX WARN: Type inference failed for: r9v346 */
    /* JADX WARN: Type inference failed for: r9v347 */
    /* JADX WARN: Type inference failed for: r9v348 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v50 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.push.activity.NotificationFilterActivity.attachBaseContext(android.content.Context):void");
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 19;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        int i5 = copy + 51;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
    }
}
