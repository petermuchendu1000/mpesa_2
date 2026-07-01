package com.huawei.digitalpayment.consumer.risk.vm;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyParams;
import com.huawei.digitalpayment.consumer.risk.bean.ProcessVerifyResp;
import com.huawei.digitalpayment.consumer.risk.bean.SendOtpParams;
import com.huawei.digitalpayment.consumer.risk.model.IRiskModel;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancelNotification;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0015H\u0016R\u0016\u0010\u0004\u001a\u00028\u0000X\u0094\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/risk/vm/BaseRiskViewModel;", ExifInterface.TAG_MODEL, "Lcom/huawei/digitalpayment/consumer/risk/model/IRiskModel;", "Landroidx/lifecycle/ViewModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/consumer/risk/model/IRiskModel;)V", "getModel", "()Lcom/huawei/digitalpayment/consumer/risk/model/IRiskModel;", "Lcom/huawei/digitalpayment/consumer/risk/model/IRiskModel;", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/risk/vm/RiskUiState;", "getUiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "verify", "", "params", "Lcom/huawei/digitalpayment/consumer/risk/bean/ProcessVerifyParams;", "sendOtp", "Lcom/huawei/digitalpayment/consumer/risk/bean/SendOtpParams;", "ConsumerRiskModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseRiskViewModel<Model extends IRiskModel> extends ViewModel {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final MutableStateFlow<RiskUiState> ShareDataUIState;
    private final Model component2;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseRiskViewModel(Model model) {
        Intrinsics.checkNotNullParameter(model, "");
        this.component2 = model;
        this.ShareDataUIState = StateFlowKt.MutableStateFlow(new RiskUiState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
    }

    protected Model getModel() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Model model = this.component2;
        int i5 = i3 + 13;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return model;
    }

    protected MutableStateFlow<RiskUiState> getUiState() {
        int i = 2 % 2;
        int i2 = component3 + 3;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        MutableStateFlow<RiskUiState> mutableStateFlow = this.ShareDataUIState;
        int i5 = i3 + 73;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableStateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public StateFlow<RiskUiState> uiState() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        MutableStateFlow<RiskUiState> uiState = getUiState();
        Intrinsics.checkNotNull(uiState, "");
        MutableStateFlow<RiskUiState> mutableStateFlow = uiState;
        int i4 = copydefault + 29;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return mutableStateFlow;
    }

    public void verify(ProcessVerifyParams params) {
        RiskUiState value;
        Resource resourceLoading;
        int i = 2 % 2;
        int i2 = component3 + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        MutableStateFlow<RiskUiState> uiState = getUiState();
        int i4 = copydefault + 87;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        do {
            value = uiState.getValue();
            resourceLoading = Resource.loading(null);
            Intrinsics.checkNotNullExpressionValue(resourceLoading, "");
        } while (!uiState.compareAndSet(value, RiskUiState.copy$default(value, resourceLoading, null, 2, null)));
        getModel().processVerify(params, new ApiCallback<ProcessVerifyResp>(this) {
            private static int component1 = 1;
            private static int copydefault;
            final BaseRiskViewModel<Model> ShareDataUIState;

            {
                this.ShareDataUIState = this;
            }

            @Override
            public void onSuccess(ProcessVerifyResp processVerifyResp) {
                int i6 = 2 % 2;
                int i7 = copydefault + 87;
                component1 = i7 % 128;
                int i8 = i7 % 2;
                Object obj = null;
                onSuccess2(processVerifyResp);
                if (i8 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i9 = copydefault + 85;
                component1 = i9 % 128;
                if (i9 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException e) {
                RiskUiState value2;
                Resource resourceError;
                int i6 = 2 % 2;
                int i7 = component1 + 9;
                copydefault = i7 % 128;
                if (i7 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    this.ShareDataUIState.getUiState();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                MutableStateFlow<RiskUiState> uiState2 = this.ShareDataUIState.getUiState();
                do {
                    value2 = uiState2.getValue();
                    resourceError = Resource.error(e, null);
                    Intrinsics.checkNotNullExpressionValue(resourceError, "");
                } while (!uiState2.compareAndSet(value2, RiskUiState.copy$default(value2, resourceError, null, 2, null)));
            }

            public void onSuccess2(ProcessVerifyResp value2) {
                RiskUiState value3;
                Resource resourceSuccess;
                int i6 = 2 % 2;
                MutableStateFlow<RiskUiState> uiState2 = this.ShareDataUIState.getUiState();
                int i7 = copydefault + 51;
                component1 = i7 % 128;
                int i8 = i7 % 2;
                do {
                    value3 = uiState2.getValue();
                    resourceSuccess = Resource.success(value2);
                    Intrinsics.checkNotNullExpressionValue(resourceSuccess, "");
                } while (!uiState2.compareAndSet(value3, RiskUiState.copy$default(value3, resourceSuccess, null, 2, null)));
                int i9 = component1 + 121;
                copydefault = i9 % 128;
                int i10 = i9 % 2;
            }
        });
    }

    public void sendOtp(SendOtpParams params) {
        RiskUiState value;
        Resource resourceLoading;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        MutableStateFlow<RiskUiState> uiState = getUiState();
        int i2 = component3 + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        do {
            value = uiState.getValue();
            resourceLoading = Resource.loading(null);
            Intrinsics.checkNotNullExpressionValue(resourceLoading, "");
        } while (!uiState.compareAndSet(value, RiskUiState.copy$default(value, null, resourceLoading, 1, null)));
        getModel().sendOtp(params, new ApiCallback<BaseResp>(this) {
            final BaseRiskViewModel<Model> component1;
            private static final byte[] $$c = {32, 13, -54, -47};
            private static final int $$f = 77;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {120, -62, 63, 57, Ascii.SI, 1, -60, TarHeader.LF_FIFO, Ascii.SO, 0, -4, 2, 4, 2, -48, TarHeader.LF_FIFO, 20, -6, Ascii.DLE, -14, Ascii.DLE, -65, SignedBytes.MAX_POWER_OF_TWO, -3, Ascii.DLE, -1, -6, 10, -59, 62, 10, -10, -50, Ascii.RS, 42, -10, -19, Ascii.ESC, 17, 3, -15, 9, 1, -31, 47, 2, 8, 4, -16, Ascii.DLE, 9, 2, Ascii.SI, 4, Ascii.FF, -18, 4, 4, -2, Ascii.ETB, -6, Ascii.VT};
            private static final int $$e = 56;
            private static final byte[] $$a = {Ascii.GS, -59, -25, -119, 37, 9, 33, 3, -17, 45, 35, -3, 4, 4, Ascii.SUB, TarHeader.LF_LINK, -3, 35, 1, Ascii.FS, Ascii.SO, 19, Ascii.SI, Ascii.SI, 7, Ascii.EM, Ascii.SYN, -50, Ascii.FS, 17, Ascii.EM, -5, 17, 17, Ascii.VT, 36, 7, Ascii.CAN};
            private static final int $$b = 142;
            private static int ShareDataUIState = 0;
            private static int component2 = 1;
            private static char[] component3 = {3095, 18173, 39384, 60587, 10125, 31334, 52556, 27, 23345, 44552, 57514, 15346, 36531, 49572, 5252, 28536, 41547, 62720, 18432, 33510, 54769, 10452, 48798, 62578, 11088, 24100, 38172, 51431, 32705, 45802, 59830, 7319, 21093, 35160, 15406, 29495, 42520, 3095, 18173, 39384, 60587, 10125, 31334, 52556, 27, 23359, 44555, 57588, 15247, 36491, 49588, 5252, 28532, 41552, 62762, 18456, 33520, 54726, 10455, 25514, 46720, 2415, 23631, 2864, 16835, 40683, 60302, 8354, 32068, 51833, 1873, 23563, 43310, 59341, 15597, 35212, 50835, 5025, 26705, 42348, 61960, 56758, 38744, 18528, 15634, 63078, 43977, 7395, 53745, 35475, 32767, 12669, 60018, 24339, 4105, 50495, 48858, 59170, 44490, 29412, 1930, 52395, 37211, 9825, 60273, 45099, 17703, 3018, 53492, 26036, 10885, 65449, 33861};
            private static long copydefault = 6034045519005304467L;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$g(byte r5, byte r6, short r7) {
                /*
                    int r7 = r7 + 117
                    int r6 = r6 * 2
                    int r0 = 1 - r6
                    int r5 = r5 + 4
                    byte[] r1 = com.huawei.digitalpayment.consumer.risk.vm.BaseRiskViewModel.AnonymousClass2.$$c
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r6 = 0 - r6
                    if (r1 != 0) goto L14
                    r4 = r6
                    r3 = r2
                    goto L26
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    int r5 = r5 + 1
                    if (r3 != r6) goto L22
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    return r5
                L22:
                    r4 = r1[r5]
                    int r3 = r3 + 1
                L26:
                    int r7 = r7 + r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.risk.vm.BaseRiskViewModel.AnonymousClass2.$$g(byte, byte, short):java.lang.String");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void a(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 + 10
                    byte[] r0 = com.huawei.digitalpayment.consumer.risk.vm.BaseRiskViewModel.AnonymousClass2.$$a
                    int r8 = r8 * 16
                    int r8 = r8 + 83
                    int r7 = r7 * 3
                    int r7 = 28 - r7
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r6
                    r4 = r2
                    goto L26
                L14:
                    r3 = r2
                L15:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r6) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L24:
                    r3 = r0[r7]
                L26:
                    int r8 = r8 + r3
                    int r7 = r7 + 1
                    int r8 = r8 + (-16)
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.risk.vm.BaseRiskViewModel.AnonymousClass2.a(byte, byte, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void c(int r5, int r6, byte r7, java.lang.Object[] r8) {
                /*
                    int r5 = r5 + 4
                    int r7 = r7 * 2
                    int r7 = r7 + 99
                    byte[] r0 = com.huawei.digitalpayment.consumer.risk.vm.BaseRiskViewModel.AnonymousClass2.$$d
                    int r6 = r6 * 38
                    int r1 = r6 + 11
                    byte[] r1 = new byte[r1]
                    int r6 = r6 + 10
                    r2 = -1
                    if (r0 != 0) goto L16
                    r7 = r5
                    r3 = r6
                    goto L2d
                L16:
                    r4 = r7
                    r7 = r5
                    r5 = r4
                L19:
                    int r2 = r2 + 1
                    byte r3 = (byte) r5
                    r1[r2] = r3
                    int r7 = r7 + 1
                    if (r2 != r6) goto L2b
                    java.lang.String r5 = new java.lang.String
                    r6 = 0
                    r5.<init>(r1, r6)
                    r8[r6] = r5
                    return
                L2b:
                    r3 = r0[r7]
                L2d:
                    int r5 = r5 + r3
                    int r5 = r5 + (-3)
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.risk.vm.BaseRiskViewModel.AnonymousClass2.c(int, int, byte, java.lang.Object[]):void");
            }

            {
                this.component1 = this;
            }

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i4 = 2 % 2;
                int i5 = component2 + 69;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                onSuccess2(baseResp);
                int i7 = component2 + 15;
                ShareDataUIState = i7 % 128;
                if (i7 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static void b(int i4, int i5, char c2, Object[] objArr) throws Throwable {
                int i6 = 2;
                int i7 = 2 % 2;
                cancelNotification cancelnotification = new cancelNotification();
                long[] jArr = new long[i4];
                cancelnotification.copydefault = 0;
                while (cancelnotification.copydefault < i4) {
                    int i8 = $11 + 69;
                    $10 = i8 % 128;
                    if (i8 % i6 != 0) {
                        int i9 = cancelnotification.copydefault;
                        try {
                            Object[] objArr2 = {Integer.valueOf(component3[i5 - i9])};
                            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                            if (objCopydefault == null) {
                                byte b2 = (byte) (-1);
                                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0) + 1758, 34 - Color.argb(0, 0, 0, 0), (char) ((-1) - TextUtils.lastIndexOf("", '0')), 1159210934, false, $$g(b2, (byte) (b2 + 1), (byte) $$c.length), new Class[]{Integer.TYPE});
                            }
                            Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i9), Long.valueOf(copydefault), Integer.valueOf(c2)};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                            if (objCopydefault2 == null) {
                                byte b3 = (byte) (-1);
                                byte b4 = (byte) (b3 + 1);
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3609, 30 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (View.combineMeasuredStates(0, 0) + 7171), 1951385784, false, $$g(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i9] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                            Object[] objArr4 = {cancelnotification, cancelnotification};
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                            if (objCopydefault3 == null) {
                                byte b5 = (byte) (-1);
                                byte b6 = (byte) (b5 + 1);
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4012, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23, (char) (Drawable.resolveOpacity(0, 0) + 27761), -1529629956, false, $$g(b5, b6, (byte) (b6 + 5)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objCopydefault3).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        int i10 = cancelnotification.copydefault;
                        Object[] objArr5 = {Integer.valueOf(component3[i5 + i10])};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                        if (objCopydefault4 == null) {
                            byte b7 = (byte) (-1);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((-16775458) - Color.rgb(0, 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 34, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 1159210934, false, $$g(b7, (byte) (b7 + 1), (byte) $$c.length), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objCopydefault4).invoke(null, objArr5)).longValue()), Long.valueOf(i10), Long.valueOf(copydefault), Integer.valueOf(c2)};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                        if (objCopydefault5 == null) {
                            byte b8 = (byte) (-1);
                            byte b9 = (byte) (b8 + 1);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(3608 - (ViewConfiguration.getTouchSlop() >> 8), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 28, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7171), 1951385784, false, $$g(b8, b9, b9), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i10] = ((Long) ((Method) objCopydefault5).invoke(null, objArr6)).longValue();
                        Object[] objArr7 = {cancelnotification, cancelnotification};
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                        if (objCopydefault6 == null) {
                            byte b10 = (byte) (-1);
                            byte b11 = (byte) (b10 + 1);
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4013, (ViewConfiguration.getEdgeSlop() >> 16) + 24, (char) (27809 - AndroidCharacter.getMirror('0')), -1529629956, false, $$g(b10, b11, (byte) (b11 + 5)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault6).invoke(null, objArr7);
                    }
                    i6 = 2;
                }
                char[] cArr = new char[i4];
                cancelnotification.copydefault = 0;
                while (cancelnotification.copydefault < i4) {
                    int i11 = $10 + 97;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                    Object[] objArr8 = {cancelnotification, cancelnotification};
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault7 == null) {
                        byte b12 = (byte) (-1);
                        byte b13 = (byte) (b12 + 1);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 24 - TextUtils.getTrimmedLength(""), (char) (27761 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), -1529629956, false, $$g(b12, b13, (byte) (b13 + 5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault7).invoke(null, objArr8);
                }
                objArr[0] = new String(cArr);
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x027c  */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onError(com.huawei.common.exception.BaseException r29) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1953
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.risk.vm.BaseRiskViewModel.AnonymousClass2.onError(com.huawei.common.exception.BaseException):void");
            }

            public void onSuccess2(BaseResp value2) {
                RiskUiState value3;
                Resource resourceSuccess;
                int i4 = 2 % 2;
                int i5 = component2 + 11;
                ShareDataUIState = i5 % 128;
                Object obj = null;
                if (i5 % 2 == 0) {
                    MutableStateFlow<RiskUiState> uiState2 = this.component1.getUiState();
                    do {
                        value3 = uiState2.getValue();
                        resourceSuccess = Resource.success(value2);
                        Intrinsics.checkNotNullExpressionValue(resourceSuccess, "");
                    } while (!uiState2.compareAndSet(value3, RiskUiState.copy$default(value3, null, resourceSuccess, 1, null)));
                    return;
                }
                this.component1.getUiState();
                obj.hashCode();
                throw null;
            }
        });
        int i4 = copydefault + 107;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
