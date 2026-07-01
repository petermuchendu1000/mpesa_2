package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.base.util.ImageLoader;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutRequestBody;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorType;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.Resource;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.RoamingCashoutBody;
import com.huawei.http.BaseRequest;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/ValidationApiService;", "", "<init>", "()V", "validateRoamingCashOut", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/Resource;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto;", "validationPayload", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/RoamingCashoutBody;", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/RoamingCashoutBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidationApiService {
    public static final int $stable = 0;
    private static int ShareDataUIState = 71 % 128;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Function1<Throwable, Unit> {
        private static int component1 = 0;
        private static int copydefault = 1;
        final ValidationApiService$validateRoamingCashOut$2$request$1 ShareDataUIState;

        @Override
        public Unit invoke(Throwable th) {
            Unit unit;
            int i = 2 % 2;
            int i2 = component1 + 23;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            component1(th);
            if (i3 == 0) {
                unit = Unit.INSTANCE;
                int i4 = 34 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i5 = component1 + 41;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        public final void component1(Throwable th) {
            int i = 2 % 2;
            int i2 = component1 + 123;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            cancel();
            int i4 = component1 + 89;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        component1(ValidationApiService$validateRoamingCashOut$2$request$1 validationApiService$validateRoamingCashOut$2$request$1) {
            this.ShareDataUIState = validationApiService$validateRoamingCashOut$2$request$1;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.ValidationApiService$validateRoamingCashOut$2$request$1] */
    public final Object validateRoamingCashOut(RoamingCashoutBody roamingCashoutBody, Continuation<? super Resource<RoamingCashoutResponseDto>> continuation) {
        int i = 2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        ?? r4 = new HaProxyRequest<RoamingCashoutResponseDto>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 109;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    return MpesaGlobalApiUrl.ROAMING_CASHOUT_PREVALIDATION;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        r4.method(BaseRequest.Method.POST);
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) r4, (String) null, (String) null, false, 7, (Object) null);
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        RoamingCashoutRequestBody roamingCashoutRequestBody = new RoamingCashoutRequestBody(CollectionsKt.listOf(new RoamingCashoutRequestBody.Id("msisdn", StringsKt.replaceFirst$default(string, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "254", false, 4, (Object) null))), new RoamingCashoutRequestBody.Parts(CollectionsKt.listOf(new RoamingCashoutRequestBody.Parts.PaymentMethod(new RoamingCashoutRequestBody.Parts.PaymentMethod.Channel("MPESAAPP"))), new RoamingCashoutRequestBody.Parts.Request(new RoamingCashoutRequestBody.Parts.Request.Amount(roamingCashoutBody.getCurrencyTo(), roamingCashoutBody.getAmount()), new RoamingCashoutRequestBody.Parts.Request.ConvertedAmount(roamingCashoutBody.getCurrencyFrom(), "0"))), null, 4, null);
        r4.addParams(GriverCacheDao.COLUMN_CACHE_ID, roamingCashoutRequestBody.getId());
        r4.addParams("parts", roamingCashoutRequestBody.getParts());
        ImageLoader.INSTANCE.sendRequest((BaseRequest) r4, new ApiCallback<RoamingCashoutResponseDto>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(RoamingCashoutResponseDto roamingCashoutResponseDto) {
                int i2 = 2 % 2;
                int i3 = component2 + 73;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(roamingCashoutResponseDto);
                if (i4 != 0) {
                    throw null;
                }
                int i5 = component2 + 61;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            public void onSuccess2(RoamingCashoutResponseDto value) {
                int i2 = 2 % 2;
                int i3 = copydefault + 3;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                super.onSuccess(value);
                if (cancellableContinuationImpl2.isActive()) {
                    CancellableContinuation<Resource<RoamingCashoutResponseDto>> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m13069constructorimpl(new Resource.Success(value)));
                    int i5 = copydefault + 65;
                    component2 = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 3 % 4;
                    }
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = copydefault + 91;
                component2 = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    cancellableContinuationImpl2.isActive();
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                if (cancellableContinuationImpl2.isActive()) {
                    CancellableContinuation<Resource<RoamingCashoutResponseDto>> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m13069constructorimpl(new Resource.Error(new ErrorType.Network.Generic(e.getMessage(), null, null, 6, null))));
                }
                int i4 = copydefault + 101;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        cancellableContinuationImpl2.invokeOnCancellation(new component1(r4));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            int i2 = copydefault + 1;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            DebugProbesKt.probeCoroutineSuspended(continuation);
            if (i3 != 0) {
                int i4 = 5 / 0;
            }
        }
        int i5 = component3 + 1;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return result;
    }

    static {
        int i = 71 % 2;
    }
}
