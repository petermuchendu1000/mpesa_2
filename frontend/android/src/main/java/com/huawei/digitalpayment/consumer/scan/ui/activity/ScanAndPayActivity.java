package com.huawei.digitalpayment.consumer.scan.ui.activity;

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
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.blankj.utilcode.constant.CacheConstants;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.listener.FilterFastClickListener;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.util.ViewUtils;
import com.huawei.common.widget.dialog.DialogBox;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.baselib.init.PaymentResource;
import com.huawei.digitalpayment.consumer.qrcode.databinding.ActivityScanAndPayBinding;
import com.huawei.digitalpayment.consumer.scan.ui.dialog.ScanNormalDataSelectDialog;
import com.huawei.digitalpayment.consumer.scan.ui.fragment.ScanFragment;
import com.huawei.digitalpayment.consumer.scan.viewmodel.ScanViewModel;
import com.safaricom.mpesa.lifestyle.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.io.encoding.Base64;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

public class ScanAndPayActivity extends Hilt_ScanAndPayActivity<ActivityScanAndPayBinding, ScanViewModel> {
    public static final int FROM_DEFAULT = 0;
    private static char ShareDataUIState;
    private static int component1;
    private static long component2;
    private static long component3;
    private static int copydefault;
    private static int getAsAtTimestamp;
    private ScanNormalDataSelectDialog dialog;
    private ScanFragment fragment;
    private boolean fromMacle = false;
    private boolean showPermissionDelayDialog = false;
    private static final byte[] $$l = {0, -128, 34, -14, 68};
    private static final int $$o = 212;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {62, TarHeader.LF_FIFO, 60, 44, -15, -1, 60, -72, Ascii.SI, -8, 2, -20, 6, 3, -15, -1, 60, -72, 8, 4, -20, 10, -2, -20, 9, 56, -56, -15, -1, -6, -2, -7, Ascii.VT, TarHeader.LF_BLK, -56, -15, -2, 5, -6, -12, 2, 9, -22, 8, -9, -2, Base64.padSymbol, -24, -47, -2, 5, -6, -12, 2, 33, -40, 5, -12, 35, -46, Ascii.FF, -11, 70, -32, -37, -20, 8, -9, -2, 40, -40, -4, -10, 73, -34, -50, 10, 1, -22, 2, -6, -24, 4, -20, 10, Ascii.RS, -32, -22, Ascii.DLE, 9, 9, -13, -36, Ascii.DLE, -22, Ascii.FF, -15, -1, -6, -2, -2, 6, -12, -9, 62};
    private static final int $$k = 108;
    private static final byte[] $$d = {99, TarHeader.LF_DIR, 44, 107, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 244;
    private static int copy = 1;
    private static int equals = 0;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r7, short r8, int r9) {
        /*
            int r9 = r9 + 65
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity.$$l
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2a
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity.$$r(int, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity.$$d
            int r8 = r8 * 2
            int r8 = r8 + 83
            int r9 = r9 + 4
            int r7 = 100 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L28
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            int r8 = r8 + 1
            int r7 = r7 + (-8)
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity.h(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 96 - r6
            int r7 = r7 * 16
            int r7 = r7 + 83
            byte[] r0 = com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity.$$j
            int r8 = r8 * 2
            int r1 = 78 - r8
            byte[] r1 = new byte[r1]
            int r8 = 77 - r8
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r7 + 1
            int r7 = r3 + (-3)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity.i(byte, short, short, java.lang.Object[]):void");
    }

    private static void g(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component2 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $11 + 63;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 7032, TextUtils.indexOf("", "", 0) + 34, (char) (63439 - ExpandableListView.getPackedPositionChild(0L)), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    int i6 = 1390 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int edgeSlop = 18 - (ViewConfiguration.getEdgeSlop() >> 16);
                    char c2 = (char) (51270 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    byte b2 = $$l[0];
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i6, edgeSlop, c2, -1883291598, false, $$r(b2, b3, (byte) (b3 | 38)), new Class[]{Object.class, Object.class});
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
        int i7 = $10 + 53;
        $11 = i7 % 128;
        if (i7 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i8 = 97 / 0;
            objArr[0] = str;
        }
    }

    private static void f(char[] cArr, int i, char[] cArr2, char c2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i5 = $11 + 61;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int touchSlop = 4037 - (ViewConfiguration.getTouchSlop() >> 8);
                    int capsMode = 31 - TextUtils.getCapsMode("", i4, i4);
                    char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 19181);
                    byte b2 = $$l[i4];
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(touchSlop, capsMode, jumpTapTimeout, 1912513118, false, $$r(b2, b2, r7[i2]), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7567 - View.MeasureSpec.makeMeasureSpec(0, 0), Drawable.resolveOpacity(0, 0) + 11, (char) TextUtils.getTrimmedLength(""), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i7 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i7);
                objArr4[0] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    int iKeyCodeFromString = 2459 - KeyEvent.keyCodeFromString("");
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 28;
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte b3 = $$l[0];
                    byte b4 = b3;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, scrollBarSize, doubleTapTimeout, 931716605, false, $$r(b3, b4, (byte) (b4 | 33)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getJumpTapTimeout() >> 16) + 7567, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component3 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component1) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) ShareDataUIState) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i8 = $10 + 63;
                $11 = i8 % 128;
                int i9 = i8 % 2;
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
        objArr[0] = new String(cArr6);
    }

    private static void j(char[] cArr, int i, int i2, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        int i5 = $10 + 63;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(copydefault)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 3784;
                    int longPressTimeout = 38 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    char scrollBarSize = (char) (26860 - (ViewConfiguration.getScrollBarSize() >> 8));
                    byte b2 = $$l[0];
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iMakeMeasureSpec, longPressTimeout, scrollBarSize, 2015799920, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 7407, 16 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ExpandableListView.getPackedPositionGroup(0L), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
            iTrustedWebActivityServiceStub.component1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i2 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7406 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 16 - TextUtils.indexOf("", "", 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            int i8 = $10 + 15;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        char c2;
        int i;
        boolean z;
        boolean z2;
        ScanAndPayActivity scanAndPayActivity;
        boolean z3;
        int i2 = 2 % 2;
        int i3 = component4 + 101;
        equals = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr2 = new Object[1];
        f(new char[]{27529, 43030, 56787, 6911, 51070, 61773, 2560, 22523, 25972, 15997, 8254, 19204, 40027, 59915, 12770, 19104, 52250, 14344}, TextUtils.indexOf("", ""), new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952781_res_0x7f13048d).substring(14, 15).length() + 19953), new char[]{64779, 10767, 62093, 19533}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 28, new char[]{41456, 41373, 5462, 22826, 11774, 24839, 10461, 51997, 17104}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i5 = component4 + 111;
                equals = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr4 = new Object[1];
                f(new char[]{64130, 65336, 32800, 13716, 28119, 2312, 23696, 48126, 30692, 30011, 60179, 55812, 48329, 1381, 44945, 19882, 20674, 31886, 39559, 14266, 14656, 16778, 32632, 4785, 64498, 49297}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952016_res_0x7f130190).substring(7, 8).length() - 1, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(11) + 34224), new char[]{339, 15120, 8065, 32134}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(13) - 45, new char[]{5949, 5982, 25393, 40081, 23445, 12875, 60737, 38986, 62492, 18414, 47571, 5564, 53701, 42172, 54535, 59608, 48786, 47465, 63067, 52252, 39490, 40474}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if (!(!(baseContext instanceof ContextWrapper))) {
                    int i7 = equals + 59;
                    component4 = i7 % 128;
                    int i8 = i7 % 2;
                    if (((ContextWrapper) baseContext).getBaseContext() == null) {
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
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6619 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.getTrimmedLength("") + 42, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
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
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952804_res_0x7f1304a4).substring(10, 11).length(), new char[]{25948, 25917, 39005, 25968, 41141, 28198, 5347, 50227, 34350, 48279, 16486, 18913, 41956, 24463, 11519, 46321, 52393, 16923, 4072, 36922, 59438, 25957, 60004, 62341, 5481, 2467, 62755, 56977, 14064, 11492, 53695, 14860, 21474, 53113, 48379, 9498, 32537, 61989, 40721, 145, 38922, 38585, 31622, 25477, 34242, 47608, 18073, 20253, 42628, 23615, 8537, 43534}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952856_res_0x7f1304d8).substring(9, 10).codePointAt(0) - 31, new char[]{28689, 28707, 51779, 50422, 62198, 53894, 46439, 30916, 37733, 61143, 57826, 62736, 46763, 3529, 36220, 2059, 55780, 4189, 44650, 11416, 64818, 14119, 19437, 20261, AbstractJsonLexerKt.UNICODE_ESC, 23477, 21665, 25136, 9137, 32508, 28729, 34556, 18171, 40291, 7471, 39401, 27137, 41023, 16070, 48181, 36112, 50343, 55888, 57200, 37082, 60343, 59156, 62446, 45979, 3710, 32988, 5802, 55109, 4805, 44500, 10501, 64082, 12683, 18711, 19483, 7583, 21580, 27140, 24791, 8414, 31490, 30671, 33682}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 28, new char[]{10970, 10986, 46607, 46622, 36536, 2484, 51076, 41891, 51631, 37531, 37712, 11809, 60516, 29058, 65485, 54078, 33569, 27669, 56543, 63486, 42927, 19258, 14595, 37909, 23228, 10154, 9802, 47442, 31094, 693, 648, 23963, 7266, 57638, 28617, 17034, 12490, 56447, 19493, 26368, 55183, 47337, 43194, 1041, 51781, 38903, 38391, 10383, 59654, 29244, 62008, 52639, 36315, 28302, 57141, 62009, 41119, 19917, 15266, 38694, 18179, 10324, 6374, 48058, 31248, 1857, 1327, 22703}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    g((Process.myTid() >> 22) + 1, new char[]{6659, 6763, 59596, 55218, 53353, 32794, 42596, 10777, 63796, 52294, 62125, 42881, 56509, 12037, 40566, 23253, 46076, 12946, 48446, 32275, 38690, 5566, 22756, 7592, 27235, 31099, 18417, 12476, 18869, 23668, 25398, 54368, 11450, 49061, 3694, 52021, 'B', 33515, 11730, 61092, 59136, 58921, 51459, 36284, 64207, 51555, 62559, 41335, 55694, 11430, 37775, 17512, 48464, 12295, 48859, 31637, 36886, 4956, 23067, 7889, 30674, 30350, 31065, 12887, 19084, 22992, 25813, 53504, 11889, 48471, 995, 62684, 3554, 32850, 12086, 60317}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(12) - 108, new char[]{42948, 43005, 5694, 44852, 11969, 15030, 56999, 37105, 17582, 13031}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f(new char[]{63095, 15698, 21020, 58783, 5057, 43848, 22267, 23788, 60823, 52656, 44246, 37376, 41515, 20984, 45855, 4291, 46554, 56516, 43256, 14627, 47777, 144, 18705, 46729, 30322, 4312, 3143, 60347, 10517, 23113, 42023, 44088, 9703, 35817, 17630, 29001}, (Process.getThreadPriority(0) + 20) >> 6, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954659_res_0x7f130be3).substring(6, 9).length() - 3), new char[]{47195, 64657, 9753, 53036}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.combineMeasuredStates(0, 0) + 6562, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 56, (char) (ViewConfiguration.getEdgeSlop() >> 16), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault3 == null) {
            int iRed = Color.red(0) + 2405;
            int minimumFlingVelocity = 26 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            byte b2 = (byte) ($$e & AUScreenAdaptTool.WIDTH_BASE);
            byte[] bArr = $$d;
            Object[] objArr13 = new Object[1];
            h(b2, bArr[22], bArr[33], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iRed, minimumFlingVelocity, cKeyCodeFromString, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 2405;
                int i9 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 26;
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                Object[] objArr14 = new Object[1];
                h((byte) 93, r6[22], (byte) (-$$d[8]), objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(longPressTimeout, i9, cCombineMeasuredStates, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
            i = 0;
            c2 = 2;
        } else {
            Object[] objArr15 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 28, new char[]{4632, 4722, 20874, 28332, 26938, 11669, 8056, 34695, 61810, 30019, 19455, 2654, 54519, 38477, 9985, 63237, 48039, 35795, 1139, 54229}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 28, new char[]{48469, 48444, 57289, 17845, 59260, 44917, 13426, 1384, 24165, 64256, 24800, 34982, 31637, 6212, 3115, 30203, 5338, 1422, 12152, 20786}, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 733111450};
                byte[] bArr2 = $$j;
                byte b3 = bArr2[77];
                Object[] objArr18 = new Object[1];
                i((byte) 92, b3, (byte) (b3 - 1), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b4 = bArr2[8];
                byte b5 = (byte) (bArr2[77] - 1);
                Object[] objArr19 = new Object[1];
                i(b4, b5, (byte) (b5 | Ascii.US), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2405;
                    int i10 = 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                    Object[] objArr20 = new Object[1];
                    h((byte) 93, r4[22], (byte) (-$$d[8]), objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(windowTouchSlop, i10, cLastIndexOf, 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    g(View.MeasureSpec.getSize(0) + 1, new char[]{1195, 1226, 7826, 50764, 9773, 13377, 46986, 40512, 59264, 14929, 58120, 5081, 49740, 55559, 36750, 61160, 44318, 50371, 44176, 51738, 35286, 58255, 18772, 43436, 29852, 36707}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 28, new char[]{10341, 10240, 43359, 21092, 37346, 23578, 9127, 63001, 52050, 36242, 30501, 31740, 61064, 28378, 7137, 34454, 33216, 29458, 14508}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 2405;
                        int iGreen = Color.green(0) + 26;
                        char cCombineMeasuredStates2 = (char) View.combineMeasuredStates(0, 0);
                        Object[] objArr23 = new Object[1];
                        h((byte) ($$e & 351), (byte) ($$d[40] - 1), r5[38], objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionType, iGreen, cCombineMeasuredStates2, -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int i11 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2406;
                        int i12 = 27 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        char cResolveSize = (char) View.resolveSize(0, 0);
                        byte b6 = (byte) ($$e & AUScreenAdaptTool.WIDTH_BASE);
                        byte[] bArr3 = $$d;
                        Object[] objArr24 = new Object[1];
                        h(b6, bArr3[22], bArr3[33], objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(i11, i12, cResolveSize, -2047739879, false, (String) objArr24[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
                    int i13 = component4 + 115;
                    equals = i13 % 128;
                    c2 = 2;
                    int i14 = i13 % 2;
                    i = 0;
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
        int i15 = ((int[]) objArr[i])[i];
        int i16 = ((int[]) objArr[c2])[i];
        if (i16 == i15) {
            z = true;
        } else {
            long j = -1;
            long j2 = ((long) (i16 ^ i15)) & ((((long) i) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 6618, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 41, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            int i17 = component4 + 37;
            equals = i17 % 128;
            int i18 = i17 % 2;
            try {
                Object[] objArr25 = {1620677165, Long.valueOf(j4), arrayList, null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 6562, (ViewConfiguration.getJumpTapTimeout() >> 16) + 56, (char) ExpandableListView.getPackedPositionType(0L));
                byte[] bArr4 = $$j;
                byte b7 = bArr4[77];
                Object[] objArr26 = new Object[1];
                i((byte) (b7 - 1), b7, (byte) (-bArr4[74]), objArr26);
                z = true;
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th4) {
                Throwable cause3 = th4.getCause();
                if (cause3 == null) {
                    throw th4;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        if (bundle != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("from", getFrom());
            RouteUtils.routeWithExecute(RoutePathConstants.SCAN, bundle2);
            finish();
            z2 = false;
            scanAndPayActivity = this;
            scanAndPayActivity.overridePendingTransition(0, 0);
        } else {
            z2 = false;
            scanAndPayActivity = this;
        }
        initView();
        if (101 == getFrom()) {
            int i19 = component4 + 59;
            equals = i19 % 128;
            int i20 = i19 % 2;
            z3 = z;
        } else {
            z3 = z2;
        }
        scanAndPayActivity.fromMacle = z3;
        if (z3) {
            ((ActivityScanAndPayBinding) scanAndPayActivity.binding).llBottom.setVisibility(8);
        }
    }

    private int getFrom() {
        int i = 2 % 2;
        int i2 = component4 + 33;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getIntExtra("from", 0);
        }
        int i4 = component4 + 59;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b6  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity.onResume():void");
    }

    private void requestPermissionIfNeed() {
        int i = 2 % 2;
        int i2 = equals + 57;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        if (!PermissionUtils.isGranted("android.permission.CAMERA")) {
            PermissionUtils.permission("android.permission.CAMERA").callback(new PermissionUtils.FullCallback() {
                private static int ShareDataUIState = 1;
                private static int component3;

                @Override
                public void onGranted(List<String> list) {
                    int i4 = 2 % 2;
                    int i5 = component3 + 71;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    ScanAndPayActivity.m10961$$Nest$mshowGuideDialog(ScanAndPayActivity.this);
                    if (i6 == 0) {
                        int i7 = 45 / 0;
                    }
                }

                @Override
                public void onDenied(List<String> list, List<String> list2) {
                    int i4 = 2 % 2;
                    int i5 = component3 + 37;
                    ShareDataUIState = i5 % 128;
                    if (i5 % 2 != 0) {
                        ToastUtils.showLong(ScanAndPayActivity.this.getString(com.huawei.digitalpayment.consumer.qrcode.R.string.camera_permission_deny));
                        ScanAndPayActivity.m10962$$Nest$mshowRequestPermissionDialog(ScanAndPayActivity.this);
                    } else {
                        ToastUtils.showLong(ScanAndPayActivity.this.getString(com.huawei.digitalpayment.consumer.qrcode.R.string.camera_permission_deny));
                        ScanAndPayActivity.m10962$$Nest$mshowRequestPermissionDialog(ScanAndPayActivity.this);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }
            }).request();
            return;
        }
        int i4 = equals + 91;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            showGuideDialog();
            int i5 = component4 + 91;
            equals = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        showGuideDialog();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void lambda$showGuideDialog$0(int i) {
        int i2 = 2 % 2;
        int i3 = equals + 117;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            SPUtils.getInstance().put(SPConstant.IS_FIRST_OPEN_SCAN, true);
        } else {
            SPUtils.getInstance().put(SPConstant.IS_FIRST_OPEN_SCAN, false);
        }
        addScanFragment();
        this.fragment.setConfirmGuideDialog(true);
        int i4 = component4 + 23;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (com.huawei.common.util.SPUtils.getInstance().getBoolean(com.huawei.digitalpayment.consumer.baselib.constants.SPConstant.IS_FIRST_OPEN_SCAN, true) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r0 = new com.huawei.digitalpayment.consumer.scan.ui.dialog.ScanNormalDataSelectDialog();
        r4.dialog = r0;
        r0.show(getSupportFragmentManager(), "");
        r4.dialog.setOnItemClick(new com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity$$ExternalSyntheticLambda2(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        addScanFragment();
        r4.fragment.setConfirmGuideDialog(true);
        r1 = com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity.equals + 77;
        com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity.component4 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if ((r1 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4.dialog != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4.dialog != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        addScanFragment();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void showGuideDialog() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity.component4
            int r1 = r1 + 31
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity.equals = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            com.huawei.digitalpayment.consumer.scan.ui.dialog.ScanNormalDataSelectDialog r1 = r4.dialog
            r2 = 25
            int r2 = r2 / 0
            if (r1 == 0) goto L1f
            goto L1b
        L17:
            com.huawei.digitalpayment.consumer.scan.ui.dialog.ScanNormalDataSelectDialog r1 = r4.dialog
            if (r1 == 0) goto L1f
        L1b:
            r4.addScanFragment()
            return
        L1f:
            com.huawei.common.util.SPUtils r1 = com.huawei.common.util.SPUtils.getInstance()
            java.lang.String r2 = "is_first_open_scan"
            r3 = 1
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 == 0) goto L47
            com.huawei.digitalpayment.consumer.scan.ui.dialog.ScanNormalDataSelectDialog r0 = new com.huawei.digitalpayment.consumer.scan.ui.dialog.ScanNormalDataSelectDialog
            r0.<init>()
            r4.dialog = r0
            androidx.fragment.app.FragmentManager r1 = r4.getSupportFragmentManager()
            java.lang.String r2 = ""
            r0.show(r1, r2)
            com.huawei.digitalpayment.consumer.scan.ui.dialog.ScanNormalDataSelectDialog r0 = r4.dialog
            com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity$$ExternalSyntheticLambda2 r1 = new com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity$$ExternalSyntheticLambda2
            r1.<init>()
            r0.setOnItemClick(r1)
            return
        L47:
            r4.addScanFragment()
            com.huawei.digitalpayment.consumer.scan.ui.fragment.ScanFragment r1 = r4.fragment
            r1.setConfirmGuideDialog(r3)
            int r1 = com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity.equals
            int r1 = r1 + 77
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity.component4 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L5b
            return
        L5b:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity.showGuideDialog():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r4.fragment = com.huawei.digitalpayment.consumer.scan.ui.fragment.ScanFragment.newInstance(r4.fromMacle);
        getSupportFragmentManager().beginTransaction().replace(com.huawei.digitalpayment.consumer.qrcode.R.id.scanFragment, r4.fragment).commitAllowingStateLoss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4.fragment != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4.fragment != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 123;
        com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity.component4 = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void addScanFragment() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity.component4
            int r1 = r1 + 117
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity.equals = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            com.huawei.digitalpayment.consumer.scan.ui.fragment.ScanFragment r1 = r4.fragment
            r3 = 46
            int r3 = r3 / 0
            if (r1 == 0) goto L23
            goto L1b
        L17:
            com.huawei.digitalpayment.consumer.scan.ui.fragment.ScanFragment r1 = r4.fragment
            if (r1 == 0) goto L23
        L1b:
            int r2 = r2 + 123
            int r1 = r2 % 128
            com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity.component4 = r1
            int r2 = r2 % r0
            return
        L23:
            boolean r0 = r4.fromMacle
            com.huawei.digitalpayment.consumer.scan.ui.fragment.ScanFragment r0 = com.huawei.digitalpayment.consumer.scan.ui.fragment.ScanFragment.newInstance(r0)
            r4.fragment = r0
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            int r1 = com.huawei.digitalpayment.consumer.qrcode.R.id.scanFragment
            com.huawei.digitalpayment.consumer.scan.ui.fragment.ScanFragment r2 = r4.fragment
            androidx.fragment.app.FragmentTransaction r0 = r0.replace(r1, r2)
            r0.commitAllowingStateLoss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity.addScanFragment():void");
    }

    private void lambda$showRequestPermissionDialog$1(View view, String str) {
        int i = 2 % 2;
        int i2 = component4 + 75;
        equals = i2 % 128;
        int i3 = i2 % 2;
        AppUtils.launchAppDetailsSettings();
        this.showPermissionDelayDialog = false;
        int i4 = equals + 63;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void lambda$showRequestPermissionDialog$2(View view) {
        int i = 2 % 2;
        int i2 = equals + 121;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        finish();
        int i4 = equals + 35;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
    }

    private void showRequestPermissionDialog() {
        int i = 2 % 2;
        this.showPermissionDelayDialog = true;
        DialogBox.builder().setContent(getString(com.huawei.digitalpayment.consumer.qrcode.R.string.scan_permission_tip)).setLeftButtonText(getString(com.huawei.digitalpayment.consumer.qrcode.R.string.scan_permission_btn_cancel)).setRightButtonText(getString(com.huawei.digitalpayment.consumer.qrcode.R.string.scan_permission_btn_setting)).setRightButtonListener(new DialogBox.DialogBoxListener() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final void onButtonClick(View view, String str) {
                int i2 = 2 % 2;
                int i3 = copydefault + 41;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                ScanAndPayActivity.$r8$lambda$DTXtV4IGG8snMTR97J3c7g_HA40(this.f$0, view, str);
                int i5 = component3 + 15;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        }).setLeftButtonListener(new View.OnClickListener() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component2 + 105;
                component3 = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    ScanAndPayActivity.m10960$r8$lambda$8pLc1IkkdK7YUhPvlsU5y5m2o0(this.f$0, view);
                    obj.hashCode();
                    throw null;
                }
                ScanAndPayActivity.m10960$r8$lambda$8pLc1IkkdK7YUhPvlsU5y5m2o0(this.f$0, view);
                int i4 = component3 + 105;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }).build().show(getSupportFragmentManager(), "RequestPermissionDialog");
        int i2 = equals + 125;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 54 / 0;
        }
    }

    private void initView() {
        int i = 2 % 2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ((ActivityScanAndPayBinding) this.binding).toolbar.getRoot().getLayoutParams();
        layoutParams.height = ViewUtils.getStatusBarHeight() + BarUtils.getActionBarHeight();
        ((ActivityScanAndPayBinding) this.binding).toolbar.ivBack.setOnClickListener(new FilterFastClickListener() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void onFilterClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 63;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    ScanAndPayActivity.this.finish();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ScanAndPayActivity.this.finish();
                int i4 = component1 + 29;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        ((ActivityScanAndPayBinding) this.binding).toolbar.ivBack.setColorFilter(PaymentResource.getOriginColor(this, com.huawei.digitalpayment.consumer.qrcode.R.color.colorBackground));
        ((ActivityScanAndPayBinding) this.binding).toolbar.tvTitle.setTextColor(PaymentResource.getOriginColor(this, com.huawei.digitalpayment.consumer.qrcode.R.color.colorBackground));
        ((ActivityScanAndPayBinding) this.binding).toolbar.tvTitle.setText(getString(com.huawei.digitalpayment.consumer.qrcode.R.string.scan_title));
        ((ActivityScanAndPayBinding) this.binding).toolbar.getRoot().setLayoutParams(layoutParams);
        ((ActivityScanAndPayBinding) this.binding).llManual.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component1 + 7;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ScanAndPayActivity.$r8$lambda$vVUXjy6U2ZGhvyaax_5ywEuXoRk(view);
                int i5 = copydefault + 121;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component4 + 49;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void lambda$initView$3(View view) {
        int i = 2 % 2;
        int i2 = component4 + 81;
        equals = i2 % 128;
        int i3 = i2 % 2;
        RouteUtils.routeWithExecute(RoutePathConstants.QRCODE_MANUAL);
        int i4 = component4 + 117;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = component4 + 57;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int i4 = com.huawei.digitalpayment.consumer.qrcode.R.layout.activity_scan_and_pay;
        if (i3 == 0) {
            return i4;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d7  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(87:0|2|(2:4|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|986|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0))(0)|31|882|32|(2:950|34)|38|39|(6:988|(5:41|42|(1:44)|45|46)(19:48|49|878|50|51|865|52|(2:928|54)|58|59|60|(3:62|884|63)|67|68|69|(1:71)|72|(1:74)|75)|47|76|(9:79|978|80|(1:82)|83|84|85|965|86)|87)|123|926|124|(3:126|893|127)|131|132|919|(4:134|135|(1:137)|138)(19:140|141|904|142|(2:982|144)|148|149|895|150|(2:891|152)|156|157|158|(2:160|161)|162|(1:164)(1:166)|167|(1:169)|170)|171|(4:174|(2:176|1005)(11:177|(3:179|(3:182|183|180)|1006)|184|880|185|(1:187)|188|189|869|190|1004)|191|172)|1003|203|204|(3:971|235|(1:241)(1:240))(1:245)|246|954|247|(1:249)|250|942|251|(1:253)|254|255|278|911|279|(3:281|936|282)|286|287|888|(3:289|(4:291|292|(1:294)|295)(3:296|(1:298)|299)|300)(21:301|302|898|303|(2:980|305)|309|310|889|311|(2:874|313)|317|318|319|(2:321|322)|323|324|325|(1:327)(1:328)|329|(1:331)|332)|333|(4:336|(2:338|1001)(11:339|(3:341|(4:344|345|346|342)|1002)|347|876|348|(1:350)|351|352|867|353|1000)|354|334)|999|366|395|(9:976|396|(3:398|930|399)|404|(5:917|406|407|910|408)(1:412)|969|413|414|939)|(4:416|417|(1:419)|420)(46:423|(2:425|(1:431)(1:430))(1:433)|(20:435|956|436|(2:886|438)|442|443|944|444|(2:946|446)|450|451|452|(2:454|455)|456|457|458|(2:460|461)(1:463)|464|(2:466|467)|468)(35:515|516|533|(1:535)|536|(1:538)(1:539)|540|(3:542|(1:544)|545)(16:547|548|(1:550)|551|(1:553)|554|555|(1:557)|558|952|559|560|(1:562)|563|(1:565)|566)|546|567|(1:569)(9:570|(3:572|(2:575|573)|994)|576|577|(1:579)|580|(1:582)(1:583)|584|585)|586|(1:588)|589|(3:591|(1:593)|594)(14:595|596|(1:598)|599|600|(1:602)|603|958|604|605|(1:607)(1:608)|609|(1:611)|612)|613|(1:615)(9:616|(3:618|(2:621|619)|993)|622|623|(1:625)|626|(1:628)(1:629)|630|631)|632|967|633|(13:635|897|636|640|(1:642)|643|644|964|(4:646|647|(1:649)|650)(13:651|(2:653|(2:655|(2:657|(2:659|663)(1:660))(2:661|662))(1:663))|(22:665|666|940|667|668|960|669|(3:671|900|672)|676|677|948|678|(2:937|680)|684|685|686|(3:688|922|689)|690|(2:692|693)(1:695)|696|(1:698)|699)(1:756)|759|760|924|761|764|765|(1:767)|768|769|770)|700|(4:703|(2:705|991)(11:706|(3:708|(3:711|712|709)|992)|715|920|716|(3:718|915|719)(1:720)|721|722|908|723|990)|724|701)|989|739)(10:640|(0)|643|644|964|(0)(0)|700|(1:701)|989|739)|771|(1:773)|774|(3:776|(1:778)|779)(13:781|974|782|783|(1:785)|786|906|787|788|(1:790)|791|(1:793)|794)|780|795|(6:798|799|(1:801)|802|803|804)|805|(1:807)|808|(3:810|(1:812)|813)(14:815|816|(1:818)|819|820|(1:822)|823|902|824|825|(1:827)|828|(1:830)|831)|814|832|(1:1007)(7:835|836|(1:838)|839|840|841|842))|521|522|934|523|526|527|(1:529)|530|531|532|533|(0)|536|(0)(0)|540|(0)(0)|546|567|(0)(0)|586|(0)|589|(0)(0)|613|(0)(0)|632|967|633|(0)(0)|771|(0)|774|(0)(0)|780|795|(0)|805|(0)|808|(0)(0)|814|832|(0)(0))|469|(4:472|(2:474|997)(11:475|(3:477|(3:480|481|478)|998)|482|932|483|(1:485)|486|487|913|488|996)|489|470)|995|516|533|(0)|536|(0)(0)|540|(0)(0)|546|567|(0)(0)|586|(0)|589|(0)(0)|613|(0)(0)|632|967|633|(0)(0)|771|(0)|774|(0)(0)|780|795|(0)|805|(0)|808|(0)(0)|814|832|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x2f90, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x2f91, code lost:
    
        r10 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1007:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x07be A[Catch: all -> 0x039f, TryCatch #65 {all -> 0x039f, blocks: (B:227:0x0d45, B:229:0x0d4b, B:230:0x0d77, B:389:0x15de, B:391:0x15e4, B:392:0x160e, B:527:0x1d19, B:529:0x1d1f, B:530:0x1d47, B:765:0x300f, B:767:0x3015, B:768:0x303e, B:799:0x34f5, B:801:0x34fb, B:802:0x3525, B:836:0x3855, B:838:0x385b, B:839:0x3881, B:816:0x3672, B:818:0x3695, B:819:0x36ef, B:623:0x289b, B:625:0x28a1, B:626:0x28cb, B:628:0x2905, B:630:0x294d, B:596:0x25e7, B:598:0x25fc, B:599:0x262b, B:577:0x2309, B:579:0x230f, B:580:0x2341, B:582:0x237b, B:584:0x23c4, B:548:0x1f85, B:550:0x1f9a, B:551:0x1fcc, B:553:0x2000, B:554:0x2084, B:272:0x0fd6, B:274:0x0fdc, B:275:0x100a, B:117:0x07b8, B:119:0x07be, B:120:0x07eb, B:19:0x0192, B:21:0x0198, B:22:0x01c4, B:24:0x030b, B:26:0x033d, B:27:0x0399), top: B:986:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0933 A[Catch: all -> 0x0cdd, TRY_ENTER, TRY_LEAVE, TryCatch #33 {all -> 0x0cdd, blocks: (B:124:0x086f, B:131:0x08c5, B:171:0x0b72, B:172:0x0b76, B:174:0x0b7c, B:177:0x0b98, B:140:0x0933, B:158:0x0a51, B:162:0x0a9c, B:167:0x0b11, B:170:0x0b6a), top: B:926:0x086f }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0b7c A[Catch: all -> 0x0cdd, TryCatch #33 {all -> 0x0cdd, blocks: (B:124:0x086f, B:131:0x08c5, B:171:0x0b72, B:172:0x0b76, B:174:0x0b7c, B:177:0x0b98, B:140:0x0933, B:158:0x0a51, B:162:0x0a9c, B:167:0x0b11, B:170:0x0b6a), top: B:926:0x086f }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0d4b A[Catch: all -> 0x039f, TryCatch #65 {all -> 0x039f, blocks: (B:227:0x0d45, B:229:0x0d4b, B:230:0x0d77, B:389:0x15de, B:391:0x15e4, B:392:0x160e, B:527:0x1d19, B:529:0x1d1f, B:530:0x1d47, B:765:0x300f, B:767:0x3015, B:768:0x303e, B:799:0x34f5, B:801:0x34fb, B:802:0x3525, B:836:0x3855, B:838:0x385b, B:839:0x3881, B:816:0x3672, B:818:0x3695, B:819:0x36ef, B:623:0x289b, B:625:0x28a1, B:626:0x28cb, B:628:0x2905, B:630:0x294d, B:596:0x25e7, B:598:0x25fc, B:599:0x262b, B:577:0x2309, B:579:0x230f, B:580:0x2341, B:582:0x237b, B:584:0x23c4, B:548:0x1f85, B:550:0x1f9a, B:551:0x1fcc, B:553:0x2000, B:554:0x2084, B:272:0x0fd6, B:274:0x0fdc, B:275:0x100a, B:117:0x07b8, B:119:0x07be, B:120:0x07eb, B:19:0x0192, B:21:0x0198, B:22:0x01c4, B:24:0x030b, B:26:0x033d, B:27:0x0399), top: B:986:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0e15  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0e2c A[Catch: all -> 0x0ef6, TryCatch #48 {all -> 0x0ef6, blocks: (B:247:0x0e17, B:249:0x0e2c, B:250:0x0e60), top: B:954:0x0e17, outer: #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0e73 A[Catch: all -> 0x0eec, TryCatch #42 {all -> 0x0eec, blocks: (B:251:0x0e66, B:253:0x0e73, B:254:0x0ee3), top: B:942:0x0e66, outer: #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x109b  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x10fa  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x11b9 A[Catch: all -> 0x1552, TRY_ENTER, TRY_LEAVE, TryCatch #25 {all -> 0x1552, blocks: (B:279:0x1095, B:286:0x10ed, B:301:0x11b9, B:319:0x12bd, B:323:0x1305), top: B:911:0x1095 }] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x13f3 A[Catch: all -> 0x153a, TryCatch #12 {all -> 0x153a, blocks: (B:333:0x13e9, B:334:0x13ed, B:336:0x13f3, B:339:0x140d, B:342:0x141a, B:345:0x1428, B:357:0x1524, B:359:0x152a, B:360:0x152b, B:362:0x152d, B:364:0x1534, B:365:0x1535, B:325:0x1313, B:327:0x1330, B:329:0x137e, B:331:0x1395, B:332:0x13e1, B:371:0x153f, B:373:0x1545, B:374:0x1546, B:377:0x154a, B:379:0x1550, B:380:0x1551, B:353:0x149d, B:348:0x1457, B:350:0x145d, B:351:0x148b), top: B:888:0x10f8, inners: #1, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x15e4 A[Catch: all -> 0x039f, TryCatch #65 {all -> 0x039f, blocks: (B:227:0x0d45, B:229:0x0d4b, B:230:0x0d77, B:389:0x15de, B:391:0x15e4, B:392:0x160e, B:527:0x1d19, B:529:0x1d1f, B:530:0x1d47, B:765:0x300f, B:767:0x3015, B:768:0x303e, B:799:0x34f5, B:801:0x34fb, B:802:0x3525, B:836:0x3855, B:838:0x385b, B:839:0x3881, B:816:0x3672, B:818:0x3695, B:819:0x36ef, B:623:0x289b, B:625:0x28a1, B:626:0x28cb, B:628:0x2905, B:630:0x294d, B:596:0x25e7, B:598:0x25fc, B:599:0x262b, B:577:0x2309, B:579:0x230f, B:580:0x2341, B:582:0x237b, B:584:0x23c4, B:548:0x1f85, B:550:0x1f9a, B:551:0x1fcc, B:553:0x2000, B:554:0x2084, B:272:0x0fd6, B:274:0x0fdc, B:275:0x100a, B:117:0x07b8, B:119:0x07be, B:120:0x07eb, B:19:0x0192, B:21:0x0198, B:22:0x01c4, B:24:0x030b, B:26:0x033d, B:27:0x0399), top: B:986:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x1697  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x175e  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x1776  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x17d7  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x1b32 A[Catch: all -> 0x1c95, TryCatch #60 {all -> 0x1c95, blocks: (B:396:0x1691, B:404:0x16e6, B:469:0x1b28, B:470:0x1b2c, B:472:0x1b32, B:475:0x1b4d, B:458:0x1a5c, B:464:0x1ac2, B:468:0x1b20), top: B:976:0x1691 }] */
    /* JADX WARN: Removed duplicated region for block: B:529:0x1d1f A[Catch: all -> 0x039f, TryCatch #65 {all -> 0x039f, blocks: (B:227:0x0d45, B:229:0x0d4b, B:230:0x0d77, B:389:0x15de, B:391:0x15e4, B:392:0x160e, B:527:0x1d19, B:529:0x1d1f, B:530:0x1d47, B:765:0x300f, B:767:0x3015, B:768:0x303e, B:799:0x34f5, B:801:0x34fb, B:802:0x3525, B:836:0x3855, B:838:0x385b, B:839:0x3881, B:816:0x3672, B:818:0x3695, B:819:0x36ef, B:623:0x289b, B:625:0x28a1, B:626:0x28cb, B:628:0x2905, B:630:0x294d, B:596:0x25e7, B:598:0x25fc, B:599:0x262b, B:577:0x2309, B:579:0x230f, B:580:0x2341, B:582:0x237b, B:584:0x23c4, B:548:0x1f85, B:550:0x1f9a, B:551:0x1fcc, B:553:0x2000, B:554:0x2084, B:272:0x0fd6, B:274:0x0fdc, B:275:0x100a, B:117:0x07b8, B:119:0x07be, B:120:0x07eb, B:19:0x0192, B:21:0x0198, B:22:0x01c4, B:24:0x030b, B:26:0x033d, B:27:0x0399), top: B:986:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:535:0x1dd2  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x1e44  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x1e8d  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x1ea2  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x1f67  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x21c1  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x22c6  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x24b0  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x2505  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x25c5  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x276b  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x284f  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x2a7a  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x2ac7 A[Catch: all -> 0x2f90, PHI: r2
  0x2ac7: PHI (r2v354 java.lang.Object) = (r2v353 java.lang.Object), (r2v410 java.lang.Object) binds: [B:634:0x2a78, B:636:0x2a7c] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #55 {all -> 0x2f90, blocks: (B:633:0x2a74, B:640:0x2ac7, B:643:0x2b36, B:665:0x2bd8), top: B:967:0x2a74 }] */
    /* JADX WARN: Removed duplicated region for block: B:642:0x2aee A[Catch: all -> 0x2ac2, TRY_ENTER, TRY_LEAVE, TryCatch #17 {all -> 0x2ac2, blocks: (B:636:0x2a7c, B:642:0x2aee, B:647:0x2b4d, B:649:0x2b53, B:650:0x2b9e, B:653:0x2baf, B:657:0x2bbf, B:661:0x2bcb, B:662:0x2bd1, B:663:0x2bd2), top: B:897:0x2a7c }] */
    /* JADX WARN: Removed duplicated region for block: B:646:0x2b4a  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x2bab  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x2e27 A[Catch: all -> 0x2f6c, TryCatch #41 {all -> 0x2f6c, blocks: (B:700:0x2e1d, B:701:0x2e21, B:703:0x2e27, B:706:0x2e43, B:667:0x2be6, B:686:0x2cfc, B:690:0x2d46, B:696:0x2db8, B:699:0x2e15), top: B:940:0x2be6 }] */
    /* JADX WARN: Removed duplicated region for block: B:767:0x3015 A[Catch: all -> 0x039f, TryCatch #65 {all -> 0x039f, blocks: (B:227:0x0d45, B:229:0x0d4b, B:230:0x0d77, B:389:0x15de, B:391:0x15e4, B:392:0x160e, B:527:0x1d19, B:529:0x1d1f, B:530:0x1d47, B:765:0x300f, B:767:0x3015, B:768:0x303e, B:799:0x34f5, B:801:0x34fb, B:802:0x3525, B:836:0x3855, B:838:0x385b, B:839:0x3881, B:816:0x3672, B:818:0x3695, B:819:0x36ef, B:623:0x289b, B:625:0x28a1, B:626:0x28cb, B:628:0x2905, B:630:0x294d, B:596:0x25e7, B:598:0x25fc, B:599:0x262b, B:577:0x2309, B:579:0x230f, B:580:0x2341, B:582:0x237b, B:584:0x23c4, B:548:0x1f85, B:550:0x1f9a, B:551:0x1fcc, B:553:0x2000, B:554:0x2084, B:272:0x0fd6, B:274:0x0fdc, B:275:0x100a, B:117:0x07b8, B:119:0x07be, B:120:0x07eb, B:19:0x0192, B:21:0x0198, B:22:0x01c4, B:24:0x030b, B:26:0x033d, B:27:0x0399), top: B:986:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:773:0x30ce  */
    /* JADX WARN: Removed duplicated region for block: B:776:0x3120  */
    /* JADX WARN: Removed duplicated region for block: B:781:0x3175  */
    /* JADX WARN: Removed duplicated region for block: B:798:0x34d3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0169 A[PHI: r15
  0x0169: PHI (r15v103 char) = (r15v3 char), (r15v104 char) binds: [B:17:0x018d, B:5:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:807:0x35b4  */
    /* JADX WARN: Removed duplicated region for block: B:810:0x3602  */
    /* JADX WARN: Removed duplicated region for block: B:815:0x3654  */
    /* JADX WARN: Removed duplicated region for block: B:835:0x3837  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0175 A[PHI: r15
  0x0175: PHI (r15v3 char) = (r15v2 char), (r15v105 char) binds: [B:3:0x0161, B:5:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:917:0x170d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:971:0x0dfc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v46, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r10v47, types: [long] */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r10v53 */
    /* JADX WARN: Type inference failed for: r10v69 */
    /* JADX WARN: Type inference failed for: r10v71 */
    /* JADX WARN: Type inference failed for: r10v72 */
    /* JADX WARN: Type inference failed for: r10v73 */
    /* JADX WARN: Type inference failed for: r10v77 */
    /* JADX WARN: Type inference failed for: r10v78 */
    /* JADX WARN: Type inference failed for: r10v79, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r10v82 */
    /* JADX WARN: Type inference failed for: r10v83 */
    /* JADX WARN: Type inference failed for: r10v92 */
    /* JADX WARN: Type inference failed for: r10v94 */
    /* JADX WARN: Type inference failed for: r10v95 */
    /* JADX WARN: Type inference failed for: r10v96 */
    /* JADX WARN: Type inference failed for: r11v104 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v178 */
    /* JADX WARN: Type inference failed for: r11v184 */
    /* JADX WARN: Type inference failed for: r11v185 */
    /* JADX WARN: Type inference failed for: r11v190 */
    /* JADX WARN: Type inference failed for: r11v191, types: [long] */
    /* JADX WARN: Type inference failed for: r11v192 */
    /* JADX WARN: Type inference failed for: r11v195 */
    /* JADX WARN: Type inference failed for: r11v196 */
    /* JADX WARN: Type inference failed for: r11v201 */
    /* JADX WARN: Type inference failed for: r11v202 */
    /* JADX WARN: Type inference failed for: r11v203 */
    /* JADX WARN: Type inference failed for: r11v204 */
    /* JADX WARN: Type inference failed for: r11v205 */
    /* JADX WARN: Type inference failed for: r11v206 */
    /* JADX WARN: Type inference failed for: r11v207 */
    /* JADX WARN: Type inference failed for: r11v208 */
    /* JADX WARN: Type inference failed for: r11v209 */
    /* JADX WARN: Type inference failed for: r11v210 */
    /* JADX WARN: Type inference failed for: r11v211 */
    /* JADX WARN: Type inference failed for: r11v212 */
    /* JADX WARN: Type inference failed for: r11v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v69, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v70, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v78 */
    /* JADX WARN: Type inference failed for: r11v84, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v85 */
    /* JADX WARN: Type inference failed for: r11v86 */
    /* JADX WARN: Type inference failed for: r11v87 */
    /* JADX WARN: Type inference failed for: r11v88 */
    /* JADX WARN: Type inference failed for: r11v92 */
    /* JADX WARN: Type inference failed for: r11v93 */
    /* JADX WARN: Type inference failed for: r12v140 */
    /* JADX WARN: Type inference failed for: r12v141 */
    /* JADX WARN: Type inference failed for: r12v142 */
    /* JADX WARN: Type inference failed for: r12v143 */
    /* JADX WARN: Type inference failed for: r12v146 */
    /* JADX WARN: Type inference failed for: r12v147 */
    /* JADX WARN: Type inference failed for: r12v148 */
    /* JADX WARN: Type inference failed for: r12v149 */
    /* JADX WARN: Type inference failed for: r12v161 */
    /* JADX WARN: Type inference failed for: r12v164 */
    /* JADX WARN: Type inference failed for: r12v165 */
    /* JADX WARN: Type inference failed for: r12v168 */
    /* JADX WARN: Type inference failed for: r12v169 */
    /* JADX WARN: Type inference failed for: r12v170 */
    /* JADX WARN: Type inference failed for: r12v171 */
    /* JADX WARN: Type inference failed for: r12v172 */
    /* JADX WARN: Type inference failed for: r12v173 */
    /* JADX WARN: Type inference failed for: r12v174 */
    /* JADX WARN: Type inference failed for: r12v175 */
    /* JADX WARN: Type inference failed for: r12v176 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v101 */
    /* JADX WARN: Type inference failed for: r15v106 */
    /* JADX WARN: Type inference failed for: r15v107 */
    /* JADX WARN: Type inference failed for: r15v108 */
    /* JADX WARN: Type inference failed for: r15v109 */
    /* JADX WARN: Type inference failed for: r15v110 */
    /* JADX WARN: Type inference failed for: r15v111 */
    /* JADX WARN: Type inference failed for: r15v112 */
    /* JADX WARN: Type inference failed for: r15v113 */
    /* JADX WARN: Type inference failed for: r15v114 */
    /* JADX WARN: Type inference failed for: r15v115 */
    /* JADX WARN: Type inference failed for: r15v116 */
    /* JADX WARN: Type inference failed for: r15v117 */
    /* JADX WARN: Type inference failed for: r15v118 */
    /* JADX WARN: Type inference failed for: r15v119 */
    /* JADX WARN: Type inference failed for: r15v120 */
    /* JADX WARN: Type inference failed for: r15v121 */
    /* JADX WARN: Type inference failed for: r15v122 */
    /* JADX WARN: Type inference failed for: r15v123 */
    /* JADX WARN: Type inference failed for: r15v124 */
    /* JADX WARN: Type inference failed for: r15v125 */
    /* JADX WARN: Type inference failed for: r15v126 */
    /* JADX WARN: Type inference failed for: r15v127 */
    /* JADX WARN: Type inference failed for: r15v128 */
    /* JADX WARN: Type inference failed for: r15v129 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v85 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v87 */
    /* JADX WARN: Type inference failed for: r15v90 */
    /* JADX WARN: Type inference failed for: r15v91 */
    /* JADX WARN: Type inference failed for: r15v92 */
    /* JADX WARN: Type inference failed for: r15v98 */
    /* JADX WARN: Type inference failed for: r15v99, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v193, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v445 */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r1v85, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r29v10 */
    /* JADX WARN: Type inference failed for: r29v11 */
    /* JADX WARN: Type inference failed for: r29v17 */
    /* JADX WARN: Type inference failed for: r29v18 */
    /* JADX WARN: Type inference failed for: r29v19 */
    /* JADX WARN: Type inference failed for: r29v20 */
    /* JADX WARN: Type inference failed for: r29v21 */
    /* JADX WARN: Type inference failed for: r29v22 */
    /* JADX WARN: Type inference failed for: r29v23 */
    /* JADX WARN: Type inference failed for: r29v24 */
    /* JADX WARN: Type inference failed for: r29v25 */
    /* JADX WARN: Type inference failed for: r29v26 */
    /* JADX WARN: Type inference failed for: r29v27 */
    /* JADX WARN: Type inference failed for: r29v31 */
    /* JADX WARN: Type inference failed for: r29v32 */
    /* JADX WARN: Type inference failed for: r29v33 */
    /* JADX WARN: Type inference failed for: r29v34 */
    /* JADX WARN: Type inference failed for: r29v35 */
    /* JADX WARN: Type inference failed for: r29v36 */
    /* JADX WARN: Type inference failed for: r29v52 */
    /* JADX WARN: Type inference failed for: r29v53 */
    /* JADX WARN: Type inference failed for: r29v54 */
    /* JADX WARN: Type inference failed for: r29v8 */
    /* JADX WARN: Type inference failed for: r29v9 */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v13 */
    /* JADX WARN: Type inference failed for: r31v14 */
    /* JADX WARN: Type inference failed for: r31v15 */
    /* JADX WARN: Type inference failed for: r31v16 */
    /* JADX WARN: Type inference failed for: r31v17 */
    /* JADX WARN: Type inference failed for: r31v18 */
    /* JADX WARN: Type inference failed for: r31v19 */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v20 */
    /* JADX WARN: Type inference failed for: r31v21 */
    /* JADX WARN: Type inference failed for: r31v22 */
    /* JADX WARN: Type inference failed for: r31v23 */
    /* JADX WARN: Type inference failed for: r31v24 */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r31v6 */
    /* JADX WARN: Type inference failed for: r31v7 */
    /* JADX WARN: Type inference failed for: r31v8 */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v427, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v428 */
    /* JADX WARN: Type inference failed for: r3v429 */
    /* JADX WARN: Type inference failed for: r3v430 */
    /* JADX WARN: Type inference failed for: r3v445 */
    /* JADX WARN: Type inference failed for: r3v446 */
    /* JADX WARN: Type inference failed for: r3v447 */
    /* JADX WARN: Type inference failed for: r3v448 */
    /* JADX WARN: Type inference failed for: r3v493 */
    /* JADX WARN: Type inference failed for: r3v612 */
    /* JADX WARN: Type inference failed for: r3v613 */
    /* JADX WARN: Type inference failed for: r3v614 */
    /* JADX WARN: Type inference failed for: r3v615 */
    /* JADX WARN: Type inference failed for: r3v616 */
    /* JADX WARN: Type inference failed for: r4v107, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v204 */
    /* JADX WARN: Type inference failed for: r4v205 */
    /* JADX WARN: Type inference failed for: r4v206 */
    /* JADX WARN: Type inference failed for: r4v221 */
    /* JADX WARN: Type inference failed for: r4v543 */
    /* JADX WARN: Type inference failed for: r4v544 */
    /* JADX WARN: Type inference failed for: r4v545 */
    /* JADX WARN: Type inference failed for: r8v100 */
    /* JADX WARN: Type inference failed for: r8v101 */
    /* JADX WARN: Type inference failed for: r8v102 */
    /* JADX WARN: Type inference failed for: r8v103 */
    /* JADX WARN: Type inference failed for: r8v104 */
    /* JADX WARN: Type inference failed for: r8v106 */
    /* JADX WARN: Type inference failed for: r8v107 */
    /* JADX WARN: Type inference failed for: r8v115, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v117 */
    /* JADX WARN: Type inference failed for: r8v123 */
    /* JADX WARN: Type inference failed for: r8v126 */
    /* JADX WARN: Type inference failed for: r8v128 */
    /* JADX WARN: Type inference failed for: r8v129 */
    /* JADX WARN: Type inference failed for: r8v130 */
    /* JADX WARN: Type inference failed for: r8v131 */
    /* JADX WARN: Type inference failed for: r8v132 */
    /* JADX WARN: Type inference failed for: r8v134 */
    /* JADX WARN: Type inference failed for: r8v135 */
    /* JADX WARN: Type inference failed for: r8v156 */
    /* JADX WARN: Type inference failed for: r8v157 */
    /* JADX WARN: Type inference failed for: r8v160 */
    /* JADX WARN: Type inference failed for: r8v161 */
    /* JADX WARN: Type inference failed for: r8v163 */
    /* JADX WARN: Type inference failed for: r8v189 */
    /* JADX WARN: Type inference failed for: r8v204 */
    /* JADX WARN: Type inference failed for: r8v205 */
    /* JADX WARN: Type inference failed for: r8v206 */
    /* JADX WARN: Type inference failed for: r8v207 */
    /* JADX WARN: Type inference failed for: r8v208 */
    /* JADX WARN: Type inference failed for: r8v209 */
    /* JADX WARN: Type inference failed for: r8v210 */
    /* JADX WARN: Type inference failed for: r8v211 */
    /* JADX WARN: Type inference failed for: r8v212 */
    /* JADX WARN: Type inference failed for: r8v213 */
    /* JADX WARN: Type inference failed for: r8v214 */
    /* JADX WARN: Type inference failed for: r8v215 */
    /* JADX WARN: Type inference failed for: r8v216 */
    /* JADX WARN: Type inference failed for: r8v217 */
    /* JADX WARN: Type inference failed for: r8v218 */
    /* JADX WARN: Type inference failed for: r8v219 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v220 */
    /* JADX WARN: Type inference failed for: r8v221 */
    /* JADX WARN: Type inference failed for: r8v222 */
    /* JADX WARN: Type inference failed for: r8v223 */
    /* JADX WARN: Type inference failed for: r8v224 */
    /* JADX WARN: Type inference failed for: r8v225 */
    /* JADX WARN: Type inference failed for: r8v226 */
    /* JADX WARN: Type inference failed for: r8v227 */
    /* JADX WARN: Type inference failed for: r8v228 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r8v56 */
    /* JADX WARN: Type inference failed for: r8v59 */
    /* JADX WARN: Type inference failed for: r8v61 */
    /* JADX WARN: Type inference failed for: r8v62 */
    /* JADX WARN: Type inference failed for: r8v63 */
    /* JADX WARN: Type inference failed for: r8v77 */
    /* JADX WARN: Type inference failed for: r8v81 */
    /* JADX WARN: Type inference failed for: r8v87 */
    /* JADX WARN: Type inference failed for: r8v89 */
    /* JADX WARN: Type inference failed for: r8v90, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v93 */
    /* JADX WARN: Type inference failed for: r8v94 */
    /* JADX WARN: Type inference failed for: r8v95 */
    /* JADX WARN: Type inference failed for: r8v97 */
    /* JADX WARN: Type inference failed for: r8v98 */
    /* JADX WARN: Type inference failed for: r8v99 */
    /* JADX WARN: Type inference failed for: r9v339 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.activity.ScanAndPayActivity.attachBaseContext(android.content.Context):void");
    }

    public static void m10960$r8$lambda$8pLc1IkkdK7YUhPvlsU5y5m2o0(ScanAndPayActivity scanAndPayActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 87;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m10964instrumented$1$showRequestPermissionDialog$V(scanAndPayActivity, view);
        int i4 = component4 + 57;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$DTXtV4IGG8snMTR97J3c7g_HA40(ScanAndPayActivity scanAndPayActivity, View view, String str) {
        int i = 2 % 2;
        int i2 = component4 + 87;
        equals = i2 % 128;
        int i3 = i2 % 2;
        scanAndPayActivity.lambda$showRequestPermissionDialog$1(view, str);
        int i4 = component4 + 109;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$PWVkMgX3oxVw81kswxctpHTtJXw(ScanAndPayActivity scanAndPayActivity, int i) {
        int i2 = 2 % 2;
        int i3 = equals + 119;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        scanAndPayActivity.lambda$showGuideDialog$0(i);
        if (i4 == 0) {
            throw null;
        }
        int i5 = equals + 35;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void $r8$lambda$vVUXjy6U2ZGhvyaax_5ywEuXoRk(View view) {
        int i = 2 % 2;
        int i2 = component4 + 13;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m10963instrumented$0$initView$V(view);
        int i4 = component4 + 31;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
    }

    static void m10961$$Nest$mshowGuideDialog(ScanAndPayActivity scanAndPayActivity) {
        int i = 2 % 2;
        int i2 = component4 + 81;
        equals = i2 % 128;
        int i3 = i2 % 2;
        scanAndPayActivity.showGuideDialog();
        int i4 = equals + 117;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
    }

    static void m10962$$Nest$mshowRequestPermissionDialog(ScanAndPayActivity scanAndPayActivity) {
        int i = 2 % 2;
        int i2 = component4 + 27;
        equals = i2 % 128;
        int i3 = i2 % 2;
        scanAndPayActivity.showRequestPermissionDialog();
        int i4 = equals + 47;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void m10963instrumented$0$initView$V(View view) {
        int i = 2 % 2;
        int i2 = component4 + 7;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                lambda$initView$3(view);
                Callback.onClick_exit();
            } else {
                lambda$initView$3(view);
                Callback.onClick_exit();
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10964instrumented$1$showRequestPermissionDialog$V(ScanAndPayActivity scanAndPayActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 5;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                scanAndPayActivity.lambda$showRequestPermissionDialog$2(view);
                Callback.onClick_exit();
                int i4 = 26 / 0;
            } else {
                scanAndPayActivity.lambda$showRequestPermissionDialog$2(view);
                Callback.onClick_exit();
            }
            int i5 = equals + 123;
            component4 = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = component4 + 89;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component4 + 59;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = equals + 51;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        getAsAtTimestamp = 0;
        component2();
        copydefault = -890926548;
        int i = copy + 39;
        getAsAtTimestamp = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void component2() {
        component3 = -3780477796495014671L;
        component1 = 1386857713;
        ShareDataUIState = (char) 59553;
        component2 = 1242314440313148480L;
    }
}
