package com.huawei.digitalpayment.consumer.baselib;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.KeyboardUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.L;
import com.huawei.common.util.ViewUtils;
import com.huawei.common.util.skin.SkinManager;
import com.huawei.common.widget.code.CodeWithErrorInputView;
import com.huawei.common.widget.code.SafeKeyboardEditText;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.init.PaymentResource;
import com.huawei.digitalpayment.consumer.baselib.service.IReportListener;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.cancel;
import kotlin.io.encoding.Base64;

public abstract class PaymentBaseActivity<Binding extends ViewDataBinding, VM extends ViewModel> extends MultiLanguageActivity {
    protected AppCompatActivity activity;
    public Binding binding;
    private GestureDetector gestureDetector;
    private ViewTreeObserver.OnGlobalLayoutListener listener;
    private PaymentResource resource;
    public VM viewModel;
    private static final byte[] $$u = {Ascii.GS, -59, -25, -119};
    private static final int $$x = 191;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$y = {70, -47, -65, TarHeader.LF_BLK, -15, -1, 60, -72, Ascii.SI, -8, 2, -20, 6, 3, -15, -1, 60, -72, 8, 4, -20, 10, -2, -20, 9, 56, -56, -15, -1, -6, -2, -7, Ascii.VT, TarHeader.LF_BLK, -56, -15, -2, 5, -6, -12, 2, 9, -22, 8, -9, -2, Base64.padSymbol, -24, -47, -2, 5, -6, -12, 2, 33, -40, 5, -12, 35, -46, Ascii.FF, -11, 70, -32, -37, -20, 8, -9, -2, 40, -40, -4, -10, 73, -34, -50, 10, 1, -22, 2, -6, -24, 4, -20, 10, Ascii.RS, -32, -22, Ascii.DLE, 9, 9, -13, -36, Ascii.DLE, -22, Ascii.FF, -15, -1, -6, -2, -2, 6, -12, -9, 62};
    private static final int $$z = 139;
    private static final byte[] $$g = {5, SignedBytes.MAX_POWER_OF_TWO, 127, 81, -26, -15, -23, -26, -12, -17, -13, -13, -5, -23, -20, TarHeader.LF_SYMLINK, -12, -29, 20, -33, -26, -18, 2, -28, -15, 36, -49, -23, -5, -15, -17, -8, -20, -6, -31, -5, -10, -28, Ascii.DC2, -47, 5, -33, 1};
    private static final int $$h = 143;
    private static int component4 = 0;
    private static int getAsAtTimestamp = 1;
    private static long copydefault = -3935188337602104594L;
    private static char[] component3 = {30272, 30647, 30653, 30643, 30646, 30648, 30327, 30641, 30304, 30274, 30637, 30639, 30632, 30285, 30649, 30652, 30323, 30322, 30320, 30321, 30317, 30655, 30312, 30319, 30313, 30275, 30316, 30318, 30642, 30315, 30326, 30654, 30636, 30640, 30644, 30324, 30651, 30645, 30290, 30297, 30306, 30650, 30291};
    private static int ShareDataUIState = 321287713;
    private static boolean component1 = true;
    private static boolean component2 = true;
    public final String TAG = getClass().getSimpleName();
    private long startTime = -1;
    protected boolean hasToolbar = false;
    protected boolean hasStatusBar = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$A(short r5, short r6, short r7) {
        /*
            int r5 = r5 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.PaymentBaseActivity.$$u
            int r7 = r7 * 5
            int r7 = 103 - r7
            int r6 = r6 * 4
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r5 = r5 + 1
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r0[r5]
        L27:
            int r7 = r7 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.PaymentBaseActivity.$$A(short, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void n(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r6 = r6 * 4
            int r6 = 103 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.PaymentBaseActivity.$$g
            int r7 = r7 * 6
            int r1 = 28 - r7
            byte[] r1 = new byte[r1]
            int r7 = 27 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2e
        L19:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1d:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2e:
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-14)
            int r6 = r6 + 1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.PaymentBaseActivity.n(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void o(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = 95 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.PaymentBaseActivity.$$y
            int r9 = r9 * 2
            int r9 = r9 + 10
            int r7 = r7 * 16
            int r7 = r7 + 83
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2c:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-3)
            r8 = r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.PaymentBaseActivity.o(byte, short, short, java.lang.Object[]):void");
    }

    protected abstract int getLayoutId();

    private static void l(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(copydefault ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $11 + 27;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i5 = $11 + 111;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(copydefault)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 7033, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 33, (char) (63440 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1391 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 18 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (View.MeasureSpec.getSize(0) + 51269), -1883291598, false, $$A(b2, b3, b3), new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    @Override
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        super.attachBaseContext(context);
        this.resource = new PaymentResource(super.getResources());
        int i2 = getAsAtTimestamp + 67;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Resources getResources() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 37;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        PaymentResource paymentResource = this.resource;
        int i4 = i3 + 83;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return paymentResource;
    }

    private static void m(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = component3;
        int i3 = -1;
        char c2 = '0';
        int i4 = 0;
        if (cArr3 != null) {
            int i5 = $10 + 39;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i4] = Integer.valueOf(cArr3[i6]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i3;
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3759 - TextUtils.lastIndexOf("", c2, i4), 24 - Color.green(i4), (char) KeyEvent.keyCodeFromString(""), -1670574543, false, $$A(b2, b3, (byte) (b3 | 7)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    i3 = -1;
                    c2 = '0';
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $10 + 79;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7139 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13, (char) TextUtils.getOffsetAfter("", 0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        if (component2) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr4[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                try {
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2747 - TextUtils.lastIndexOf("", '0'), 20 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (7644 - (ViewConfiguration.getPressedStateDuration() >> 16)), -327556343, false, $$A(b4, b5, (byte) (b5 | 6)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    int i9 = $10 + 65;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 2 % 4;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (component1) {
            cancelVar.component1 = cArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2747 - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.indexOf("", "", 0) + 19, (char) (7644 - (KeyEvent.getMaxKeyCode() >> 16)), -327556343, false, $$A(b6, b7, (byte) (b7 | 6)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i11 = 0;
        cancelVar.component1 = iArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        while (true) {
            cancelVar.component3 = i11;
            if (cancelVar.component3 >= cancelVar.component1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i12 = $10 + 53;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 >>> 1) >>> cancelVar.component3] >>> i] / iIntValue);
                i11 = cancelVar.component3;
            } else {
                cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                i11 = cancelVar.component3 + 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05f4  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.PaymentBaseActivity.onCreate(android.os.Bundle):void");
    }

    public static class ToolbarContainer {
        public final ImageView ivEnd;
        public final ImageView ivStart;
        public View rootToolbar;
        public final TextView tvEnd;
        public final TextView tvTitle;

        public ToolbarContainer(ImageView imageView, TextView textView, ImageView imageView2, TextView textView2) {
            this.ivStart = imageView;
            this.tvTitle = textView;
            this.ivEnd = imageView2;
            this.tvEnd = textView2;
        }
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = getAsAtTimestamp + 61;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            m(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954889_res_0x7f130cc9).substring(0, 1).length() + 126, new byte[]{-125, -127, -112, -124, -113, -114, -115, -117, -122, -116, -122, -117, -118, -119, -121, -120, -120, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            l(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 28, new char[]{28094, 65149, 51747, 23057, 28125, 41079, 30383, 16670, 5159, 9832, 64685, 53033, 40502, 44154, 31417, 21773, ')', 12911, 57509, 54025, 35361, 47228}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = component4 + 107;
            getAsAtTimestamp = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 6618, TextUtils.indexOf((CharSequence) "", '0', 0) + 43, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 6562, (ViewConfiguration.getWindowTouchSlop() >> 8) + 56, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), -699576857, false, "component2", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    int i5 = 40 / 0;
                } else {
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(6618 - TextUtils.getOffsetAfter("", 0), 42 - View.getDefaultSize(0, 0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.indexOf((CharSequence) "", '0', 0) + 57, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), -699576857, false, "component2", new Class[]{Context.class});
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
        if (this.startTime > ((long) 777) - 777) {
            L.d(this.TAG, getClass().getSimpleName() + "：load finish in " + (System.currentTimeMillis() - this.startTime));
            this.startTime = -1L;
        }
        Binding binding = this.binding;
        if (binding != null && binding.getRoot() != null) {
            this.binding.getRoot().getViewTreeObserver().addOnGlobalLayoutListener(this.listener);
        }
        int i6 = getAsAtTimestamp + 65;
        component4 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override
    public void onStop() {
        int i = 2 % 2;
        int i2 = component4 + 93;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            super.onStop();
            Binding binding = this.binding;
            if (binding == null || binding.getRoot() == null) {
                return;
            }
            this.binding.getRoot().getViewTreeObserver().removeOnGlobalLayoutListener(this.listener);
            int i3 = getAsAtTimestamp + 97;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onStop();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setBackgroundDrawable() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.PaymentBaseActivity.getAsAtTimestamp
            int r1 = r1 + 23
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.PaymentBaseActivity.component4 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L19
            boolean r1 = isTranslucentOrTransparent(r4)
            r2 = 99
            int r2 = r2 / 0
            if (r1 != 0) goto L31
            goto L1f
        L19:
            boolean r1 = isTranslucentOrTransparent(r4)
            if (r1 != 0) goto L31
        L1f:
            android.view.Window r1 = r4.getWindow()
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            int r3 = com.huawei.digitalpayment.consumer.baselib.R.color.colorGround
            int r3 = com.blankj.utilcode.util.ColorUtils.getColor(r3)
            r2.<init>(r3)
            r1.setBackgroundDrawable(r2)
        L31:
            int r1 = com.huawei.digitalpayment.consumer.baselib.PaymentBaseActivity.component4
            int r1 = r1 + 73
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.PaymentBaseActivity.getAsAtTimestamp = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L3d
            return
        L3d:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.PaymentBaseActivity.setBackgroundDrawable():void");
    }

    protected void adaptEdgeToEdge(View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 7;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            if (getApplicationInfo().targetSdkVersion <= 10) {
                return;
            }
        } else if (getApplicationInfo().targetSdkVersion <= 34) {
            return;
        }
        if (Build.VERSION.SDK_INT > 34 && view != null) {
            int i3 = component4 + 85;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            if (!view.getFitsSystemWindows()) {
                ViewCompat.setOnApplyWindowInsetsListener(view, new OnApplyWindowInsetsListener() {
                    private static int ShareDataUIState = 0;
                    private static int component3 = 1;

                    @Override
                    public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                        int i5 = 2 % 2;
                        int i6 = component3 + 125;
                        ShareDataUIState = i6 % 128;
                        int i7 = i6 % 2;
                        WindowInsetsCompat windowInsetsCompat$r8$lambda$zzO3qVSy0T66NEmIn0vfzFcnDmI = PaymentBaseActivity.$r8$lambda$zzO3qVSy0T66NEmIn0vfzFcnDmI(this.f$0, view2, windowInsetsCompat);
                        int i8 = ShareDataUIState + 45;
                        component3 = i8 % 128;
                        int i9 = i8 % 2;
                        return windowInsetsCompat$r8$lambda$zzO3qVSy0T66NEmIn0vfzFcnDmI;
                    }
                });
                return;
            }
            int i5 = getAsAtTimestamp + 107;
            component4 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private WindowInsetsCompat lambda$adaptEdgeToEdge$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 35;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Insets insets = windowInsetsCompat.getInsets(getWindowInsetsTypeMask());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = insets.left;
        marginLayoutParams.bottomMargin = insets.bottom;
        marginLayoutParams.rightMargin = insets.right;
        marginLayoutParams.topMargin = 0;
        if (!(!isHasToolbar())) {
            marginLayoutParams.topMargin += BarUtils.getActionBarHeight();
            int i4 = getAsAtTimestamp + 61;
            component4 = i4 % 128;
            int i5 = i4 % 2;
        }
        if (isHasStatusBar()) {
            marginLayoutParams.topMargin += insets.top;
        }
        view.setLayoutParams(marginLayoutParams);
        onRootWindowInsetsChanged(view, windowInsetsCompat);
        return WindowInsetsCompat.CONSUMED;
    }

    protected int getWindowInsetsTypeMask() {
        int i = 2 % 2;
        int i2 = component4 + 41;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            WindowInsetsCompat.Type.systemBars();
            WindowInsetsCompat.Type.ime();
            throw null;
        }
        int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
        int i3 = getAsAtTimestamp + 119;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        return iSystemBars;
    }

    protected boolean isHasStatusBar() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 11;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        boolean z = this.hasStatusBar;
        int i5 = i3 + 115;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    protected boolean isHasToolbar() {
        int i = 2 % 2;
        int i2 = component4 + 67;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.hasToolbar;
        int i4 = i3 + 51;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    private void getStatusBarHeight() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 115;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        if (ViewUtils.getCurrentStatusBarHeight() <= 0) {
            ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
            final View viewInflate = getLayoutInflater().inflate(R.layout.statusbar_layout_hegiht, viewGroup, false);
            viewGroup.addView(viewInflate);
            viewInflate.post(new Runnable() {
                private static int ShareDataUIState = 0;
                private static int copydefault = 1;

                @Override
                public final void run() {
                    int i4 = 2 % 2;
                    int i5 = ShareDataUIState + 7;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                    PaymentBaseActivity.m10220$r8$lambda$tDJHbGsX3cHtD7hWUeHpMenzgw(this.f$0, viewInflate);
                    int i7 = copydefault + 93;
                    ShareDataUIState = i7 % 128;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                }
            });
            return;
        }
        int i4 = getAsAtTimestamp + 21;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void lambda$getStatusBarHeight$1(View view) {
        int i = 2 % 2;
        int top = view.findViewById(R.id.viewTag).getTop();
        L.d(this.TAG, "getStatusBarHeight: " + top);
        ViewUtils.setStatusBarHeight(top);
        ((ViewGroup) view.getParent()).removeView(view);
        int i2 = component4 + 81;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    protected void initBinding() {
        int i = 2 % 2;
        try {
            Binding binding = (Binding) DataBindingUtil.setContentView(this, getLayoutId());
            this.binding = binding;
            if (binding != null) {
                int i2 = getAsAtTimestamp + 45;
                component4 = i2 % 128;
                if (i2 % 2 != 0) {
                    initToolbar("");
                    adaptEdgeToEdge(this.binding.getRoot());
                    int i3 = 95 / 0;
                } else {
                    initToolbar("");
                    adaptEdgeToEdge(this.binding.getRoot());
                }
            }
        } catch (Exception e) {
            L.e(this.TAG, "initBinding: " + e.getMessage());
        }
        int i4 = getAsAtTimestamp + 37;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void initStatusBar() {
        int i = 2 % 2;
        BarUtils.transparentStatusBar(this);
        int attrColor = getAttrColor(R.attr.toolbarBackground);
        L.d(this.TAG, "toolbarBackground: " + Integer.toHexString(attrColor));
        boolean z = false;
        if (((int) (((double) ((Color.red(attrColor) * 0.299f) + (Color.green(attrColor) * 0.587f))) + (((double) Color.blue(attrColor)) * 0.114d))) > 192) {
            int i2 = getAsAtTimestamp + 43;
            component4 = i2 % 128;
            if (i2 % 2 == 0) {
                z = true;
            }
        }
        BarUtils.setStatusBarLightMode(this, z);
        int i3 = getAsAtTimestamp + 15;
        component4 = i3 % 128;
        int i4 = i3 % 2;
    }

    private int getAttrColor(int i) {
        int i2 = 2 % 2;
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(i, typedValue, true);
        int i3 = typedValue.data;
        int realResourceId = SkinManager.INSTANCE.getRealResourceId(this, typedValue.resourceId);
        if (realResourceId == 0) {
            return i3;
        }
        int i4 = getAsAtTimestamp + 101;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        int color = ColorUtils.getColor(realResourceId);
        int i6 = getAsAtTimestamp + 53;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return color;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 123;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        GestureDetector gestureDetector = this.gestureDetector;
        if (i3 == 0) {
            return gestureDetector.onTouchEvent(motionEvent);
        }
        gestureDetector.onTouchEvent(motionEvent);
        throw null;
    }

    static class component1 implements View.OnClickListener {
        private static int component1 = 1;
        private static int component2;
        private final View.OnClickListener component3;

        component1(View.OnClickListener onClickListener) {
            this.component3 = onClickListener;
        }

        /* JADX WARN: Finally extract failed */
        @Override
        public void onClick(View view) {
            int i = 2 % 2;
            int i2 = component1 + 9;
            component2 = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    Callback.onClick_enter(view);
                    PaymentBaseActivity.m10222$$Nest$smhandClick(view, this.component3);
                    Callback.onClick_exit();
                    throw null;
                }
                Callback.onClick_enter(view);
                PaymentBaseActivity.m10222$$Nest$smhandClick(view, this.component3);
                Callback.onClick_exit();
                int i3 = component2 + 107;
                component1 = i3 % 128;
                int i4 = i3 % 2;
            } catch (Throwable th) {
                Callback.onClick_exit();
                throw th;
            }
        }
    }

    protected void initGestureDetector() {
        int i = 2 % 2;
        this.gestureDetector = new GestureDetector(this, new GestureDetector.SimpleOnGestureListener() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                int i2 = 2 % 2;
                int i3 = copydefault + 97;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                KeyboardUtils.hideSoftInput(PaymentBaseActivity.this);
                boolean zOnScroll = super.onScroll(motionEvent, motionEvent2, f, f2);
                int i5 = component1 + 13;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return zOnScroll;
            }
        });
        int i2 = getAsAtTimestamp + 9;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    protected void initViewModel(int i) {
        int i2 = 2 % 2;
        int i3 = component4 + 25;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        Class<?> superclass = getClass();
        while (true) {
            if (superclass == null) {
                break;
            }
            int i5 = component4 + 1;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            if (superclass == PaymentBaseActivity.class) {
                break;
            }
            Type genericSuperclass = superclass.getGenericSuperclass();
            if (!(genericSuperclass instanceof ParameterizedType)) {
                superclass = superclass.getSuperclass();
            } else {
                Class cls = (Class) ((ParameterizedType) genericSuperclass).getActualTypeArguments()[i];
                if (cls == ViewModel.class) {
                    return;
                } else {
                    this.viewModel = (VM) new ViewModelProvider(this).get(cls);
                }
            }
        }
        int i7 = getAsAtTimestamp + 39;
        component4 = i7 % 128;
        int i8 = i7 % 2;
    }

    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = component4 + 19;
        getAsAtTimestamp = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            initToolbar(str, R.layout.base_toolbar_layout, null);
            obj.hashCode();
            throw null;
        }
        initToolbar(str, R.layout.base_toolbar_layout, null);
        int i3 = component4 + 27;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    protected void initToolbar(String str, String str2) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 75;
        component4 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            initToolbar(str, R.layout.base_toolbar_layout, str2);
            obj.hashCode();
            throw null;
        }
        initToolbar(str, R.layout.base_toolbar_layout, str2);
        int i3 = getAsAtTimestamp + 57;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    protected void initToolbar(String str, int i, String str2) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 71;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            ToolbarContainer toolbarContainerInitToolbar = initToolbar(i);
            if (toolbarContainerInitToolbar.tvTitle != null) {
                int i4 = component4 + 93;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
                toolbarContainerInitToolbar.tvTitle.setText(str);
            }
            if (toolbarContainerInitToolbar.tvEnd != null) {
                toolbarContainerInitToolbar.tvEnd.setVisibility(0);
                toolbarContainerInitToolbar.tvEnd.setText(str2);
                toolbarContainerInitToolbar.tvEnd.setOnClickListener(new View.OnClickListener() {
                    private static int component2 = 1;
                    private static int component3;

                    @Override
                    public final void onClick(View view) {
                        int i6 = 2 % 2;
                        int i7 = component2 + 35;
                        component3 = i7 % 128;
                        int i8 = i7 % 2;
                        PaymentBaseActivity.m10218$r8$lambda$hSl7Jog4GjXZdZotJwmGmdL43s(this.f$0, view);
                        int i9 = component2 + 11;
                        component3 = i9 % 128;
                        if (i9 % 2 != 0) {
                            throw null;
                        }
                    }
                });
                int i6 = component4 + 101;
                getAsAtTimestamp = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            return;
        }
        TextView textView = initToolbar(i).tvTitle;
        throw null;
    }

    private void lambda$initToolbar$2(View view) {
        int i = 2 % 2;
        rightBtnClick();
        String str = buildViewPath(view) + view.getId();
        ((IReportListener) RouteUtils.getService(IReportListener.class)).reportAll(getClass().getSimpleName().hashCode() + str);
        int i2 = getAsAtTimestamp + 115;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    protected ToolbarContainer initToolbar() {
        int i = 2 % 2;
        int i2 = component4 + 5;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            initToolbar(R.layout.base_toolbar_layout);
            throw null;
        }
        ToolbarContainer toolbarContainerInitToolbar = initToolbar(R.layout.base_toolbar_layout);
        int i3 = getAsAtTimestamp + 83;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        return toolbarContainerInitToolbar;
    }

    private void lambda$initToolbar$3(View view) {
        int i = 2 % 2;
        onBackClick();
        String str = buildViewPath(view) + view.getId();
        ((IReportListener) RouteUtils.getService(IReportListener.class)).reportAll(getClass().getSimpleName().hashCode() + str);
        int i2 = getAsAtTimestamp + 61;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    protected ToolbarContainer initToolbar(int i) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 43;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        this.hasToolbar = true;
        this.hasStatusBar = true;
        ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
        View viewInflate = LayoutInflater.from(this).inflate(i, viewGroup, false);
        int actionBarHeight = BarUtils.getActionBarHeight() + ViewUtils.getStatusBarHeight();
        viewInflate.getLayoutParams().height = actionBarHeight;
        viewGroup.addView(viewInflate);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.binding.getRoot().getLayoutParams();
        marginLayoutParams.topMargin = actionBarHeight;
        this.binding.getRoot().setLayoutParams(marginLayoutParams);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.ivBack);
        if (imageView != null) {
            imageView.setOnClickListener(new PaymentBaseActivity$$ExternalSyntheticLambda1(this));
        }
        ToolbarContainer toolbarContainer = new ToolbarContainer(imageView, (TextView) viewInflate.findViewById(R.id.tvTitle), (ImageView) viewInflate.findViewById(R.id.ivEndButton), (TextView) viewInflate.findViewById(R.id.tvEndButton));
        toolbarContainer.rootToolbar = viewInflate;
        int i5 = getAsAtTimestamp + 75;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return toolbarContainer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onBackClick() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 97;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        onBackPressed();
        int i4 = component4 + 101;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void finish() {
        int i = 2 % 2;
        int i2 = component4 + 125;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.finish();
        overridePendingTransition(R.anim.activity_close_enter_animation, R.anim.activity_close_exit_animation);
        int i4 = component4 + 95;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean isTranslucentOrTransparent(Activity activity) {
        int i = 2 % 2;
        TypedValue typedValue = new TypedValue();
        if (activity.getTheme().resolveAttribute(android.R.attr.windowIsTranslucent, typedValue, true)) {
            int i2 = getAsAtTimestamp + 93;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            if (typedValue.type == 18 && typedValue.data != 0) {
                int i4 = component4 + 107;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = component4 + 103;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        if (AppConfigManager.getAppConfig().closeSoftInputOnClick() && motionEvent.getAction() == 1) {
            View currentFocus = getCurrentFocus();
            if (isShouldHideKeyboard(currentFocus, motionEvent)) {
                KeyboardUtils.hideSoftInput(this);
                if (currentFocus != null) {
                    int i4 = getAsAtTimestamp + 103;
                    component4 = i4 % 128;
                    int i5 = i4 % 2;
                    currentFocus.clearFocus();
                    int i6 = component4 + 31;
                    getAsAtTimestamp = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        }
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        int i8 = getAsAtTimestamp + 115;
        component4 = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 57 / 0;
        }
        return zDispatchTouchEvent;
    }

    protected boolean isShouldHideKeyboard(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 33;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        if (!(!(view instanceof SafeKeyboardEditText)) && ((SafeKeyboardEditText) view).isUseSafeKeyboard()) {
            int i4 = component4 + 95;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (view instanceof CodeWithErrorInputView) {
            int i6 = getAsAtTimestamp + 9;
            component4 = i6 % 128;
            int i7 = i6 % 2;
            if (((CodeWithErrorInputView) view).getCodeInputView().isUseSafeKeyboard()) {
                return false;
            }
        }
        if (isShouldHideKeyboard(motionEvent)) {
            return !positionInView(getInputView(view), motionEvent);
        }
        return false;
    }

    protected boolean positionInView(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        if (view == null) {
            return false;
        }
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        int height = view.getHeight();
        int width = view.getWidth();
        if (motionEvent.getRawX() <= i2) {
            return false;
        }
        int i4 = component4 + 103;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            if (motionEvent.getRawX() >= (width >>> i2)) {
                return false;
            }
        } else if (motionEvent.getRawX() >= width + i2) {
            return false;
        }
        if (motionEvent.getRawY() <= i3 || motionEvent.getRawY() >= height + i3) {
            return false;
        }
        int i5 = component4 + 27;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected View getInputView(View view) {
        int i = 2 % 2;
        int i2 = component4 + 119;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        if (view != null && !(view instanceof SafeKeyboardEditText)) {
            ViewParent parent = view.getParent();
            if (parent != 0 && (parent.getParent() instanceof CommonInputView)) {
                int i4 = component4;
                int i5 = i4 + 57;
                getAsAtTimestamp = i5 % 128;
                int i6 = i5 % 2;
                View view2 = (View) parent;
                int i7 = i4 + 93;
                getAsAtTimestamp = i7 % 128;
                if (i7 % 2 != 0) {
                    return view2;
                }
                throw null;
            }
            if (view instanceof EditText) {
                int i8 = getAsAtTimestamp + 63;
                component4 = i8 % 128;
                if (i8 % 2 != 0) {
                    view.isEnabled();
                    throw null;
                }
                if (view.isEnabled()) {
                    return view;
                }
            }
        }
        return null;
    }

    private void delegateViewsOnClickListener(Context context, View view) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 77;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        if (context != null) {
            int i5 = i2 + 7;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            if (view == null) {
                return;
            }
            View.OnClickListener onClickListener = getOnClickListener(view);
            if (onClickListener != null && !(onClickListener instanceof component1)) {
                view.setOnClickListener(new component1(onClickListener));
            }
            if (view instanceof ViewGroup) {
                int i7 = component4 + 31;
                getAsAtTimestamp = i7 % 128;
                int i8 = i7 % 2;
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    delegateViewsOnClickListener(context, viewGroup.getChildAt(i9));
                }
            }
        }
    }

    private View.OnClickListener getOnClickListener(View view) {
        int i = 2 % 2;
        if (!view.hasOnClickListeners()) {
            int i2 = component4 + 67;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 98 / 0;
            }
            return null;
        }
        try {
            Method declaredMethod = Class.forName(AndroidComposeViewAccessibilityDelegateCompat.ClassName).getDeclaredMethod("getListenerInfo", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(view, new Object[0]);
            Field declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            declaredField.setAccessible(true);
            View.OnClickListener onClickListener = (View.OnClickListener) declaredField.get(objInvoke);
            int i4 = getAsAtTimestamp + 71;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            return onClickListener;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            L.e(e.getMessage());
            return null;
        }
    }

    private static void handClick(View view, View.OnClickListener onClickListener) {
        int i = 2 % 2;
        if (onClickListener != null) {
            int i2 = getAsAtTimestamp + 9;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            try {
                onClickListener.onClick(view);
                int i4 = component4 + 97;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception e) {
                L.e(e.getMessage());
            }
        }
        ((IReportListener) RouteUtils.getService(IReportListener.class)).reportAll(buildViewPath(view) + view.getId());
    }

    private static String buildViewPath(View view) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int i2 = component4 + 125;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        while (view != null) {
            int i4 = getAsAtTimestamp + 1;
            component4 = i4 % 128;
            if (i4 % 2 != 0) {
                view.getId();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (view.getId() == 16908290) {
                break;
            }
            Object parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                break;
            }
            int iIndexOfChild = ((ViewGroup) parent).indexOfChild(view);
            sb.insert(0, (view.getClass().getSimpleName() + "") + "[" + iIndexOfChild + "]/");
            view = (View) parent;
        }
        return sb.toString().hashCode() + "";
    }

    public static void returnToMain(Activity activity) {
        int i = 2 % 2;
        int i2 = component4 + 87;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        List<Activity> activityList = ActivityUtils.getActivityList();
        for (int i4 = 0; i4 < activityList.size(); i4++) {
            int i5 = component4 + 73;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            Activity activity2 = activityList.get(i4);
            if (TextUtils.equals(RouteUtils.getActivityName(activity2), "main")) {
                break;
            }
            activity2.finish();
        }
        activity.finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.PaymentBaseActivity.onPause():void");
    }

    public static void m10218$r8$lambda$hSl7Jog4GjXZdZotJwmGmdL43s(PaymentBaseActivity paymentBaseActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 57;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        m10224x77482510(paymentBaseActivity, view);
        int i4 = component4 + 119;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
    }

    public static void m10219$r8$lambda$oqDJ7eOJBU55YiuquiMBXGK9A(PaymentBaseActivity paymentBaseActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 119;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        m10223x2d51e2c4(paymentBaseActivity, view);
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
    }

    public static void m10220$r8$lambda$tDJHbGsX3cHtD7hWUeHpMenzgw(PaymentBaseActivity paymentBaseActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 17;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        paymentBaseActivity.lambda$getStatusBarHeight$1(view);
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        int i5 = getAsAtTimestamp + 27;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static WindowInsetsCompat $r8$lambda$zzO3qVSy0T66NEmIn0vfzFcnDmI(PaymentBaseActivity paymentBaseActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = component4 + 47;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return paymentBaseActivity.lambda$adaptEdgeToEdge$0(view, windowInsetsCompat);
        }
        paymentBaseActivity.lambda$adaptEdgeToEdge$0(view, windowInsetsCompat);
        throw null;
    }

    static void m10221$$Nest$mdelegateViewsOnClickListener(PaymentBaseActivity paymentBaseActivity, Context context, View view) {
        int i = 2 % 2;
        int i2 = component4 + 3;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        paymentBaseActivity.delegateViewsOnClickListener(context, view);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getAsAtTimestamp + 77;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void m10222$$Nest$smhandClick(View view, View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = component4 + 101;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        handClick(view, onClickListener);
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
    }

    private static void m10223x2d51e2c4(PaymentBaseActivity paymentBaseActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 39;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                paymentBaseActivity.lambda$initToolbar$3(view);
                Callback.onClick_exit();
                int i4 = 33 / 0;
            } else {
                paymentBaseActivity.lambda$initToolbar$3(view);
                Callback.onClick_exit();
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10224x77482510(PaymentBaseActivity paymentBaseActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 19;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                paymentBaseActivity.lambda$initToolbar$2(view);
                return;
            }
            paymentBaseActivity.lambda$initToolbar$2(view);
            Callback.onClick_exit();
            Object obj = null;
            obj.hashCode();
            throw null;
        } finally {
            Callback.onClick_exit();
        }
    }

    protected boolean isShouldHideKeyboard(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 91;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 19;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    protected void onRootWindowInsetsChanged(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = component4 + 97;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void rightBtnClick() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 87;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 10 / 0;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component4 + 105;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        int i5 = getAsAtTimestamp + 119;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }
}
