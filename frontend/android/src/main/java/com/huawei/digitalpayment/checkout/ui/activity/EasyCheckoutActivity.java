package com.huawei.digitalpayment.checkout.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
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
import android.widget.ExpandableListView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.framework.utils.FileUtils;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.checkout.constant.SfcTradeTypeEnum;
import com.huawei.digitalpayment.checkout.constants.PayTradeTypeEnum;
import com.huawei.digitalpayment.checkout.manager.SfcEasyCheckoutManager;
import com.huawei.digitalpayment.checkout.manager.SfcPayManager;
import com.huawei.digitalpayment.checkout.model.response.CheckoutResp;
import com.huawei.digitalpayment.checkout.model.response.TransferResp;
import com.huawei.digitalpayment.checkout.ui.viewmodel.EasyCheckoutViewModel;
import com.huawei.digitalpayment.consumer.base.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.base.resp.ReferenceDataUtils;
import com.safaricom.mpesa.lifestyle.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.getActiveNotifications;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J9\u0010 \u001a\u00020\u001d2*\u0010!\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0#j\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b`\"H\u0002¢\u0006\u0002\u0010$J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020'H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\nX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/huawei/digitalpayment/checkout/ui/activity/EasyCheckoutActivity;", "Lcom/huawei/digitalpayment/consumer/baselib/PaymentTranslucentActivity;", "Lcom/huawei/digitalpayment/checkout/ui/viewmodel/EasyCheckoutViewModel;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "params", "", "", "businessType", "avatar", "buttonText", "pinTitle", "resIcon", "", "Ljava/lang/Integer;", "confirmIcon", "initiationType", KeysConstants.KEY_IS_FROM_NFC, "", "Ljava/lang/Boolean;", "authenticationType", "eventName", "nameResolutionParam", "biInitiationType", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "addNfcParams", "map", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "(Ljava/util/HashMap;)V", "checkout", "checkoutResp", "Lcom/huawei/digitalpayment/checkout/model/response/CheckoutResp;", "ConsumerCheckOutUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class EasyCheckoutActivity extends Hilt_EasyCheckoutActivity<EasyCheckoutViewModel> {
    public static final int $stable = 8;
    private static int ShareDataUIState;
    private static long component1;
    private static int[] component3;
    private static long copydefault;
    private final String TAG;
    private String authenticationType;
    private String avatar;
    private String biInitiationType;
    private String businessType;
    private String buttonText;
    private Integer confirmIcon;
    private String eventName;
    private String initiationType;
    private Boolean isFromNfc;
    private String nameResolutionParam;
    private Map<String, ? extends Object> params;
    private String pinTitle;
    private Integer resIcon;
    private static final byte[] $$c = {66, -42, -1, 80};
    private static final int $$f = 3;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {104, -2, Ascii.CAN, -74, -9, 5, 66, -54, -5, 3, Ascii.VT, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -50, -9, 5, 3, 1, 4, 67, -56, -2, -3, Ascii.DC2, -10, 7, Ascii.DLE, -8, 65, -73, 3, Ascii.DC2, -18, 10, -14, Ascii.DLE, 36, -26, -16, Ascii.SYN, Ascii.SI, Ascii.SI, -7, -30, Ascii.SYN, -16, Ascii.DC2, -9, 5, 0, 4, 4, Ascii.FF, -6, -3, 68, -9, 2, -6, Ascii.CAN, 2, 2, 8, -17, Ascii.FF, -5};
    private static final int $$n = FileUtils.JPEG_MARKER_EOI;
    private static final byte[] $$a = {99, TarHeader.LF_DIR, 44, 107, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 156;
    private static int getAsAtTimestamp = 0;
    private static int equals = 1;
    private static int component2 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(byte r6, byte r7, int r8) {
        /*
            int r7 = 107 - r7
            byte[] r0 = com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity.$$c
            int r8 = r8 * 2
            int r1 = 1 - r8
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2c
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity.$$i(byte, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(byte r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r0 = r6 + 4
            byte[] r1 = com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity.$$a
            int r7 = r7 + 4
            int r5 = r5 * 2
            int r5 = 103 - r5
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
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
            int r5 = r5 + r4
            int r5 = r5 + (-8)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity.d(byte, byte, byte, java.lang.Object[]):void");
    }

    private static void e(short s, short s2, short s3, Object[] objArr) {
        byte[] bArr = $$m;
        int i = s + 4;
        int i2 = 99 - (s3 * 16);
        byte[] bArr2 = new byte[s2 + 10];
        int i3 = s2 + 9;
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i2 = i3 + (-i) + 3;
            i = i;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i6 = i + 1;
            i4 = i5;
            i2 = i2 + (-bArr[i6]) + 3;
            i = i6;
        }
    }

    public static final void access$checkout(EasyCheckoutActivity easyCheckoutActivity, CheckoutResp checkoutResp) {
        int i = 2 % 2;
        int i2 = equals + 93;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        easyCheckoutActivity.checkout(checkoutResp);
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
    }

    public EasyCheckoutActivity() {
        String simpleName = Reflection.getOrCreateKotlinClass(EasyCheckoutActivity.class).getSimpleName();
        if (simpleName == null) {
            int i = equals + 61;
            getAsAtTimestamp = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
            simpleName = "";
        }
        this.TAG = simpleName;
        this.authenticationType = "";
        this.eventName = "";
        this.nameResolutionParam = "";
        this.biInitiationType = "";
        int i3 = equals + 21;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTAG() {
        int i = 2 % 2;
        int i2 = equals + 107;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.TAG;
        int i5 = i3 + 109;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
        return str;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component1 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $10 + 93;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i5 = $11 + 55;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component1)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 7032, (ViewConfiguration.getFadingEdgeLength() >> 16) + 34, (char) (Color.green(0) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    int packedPositionChild = 1389 - ExpandableListView.getPackedPositionChild(0L);
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 18;
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16828485);
                    byte b2 = (byte) ($$f - 3);
                    byte length = (byte) $$c.length;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionChild, jumpTapTimeout, cRgb, -1883291598, false, $$i(b2, length, (byte) (length - 4)), new Class[]{Object.class, Object.class});
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

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(copydefault ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i3 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(copydefault)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - KeyEvent.keyCodeFromString(""), 34 - TextUtils.indexOf("", ""), (char) (63440 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i3] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1391;
                    int i4 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17;
                    char cGreen = (char) (Color.green(0) + 51269);
                    byte b2 = (byte) ($$f - 3);
                    byte length = (byte) $$c.length;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(modifierMetaStateMask, i4, cGreen, -1883291598, false, $$i(b2, length, (byte) (length - 4)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i5 = $11 + 15;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i7 = $11 + 51;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$1", f = "EasyCheckoutActivity.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component2 = 1;
        final EasyCheckoutViewModel ShareDataUIState;
        int component3;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$1$1", f = "EasyCheckoutActivity.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component2 = 0;
            private static int component3 = 1;
            int ShareDataUIState;
            final EasyCheckoutViewModel component1;
            final EasyCheckoutActivity copydefault;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = component2 + 43;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.ShareDataUIState;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<EasyCheckoutViewModel.EasyCheckoutUiState> stateFlowUiState = this.component1.uiState();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Boolean>() {
                        private static int component1 = 1;
                        private static int component3;

                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            private static int component1 = 1;
                            private static int component3;
                            final FlowCollector ShareDataUIState;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$1$1$invokeSuspend$$inlined$map$1$2", f = "EasyCheckoutActivity.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                private static int ShareDataUIState = 0;
                                private static int copydefault = 1;
                                Object L$0;
                                int label;
                                Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override
                                public final Object invokeSuspend(Object obj) {
                                    int i = 2 % 2;
                                    int i2 = ShareDataUIState + 19;
                                    copydefault = i2 % 128;
                                    int i3 = i2 % 2;
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    if (i3 != 0) {
                                        return anonymousClass2.emit(null, this);
                                    }
                                    int i4 = 43 / 0;
                                    return anonymousClass2.emit(null, this);
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
                            @Override
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                                /*
                                    r6 = this;
                                    r0 = 2
                                    int r1 = r0 % r0
                                    int r1 = com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1
                                    int r1 = r1 + 35
                                    int r2 = r1 % 128
                                    com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3 = r2
                                    int r1 = r1 % r0
                                    r2 = 0
                                    if (r1 != 0) goto L74
                                    boolean r1 = r8 instanceof com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r1 == 0) goto L23
                                    r1 = r8
                                    com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$1$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                    int r3 = r1.label
                                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r3 = r3 & r4
                                    if (r3 == 0) goto L23
                                    int r8 = r1.label
                                    int r8 = r8 + r4
                                    r1.label = r8
                                    goto L28
                                L23:
                                    com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$1$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$1$1$invokeSuspend$$inlined$map$1$2$1
                                    r1.<init>(r8)
                                L28:
                                    java.lang.Object r8 = r1.result
                                    java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r4 = r1.label
                                    r5 = 1
                                    if (r4 == 0) goto L41
                                    if (r4 != r5) goto L39
                                    kotlin.ResultKt.throwOnFailure(r8)
                                    goto L68
                                L39:
                                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                                    r7.<init>(r8)
                                    throw r7
                                L41:
                                    kotlin.ResultKt.throwOnFailure(r8)
                                    kotlinx.coroutines.flow.FlowCollector r8 = r6.ShareDataUIState
                                    r4 = r1
                                    kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                                    com.huawei.digitalpayment.checkout.ui.viewmodel.EasyCheckoutViewModel$EasyCheckoutUiState r7 = (com.huawei.digitalpayment.checkout.ui.viewmodel.EasyCheckoutViewModel.EasyCheckoutUiState) r7
                                    boolean r7 = r7.getLoading()
                                    java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
                                    r1.label = r5
                                    java.lang.Object r7 = r8.emit(r7, r1)
                                    if (r7 != r3) goto L68
                                    int r7 = com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1
                                    int r7 = r7 + 55
                                    int r8 = r7 % 128
                                    com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3 = r8
                                    int r7 = r7 % r0
                                    if (r7 != 0) goto L67
                                    return r3
                                L67:
                                    throw r2
                                L68:
                                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                                    int r8 = com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                    int r8 = r8 + 15
                                    int r1 = r8 % 128
                                    com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1 = r1
                                    int r8 = r8 % r0
                                    return r7
                                L74:
                                    boolean r7 = r8 instanceof com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    throw r2
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.ShareDataUIState = flowCollector;
                            }
                        }

                        @Override
                        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                            int i5 = 2 % 2;
                            Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                            if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                int i6 = component3 + 107;
                                component1 = i6 % 128;
                                int i7 = i6 % 2;
                                return objCollect;
                            }
                            Unit unit = Unit.INSTANCE;
                            int i8 = component3 + 107;
                            component1 = i8 % 128;
                            int i9 = i8 % 2;
                            return unit;
                        }
                    });
                    final EasyCheckoutActivity easyCheckoutActivity = this.copydefault;
                    this.ShareDataUIState = 1;
                    if (flowDistinctUntilChanged.collect(new FlowCollector() {
                        private static int ShareDataUIState = 0;
                        private static int component1 = 1;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i5 = 2 % 2;
                            int i6 = component1 + 75;
                            ShareDataUIState = i6 % 128;
                            int i7 = i6 % 2;
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            if (i7 == 0) {
                                return component2(zBooleanValue, continuation);
                            }
                            component2(zBooleanValue, continuation);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }

                        public final Object component2(boolean z, Continuation<? super Unit> continuation) {
                            int i5 = 2 % 2;
                            if (z) {
                                int i6 = component1 + 21;
                                ShareDataUIState = i6 % 128;
                                if (i6 % 2 != 0) {
                                    DialogManager.showLoading(easyCheckoutActivity);
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                DialogManager.showLoading(easyCheckoutActivity);
                            } else {
                                DialogManager.hideLoading(easyCheckoutActivity);
                                int i7 = component1 + 87;
                                ShareDataUIState = i7 % 128;
                                int i8 = i7 % 2;
                            }
                            return Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        int i5 = component2 + 7;
                        component3 = i5 % 128;
                        int i6 = i5 % 2;
                        return coroutine_suspended;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = component3 + 55;
                    component2 = i7 % 128;
                    int i8 = i7 % 2;
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EasyCheckoutViewModel easyCheckoutViewModel, EasyCheckoutActivity easyCheckoutActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.component1 = easyCheckoutViewModel;
                this.copydefault = easyCheckoutActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.component1, this.copydefault, continuation);
                int i2 = component2 + 79;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass1;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 81;
                component3 = i2 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 == 0) {
                    component3(coroutineScope2, continuation2);
                    throw null;
                }
                Object objComponent3 = component3(coroutineScope2, continuation2);
                int i3 = component3 + 51;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return objComponent3;
            }

            public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 51;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = component2 + 3;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 91;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component3;
            if (i4 != 0) {
                int i5 = component1 + 111;
                int i6 = i5 % 128;
                component2 = i6;
                int i7 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i6 + 81;
                component1 = i8 % 128;
                if (i8 % 2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    int i9 = 41 / 0;
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                int i10 = component2 + 33;
                component1 = i10 % 128;
                int i11 = i10 % 2;
            } else {
                ResultKt.throwOnFailure(obj);
                this.component3 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(EasyCheckoutActivity.this, Lifecycle.State.STARTED, new AnonymousClass1(this.ShareDataUIState, EasyCheckoutActivity.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component1(EasyCheckoutViewModel easyCheckoutViewModel, Continuation<? super component1> continuation) {
            super(2, continuation);
            this.ShareDataUIState = easyCheckoutViewModel;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = EasyCheckoutActivity.this.new component1(this.ShareDataUIState, continuation);
            int i2 = component1 + 15;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return component1Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 123;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(coroutineScope, continuation);
            int i4 = component2 + 73;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 41;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            component1 component1Var = (component1) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return component1Var.invokeSuspend(unit);
            }
            component1Var.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$2", f = "EasyCheckoutActivity.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int component1;
        final EasyCheckoutViewModel component2;
        private static final byte[] $$c = {79, 9, 94, -7};
        private static final int $$f = 57;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {105, -91, -115, Ascii.US, -18, -4, 57, -63, -14, -6, 2, -11, 1, TarHeader.LF_LINK, -57, -19, 4, -20, -3, 0, -1, TarHeader.LF_NORMAL, -63, -12, -12, 63, -57, -26, -5, 6, TarHeader.LF_BLK, -45, -36, 8, -19, Ascii.SUB, -25, -4, -18, -13, Ascii.VT, -19, Ascii.VT, -7, -16, 1, 17, -39, -11, 5, -3, -9, -2, -5, Ascii.EM, -57, Ascii.SI, -8, -17, -10, 5, -12, -5, -27, 1, -23, 7, Ascii.ESC, -35, -25, 13, 6, 6, -16, -39, 13, -25, 9};
        private static final int $$e = 250;
        private static final byte[] $$a = {94, -53, Ascii.FS, -60, Ascii.FS, Ascii.SO, 19, Ascii.SI, Ascii.SI, 7, Ascii.EM, Ascii.SYN, -49, Ascii.FS, 17, Ascii.EM, -5, 17, 17, Ascii.VT, 36, 7, Ascii.CAN, 37, 9, 33, 3, -17, 45, 35, -3, 4, 4, Ascii.SUB, TarHeader.LF_LINK, -3, 35, 1};
        private static final int $$b = 177;
        private static int component3 = 0;
        private static int getRequestBeneficiariesState = 1;
        private static int[] ShareDataUIState = {1442865350, -1794125303, -14541385, -1535613353, 954854091, -1198663078, -744848050, -1405750129, -379490203, -1543692681, 1218910803, 122858606, 2008141778, -1715786815, -1123946382, -2075554000, 1999508903, 1829229597};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(byte r5, byte r6, int r7) {
            /*
                int r7 = r7 * 3
                int r7 = r7 + 4
                byte[] r0 = com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity.copydefault.$$c
                int r5 = r5 + 104
                int r6 = r6 * 4
                int r1 = r6 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L14
                r4 = r6
                r3 = r2
                goto L24
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r5
                r1[r3] = r4
                if (r3 != r6) goto L20
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L20:
                int r3 = r3 + 1
                r4 = r0[r7]
            L24:
                int r5 = r5 + r4
                int r7 = r7 + 1
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity.copydefault.$$g(byte, byte, int):java.lang.String");
        }

        private static void a(byte b2, short s, short s2, Object[] objArr) {
            int i = b2 + 4;
            int i2 = 99 - (s2 * 16);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[16 - s];
            int i3 = 15 - s;
            int i4 = -1;
            if (bArr == null) {
                i4 = -1;
                i2 = (i2 + i) - 16;
                i = i;
            }
            while (true) {
                int i5 = i4 + 1;
                int i6 = i + 1;
                bArr2[i5] = (byte) i2;
                if (i5 == i3) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i4 = i5;
                i2 = (i2 + bArr[i6]) - 16;
                i = i6;
            }
        }

        private static void c(int i, short s, byte b2, Object[] objArr) {
            int i2 = 62 - (i * 59);
            byte[] bArr = $$d;
            int i3 = b2 * 44;
            int i4 = (s * 16) + 83;
            byte[] bArr2 = new byte[i3 + 16];
            int i5 = i3 + 15;
            int i6 = -1;
            if (bArr == null) {
                i6 = -1;
                i4 = (i5 + (-i2)) - 6;
                i2 = i2;
            }
            while (true) {
                int i7 = i6 + 1;
                bArr2[i7] = (byte) i4;
                if (i7 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i8 = i2 + 1;
                i6 = i7;
                i4 = (i4 + (-bArr[i8])) - 6;
                i2 = i8;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$2$1", f = "EasyCheckoutActivity.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 1;
            private static int component1;
            int component2;
            final EasyCheckoutViewModel component3;
            final EasyCheckoutActivity copydefault;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.component2;
                if (i2 != 0) {
                    int i3 = ShareDataUIState;
                    int i4 = i3 + 35;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0 ? i2 != 1 : i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = i3 + 63;
                    component1 = i5 % 128;
                    if (i5 % 2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        throw null;
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<EasyCheckoutViewModel.EasyCheckoutUiState> stateFlowUiState = this.component3.uiState();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<BaseException>() {
                        private static int component1 = 0;
                        private static int component2 = 1;

                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            private static int component3 = 1;
                            private static int copydefault;
                            final FlowCollector component1;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$2$1$invokeSuspend$$inlined$map$1$2", f = "EasyCheckoutActivity.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                private static int component2 = 1;
                                private static int copydefault;
                                Object L$0;
                                int label;
                                Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override
                                public final Object invokeSuspend(Object obj) {
                                    int i = 2 % 2;
                                    int i2 = component2 + 117;
                                    copydefault = i2 % 128;
                                    int i3 = i2 % 2;
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    AnonymousClass1 anonymousClass1 = this;
                                    if (i3 == 0) {
                                        return anonymousClass2.emit(null, anonymousClass1);
                                    }
                                    anonymousClass2.emit(null, anonymousClass1);
                                    throw null;
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
                            /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
                            @Override
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                                /*
                                    r5 = this;
                                    r0 = 2
                                    int r1 = r0 % r0
                                    int r1 = com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                    int r1 = r1 + 83
                                    int r2 = r1 % 128
                                    com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r2
                                    int r1 = r1 % r0
                                    r2 = 1
                                    if (r1 == 0) goto L19
                                    boolean r1 = r7 instanceof com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    r3 = 38
                                    int r3 = r3 / 0
                                    r1 = r1 ^ r2
                                    if (r1 == 0) goto L1d
                                    goto L36
                                L19:
                                    boolean r1 = r7 instanceof com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r1 == 0) goto L36
                                L1d:
                                    r1 = r7
                                    com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$2$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                    int r3 = r1.label
                                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r3 = r3 & r4
                                    if (r3 == 0) goto L36
                                    int r7 = com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault
                                    int r7 = r7 + 13
                                    int r3 = r7 % 128
                                    com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3 = r3
                                    int r7 = r7 % r0
                                    int r7 = r1.label
                                    int r7 = r7 + r4
                                    r1.label = r7
                                    goto L43
                                L36:
                                    com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$2$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$2$1$invokeSuspend$$inlined$map$1$2$1
                                    r1.<init>(r7)
                                    int r7 = com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault
                                    int r7 = r7 + r2
                                    int r3 = r7 % 128
                                    com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3 = r3
                                    int r7 = r7 % r0
                                L43:
                                    java.lang.Object r7 = r1.result
                                    java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r4 = r1.label
                                    if (r4 == 0) goto L69
                                    int r6 = com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault
                                    int r6 = r6 + 29
                                    int r1 = r6 % 128
                                    com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3 = r1
                                    int r6 = r6 % r0
                                    if (r6 != 0) goto L5b
                                    if (r4 != r2) goto L61
                                    goto L5d
                                L5b:
                                    if (r4 != r2) goto L61
                                L5d:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    goto L8d
                                L61:
                                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                    r6.<init>(r7)
                                    throw r6
                                L69:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    kotlinx.coroutines.flow.FlowCollector r7 = r5.component1
                                    r4 = r1
                                    kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                                    com.huawei.digitalpayment.checkout.ui.viewmodel.EasyCheckoutViewModel$EasyCheckoutUiState r6 = (com.huawei.digitalpayment.checkout.ui.viewmodel.EasyCheckoutViewModel.EasyCheckoutUiState) r6
                                    com.huawei.common.exception.BaseException r6 = r6.getException()
                                    r1.label = r2
                                    java.lang.Object r6 = r7.emit(r6, r1)
                                    if (r6 != r3) goto L8d
                                    int r6 = com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault
                                    int r6 = r6 + 63
                                    int r7 = r6 % 128
                                    com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3 = r7
                                    int r6 = r6 % r0
                                    if (r6 == 0) goto L8b
                                    return r3
                                L8b:
                                    r6 = 0
                                    throw r6
                                L8d:
                                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                    return r6
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.component1 = flowCollector;
                            }
                        }

                        @Override
                        public Object collect(FlowCollector<? super BaseException> flowCollector, Continuation continuation) {
                            int i6 = 2 % 2;
                            Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                            if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                int i7 = component2 + 71;
                                component1 = i7 % 128;
                                int i8 = i7 % 2;
                                return objCollect;
                            }
                            Unit unit = Unit.INSTANCE;
                            int i9 = component2 + 75;
                            component1 = i9 % 128;
                            if (i9 % 2 != 0) {
                                int i10 = 62 / 0;
                            }
                            return unit;
                        }
                    });
                    final EasyCheckoutActivity easyCheckoutActivity = this.copydefault;
                    this.component2 = 1;
                    if (flowDistinctUntilChanged.collect(new FlowCollector() {
                        private static int component1 = 1;
                        private static int component2;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i6 = 2 % 2;
                            int i7 = component1 + 73;
                            component2 = i7 % 128;
                            int i8 = i7 % 2;
                            Object objComponent2 = component2((BaseException) obj2, continuation);
                            int i9 = component1 + 63;
                            component2 = i9 % 128;
                            if (i9 % 2 == 0) {
                                return objComponent2;
                            }
                            throw null;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object component2(com.huawei.common.exception.BaseException r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                            /*
                                r2 = this;
                                r4 = 2
                                int r0 = r4 % r4
                                int r0 = com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity.copydefault.AnonymousClass1.AnonymousClass4.component1
                                int r0 = r0 + 53
                                int r1 = r0 % 128
                                com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity.copydefault.AnonymousClass1.AnonymousClass4.component2 = r1
                                int r0 = r0 % r4
                                if (r0 == 0) goto L15
                                r0 = 84
                                int r0 = r0 / 0
                                if (r3 == 0) goto L3f
                                goto L17
                            L15:
                                if (r3 == 0) goto L3f
                            L17:
                                com.huawei.digitalpayment.checkout.manager.SfcEasyCheckoutManager r0 = com.huawei.digitalpayment.checkout.manager.SfcEasyCheckoutManager.INSTANCE
                                com.huawei.common.listener.ApiCallback r0 = r0.getPayCallback()
                                if (r0 == 0) goto L3a
                                int r0 = com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity.copydefault.AnonymousClass1.AnonymousClass4.component2
                                int r0 = r0 + 103
                                int r1 = r0 % 128
                                com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity.copydefault.AnonymousClass1.AnonymousClass4.component1 = r1
                                int r0 = r0 % r4
                                if (r0 == 0) goto L30
                                com.huawei.digitalpayment.checkout.manager.SfcEasyCheckoutManager r4 = com.huawei.digitalpayment.checkout.manager.SfcEasyCheckoutManager.INSTANCE
                                r4.payFailed(r3)
                                goto L3a
                            L30:
                                com.huawei.digitalpayment.checkout.manager.SfcEasyCheckoutManager r4 = com.huawei.digitalpayment.checkout.manager.SfcEasyCheckoutManager.INSTANCE
                                r4.payFailed(r3)
                                r3 = 0
                                r3.hashCode()
                                throw r3
                            L3a:
                                com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity r3 = r1
                                r3.finish()
                            L3f:
                                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                                return r3
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity.copydefault.AnonymousClass1.AnonymousClass4.component2(com.huawei.common.exception.BaseException, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }, this) == coroutine_suspended) {
                        int i6 = ShareDataUIState + 25;
                        component1 = i6 % 128;
                        if (i6 % 2 == 0) {
                            return coroutine_suspended;
                        }
                        throw null;
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i7 = component1 + 17;
                ShareDataUIState = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 80 / 0;
                }
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EasyCheckoutViewModel easyCheckoutViewModel, EasyCheckoutActivity easyCheckoutActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.component3 = easyCheckoutViewModel;
                this.copydefault = easyCheckoutActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.component3, this.copydefault, continuation);
                int i2 = ShareDataUIState + 97;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass1;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 23;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent3 = component3(coroutineScope, continuation);
                if (i3 != 0) {
                    int i4 = 87 / 0;
                }
                return objComponent3;
            }

            public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component1 + 65;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = ShareDataUIState + 9;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }
        }

        private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
            int[] iArr2;
            int i2 = 2;
            int i3 = 2 % 2;
            getActiveNotifications getactivenotifications = new getActiveNotifications();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = ShareDataUIState;
            int i4 = 684241640;
            float f = 0.0f;
            int i5 = 1;
            int i6 = 0;
            if (iArr3 != null) {
                int length = iArr3.length;
                int[] iArr4 = new int[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $11 + 13;
                    $10 = i8 % 128;
                    int i9 = i8 % i2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                        if (objCopydefault == null) {
                            int i10 = (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 4391;
                            int i11 = (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 36;
                            char c2 = (char) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1));
                            byte b2 = (byte) i2;
                            byte b3 = (byte) (b2 - 2);
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i10, i11, c2, -309236339, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr4[i7] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                        i7++;
                        i2 = 2;
                        i4 = 684241640;
                        f = 0.0f;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr3 = iArr4;
            }
            int length2 = iArr3.length;
            int[] iArr5 = new int[length2];
            int[] iArr6 = ShareDataUIState;
            if (iArr6 != null) {
                int length3 = iArr6.length;
                int[] iArr7 = new int[length3];
                int i12 = $11 + 121;
                $10 = i12 % 128;
                int i13 = 2;
                int i14 = i12 % 2;
                int i15 = 0;
                while (i15 < length3) {
                    int i16 = $10 + 29;
                    $11 = i16 % 128;
                    int i17 = i16 % i13;
                    try {
                        Object[] objArr3 = new Object[i5];
                        objArr3[i6] = Integer.valueOf(iArr6[i15]);
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault2 == null) {
                            int iIndexOf = 4391 - TextUtils.indexOf("", "", i6, i6);
                            int iLastIndexOf = 36 - TextUtils.lastIndexOf("", '0', i6, i6);
                            char cRgb = (char) (Color.rgb(i6, i6, i6) + 16777216);
                            byte b4 = (byte) 2;
                            byte b5 = (byte) (b4 - 2);
                            iArr2 = iArr6;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iLastIndexOf, cRgb, -309236339, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                        } else {
                            iArr2 = iArr6;
                        }
                        iArr7[i15] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                        i15++;
                        iArr6 = iArr2;
                        i5 = 1;
                        i6 = 0;
                        i13 = 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                iArr6 = iArr7;
            }
            int i18 = i6;
            System.arraycopy(iArr6, i18, iArr5, i18, length2);
            getactivenotifications.component1 = i18;
            while (getactivenotifications.component1 < iArr.length) {
                cArr[i18] = (char) (iArr[getactivenotifications.component1] >> 16);
                cArr[1] = (char) iArr[getactivenotifications.component1];
                cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
                cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
                getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
                getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
                getActiveNotifications.component2(iArr5);
                int i19 = 0;
                while (i19 < 16) {
                    int i20 = $10 + 107;
                    $11 = i20 % 128;
                    int i21 = i20 % 2;
                    getactivenotifications.ShareDataUIState ^= iArr5[i19];
                    Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2968 - (ViewConfiguration.getKeyRepeatDelay() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 16, (char) (49871 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 462826032, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue;
                    i19++;
                    int i22 = $10 + 9;
                    $11 = i22 % 128;
                    int i23 = i22 % 2;
                }
                int i24 = getactivenotifications.ShareDataUIState;
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = i24;
                getactivenotifications.component2 ^= iArr5[16];
                getactivenotifications.ShareDataUIState ^= iArr5[17];
                int i25 = getactivenotifications.ShareDataUIState;
                int i26 = getactivenotifications.component2;
                cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
                cArr[1] = (char) getactivenotifications.ShareDataUIState;
                cArr[2] = (char) (getactivenotifications.component2 >>> 16);
                cArr[3] = (char) getactivenotifications.component2;
                getActiveNotifications.component2(iArr5);
                cArr2[getactivenotifications.component1 * 2] = cArr[0];
                cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
                cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
                cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
                Object[] objArr5 = {getactivenotifications, getactivenotifications};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 3;
                    byte b9 = (byte) (b8 - 3);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 2944, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25, (char) (TextUtils.getOffsetAfter("", 0) + 27637), -1616366948, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                i18 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component1;
            if (i2 != 0) {
                int i3 = component3 + 43;
                getRequestBeneficiariesState = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Object obj2 = null;
                this.component1 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(EasyCheckoutActivity.this, Lifecycle.State.STARTED, new AnonymousClass1(this.component2, EasyCheckoutActivity.this, null), this) == coroutine_suspended) {
                    int i5 = getRequestBeneficiariesState + 81;
                    component3 = i5 % 128;
                    if (i5 % 2 == 0) {
                        return coroutine_suspended;
                    }
                    obj2.hashCode();
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Continuation<Unit> continuationCreate = create(coroutineScope, continuation);
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-411944782);
            if (objCopydefault == null) {
                int iIndexOf = 1114 - TextUtils.indexOf((CharSequence) "", '0');
                int defaultSize = 22 - View.getDefaultSize(0, 0);
                char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte b2 = $$a[37];
                byte b3 = (byte) (-b2);
                Object[] objArr2 = new Object[1];
                a(b3, (byte) (b3 & 6), (byte) (b2 - 1), objArr2);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, defaultSize, scrollDefaultDelay, 573302743, false, (String) objArr2[0], null);
            }
            Object obj = null;
            long j = ((Field) objCopydefault).getLong(null);
            Object[] objArr3 = new Object[1];
            b(View.resolveSize(0, 0) + 22, new int[]{-1325441687, 1886862172, -1490431605, -1165732215, -100120201, 74548454, -1783746253, 1738048930, -1604179502, -855379070, 1833462304, -981266801}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((ViewConfiguration.getLongPressTimeout() >> 16) + 15, new int[]{407791921, 869307113, 404496660, 1121022109, 2124450273, 133099417, -513737371, -1443955579}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-8046594);
            if (objCopydefault2 == null) {
                int scrollDefaultDelay2 = 1115 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int iCombineMeasuredStates = 22 - View.combineMeasuredStates(0, 0);
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte b4 = (byte) (-$$a[16]);
                Object[] objArr5 = new Object[1];
                a((byte) (r16[24] - 1), b4, (byte) (b4 - 5), objArr5);
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay2, iCombineMeasuredStates, scrollBarFadeDuration, 987555995, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-84684464);
                if (objCopydefault3 == null) {
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1115;
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 22;
                    char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                    byte[] bArr = $$a;
                    byte b5 = (byte) (bArr[6] - 1);
                    byte b6 = bArr[37];
                    Object[] objArr6 = new Object[1];
                    a(b5, (byte) (b6 - 1), b6, objArr6);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionGroup, pressedStateDuration, edgeSlop, 1068109365, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i2 = (-2035426088) + (((~((-654954145) | startUptimeMillis)) | 604505600) * 345) + (((~((-654954145) | (~startUptimeMillis))) | (-1066262257)) * 345) + ((~(startUptimeMillis | (-604505601))) * 345) + 85428036;
                int i3 = (i2 << 13) ^ i2;
                int i4 = i3 ^ (i3 >>> 17);
                ((int[]) objArr[0])[0] = i4 ^ (i4 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                b(27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new int[]{-1325441687, 1886862172, -1490431605, -1165732215, -1308674974, 978037563, -140277664, -1932054193, 1974777267, 708295699, 750775105, -899893415, 1349314612, 1772300230}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                b(18 - (ViewConfiguration.getFadingEdgeLength() >> 16), new int[]{-1738993202, -1822438931, 325701563, -562130847, 1967571444, 2099334539, 35072132, -1463957196, -1193299677, -819892772}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i5 = getRequestBeneficiariesState + 97;
                    component3 = i5 % 128;
                    if (i5 % 2 != 0) {
                        boolean z = applicationContext instanceof ContextWrapper;
                        obj.hashCode();
                        throw null;
                    }
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                b(16 - (ViewConfiguration.getPressedStateDuration() >> 16), new int[]{-1278293357, 249211669, -791590378, -2043102186, 1874445075, 1974960286, 647040979, 53042719}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                b((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, new int[]{1103382700, -1499246084, -653143026, -753009321, 1445658718, 1724116784, -756005335, -1867840879}, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i6 = getRequestBeneficiariesState + 27;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 1, 85428036};
                    byte[] bArr2 = $$d;
                    byte b7 = bArr2[12];
                    byte b8 = b7;
                    Object[] objArr13 = new Object[1];
                    c(b7, b8, b8, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b9 = bArr2[19];
                    byte b10 = b9;
                    Object[] objArr14 = new Object[1];
                    c(b9, b10, b10, objArr14);
                    objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-84684464);
                        if (objCopydefault4 == null) {
                            int deadChar = KeyEvent.getDeadChar(0, 0) + 1115;
                            int gidForName = Process.getGidForName("") + 23;
                            char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            byte[] bArr3 = $$a;
                            byte b11 = (byte) (bArr3[6] - 1);
                            byte b12 = bArr3[37];
                            Object[] objArr15 = new Object[1];
                            a(b11, (byte) (b12 - 1), b12, objArr15);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(deadChar, gidForName, edgeSlop2, 1068109365, false, (String) objArr15[0], null);
                        }
                        ((Field) objCopydefault4).set(null, objArr);
                        try {
                            Object[] objArr16 = new Object[1];
                            b(Color.argb(0, 0, 0, 0) + 22, new int[]{-1325441687, 1886862172, -1490431605, -1165732215, -100120201, 74548454, -1783746253, 1738048930, -1604179502, -855379070, 1833462304, -981266801}, objArr16);
                            Class<?> cls5 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            b(16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new int[]{407791921, 869307113, 404496660, 1121022109, 2124450273, 133099417, -513737371, -1443955579}, objArr17);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-8046594);
                            if (objCopydefault5 == null) {
                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1116;
                                int defaultSize2 = View.getDefaultSize(0, 0) + 22;
                                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                                byte[] bArr4 = $$a;
                                byte b13 = (byte) (bArr4[24] - 1);
                                byte b14 = (byte) (-bArr4[16]);
                                Object[] objArr18 = new Object[1];
                                a(b13, b14, (byte) (b14 - 5), objArr18);
                                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf2, defaultSize2, offsetBefore, 987555995, false, (String) objArr18[0], null);
                            }
                            ((Field) objCopydefault5).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-411944782);
                            if (objCopydefault6 == null) {
                                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1115;
                                int offsetBefore2 = 22 - TextUtils.getOffsetBefore("", 0);
                                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                                byte b15 = $$a[37];
                                byte b16 = (byte) (-b15);
                                Object[] objArr19 = new Object[1];
                                a(b16, (byte) (b16 & 6), (byte) (b15 - 1), objArr19);
                                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(offsetAfter, offsetBefore2, cLastIndexOf, 573302743, false, (String) objArr19[0], null);
                            }
                            ((Field) objCopydefault6).set(null, lValueOf2);
                            int i8 = getRequestBeneficiariesState + 105;
                            component3 = i8 % 128;
                            int i9 = i8 % 2;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i10 = ((int[]) objArr[1])[0];
            int i11 = ((int[]) objArr[2])[0];
            if (i11 == i10) {
                int i12 = ((int[]) objArr[0])[0];
                Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i13 = ~iIdentityHashCode;
                int i14 = i12 + (-1402076361) + (((~((-701371501) | i13)) | 557973516) * 184) + ((iIdentityHashCode | (-1037966973)) * (-184)) + ((~((-894568989) | i13)) * 184);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr20[0])[0] = i16 ^ (i16 << 5);
                int i17 = ((int[]) objArr20[0])[0];
                Object[] objArr21 = {new int[1], new int[]{((int[]) objArr20[1])[0]}, new int[]{((int[]) objArr20[2])[0]}, (String[]) objArr20[3]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i18 = (~(573958329 | iIdentityHashCode2)) | 227022400;
                int i19 = ~((~iIdentityHashCode2) | (-33824913));
                int i20 = i17 + (-480456913) + ((i18 | i19) * (-470)) + (((~(iIdentityHashCode2 | 800980729)) | i19) * 470);
                int i21 = (i20 << 13) ^ i20;
                int i22 = i21 ^ (i21 >>> 17);
                ((int[]) objArr21[0])[0] = i22 ^ (i22 << 5);
                int i23 = getRequestBeneficiariesState + 109;
                component3 = i23 % 128;
                int i24 = i23 % 2;
                return ((copydefault) continuationCreate).invokeSuspend(Unit.INSTANCE);
            }
            long j2 = -1;
            long j3 = ((long) (i10 ^ i11)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 5) << 32) | (j4 - ((j4 >> 63) << 32));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6618 - View.MeasureSpec.makeMeasureSpec(0, 0), 42 - Color.red(0), (char) View.combineMeasuredStates(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                Object[] objArr22 = {1748679420, Long.valueOf(j5), new ArrayList(), null, false, false};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 6563, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 56, (char) (Color.rgb(0, 0, 0) + 16777216), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault8).invoke(objInvoke, objArr22);
                int i25 = ((int[]) objArr[0])[0];
                Object[] objArr23 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i26 = i25 + 1833328127 + (((~((-336068657) | (~elapsedCpuTime))) | (~((-142871169) | elapsedCpuTime))) * (-272)) + (((~((-912815219) | elapsedCpuTime)) | 576746562) * (-272)) + (((~(elapsedCpuTime | 912815218)) | (-719617731)) * 272);
                int i27 = (i26 << 13) ^ i26;
                int i28 = i27 ^ (i27 >>> 17);
                ((int[]) objArr23[0])[0] = i28 ^ (i28 << 5);
                throw new RuntimeException(String.valueOf(i11));
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        copydefault(EasyCheckoutViewModel easyCheckoutViewModel, Continuation<? super copydefault> continuation) {
            super(2, continuation);
            this.component2 = easyCheckoutViewModel;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = EasyCheckoutActivity.this.new copydefault(this.component2, continuation);
            int i2 = getRequestBeneficiariesState + 77;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return copydefaultVar;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 15;
            component3 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                copydefault(coroutineScope2, continuation2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objCopydefault = copydefault(coroutineScope2, continuation2);
            int i3 = component3 + 3;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            return objCopydefault;
        }
    }

    private static void c(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int[] iArr2;
        char c2 = 2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = component3;
        int i4 = 684241640;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $10 + 23;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i9])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault == null) {
                        byte b2 = (byte) (-$$c[c2]);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4391 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 37 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), -309236339, false, $$i((byte) ($$f - 3), b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i9] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i9++;
                    c2 = 2;
                    i4 = 684241640;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = component3;
        if (iArr6 != null) {
            int i10 = $11 + 35;
            $10 = i10 % 128;
            int i11 = 2;
            int i12 = i10 % 2;
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $10 + 17;
                $11 = i14 % 128;
                int i15 = i14 % i11;
                Object[] objArr3 = new Object[i5];
                objArr3[i6] = Integer.valueOf(iArr6[i13]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) (-$$c[2]);
                    iArr2 = iArr6;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', i6, i6) + 4392, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 37, (char) ((-1) - Process.getGidForName("")), -309236339, false, $$i((byte) ($$f - 3), b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i13] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i13++;
                iArr6 = iArr2;
                i5 = 1;
                i6 = 0;
                i11 = 2;
            }
            i2 = i6;
            iArr6 = iArr7;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length2);
        getactivenotifications.component1 = i2;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[i2] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                int i18 = $10 + 99;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    getactivenotifications.ShareDataUIState ^= iArr5[i16];
                    Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault3 == null) {
                        int iKeyCodeFromString = 2968 - KeyEvent.keyCodeFromString("");
                        int i19 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 16;
                        char cResolveSizeAndState = (char) (49871 - View.resolveSizeAndState(0, 0, 0));
                        int i20 = $$f;
                        byte b4 = (byte) (i20 - 3);
                        byte b5 = (byte) i20;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, i19, cResolveSizeAndState, 462826032, false, $$i(b4, b5, (byte) (b5 - 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue;
                    i16 += 61;
                } else {
                    getactivenotifications.ShareDataUIState ^= iArr5[i16];
                    try {
                        Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                        if (objCopydefault4 == null) {
                            int iGreen = 2968 - Color.green(0);
                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 16;
                            char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 49871);
                            int i21 = $$f;
                            byte b6 = (byte) (i21 - 3);
                            byte b7 = (byte) i21;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iGreen, threadPriority, absoluteGravity, 462826032, false, $$i(b6, b7, (byte) (b7 - 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                        getactivenotifications.component2 = iIntValue2;
                        i16++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            int i22 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i22;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i23 = getactivenotifications.ShareDataUIState;
            int i24 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr6 = {getactivenotifications, getactivenotifications};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault5 == null) {
                byte b8 = (byte) ($$f - 3);
                byte b9 = b8;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.getCapsMode("", 0, 0) + 24, (char) (27637 - TextUtils.getCapsMode("", 0, 0)), -1616366948, false, $$i(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
            i2 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i25 = $11 + 103;
        $10 = i25 % 128;
        if (i25 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$3", f = "EasyCheckoutActivity.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component1;
        final EasyCheckoutViewModel component2;
        int component3;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$3$1", f = "EasyCheckoutActivity.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 1;
            private static int component2;
            final EasyCheckoutViewModel component1;
            int component3;
            final EasyCheckoutActivity copydefault;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.component3;
                if (i2 != 0) {
                    int i3 = ShareDataUIState + 13;
                    component2 = i3 % 128;
                    if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i4 = ShareDataUIState + 75;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<EasyCheckoutViewModel.EasyCheckoutUiState> stateFlowUiState = this.component1.uiState();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<CheckoutResp>() {
                        private static int ShareDataUIState = 0;
                        private static int component2 = 1;

                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            private static int ShareDataUIState = 1;
                            private static int component3;
                            final FlowCollector component1;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$3$1$invokeSuspend$$inlined$map$1$2", f = "EasyCheckoutActivity.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                private static int component1 = 0;
                                private static int copydefault = 1;
                                Object L$0;
                                int label;
                                Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override
                                public final Object invokeSuspend(Object obj) {
                                    int i = 2 % 2;
                                    int i2 = component1 + 125;
                                    copydefault = i2 % 128;
                                    int i3 = i2 % 2;
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    if (i3 == 0) {
                                        anonymousClass2.emit(null, this);
                                        throw null;
                                    }
                                    Object objEmit = anonymousClass2.emit(null, this);
                                    int i4 = component1 + 115;
                                    copydefault = i4 % 128;
                                    int i5 = i4 % 2;
                                    return objEmit;
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
                            @Override
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                                /*
                                    r5 = this;
                                    r0 = 2
                                    int r1 = r0 % r0
                                    boolean r1 = r7 instanceof com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r1 == 0) goto L3c
                                    int r1 = com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                    int r1 = r1 + 35
                                    int r2 = r1 % 128
                                    com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r2
                                    int r1 = r1 % r0
                                    if (r1 == 0) goto L33
                                    r1 = r7
                                    com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$3$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                    int r2 = r1.label
                                    r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r2 = r2 & r3
                                    if (r2 == 0) goto L3c
                                    int r7 = com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                    int r7 = r7 + 117
                                    int r2 = r7 % 128
                                    com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r2
                                    int r7 = r7 % r0
                                    if (r7 != 0) goto L2d
                                    int r7 = r1.label
                                    int r7 = r7 % r3
                                    r1.label = r7
                                    goto L4a
                                L2d:
                                    int r7 = r1.label
                                    int r7 = r7 + r3
                                    r1.label = r7
                                    goto L4a
                                L33:
                                    com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$3$1$invokeSuspend$$inlined$map$1$2$1 r7 = (com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r7
                                    int r6 = r7.label
                                    r6 = 0
                                    r6.hashCode()
                                    throw r6
                                L3c:
                                    com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$3$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$3$1$invokeSuspend$$inlined$map$1$2$1
                                    r1.<init>(r7)
                                    int r7 = com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                    int r7 = r7 + 23
                                    int r2 = r7 % 128
                                    com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r2
                                    int r7 = r7 % r0
                                L4a:
                                    java.lang.Object r7 = r1.result
                                    java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r3 = r1.label
                                    r4 = 1
                                    if (r3 == 0) goto L63
                                    if (r3 != r4) goto L5b
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    goto L89
                                L5b:
                                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                    r6.<init>(r7)
                                    throw r6
                                L63:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    kotlinx.coroutines.flow.FlowCollector r7 = r5.component1
                                    r3 = r1
                                    kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                                    com.huawei.digitalpayment.checkout.ui.viewmodel.EasyCheckoutViewModel$EasyCheckoutUiState r6 = (com.huawei.digitalpayment.checkout.ui.viewmodel.EasyCheckoutViewModel.EasyCheckoutUiState) r6
                                    com.huawei.digitalpayment.checkout.model.response.CheckoutResp r6 = r6.getCheckoutResp()
                                    r1.label = r4
                                    java.lang.Object r6 = r7.emit(r6, r1)
                                    if (r6 != r2) goto L89
                                    int r6 = com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState
                                    int r6 = r6 + 43
                                    int r7 = r6 % 128
                                    com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3 = r7
                                    int r6 = r6 % r0
                                    if (r6 == 0) goto L88
                                    r6 = 11
                                    int r6 = r6 / 0
                                L88:
                                    return r2
                                L89:
                                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                    return r6
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity$onCreate$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.component1 = flowCollector;
                            }
                        }

                        @Override
                        public Object collect(FlowCollector<? super CheckoutResp> flowCollector, Continuation continuation) {
                            int i6 = 2 % 2;
                            Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                            if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                int i7 = component2 + 69;
                                ShareDataUIState = i7 % 128;
                                if (i7 % 2 == 0) {
                                    return objCollect;
                                }
                                throw null;
                            }
                            Unit unit = Unit.INSTANCE;
                            int i8 = component2 + 111;
                            ShareDataUIState = i8 % 128;
                            int i9 = i8 % 2;
                            return unit;
                        }
                    });
                    final EasyCheckoutActivity easyCheckoutActivity = this.copydefault;
                    this.component3 = 1;
                    if (flowDistinctUntilChanged.collect(new FlowCollector() {
                        private static int component1 = 1;
                        private static int component3;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i6 = 2 % 2;
                            int i7 = component1 + 49;
                            component3 = i7 % 128;
                            int i8 = i7 % 2;
                            Object objCopydefault = copydefault((CheckoutResp) obj2, continuation);
                            int i9 = component3 + 37;
                            component1 = i9 % 128;
                            int i10 = i9 % 2;
                            return objCopydefault;
                        }

                        public final Object copydefault(CheckoutResp checkoutResp, Continuation<? super Unit> continuation) {
                            int i6 = 2 % 2;
                            if (checkoutResp != null) {
                                int i7 = component1 + 125;
                                component3 = i7 % 128;
                                int i8 = i7 % 2;
                                EasyCheckoutActivity.access$checkout(easyCheckoutActivity, checkoutResp);
                            }
                            Unit unit = Unit.INSTANCE;
                            int i9 = component1 + 107;
                            component3 = i9 % 128;
                            if (i9 % 2 == 0) {
                                return unit;
                            }
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    }, this) == coroutine_suspended) {
                        int i6 = ShareDataUIState + 61;
                        component2 = i6 % 128;
                        int i7 = i6 % 2;
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(EasyCheckoutViewModel easyCheckoutViewModel, EasyCheckoutActivity easyCheckoutActivity, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.component1 = easyCheckoutViewModel;
                this.copydefault = easyCheckoutActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.component1, this.copydefault, continuation);
                int i2 = component2 + 103;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 74 / 0;
                }
                return anonymousClass3;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 97;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Object objCopydefault = copydefault(coroutineScope, continuation);
                if (i3 == 0) {
                    int i4 = 79 / 0;
                }
                return objCopydefault;
            }

            public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 73;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = component2 + 101;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component3;
            if (i2 != 0) {
                int i3 = component1 + 113;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component3 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(EasyCheckoutActivity.this, Lifecycle.State.STARTED, new AnonymousClass3(this.component2, EasyCheckoutActivity.this, null), this) == coroutine_suspended) {
                    int i4 = component1 + 97;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    return coroutine_suspended;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i6 = component1 + 71;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component3(EasyCheckoutViewModel easyCheckoutViewModel, Continuation<? super component3> continuation) {
            super(2, continuation);
            this.component2 = easyCheckoutViewModel;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = EasyCheckoutActivity.this.new component3(this.component2, continuation);
            int i2 = ShareDataUIState + 1;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return component3Var;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 55;
            ShareDataUIState = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                component3(coroutineScope2, continuation2);
                throw null;
            }
            Object objComponent3 = component3(coroutineScope2, continuation2);
            int i3 = component1 + 41;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return objComponent3;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 43;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            component3 component3Var = (component3) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                component3Var.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = component3Var.invokeSuspend(unit);
            int i4 = ShareDataUIState + 49;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0708 A[Catch: Exception -> 0x0789, TryCatch #2 {Exception -> 0x0789, blocks: (B:76:0x06db, B:77:0x06e0, B:80:0x06e8, B:84:0x06fc, B:91:0x070c, B:90:0x0708, B:88:0x0704, B:92:0x0719, B:94:0x071d, B:95:0x0721, B:97:0x0729, B:99:0x072d, B:100:0x0731, B:101:0x073e, B:103:0x0742, B:104:0x0746, B:106:0x074e, B:108:0x0752, B:109:0x0756, B:110:0x0763, B:112:0x0767, B:113:0x076b, B:115:0x0773, B:117:0x0777, B:118:0x077b), top: B:232:0x06cd }] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity.onCreate(android.os.Bundle):void");
    }

    private final void addNfcParams(HashMap<String, Object> map) {
        int i = 2 % 2;
        Map<String, ? extends Object> map2 = null;
        if (Intrinsics.areEqual((Object) this.isFromNfc, (Object) true)) {
            int i2 = equals + 93;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                map.put(KeysConstants.KEY_IS_FROM_NFC, true);
                map2.hashCode();
                throw null;
            }
            map.put(KeysConstants.KEY_IS_FROM_NFC, true);
        }
        Map<String, ? extends Object> map3 = this.params;
        if (map3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            map3 = null;
        }
        if (map3.containsKey("appId")) {
            Map<String, ? extends Object> map4 = this.params;
            if (map4 == null) {
                int i3 = getAsAtTimestamp + 105;
                equals = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                map4 = null;
            }
            Object obj = map4.get("appId");
            Intrinsics.checkNotNull(obj, "");
            map.put("appId", (String) obj);
        }
        Map<String, ? extends Object> map5 = this.params;
        if (map5 == null) {
            int i5 = equals + 13;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            map5 = null;
        }
        if (map5.containsKey(KeysConstants.KEY_MERCH_CODE)) {
            int i7 = getAsAtTimestamp + 3;
            equals = i7 % 128;
            int i8 = i7 % 2;
            Map<String, ? extends Object> map6 = this.params;
            if (map6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i9 = getAsAtTimestamp + 5;
                equals = i9 % 128;
                int i10 = i9 % 2;
                map6 = null;
            }
            Object obj2 = map6.get(KeysConstants.KEY_MERCH_CODE);
            Intrinsics.checkNotNull(obj2, "");
            map.put(KeysConstants.KEY_MERCH_CODE, (String) obj2);
        }
        Map<String, ? extends Object> map7 = this.params;
        if (map7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            map7 = null;
        }
        if (map7.containsKey(KeysConstants.KEY_MERCH_ORDER_ID)) {
            Map<String, ? extends Object> map8 = this.params;
            if (map8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                map2 = map8;
            }
            Object obj3 = map2.get(KeysConstants.KEY_MERCH_ORDER_ID);
            Intrinsics.checkNotNull(obj3, "");
            map.put(KeysConstants.KEY_MERCH_ORDER_ID, (String) obj3);
        }
    }

    private final void checkout(CheckoutResp checkoutResp) {
        int i = 2 % 2;
        HashMap<String, Object> map = new HashMap<>();
        HashMap<String, Object> map2 = map;
        map2.put(com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants.PREPAY_ID, checkoutResp.getPrepayId());
        map2.put("tradeType", PayTradeTypeEnum.NATIVE_APP.getTradeType());
        if (!TextUtils.isEmpty(this.businessType)) {
            map2.put("businessType", this.businessType);
        }
        if (!TextUtils.isEmpty(this.avatar)) {
            map2.put("avatar", this.avatar);
        }
        Integer num = this.resIcon;
        if (num != null) {
            map2.put("resIcon", num);
        }
        Integer num2 = this.confirmIcon;
        if (num2 != null) {
            int i2 = getAsAtTimestamp + 5;
            equals = i2 % 128;
            int i3 = i2 % 2;
            map2.put("confirmIcon", num2);
        }
        if (!TextUtils.isEmpty(this.buttonText)) {
            map2.put("buttonText", this.buttonText);
        }
        if (!TextUtils.isEmpty(this.pinTitle)) {
            map2.put("pinTitle", this.pinTitle);
        }
        if (!TextUtils.isEmpty(this.initiationType)) {
            map2.put("initiationType", this.initiationType);
            int i4 = equals + 109;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }
        addNfcParams(map);
        String str = this.eventName;
        if (str != null && str.length() != 0) {
            String str2 = this.eventName;
            if (str2 == null) {
                int i6 = equals + 61;
                getAsAtTimestamp = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 68 / 0;
                }
                str2 = "";
            }
            map2.put("eventName", str2);
        }
        String str3 = this.nameResolutionParam;
        if (str3 != null && str3.length() != 0) {
            String str4 = this.nameResolutionParam;
            if (str4 == null) {
                str4 = "";
            }
            map2.put(ReferenceDataUtils.NameResolutionParam, str4);
        }
        String str5 = this.authenticationType;
        if (str5 != null && str5.length() != 0) {
            String str6 = this.authenticationType;
            if (str6 == null) {
                str6 = "";
            }
            map2.put(ReferenceDataUtils.AuthentiationTypeParam, str6);
        }
        String str7 = this.biInitiationType;
        if (str7 != null && str7.length() != 0) {
            String str8 = this.biInitiationType;
            if (str8 == null) {
                str8 = "";
            }
            map2.put(ReferenceDataUtils.InitiationTypeParam, str8);
        }
        Map<String, ? extends Object> map3 = this.params;
        Map<String, ? extends Object> map4 = null;
        if (map3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            map3 = null;
        }
        if (!(!map3.containsKey("walletReferenceData"))) {
            Map<String, ? extends Object> map5 = this.params;
            if (map5 == null) {
                int i8 = getAsAtTimestamp + 121;
                equals = i8 % 128;
                int i9 = i8 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                map5 = null;
            }
            map2.put("walletReferenceData", map5.get("walletReferenceData"));
        }
        Map<String, ? extends Object> map6 = this.params;
        if (map6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            map6 = null;
        }
        if (map6.containsKey("note")) {
            Map<String, ? extends Object> map7 = this.params;
            if (map7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                map7 = null;
            }
            if (map7.get("note") != null) {
                int i10 = getAsAtTimestamp + 119;
                equals = i10 % 128;
                if (i10 % 2 == 0) {
                    map4.hashCode();
                    throw null;
                }
                Map<String, ? extends Object> map8 = this.params;
                if (map8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    map4 = map8;
                }
                map2.put("note", String.valueOf(map4.get("note")));
            }
        }
        SfcPayManager.INSTANCE.startPay(this, map2, SfcTradeTypeEnum.EASY_CHECKOUT, SfcEasyCheckoutManager.INSTANCE.getPayCallback() == null ? new ApiCallback<TransferResp>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public void onSuccess(TransferResp transferResp) {
                int i11 = 2 % 2;
                int i12 = ShareDataUIState + 121;
                component2 = i12 % 128;
                int i13 = i12 % 2;
                onSuccess2(transferResp);
                int i14 = ShareDataUIState + 5;
                component2 = i14 % 128;
                int i15 = i14 % 2;
            }

            public void onSuccess2(TransferResp value) {
                int i11 = 2 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                Bundle bundle = new Bundle(1);
                bundle.putSerializable(com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants.KEY_TRANSFER_RESP, value);
                RouteUtils.routeWithExecute("/checkoutModule/sfcCommonSuccess", bundle);
                int i12 = ShareDataUIState + 43;
                component2 = i12 % 128;
                int i13 = i12 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i11 = 2 % 2;
                int i12 = component2 + 27;
                ShareDataUIState = i12 % 128;
                int i13 = i12 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                ToastUtils.showLong(e.getMessage(), new Object[0]);
                EasyCheckoutActivity.this.finish();
                int i14 = component2 + 7;
                ShareDataUIState = i14 % 128;
                int i15 = i14 % 2;
            }
        } : SfcEasyCheckoutManager.INSTANCE.getPayCallback());
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 5;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = getAsAtTimestamp + 89;
            equals = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952016_res_0x7f130190).substring(7, 8).length(), new char[]{11568, 41609, 11601, 63156, 15275, 37737, 30900, 33855, 31763, 1919, 49725, 14047, 36809, 21522, 28901, 59147, 56981, 60125, 42837, 34816, 26742, 15203, 54793, 15076, 47896, 18478, 1275, 60324, 51865, 40694}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(14) - 108, new char[]{3203, 25771, 3296, 12429, 52115, 25415, 49527, 15868, 23978, 49498, 12821, 36723, 44651, 37424, 32961, 24207, 65284, 11517, 22381, 12739, 18908, 64838}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i6 = equals + 79;
                getAsAtTimestamp = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 4 / 4;
                }
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - View.MeasureSpec.getSize(0), 42 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - View.combineMeasuredStates(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 57, (char) KeyEvent.normalizeMetaState(0), -960739708, false, "component3", new Class[]{Context.class});
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1022:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x016d A[PHI: r15
  0x016d: PHI (r15v97 int) = (r15v8 int), (r15v100 int), (r15v102 int) binds: [B:21:0x018d, B:9:0x016a, B:7:0x0167] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x07c7 A[Catch: all -> 0x08d8, PHI: r2 r5 r7 r8
  0x07c7: PHI (r2v771 java.lang.Object[]) = (r2v770 java.lang.Object[]), (r2v794 java.lang.Object[]) binds: [B:121:0x07c0, B:115:0x07a1] A[DONT_GENERATE, DONT_INLINE]
  0x07c7: PHI (r5v658 char) = (r5v657 char), (r5v673 char) binds: [B:121:0x07c0, B:115:0x07a1] A[DONT_GENERATE, DONT_INLINE]
  0x07c7: PHI (r7v587 int) = (r7v586 int), (r7v610 int) binds: [B:121:0x07c0, B:115:0x07a1] A[DONT_GENERATE, DONT_INLINE]
  0x07c7: PHI (r8v297 int) = (r8v296 int), (r8v314 int) binds: [B:121:0x07c0, B:115:0x07a1] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #28 {all -> 0x08d8, blocks: (B:108:0x0775, B:109:0x0779, B:123:0x07c7, B:120:0x07ab, B:104:0x0710, B:107:0x076d), top: B:926:0x0710 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0175 A[PHI: r15
  0x0175: PHI (r15v8 int) = (r15v7 int), (r15v118 int), (r15v119 int) binds: [B:3:0x0154, B:9:0x016a, B:7:0x0167] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0996 A[Catch: all -> 0x035c, TryCatch #32 {all -> 0x035c, blocks: (B:181:0x0990, B:183:0x0996, B:184:0x09c2, B:307:0x0efe, B:309:0x0f04, B:310:0x0f2f, B:510:0x1910, B:512:0x1916, B:513:0x1940, B:845:0x34c0, B:847:0x34c6, B:848:0x34ef, B:825:0x32f4, B:827:0x3317, B:828:0x336a, B:808:0x317b, B:810:0x3181, B:811:0x31ac, B:774:0x2e44, B:776:0x2e4a, B:777:0x2e70, B:651:0x2703, B:653:0x2709, B:654:0x2732, B:656:0x276c, B:657:0x27b7, B:624:0x2431, B:626:0x2446, B:627:0x247b, B:606:0x2112, B:608:0x2118, B:609:0x213f, B:611:0x2179, B:612:0x21bf, B:576:0x1d8d, B:578:0x1da2, B:579:0x1dd0, B:581:0x1e04, B:582:0x1e7b, B:555:0x1b23, B:557:0x1b29, B:558:0x1b52, B:385:0x1394, B:387:0x139a, B:388:0x13c5, B:23:0x0192, B:25:0x0198, B:26:0x01c6, B:28:0x02ca, B:30:0x02fc, B:31:0x0356, B:518:0x19bf, B:520:0x19c3, B:541:0x1aad, B:543:0x1ab3, B:544:0x1ab4, B:546:0x1ab6, B:548:0x1abd, B:549:0x1abe, B:524:0x19cf, B:534:0x1a26, B:536:0x1a33, B:537:0x1aa2, B:530:0x19da, B:532:0x19ef, B:533:0x1a20), top: B:933:0x0192, inners: #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0f04 A[Catch: all -> 0x035c, TryCatch #32 {all -> 0x035c, blocks: (B:181:0x0990, B:183:0x0996, B:184:0x09c2, B:307:0x0efe, B:309:0x0f04, B:310:0x0f2f, B:510:0x1910, B:512:0x1916, B:513:0x1940, B:845:0x34c0, B:847:0x34c6, B:848:0x34ef, B:825:0x32f4, B:827:0x3317, B:828:0x336a, B:808:0x317b, B:810:0x3181, B:811:0x31ac, B:774:0x2e44, B:776:0x2e4a, B:777:0x2e70, B:651:0x2703, B:653:0x2709, B:654:0x2732, B:656:0x276c, B:657:0x27b7, B:624:0x2431, B:626:0x2446, B:627:0x247b, B:606:0x2112, B:608:0x2118, B:609:0x213f, B:611:0x2179, B:612:0x21bf, B:576:0x1d8d, B:578:0x1da2, B:579:0x1dd0, B:581:0x1e04, B:582:0x1e7b, B:555:0x1b23, B:557:0x1b29, B:558:0x1b52, B:385:0x1394, B:387:0x139a, B:388:0x13c5, B:23:0x0192, B:25:0x0198, B:26:0x01c6, B:28:0x02ca, B:30:0x02fc, B:31:0x0356, B:518:0x19bf, B:520:0x19c3, B:541:0x1aad, B:543:0x1ab3, B:544:0x1ab4, B:546:0x1ab6, B:548:0x1abd, B:549:0x1abe, B:524:0x19cf, B:534:0x1a26, B:536:0x1a33, B:537:0x1aa2, B:530:0x19da, B:532:0x19ef, B:533:0x1a20), top: B:933:0x0192, inners: #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0fb2 A[Catch: all -> 0x130a, TryCatch #58 {all -> 0x130a, blocks: (B:314:0x0fac, B:316:0x0fb2, B:317:0x0ff9, B:319:0x1006, B:321:0x100f, B:322:0x1054, B:356:0x126c, B:362:0x12ea, B:364:0x12f0, B:365:0x12f1, B:367:0x12f3, B:369:0x12fa, B:370:0x12fb, B:324:0x1062, B:331:0x10e3, B:333:0x10e9, B:334:0x112a, B:374:0x1301, B:376:0x1308, B:377:0x1309, B:358:0x1272, B:352:0x1236, B:354:0x123c, B:355:0x1265, B:326:0x1082, B:328:0x1094, B:329:0x10d7), top: B:983:0x0fac, inners: #39, #45, #54 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x1006 A[Catch: all -> 0x130a, TryCatch #58 {all -> 0x130a, blocks: (B:314:0x0fac, B:316:0x0fb2, B:317:0x0ff9, B:319:0x1006, B:321:0x100f, B:322:0x1054, B:356:0x126c, B:362:0x12ea, B:364:0x12f0, B:365:0x12f1, B:367:0x12f3, B:369:0x12fa, B:370:0x12fb, B:324:0x1062, B:331:0x10e3, B:333:0x10e9, B:334:0x112a, B:374:0x1301, B:376:0x1308, B:377:0x1309, B:358:0x1272, B:352:0x1236, B:354:0x123c, B:355:0x1265, B:326:0x1082, B:328:0x1094, B:329:0x10d7), top: B:983:0x0fac, inners: #39, #45, #54 }] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x1062 A[Catch: all -> 0x130a, TRY_LEAVE, TryCatch #58 {all -> 0x130a, blocks: (B:314:0x0fac, B:316:0x0fb2, B:317:0x0ff9, B:319:0x1006, B:321:0x100f, B:322:0x1054, B:356:0x126c, B:362:0x12ea, B:364:0x12f0, B:365:0x12f1, B:367:0x12f3, B:369:0x12fa, B:370:0x12fb, B:324:0x1062, B:331:0x10e3, B:333:0x10e9, B:334:0x112a, B:374:0x1301, B:376:0x1308, B:377:0x1309, B:358:0x1272, B:352:0x1236, B:354:0x123c, B:355:0x1265, B:326:0x1082, B:328:0x1094, B:329:0x10d7), top: B:983:0x0fac, inners: #39, #45, #54 }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x120f  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x1213  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x139a A[Catch: all -> 0x035c, TryCatch #32 {all -> 0x035c, blocks: (B:181:0x0990, B:183:0x0996, B:184:0x09c2, B:307:0x0efe, B:309:0x0f04, B:310:0x0f2f, B:510:0x1910, B:512:0x1916, B:513:0x1940, B:845:0x34c0, B:847:0x34c6, B:848:0x34ef, B:825:0x32f4, B:827:0x3317, B:828:0x336a, B:808:0x317b, B:810:0x3181, B:811:0x31ac, B:774:0x2e44, B:776:0x2e4a, B:777:0x2e70, B:651:0x2703, B:653:0x2709, B:654:0x2732, B:656:0x276c, B:657:0x27b7, B:624:0x2431, B:626:0x2446, B:627:0x247b, B:606:0x2112, B:608:0x2118, B:609:0x213f, B:611:0x2179, B:612:0x21bf, B:576:0x1d8d, B:578:0x1da2, B:579:0x1dd0, B:581:0x1e04, B:582:0x1e7b, B:555:0x1b23, B:557:0x1b29, B:558:0x1b52, B:385:0x1394, B:387:0x139a, B:388:0x13c5, B:23:0x0192, B:25:0x0198, B:26:0x01c6, B:28:0x02ca, B:30:0x02fc, B:31:0x0356, B:518:0x19bf, B:520:0x19c3, B:541:0x1aad, B:543:0x1ab3, B:544:0x1ab4, B:546:0x1ab6, B:548:0x1abd, B:549:0x1abe, B:524:0x19cf, B:534:0x1a26, B:536:0x1a33, B:537:0x1aa2, B:530:0x19da, B:532:0x19ef, B:533:0x1a20), top: B:933:0x0192, inners: #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x144d  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x1497 A[Catch: all -> 0x18aa, PHI: r1
  0x1497: PHI (r1v544 java.lang.Object) = (r1v543 java.lang.Object), (r1v597 java.lang.Object) binds: [B:393:0x144b, B:395:0x144f] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x18aa, blocks: (B:392:0x1447, B:400:0x1497, B:409:0x14f9, B:428:0x1609, B:432:0x164f), top: B:879:0x1447 }] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x14a4  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x14f9 A[Catch: all -> 0x18aa, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x18aa, blocks: (B:392:0x1447, B:400:0x1497, B:409:0x14f9, B:428:0x1609, B:432:0x164f), top: B:879:0x1447 }] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x172f  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x176f  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x1774 A[Catch: all -> 0x188e, PHI: r2 r5 r7
  0x1774: PHI (r2v539 java.lang.Object[]) = (r2v538 java.lang.Object[]), (r2v561 java.lang.Object[]) binds: [B:456:0x176d, B:451:0x1750] A[DONT_GENERATE, DONT_INLINE]
  0x1774: PHI (r5v474 int) = (r5v473 int), (r5v486 int) binds: [B:456:0x176d, B:451:0x1750] A[DONT_GENERATE, DONT_INLINE]
  0x1774: PHI (r7v374 int) = (r7v373 int), (r7v399 int) binds: [B:456:0x176d, B:451:0x1750] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #61 {all -> 0x188e, blocks: (B:445:0x1725, B:446:0x1729, B:458:0x1774, B:455:0x1759, B:434:0x165e, B:440:0x16c2, B:444:0x171d), top: B:988:0x165e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x1916 A[Catch: all -> 0x035c, TryCatch #32 {all -> 0x035c, blocks: (B:181:0x0990, B:183:0x0996, B:184:0x09c2, B:307:0x0efe, B:309:0x0f04, B:310:0x0f2f, B:510:0x1910, B:512:0x1916, B:513:0x1940, B:845:0x34c0, B:847:0x34c6, B:848:0x34ef, B:825:0x32f4, B:827:0x3317, B:828:0x336a, B:808:0x317b, B:810:0x3181, B:811:0x31ac, B:774:0x2e44, B:776:0x2e4a, B:777:0x2e70, B:651:0x2703, B:653:0x2709, B:654:0x2732, B:656:0x276c, B:657:0x27b7, B:624:0x2431, B:626:0x2446, B:627:0x247b, B:606:0x2112, B:608:0x2118, B:609:0x213f, B:611:0x2179, B:612:0x21bf, B:576:0x1d8d, B:578:0x1da2, B:579:0x1dd0, B:581:0x1e04, B:582:0x1e7b, B:555:0x1b23, B:557:0x1b29, B:558:0x1b52, B:385:0x1394, B:387:0x139a, B:388:0x13c5, B:23:0x0192, B:25:0x0198, B:26:0x01c6, B:28:0x02ca, B:30:0x02fc, B:31:0x0356, B:518:0x19bf, B:520:0x19c3, B:541:0x1aad, B:543:0x1ab3, B:544:0x1ab4, B:546:0x1ab6, B:548:0x1abd, B:549:0x1abe, B:524:0x19cf, B:534:0x1a26, B:536:0x1a33, B:537:0x1aa2, B:530:0x19da, B:532:0x19ef, B:533:0x1a20), top: B:933:0x0192, inners: #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:528:0x19d8  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x19ef A[Catch: all -> 0x1ab5, TryCatch #11 {all -> 0x1ab5, blocks: (B:530:0x19da, B:532:0x19ef, B:533:0x1a20), top: B:894:0x19da, outer: #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:536:0x1a33 A[Catch: all -> 0x1aab, TryCatch #4 {all -> 0x1aab, blocks: (B:534:0x1a26, B:536:0x1a33, B:537:0x1aa2), top: B:881:0x1a26, outer: #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x1be0  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x1c4d  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x1c91  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x1ca7  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x1d6d  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x1fb7  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x20d1  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x22db  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x2327  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x240f  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x25c5  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x26b8  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x2935 A[Catch: all -> 0x2dda, TryCatch #29 {all -> 0x2dda, blocks: (B:668:0x291c, B:670:0x2935, B:671:0x2974, B:677:0x2996, B:679:0x299c, B:680:0x29e0, B:722:0x2c96, B:723:0x2c9a, B:725:0x2ca0, B:728:0x2cb8, B:731:0x2cc5, B:733:0x2cc8, B:745:0x2db4, B:747:0x2dba, B:748:0x2dbb, B:750:0x2dbd, B:752:0x2dc4, B:753:0x2dc5, B:681:0x29ef, B:683:0x29f8, B:684:0x2a3b, B:690:0x2a56, B:692:0x2a5c, B:696:0x2a68, B:697:0x2a6d, B:698:0x2a70, B:700:0x2a73, B:712:0x2b7c, B:714:0x2b82, B:715:0x2bc3, B:717:0x2bed, B:718:0x2c32, B:720:0x2c48, B:721:0x2c90, B:755:0x2dc7, B:757:0x2dce, B:758:0x2dcf, B:760:0x2dd1, B:762:0x2dd8, B:763:0x2dd9, B:741:0x2d3a, B:736:0x2cf7, B:738:0x2cfd, B:739:0x2d28, B:707:0x2ae0, B:709:0x2aff, B:710:0x2b70, B:702:0x2a93, B:704:0x2aa8, B:705:0x2ad9), top: B:928:0x291c, inners: #10, #13, #15, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:674:0x2987  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x2a46  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x2ca0 A[Catch: all -> 0x2dda, TryCatch #29 {all -> 0x2dda, blocks: (B:668:0x291c, B:670:0x2935, B:671:0x2974, B:677:0x2996, B:679:0x299c, B:680:0x29e0, B:722:0x2c96, B:723:0x2c9a, B:725:0x2ca0, B:728:0x2cb8, B:731:0x2cc5, B:733:0x2cc8, B:745:0x2db4, B:747:0x2dba, B:748:0x2dbb, B:750:0x2dbd, B:752:0x2dc4, B:753:0x2dc5, B:681:0x29ef, B:683:0x29f8, B:684:0x2a3b, B:690:0x2a56, B:692:0x2a5c, B:696:0x2a68, B:697:0x2a6d, B:698:0x2a70, B:700:0x2a73, B:712:0x2b7c, B:714:0x2b82, B:715:0x2bc3, B:717:0x2bed, B:718:0x2c32, B:720:0x2c48, B:721:0x2c90, B:755:0x2dc7, B:757:0x2dce, B:758:0x2dcf, B:760:0x2dd1, B:762:0x2dd8, B:763:0x2dd9, B:741:0x2d3a, B:736:0x2cf7, B:738:0x2cfd, B:739:0x2d28, B:707:0x2ae0, B:709:0x2aff, B:710:0x2b70, B:702:0x2a93, B:704:0x2aa8, B:705:0x2ad9), top: B:928:0x291c, inners: #10, #13, #15, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:776:0x2e4a A[Catch: all -> 0x035c, TryCatch #32 {all -> 0x035c, blocks: (B:181:0x0990, B:183:0x0996, B:184:0x09c2, B:307:0x0efe, B:309:0x0f04, B:310:0x0f2f, B:510:0x1910, B:512:0x1916, B:513:0x1940, B:845:0x34c0, B:847:0x34c6, B:848:0x34ef, B:825:0x32f4, B:827:0x3317, B:828:0x336a, B:808:0x317b, B:810:0x3181, B:811:0x31ac, B:774:0x2e44, B:776:0x2e4a, B:777:0x2e70, B:651:0x2703, B:653:0x2709, B:654:0x2732, B:656:0x276c, B:657:0x27b7, B:624:0x2431, B:626:0x2446, B:627:0x247b, B:606:0x2112, B:608:0x2118, B:609:0x213f, B:611:0x2179, B:612:0x21bf, B:576:0x1d8d, B:578:0x1da2, B:579:0x1dd0, B:581:0x1e04, B:582:0x1e7b, B:555:0x1b23, B:557:0x1b29, B:558:0x1b52, B:385:0x1394, B:387:0x139a, B:388:0x13c5, B:23:0x0192, B:25:0x0198, B:26:0x01c6, B:28:0x02ca, B:30:0x02fc, B:31:0x0356, B:518:0x19bf, B:520:0x19c3, B:541:0x1aad, B:543:0x1ab3, B:544:0x1ab4, B:546:0x1ab6, B:548:0x1abd, B:549:0x1abe, B:524:0x19cf, B:534:0x1a26, B:536:0x1a33, B:537:0x1aa2, B:530:0x19da, B:532:0x19ef, B:533:0x1a20), top: B:933:0x0192, inners: #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:782:0x2ef5  */
    /* JADX WARN: Removed duplicated region for block: B:785:0x2f4a  */
    /* JADX WARN: Removed duplicated region for block: B:790:0x2fa2  */
    /* JADX WARN: Removed duplicated region for block: B:806:0x3153  */
    /* JADX WARN: Removed duplicated region for block: B:807:0x3157  */
    /* JADX WARN: Removed duplicated region for block: B:816:0x3233  */
    /* JADX WARN: Removed duplicated region for block: B:819:0x3282  */
    /* JADX WARN: Removed duplicated region for block: B:824:0x32d6  */
    /* JADX WARN: Removed duplicated region for block: B:844:0x34a2  */
    /* JADX WARN: Removed duplicated region for block: B:925:0x19bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:977:0x28c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v101 */
    /* JADX WARN: Type inference failed for: r10v107 */
    /* JADX WARN: Type inference failed for: r10v108 */
    /* JADX WARN: Type inference failed for: r10v109 */
    /* JADX WARN: Type inference failed for: r10v110 */
    /* JADX WARN: Type inference failed for: r10v111 */
    /* JADX WARN: Type inference failed for: r10v112 */
    /* JADX WARN: Type inference failed for: r10v113 */
    /* JADX WARN: Type inference failed for: r10v114 */
    /* JADX WARN: Type inference failed for: r10v115 */
    /* JADX WARN: Type inference failed for: r10v116 */
    /* JADX WARN: Type inference failed for: r10v117 */
    /* JADX WARN: Type inference failed for: r10v118 */
    /* JADX WARN: Type inference failed for: r10v119 */
    /* JADX WARN: Type inference failed for: r10v120 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v36, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r10v52 */
    /* JADX WARN: Type inference failed for: r10v53 */
    /* JADX WARN: Type inference failed for: r10v54 */
    /* JADX WARN: Type inference failed for: r10v56 */
    /* JADX WARN: Type inference failed for: r10v57 */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r10v88 */
    /* JADX WARN: Type inference failed for: r10v89 */
    /* JADX WARN: Type inference failed for: r10v90 */
    /* JADX WARN: Type inference failed for: r10v91 */
    /* JADX WARN: Type inference failed for: r10v92 */
    /* JADX WARN: Type inference failed for: r10v97, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v106 */
    /* JADX WARN: Type inference failed for: r12v109 */
    /* JADX WARN: Type inference failed for: r12v110 */
    /* JADX WARN: Type inference failed for: r12v111, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v112 */
    /* JADX WARN: Type inference failed for: r12v113 */
    /* JADX WARN: Type inference failed for: r12v114 */
    /* JADX WARN: Type inference failed for: r12v115 */
    /* JADX WARN: Type inference failed for: r12v116 */
    /* JADX WARN: Type inference failed for: r12v117 */
    /* JADX WARN: Type inference failed for: r12v121 */
    /* JADX WARN: Type inference failed for: r12v122 */
    /* JADX WARN: Type inference failed for: r12v126 */
    /* JADX WARN: Type inference failed for: r12v131, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r12v132 */
    /* JADX WARN: Type inference failed for: r12v133, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v134 */
    /* JADX WARN: Type inference failed for: r12v135 */
    /* JADX WARN: Type inference failed for: r12v136 */
    /* JADX WARN: Type inference failed for: r12v137 */
    /* JADX WARN: Type inference failed for: r12v138 */
    /* JADX WARN: Type inference failed for: r12v139 */
    /* JADX WARN: Type inference failed for: r12v140 */
    /* JADX WARN: Type inference failed for: r12v141 */
    /* JADX WARN: Type inference failed for: r12v142 */
    /* JADX WARN: Type inference failed for: r12v148 */
    /* JADX WARN: Type inference failed for: r12v149 */
    /* JADX WARN: Type inference failed for: r12v150 */
    /* JADX WARN: Type inference failed for: r12v151 */
    /* JADX WARN: Type inference failed for: r12v152 */
    /* JADX WARN: Type inference failed for: r12v153 */
    /* JADX WARN: Type inference failed for: r12v154 */
    /* JADX WARN: Type inference failed for: r12v155 */
    /* JADX WARN: Type inference failed for: r12v156 */
    /* JADX WARN: Type inference failed for: r12v157 */
    /* JADX WARN: Type inference failed for: r12v158 */
    /* JADX WARN: Type inference failed for: r12v159 */
    /* JADX WARN: Type inference failed for: r12v160 */
    /* JADX WARN: Type inference failed for: r12v161 */
    /* JADX WARN: Type inference failed for: r12v162 */
    /* JADX WARN: Type inference failed for: r12v163 */
    /* JADX WARN: Type inference failed for: r12v164 */
    /* JADX WARN: Type inference failed for: r12v165 */
    /* JADX WARN: Type inference failed for: r12v166 */
    /* JADX WARN: Type inference failed for: r12v167 */
    /* JADX WARN: Type inference failed for: r12v168 */
    /* JADX WARN: Type inference failed for: r12v169 */
    /* JADX WARN: Type inference failed for: r12v170 */
    /* JADX WARN: Type inference failed for: r12v171 */
    /* JADX WARN: Type inference failed for: r12v172 */
    /* JADX WARN: Type inference failed for: r12v173 */
    /* JADX WARN: Type inference failed for: r12v174 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v51, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v64, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v65, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v73 */
    /* JADX WARN: Type inference failed for: r12v76 */
    /* JADX WARN: Type inference failed for: r14v100 */
    /* JADX WARN: Type inference failed for: r14v101 */
    /* JADX WARN: Type inference failed for: r14v102 */
    /* JADX WARN: Type inference failed for: r14v103 */
    /* JADX WARN: Type inference failed for: r14v104 */
    /* JADX WARN: Type inference failed for: r14v105 */
    /* JADX WARN: Type inference failed for: r14v106 */
    /* JADX WARN: Type inference failed for: r14v107 */
    /* JADX WARN: Type inference failed for: r14v108 */
    /* JADX WARN: Type inference failed for: r14v109 */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v57 */
    /* JADX WARN: Type inference failed for: r14v58 */
    /* JADX WARN: Type inference failed for: r14v59 */
    /* JADX WARN: Type inference failed for: r14v60 */
    /* JADX WARN: Type inference failed for: r14v61 */
    /* JADX WARN: Type inference failed for: r14v65 */
    /* JADX WARN: Type inference failed for: r14v66 */
    /* JADX WARN: Type inference failed for: r14v67 */
    /* JADX WARN: Type inference failed for: r14v68 */
    /* JADX WARN: Type inference failed for: r14v69 */
    /* JADX WARN: Type inference failed for: r14v70 */
    /* JADX WARN: Type inference failed for: r14v75 */
    /* JADX WARN: Type inference failed for: r14v76 */
    /* JADX WARN: Type inference failed for: r14v77 */
    /* JADX WARN: Type inference failed for: r14v78 */
    /* JADX WARN: Type inference failed for: r14v79 */
    /* JADX WARN: Type inference failed for: r14v80 */
    /* JADX WARN: Type inference failed for: r14v81 */
    /* JADX WARN: Type inference failed for: r14v82 */
    /* JADX WARN: Type inference failed for: r14v83 */
    /* JADX WARN: Type inference failed for: r14v84 */
    /* JADX WARN: Type inference failed for: r14v85 */
    /* JADX WARN: Type inference failed for: r14v87, types: [long] */
    /* JADX WARN: Type inference failed for: r14v88 */
    /* JADX WARN: Type inference failed for: r14v89 */
    /* JADX WARN: Type inference failed for: r14v90 */
    /* JADX WARN: Type inference failed for: r14v91 */
    /* JADX WARN: Type inference failed for: r14v92 */
    /* JADX WARN: Type inference failed for: r14v93 */
    /* JADX WARN: Type inference failed for: r14v94 */
    /* JADX WARN: Type inference failed for: r14v95 */
    /* JADX WARN: Type inference failed for: r14v96 */
    /* JADX WARN: Type inference failed for: r14v97 */
    /* JADX WARN: Type inference failed for: r14v98 */
    /* JADX WARN: Type inference failed for: r14v99 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v105 */
    /* JADX WARN: Type inference failed for: r15v106 */
    /* JADX WARN: Type inference failed for: r15v107 */
    /* JADX WARN: Type inference failed for: r15v108 */
    /* JADX WARN: Type inference failed for: r15v109 */
    /* JADX WARN: Type inference failed for: r15v110 */
    /* JADX WARN: Type inference failed for: r15v111 */
    /* JADX WARN: Type inference failed for: r15v113 */
    /* JADX WARN: Type inference failed for: r15v114 */
    /* JADX WARN: Type inference failed for: r15v115 */
    /* JADX WARN: Type inference failed for: r15v116 */
    /* JADX WARN: Type inference failed for: r15v117 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v85 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v87 */
    /* JADX WARN: Type inference failed for: r15v88 */
    /* JADX WARN: Type inference failed for: r15v95 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v18 */
    /* JADX WARN: Type inference failed for: r25v19 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v20 */
    /* JADX WARN: Type inference failed for: r25v21 */
    /* JADX WARN: Type inference failed for: r25v22 */
    /* JADX WARN: Type inference failed for: r25v23 */
    /* JADX WARN: Type inference failed for: r25v24 */
    /* JADX WARN: Type inference failed for: r25v25 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v34 */
    /* JADX WARN: Type inference failed for: r25v35 */
    /* JADX WARN: Type inference failed for: r25v36 */
    /* JADX WARN: Type inference failed for: r25v37 */
    /* JADX WARN: Type inference failed for: r25v38 */
    /* JADX WARN: Type inference failed for: r25v39 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v40 */
    /* JADX WARN: Type inference failed for: r25v41 */
    /* JADX WARN: Type inference failed for: r25v42 */
    /* JADX WARN: Type inference failed for: r25v43 */
    /* JADX WARN: Type inference failed for: r25v44 */
    /* JADX WARN: Type inference failed for: r25v45 */
    /* JADX WARN: Type inference failed for: r25v46 */
    /* JADX WARN: Type inference failed for: r25v47 */
    /* JADX WARN: Type inference failed for: r25v48 */
    /* JADX WARN: Type inference failed for: r25v49 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v16 */
    /* JADX WARN: Type inference failed for: r27v17 */
    /* JADX WARN: Type inference failed for: r27v31 */
    /* JADX WARN: Type inference failed for: r29v12 */
    /* JADX WARN: Type inference failed for: r29v13 */
    /* JADX WARN: Type inference failed for: r29v50 */
    /* JADX WARN: Type inference failed for: r2v792, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v566 */
    /* JADX WARN: Type inference failed for: r3v567 */
    /* JADX WARN: Type inference failed for: r3v568 */
    /* JADX WARN: Type inference failed for: r3v569 */
    /* JADX WARN: Type inference failed for: r3v570 */
    /* JADX WARN: Type inference failed for: r3v583 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v209, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v210, types: [long] */
    /* JADX WARN: Type inference failed for: r6v211 */
    /* JADX WARN: Type inference failed for: r6v212 */
    /* JADX WARN: Type inference failed for: r6v221, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v222 */
    /* JADX WARN: Type inference failed for: r6v223 */
    /* JADX WARN: Type inference failed for: r6v224 */
    /* JADX WARN: Type inference failed for: r6v225 */
    /* JADX WARN: Type inference failed for: r6v226 */
    /* JADX WARN: Type inference failed for: r6v227 */
    /* JADX WARN: Type inference failed for: r6v228 */
    /* JADX WARN: Type inference failed for: r6v235 */
    /* JADX WARN: Type inference failed for: r6v236 */
    /* JADX WARN: Type inference failed for: r6v237 */
    /* JADX WARN: Type inference failed for: r6v238 */
    /* JADX WARN: Type inference failed for: r6v239 */
    /* JADX WARN: Type inference failed for: r6v240 */
    /* JADX WARN: Type inference failed for: r6v241 */
    /* JADX WARN: Type inference failed for: r6v242 */
    /* JADX WARN: Type inference failed for: r6v243 */
    /* JADX WARN: Type inference failed for: r6v244 */
    /* JADX WARN: Type inference failed for: r6v245 */
    /* JADX WARN: Type inference failed for: r6v246 */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v183 */
    /* JADX WARN: Type inference failed for: r9v184 */
    /* JADX WARN: Type inference failed for: r9v185 */
    /* JADX WARN: Type inference failed for: r9v186 */
    /* JADX WARN: Type inference failed for: r9v190 */
    /* JADX WARN: Type inference failed for: r9v191 */
    /* JADX WARN: Type inference failed for: r9v205 */
    /* JADX WARN: Type inference failed for: r9v292 */
    /* JADX WARN: Type inference failed for: r9v293 */
    /* JADX WARN: Type inference failed for: r9v294 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.activity.EasyCheckoutActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        ShareDataUIState = 1;
        component3();
        component2();
        int i = component2 + 81;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = equals + 3;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
    }

    static void component2() {
        int i = 2 % 2;
        int i2 = equals + 13;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        copydefault = 1874374289636131137L;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 115;
        equals = i5 % 128;
        int i6 = i5 % 2;
    }

    static void component3() {
        component1 = -1316754873001609022L;
        component3 = new int[]{1384485495, 179182773, 1115535242, -729062078, 1809945567, -555482012, -281912846, 678165522, 1811207549, 444501291, 1029704941, -831117954, 126526910, -1304734174, 1301657348, -1727005845, -2068522546, 1147482893};
    }
}
