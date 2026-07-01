package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
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

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/NameCheckApiService;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "checkRoamingCashoutAgentName", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/Resource;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto;", "nameCheckPayload", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/RoamingCashoutBody;", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/RoamingCashoutBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NameCheckApiService implements BaseModel {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Function1<Throwable, Unit> {
        private static int ShareDataUIState = 1;
        private static int component3;
        final NameCheckApiService$checkRoamingCashoutAgentName$2$request$1 copydefault;

        @Override
        public Unit invoke(Throwable th) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 39;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            component1(th);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                throw null;
            }
            int i4 = component3 + 7;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        public final void component1(Throwable th) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 125;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            cancel();
            int i4 = ShareDataUIState + 27;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 17 / 0;
            }
        }

        component2(NameCheckApiService$checkRoamingCashoutAgentName$2$request$1 nameCheckApiService$checkRoamingCashoutAgentName$2$request$1) {
            this.copydefault = nameCheckApiService$checkRoamingCashoutAgentName$2$request$1;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.NameCheckApiService$checkRoamingCashoutAgentName$2$request$1] */
    public final Object checkRoamingCashoutAgentName(RoamingCashoutBody roamingCashoutBody, Continuation<? super Resource<RoamingCashoutResponseDto>> continuation) {
        int i = 2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        ?? r3 = new HaProxyRequest<RoamingCashoutResponseDto>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 35;
                int i4 = i3 % 128;
                component1 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 113;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return MpesaGlobalApiUrl.ROAMING_CASHOUT_NAME_CHECK;
            }
        };
        r3.method(BaseRequest.Method.POST);
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) r3, (String) null, (String) null, false, 7, (Object) null);
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        RoamingCashoutRequestBody roamingCashoutRequestBody = new RoamingCashoutRequestBody(CollectionsKt.listOf(new RoamingCashoutRequestBody.Id("msisdn", StringsKt.replaceFirst$default(string, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "254", false, 4, (Object) null))), new RoamingCashoutRequestBody.Parts(CollectionsKt.listOf(new RoamingCashoutRequestBody.Parts.PaymentMethod(new RoamingCashoutRequestBody.Parts.PaymentMethod.Channel("MPESAAPP"))), new RoamingCashoutRequestBody.Parts.Request(new RoamingCashoutRequestBody.Parts.Request.Amount(roamingCashoutBody.getCurrencyTo(), roamingCashoutBody.getAmount()), new RoamingCashoutRequestBody.Parts.Request.ConvertedAmount(roamingCashoutBody.getCurrencyFrom(), "0"))), CollectionsKt.listOf(new RoamingCashoutRequestBody.RelatedMoneyTransfer(CollectionsKt.listOf(new RoamingCashoutRequestBody.Id("till_number", roamingCashoutBody.getAgentNumber())))));
        r3.addParams(GriverCacheDao.COLUMN_CACHE_ID, roamingCashoutRequestBody.getId());
        r3.addParams("parts", roamingCashoutRequestBody.getParts());
        r3.addParams("relatedMoneyTransfer", roamingCashoutRequestBody.getRelatedMoneyTransfer());
        sendRequest((BaseRequest) r3, new ApiCallback<RoamingCashoutResponseDto>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(RoamingCashoutResponseDto roamingCashoutResponseDto) {
                int i2 = 2 % 2;
                int i3 = component1 + 87;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(roamingCashoutResponseDto);
                int i5 = component3 + 113;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            public void onSuccess2(RoamingCashoutResponseDto value) {
                int i2 = 2 % 2;
                int i3 = component3 + 57;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    super.onSuccess(value);
                    if (cancellableContinuationImpl2.isActive()) {
                        CancellableContinuation<Resource<RoamingCashoutResponseDto>> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m13069constructorimpl(new Resource.Success(value)));
                    }
                    int i4 = component3 + 31;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
                super.onSuccess(value);
                cancellableContinuationImpl2.isActive();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                if (cancellableContinuationImpl2.isActive()) {
                    CancellableContinuation<Resource<RoamingCashoutResponseDto>> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m13069constructorimpl(new Resource.Error(new ErrorType.Network.Generic(e.getMessage(), null, null, 6, null))));
                    int i3 = component1 + 61;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                }
                int i5 = component3 + 53;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        cancellableContinuationImpl2.invokeOnCancellation(new component2(r3));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            int i2 = component1 + 123;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        int i4 = component1 + 87;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return result;
    }

    static {
        int i = 1 + 57;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
