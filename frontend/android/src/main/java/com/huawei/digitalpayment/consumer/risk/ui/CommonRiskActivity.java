package com.huawei.digitalpayment.consumer.risk.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.GsonUtils;
import com.google.android.gms.common.util.zzc$$ExternalSyntheticApiModelOutline0;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.L;
import com.huawei.common.widget.dialog.DialogBox;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyParams;
import com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyResp;
import com.huawei.digitalpayment.consumer.risk.constant.RiskConstant;
import com.huawei.digitalpayment.consumer.risk.vm.RiskViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J$\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00162\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eH\u0014J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#H\u0014J\u0010\u0010$\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#H\u0014J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#H\u0014J\u0012\u0010&\u001a\u00020\u00142\b\u0010'\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010(\u001a\u00020\u0014H\u0014J\b\u0010)\u001a\u00020\u0014H\u0014J\b\u0010*\u001a\u00020\u0014H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0011\u0010\u000e¨\u0006,"}, d2 = {"Lcom/huawei/digitalpayment/consumer/risk/ui/CommonRiskActivity;", "Lcom/huawei/digitalpayment/consumer/baselib/PaymentTranslucentActivity;", "Lcom/huawei/digitalpayment/consumer/risk/vm/RiskViewModel;", "<init>", "()V", KeysConstants.KEY_RISK_PARAMS, "Lcom/huawei/digitalpayment/consumer/risk/bean/ProcessVerifyParams;", "getRiskParams", "()Lcom/huawei/digitalpayment/consumer/risk/bean/ProcessVerifyParams;", "riskParams$delegate", "Lkotlin/Lazy;", KeysConstants.KEY_HANDLE_ERROR_BY_SELF, "", "getHandleErrorBySelf", "()Z", "handleErrorBySelf$delegate", RiskConstant.KEY_HANDLE_ERROR_BY_CALLER, "getHandleErrorByCaller", "handleErrorByCaller$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "dispatchResult", "result", "Lcom/huawei/digitalpayment/consumer/risk/bean/ProcessVerifyResp;", "buildBundle", "handleExtResponse", "bundle", "map", "", "", "", "dispatchError", "error", "Lcom/huawei/common/exception/BaseException;", "showErrorByDialog", "showError", "retry", "token", "observeData", "initData", "onBackPressed", "Companion", "ConsumerRiskModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
public class CommonRiskActivity extends Hilt_CommonRiskActivity<RiskViewModel> {

    public static final Companion INSTANCE;
    private static long ShareDataUIState;
    private static ApiCallback<Bundle> callback;
    private static char component1;
    private static int component2;
    private static char[] component3;
    private static int getAsAtTimestamp;
    private static final byte[] $$l = {Ascii.SI, -12, 105, 108};
    private static final int $$o = 21;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$E = {106, -23, Ascii.FF, -128, -5, 66, -67, Ascii.SO, 5, -1, -16, Ascii.FF, -12, Ascii.DC2, -18, 75, -58, -4, -5, Ascii.DLE, -12, 5, Ascii.SO, -10, 63, -64, 0, Ascii.FF, -12, Ascii.DC2, -18, 6, -2, 0, 70, -55, -5, -2, -7, Ascii.ETB, 0, -9, 8, 56, -23, -37, -2, -7, Ascii.ETB, 0, -9, 8, Ascii.DC2, -12, -9, 7, Ascii.SI, -16, 0, -2, 8, 66, -62, -11, 0, -8, Ascii.SYN, 0, 0, 6, -19, 10, -7, -11, 3, -2, 2, 2, 10, -8, -5, 67, -11, 3, -2, 2, 2, 10, -8, -5, 66, -11, 3, SignedBytes.MAX_POWER_OF_TWO, -56, -7, 1, 9, -4, 8, 56, -50, -12, Ascii.VT, -13, 4, 7, 6, TarHeader.LF_CONTIG, -56, -5, -5, 70, -52, -11, 3, 1, -1, 2, 65, -58, -4, -5, Ascii.DLE, -12, 5, Ascii.SO, -10, 63, -75, 1, Ascii.DLE, -20, 8, -16, Ascii.SO, 34, -28, -18, 20, 13, 13, -9, -32, 20, -18, Ascii.DLE};
    private static final int $$F = 114;
    private static final byte[] $$d = {80, -19, -87, -22, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 48;
    private static int component4 = 1;
    private static int copydefault = 0;
    private static int getRequestBeneficiariesState = 1;

    private final Lazy riskParams = LazyKt.lazy(new Function0() {
        private static int ShareDataUIState = 1;
        private static int component1;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 15;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            ProcessVerifyParams processVerifyParamsM10940$r8$lambda$0OCaXVkn7GQ51e7EO0z4ladZGw = CommonRiskActivity.m10940$r8$lambda$0OCaXVkn7GQ51e7EO0z4ladZGw(this.f$0);
            int i4 = component1 + 123;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return processVerifyParamsM10940$r8$lambda$0OCaXVkn7GQ51e7EO0z4ladZGw;
        }
    });

