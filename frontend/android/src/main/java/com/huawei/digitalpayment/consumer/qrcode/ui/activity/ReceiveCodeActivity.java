package com.huawei.digitalpayment.consumer.qrcode.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.blankj.utilcode.constant.CacheConstants;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.ColorUtils;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.DownloadQrCodeUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.Gloading;
import com.huawei.common.widget.dialog.DialogBox;
import com.huawei.common.widget.text.AmountDisplayView;
import com.huawei.digitalpayment.checkout.utils.ParameterUtils;
import com.huawei.digitalpayment.consumer.base.ui.base.SfcPaymentBaseActivity;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.pic.GlideApp;
import com.huawei.digitalpayment.consumer.baselib.util.CommonUtils;
import com.huawei.digitalpayment.consumer.baselib.util.DensityUtils;
import com.huawei.digitalpayment.consumer.baselib.util.ReceiptToolsUtils;
import com.huawei.digitalpayment.consumer.baselib.util.TimeUtils;
import com.huawei.digitalpayment.consumer.baselib.util.permission.IPermissionListenerWrap;
import com.huawei.digitalpayment.consumer.baselib.util.permission.PermissionsHelper;
import com.huawei.digitalpayment.consumer.qrcode.bean.GetQrCodeResp;
import com.huawei.digitalpayment.consumer.qrcode.databinding.ActivityReceiveCodeBinding;
import com.huawei.digitalpayment.consumer.qrcode.utils.QrCodeUtils;
import com.huawei.digitalpayment.consumer.qrcode.viewmodel.ReceiveCodeViewModel;
import com.huawei.image.glide.Base64Mode;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.mpesa.lifestyle.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.CharUtils;

