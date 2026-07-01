package com.huawei.digitalpayment.checkout.ui.viewmodel;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.base.common.utils.ToastUtils;
import com.google.common.base.Ascii;
import com.google.gson.JsonObject;
import com.google.mlkit.common.MlKitException;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.checkout.model.response.CheckoutResp;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\bJ\u001a\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/checkout/ui/viewmodel/EasyCheckoutViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/checkout/ui/viewmodel/EasyCheckoutViewModel$EasyCheckoutUiState;", "Lkotlinx/coroutines/flow/StateFlow;", "createPreOrder", "", "params", "", "", "", "EasyCheckoutUiState", "ConsumerCheckOutUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EasyCheckoutViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 39 % 128;
    private static int copydefault;
    private final MutableStateFlow<EasyCheckoutUiState> component3 = StateFlowKt.MutableStateFlow(new EasyCheckoutUiState(false, null, null, 7, null));

    public static final MutableStateFlow access$getUiState$p(EasyCheckoutViewModel easyCheckoutViewModel) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        MutableStateFlow<EasyCheckoutUiState> mutableStateFlow = easyCheckoutViewModel.component3;
        int i5 = i3 + 9;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        return mutableStateFlow;
    }

    public final StateFlow<EasyCheckoutUiState> uiState() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            MutableStateFlow<EasyCheckoutUiState> mutableStateFlow = this.component3;
            Intrinsics.checkNotNull(mutableStateFlow, "");
            return mutableStateFlow;
        }
        MutableStateFlow<EasyCheckoutUiState> mutableStateFlow2 = this.component3;
        Intrinsics.checkNotNull(mutableStateFlow2, "");
        int i3 = 75 / 0;
        return mutableStateFlow2;
    }

    public final void createPreOrder(Map<String, ? extends Object> params) {
        EasyCheckoutUiState value;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        MutableStateFlow<EasyCheckoutUiState> mutableStateFlow = this.component3;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, EasyCheckoutUiState.copy$default(value, true, null, null, 6, null)));
        PaymentRequest<CheckoutResp> paymentRequest = new PaymentRequest<CheckoutResp>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public Object convert(JsonObject jsonObject) {
                int i4 = 2 % 2;
                int i5 = copydefault + 101;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    convert(jsonObject);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CheckoutResp checkoutRespConvert = convert(jsonObject);
                int i6 = component2 + 29;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return checkoutRespConvert;
            }

            @Override
            public String getApiPath() {
                int i4 = 2 % 2;
                int i5 = copydefault + 109;
                int i6 = i5 % 128;
                component2 = i6;
                if (i5 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i7 = i6 + 67;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                return "createPreOrder";
            }

            @Override
            public CheckoutResp convert(JsonObject origin) {
                int i4 = 2 % 2;
                int i5 = copydefault + 121;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.checkNotNullParameter(origin, "");
                CheckoutResp checkoutResp = (CheckoutResp) SecureGsonUtils.fromJson(origin.toString(), CheckoutResp.class);
                if (checkoutResp != null) {
                    return checkoutResp;
                }
                CheckoutResp checkoutResp2 = new CheckoutResp();
                int i7 = component2 + 53;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                return checkoutResp2;
            }
        };
        paymentRequest.addParams((Map<String, Object>) params);
        sendRequest(paymentRequest, new ApiCallback<CheckoutResp>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(CheckoutResp checkoutResp) {
                int i4 = 2 % 2;
                int i5 = component2 + 29;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                onSuccess2(checkoutResp);
                if (i6 != 0) {
                    int i7 = 76 / 0;
                }
                int i8 = component1 + 89;
                component2 = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
            }

            public void onSuccess2(CheckoutResp value2) {
                Object value3;
                int i4 = 2 % 2;
                int i5 = component1 + 73;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                MutableStateFlow mutableStateFlowAccess$getUiState$p = EasyCheckoutViewModel.access$getUiState$p(EasyCheckoutViewModel.this);
                do {
                    value3 = mutableStateFlowAccess$getUiState$p.getValue();
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value3, EasyCheckoutUiState.copy$default((EasyCheckoutUiState) value3, false, null, value2, 2, null)));
                int i7 = component1 + 13;
                component2 = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException e) {
                Object value2;
                int i4 = 2 % 2;
                int i5 = component1 + 13;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                MutableStateFlow mutableStateFlowAccess$getUiState$p = EasyCheckoutViewModel.access$getUiState$p(EasyCheckoutViewModel.this);
                do {
                    value2 = mutableStateFlowAccess$getUiState$p.getValue();
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value2, EasyCheckoutUiState.copy$default((EasyCheckoutUiState) value2, false, e, null, 4, null)));
                int i7 = component1 + 59;
                component2 = i7 % 128;
                int i8 = i7 % 2;
            }
        });
        int i4 = ShareDataUIState + 53;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/checkout/ui/viewmodel/EasyCheckoutViewModel$EasyCheckoutUiState;", "", "loading", "", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;", "checkoutResp", "Lcom/huawei/digitalpayment/checkout/model/response/CheckoutResp;", "<init>", "(ZLcom/huawei/common/exception/BaseException;Lcom/huawei/digitalpayment/checkout/model/response/CheckoutResp;)V", "getLoading", "()Z", "getException", "()Lcom/huawei/common/exception/BaseException;", "getCheckoutResp", "()Lcom/huawei/digitalpayment/checkout/model/response/CheckoutResp;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "ConsumerCheckOutUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EasyCheckoutUiState {
        public static final int $stable = 8;
        private static char component1;
        private static char component3;
        private static int copy;
        private static char equals;
        private static char getAsAtTimestamp;
        private final CheckoutResp ShareDataUIState;
        private final boolean component2;
        private final BaseException copydefault;
        private static final byte[] $$c = {70, -47, -65, TarHeader.LF_BLK};
        private static final int $$f = 252;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {102, Ascii.FF, 98, 84, 3, -11, -57, TarHeader.LF_BLK, 13, 6, -7, -11, Ascii.SYN, -22, -2, Ascii.DC2, 1, -8, -7, -55, 60, -7, -2, 9, -7, 2, -55, 66, 2, -3, 7, -13, -5, 1, 13, PSSSigner.TRAILER_IMPLICIT, 69, 6, -12, 0, -8, Ascii.SI, -2, -9, -6, -53, Ascii.ESC, -5, 1, -4, -29, Ascii.GS, 43, -5, -23, 17, 17, -17, Ascii.FF, 6, Ascii.FF, -2, 3, -1, -1, -9, 9, 6, -65};
        private static final int $$e = 165;
        private static final byte[] $$a = {TarHeader.LF_CHR, -113, 92, 4, -2, Ascii.SI, -51, TarHeader.LF_SYMLINK, -50, TarHeader.LF_CHR, -32, Ascii.NAK, 4, -8, Ascii.SO, 1, -19, Ascii.FF, 3, -2, Ascii.SI, -34, 19, Ascii.FF, 4, -16, Ascii.SO, 1, -50, 35, 9, -9, 1, 3, -6, 6, -8, 17, -9, -4, Ascii.SO, -32, 33, -19, 19, -15, Ascii.FF, 1, 9};
        private static final int $$b = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
        private static int component4 = 0;
        private static int hashCode = 1;
        private static int getRequestBeneficiariesState = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(byte r6, byte r7, byte r8) {
            /*
                byte[] r0 = com.huawei.digitalpayment.checkout.ui.viewmodel.EasyCheckoutViewModel.EasyCheckoutUiState.$$c
                int r6 = r6 * 2
                int r6 = r6 + 111
                int r7 = r7 * 2
                int r1 = r7 + 1
                int r8 = r8 * 2
                int r8 = 3 - r8
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L17
                r4 = r7
                r6 = r8
                r3 = r2
                goto L2c
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L23:
                int r3 = r3 + 1
                int r8 = r8 + 1
                r4 = r0[r8]
                r5 = r8
                r8 = r6
                r6 = r5
            L2c:
                int r8 = r8 + r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.viewmodel.EasyCheckoutViewModel.EasyCheckoutUiState.$$g(byte, byte, byte):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(short r5, short r6, byte r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 3
                int r7 = 46 - r7
                int r6 = r6 * 4
                int r6 = 103 - r6
                int r5 = r5 * 12
                int r0 = r5 + 4
                byte[] r1 = com.huawei.digitalpayment.checkout.ui.viewmodel.EasyCheckoutViewModel.EasyCheckoutUiState.$$a
                byte[] r0 = new byte[r0]
                int r5 = r5 + 3
                r2 = 0
                if (r1 != 0) goto L18
                r4 = r7
                r3 = r2
                goto L2a
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r5) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L26:
                int r3 = r3 + 1
                r4 = r1[r7]
            L2a:
                int r7 = r7 + 1
                int r6 = r6 + r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.viewmodel.EasyCheckoutViewModel.EasyCheckoutUiState.a(short, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void c(int r7, int r8, byte r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 * 47
                int r8 = r8 + 10
                int r9 = r9 * 12
                int r9 = r9 + 99
                int r7 = r7 * 56
                int r7 = 60 - r7
                byte[] r0 = com.huawei.digitalpayment.checkout.ui.viewmodel.EasyCheckoutViewModel.EasyCheckoutUiState.$$d
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r9 = r7
                r3 = r8
                r4 = r2
                goto L2c
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r6
            L2c:
                int r7 = r7 + r3
                int r9 = r9 + 1
                r3 = r4
                r6 = r9
                r9 = r7
                r7 = r6
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.viewmodel.EasyCheckoutViewModel.EasyCheckoutUiState.c(int, int, byte, java.lang.Object[]):void");
        }

        public EasyCheckoutUiState(boolean z, BaseException baseException, CheckoutResp checkoutResp) {
            this.component2 = z;
            this.copydefault = baseException;
            this.ShareDataUIState = checkoutResp;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public EasyCheckoutUiState(boolean z, BaseException baseException, CheckoutResp checkoutResp, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = hashCode + 61;
                component4 = i2 % 128;
                int i3 = i2 % 2;
                z = false;
            }
            if ((i & 2) != 0) {
                int i4 = component4 + 1;
                hashCode = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                baseException = null;
            }
            if ((i & 4) != 0) {
                int i7 = 2 % 2;
                checkoutResp = null;
            }
            this(z, baseException, checkoutResp);
        }

        public final boolean getLoading() {
            int i = 2 % 2;
            int i2 = hashCode;
            int i3 = i2 + 107;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.component2;
            int i5 = i2 + 75;
            component4 = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final BaseException getException() {
            int i = 2 % 2;
            int i2 = hashCode + 5;
            component4 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.copydefault;
            }
            throw null;
        }

        public final CheckoutResp getCheckoutResp() {
            int i = 2 % 2;
            int i2 = hashCode + 105;
            int i3 = i2 % 128;
            component4 = i3;
            int i4 = i2 % 2;
            CheckoutResp checkoutResp = this.ShareDataUIState;
            int i5 = i3 + 63;
            hashCode = i5 % 128;
            int i6 = i5 % 2;
            return checkoutResp;
        }

        private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
            char[] cArr2 = new char[cArr.length];
            iNotificationSideChannelDefault.component3 = 0;
            char[] cArr3 = new char[2];
            while (iNotificationSideChannelDefault.component3 < cArr.length) {
                int i4 = $10 + 67;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
                    cArr3[0] = cArr[iNotificationSideChannelDefault.component3 / 0];
                    i2 = 1;
                } else {
                    cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
                    cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
                    i2 = 0;
                }
                int i5 = 58224;
                while (i2 < 16) {
                    int i6 = $10 + 85;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    char c2 = cArr3[1];
                    char c3 = cArr3[0];
                    try {
                        Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i5) ^ ((c3 << 4) + ((char) (((long) equals) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(getAsAtTimestamp)};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                        if (objCopydefault == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(844 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf("", "", 0, 0) + 32, (char) (23251 - (ViewConfiguration.getPressedStateDuration() >> 16)), 592652048, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component3)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(844 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 32 - Color.green(0), (char) (View.getDefaultSize(0, 0) + 23251), 592652048, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        i5 -= 40503;
                        i2++;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
                cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
                Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 417, TextUtils.indexOf("", "", 0) + 49, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 1194533216, false, "m", new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                int i8 = $11 + 23;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        /* JADX WARN: Type inference failed for: r2v36, types: [boolean, int] */
        public boolean equals(Object other) throws Throwable {
            Object[] objArr;
            Object[] objArr2;
            char c2;
            int i = 2 % 2;
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1956905591);
            if (objCopydefault == null) {
                int iIndexOf = TextUtils.indexOf("", "") + 1115;
                int iAlpha = 22 - Color.alpha(0);
                char defaultSize = (char) View.getDefaultSize(0, 0);
                byte b2 = $$a[15];
                Object[] objArr3 = new Object[1];
                a(b2, (byte) (b2 - 1), r3[14], objArr3);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iAlpha, defaultSize, -1308762862, false, (String) objArr3[0], null);
            }
            long j = ((Field) objCopydefault).getLong(null);
            Object[] objArr4 = new Object[1];
            b(21 - ImageFormat.getBitsPerPixel(0), new char[]{1675, 56350, 55832, 30712, 24940, 63857, 32137, 12517, 58944, 41537, 49195, 27563, 24766, 14609, 1188, 38481, 34233, 11513, 44259, 2397, 2074, 16824}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{12757, 52610, 45830, 50643, 28145, 50527, 31544, 63445, 33891, 40295, 44144, 12106, 54728, 63488, 44618, 59308}, objArr5);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(922195043);
            if (objCopydefault2 == null) {
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1115;
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 22;
                char cArgb = (char) Color.argb(0, 0, 0, 0);
                byte b3 = (byte) (-$$a[4]);
                Object[] objArr6 = new Object[1];
                a(b3, (byte) (b3 - 2), r17[30], objArr6);
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(jumpTapTimeout, maxKeyCode, cArgb, -206681338, false, (String) objArr6[0], null);
            }
            if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-940351087);
                if (objCopydefault3 == null) {
                    int iKeyCodeFromString = 1115 - KeyEvent.keyCodeFromString("");
                    int defaultSize2 = 22 - View.getDefaultSize(0, 0);
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    byte b4 = $$a[15];
                    byte b5 = (byte) (b4 - 1);
                    byte b6 = b4;
                    Object[] objArr7 = new Object[1];
                    a(b5, b6, (byte) (b6 - 1), objArr7);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, defaultSize2, cKeyCodeFromString, 44744436, false, (String) objArr7[0], null);
                }
                Object[] objArr8 = (Object[]) ((Field) objCopydefault3).get(null);
                int i2 = ((int[]) objArr8[2])[0];
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, new int[]{i2}, (String[]) objArr8[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i3 = ~iIdentityHashCode;
                int i4 = 706432503 + (((~((-268703281) | i3)) | (~((-216770756) | iIdentityHashCode))) * 520);
                int i5 = ~(216770755 | i3);
                int i6 = ~(iIdentityHashCode | 409968243);
                int i7 = ((i4 + ((i5 | i6) * (-1040))) + ((i6 | ((~(i3 | (-409968244))) | (-485474036))) * 520)) - 1419849987;
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
            } else {
                Object[] objArr9 = new Object[1];
                b((ViewConfiguration.getLongPressTimeout() >> 16) + 16, new char[]{42521, 24981, 52075, 63887, 12443, 62287, 1675, 56350, 61106, 31336, 26387, 12988, 61071, 49659, 30634, 56036}, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                b(16 - TextUtils.getCapsMode("", 0, 0), new char[]{35002, 53678, 63613, 28351, 25884, 64188, 23256, 46904, 33743, 1898, 48896, 43583, 37842, 25264, 64570, 23893}, objArr10);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
                int i10 = hashCode + 103;
                component4 = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr11 = {Integer.valueOf(iIntValue), -1419849987};
                    byte[] bArr = $$d;
                    byte b7 = bArr[16];
                    byte b8 = b7;
                    Object[] objArr12 = new Object[1];
                    c(b7, b8, b8, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    byte b9 = bArr[39];
                    byte b10 = b9;
                    Object[] objArr13 = new Object[1];
                    c(b9, b10, b10, objArr13);
                    objArr = (Object[]) cls3.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-940351087);
                    if (objCopydefault4 == null) {
                        int iIndexOf2 = 1115 - TextUtils.indexOf("", "", 0);
                        int iMyPid = (Process.myPid() >> 22) + 22;
                        char gidForName = (char) ((-1) - Process.getGidForName(""));
                        byte b11 = $$a[15];
                        byte b12 = (byte) (b11 - 1);
                        byte b13 = b11;
                        Object[] objArr14 = new Object[1];
                        a(b12, b13, (byte) (b13 - 1), objArr14);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf2, iMyPid, gidForName, 44744436, false, (String) objArr14[0], null);
                    }
                    ((Field) objCopydefault4).set(null, objArr);
                    try {
                        Object[] objArr15 = new Object[1];
                        b(((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.ETB, new char[]{1675, 56350, 55832, 30712, 24940, 63857, 32137, 12517, 58944, 41537, 49195, 27563, 24766, 14609, 1188, 38481, 34233, 11513, 44259, 2397, 2074, 16824}, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        b(TextUtils.indexOf("", "") + 15, new char[]{12757, 52610, 45830, 50643, 28145, 50527, 31544, 63445, 33891, 40295, 44144, 12106, 54728, 63488, 44618, 59308}, objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(922195043);
                        if (objCopydefault5 == null) {
                            int iIndexOf3 = 1115 - TextUtils.indexOf("", "");
                            int iResolveSize = 22 - View.resolveSize(0, 0);
                            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                            byte b14 = (byte) (-$$a[4]);
                            Object[] objArr17 = new Object[1];
                            a(b14, (byte) (b14 - 2), r15[30], objArr17);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf3, iResolveSize, cIndexOf, -206681338, false, (String) objArr17[0], null);
                        }
                        ((Field) objCopydefault5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1956905591);
                        if (objCopydefault6 == null) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1115;
                            int iIndexOf4 = 21 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                            byte b15 = $$a[15];
                            Object[] objArr18 = new Object[1];
                            a(b15, (byte) (b15 - 1), r6[14], objArr18);
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iMakeMeasureSpec, iIndexOf4, cIndexOf2, -1308762862, false, (String) objArr18[0], null);
                        }
                        ((Field) objCopydefault6).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i12 = ((int[]) objArr[1])[0];
            int i13 = ((int[]) objArr[2])[0];
            if (i13 == i12) {
                int i14 = component4 + 77;
                hashCode = i14 % 128;
                int i15 = i14 % 2;
                int i16 = ((int[]) objArr[0])[0];
                int i17 = ((int[]) objArr[2])[0];
                Object[] objArr19 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{i17}, (String[]) objArr[3]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i18 = ~iIdentityHashCode2;
                int i19 = i16 + (-1739779593) + (((~((-897153221) | i18)) | 336099520 | (~(703955732 | i18))) * (-1136)) + (((~((-897153221) | iIdentityHashCode2)) | (~(703955732 | iIdentityHashCode2)) | (~((-142902033) | i18))) * (-568)) + (((~(iIdentityHashCode2 | (-336099521))) | (~(i18 | (-703955733))) | (~(897153220 | i18))) * 568);
                int i20 = (i19 << 13) ^ i19;
                int i21 = i20 ^ (i20 >>> 17);
                ((int[]) objArr19[0])[0] = i21 ^ (i21 << 5);
                int i22 = ((int[]) objArr19[0])[0];
                int i23 = ((int[]) objArr19[2])[0];
                objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr19[1])[0]}, new int[]{i23}, (String[]) objArr19[3]};
                int iIdentityHashCode3 = System.identityHashCode(this);
                int i24 = i22 + ((((-531021405) + (((~((-23727873) | iIdentityHashCode3)) | (-169469616)) * (-948))) + ((~((~iIdentityHashCode3) | (-525825))) * (-948))) - 520705972);
                int i25 = (i24 << 13) ^ i24;
                int i26 = i25 ^ (i25 >>> 17);
                ((int[]) objArr2[0])[0] = i26 ^ (i26 << 5);
                c2 = 0;
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[3];
                if (strArr != null) {
                    int i27 = 0;
                    while (i27 < strArr.length) {
                        int i28 = hashCode + 11;
                        component4 = i28 % 128;
                        if (i28 % 2 != 0) {
                            arrayList.add(strArr[i27]);
                            i27 += 13;
                        } else {
                            arrayList.add(strArr[i27]);
                            i27++;
                        }
                    }
                }
                long j2 = -1;
                long j3 = 0;
                long j4 = (((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & ((long) (i12 ^ i13))) | (((long) 6) << 32) | (j3 - ((j3 >> 63) << 32));
                try {
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault7 == null) {
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionType(0L) + 6618, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 41, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                    Object[] objArr20 = {646122536, Long.valueOf(j4), arrayList, null, false, false};
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                    if (objCopydefault8 == null) {
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(View.combineMeasuredStates(0, 0) + 6562, 'h' - AndroidCharacter.getMirror('0'), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                    }
                    ((Method) objCopydefault8).invoke(objInvoke, objArr20);
                    int i29 = ((int[]) objArr[0])[0];
                    int i30 = ((int[]) objArr[2])[0];
                    Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{i30}, (String[]) objArr[3]};
                    int iIdentityHashCode4 = System.identityHashCode(this);
                    int i31 = ~iIdentityHashCode4;
                    int i32 = i29 + 232069893 + (((~((-5699796) | i31)) | 5373955) * 98) + (((~(i31 | (-187497693))) | (-5699796) | (~(187497692 | iIdentityHashCode4))) * (-49)) + (((~(iIdentityHashCode4 | (-5699796))) | (-192871648)) * 49);
                    int i33 = (i32 << 13) ^ i32;
                    int i34 = i33 ^ (i33 >>> 17);
                    ((int[]) objArr21[0])[0] = i34 ^ (i34 << 5);
                    int[] iArr = new int[i13];
                    int i35 = i13 - 1;
                    iArr[i35] = 1;
                    Toast.makeText((Context) null, iArr[((i13 * i35) % 2) - 1], 1).show();
                    int i36 = ((int[]) objArr21[0])[0];
                    int i37 = ((int[]) objArr21[2])[0];
                    objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr21[1])[0]}, new int[]{i37}, (String[]) objArr21[3]};
                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i38 = ~iElapsedRealtime;
                    int i39 = i36 + 268990742 + (((~(i38 | (-591822880))) | 785020367) * (-1042)) + (((-591822880) | iElapsedRealtime) * 521) + (((~(iElapsedRealtime | (-785020368))) | 210269632 | (~(i38 | (-17072145)))) * 521);
                    int i40 = (i39 << 13) ^ i39;
                    int i41 = i40 ^ (i40 >>> 17);
                    c2 = 0;
                    ((int[]) objArr2[0])[0] = i41 ^ (i41 << 5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            if (this == other) {
                int i42 = ((int[]) objArr2[c2])[c2];
                int i43 = i42 * i42;
                int i44 = -(609276438 * i42);
                int i45 = (i43 & i44) + (i43 | i44);
                int i46 = -(i42 * 796103202);
                int i47 = ((i45 ^ i46) + ((i46 & i45) << 1)) - (-2067723024);
                int i48 = i47 >> 25;
                int i49 = ((i48 ^ (-255)) + ((i48 & (-255)) << 1)) / 128;
                int i50 = (i49 ^ 1) + ((i49 & 1) << 1);
                int i51 = (i47 ^ i50) + ((i50 & i47) << 1);
                int i52 = i47 >> 16;
                int i53 = ((i52 & (-131071)) + (i52 | (-131071))) / 65536;
                int i54 = (-(((i53 ^ 1) + ((i53 & 1) << 1)) ^ i51)) + 5;
                int i55 = i54 >> 24;
                int i56 = ((i55 & (-511)) + (i55 | (-511))) / 256;
                int i57 = (i56 ^ 1) + ((i56 & 1) << 1);
                return 7785 / ((i54 & (-((i57 & 1) + (i57 | 1)))) * 1557);
            }
            if (!(other instanceof EasyCheckoutUiState)) {
                int i58 = hashCode + 81;
                component4 = i58 % 128;
                int i59 = i58 % 2;
                return false;
            }
            EasyCheckoutUiState easyCheckoutUiState = (EasyCheckoutUiState) other;
            if (this.component2 != easyCheckoutUiState.component2) {
                return false;
            }
            if (!Intrinsics.areEqual(this.copydefault, easyCheckoutUiState.copydefault)) {
                int i60 = hashCode + 125;
                component4 = i60 % 128;
                int i61 = i60 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.ShareDataUIState, easyCheckoutUiState.ShareDataUIState)) {
                return true;
            }
            int i62 = hashCode + 125;
            component4 = i62 % 128;
            int i63 = i62 % 2;
            return false;
        }

        static {
            copy = 0;
            ShareDataUIState();
            int i = getRequestBeneficiariesState + 31;
            copy = i % 128;
            int i2 = i % 2;
        }

        public EasyCheckoutUiState() {
            this(false, null, null, 7, null);
        }

        public static EasyCheckoutUiState copy$default(EasyCheckoutUiState easyCheckoutUiState, boolean z, BaseException baseException, CheckoutResp checkoutResp, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component4 + 49;
            int i4 = i3 % 128;
            hashCode = i4;
            if (i3 % 2 != 0 && (i & 1) != 0) {
                z = easyCheckoutUiState.component2;
            }
            if ((i & 2) != 0) {
                baseException = easyCheckoutUiState.copydefault;
            }
            if ((i & 4) != 0) {
                int i5 = i4 + 69;
                component4 = i5 % 128;
                int i6 = i5 % 2;
                checkoutResp = easyCheckoutUiState.ShareDataUIState;
                if (i6 != 0) {
                    int i7 = 51 / 0;
                }
            }
            return easyCheckoutUiState.copy(z, baseException, checkoutResp);
        }

        public final boolean component1() {
            int i = 2 % 2;
            int i2 = hashCode + 5;
            component4 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.component2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final BaseException component2() {
            int i = 2 % 2;
            int i2 = component4 + 123;
            int i3 = i2 % 128;
            hashCode = i3;
            int i4 = i2 % 2;
            BaseException baseException = this.copydefault;
            int i5 = i3 + 115;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            return baseException;
        }

        public final CheckoutResp component3() {
            int i = 2 % 2;
            int i2 = hashCode;
            int i3 = i2 + 55;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            CheckoutResp checkoutResp = this.ShareDataUIState;
            int i5 = i2 + 125;
            component4 = i5 % 128;
            if (i5 % 2 == 0) {
                return checkoutResp;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final EasyCheckoutUiState copy(boolean loading, BaseException exception, CheckoutResp checkoutResp) {
            int i = 2 % 2;
            EasyCheckoutUiState easyCheckoutUiState = new EasyCheckoutUiState(loading, exception, checkoutResp);
            int i2 = component4 + 57;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            return easyCheckoutUiState;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = component4 + 47;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = Boolean.hashCode(this.component2);
            BaseException baseException = this.copydefault;
            if (baseException == null) {
                int i4 = hashCode + 73;
                component4 = i4 % 128;
                iHashCode = 1 ^ (i4 % 2 != 0 ? 0 : 1);
            } else {
                iHashCode = baseException.hashCode();
            }
            CheckoutResp checkoutResp = this.ShareDataUIState;
            return (((iHashCode2 * 31) + iHashCode) * 31) + (checkoutResp != null ? checkoutResp.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "EasyCheckoutUiState(loading=" + this.component2 + ", exception=" + this.copydefault + ", checkoutResp=" + this.ShareDataUIState + ")";
            int i2 = component4 + 103;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        static void ShareDataUIState() {
            component1 = (char) 65317;
            component3 = (char) 9982;
            equals = (char) 9421;
            getAsAtTimestamp = (char) 16480;
        }
    }

    static {
        int i = 39 % 2;
    }
}
