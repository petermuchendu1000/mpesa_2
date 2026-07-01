package com.huawei.digitalpayment.checkout.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.Html;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.CollectionUtils;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.ConvertUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.listener.FilterFastClickListener;
import com.huawei.common.util.SPUtils;
import com.huawei.common.widget.recyclerview.RecycleViewDivider;
import com.huawei.digitalpayment.checkout.model.entity.EventRefreshBalance;
import com.huawei.digitalpayment.checkout.model.entity.HomeDynamicMenu;
import com.huawei.digitalpayment.checkout.model.request.QueryAsyncRequest;
import com.huawei.digitalpayment.checkout.model.response.TransferResp;
import com.huawei.digitalpayment.checkout.utils.SuccessReceiptSaveUtils;
import com.huawei.digitalpayment.checkout.viewmodel.PayResultViewModel;
import com.huawei.digitalpayment.checkoutUi.R;
import com.huawei.digitalpayment.checkoutUi.databinding.ActivitySuccessCommonBinding;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.util.TimeUtils;
import com.huawei.digitalpayment.consumer.service.IProfileService;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.mpesa.logging.L;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;
import kotlin.notify;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

public class PayResultActivity extends Hilt_PayResultActivity<ActivitySuccessCommonBinding, PayResultViewModel> {
    public static final String CANCELED = "Canceled";
    public static final String CANCELLED = "Cancelled";
    public static final String KEY_TIME = "TransactionTime";
    public static final String PROCESSING = "Processing";
    public static final int QUERY_ORDER = 1;
    public static final String SUCCESS = "Success";
    private static char[] ShareDataUIState;
    private static final int[] TIME_ARRAY;
    private static boolean component1;
    private static long component2;
    private static boolean component3;
    private static int copydefault;
    private static int equals;
    boolean isJustFinishSuccessPage;
    private TransferResp mTransferResp;
    private static final byte[] $$l = {113, 66, TarHeader.LF_CHR, 67};
    private static final int $$o = 235;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {TarHeader.LF_SYMLINK, 44, -54, Ascii.EM, 13, -1, -62, 71, -17, 20, -5, 0, 2, -1, 3, -64, 73, -12, -3, 19, -6, -14, 7, -1, Ascii.SO, -13, Ascii.FF, 6, 0, -9, 6, -9, 6, -5, -1, 20, -4, 4, -67, 37, -45, 73, -10, Ascii.EM, -9, 7, 0, 13, 2, 10, -20, 2, 2, -4, Ascii.NAK, -8, 9, 13, -1, 4, 0, 0, -8, 10, 7, -64, 5, 6, -7, -2, 6, Ascii.VT, -73, TarHeader.LF_FIFO, 13, 4, -2, 7, 0, -10, 6, -8, Ascii.SI, PSSSigner.TRAILER_IMPLICIT, TarHeader.LF_FIFO, 6, -6, Ascii.SO, 1, -8, 8, 8, PSSSigner.TRAILER_IMPLICIT, 35, 35, -2, -10, Ascii.DC2, -17, 3, Ascii.SO, -30, 17, 13, 2, -10, -64, 33, 34, 2, -4, Ascii.NAK, -8, 9, -42, 37, 4, -3, 8, 13, -1, 4, 0, 0, -8, 10, 7, -65};
    private static final int $$k = 221;
    private static final byte[] $$d = {57, 126, 65, 8, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 29;
    private static int copy = 1;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private int startIndex = 0;
    private Handler handler = new Handler(Looper.getMainLooper());
    private final Runnable runnable = new Runnable() {
        private static int component1 = 1;
        private static int copydefault;

        @Override
        public void run() {
            int i = 2 % 2;
            int i2 = component1 + 43;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            PayResultActivity.m10084$$Nest$mqueryTransDetails(PayResultActivity.this);
            int i4 = copydefault + 11;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(byte r6, byte r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.$$l
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r8 = 105 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L27
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r6 = r6 + 1
            r3 = r0[r6]
        L27:
            int r8 = r8 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.$$r(byte, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = 103 - r8
            byte[] r0 = com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.$$d
            int r1 = r6 + 4
            int r7 = 100 - r7
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + (-8)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.h(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = 54 - r8
            int r6 = r6 * 8
            int r6 = 107 - r6
            byte[] r1 = com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.$$j
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r8 = 53 - r8
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L2a:
            int r7 = r7 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.i(byte, byte, byte, java.lang.Object[]):void");
    }

    static {
        equals = 0;
        copydefault();
        TIME_ARRAY = new int[]{2, 2, 2, 2, 2, 4, 4, 4, 4, 4, 6, 6, 6, 6, 6};
        int i = copy + 55;
        equals = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void g(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        int i3 = $11 + 53;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (notifyVar.copydefault < cArr.length) {
            int i5 = $11 + 43;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3266 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33, (char) (60268 - Drawable.resolveOpacity(0, 0)), -834797019, false, $$r(b2, b3, (byte) (b3 + 3)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component2 % 5431355972723572778L);
                    try {
                        Object[] objArr3 = {notifyVar, notifyVar};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 686, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 34, (char) (TextUtils.lastIndexOf("", '0', 0) + 60374), -1969106284, false, $$r(b4, b5, b5), new Class[]{Object.class, Object.class});
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
            } else {
                int i7 = notifyVar.copydefault;
                Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3266, 33 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 60268), -834797019, false, $$r(b6, b7, (byte) (b7 + 3)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (component2 ^ 5431355972723572778L);
                Object[] objArr5 = {notifyVar, notifyVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 687, Color.red(0) + 34, (char) (60373 - View.combineMeasuredStates(0, 0)), -1969106284, false, $$r(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i8 = $10 + 57;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr6 = {notifyVar, notifyVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(687 - (KeyEvent.getMaxKeyCode() >> 16), TextUtils.getTrimmedLength("") + 34, (char) (Process.getGidForName("") + 60374), -1969106284, false, $$r(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    private static void f(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = ShareDataUIState;
        long j = 0;
        int i4 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 83;
                $11 = i6 % 128;
                if (i6 % i2 == 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i4] = Integer.valueOf(cArr2[i5]);
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault == null) {
                            byte b2 = (byte) i4;
                            byte b3 = b2;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3760 - ExpandableListView.getPackedPositionType(j), 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) TextUtils.indexOf("", "", i4, i4), -1670574543, false, $$r(b2, b3, (byte) (b3 | 37)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 3760, 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (ViewConfiguration.getTapTimeout() >> 16), -1670574543, false, $$r(b4, b5, (byte) (b5 | 37)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i5++;
                }
                i2 = 2;
                j = 0;
                i4 = 0;
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(copydefault)};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            float f = 0.0f;
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7140 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 14 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
            if (component1) {
                cancelVar.component1 = bArr.length;
                char[] cArr4 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (Process.myPid() >> 22), 19 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 7644), -327556343, false, $$r(b6, b7, (byte) (b7 | 32)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (component3) {
                cancelVar.component1 = cArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    Object[] objArr6 = {cancelVar, cancelVar};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault5 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2747, (ViewConfiguration.getJumpTapTimeout() >> 16) + 19, (char) (7645 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1))), -327556343, false, $$r(b8, b9, (byte) (b9 | 32)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault5).invoke(null, objArr6);
                    f = 0.0f;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i7 = 0;
            cancelVar.component1 = iArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            while (true) {
                cancelVar.component3 = i7;
                if (cancelVar.component3 >= cancelVar.component1) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i8 = $10 + 103;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                i7 = cancelVar.component3 + 1;
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0075  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 73;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.layout.activity_success_common;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = R.layout.activity_success_common;
        int i5 = getAsAtTimestamp + 21;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r1
  0x002d: PHI (r1v6 java.io.Serializable) = (r1v5 java.io.Serializable), (r1v25 java.io.Serializable) binds: [B:8:0x002b, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void initData() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getAsAtTimestamp
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "transferResp"
            if (r1 != 0) goto L21
            android.content.Intent r1 = r5.getIntent()
            java.io.Serializable r1 = r1.getSerializableExtra(r3)
            boolean r3 = r1 instanceof com.huawei.digitalpayment.checkout.model.response.TransferResp
            r4 = 86
            int r4 = r4 / r2
            if (r3 == 0) goto L3a
            goto L2d
        L21:
            android.content.Intent r1 = r5.getIntent()
            java.io.Serializable r1 = r1.getSerializableExtra(r3)
            boolean r3 = r1 instanceof com.huawei.digitalpayment.checkout.model.response.TransferResp
            if (r3 == 0) goto L3a
        L2d:
            com.huawei.digitalpayment.checkout.model.response.TransferResp r1 = (com.huawei.digitalpayment.checkout.model.response.TransferResp) r1
            r5.mTransferResp = r1
            int r1 = com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getAsAtTimestamp
            int r1 = r1 + 83
            int r3 = r1 % 128
            com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getRequestBeneficiariesState = r3
            int r1 = r1 % r0
        L3a:
            com.huawei.digitalpayment.checkout.model.response.TransferResp r1 = r5.mTransferResp
            if (r1 != 0) goto L54
            int r1 = com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getRequestBeneficiariesState
            int r1 = r1 + 39
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getAsAtTimestamp = r2
            int r1 = r1 % r0
            r5.finish()
            int r1 = com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getRequestBeneficiariesState
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getAsAtTimestamp = r2
            int r1 = r1 % r0
            return
        L54:
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "isJustFinishSuccessPage"
            boolean r0 = r0.getBooleanExtra(r1, r2)
            r5.isJustFinishSuccessPage = r0
            r5.initObserver()
            r5.setData()
            com.huawei.digitalpayment.checkout.model.request.QueryBannerRequest r0 = new com.huawei.digitalpayment.checkout.model.request.QueryBannerRequest
            r0.<init>()
            java.lang.String r1 = "PAY_SUCCESS_BANNER"
            r0.setBannerType(r1)
            com.huawei.common.util.SPUtils r1 = com.huawei.common.util.SPUtils.getInstance()
            java.lang.String r2 = "recent_login_phone_number"
            java.lang.String r1 = r1.getString(r2)
            r0.setInitiatorMsisdn(r1)
            VM extends androidx.lifecycle.ViewModel r1 = r5.viewModel
            com.huawei.digitalpayment.checkout.viewmodel.PayResultViewModel r1 = (com.huawei.digitalpayment.checkout.viewmodel.PayResultViewModel) r1
            r1.queryBanners(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.initData():void");
    }

    private int getTime() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 51;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        int[] iArr = TIME_ARRAY;
        int i5 = this.startIndex;
        int i6 = iArr[i5];
        this.startIndex = i5 + 1;
        int i7 = i6 * 1000;
        int i8 = i2 + 41;
        getAsAtTimestamp = i8 % 128;
        if (i8 % 2 == 0) {
            return i7;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void sendPostDelayed() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 33;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        if (this.startIndex < TIME_ARRAY.length) {
            L.INSTANCE.i("query time" + this.startIndex, new Object[0]);
            this.handler.postDelayed(this.runnable, (long) getTime());
            return;
        }
        int i5 = i3 + 59;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    private void setData() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 93;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            updataUi(this.mTransferResp);
            int i3 = 68 / 0;
            if (!this.mTransferResp.isPollFlag()) {
                return;
            }
        } else {
            updataUi(this.mTransferResp);
            if (!this.mTransferResp.isPollFlag()) {
                return;
            }
        }
        sendPostDelayed();
        int i4 = getRequestBeneficiariesState + 71;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    private void queryTransDetails() {
        int i = 2 % 2;
        QueryAsyncRequest queryAsyncRequest = new QueryAsyncRequest();
        queryAsyncRequest.setOrderId(this.mTransferResp.getOrderId());
        ((PayResultViewModel) this.viewModel).queryAsyncTransDetails(queryAsyncRequest);
        int i2 = getAsAtTimestamp + 77;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void updataUi(TransferResp transferResp) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 49;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (transferResp != null) {
            int i4 = i2 + 69;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            setSuccessResult(transferResp);
        }
    }

    private void lambda$setSuccessResult$0(TransferResp transferResp, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 33;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        SuccessReceiptSaveUtils.checkPermission(this, transferResp);
        int i4 = getRequestBeneficiariesState + 107;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void lambda$setSuccessResult$1(android.view.View r3) {
        /*
            r2 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getAsAtTimestamp
            int r0 = r0 + 37
            int r1 = r0 % 128
            com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getRequestBeneficiariesState = r1
            int r0 = r0 % r3
            if (r0 != 0) goto L17
            boolean r0 = r2.isJustFinishSuccessPage
            r1 = 20
            int r1 = r1 / 0
            if (r0 != 0) goto L2d
            goto L1b
        L17:
            boolean r0 = r2.isJustFinishSuccessPage
            if (r0 != 0) goto L2d
        L1b:
            java.lang.String r0 = "/mainModule/main"
            com.huawei.arouter.RouteUtils.routeWithExecute(r0)
            int r0 = com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getAsAtTimestamp
            int r0 = r0 + 45
            int r1 = r0 % 128
            com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getRequestBeneficiariesState = r1
            int r0 = r0 % r3
            if (r0 != 0) goto L2d
            int r0 = r3 % 5
        L2d:
            r2.finish()
            int r0 = com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getAsAtTimestamp
            int r0 = r0 + 125
            int r1 = r0 % 128
            com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getRequestBeneficiariesState = r1
            int r0 = r0 % r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.lambda$setSuccessResult$1(android.view.View):void");
    }

    private void setSuccessResult(final TransferResp transferResp) {
        int i = 2 % 2;
        if (!TextUtils.isEmpty(transferResp.getActualAmountDisplay())) {
            ((ActivitySuccessCommonBinding) this.binding).amountDisplayView.setVisibility(0);
            ((ActivitySuccessCommonBinding) this.binding).amountDisplayView.getAmountView().setText(Html.fromHtml(transferResp.getActualAmountDisplay()));
        }
        ((ActivitySuccessCommonBinding) this.binding).amountDisplayView.setUnit(transferResp.getUnit());
        if (TextUtils.isEmpty(transferResp.getTitle())) {
            ((ActivitySuccessCommonBinding) this.binding).tvSubtitle.setVisibility(8);
        } else {
            int i2 = getRequestBeneficiariesState + 53;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            ((ActivitySuccessCommonBinding) this.binding).tvSubtitle.setText(transferResp.getTitle());
        }
        if (transferResp.isExportImage()) {
            ((ActivitySuccessCommonBinding) this.binding).llBottom.setVisibility(0);
            ((ActivitySuccessCommonBinding) this.binding).btnSaveReceipt.setVisibility(0);
            ((ActivitySuccessCommonBinding) this.binding).btnOk.setVisibility(8);
            ((ActivitySuccessCommonBinding) this.binding).btnSaveReceipt.setOnClickListener(new View.OnClickListener() {
                private static int component3 = 0;
                private static int copydefault = 1;

                @Override
                public final void onClick(View view) {
                    int i4 = 2 % 2;
                    int i5 = component3 + 29;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                    PayResultActivity.m10083$r8$lambda$2_L5035SCqVYzEmGf70oGcBydo(this.f$0, transferResp, view);
                    int i7 = component3 + 95;
                    copydefault = i7 % 128;
                    if (i7 % 2 == 0) {
                        throw null;
                    }
                }
            });
        } else {
            ((ActivitySuccessCommonBinding) this.binding).btnOk.setVisibility(0);
            ((ActivitySuccessCommonBinding) this.binding).btnOk.setOnClickListener(new View.OnClickListener() {
                private static int ShareDataUIState = 0;
                private static int component2 = 1;

                @Override
                public final void onClick(View view) {
                    int i4 = 2 % 2;
                    int i5 = ShareDataUIState + 111;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    PayResultActivity.$r8$lambda$OrsNQddqSFyzXlMRNPiFg2Z6rIQ(this.f$0, view);
                    int i7 = component2 + 53;
                    ShareDataUIState = i7 % 128;
                    int i8 = i7 % 2;
                }
            });
            ((ActivitySuccessCommonBinding) this.binding).llBottom.setVisibility(8);
            int i4 = getRequestBeneficiariesState + 7;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }
        setStatus(transferResp);
        setDisplayItem(transferResp);
        setGroupCollection(transferResp);
        EventBus.getDefault().postSticky(new EventRefreshBalance());
    }

    private void setGroupCollection(final TransferResp transferResp) {
        int i = 2 % 2;
        if (!TextUtils.isEmpty(transferResp.getBillShareButtonText())) {
            ((ActivitySuccessCommonBinding) this.binding).llGroup.setVisibility(0);
            ((ActivitySuccessCommonBinding) this.binding).tvGroup.setText(transferResp.getBillShareButtonText());
            ((ActivitySuccessCommonBinding) this.binding).llGroup.setOnClickListener(new FilterFastClickListener() {
                private static int component1 = 1;
                private static int component3;

                @Override
                public void onFilterClick(View view) {
                    int i2 = 2 % 2;
                    int i3 = component3 + 91;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    PayResultActivity.m10085$$Nest$mtoBillShare(PayResultActivity.this, transferResp);
                    int i5 = component1 + 93;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                }
            });
            int i2 = getRequestBeneficiariesState + 41;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = getRequestBeneficiariesState + 83;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            ((ActivitySuccessCommonBinding) this.binding).llGroup.setVisibility(8);
        }
        int i6 = getRequestBeneficiariesState + 97;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
    }

    private void toBillShare(TransferResp transferResp) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 73;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            String userProfile = ((IProfileService) RouteUtils.getService(IProfileService.class)).getUserProfile();
            if (TextUtils.isEmpty(userProfile)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(userProfile);
                String strOptString = jSONObject.optString("identityId");
                String strOptString2 = jSONObject.optString("name");
                String strOptString3 = jSONObject.optString("avatar");
                Bundle bundle = new Bundle(4);
                bundle.putString("payeeConsumerId", strOptString);
                bundle.putString("payeePhone", SPUtils.getInstance().getString("recent_login_phone_number"));
                bundle.putString("payeeName", strOptString2);
                bundle.putString("payeeAvatar", strOptString3);
                RouteUtils.routeWithExecute(transferResp.getBillShareButtonUrl(), bundle);
                return;
            } catch (JSONException e) {
                if (e.getMessage() != null) {
                    L.INSTANCE.e(e.getMessage(), new Object[0]);
                    int i3 = getRequestBeneficiariesState + 93;
                    getAsAtTimestamp = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
                return;
            }
        }
        TextUtils.isEmpty(((IProfileService) RouteUtils.getService(IProfileService.class)).getUserProfile());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void initView() {
        int i = 2 % 2;
        ((ActivitySuccessCommonBinding) this.binding).btnConfirm.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component1 + 55;
                component3 = i3 % 128;
                try {
                    if (i3 % 2 != 0) {
                        Callback.onClick_enter(view);
                        boolean z = PayResultActivity.this.isJustFinishSuccessPage;
                        throw null;
                    }
                    Callback.onClick_enter(view);
                    if (!PayResultActivity.this.isJustFinishSuccessPage) {
                        int i4 = component1 + 93;
                        component3 = i4 % 128;
                        int i5 = i4 % 2;
                        RouteUtils.routeWithExecute(RoutePathConstants.MAIN);
                        int i6 = component1 + 91;
                        component3 = i6 % 128;
                        int i7 = i6 % 2;
                    }
                    PayResultActivity.this.finish();
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
        int i2 = getRequestBeneficiariesState + 101;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setStatus(com.huawei.digitalpayment.checkout.model.response.TransferResp r5) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.setStatus(com.huawei.digitalpayment.checkout.model.response.TransferResp):void");
    }

    private void setDisplayItem(TransferResp transferResp) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 107;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        if (!CollectionUtils.isEmpty(transferResp.getDisplayItems())) {
            ((ActivitySuccessCommonBinding) this.binding).rvOtherInfo.addItemDecoration(new RecycleViewDivider(ColorUtils.getColor(R.color.color_divide_line), ConvertUtils.dp2px(0.5f)));
            ((ActivitySuccessCommonBinding) this.binding).rvOtherInfo.setAdapter(new BaseQuickAdapter<TransferResp.DisplayItemBean, BaseViewHolder>(this, R.layout.item_common_success, transferResp.getDisplayItems()) {
                private static int component3 = 0;
                private static int copydefault = 1;

                @Override
                public void convert(BaseViewHolder baseViewHolder, TransferResp.DisplayItemBean displayItemBean) {
                    int i4 = 2 % 2;
                    int i5 = component3 + 13;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                    component1(baseViewHolder, displayItemBean);
                    if (i6 == 0) {
                        int i7 = 51 / 0;
                    }
                    int i8 = copydefault + 97;
                    component3 = i8 % 128;
                    if (i8 % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                protected void component1(BaseViewHolder baseViewHolder, TransferResp.DisplayItemBean displayItemBean) {
                    int i4 = 2 % 2;
                    int i5 = component3 + 27;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                    if (PayResultActivity.KEY_TIME.equals(displayItemBean.getKey())) {
                        int i7 = component3 + 15;
                        copydefault = i7 % 128;
                        if (i7 % 2 != 0) {
                            displayItemBean.setValue(TimeUtils.formatTimeTodayHms(displayItemBean.getValue()));
                        } else {
                            displayItemBean.setValue(TimeUtils.formatTimeTodayHms(displayItemBean.getValue()));
                            throw null;
                        }
                    }
                    baseViewHolder.setText(R.id.tv_label, displayItemBean.getLabel()).setText(R.id.tv_value, Html.fromHtml(displayItemBean.getValue()));
                }
            });
        } else {
            int i4 = getAsAtTimestamp + 51;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                ((ActivitySuccessCommonBinding) this.binding).clOtherInfo.setVisibility(107);
            } else {
                ((ActivitySuccessCommonBinding) this.binding).clOtherInfo.setVisibility(8);
            }
        }
    }

    private void lambda$initObserver$2(List list) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 33;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        if (!CollectionUtils.isEmpty(list)) {
            setBanners(list);
            return;
        }
        int i4 = getRequestBeneficiariesState + 85;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    private void initObserver() {
        int i = 2 % 2;
        ((PayResultViewModel) this.viewModel).getQueryBannerRespMutableLiveData().observe(this, new Observer() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 103;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                PayResultActivity.$r8$lambda$0CpLkp5AVPkDjUJbify1sxFMh08(this.f$0, (List) obj);
                int i5 = component3 + 33;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((PayResultViewModel) this.viewModel).getQueryAsyncLiveData().observe(this, new Observer() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 83;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    PayResultActivity.$r8$lambda$7NQHoFT8GHS1blAtpwzBwE9MFjY(this.f$0, (Resource) obj);
                    throw null;
                }
                PayResultActivity.$r8$lambda$7NQHoFT8GHS1blAtpwzBwE9MFjY(this.f$0, (Resource) obj);
                int i4 = component1 + 107;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = getAsAtTimestamp + 27;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 25 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if ("Cancelled".equals(r1.getOrderStatus()) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if ("Cancelled".equals(r1.getOrderStatus()) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        sendPostDelayed();
        r5 = com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getAsAtTimestamp + 71;
        com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getRequestBeneficiariesState = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if ((r5 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void lambda$initObserver$3(com.huawei.payment.mvvm.Resource r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r5.success()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r5.getData()
            com.huawei.digitalpayment.checkout.model.response.TransferResp r1 = (com.huawei.digitalpayment.checkout.model.response.TransferResp) r1
            java.lang.String r2 = "Success"
            java.lang.String r3 = r1.getOrderStatus()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L61
            java.lang.String r2 = "Canceled"
            java.lang.String r3 = r1.getOrderStatus()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L61
            int r2 = com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getAsAtTimestamp
            int r2 = r2 + 35
            int r3 = r2 % 128
            com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getRequestBeneficiariesState = r3
            int r2 = r2 % r0
            java.lang.String r3 = "Cancelled"
            if (r2 != 0) goto L43
            java.lang.String r2 = r1.getOrderStatus()
            boolean r2 = r3.equals(r2)
            r3 = 79
            int r3 = r3 / 0
            if (r2 != 0) goto L61
            goto L4d
        L43:
            java.lang.String r2 = r1.getOrderStatus()
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L61
        L4d:
            r4.sendPostDelayed()
            int r5 = com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getAsAtTimestamp
            int r5 = r5 + 71
            int r1 = r5 % 128
            com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getRequestBeneficiariesState = r1
            int r5 = r5 % r0
            if (r5 == 0) goto L5c
            return
        L5c:
            r5 = 0
            r5.hashCode()
            throw r5
        L61:
            r4.updataUi(r1)
        L64:
            boolean r5 = r5.error()
            if (r5 == 0) goto L6d
            r4.sendPostDelayed()
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.lambda$initObserver$3(com.huawei.payment.mvvm.Resource):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setBanners(java.util.List<com.huawei.digitalpayment.checkout.model.entity.HomeDynamicMenu.DynamicItemBean> r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getAsAtTimestamp
            int r1 = r1 + 101
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L14
            r1 = 7
            int r1 = r1 / r2
            if (r4 == 0) goto L30
            goto L16
        L14:
            if (r4 == 0) goto L30
        L16:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L26
            int r1 = com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getRequestBeneficiariesState
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getAsAtTimestamp = r2
            int r1 = r1 % r0
            goto L30
        L26:
            Binding extends androidx.databinding.ViewDataBinding r0 = r3.binding
            com.huawei.digitalpayment.checkoutUi.databinding.ActivitySuccessCommonBinding r0 = (com.huawei.digitalpayment.checkoutUi.databinding.ActivitySuccessCommonBinding) r0
            com.huawei.digitalpayment.checkout.ui.view.banner.CycleViewPager r0 = r0.cycleView
            r0.setVisibility(r2)
            goto L3b
        L30:
            Binding extends androidx.databinding.ViewDataBinding r0 = r3.binding
            com.huawei.digitalpayment.checkoutUi.databinding.ActivitySuccessCommonBinding r0 = (com.huawei.digitalpayment.checkoutUi.databinding.ActivitySuccessCommonBinding) r0
            com.huawei.digitalpayment.checkout.ui.view.banner.CycleViewPager r0 = r0.cycleView
            r1 = 8
            r0.setVisibility(r1)
        L3b:
            Binding extends androidx.databinding.ViewDataBinding r0 = r3.binding
            com.huawei.digitalpayment.checkoutUi.databinding.ActivitySuccessCommonBinding r0 = (com.huawei.digitalpayment.checkoutUi.databinding.ActivitySuccessCommonBinding) r0
            com.huawei.digitalpayment.checkout.ui.view.banner.CycleViewPager r0 = r0.cycleView
            com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity$$ExternalSyntheticLambda2 r1 = new com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity$$ExternalSyntheticLambda2
            r1.<init>()
            r0.setData(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.setBanners(java.util.List):void");
    }

    private void lambda$setBanners$4(HomeDynamicMenu.DynamicItemBean dynamicItemBean, int i, View view) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 125;
        getAsAtTimestamp = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            if (!TextUtils.isEmpty(dynamicItemBean.getExecute())) {
                int i4 = getRequestBeneficiariesState + 83;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
                RouteUtils.routeWithExecute(this, dynamicItemBean.getExecute());
                if (i5 != 0) {
                    obj.hashCode();
                    throw null;
                }
            }
            int i6 = getRequestBeneficiariesState + 17;
            getAsAtTimestamp = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        TextUtils.isEmpty(dynamicItemBean.getExecute());
        obj.hashCode();
        throw null;
    }

    @Override
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        Handler handler = this.handler;
        if (handler != null) {
            int i2 = getRequestBeneficiariesState + 85;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                handler.removeCallbacks(this.runnable);
                this.handler = null;
                throw null;
            }
            handler.removeCallbacks(this.runnable);
            this.handler = null;
        }
        int i3 = getAsAtTimestamp + 15;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 83;
        getAsAtTimestamp = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.onBackPressed();
            RouteUtils.routeWithExecute(RoutePathConstants.MAIN);
            int i3 = getRequestBeneficiariesState + 63;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        super.onBackPressed();
        RouteUtils.routeWithExecute(RoutePathConstants.MAIN);
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 23;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = getAsAtTimestamp + 119;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            g(TextUtils.indexOf((CharSequence) "", '0') + 14388, new char[]{64376, 49988, 35611, 21490, 7098, 58255, 43599, 29266, 15072, 674, 51863, 37126, 22844, 8685, 59815, 45453, 30815, 16403, 2299, 53417, 39089, 26462, 12041, 63465, 49072, 34694}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 26918, new char[]{64378, 37423, 10733, 49314, 24176, 62776, 36095, 7053, 45425, 18482, 59371, 32401, 5214, 41759, 15047, 53661, 28486, 1540}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i6 = getRequestBeneficiariesState + 121;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6617 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 41 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - Color.blue(0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 56, (char) TextUtils.indexOf("", ""), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i8 = getAsAtTimestamp + 17;
                getRequestBeneficiariesState = i8 % 128;
                int i9 = i8 % 2;
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

    /* JADX WARN: Can't wrap try/catch for region: R(85:0|2|(2:4|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|779|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0))(0)|31|813|32|(10:799|34|38|39|810|(5:41|42|(1:44)|45|46)(22:47|48|787|49|(2:833|51)|55|56|768|57|(3:59|783|60)|64|65|66|(1:68)|69|70|764|71|(2:756|73)|74|(1:76)|77)|78|(4:81|(2:83|846)(11:84|(3:86|(4:89|90|91|87)|847)|94|837|95|(1:97)|98|99|826|100|845)|101|79)|844|113)(8:38|39|810|(0)(0)|78|(1:79)|844|113)|144|777|145|(3:147|817|148)|152|153|(5:155|156|(1:158)|159|160)(17:162|163|770|164|165|758|166|(1:168)|169|170|171|(1:173)|174|(1:176)|177|(1:179)|180)|161|181|(9:184|835|185|(1:187)|188|189|190|823|191)|225|(6:839|226|(1:228)|229|(1:231)|232)|(3:234|(1:236)|237)(7:238|(2:240|(1:246)(1:245))(1:247)|(18:249|819|250|(1:252)|253|254|802|255|(1:257)|258|259|260|(1:262)|263|(1:265)(1:266)|267|(1:269)|270)(61:313|(4:328|782|329|(1:335)(1:334))(1:339)|340|811|341|(1:343)|344|797|345|(1:347)|348|372|825|373|(1:375)|376|377|(4:379|380|(1:382)|383)(19:384|385|808|386|(1:388)|389|390|793|391|(1:393)|394|395|396|(1:398)|399|(1:401)(1:402)|403|(1:405)|406)|407|(4:410|(2:412|854)(11:413|(3:415|(4:418|419|420|416)|855)|421|780|422|(1:424)|425|426|762|427|853)|428|408)|852|462|(1:464)|465|(1:467)|468|(3:470|(1:472)|473)(16:475|476|(1:478)|479|(1:481)|482|483|(1:485)|486|815|487|488|(1:490)|491|(1:493)|494)|474|495|(1:497)(9:498|(3:500|(4:503|(3:866|505|869)(3:865|506|868)|867|501)|864)|507|508|(1:510)|511|(1:513)|514|515)|516|(1:518)|519|(3:521|(1:523)|524)(14:525|526|(1:528)|529|530|(1:532)|533|830|534|535|(1:537)|538|(1:540)|541)|542|(1:544)(9:545|(3:547|(2:550|548)|863)|551|552|(1:554)(1:555)|556|(1:558)|559|560)|561|832|562|(1:564)|565|(1:567)|568|(3:570|(1:572)|573)(17:575|(3:577|578|(1:584)(1:583))|(19:586|587|821|588|(1:590)|591|592|804|593|(1:595)|596|597|598|(1:600)|601|(1:603)|604|(1:606)|607)|662|(1:664)|665|(3:667|(1:669)|670)(13:672|795|673|674|(1:676)|677|760|678|679|(1:681)|682|(1:684)|685)|671|686|(6:689|690|(1:692)|693|694|695)|696|(1:698)|699|(3:701|(1:703)|704)(14:706|707|(1:709)|710|711|(1:713)|714|771|715|716|(1:718)|719|(1:721)|722)|705|723|(1:870)(7:726|727|(1:729)|730|731|732|733))|608|(4:611|(3:858|613|861)(12:857|614|(3:616|(3:619|620|617)|862)|621|789|622|(1:624)|625|626|773|627|860)|859|609)|856|662|(0)|665|(0)(0)|671|686|(0)|696|(0)|699|(0)(0)|705|723|(0)(0))|29|30|752|(1:754)(1:755))|271|(4:274|(2:276|850)(11:277|(3:279|(3:282|283|280)|851)|284|791|285|(1:287)|288|289|775|290|849)|291|272)|848|313|(0)(0)|340|811|341|(0)|344|797|345|(0)|348|372|825|373|(0)|376|377|(0)(0)|407|(1:408)|852|462|(0)|465|(0)|468|(0)(0)|474|495|(0)(0)|516|(0)|519|(0)(0)|542|(0)(0)|561|832|562|(0)|565|(0)|568|(0)(0)|608|(1:609)|856|662|(0)|665|(0)(0)|671|686|(0)|696|(0)|699|(0)(0)|705|723|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x1a10, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x1a11, code lost:
    
        r6 = new java.lang.Object[1];
        f(((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 98, new byte[]{-113, -109, -102, -108, -106, -109, -102, -104, -102, -108, -104}, null, null, r6);
        r3 = (java.lang.String) r6[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x1a48, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x1a5f, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x1a63, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r11 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r11 - ((r11 >> 63) << 32)));
        r11 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r11 - ((r11 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x1a92, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x1a96, code lost:
    
        if (r5 == null) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x1a98, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - android.graphics.Color.argb(0, 0, 0, 0), android.view.View.MeasureSpec.getSize(0) + 42, (char) android.text.TextUtils.indexOf("", "", 0, 0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x1abc, code lost:
    
        r5 = ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x1ac4, code lost:
    
        r8 = new java.lang.Object[]{-891192555, java.lang.Long.valueOf(r3), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6562 - android.text.TextUtils.indexOf("", ""), android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 57, (char) android.view.KeyEvent.normalizeMetaState(0));
        r3 = com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.$$j[88];
        r10 = new java.lang.Object[1];
        i(r3, (byte) (r3 | com.alibaba.ariver.resource.parser.tar.TarHeader.LF_BLK), r2[1], r10);
        r1.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r5, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x2c58, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x2c59, code lost:
    
        r5 = new java.lang.Object[1];
        g(((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954659_res_0x7f130be3).substring(6, 9).codePointAt(2) + 55259, new char[]{64301, 11472, 21718, 31964, 42188, 52424, 62668, 7414, 17656, 27900}, r5);
        r3 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x2ca1, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x2cb8, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x2cbc, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r14 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r14 - ((r14 >> 63) << 32)));
        r14 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r14 - ((r14 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x2ceb, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x2cef, code lost:
    
        if (r5 == null) goto L658;
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x2cf1, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.graphics.Color.red(0) + 6618, 42 - android.view.View.combineMeasuredStates(0, 0), (char) android.text.TextUtils.indexOf(r6, r6), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x2d16, code lost:
    
        r5 = ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x2d1d, code lost:
    
        r1 = com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getAsAtTimestamp + 89;
        com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.getRequestBeneficiariesState = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x2d28, code lost:
    
        r10 = new java.lang.Object[]{-891192555, java.lang.Long.valueOf(r3), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 6561, 56 - android.graphics.Color.green(0), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
        r3 = com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.$$j[88];
        r11 = new java.lang.Object[1];
        i(r3, (byte) (r3 | com.alibaba.ariver.resource.parser.tar.TarHeader.LF_BLK), r2[1], r11);
        r1.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r5, r10);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0816 A[Catch: all -> 0x0330, TryCatch #12 {all -> 0x0330, blocks: (B:138:0x0810, B:140:0x0816, B:141:0x083a, B:219:0x0cb6, B:221:0x0cbc, B:222:0x0ce9, B:690:0x3032, B:692:0x3038, B:693:0x3065, B:727:0x337f, B:729:0x3385, B:730:0x33ae, B:707:0x31b8, B:709:0x31db, B:710:0x3232, B:656:0x2ceb, B:658:0x2cf1, B:659:0x2d16, B:552:0x260b, B:554:0x2611, B:556:0x263e, B:558:0x2678, B:559:0x26c2, B:526:0x2342, B:528:0x2357, B:529:0x238a, B:508:0x2053, B:510:0x2059, B:511:0x2081, B:513:0x20bb, B:514:0x2108, B:476:0x1d05, B:478:0x1d1a, B:479:0x1d47, B:481:0x1d7b, B:482:0x1df1, B:456:0x1a92, B:458:0x1a98, B:459:0x1abc, B:366:0x153c, B:368:0x1542, B:369:0x156c, B:320:0x131e, B:322:0x1324, B:323:0x1353, B:19:0x0153, B:21:0x0159, B:22:0x0183, B:24:0x02a2, B:26:0x02d3, B:27:0x032a, B:329:0x13de, B:331:0x13e2, B:352:0x14c1, B:354:0x14c7, B:355:0x14c8, B:357:0x14ca, B:359:0x14d1, B:360:0x14d2, B:335:0x13ee, B:373:0x15ec, B:375:0x15f2, B:376:0x1637, B:380:0x1651, B:382:0x1657, B:383:0x169a, B:407:0x18c4, B:408:0x18c8, B:410:0x18ce, B:413:0x18e8, B:416:0x18f5, B:419:0x1902, B:431:0x19ea, B:433:0x19f0, B:434:0x19f1, B:436:0x19f3, B:438:0x19fa, B:439:0x19fb, B:384:0x16a5, B:396:0x17a0, B:398:0x17a6, B:399:0x17ea, B:401:0x1814, B:403:0x185d, B:405:0x1874, B:406:0x18bc, B:441:0x19fd, B:443:0x1a04, B:444:0x1a05, B:446:0x1a07, B:448:0x1a0e, B:449:0x1a0f, B:562:0x27b0, B:564:0x27b6, B:565:0x27fb, B:567:0x2822, B:568:0x286a, B:570:0x287d, B:572:0x2886, B:573:0x28ca, B:608:0x2b1a, B:609:0x2b1e, B:611:0x2b24, B:614:0x2b3c, B:617:0x2b49, B:619:0x2b4c, B:631:0x2c32, B:633:0x2c38, B:634:0x2c39, B:636:0x2c3b, B:638:0x2c42, B:639:0x2c43, B:578:0x28e3, B:580:0x28e7, B:584:0x28f3, B:586:0x28f9, B:598:0x2a0b, B:600:0x2a11, B:601:0x2a50, B:603:0x2a7a, B:604:0x2abb, B:606:0x2ad1, B:607:0x2b14, B:641:0x2c45, B:643:0x2c4c, B:644:0x2c4d, B:646:0x2c4f, B:648:0x2c56, B:649:0x2c57, B:226:0x0d6b, B:228:0x0d71, B:229:0x0db9, B:231:0x0de0, B:232:0x0e25, B:234:0x0e3b, B:236:0x0e44, B:237:0x0e8c, B:271:0x115a, B:272:0x115e, B:274:0x1166, B:277:0x1180, B:280:0x118c, B:282:0x118f, B:294:0x1272, B:296:0x1278, B:297:0x1279, B:299:0x127b, B:301:0x1282, B:302:0x1283, B:240:0x0e9f, B:242:0x0ea3, B:249:0x0eb7, B:260:0x1033, B:262:0x1039, B:263:0x1080, B:265:0x10aa, B:267:0x10f7, B:269:0x110e, B:270:0x1154, B:304:0x1285, B:306:0x128c, B:307:0x128d, B:309:0x128f, B:311:0x1296, B:312:0x1297, B:246:0x0eaf), top: B:779:0x0153, inners: #14, #37, #41, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0977 A[Catch: all -> 0x0c30, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x0c30, blocks: (B:145:0x08bc, B:152:0x0911, B:162:0x0977), top: B:777:0x08bc }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0b37  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0cbc A[Catch: all -> 0x0330, TryCatch #12 {all -> 0x0330, blocks: (B:138:0x0810, B:140:0x0816, B:141:0x083a, B:219:0x0cb6, B:221:0x0cbc, B:222:0x0ce9, B:690:0x3032, B:692:0x3038, B:693:0x3065, B:727:0x337f, B:729:0x3385, B:730:0x33ae, B:707:0x31b8, B:709:0x31db, B:710:0x3232, B:656:0x2ceb, B:658:0x2cf1, B:659:0x2d16, B:552:0x260b, B:554:0x2611, B:556:0x263e, B:558:0x2678, B:559:0x26c2, B:526:0x2342, B:528:0x2357, B:529:0x238a, B:508:0x2053, B:510:0x2059, B:511:0x2081, B:513:0x20bb, B:514:0x2108, B:476:0x1d05, B:478:0x1d1a, B:479:0x1d47, B:481:0x1d7b, B:482:0x1df1, B:456:0x1a92, B:458:0x1a98, B:459:0x1abc, B:366:0x153c, B:368:0x1542, B:369:0x156c, B:320:0x131e, B:322:0x1324, B:323:0x1353, B:19:0x0153, B:21:0x0159, B:22:0x0183, B:24:0x02a2, B:26:0x02d3, B:27:0x032a, B:329:0x13de, B:331:0x13e2, B:352:0x14c1, B:354:0x14c7, B:355:0x14c8, B:357:0x14ca, B:359:0x14d1, B:360:0x14d2, B:335:0x13ee, B:373:0x15ec, B:375:0x15f2, B:376:0x1637, B:380:0x1651, B:382:0x1657, B:383:0x169a, B:407:0x18c4, B:408:0x18c8, B:410:0x18ce, B:413:0x18e8, B:416:0x18f5, B:419:0x1902, B:431:0x19ea, B:433:0x19f0, B:434:0x19f1, B:436:0x19f3, B:438:0x19fa, B:439:0x19fb, B:384:0x16a5, B:396:0x17a0, B:398:0x17a6, B:399:0x17ea, B:401:0x1814, B:403:0x185d, B:405:0x1874, B:406:0x18bc, B:441:0x19fd, B:443:0x1a04, B:444:0x1a05, B:446:0x1a07, B:448:0x1a0e, B:449:0x1a0f, B:562:0x27b0, B:564:0x27b6, B:565:0x27fb, B:567:0x2822, B:568:0x286a, B:570:0x287d, B:572:0x2886, B:573:0x28ca, B:608:0x2b1a, B:609:0x2b1e, B:611:0x2b24, B:614:0x2b3c, B:617:0x2b49, B:619:0x2b4c, B:631:0x2c32, B:633:0x2c38, B:634:0x2c39, B:636:0x2c3b, B:638:0x2c42, B:639:0x2c43, B:578:0x28e3, B:580:0x28e7, B:584:0x28f3, B:586:0x28f9, B:598:0x2a0b, B:600:0x2a11, B:601:0x2a50, B:603:0x2a7a, B:604:0x2abb, B:606:0x2ad1, B:607:0x2b14, B:641:0x2c45, B:643:0x2c4c, B:644:0x2c4d, B:646:0x2c4f, B:648:0x2c56, B:649:0x2c57, B:226:0x0d6b, B:228:0x0d71, B:229:0x0db9, B:231:0x0de0, B:232:0x0e25, B:234:0x0e3b, B:236:0x0e44, B:237:0x0e8c, B:271:0x115a, B:272:0x115e, B:274:0x1166, B:277:0x1180, B:280:0x118c, B:282:0x118f, B:294:0x1272, B:296:0x1278, B:297:0x1279, B:299:0x127b, B:301:0x1282, B:302:0x1283, B:240:0x0e9f, B:242:0x0ea3, B:249:0x0eb7, B:260:0x1033, B:262:0x1039, B:263:0x1080, B:265:0x10aa, B:267:0x10f7, B:269:0x110e, B:270:0x1154, B:304:0x1285, B:306:0x128c, B:307:0x128d, B:309:0x128f, B:311:0x1296, B:312:0x1297, B:246:0x0eaf), top: B:779:0x0153, inners: #14, #37, #41, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0d71 A[Catch: all -> 0x129c, TryCatch #45 {all -> 0x129c, blocks: (B:226:0x0d6b, B:228:0x0d71, B:229:0x0db9, B:231:0x0de0, B:232:0x0e25, B:234:0x0e3b, B:236:0x0e44, B:237:0x0e8c, B:271:0x115a, B:272:0x115e, B:274:0x1166, B:277:0x1180, B:280:0x118c, B:282:0x118f, B:294:0x1272, B:296:0x1278, B:297:0x1279, B:299:0x127b, B:301:0x1282, B:302:0x1283, B:240:0x0e9f, B:242:0x0ea3, B:249:0x0eb7, B:260:0x1033, B:262:0x1039, B:263:0x1080, B:265:0x10aa, B:267:0x10f7, B:269:0x110e, B:270:0x1154, B:304:0x1285, B:306:0x128c, B:307:0x128d, B:309:0x128f, B:311:0x1296, B:312:0x1297, B:246:0x0eaf, B:290:0x11f6, B:285:0x11bd, B:287:0x11c3, B:288:0x11ee, B:255:0x0f88, B:257:0x0fac, B:258:0x1027, B:250:0x0f3e, B:252:0x0f52, B:253:0x0f81), top: B:839:0x0d6b, outer: #12, inners: #10, #19, #25, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0de0 A[Catch: all -> 0x129c, TryCatch #45 {all -> 0x129c, blocks: (B:226:0x0d6b, B:228:0x0d71, B:229:0x0db9, B:231:0x0de0, B:232:0x0e25, B:234:0x0e3b, B:236:0x0e44, B:237:0x0e8c, B:271:0x115a, B:272:0x115e, B:274:0x1166, B:277:0x1180, B:280:0x118c, B:282:0x118f, B:294:0x1272, B:296:0x1278, B:297:0x1279, B:299:0x127b, B:301:0x1282, B:302:0x1283, B:240:0x0e9f, B:242:0x0ea3, B:249:0x0eb7, B:260:0x1033, B:262:0x1039, B:263:0x1080, B:265:0x10aa, B:267:0x10f7, B:269:0x110e, B:270:0x1154, B:304:0x1285, B:306:0x128c, B:307:0x128d, B:309:0x128f, B:311:0x1296, B:312:0x1297, B:246:0x0eaf, B:290:0x11f6, B:285:0x11bd, B:287:0x11c3, B:288:0x11ee, B:255:0x0f88, B:257:0x0fac, B:258:0x1027, B:250:0x0f3e, B:252:0x0f52, B:253:0x0f81), top: B:839:0x0d6b, outer: #12, inners: #10, #19, #25, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0e3b A[Catch: all -> 0x129c, TryCatch #45 {all -> 0x129c, blocks: (B:226:0x0d6b, B:228:0x0d71, B:229:0x0db9, B:231:0x0de0, B:232:0x0e25, B:234:0x0e3b, B:236:0x0e44, B:237:0x0e8c, B:271:0x115a, B:272:0x115e, B:274:0x1166, B:277:0x1180, B:280:0x118c, B:282:0x118f, B:294:0x1272, B:296:0x1278, B:297:0x1279, B:299:0x127b, B:301:0x1282, B:302:0x1283, B:240:0x0e9f, B:242:0x0ea3, B:249:0x0eb7, B:260:0x1033, B:262:0x1039, B:263:0x1080, B:265:0x10aa, B:267:0x10f7, B:269:0x110e, B:270:0x1154, B:304:0x1285, B:306:0x128c, B:307:0x128d, B:309:0x128f, B:311:0x1296, B:312:0x1297, B:246:0x0eaf, B:290:0x11f6, B:285:0x11bd, B:287:0x11c3, B:288:0x11ee, B:255:0x0f88, B:257:0x0fac, B:258:0x1027, B:250:0x0f3e, B:252:0x0f52, B:253:0x0f81), top: B:839:0x0d6b, outer: #12, inners: #10, #19, #25, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0e9b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x1166 A[Catch: all -> 0x129c, TryCatch #45 {all -> 0x129c, blocks: (B:226:0x0d6b, B:228:0x0d71, B:229:0x0db9, B:231:0x0de0, B:232:0x0e25, B:234:0x0e3b, B:236:0x0e44, B:237:0x0e8c, B:271:0x115a, B:272:0x115e, B:274:0x1166, B:277:0x1180, B:280:0x118c, B:282:0x118f, B:294:0x1272, B:296:0x1278, B:297:0x1279, B:299:0x127b, B:301:0x1282, B:302:0x1283, B:240:0x0e9f, B:242:0x0ea3, B:249:0x0eb7, B:260:0x1033, B:262:0x1039, B:263:0x1080, B:265:0x10aa, B:267:0x10f7, B:269:0x110e, B:270:0x1154, B:304:0x1285, B:306:0x128c, B:307:0x128d, B:309:0x128f, B:311:0x1296, B:312:0x1297, B:246:0x0eaf, B:290:0x11f6, B:285:0x11bd, B:287:0x11c3, B:288:0x11ee, B:255:0x0f88, B:257:0x0fac, B:258:0x1027, B:250:0x0f3e, B:252:0x0f52, B:253:0x0f81), top: B:839:0x0d6b, outer: #12, inners: #10, #19, #25, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x13d4  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x13f7  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x140e A[Catch: all -> 0x14c9, TryCatch #30 {all -> 0x14c9, blocks: (B:341:0x13f9, B:343:0x140e, B:344:0x143d), top: B:811:0x13f9, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x1450 A[Catch: all -> 0x14bf, TryCatch #22 {all -> 0x14bf, blocks: (B:345:0x1443, B:347:0x1450, B:348:0x14b7), top: B:797:0x1443, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x15f2 A[Catch: all -> 0x1a10, TryCatch #37 {all -> 0x1a10, blocks: (B:373:0x15ec, B:375:0x15f2, B:376:0x1637, B:380:0x1651, B:382:0x1657, B:383:0x169a, B:407:0x18c4, B:408:0x18c8, B:410:0x18ce, B:413:0x18e8, B:416:0x18f5, B:419:0x1902, B:431:0x19ea, B:433:0x19f0, B:434:0x19f1, B:436:0x19f3, B:438:0x19fa, B:439:0x19fb, B:384:0x16a5, B:396:0x17a0, B:398:0x17a6, B:399:0x17ea, B:401:0x1814, B:403:0x185d, B:405:0x1874, B:406:0x18bc, B:441:0x19fd, B:443:0x1a04, B:444:0x1a05, B:446:0x1a07, B:448:0x1a0e, B:449:0x1a0f, B:427:0x1969, B:422:0x1931, B:424:0x1937, B:425:0x1961, B:391:0x1712, B:393:0x1727, B:394:0x1794, B:386:0x16c5, B:388:0x16da, B:389:0x170b), top: B:825:0x15ec, outer: #12, inners: #3, #13, #20, #28 }] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x1644  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x16a5 A[Catch: all -> 0x1a10, TRY_LEAVE, TryCatch #37 {all -> 0x1a10, blocks: (B:373:0x15ec, B:375:0x15f2, B:376:0x1637, B:380:0x1651, B:382:0x1657, B:383:0x169a, B:407:0x18c4, B:408:0x18c8, B:410:0x18ce, B:413:0x18e8, B:416:0x18f5, B:419:0x1902, B:431:0x19ea, B:433:0x19f0, B:434:0x19f1, B:436:0x19f3, B:438:0x19fa, B:439:0x19fb, B:384:0x16a5, B:396:0x17a0, B:398:0x17a6, B:399:0x17ea, B:401:0x1814, B:403:0x185d, B:405:0x1874, B:406:0x18bc, B:441:0x19fd, B:443:0x1a04, B:444:0x1a05, B:446:0x1a07, B:448:0x1a0e, B:449:0x1a0f, B:427:0x1969, B:422:0x1931, B:424:0x1937, B:425:0x1961, B:391:0x1712, B:393:0x1727, B:394:0x1794, B:386:0x16c5, B:388:0x16da, B:389:0x170b), top: B:825:0x15ec, outer: #12, inners: #3, #13, #20, #28 }] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x18ce A[Catch: all -> 0x1a10, TryCatch #37 {all -> 0x1a10, blocks: (B:373:0x15ec, B:375:0x15f2, B:376:0x1637, B:380:0x1651, B:382:0x1657, B:383:0x169a, B:407:0x18c4, B:408:0x18c8, B:410:0x18ce, B:413:0x18e8, B:416:0x18f5, B:419:0x1902, B:431:0x19ea, B:433:0x19f0, B:434:0x19f1, B:436:0x19f3, B:438:0x19fa, B:439:0x19fb, B:384:0x16a5, B:396:0x17a0, B:398:0x17a6, B:399:0x17ea, B:401:0x1814, B:403:0x185d, B:405:0x1874, B:406:0x18bc, B:441:0x19fd, B:443:0x1a04, B:444:0x1a05, B:446:0x1a07, B:448:0x1a0e, B:449:0x1a0f, B:427:0x1969, B:422:0x1931, B:424:0x1937, B:425:0x1961, B:391:0x1712, B:393:0x1727, B:394:0x1794, B:386:0x16c5, B:388:0x16da, B:389:0x170b), top: B:825:0x15ec, outer: #12, inners: #3, #13, #20, #28 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x1b41  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x1bb0  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x1c09  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x1ce7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03f6 A[Catch: all -> 0x078a, TRY_ENTER, TRY_LEAVE, TryCatch #31 {all -> 0x078a, blocks: (B:32:0x033c, B:38:0x0387, B:47:0x03f6, B:66:0x0509, B:69:0x054e), top: B:813:0x033c }] */
    /* JADX WARN: Removed duplicated region for block: B:497:0x1f2b  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x1ffe  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x2206  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x225c  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x2322  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x24cd  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x25ce  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x27b6 A[Catch: all -> 0x2c58, TryCatch #41 {all -> 0x2c58, blocks: (B:562:0x27b0, B:564:0x27b6, B:565:0x27fb, B:567:0x2822, B:568:0x286a, B:570:0x287d, B:572:0x2886, B:573:0x28ca, B:608:0x2b1a, B:609:0x2b1e, B:611:0x2b24, B:614:0x2b3c, B:617:0x2b49, B:619:0x2b4c, B:631:0x2c32, B:633:0x2c38, B:634:0x2c39, B:636:0x2c3b, B:638:0x2c42, B:639:0x2c43, B:578:0x28e3, B:580:0x28e7, B:584:0x28f3, B:586:0x28f9, B:598:0x2a0b, B:600:0x2a11, B:601:0x2a50, B:603:0x2a7a, B:604:0x2abb, B:606:0x2ad1, B:607:0x2b14, B:641:0x2c45, B:643:0x2c4c, B:644:0x2c4d, B:646:0x2c4f, B:648:0x2c56, B:649:0x2c57, B:627:0x2bb8, B:622:0x2b78, B:624:0x2b7e, B:625:0x2bb0, B:593:0x296c, B:595:0x298b, B:596:0x29ff, B:588:0x2919, B:590:0x292e, B:591:0x2965), top: B:832:0x27b0, outer: #12, inners: #9, #18, #26, #35 }] */
    /* JADX WARN: Removed duplicated region for block: B:567:0x2822 A[Catch: all -> 0x2c58, TryCatch #41 {all -> 0x2c58, blocks: (B:562:0x27b0, B:564:0x27b6, B:565:0x27fb, B:567:0x2822, B:568:0x286a, B:570:0x287d, B:572:0x2886, B:573:0x28ca, B:608:0x2b1a, B:609:0x2b1e, B:611:0x2b24, B:614:0x2b3c, B:617:0x2b49, B:619:0x2b4c, B:631:0x2c32, B:633:0x2c38, B:634:0x2c39, B:636:0x2c3b, B:638:0x2c42, B:639:0x2c43, B:578:0x28e3, B:580:0x28e7, B:584:0x28f3, B:586:0x28f9, B:598:0x2a0b, B:600:0x2a11, B:601:0x2a50, B:603:0x2a7a, B:604:0x2abb, B:606:0x2ad1, B:607:0x2b14, B:641:0x2c45, B:643:0x2c4c, B:644:0x2c4d, B:646:0x2c4f, B:648:0x2c56, B:649:0x2c57, B:627:0x2bb8, B:622:0x2b78, B:624:0x2b7e, B:625:0x2bb0, B:593:0x296c, B:595:0x298b, B:596:0x29ff, B:588:0x2919, B:590:0x292e, B:591:0x2965), top: B:832:0x27b0, outer: #12, inners: #9, #18, #26, #35 }] */
    /* JADX WARN: Removed duplicated region for block: B:570:0x287d A[Catch: all -> 0x2c58, TryCatch #41 {all -> 0x2c58, blocks: (B:562:0x27b0, B:564:0x27b6, B:565:0x27fb, B:567:0x2822, B:568:0x286a, B:570:0x287d, B:572:0x2886, B:573:0x28ca, B:608:0x2b1a, B:609:0x2b1e, B:611:0x2b24, B:614:0x2b3c, B:617:0x2b49, B:619:0x2b4c, B:631:0x2c32, B:633:0x2c38, B:634:0x2c39, B:636:0x2c3b, B:638:0x2c42, B:639:0x2c43, B:578:0x28e3, B:580:0x28e7, B:584:0x28f3, B:586:0x28f9, B:598:0x2a0b, B:600:0x2a11, B:601:0x2a50, B:603:0x2a7a, B:604:0x2abb, B:606:0x2ad1, B:607:0x2b14, B:641:0x2c45, B:643:0x2c4c, B:644:0x2c4d, B:646:0x2c4f, B:648:0x2c56, B:649:0x2c57, B:627:0x2bb8, B:622:0x2b78, B:624:0x2b7e, B:625:0x2bb0, B:593:0x296c, B:595:0x298b, B:596:0x29ff, B:588:0x2919, B:590:0x292e, B:591:0x2965), top: B:832:0x27b0, outer: #12, inners: #9, #18, #26, #35 }] */
    /* JADX WARN: Removed duplicated region for block: B:575:0x28d5  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x2b24 A[Catch: all -> 0x2c58, TryCatch #41 {all -> 0x2c58, blocks: (B:562:0x27b0, B:564:0x27b6, B:565:0x27fb, B:567:0x2822, B:568:0x286a, B:570:0x287d, B:572:0x2886, B:573:0x28ca, B:608:0x2b1a, B:609:0x2b1e, B:611:0x2b24, B:614:0x2b3c, B:617:0x2b49, B:619:0x2b4c, B:631:0x2c32, B:633:0x2c38, B:634:0x2c39, B:636:0x2c3b, B:638:0x2c42, B:639:0x2c43, B:578:0x28e3, B:580:0x28e7, B:584:0x28f3, B:586:0x28f9, B:598:0x2a0b, B:600:0x2a11, B:601:0x2a50, B:603:0x2a7a, B:604:0x2abb, B:606:0x2ad1, B:607:0x2b14, B:641:0x2c45, B:643:0x2c4c, B:644:0x2c4d, B:646:0x2c4f, B:648:0x2c56, B:649:0x2c57, B:627:0x2bb8, B:622:0x2b78, B:624:0x2b7e, B:625:0x2bb0, B:593:0x296c, B:595:0x298b, B:596:0x29ff, B:588:0x2919, B:590:0x292e, B:591:0x2965), top: B:832:0x27b0, outer: #12, inners: #9, #18, #26, #35 }] */
    /* JADX WARN: Removed duplicated region for block: B:664:0x2daa  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x2dfe  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x2e60  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x3010  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x30f4  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x314c  */
    /* JADX WARN: Removed duplicated region for block: B:706:0x319a  */
    /* JADX WARN: Removed duplicated region for block: B:726:0x3361  */
    /* JADX WARN: Removed duplicated region for block: B:754:0x3462  */
    /* JADX WARN: Removed duplicated region for block: B:755:0x3463  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0130 A[PHI: r15
  0x0130: PHI (r15v72 char) = (r15v7 char), (r15v73 char) binds: [B:17:0x014e, B:5:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0627 A[Catch: all -> 0x0768, TryCatch #4 {all -> 0x0768, blocks: (B:78:0x061d, B:79:0x0621, B:81:0x0627, B:84:0x0641, B:71:0x055c, B:74:0x05bd, B:77:0x0617), top: B:764:0x055c }] */
    /* JADX WARN: Removed duplicated region for block: B:870:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0136 A[PHI: r15
  0x0136: PHI (r15v7 char) = (r15v6 char), (r15v74 char) binds: [B:3:0x0128, B:5:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v77 */
    /* JADX WARN: Type inference failed for: r12v78 */
    /* JADX WARN: Type inference failed for: r12v79 */
    /* JADX WARN: Type inference failed for: r12v82 */
    /* JADX WARN: Type inference failed for: r12v83 */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 13910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.PayResultActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$0CpLkp5AVPkDjUJbify1sxFMh08(PayResultActivity payResultActivity, List list) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 21;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        payResultActivity.lambda$initObserver$2(list);
        int i4 = getAsAtTimestamp + 1;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
    }

    public static void m10083$r8$lambda$2_L5035SCqVYzEmGf70oGcBydo(PayResultActivity payResultActivity, TransferResp transferResp, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 37;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        m10086xe8650aa2(payResultActivity, transferResp, view);
        int i4 = getAsAtTimestamp + 65;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$7NQHoFT8GHS1blAtpwzBwE9MFjY(PayResultActivity payResultActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 53;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        payResultActivity.lambda$initObserver$3(resource);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = getAsAtTimestamp + 11;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$OrsNQddqSFyzXlMRNPiFg2Z6rIQ(PayResultActivity payResultActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 23;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        m10087x2e064d41(payResultActivity, view);
        int i4 = getAsAtTimestamp + 119;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$wjxcuHBzTVQDpvEf6QVRQv7vaTg(PayResultActivity payResultActivity, HomeDynamicMenu.DynamicItemBean dynamicItemBean, int i, View view) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 87;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        payResultActivity.lambda$setBanners$4(dynamicItemBean, i, view);
        int i5 = getRequestBeneficiariesState + 11;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    static void m10084$$Nest$mqueryTransDetails(PayResultActivity payResultActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 7;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        payResultActivity.queryTransDetails();
        int i4 = getAsAtTimestamp + 31;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void m10085$$Nest$mtoBillShare(PayResultActivity payResultActivity, TransferResp transferResp) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 121;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        payResultActivity.toBillShare(transferResp);
        int i4 = getAsAtTimestamp + 97;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Finally extract failed */
    private static void m10086xe8650aa2(PayResultActivity payResultActivity, TransferResp transferResp, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 89;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                payResultActivity.lambda$setSuccessResult$0(transferResp, view);
                Callback.onClick_exit();
                throw null;
            }
            payResultActivity.lambda$setSuccessResult$0(transferResp, view);
            Callback.onClick_exit();
            int i4 = getRequestBeneficiariesState + 35;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10087x2e064d41(PayResultActivity payResultActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 105;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            payResultActivity.lambda$setSuccessResult$1(view);
            Callback.onClick_exit();
            int i4 = getAsAtTimestamp + 15;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 109;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 81;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getRequestBeneficiariesState + 119;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    static void copydefault() {
        ShareDataUIState = new char[]{30700, 30691, 30697, 30687, 30690, 30692, 30627, 30686, 30717, 30702, 30696, 30688, 30676, 30712, 30621, 30699, 30613, 30620, 30619, 30623, 30616, 30618, 30703, 30617, 30622, 30612, 30624, 30695, 30683, 30689, 30698, 30718, 30681, 30597, 30693, 30606};
        copydefault = 321287757;
        component3 = true;
        component1 = true;
        component2 = -9110661969923704013L;
    }
}
