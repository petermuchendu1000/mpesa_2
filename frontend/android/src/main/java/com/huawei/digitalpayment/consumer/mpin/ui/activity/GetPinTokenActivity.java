package com.huawei.digitalpayment.consumer.mpin.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
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
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.blankj.utilcode.util.ActivityUtils;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.databinding.ActivityBasePinBinding;
import com.huawei.digitalpayment.consumer.baselib.http.HttpStatus;
import com.huawei.digitalpayment.consumer.baselib.pin.model.PinType;
import com.huawei.digitalpayment.consumer.baselib.service.ILoginService;
import com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils;
import com.huawei.digitalpayment.consumer.login.R;
import com.huawei.digitalpayment.consumer.login.util.MaximunDialogUtils;
import com.huawei.digitalpayment.consumer.loginModule.mpin.request.GetPinTokenParams;
import com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.GetPinTokenViewModel;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import dagger.hilt.android.AndroidEntryPoint;
import io.ktor.util.date.GMTDateParser;
import java.lang.reflect.Method;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.getActiveNotifications;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0007H\u0014J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0014¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/mpin/ui/activity/GetPinTokenActivity;", "Lcom/huawei/digitalpayment/consumer/baselib/pin/ui/activity/BasePinActivity;", "Lcom/huawei/digitalpayment/consumer/baselib/databinding/ActivityBasePinBinding;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/viewmodel/GetPinTokenViewModel;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onForgetClick", "onConfirmClick", "pin", "", "getPinType", "Lcom/huawei/digitalpayment/consumer/baselib/pin/model/PinType;", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class GetPinTokenActivity extends Hilt_GetPinTokenActivity<ActivityBasePinBinding, GetPinTokenViewModel> {
    public static final int $stable = 0;
    private static int[] ShareDataUIState;
    private static long component2;
    private static int component3;
    private static int copy;
    private static final byte[] $$c = {120, -62, 63, 57};
    private static final int $$f = 10;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {62, TarHeader.LF_FIFO, 60, 44, 17, 6, Ascii.SO, -16, 6, 6, 0, Ascii.EM, -4, 13, 17, 3, 8, 4, 4, -4, Ascii.SO, Ascii.VT, -60, 17, 3, -58, 74, -13, 10, 0, Ascii.SYN, -4, -1, 17, 3, -58, 59, 6, 19, -5, 3, Ascii.FF, 10, Ascii.VT, -1, 6, -10, 13, -58, 58, 17, 3, 8, 4, 4, -4, Ascii.SO, Ascii.VT, 4, -64, 58, 10, 6, Ascii.FF, -61, Ascii.EM, 36, Ascii.ETB, -9, -26, 40, 8, 13, -10, Ascii.DC2, -42, 42, 6, Ascii.FF, -32, 46, -75, 5, 38, 56, 1, -10, Ascii.DC2, 1, -8, Ascii.DLE, -20, 43, -6, Ascii.VT, -7, 2, 20, -6, -1, -18, Ascii.SUB, 17, -6, 7, 2, -44, 17, 3, 8, 4, 4, -4, Ascii.SO, Ascii.VT, -61};
    private static final int $$n = 70;
    private static final byte[] $$a = {41, -64, -63, -4, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 4;
    private static int getAsAtTimestamp = 1;
    private static int component1 = 0;
    private static int copydefault = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class ShareDataUIState implements Observer, FunctionAdapter {
        private static int component1 = 1;
        private static int component3;
        private final Function1 ShareDataUIState;

        ShareDataUIState(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.ShareDataUIState = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 113;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            if (obj instanceof Observer) {
                int i5 = i3 + 85;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    boolean z = obj instanceof FunctionAdapter;
                    throw null;
                }
                if (!(!(obj instanceof FunctionAdapter))) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return false;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component3 + 115;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.ShareDataUIState;
            if (i3 != 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 69;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = component3 + 13;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 15;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                this.ShareDataUIState.invoke(obj);
                int i3 = 94 / 0;
            } else {
                this.ShareDataUIState.invoke(obj);
            }
            int i4 = component3 + 21;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r5, short r6, int r7) {
        /*
            int r6 = r6 + 65
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.GetPinTokenActivity.$$c
            int r5 = r5 * 3
            int r1 = 1 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            int r5 = 0 - r5
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r3 = r0[r7]
        L26:
            int r7 = r7 + 1
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.GetPinTokenActivity.$$i(short, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.GetPinTokenActivity.$$a
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = 103 - r8
            int r1 = 28 - r6
            byte[] r1 = new byte[r1]
            int r6 = 27 - r6
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r8]
        L2a:
            int r7 = r7 + r4
            int r7 = r7 + (-8)
            int r8 = r8 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.GetPinTokenActivity.d(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.mpin.ui.activity.GetPinTokenActivity.$$m
            int r5 = 107 - r5
            int r1 = 85 - r6
            int r7 = r7 * 4
            int r7 = 99 - r7
            byte[] r1 = new byte[r1]
            int r6 = 84 - r6
            r2 = -1
            if (r0 != 0) goto L14
            r3 = r7
            r7 = r5
            goto L29
        L14:
            r4 = r7
            r7 = r5
            r5 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r1[r2] = r3
            if (r2 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L27:
            r3 = r0[r7]
        L29:
            int r5 = r5 + r3
            int r7 = r7 + 1
            int r5 = r5 + (-5)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.GetPinTokenActivity.f(int, short, short, java.lang.Object[]):void");
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $10 + 63;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((-16773950) - Color.rgb(0, 0, 0), 33 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (Color.alpha(0) + 60268), -834797019, false, $$i(b2, (byte) (b2 | 37), b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component2 ^ 5431355972723572778L);
                try {
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 687, 34 - ExpandableListView.getPackedPositionGroup(0L), (char) (60373 - (ViewConfiguration.getTouchSlop() >> 8)), -1969106284, false, $$i(b3, (byte) (b3 | 40), b3), new Class[]{Object.class, Object.class});
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
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            try {
                Object[] objArr4 = {notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(686 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 34 - TextUtils.indexOf("", "", 0), (char) (60373 - TextUtils.getOffsetBefore("", 0)), -1969106284, false, $$i(b4, (byte) (b4 | 40), b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        String str = new String(cArr2);
        int i6 = $11 + 1;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    private static void e(char[] cArr, int i, int i2, int i3, boolean z, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr3 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr3[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i5 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i5]), Integer.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 3784, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 38, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 26860), 2015799920, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 7406, 16 - TextUtils.getTrimmedLength(""), (char) View.MeasureSpec.getMode(0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr4, iTrustedWebActivityServiceStub.component1, cArr3, 0, i2 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            int i6 = $10 + 77;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2 = new char[i2];
                iTrustedWebActivityServiceStub.ShareDataUIState = 1;
            } else {
                cArr2 = new char[i2];
                iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            }
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr3[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                try {
                    Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7406 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3 = cArr2;
        }
        String str = new String(cArr3);
        int i7 = $10 + 11;
        $11 = i7 % 128;
        if (i7 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i8 = 24 / 0;
            objArr[0] = str;
        }
    }

    private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = ShareDataUIState;
        int i5 = 684241640;
        int i6 = 1;
        int i7 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 23;
                $10 = i9 % 128;
                int i10 = i9 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4391 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 37 - View.MeasureSpec.getMode(0), (char) (ViewConfiguration.getScrollBarSize() >> 8), -309236339, false, $$i(b2, (byte) (b2 | 41), b2), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i8++;
                    int i11 = $11 + 35;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i3 = 2;
                    i5 = 684241640;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = ShareDataUIState;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $11 + 115;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    try {
                        Object[] objArr3 = new Object[i6];
                        objArr3[i7] = Integer.valueOf(iArr5[i13]);
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault2 == null) {
                            byte b3 = (byte) i7;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4391, 36 - MotionEvent.axisFromString(""), (char) (Process.myTid() >> 22), -309236339, false, $$i(b3, (byte) (b3 | 41), b3), new Class[]{Integer.TYPE});
                        }
                        iArr6[i13] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i13])};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 4391, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), -309236339, false, $$i(b4, (byte) (b4 | 41), b4), new Class[]{Integer.TYPE});
                    }
                    iArr6[i13] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    i13++;
                }
                i6 = 1;
                i7 = 0;
            }
            i2 = i7;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        getactivenotifications.component1 = i2;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[i2] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr4[i15];
                Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault4 == null) {
                    byte b5 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2967 - ((byte) KeyEvent.getModifierMetaStateMask()), 16 - TextUtils.getTrimmedLength(""), (char) (49871 - Color.green(0)), 462826032, false, $$i(b5, (byte) (b5 | 39), b5), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i15++;
            }
            int i17 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i17;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i18 = getactivenotifications.ShareDataUIState;
            int i19 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr6 = {getactivenotifications, getactivenotifications};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault5 == null) {
                byte b6 = (byte) 0;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((Process.myTid() >> 22) + 2944, ImageFormat.getBitsPerPixel(0) + 25, (char) (ExpandableListView.getPackedPositionType(0L) + 27637), -1616366948, false, $$i(b6, (byte) (b6 | 42), b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0092  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.GetPinTokenActivity.onCreate(android.os.Bundle):void");
    }

    private static final Unit onCreate$lambda$0(GetPinTokenActivity getPinTokenActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = component1 + 79;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getPinTokenActivity, "");
        GetPinTokenActivity getPinTokenActivity2 = getPinTokenActivity;
        Utils.showOrHideLoading(getPinTokenActivity2, resource);
        if (resource.error()) {
            int i4 = component1 + 73;
            copydefault = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                ((ActivityBasePinBinding) getPinTokenActivity.binding).etCode.showError(resource.getMessage());
                ((ActivityBasePinBinding) getPinTokenActivity.binding).etCode.clear();
                Intrinsics.areEqual(HttpStatus.CONSUMER_PIN_ERROR_MAXIMUM, resource.getException().getResponseCode());
                obj.hashCode();
                throw null;
            }
            ((ActivityBasePinBinding) getPinTokenActivity.binding).etCode.showError(resource.getMessage());
            ((ActivityBasePinBinding) getPinTokenActivity.binding).etCode.clear();
            if (Intrinsics.areEqual(HttpStatus.CONSUMER_PIN_ERROR_MAXIMUM, resource.getException().getResponseCode())) {
                int i5 = copydefault + 85;
                component1 = i5 % 128;
                MaximunDialogUtils.showMaximunDialog$default(i5 % 2 != 0 ? MaximunDialogUtils.INSTANCE : MaximunDialogUtils.INSTANCE, getPinTokenActivity2, false, 2, null);
                return Unit.INSTANCE;
            }
        }
        if (resource.success()) {
            Intent intent = new Intent();
            intent.putExtra(KeysConstants.KEY_ENCRYPT_PIN, (String) resource.getData());
            getPinTokenActivity.setResult(-1, intent);
            getPinTokenActivity.finish();
        }
        return Unit.INSTANCE;
    }

    @Override
    public void onForgetClick() {
        int i = 2 % 2;
        ((ILoginService) RouteUtils.getService(ILoginService.class)).resetPin(new ApiCallback<Boolean>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void onSuccess(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = component3 + 69;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(bool);
                if (i4 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(Boolean value) {
                int i2 = 2 % 2;
                int i3 = component3 + 109;
                ShareDataUIState = i3 % 128;
                ActivityUtils.finishToActivity((Activity) (i3 % 2 == 0 ? GetPinTokenActivity.this : GetPinTokenActivity.this), false, true);
            }
        });
        int i2 = component1 + 1;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onConfirmClick(String pin) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pin, "");
        GetPinTokenViewModel getPinTokenViewModel = (GetPinTokenViewModel) this.viewModel;
        String strEncryptWithPinKey = EncryptUtils.encryptWithPinKey(pin);
        Intrinsics.checkNotNullExpressionValue(strEncryptWithPinKey, "");
        getPinTokenViewModel.authSensitiveOperation(new GetPinTokenParams(strEncryptWithPinKey));
        int i2 = component1 + 51;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public PinType getPinType() {
        int i = 2 % 2;
        PinType pinType = new PinType(getString(R.string.onboarding_identity_pin_title1), getString(R.string.onboarding_identity_pin_tips1, new Object[]{String.valueOf(AppConfigManager.getAppConfig().getPinLimit())}), getString(R.string.onboarding_identity_pin_button2), getString(R.string.onboarding_identity_pin_button1));
        int i2 = component1 + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return pinType;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = component1 + 1;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            c(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 3260, new char[]{1793, 2597, 7506, 8339, 13219, 18142, 18438, 23395, 28249, 29075, 33982, 38807, 39205, 44076, 48974, 49804, 54694, 55506, 59922, 64808, GMTDateParser.HOURS, 5007, 9888, 10712, 15113, 20023}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b((((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(com.safaricom.mpesa.lifestyle.R.integer._2131427364_res_0x7f0b0024) & (-3)) + 17, new int[]{-276225280, -2146614204, 1500880684, 1102683095, 1675336066, 326145953, 1657109146, -877816954, -1410936800, 531958211}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = component1 + 79;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            if ((!(baseContext instanceof ContextWrapper)) || ((ContextWrapper) baseContext).getBaseContext() != null) {
                baseContext = baseContext.getApplicationContext();
                int i6 = copydefault + 97;
                component1 = i6 % 128;
                int i7 = i6 % 2;
            } else {
                baseContext = null;
            }
        }
        if (baseContext != null) {
            int i8 = component1 + 75;
            copydefault = i8 % 128;
            try {
                if (i8 % 2 == 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - Color.blue(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 43, (char) KeyEvent.keyCodeFromString(""), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 55 - TextUtils.indexOf((CharSequence) "", '0'), (char) (ImageFormat.getBitsPerPixel(0) + 1), -699576857, false, "component2", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    int i9 = 65 / 0;
                } else {
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(6618 - Color.alpha(0), 42 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 56, (char) View.MeasureSpec.getSize(0), -699576857, false, "component2", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x008e  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.GetPinTokenActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|2|(2:4|(2:(2:7|(2:9|(2:14|(1:18)(1:17))(0))(2:12|(0)(0)))(1:19)|(9:21|805|22|(1:24)|25|26|27|(1:29)|30)(1:34))(0))(0)|35|(2:771|36)|(12:763|38|42|(2:44|45)|46|47|802|(4:49|50|(1:52)|53)(14:54|(2:56|(1:62)(1:61))(1:64)|(21:66|67|812|68|740|69|(3:71|775|72)|76|77|814|78|(2:822|80)|84|85|86|(2:810|88)|89|(1:91)(1:93)|94|(2:96|97)|98)(1:150)|153|154|756|155|158|159|(1:161)|162|163|779|164)|99|(4:102|(2:104|826)(11:105|(3:107|(3:110|111|108)|827)|114|797|115|(1:117)|118|119|786|120|825)|121|100)|824|135)(10:42|(0)|46|47|802|(0)(0)|99|(1:100)|824|135)|165|(51:(8:799|166|(1:168)|169|(3:171|(1:173)|174)(19:175|176|788|177|(1:179)|180|181|773|182|(1:184)|185|186|187|(1:189)|190|(1:192)|193|(1:195)|196)|197|(4:200|(3:830|202|833)(12:829|203|(3:205|(3:208|209|206)|834)|210|759|211|(1:213)|214|215|820|216|832)|831|198)|828)|(8:809|320|(1:322)|323|(3:325|(1:327)|328)(19:329|330|800|331|(1:333)|334|335|790|336|(1:338)|339|340|341|(1:343)|344|(1:346)|347|(1:349)|350)|351|(4:354|(3:837|356|840)(12:836|357|(3:359|(3:362|363|360)|841)|364|769|365|(1:367)|368|369|754|370|839)|838|352)|835)|(43:758|408|(3:410|411|(2:413|415)(1:414))(1:415)|452|(1:454)|455|(3:457|(1:459)|460)(14:461|462|(1:464)|465|466|(1:468)|469|767|470|471|(1:473)(1:474)|475|(1:477)|478)|479|(1:481)(9:482|(3:484|(2:487|485)|850)|488|489|(1:491)|492|(1:494)|495|496)|497|(1:499)|500|(1:502)|503|(3:505|(1:507)|508)(16:510|511|(1:513)|514|(1:516)|517|518|(1:520)|521|761|522|523|(1:525)|526|(1:528)|529)|509|530|(1:532)(9:533|(3:535|(2:538|536)|849)|539|540|(1:542)|543|(1:545)|546|547)|548|792|549|(1:551)|552|(1:554)|555|(3:557|(1:559)|560)(16:(2:562|(1:568)(1:567))|(19:570|571|780|572|(1:574)|575|576|765|577|(1:579)|580|581|582|(1:584)|585|(1:587)|588|(1:590)|591)|646|(1:648)|649|(3:651|(1:653)|654)(13:656|744|657|658|(1:660)|661|782|662|663|(1:665)|666|(1:668)|669)|655|670|(6:673|674|(1:676)|677|678|679)|680|(1:682)|683|(3:685|(1:687)|688)(14:690|691|(1:693)|694|695|(1:697)|698|793|699|700|(1:702)|703|(1:705)|706)|689|707|(1:851)(7:710|711|(1:713)|714|715|716|717))|592|(4:595|(3:844|597|847)(12:843|598|(3:600|(3:603|604|601)|848)|605|748|606|(1:608)|609|610|818|611|846)|845|593)|842|646|(0)|649|(0)(0)|655|670|(0)|680|(0)|683|(0)(0)|689|707|(0)(0))(1:419)|795|421|(1:423)|424|784|425|(1:427)|428|452|(0)|455|(0)(0)|479|(0)(0)|497|(0)|500|(0)|503|(0)(0)|509|530|(0)(0)|548|792|549|(0)|552|(0)|555|(0)(0)|592|(1:593)|842|646|(0)|649|(0)(0)|655|670|(0)|680|(0)|683|(0)(0)|689|707|(0)(0))|251|764|252|(1:254)|255|(3:257|(1:259)|260)(14:262|263|746|264|(1:266)|267|268|269|(1:271)|272|(1:274)|275|(1:277)|278)|261|279|(9:282|816|283|(1:285)|286|287|288|803|289)|290|319|383|420|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(51:(8:799|166|(1:168)|169|(3:171|(1:173)|174)(19:175|176|788|177|(1:179)|180|181|773|182|(1:184)|185|186|187|(1:189)|190|(1:192)|193|(1:195)|196)|197|(4:200|(3:830|202|833)(12:829|203|(3:205|(3:208|209|206)|834)|210|759|211|(1:213)|214|215|820|216|832)|831|198)|828)|(8:809|320|(1:322)|323|(3:325|(1:327)|328)(19:329|330|800|331|(1:333)|334|335|790|336|(1:338)|339|340|341|(1:343)|344|(1:346)|347|(1:349)|350)|351|(4:354|(3:837|356|840)(12:836|357|(3:359|(3:362|363|360)|841)|364|769|365|(1:367)|368|369|754|370|839)|838|352)|835)|(43:758|408|(3:410|411|(2:413|415)(1:414))(1:415)|452|(1:454)|455|(3:457|(1:459)|460)(14:461|462|(1:464)|465|466|(1:468)|469|767|470|471|(1:473)(1:474)|475|(1:477)|478)|479|(1:481)(9:482|(3:484|(2:487|485)|850)|488|489|(1:491)|492|(1:494)|495|496)|497|(1:499)|500|(1:502)|503|(3:505|(1:507)|508)(16:510|511|(1:513)|514|(1:516)|517|518|(1:520)|521|761|522|523|(1:525)|526|(1:528)|529)|509|530|(1:532)(9:533|(3:535|(2:538|536)|849)|539|540|(1:542)|543|(1:545)|546|547)|548|792|549|(1:551)|552|(1:554)|555|(3:557|(1:559)|560)(16:(2:562|(1:568)(1:567))|(19:570|571|780|572|(1:574)|575|576|765|577|(1:579)|580|581|582|(1:584)|585|(1:587)|588|(1:590)|591)|646|(1:648)|649|(3:651|(1:653)|654)(13:656|744|657|658|(1:660)|661|782|662|663|(1:665)|666|(1:668)|669)|655|670|(6:673|674|(1:676)|677|678|679)|680|(1:682)|683|(3:685|(1:687)|688)(14:690|691|(1:693)|694|695|(1:697)|698|793|699|700|(1:702)|703|(1:705)|706)|689|707|(1:851)(7:710|711|(1:713)|714|715|716|717))|592|(4:595|(3:844|597|847)(12:843|598|(3:600|(3:603|604|601)|848)|605|748|606|(1:608)|609|610|818|611|846)|845|593)|842|646|(0)|649|(0)(0)|655|670|(0)|680|(0)|683|(0)(0)|689|707|(0)(0))(1:419)|795|421|(1:423)|424|784|425|(1:427)|428|452|(0)|455|(0)(0)|479|(0)(0)|497|(0)|500|(0)|503|(0)(0)|509|530|(0)(0)|548|792|549|(0)|552|(0)|555|(0)(0)|592|(1:593)|842|646|(0)|649|(0)(0)|655|670|(0)|680|(0)|683|(0)(0)|689|707|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x12ad, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x12ae, code lost:
    
        r5 = new java.lang.Object[1];
        b(12 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new int[]{469969179, -1460306044, 69127830, -774103512, 1141911488, -846839346}, r5);
        r3 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x12c9, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x12e0, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x12e4, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r13 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x1312, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x1316, code lost:
    
        if (r5 == null) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x1318, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.view.View.resolveSize(0, 0) + 6618, 42 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x133f, code lost:
    
        r5 = ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x1346, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.mpin.ui.activity.GetPinTokenActivity.component1 + 85;
        com.huawei.digitalpayment.consumer.mpin.ui.activity.GetPinTokenActivity.copydefault = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x1351, code lost:
    
        r8 = new java.lang.Object[]{349825197, java.lang.Long.valueOf(r3), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6562, 56 - android.view.View.getDefaultSize(0, 0), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
        r9 = new java.lang.Object[1];
        f((byte) 93, (byte) (-com.huawei.digitalpayment.consumer.mpin.ui.activity.GetPinTokenActivity.$$m[81]), r3[10], r9);
        r1.getMethod((java.lang.String) r9[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r5, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x2c82, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x2c83, code lost:
    
        r5 = new java.lang.Object[1];
        b((android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 9, new int[]{883353416, -915755281, 659479304, -1612019760, 423196655, 751242863}, r5);
        r3 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x2c9f, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x2cb6, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x2cba, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r13 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x2ce8, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x2cec, code lost:
    
        if (r1 == null) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x2cee, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - android.text.TextUtils.getTrimmedLength(""), 42 - android.text.TextUtils.indexOf("", "", 0), (char) ((android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x2d18, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x2d1f, code lost:
    
        r5 = com.huawei.digitalpayment.consumer.mpin.ui.activity.GetPinTokenActivity.copydefault + 75;
        com.huawei.digitalpayment.consumer.mpin.ui.activity.GetPinTokenActivity.component1 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x2d2a, code lost:
    
        r8 = new java.lang.Object[]{349825197, java.lang.Long.valueOf(r3), r2, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.text.TextUtils.lastIndexOf("", '0', 0, 0) + 6563, 56 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
        r9 = new java.lang.Object[1];
        f((byte) 93, (byte) (-com.huawei.digitalpayment.consumer.mpin.ui.activity.GetPinTokenActivity.$$m[81]), r4[10], r9);
        r2.getMethod((java.lang.String) r9[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x07a0 A[Catch: all -> 0x08d2, TryCatch #40 {all -> 0x08d2, blocks: (B:99:0x0796, B:100:0x079a, B:102:0x07a0, B:105:0x07bb, B:68:0x04ff, B:86:0x0670, B:89:0x06be, B:94:0x0730, B:98:0x0790), top: B:812:0x04ff }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x095e A[Catch: all -> 0x0390, TryCatch #36 {all -> 0x0390, blocks: (B:159:0x0958, B:161:0x095e, B:162:0x0988, B:674:0x3021, B:676:0x3027, B:677:0x304f, B:711:0x335e, B:713:0x3364, B:714:0x338d, B:691:0x3195, B:693:0x31b8, B:694:0x320c, B:640:0x2ce8, B:642:0x2cee, B:643:0x2d18, B:540:0x2639, B:542:0x263f, B:543:0x2667, B:545:0x26a1, B:546:0x26e7, B:511:0x22bd, B:513:0x22d2, B:514:0x2303, B:516:0x2337, B:517:0x23b5, B:489:0x1f39, B:491:0x1f3f, B:492:0x1f6a, B:494:0x1fa4, B:495:0x1fe7, B:462:0x1c8f, B:464:0x1ca4, B:465:0x1cd2, B:446:0x1a98, B:448:0x1a9e, B:449:0x1aca, B:400:0x1857, B:402:0x185d, B:403:0x1881, B:313:0x1312, B:315:0x1318, B:316:0x133f, B:245:0x0e83, B:247:0x0e89, B:248:0x0eb6, B:22:0x019c, B:24:0x01a2, B:25:0x01c8, B:27:0x02ff, B:29:0x0331, B:30:0x038a), top: B:805:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0f3c A[Catch: all -> 0x12ad, TryCatch #13 {all -> 0x12ad, blocks: (B:252:0x0f36, B:254:0x0f3c, B:255:0x0f83, B:257:0x0f90, B:259:0x0f99, B:260:0x0fdd, B:279:0x1198, B:287:0x1200, B:293:0x1291, B:295:0x1297, B:296:0x1298, B:298:0x129a, B:300:0x12a1, B:301:0x12a2, B:262:0x0fe9, B:269:0x1073, B:271:0x1079, B:272:0x10c1, B:274:0x10eb, B:275:0x1132, B:277:0x1148, B:278:0x1190, B:303:0x12a4, B:305:0x12ab, B:306:0x12ac, B:264:0x1009, B:266:0x101b, B:267:0x1067, B:289:0x1206, B:283:0x11c9, B:285:0x11cf, B:286:0x11f9), top: B:764:0x0f36, outer: #21, inners: #3, #35, #42 }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0f90 A[Catch: all -> 0x12ad, TryCatch #13 {all -> 0x12ad, blocks: (B:252:0x0f36, B:254:0x0f3c, B:255:0x0f83, B:257:0x0f90, B:259:0x0f99, B:260:0x0fdd, B:279:0x1198, B:287:0x1200, B:293:0x1291, B:295:0x1297, B:296:0x1298, B:298:0x129a, B:300:0x12a1, B:301:0x12a2, B:262:0x0fe9, B:269:0x1073, B:271:0x1079, B:272:0x10c1, B:274:0x10eb, B:275:0x1132, B:277:0x1148, B:278:0x1190, B:303:0x12a4, B:305:0x12ab, B:306:0x12ac, B:264:0x1009, B:266:0x101b, B:267:0x1067, B:289:0x1206, B:283:0x11c9, B:285:0x11cf, B:286:0x11f9), top: B:764:0x0f36, outer: #21, inners: #3, #35, #42 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0fe9 A[Catch: all -> 0x12ad, TRY_LEAVE, TryCatch #13 {all -> 0x12ad, blocks: (B:252:0x0f36, B:254:0x0f3c, B:255:0x0f83, B:257:0x0f90, B:259:0x0f99, B:260:0x0fdd, B:279:0x1198, B:287:0x1200, B:293:0x1291, B:295:0x1297, B:296:0x1298, B:298:0x129a, B:300:0x12a1, B:301:0x12a2, B:262:0x0fe9, B:269:0x1073, B:271:0x1079, B:272:0x10c1, B:274:0x10eb, B:275:0x1132, B:277:0x1148, B:278:0x1190, B:303:0x12a4, B:305:0x12ab, B:306:0x12ac, B:264:0x1009, B:266:0x101b, B:267:0x1067, B:289:0x1206, B:283:0x11c9, B:285:0x11cf, B:286:0x11f9), top: B:764:0x0f36, outer: #21, inners: #3, #35, #42 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x11aa  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x13d4 A[Catch: all -> 0x17d1, TryCatch #38 {all -> 0x17d1, blocks: (B:320:0x13ce, B:322:0x13d4, B:323:0x1413, B:325:0x1420, B:327:0x1429, B:328:0x146b, B:351:0x1692, B:352:0x1696, B:354:0x169c, B:357:0x16b3, B:360:0x16c0, B:362:0x16c3, B:374:0x17a7, B:376:0x17ad, B:377:0x17ae, B:379:0x17b0, B:381:0x17b7, B:382:0x17b8, B:329:0x1476, B:341:0x1581, B:343:0x1587, B:344:0x15c9, B:346:0x15f3, B:347:0x1635, B:349:0x164b, B:350:0x168c, B:385:0x17be, B:387:0x17c5, B:388:0x17c6, B:390:0x17c8, B:392:0x17cf, B:393:0x17d0, B:370:0x1727, B:365:0x16ef, B:367:0x16f5, B:368:0x171f, B:336:0x14e7, B:338:0x1503, B:339:0x1575, B:331:0x1496, B:333:0x14ab, B:334:0x14e0), top: B:809:0x13ce, outer: #21, inners: #7, #16, #27, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x1420 A[Catch: all -> 0x17d1, TryCatch #38 {all -> 0x17d1, blocks: (B:320:0x13ce, B:322:0x13d4, B:323:0x1413, B:325:0x1420, B:327:0x1429, B:328:0x146b, B:351:0x1692, B:352:0x1696, B:354:0x169c, B:357:0x16b3, B:360:0x16c0, B:362:0x16c3, B:374:0x17a7, B:376:0x17ad, B:377:0x17ae, B:379:0x17b0, B:381:0x17b7, B:382:0x17b8, B:329:0x1476, B:341:0x1581, B:343:0x1587, B:344:0x15c9, B:346:0x15f3, B:347:0x1635, B:349:0x164b, B:350:0x168c, B:385:0x17be, B:387:0x17c5, B:388:0x17c6, B:390:0x17c8, B:392:0x17cf, B:393:0x17d0, B:370:0x1727, B:365:0x16ef, B:367:0x16f5, B:368:0x171f, B:336:0x14e7, B:338:0x1503, B:339:0x1575, B:331:0x1496, B:333:0x14ab, B:334:0x14e0), top: B:809:0x13ce, outer: #21, inners: #7, #16, #27, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x1476 A[Catch: all -> 0x17d1, TRY_LEAVE, TryCatch #38 {all -> 0x17d1, blocks: (B:320:0x13ce, B:322:0x13d4, B:323:0x1413, B:325:0x1420, B:327:0x1429, B:328:0x146b, B:351:0x1692, B:352:0x1696, B:354:0x169c, B:357:0x16b3, B:360:0x16c0, B:362:0x16c3, B:374:0x17a7, B:376:0x17ad, B:377:0x17ae, B:379:0x17b0, B:381:0x17b7, B:382:0x17b8, B:329:0x1476, B:341:0x1581, B:343:0x1587, B:344:0x15c9, B:346:0x15f3, B:347:0x1635, B:349:0x164b, B:350:0x168c, B:385:0x17be, B:387:0x17c5, B:388:0x17c6, B:390:0x17c8, B:392:0x17cf, B:393:0x17d0, B:370:0x1727, B:365:0x16ef, B:367:0x16f5, B:368:0x171f, B:336:0x14e7, B:338:0x1503, B:339:0x1575, B:331:0x1496, B:333:0x14ab, B:334:0x14e0), top: B:809:0x13ce, outer: #21, inners: #7, #16, #27, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0394 A[PHI: r15
  0x0394: PHI (r15v55 int) = (r15v5 int), (r15v58 int) binds: [B:20:0x0197, B:5:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x169c A[Catch: all -> 0x17d1, TryCatch #38 {all -> 0x17d1, blocks: (B:320:0x13ce, B:322:0x13d4, B:323:0x1413, B:325:0x1420, B:327:0x1429, B:328:0x146b, B:351:0x1692, B:352:0x1696, B:354:0x169c, B:357:0x16b3, B:360:0x16c0, B:362:0x16c3, B:374:0x17a7, B:376:0x17ad, B:377:0x17ae, B:379:0x17b0, B:381:0x17b7, B:382:0x17b8, B:329:0x1476, B:341:0x1581, B:343:0x1587, B:344:0x15c9, B:346:0x15f3, B:347:0x1635, B:349:0x164b, B:350:0x168c, B:385:0x17be, B:387:0x17c5, B:388:0x17c6, B:390:0x17c8, B:392:0x17cf, B:393:0x17d0, B:370:0x1727, B:365:0x16ef, B:367:0x16f5, B:368:0x171f, B:336:0x14e7, B:338:0x1503, B:339:0x1575, B:331:0x1496, B:333:0x14ab, B:334:0x14e0), top: B:809:0x13ce, outer: #21, inners: #7, #16, #27, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x192b  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x1942 A[Catch: all -> 0x1a03, TryCatch #30 {all -> 0x1a03, blocks: (B:421:0x192d, B:423:0x1942, B:424:0x1971), top: B:795:0x192d, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x1984 A[Catch: all -> 0x19f9, TryCatch #24 {all -> 0x19f9, blocks: (B:425:0x1977, B:427:0x1984, B:428:0x19f1), top: B:784:0x1977, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x1b65  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x1bb5  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x1c6f  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x1e11  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x1ef9  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x2106  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x216d  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x21c0  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x229f  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x24ed  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x25fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x27e9 A[Catch: all -> 0x2c82, TryCatch #28 {all -> 0x2c82, blocks: (B:549:0x27e3, B:551:0x27e9, B:552:0x282e, B:554:0x2855, B:555:0x289a, B:557:0x28ae, B:559:0x28b7, B:560:0x28f9, B:592:0x2b43, B:593:0x2b47, B:595:0x2b4d, B:598:0x2b65, B:601:0x2b72, B:603:0x2b75, B:615:0x2c5c, B:617:0x2c62, B:618:0x2c63, B:620:0x2c65, B:622:0x2c6c, B:623:0x2c6d, B:562:0x2906, B:564:0x290a, B:568:0x2916, B:570:0x291c, B:582:0x2a2c, B:584:0x2a32, B:585:0x2a76, B:587:0x2aa0, B:588:0x2ae2, B:590:0x2af8, B:591:0x2b3d, B:625:0x2c6f, B:627:0x2c76, B:628:0x2c77, B:630:0x2c79, B:632:0x2c80, B:633:0x2c81, B:606:0x2ba1, B:608:0x2ba7, B:609:0x2bcf, B:577:0x298d, B:579:0x29ac, B:580:0x2a20, B:572:0x293c, B:574:0x2951, B:575:0x2986, B:611:0x2be1), top: B:792:0x27e3, outer: #21, inners: #4, #14, #22, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:554:0x2855 A[Catch: all -> 0x2c82, TryCatch #28 {all -> 0x2c82, blocks: (B:549:0x27e3, B:551:0x27e9, B:552:0x282e, B:554:0x2855, B:555:0x289a, B:557:0x28ae, B:559:0x28b7, B:560:0x28f9, B:592:0x2b43, B:593:0x2b47, B:595:0x2b4d, B:598:0x2b65, B:601:0x2b72, B:603:0x2b75, B:615:0x2c5c, B:617:0x2c62, B:618:0x2c63, B:620:0x2c65, B:622:0x2c6c, B:623:0x2c6d, B:562:0x2906, B:564:0x290a, B:568:0x2916, B:570:0x291c, B:582:0x2a2c, B:584:0x2a32, B:585:0x2a76, B:587:0x2aa0, B:588:0x2ae2, B:590:0x2af8, B:591:0x2b3d, B:625:0x2c6f, B:627:0x2c76, B:628:0x2c77, B:630:0x2c79, B:632:0x2c80, B:633:0x2c81, B:606:0x2ba1, B:608:0x2ba7, B:609:0x2bcf, B:577:0x298d, B:579:0x29ac, B:580:0x2a20, B:572:0x293c, B:574:0x2951, B:575:0x2986, B:611:0x2be1), top: B:792:0x27e3, outer: #21, inners: #4, #14, #22, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:557:0x28ae A[Catch: all -> 0x2c82, TryCatch #28 {all -> 0x2c82, blocks: (B:549:0x27e3, B:551:0x27e9, B:552:0x282e, B:554:0x2855, B:555:0x289a, B:557:0x28ae, B:559:0x28b7, B:560:0x28f9, B:592:0x2b43, B:593:0x2b47, B:595:0x2b4d, B:598:0x2b65, B:601:0x2b72, B:603:0x2b75, B:615:0x2c5c, B:617:0x2c62, B:618:0x2c63, B:620:0x2c65, B:622:0x2c6c, B:623:0x2c6d, B:562:0x2906, B:564:0x290a, B:568:0x2916, B:570:0x291c, B:582:0x2a2c, B:584:0x2a32, B:585:0x2a76, B:587:0x2aa0, B:588:0x2ae2, B:590:0x2af8, B:591:0x2b3d, B:625:0x2c6f, B:627:0x2c76, B:628:0x2c77, B:630:0x2c79, B:632:0x2c80, B:633:0x2c81, B:606:0x2ba1, B:608:0x2ba7, B:609:0x2bcf, B:577:0x298d, B:579:0x29ac, B:580:0x2a20, B:572:0x293c, B:574:0x2951, B:575:0x2986, B:611:0x2be1), top: B:792:0x27e3, outer: #21, inners: #4, #14, #22, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:561:0x2904  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x2b4d A[Catch: all -> 0x2c82, TryCatch #28 {all -> 0x2c82, blocks: (B:549:0x27e3, B:551:0x27e9, B:552:0x282e, B:554:0x2855, B:555:0x289a, B:557:0x28ae, B:559:0x28b7, B:560:0x28f9, B:592:0x2b43, B:593:0x2b47, B:595:0x2b4d, B:598:0x2b65, B:601:0x2b72, B:603:0x2b75, B:615:0x2c5c, B:617:0x2c62, B:618:0x2c63, B:620:0x2c65, B:622:0x2c6c, B:623:0x2c6d, B:562:0x2906, B:564:0x290a, B:568:0x2916, B:570:0x291c, B:582:0x2a2c, B:584:0x2a32, B:585:0x2a76, B:587:0x2aa0, B:588:0x2ae2, B:590:0x2af8, B:591:0x2b3d, B:625:0x2c6f, B:627:0x2c76, B:628:0x2c77, B:630:0x2c79, B:632:0x2c80, B:633:0x2c81, B:606:0x2ba1, B:608:0x2ba7, B:609:0x2bcf, B:577:0x298d, B:579:0x29ac, B:580:0x2a20, B:572:0x293c, B:574:0x2951, B:575:0x2986, B:611:0x2be1), top: B:792:0x27e3, outer: #21, inners: #4, #14, #22, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:648:0x2daf  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x2e00  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x2e59  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x3002  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x30db  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x3129  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x3177  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x016d A[PHI: r15
  0x016d: PHI (r15v5 int) = (r15v4 int), (r15v65 int) binds: [B:3:0x015d, B:5:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:710:0x3340  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x1908 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:851:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v31, types: [long] */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r28v11 */
    /* JADX WARN: Type inference failed for: r28v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v15 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v513 */
    /* JADX WARN: Type inference failed for: r4v514 */
    /* JADX WARN: Type inference failed for: r4v515 */
    /* JADX WARN: Type inference failed for: r4v532 */
    /* JADX WARN: Type inference failed for: r4v533 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.mpin.ui.activity.GetPinTokenActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit m10757$r8$lambda$EWnrKPdr_FKKLPdPNAqSUnG5PQ(GetPinTokenActivity getPinTokenActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnCreate$lambda$0 = onCreate$lambda$0(getPinTokenActivity, resource);
        int i4 = component1 + 59;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnCreate$lambda$0;
    }

    static {
        copy = 0;
        component3();
        component1();
        int i = getAsAtTimestamp + 39;
        copy = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
        int i4 = copydefault + 121;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component1() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        component3 = -890926436;
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
    }

    static void component3() {
        ShareDataUIState = new int[]{186322561, 159249744, 1095007812, 846647682, -1765555167, 1363332920, -741248707, -262110960, 1402350676, 2033208669, 1978616694, 927747922, 2012698078, 1318749072, -1370588317, -1025255837, 113638579, -344578657};
        component2 = -684099397404620982L;
    }
}