    private final Lazy handleErrorBySelf = LazyKt.lazy(new Function0() {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 5;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            boolean zM10941$r8$lambda$PpGPPLbapp8dONSvUdkUfUOZf8 = CommonRiskActivity.m10941$r8$lambda$PpGPPLbapp8dONSvUdkUfUOZf8(this.f$0);
            if (i3 != 0) {
                return Boolean.valueOf(zM10941$r8$lambda$PpGPPLbapp8dONSvUdkUfUOZf8);
            }
            Boolean.valueOf(zM10941$r8$lambda$PpGPPLbapp8dONSvUdkUfUOZf8);
            throw null;
        }
    });

    private final Lazy handleErrorByCaller = LazyKt.lazy(new Function0() {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = copydefault + 5;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolValueOf = Boolean.valueOf(CommonRiskActivity.$r8$lambda$RBCZJ2BHIhgrphAMZwrI3NFiWJU(this.f$0));
            int i4 = copydefault + 85;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return boolValueOf;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(byte r5, short r6, byte r7) {
        /*
            int r5 = r5 * 3
            int r5 = 4 - r5
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r6 = 115 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L17
            r4 = r6
            r6 = r7
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r1[r5]
        L27:
            int r6 = r6 + r4
            int r5 = r5 + 1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity.$$r(byte, short, byte):java.lang.String");
    }

    private static void h(int i, byte b2, int i2, Object[] objArr) {
        int i3 = 99 - b2;
        int i4 = (i * 2) + 83;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i2 + 4];
        int i5 = i2 + 3;
        int i6 = -1;
        if (bArr == null) {
            i4 = (i5 + i4) - 8;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            i3++;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = (i4 + bArr[i3]) - 8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r5 = 105 - r5
            byte[] r0 = com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity.$$E
            int r7 = r7 * 2
            int r1 = r7 + 10
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 9
            r2 = 0
            if (r0 != 0) goto L17
            r5 = r6
            r3 = r7
            r4 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r3 = r0[r6]
        L29:
            int r6 = r6 + 1
            int r3 = -r3
            int r5 = r5 + r3
            int r5 = r5 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity.i(int, short, byte, java.lang.Object[]):void");
    }

    public static final ApiCallback access$getCallback$cp() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        ApiCallback<Bundle> apiCallback = callback;
        int i5 = i3 + 35;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return apiCallback;
    }

    public static final ViewModel access$getViewModel$p$s71775401(CommonRiskActivity commonRiskActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 115;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        VM vm = commonRiskActivity.viewModel;
        int i4 = getRequestBeneficiariesState + 63;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return vm;
    }

    public static final void access$setCallback$cp(ApiCallback apiCallback) {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        callback = apiCallback;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected final ProcessVerifyParams getRiskParams() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        ProcessVerifyParams processVerifyParams = (ProcessVerifyParams) this.riskParams.getValue();
        int i4 = getRequestBeneficiariesState + 61;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return processVerifyParams;
    }

    private static final ProcessVerifyParams riskParams_delegate$lambda$0(CommonRiskActivity commonRiskActivity) {
        Serializable serializableExtra;
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT >= 33) {
            Intent intent = commonRiskActivity.getIntent();
            if (intent != null) {
                return (ProcessVerifyParams) zzc$$ExternalSyntheticApiModelOutline0.m(intent, KeysConstants.KEY_RISK_PARAMS, ProcessVerifyParams.class);
            }
            return null;
        }
        Intent intent2 = commonRiskActivity.getIntent();
        if (intent2 != null) {
            int i2 = copydefault + 89;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            serializableExtra = intent2.getSerializableExtra(KeysConstants.KEY_RISK_PARAMS);
        } else {
            int i4 = getRequestBeneficiariesState + 75;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            serializableExtra = null;
        }
        if (serializableExtra instanceof ProcessVerifyParams) {
            return (ProcessVerifyParams) serializableExtra;
        }
        return null;
    }

    protected final boolean getHandleErrorBySelf() {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        getRequestBeneficiariesState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ((Boolean) this.handleErrorBySelf.getValue()).booleanValue();
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) this.handleErrorBySelf.getValue()).booleanValue();
        int i3 = copydefault + 89;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static final boolean handleErrorBySelf_delegate$lambda$1(CommonRiskActivity commonRiskActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 77;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = commonRiskActivity.getIntent();
        if (i3 != 0) {
            if (intent == null) {
                return true;
            }
        } else if (intent == null) {
            return false;
        }
        boolean booleanExtra = intent.getBooleanExtra(KeysConstants.KEY_HANDLE_ERROR_BY_SELF, false);
        int i4 = copydefault + 103;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return booleanExtra;
    }

    protected final boolean getHandleErrorByCaller() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            ((Boolean) this.handleErrorByCaller.getValue()).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) this.handleErrorByCaller.getValue()).booleanValue();
        int i3 = copydefault + 107;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        return zBooleanValue;
    }

    private static final boolean handleErrorByCaller_delegate$lambda$2(CommonRiskActivity commonRiskActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = commonRiskActivity.getIntent();
        if (i3 != 0) {
            if (intent == null) {
                return true;
            }
        } else if (intent == null) {
            return false;
        }
        int i4 = copydefault + 19;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return intent.getBooleanExtra(RiskConstant.KEY_HANDLE_ERROR_BY_CALLER, false);
    }

    private static void f(char[] cArr, int i, char[] cArr2, char c2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i5 = $11 + 65;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            int i7 = $10 + 87;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4037 - Color.red(0), (ViewConfiguration.getScrollBarSize() >> 8) + 31, (char) (19181 - Color.argb(0, 0, 0, 0)), 1912513118, false, $$r(b2, (byte) (b2 | Ascii.DLE), b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 7567, 11 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b3 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0) + 2459, 28 - (Process.myTid() >> 22), (char) View.MeasureSpec.makeMeasureSpec(0, 0), 931716605, false, $$r(b3, (byte) (b3 | 17), b3), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    i2 = 2;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 7568, 11 - TextUtils.indexOf("", ""), (char) KeyEvent.normalizeMetaState(0), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (ShareDataUIState ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component1) ^ (-3780477796495014671L)))));
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

    private static void g(byte[] bArr, boolean z, int[] iArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = component3;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 37;
                $11 = i8 % 128;
                if (i8 % i == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 658, 14 - ExpandableListView.getPackedPositionGroup(0L), (char) (65118 - KeyEvent.keyCodeFromString("")), 1951305196, false, "l", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i7 %= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i7])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(657 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 13, (char) (65118 - TextUtils.getCapsMode("", 0, 0)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i7++;
                }
                i = 2;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i9 = $11 + 31;
                $10 = i9 % 128;
                if (i9 % 2 == 0 ? bArr[iTrustedWebActivityService_Parcel.copydefault] != 1 : bArr[iTrustedWebActivityService_Parcel.copydefault] != 0) {
                    int i10 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3628 - AndroidCharacter.getMirror('0'), 28 - Drawable.resolveOpacity(0, 0), (char) TextUtils.getCapsMode("", 0, 0), 1180380354, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                    int i11 = $11 + 109;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 5 % 2;
                    }
                } else {
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr5 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 5);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 4502, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 35, (char) (27898 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), -1464227204, false, $$r(b4, b5, (byte) (b5 - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                    int i14 = $11 + 115;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = 3 % 3;
                    }
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(Process.getGidForName("") + 1860, ImageFormat.getBitsPerPixel(0) + 35, (char) TextUtils.indexOf("", ""), 80302927, false, $$r(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i16 = $10 + 75;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                System.arraycopy(cArr5, 0, cArr3, i4 - i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i4 >> i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i17 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i17, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i17);
            }
        }
        if (z) {
            char[] cArr7 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr7[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
                int i18 = $10 + 43;
                $11 = i18 % 128;
                int i19 = i18 % 2;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            int i20 = $10 + 107;
            $11 = i20 % 128;
            int i21 = i20 % 2;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i22 = $11 + 17;
                $10 = i22 % 128;
                int i23 = i22 % 2;
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity$observeData$1", f = "CommonRiskActivity.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component2;
        int component3;

        /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[PHI: r1
  0x0045: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
  0x0024: PHI (r3v1 int) = (r3v0 int), (r3v5 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity.ShareDataUIState.component2
                int r1 = r1 + 43
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity.ShareDataUIState.ShareDataUIState = r2
                int r1 = r1 % r0
                r2 = 1
                if (r1 != 0) goto L1c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r5.component3
                r4 = 61
                int r4 = r4 / 0
                if (r3 == 0) goto L45
                goto L24
            L1c:
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r5.component3
                if (r3 == 0) goto L45
            L24:
                if (r3 != r2) goto L3d
                int r1 = com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity.ShareDataUIState.component2
                int r1 = r1 + 101
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity.ShareDataUIState.ShareDataUIState = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L35
                kotlin.ResultKt.throwOnFailure(r6)
                goto L76
            L35:
                kotlin.ResultKt.throwOnFailure(r6)
                r6 = 0
                r6.hashCode()
                throw r6
            L3d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L45:
                kotlin.ResultKt.throwOnFailure(r6)
                com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity r6 = com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity.this
                androidx.lifecycle.ViewModel r6 = com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity.access$getViewModel$p$s71775401(r6)
                com.huawei.digitalpayment.consumer.risk.vm.RiskViewModel r6 = (com.huawei.digitalpayment.consumer.risk.vm.RiskViewModel) r6
                kotlinx.coroutines.flow.StateFlow r6 = r6.uiState()
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity$observeData$1$invokeSuspend$$inlined$map$1 r0 = new com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity$observeData$1$invokeSuspend$$inlined$map$1
                r0.<init>()
                kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
                kotlinx.coroutines.flow.Flow r6 = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(r0)
                com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity$ShareDataUIState$5 r0 = new com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity$ShareDataUIState$5
                com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity r3 = com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity.this
                r0.<init>()
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                r3 = r5
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r5.component3 = r2
                java.lang.Object r6 = r6.collect(r0, r3)
                if (r6 != r1) goto L76
                return r1
            L76:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity.ShareDataUIState.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = CommonRiskActivity.this.new ShareDataUIState(continuation);
            int i2 = ShareDataUIState + 25;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return shareDataUIState;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 21;
            component2 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                ShareDataUIState(coroutineScope2, continuation2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objShareDataUIState = ShareDataUIState(coroutineScope2, continuation2);
            int i3 = component2 + 37;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 27;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState shareDataUIState = (ShareDataUIState) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                shareDataUIState.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = shareDataUIState.invokeSuspend(unit);
            int i4 = component2 + 95;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/risk/ui/CommonRiskActivity$Companion;", "", "<init>", "()V", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Landroid/os/Bundle;", "getCallback", "()Lcom/huawei/common/listener/ApiCallback;", "setCallback", "(Lcom/huawei/common/listener/ApiCallback;)V", "ConsumerRiskModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static int component2 = 1;
        private static int component3;

        private Companion() {
        }

        public final ApiCallback<Bundle> getCallback() {
            int i = 2 % 2;
            int i2 = component3 + 47;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            ApiCallback<Bundle> apiCallbackAccess$getCallback$cp = CommonRiskActivity.access$getCallback$cp();
            if (i3 == 0) {
                int i4 = 19 / 0;
            }
            return apiCallbackAccess$getCallback$cp;
        }

        public final void setCallback(ApiCallback<Bundle> apiCallback) {
            int i = 2 % 2;
            int i2 = component3 + 19;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            CommonRiskActivity.access$setCallback$cp(apiCallback);
            int i4 = component2 + 27;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0141  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void dispatchResult(com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyResp r9) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity.dispatchResult(com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyResp):void");
    }

    protected Bundle buildBundle(ProcessVerifyResp result) {
        String loginType;
        Bundle extras;
        int i = 2 % 2;
        Bundle bundleBundleOf = BundleKt.bundleOf();
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            extras.remove(KeysConstants.KEY_RISK_PARAMS);
            bundleBundleOf.putAll(extras);
        }
        ProcessVerifyParams riskParams = getRiskParams();
        if (riskParams != null && (loginType = riskParams.getLoginType()) != null) {
            bundleBundleOf.putString(KeysConstants.KEY_LOGIN_TYPE, loginType);
        }
        bundleBundleOf.putString("token", result != null ? result.getToken() : null);
        if (result != null) {
            int i2 = copydefault + 119;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Map<String, Object> extResponse = result.getExtResponse();
            if (extResponse != null) {
                int i4 = getRequestBeneficiariesState + 113;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                handleExtResponse(bundleBundleOf, extResponse);
            }
        }
        if (result != null && result.getKycFields() != null) {
            bundleBundleOf.putString(KeysConstants.KEY_KYC_FIELDS, GsonUtils.toJson(result.getKycFields()));
        }
        L.d(this.TAG, "buildBundle: " + bundleBundleOf);
        return bundleBundleOf;
    }

    public void handleExtResponse(Bundle bundle, Map<String, ? extends Object> map) {
        String str;
        String str2;
        String str3;
        String str4;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(map, "");
        Object obj = null;
        if (map.containsKey(KeysConstants.KEY_SUPPORT_IDENTITY)) {
            Object obj2 = map.get(KeysConstants.KEY_SUPPORT_IDENTITY);
            bundle.putBoolean(KeysConstants.KEY_SUPPORT_IDENTITY, Boolean.parseBoolean(obj2 instanceof String ? (String) obj2 : null));
        }
        if (map.containsKey(KeysConstants.KEY_SUPPORT_QA)) {
            int i2 = copydefault + 125;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Object obj3 = map.get(KeysConstants.KEY_SUPPORT_QA);
            if (obj3 instanceof String) {
                int i4 = copydefault + 49;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                str4 = (String) obj3;
            } else {
                str4 = null;
            }
            bundle.putBoolean(KeysConstants.KEY_SUPPORT_QA, Boolean.parseBoolean(str4));
        }
        if (map.containsKey(KeysConstants.KEY_SUPPORT_BASE_QA)) {
            Object obj4 = map.get(KeysConstants.KEY_SUPPORT_BASE_QA);
            bundle.putBoolean(KeysConstants.KEY_SUPPORT_BASE_QA, Boolean.parseBoolean(obj4 instanceof String ? (String) obj4 : null));
        }
        if (map.containsKey(KeysConstants.KEY_SUPPORT_OTP)) {
            Object obj5 = map.get(KeysConstants.KEY_SUPPORT_OTP);
            if (obj5 instanceof String) {
                str3 = (String) obj5;
                int i6 = getRequestBeneficiariesState + 119;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
            } else {
                int i8 = copydefault + 119;
                getRequestBeneficiariesState = i8 % 128;
                int i9 = i8 % 2;
                str3 = null;
            }
            bundle.putBoolean(KeysConstants.KEY_SUPPORT_OTP, Boolean.parseBoolean(str3));
        }
        if (map.containsKey(KeysConstants.KEY_SUPPORT_PIN)) {
            int i10 = copydefault + 103;
            getRequestBeneficiariesState = i10 % 128;
            if (i10 % 2 == 0) {
                boolean z = map.get(KeysConstants.KEY_SUPPORT_PIN) instanceof String;
                obj.hashCode();
                throw null;
            }
            Object obj6 = map.get(KeysConstants.KEY_SUPPORT_PIN);
            bundle.putBoolean(KeysConstants.KEY_SUPPORT_PIN, Boolean.parseBoolean(obj6 instanceof String ? (String) obj6 : null));
        }
        if (map.containsKey(KeysConstants.KEY_SUPPORT_FINGERPRINT)) {
            int i11 = getRequestBeneficiariesState + 81;
            copydefault = i11 % 128;
            int i12 = i11 % 2;
            Object obj7 = map.get(KeysConstants.KEY_SUPPORT_FINGERPRINT);
            bundle.putBoolean(KeysConstants.KEY_SUPPORT_FINGERPRINT, Boolean.parseBoolean(obj7 instanceof String ? (String) obj7 : null));
        }
        if (map.containsKey(KeysConstants.KEY_SUPPORT_FACE)) {
            Object obj8 = map.get(KeysConstants.KEY_SUPPORT_FACE);
            if (obj8 instanceof String) {
                int i13 = copydefault + 37;
                getRequestBeneficiariesState = i13 % 128;
                int i14 = i13 % 2;
                str2 = (String) obj8;
            } else {
                str2 = null;
            }
            bundle.putBoolean(KeysConstants.KEY_SUPPORT_FACE, Boolean.parseBoolean(str2));
        }
        if (map.containsKey(KeysConstants.KEY_SUPPORT_FORGET_PIN)) {
            Object obj9 = map.get(KeysConstants.KEY_SUPPORT_FORGET_PIN);
            if (obj9 instanceof String) {
                int i15 = getRequestBeneficiariesState + 31;
                copydefault = i15 % 128;
                if (i15 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                str = (String) obj9;
            } else {
                str = null;
            }
            bundle.putBoolean(KeysConstants.KEY_SUPPORT_FORGET_PIN, Boolean.parseBoolean(str));
        }
        int i16 = getRequestBeneficiariesState + 125;
        copydefault = i16 % 128;
        if (i16 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    protected void dispatchError(BaseException error) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(error, "");
        if (getHandleErrorByCaller()) {
            Intent intent = new Intent();
            intent.putExtra("error", error);
            setResult(2, intent);
            finish();
            int i2 = copydefault + 19;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        if (showErrorByDialog(error)) {
            int i4 = copydefault + 37;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            showError(error);
            return;
        }
        ApiCallback<Bundle> apiCallback = callback;
        if (apiCallback != null) {
            apiCallback.onError(error);
        }
        callback = null;
        finish();
    }

    protected boolean showErrorByDialog(BaseException error) {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(error, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(error, "");
        if (callback != null && !getHandleErrorBySelf() && !Intrinsics.areEqual(error.getResponseCode(), "60700166")) {
            return false;
        }
        int i3 = getRequestBeneficiariesState + 47;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    private static final void showError$lambda$8(CommonRiskActivity commonRiskActivity, View view, String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        commonRiskActivity.finish();
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
    }

    protected void showError(BaseException error) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(error, "");
        DialogBox.builder().setContent(error.getMessage()).setSingleButton(true).setRightButtonListener(new DialogBox.DialogBoxListener() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public final void onButtonClick(View view, String str) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 45;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                CommonRiskActivity.$r8$lambda$Ijr5o8ZA3HJrk2gZXVaBSgjCnrM(this.f$0, view, str);
                int i5 = component2 + 13;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        }).build().show(getSupportFragmentManager(), "ErrorDialog");
        int i2 = getRequestBeneficiariesState + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    protected void retry(String token) {
        String loginType;
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 49;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        ProcessVerifyParams riskParams = getRiskParams();
        if (riskParams != null && (loginType = riskParams.getLoginType()) != null) {
            if (token == null) {
                int i4 = getRequestBeneficiariesState + 29;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 65 / 0;
                }
                str = "";
            } else {
                str = token;
            }
            ((RiskViewModel) this.viewModel).verify(new ProcessVerifyParams(loginType, null, null, null, null, null, null, null, null, str, TypedValues.PositionType.TYPE_POSITION_TYPE, null));
        }
        int i6 = copydefault + 117;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
    }

    protected void observeData() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ShareDataUIState(null), 3, null);
        int i2 = getRequestBeneficiariesState + 91;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 46 / 0;
        }
    }

    protected void initData() {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        ProcessVerifyParams riskParams = getRiskParams();
        if (riskParams == null) {
            L.d(this.TAG, "risk params is null!!!");
            finish();
            int i4 = copydefault + 87;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        ((RiskViewModel) this.viewModel).verify(riskParams);
        int i6 = copydefault + 33;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00cb  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = getRequestBeneficiariesState + 85;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            g(new byte[]{1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, true, new int[]{5, 26, 149, 0}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(new char[]{29875, 41823, 16953, 57292, 39055, 63971, 65115, 15467, 4988, 16988, 54430, 49791, 11913, 51353, 35524, 58505, 62421, 21359}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 105, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(19) + 64897), new char[]{575, 18728, 44826, 53245}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i4 = getRequestBeneficiariesState + 23;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 42, (char) (ViewConfiguration.getEdgeSlop() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 57 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) TextUtils.indexOf("", ""), -960739708, false, "component3", new Class[]{Context.class});
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
        int i6 = getRequestBeneficiariesState + 83;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1006:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x08b7 A[Catch: all -> 0x036f, TryCatch #42 {all -> 0x036f, blocks: (B:150:0x08b1, B:152:0x08b7, B:153:0x08e0, B:262:0x0e46, B:264:0x0e4c, B:265:0x0e78, B:398:0x1557, B:400:0x155d, B:401:0x1588, B:491:0x1a59, B:493:0x1a5f, B:494:0x1a8d, B:764:0x3130, B:766:0x3136, B:767:0x315b, B:801:0x3487, B:803:0x348d, B:804:0x34ba, B:781:0x32b4, B:783:0x32d7, B:784:0x332d, B:730:0x2df4, B:732:0x2dfa, B:733:0x2e24, B:824:0x358c, B:826:0x3592, B:827:0x35bd, B:829:0x35f7, B:830:0x3642, B:602:0x251d, B:604:0x2532, B:605:0x255e, B:607:0x2592, B:608:0x260f, B:579:0x219a, B:581:0x21a0, B:582:0x21c7, B:584:0x2201, B:585:0x224c, B:552:0x1ed0, B:554:0x1ee5, B:555:0x1f14, B:536:0x1cba, B:538:0x1cc0, B:539:0x1cea, B:19:0x018d, B:21:0x0193, B:22:0x01c3, B:24:0x02e0, B:26:0x0312, B:27:0x0369), top: B:924:0x018d }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x09c9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0a2c A[Catch: all -> 0x0dd9, TRY_ENTER, TRY_LEAVE, TryCatch #34 {all -> 0x0dd9, blocks: (B:157:0x0967, B:163:0x09bc, B:202:0x0c60, B:203:0x0c64, B:213:0x0ca9, B:210:0x0c8d, B:172:0x0a2c, B:190:0x0b33, B:193:0x0b83, B:198:0x0bf9, B:201:0x0c58), top: B:908:0x0967 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0c6a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0ca4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0ca9 A[Catch: all -> 0x0dd9, PHI: r2 r4 r6
  0x0ca9: PHI (r2v600 java.lang.Object[]) = (r2v599 java.lang.Object[]), (r2v620 java.lang.Object[]) binds: [B:211:0x0ca2, B:208:0x0c8a] A[DONT_GENERATE, DONT_INLINE]
  0x0ca9: PHI (r4v363 int) = (r4v362 int), (r4v379 int) binds: [B:211:0x0ca2, B:208:0x0c8a] A[DONT_GENERATE, DONT_INLINE]
  0x0ca9: PHI (r6v545 int) = (r6v544 int), (r6v567 int) binds: [B:211:0x0ca2, B:208:0x0c8a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #34 {all -> 0x0dd9, blocks: (B:157:0x0967, B:163:0x09bc, B:202:0x0c60, B:203:0x0c64, B:213:0x0ca9, B:210:0x0c8d, B:172:0x0a2c, B:190:0x0b33, B:193:0x0b83, B:198:0x0bf9, B:201:0x0c58), top: B:908:0x0967 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0e4c A[Catch: all -> 0x036f, TryCatch #42 {all -> 0x036f, blocks: (B:150:0x08b1, B:152:0x08b7, B:153:0x08e0, B:262:0x0e46, B:264:0x0e4c, B:265:0x0e78, B:398:0x1557, B:400:0x155d, B:401:0x1588, B:491:0x1a59, B:493:0x1a5f, B:494:0x1a8d, B:764:0x3130, B:766:0x3136, B:767:0x315b, B:801:0x3487, B:803:0x348d, B:804:0x34ba, B:781:0x32b4, B:783:0x32d7, B:784:0x332d, B:730:0x2df4, B:732:0x2dfa, B:733:0x2e24, B:824:0x358c, B:826:0x3592, B:827:0x35bd, B:829:0x35f7, B:830:0x3642, B:602:0x251d, B:604:0x2532, B:605:0x255e, B:607:0x2592, B:608:0x260f, B:579:0x219a, B:581:0x21a0, B:582:0x21c7, B:584:0x2201, B:585:0x224c, B:552:0x1ed0, B:554:0x1ee5, B:555:0x1f14, B:536:0x1cba, B:538:0x1cc0, B:539:0x1cea, B:19:0x018d, B:21:0x0193, B:22:0x01c3, B:24:0x02e0, B:26:0x0312, B:27:0x0369), top: B:924:0x018d }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0f07  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0f58 A[Catch: all -> 0x14ea, PHI: r1
  0x0f58: PHI (r1v454 java.lang.Object) = (r1v453 java.lang.Object), (r1v502 java.lang.Object) binds: [B:270:0x0f05, B:272:0x0f0a] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #40 {all -> 0x14ea, blocks: (B:269:0x0f01, B:277:0x0f58, B:281:0x0fc2, B:301:0x1046), top: B:920:0x0f01 }] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0f7f  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0fd8  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x102a  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x1387 A[Catch: all -> 0x14c6, TryCatch #22 {all -> 0x14c6, blocks: (B:333:0x137d, B:334:0x1381, B:336:0x1387, B:339:0x13a3, B:303:0x1078, B:321:0x1252, B:324:0x12a1, B:329:0x1316, B:332:0x1375), top: B:886:0x1078 }] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x155d A[Catch: all -> 0x036f, TryCatch #42 {all -> 0x036f, blocks: (B:150:0x08b1, B:152:0x08b7, B:153:0x08e0, B:262:0x0e46, B:264:0x0e4c, B:265:0x0e78, B:398:0x1557, B:400:0x155d, B:401:0x1588, B:491:0x1a59, B:493:0x1a5f, B:494:0x1a8d, B:764:0x3130, B:766:0x3136, B:767:0x315b, B:801:0x3487, B:803:0x348d, B:804:0x34ba, B:781:0x32b4, B:783:0x32d7, B:784:0x332d, B:730:0x2df4, B:732:0x2dfa, B:733:0x2e24, B:824:0x358c, B:826:0x3592, B:827:0x35bd, B:829:0x35f7, B:830:0x3642, B:602:0x251d, B:604:0x2532, B:605:0x255e, B:607:0x2592, B:608:0x260f, B:579:0x219a, B:581:0x21a0, B:582:0x21c7, B:584:0x2201, B:585:0x224c, B:552:0x1ed0, B:554:0x1ee5, B:555:0x1f14, B:536:0x1cba, B:538:0x1cc0, B:539:0x1cea, B:19:0x018d, B:21:0x0193, B:22:0x01c3, B:24:0x02e0, B:26:0x0312, B:27:0x0369), top: B:924:0x018d }] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x1615  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x1670  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x16cc A[Catch: all -> 0x1998, TRY_ENTER, TRY_LEAVE, TryCatch #60 {all -> 0x1998, blocks: (B:405:0x160f, B:412:0x1663, B:422:0x16cc), top: B:957:0x160f }] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x1893  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x1a5f A[Catch: all -> 0x036f, TryCatch #42 {all -> 0x036f, blocks: (B:150:0x08b1, B:152:0x08b7, B:153:0x08e0, B:262:0x0e46, B:264:0x0e4c, B:265:0x0e78, B:398:0x1557, B:400:0x155d, B:401:0x1588, B:491:0x1a59, B:493:0x1a5f, B:494:0x1a8d, B:764:0x3130, B:766:0x3136, B:767:0x315b, B:801:0x3487, B:803:0x348d, B:804:0x34ba, B:781:0x32b4, B:783:0x32d7, B:784:0x332d, B:730:0x2df4, B:732:0x2dfa, B:733:0x2e24, B:824:0x358c, B:826:0x3592, B:827:0x35bd, B:829:0x35f7, B:830:0x3642, B:602:0x251d, B:604:0x2532, B:605:0x255e, B:607:0x2592, B:608:0x260f, B:579:0x219a, B:581:0x21a0, B:582:0x21c7, B:584:0x2201, B:585:0x224c, B:552:0x1ed0, B:554:0x1ee5, B:555:0x1f14, B:536:0x1cba, B:538:0x1cc0, B:539:0x1cea, B:19:0x018d, B:21:0x0193, B:22:0x01c3, B:24:0x02e0, B:26:0x0312, B:27:0x0369), top: B:924:0x018d }] */
    /* JADX WARN: Removed duplicated region for block: B:509:0x1b2d  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x1b44 A[Catch: all -> 0x1c0c, TryCatch #53 {all -> 0x1c0c, blocks: (B:511:0x1b2f, B:513:0x1b44, B:514:0x1b73), top: B:943:0x1b2f, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:517:0x1b86 A[Catch: all -> 0x1c02, TryCatch #50 {all -> 0x1c02, blocks: (B:515:0x1b79, B:517:0x1b86, B:518:0x1bf7), top: B:938:0x1b79, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:544:0x1d75  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x1dc9  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x1eae  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x2059  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x2150  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x2359  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x23c8  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x2412  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x2428  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x24ff  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x2746  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x2c1b  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x2c65 A[Catch: all -> 0x2d1c, TryCatch #62 {all -> 0x2d1c, blocks: (B:693:0x2c5f, B:695:0x2c65, B:696:0x2c8c), top: B:961:0x2c5f, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:738:0x2eae  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x2efa  */
    /* JADX WARN: Removed duplicated region for block: B:746:0x2f57  */
    /* JADX WARN: Removed duplicated region for block: B:763:0x3110  */
    /* JADX WARN: Removed duplicated region for block: B:772:0x31ec  */
    /* JADX WARN: Removed duplicated region for block: B:775:0x3243  */
    /* JADX WARN: Removed duplicated region for block: B:780:0x3296  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:800:0x3467  */
    /* JADX WARN: Removed duplicated region for block: B:817:0x3554  */
    /* JADX WARN: Removed duplicated region for block: B:860:0x1b14 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:869:0x096d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v149 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v150 */
    /* JADX WARN: Type inference failed for: r10v151 */
    /* JADX WARN: Type inference failed for: r10v156 */
    /* JADX WARN: Type inference failed for: r10v157 */
    /* JADX WARN: Type inference failed for: r10v40, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v63 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v159 */
    /* JADX WARN: Type inference failed for: r11v160 */
    /* JADX WARN: Type inference failed for: r11v161 */
    /* JADX WARN: Type inference failed for: r11v162 */
    /* JADX WARN: Type inference failed for: r11v163 */
    /* JADX WARN: Type inference failed for: r11v164 */
    /* JADX WARN: Type inference failed for: r11v165 */
    /* JADX WARN: Type inference failed for: r11v174 */
    /* JADX WARN: Type inference failed for: r11v175 */
    /* JADX WARN: Type inference failed for: r11v176 */
    /* JADX WARN: Type inference failed for: r11v205 */
    /* JADX WARN: Type inference failed for: r11v206 */
    /* JADX WARN: Type inference failed for: r11v208, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v211 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v226 */
    /* JADX WARN: Type inference failed for: r11v227 */
    /* JADX WARN: Type inference failed for: r11v228 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v230 */
    /* JADX WARN: Type inference failed for: r11v231 */
    /* JADX WARN: Type inference failed for: r11v232 */
    /* JADX WARN: Type inference failed for: r11v233 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v106 */
    /* JADX WARN: Type inference failed for: r12v107 */
    /* JADX WARN: Type inference failed for: r12v108 */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v113 */
    /* JADX WARN: Type inference failed for: r12v114 */
    /* JADX WARN: Type inference failed for: r12v115 */
    /* JADX WARN: Type inference failed for: r12v116 */
    /* JADX WARN: Type inference failed for: r12v117 */
    /* JADX WARN: Type inference failed for: r12v127 */
    /* JADX WARN: Type inference failed for: r12v131, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v132 */
    /* JADX WARN: Type inference failed for: r12v133 */
    /* JADX WARN: Type inference failed for: r12v134 */
    /* JADX WARN: Type inference failed for: r12v135 */
    /* JADX WARN: Type inference failed for: r12v138 */
    /* JADX WARN: Type inference failed for: r12v144 */
    /* JADX WARN: Type inference failed for: r12v145 */
    /* JADX WARN: Type inference failed for: r12v146 */
    /* JADX WARN: Type inference failed for: r12v147 */
    /* JADX WARN: Type inference failed for: r12v148 */
    /* JADX WARN: Type inference failed for: r12v149 */
    /* JADX WARN: Type inference failed for: r12v150 */
    /* JADX WARN: Type inference failed for: r12v151 */
    /* JADX WARN: Type inference failed for: r12v152 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v87 */
    /* JADX WARN: Type inference failed for: r13v88 */
    /* JADX WARN: Type inference failed for: r13v89 */
    /* JADX WARN: Type inference failed for: r13v90 */
    /* JADX WARN: Type inference failed for: r13v91 */
    /* JADX WARN: Type inference failed for: r13v92 */
    /* JADX WARN: Type inference failed for: r13v93 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v101 */
    /* JADX WARN: Type inference failed for: r15v102 */
    /* JADX WARN: Type inference failed for: r15v103 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v106 */
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
    /* JADX WARN: Type inference failed for: r15v130 */
    /* JADX WARN: Type inference failed for: r15v131 */
    /* JADX WARN: Type inference failed for: r15v132 */
    /* JADX WARN: Type inference failed for: r15v133 */
    /* JADX WARN: Type inference failed for: r15v134 */
    /* JADX WARN: Type inference failed for: r15v136 */
    /* JADX WARN: Type inference failed for: r15v137 */
    /* JADX WARN: Type inference failed for: r15v138 */
    /* JADX WARN: Type inference failed for: r15v139 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v94 */
    /* JADX WARN: Type inference failed for: r15v99 */
    /* JADX WARN: Type inference failed for: r1v125, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v642, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v643, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r29v10 */
    /* JADX WARN: Type inference failed for: r29v11 */
    /* JADX WARN: Type inference failed for: r29v17 */
    /* JADX WARN: Type inference failed for: r29v18 */
    /* JADX WARN: Type inference failed for: r29v20 */
    /* JADX WARN: Type inference failed for: r29v21 */
    /* JADX WARN: Type inference failed for: r29v24 */
    /* JADX WARN: Type inference failed for: r29v25 */
    /* JADX WARN: Type inference failed for: r29v26 */
    /* JADX WARN: Type inference failed for: r29v27 */
    /* JADX WARN: Type inference failed for: r29v28 */
    /* JADX WARN: Type inference failed for: r29v30 */
    /* JADX WARN: Type inference failed for: r29v38 */
    /* JADX WARN: Type inference failed for: r29v39 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v40 */
    /* JADX WARN: Type inference failed for: r29v41 */
    /* JADX WARN: Type inference failed for: r29v42 */
    /* JADX WARN: Type inference failed for: r29v47 */
    /* JADX WARN: Type inference failed for: r29v48 */
    /* JADX WARN: Type inference failed for: r29v49 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r29v50 */
    /* JADX WARN: Type inference failed for: r29v51 */
    /* JADX WARN: Type inference failed for: r29v52 */
    /* JADX WARN: Type inference failed for: r29v55 */
    /* JADX WARN: Type inference failed for: r29v57 */
    /* JADX WARN: Type inference failed for: r29v58 */
    /* JADX WARN: Type inference failed for: r29v59 */
    /* JADX WARN: Type inference failed for: r29v6 */
    /* JADX WARN: Type inference failed for: r29v60 */
    /* JADX WARN: Type inference failed for: r29v61 */
    /* JADX WARN: Type inference failed for: r29v7 */
    /* JADX WARN: Type inference failed for: r2v432 */
    /* JADX WARN: Type inference failed for: r2v445 */
    /* JADX WARN: Type inference failed for: r2v446 */
    /* JADX WARN: Type inference failed for: r2v449, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v450 */
    /* JADX WARN: Type inference failed for: r2v452 */
    /* JADX WARN: Type inference failed for: r2v457 */
    /* JADX WARN: Type inference failed for: r2v529, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v617, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v618, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v666 */
    /* JADX WARN: Type inference failed for: r2v667 */
    /* JADX WARN: Type inference failed for: r2v668 */
    /* JADX WARN: Type inference failed for: r2v669 */
    /* JADX WARN: Type inference failed for: r2v670 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r33v100 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v24 */
    /* JADX WARN: Type inference failed for: r33v26 */
    /* JADX WARN: Type inference failed for: r33v27 */
    /* JADX WARN: Type inference failed for: r33v28 */
    /* JADX WARN: Type inference failed for: r33v38 */
    /* JADX WARN: Type inference failed for: r33v39 */
    /* JADX WARN: Type inference failed for: r33v40 */
    /* JADX WARN: Type inference failed for: r33v41 */
    /* JADX WARN: Type inference failed for: r33v48 */
    /* JADX WARN: Type inference failed for: r33v5 */
    /* JADX WARN: Type inference failed for: r33v50 */
    /* JADX WARN: Type inference failed for: r33v52 */
    /* JADX WARN: Type inference failed for: r33v54 */
    /* JADX WARN: Type inference failed for: r33v56 */
    /* JADX WARN: Type inference failed for: r33v57 */
    /* JADX WARN: Type inference failed for: r33v59 */
    /* JADX WARN: Type inference failed for: r33v6 */
    /* JADX WARN: Type inference failed for: r33v60 */
    /* JADX WARN: Type inference failed for: r33v64 */
    /* JADX WARN: Type inference failed for: r33v7 */
    /* JADX WARN: Type inference failed for: r33v75 */
    /* JADX WARN: Type inference failed for: r33v76 */
    /* JADX WARN: Type inference failed for: r33v77 */
    /* JADX WARN: Type inference failed for: r33v78 */
    /* JADX WARN: Type inference failed for: r33v79 */
    /* JADX WARN: Type inference failed for: r33v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r33v80 */
    /* JADX WARN: Type inference failed for: r33v81 */
    /* JADX WARN: Type inference failed for: r33v82 */
    /* JADX WARN: Type inference failed for: r33v83 */
    /* JADX WARN: Type inference failed for: r33v84 */
    /* JADX WARN: Type inference failed for: r33v85 */
    /* JADX WARN: Type inference failed for: r33v86 */
    /* JADX WARN: Type inference failed for: r33v87 */
    /* JADX WARN: Type inference failed for: r33v88 */
    /* JADX WARN: Type inference failed for: r33v89 */
    /* JADX WARN: Type inference failed for: r33v90 */
    /* JADX WARN: Type inference failed for: r33v91 */
    /* JADX WARN: Type inference failed for: r33v92 */
    /* JADX WARN: Type inference failed for: r33v93 */
    /* JADX WARN: Type inference failed for: r33v94 */
    /* JADX WARN: Type inference failed for: r33v95 */
    /* JADX WARN: Type inference failed for: r33v96 */
    /* JADX WARN: Type inference failed for: r33v97 */
    /* JADX WARN: Type inference failed for: r33v98 */
    /* JADX WARN: Type inference failed for: r33v99 */
    /* JADX WARN: Type inference failed for: r34v26 */
    /* JADX WARN: Type inference failed for: r34v7 */
    /* JADX WARN: Type inference failed for: r34v8 */
    /* JADX WARN: Type inference failed for: r47v0 */
    /* JADX WARN: Type inference failed for: r4v119 */
    /* JADX WARN: Type inference failed for: r4v364 */
    /* JADX WARN: Type inference failed for: r4v441 */
    /* JADX WARN: Type inference failed for: r4v444 */
    /* JADX WARN: Type inference failed for: r4v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v47, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v123, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v541 */
    /* JADX WARN: Type inference failed for: r5v542 */
    /* JADX WARN: Type inference failed for: r5v543 */
    /* JADX WARN: Type inference failed for: r5v560 */
    /* JADX WARN: Type inference failed for: r5v561 */
    /* JADX WARN: Type inference failed for: r5v564, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v565 */
    /* JADX WARN: Type inference failed for: r5v566 */
    /* JADX WARN: Type inference failed for: r5v567 */
    /* JADX WARN: Type inference failed for: r5v572 */
    /* JADX WARN: Type inference failed for: r5v575 */
    /* JADX WARN: Type inference failed for: r5v576 */
    /* JADX WARN: Type inference failed for: r5v577 */
    /* JADX WARN: Type inference failed for: r5v578 */
    /* JADX WARN: Type inference failed for: r5v579 */
    /* JADX WARN: Type inference failed for: r5v580 */
    /* JADX WARN: Type inference failed for: r5v581 */
    /* JADX WARN: Type inference failed for: r5v582 */
    /* JADX WARN: Type inference failed for: r5v583 */
    /* JADX WARN: Type inference failed for: r5v584 */
    /* JADX WARN: Type inference failed for: r5v585 */
    /* JADX WARN: Type inference failed for: r6v319 */
    /* JADX WARN: Type inference failed for: r6v623 */
    /* JADX WARN: Type inference failed for: r6v78, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v82 */
    /* JADX WARN: Type inference failed for: r7v291 */
    /* JADX WARN: Type inference failed for: r7v293 */
    /* JADX WARN: Type inference failed for: r7v294 */
    /* JADX WARN: Type inference failed for: r7v295 */
    /* JADX WARN: Type inference failed for: r7v297, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v298 */
    /* JADX WARN: Type inference failed for: r7v299 */
    /* JADX WARN: Type inference failed for: r7v300 */
    /* JADX WARN: Type inference failed for: r7v301 */
    /* JADX WARN: Type inference failed for: r7v302 */
    /* JADX WARN: Type inference failed for: r7v314 */
    /* JADX WARN: Type inference failed for: r7v315 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v341, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v366 */
    /* JADX WARN: Type inference failed for: r7v368, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v372 */
    /* JADX WARN: Type inference failed for: r7v373 */
    /* JADX WARN: Type inference failed for: r7v374 */
    /* JADX WARN: Type inference failed for: r7v375 */
    /* JADX WARN: Type inference failed for: r7v376 */
    /* JADX WARN: Type inference failed for: r7v377 */
    /* JADX WARN: Type inference failed for: r7v378 */
    /* JADX WARN: Type inference failed for: r7v379 */
    /* JADX WARN: Type inference failed for: r7v380 */
    /* JADX WARN: Type inference failed for: r7v381 */
    /* JADX WARN: Type inference failed for: r8v268 */
    /* JADX WARN: Type inference failed for: r8v274 */
    /* JADX WARN: Type inference failed for: r8v275 */
    /* JADX WARN: Type inference failed for: r8v276 */
    /* JADX WARN: Type inference failed for: r8v277 */
    /* JADX WARN: Type inference failed for: r8v278 */
    /* JADX WARN: Type inference failed for: r8v284 */
    /* JADX WARN: Type inference failed for: r8v289, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v290 */
    /* JADX WARN: Type inference failed for: r8v291 */
    /* JADX WARN: Type inference failed for: r8v294 */
    /* JADX WARN: Type inference failed for: r8v299 */
    /* JADX WARN: Type inference failed for: r8v322 */
    /* JADX WARN: Type inference failed for: r8v323 */
    /* JADX WARN: Type inference failed for: r8v324 */
    /* JADX WARN: Type inference failed for: r8v326 */
    /* JADX WARN: Type inference failed for: r8v334 */
    /* JADX WARN: Type inference failed for: r8v335 */
    /* JADX WARN: Type inference failed for: r8v336 */
    /* JADX WARN: Type inference failed for: r8v345, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r8v355 */
    /* JADX WARN: Type inference failed for: r8v356 */
    /* JADX WARN: Type inference failed for: r8v360 */
    /* JADX WARN: Type inference failed for: r8v371 */
    /* JADX WARN: Type inference failed for: r8v373 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v380 */
    /* JADX WARN: Type inference failed for: r8v381 */
    /* JADX WARN: Type inference failed for: r8v382 */
    /* JADX WARN: Type inference failed for: r8v383 */
    /* JADX WARN: Type inference failed for: r8v385 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v390 */
    /* JADX WARN: Type inference failed for: r8v393 */
    /* JADX WARN: Type inference failed for: r8v394 */
    /* JADX WARN: Type inference failed for: r8v395 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v400, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r8v403 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v433 */
    /* JADX WARN: Type inference failed for: r8v435, types: [int[]] */
    /* JADX WARN: Type inference failed for: r8v443, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r8v452 */
    /* JADX WARN: Type inference failed for: r8v454 */
    /* JADX WARN: Type inference failed for: r8v455 */
    /* JADX WARN: Type inference failed for: r8v456 */
    /* JADX WARN: Type inference failed for: r8v457 */
    /* JADX WARN: Type inference failed for: r8v458 */
    /* JADX WARN: Type inference failed for: r8v459 */
    /* JADX WARN: Type inference failed for: r8v460 */
    /* JADX WARN: Type inference failed for: r8v461 */
    /* JADX WARN: Type inference failed for: r8v462 */
    /* JADX WARN: Type inference failed for: r8v463 */
    /* JADX WARN: Type inference failed for: r8v464 */
    /* JADX WARN: Type inference failed for: r8v465 */
    /* JADX WARN: Type inference failed for: r8v466 */
    /* JADX WARN: Type inference failed for: r8v467 */
    /* JADX WARN: Type inference failed for: r8v468 */
    /* JADX WARN: Type inference failed for: r8v469 */
    /* JADX WARN: Type inference failed for: r8v470 */
    /* JADX WARN: Type inference failed for: r8v471 */
    /* JADX WARN: Type inference failed for: r8v472 */
    /* JADX WARN: Type inference failed for: r8v473 */
    /* JADX WARN: Type inference failed for: r8v474 */
    /* JADX WARN: Type inference failed for: r8v475 */
    /* JADX WARN: Type inference failed for: r8v476 */
    /* JADX WARN: Type inference failed for: r8v477 */
    /* JADX WARN: Type inference failed for: r8v478 */
    /* JADX WARN: Type inference failed for: r8v479 */
    /* JADX WARN: Type inference failed for: r8v480 */
    /* JADX WARN: Type inference failed for: r8v481 */
    /* JADX WARN: Type inference failed for: r8v482 */
    /* JADX WARN: Type inference failed for: r8v483 */
    /* JADX WARN: Type inference failed for: r8v484 */
    /* JADX WARN: Type inference failed for: r8v485 */
    /* JADX WARN: Type inference failed for: r8v486 */
    /* JADX WARN: Type inference failed for: r8v487 */
    /* JADX WARN: Type inference failed for: r8v488 */
    /* JADX WARN: Type inference failed for: r8v489 */
    /* JADX WARN: Type inference failed for: r8v490 */
    /* JADX WARN: Type inference failed for: r8v491 */
    /* JADX WARN: Type inference failed for: r8v492 */
    /* JADX WARN: Type inference failed for: r8v493 */
    /* JADX WARN: Type inference failed for: r8v494 */
    /* JADX WARN: Type inference failed for: r8v497 */
    /* JADX WARN: Type inference failed for: r8v498 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r49) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity.attachBaseContext(android.content.Context):void");
    }

    public static ProcessVerifyParams m10940$r8$lambda$0OCaXVkn7GQ51e7EO0z4ladZGw(CommonRiskActivity commonRiskActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        ProcessVerifyParams processVerifyParamsRiskParams_delegate$lambda$0 = riskParams_delegate$lambda$0(commonRiskActivity);
        int i4 = copydefault + 49;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return processVerifyParamsRiskParams_delegate$lambda$0;
    }

    public static void $r8$lambda$Ijr5o8ZA3HJrk2gZXVaBSgjCnrM(CommonRiskActivity commonRiskActivity, View view, String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        showError$lambda$8(commonRiskActivity, view, str);
        if (i3 != 0) {
            throw null;
        }
    }

    public static boolean m10941$r8$lambda$PpGPPLbapp8dONSvUdkUfUOZf8(CommonRiskActivity commonRiskActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        boolean zHandleErrorBySelf_delegate$lambda$1 = handleErrorBySelf_delegate$lambda$1(commonRiskActivity);
        int i4 = copydefault + 49;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return zHandleErrorBySelf_delegate$lambda$1;
    }

    public static boolean $r8$lambda$RBCZJ2BHIhgrphAMZwrI3NFiWJU(CommonRiskActivity commonRiskActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        boolean zHandleErrorByCaller_delegate$lambda$2 = handleErrorByCaller_delegate$lambda$2(commonRiskActivity);
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        int i5 = copydefault + 101;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return zHandleErrorByCaller_delegate$lambda$2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        getAsAtTimestamp = 0;
        ShareDataUIState();
        INSTANCE = new Companion(null);
        int i = component4 + 33;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 97;
        copydefault = i2 % 128;
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
        int i2 = copydefault + 37;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
    }

    static void ShareDataUIState() {
        ShareDataUIState = -3780477796495014671L;
        component2 = 1345463639;
        component1 = (char) 50417;
        component3 = new char[]{33469, 33301, 33377, 33385, 33378, 33443, 33320, 33319, 33759, 33757, 33324, 33316, 33748, 33756, 33755, 33755, 33756, 33759, 33336, 33299, 33339, 33754, 33314, 33283, 33281, 33316, 33758, 33754, 33759, 33313, 33315, 33518, 33429, 33427, 33428, 33517, 33513, 33512, 33427, 33468, 33428, 33518, 33515, 33426, 33430, 33428, 33428, 33518, 33514, 33426, 33468, 33428, 33515, 33512, 33512, 33427, 33430, 33515, 33426, 33469, 33468, 33467, 33429, 33429, 33468, 33426, 33511, 33514, 33428, 33426, 33514, 33516, 33429, 33428, 33430, 33470, 33427, 33512, 33424, 33424, 33512, 33515, 33513, 33511, 33514, 33513, 33512, 33512, 33514, 33428, 33428, 33517, 33519, 33517, 33428, 33517, 33425, 33425, 33429, 33519, 33430, 33427, 33516, 33428, 33427, 33516, 33428, 33428, 33515, 33426, 33427, 33514, 33512, 33512, 33515, 33516, 33514, 33427, 33467, 33468, 33428, 33517, 33516, 33425, 33467, 33468, 33427, 33514, 33516, 33515, 33516, 33429, 33425, 33424, 33428, 33430, 33427, 33515, 33514, 33515, 33514, 33425, 33468, 33470, 33430, 33519, 33519, 33514, 33425, 33426, 33515, 33429, 33429, 33514, 33515, 33516, 33511, 33512, 33513, 33479, 33516, 33514, 33429, 33428, 33512, 33513, 33513, 33425, 33427, 33427, 33426, 33518, 33432, 33430, 33517, 33429, 33432, 33518, 33514, 33514, 33515, 33519, 33521, 33515, 33515, 33519, 33521, 33518, 33427, 33429, 33516, 33514, 33428, 33430, 33429, 33433, 33367, 33463, 33409, 33371, 33355, 33358, 33365, 33368, 33366, 33372, 33366, 33366, 33466, 33460, 33371, 33517, 33464, 33465, 33467, 33462, 33454, 33457, 33457, 33449, 33471, 33419, 33461, 33458, 33418, 33414, 33462, 33369, 33737, 33729, 33790, 33780, 33782, 33785, 33787, 33791, 33788, 33790, 33788, 33779, 33784, 33728, 33463, 33291, 33287, 33289, 33290, 33288, 33287, 33288, 33288, 33289, 33291, 33476, 33514, 33514, 33514, 33515, 33512, 33514, 33516, 33516, 33515, 33512};
    }
}
