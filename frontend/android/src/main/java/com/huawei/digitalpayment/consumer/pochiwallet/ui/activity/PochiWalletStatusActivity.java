package com.huawei.digitalpayment.consumer.pochiwallet.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
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
import com.alibaba.fastjson.parser.JSONLexer;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ActivityPochiWalletStatusBinding;
import com.huawei.digitalpayment.consumer.sfcui.ui.resp.PochiStatusResp;
import com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.PochiWalletViewModel;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancel;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.BooleanUtils;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0014J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/activity/PochiWalletStatusActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcPaymentBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfcpochiwallet/databinding/ActivityPochiWalletStatusBinding;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/PochiWalletViewModel;", "<init>", "()V", "functionId", "", "routePath", "getLayoutId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initObserver", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class PochiWalletStatusActivity extends Hilt_PochiWalletStatusActivity<ActivityPochiWalletStatusBinding, PochiWalletViewModel> {
    public static final int $stable = 8;
    private static int ShareDataUIState;
    private static short[] component1;
    private static int component2;
    private static byte[] component3;
    private static int component4;
    private static boolean copy;
    private static int copydefault;
    private static char[] equals;
    private static char[] getAsAtTimestamp;
    private static boolean getRequestBeneficiariesState;
    private static char getSponsorBeneficiariesState;
    private static int hashCode;
    private String functionId;
    private String routePath;
    private static final byte[] $$l = {81, 99, 107, 124};
    private static final int $$o = 227;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {32, 13, -54, -47, Ascii.SO, Ascii.SI, 2, 7, Ascii.SI, 20, -64, 63, Ascii.SYN, 13, 7, Ascii.DLE, 9, -1, Ascii.SI, 1, Ascii.CAN, -59, 63, Ascii.SI, 3, Ascii.ETB, 10, 1, 17, 17, -59, 44, 44, 7, -1, Ascii.ESC, -8, Ascii.FF, Ascii.ETB, -21, Ascii.SUB, Ascii.SYN, Ascii.VT, -1, -55, 42, 43, Ascii.VT, 5, Ascii.RS, 1, Ascii.DC2, -33, 46, 13, 6, 17, Ascii.SYN, 8, 13, 9, 9, 1, 19, Ascii.DLE, -56, Ascii.SYN, 8, 13, 9, 9, 1, 19, Ascii.DLE, -55};
    private static final int $$k = 42;
    private static final byte[] $$d = {115, Ascii.RS, 119, 102, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -12, Ascii.FF, -19, -15, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 212;
    private static int getShareableDataState = 1;
    private static int toString = 0;
    private static int ArtificialStackFrames = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Observer, FunctionAdapter {
        private static int component3 = 0;
        private static int copydefault = 1;
        private final Function1 ShareDataUIState;

        component1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.ShareDataUIState = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                boolean r1 = r4 instanceof androidx.lifecycle.Observer
                r1 = r1 ^ 1
                if (r1 == 0) goto La
                goto L30
            La:
                int r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletStatusActivity.component1.copydefault
                int r1 = r1 + 113
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletStatusActivity.component1.component3 = r2
                int r1 = r1 % r0
                boolean r1 = r4 instanceof kotlin.jvm.internal.FunctionAdapter
                if (r1 == 0) goto L30
                int r2 = r2 + 29
                int r1 = r2 % 128
                com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletStatusActivity.component1.copydefault = r1
                int r2 = r2 % r0
                r1 = r3
                kotlin.jvm.internal.FunctionAdapter r1 = (kotlin.jvm.internal.FunctionAdapter) r1
                kotlin.Function r1 = r1.getFunctionDelegate()
                kotlin.jvm.internal.FunctionAdapter r4 = (kotlin.jvm.internal.FunctionAdapter) r4
                kotlin.Function r4 = r4.getFunctionDelegate()
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
                goto L31
            L30:
                r4 = 0
            L31:
                int r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletStatusActivity.component1.copydefault
                int r1 = r1 + 1
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletStatusActivity.component1.component3 = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L3d
                return r4
            L3d:
                r4 = 0
                r4.hashCode()
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletStatusActivity.component1.equals(java.lang.Object):boolean");
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = copydefault + 13;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.ShareDataUIState;
            int i5 = i3 + 3;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 85;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                getFunctionDelegate().hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = copydefault + 47;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 113;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            this.ShareDataUIState.invoke(obj);
            int i4 = copydefault + 111;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    private static String $$r(int i, int i2, byte b2) {
        int i3 = 3 - (i2 * 4);
        int i4 = 119 - i;
        int i5 = b2 * 3;
        byte[] bArr = $$l;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i4 += -i6;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            i3++;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i4 += -bArr[i3];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r7 = 103 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletStatusActivity.$$d
            int r8 = 28 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-8)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletStatusActivity.i(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 65 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletStatusActivity.$$j
            int r8 = r8 * 44
            int r1 = r8 + 10
            int r6 = r6 * 8
            int r6 = r6 + 99
            byte[] r1 = new byte[r1]
            int r8 = r8 + 9
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2f:
            int r6 = r6 + r7
            int r6 = r6 + (-10)
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletStatusActivity.j(int, short, int, java.lang.Object[]):void");
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 63;
        toString = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_pochi_wallet_status;
        if (i3 == 0) {
            return i4;
        }
        throw null;
    }

    private static void g(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = equals;
        int i3 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr3[i4]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i3;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.green(i3) + 3760, 24 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getPressedStateDuration() >> 16), -1670574543, false, $$r((byte) 51, b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr4[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(component4)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            long j = 0;
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - ExpandableListView.getPackedPositionType(0L), View.MeasureSpec.getSize(0) + 13, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            int i5 = 46;
            if (getRequestBeneficiariesState) {
                int i6 = $10 + 41;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    cancelVar.component1 = bArr.length;
                    cArr2 = new char[cancelVar.component1];
                    cancelVar.component3 = 1;
                } else {
                    cancelVar.component1 = bArr.length;
                    cArr2 = new char[cancelVar.component1];
                    cancelVar.component3 = 0;
                }
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr2[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault3 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2748, (KeyEvent.getMaxKeyCode() >> 16) + 19, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 7644), -327556343, false, $$r((byte) i5, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    i5 = 46;
                }
                objArr[0] = new String(cArr2);
                return;
            }
            if (copy) {
                cancelVar.component1 = cArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr5[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault4 == null) {
                        int iRgb = Color.rgb(0, 0, 0) + 16779964;
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 19;
                        char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 7643);
                        byte b4 = (byte) 0;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iRgb, pressedStateDuration, c2, -327556343, false, $$r((byte) 46, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                    j = 0;
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
                    String str = new String(cArr6);
                    int i8 = $11 + 103;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    objArr[0] = str;
                    return;
                }
                int i10 = $11 + 109;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    cArr6[cancelVar.component3] = (char) (cArr3[iArr[cancelVar.component1 - cancelVar.component3] - i] % iIntValue);
                    i7 = cancelVar.component3 % 0;
                } else {
                    cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    i7 = cancelVar.component3 + 1;
                }
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static void k(short s, int i, byte b2, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        boolean z;
        int i5 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(copydefault)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 999, (ViewConfiguration.getLongPressTimeout() >> 16) + 31, (char) (TextUtils.getOffsetAfter("", 0) + 61685), 1874745193, false, $$r((byte) 6, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                int i6 = $10 + 77;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                byte[] bArr = component3;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        int i9 = $11 + 89;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            int capsMode = 2984 - TextUtils.getCapsMode("", 0, 0);
                            int touchSlop = 48 - (ViewConfiguration.getTouchSlop() >> 8);
                            char cAxisFromString = (char) (54461 - MotionEvent.axisFromString(""));
                            byte b4 = (byte) ($$o & 15);
                            byte b5 = (byte) (b4 - 3);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(capsMode, touchSlop, cAxisFromString, -1178636483, false, $$r(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = component3;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(999 - (ViewConfiguration.getWindowTouchSlop() >> 8), Color.green(0) + 31, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 61685), 1874745193, false, $$r((byte) 6, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L)));
                    j = 7083766810336261929L;
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) component1[i2 + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L)));
                }
            } else {
                j = 7083766810336261929L;
            }
            if (iIntValue > 0) {
                int i11 = ((i2 + iIntValue) - 2) + ((int) (((long) ShareDataUIState) ^ j));
                if (z2) {
                    i4 = 1;
                } else {
                    int i12 = $11 + 119;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 0;
                }
                getsmalliconid.copydefault = i11 + i4;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i), Integer.valueOf(component2), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    byte b7 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1697 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 37, (char) TextUtils.indexOf("", "", 0), -1454191902, false, $$r((byte) 7, b7, b7), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = component3;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i14 = $10 + 57;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i15 = 4 % 4;
                    }
                    for (int i16 = 0; i16 < length2; i16++) {
                        bArr5[i16] = (byte) (((long) bArr4[i16]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i17 = $11 + 17;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    z = true;
                } else {
                    z = false;
                }
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    int i19 = $10 + 89;
                    $11 = i19 % 128;
                    if (i19 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (z) {
                        byte[] bArr6 = component3;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = component1;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(byte r35, char[] r36, int r37, java.lang.Object[] r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletStatusActivity.h(byte, char[], int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x016b  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletStatusActivity.onCreate(android.os.Bundle):void");
    }

    private final void initObserver() {
        int i = 2 % 2;
        ((PochiWalletViewModel) this.viewModel).getStatementData().observe(this, new component1(new Function1() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 65;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$N89Sfax5wSwnqRVXcJPK6F0V21U = PochiWalletStatusActivity.$r8$lambda$N89Sfax5wSwnqRVXcJPK6F0V21U(this.f$0, (Resource) obj);
                int i5 = component1 + 57;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 44 / 0;
                }
                return unit$r8$lambda$N89Sfax5wSwnqRVXcJPK6F0V21U;
            }
        }));
        int i2 = ArtificialStackFrames + 67;
        toString = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit initObserver$lambda$0(PochiWalletStatusActivity pochiWalletStatusActivity, Resource resource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pochiWalletStatusActivity, "");
        Utils.showOrHideLoading(pochiWalletStatusActivity, resource);
        if (resource.error()) {
            int i2 = toString + 83;
            ArtificialStackFrames = i2 % 128;
            if (i2 % 2 == 0) {
                ToastUtils.showLong(resource.getMessage(), new Object[0]);
            } else {
                ToastUtils.showLong(resource.getMessage(), new Object[0]);
            }
        }
        if (resource.success()) {
            int i3 = ArtificialStackFrames + 89;
            toString = i3 % 128;
            if (i3 % 2 != 0) {
                ((PochiStatusResp) resource.getData()).isSuccess();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!((PochiStatusResp) resource.getData()).isSuccess()) {
                ToastUtils.showLong(((PochiStatusResp) resource.getData()).getErrorMessage(), new Object[0]);
            } else if (StringsKt.equals(((PochiStatusResp) resource.getData()).isBound(), BooleanUtils.TRUE, true)) {
                Bundle bundle = new Bundle();
                bundle.putString("functionId", pochiWalletStatusActivity.functionId);
                RouteUtils.routeWithExecute(pochiWalletStatusActivity.routePath, bundle);
            } else {
                RouteUtils.routeWithExecute("/pochiWalletModule/openPochiGuide");
                int i4 = ArtificialStackFrames + 77;
                toString = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        pochiWalletStatusActivity.finish();
        return Unit.INSTANCE;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            h((byte) (KeyEvent.getDeadChar(0, 0) + 43), new char[]{24, 18, 5, '$', 30, 18, 3, '+', 24, '\'', '-', 3, '#', 7, 30, 23, '%', 15, JSONLexer.EOI, 16, '(', '\f', '%', 5, 22, 4}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952848_res_0x7f1304d0).substring(39, 40).length() + 25, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            h((byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 59), new char[]{5, 21, 13860, 13860, 3, 16, 21, 30, 13862, 13862, 2, 23, 4, 21, 30, 23, 31, 18}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 18, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i2 = ArtificialStackFrames + 125;
                toString = i2 % 128;
                int i3 = i2 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i4 = toString + 87;
                ArtificialStackFrames = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 6570, 42 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 57 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (ImageFormat.getBitsPerPixel(0) + 1), -699576857, false, "component2", new Class[]{Context.class});
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
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            h((byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 14), new char[]{24, 18, 5, '$', 30, 18, 3, '+', 24, '\'', '-', 3, '#', 7, 30, 23, '%', 15, JSONLexer.EOI, 16, '(', '\f', '%', 5, 22, 4}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            h((byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954589_res_0x7f130b9d).substring(0, 2).length() + 58), new char[]{5, 21, 13860, 13860, 3, 16, 21, 30, 13862, 13862, 2, 23, 4, 21, 30, 23, 31, 18}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(19) - 28, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i2 = ArtificialStackFrames + 37;
            toString = i2 % 128;
            int i3 = i2 % 2;
        }
        if (baseContext != null) {
            int i4 = toString + 69;
            ArtificialStackFrames = i4 % 128;
            if (i4 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 6618, (Process.myPid() >> 22) + 42, (char) KeyEvent.normalizeMetaState(0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - TextUtils.getOffsetBefore("", 0), 56 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) View.resolveSize(0, 0), -960739708, false, "component3", new Class[]{Context.class});
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

    /* JADX WARN: Can't wrap try/catch for region: R(102:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|813|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|(89:872|33|(2:35|(2:37|(2:39|43)(1:40))(2:41|42))(1:43)|80|866|81|(2:853|83)|87|88|857|(5:90|91|(1:93)|94|95)(25:96|97|858|98|99|839|100|(2:805|102)|106|107|820|108|(2:824|110)|114|115|116|(2:894|118)|122|123|814|124|(2:818|126)(1:128)|129|(1:131)|132)|133|(4:136|(2:138|906)(11:139|(3:141|(3:144|145|142)|907)|148|807|149|(1:151)|152|153|900|154|905)|155|134)|904|167|200|892|201|(3:203|879|204)|208|209|(5:211|212|(1:214)|215|216)(17:218|219|891|220|221|889|222|(1:224)|225|226|227|(1:229)|230|(1:232)|233|(1:235)|236)|217|237|(9:240|881|241|(1:243)|244|245|246|875|247)|281|830|282|(1:284)|285|(3:287|(1:289)|290)(19:291|292|816|293|(1:295)|296|297|811|298|(1:300)|301|302|303|(1:305)|306|(1:308)|309|(1:311)|312)|313|(4:316|(3:910|318|913)(12:909|319|(3:321|(3:324|325|322)|914)|326|803|327|(1:329)|330|331|898|332|912)|911|314)|908|367|887|368|(2:841|370)|375|(1:377)|378|379|868|(5:381|382|(1:384)|385|386)(45:387|(3:845|389|(1:395)(1:394))(1:399)|(19:883|401|877|402|(2:828|404)|408|409|869|410|(2:873|412)|416|417|418|(2:420|421)|422|(2:424|425)(1:427)|428|(1:430)|431)|483|499|(1:501)|502|(1:504)|505|(3:507|(1:509)|510)(16:512|513|(1:515)|516|(1:518)|519|520|(1:522)|523|851|524|525|(1:527)(1:528)|529|(1:531)|532)|511|533|(1:535)(9:536|(3:538|(2:541|539)|929)|542|543|(1:545)|546|(1:548)|549|550)|551|(1:553)(1:554)|555|(3:557|(1:559)|560)(14:562|563|(1:565)|566|567|(1:569)|570|862|571|572|(1:574)|575|(1:577)|578)|561|579|(1:581)(9:582|(3:584|(2:587|585)|928)|588|589|(1:591)(1:592)|593|(1:595)|596|597)|598|871|599|(1:601)|602|(1:604)|605|(3:607|(1:609)|610)(16:(2:612|(1:618)(1:617))|(19:620|621|864|622|(1:624)|625|626|855|627|(1:629)|630|631|632|(1:634)|635|(1:637)|638|(1:640)|641)|699|(1:701)|702|(2:704|(12:706|(1:708)|709|729|(6:732|733|(1:735)|736|737|738)|739|(1:741)|742|(3:744|(1:746)|747)(14:749|750|(1:752)|753|754|(1:756)|757|801|758|759|(1:761)|762|(1:764)|765)|748|766|(1:930)(7:769|770|(1:772)|773|774|775|776))(3:710|(1:712)|713))(13:715|885|716|717|(1:719)|720|809|721|722|(1:724)|725|(1:727)|728)|714|729|(0)|739|(0)|742|(0)(0)|748|766|(0)(0))|642|(4:645|(3:922|647|925)(12:921|648|(5:650|(1:652)(1:653)|927|(3:656|657|654)|926)|658|843|659|(1:661)|662|663|826|664|924)|923|643)|920|699|(0)|702|(0)(0)|714|729|(0)|739|(0)|742|(0)(0)|748|766|(0)(0))|432|(4:435|(2:437|917)(11:438|(5:440|(1:442)(1:443)|919|(3:446|447|444)|918)|448|860|449|(1:451)|452|453|849|454|916)|455|433)|915|483|499|(0)|502|(0)|505|(0)(0)|511|533|(0)(0)|551|(0)(0)|555|(0)(0)|561|579|(0)(0)|598|871|599|(0)|602|(0)|605|(0)(0)|642|(1:643)|920|699|(0)|702|(0)(0)|714|729|(0)|739|(0)|742|(0)(0)|748|766|(0)(0))(1:47)|48|833|49|(1:51)|52|822|53|(1:55)|56|57|80|866|81|(0)|87|88|857|(0)(0)|133|(1:134)|904|167|200|892|201|(0)|208|209|(0)(0)|217|237|(0)|281|830|282|(0)|285|(0)(0)|313|(1:314)|908|367|887|368|(0)|375|(0)|378|379|868|(0)(0)|432|(1:433)|915|483|499|(0)|502|(0)|505|(0)(0)|511|533|(0)(0)|551|(0)(0)|555|(0)(0)|561|579|(0)(0)|598|871|599|(0)|602|(0)|605|(0)(0)|642|(1:643)|920|699|(0)|702|(0)(0)|714|729|(0)|739|(0)|742|(0)(0)|748|766|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(96:(89:872|33|(2:35|(2:37|(2:39|43)(1:40))(2:41|42))(1:43)|80|866|81|(2:853|83)|87|88|857|(5:90|91|(1:93)|94|95)(25:96|97|858|98|99|839|100|(2:805|102)|106|107|820|108|(2:824|110)|114|115|116|(2:894|118)|122|123|814|124|(2:818|126)(1:128)|129|(1:131)|132)|133|(4:136|(2:138|906)(11:139|(3:141|(3:144|145|142)|907)|148|807|149|(1:151)|152|153|900|154|905)|155|134)|904|167|200|892|201|(3:203|879|204)|208|209|(5:211|212|(1:214)|215|216)(17:218|219|891|220|221|889|222|(1:224)|225|226|227|(1:229)|230|(1:232)|233|(1:235)|236)|217|237|(9:240|881|241|(1:243)|244|245|246|875|247)|281|830|282|(1:284)|285|(3:287|(1:289)|290)(19:291|292|816|293|(1:295)|296|297|811|298|(1:300)|301|302|303|(1:305)|306|(1:308)|309|(1:311)|312)|313|(4:316|(3:910|318|913)(12:909|319|(3:321|(3:324|325|322)|914)|326|803|327|(1:329)|330|331|898|332|912)|911|314)|908|367|887|368|(2:841|370)|375|(1:377)|378|379|868|(5:381|382|(1:384)|385|386)(45:387|(3:845|389|(1:395)(1:394))(1:399)|(19:883|401|877|402|(2:828|404)|408|409|869|410|(2:873|412)|416|417|418|(2:420|421)|422|(2:424|425)(1:427)|428|(1:430)|431)|483|499|(1:501)|502|(1:504)|505|(3:507|(1:509)|510)(16:512|513|(1:515)|516|(1:518)|519|520|(1:522)|523|851|524|525|(1:527)(1:528)|529|(1:531)|532)|511|533|(1:535)(9:536|(3:538|(2:541|539)|929)|542|543|(1:545)|546|(1:548)|549|550)|551|(1:553)(1:554)|555|(3:557|(1:559)|560)(14:562|563|(1:565)|566|567|(1:569)|570|862|571|572|(1:574)|575|(1:577)|578)|561|579|(1:581)(9:582|(3:584|(2:587|585)|928)|588|589|(1:591)(1:592)|593|(1:595)|596|597)|598|871|599|(1:601)|602|(1:604)|605|(3:607|(1:609)|610)(16:(2:612|(1:618)(1:617))|(19:620|621|864|622|(1:624)|625|626|855|627|(1:629)|630|631|632|(1:634)|635|(1:637)|638|(1:640)|641)|699|(1:701)|702|(2:704|(12:706|(1:708)|709|729|(6:732|733|(1:735)|736|737|738)|739|(1:741)|742|(3:744|(1:746)|747)(14:749|750|(1:752)|753|754|(1:756)|757|801|758|759|(1:761)|762|(1:764)|765)|748|766|(1:930)(7:769|770|(1:772)|773|774|775|776))(3:710|(1:712)|713))(13:715|885|716|717|(1:719)|720|809|721|722|(1:724)|725|(1:727)|728)|714|729|(0)|739|(0)|742|(0)(0)|748|766|(0)(0))|642|(4:645|(3:922|647|925)(12:921|648|(5:650|(1:652)(1:653)|927|(3:656|657|654)|926)|658|843|659|(1:661)|662|663|826|664|924)|923|643)|920|699|(0)|702|(0)(0)|714|729|(0)|739|(0)|742|(0)(0)|748|766|(0)(0))|432|(4:435|(2:437|917)(11:438|(5:440|(1:442)(1:443)|919|(3:446|447|444)|918)|448|860|449|(1:451)|452|453|849|454|916)|455|433)|915|483|499|(0)|502|(0)|505|(0)(0)|511|533|(0)(0)|551|(0)(0)|555|(0)(0)|561|579|(0)(0)|598|871|599|(0)|602|(0)|605|(0)(0)|642|(1:643)|920|699|(0)|702|(0)(0)|714|729|(0)|739|(0)|742|(0)(0)|748|766|(0)(0))(1:47)|833|49|(1:51)|52|822|53|(1:55)|56|57|80|866|81|(0)|87|88|857|(0)(0)|133|(1:134)|904|167|200|892|201|(0)|208|209|(0)(0)|217|237|(0)|281|830|282|(0)|285|(0)(0)|313|(1:314)|908|367|887|368|(0)|375|(0)|378|379|868|(0)(0)|432|(1:433)|915|483|499|(0)|502|(0)|505|(0)(0)|511|533|(0)(0)|551|(0)(0)|555|(0)(0)|561|579|(0)(0)|598|871|599|(0)|602|(0)|605|(0)(0)|642|(1:643)|920|699|(0)|702|(0)(0)|714|729|(0)|739|(0)|742|(0)(0)|748|766|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0b53, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0b5b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0b5c, code lost:
    
        r12 = r26;
        r31 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x100e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x100f, code lost:
    
        r6 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x153f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x1540, code lost:
    
        r5 = new java.lang.Object[1];
        g(null, ((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952716_res_0x7f13044c).substring(6, 7).length() + 126, new byte[]{-98, -104, -105, -111, -110, -104, -104, -106, -105, -106}, null, r5);
        r3 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x1585, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x159c, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x15a0, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r13 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x15cd, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x15d1, code lost:
    
        if (r1 == null) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x15d3, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) + 41, (char) android.view.View.combineMeasuredStates(0, 0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x15fd, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x1605, code lost:
    
        r10 = new java.lang.Object[]{-2000708513, java.lang.Long.valueOf(r3), r2, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.graphics.Color.green(0) + 6562, android.view.View.resolveSizeAndState(0, 0, 0) + 56, (char) android.view.View.getDefaultSize(0, 0));
        r3 = (byte) (com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletStatusActivity.$$j[19] - 1);
        r5 = r3;
        r11 = new java.lang.Object[1];
        j(r3, r5, r5, r11);
        r2.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x1be0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x1be1, code lost:
    
        r1 = r1;
        r28 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x1c00, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x1c01, code lost:
    
        r1 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x2e65, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x2e66, code lost:
    
        r5 = new java.lang.Object[1];
        g(null, ((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952716_res_0x7f13044c).substring(6, 7).length() + 126, new byte[]{-112, -104, -98, -103, -112, -104, -111, -104, -98, -111}, null, r5);
        r3 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x2eab, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x2ec2, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x2ec6, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r13 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x2ef5, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x2ef9, code lost:
    
        if (r5 == null) goto L695;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x2efb, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6617 - android.text.TextUtils.lastIndexOf(r10, '0', 0), 42 - android.graphics.Color.alpha(0), (char) android.graphics.Color.green(0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x2f21, code lost:
    
        r5 = ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x2f28, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletStatusActivity.ArtificialStackFrames + 51;
        com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletStatusActivity.toString = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x2f33, code lost:
    
        r8 = new java.lang.Object[]{-2000708513, java.lang.Long.valueOf(r3), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6562 - android.text.TextUtils.indexOf(r10, r10, 0, 0), (-16777160) - android.graphics.Color.rgb(0, 0, 0), (char) android.text.TextUtils.getTrimmedLength(r10));
        r2 = (byte) (com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletStatusActivity.$$j[19] - 1);
        r4 = r2;
        r9 = new java.lang.Object[1];
        j(r2, r4, r4, r9);
        r1.getMethod((java.lang.String) r9[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r5, r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0a03 A[Catch: all -> 0x0b33, TryCatch #8 {all -> 0x0b33, blocks: (B:133:0x09f7, B:134:0x09fb, B:136:0x0a03, B:139:0x0a1e, B:124:0x092a, B:129:0x0992, B:132:0x09ef), top: B:814:0x092a }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0bfa A[Catch: all -> 0x04b2, TryCatch #7 {all -> 0x04b2, blocks: (B:194:0x0bf4, B:196:0x0bfa, B:197:0x0c25, B:275:0x107d, B:277:0x1083, B:278:0x10ad, B:493:0x1c73, B:495:0x1c79, B:496:0x1ca6, B:733:0x337b, B:735:0x3381, B:736:0x33ad, B:770:0x36c1, B:772:0x36c7, B:773:0x36f3, B:750:0x34f3, B:752:0x3516, B:753:0x356a, B:693:0x2ef5, B:695:0x2efb, B:696:0x2f21, B:589:0x27ed, B:591:0x27f3, B:593:0x2826, B:595:0x2860, B:596:0x28a7, B:563:0x2535, B:565:0x254a, B:566:0x2579, B:543:0x2231, B:545:0x2237, B:546:0x2264, B:548:0x229e, B:549:0x22e8, B:513:0x1eed, B:515:0x1f02, B:516:0x1f31, B:518:0x1f65, B:519:0x1fdb, B:361:0x15cd, B:363:0x15d3, B:364:0x15fd, B:74:0x0653, B:76:0x0659, B:77:0x0682, B:19:0x024f, B:21:0x0255, B:22:0x027d, B:24:0x0423, B:26:0x0454, B:27:0x04ac, B:282:0x1130, B:284:0x1136, B:285:0x117d, B:287:0x118a, B:289:0x1193, B:290:0x11d7, B:313:0x1411, B:314:0x1415, B:316:0x141b, B:319:0x1432, B:322:0x143f, B:324:0x1442, B:336:0x1519, B:338:0x151f, B:339:0x1520, B:341:0x1522, B:343:0x1529, B:344:0x152a, B:291:0x11e2, B:303:0x12eb, B:305:0x12f1, B:306:0x133c, B:308:0x1366, B:309:0x13ac, B:311:0x13c2, B:312:0x140b, B:346:0x152c, B:348:0x1533, B:349:0x1534, B:351:0x1536, B:353:0x153d, B:354:0x153e, B:599:0x29cb, B:601:0x29d1, B:602:0x2a16, B:604:0x2a3d, B:605:0x2a7c, B:607:0x2a92, B:609:0x2a9b, B:610:0x2ae0, B:642:0x2d29, B:643:0x2d2d, B:645:0x2d33, B:648:0x2d4b, B:654:0x2d66, B:656:0x2d69, B:668:0x2e3f, B:670:0x2e45, B:671:0x2e46, B:673:0x2e48, B:675:0x2e4f, B:676:0x2e50, B:612:0x2aed, B:614:0x2af1, B:618:0x2afd, B:620:0x2b03, B:632:0x2c10, B:634:0x2c16, B:635:0x2c5e, B:637:0x2c88, B:638:0x2ccb, B:640:0x2ce1, B:641:0x2d23, B:678:0x2e52, B:680:0x2e59, B:681:0x2e5a, B:683:0x2e5c, B:685:0x2e63, B:686:0x2e64, B:33:0x04bb, B:37:0x04cb, B:60:0x05b9, B:62:0x05bf, B:63:0x05c0, B:65:0x05c2, B:67:0x05c9, B:68:0x05ca, B:41:0x04d7, B:42:0x04e1, B:43:0x04e2), top: B:813:0x024f, inners: #16, #38, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0ca9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0d01  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0d5b A[Catch: all -> 0x100e, TRY_ENTER, TRY_LEAVE, TryCatch #50 {all -> 0x100e, blocks: (B:201:0x0ca3, B:208:0x0cf4, B:218:0x0d5b), top: B:892:0x0ca3 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0f16  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x1083 A[Catch: all -> 0x04b2, TryCatch #7 {all -> 0x04b2, blocks: (B:194:0x0bf4, B:196:0x0bfa, B:197:0x0c25, B:275:0x107d, B:277:0x1083, B:278:0x10ad, B:493:0x1c73, B:495:0x1c79, B:496:0x1ca6, B:733:0x337b, B:735:0x3381, B:736:0x33ad, B:770:0x36c1, B:772:0x36c7, B:773:0x36f3, B:750:0x34f3, B:752:0x3516, B:753:0x356a, B:693:0x2ef5, B:695:0x2efb, B:696:0x2f21, B:589:0x27ed, B:591:0x27f3, B:593:0x2826, B:595:0x2860, B:596:0x28a7, B:563:0x2535, B:565:0x254a, B:566:0x2579, B:543:0x2231, B:545:0x2237, B:546:0x2264, B:548:0x229e, B:549:0x22e8, B:513:0x1eed, B:515:0x1f02, B:516:0x1f31, B:518:0x1f65, B:519:0x1fdb, B:361:0x15cd, B:363:0x15d3, B:364:0x15fd, B:74:0x0653, B:76:0x0659, B:77:0x0682, B:19:0x024f, B:21:0x0255, B:22:0x027d, B:24:0x0423, B:26:0x0454, B:27:0x04ac, B:282:0x1130, B:284:0x1136, B:285:0x117d, B:287:0x118a, B:289:0x1193, B:290:0x11d7, B:313:0x1411, B:314:0x1415, B:316:0x141b, B:319:0x1432, B:322:0x143f, B:324:0x1442, B:336:0x1519, B:338:0x151f, B:339:0x1520, B:341:0x1522, B:343:0x1529, B:344:0x152a, B:291:0x11e2, B:303:0x12eb, B:305:0x12f1, B:306:0x133c, B:308:0x1366, B:309:0x13ac, B:311:0x13c2, B:312:0x140b, B:346:0x152c, B:348:0x1533, B:349:0x1534, B:351:0x1536, B:353:0x153d, B:354:0x153e, B:599:0x29cb, B:601:0x29d1, B:602:0x2a16, B:604:0x2a3d, B:605:0x2a7c, B:607:0x2a92, B:609:0x2a9b, B:610:0x2ae0, B:642:0x2d29, B:643:0x2d2d, B:645:0x2d33, B:648:0x2d4b, B:654:0x2d66, B:656:0x2d69, B:668:0x2e3f, B:670:0x2e45, B:671:0x2e46, B:673:0x2e48, B:675:0x2e4f, B:676:0x2e50, B:612:0x2aed, B:614:0x2af1, B:618:0x2afd, B:620:0x2b03, B:632:0x2c10, B:634:0x2c16, B:635:0x2c5e, B:637:0x2c88, B:638:0x2ccb, B:640:0x2ce1, B:641:0x2d23, B:678:0x2e52, B:680:0x2e59, B:681:0x2e5a, B:683:0x2e5c, B:685:0x2e63, B:686:0x2e64, B:33:0x04bb, B:37:0x04cb, B:60:0x05b9, B:62:0x05bf, B:63:0x05c0, B:65:0x05c2, B:67:0x05c9, B:68:0x05ca, B:41:0x04d7, B:42:0x04e1, B:43:0x04e2), top: B:813:0x024f, inners: #16, #38, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x1136 A[Catch: all -> 0x153f, TryCatch #16 {all -> 0x153f, blocks: (B:282:0x1130, B:284:0x1136, B:285:0x117d, B:287:0x118a, B:289:0x1193, B:290:0x11d7, B:313:0x1411, B:314:0x1415, B:316:0x141b, B:319:0x1432, B:322:0x143f, B:324:0x1442, B:336:0x1519, B:338:0x151f, B:339:0x1520, B:341:0x1522, B:343:0x1529, B:344:0x152a, B:291:0x11e2, B:303:0x12eb, B:305:0x12f1, B:306:0x133c, B:308:0x1366, B:309:0x13ac, B:311:0x13c2, B:312:0x140b, B:346:0x152c, B:348:0x1533, B:349:0x1534, B:351:0x1536, B:353:0x153d, B:354:0x153e, B:327:0x146e, B:329:0x1474, B:330:0x1499, B:298:0x1251, B:300:0x126d, B:301:0x12df, B:293:0x1202, B:295:0x1217, B:296:0x124a, B:332:0x14a1), top: B:830:0x1130, outer: #7, inners: #2, #6, #9, #53 }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x118a A[Catch: all -> 0x153f, TryCatch #16 {all -> 0x153f, blocks: (B:282:0x1130, B:284:0x1136, B:285:0x117d, B:287:0x118a, B:289:0x1193, B:290:0x11d7, B:313:0x1411, B:314:0x1415, B:316:0x141b, B:319:0x1432, B:322:0x143f, B:324:0x1442, B:336:0x1519, B:338:0x151f, B:339:0x1520, B:341:0x1522, B:343:0x1529, B:344:0x152a, B:291:0x11e2, B:303:0x12eb, B:305:0x12f1, B:306:0x133c, B:308:0x1366, B:309:0x13ac, B:311:0x13c2, B:312:0x140b, B:346:0x152c, B:348:0x1533, B:349:0x1534, B:351:0x1536, B:353:0x153d, B:354:0x153e, B:327:0x146e, B:329:0x1474, B:330:0x1499, B:298:0x1251, B:300:0x126d, B:301:0x12df, B:293:0x1202, B:295:0x1217, B:296:0x124a, B:332:0x14a1), top: B:830:0x1130, outer: #7, inners: #2, #6, #9, #53 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x11e2 A[Catch: all -> 0x153f, TRY_LEAVE, TryCatch #16 {all -> 0x153f, blocks: (B:282:0x1130, B:284:0x1136, B:285:0x117d, B:287:0x118a, B:289:0x1193, B:290:0x11d7, B:313:0x1411, B:314:0x1415, B:316:0x141b, B:319:0x1432, B:322:0x143f, B:324:0x1442, B:336:0x1519, B:338:0x151f, B:339:0x1520, B:341:0x1522, B:343:0x1529, B:344:0x152a, B:291:0x11e2, B:303:0x12eb, B:305:0x12f1, B:306:0x133c, B:308:0x1366, B:309:0x13ac, B:311:0x13c2, B:312:0x140b, B:346:0x152c, B:348:0x1533, B:349:0x1534, B:351:0x1536, B:353:0x153d, B:354:0x153e, B:327:0x146e, B:329:0x1474, B:330:0x1499, B:298:0x1251, B:300:0x126d, B:301:0x12df, B:293:0x1202, B:295:0x1217, B:296:0x124a, B:332:0x14a1), top: B:830:0x1130, outer: #7, inners: #2, #6, #9, #53 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x141b A[Catch: all -> 0x153f, TryCatch #16 {all -> 0x153f, blocks: (B:282:0x1130, B:284:0x1136, B:285:0x117d, B:287:0x118a, B:289:0x1193, B:290:0x11d7, B:313:0x1411, B:314:0x1415, B:316:0x141b, B:319:0x1432, B:322:0x143f, B:324:0x1442, B:336:0x1519, B:338:0x151f, B:339:0x1520, B:341:0x1522, B:343:0x1529, B:344:0x152a, B:291:0x11e2, B:303:0x12eb, B:305:0x12f1, B:306:0x133c, B:308:0x1366, B:309:0x13ac, B:311:0x13c2, B:312:0x140b, B:346:0x152c, B:348:0x1533, B:349:0x1534, B:351:0x1536, B:353:0x153d, B:354:0x153e, B:327:0x146e, B:329:0x1474, B:330:0x1499, B:298:0x1251, B:300:0x126d, B:301:0x12df, B:293:0x1202, B:295:0x1217, B:296:0x124a, B:332:0x14a1), top: B:830:0x1130, outer: #7, inners: #2, #6, #9, #53 }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x16f5 A[Catch: all -> 0x16c6, TRY_ENTER, TRY_LEAVE, TryCatch #22 {all -> 0x16c6, blocks: (B:370:0x167d, B:377:0x16f5, B:382:0x1753, B:384:0x1759, B:385:0x179f), top: B:841:0x167d }] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x1750  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x17ae  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x1aa8 A[Catch: all -> 0x1bfa, TryCatch #45 {all -> 0x1bfa, blocks: (B:432:0x1a9e, B:433:0x1aa2, B:435:0x1aa8, B:438:0x1ac3, B:401:0x17cd, B:418:0x197f, B:422:0x19c8, B:428:0x1a39, B:431:0x1a98), top: B:883:0x17cd }] */
    /* JADX WARN: Removed duplicated region for block: B:495:0x1c79 A[Catch: all -> 0x04b2, TryCatch #7 {all -> 0x04b2, blocks: (B:194:0x0bf4, B:196:0x0bfa, B:197:0x0c25, B:275:0x107d, B:277:0x1083, B:278:0x10ad, B:493:0x1c73, B:495:0x1c79, B:496:0x1ca6, B:733:0x337b, B:735:0x3381, B:736:0x33ad, B:770:0x36c1, B:772:0x36c7, B:773:0x36f3, B:750:0x34f3, B:752:0x3516, B:753:0x356a, B:693:0x2ef5, B:695:0x2efb, B:696:0x2f21, B:589:0x27ed, B:591:0x27f3, B:593:0x2826, B:595:0x2860, B:596:0x28a7, B:563:0x2535, B:565:0x254a, B:566:0x2579, B:543:0x2231, B:545:0x2237, B:546:0x2264, B:548:0x229e, B:549:0x22e8, B:513:0x1eed, B:515:0x1f02, B:516:0x1f31, B:518:0x1f65, B:519:0x1fdb, B:361:0x15cd, B:363:0x15d3, B:364:0x15fd, B:74:0x0653, B:76:0x0659, B:77:0x0682, B:19:0x024f, B:21:0x0255, B:22:0x027d, B:24:0x0423, B:26:0x0454, B:27:0x04ac, B:282:0x1130, B:284:0x1136, B:285:0x117d, B:287:0x118a, B:289:0x1193, B:290:0x11d7, B:313:0x1411, B:314:0x1415, B:316:0x141b, B:319:0x1432, B:322:0x143f, B:324:0x1442, B:336:0x1519, B:338:0x151f, B:339:0x1520, B:341:0x1522, B:343:0x1529, B:344:0x152a, B:291:0x11e2, B:303:0x12eb, B:305:0x12f1, B:306:0x133c, B:308:0x1366, B:309:0x13ac, B:311:0x13c2, B:312:0x140b, B:346:0x152c, B:348:0x1533, B:349:0x1534, B:351:0x1536, B:353:0x153d, B:354:0x153e, B:599:0x29cb, B:601:0x29d1, B:602:0x2a16, B:604:0x2a3d, B:605:0x2a7c, B:607:0x2a92, B:609:0x2a9b, B:610:0x2ae0, B:642:0x2d29, B:643:0x2d2d, B:645:0x2d33, B:648:0x2d4b, B:654:0x2d66, B:656:0x2d69, B:668:0x2e3f, B:670:0x2e45, B:671:0x2e46, B:673:0x2e48, B:675:0x2e4f, B:676:0x2e50, B:612:0x2aed, B:614:0x2af1, B:618:0x2afd, B:620:0x2b03, B:632:0x2c10, B:634:0x2c16, B:635:0x2c5e, B:637:0x2c88, B:638:0x2ccb, B:640:0x2ce1, B:641:0x2d23, B:678:0x2e52, B:680:0x2e59, B:681:0x2e5a, B:683:0x2e5c, B:685:0x2e63, B:686:0x2e64, B:33:0x04bb, B:37:0x04cb, B:60:0x05b9, B:62:0x05bf, B:63:0x05c0, B:65:0x05c2, B:67:0x05c9, B:68:0x05ca, B:41:0x04d7, B:42:0x04e1, B:43:0x04e2), top: B:813:0x024f, inners: #16, #38, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x1d33  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x1da1  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x1dfa  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x1ecd  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x2118  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x21f0  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x23e1  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x2427  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x2435  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x2515  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x26b8  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x27b1  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x29d1 A[Catch: all -> 0x2e65, TryCatch #38 {all -> 0x2e65, blocks: (B:599:0x29cb, B:601:0x29d1, B:602:0x2a16, B:604:0x2a3d, B:605:0x2a7c, B:607:0x2a92, B:609:0x2a9b, B:610:0x2ae0, B:642:0x2d29, B:643:0x2d2d, B:645:0x2d33, B:648:0x2d4b, B:654:0x2d66, B:656:0x2d69, B:668:0x2e3f, B:670:0x2e45, B:671:0x2e46, B:673:0x2e48, B:675:0x2e4f, B:676:0x2e50, B:612:0x2aed, B:614:0x2af1, B:618:0x2afd, B:620:0x2b03, B:632:0x2c10, B:634:0x2c16, B:635:0x2c5e, B:637:0x2c88, B:638:0x2ccb, B:640:0x2ce1, B:641:0x2d23, B:678:0x2e52, B:680:0x2e59, B:681:0x2e5a, B:683:0x2e5c, B:685:0x2e63, B:686:0x2e64, B:664:0x2dca, B:659:0x2d95, B:661:0x2d9b, B:662:0x2dc2, B:627:0x2b71, B:629:0x2b90, B:630:0x2c04, B:622:0x2b23, B:624:0x2b38, B:625:0x2b6a), top: B:871:0x29cb, outer: #7, inners: #14, #23, #29, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:604:0x2a3d A[Catch: all -> 0x2e65, TryCatch #38 {all -> 0x2e65, blocks: (B:599:0x29cb, B:601:0x29d1, B:602:0x2a16, B:604:0x2a3d, B:605:0x2a7c, B:607:0x2a92, B:609:0x2a9b, B:610:0x2ae0, B:642:0x2d29, B:643:0x2d2d, B:645:0x2d33, B:648:0x2d4b, B:654:0x2d66, B:656:0x2d69, B:668:0x2e3f, B:670:0x2e45, B:671:0x2e46, B:673:0x2e48, B:675:0x2e4f, B:676:0x2e50, B:612:0x2aed, B:614:0x2af1, B:618:0x2afd, B:620:0x2b03, B:632:0x2c10, B:634:0x2c16, B:635:0x2c5e, B:637:0x2c88, B:638:0x2ccb, B:640:0x2ce1, B:641:0x2d23, B:678:0x2e52, B:680:0x2e59, B:681:0x2e5a, B:683:0x2e5c, B:685:0x2e63, B:686:0x2e64, B:664:0x2dca, B:659:0x2d95, B:661:0x2d9b, B:662:0x2dc2, B:627:0x2b71, B:629:0x2b90, B:630:0x2c04, B:622:0x2b23, B:624:0x2b38, B:625:0x2b6a), top: B:871:0x29cb, outer: #7, inners: #14, #23, #29, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:607:0x2a92 A[Catch: all -> 0x2e65, TryCatch #38 {all -> 0x2e65, blocks: (B:599:0x29cb, B:601:0x29d1, B:602:0x2a16, B:604:0x2a3d, B:605:0x2a7c, B:607:0x2a92, B:609:0x2a9b, B:610:0x2ae0, B:642:0x2d29, B:643:0x2d2d, B:645:0x2d33, B:648:0x2d4b, B:654:0x2d66, B:656:0x2d69, B:668:0x2e3f, B:670:0x2e45, B:671:0x2e46, B:673:0x2e48, B:675:0x2e4f, B:676:0x2e50, B:612:0x2aed, B:614:0x2af1, B:618:0x2afd, B:620:0x2b03, B:632:0x2c10, B:634:0x2c16, B:635:0x2c5e, B:637:0x2c88, B:638:0x2ccb, B:640:0x2ce1, B:641:0x2d23, B:678:0x2e52, B:680:0x2e59, B:681:0x2e5a, B:683:0x2e5c, B:685:0x2e63, B:686:0x2e64, B:664:0x2dca, B:659:0x2d95, B:661:0x2d9b, B:662:0x2dc2, B:627:0x2b71, B:629:0x2b90, B:630:0x2c04, B:622:0x2b23, B:624:0x2b38, B:625:0x2b6a), top: B:871:0x29cb, outer: #7, inners: #14, #23, #29, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:611:0x2aeb  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x2d33 A[Catch: all -> 0x2e65, TryCatch #38 {all -> 0x2e65, blocks: (B:599:0x29cb, B:601:0x29d1, B:602:0x2a16, B:604:0x2a3d, B:605:0x2a7c, B:607:0x2a92, B:609:0x2a9b, B:610:0x2ae0, B:642:0x2d29, B:643:0x2d2d, B:645:0x2d33, B:648:0x2d4b, B:654:0x2d66, B:656:0x2d69, B:668:0x2e3f, B:670:0x2e45, B:671:0x2e46, B:673:0x2e48, B:675:0x2e4f, B:676:0x2e50, B:612:0x2aed, B:614:0x2af1, B:618:0x2afd, B:620:0x2b03, B:632:0x2c10, B:634:0x2c16, B:635:0x2c5e, B:637:0x2c88, B:638:0x2ccb, B:640:0x2ce1, B:641:0x2d23, B:678:0x2e52, B:680:0x2e59, B:681:0x2e5a, B:683:0x2e5c, B:685:0x2e63, B:686:0x2e64, B:664:0x2dca, B:659:0x2d95, B:661:0x2d9b, B:662:0x2dc2, B:627:0x2b71, B:629:0x2b90, B:630:0x2c04, B:622:0x2b23, B:624:0x2b38, B:625:0x2b6a), top: B:871:0x29cb, outer: #7, inners: #14, #23, #29, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:701:0x2fad  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x3001  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x30c3  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x3358  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x3437  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x3488  */
    /* JADX WARN: Removed duplicated region for block: B:749:0x34d5  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x36a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:841:0x167d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:853:0x0708 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:930:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x07c1 A[Catch: all -> 0x0b5b, TRY_ENTER, TRY_LEAVE, TryCatch #35 {all -> 0x0b5b, blocks: (B:81:0x0702, B:87:0x0757, B:96:0x07c1), top: B:866:0x0702 }] */
    /* JADX WARN: Type inference failed for: r10v214, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v69, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v70 */
    /* JADX WARN: Type inference failed for: r12v71 */
    /* JADX WARN: Type inference failed for: r12v72 */
    /* JADX WARN: Type inference failed for: r12v73 */
    /* JADX WARN: Type inference failed for: r12v83 */
    /* JADX WARN: Type inference failed for: r12v84 */
    /* JADX WARN: Type inference failed for: r12v85 */
    /* JADX WARN: Type inference failed for: r12v86 */
    /* JADX WARN: Type inference failed for: r12v87 */
    /* JADX WARN: Type inference failed for: r1v179 */
    /* JADX WARN: Type inference failed for: r1v185, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v193 */
    /* JADX WARN: Type inference failed for: r1v207 */
    /* JADX WARN: Type inference failed for: r1v213 */
    /* JADX WARN: Type inference failed for: r1v214 */
    /* JADX WARN: Type inference failed for: r1v224, types: [int] */
    /* JADX WARN: Type inference failed for: r1v225 */
    /* JADX WARN: Type inference failed for: r1v226 */
    /* JADX WARN: Type inference failed for: r1v227 */
    /* JADX WARN: Type inference failed for: r1v228 */
    /* JADX WARN: Type inference failed for: r1v229 */
    /* JADX WARN: Type inference failed for: r1v230 */
    /* JADX WARN: Type inference failed for: r1v237 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v390 */
    /* JADX WARN: Type inference failed for: r1v391 */
    /* JADX WARN: Type inference failed for: r1v392 */
    /* JADX WARN: Type inference failed for: r1v393 */
    /* JADX WARN: Type inference failed for: r1v394 */
    /* JADX WARN: Type inference failed for: r1v395 */
    /* JADX WARN: Type inference failed for: r1v396 */
    /* JADX WARN: Type inference failed for: r1v397 */
    /* JADX WARN: Type inference failed for: r1v398 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v11 */
    /* JADX WARN: Type inference failed for: r28v12 */
    /* JADX WARN: Type inference failed for: r28v13 */
    /* JADX WARN: Type inference failed for: r28v14 */
    /* JADX WARN: Type inference failed for: r28v15 */
    /* JADX WARN: Type inference failed for: r28v16 */
    /* JADX WARN: Type inference failed for: r28v17 */
    /* JADX WARN: Type inference failed for: r28v19 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v20 */
    /* JADX WARN: Type inference failed for: r28v21 */
    /* JADX WARN: Type inference failed for: r28v22 */
    /* JADX WARN: Type inference failed for: r28v23 */
    /* JADX WARN: Type inference failed for: r28v24 */
    /* JADX WARN: Type inference failed for: r28v25 */
    /* JADX WARN: Type inference failed for: r28v26 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r2v420 */
    /* JADX WARN: Type inference failed for: r2v599 */
    /* JADX WARN: Type inference failed for: r2v600 */
    /* JADX WARN: Type inference failed for: r2v614, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v623 */
    /* JADX WARN: Type inference failed for: r2v842 */
    /* JADX WARN: Type inference failed for: r31v10 */
    /* JADX WARN: Type inference failed for: r31v54 */
    /* JADX WARN: Type inference failed for: r31v56 */
    /* JADX WARN: Type inference failed for: r31v57 */
    /* JADX WARN: Type inference failed for: r31v58 */
    /* JADX WARN: Type inference failed for: r31v59 */
    /* JADX WARN: Type inference failed for: r31v66 */
    /* JADX WARN: Type inference failed for: r31v70 */
    /* JADX WARN: Type inference failed for: r31v71 */
    /* JADX WARN: Type inference failed for: r31v72 */
    /* JADX WARN: Type inference failed for: r31v73 */
    /* JADX WARN: Type inference failed for: r31v74 */
    /* JADX WARN: Type inference failed for: r31v75 */
    /* JADX WARN: Type inference failed for: r31v8 */
    /* JADX WARN: Type inference failed for: r31v9 */
    /* JADX WARN: Type inference failed for: r31v91 */
    /* JADX WARN: Type inference failed for: r31v92 */
    /* JADX WARN: Type inference failed for: r31v93 */
    /* JADX WARN: Type inference failed for: r31v94 */
    /* JADX WARN: Type inference failed for: r5v228, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v100 */
    /* JADX WARN: Type inference failed for: r6v101 */
    /* JADX WARN: Type inference failed for: r6v102 */
    /* JADX WARN: Type inference failed for: r6v103 */
    /* JADX WARN: Type inference failed for: r6v124 */
    /* JADX WARN: Type inference failed for: r6v125 */
    /* JADX WARN: Type inference failed for: r6v126, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v127 */
    /* JADX WARN: Type inference failed for: r6v128 */
    /* JADX WARN: Type inference failed for: r6v129 */
    /* JADX WARN: Type inference failed for: r6v133 */
    /* JADX WARN: Type inference failed for: r6v179 */
    /* JADX WARN: Type inference failed for: r6v180 */
    /* JADX WARN: Type inference failed for: r6v181 */
    /* JADX WARN: Type inference failed for: r6v182 */
    /* JADX WARN: Type inference failed for: r6v183 */
    /* JADX WARN: Type inference failed for: r6v184 */
    /* JADX WARN: Type inference failed for: r6v185 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r6v99 */
    /* JADX WARN: Type inference failed for: r7v538, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v539 */
    /* JADX WARN: Type inference failed for: r7v540 */
    /* JADX WARN: Type inference failed for: r7v541 */
    /* JADX WARN: Type inference failed for: r7v542 */
    /* JADX WARN: Type inference failed for: r7v545 */
    /* JADX WARN: Type inference failed for: r7v550 */
    /* JADX WARN: Type inference failed for: r7v560 */
    /* JADX WARN: Type inference failed for: r7v561 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.activity.PochiWalletStatusActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit $r8$lambda$N89Sfax5wSwnqRVXcJPK6F0V21U(PochiWalletStatusActivity pochiWalletStatusActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 51;
        toString = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            initObserver$lambda$0(pochiWalletStatusActivity, resource);
            obj.hashCode();
            throw null;
        }
        Unit unitInitObserver$lambda$0 = initObserver$lambda$0(pochiWalletStatusActivity, resource);
        int i3 = ArtificialStackFrames + 55;
        toString = i3 % 128;
        if (i3 % 2 == 0) {
            return unitInitObserver$lambda$0;
        }
        obj.hashCode();
        throw null;
    }

    static {
        hashCode = 0;
        ShareDataUIState();
        component3();
        int i = getShareableDataState + 63;
        hashCode = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 57;
        toString = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = ArtificialStackFrames + 21;
        toString = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void component3() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 9;
        toString = i3 % 128;
        int i4 = i3 % 2;
        ShareDataUIState = 723582245;
        copydefault = -238323900;
        component2 = 2144121787;
        component3 = new byte[]{-54, -56, 60, -63, -54, 56, -18, 8, -61, -12, 37, TarHeader.LF_LINK, -59, -36, 40, 39, TarHeader.LF_NORMAL, -34, TarHeader.LF_LINK, 59, 38, 58, -15, -34, 121, -56, 60, -63, -54, 56, -50, -2, 0, TarHeader.LF_LINK, -126, 0, TarHeader.LF_LINK, -35, 36, TarHeader.LF_SYMLINK, -36, 58, 56, -64, Base64.padSymbol, -128, 121, -56, 37, 37, -49, -64, 58, -55, -16, 103, -61, -12, 37, TarHeader.LF_LINK, -59, 60, -63, -10, 40, -10, -49, 59, -64, -13, 0, -63, 43, -45, 41, -56, -25, Ascii.FF, 59, -55};
        int i5 = i2 + 67;
        toString = i5 % 128;
        int i6 = i5 % 2;
    }

    static void ShareDataUIState() {
        equals = new char[]{30248, 30239, 30245, 30235, 30238, 30240, 30431, 30234, 30265, 30250, 30244, 30236, 30224, 30260, 30424, 30423, 30421, 30426, 30251, 30428, 30425, 30417, 30420, 30416, 30422, 30229, 30401, 30241, 30410, 30427, 30247};
        component4 = 321287817;
        copy = true;
        getRequestBeneficiariesState = true;
        getAsAtTimestamp = new char[]{2019, 2020, 2021, 2016, 1049, 2024, 1054, 1052, 2002, 1967, 1976, 1971, 2035, 1975, 1051, 1977, 2025, 2030, 2023, 2041, 1969, 1968, 1973, 2036, 2018, 2017, 2037, 1974, 1985, 1972, 2022, 2027, 2031, 2004, 1978, 2033, 2038, 1055, 2032, 1050, 2034, 1987, 2026, 1048, 2028, 1966, 2029, 2003, 1970};
        getSponsorBeneficiariesState = (char) 12829;
    }
}
