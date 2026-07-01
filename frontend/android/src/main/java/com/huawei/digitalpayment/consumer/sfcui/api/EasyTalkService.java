package com.huawei.digitalpayment.consumer.sfcui.api;

import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.base.http.GsmEndpoints;
import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.base.util.ImageLoader;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DIYProductCatalogResponse;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkAirtimePurchaseRequest;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkMpesaPurchaseRequest;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkMpesaValidateRequest;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkMpesaValidateResponse;
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
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u0005H\u0086@¢\u0006\u0002\u0010\tJ\"\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00052\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u00052\u0006\u0010\f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u00052\u0006\u0010\f\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/api/EasyTalkService;", "", "<init>", "()V", "getDiyCatalog", "Lcom/safaricom/consumer/commons/resource/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYProductCatalogResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mpesaPreValidate", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkMpesaValidateResponse;", "payload", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkMpesaValidateRequest;", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkMpesaValidateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mpesaPurchase", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkMpesaPurchaseRequest;", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkMpesaPurchaseRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "airtimePurchase", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkAirtimePurchaseRequest;", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkAirtimePurchaseRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EasyTalkService {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @Inject
    public EasyTalkService() {
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Function1<Throwable, Unit> {
        private static int component1 = 0;
        private static int copydefault = 1;
        final EasyTalkService$getDiyCatalog$2$request$1 component2;

        @Override
        public Unit invoke(Throwable th) {
            int i = 2 % 2;
            int i2 = copydefault + 35;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            component1(th);
            Unit unit = Unit.INSTANCE;
            int i4 = copydefault + 61;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 45 / 0;
            }
            return unit;
        }

        public final void component1(Throwable th) {
            int i = 2 % 2;
            int i2 = component1 + 65;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            cancel();
            int i4 = copydefault + 119;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }

        component2(EasyTalkService$getDiyCatalog$2$request$1 easyTalkService$getDiyCatalog$2$request$1) {
            this.component2 = easyTalkService$getDiyCatalog$2$request$1;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class ShareDataUIState implements Function1<Throwable, Unit> {
        private static int component2 = 1;
        private static int copydefault;
        final EasyTalkService$mpesaPreValidate$2$request$1 component3;

        @Override
        public Unit invoke(Throwable th) {
            int i = 2 % 2;
            int i2 = component2 + 17;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            component2(th);
            Unit unit = Unit.INSTANCE;
            int i4 = component2 + 15;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void component2(Throwable th) {
            int i = 2 % 2;
            int i2 = copydefault + 77;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            cancel();
            int i4 = copydefault + 81;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }

        ShareDataUIState(EasyTalkService$mpesaPreValidate$2$request$1 easyTalkService$mpesaPreValidate$2$request$1) {
            this.component3 = easyTalkService$mpesaPreValidate$2$request$1;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Function1<Throwable, Unit> {
        private static int component2 = 0;
        private static int component3 = 1;
        final EasyTalkService$mpesaPurchase$2$request$1 copydefault;

        @Override
        public Unit invoke(Throwable th) {
            int i = 2 % 2;
            int i2 = component3 + 53;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            component3(th);
            Unit unit = Unit.INSTANCE;
            int i4 = component3 + 37;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void component3(Throwable th) {
            int i = 2 % 2;
            int i2 = component2 + 53;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            cancel();
            if (i3 == 0) {
                int i4 = 78 / 0;
            }
        }

        component1(EasyTalkService$mpesaPurchase$2$request$1 easyTalkService$mpesaPurchase$2$request$1) {
            this.copydefault = easyTalkService$mpesaPurchase$2$request$1;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function1<Throwable, Unit> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;
        final EasyTalkService$airtimePurchase$2$request$1 component2;

        @Override
        public Unit invoke(Throwable th) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 125;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            copydefault(th);
            Unit unit = Unit.INSTANCE;
            int i4 = copydefault + 47;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 49 / 0;
            }
            return unit;
        }

        public final void copydefault(Throwable th) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 85;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            cancel();
            int i4 = ShareDataUIState + 75;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        copydefault(EasyTalkService$airtimePurchase$2$request$1 easyTalkService$airtimePurchase$2$request$1) {
            this.component2 = easyTalkService$airtimePurchase$2$request$1;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.huawei.digitalpayment.consumer.sfcui.api.EasyTalkService$getDiyCatalog$2$request$1] */
    public final Object getDiyCatalog(Continuation<? super Resource<HaProxyResponse<List<DIYProductCatalogResponse>>>> continuation) {
        int i = 2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        ?? r3 = new HaProxyRequest<HaProxyResponse<List<? extends DIYProductCatalogResponse>>>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component2 + 87;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    return GsmEndpoints.GSM_EASY_TALK_DIY_CATALOG;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) r3, (String) null, (String) null, false, 7, (Object) null);
        r3.method(BaseRequest.Method.GET);
        ImageLoader.INSTANCE.sendRequest((BaseRequest) r3, new ApiCallback<HaProxyResponse<List<? extends DIYProductCatalogResponse>>>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(HaProxyResponse<List<? extends DIYProductCatalogResponse>> haProxyResponse) {
                int i2 = 2 % 2;
                int i3 = copydefault + 27;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2((HaProxyResponse<List<DIYProductCatalogResponse>>) haProxyResponse);
                int i5 = copydefault + 55;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(HaProxyResponse<List<DIYProductCatalogResponse>> value) {
                int i2 = 2 % 2;
                int i3 = copydefault + 5;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    super.onSuccess(value);
                    if (cancellableContinuationImpl2.isActive()) {
                        if (value != null) {
                            CancellableContinuation<Resource<HaProxyResponse<List<DIYProductCatalogResponse>>>> cancellableContinuation = cancellableContinuationImpl2;
                            Result.Companion companion = Result.INSTANCE;
                            cancellableContinuation.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.success(value)));
                        } else {
                            CancellableContinuation<Resource<HaProxyResponse<List<DIYProductCatalogResponse>>>> cancellableContinuation2 = cancellableContinuationImpl2;
                            Result.Companion companion2 = Result.INSTANCE;
                            cancellableContinuation2.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.error(new ErrorType.Network.Generic(null, null, null, null, false, 31, null))));
                            int i4 = copydefault + 69;
                            component3 = i4 % 128;
                            int i5 = i4 % 2;
                        }
                    }
                    int i6 = copydefault + 41;
                    component3 = i6 % 128;
                    int i7 = i6 % 2;
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
                int i3 = copydefault + 77;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    cancellableContinuationImpl2.isActive();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                if (cancellableContinuationImpl2.isActive()) {
                    CancellableContinuation<Resource<HaProxyResponse<List<DIYProductCatalogResponse>>>> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.error(new ErrorType.Network.Generic(null, null, e.getMessage(), null, false, 27, null))));
                    int i4 = component3 + 31;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        });
        cancellableContinuationImpl2.invokeOnCancellation(new component2(r3));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            int i2 = component2 + 121;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            DebugProbesKt.probeCoroutineSuspended(continuation);
            if (i3 == 0) {
                throw null;
            }
        }
        int i4 = component2 + 85;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return result;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.huawei.digitalpayment.consumer.sfcui.api.EasyTalkService$mpesaPreValidate$2$request$1] */
    public final Object mpesaPreValidate(EasyTalkMpesaValidateRequest easyTalkMpesaValidateRequest, Continuation<? super Resource<HaProxyResponse<EasyTalkMpesaValidateResponse>>> continuation) {
        int i = 2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        ?? r3 = new HaProxyRequest<HaProxyResponse<EasyTalkMpesaValidateResponse>>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 51;
                int i4 = i3 % 128;
                component2 = i4;
                if (i3 % 2 != 0) {
                    int i5 = 77 / 0;
                }
                int i6 = i4 + 95;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 46 / 0;
                }
                return "/ms-mpesa-purchase-wrapper/api/v1/validate";
            }
        };
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) r3, (String) null, (String) null, false, 7, (Object) null);
        r3.method(BaseRequest.Method.POST);
        r3.addParams(easyTalkMpesaValidateRequest);
        ImageLoader.INSTANCE.sendRequest((BaseRequest) r3, new ApiCallback<HaProxyResponse<EasyTalkMpesaValidateResponse>>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(HaProxyResponse<EasyTalkMpesaValidateResponse> haProxyResponse) {
                int i2 = 2 % 2;
                int i3 = component3 + 89;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(haProxyResponse);
                int i5 = component2 + 11;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 22 / 0;
                }
            }

            public void onSuccess2(HaProxyResponse<EasyTalkMpesaValidateResponse> value) {
                int i2 = 2 % 2;
                super.onSuccess(value);
                if (!(!cancellableContinuationImpl2.isActive())) {
                    int i3 = component3 + 15;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    if (value != null) {
                        CancellableContinuation<Resource<HaProxyResponse<EasyTalkMpesaValidateResponse>>> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.success(value)));
                    } else {
                        CancellableContinuation<Resource<HaProxyResponse<EasyTalkMpesaValidateResponse>>> cancellableContinuation2 = cancellableContinuationImpl2;
                        Result.Companion companion2 = Result.INSTANCE;
                        cancellableContinuation2.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.error(new ErrorType.Network.Generic(null, null, null, null, false, 31, null))));
                        int i5 = component2 + 41;
                        component3 = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component2 + 39;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                if (cancellableContinuationImpl2.isActive()) {
                    CancellableContinuation<Resource<HaProxyResponse<EasyTalkMpesaValidateResponse>>> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.error(new ErrorType.Network.Generic(null, null, e.getMessage(), null, false, 27, null))));
                    int i5 = component2 + 79;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
        });
        cancellableContinuationImpl2.invokeOnCancellation(new ShareDataUIState(r3));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            int i2 = component2 + 85;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            DebugProbesKt.probeCoroutineSuspended(continuation);
            if (i3 == 0) {
                int i4 = 25 / 0;
            }
        }
        int i5 = copydefault + 45;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return result;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.huawei.digitalpayment.consumer.sfcui.api.EasyTalkService$mpesaPurchase$2$request$1] */
    public final Object mpesaPurchase(EasyTalkMpesaPurchaseRequest easyTalkMpesaPurchaseRequest, Continuation<? super Resource<HaProxyResponse<Object>>> continuation) {
        int i = 2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        ?? r3 = new HaProxyRequest<HaProxyResponse<Object>>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 39;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 29;
                component1 = i6 % 128;
                if (i6 % 2 != 0) {
                    return GsmEndpoints.GSM_EASY_TALK_MPESA_PURCHASE;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) r3, (String) null, (String) null, false, 7, (Object) null);
        r3.method(BaseRequest.Method.POST);
        r3.addParams(easyTalkMpesaPurchaseRequest);
        ImageLoader.INSTANCE.sendRequest((BaseRequest) r3, new ApiCallback<HaProxyResponse<Object>>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void onSuccess(HaProxyResponse<Object> haProxyResponse) {
                int i2 = 2 % 2;
                int i3 = component3 + 69;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(haProxyResponse);
                int i5 = component3 + 119;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(HaProxyResponse<Object> value) {
                int i2 = 2 % 2;
                int i3 = component3 + 117;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    super.onSuccess(value);
                    int i4 = 84 / 0;
                    if (!cancellableContinuationImpl2.isActive()) {
                        return;
                    }
                } else {
                    super.onSuccess(value);
                    if (!cancellableContinuationImpl2.isActive()) {
                        return;
                    }
                }
                int i5 = ShareDataUIState + 119;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                if (value != null) {
                    CancellableContinuation<Resource<HaProxyResponse<Object>>> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.success(value)));
                } else {
                    CancellableContinuation<Resource<HaProxyResponse<Object>>> cancellableContinuation2 = cancellableContinuationImpl2;
                    Result.Companion companion2 = Result.INSTANCE;
                    cancellableContinuation2.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.error(new ErrorType.Network.Generic(null, null, null, null, false, 31, null))));
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component3 + 13;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    cancellableContinuationImpl2.isActive();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                if (cancellableContinuationImpl2.isActive()) {
                    CancellableContinuation<Resource<HaProxyResponse<Object>>> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.error(new ErrorType.Network.Generic(null, null, e.getMessage(), null, false, 27, null))));
                }
                int i4 = ShareDataUIState + 27;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        cancellableContinuationImpl2.invokeOnCancellation(new component1(r3));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            int i2 = copydefault + 101;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            DebugProbesKt.probeCoroutineSuspended(continuation);
            int i4 = copydefault + 113;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
        return result;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.huawei.digitalpayment.consumer.sfcui.api.EasyTalkService$airtimePurchase$2$request$1] */
    public final Object airtimePurchase(EasyTalkAirtimePurchaseRequest easyTalkAirtimePurchaseRequest, Continuation<? super Resource<HaProxyResponse<Object>>> continuation) {
        int i = 2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        ?? r3 = new HaProxyRequest<HaProxyResponse<Object>>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 23;
                int i4 = i3 % 128;
                component2 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 51;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    return GsmEndpoints.GSM_EASY_TALK_AIRTIME_PURCHASE;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) r3, (String) null, (String) null, false, 7, (Object) null);
        r3.method(BaseRequest.Method.POST);
        r3.addParams(easyTalkAirtimePurchaseRequest);
        ImageLoader.INSTANCE.sendRequest((BaseRequest) r3, new ApiCallback<HaProxyResponse<Object>>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(HaProxyResponse<Object> haProxyResponse) {
                int i2 = 2 % 2;
                int i3 = component3 + 125;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(haProxyResponse);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(HaProxyResponse<Object> value) {
                int i2 = 2 % 2;
                super.onSuccess(value);
                if (cancellableContinuationImpl2.isActive()) {
                    if (value == null) {
                        CancellableContinuation<Resource<HaProxyResponse<Object>>> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.error(new ErrorType.Network.Generic(null, null, null, null, false, 31, null))));
                        return;
                    }
                    int i3 = component3 + 5;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    CancellableContinuation<Resource<HaProxyResponse<Object>>> cancellableContinuation2 = cancellableContinuationImpl2;
                    Result.Companion companion2 = Result.INSTANCE;
                    cancellableContinuation2.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.success(value)));
                    int i5 = copydefault + 61;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onError(com.huawei.common.exception.BaseException r13) {
                /*
                    r12 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.api.EasyTalkService$airtimePurchase$2$1.component3
                    int r1 = r1 + 125
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.api.EasyTalkService$airtimePurchase$2$1.copydefault = r2
                    int r1 = r1 % r0
                    java.lang.String r2 = ""
                    if (r1 == 0) goto L23
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
                    super.onError(r13)
                    kotlinx.coroutines.CancellableContinuation<com.safaricom.consumer.commons.resource.Resource<com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse<java.lang.Object>>> r1 = r1
                    boolean r1 = r1.isActive()
                    r2 = 38
                    int r2 = r2 / 0
                    if (r1 == 0) goto L57
                    goto L31
                L23:
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
                    super.onError(r13)
                    kotlinx.coroutines.CancellableContinuation<com.safaricom.consumer.commons.resource.Resource<com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse<java.lang.Object>>> r1 = r1
                    boolean r1 = r1.isActive()
                    if (r1 == 0) goto L57
                L31:
                    kotlinx.coroutines.CancellableContinuation<com.safaricom.consumer.commons.resource.Resource<com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse<java.lang.Object>>> r1 = r1
                    kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                    kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
                    com.safaricom.consumer.commons.resource.Resource$Companion r2 = com.safaricom.consumer.commons.resource.Resource.INSTANCE
                    com.safaricom.consumer.commons.resource.ErrorType$Network$Generic r11 = new com.safaricom.consumer.commons.resource.ErrorType$Network$Generic
                    r4 = 0
                    r5 = 0
                    java.lang.String r6 = r13.getMessage()
                    r7 = 0
                    r8 = 0
                    r9 = 27
                    r10 = 0
                    r3 = r11
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                    com.safaricom.consumer.commons.resource.ErrorType r11 = (com.safaricom.consumer.commons.resource.ErrorType) r11
                    com.safaricom.consumer.commons.resource.Resource r13 = r2.error(r11)
                    java.lang.Object r13 = kotlin.Result.m13069constructorimpl(r13)
                    r1.resumeWith(r13)
                L57:
                    int r13 = com.huawei.digitalpayment.consumer.sfcui.api.EasyTalkService$airtimePurchase$2$1.copydefault
                    int r13 = r13 + 101
                    int r1 = r13 % 128
                    com.huawei.digitalpayment.consumer.sfcui.api.EasyTalkService$airtimePurchase$2$1.component3 = r1
                    int r13 = r13 % r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.api.EasyTalkService$airtimePurchase$2$1.onError(com.huawei.common.exception.BaseException):void");
            }
        });
        cancellableContinuationImpl2.invokeOnCancellation(new copydefault(r3));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
            int i2 = component2 + 61;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = copydefault + 81;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return result;
    }

    static {
        int i = 1 + 95;
        component3 = i % 128;
        int i2 = i % 2;
    }
}
