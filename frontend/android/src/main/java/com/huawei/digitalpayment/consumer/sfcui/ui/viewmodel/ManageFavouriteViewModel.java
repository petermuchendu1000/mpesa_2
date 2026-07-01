package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.base.resp.FavoriteCustomBean;
import com.huawei.digitalpayment.consumer.base.resp.FavoriteCustomResp;
import com.huawei.digitalpayment.consumer.base.resp.FavoriteFriendsBean;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.sfcui.favorites.FavoriteFilterTab;
import com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewFavoritesState;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeLogger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\u001e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"J\u001e\u0010%\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'J$\u0010)\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0\u0010J\u000e\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020\"J\u001c\u00100\u001a\u00020 2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u00066"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/ManageFavouriteViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "mpesaFavoritesRepository", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/favorites/MpesaFavoritesRepository;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/favorites/MpesaFavoritesRepository;)V", "getMpesaFavoritesRepository", "()Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/favorites/MpesaFavoritesRepository;", "createData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/http/BaseResp;", "removeData", "favoriteItems", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteFriendsBean;", "getFavoriteItems", "()Lkotlinx/coroutines/flow/StateFlow;", "favoriteItemsLiveData", "Landroidx/lifecycle/LiveData;", "getFavoriteItemsLiveData", "()Landroidx/lifecycle/LiveData;", "_viewFavoritesState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/sfcui/favorites/viewall/ViewFavoritesState;", "viewFavoritesState", "getViewFavoritesState", "getCreateData", "getRemoveData", "addFavourite", "", "serviceType", "", "favoriteCategory", "favoriteContent", "queryFavourites", "pageNo", "", "pageSize", "removeFavorite", "ids", "updateSelectedTab", "tab", "Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab;", "updateSearchText", "text", "reorderFavourites", "filtered", "change", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/FavoritePositionChange;", "updateFavorite", "favorite", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ManageFavouriteViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int copy = 0;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 85 % 128;
    private static int getSponsorBeneficiariesState = 1;
    private final MutableLiveData<Resource<BaseResp>> ShareDataUIState;
    private final StateFlow<List<FavoriteFriendsBean>> component1;
    private final MpesaFavoritesRepository component2;
    private final LiveData<List<FavoriteFriendsBean>> component3;
    private final MutableLiveData<Resource<BaseResp>> component4;
    private final MutableStateFlow<ViewFavoritesState> copydefault;
    private final StateFlow<ViewFavoritesState> equals;

    public static final MutableLiveData access$getCreateData$p(ManageFavouriteViewModel manageFavouriteViewModel) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 5;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = manageFavouriteViewModel.ShareDataUIState;
        int i5 = i3 + 25;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final MutableLiveData access$getRemoveData$p(ManageFavouriteViewModel manageFavouriteViewModel) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 63;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = manageFavouriteViewModel.component4;
        int i5 = i2 + 9;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MpesaFavoritesRepository getMpesaFavoritesRepository() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 81;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public ManageFavouriteViewModel(MpesaFavoritesRepository mpesaFavoritesRepository) {
        Intrinsics.checkNotNullParameter(mpesaFavoritesRepository, "");
        this.component2 = mpesaFavoritesRepository;
        this.ShareDataUIState = new MutableLiveData<>();
        this.component4 = new MutableLiveData<>();
        final Flow<List<FavoriteFriendsBean>> allFavorites = mpesaFavoritesRepository.getAllFavorites();
        Flow<List<? extends FavoriteFriendsBean>> flow = new Flow<List<? extends FavoriteFriendsBean>>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements FlowCollector {
                private static int component2 = 0;
                private static int component3 = 1;
                final FlowCollector copydefault;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel$special$$inlined$map$1$2", f = "ManageFavouriteViewModel.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    private static int component3 = 1;
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
                        int i2 = copydefault + 23;
                        component3 = i2 % 128;
                        int i3 = i2 % 2;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        if (i3 == 0) {
                            anonymousClass2.emit(null, this);
                            throw null;
                        }
                        Object objEmit = anonymousClass2.emit(null, this);
                        int i4 = component3 + 117;
                        copydefault = i4 % 128;
                        int i5 = i4 % 2;
                        return objEmit;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
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
                        boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        r2 = 1
                        if (r1 == r2) goto L9
                        goto L22
                    L9:
                        r1 = r7
                        com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel$special$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                        int r3 = r1.label
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r3 & r4
                        if (r3 == 0) goto L22
                        int r7 = com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel$special$$inlined$map$1.AnonymousClass2.component3
                        int r7 = r7 + 93
                        int r3 = r7 % 128
                        com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel$special$$inlined$map$1.AnonymousClass2.component2 = r3
                        int r7 = r7 % r0
                        int r7 = r1.label
                        int r7 = r7 + r4
                        r1.label = r7
                        goto L27
                    L22:
                        com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel$special$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel$special$$inlined$map$1$2$1
                        r1.<init>(r7)
                    L27:
                        java.lang.Object r7 = r1.result
                        java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r4 = r1.label
                        if (r4 == 0) goto L48
                        int r6 = com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel$special$$inlined$map$1.AnonymousClass2.component3
                        int r6 = r6 + 13
                        int r1 = r6 % 128
                        com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel$special$$inlined$map$1.AnonymousClass2.component2 = r1
                        int r6 = r6 % r0
                        if (r4 != r2) goto L40
                        kotlin.ResultKt.throwOnFailure(r7)
                        goto L71
                    L40:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L48:
                        kotlin.ResultKt.throwOnFailure(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.copydefault
                        r4 = r1
                        kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                        java.util.List r6 = (java.util.List) r6
                        java.lang.Iterable r6 = (java.lang.Iterable) r6
                        com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel$favoriteItems$lambda$1$$inlined$sortedBy$1 r4 = new com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel$favoriteItems$lambda$1$$inlined$sortedBy$1
                        r4.<init>()
                        java.util.Comparator r4 = (java.util.Comparator) r4
                        java.util.List r6 = kotlin.collections.CollectionsKt.sortedWith(r6, r4)
                        r1.label = r2
                        java.lang.Object r6 = r7.emit(r6, r1)
                        if (r6 != r3) goto L71
                        int r6 = com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel$special$$inlined$map$1.AnonymousClass2.component2
                        int r6 = r6 + 121
                        int r7 = r6 % 128
                        com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel$special$$inlined$map$1.AnonymousClass2.component3 = r7
                        int r6 = r6 % r0
                        return r3
                    L71:
                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.copydefault = flowCollector;
                }
            }

            @Override
            public Object collect(FlowCollector<? super List<? extends FavoriteFriendsBean>> flowCollector, Continuation continuation) {
                int i = 2 % 2;
                Object objCollect = allFavorites.collect(new AnonymousClass2(flowCollector), continuation);
                Object obj = null;
                if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    int i2 = component3 + 89;
                    ShareDataUIState = i2 % 128;
                    if (i2 % 2 != 0) {
                        return objCollect;
                    }
                    obj.hashCode();
                    throw null;
                }
                Unit unit = Unit.INSTANCE;
                int i3 = component3 + 65;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    return unit;
                }
                obj.hashCode();
                throw null;
            }
        };
        ManageFavouriteViewModel manageFavouriteViewModel = this;
        StateFlow<List<FavoriteFriendsBean>> stateFlowStateIn = FlowKt.stateIn(flow, ViewModelKt.getViewModelScope(manageFavouriteViewModel), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), CollectionsKt.emptyList());
        this.component1 = stateFlowStateIn;
        this.component3 = FlowLiveDataConversions.asLiveData$default(stateFlowStateIn, ViewModelKt.getViewModelScope(manageFavouriteViewModel).getComponent3(), 0L, 2, (Object) null);
        MutableStateFlow<ViewFavoritesState> MutableStateFlow = StateFlowKt.MutableStateFlow(new ViewFavoritesState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
        this.copydefault = MutableStateFlow;
        this.equals = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final StateFlow<List<FavoriteFriendsBean>> getFavoriteItems() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 25;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LiveData<List<FavoriteFriendsBean>> getFavoriteItemsLiveData() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 123;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        LiveData<List<FavoriteFriendsBean>> liveData = this.component3;
        int i4 = i3 + 39;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return liveData;
        }
        obj.hashCode();
        throw null;
    }

    public final StateFlow<ViewFavoritesState> getViewFavoritesState() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 43;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        StateFlow<ViewFavoritesState> stateFlow = this.equals;
        int i5 = i3 + 11;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final MutableLiveData<Resource<BaseResp>> getCreateData() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 117;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        MutableLiveData<Resource<BaseResp>> mutableLiveData = this.ShareDataUIState;
        int i4 = i3 + 81;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return mutableLiveData;
    }

    public final MutableLiveData<Resource<BaseResp>> getRemoveData() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 13;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = this.component4;
        int i5 = i3 + 123;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return mutableLiveData;
    }

    public final void addFavourite(String serviceType, String favoriteCategory, String favoriteContent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(serviceType, "");
        Intrinsics.checkNotNullParameter(favoriteCategory, "");
        Intrinsics.checkNotNullParameter(favoriteContent, "");
        this.ShareDataUIState.setValue(Resource.loading(null));
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 39;
                int i4 = i3 % 128;
                component1 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 77;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return "createFavorite";
            }
        };
        paymentRequest.addParams("serviceType", serviceType);
        paymentRequest.addParams("favoriteCategory", favoriteCategory);
        paymentRequest.addParams("favoriteContent", favoriteContent);
        sendRequest(paymentRequest, new ApiCallback<BaseResp>() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 81;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(baseResp);
                if (i4 != 0) {
                    int i5 = 64 / 0;
                }
                int i6 = component1 + 55;
                component3 = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            }

            public void onSuccess2(BaseResp value) {
                int i2 = 2 % 2;
                int i3 = component1 + 103;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                ManageFavouriteViewModel.access$getCreateData$p(ManageFavouriteViewModel.this).setValue(Resource.success(value));
                int i5 = component3 + 89;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 86 / 0;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component1 + 3;
                component3 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    ManageFavouriteViewModel.access$getCreateData$p(ManageFavouriteViewModel.this).setValue(Resource.error(e, null));
                    int i4 = 43 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    ManageFavouriteViewModel.access$getCreateData$p(ManageFavouriteViewModel.this).setValue(Resource.error(e, null));
                }
                int i5 = component3 + 81;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = getAsAtTimestamp + 97;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void queryFavourites(String serviceType, int pageNo, int pageSize) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(serviceType, "");
        PaymentRequest<FavoriteCustomResp> paymentRequest = new PaymentRequest<FavoriteCustomResp>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState;
                int i4 = i3 + 63;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 11;
                component3 = i6 % 128;
                if (i6 % 2 != 0) {
                    return "queryFavoriteList";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        HashMap map = new HashMap();
        map.put("needAvatar", true);
        paymentRequest.addParams("serviceType", serviceType);
        paymentRequest.addParams("pageNo", Integer.valueOf(pageNo));
        paymentRequest.addParams("pageSize", Integer.valueOf(pageSize));
        paymentRequest.addParams(ApiDowngradeLogger.EXT_KEY_EXT_PARAMS, map);
        sendRequest(paymentRequest, new ApiCallback<FavoriteCustomResp>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onSuccess(FavoriteCustomResp favoriteCustomResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 81;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(favoriteCustomResp);
                if (i4 == 0) {
                    throw null;
                }
            }

            public void onSuccess2(FavoriteCustomResp value) {
                int i2 = 2 % 2;
                int i3 = component2 + 67;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                List<FavoriteCustomBean> favoriteList = value.getFavoriteList();
                if (favoriteList != null) {
                    ManageFavouriteViewModel manageFavouriteViewModel = ManageFavouriteViewModel.this;
                    onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(manageFavouriteViewModel), Dispatchers.getIO(), null, new ShareDataUIState(manageFavouriteViewModel, favoriteList, null), 2, null);
                }
                int i5 = component1 + 119;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel$queryFavourites$1$onSuccess$1$1", f = "ManageFavouriteViewModel.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
            static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                private static int component1 = 0;
                private static int copydefault = 1;
                int ShareDataUIState;
                final List<FavoriteCustomBean> component2;
                final ManageFavouriteViewModel component3;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.ShareDataUIState;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.ShareDataUIState = 1;
                        if (this.component3.getMpesaFavoritesRepository().insertFavorites(this.component2, this) == coroutine_suspended) {
                            int i3 = component1 + 53;
                            copydefault = i3 % 128;
                            if (i3 % 2 != 0) {
                                return coroutine_suspended;
                            }
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        int i4 = copydefault + 77;
                        component1 = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                ShareDataUIState(ManageFavouriteViewModel manageFavouriteViewModel, List<FavoriteCustomBean> list, Continuation<? super ShareDataUIState> continuation) {
                    super(2, continuation);
                    this.component3 = manageFavouriteViewModel;
                    this.component2 = list;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    ShareDataUIState shareDataUIState = new ShareDataUIState(this.component3, this.component2, continuation);
                    int i2 = component1 + 53;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    return shareDataUIState;
                }

                @Override
                public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component1 + 19;
                    copydefault = i2 % 128;
                    CoroutineScope coroutineScope2 = coroutineScope;
                    Continuation<? super Unit> continuation2 = continuation;
                    if (i2 % 2 != 0) {
                        return copydefault(coroutineScope2, continuation2);
                    }
                    Object objCopydefault = copydefault(coroutineScope2, continuation2);
                    int i3 = 82 / 0;
                    return objCopydefault;
                }

                public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = copydefault + 99;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((ShareDataUIState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    int i4 = copydefault + 31;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objInvokeSuspend;
                    }
                    throw null;
                }
            }
        });
        int i2 = getAsAtTimestamp + 13;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void removeFavorite(String serviceType, String favoriteCategory, final List<String> ids) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(serviceType, "");
        Intrinsics.checkNotNullParameter(favoriteCategory, "");
        Intrinsics.checkNotNullParameter(ids, "");
        this.component4.setValue(Resource.loading(null));
        ManageFavouriteViewModel$removeFavorite$request$1 manageFavouriteViewModel$removeFavorite$request$1 = new ManageFavouriteViewModel$removeFavorite$request$1();
        manageFavouriteViewModel$removeFavorite$request$1.addParams("serviceType", serviceType);
        manageFavouriteViewModel$removeFavorite$request$1.addParams("favoriteCategory", favoriteCategory);
        manageFavouriteViewModel$removeFavorite$request$1.addParams("ids", ids);
        sendRequest(manageFavouriteViewModel$removeFavorite$request$1, new ApiCallback<BaseResp>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 41;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(baseResp);
                if (i4 != 0) {
                    int i5 = 72 / 0;
                }
            }

            public void onSuccess2(BaseResp value) {
                ManageFavouriteViewModel manageFavouriteViewModel;
                Iterator it;
                int i2 = 2 % 2;
                int i3 = component1 + 113;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    ManageFavouriteViewModel.access$getRemoveData$p(ManageFavouriteViewModel.this).setValue(Resource.success(value));
                    List<String> list = ids;
                    manageFavouriteViewModel = ManageFavouriteViewModel.this;
                    it = list.iterator();
                    int i4 = 45 / 0;
                } else {
                    ManageFavouriteViewModel.access$getRemoveData$p(ManageFavouriteViewModel.this).setValue(Resource.success(value));
                    List<String> list2 = ids;
                    manageFavouriteViewModel = ManageFavouriteViewModel.this;
                    it = list2.iterator();
                }
                int i5 = component1 + 45;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                while (it.hasNext()) {
                    onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(manageFavouriteViewModel), Dispatchers.getIO(), null, new component2(manageFavouriteViewModel, (String) it.next(), null), 2, null);
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel$removeFavorite$1$onSuccess$1$1", f = "ManageFavouriteViewModel.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
            static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                private static int ShareDataUIState = 0;
                private static int component2 = 1;
                final String component1;
                int component3;
                final ManageFavouriteViewModel copydefault;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = component2 + 65;
                    ShareDataUIState = i2 % 128;
                    if (i2 % 2 != 0) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        throw null;
                    }
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i3 = this.component3;
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.component3 = 1;
                        if (this.copydefault.getMpesaFavoritesRepository().deleteFavorite(this.component1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        int i4 = ShareDataUIState + 73;
                        component2 = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                component2(ManageFavouriteViewModel manageFavouriteViewModel, String str, Continuation<? super component2> continuation) {
                    super(2, continuation);
                    this.copydefault = manageFavouriteViewModel;
                    this.component1 = str;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    component2 component2Var = new component2(this.copydefault, this.component1, continuation);
                    int i2 = component2 + 81;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    return component2Var;
                }

                @Override
                public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component2 + 95;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    Object objComponent3 = component3(coroutineScope, continuation);
                    int i4 = component2 + 105;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    return objComponent3;
                }

                public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 15;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    component2 component2Var = (component2) create(coroutineScope, continuation);
                    Unit unit = Unit.INSTANCE;
                    if (i3 != 0) {
                        return component2Var.invokeSuspend(unit);
                    }
                    component2Var.invokeSuspend(unit);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = copydefault + 121;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                ManageFavouriteViewModel.access$getRemoveData$p(ManageFavouriteViewModel.this).setValue(Resource.error(e, null));
                int i5 = copydefault + 67;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = getAsAtTimestamp + 25;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void reorderFavourites(List<FavoriteFriendsBean> filtered, FavoritePositionChange change) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(filtered, "");
        Intrinsics.checkNotNullParameter(change, "");
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new ShareDataUIState(filtered, change, this, null), 2, null);
        int i2 = getSponsorBeneficiariesState + 85;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 13 / 0;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel$reorderFavourites$1", f = "ManageFavouriteViewModel.kt", i = {0}, l = {145}, m = "invokeSuspend", n = {"index$iv"}, s = {"I$0"})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component4 = 1;
        private static int getAsAtTimestamp;
        final FavoritePositionChange ShareDataUIState;
        int component1;
        final List<FavoriteFriendsBean> component2;
        Object component3;
        int copy;
        Object copydefault;
        final ManageFavouriteViewModel equals;

        @Override
        public final Object invokeSuspend(Object obj) {
            ManageFavouriteViewModel manageFavouriteViewModel;
            Iterator it;
            int i;
            int i2 = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.copy;
            if (i3 != 0) {
                int i4 = getAsAtTimestamp + 101;
                int i5 = i4 % 128;
                component4 = i5;
                if (i4 % 2 != 0 ? i3 != 1 : i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i5 + 83;
                getAsAtTimestamp = i6 % 128;
                int i7 = i6 % 2;
                i = this.component1;
                it = (Iterator) this.component3;
                manageFavouriteViewModel = (ManageFavouriteViewModel) this.copydefault;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                List mutableList = CollectionsKt.toMutableList((Collection) this.component2);
                mutableList.add(this.ShareDataUIState.getTo(), (FavoriteFriendsBean) mutableList.remove(this.ShareDataUIState.getFrom()));
                manageFavouriteViewModel = this.equals;
                it = mutableList.iterator();
                i = 0;
            }
            while (it.hasNext()) {
                Object next = it.next();
                int i8 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                    int i9 = component4 + 85;
                    getAsAtTimestamp = i9 % 128;
                    int i10 = i9 % 2;
                }
                MpesaFavoritesRepository mpesaFavoritesRepository = manageFavouriteViewModel.getMpesaFavoritesRepository();
                String id = ((FavoriteFriendsBean) next).getId();
                this.copydefault = manageFavouriteViewModel;
                this.component3 = it;
                this.component1 = i8;
                this.copy = 1;
                if (mpesaFavoritesRepository.updateFavoriteListPosition(id, i, this) == coroutine_suspended) {
                    int i11 = getAsAtTimestamp + 121;
                    component4 = i11 % 128;
                    int i12 = i11 % 2;
                    return coroutine_suspended;
                }
                int i13 = component4 + 11;
                getAsAtTimestamp = i13 % 128;
                int i14 = i13 % 2;
                i = i8;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ShareDataUIState(List<FavoriteFriendsBean> list, FavoritePositionChange favoritePositionChange, ManageFavouriteViewModel manageFavouriteViewModel, Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
            this.component2 = list;
            this.ShareDataUIState = favoritePositionChange;
            this.equals = manageFavouriteViewModel;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = new ShareDataUIState(this.component2, this.ShareDataUIState, this.equals, continuation);
            int i2 = getAsAtTimestamp + 23;
            component4 = i2 % 128;
            if (i2 % 2 != 0) {
                return shareDataUIState;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Object objShareDataUIState;
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 55;
            component4 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                objShareDataUIState = ShareDataUIState(coroutineScope2, continuation2);
                int i3 = 22 / 0;
            } else {
                objShareDataUIState = ShareDataUIState(coroutineScope2, continuation2);
            }
            int i4 = component4 + 125;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 51 / 0;
            }
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component4 + 71;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((ShareDataUIState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 33 / 0;
            }
            return objInvokeSuspend;
        }
    }

    public final void updateFavorite(FavoriteFriendsBean favorite) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(favorite, "");
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new component2(favorite, null), 2, null);
        int i2 = getAsAtTimestamp + 109;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel$updateFavorite$1", f = "ManageFavouriteViewModel.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        final FavoriteFriendsBean component2;
        int component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 109;
            component1 = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                obj2.hashCode();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.component3;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                this.component3 = 1;
                if (ManageFavouriteViewModel.this.getMpesaFavoritesRepository().updateFavorite(this.component2, this) == coroutine_suspended) {
                    int i4 = component1 + 37;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 == 0) {
                        return coroutine_suspended;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i5 = ShareDataUIState + 3;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component2(FavoriteFriendsBean favoriteFriendsBean, Continuation<? super component2> continuation) {
            super(2, continuation);
            this.component2 = favoriteFriendsBean;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = ManageFavouriteViewModel.this.new component2(this.component2, continuation);
            int i2 = component1 + 123;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return component2Var;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 19;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
            int i4 = ShareDataUIState + 23;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 39;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            component2 component2Var = (component2) create(coroutineScope, continuation);
            if (i3 == 0) {
                return component2Var.invokeSuspend(Unit.INSTANCE);
            }
            component2Var.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void updateSelectedTab(FavoriteFilterTab tab) {
        MutableStateFlow<ViewFavoritesState> mutableStateFlow;
        ViewFavoritesState value;
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 77;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tab, "");
            mutableStateFlow = this.copydefault;
            int i3 = 81 / 0;
        } else {
            Intrinsics.checkNotNullParameter(tab, "");
            mutableStateFlow = this.copydefault;
        }
        int i4 = getSponsorBeneficiariesState + 25;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 % 4;
        }
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ViewFavoritesState.copy$default(value, tab, null, 2, null)));
        int i6 = getAsAtTimestamp + 67;
        getSponsorBeneficiariesState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 0 / 0;
        }
    }

    public final void updateSearchText(String text) {
        ViewFavoritesState value;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 79;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(text, "");
        MutableStateFlow<ViewFavoritesState> mutableStateFlow = this.copydefault;
        int i4 = getAsAtTimestamp + 109;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ViewFavoritesState.copy$default(value, null, text, 1, null)));
    }

    static {
        if (85 % 2 == 0) {
            int i = 56 / 0;
        }
    }
}