public class ReceiveCodeActivity extends Hilt_ReceiveCodeActivity<ActivityReceiveCodeBinding, ReceiveCodeViewModel> {
    private Gloading.Holder holder;
    public boolean isLoading;
    private static final byte[] $$l = {TarHeader.LF_CHR, -113, 92, 4};
    private static final int $$o = 59;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {102, Ascii.FF, 98, 84, 9, -62, 71, -10, -1, 5, 20, -8, Ascii.DLE, -14, Ascii.SYN, -71, 62, 8, 9, -12, Ascii.DLE, -1, -10, Ascii.SO, -59, 68, 4, -8, Ascii.DLE, -14, Ascii.SYN, -2, 6, 4, -66, 59, 9, 6, Ascii.VT, -19, 4, 13, -4, -52, Ascii.ESC, 41, 6, Ascii.VT, -19, 4, 13, -4, -14, Ascii.DLE, 13, -3, -11, 20, 4, 6, -4, -62, 66, Ascii.SI, 4, Ascii.FF, -18, 4, 4, -2, Ascii.ETB, -6, Ascii.VT, Ascii.SI, 1, 6, 2, 2, -6, Ascii.FF, 9, -63, Ascii.SI, 1, 6, 2, 2, -6, Ascii.FF, 9, -62, 7, 8, -5, 0, 8, 13, -71, 56, Ascii.SI, 6, 0, 9, 2, -8, 8, -6, 17, -66, 56, 8, -4, Ascii.DLE, 3, -6, 10, 10, -66, 37, 37, 0, -8, 20, -15, 5, Ascii.DLE, -28, 19, Ascii.SI, 4, -8, -62, 35, 36, 4, -2, Ascii.ETB, -6, Ascii.VT, -40, 39, 6, -1, 10};
    private static final int $$k = 132;
    private static final byte[] $$d = {60, -123, -116, -1, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 254;
    private static int copy = 0;
    private static int component4 = 1;
    private static long ShareDataUIState = -2671660807015491569L;
    private static int component2 = 1386857713;
    private static char copydefault = 50417;
    private static char[] component3 = {1977, 1962, 1985, 2036, 2024, 2041, 2005, 2037, 2029, 2004, 1965, 1976, 2038, 2023, 1975, 1973, 2030, 1971, 2019, 1980, 2022, 2028, 2017, 2025, 1978, 1992, 1968, 1963, 2003, 1972, 1987, 2035, 1966, 2018, 2033, 1974, 2021, 2026, 1970, 1967, 2020, 1960, 2034, 1982, 1983, 1981, 1969, 2032, 2031};
    private static char component1 = 12829;
    private String nextRefreshTime = "0";
    private Handler handler = new Handler();
    private final Runnable runnable = new Runnable() {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.AnonymousClass5.component3
                int r1 = r1 + 103
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.AnonymousClass5.ShareDataUIState = r2
                int r1 = r1 % r0
                java.lang.String r2 = "0"
                if (r1 == 0) goto L2c
                com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity r1 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.this
                androidx.lifecycle.ViewModel r1 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.access$000(r1)
                com.huawei.digitalpayment.consumer.qrcode.viewmodel.ReceiveCodeViewModel r1 = (com.huawei.digitalpayment.consumer.qrcode.viewmodel.ReceiveCodeViewModel) r1
                r1.refreshQrCode()
                com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity r1 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.this
                java.lang.String r1 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.m10905$$Nest$fgetnextRefreshTime(r1)
                boolean r1 = r2.equals(r1)
                r2 = 23
                int r2 = r2 / 0
                if (r1 != 0) goto L84
                goto L43
            L2c:
                com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity r1 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.this
                androidx.lifecycle.ViewModel r1 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.access$000(r1)
                com.huawei.digitalpayment.consumer.qrcode.viewmodel.ReceiveCodeViewModel r1 = (com.huawei.digitalpayment.consumer.qrcode.viewmodel.ReceiveCodeViewModel) r1
                r1.refreshQrCode()
                com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity r1 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.this
                java.lang.String r1 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.m10905$$Nest$fgetnextRefreshTime(r1)
                boolean r1 = r2.equals(r1)
                if (r1 != 0) goto L84
            L43:
                int r1 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.AnonymousClass5.component3
                int r1 = r1 + 99
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.AnonymousClass5.ShareDataUIState = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L68
                com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity r1 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.this
                java.lang.String r1 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.m10905$$Nest$fgetnextRefreshTime(r1)
                long r1 = java.lang.Long.parseLong(r1)
                java.util.Date r3 = com.huawei.digitalpayment.consumer.baselib.util.TimeUtils.getServerTimeFromUTC()
                long r3 = r3.getTime()
                com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity r5 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.this
                android.os.Handler r5 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.m10904$$Nest$fgethandler(r5)
                long r1 = r1 ^ r3
                goto L81
            L68:
                com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity r1 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.this
                java.lang.String r1 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.m10905$$Nest$fgetnextRefreshTime(r1)
                long r1 = java.lang.Long.parseLong(r1)
                java.util.Date r3 = com.huawei.digitalpayment.consumer.baselib.util.TimeUtils.getServerTimeFromUTC()
                long r3 = r3.getTime()
                com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity r5 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.this
                android.os.Handler r5 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.m10904$$Nest$fgethandler(r5)
                long r1 = r1 - r3
            L81:
                r5.postDelayed(r6, r1)
            L84:
                int r1 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.AnonymousClass5.ShareDataUIState
                int r1 = r1 + 119
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.AnonymousClass5.component3 = r2
                int r1 = r1 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.AnonymousClass5.run():void");
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r6, short r7, short r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.$$l
            int r6 = r6 * 3
            int r1 = r6 + 1
            int r8 = 119 - r8
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L28:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.$$r(int, short, short):java.lang.String");
    }

    private static void h(byte b2, short s, int i, Object[] objArr) {
        int i2 = i + 4;
        int i3 = 103 - (b2 * 2);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[s + 4];
        int i4 = s + 3;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i4 + i2) - 8;
            i2++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i2;
            i3 = (i3 + bArr[i2]) - 8;
            i2 = i7 + 1;
            i5 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r0 = 70 - r8
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.$$j
            int r6 = r6 * 2
            int r6 = r6 + 99
            byte[] r0 = new byte[r0]
            int r8 = 69 - r8
            r2 = 0
            if (r1 != 0) goto L19
            r6 = r7
            r4 = r8
            r3 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L31:
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-3)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.i(int, byte, int, java.lang.Object[]):void");
    }

    static ViewModel access$000(ReceiveCodeActivity receiveCodeActivity) {
        int i = 2 % 2;
        int i2 = copy + 7;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        VM vm = receiveCodeActivity.viewModel;
        int i4 = component4 + 103;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return vm;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static ViewDataBinding access$100(ReceiveCodeActivity receiveCodeActivity) {
        int i = 2 % 2;
        int i2 = component4 + 101;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = receiveCodeActivity.binding;
        int i4 = copy + 39;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return binding;
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
            int i5 = $11 + 57;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 4038;
                    int mode = View.MeasureSpec.getMode(i4) + 31;
                    char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 19181);
                    byte b2 = (byte) i4;
                    byte b3 = b2;
                    String str$$r = $$r(b2, b3, (byte) (b3 | 20));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, mode, trimmedLength, 1912513118, false, str$$r, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 7566, (ExpandableListView.getPackedPositionForGroup(i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i4) == 0L ? 0 : -1)) + 11, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i7 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i7);
                objArr4[i4] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) i4;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2460 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 28 - View.resolveSize(i4, i4), (char) ((-1) - Process.getGidForName("")), 931716605, false, $$r(b4, b5, (byte) (b5 | Ascii.NAK)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7566 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 10 - TextUtils.lastIndexOf("", '0', 0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (ShareDataUIState ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) copydefault) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
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
        String str = new String(cArr6);
        int i8 = $10 + 121;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    private static void g(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component3;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = $11 + 63;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7422 - (ViewConfiguration.getScrollDefaultDelay() >> 16), View.getDefaultSize(0, 0) + 15, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(component1)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - View.combineMeasuredStates(0, 0), TextUtils.indexOf("", "") + 15, (char) (64291 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7117 - TextUtils.indexOf("", "", 0, 0), 15 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 44464), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2943 - TextUtils.lastIndexOf("", '0', 0), 23 - TextUtils.lastIndexOf("", '0'), (char) (27637 - ExpandableListView.getPackedPositionType(0L)), 794909189, false, $$r(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i7 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i7];
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            int i8 = $11 + 35;
                            $10 = i8 % 128;
                            int i9 = i8 % 2;
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i10 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i11 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i10];
                            cArr4[cancelall.component2 + 1] = cArr2[i11];
                            int i12 = $11 + 19;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                        } else {
                            int i14 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i15 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i14];
                            cArr4[cancelall.component2 + 1] = cArr2[i15];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
            }
        }
        int i16 = $10 + 55;
        $11 = i16 % 128;
        int i17 = i16 % 2;
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        char c2;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        f(new char[]{29671, 54211, 40837, 63134, 18853, 409, 14776, 39687, 35377, 8368, 55020, 28362, 365, 60466, 9193, 16756, 44300, 54571}, TextUtils.indexOf("", "", 0), new char[]{56574, 65323, 20959, 4453}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952832_res_0x7f1304c0).substring(0, 1).length() + 23830), new char[]{65165, 12258, 6033, 41821}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952721_res_0x7f130451).substring(6, 7).codePointAt(0) - 27, new char[]{'\f', 1, 2, 27, 13825}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952856_res_0x7f1304d8).substring(9, 10).codePointAt(0) - 29), objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = component4 + 25;
                copy = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(20) - 82, new char[]{23, 15, '#', '/', AbstractJsonLexerKt.COMMA, 27, '\'', '!', JSONLexer.EOI, '+', '.', '!', 4, 16, 2, 24, '\t', JSONLexer.EOI, 4, 6, 11, 2, '+', '#', JSONLexer.EOI, '$'}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 17), objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 84, new char[]{14, 11, 13817, 13817, '%', 15, 4, 3, 13819, 13819, 22, 24, 15, 25, 2, 24, AbstractJsonLexerKt.COMMA, 20}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952715_res_0x7f13044b).substring(6, 7).codePointAt(0) - 15), objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - View.MeasureSpec.getSize(0), 42 - Color.red(0), (char) ExpandableListView.getPackedPositionType(0L), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    g((ViewConfiguration.getLongPressTimeout() >> 16) + 48, new char[]{21, 1, '0', 18, '*', 21, 15, '\'', 25, 19, '*', 7, 3, 14, '%', '$', ' ', '/', 13856, 13856, 24, 15, '$', '%', ' ', '\b', 15, '\"', 29, JSONLexer.EOI, 13933, 13933, '+', 29, 25, '/', '#', 3, 15, 25, '$', 28, 22, 19, 28, 15, 30, '\"'}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952785_res_0x7f130491).substring(2, 3).codePointAt(0) + 81), objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952810_res_0x7f1304aa).substring(9, 10).codePointAt(0) + 32, new char[]{'\'', ')', 18, '-', 22, '!', 13878, 13878, ')', 17, '+', ' ', 7, '*', 13878, 13878, 19, 24, '\f', ' ', 27, 19, 24, 19, 18, 25, Typography.amp, 19, '\'', 7, '(', 28, 25, '\f', 19, ' ', '%', ')', 4, 25, 25, 18, 4, '*', 14, 16, 18, '+', ')', '\'', JSONLexer.EOI, 29, 18, 7, 18, CharUtils.CR, Typography.amp, 14, 4, 7, 14, 3, '*', 7}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 32), objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952716_res_0x7f13044c).substring(6, 7).length() + 63, new char[]{27, 19, '\f', '\'', '*', '\'', '$', 17, '\'', 14, 19, 14, 19, 21, 19, 29, '\'', 15, 13785, 13785, '#', 17, 7, '\'', '!', '$', Typography.amp, 14, Typography.amp, 19, 18, 14, 21, '(', 19, 25, '/', '\'', '\b', '\'', 21, '*', 7, 21, 21, 5, '\'', 17, '*', 18, 14, 4, '/', 25, '!', '(', 29, '+', '\n', '\'', '$', 28, 16, 19}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 13), objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131953368_res_0x7f1306d8).substring(0, 6).length() + 66, new char[]{5, 4, 5, '-', Typography.amp, 31, 13763, 13763, '$', 14, 7, 18, 18, 14, '$', 22, '*', '\'', 13750, 13750, 28, 15, 19, ' ', 31, 4, 0, '.', '+', 29, 4, 17, 24, 29, 4, 31, 7, '\b', 21, '+', Typography.amp, '!', 28, CharUtils.CR, 21, '+', '\'', 29, 20, '.', 11, '$', JSONLexer.EOI, '+', 25, '%', 30, 23, '\b', ')', Typography.amp, '\n', '(', 11, '\'', '(', '(', '\b', '%', 15, '\n', Typography.amp}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954889_res_0x7f130cc9).substring(0, 1).length() + 13), objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f(new char[]{37091, 54172, 46083, 28892, 34272, 16049}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131953980_res_0x7f13093c).substring(0, 4).length() - 4, new char[]{56574, 65323, 20959, 4453}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 7808), new char[]{38237, 51844, 40199, 28702}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952719_res_0x7f13044f).substring(6, 7).length() + 35, new char[]{'\'', '/', 21, '$', 31, 15, 28, '(', '\f', 24, 25, '\f', 24, '\f', '$', 22, 14, '$', '\b', 24, '!', 22, 31, '\f', '$', '%', '$', '+', '\b', ' ', 7, '*', 29, '$', 19, 21}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 50), objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.makeMeasureSpec(0, 0) + 6562, (-16777160) - Color.rgb(0, 0, 0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2405;
            int i4 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25;
            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            byte[] bArr = $$d;
            byte b2 = bArr[31];
            byte b3 = bArr[33];
            Object[] objArr13 = new Object[1];
            h(b2, b3, b3, objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(maximumFlingVelocity, i4, capsMode, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int bitsPerPixel = 2404 - ImageFormat.getBitsPerPixel(0);
                int iRed = 26 + Color.red(0);
                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                byte[] bArr2 = $$d;
                Object[] objArr14 = new Object[1];
                h(bArr2[31], bArr2[8], bArr2[67], objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(bitsPerPixel, iRed, keyRepeatDelay, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
            c2 = 2;
        } else {
            Object[] objArr15 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 13, new char[]{'$', 23, '\b', JSONLexer.EOI, 28, 25, 23, 15, 11, '\"', '!', 0, Typography.amp, '\n', '+', 15}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(17) - 58), objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            g(TextUtils.lastIndexOf("", '0') + 17, new char[]{JSONLexer.EOI, '%', '%', 15, 2, 24, 4, 6, JSONLexer.EOI, 23, ' ', 3, '\"', AbstractJsonLexerKt.COMMA, ')', '%'}, (byte) (90 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 1307064395};
                byte[] bArr3 = $$j;
                byte b4 = bArr3[113];
                byte b5 = bArr3[94];
                Object[] objArr18 = new Object[1];
                i(b4, b5, b5, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                i(bArr3[94], bArr3[70], bArr3[63], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    byte[] bArr4 = $$d;
                    Object[] objArr20 = new Object[1];
                    h(bArr4[31], bArr4[8], bArr4[67], objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 2406, 27 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    f(new char[]{51608, 58746, 25475, 20904, 40348, 19347, 3789, 38791, 53125, 10483, 59091, 25612, 919, 36203, 39488, 10153, 23216, 25597, 18965, 28649, 24318, 31573}, TextUtils.indexOf("", "", 0), new char[]{56574, 65323, 20959, 4453}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952792_res_0x7f130498).substring(2, 3).codePointAt(0) - 32), new char[]{14878, 15391, 59401, 46127}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    f(new char[]{61751, 12577, 20621, 44375, 13181, 56748, 12165, 15483, 41000, 10628, 55887, '!', 22479, 46615, 37816}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(27) - 963805261, new char[]{56574, 65323, 20959, 4453}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952785_res_0x7f130491).substring(2, 3).length() + 22219), new char[]{8175, 36224, 52422, 37974}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2406;
                        int doubleTapTimeout = 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        Object[] objArr23 = new Object[1];
                        h(r8[33], (byte) (-$$d[38]), r8[21], objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, doubleTapTimeout, cNormalizeMetaState, -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 2405;
                        int jumpTapTimeout = 26 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                        byte[] bArr5 = $$d;
                        byte b6 = bArr5[31];
                        byte b7 = bArr5[33];
                        Object[] objArr24 = new Object[1];
                        h(b6, b7, b7, objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(threadPriority, jumpTapTimeout, cRgb, -2047739879, false, (String) objArr24[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
                    int i5 = copy + 5;
                    component4 = i5 % 128;
                    c2 = 2;
                    int i6 = i5 % 2;
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
        int i7 = ((int[]) objArr[0])[0];
        int i8 = ((int[]) objArr[c2])[0];
        if (i8 != i7) {
            long j = -1;
            long j2 = ((long) (i8 ^ i7)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6666 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 42, (char) Color.argb(0, 0, 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            int i9 = copy + 35;
            component4 = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr25 = {1375795878, Long.valueOf(j4), arrayList, null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.lastIndexOf("", '0') + 57, (char) View.resolveSizeAndState(0, 0, 0));
                byte b8 = $$j[94];
                Object[] objArr26 = new Object[1];
                i(b8, (byte) (b8 | Ascii.SUB), r3[63], objArr26);
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
        ((ReceiveCodeViewModel) this.viewModel).getQrCodeList(((ReceiveCodeViewModel) this.viewModel).getAmount().getValue(), ((ReceiveCodeViewModel) this.viewModel).getNote());
        getHeadBitmap();
        addObserver();
    }

    private void lambda$initView$0(View view) {
        int i = 2 % 2;
        int i2 = copy + 75;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        saveImage();
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        int i5 = component4 + 111;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
    }

    private void initView() {
        int i = 2 % 2;
        getWindow().setBackgroundDrawable(new ColorDrawable(ColorUtils.getColor(com.huawei.digitalpayment.consumer.qrcode.R.color.colorPrimary)));
        ((ActivityReceiveCodeBinding) this.binding).tvName.setText(((ReceiveCodeViewModel) this.viewModel).getFullName());
        ((ActivityReceiveCodeBinding) this.binding).tvSaveImage.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component1 + 65;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ReceiveCodeActivity.m10901$r8$lambda$SNMOAboJqpbPKcaq1PrWd9S44M(this.f$0, view);
                int i5 = copydefault + 51;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((ActivityReceiveCodeBinding) this.binding).llRecord.setOnClickListener(new View.OnClickListener() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 73;
                component3 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    ReceiveCodeActivity.$r8$lambda$eLZVkyMI79VEYgAwKwVBh4SsFLI(this.f$0, view);
                    throw null;
                }
                ReceiveCodeActivity.$r8$lambda$eLZVkyMI79VEYgAwKwVBh4SsFLI(this.f$0, view);
                int i4 = copydefault + 81;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = copy + 23;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    private void lambda$initView$1(View view) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putString("fromReceiveCodeActivity", getString(com.huawei.digitalpayment.consumer.qrcode.R.string.receive_code_button3));
        RouteUtils.routeWithExecute(this, RoutePathConstants.HISTORY_RECORD, bundle);
        int i2 = component4 + 67;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void showLoading() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.copy
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.component4 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            com.huawei.common.widget.Gloading$Holder r1 = r3.holder
            r2 = 73
            int r2 = r2 / 0
            if (r1 != 0) goto L3d
            goto L1b
        L17:
            com.huawei.common.widget.Gloading$Holder r1 = r3.holder
            if (r1 != 0) goto L3d
        L1b:
            com.huawei.common.widget.Gloading r1 = com.huawei.common.widget.Gloading.getDefault()
            Binding extends androidx.databinding.ViewDataBinding r2 = r3.binding
            com.huawei.digitalpayment.consumer.qrcode.databinding.ActivityReceiveCodeBinding r2 = (com.huawei.digitalpayment.consumer.qrcode.databinding.ActivityReceiveCodeBinding) r2
            com.huawei.common.widget.round.RoundImageView r2 = r2.ivQr
            com.huawei.common.widget.Gloading$Holder r1 = r1.wrap(r2)
            com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity$$ExternalSyntheticLambda0 r2 = new com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity$$ExternalSyntheticLambda0
            r2.<init>()
            com.huawei.common.widget.Gloading$Holder r1 = r1.withRetry(r2)
            r3.holder = r1
            int r1 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.component4
            int r1 = r1 + 59
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.copy = r2
            int r1 = r1 % r0
        L3d:
            com.huawei.common.widget.Gloading$Holder r1 = r3.holder
            r1.showLoading()
            r1 = 1
            r3.isLoading = r1
            Binding extends androidx.databinding.ViewDataBinding r2 = r3.binding
            com.huawei.digitalpayment.consumer.qrcode.databinding.ActivityReceiveCodeBinding r2 = (com.huawei.digitalpayment.consumer.qrcode.databinding.ActivityReceiveCodeBinding) r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.setIsLoading(r1)
            int r1 = com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.component4
            int r1 = r1 + 101
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.copy = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L5c
            return
        L5c:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.showLoading():void");
    }

    private void retry() {
        int i = 2 % 2;
        int i2 = component4 + 117;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            ((ReceiveCodeViewModel) this.viewModel).getQrCodeList(((ReceiveCodeViewModel) this.viewModel).getAmount().getValue(), ((ReceiveCodeViewModel) this.viewModel).getNote());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ((ReceiveCodeViewModel) this.viewModel).getQrCodeList(((ReceiveCodeViewModel) this.viewModel).getAmount().getValue(), ((ReceiveCodeViewModel) this.viewModel).getNote());
        int i3 = component4 + 81;
        copy = i3 % 128;
        int i4 = i3 % 2;
    }

    public void showLoadSuccess() {
        int i = 2 % 2;
        int i2 = component4 + 13;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        Gloading.Holder holder = this.holder;
        if (holder != null) {
            int i5 = i3 + 23;
            component4 = i5 % 128;
            if (i5 % 2 != 0) {
                holder.showLoadSuccess();
            } else {
                holder.showLoadSuccess();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        this.isLoading = false;
        ((ActivityReceiveCodeBinding) this.binding).setIsLoading(false);
    }

    public void showLoadError() {
        int i = 2 % 2;
        int i2 = copy + 35;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            Gloading.Holder holder = this.holder;
            if (holder != null) {
                holder.showLoadFailed();
                int i3 = copy + 125;
                component4 = i3 % 128;
                int i4 = i3 % 2;
            }
            this.isLoading = false;
            ((ActivityReceiveCodeBinding) this.binding).setIsLoading(false);
            return;
        }
        throw null;
    }

    private void lambda$addObserver$2(Resource resource) {
        int i = 2 % 2;
        if (resource.loading()) {
            showLoading();
            return;
        }
        if (resource.error()) {
            int i2 = copy + 95;
            component4 = i2 % 128;
            if (i2 % 2 != 0) {
                ToastUtils.showShort(resource.getMessage());
                showLoadError();
                return;
            } else {
                ToastUtils.showShort(resource.getMessage());
                showLoadError();
                throw null;
            }
        }
        showLoadSuccess();
        if (resource.success()) {
            int i3 = component4 + 23;
            copy = i3 % 128;
            int i4 = i3 % 2;
            if (resource.getData() != null) {
                int i5 = component4 + 71;
                copy = i5 % 128;
                int i6 = i5 % 2;
                ((ReceiveCodeViewModel) this.viewModel).refreshQrCode();
                this.handler.removeCallbacks(this.runnable);
                this.handler.postDelayed(this.runnable, Long.parseLong(this.nextRefreshTime) - TimeUtils.getServerTimeFromUTC().getTime());
            }
        }
    }

    private void lambda$addObserver$4(final String str) {
        int i = 2 % 2;
        int i2 = component4 + 37;
        copy = i2 % 128;
        int i3 = i2 % 2;
        if (!TextUtils.isEmpty(str)) {
            ((ActivityReceiveCodeBinding) this.binding).ivQr.post(new Runnable() {
                private static int component2 = 0;
                private static int component3 = 1;

                @Override
                public final void run() {
                    int i4 = 2 % 2;
                    int i5 = component2 + 53;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                    ReceiveCodeActivity.m10902$r8$lambda$XysafG2sIClpYxpuiXijwJ1TjU(this.f$0, str);
                    int i7 = component3 + 73;
                    component2 = i7 % 128;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                }
            });
        }
        int i4 = copy + 107;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void lambda$addObserver$3(String str) {
        int i = 2 % 2;
        int i2 = component4 + 85;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Bitmap bitmapGenerateBitmap = QrCodeUtils.generateBitmap(str, ((ActivityReceiveCodeBinding) this.binding).ivQr.getMeasuredWidth(), ((ActivityReceiveCodeBinding) this.binding).ivQr.getMeasuredWidth(), DensityUtils.dp2px(this, 14.0f));
        ((ReceiveCodeViewModel) this.viewModel).setQrCodeBitMap(QrCodeUtils.generateBitmap(str, ((ActivityReceiveCodeBinding) this.binding).ivQr.getMeasuredWidth(), ((ActivityReceiveCodeBinding) this.binding).ivQr.getMeasuredWidth(), 0.0f));
        ((ActivityReceiveCodeBinding) this.binding).ivQr.setImageBitmap(bitmapGenerateBitmap);
        int i4 = component4 + 53;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    private void lambda$addObserver$5(String str) {
        int i = 2 % 2;
        int i2 = component4 + 69;
        copy = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(str) || ParameterUtils.isValidAmount(str)) {
            ((ReceiveCodeViewModel) this.viewModel).getQrCodeList(str, ((ReceiveCodeViewModel) this.viewModel).getNote());
            return;
        }
        reSet();
        ((ReceiveCodeViewModel) this.viewModel).setAmountAndNote("", "");
        ToastUtils.showShort(com.huawei.digitalpayment.consumer.qrcode.R.string.the_amount_is_illegal);
        int i4 = component4 + 15;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private void lambda$addObserver$6(String str) {
        int i = 2 % 2;
        int i2 = component4 + 125;
        copy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            resetReceiveCode(str, ((ReceiveCodeViewModel) this.viewModel).getNote());
            obj.hashCode();
            throw null;
        }
        resetReceiveCode(str, ((ReceiveCodeViewModel) this.viewModel).getNote());
        int i3 = component4 + 19;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void addObserver() {
        int i = 2 % 2;
        ((ReceiveCodeViewModel) this.viewModel).getData().observe(this, new Observer() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 99;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                ReceiveCodeActivity.$r8$lambda$fWzX6GFuD149GBjuPiqaxH00drE(this.f$0, (Resource) obj);
                int i5 = ShareDataUIState + 43;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((ReceiveCodeViewModel) this.viewModel).getMQrCode().observe(this, new Observer() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 109;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                ReceiveCodeActivity.$r8$lambda$GkOSsM_B44OPUCZuJJPq9EtkMs4(this.f$0, (String) obj);
                if (i4 != 0) {
                    throw null;
                }
            }
        });
        ((ReceiveCodeViewModel) this.viewModel).getAmount().observe(this, new Observer() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 69;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ReceiveCodeActivity.$r8$lambda$hnmD5mRh77Yb2N2jblWEcRwXVO4(this.f$0, (String) obj);
                if (i4 != 0) {
                    throw null;
                }
            }
        });
        ((ReceiveCodeViewModel) this.viewModel).getAmountDisplay().observe(this, new Observer() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 117;
                component3 = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 != 0) {
                    ReceiveCodeActivity.$r8$lambda$cLKJJo9rL6VW13vSoxICXyspz6U(this.f$0, (String) obj);
                    obj2.hashCode();
                    throw null;
                }
                ReceiveCodeActivity.$r8$lambda$cLKJJo9rL6VW13vSoxICXyspz6U(this.f$0, (String) obj);
                int i4 = component3 + 63;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }
        });
        ((ReceiveCodeViewModel) this.viewModel).getQrCode().observe(this, new Observer() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 17;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                ReceiveCodeActivity.m10903$r8$lambda$bgqnL97DdkXWeoo3EWNzmVvGJ8(this.f$0, (GetQrCodeResp.QrCode) obj);
                int i5 = component3 + 113;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = copy + 115;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void lambda$addObserver$7(GetQrCodeResp.QrCode qrCode) {
        int i = 2 % 2;
        int i2 = copy + 71;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        refreshQrCode(qrCode);
        int i4 = copy + 51;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
    }

    private void saveImage() {
        int i = 2 % 2;
        if (this.isLoading) {
            int i2 = copy + 3;
            component4 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            downloadQrCode();
            int i4 = component4 + 113;
            copy = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    private void getHeadBitmap() {
        int i = 2 % 2;
        String avatar = ((ReceiveCodeViewModel) this.viewModel).getAvatar();
        ((ActivityReceiveCodeBinding) this.binding).ivHead.setImageResource(com.huawei.digitalpayment.consumer.qrcode.R.mipmap.icon_default);
        GlideApp.with((FragmentActivity) this).asBitmap().load((Object) Base64Mode.getConsumerMode(avatar)).into(new CustomTarget<Bitmap>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onResourceReady(Object obj, Transition transition) {
                int i2 = 2 % 2;
                int i3 = component3 + 27;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                component2((Bitmap) obj, transition);
                int i5 = component1 + 5;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void component2(Bitmap bitmap, Transition<? super Bitmap> transition) {
                int i2 = 2 % 2;
                int i3 = component3 + 57;
                component1 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    ((ActivityReceiveCodeBinding) ReceiveCodeActivity.access$100(ReceiveCodeActivity.this)).ivHead.setImageBitmap(bitmap);
                    obj.hashCode();
                    throw null;
                }
                ((ActivityReceiveCodeBinding) ReceiveCodeActivity.access$100(ReceiveCodeActivity.this)).ivHead.setImageBitmap(bitmap);
                int i4 = component1 + 119;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onLoadCleared(Drawable drawable) {
                int i2 = 2 % 2;
                int i3 = component3 + 103;
                component1 = i3 % 128;
                int i4 = i3 % 2;
            }
        });
        int i2 = component4 + 83;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    private void downloadQrCode() {
        int i = 2 % 2;
        View viewInflate = LayoutInflater.from(this).inflate(com.huawei.digitalpayment.consumer.qrcode.R.layout.layout_download_qr_code, (ViewGroup) null, false);
        viewInflate.setLayoutDirection(getResources().getConfiguration().getLayoutDirection());
        ImageView imageView = (ImageView) viewInflate.findViewById(com.huawei.digitalpayment.consumer.qrcode.R.id.iv_qr);
        if (imageView != null) {
            imageView.setImageBitmap(((ReceiveCodeViewModel) this.viewModel).getMQrCodeBitmap());
        }
        ImageView imageView2 = (ImageView) viewInflate.findViewById(com.huawei.digitalpayment.consumer.qrcode.R.id.iv_head);
        if (imageView2 != null) {
            imageView2.setImageDrawable(((ActivityReceiveCodeBinding) this.binding).ivHead.getDrawable());
            int i2 = copy + 65;
            component4 = i2 % 128;
            int i3 = i2 % 2;
        }
        TextView textView = (TextView) viewInflate.findViewById(com.huawei.digitalpayment.consumer.qrcode.R.id.tvNotes);
        AmountDisplayView amountDisplayView = (AmountDisplayView) viewInflate.findViewById(com.huawei.digitalpayment.consumer.qrcode.R.id.amountDisplayView);
        View viewFindViewById = viewInflate.findViewById(com.huawei.digitalpayment.consumer.qrcode.R.id.emptyView);
        if (!TextUtils.isEmpty(((ActivityReceiveCodeBinding) this.binding).amountDisplayView.getAmountView().getText())) {
            amountDisplayView.setVisibility(0);
            viewFindViewById.setVisibility(8);
            amountDisplayView.setAmount(((ActivityReceiveCodeBinding) this.binding).amountDisplayView.getAmountView().getText().toString());
            amountDisplayView.setUnit(((ActivityReceiveCodeBinding) this.binding).amountDisplayView.getUnitView().getText().toString());
        } else {
            amountDisplayView.setVisibility(8);
            viewFindViewById.setVisibility(0);
        }
        if (!TextUtils.isEmpty(((ActivityReceiveCodeBinding) this.binding).tvNotes.getText())) {
            textView.setVisibility(0);
            textView.setText(((ActivityReceiveCodeBinding) this.binding).tvNotes.getText());
        } else {
            textView.setVisibility(8);
        }
        ((TextView) viewInflate.findViewById(com.huawei.digitalpayment.consumer.qrcode.R.id.tv_will)).setText(((ReceiveCodeViewModel) this.viewModel).getFullName());
        saveBitmap(DownloadQrCodeUtils.generateImageFromView(viewInflate, DensityUtils.dp2px(this, 360.0f), DensityUtils.dp2px(this, 780.0f)));
        int i4 = component4 + 53;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
    }

    private void saveBitmap(final Bitmap bitmap) {
        int i = 2 % 2;
        PermissionsHelper.init(this.activity).requestWriteStoragePermission(new IPermissionListenerWrap.IPermissionListener() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public final void onAccepted(boolean z) {
                int i2 = 2 % 2;
                int i3 = copydefault + 79;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    ReceiveCodeActivity.$r8$lambda$OObp78UNBRRvvueT7OTDsSr8jwc(this.f$0, bitmap, z);
                    int i4 = 74 / 0;
                } else {
                    ReceiveCodeActivity.$r8$lambda$OObp78UNBRRvvueT7OTDsSr8jwc(this.f$0, bitmap, z);
                }
                int i5 = copydefault + 55;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = copy + 89;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void lambda$saveBitmap$8(Bitmap bitmap, boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = copy + 43;
        int i4 = i3 % 128;
        component4 = i4;
        int i5 = i3 % 2;
        if (z) {
            int i6 = i4 + 91;
            copy = i6 % 128;
            int i7 = i6 % 2;
            if (ReceiptToolsUtils.saveImageToGallery(this, bitmap)) {
                DialogBox.builder().setTitle(getString(com.huawei.digitalpayment.consumer.qrcode.R.string.receive_code_title8)).setContent(getString(com.huawei.digitalpayment.consumer.qrcode.R.string.receive_code_tip1)).setRightButtonText(getString(com.huawei.digitalpayment.consumer.qrcode.R.string.ok)).setSingleButton(true).build().show(getSupportFragmentManager(), "saved_qr_code");
                return;
            } else {
                ToastUtils.showShort(getString(com.huawei.digitalpayment.consumer.qrcode.R.string.qrcode_saved_qr_code_fail));
                i = component4 + 43;
                copy = i % 128;
            }
        } else {
            AppUtils.launchAppDetailsSettings();
            i = copy + 49;
            component4 = i % 128;
        }
        int i8 = i % 2;
    }

    public void onViewClick(View view) {
        int i = 2 % 2;
        int i2 = copy + 69;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        if (this.isLoading) {
            return;
        }
        if (view.getId() == com.huawei.digitalpayment.consumer.qrcode.R.id.tv_set_amount) {
            int i4 = component4 + 71;
            copy = i4 % 128;
            int i5 = i4 % 2;
            if (((ActivityReceiveCodeBinding) this.binding).amountDisplayView.getVisibility() == 0) {
                ((ReceiveCodeViewModel) this.viewModel).setAmountAndNote("", "");
            } else {
                RouteUtils.routeWithExecute(this, RoutePathConstants.SET_AMOUNT, null, null, null, 0, 9999);
            }
        }
        int i6 = copy + 41;
        component4 = i6 % 128;
        int i7 = i6 % 2;
    }

    private void resetReceiveCode(String str, String str2) {
        int i = 2 % 2;
        int i2 = component4 + 43;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 8;
        if (TextUtils.isEmpty(str)) {
            ((ActivityReceiveCodeBinding) this.binding).tvSetAmount.setText(getResources().getString(com.huawei.digitalpayment.consumer.qrcode.R.string.receive_code_button1));
            ((ActivityReceiveCodeBinding) this.binding).amountDisplayView.setVisibility(8);
            ((ActivityReceiveCodeBinding) this.binding).amountDisplayView.setUnit("");
            ((ActivityReceiveCodeBinding) this.binding).amountDisplayView.setAmount(str);
            ((ActivityReceiveCodeBinding) this.binding).tvTitleLabel.setVisibility(0);
        } else {
            int i5 = copy + 125;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            ((ActivityReceiveCodeBinding) this.binding).tvSetAmount.setText(getResources().getString(com.huawei.digitalpayment.consumer.qrcode.R.string.receive_code_button10));
            ((ActivityReceiveCodeBinding) this.binding).amountDisplayView.setVisibility(0);
            ((ActivityReceiveCodeBinding) this.binding).amountDisplayView.setUnit(AppConfigManager.getAppConfig().getCurrency());
            ((ActivityReceiveCodeBinding) this.binding).amountDisplayView.setAmount(CommonUtils.stringTodecimal(str));
            ((ActivityReceiveCodeBinding) this.binding).tvTitleLabel.setVisibility(8);
        }
        ((ActivityReceiveCodeBinding) this.binding).tvNotes.setText(str2);
        TextView textView = ((ActivityReceiveCodeBinding) this.binding).tvNotes;
        if (TextUtils.isEmpty(str2)) {
            int i7 = copy + 7;
            component4 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i4 = 0;
        }
        textView.setVisibility(i4);
    }

    private void refreshQrCode(GetQrCodeResp.QrCode qrCode) {
        int i = 2 % 2;
        if (qrCode == null) {
            int i2 = component4 + 5;
            copy = i2 % 128;
            if (i2 % 2 == 0) {
                this.nextRefreshTime = "0";
                ((ReceiveCodeViewModel) this.viewModel).getQrCodeList(((ReceiveCodeViewModel) this.viewModel).getAmount().getValue(), ((ReceiveCodeViewModel) this.viewModel).getNote());
            } else {
                this.nextRefreshTime = "0";
                ((ReceiveCodeViewModel) this.viewModel).getQrCodeList(((ReceiveCodeViewModel) this.viewModel).getAmount().getValue(), ((ReceiveCodeViewModel) this.viewModel).getNote());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            ((ReceiveCodeViewModel) this.viewModel).setQrCode(qrCode.getQrCode());
            this.nextRefreshTime = qrCode.getRefreshTime();
        }
        int i3 = copy + 53;
        component4 = i3 % 128;
        int i4 = i3 % 2;
    }

    private void reSet() {
        int i = 2 % 2;
        int i2 = copy + 5;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        ((ActivityReceiveCodeBinding) this.binding).tvNotes.setText("");
        ((ActivityReceiveCodeBinding) this.binding).amountDisplayView.setAmount("");
        ((ActivityReceiveCodeBinding) this.binding).amountDisplayView.setUnit("");
        ((ActivityReceiveCodeBinding) this.binding).tvNotes.setVisibility(8);
        ((ActivityReceiveCodeBinding) this.binding).amountDisplayView.setVisibility(8);
        int i4 = component4 + 81;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = component4 + 7;
        copy = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(com.huawei.digitalpayment.consumer.qrcode.R.string.receive_code_title1));
        int i4 = copy + 43;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
    }

    @Override
    public SfcPaymentBaseActivity.ToolbarContainer initToolbar(int i) {
        int i2 = 2 % 2;
        int i3 = component4 + 119;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            SfcPaymentBaseActivity.ToolbarContainer toolbarContainerInitToolbar = super.initToolbar(i);
            if (toolbarContainerInitToolbar.rootToolbar != null) {
                toolbarContainerInitToolbar.rootToolbar.setBackgroundColor(getColor(com.huawei.digitalpayment.consumer.qrcode.R.color.colorPrimary));
            }
            int i4 = copy + 21;
            component4 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 0;
            }
            return toolbarContainerInitToolbar;
        }
        View view = super.initToolbar(i).rootToolbar;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = component4 + 59;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = com.huawei.digitalpayment.consumer.qrcode.R.layout.activity_receive_code;
            throw null;
        }
        int i4 = com.huawei.digitalpayment.consumer.qrcode.R.layout.activity_receive_code;
        int i5 = component4 + 97;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
        return i4;
    }

    @Override
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        if (-1 == i2 && intent != null) {
            int i4 = component4 + 103;
            copy = i4 % 128;
            if (i4 % 2 != 0) {
                ((ReceiveCodeViewModel) this.viewModel).setAmountAndNote(CommonUtils.stringTodecimal(intent.getStringExtra("amount")), intent.getStringExtra("note"));
                int i5 = 16 / 0;
            } else {
                ((ReceiveCodeViewModel) this.viewModel).setAmountAndNote(CommonUtils.stringTodecimal(intent.getStringExtra("amount")), intent.getStringExtra("note"));
            }
        }
        int i6 = component4 + 125;
        copy = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = copy + 3;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        Handler handler = this.handler;
        if (handler != null) {
            int i4 = copy + 5;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            handler.removeCallbacks(this.runnable);
            this.handler = null;
        }
        int i6 = copy + 55;
        component4 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = component4 + 57;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952718_res_0x7f13044e).substring(6, 7).codePointAt(0) - 6, new char[]{23, 15, '#', '/', AbstractJsonLexerKt.COMMA, 27, '\'', '!', JSONLexer.EOI, '+', '.', '!', 4, 16, 2, 24, '\t', JSONLexer.EOI, 4, 6, 11, 2, '+', '#', JSONLexer.EOI, '$'}, (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 46), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952718_res_0x7f13044e).substring(6, 7).codePointAt(0) - 14, new char[]{14, 11, 13817, 13817, '%', 15, 4, 3, 13819, 13819, 22, 24, 15, 25, 2, 24, AbstractJsonLexerKt.COMMA, 20}, (byte) (KeyEvent.getDeadChar(0, 0) + 17), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 42 - (ViewConfiguration.getTouchSlop() >> 8), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 56, (char) Color.argb(0, 0, 0, 0), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i4 = component4 + 75;
                copy = i4 % 128;
                int i5 = i4 % 2;
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011b  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r52) {
        /*
            Method dump skipped, instruction units count: 14992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.ui.activity.ReceiveCodeActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$GkOSsM_B44OPUCZuJJPq9EtkMs4(ReceiveCodeActivity receiveCodeActivity, String str) {
        int i = 2 % 2;
        int i2 = component4 + 39;
        copy = i2 % 128;
        int i3 = i2 % 2;
        receiveCodeActivity.lambda$addObserver$4(str);
        int i4 = component4 + 95;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$OObp78UNBRRvvueT7OTDsSr8jwc(ReceiveCodeActivity receiveCodeActivity, Bitmap bitmap, boolean z) {
        int i = 2 % 2;
        int i2 = copy + 9;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        receiveCodeActivity.lambda$saveBitmap$8(bitmap, z);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void m10901$r8$lambda$SNMOAboJqpbPKcaq1PrWd9S44M(ReceiveCodeActivity receiveCodeActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 23;
        copy = i2 % 128;
        int i3 = i2 % 2;
        m10906instrumented$0$initView$V(receiveCodeActivity, view);
        int i4 = copy + 69;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m10902$r8$lambda$XysafG2sIClpYxpuiXijwJ1TjU(ReceiveCodeActivity receiveCodeActivity, String str) {
        int i = 2 % 2;
        int i2 = component4 + 65;
        copy = i2 % 128;
        int i3 = i2 % 2;
        receiveCodeActivity.lambda$addObserver$3(str);
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        int i5 = component4 + 37;
        copy = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void m10903$r8$lambda$bgqnL97DdkXWeoo3EWNzmVvGJ8(ReceiveCodeActivity receiveCodeActivity, GetQrCodeResp.QrCode qrCode) {
        int i = 2 % 2;
        int i2 = component4 + 35;
        copy = i2 % 128;
        int i3 = i2 % 2;
        receiveCodeActivity.lambda$addObserver$7(qrCode);
        int i4 = component4 + 83;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$cLKJJo9rL6VW13vSoxICXyspz6U(ReceiveCodeActivity receiveCodeActivity, String str) {
        int i = 2 % 2;
        int i2 = copy + 23;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        receiveCodeActivity.lambda$addObserver$6(str);
        if (i3 == 0) {
            throw null;
        }
    }

    public static void $r8$lambda$eLZVkyMI79VEYgAwKwVBh4SsFLI(ReceiveCodeActivity receiveCodeActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 125;
        copy = i2 % 128;
        int i3 = i2 % 2;
        m10907instrumented$1$initView$V(receiveCodeActivity, view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$fWzX6GFuD149GBjuPiqaxH00drE(ReceiveCodeActivity receiveCodeActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = copy + 19;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        receiveCodeActivity.lambda$addObserver$2(resource);
        int i4 = component4 + 37;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static void $r8$lambda$hnmD5mRh77Yb2N2jblWEcRwXVO4(ReceiveCodeActivity receiveCodeActivity, String str) {
        int i = 2 % 2;
        int i2 = component4 + 75;
        copy = i2 % 128;
        int i3 = i2 % 2;
        receiveCodeActivity.lambda$addObserver$5(str);
        int i4 = copy + 51;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
    }

    public static void $r8$lambda$kS3LrDSQPLWl5UjiasGQkpGNV4A(ReceiveCodeActivity receiveCodeActivity) {
        int i = 2 % 2;
        int i2 = component4 + 45;
        copy = i2 % 128;
        int i3 = i2 % 2;
        receiveCodeActivity.retry();
        int i4 = copy + 95;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    static Handler m10904$$Nest$fgethandler(ReceiveCodeActivity receiveCodeActivity) {
        int i = 2 % 2;
        int i2 = copy + 13;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Handler handler = receiveCodeActivity.handler;
        if (i3 != 0) {
            return handler;
        }
        throw null;
    }

    static String m10905$$Nest$fgetnextRefreshTime(ReceiveCodeActivity receiveCodeActivity) {
        int i = 2 % 2;
        int i2 = copy + 117;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = receiveCodeActivity.nextRefreshTime;
        int i5 = i3 + 35;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Finally extract failed */
    private static void m10906instrumented$0$initView$V(ReceiveCodeActivity receiveCodeActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 83;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                receiveCodeActivity.lambda$initView$0(view);
                Callback.onClick_exit();
                throw null;
            }
            receiveCodeActivity.lambda$initView$0(view);
            Callback.onClick_exit();
            int i4 = component4 + 59;
            copy = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10907instrumented$1$initView$V(ReceiveCodeActivity receiveCodeActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 29;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            receiveCodeActivity.lambda$initView$1(view);
            Callback.onClick_exit();
            int i4 = component4 + 15;
            copy = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component4 + 37;
        copy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
