package com.huawei.digitalpayment.consumer.sfcui.api;

import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.http.GsmEndpoints;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.base.util.ImageLoader;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.sfcui.api.model.CostCalculatorApiResponse;
import com.huawei.digitalpayment.consumer.sfcui.api.model.CostCalculatorChargeBand;
import com.huawei.digitalpayment.consumer.sfcui.api.model.CostCalculatorLipaCostApiResponse;
import com.huawei.digitalpayment.consumer.sfcui.api.model.CostCalculatorLipaCostRequest;
import com.huawei.http.BaseRequest;
import com.safaricom.consumer.commons.resource.ErrorType;
import com.safaricom.consumer.commons.resource.Resource;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u0086@¢\u0006\u0002\u0010\bJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\fH\u0002¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/api/CostCalculatorService;", "", "<init>", "()V", "getAllCharges", "Lcom/safaricom/consumer/commons/resource/Resource;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorChargeBand;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLipaTransactionCost", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorLipaCostApiResponse;", KeysConstants.SHORT_CODE, "", "amount", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loggedInMsisdn", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CostCalculatorService {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 5 % 128;
    private static int copydefault = 1;

    @Inject
    public CostCalculatorService() {
    }

    public static final String access$loggedInMsisdn(CostCalculatorService costCalculatorService) {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String strComponent3 = costCalculatorService.component3();
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        int i5 = copydefault + 37;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return strComponent3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Function1<Throwable, Unit> {
        private static int ShareDataUIState = 1;
        private static int copydefault;
        final CostCalculatorService$getAllCharges$2$request$1 component1;

        @Override
        public Unit invoke(Throwable th) {
            int i = 2 % 2;
            int i2 = copydefault + 95;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState(th);
            Unit unit = Unit.INSTANCE;
            int i4 = ShareDataUIState + 115;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 76 / 0;
            }
            return unit;
        }

        public final void ShareDataUIState(Throwable th) {
            int i = 2 % 2;
            int i2 = copydefault + 21;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            cancel();
            int i4 = copydefault + 103;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }

        component2(CostCalculatorService$getAllCharges$2$request$1 costCalculatorService$getAllCharges$2$request$1) {
            this.component1 = costCalculatorService$getAllCharges$2$request$1;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function1<Throwable, Unit> {
        private static int component2 = 1;
        private static int copydefault;
        final CostCalculatorService$getLipaTransactionCost$2$request$1 component1;

        @Override
        public Unit invoke(Throwable th) {
            int i = 2 % 2;
            int i2 = component2 + 77;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            component3(th);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = copydefault + 29;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }

        public final void component3(Throwable th) {
            int i = 2 % 2;
            int i2 = copydefault + 79;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            cancel();
            int i4 = copydefault + 87;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 43 / 0;
            }
        }

        copydefault(CostCalculatorService$getLipaTransactionCost$2$request$1 costCalculatorService$getLipaTransactionCost$2$request$1) {
            this.component1 = costCalculatorService$getLipaTransactionCost$2$request$1;
        }
    }

    private final String component3() {
        int i = 2 % 2;
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        String str = "254" + StringsKt.takeLast(StringsKt.replaceFirst$default(string, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null), 9);
        int i2 = component2 + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.huawei.digitalpayment.consumer.sfcui.api.CostCalculatorService$getAllCharges$2$request$1] */
    public final Object getAllCharges(Continuation<? super Resource<? extends List<CostCalculatorChargeBand>>> continuation) {
        int i = 2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        ?? r3 = new HaProxyRequest<CostCalculatorApiResponse>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState;
                int i4 = i3 + 41;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 81;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    return GsmEndpoints.GSM_COST_CALCULATOR_ALL_CHARGES;
                }
                throw null;
            }
        };
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) r3, (String) null, (String) null, false, 7, (Object) null);
        r3.method(BaseRequest.Method.GET);
        ImageLoader.INSTANCE.sendRequest((BaseRequest) r3, new ApiCallback<CostCalculatorApiResponse>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public void onSuccess(CostCalculatorApiResponse costCalculatorApiResponse) {
                int i2 = 2 % 2;
                int i3 = component1 + 91;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(costCalculatorApiResponse);
                if (i4 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = ShareDataUIState + 5;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 18 / 0;
                }
            }

            public void onSuccess2(CostCalculatorApiResponse value) {
                int i2 = 2 % 2;
                int i3 = component1 + 105;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                super.onSuccess(value);
                if (cancellableContinuationImpl2.isActive()) {
                    if (value != null) {
                        int i5 = ShareDataUIState + 75;
                        component1 = i5 % 128;
                        int i6 = i5 % 2;
                        CancellableContinuation<Resource<? extends List<CostCalculatorChargeBand>>> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.success(value.getBody())));
                    } else {
                        CancellableContinuation<Resource<? extends List<CostCalculatorChargeBand>>> cancellableContinuation2 = cancellableContinuationImpl2;
                        Result.Companion companion2 = Result.INSTANCE;
                        cancellableContinuation2.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.error(new ErrorType.Network.Generic(null, null, null, null, false, 31, null))));
                    }
                }
                int i7 = component1 + 43;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 69;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                if (cancellableContinuationImpl2.isActive()) {
                    CancellableContinuation<Resource<? extends List<CostCalculatorChargeBand>>> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.error(new ErrorType.Network.Generic(null, null, null, null, false, 31, null))));
                }
                int i5 = component1 + 115;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        cancellableContinuationImpl2.invokeOnCancellation(new component2(r3));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            int i2 = component2 + 83;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        int i4 = component2 + 13;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return result;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.huawei.digitalpayment.consumer.sfcui.api.CostCalculatorService$getLipaTransactionCost$2$request$1] */
    public final Object getLipaTransactionCost(String str, int i, Continuation<? super Resource<CostCalculatorLipaCostApiResponse>> continuation) {
        int i2 = 2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        ?? r3 = new HaProxyRequest<CostCalculatorLipaCostApiResponse>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public String getApiPath() {
                int i3 = 2 % 2;
                int i4 = ShareDataUIState + 89;
                int i5 = i4 % 128;
                component1 = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 115;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                return GsmEndpoints.GSM_COST_CALCULATOR_LIPA_PAYBILL;
            }
        };
        CostCalculatorLipaCostRequest costCalculatorLipaCostRequest = new CostCalculatorLipaCostRequest(i, access$loggedInMsisdn(this), str);
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) r3, (String) null, (String) null, false, 7, (Object) null);
        r3.method(BaseRequest.Method.POST);
        r3.addParams(costCalculatorLipaCostRequest);
        ImageLoader.INSTANCE.sendRequest((BaseRequest) r3, new ApiCallback<CostCalculatorLipaCostApiResponse>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public void onSuccess(CostCalculatorLipaCostApiResponse costCalculatorLipaCostApiResponse) {
                int i3 = 2 % 2;
                int i4 = copydefault + 51;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                onSuccess2(costCalculatorLipaCostApiResponse);
                if (i5 == 0) {
                    throw null;
                }
            }

            public void onSuccess2(CostCalculatorLipaCostApiResponse value) {
                int i3 = 2 % 2;
                int i4 = ShareDataUIState + 67;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                super.onSuccess(value);
                if (cancellableContinuationImpl2.isActive()) {
                    int i6 = copydefault + 11;
                    ShareDataUIState = i6 % 128;
                    int i7 = i6 % 2;
                    if (value == null) {
                        CancellableContinuation<Resource<CostCalculatorLipaCostApiResponse>> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.error(new ErrorType.Network.Generic(null, null, null, null, false, 31, null))));
                    } else {
                        CancellableContinuation<Resource<CostCalculatorLipaCostApiResponse>> cancellableContinuation2 = cancellableContinuationImpl2;
                        Result.Companion companion2 = Result.INSTANCE;
                        cancellableContinuation2.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.success(value)));
                        int i8 = ShareDataUIState + 115;
                        copydefault = i8 % 128;
                        int i9 = i8 % 2;
                    }
                }
            }

            @Override
            public void onError(BaseException e) {
                int i3 = 2 % 2;
                int i4 = copydefault + 103;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    int i5 = 21 / 0;
                    if (!cancellableContinuationImpl2.isActive()) {
                        return;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    if (!cancellableContinuationImpl2.isActive()) {
                        return;
                    }
                }
                CancellableContinuation<Resource<CostCalculatorLipaCostApiResponse>> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.error(new ErrorType.Network.Generic(null, null, null, null, false, 31, null))));
                int i6 = ShareDataUIState + 47;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        cancellableContinuationImpl2.invokeOnCancellation(new copydefault(r3));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            int i3 = copydefault + 37;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            DebugProbesKt.probeCoroutineSuspended(continuation);
            if (i4 != 0) {
                int i5 = 71 / 0;
            }
        }
        return result;
    }

    static {
        int i = 5 % 2;
    }
}
