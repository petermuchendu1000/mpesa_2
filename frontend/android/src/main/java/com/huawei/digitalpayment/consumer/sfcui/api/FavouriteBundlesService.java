package com.huawei.digitalpayment.consumer.sfcui.api;

import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.http.GsmEndpoints;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.base.util.ImageLoader;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundleWrapper;
import com.huawei.digitalpayment.consumer.sfcui.api.model.FavouriteBundleResponse;
import com.huawei.digitalpayment.consumer.sfcui.api.model.FavouritesQueryRequest;
import com.huawei.digitalpayment.consumer.sfcui.api.model.FavouritesUpdateRequest;
import com.huawei.http.BaseRequest;
import com.safaricom.consumer.commons.helper.ConstantsKt;
import com.safaricom.consumer.commons.resource.ErrorType;
import com.safaricom.consumer.commons.resource.Resource;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@¢\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@¢\u0006\u0002\u0010\tJ\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0086@¢\u0006\u0002\u0010\u000eJ\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@¢\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/api/FavouriteBundlesService;", "", "<init>", "()V", "msisdn", "", "getBundlesFavouritesMenu", "Lcom/safaricom/consumer/commons/resource/Resource;", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundleWrapper;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavourites", "saveFavourites", "favouriteIds", "", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFavourites", "removeAllFavourites", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FavouriteBundlesService {
    public static final int $stable = 0;
    public static final String BUNDLES_PARAM = "bundles";

    public static final Companion INSTANCE;
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component3;
    private static int copydefault;
    private final String component2;

    @Inject
    public FavouriteBundlesService() {
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.component2 = "254" + StringsKt.takeLast(StringsKt.replaceFirst$default(string, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null), 9);
    }

    public static final String access$getMsisdn$p(FavouriteBundlesService favouriteBundlesService) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = favouriteBundlesService.component2;
        if (i4 != 0) {
            int i5 = 58 / 0;
        }
        int i6 = i3 + 75;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 97 / 0;
        }
        return str;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component3 implements Function1<Throwable, Unit> {
        private static int component1 = 0;
        private static int component2 = 1;
        final FavouriteBundlesService$getBundlesFavouritesMenu$2$request$1 ShareDataUIState;

        @Override
        public Unit invoke(Throwable th) {
            int i = 2 % 2;
            int i2 = component2 + 99;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            component2(th);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                int i4 = 83 / 0;
            }
            return unit;
        }

        public final void component2(Throwable th) {
            int i = 2 % 2;
            int i2 = component1 + 55;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                cancel();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            cancel();
            int i3 = component2 + 25;
            component1 = i3 % 128;
            int i4 = i3 % 2;
        }

        component3(FavouriteBundlesService$getBundlesFavouritesMenu$2$request$1 favouriteBundlesService$getBundlesFavouritesMenu$2$request$1) {
            this.ShareDataUIState = favouriteBundlesService$getBundlesFavouritesMenu$2$request$1;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class ShareDataUIState implements Function1<Throwable, Unit> {
        private static int component1 = 0;
        private static int copydefault = 1;
        final FavouriteBundlesService$getFavourites$2$request$1 ShareDataUIState;

        @Override
        public Unit invoke(Throwable th) {
            int i = 2 % 2;
            int i2 = copydefault + 13;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            component2(th);
            Unit unit = Unit.INSTANCE;
            int i4 = copydefault + 117;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void component2(Throwable th) {
            int i = 2 % 2;
            int i2 = component1 + 85;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            cancel();
            int i4 = component1 + 15;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }

        ShareDataUIState(FavouriteBundlesService$getFavourites$2$request$1 favouriteBundlesService$getFavourites$2$request$1) {
            this.ShareDataUIState = favouriteBundlesService$getFavourites$2$request$1;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Function1<Throwable, Unit> {
        private static int component1 = 1;
        private static int component3;
        final FavouriteBundlesService$saveFavourites$2$request$1 ShareDataUIState;

        @Override
        public Unit invoke(Throwable th) {
            int i = 2 % 2;
            int i2 = component1 + 1;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            component2(th);
            Unit unit = Unit.INSTANCE;
            int i4 = component3 + 31;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void component2(Throwable th) {
            int i = 2 % 2;
            int i2 = component1 + 17;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                cancel();
                int i3 = 51 / 0;
            } else {
                cancel();
            }
            int i4 = component3 + 39;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }

        component2(FavouriteBundlesService$saveFavourites$2$request$1 favouriteBundlesService$saveFavourites$2$request$1) {
            this.ShareDataUIState = favouriteBundlesService$saveFavourites$2$request$1;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function1<Throwable, Unit> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;
        final FavouriteBundlesService$updateFavourites$2$request$1 component1;

        @Override
        public Unit invoke(Throwable th) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 49;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            component1(th);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 8 / 0;
            }
            int i5 = ShareDataUIState + 107;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        public final void component1(Throwable th) {
            int i = 2 % 2;
            int i2 = component3 + 103;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                cancel();
                throw null;
            }
            cancel();
            int i3 = component3 + 99;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 54 / 0;
            }
        }

        copydefault(FavouriteBundlesService$updateFavourites$2$request$1 favouriteBundlesService$updateFavourites$2$request$1) {
            this.component1 = favouriteBundlesService$updateFavourites$2$request$1;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Function1<Throwable, Unit> {
        private static int component1 = 1;
        private static int component2;
        final FavouriteBundlesService$removeAllFavourites$2$request$1 copydefault;

        @Override
        public Unit invoke(Throwable th) {
            int i = 2 % 2;
            int i2 = component2 + 49;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            component3(th);
            Unit unit = Unit.INSTANCE;
            int i4 = component1 + 107;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void component3(Throwable th) {
            int i = 2 % 2;
            int i2 = component2 + 17;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            cancel();
            int i4 = component2 + 89;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 27 / 0;
            }
        }

        component1(FavouriteBundlesService$removeAllFavourites$2$request$1 favouriteBundlesService$removeAllFavourites$2$request$1) {
            this.copydefault = favouriteBundlesService$removeAllFavourites$2$request$1;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/api/FavouriteBundlesService$Companion;", "", "<init>", "()V", "BUNDLES_PARAM", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService$getBundlesFavouritesMenu$2$request$1] */
    public final Object getBundlesFavouritesMenu(Continuation<? super Resource<FavoriteBundleWrapper>> continuation) {
        int i = 2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        ?? r3 = new HaProxyRequest<FavouriteBundleResponse>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 111;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 11;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 83 / 0;
                }
                return GsmEndpoints.GSM_FETCH_FAVOURITE_BUNDLE_MENU;
            }
        };
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) r3, (String) null, (String) null, false, 7, (Object) null);
        r3.method(BaseRequest.Method.POST);
        r3.addParams(new FavouritesQueryRequest(access$getMsisdn$p(this), BUNDLES_PARAM));
        ImageLoader.INSTANCE.sendRequest((BaseRequest) r3, new ApiCallback<FavouriteBundleResponse>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(FavouriteBundleResponse favouriteBundleResponse) {
                int i2 = 2 % 2;
                int i3 = component1 + 87;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(favouriteBundleResponse);
                int i5 = component1 + 17;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
            
                r1 = r1;
                r2 = kotlin.Result.INSTANCE;
                r1.resumeWith(kotlin.Result.m13069constructorimpl(com.safaricom.consumer.commons.resource.Resource.INSTANCE.success(r11.getBody())));
                r11 = com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService$getBundlesFavouritesMenu$2$1.copydefault + 67;
                com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService$getBundlesFavouritesMenu$2$1.component1 = r11 % 128;
                r11 = r11 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
            
                r11 = r1;
                r0 = kotlin.Result.INSTANCE;
                r11.resumeWith(kotlin.Result.m13069constructorimpl(com.safaricom.consumer.commons.resource.Resource.INSTANCE.error(new com.safaricom.consumer.commons.resource.ErrorType.Network.Generic(null, null, null, null, false, 31, null))));
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
            
                if (r11 != null) goto L10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
            
                if (r11 != null) goto L10;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onSuccess2(com.huawei.digitalpayment.consumer.sfcui.api.model.FavouriteBundleResponse r11) {
                /*
                    r10 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    super.onSuccess(r11)
                    kotlinx.coroutines.CancellableContinuation<com.safaricom.consumer.commons.resource.Resource<com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundleWrapper>> r1 = r1
                    boolean r1 = r1.isActive()
                    if (r1 == 0) goto L66
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService$getBundlesFavouritesMenu$2$1.copydefault
                    int r1 = r1 + 79
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService$getBundlesFavouritesMenu$2$1.component1 = r2
                    int r1 = r1 % r0
                    if (r1 != 0) goto L20
                    r1 = 44
                    int r1 = r1 / 0
                    if (r11 == 0) goto L43
                    goto L22
                L20:
                    if (r11 == 0) goto L43
                L22:
                    kotlinx.coroutines.CancellableContinuation<com.safaricom.consumer.commons.resource.Resource<com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundleWrapper>> r1 = r1
                    kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                    kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
                    com.safaricom.consumer.commons.resource.Resource$Companion r2 = com.safaricom.consumer.commons.resource.Resource.INSTANCE
                    com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundleWrapper r11 = r11.getBody()
                    com.safaricom.consumer.commons.resource.Resource r11 = r2.success(r11)
                    java.lang.Object r11 = kotlin.Result.m13069constructorimpl(r11)
                    r1.resumeWith(r11)
                    int r11 = com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService$getBundlesFavouritesMenu$2$1.copydefault
                    int r11 = r11 + 67
                    int r1 = r11 % 128
                    com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService$getBundlesFavouritesMenu$2$1.component1 = r1
                    int r11 = r11 % r0
                    goto L66
                L43:
                    kotlinx.coroutines.CancellableContinuation<com.safaricom.consumer.commons.resource.Resource<com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundleWrapper>> r11 = r1
                    kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11
                    kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                    com.safaricom.consumer.commons.resource.Resource$Companion r0 = com.safaricom.consumer.commons.resource.Resource.INSTANCE
                    com.safaricom.consumer.commons.resource.ErrorType$Network$Generic r9 = new com.safaricom.consumer.commons.resource.ErrorType$Network$Generic
                    r2 = 0
                    r3 = 0
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 31
                    r8 = 0
                    r1 = r9
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                    com.safaricom.consumer.commons.resource.ErrorType r9 = (com.safaricom.consumer.commons.resource.ErrorType) r9
                    com.safaricom.consumer.commons.resource.Resource r0 = r0.error(r9)
                    java.lang.Object r0 = kotlin.Result.m13069constructorimpl(r0)
                    r11.resumeWith(r0)
                L66:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService$getBundlesFavouritesMenu$2$1.onSuccess2(com.huawei.digitalpayment.consumer.sfcui.api.model.FavouriteBundleResponse):void");
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component1 + 109;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
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
                    CancellableContinuation<Resource<FavoriteBundleWrapper>> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.error(new ErrorType.Network.Generic(null, null, null, null, false, 31, null))));
                    int i4 = component1 + 51;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        });
        cancellableContinuationImpl2.invokeOnCancellation(new component3(r3));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            int i2 = component3 + 107;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            DebugProbesKt.probeCoroutineSuspended(continuation);
            int i4 = ShareDataUIState + 81;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = ShareDataUIState + 103;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return result;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService$getFavourites$2$request$1] */
    public final Object getFavourites(Continuation<? super Resource<FavoriteBundleWrapper>> continuation) {
        int i = 2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        ?? r3 = new HaProxyRequest<FavouriteBundleResponse>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component2 + 41;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    return GsmEndpoints.GSM_FETCH_USER_FAVOURITES_BUNDLE;
                }
                throw null;
            }
        };
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) r3, (String) null, (String) null, false, 7, (Object) null);
        r3.method(BaseRequest.Method.POST);
        r3.addParams(new FavouritesQueryRequest(access$getMsisdn$p(this), BUNDLES_PARAM));
        ImageLoader.INSTANCE.sendRequest((BaseRequest) r3, new ApiCallback<FavouriteBundleResponse>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(FavouriteBundleResponse favouriteBundleResponse) {
                int i2 = 2 % 2;
                int i3 = copydefault + 11;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(favouriteBundleResponse);
                int i5 = copydefault + 49;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(FavouriteBundleResponse value) {
                int i2 = 2 % 2;
                int i3 = component3 + 5;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                super.onSuccess(value);
                if (cancellableContinuationImpl2.isActive()) {
                    int i5 = component3 + 85;
                    copydefault = i5 % 128;
                    if (i5 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (value != null) {
                        CancellableContinuation<Resource<FavoriteBundleWrapper>> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.success(value.getBody())));
                    } else {
                        CancellableContinuation<Resource<FavoriteBundleWrapper>> cancellableContinuation2 = cancellableContinuationImpl2;
                        Result.Companion companion2 = Result.INSTANCE;
                        cancellableContinuation2.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.error(new ErrorType.Network.Generic(null, null, null, null, false, 31, null))));
                    }
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = copydefault + 91;
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
                    CancellableContinuation<Resource<FavoriteBundleWrapper>> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.error(new ErrorType.Network.Generic(null, null, null, null, false, 31, null))));
                }
                int i4 = copydefault + 1;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }
        });
        cancellableContinuationImpl2.invokeOnCancellation(new ShareDataUIState(r3));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            int i2 = component3 + 99;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            DebugProbesKt.probeCoroutineSuspended(continuation);
            if (i3 == 0) {
                int i4 = 26 / 0;
            }
        }
        return result;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService$saveFavourites$2$request$1] */
    public final Object saveFavourites(Set<String> set, Continuation<? super Resource<FavoriteBundleWrapper>> continuation) {
        int i = 2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        ?? r3 = new HaProxyRequest<FavouriteBundleResponse>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 71;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 59 / 0;
                }
                int i6 = i3 + 53;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 63 / 0;
                }
                return GsmEndpoints.GSM_SAVE_USER_FAVOURITES_BUNDLE;
            }
        };
        String strJoinToString$default = CollectionsKt.joinToString$default(set, ConstantsKt.COMMA_SEPARATOR, null, null, 0, null, null, 62, null);
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) r3, (String) null, (String) null, false, 7, (Object) null);
        r3.method(BaseRequest.Method.POST);
        r3.addParams(new FavouritesUpdateRequest(strJoinToString$default, access$getMsisdn$p(this), BUNDLES_PARAM));
        ImageLoader.INSTANCE.sendRequest((BaseRequest) r3, new ApiCallback<FavouriteBundleResponse>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(FavouriteBundleResponse favouriteBundleResponse) {
                int i2 = 2 % 2;
                int i3 = component2 + 79;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(favouriteBundleResponse);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(FavouriteBundleResponse value) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 117;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                super.onSuccess(value);
                if (cancellableContinuationImpl2.isActive()) {
                    int i5 = component2 + 113;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    CancellableContinuation<Resource<FavoriteBundleWrapper>> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.success(value.getBody())));
                    int i7 = component2 + 65;
                    ShareDataUIState = i7 % 128;
                    int i8 = i7 % 2;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component2 + 81;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                if (cancellableContinuationImpl2.isActive()) {
                    CancellableContinuation<Resource<FavoriteBundleWrapper>> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.error(new ErrorType.Network.Generic(null, null, null, null, false, 31, null))));
                    int i5 = component2 + 53;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
        });
        cancellableContinuationImpl2.invokeOnCancellation(new component2(r3));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            int i2 = ShareDataUIState + 55;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        int i4 = ShareDataUIState + 61;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return result;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService$updateFavourites$2$request$1] */
    public final Object updateFavourites(Set<String> set, Continuation<? super Resource<FavoriteBundleWrapper>> continuation) {
        int i = 2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        ?? r3 = new HaProxyRequest<FavouriteBundleResponse>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 99;
                int i4 = i3 % 128;
                component3 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 51;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return GsmEndpoints.GSM_UPDATE_USER_FAVOURITES_BUNDLE;
            }
        };
        String strJoinToString$default = CollectionsKt.joinToString$default(set, ConstantsKt.COMMA_SEPARATOR, null, null, 0, null, null, 62, null);
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) r3, (String) null, (String) null, false, 7, (Object) null);
        r3.method(BaseRequest.Method.POST);
        r3.addParams(new FavouritesUpdateRequest(strJoinToString$default, access$getMsisdn$p(this), BUNDLES_PARAM));
        ImageLoader.INSTANCE.sendRequest((BaseRequest) r3, new ApiCallback<FavouriteBundleResponse>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onSuccess(FavouriteBundleResponse favouriteBundleResponse) {
                int i2 = 2 % 2;
                int i3 = component1 + 7;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(favouriteBundleResponse);
                int i5 = component2 + 93;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(FavouriteBundleResponse value) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                super.onSuccess(value);
                if (cancellableContinuationImpl2.isActive()) {
                    int i3 = component2 + 13;
                    component1 = i3 % 128;
                    if (i3 % 2 == 0) {
                        CancellableContinuation<Resource<FavoriteBundleWrapper>> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.success(value.getBody())));
                        int i4 = 33 / 0;
                    } else {
                        CancellableContinuation<Resource<FavoriteBundleWrapper>> cancellableContinuation2 = cancellableContinuationImpl2;
                        Result.Companion companion2 = Result.INSTANCE;
                        cancellableContinuation2.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.success(value.getBody())));
                    }
                    int i5 = component1 + 67;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                }
                int i7 = component2 + 41;
                component1 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 96 / 0;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component1 + 33;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    cancellableContinuationImpl2.isActive();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                if (cancellableContinuationImpl2.isActive()) {
                    CancellableContinuation<Resource<FavoriteBundleWrapper>> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.error(new ErrorType.Network.Generic(null, null, null, null, false, 31, null))));
                    int i4 = component2 + 51;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 2 / 3;
                    }
                }
            }
        });
        cancellableContinuationImpl2.invokeOnCancellation(new copydefault(r3));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
            int i2 = ShareDataUIState + 21;
            component3 = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = component3 + 47;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return result;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService$removeAllFavourites$2$request$1] */
    public final Object removeAllFavourites(Continuation<? super Resource<FavoriteBundleWrapper>> continuation) {
        int i = 2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        ?? r4 = new HaProxyRequest<FavouriteBundleResponse>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 19;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    return GsmEndpoints.GSM_REMOVE_ALL_USER_FAVOURITES_BUNDLE;
                }
                int i4 = 78 / 0;
                return GsmEndpoints.GSM_REMOVE_ALL_USER_FAVOURITES_BUNDLE;
            }
        };
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) r4, (String) null, (String) null, false, 7, (Object) null);
        r4.method(BaseRequest.Method.POST);
        r4.addParams(new FavouritesQueryRequest(access$getMsisdn$p(this), BUNDLES_PARAM));
        ImageLoader.INSTANCE.sendRequest((BaseRequest) r4, new ApiCallback<FavouriteBundleResponse>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(FavouriteBundleResponse favouriteBundleResponse) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 13;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(favouriteBundleResponse);
                if (i4 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = copydefault + 113;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onSuccess2(FavouriteBundleResponse value) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                super.onSuccess(value);
                if (cancellableContinuationImpl2.isActive()) {
                    CancellableContinuation<Resource<FavoriteBundleWrapper>> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.success(value.getBody())));
                    int i3 = copydefault + 113;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                }
                int i5 = ShareDataUIState + 47;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 99;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                if (cancellableContinuationImpl2.isActive()) {
                    CancellableContinuation<Resource<FavoriteBundleWrapper>> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m13069constructorimpl(Resource.INSTANCE.error(new ErrorType.Network.Generic(null, null, null, null, false, 31, null))));
                    int i5 = copydefault + 87;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                }
                int i7 = ShareDataUIState + 21;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
            }
        });
        cancellableContinuationImpl2.invokeOnCancellation(new component1(r4));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            int i2 = ShareDataUIState + 25;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            DebugProbesKt.probeCoroutineSuspended(continuation);
            if (i3 != 0) {
                throw null;
            }
        }
        int i4 = component3 + 1;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return result;
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i = component1 + 29;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }
}
