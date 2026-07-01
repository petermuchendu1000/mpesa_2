package com.huawei.digitalpayment.consumer.webviewui.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.constant.CacheConstants;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.FastClickUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.util.ViewUtils;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.consumer.base.ui.base.SfcPaymentBaseActivity;
import com.huawei.digitalpayment.consumer.webview.model.resp.GetH5AccessTokenResp;
import com.huawei.digitalpayment.consumer.webview.util.WebViewUtils;
import com.huawei.digitalpayment.consumer.webview.viewmodel.WebViewViewModel;
import com.huawei.digitalpayment.consumer.webviewui.R;
import com.huawei.digitalpayment.consumer.webviewui.ui.fragment.WebViewFragment;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.mpesa.logging.L;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.notify;

public class WebViewActivity extends Hilt_WebViewActivity<ViewDataBinding, WebViewViewModel> {
    private static char ShareDataUIState;
    private static char[] component1;
    private static long component2;
    private static long component3;
    private static int component4;
    private static int copydefault;
    private static long equals;
    private String accessToken;
    private SfcPaymentBaseActivity.ToolbarContainer toolbarContainer;
    private String tradeType;
    private String url;
    private WebViewFragment webViewFragment;
    private static final byte[] $$u = {2, 105, -126, -86};
    private static final int $$x = 239;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$y = {105, -91, -115, Ascii.US, -28, 0, -24, 6, Ascii.SUB, -36, -26, Ascii.FF, 5, 5, -17, -40, Ascii.FF, -26, 8, -19, -5, -10, -6, -6, 2, -16, -13, 58, -11, -12, 1, -4, -12, -17, 67, -60, -19, -10, -4, -13, -6, 4, -12, 2, -21, 62, -61, -8, -4, -26, 7, TarHeader.LF_SYMLINK, -66, -12, -13, 8, -20, -3, 6, -18, TarHeader.LF_CONTIG, -29, -40, -4, -26, 7, Ascii.GS, -51, -10, -4, -13, -6, 4, -12, 2, Ascii.NAK, -44, 1, -16, Ascii.US, -43, -10, -3, 65, -54, -28, 0, -24, 6, Ascii.SUB, -36, -26, Ascii.FF, 5, 5, -17, -40, Ascii.FF, -26, 8, -19, -5, -10, -6, -6, 2, -16, -13, 59};
    private static final int $$z = 213;
    private static final byte[] $$g = {115, 102, 60, 8, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$h = 9;
    private static int getAsAtTimestamp = 1;
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 1;

    private static String $$A(int i, int i2, short s) {
        int i3 = s * 3;
        int i4 = i + 98;
        int i5 = 4 - (i2 * 4);
        byte[] bArr = $$u;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 = i3 + i4;
            i5++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            i4 += bArr[i5];
            i5++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.webviewui.ui.activity.WebViewActivity.$$g
            int r8 = r8 + 4
            int r9 = 28 - r9
            int r7 = r7 * 2
            int r7 = r7 + 83
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            r6 = r8
            r8 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L26
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
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-8)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webviewui.ui.activity.WebViewActivity.m(int, int, short, java.lang.Object[]):void");
    }

