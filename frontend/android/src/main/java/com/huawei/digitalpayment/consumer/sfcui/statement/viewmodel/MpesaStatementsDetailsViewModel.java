package com.huawei.digitalpayment.consumer.sfcui.statement.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.base.cube.BaseCubeRequest;
import com.huawei.digitalpayment.consumer.base.cube.resp.CubeBaseResp;
import com.huawei.digitalpayment.consumer.base.resp.FavoriteCustomBean;
import com.huawei.digitalpayment.consumer.base.resp.FavoriteCustomResp;
import com.huawei.digitalpayment.consumer.base.resp.FavoriteCustomRespWrapper;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\nJ\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\nJ\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017J\u001e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cJ\u0016\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0017R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/viewmodel/MpesaStatementsDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "mpesaFavoritesRepository", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/favorites/MpesaFavoritesRepository;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/favorites/MpesaFavoritesRepository;)V", "getMpesaFavoritesRepository", "()Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/favorites/MpesaFavoritesRepository;", "reverseData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/cube/resp/CubeBaseResp;", "createData", "Lcom/huawei/http/BaseResp;", "queryData", "Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteCustomRespWrapper;", "getCreateData", "getQueryData", "getReverseData", "addFavourite", "", "serviceType", "", "favoriteCategory", "favoriteContent", "queryFavourites", "pageNo", "", "pageSize", "reverseTransaction", GriverCacheDao.COLUMN_CACHE_ID, "categoryDisplay", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MpesaStatementsDetailsViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int copy = 1;
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private final MutableLiveData<Resource<FavoriteCustomRespWrapper>> ShareDataUIState;
    private final MpesaFavoritesRepository component1;
    private final MutableLiveData<Resource<CubeBaseResp>> component2;
    private final MutableLiveData<Resource<BaseResp>> component3;

    public static final MutableLiveData access$getCreateData$p(MpesaStatementsDetailsViewModel mpesaStatementsDetailsViewModel) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 9;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = mpesaStatementsDetailsViewModel.component3;
        int i5 = i2 + 75;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public static final MutableLiveData access$getReverseData$p(MpesaStatementsDetailsViewModel mpesaStatementsDetailsViewModel) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 43;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<CubeBaseResp>> mutableLiveData = mpesaStatementsDetailsViewModel.component2;
        int i5 = i2 + 19;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final MpesaFavoritesRepository getMpesaFavoritesRepository() {
        MpesaFavoritesRepository mpesaFavoritesRepository;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 63;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            mpesaFavoritesRepository = this.component1;
            int i4 = 44 / 0;
        } else {
            mpesaFavoritesRepository = this.component1;
        }
        int i5 = i2 + 119;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return mpesaFavoritesRepository;
    }

    @Inject
    public MpesaStatementsDetailsViewModel(MpesaFavoritesRepository mpesaFavoritesRepository) {
        Intrinsics.checkNotNullParameter(mpesaFavoritesRepository, "");
        this.component1 = mpesaFavoritesRepository;
        this.component2 = new MutableLiveData<>();
        this.component3 = new MutableLiveData<>();
        this.ShareDataUIState = new MutableLiveData<>();
    }

    public final MutableLiveData<Resource<BaseResp>> getCreateData() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 101;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    public final MutableLiveData<Resource<FavoriteCustomRespWrapper>> getQueryData() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 123;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<FavoriteCustomRespWrapper>> mutableLiveData = this.ShareDataUIState;
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        return mutableLiveData;
    }

    public final MutableLiveData<Resource<CubeBaseResp>> getReverseData() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 3;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        MutableLiveData<Resource<CubeBaseResp>> mutableLiveData = this.component2;
        int i4 = i2 + 33;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return mutableLiveData;
    }

    public final void addFavourite(String serviceType, String favoriteCategory, String favoriteContent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(serviceType, "");
        Intrinsics.checkNotNullParameter(favoriteCategory, "");
        Intrinsics.checkNotNullParameter(favoriteContent, "");
        this.component3.setValue(Resource.loading(null));
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 3;
                int i4 = i3 % 128;
                component2 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 77;
                component1 = i6 % 128;
                if (i6 % 2 == 0) {
                    return "createFavorite";
                }
                throw null;
            }
        };
        paymentRequest.addParams("serviceType", serviceType);
        paymentRequest.addParams("favoriteCategory", favoriteCategory);
        paymentRequest.addParams("favoriteContent", favoriteContent);
        sendRequest(paymentRequest, new ApiCallback<BaseResp>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 73;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(baseResp);
                int i5 = ShareDataUIState + 125;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(BaseResp value) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 95;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                MpesaStatementsDetailsViewModel.access$getCreateData$p(MpesaStatementsDetailsViewModel.this).setValue(Resource.success(value));
                int i5 = ShareDataUIState + 19;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = copydefault + 63;
                ShareDataUIState = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    MpesaStatementsDetailsViewModel.access$getCreateData$p(MpesaStatementsDetailsViewModel.this).setValue(Resource.error(e, null));
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    MpesaStatementsDetailsViewModel.access$getCreateData$p(MpesaStatementsDetailsViewModel.this).setValue(Resource.error(e, null));
                    obj.hashCode();
                    throw null;
                }
            }
        });
        int i2 = getRequestBeneficiariesState + 85;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void queryFavourites(String serviceType, int pageNo, int pageSize) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(serviceType, "");
        PaymentRequest<FavoriteCustomResp> paymentRequest = new PaymentRequest<FavoriteCustomResp>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState;
                int i4 = i3 + 81;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 38 / 0;
                }
                int i6 = i3 + 75;
                component2 = i6 % 128;
                if (i6 % 2 != 0) {
                    return "queryFavoriteList";
                }
                throw null;
            }
        };
        paymentRequest.addParams("serviceType", serviceType);
        paymentRequest.addParams("pageNo", Integer.valueOf(pageNo));
        paymentRequest.addParams("pageSize", Integer.valueOf(pageSize));
        sendRequest(paymentRequest, new ApiCallback<FavoriteCustomResp>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void onSuccess(FavoriteCustomResp favoriteCustomResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 1;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(favoriteCustomResp);
                int i5 = component3 + 91;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(FavoriteCustomResp value) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                List<FavoriteCustomBean> favoriteList = value.getFavoriteList();
                if (favoriteList != null) {
                    MpesaStatementsDetailsViewModel mpesaStatementsDetailsViewModel = MpesaStatementsDetailsViewModel.this;
                    onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(mpesaStatementsDetailsViewModel), Dispatchers.getIO(), null, new component2(mpesaStatementsDetailsViewModel, favoriteList, null), 2, null);
                    int i3 = component3 + 31;
                    ShareDataUIState = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 5 / 3;
                    }
                }
                int i5 = component3 + 119;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 74 / 0;
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.statement.viewmodel.MpesaStatementsDetailsViewModel$queryFavourites$1$onSuccess$1$1", f = "MpesaStatementsDetailsViewModel.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
            static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                private static int component1 = 0;
                private static int component3 = 1;
                final List<FavoriteCustomBean> ShareDataUIState;
                int component2;
                final MpesaStatementsDetailsViewModel copydefault;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.component2;
                    if (i2 != 0) {
                        int i3 = component1 + 23;
                        component3 = i3 % 128;
                        if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    } else {
                        ResultKt.throwOnFailure(obj);
                        this.component2 = 1;
                        if (this.copydefault.getMpesaFavoritesRepository().insertFavorites(this.ShareDataUIState, this) == coroutine_suspended) {
                            int i4 = component3 + 41;
                            int i5 = i4 % 128;
                            component1 = i5;
                            int i6 = i4 % 2;
                            int i7 = i5 + 11;
                            component3 = i7 % 128;
                            int i8 = i7 % 2;
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                component2(MpesaStatementsDetailsViewModel mpesaStatementsDetailsViewModel, List<FavoriteCustomBean> list, Continuation<? super component2> continuation) {
                    super(2, continuation);
                    this.copydefault = mpesaStatementsDetailsViewModel;
                    this.ShareDataUIState = list;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    component2 component2Var = new component2(this.copydefault, this.ShareDataUIState, continuation);
                    int i2 = component1 + 35;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    return component2Var;
                }

                @Override
                public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component1 + 59;
                    component3 = i2 % 128;
                    CoroutineScope coroutineScope2 = coroutineScope;
                    Continuation<? super Unit> continuation2 = continuation;
                    if (i2 % 2 == 0) {
                        copydefault(coroutineScope2, continuation2);
                        throw null;
                    }
                    Object objCopydefault = copydefault(coroutineScope2, continuation2);
                    int i3 = component3 + 73;
                    component1 = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 45 / 0;
                    }
                    return objCopydefault;
                }

                public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component1 + 55;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((component2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    int i4 = component1 + 79;
                    component3 = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objInvokeSuspend;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        });
        int i2 = getRequestBeneficiariesState + 119;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void reverseTransaction(String id, String categoryDisplay) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(categoryDisplay, "");
        Object obj = null;
        this.component2.setValue(Resource.loading(null));
        BaseCubeRequest<CubeBaseResp> baseCubeRequest = new BaseCubeRequest<CubeBaseResp>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 47;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    return "/service/CubeServerAsset__Foundation/1.0.0/money/reverse";
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        };
        baseCubeRequest.addParams("mpesaId", id);
        baseCubeRequest.addParams("smsMessage", categoryDisplay);
        baseCubeRequest.sendRequest((ApiCallback) new ApiCallback<CubeBaseResp>() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public void onSuccess(CubeBaseResp cubeBaseResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 95;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(cubeBaseResp);
                int i5 = component3 + 55;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public void onSuccess2(CubeBaseResp value) {
                int i2 = 2 % 2;
                int i3 = component2 + 1;
                component3 = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 != 0) {
                    MpesaStatementsDetailsViewModel.access$getReverseData$p(MpesaStatementsDetailsViewModel.this).setValue(Resource.success(value));
                    throw null;
                }
                MpesaStatementsDetailsViewModel.access$getReverseData$p(MpesaStatementsDetailsViewModel.this).setValue(Resource.success(value));
                int i4 = component2 + 93;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component3 + 125;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    MpesaStatementsDetailsViewModel.access$getReverseData$p(MpesaStatementsDetailsViewModel.this).setValue(Resource.error(e, null));
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    MpesaStatementsDetailsViewModel.access$getReverseData$p(MpesaStatementsDetailsViewModel.this).setValue(Resource.error(e, null));
                    throw null;
                }
            }
        });
        int i2 = getAsAtTimestamp + 39;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 25;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
