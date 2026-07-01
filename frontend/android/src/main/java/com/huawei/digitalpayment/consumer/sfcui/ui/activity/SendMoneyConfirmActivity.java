package com.huawei.digitalpayment.consumer.sfcui.ui.activity;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.checkout.model.response.CheckoutResp;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.FixedDataNavKeys;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfc.databinding.ActivitySendMoneyConfirmBinding;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.consumer.sfcui.ui.resp.PreSendMoneyParams;
import com.huawei.digitalpayment.consumer.sfcui.ui.resp.RealContactResp;
import com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.SendMoneyConfirmViewModel;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancel;
import kotlin.cancelAll;
import kotlin.cancelNotification;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0014R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/activity/SendMoneyConfirmActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcPaymentBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ActivitySendMoneyConfirmBinding;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/SendMoneyConfirmViewModel;", "<init>", "()V", "amount", "", "phoneNumber", "realContactResp", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/RealContactResp;", "getLayoutId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initObserver", "gotoStartPay", "data", "Lcom/huawei/digitalpayment/checkout/model/response/CheckoutResp;", "initListener", "initView", "fillData", "initToolbar", "title", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SendMoneyConfirmActivity extends Hilt_SendMoneyConfirmActivity<ActivitySendMoneyConfirmBinding, SendMoneyConfirmViewModel> {
    public static final int $stable = 8;
    private static int ShareDataUIState;
    private static char[] component1;
    private static char[] component2;
    private static char component3;
    private static boolean component4;
    private static char[] copy;
    private static boolean copydefault;
    private static long equals;
    private static int hashCode;
    private String amount = "";
    private String phoneNumber = "";
    private RealContactResp realContactResp;
    private static final byte[] $$l = {109, 5, -57, 108};
    private static final int $$o = 132;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {10, 80, 9, 70, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 6, -55, 59, 19, 5, 1, 7, 9, 7, -43, 59, Ascii.EM, -1, Ascii.NAK, -9, Ascii.NAK, -60, 59, Ascii.ETB, 8, -58, Ascii.ESC, TarHeader.LF_CONTIG, 8, -26, 41, -3, 9, -57, Ascii.SYN, -6, Ascii.NAK};
    private static final int $$k = 222;
    private static final byte[] $$d = {120, -62, 63, 57, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -12, Ascii.FF, -19, -15, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 161;
    private static int getShareableDataState = 1;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component3 implements Observer, FunctionAdapter {
        private static int component1 = 0;
        private static int copydefault = 1;
        private final Function1 ShareDataUIState;

        component3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.ShareDataUIState = function1;
        }

        public final boolean equals(Object obj) {
            boolean zAreEqual;
            int i = 2 % 2;
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i2 = copydefault + 113;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                int i3 = 52 / 0;
            } else {
                zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            boolean z = zAreEqual;
            int i4 = component1 + 11;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component1 + 117;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.ShareDataUIState;
            if (i3 != 0) {
                return function1;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 73;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = component1 + 113;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 121;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            this.ShareDataUIState.invoke(obj);
            int i4 = copydefault + 97;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 52 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(byte r7, short r8, byte r9) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r7 = 122 - r7
            int r9 = r9 * 3
            int r9 = r9 + 1
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyConfirmActivity.$$l
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            r6 = r8
            r8 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r8 = r8 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyConfirmActivity.$$r(byte, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = 99 - r7
            int r0 = 28 - r6
            int r5 = r5 * 2
            int r5 = 103 - r5
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyConfirmActivity.$$d
            byte[] r0 = new byte[r0]
            int r6 = 27 - r6
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
        L28:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-8)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyConfirmActivity.i(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void k(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyConfirmActivity.$$j
            int r6 = r6 * 4
            int r6 = 99 - r6
            int r5 = r5 * 24
            int r1 = 34 - r5
            int r7 = r7 * 9
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r5 = 33 - r5
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r6
            r3 = r2
            r6 = r5
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r4 = r0[r7]
            int r3 = r3 + 1
        L2b:
            int r6 = r6 + r4
            int r6 = r6 + (-8)
            int r7 = r7 + 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyConfirmActivity.k(int, byte, short, java.lang.Object[]):void");
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 101;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_send_money_confirm;
        if (i3 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void h(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i];
        cancelnotification.copydefault = 0;
        int i4 = $11 + 85;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (cancelnotification.copydefault < i) {
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(copy[i2 + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 1;
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1758, 33 - Process.getGidForName(""), (char) (MotionEvent.axisFromString("") + 1), 1159210934, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(equals), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    int modifierMetaStateMask = 3607 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int iBlue = 29 - Color.blue(0);
                    char packedPositionType = (char) (7171 - ExpandableListView.getPackedPositionType(0L));
                    byte b4 = $$l[1];
                    byte b5 = (byte) (b4 - 5);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(modifierMetaStateMask, iBlue, packedPositionType, 1951385784, false, $$r(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - TextUtils.indexOf("", "", 0), View.combineMeasuredStates(0, 0) + 24, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 27761), -1529629956, false, $$r(b6, b7, b7), new Class[]{Object.class, Object.class});
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
            int i7 = $10 + 27;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4013 - TextUtils.getCapsMode("", 0, 0), Color.blue(0) + 24, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 27760), -1529629956, false, $$r(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    private static void g(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        long j;
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component1;
        char c2 = '0';
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i3;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", c2, i3) + 3761, 24 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) Color.argb(i3, i3, i3, i3), -1670574543, false, $$r((byte) 54, b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    c2 = '0';
                    i3 = 0;
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
        try {
            Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - (Process.myPid() >> 22), 12 - ExpandableListView.getPackedPositionChild(0L), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            int i5 = 689978476;
            int i6 = 49;
            if (component4) {
                cancelVar.component1 = bArr.length;
                char[] cArr4 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault3 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 2748, 18 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (7644 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), -327556343, false, $$r((byte) i6, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    int i7 = $10 + 117;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    i6 = 49;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!copydefault) {
                cancelVar.component1 = iArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                int i9 = $10 + 49;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    cancelVar.component3++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            cancelVar.component1 = cArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i11 = $10 + 43;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr6[cancelVar.component3] = (char) (cArr2[cArr[cancelVar.component1 % cancelVar.component3] - i] + iIntValue);
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i5);
                    if (objCopydefault4 == null) {
                        byte b4 = (byte) 0;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 2748, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19, (char) (7644 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), -327556343, false, $$r((byte) 49, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                    j = 0;
                } else {
                    cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    Object[] objArr6 = {cancelVar, cancelVar};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i5);
                    if (objCopydefault5 == null) {
                        j = 0;
                        byte b5 = (byte) 0;
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 2748, 20 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (7645 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), -327556343, false, $$r((byte) 49, b5, b5), new Class[]{Object.class, Object.class});
                    } else {
                        j = 0;
                    }
                    ((Method) objCopydefault5).invoke(null, objArr6);
                }
                i5 = 689978476;
            }
            String str = new String(cArr6);
            int i12 = $10 + 37;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            objArr[0] = str;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static void j(byte b2, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int length;
        char[] cArr2;
        int i3 = 2;
        int i4 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr3 = component2;
        if (cArr3 != null) {
            int i5 = $11 + 45;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 121;
                $11 = i7 % 128;
                if (i7 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7422 - TextUtils.getOffsetAfter("", 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16, (char) (64291 - TextUtils.indexOf("", "", 0, 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i6])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                        if (objCopydefault2 == null) {
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 7421, (ViewConfiguration.getJumpTapTimeout() >> 16) + 15, (char) (64292 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 682917265, false, "v", new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        i6++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 2;
            }
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(component3)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 7423, TextUtils.lastIndexOf("", '0', 0, 0) + 16, (char) (64290 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
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
                int i8 = $10 + 107;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    int i10 = $10 + 17;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                } else {
                    Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 7117, 15 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44463), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue() == cancelall.getAsAtTimestamp) {
                        Object[] objArr6 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault5 == null) {
                            byte b3 = (byte) 3;
                            byte b4 = (byte) (b3 - 3);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2945 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23, (char) (Color.alpha(0) + 27637), 794909189, false, $$r(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objCopydefault5).invoke(null, objArr6)).intValue();
                        int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr3[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr3[i12];
                    } else if (cancelall.copydefault == cancelall.ShareDataUIState) {
                        cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                        cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                        int i13 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                        int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr3[i13];
                        cArr4[cancelall.component2 + 1] = cArr3[i14];
                    } else {
                        int i15 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                        int i16 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                        cArr4[cancelall.component2] = cArr3[i15];
                        cArr4[cancelall.component2 + 1] = cArr3[i16];
                    }
                }
                cancelall.component2 += 2;
                int i17 = $10 + 59;
                $11 = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0117  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyConfirmActivity.onCreate(android.os.Bundle):void");
    }

    private final void initObserver() {
        int i = 2 % 2;
        ((SendMoneyConfirmViewModel) this.viewModel).getData().observe(this, new component3(new Function1() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 55;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                SendMoneyConfirmActivity sendMoneyConfirmActivity = this.f$0;
                Resource resource = (Resource) obj;
                if (i4 == 0) {
                    return SendMoneyConfirmActivity.$r8$lambda$IZ_SvqoAJwYfbfv1EBShSHgpFGQ(sendMoneyConfirmActivity, resource);
                }
                SendMoneyConfirmActivity.$r8$lambda$IZ_SvqoAJwYfbfv1EBShSHgpFGQ(sendMoneyConfirmActivity, resource);
                throw null;
            }
        }));
        int i2 = getRequestBeneficiariesState + 1;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit initObserver$lambda$0(SendMoneyConfirmActivity sendMoneyConfirmActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 111;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sendMoneyConfirmActivity, "");
            Utils.showOrHideLoading(sendMoneyConfirmActivity, resource);
            resource.error();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(sendMoneyConfirmActivity, "");
        Utils.showOrHideLoading(sendMoneyConfirmActivity, resource);
        if (resource.error()) {
            ToastUtils.showLong(resource.getException().getMessage(), new Object[0]);
        }
        if (resource.success()) {
            int i3 = getAsAtTimestamp + 87;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            Object data = resource.getData();
            Intrinsics.checkNotNullExpressionValue(data, "");
            sendMoneyConfirmActivity.gotoStartPay((CheckoutResp) data);
        }
        return Unit.INSTANCE;
    }

    private final void gotoStartPay(CheckoutResp data) {
        int i = 2 % 2;
        Bundle bundle = new Bundle(2);
        bundle.putSerializable("checkoutResp", data);
        bundle.putSerializable(FixedDataNavKeys.EXTRA_CONTACT_RESP, this.realContactResp);
        RouteUtils.routeWithExecute(RoutePathConstant.SEND_MONEY_PIN_PAYMENT, bundle);
        int i2 = getRequestBeneficiariesState + 97;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void initListener() {
        int i = 2 % 2;
        ((ActivitySendMoneyConfirmBinding) this.binding).btnConfirm.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component1 + 35;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                SendMoneyConfirmActivity.$r8$lambda$ql9Ozb_aYL7kYDwSTy3u8x4vbSo(this.f$0, view);
                int i5 = ShareDataUIState + 35;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 11 / 0;
                }
            }
        });
        int i2 = getRequestBeneficiariesState + 11;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void initListener$lambda$1(SendMoneyConfirmActivity sendMoneyConfirmActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sendMoneyConfirmActivity, "");
        ((SendMoneyConfirmViewModel) sendMoneyConfirmActivity.viewModel).preSendMoney(new PreSendMoneyParams(sendMoneyConfirmActivity.amount, sendMoneyConfirmActivity.phoneNumber, null, null, 12, null));
        int i2 = getAsAtTimestamp + 55;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void initView() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 117;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.realContactResp == null) {
                this.realContactResp = new RealContactResp(R.mipmap.icon_contact_1, "Joseph Mudibo", "0721436587");
                int i3 = getRequestBeneficiariesState + 69;
                getAsAtTimestamp = i3 % 128;
                int i4 = i3 % 2;
            }
            RoundImageView roundImageView = ((ActivitySendMoneyConfirmBinding) this.binding).ivAvatar;
            RealContactResp realContactResp = this.realContactResp;
            Intrinsics.checkNotNull(realContactResp);
            roundImageView.setImageResource(realContactResp.getImageRes());
            fillData();
            return;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void fillData() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.huawei.digitalpayment.consumer.sfcui.ui.resp.RealContactResp r2 = r6.realContactResp
            r3 = 0
            if (r2 == 0) goto L26
            int r4 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyConfirmActivity.getAsAtTimestamp
            int r4 = r4 + 49
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyConfirmActivity.getRequestBeneficiariesState = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L1f
            java.lang.String r2 = r2.getName()
            if (r2 != 0) goto L28
            goto L26
        L1f:
            r2.getName()
            r3.hashCode()
            throw r3
        L26:
            java.lang.String r2 = ""
        L28:
            com.huawei.digitalpayment.consumer.sfcui.ui.resp.SendConfirmResp r4 = new com.huawei.digitalpayment.consumer.sfcui.ui.resp.SendConfirmResp
            java.lang.String r5 = "Send to"
            r4.<init>(r5, r2)
            r1.add(r4)
            java.lang.String r2 = r6.amount
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Ksh "
            r4.<init>(r5)
            r4.append(r2)
            com.huawei.digitalpayment.consumer.sfcui.ui.resp.SendConfirmResp r2 = new com.huawei.digitalpayment.consumer.sfcui.ui.resp.SendConfirmResp
            java.lang.String r5 = "Amount"
            java.lang.String r4 = r4.toString()
            r2.<init>(r5, r4)
            r1.add(r2)
            com.huawei.digitalpayment.consumer.sfcui.ui.resp.SendConfirmResp r2 = new com.huawei.digitalpayment.consumer.sfcui.ui.resp.SendConfirmResp
            java.lang.String r4 = "fee"
            java.lang.String r5 = "Ksh 167"
            r2.<init>(r4, r5)
            r1.add(r2)
            Binding extends androidx.databinding.ViewDataBinding r2 = r6.binding
            com.huawei.digitalpayment.consumer.sfc.databinding.ActivitySendMoneyConfirmBinding r2 = (com.huawei.digitalpayment.consumer.sfc.databinding.ActivitySendMoneyConfirmBinding) r2
            androidx.recyclerview.widget.RecyclerView r2 = r2.rvConfirm
            androidx.recyclerview.widget.LinearLayoutManager r4 = new androidx.recyclerview.widget.LinearLayoutManager
            r5 = r6
            android.content.Context r5 = (android.content.Context) r5
            r4.<init>(r5)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r4
            r2.setLayoutManager(r4)
            Binding extends androidx.databinding.ViewDataBinding r2 = r6.binding
            com.huawei.digitalpayment.consumer.sfc.databinding.ActivitySendMoneyConfirmBinding r2 = (com.huawei.digitalpayment.consumer.sfc.databinding.ActivitySendMoneyConfirmBinding) r2
            androidx.recyclerview.widget.RecyclerView r2 = r2.rvConfirm
            int r4 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_confirm
            com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyConfirmActivity$fillData$1 r5 = new com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyConfirmActivity$fillData$1
            r5.<init>(r1, r4)
            androidx.recyclerview.widget.RecyclerView$Adapter r5 = (androidx.recyclerview.widget.RecyclerView.Adapter) r5
            r2.setAdapter(r5)
            com.huawei.common.widget.recyclerview.RecycleViewDivider r1 = new com.huawei.common.widget.recyclerview.RecycleViewDivider
            int r2 = com.huawei.digitalpayment.consumer.sfc.R.color.color_cbd5e1
            int r2 = com.blankj.utilcode.util.ColorUtils.getColor(r2)
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = com.blankj.utilcode.util.SizeUtils.dp2px(r4)
            r1.<init>(r2, r4)
            r2 = 0
            r1.setShowEndLine(r2)
            Binding extends androidx.databinding.ViewDataBinding r2 = r6.binding
            com.huawei.digitalpayment.consumer.sfc.databinding.ActivitySendMoneyConfirmBinding r2 = (com.huawei.digitalpayment.consumer.sfc.databinding.ActivitySendMoneyConfirmBinding) r2
            androidx.recyclerview.widget.RecyclerView r2 = r2.rvConfirm
            androidx.recyclerview.widget.RecyclerView$ItemDecoration r1 = (androidx.recyclerview.widget.RecyclerView.ItemDecoration) r1
            r2.addItemDecoration(r1)
            int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyConfirmActivity.getAsAtTimestamp
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyConfirmActivity.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            if (r1 == 0) goto La9
            return
        La9:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyConfirmActivity.fillData():void");
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 75;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(R.string.send_money_confirm));
        int i4 = getAsAtTimestamp + 35;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00dd  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyConfirmActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c4  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyConfirmActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:314|(12:316|(3:318|(4:320|323|324|(1:326)(1:327))|328)(2:321|(3:323|324|(0)(0))(1:328))|431|959|432|(11:434|958|435|440|441|957|(5:443|444|(1:446)|447|448)(22:449|450|951|451|(2:918|453)|457|458|930|459|(2:953|461)|465|466|467|(1:469)|470|471|928|472|(2:943|474)(1:476)|477|(2:479|480)|481)|482|(5:485|486|(2:488|990)(11:489|(3:491|(3:494|495|492)|991)|498|901|499|(1:501)|502|503|892|504|989)|505|483)|988|517)(8:440|441|957|(0)(0)|482|(1:483)|988|517)|549|(1:551)|552|(3:554|(1:556)|557)(14:558|559|(1:561)|562|563|(1:565)|566|874|567|568|(1:570)(1:571)|572|(1:574)|575)|576|(9:578|(1:580)|581|(1:583)(1:584)|585|(3:587|(1:589)|590)(16:592|593|(1:595)|596|(1:598)|599|600|(1:602)|603|882|604|605|(1:607)|608|(1:610)|611)|591|612|(26:614|880|615|(1:617)|618|(4:620|621|872|622)(1:623)|624|625|(2:627|(5:629|630|(1:632)|633|634)(3:635|(1:637)|638))(17:639|(2:641|(1:647)(1:646))|(19:649|650|858|651|(1:653)|654|655|854|656|(1:658)|659|660|661|(1:663)|664|(1:666)|667|(1:669)|670)|728|(1:730)|731|(3:733|(1:735)|736)(13:738|961|739|740|(1:742)|743|911|744|745|(1:747)|748|(1:750)|751)|737|752|(6:755|756|(1:758)|759|760|761)|762|(1:764)|765|(3:767|(1:769)|770)(14:772|773|(1:775)|776|777|(1:779)|780|920|781|782|(1:784)|785|(1:787)|788)|771|789|(1:992)(7:792|793|(1:795)|796|797|798|799))|671|(4:674|(3:981|676|984)(12:980|677|(3:679|(3:682|683|680)|985)|684|967|685|(1:687)|688|689|965|690|983)|982|672)|979|728|(0)|731|(0)(0)|737|752|(0)|762|(0)|765|(0)(0)|771|789|(0)(0))(10:809|(3:811|(2:814|812)|986)|815|816|(1:818)|819|(1:821)|822|823|824))(10:827|(3:829|(2:832|830)|987)|833|834|(1:836)|837|(1:839)|840|841|842))(1:330)|(20:332|916|333|(2:860|335)|339|340|896|341|(3:343|926|344)|348|349|350|(2:352|353)|354|355|356|(2:913|358)(1:360)|361|(2:363|364)|365)(11:413|431|959|432|(0)(0)|549|(0)|552|(0)(0)|576|(0)(0))|420|899|421|424|425|(1:427)|428|429|430|431|959|432|(0)(0)|549|(0)|552|(0)(0)|576|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(60:(52:33|(3:35|(3:37|40|(1:42)(1:43))|44)(2:38|(2:40|(0)(0))(1:44))|81|933|82|(2:969|84)|88|89|898|(5:91|92|(1:94)|95|96)(19:98|99|924|100|101|907|102|(2:963|104)|108|109|110|(3:112|941|113)|117|118|119|(1:121)(1:122)|123|(1:125)|126)|97|127|(10:130|890|131|(1:133)|134|135|136|876|137|138)|174|937|175|(2:945|177)|181|182|932|(4:184|185|(1:187)|188)(19:190|191|909|192|(3:194|866|195)|199|200|888|201|(2:886|203)|207|208|209|(2:211|212)|213|(2:215|216)(1:218)|219|(2:221|222)|223)|224|(4:227|(2:229|973)(11:230|(3:232|(4:235|236|237|233)|974)|238|868|239|(1:241)|242|243|856|244|972)|245|225)|971|257|286|955|287|(1:289)|290|291|947|292|(6:294|922|295|296|915|297)(1:302)|939|303|304|(5:306|307|(1:309)|310|311)(22:314|(12:316|(3:318|(4:320|323|324|(1:326)(1:327))|328)(2:321|(3:323|324|(0)(0))(1:328))|431|959|432|(11:434|958|435|440|441|957|(5:443|444|(1:446)|447|448)(22:449|450|951|451|(2:918|453)|457|458|930|459|(2:953|461)|465|466|467|(1:469)|470|471|928|472|(2:943|474)(1:476)|477|(2:479|480)|481)|482|(5:485|486|(2:488|990)(11:489|(3:491|(3:494|495|492)|991)|498|901|499|(1:501)|502|503|892|504|989)|505|483)|988|517)(8:440|441|957|(0)(0)|482|(1:483)|988|517)|549|(1:551)|552|(3:554|(1:556)|557)(14:558|559|(1:561)|562|563|(1:565)|566|874|567|568|(1:570)(1:571)|572|(1:574)|575)|576|(9:578|(1:580)|581|(1:583)(1:584)|585|(3:587|(1:589)|590)(16:592|593|(1:595)|596|(1:598)|599|600|(1:602)|603|882|604|605|(1:607)|608|(1:610)|611)|591|612|(26:614|880|615|(1:617)|618|(4:620|621|872|622)(1:623)|624|625|(2:627|(5:629|630|(1:632)|633|634)(3:635|(1:637)|638))(17:639|(2:641|(1:647)(1:646))|(19:649|650|858|651|(1:653)|654|655|854|656|(1:658)|659|660|661|(1:663)|664|(1:666)|667|(1:669)|670)|728|(1:730)|731|(3:733|(1:735)|736)(13:738|961|739|740|(1:742)|743|911|744|745|(1:747)|748|(1:750)|751)|737|752|(6:755|756|(1:758)|759|760|761)|762|(1:764)|765|(3:767|(1:769)|770)(14:772|773|(1:775)|776|777|(1:779)|780|920|781|782|(1:784)|785|(1:787)|788)|771|789|(1:992)(7:792|793|(1:795)|796|797|798|799))|671|(4:674|(3:981|676|984)(12:980|677|(3:679|(3:682|683|680)|985)|684|967|685|(1:687)|688|689|965|690|983)|982|672)|979|728|(0)|731|(0)(0)|737|752|(0)|762|(0)|765|(0)(0)|771|789|(0)(0))(10:809|(3:811|(2:814|812)|986)|815|816|(1:818)|819|(1:821)|822|823|824))(10:827|(3:829|(2:832|830)|987)|833|834|(1:836)|837|(1:839)|840|841|842))(1:330)|(20:332|916|333|(2:860|335)|339|340|896|341|(3:343|926|344)|348|349|350|(2:352|353)|354|355|356|(2:913|358)(1:360)|361|(2:363|364)|365)(11:413|431|959|432|(0)(0)|549|(0)|552|(0)(0)|576|(0)(0))|420|899|421|424|425|(1:427)|428|429|430|431|959|432|(0)(0)|549|(0)|552|(0)(0)|576|(0)(0))|366|(4:369|(2:371|977)(11:372|(3:374|(3:377|378|375)|978)|381|884|382|(1:384)|385|386|864|387|976)|388|367)|975|400|431|959|432|(0)(0)|549|(0)|552|(0)(0)|576|(0)(0))(1:48)|905|50|(1:52)|53|894|54|(1:56)|57|58|81|933|82|(0)|88|89|898|(0)(0)|97|127|(0)|174|937|175|(0)|181|182|932|(0)(0)|224|(1:225)|971|257|286|955|287|(0)|290|291|947|292|(0)(0)|939|303|304|(0)(0)|366|(1:367)|975|400|431|959|432|(0)(0)|549|(0)|552|(0)(0)|576|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(67:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|873|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|(1:956)|(52:33|(3:35|(3:37|40|(1:42)(1:43))|44)(2:38|(2:40|(0)(0))(1:44))|81|933|82|(2:969|84)|88|89|898|(5:91|92|(1:94)|95|96)(19:98|99|924|100|101|907|102|(2:963|104)|108|109|110|(3:112|941|113)|117|118|119|(1:121)(1:122)|123|(1:125)|126)|97|127|(10:130|890|131|(1:133)|134|135|136|876|137|138)|174|937|175|(2:945|177)|181|182|932|(4:184|185|(1:187)|188)(19:190|191|909|192|(3:194|866|195)|199|200|888|201|(2:886|203)|207|208|209|(2:211|212)|213|(2:215|216)(1:218)|219|(2:221|222)|223)|224|(4:227|(2:229|973)(11:230|(3:232|(4:235|236|237|233)|974)|238|868|239|(1:241)|242|243|856|244|972)|245|225)|971|257|286|955|287|(1:289)|290|291|947|292|(6:294|922|295|296|915|297)(1:302)|939|303|304|(5:306|307|(1:309)|310|311)(22:314|(12:316|(3:318|(4:320|323|324|(1:326)(1:327))|328)(2:321|(3:323|324|(0)(0))(1:328))|431|959|432|(11:434|958|435|440|441|957|(5:443|444|(1:446)|447|448)(22:449|450|951|451|(2:918|453)|457|458|930|459|(2:953|461)|465|466|467|(1:469)|470|471|928|472|(2:943|474)(1:476)|477|(2:479|480)|481)|482|(5:485|486|(2:488|990)(11:489|(3:491|(3:494|495|492)|991)|498|901|499|(1:501)|502|503|892|504|989)|505|483)|988|517)(8:440|441|957|(0)(0)|482|(1:483)|988|517)|549|(1:551)|552|(3:554|(1:556)|557)(14:558|559|(1:561)|562|563|(1:565)|566|874|567|568|(1:570)(1:571)|572|(1:574)|575)|576|(9:578|(1:580)|581|(1:583)(1:584)|585|(3:587|(1:589)|590)(16:592|593|(1:595)|596|(1:598)|599|600|(1:602)|603|882|604|605|(1:607)|608|(1:610)|611)|591|612|(26:614|880|615|(1:617)|618|(4:620|621|872|622)(1:623)|624|625|(2:627|(5:629|630|(1:632)|633|634)(3:635|(1:637)|638))(17:639|(2:641|(1:647)(1:646))|(19:649|650|858|651|(1:653)|654|655|854|656|(1:658)|659|660|661|(1:663)|664|(1:666)|667|(1:669)|670)|728|(1:730)|731|(3:733|(1:735)|736)(13:738|961|739|740|(1:742)|743|911|744|745|(1:747)|748|(1:750)|751)|737|752|(6:755|756|(1:758)|759|760|761)|762|(1:764)|765|(3:767|(1:769)|770)(14:772|773|(1:775)|776|777|(1:779)|780|920|781|782|(1:784)|785|(1:787)|788)|771|789|(1:992)(7:792|793|(1:795)|796|797|798|799))|671|(4:674|(3:981|676|984)(12:980|677|(3:679|(3:682|683|680)|985)|684|967|685|(1:687)|688|689|965|690|983)|982|672)|979|728|(0)|731|(0)(0)|737|752|(0)|762|(0)|765|(0)(0)|771|789|(0)(0))(10:809|(3:811|(2:814|812)|986)|815|816|(1:818)|819|(1:821)|822|823|824))(10:827|(3:829|(2:832|830)|987)|833|834|(1:836)|837|(1:839)|840|841|842))(1:330)|(20:332|916|333|(2:860|335)|339|340|896|341|(3:343|926|344)|348|349|350|(2:352|353)|354|355|356|(2:913|358)(1:360)|361|(2:363|364)|365)(11:413|431|959|432|(0)(0)|549|(0)|552|(0)(0)|576|(0)(0))|420|899|421|424|425|(1:427)|428|429|430|431|959|432|(0)(0)|549|(0)|552|(0)(0)|576|(0)(0))|366|(4:369|(2:371|977)(11:372|(3:374|(3:377|378|375)|978)|381|884|382|(1:384)|385|386|864|387|976)|388|367)|975|400|431|959|432|(0)(0)|549|(0)|552|(0)(0)|576|(0)(0))(1:48)|49|905|50|(1:52)|53|894|54|(1:56)|57|58|81|933|82|(0)|88|89|898|(0)(0)|97|127|(0)|174|937|175|(0)|181|182|932|(0)(0)|224|(1:225)|971|257|286|955|287|(0)|290|291|947|292|(0)(0)|939|303|304|(0)(0)|366|(1:367)|975|400|431|959|432|(0)(0)|549|(0)|552|(0)(0)|576|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(67:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|873|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|956|(52:33|(3:35|(3:37|40|(1:42)(1:43))|44)(2:38|(2:40|(0)(0))(1:44))|81|933|82|(2:969|84)|88|89|898|(5:91|92|(1:94)|95|96)(19:98|99|924|100|101|907|102|(2:963|104)|108|109|110|(3:112|941|113)|117|118|119|(1:121)(1:122)|123|(1:125)|126)|97|127|(10:130|890|131|(1:133)|134|135|136|876|137|138)|174|937|175|(2:945|177)|181|182|932|(4:184|185|(1:187)|188)(19:190|191|909|192|(3:194|866|195)|199|200|888|201|(2:886|203)|207|208|209|(2:211|212)|213|(2:215|216)(1:218)|219|(2:221|222)|223)|224|(4:227|(2:229|973)(11:230|(3:232|(4:235|236|237|233)|974)|238|868|239|(1:241)|242|243|856|244|972)|245|225)|971|257|286|955|287|(1:289)|290|291|947|292|(6:294|922|295|296|915|297)(1:302)|939|303|304|(5:306|307|(1:309)|310|311)(22:314|(12:316|(3:318|(4:320|323|324|(1:326)(1:327))|328)(2:321|(3:323|324|(0)(0))(1:328))|431|959|432|(11:434|958|435|440|441|957|(5:443|444|(1:446)|447|448)(22:449|450|951|451|(2:918|453)|457|458|930|459|(2:953|461)|465|466|467|(1:469)|470|471|928|472|(2:943|474)(1:476)|477|(2:479|480)|481)|482|(5:485|486|(2:488|990)(11:489|(3:491|(3:494|495|492)|991)|498|901|499|(1:501)|502|503|892|504|989)|505|483)|988|517)(8:440|441|957|(0)(0)|482|(1:483)|988|517)|549|(1:551)|552|(3:554|(1:556)|557)(14:558|559|(1:561)|562|563|(1:565)|566|874|567|568|(1:570)(1:571)|572|(1:574)|575)|576|(9:578|(1:580)|581|(1:583)(1:584)|585|(3:587|(1:589)|590)(16:592|593|(1:595)|596|(1:598)|599|600|(1:602)|603|882|604|605|(1:607)|608|(1:610)|611)|591|612|(26:614|880|615|(1:617)|618|(4:620|621|872|622)(1:623)|624|625|(2:627|(5:629|630|(1:632)|633|634)(3:635|(1:637)|638))(17:639|(2:641|(1:647)(1:646))|(19:649|650|858|651|(1:653)|654|655|854|656|(1:658)|659|660|661|(1:663)|664|(1:666)|667|(1:669)|670)|728|(1:730)|731|(3:733|(1:735)|736)(13:738|961|739|740|(1:742)|743|911|744|745|(1:747)|748|(1:750)|751)|737|752|(6:755|756|(1:758)|759|760|761)|762|(1:764)|765|(3:767|(1:769)|770)(14:772|773|(1:775)|776|777|(1:779)|780|920|781|782|(1:784)|785|(1:787)|788)|771|789|(1:992)(7:792|793|(1:795)|796|797|798|799))|671|(4:674|(3:981|676|984)(12:980|677|(3:679|(3:682|683|680)|985)|684|967|685|(1:687)|688|689|965|690|983)|982|672)|979|728|(0)|731|(0)(0)|737|752|(0)|762|(0)|765|(0)(0)|771|789|(0)(0))(10:809|(3:811|(2:814|812)|986)|815|816|(1:818)|819|(1:821)|822|823|824))(10:827|(3:829|(2:832|830)|987)|833|834|(1:836)|837|(1:839)|840|841|842))(1:330)|(20:332|916|333|(2:860|335)|339|340|896|341|(3:343|926|344)|348|349|350|(2:352|353)|354|355|356|(2:913|358)(1:360)|361|(2:363|364)|365)(11:413|431|959|432|(0)(0)|549|(0)|552|(0)(0)|576|(0)(0))|420|899|421|424|425|(1:427)|428|429|430|431|959|432|(0)(0)|549|(0)|552|(0)(0)|576|(0)(0))|366|(4:369|(2:371|977)(11:372|(3:374|(3:377|378|375)|978)|381|884|382|(1:384)|385|386|864|387|976)|388|367)|975|400|431|959|432|(0)(0)|549|(0)|552|(0)(0)|576|(0)(0))(1:48)|49|905|50|(1:52)|53|894|54|(1:56)|57|58|81|933|82|(0)|88|89|898|(0)(0)|97|127|(0)|174|937|175|(0)|181|182|932|(0)(0)|224|(1:225)|971|257|286|955|287|(0)|290|291|947|292|(0)(0)|939|303|304|(0)(0)|366|(1:367)|975|400|431|959|432|(0)(0)|549|(0)|552|(0)(0)|576|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x09cd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x09ce, code lost:
    
        r3 = r3;
        r10 = r10;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x09df, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x09e0, code lost:
    
        r10 = r24;
        r3 = r26;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0a73, code lost:
    
        r31 = android.view.View.resolveSizeAndState(0, 0, 0) + 6618;
        r2 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r31, 42 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) android.text.TextUtils.getTrimmedLength(""), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
        r31 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0f5f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0f61, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0f62, code lost:
    
        r13 = r3;
        r31 = r10;
        r8 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0f66, code lost:
    
        r1 = r0;
        r8 = r8;
        r13 = r13;
        r31 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0fe9, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - android.view.KeyEvent.keyCodeFromString(""), 42 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x1665, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x1666, code lost:
    
        r31 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x1669, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x166a, code lost:
    
        r31 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x166d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x166e, code lost:
    
        r1 = r0;
        r31 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x16ce, code lost:
    
        r1 = java.lang.String.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x1bfc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x1bfd, code lost:
    
        r10 = r31;
        r8 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0a73 A[Catch: all -> 0x03b8, TryCatch #10 {all -> 0x03b8, blocks: (B:280:0x0fe3, B:282:0x0fe9, B:283:0x1012, B:543:0x1c68, B:545:0x1c6e, B:546:0x1c95, B:756:0x2e99, B:758:0x2e9f, B:759:0x2ecb, B:793:0x31c8, B:795:0x31ce, B:796:0x31f0, B:773:0x300c, B:775:0x302f, B:776:0x3087, B:722:0x2b81, B:724:0x2b87, B:725:0x2bae, B:816:0x32c6, B:818:0x32cc, B:819:0x32ec, B:821:0x3326, B:822:0x3368, B:593:0x229e, B:595:0x22b3, B:596:0x22dd, B:598:0x2311, B:599:0x238c, B:834:0x341e, B:836:0x3424, B:837:0x344b, B:839:0x3485, B:840:0x34cc, B:559:0x1e74, B:561:0x1e89, B:562:0x1ebb, B:425:0x1701, B:427:0x1707, B:428:0x172f, B:168:0x0a6d, B:170:0x0a73, B:171:0x0a9b, B:75:0x059b, B:77:0x05a1, B:78:0x05ce, B:19:0x017b, B:21:0x0181, B:22:0x01aa, B:24:0x0322, B:26:0x0354, B:27:0x03b2, B:35:0x03d3, B:40:0x03e0, B:61:0x04c6, B:63:0x04cc, B:64:0x04cd, B:66:0x04cf, B:68:0x04d6, B:69:0x04d7, B:44:0x03ec, B:38:0x03dc), top: B:873:0x017b, inners: #54 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0b7d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0bd2 A[Catch: all -> 0x0f61, TRY_ENTER, TRY_LEAVE, TryCatch #44 {all -> 0x0f61, blocks: (B:175:0x0b1a, B:181:0x0b70, B:224:0x0df5, B:225:0x0df9, B:227:0x0dff, B:230:0x0e1c, B:190:0x0bd2, B:209:0x0cd5, B:213:0x0d1a, B:219:0x0d8e, B:223:0x0ded), top: B:937:0x0b1a }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0dff A[Catch: all -> 0x0f61, TryCatch #44 {all -> 0x0f61, blocks: (B:175:0x0b1a, B:181:0x0b70, B:224:0x0df5, B:225:0x0df9, B:227:0x0dff, B:230:0x0e1c, B:190:0x0bd2, B:209:0x0cd5, B:213:0x0d1a, B:219:0x0d8e, B:223:0x0ded), top: B:937:0x0b1a }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0fe9 A[Catch: all -> 0x03b8, TryCatch #10 {all -> 0x03b8, blocks: (B:280:0x0fe3, B:282:0x0fe9, B:283:0x1012, B:543:0x1c68, B:545:0x1c6e, B:546:0x1c95, B:756:0x2e99, B:758:0x2e9f, B:759:0x2ecb, B:793:0x31c8, B:795:0x31ce, B:796:0x31f0, B:773:0x300c, B:775:0x302f, B:776:0x3087, B:722:0x2b81, B:724:0x2b87, B:725:0x2bae, B:816:0x32c6, B:818:0x32cc, B:819:0x32ec, B:821:0x3326, B:822:0x3368, B:593:0x229e, B:595:0x22b3, B:596:0x22dd, B:598:0x2311, B:599:0x238c, B:834:0x341e, B:836:0x3424, B:837:0x344b, B:839:0x3485, B:840:0x34cc, B:559:0x1e74, B:561:0x1e89, B:562:0x1ebb, B:425:0x1701, B:427:0x1707, B:428:0x172f, B:168:0x0a6d, B:170:0x0a73, B:171:0x0a9b, B:75:0x059b, B:77:0x05a1, B:78:0x05ce, B:19:0x017b, B:21:0x0181, B:22:0x01aa, B:24:0x0322, B:26:0x0354, B:27:0x03b2, B:35:0x03d3, B:40:0x03e0, B:61:0x04c6, B:63:0x04cc, B:64:0x04cd, B:66:0x04cf, B:68:0x04d6, B:69:0x04d7, B:44:0x03ec, B:38:0x03dc), top: B:873:0x017b, inners: #54 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x109d A[Catch: all -> 0x166d, TryCatch #53 {all -> 0x166d, blocks: (B:287:0x1097, B:289:0x109d, B:290:0x10e8, B:391:0x1633, B:393:0x1639, B:394:0x163a, B:396:0x163c, B:398:0x1643, B:399:0x1644, B:403:0x164d, B:405:0x1653, B:406:0x1654, B:409:0x1659, B:411:0x165f, B:412:0x1660, B:387:0x15b8, B:382:0x1581, B:384:0x1587, B:385:0x15b0), top: B:955:0x1097, inners: #5, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x1111  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x1162  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x117a  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x11d6  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x1204  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x1205  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x1521 A[Catch: all -> 0x1669, TryCatch #49 {all -> 0x1669, blocks: (B:292:0x10f8, B:366:0x1517, B:367:0x151b, B:369:0x1521, B:372:0x153c, B:356:0x1448, B:361:0x14b2, B:365:0x150f), top: B:947:0x10f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x1707 A[Catch: all -> 0x03b8, TryCatch #10 {all -> 0x03b8, blocks: (B:280:0x0fe3, B:282:0x0fe9, B:283:0x1012, B:543:0x1c68, B:545:0x1c6e, B:546:0x1c95, B:756:0x2e99, B:758:0x2e9f, B:759:0x2ecb, B:793:0x31c8, B:795:0x31ce, B:796:0x31f0, B:773:0x300c, B:775:0x302f, B:776:0x3087, B:722:0x2b81, B:724:0x2b87, B:725:0x2bae, B:816:0x32c6, B:818:0x32cc, B:819:0x32ec, B:821:0x3326, B:822:0x3368, B:593:0x229e, B:595:0x22b3, B:596:0x22dd, B:598:0x2311, B:599:0x238c, B:834:0x341e, B:836:0x3424, B:837:0x344b, B:839:0x3485, B:840:0x34cc, B:559:0x1e74, B:561:0x1e89, B:562:0x1ebb, B:425:0x1701, B:427:0x1707, B:428:0x172f, B:168:0x0a6d, B:170:0x0a73, B:171:0x0a9b, B:75:0x059b, B:77:0x05a1, B:78:0x05ce, B:19:0x017b, B:21:0x0181, B:22:0x01aa, B:24:0x0322, B:26:0x0354, B:27:0x03b2, B:35:0x03d3, B:40:0x03e0, B:61:0x04c6, B:63:0x04cc, B:64:0x04cd, B:66:0x04cf, B:68:0x04d6, B:69:0x04d7, B:44:0x03ec, B:38:0x03dc), top: B:873:0x017b, inners: #54 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x17b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x1804 A[Catch: all -> 0x1bfc, PHI: r1
  0x1804: PHI (r1v476 java.lang.Object) = (r1v475 java.lang.Object), (r1v527 java.lang.Object) binds: [B:433:0x17b6, B:435:0x17b9] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #57 {all -> 0x1bfc, blocks: (B:432:0x17b2, B:440:0x1804, B:449:0x186b, B:467:0x1981, B:470:0x19cd), top: B:959:0x17b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x1811  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x186b A[Catch: all -> 0x1bfc, TRY_ENTER, TRY_LEAVE, TryCatch #57 {all -> 0x1bfc, blocks: (B:432:0x17b2, B:440:0x1804, B:449:0x186b, B:467:0x1981, B:470:0x19cd), top: B:959:0x17b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:485:0x1aab  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x1c6e A[Catch: all -> 0x03b8, TryCatch #10 {all -> 0x03b8, blocks: (B:280:0x0fe3, B:282:0x0fe9, B:283:0x1012, B:543:0x1c68, B:545:0x1c6e, B:546:0x1c95, B:756:0x2e99, B:758:0x2e9f, B:759:0x2ecb, B:793:0x31c8, B:795:0x31ce, B:796:0x31f0, B:773:0x300c, B:775:0x302f, B:776:0x3087, B:722:0x2b81, B:724:0x2b87, B:725:0x2bae, B:816:0x32c6, B:818:0x32cc, B:819:0x32ec, B:821:0x3326, B:822:0x3368, B:593:0x229e, B:595:0x22b3, B:596:0x22dd, B:598:0x2311, B:599:0x238c, B:834:0x341e, B:836:0x3424, B:837:0x344b, B:839:0x3485, B:840:0x34cc, B:559:0x1e74, B:561:0x1e89, B:562:0x1ebb, B:425:0x1701, B:427:0x1707, B:428:0x172f, B:168:0x0a6d, B:170:0x0a73, B:171:0x0a9b, B:75:0x059b, B:77:0x05a1, B:78:0x05ce, B:19:0x017b, B:21:0x0181, B:22:0x01aa, B:24:0x0322, B:26:0x0354, B:27:0x03b2, B:35:0x03d3, B:40:0x03e0, B:61:0x04c6, B:63:0x04cc, B:64:0x04cd, B:66:0x04cf, B:68:0x04d6, B:69:0x04d7, B:44:0x03ec, B:38:0x03dc), top: B:873:0x017b, inners: #54 }] */
    /* JADX WARN: Removed duplicated region for block: B:551:0x1d19  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x1d65  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x1e52  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x2000  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x2c34  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x2c7c  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x2cd0  */
    /* JADX WARN: Removed duplicated region for block: B:755:0x2e7b  */
    /* JADX WARN: Removed duplicated region for block: B:764:0x2f53  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x2f9d  */
    /* JADX WARN: Removed duplicated region for block: B:772:0x2fee  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x31a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:827:0x33e2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:945:0x0b20 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:969:0x0656 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x070d A[Catch: all -> 0x09df, TRY_ENTER, TRY_LEAVE, TryCatch #42 {all -> 0x09df, blocks: (B:82:0x0650, B:88:0x06a4, B:98:0x070d), top: B:933:0x0650 }] */
    /* JADX WARN: Removed duplicated region for block: B:992:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v100 */
    /* JADX WARN: Type inference failed for: r10v103, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v104 */
    /* JADX WARN: Type inference failed for: r10v105 */
    /* JADX WARN: Type inference failed for: r10v106 */
    /* JADX WARN: Type inference failed for: r10v107 */
    /* JADX WARN: Type inference failed for: r10v108 */
    /* JADX WARN: Type inference failed for: r10v109 */
    /* JADX WARN: Type inference failed for: r10v114, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v115 */
    /* JADX WARN: Type inference failed for: r10v116 */
    /* JADX WARN: Type inference failed for: r10v125, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v130 */
    /* JADX WARN: Type inference failed for: r10v131 */
    /* JADX WARN: Type inference failed for: r10v132 */
    /* JADX WARN: Type inference failed for: r10v136 */
    /* JADX WARN: Type inference failed for: r10v137 */
    /* JADX WARN: Type inference failed for: r10v143 */
    /* JADX WARN: Type inference failed for: r10v144 */
    /* JADX WARN: Type inference failed for: r10v149 */
    /* JADX WARN: Type inference failed for: r10v151 */
    /* JADX WARN: Type inference failed for: r10v152 */
    /* JADX WARN: Type inference failed for: r10v153 */
    /* JADX WARN: Type inference failed for: r10v154 */
    /* JADX WARN: Type inference failed for: r10v162 */
    /* JADX WARN: Type inference failed for: r10v167 */
    /* JADX WARN: Type inference failed for: r10v168 */
    /* JADX WARN: Type inference failed for: r10v171 */
    /* JADX WARN: Type inference failed for: r10v179 */
    /* JADX WARN: Type inference failed for: r10v180 */
    /* JADX WARN: Type inference failed for: r10v181 */
    /* JADX WARN: Type inference failed for: r10v182 */
    /* JADX WARN: Type inference failed for: r10v183 */
    /* JADX WARN: Type inference failed for: r10v184 */
    /* JADX WARN: Type inference failed for: r10v185 */
    /* JADX WARN: Type inference failed for: r10v186 */
    /* JADX WARN: Type inference failed for: r10v187 */
    /* JADX WARN: Type inference failed for: r10v188 */
    /* JADX WARN: Type inference failed for: r10v189 */
    /* JADX WARN: Type inference failed for: r10v190 */
    /* JADX WARN: Type inference failed for: r10v191 */
    /* JADX WARN: Type inference failed for: r10v192 */
    /* JADX WARN: Type inference failed for: r10v193 */
    /* JADX WARN: Type inference failed for: r10v194 */
    /* JADX WARN: Type inference failed for: r10v195 */
    /* JADX WARN: Type inference failed for: r10v196 */
    /* JADX WARN: Type inference failed for: r10v197 */
    /* JADX WARN: Type inference failed for: r10v198 */
    /* JADX WARN: Type inference failed for: r10v199 */
    /* JADX WARN: Type inference failed for: r10v200 */
    /* JADX WARN: Type inference failed for: r10v201 */
    /* JADX WARN: Type inference failed for: r10v202 */
    /* JADX WARN: Type inference failed for: r10v203 */
    /* JADX WARN: Type inference failed for: r10v204 */
    /* JADX WARN: Type inference failed for: r10v205 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r10v52 */
    /* JADX WARN: Type inference failed for: r10v53, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v54 */
    /* JADX WARN: Type inference failed for: r10v55 */
    /* JADX WARN: Type inference failed for: r10v56 */
    /* JADX WARN: Type inference failed for: r10v57 */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r10v59, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v95 */
    /* JADX WARN: Type inference failed for: r10v96 */
    /* JADX WARN: Type inference failed for: r10v97 */
    /* JADX WARN: Type inference failed for: r10v98 */
    /* JADX WARN: Type inference failed for: r10v99 */
    /* JADX WARN: Type inference failed for: r11v126 */
    /* JADX WARN: Type inference failed for: r11v127 */
    /* JADX WARN: Type inference failed for: r11v128 */
    /* JADX WARN: Type inference failed for: r11v130 */
    /* JADX WARN: Type inference failed for: r11v147 */
    /* JADX WARN: Type inference failed for: r11v148 */
    /* JADX WARN: Type inference failed for: r11v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r13v100 */
    /* JADX WARN: Type inference failed for: r13v101, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r13v102 */
    /* JADX WARN: Type inference failed for: r13v103 */
    /* JADX WARN: Type inference failed for: r13v104 */
    /* JADX WARN: Type inference failed for: r13v113 */
    /* JADX WARN: Type inference failed for: r13v114 */
    /* JADX WARN: Type inference failed for: r13v115 */
    /* JADX WARN: Type inference failed for: r13v116 */
    /* JADX WARN: Type inference failed for: r13v117 */
    /* JADX WARN: Type inference failed for: r13v118 */
    /* JADX WARN: Type inference failed for: r13v119 */
    /* JADX WARN: Type inference failed for: r13v120 */
    /* JADX WARN: Type inference failed for: r13v121 */
    /* JADX WARN: Type inference failed for: r13v122 */
    /* JADX WARN: Type inference failed for: r13v123 */
    /* JADX WARN: Type inference failed for: r13v124 */
    /* JADX WARN: Type inference failed for: r13v125 */
    /* JADX WARN: Type inference failed for: r13v126 */
    /* JADX WARN: Type inference failed for: r13v127 */
    /* JADX WARN: Type inference failed for: r13v128 */
    /* JADX WARN: Type inference failed for: r13v129 */
    /* JADX WARN: Type inference failed for: r13v130 */
    /* JADX WARN: Type inference failed for: r13v131 */
    /* JADX WARN: Type inference failed for: r13v132 */
    /* JADX WARN: Type inference failed for: r13v133 */
    /* JADX WARN: Type inference failed for: r13v134 */
    /* JADX WARN: Type inference failed for: r13v135 */
    /* JADX WARN: Type inference failed for: r13v136 */
    /* JADX WARN: Type inference failed for: r13v137 */
    /* JADX WARN: Type inference failed for: r13v138 */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r13v59 */
    /* JADX WARN: Type inference failed for: r13v60 */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r13v62 */
    /* JADX WARN: Type inference failed for: r13v63, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v77 */
    /* JADX WARN: Type inference failed for: r13v78 */
    /* JADX WARN: Type inference failed for: r13v79 */
    /* JADX WARN: Type inference failed for: r13v80 */
    /* JADX WARN: Type inference failed for: r13v81 */
    /* JADX WARN: Type inference failed for: r13v82 */
    /* JADX WARN: Type inference failed for: r13v84 */
    /* JADX WARN: Type inference failed for: r13v85 */
    /* JADX WARN: Type inference failed for: r13v86 */
    /* JADX WARN: Type inference failed for: r13v87 */
    /* JADX WARN: Type inference failed for: r13v88 */
    /* JADX WARN: Type inference failed for: r13v89 */
    /* JADX WARN: Type inference failed for: r13v90 */
    /* JADX WARN: Type inference failed for: r13v92 */
    /* JADX WARN: Type inference failed for: r13v93 */
    /* JADX WARN: Type inference failed for: r13v94 */
    /* JADX WARN: Type inference failed for: r1v169, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r31v100 */
    /* JADX WARN: Type inference failed for: r31v101 */
    /* JADX WARN: Type inference failed for: r31v102 */
    /* JADX WARN: Type inference failed for: r31v103 */
    /* JADX WARN: Type inference failed for: r31v108 */
    /* JADX WARN: Type inference failed for: r31v110 */
    /* JADX WARN: Type inference failed for: r31v113 */
    /* JADX WARN: Type inference failed for: r31v114 */
    /* JADX WARN: Type inference failed for: r31v115 */
    /* JADX WARN: Type inference failed for: r31v166 */
    /* JADX WARN: Type inference failed for: r31v167 */
    /* JADX WARN: Type inference failed for: r31v168 */
    /* JADX WARN: Type inference failed for: r31v169 */
    /* JADX WARN: Type inference failed for: r31v17 */
    /* JADX WARN: Type inference failed for: r31v170 */
    /* JADX WARN: Type inference failed for: r31v171 */
    /* JADX WARN: Type inference failed for: r31v172 */
    /* JADX WARN: Type inference failed for: r31v173 */
    /* JADX WARN: Type inference failed for: r31v18 */
    /* JADX WARN: Type inference failed for: r31v19 */
    /* JADX WARN: Type inference failed for: r31v20 */
    /* JADX WARN: Type inference failed for: r31v21 */
    /* JADX WARN: Type inference failed for: r31v22 */
    /* JADX WARN: Type inference failed for: r31v23 */
    /* JADX WARN: Type inference failed for: r31v24 */
    /* JADX WARN: Type inference failed for: r31v25 */
    /* JADX WARN: Type inference failed for: r31v60 */
    /* JADX WARN: Type inference failed for: r31v61 */
    /* JADX WARN: Type inference failed for: r31v62 */
    /* JADX WARN: Type inference failed for: r31v63 */
    /* JADX WARN: Type inference failed for: r31v64 */
    /* JADX WARN: Type inference failed for: r31v65 */
    /* JADX WARN: Type inference failed for: r31v68 */
    /* JADX WARN: Type inference failed for: r31v71 */
    /* JADX WARN: Type inference failed for: r31v72 */
    /* JADX WARN: Type inference failed for: r31v73 */
    /* JADX WARN: Type inference failed for: r31v74 */
    /* JADX WARN: Type inference failed for: r31v75 */
    /* JADX WARN: Type inference failed for: r31v76 */
    /* JADX WARN: Type inference failed for: r31v77 */
    /* JADX WARN: Type inference failed for: r31v78 */
    /* JADX WARN: Type inference failed for: r31v79 */
    /* JADX WARN: Type inference failed for: r31v80 */
    /* JADX WARN: Type inference failed for: r31v82 */
    /* JADX WARN: Type inference failed for: r31v86 */
    /* JADX WARN: Type inference failed for: r31v88 */
    /* JADX WARN: Type inference failed for: r31v89 */
    /* JADX WARN: Type inference failed for: r31v90 */
    /* JADX WARN: Type inference failed for: r31v91 */
    /* JADX WARN: Type inference failed for: r31v92 */
    /* JADX WARN: Type inference failed for: r31v94 */
    /* JADX WARN: Type inference failed for: r31v96 */
    /* JADX WARN: Type inference failed for: r31v98 */
    /* JADX WARN: Type inference failed for: r31v99 */
    /* JADX WARN: Type inference failed for: r38v10 */
    /* JADX WARN: Type inference failed for: r38v11 */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r38v24 */
    /* JADX WARN: Type inference failed for: r38v25 */
    /* JADX WARN: Type inference failed for: r38v30 */
    /* JADX WARN: Type inference failed for: r38v31 */
    /* JADX WARN: Type inference failed for: r38v32 */
    /* JADX WARN: Type inference failed for: r38v4 */
    /* JADX WARN: Type inference failed for: r38v42 */
    /* JADX WARN: Type inference failed for: r38v43 */
    /* JADX WARN: Type inference failed for: r38v5 */
    /* JADX WARN: Type inference failed for: r38v6 */
    /* JADX WARN: Type inference failed for: r38v7 */
    /* JADX WARN: Type inference failed for: r38v8 */
    /* JADX WARN: Type inference failed for: r38v9 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v492 */
    /* JADX WARN: Type inference failed for: r3v493 */
    /* JADX WARN: Type inference failed for: r3v506 */
    /* JADX WARN: Type inference failed for: r3v525 */
    /* JADX WARN: Type inference failed for: r3v526 */
    /* JADX WARN: Type inference failed for: r3v527 */
    /* JADX WARN: Type inference failed for: r3v528 */
    /* JADX WARN: Type inference failed for: r4v286, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v554 */
    /* JADX WARN: Type inference failed for: r5v134, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v53, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v256 */
    /* JADX WARN: Type inference failed for: r8v257 */
    /* JADX WARN: Type inference failed for: r8v258 */
    /* JADX WARN: Type inference failed for: r8v262 */
    /* JADX WARN: Type inference failed for: r8v263 */
    /* JADX WARN: Type inference failed for: r8v264, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v266 */
    /* JADX WARN: Type inference failed for: r8v267 */
    /* JADX WARN: Type inference failed for: r8v268 */
    /* JADX WARN: Type inference failed for: r8v269 */
    /* JADX WARN: Type inference failed for: r8v270 */
    /* JADX WARN: Type inference failed for: r8v271 */
    /* JADX WARN: Type inference failed for: r8v283 */
    /* JADX WARN: Type inference failed for: r8v285 */
    /* JADX WARN: Type inference failed for: r8v286 */
    /* JADX WARN: Type inference failed for: r8v295 */
    /* JADX WARN: Type inference failed for: r8v296 */
    /* JADX WARN: Type inference failed for: r8v318 */
    /* JADX WARN: Type inference failed for: r8v327 */
    /* JADX WARN: Type inference failed for: r8v347 */
    /* JADX WARN: Type inference failed for: r8v348 */
    /* JADX WARN: Type inference failed for: r8v349 */
    /* JADX WARN: Type inference failed for: r8v350 */
    /* JADX WARN: Type inference failed for: r8v351 */
    /* JADX WARN: Type inference failed for: r8v352 */
    /* JADX WARN: Type inference failed for: r8v353 */
    /* JADX WARN: Type inference failed for: r8v354 */
    /* JADX WARN: Type inference failed for: r8v355 */
    /* JADX WARN: Type inference failed for: r8v356 */
    /* JADX WARN: Type inference failed for: r8v357 */
    /* JADX WARN: Type inference failed for: r8v358 */
    /* JADX WARN: Type inference failed for: r8v359 */
    /* JADX WARN: Type inference failed for: r8v360 */
    /* JADX WARN: Type inference failed for: r8v361 */
    /* JADX WARN: Type inference failed for: r8v362 */
    /* JADX WARN: Type inference failed for: r8v64 */
    /* JADX WARN: Type inference failed for: r8v65 */
    /* JADX WARN: Type inference failed for: r8v66 */
    /* JADX WARN: Type inference failed for: r8v67, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v68 */
    /* JADX WARN: Type inference failed for: r9v267 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 13823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.SendMoneyConfirmActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit $r8$lambda$IZ_SvqoAJwYfbfv1EBShSHgpFGQ(SendMoneyConfirmActivity sendMoneyConfirmActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 3;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Unit unitInitObserver$lambda$0 = initObserver$lambda$0(sendMoneyConfirmActivity, resource);
        int i4 = getAsAtTimestamp + 5;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return unitInitObserver$lambda$0;
    }

    public static void $r8$lambda$ql9Ozb_aYL7kYDwSTy3u8x4vbSo(SendMoneyConfirmActivity sendMoneyConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 3;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        m12040instrumented$0$initListener$V(sendMoneyConfirmActivity, view);
        int i4 = getAsAtTimestamp + 77;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static {
        hashCode = 0;
        component3();
        component2();
        int i = getShareableDataState + 85;
        hashCode = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void m12040instrumented$0$initListener$V(SendMoneyConfirmActivity sendMoneyConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 99;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                initListener$lambda$1(sendMoneyConfirmActivity, view);
                Callback.onClick_exit();
                int i4 = 2 / 0;
            } else {
                initListener$lambda$1(sendMoneyConfirmActivity, view);
                Callback.onClick_exit();
            }
            int i5 = getAsAtTimestamp + 87;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 17;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
    }

    static void component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 95;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            component2 = new char[]{2020, 1966, 2036, 2028, 1050, 2021, 1956, 2025, 2019, 2024, 2041, 2039, 2002, 2037, 1048, 2029, 2032, 1049, 1051, 2017, 2031, 2023, 2034, 1054, 2030};
            component3 = (char) 12831;
        } else {
            component2 = new char[]{2020, 1966, 2036, 2028, 1050, 2021, 1956, 2025, 2019, 2024, 2041, 2039, 2002, 2037, 1048, 2029, 2032, 1049, 1051, 2017, 2031, 2023, 2034, 1054, 2030};
            component3 = (char) 12831;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static void component3() {
        component1 = new char[]{30431, 30418, 30424, 30414, 30413, 30423, 30354, 30409, 30444, 30425, 30427, 30419, 30407, 30443, 30412, 30463, 30408, 30410, 30440, 30420, 30342, 30349, 30346, 30347, 30340, 30341, 30345, 30426, 30344, 30351, 30350, 30430, 30421, 30411, 30415, 30355, 30348, 30343, 30422, 30416, 30441, 30457, 30417};
        ShareDataUIState = 321287868;
        copydefault = true;
        component4 = true;
        copy = new char[]{3093, 39556, 8458, 53137, 22031, 64699, 35624, 4486, 47166, 18105, 60764, 31698, 577, 43212, 14176, 56822, 25705, 62191, 3095, 39624, 8521, 53125, 22108, 64738, 35647, 4514, 47230, 18090, 60678, 31618, 539, 43166, 14193, 56745, 25700, 62128, 39229, 8262, 52891, 21846, 58330, 35378, 4330, 48993, 17830, 60543, 31440, 348, 44994, 13897, 56563, 27504, 61864, 38962, 9912, 52684, 21535, 57990, 35160, 6109, 48736, 17646, 54134, 31226, 0, 44765, 20827, 51082, 31828, 37581, 2885, 41470, 54816, 19643, 58723, 7088, 45086, 9872, 24324, 62852, 27240, 32995, 14634, 44974, 50223, 32014, 37845, 2076, 48835, 55163, 19961, 57893, 6331, 45415, 10139, 23578, 62093, 27474, 33209, 13878, 44260, 50558, 31728, 37006, 2386, 49051, 54290, 19150, 58230, 6645, 36411, 9447, 23838, 62353, 26717, 40588, 14166, 44526, 49714, 30882, 37237, 1616, 48343, 54613, 19398, 57420, 5886, 36731, 9709, 23145, 3142, 39575, 8512, 53127, 22107, 64739, 35694, 4594, 47224, 18090, 60755, 31709, 533, 43165, 14113, 56829, 25699, 62178, 39229, 8262, 52936, 21842, 58324, 35425, 4330, 48957, 17910, 60536, 31446, 270, 44951, 13897, 56486, 27431, 61947, 38963, 9915, 52625, 21572, 57986, 35161, 6111, 48745, 17644, 54130, 31220, 6, 44764, 13591, 50070, 27211, 61610, 40747, 9653, 52284, 23317, 57759, 34844, 5848, 48473, 19428, 53865, 30961, 1836, 3151, 39647, 8521, 53207, 22084, 64742, 3103, 39573, 8477, 53133, 22046, 64700, 35624, 4542, 47110, 18088, 60739, 31699, 609, 43202, 14192, 56826, 3091, 39581, 8473, 53139, 22041, 64688, 35640, 4501, 47147, 18088, 60764, 31695, 587, 43200, 14193, 48375, 10873, 37367, 32618, 59111, 19551, 15314, 41286, 2241, 63042, 23997, 3088, 39624, 8476, 53203, 22025, 64695, 35645, 4592, 47149, 18173, 60757, 31705, 535, 43166, 14117, 56827, 25648, 62132, 39278, 8261, 52891, 21766, 58248, 35427, 4332, 49007, 17911, 60463, 31440, 270, 44994, 13853, 56495, 27509, 61857, 38967, 9906, 52675, 21577, 58079, 35083, 6106, 48737, 17597, 54049, 31228, Matrix.MATRIX_TYPE_RANDOM_UT, 44683, 13632, 50072, 27214, 61681, 40745, 9696, 52328, 23374, 57757, 34845, 5849, 48476, 19426, 53868, 30887, 1836, 43563, 15522, 34681, 27110, 61501, 23248, 11534, 47046, 7753, 57500, 19308, 56808, 42096, 3756, 37140, 31647, 49751, 21718, 16212, 34338, 26792, 62257, 17852, 11346, 46723, 6412, 58310, 18975, 56551, 42812, 2546, 36985, 31435, 52550, 22468, 15966, 32985, 27557, 61984, 17587, 12089, 45500, 6226, 57995, 29970, 57244, 42596, 2232, 37749, 26020, 52265, 22223, 14665, 33664, 27147, 64802, 18428, 11899, 45238, 6970, 60800, 29787, 57028, 41245, 3141, 39621, 8523, 53206, 22099, 64738, 35695, 4607, 47229, 18175, 60680, 3138, 39619, 8513, 53207, 22099, 64739, 35691, 4597, 47223, 18175};
        equals = -8983131322073179407L;
    }
}