    private static void o(short s, int i, byte b2, Object[] objArr) {
        int i2 = 107 - (i * 8);
        int i3 = (s * 3) + 4;
        int i4 = b2 * 3;
        byte[] bArr = $$y;
        byte[] bArr2 = new byte[i4 + 10];
        int i5 = i4 + 9;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i2 = (i2 + (-i3)) - 7;
            i3++;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i2;
            int i9 = i3 + 1;
            i6 = i7;
            i2 = (i8 + (-bArr[i3])) - 7;
            i3 = i9;
        }
    }

    protected int getWebViewLayoutId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 75;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_webview;
        if (i3 != 0) {
            int i5 = 71 / 0;
        }
        return i4;
    }

    private static void n(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i4 = $10 + 25;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            int i6 = notifyVar.copydefault;
            char c2 = cArr[notifyVar.copydefault];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[i2] = notifyVar;
                objArr2[1] = notifyVar;
                objArr2[0] = Integer.valueOf(c2);
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    int iBlue = Color.blue(0) + 3266;
                    int capsMode = 33 - TextUtils.getCapsMode("", 0, 0);
                    char jumpTapTimeout = (char) (60268 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    byte length2 = (byte) $$u.length;
                    byte b2 = (byte) (length2 - 4);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iBlue, capsMode, jumpTapTimeout, -834797019, false, $$A(length2, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component3 ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) 0;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 688, KeyEvent.normalizeMetaState(0) + 34, (char) (60372 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), -1969106284, false, $$A((byte) ($$x & 23), b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        int i7 = $11 + 41;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (notifyVar.copydefault < cArr.length) {
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                byte b4 = (byte) 0;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(687 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.blue(0) + 34, (char) (Color.green(0) + 60373), -1969106284, false, $$A((byte) ($$x & 23), b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i9 = $10 + 19;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void l(char r29, int r30, int r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webviewui.ui.activity.WebViewActivity.l(char, int, int, java.lang.Object[]):void");
    }

    private static void k(char[] cArr, int i, char[] cArr2, char[] cArr3, char c2, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i5 = $11 + 13;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            int i7 = $11 + 41;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int iMyTid = 4037 - (Process.myTid() >> 22);
                    int i9 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31;
                    char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 19181);
                    byte b2 = (byte) ($$x & 1);
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iMyTid, i9, cIndexOf, 1912513118, false, $$A(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7567 - KeyEvent.normalizeMetaState(0), 11 - TextUtils.indexOf("", "", 0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2460, (ViewConfiguration.getJumpTapTimeout() >> 16) + 28, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 931716605, false, $$A(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    i2 = 2;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.red(0) + 11, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[iNotificationSideChannel.copydefault])) ^ (component2 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) copydefault) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) ShareDataUIState) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                i3 = i2;
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

    /* JADX WARN: Type inference failed for: r0v84, types: [Binding extends androidx.databinding.ViewDataBinding, androidx.databinding.ViewDataBinding] */
    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        k(new char[]{46403, 55043, 17064, 11367}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{13241, 23004, 56949, 60932, 19267, 14006, 8926, 53052, 29996, 44410, 21211, 2407, 62228, 25492, 53491, 42646, 28239, 36982}, new char[]{23391, 63934, 33761, 48052}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952715_res_0x7f13044b).substring(6, 7).codePointAt(0) + 26402), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        k(new char[]{13129, 31471, 21578, 1979}, 1249570611 - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{64108, 58795, 44190, 21157, 35472}, new char[]{23391, 63934, 33761, 48052}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 47927), objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                l((char) (52485 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 3, ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                k(new char[]{16329, 55969, 1248, 61907}, Color.rgb(0, 0, 0) + 16777216, new char[]{24876, 59717, 57285, 26670, 23276, 12599, 41181, 48230, 49686, 4999, 10302, 1553, 15417, 54875, 64002, 38610, 3182, 53968}, new char[]{23391, 63934, 33761, 48052}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 53991), objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i2 = copy + 49;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    int i4 = getRequestBeneficiariesState + 25;
                    copy = i4 % 128;
                    int i5 = i4 % 2;
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                }
            }
            if (baseContext != null) {
                int i6 = copy + 77;
                getRequestBeneficiariesState = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        try {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.green(0) + 42, (char) TextUtils.getOffsetBefore("", 0), 428292935, false, "ShareDataUIState", new Class[0]);
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
                    l((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 32290), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 19, 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    k(new char[]{6824, 12773, 47130, 56872}, (-1) - TextUtils.lastIndexOf("", '0', 0), new char[]{1805, 4643, 12104, 26408, 25304, 57978, 10197, 51761, 36420, 11923, 35626, 56750, 56466, 32372, 61616, 17677, 52553, 17219, 59232, 38498, 14820, 13391, 36197, 38023, 33350, 38181, 55479, 46499, 22201, 42973, 58073, 52940, 49790, 17502, 42185, 6384, 39541, 5473, 10251, 50657, 41054, 51971, 46117, 50838, 14567, 58039, 59369, 31901, 34118, 25871, 30840, 33787, 22683, 50788, 28555, 38265, 52079, 35567, 10248, 6765, 14470, 44397, 36468, 48296}, new char[]{23391, 63934, 33761, 48052}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952716_res_0x7f13044c).substring(6, 7).length() - 1), objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    k(new char[]{9870, 23579, 58266, 53477}, TextUtils.indexOf("", ""), new char[]{21514, 16953, 19371, 59595, 51058, 37712, 6685, 33715, 31168, 64903, 44778, 47055, 62865, 54098, 55828, 32329, 50525, 5721, 23909, 17655, 49393, 63556, 53926, 46932, 55757, 29176, 30740, 23288, 59919, 49131, 40022, 38207, 3053, 35312, 49402, 35116, 30067, 21105, 6753, 47130, 50752, 57126, 17057, 58995, 1899, 35088, 27228, 6458, 63232, 29061, 65504, 39502, 3956, 11780, 59235, 21514, 30489, 38588, 37407, 3875, 4462, 31300, 16924, 53008}, new char[]{23391, 63934, 33761, 48052}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952767_res_0x7f13047f).substring(12, 13).length() - 1), objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    k(new char[]{50182, 60750, 60847, 45714}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(21) - 105, new char[]{51109, 11592, 46963, 27407, 18755, 49564, 46992, 16116, 64426, 24796, 63267, 47878, 64925, 23490, 58165, 54572, 58604, 63086, 9909, 3886, 2400, 20776, 53345, 47774, 30174, 60789, 47322, 58782, 30316, 57328, 41058, 63132, 60024, 42239, 62608, 27960, 1032, 34460, 56238, 46284, 26373, 2232, 55214, 49420, 5546, 43034, 'x', 20230, 40607, 56022, 24404, 11540, 46874, 54238, 1883, 638, 6993, 19854, 22304, 24855, 7598, 37547, 4332, 14577, 32201, 57098, 19832, 63016, 53021, 40627, 5499, 48728}, new char[]{23391, 63934, 33761, 48052}, (char) (Process.myPid() >> 22), objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    k(new char[]{16510, 50159, 23984, 34997}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{50699, 47634, 1958, 10827, 17031, 1718}, new char[]{23391, 63934, 33761, 48052}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952805_res_0x7f1304a5).substring(19, 20).length() + 46428), objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    k(new char[]{62723, 11639, 14466, 27588}, View.MeasureSpec.getSize(0), new char[]{63654, 45103, 54810, 43230, 17820, 23665, 36444, 37575, 49917, 5733, 24366, 25124, 9309, 41317, 51357, 12977, 7065, 63547, 57244, 25067, 64309, 14113, 10867, 7011, 30556, 15455, 2519, 30579, 64135, 19907, 30750, 34615, 61349, 11902, 13727, 65270}, new char[]{23391, 63934, 33761, 48052}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952721_res_0x7f130451).substring(6, 7).length() - 1), objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - View.getDefaultSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 57, (char) (Process.myTid() >> 22), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault3 == null) {
            int iMyTid = 2405 - (Process.myTid() >> 22);
            int i8 = 25 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            byte[] bArr = $$g;
            Object[] objArr13 = new Object[1];
            m(bArr[3], bArr[33], bArr[38], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iMyTid, i8, cIndexOf, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            int i9 = copy + 57;
            getRequestBeneficiariesState = i9 % 128;
            int i10 = i9 % 2;
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2405;
                int i11 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25;
                char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                byte[] bArr2 = $$g;
                Object[] objArr14 = new Object[1];
                m(bArr2[3], (byte) (-bArr2[81]), (byte) (-bArr2[95]), objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(fadingEdgeLength, i11, jumpTapTimeout, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            k(new char[]{19813, 13746, 25348, 29814}, Gravity.getAbsoluteGravity(0, 0), new char[]{16664, 33552, 41780, 53291, 16174, 51318, 23677, 51293, 4164, 4567, 37643, 12337, 33117, 41734, 43782, 65002}, new char[]{23391, 63934, 33761, 48052}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952790_res_0x7f130496).substring(7, 8).length() + 30306), objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            l((char) (TextUtils.indexOf("", "", 0, 0) + 4640), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952805_res_0x7f1304a5).substring(19, 20).length() + 15, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954659_res_0x7f130be3).substring(6, 9).codePointAt(0) - 36, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 2046208867};
                Object[] objArr18 = new Object[1];
                l((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954589_res_0x7f130b9d).substring(0, 2).length() + 52483), 26 - (ViewConfiguration.getTouchSlop() >> 8), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(27) - 108, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                k(new char[]{16329, 55969, 1248, 61907}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(27) - 108, new char[]{24876, 59717, 57285, 26670, 23276, 12599, 41181, 48230, 49686, 4999, 10302, 1553, 15417, 54875, 64002, 38610, 3182, 53968}, new char[]{23391, 63934, 33761, 48052}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(17) + 53905), objArr19);
                Object[] objArr20 = new Object[1];
                n(((Context) cls4.getMethod((String) objArr19[0], new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952812_res_0x7f1304ac).substring(55, 56).length() + 59496, new char[]{22615, 45106, 34955, 57633, 63992, 53836, 10787, 668, 6937, 29676, 19456, 42195, 48305, 38150, 60899, 50791, 57029, 13985, 3878, 26526, 28793, 18628, 41303, 47413, 37272, 59995, 49917, 56136, 13094, 2978, 25615, 31982, 21873, 44495, 34280, 40457, 63129, 53089, 10183, 16303, 2104, 24708, 31098, 20982, 43542, 33332, 39555, 62301, 52215, 9294, 15556, 5306, 27909, 17895, 24124, 46845, 36525, 59192, 65431, 51307, 8401, 14690, 4402, 27010, 16902, 23288, 45922, 35630, 58275, 64529, 54496, 11588, 1501, 7607, 30218, 20132, 42875, 49107, 38831, 57398, 63626, 53574, 10722, 539, 6662, 29320, 19231, 41970, 48192, 38092, 60557, 50447, 56809, 13923, 3807, 26247, 32565, 22414, 41070, 47309, 37215, 59704, 49552, 55919, 13007, 2886, 25404, 31666, 21533, 44271, 34062, 40324, 62944, 52831, 9938, 16187, 6117, 28593, 30758, 20638, 43390, 33275, 39519, 61995, 51899, 8968, 15348, 5207, 27868, 17592, 23826, 46566, 36467, 59125, 65187, 55046, 12190, 14433, 4303, 26887}, objArr20);
                Class<?> cls5 = Class.forName(((String) objArr20[0]).intern());
                Object[] objArr21 = new Object[1];
                o(r1[5], (byte) (-$$y[57]), r1[24], objArr21);
                objArr = (Object[]) cls5.getMethod((String) objArr21[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int maximumDrawingCacheSize = 2405 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iIndexOf = 26 - TextUtils.indexOf("", "");
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    byte[] bArr3 = $$g;
                    Object[] objArr22 = new Object[1];
                    m(bArr3[3], (byte) (-bArr3[81]), (byte) (-bArr3[95]), objArr22);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(maximumDrawingCacheSize, iIndexOf, packedPositionType, 24929979, false, (String) objArr22[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr23 = new Object[1];
                    k(new char[]{50257, 45263, 1167, 64081}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{21804, 38910, 23399, 50410, 45863, 44557, 23069, 50431, 16284, 24617, 64299, 53809, 15619, 27536, 20282, 21737, 33554, 35501, 53815, 25754, 42815, 46769}, new char[]{23391, 63934, 33761, 48052}, (char) ((-1) - TextUtils.lastIndexOf("", '0')), objArr23);
                    Class<?> cls6 = Class.forName((String) objArr23[0]);
                    Object[] objArr24 = new Object[1];
                    k(new char[]{21963, 3886, 45221, 23931}, (-1525731787) + ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952792_res_0x7f130498).substring(2, 3).codePointAt(0), new char[]{28255, 25719, 13332, 28589, 18258, 49353, 41820, 60945, 10662, 56608, 5117, 2536, 12466, 32359, 39178}, new char[]{23391, 63934, 33761, 48052}, (char) (Color.argb(0, 0, 0, 0) + 31664), objArr24);
                    long jLongValue = ((Long) cls6.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int iAlpha = Color.alpha(0) + 2405;
                        int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 26;
                        char mode = (char) View.MeasureSpec.getMode(0);
                        byte b2 = (byte) ($$h + 1);
                        byte[] bArr4 = $$g;
                        Object[] objArr25 = new Object[1];
                        m(b2, bArr4[54], bArr4[33], objArr25);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iAlpha, fadingEdgeLength2, mode, -1843538389, false, (String) objArr25[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2406;
                        int iIndexOf2 = TextUtils.indexOf("", "", 0) + 26;
                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        byte[] bArr5 = $$g;
                        Object[] objArr26 = new Object[1];
                        m(bArr5[3], bArr5[33], bArr5[38], objArr26);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, iIndexOf2, keyRepeatTimeout, -2047739879, false, (String) objArr26[0], null);
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
        int i12 = ((int[]) objArr[0])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 != i12) {
            long j = -1;
            long j2 = 0;
            long j3 = (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & ((long) (i13 ^ i12))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6618 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 41, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            try {
                Object[] objArr27 = {-264614524, Long.valueOf(j3), new ArrayList(), null, true};
                Class cls7 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6562 - KeyEvent.getDeadChar(0, 0), 55 - Process.getGidForName(""), (char) (Process.myTid() >> 22));
                byte[] bArr6 = $$y;
                Object[] objArr28 = new Object[1];
                o(bArr6[12], bArr6[30], bArr6[5], objArr28);
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
        this.binding = DataBindingUtil.setContentView(this, getWebViewLayoutId());
        this.url = getIntent().getStringExtra(RouteUtils.SCHEME_EXECUTE_KEY);
        String stringExtra = getIntent().getStringExtra("appId");
        String stringExtra2 = getIntent().getStringExtra("from");
        if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2)) {
            ((WebViewViewModel) this.viewModel).getH5AccessToken(stringExtra);
        } else {
            openUrl();
            addObserver();
        }
    }

    private void lambda$openUrl$0() {
        int i = 2 % 2;
        SfcPaymentBaseActivity.ToolbarContainer toolbarContainer = this.toolbarContainer;
        if (toolbarContainer == null || toolbarContainer.ivEnd == null) {
            return;
        }
        if (this.webViewFragment.getWebView().canGoBack()) {
            int i2 = copy + 15;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            this.toolbarContainer.ivEnd.setVisibility(0);
            return;
        }
        this.toolbarContainer.ivEnd.setVisibility(8);
        int i4 = copy + 81;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 % 3;
        }
    }

    private void openUrl() {
        int i = 2 % 2;
        L.INSTANCE.d(this.TAG, "onCreate:url " + this.url, new Object[0]);
        setToolbar();
        WebViewFragment webViewFragmentNewInstance = WebViewFragment.newInstance(this.url, this.accessToken, this.tradeType);
        this.webViewFragment = webViewFragmentNewInstance;
        webViewFragmentNewInstance.setOnWebViewListener(new WebViewFragment.OnWebViewListener() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final void onProgressChanged() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 83;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                WebViewActivity.$r8$lambda$QdYOgdtuwXcaYpy1YifmFjIJIqU(this.f$0);
                if (i4 == 0) {
                    throw null;
                }
            }
        });
        this.webViewFragment.setOnReceiverTitleListener(new WebViewFragment.OnReceiverTitleListener() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onReceivedTitle(String str) {
                int i2 = 2 % 2;
                int i3 = component3 + 19;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 97 / 0;
                    if (WebViewActivity.m12142$$Nest$fgettoolbarContainer(WebViewActivity.this) == null) {
                        return;
                    }
                } else if (WebViewActivity.m12142$$Nest$fgettoolbarContainer(WebViewActivity.this) == null) {
                    return;
                }
                if (WebViewActivity.m12142$$Nest$fgettoolbarContainer(WebViewActivity.this).tvTitle != null) {
                    int i5 = component3 + 77;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    if (TextUtils.isEmpty(str) || str.contains("http")) {
                        return;
                    }
                    int i7 = component1 + 113;
                    component3 = i7 % 128;
                    if (i7 % 2 == 0) {
                        str.contains("text/html");
                        throw null;
                    }
                    if (!(!str.contains("text/html"))) {
                        return;
                    }
                    WebViewActivity.m12142$$Nest$fgettoolbarContainer(WebViewActivity.this).tvTitle.setText(str);
                }
            }

            @Override
            public void cleanTitle() {
                int i2 = 2 % 2;
                int i3 = component1 + 25;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 1 / 0;
                    if (WebViewActivity.m12142$$Nest$fgettoolbarContainer(WebViewActivity.this) == null) {
                        return;
                    }
                } else if (WebViewActivity.m12142$$Nest$fgettoolbarContainer(WebViewActivity.this) == null) {
                    return;
                }
                int i5 = component1 + 29;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    TextView textView = WebViewActivity.m12142$$Nest$fgettoolbarContainer(WebViewActivity.this).tvTitle;
                    throw null;
                }
                if (WebViewActivity.m12142$$Nest$fgettoolbarContainer(WebViewActivity.this).tvTitle != null) {
                    WebViewActivity.m12142$$Nest$fgettoolbarContainer(WebViewActivity.this).tvTitle.setText("");
                }
            }
        });
        getSupportFragmentManager().beginTransaction().add(R.id.flContainer, this.webViewFragment).commitAllowingStateLoss();
        int i2 = copy + 29;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void lambda$setToolbar$1(View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 79;
        copy = i2 % 128;
        int i3 = i2 % 2;
        finish();
        int i4 = copy + 31;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    private void setToolbar() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 121;
        copy = i2 % 128;
        int i3 = i2 % 2;
        if (!WebViewUtils.showToolbar(this.url)) {
            if (WebViewUtils.fullscreen(this.url)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.binding.getRoot().getLayoutParams();
            marginLayoutParams.topMargin = ViewUtils.getStatusBarHeight(this);
            this.binding.getRoot().setLayoutParams(marginLayoutParams);
            return;
        }
        SfcPaymentBaseActivity.ToolbarContainer toolbarContainerInitToolbar = super.initToolbar(R.layout.sfc_toolbar_layout);
        this.toolbarContainer = toolbarContainerInitToolbar;
        if (toolbarContainerInitToolbar.rootToolbar != null) {
            this.toolbarContainer.rootToolbar.setBackgroundColor(getColor(R.color.color_home_background));
        }
        if (this.toolbarContainer.ivStart != null) {
            this.toolbarContainer.ivStart.setImageResource(R.drawable.ic_sfc_back);
            this.toolbarContainer.ivStart.setOnClickListener(new View.OnClickListener() {
                private static int component1 = 0;
                private static int copydefault = 1;

                @Override
                public void onClick(View view) {
                    int i4 = 2 % 2;
                    int i5 = copydefault + 49;
                    component1 = i5 % 128;
                    try {
                        if (i5 % 2 != 0) {
                            Callback.onClick_enter(view);
                            WebViewActivity.this.finish();
                            Callback.onClick_exit();
                            int i6 = 85 / 0;
                        } else {
                            Callback.onClick_enter(view);
                            WebViewActivity.this.finish();
                            Callback.onClick_exit();
                        }
                        int i7 = component1 + 65;
                        copydefault = i7 % 128;
                        int i8 = i7 % 2;
                    } catch (Throwable th) {
                        Callback.onClick_exit();
                        throw th;
                    }
                }
            });
            int i4 = copy + 15;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        }
        if (this.toolbarContainer.ivEnd != null) {
            this.toolbarContainer.ivEnd.setImageResource(R.mipmap.base_icon_error1);
            FastClickUtils.setOnClickListener(this.toolbarContainer.ivEnd, new View.OnClickListener() {
                private static int component1 = 1;
                private static int component3;

                @Override
                public final void onClick(View view) {
                    int i6 = 2 % 2;
                    int i7 = component3 + 121;
                    component1 = i7 % 128;
                    int i8 = i7 % 2;
                    WebViewActivity.$r8$lambda$qJWXnn4QdEQ7CHbPKt9hvjwvoYM(this.f$0, view);
                    if (i8 == 0) {
                        throw null;
                    }
                }
            });
        }
        if (WebViewUtils.fullscreen(this.url)) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.binding.getRoot().getLayoutParams();
            marginLayoutParams2.topMargin = 0;
            this.binding.getRoot().setLayoutParams(marginLayoutParams2);
            if (this.toolbarContainer.rootToolbar != null) {
                int i6 = copy + 99;
                getRequestBeneficiariesState = i6 % 128;
                int i7 = i6 % 2;
                this.toolbarContainer.rootToolbar.setBackgroundColor(0);
            }
        }
    }

    private void addObserver() {
        int i = 2 % 2;
        ((WebViewViewModel) this.viewModel).getH5AccessTokenResp().observe(this, new Observer() {
            private static final byte[] $$c = {TarHeader.LF_NORMAL, -22, 122, 126};
            private static final int $$d = 68;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {94, -53, Ascii.FS, -60, -6, 5, -3};
            private static final int $$b = 45;
            private static int component3 = 0;
            private static int getAsAtTimestamp = 1;
            private static char ShareDataUIState = 1145;
            private static char copydefault = 63025;
            private static char component2 = 26378;
            private static char component1 = 15318;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0032). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$e(int r6, short r7, short r8) {
                /*
                    int r8 = r8 * 4
                    int r8 = 3 - r8
                    int r7 = r7 * 3
                    int r7 = r7 + 111
                    int r6 = r6 * 2
                    int r0 = 1 - r6
                    byte[] r1 = com.huawei.digitalpayment.consumer.webviewui.ui.activity.WebViewActivity$$ExternalSyntheticLambda0.$$c
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r6 = 0 - r6
                    if (r1 != 0) goto L18
                    r3 = r8
                    r4 = r2
                    goto L32
                L18:
                    r3 = r2
                L19:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    if (r3 != r6) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L27:
                    int r7 = r7 + 1
                    int r3 = r3 + 1
                    r4 = r1[r7]
                    r5 = r8
                    r8 = r7
                    r7 = r4
                    r4 = r3
                    r3 = r5
                L32:
                    int r7 = r7 + r3
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webviewui.ui.activity.WebViewActivity$$ExternalSyntheticLambda0.$$e(int, short, short):java.lang.String");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void b(int r6, short r7, int r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = com.huawei.digitalpayment.consumer.webviewui.ui.activity.WebViewActivity$$ExternalSyntheticLambda0.$$a
                    int r8 = r8 * 3
                    int r8 = r8 + 4
                    int r6 = r6 * 4
                    int r6 = r6 + 4
                    int r7 = r7 * 2
                    int r7 = 99 - r7
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r8
                    r5 = r2
                    goto L28
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r7
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r8) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L26:
                    r3 = r0[r6]
                L28:
                    int r3 = -r3
                    int r7 = r7 + r3
                    int r6 = r6 + 1
                    int r7 = r7 + 6
                    r3 = r5
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webviewui.ui.activity.WebViewActivity$$ExternalSyntheticLambda0.b(int, short, int, java.lang.Object[]):void");
            }

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = getAsAtTimestamp + 79;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                WebViewActivity.$r8$lambda$RvQtkU11AXUXzDyqUOeE7gBQX7I(this.f$0, (Resource) obj);
                int i5 = getAsAtTimestamp + 107;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 16 / 0;
                }
            }

            private static void a(int i2, char[] cArr, Object[] objArr) throws Throwable {
                int i3 = 2;
                int i4 = 2 % 2;
                INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
                char[] cArr2 = new char[cArr.length];
                int i5 = 0;
                iNotificationSideChannelDefault.component3 = 0;
                char[] cArr3 = new char[2];
                while (iNotificationSideChannelDefault.component3 < cArr.length) {
                    cArr3[i5] = cArr[iNotificationSideChannelDefault.component3];
                    cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
                    int i6 = $10 + 25;
                    $11 = i6 % 128;
                    if (i6 % i3 == 0) {
                        int i7 = 3 / 4;
                    }
                    int i8 = 58224;
                    int i9 = i5;
                    while (i9 < 16) {
                        char c2 = cArr3[1];
                        char c3 = cArr3[i5];
                        int i10 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) component2) ^ 4374495167426960553L)));
                        int i11 = c3 >>> 5;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[3] = Integer.valueOf(component1);
                            objArr2[i3] = Integer.valueOf(i11);
                            objArr2[1] = Integer.valueOf(i10);
                            objArr2[i5] = Integer.valueOf(c2);
                            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                            if (objCopydefault == null) {
                                int offsetBefore = 844 - TextUtils.getOffsetBefore("", i5);
                                int iRgb = (-16777184) - Color.rgb(i5, i5, i5);
                                char cCombineMeasuredStates = (char) (23251 - View.combineMeasuredStates(i5, i5));
                                byte b2 = (byte) i5;
                                byte b3 = b2;
                                String str$$e = $$e(b2, b3, b3);
                                Class[] clsArr = new Class[4];
                                clsArr[i5] = Integer.TYPE;
                                clsArr[1] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, iRgb, cCombineMeasuredStates, 592652048, false, str$$e, clsArr);
                            }
                            char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            char[] cArr4 = cArr3;
                            Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(copydefault)};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                            if (objCopydefault2 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 843, TextUtils.getOffsetBefore("", 0) + 32, (char) (23250 - ImageFormat.getBitsPerPixel(0)), 592652048, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                            i8 -= 40503;
                            i9++;
                            cArr3 = cArr4;
                            i3 = 2;
                            i5 = 0;
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
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 465, TextUtils.getTrimmedLength("") + 49, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1194533216, false, "m", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    cArr3 = cArr5;
                    i3 = 2;
                    i5 = 0;
                }
                String str = new String(cArr2, 0, i2);
                int i12 = $11 + 75;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
                objArr[0] = str;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(27:138|18|(1:20)|21|22|(1:24)(1:25)|26|(1:28)(1:29)|30|133|31|32|(2:34|(14:36|(1:38)|67|135|68|69|(2:71|(1:73)(10:74|129|75|76|77|(2:79|(1:81)(5:82|136|83|84|(2:86|(1:(1:89))(2:90|91))))|109|(1:111)(1:112)|113|(1:115)(2:116|117)))(5:98|99|127|100|101)|104|(1:106)(1:107)|108|109|(0)(0)|113|(0)(0))(18:39|40|134|41|42|(4:44|45|(3:47|50|(12:52|135|68|69|(0)(0)|104|(0)(0)|108|109|(0)(0)|113|(0)(0))(3:53|54|55))|56)(1:48)|67|135|68|69|(0)(0)|104|(0)(0)|108|109|(0)(0)|113|(0)(0)))(4:60|61|131|62)|66|67|135|68|69|(0)(0)|104|(0)(0)|108|109|(0)(0)|113|(0)(0)|(2:(28:16|17|138|18|(0)|21|22|(0)(0)|26|(0)(0)|30|133|31|32|(0)(0)|66|67|135|68|69|(0)(0)|104|(0)(0)|108|109|(0)(0)|113|(0)(0))|(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x038e, code lost:
            
                if (r0.equals((java.lang.String) r13[0]) == false) goto L50;
             */
            /* JADX WARN: Removed duplicated region for block: B:106:0x0586  */
            /* JADX WARN: Removed duplicated region for block: B:107:0x058d  */
            /* JADX WARN: Removed duplicated region for block: B:111:0x05e6  */
            /* JADX WARN: Removed duplicated region for block: B:112:0x05fd  */
            /* JADX WARN: Removed duplicated region for block: B:115:0x0697 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:116:0x0698  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x017e A[Catch: all -> 0x069d, TryCatch #8 {all -> 0x069d, blocks: (B:18:0x0178, B:20:0x017e, B:21:0x01b4), top: B:138:0x0178 }] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0253  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0263  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0274  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0282  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x030f A[Catch: Exception -> 0x03c9, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x03c9, blocks: (B:31:0x029a, B:34:0x030f, B:39:0x032e, B:52:0x03a0, B:53:0x03a7, B:56:0x03b2, B:58:0x03ba, B:59:0x03c0, B:60:0x03c1, B:62:0x03c5, B:41:0x0346, B:45:0x035d, B:48:0x0374), top: B:133:0x029a, inners: #5 }] */
            /* JADX WARN: Removed duplicated region for block: B:60:0x03c1 A[Catch: Exception -> 0x03c9, TRY_LEAVE, TryCatch #4 {Exception -> 0x03c9, blocks: (B:31:0x029a, B:34:0x030f, B:39:0x032e, B:52:0x03a0, B:53:0x03a7, B:56:0x03b2, B:58:0x03ba, B:59:0x03c0, B:60:0x03c1, B:62:0x03c5, B:41:0x0346, B:45:0x035d, B:48:0x0374), top: B:133:0x029a, inners: #5 }] */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0451 A[Catch: Exception -> 0x0566, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0566, blocks: (B:68:0x03d8, B:71:0x0451, B:74:0x0465, B:76:0x048d, B:79:0x04a3, B:82:0x04d7, B:84:0x0504, B:93:0x054d, B:94:0x0553, B:96:0x0555, B:97:0x055b, B:98:0x055c, B:100:0x0560, B:101:0x0563, B:75:0x046f, B:83:0x04e1), top: B:135:0x03d8, inners: #2, #7 }] */
            /* JADX WARN: Removed duplicated region for block: B:98:0x055c A[Catch: Exception -> 0x0566, TRY_LEAVE, TryCatch #6 {Exception -> 0x0566, blocks: (B:68:0x03d8, B:71:0x0451, B:74:0x0465, B:76:0x048d, B:79:0x04a3, B:82:0x04d7, B:84:0x0504, B:93:0x054d, B:94:0x0553, B:96:0x0555, B:97:0x055b, B:98:0x055c, B:100:0x0560, B:101:0x0563, B:75:0x046f, B:83:0x04e1), top: B:135:0x03d8, inners: #2, #7 }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static java.lang.Object[] component3(int r25, int r26) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1916
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webviewui.ui.activity.WebViewActivity$$ExternalSyntheticLambda0.component3(int, int):java.lang.Object[]");
            }
        });
        int i2 = copy + 11;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private void lambda$addObserver$2(Resource resource) {
        int i = 2 % 2;
        int i2 = copy + 17;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        if (resource.loading()) {
            DialogManager.showLoading(this);
            int i4 = getRequestBeneficiariesState + 93;
            copy = i4 % 128;
            int i5 = i4 % 2;
        } else {
            DialogManager.hideLoading(this);
        }
        if (resource.error()) {
            finish();
            ToastUtils.showLong(resource.getMessage());
            int i6 = copy + 43;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        if (!resource.success()) {
            return;
        }
        GetH5AccessTokenResp getH5AccessTokenResp = (GetH5AccessTokenResp) resource.getData();
        if (TextUtils.isEmpty(getH5AccessTokenResp.getAccessToken())) {
            finish();
            return;
        }
        this.url = getH5AccessTokenResp.getUrl();
        this.accessToken = getH5AccessTokenResp.getAccessToken();
        this.tradeType = getH5AccessTokenResp.getTradeType();
        openUrl();
    }

    @Override
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = copy + 107;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        WebViewFragment webViewFragment = this.webViewFragment;
        if (webViewFragment != null) {
            int i5 = i3 + 43;
            copy = i5 % 128;
            int i6 = i5 % 2;
            if (webViewFragment.getWebView() != null) {
                WebView webView = this.webViewFragment.getWebView();
                if (webView.canGoBack()) {
                    int i7 = getRequestBeneficiariesState + 35;
                    copy = i7 % 128;
                    int i8 = i7 % 2;
                    webView.goBack();
                    return;
                }
            }
        }
        super.onBackPressed();
        int i9 = getRequestBeneficiariesState + 97;
        copy = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
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
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webviewui.ui.activity.WebViewActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = copy + 55;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            l((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 52388), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952785_res_0x7f130491).substring(2, 3).length() + 25, TextUtils.getOffsetAfter("", 0), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            k(new char[]{16329, 55969, 1248, 61907}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952793_res_0x7f130499).substring(6, 7).codePointAt(0) - 32, new char[]{24876, 59717, 57285, 26670, 23276, 12599, 41181, 48230, 49686, 4999, 10302, 1553, 15417, 54875, 64002, 38610, 3182, 53968}, new char[]{23391, 63934, 33761, 48052}, (char) (54020 - (ViewConfiguration.getWindowTouchSlop() >> 8)), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = copy + 1;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            if ((!(baseContext instanceof ContextWrapper)) || ((ContextWrapper) baseContext).getBaseContext() != null) {
                baseContext = baseContext.getApplicationContext();
            } else {
                int i6 = copy + 39;
                getRequestBeneficiariesState = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 4 / 2;
                }
                baseContext = null;
            }
        }
        if (baseContext != null) {
            int i8 = getRequestBeneficiariesState + 63;
            copy = i8 % 128;
            try {
                if (i8 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 6618, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 42, (char) TextUtils.indexOf("", "", 0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.getOffsetBefore("", 0) + 56, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    int i9 = 24 / 0;
                } else {
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(6618 - View.resolveSizeAndState(0, 0, 0), 42 - TextUtils.indexOf("", ""), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getTapTimeout() >> 16), Color.blue(0) + 56, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -960739708, false, "component3", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x0aa1 A[Catch: all -> 0x0bc8, TryCatch #25 {all -> 0x0bc8, blocks: (B:98:0x0a97, B:99:0x0a9b, B:101:0x0aa1, B:104:0x0abb, B:107:0x0ac7, B:109:0x0aca, B:121:0x0bb6, B:123:0x0bbc, B:124:0x0bbd, B:126:0x0bbf, B:128:0x0bc6, B:129:0x0bc7, B:76:0x074d, B:87:0x0971, B:89:0x0977, B:90:0x09c0, B:92:0x09ea, B:94:0x0a2f, B:96:0x0a46, B:97:0x0a91, B:133:0x0bcb, B:135:0x0bd2, B:136:0x0bd3, B:138:0x0bd5, B:140:0x0bdc, B:141:0x0bdd, B:117:0x0b37, B:112:0x0af8, B:114:0x0afe, B:115:0x0b2f, B:82:0x08c1, B:84:0x08e5, B:85:0x0965, B:77:0x086e, B:79:0x0882, B:80:0x08ba), top: B:790:0x074d, inners: #12, #18, #29, #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0cac A[Catch: all -> 0x0574, TryCatch #13 {all -> 0x0574, blocks: (B:153:0x0ca6, B:155:0x0cac, B:156:0x0cd4, B:700:0x3650, B:702:0x3656, B:703:0x3679, B:680:0x3489, B:682:0x34ac, B:683:0x3506, B:663:0x3307, B:665:0x330d, B:666:0x3338, B:629:0x2fac, B:631:0x2fb2, B:632:0x2fdd, B:723:0x374f, B:725:0x3755, B:726:0x377f, B:728:0x37b9, B:729:0x37ff, B:513:0x27c1, B:515:0x27d6, B:516:0x2806, B:495:0x24a3, B:497:0x24a9, B:498:0x24d4, B:500:0x250e, B:501:0x2556, B:466:0x2154, B:468:0x2169, B:469:0x2198, B:471:0x21cc, B:472:0x224c, B:446:0x1ef2, B:448:0x1ef8, B:449:0x1f25, B:401:0x1c8d, B:403:0x1c93, B:404:0x1cbd, B:314:0x1719, B:316:0x171f, B:317:0x1749, B:244:0x1241, B:246:0x1247, B:247:0x1273, B:19:0x0264, B:21:0x026a, B:22:0x0298, B:24:0x04e2, B:26:0x0514, B:27:0x056e, B:251:0x1301, B:253:0x1307, B:254:0x1346, B:258:0x1360, B:260:0x1366, B:261:0x13ae, B:280:0x155e, B:288:0x15cc, B:294:0x1652, B:296:0x1658, B:297:0x1659, B:299:0x165b, B:301:0x1662, B:302:0x1663, B:263:0x13ba, B:270:0x1444, B:272:0x144a, B:273:0x148f, B:275:0x14b9, B:276:0x14ff, B:278:0x1515, B:279:0x1556, B:304:0x1665, B:306:0x166c, B:307:0x166d, B:265:0x13da, B:267:0x13ec, B:268:0x1438, B:290:0x15d2, B:284:0x1592, B:286:0x1598, B:287:0x15c5, B:160:0x0d5e, B:162:0x0d64, B:163:0x0da8, B:165:0x0db5, B:167:0x0dbe, B:168:0x0e02, B:191:0x101d, B:192:0x1021, B:194:0x1027, B:197:0x103e, B:203:0x1059, B:205:0x105c, B:217:0x113f, B:219:0x1145, B:220:0x1146, B:222:0x1148, B:224:0x114f, B:225:0x1150, B:169:0x0e0d, B:181:0x0f0f, B:183:0x0f15, B:184:0x0f51, B:186:0x0f7b, B:187:0x0fbe, B:189:0x0fd4, B:190:0x1017, B:229:0x115f, B:231:0x1165, B:232:0x1166, B:234:0x1168, B:236:0x116f, B:237:0x1170, B:171:0x0e2d, B:173:0x0e42, B:174:0x0e74, B:213:0x10bf, B:208:0x1088, B:210:0x108e, B:211:0x10b7, B:176:0x0e7b, B:178:0x0e97, B:179:0x0f03, B:532:0x2a32, B:534:0x2a38, B:535:0x2a75, B:537:0x2a9c, B:538:0x2ae4, B:540:0x2af8, B:542:0x2b01, B:543:0x2b44, B:576:0x2d96, B:577:0x2d9a, B:581:0x2dac, B:587:0x2dde, B:590:0x2deb, B:592:0x2dee, B:604:0x2ede, B:606:0x2ee4, B:607:0x2ee5, B:609:0x2ee7, B:611:0x2eee, B:612:0x2eef, B:584:0x2dc5, B:546:0x2b53, B:548:0x2b57, B:552:0x2b63, B:554:0x2b69, B:566:0x2c7e, B:568:0x2c84, B:569:0x2cc5, B:571:0x2cef, B:572:0x2d34, B:574:0x2d4a, B:575:0x2d90, B:614:0x2ef1, B:616:0x2ef8, B:617:0x2ef9, B:619:0x2efb, B:621:0x2f02, B:622:0x2f03, B:321:0x17d1, B:323:0x17d7, B:324:0x181d, B:326:0x182a, B:328:0x1833, B:329:0x187a, B:352:0x1a8b, B:353:0x1a8f, B:355:0x1a95, B:358:0x1aad, B:361:0x1ac3, B:363:0x1ac6, B:375:0x1ba9, B:377:0x1baf, B:378:0x1bb0, B:380:0x1bb2, B:382:0x1bb9, B:383:0x1bba, B:330:0x1885, B:342:0x197b, B:344:0x1981, B:345:0x19c4, B:347:0x19ee, B:348:0x1a30, B:350:0x1a46, B:351:0x1a85, B:386:0x1bc0, B:388:0x1bc7, B:389:0x1bc8, B:391:0x1bca, B:393:0x1bd1, B:394:0x1bd2, B:409:0x1d43, B:411:0x1d47, B:432:0x1e3b, B:434:0x1e41, B:435:0x1e42, B:437:0x1e44, B:439:0x1e4b, B:440:0x1e4c, B:415:0x1d53), top: B:769:0x0264, inners: #7, #10, #23, #35, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x1d5d  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x1d74 A[Catch: all -> 0x1e43, TryCatch #22 {all -> 0x1e43, blocks: (B:421:0x1d5f, B:423:0x1d74, B:424:0x1daa), top: B:785:0x1d5f, outer: #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x1dbd A[Catch: all -> 0x1e39, TryCatch #14 {all -> 0x1e39, blocks: (B:425:0x1db0, B:427:0x1dbd, B:428:0x1e31), top: B:770:0x1db0, outer: #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x1faf  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x2019  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x206f  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x2136  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x2376  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x2462  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x2688  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x26ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x27a0  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x2941  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x2dde A[Catch: all -> 0x2f04, PHI: r2 r4 r5
  0x2dde: PHI (r2v412 java.lang.Object[]) = (r2v411 java.lang.Object[]), (r2v434 java.lang.Object[]) binds: [B:585:0x2dda, B:582:0x2dc1] A[DONT_GENERATE, DONT_INLINE]
  0x2dde: PHI (r4v346 int) = (r4v345 int), (r4v359 int) binds: [B:585:0x2dda, B:582:0x2dc1] A[DONT_GENERATE, DONT_INLINE]
  0x2dde: PHI (r5v272 int) = (r5v271 int), (r5v281 int) binds: [B:585:0x2dda, B:582:0x2dc1] A[DONT_GENERATE, DONT_INLINE], TryCatch #23 {all -> 0x2f04, blocks: (B:532:0x2a32, B:534:0x2a38, B:535:0x2a75, B:537:0x2a9c, B:538:0x2ae4, B:540:0x2af8, B:542:0x2b01, B:543:0x2b44, B:576:0x2d96, B:577:0x2d9a, B:581:0x2dac, B:587:0x2dde, B:590:0x2deb, B:592:0x2dee, B:604:0x2ede, B:606:0x2ee4, B:607:0x2ee5, B:609:0x2ee7, B:611:0x2eee, B:612:0x2eef, B:584:0x2dc5, B:546:0x2b53, B:548:0x2b57, B:552:0x2b63, B:554:0x2b69, B:566:0x2c7e, B:568:0x2c84, B:569:0x2cc5, B:571:0x2cef, B:572:0x2d34, B:574:0x2d4a, B:575:0x2d90, B:614:0x2ef1, B:616:0x2ef8, B:617:0x2ef9, B:619:0x2efb, B:621:0x2f02, B:622:0x2f03, B:595:0x2e1a, B:597:0x2e20, B:598:0x2e4d, B:561:0x2bd9, B:563:0x2bf8, B:564:0x2c72, B:556:0x2b89, B:558:0x2b9e, B:559:0x2bd2, B:600:0x2e55), top: B:787:0x2a32, outer: #13, inners: #3, #8, #15, #42 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x3069  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x30ba  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x3118  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x32db  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x32e6  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x33c9  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x341c  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x346b  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x3632  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x3718  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:816:0x1d43 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:851:? A[RETURN, SYNTHETIC] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webviewui.ui.activity.WebViewActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$QdYOgdtuwXcaYpy1YifmFjIJIqU(WebViewActivity webViewActivity) {
        int i = 2 % 2;
        int i2 = copy + 99;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        webViewActivity.lambda$openUrl$0();
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
    }

    public static void $r8$lambda$RvQtkU11AXUXzDyqUOeE7gBQX7I(WebViewActivity webViewActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = copy + 51;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        webViewActivity.lambda$addObserver$2(resource);
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        int i5 = getRequestBeneficiariesState + 101;
        copy = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void $r8$lambda$qJWXnn4QdEQ7CHbPKt9hvjwvoYM(WebViewActivity webViewActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 93;
        copy = i2 % 128;
        int i3 = i2 % 2;
        m12143instrumented$0$setToolbar$V(webViewActivity, view);
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        int i5 = getRequestBeneficiariesState + 105;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 49 / 0;
        }
    }

    static SfcPaymentBaseActivity.ToolbarContainer m12142$$Nest$fgettoolbarContainer(WebViewActivity webViewActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 53;
        copy = i2 % 128;
        int i3 = i2 % 2;
        SfcPaymentBaseActivity.ToolbarContainer toolbarContainer = webViewActivity.toolbarContainer;
        if (i3 == 0) {
            return toolbarContainer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void m12143instrumented$0$setToolbar$V(WebViewActivity webViewActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 109;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                webViewActivity.lambda$setToolbar$1(view);
                Callback.onClick_exit();
                int i4 = 79 / 0;
            } else {
                webViewActivity.lambda$setToolbar$1(view);
                Callback.onClick_exit();
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 73;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 93;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 71;
        copy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = copy + 65;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        component4 = 0;
        component3();
        component3 = -8183716102632384482L;
        int i = getAsAtTimestamp + 49;
        component4 = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        component2 = 8087770695114137518L;
        copydefault = 1386857713;
        ShareDataUIState = (char) 50417;
        component1 = new char[]{49426, 34057, 18751, 3389, 53580, 38270, 22895, 7633, 57778, 42423, 27083, 11649, 61890, 46100, 30751, 15414, 32837, 17486, 2159, 52342, 37047, 21695, 6329, 56538, 41202, 25827, 29237, 13945, 64077, 48654, 25138, 9735, 59983, 44733, 21188, 5763, 55978, 40625, 17053, 1891, 52009, 36686, 13174, 63281, 47881, 32541, 9125, 59331, 43994, 28669, 4992, 55192, 38970, 23676, 6, 50289, 34922, 19550, 61617, 46241, 30924, 15577, 57526, 42121, 26831, 11577, 53570, 38228, 22828, 7485, 49424, 34279, 18936, 3482, 7743, 23078, 38427, 53764, 3698, 19035, 34394, 49827, 16062, 31363, 46829, 62178, 12005, 27453, 42794, 58143, 23134, 7748, 53802, 38458, 18948, 3682, 49705, 34446, 31396, 16098, 62103, 46732, 27297, 12038, 58139, 42799, 6930, 57088, 37687, 22318, 3009, 53235, 33771, 18378, 15294, 65442, 45069, 29771, 10342, 60486, 40973, 25657, 55518, 40128, 20727, 5346, 51328, 36023, 16551, 1371, 63860, 48482, 29001, 13583, 59683, 44502, 25035, 9640, 39312, 24018, 4586, 54691, 36416, 16930, 1596, 64026, 48737, 29301, 14045, 60110, 44769, 25281, 9947, 39613, 20897, 5554, 55689, 40347, 16891, 1473, 51673, 36134, 28929, 13584, 63842, 3138, 18512, 33895, 49278, 7199, 22564, 37945, 53448, 11503, 26868, 42126};
        equals = -5285669119253002142L;
    }
}
