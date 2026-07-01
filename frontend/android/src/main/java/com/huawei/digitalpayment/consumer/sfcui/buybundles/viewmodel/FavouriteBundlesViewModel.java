package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle;
import com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundleWrapper;
import com.huawei.digitalpayment.consumer.sfcui.api.model.MenuInfoCategory;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.FavouriteBundlesRepository;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.FavouriteBundlesEvent;
import com.safaricom.consumer.commons.resource.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u0017\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/repository/FavouriteBundlesRepository;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/repository/FavouriteBundlesRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "originalOrder", "", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundle;", "onEvent", "", "event", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesEvent;", "getBundlesFavouritesMenu", "forceRefresh", "", "loadFavourites", "allBundles", "addFavourite", "bundle", "deleteFavourite", "reorderFavourites", "from", "", TypedValues.TransitionType.S_TO, "updateReorder", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FavouriteBundlesViewModel extends ViewModel {
    public static final int $stable = 8;
    private static int component2 = 0;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState = 1;
    private List<FavoriteBundle> ShareDataUIState;
    private final FavouriteBundlesRepository component1;
    private final MutableStateFlow<FavouriteBundlesUiState> component3;
    private final StateFlow<FavouriteBundlesUiState> copydefault;

    public static final List access$getOriginalOrder$p(FavouriteBundlesViewModel favouriteBundlesViewModel) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 105;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        List<FavoriteBundle> list = favouriteBundlesViewModel.ShareDataUIState;
        int i5 = i2 + 79;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public static final FavouriteBundlesRepository access$getRepository$p(FavouriteBundlesViewModel favouriteBundlesViewModel) {
        int i = 2 % 2;
        int i2 = copy + 121;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        FavouriteBundlesRepository favouriteBundlesRepository = favouriteBundlesViewModel.component1;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 49;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return favouriteBundlesRepository;
        }
        throw null;
    }

    public static final MutableStateFlow access$get_uiState$p(FavouriteBundlesViewModel favouriteBundlesViewModel) {
        int i = 2 % 2;
        int i2 = copy + 85;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        MutableStateFlow<FavouriteBundlesUiState> mutableStateFlow = favouriteBundlesViewModel.component3;
        if (i3 != 0) {
            return mutableStateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$loadFavourites(FavouriteBundlesViewModel favouriteBundlesViewModel, List list) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 121;
        copy = i2 % 128;
        int i3 = i2 % 2;
        favouriteBundlesViewModel.component3(list);
        int i4 = getAsAtTimestamp + 93;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
    }

    public static final void access$setOriginalOrder$p(FavouriteBundlesViewModel favouriteBundlesViewModel, List list) {
        int i = 2 % 2;
        int i2 = copy + 91;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        favouriteBundlesViewModel.ShareDataUIState = list;
        int i5 = i3 + 83;
        copy = i5 % 128;
        int i6 = i5 % 2;
    }

    @Inject
    public FavouriteBundlesViewModel(FavouriteBundlesRepository favouriteBundlesRepository) {
        Intrinsics.checkNotNullParameter(favouriteBundlesRepository, "");
        this.component1 = favouriteBundlesRepository;
        MutableStateFlow<FavouriteBundlesUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new FavouriteBundlesUiState(null, null, null, false, null, null, 63, null));
        this.component3 = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        copydefault(this, false, 1, null);
    }

    public final StateFlow<FavouriteBundlesUiState> getUiState() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 35;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        StateFlow<FavouriteBundlesUiState> stateFlow = this.copydefault;
        int i5 = i3 + 71;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onEvent(FavouriteBundlesEvent event) {
        FavouriteBundlesUiState value;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof FavouriteBundlesEvent.Add) {
            ShareDataUIState(((FavouriteBundlesEvent.Add) event).getBundle());
        } else if (event instanceof FavouriteBundlesEvent.Delete) {
            component1(((FavouriteBundlesEvent.Delete) event).getBundle());
        } else if (event instanceof FavouriteBundlesEvent.Reorder) {
            FavouriteBundlesEvent.Reorder reorder = (FavouriteBundlesEvent.Reorder) event;
            component3(reorder.getFrom(), reorder.getTo());
            int i2 = copy + 89;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
        } else if (Intrinsics.areEqual(event, FavouriteBundlesEvent.OnReorderCompleted.INSTANCE)) {
            int i4 = copy + 117;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 == 0) {
                copydefault();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            copydefault();
        } else if (!(!Intrinsics.areEqual(event, FavouriteBundlesEvent.Refresh.INSTANCE))) {
            component1(true);
        } else {
            if (!Intrinsics.areEqual(event, FavouriteBundlesEvent.ClearToast.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            MutableStateFlow<FavouriteBundlesUiState> mutableStateFlow = this.component3;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, FavouriteBundlesUiState.copy$default(value, null, null, null, false, null, null, 47, null)));
        }
        int i5 = copy + 117;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    static void copydefault(FavouriteBundlesViewModel favouriteBundlesViewModel, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = getAsAtTimestamp + 41;
            int i4 = i3 % 128;
            copy = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 77;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        favouriteBundlesViewModel.component1(z);
        int i8 = getAsAtTimestamp + 125;
        copy = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 67 / 0;
        }
    }

    private final void component1(boolean z) {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component1(z, null), 3, null);
        int i2 = getAsAtTimestamp + 49;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 67 / 0;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.FavouriteBundlesViewModel$getBundlesFavouritesMenu$1", f = "FavouriteBundlesViewModel.kt", i = {}, l = {45, 46}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component3 = 1;
        final boolean component2;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.copydefault;
            if (i2 != 0) {
                int i3 = component3;
                int i4 = i3 + 39;
                component1 = i4 % 128;
                if (i4 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = i3 + 123;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    ResultKt.throwOnFailure(obj);
                    Unit unit = Unit.INSTANCE;
                    int i7 = component1 + 51;
                    component3 = i7 % 128;
                    int i8 = i7 % 2;
                    return unit;
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.copydefault = 1;
                obj = FavouriteBundlesViewModel.access$getRepository$p(FavouriteBundlesViewModel.this).getBundlesFavouritesMenu(this.component2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            final FavouriteBundlesViewModel favouriteBundlesViewModel = FavouriteBundlesViewModel.this;
            this.copydefault = 2;
            if (((Flow) obj).collect(new FlowCollector() {
                private static int component1 = 1;
                private static int component3;

                @Override
                public Object emit(Object obj2, Continuation continuation) {
                    int i9 = 2 % 2;
                    int i10 = component3 + 9;
                    component1 = i10 % 128;
                    Resource<FavoriteBundleWrapper> resource = (Resource) obj2;
                    if (i10 % 2 == 0) {
                        copydefault(resource, continuation);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    Object objCopydefault = copydefault(resource, continuation);
                    int i11 = component3 + 27;
                    component1 = i11 % 128;
                    int i12 = i11 % 2;
                    return objCopydefault;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final Object copydefault(Resource<FavoriteBundleWrapper> resource, Continuation<? super Unit> continuation) {
                    MenuInfoCategory menuInfoCategory;
                    Object value;
                    Object value2;
                    MenuInfoCategory menuInfoCategory2;
                    int i9 = 2 % 2;
                    List<FavoriteBundle> listEmptyList = null;
                    if (resource.isSuccess()) {
                        FavoriteBundleWrapper data = resource.getData();
                        if (data != null && (menuInfoCategory2 = data.getMenuInfoCategory()) != null) {
                            listEmptyList = menuInfoCategory2.getFavoriteBundles();
                        }
                        if (listEmptyList == null) {
                            int i10 = component3 + 85;
                            component1 = i10 % 128;
                            int i11 = i10 % 2;
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        FavouriteBundlesViewModel.access$loadFavourites(favouriteBundlesViewModel, listEmptyList);
                        MutableStateFlow mutableStateFlowAccess$get_uiState$p = FavouriteBundlesViewModel.access$get_uiState$p(favouriteBundlesViewModel);
                        do {
                            value2 = mutableStateFlowAccess$get_uiState$p.getValue();
                        } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value2, FavouriteBundlesUiState.copy$default((FavouriteBundlesUiState) value2, null, null, null, false, null, null, 39, null)));
                    } else if (!(!resource.isError())) {
                        MutableStateFlow mutableStateFlowAccess$get_uiState$p2 = FavouriteBundlesViewModel.access$get_uiState$p(favouriteBundlesViewModel);
                        do {
                            value = mutableStateFlowAccess$get_uiState$p2.getValue();
                        } while (!mutableStateFlowAccess$get_uiState$p2.compareAndSet(value, FavouriteBundlesUiState.copy$default((FavouriteBundlesUiState) value, null, null, null, false, "An error occurred", null, 39, null)));
                    } else if (resource.isLoading()) {
                        int i12 = component1 + 11;
                        component3 = i12 % 128;
                        if (i12 % 2 == 0) {
                            FavoriteBundleWrapper data2 = resource.getData();
                            if (data2 != null && (menuInfoCategory = data2.getMenuInfoCategory()) != null) {
                                int i13 = component3 + 63;
                                component1 = i13 % 128;
                                int i14 = i13 % 2;
                                listEmptyList = menuInfoCategory.getFavoriteBundles();
                            }
                            if (listEmptyList == null) {
                                listEmptyList = CollectionsKt.emptyList();
                                int i15 = component1 + 101;
                                component3 = i15 % 128;
                                int i16 = i15 % 2;
                            }
                            FavouriteBundlesViewModel.access$loadFavourites(favouriteBundlesViewModel, listEmptyList);
                        } else {
                            resource.getData();
                            listEmptyList.hashCode();
                            throw null;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                int i9 = component1 + 69;
                component3 = i9 % 128;
                if (i9 % 2 != 0) {
                    return coroutine_suspended;
                }
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i72 = component1 + 51;
            component3 = i72 % 128;
            int i82 = i72 % 2;
            return unit2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component1(boolean z, Continuation<? super component1> continuation) {
            super(2, continuation);
            this.component2 = z;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = FavouriteBundlesViewModel.this.new component1(this.component2, continuation);
            int i2 = component1 + 21;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 24 / 0;
            }
            return component1Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 77;
            component1 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return copydefault(coroutineScope2, continuation2);
            }
            copydefault(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 89;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            component1 component1Var = (component1) create(coroutineScope, continuation);
            if (i3 != 0) {
                component1Var.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = component1Var.invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 43;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    private final void component3(List<FavoriteBundle> list) {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component3(list, null), 3, null);
        int i2 = copy + 49;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.FavouriteBundlesViewModel$loadFavourites$1", f = "FavouriteBundlesViewModel.kt", i = {}, l = {71, 72}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 1;
        private static int copydefault;
        final List<FavoriteBundle> ShareDataUIState;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 57;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component2;
            if (i4 != 0) {
                int i5 = copydefault + 23;
                component3 = i5 % 128;
                if (i5 % 2 != 0 ? i4 != 1 : i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                int i6 = copydefault + 73;
                component3 = i6 % 128;
                int i7 = i6 % 2;
            } else {
                ResultKt.throwOnFailure(obj);
                this.component2 = 1;
                obj = FavouriteBundlesRepository.DefaultImpls.getFavourites$default(FavouriteBundlesViewModel.access$getRepository$p(FavouriteBundlesViewModel.this), false, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            final List<FavoriteBundle> list = this.ShareDataUIState;
            final FavouriteBundlesViewModel favouriteBundlesViewModel = FavouriteBundlesViewModel.this;
            this.component2 = 2;
            if (((Flow) obj).collect(new FlowCollector() {
                private static int ShareDataUIState = 1;
                private static int component2;

                @Override
                public Object emit(Object obj2, Continuation continuation) {
                    int i8 = 2 % 2;
                    int i9 = ShareDataUIState + 33;
                    component2 = i9 % 128;
                    int i10 = i9 % 2;
                    Object objCopydefault = copydefault((Resource) obj2, continuation);
                    int i11 = component2 + 41;
                    ShareDataUIState = i11 % 128;
                    if (i11 % 2 != 0) {
                        return objCopydefault;
                    }
                    throw null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final Object copydefault(Resource<? extends List<FavoriteBundle>> resource, Continuation<? super Unit> continuation) {
                    Object value;
                    Object value2;
                    Object value3;
                    int i8 = 2 % 2;
                    if (resource.isSuccess()) {
                        List<FavoriteBundle> data = resource.getData();
                        if (data == null) {
                            data = CollectionsKt.emptyList();
                            int i9 = ShareDataUIState + 107;
                            component2 = i9 % 128;
                            int i10 = i9 % 2;
                        }
                        List<FavoriteBundle> list2 = data;
                        List<FavoriteBundle> list3 = list2;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                        Iterator<T> it = list3.iterator();
                        while (!(!it.hasNext())) {
                            int i11 = component2 + 47;
                            ShareDataUIState = i11 % 128;
                            int i12 = i11 % 2;
                            arrayList.add(String.valueOf(((FavoriteBundle) it.next()).getId()));
                        }
                        Set set = CollectionsKt.toSet(arrayList);
                        List<FavoriteBundle> list4 = list;
                        ArrayList arrayList2 = new ArrayList();
                        for (T t : list4) {
                            if (!set.contains(String.valueOf(((FavoriteBundle) t).getId()))) {
                                arrayList2.add(t);
                                int i13 = ShareDataUIState + 43;
                                component2 = i13 % 128;
                                int i14 = i13 % 2;
                            }
                        }
                        ArrayList arrayList3 = arrayList2;
                        MutableStateFlow mutableStateFlowAccess$get_uiState$p = FavouriteBundlesViewModel.access$get_uiState$p(favouriteBundlesViewModel);
                        List<FavoriteBundle> list5 = list;
                        do {
                            value3 = mutableStateFlowAccess$get_uiState$p.getValue();
                        } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value3, FavouriteBundlesUiState.copy$default((FavouriteBundlesUiState) value3, list2, arrayList3, list5, false, null, null, 48, null)));
                    } else if (resource.isError()) {
                        MutableStateFlow mutableStateFlowAccess$get_uiState$p2 = FavouriteBundlesViewModel.access$get_uiState$p(favouriteBundlesViewModel);
                        do {
                            value2 = mutableStateFlowAccess$get_uiState$p2.getValue();
                        } while (!mutableStateFlowAccess$get_uiState$p2.compareAndSet(value2, FavouriteBundlesUiState.copy$default((FavouriteBundlesUiState) value2, null, null, null, false, "An error occurred", null, 39, null)));
                    } else if (resource.isLoading()) {
                        int i15 = component2 + 107;
                        ShareDataUIState = i15 % 128;
                        int i16 = i15 % 2;
                        List<FavoriteBundle> data2 = resource.getData();
                        if (data2 == null) {
                            data2 = CollectionsKt.emptyList();
                        }
                        List<FavoriteBundle> list6 = data2;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                        Iterator<T> it2 = list6.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(String.valueOf(((FavoriteBundle) it2.next()).getId()));
                        }
                        Set set2 = CollectionsKt.toSet(arrayList4);
                        List<FavoriteBundle> list7 = list;
                        ArrayList arrayList5 = new ArrayList();
                        for (T t2 : list7) {
                            if (!set2.contains(String.valueOf(((FavoriteBundle) t2).getId()))) {
                                arrayList5.add(t2);
                            }
                        }
                        ArrayList arrayList6 = arrayList5;
                        MutableStateFlow mutableStateFlowAccess$get_uiState$p3 = FavouriteBundlesViewModel.access$get_uiState$p(favouriteBundlesViewModel);
                        List<FavoriteBundle> list8 = list;
                        int i17 = ShareDataUIState + 99;
                        component2 = i17 % 128;
                        int i18 = i17 % 2;
                        do {
                            value = mutableStateFlowAccess$get_uiState$p3.getValue();
                        } while (!mutableStateFlowAccess$get_uiState$p3.compareAndSet(value, FavouriteBundlesUiState.copy$default((FavouriteBundlesUiState) value, data2, arrayList6, list8, true, null, null, 32, null)));
                    }
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                int i8 = copydefault + 123;
                component3 = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 8 / 0;
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component3(List<FavoriteBundle> list, Continuation<? super component3> continuation) {
            super(2, continuation);
            this.ShareDataUIState = list;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = FavouriteBundlesViewModel.this.new component3(this.ShareDataUIState, continuation);
            int i2 = component3 + 87;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return component3Var;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 61;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            int i4 = component3 + 69;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 125;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 57;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    private final void ShareDataUIState(FavoriteBundle favoriteBundle) {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new ShareDataUIState(favoriteBundle, null), 3, null);
        int i2 = getAsAtTimestamp + 13;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 97 / 0;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.FavouriteBundlesViewModel$addFavourite$1", f = "FavouriteBundlesViewModel.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int copydefault;
        final FavoriteBundle component2;
        int component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            FavouriteBundlesUiState favouriteBundlesUiState;
            List listEmptyList;
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component3;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlowAccess$get_uiState$p = FavouriteBundlesViewModel.access$get_uiState$p(FavouriteBundlesViewModel.this);
                do {
                    value = mutableStateFlowAccess$get_uiState$p.getValue();
                } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, FavouriteBundlesUiState.copy$default((FavouriteBundlesUiState) value, null, null, null, true, null, "Adding favourite...", 23, null)));
                this.component3 = 1;
                obj = FavouriteBundlesViewModel.access$getRepository$p(FavouriteBundlesViewModel.this).addFavourite(this.component2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Resource resource = (Resource) obj;
            if (resource.isSuccess()) {
                List<FavoriteBundle> otherBundles = ((FavouriteBundlesUiState) FavouriteBundlesViewModel.access$get_uiState$p(FavouriteBundlesViewModel.this).getValue()).getOtherBundles();
                FavoriteBundle favoriteBundle = this.component2;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : otherBundles) {
                    int i3 = ShareDataUIState + 5;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    if (((FavoriteBundle) obj2).getId() != favoriteBundle.getId()) {
                        arrayList.add(obj2);
                        int i5 = copydefault + 51;
                        ShareDataUIState = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 3 / 4;
                        }
                    }
                }
                ArrayList arrayList2 = arrayList;
                MutableStateFlow mutableStateFlowAccess$get_uiState$p2 = FavouriteBundlesViewModel.access$get_uiState$p(FavouriteBundlesViewModel.this);
                do {
                    value3 = mutableStateFlowAccess$get_uiState$p2.getValue();
                    favouriteBundlesUiState = (FavouriteBundlesUiState) value3;
                    listEmptyList = (List) resource.getData();
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                } while (!mutableStateFlowAccess$get_uiState$p2.compareAndSet(value3, FavouriteBundlesUiState.copy$default(favouriteBundlesUiState, listEmptyList, arrayList2, null, false, null, null, 20, null)));
            } else if (resource.isError()) {
                MutableStateFlow mutableStateFlowAccess$get_uiState$p3 = FavouriteBundlesViewModel.access$get_uiState$p(FavouriteBundlesViewModel.this);
                int i7 = ShareDataUIState + 37;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                do {
                    value2 = mutableStateFlowAccess$get_uiState$p3.getValue();
                } while (!mutableStateFlowAccess$get_uiState$p3.compareAndSet(value2, FavouriteBundlesUiState.copy$default((FavouriteBundlesUiState) value2, null, null, null, false, "Failed to add favourite", null, 7, null)));
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ShareDataUIState(FavoriteBundle favoriteBundle, Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
            this.component2 = favoriteBundle;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = FavouriteBundlesViewModel.this.new ShareDataUIState(this.component2, continuation);
            int i2 = ShareDataUIState + 85;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 97 / 0;
            }
            return shareDataUIState;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 23;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent3 = component3(coroutineScope, continuation);
            int i4 = ShareDataUIState + 69;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objComponent3;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 1;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((ShareDataUIState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 40 / 0;
            }
            int i5 = copydefault + 59;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    private final void component1(FavoriteBundle favoriteBundle) {
        int i = 2 % 2;
        Object obj = null;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component2(favoriteBundle, null), 3, null);
        int i2 = getAsAtTimestamp + 21;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.FavouriteBundlesViewModel$deleteFavourite$1", f = "FavouriteBundlesViewModel.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;
        final FavoriteBundle component1;
        int component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            FavouriteBundlesUiState favouriteBundlesUiState;
            List listEmptyList;
            int i = 2 % 2;
            int i2 = copydefault + 97;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.component3;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlowAccess$get_uiState$p = FavouriteBundlesViewModel.access$get_uiState$p(FavouriteBundlesViewModel.this);
                do {
                    value = mutableStateFlowAccess$get_uiState$p.getValue();
                } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, FavouriteBundlesUiState.copy$default((FavouriteBundlesUiState) value, null, null, null, true, null, "Deleting favourite...", 23, null)));
                this.component3 = 1;
                obj = FavouriteBundlesViewModel.access$getRepository$p(FavouriteBundlesViewModel.this).removeFavourite(this.component1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Resource resource = (Resource) obj;
            if (resource.isSuccess()) {
                List listPlus = CollectionsKt.plus((Collection<? extends FavoriteBundle>) ((FavouriteBundlesUiState) FavouriteBundlesViewModel.access$get_uiState$p(FavouriteBundlesViewModel.this).getValue()).getOtherBundles(), this.component1);
                MutableStateFlow mutableStateFlowAccess$get_uiState$p2 = FavouriteBundlesViewModel.access$get_uiState$p(FavouriteBundlesViewModel.this);
                do {
                    value3 = mutableStateFlowAccess$get_uiState$p2.getValue();
                    favouriteBundlesUiState = (FavouriteBundlesUiState) value3;
                    listEmptyList = (List) resource.getData();
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                        int i4 = copydefault + 15;
                        ShareDataUIState = i4 % 128;
                        int i5 = i4 % 2;
                    }
                } while (!mutableStateFlowAccess$get_uiState$p2.compareAndSet(value3, FavouriteBundlesUiState.copy$default(favouriteBundlesUiState, listEmptyList, listPlus, null, false, null, null, 20, null)));
            } else if (resource.isError()) {
                MutableStateFlow mutableStateFlowAccess$get_uiState$p3 = FavouriteBundlesViewModel.access$get_uiState$p(FavouriteBundlesViewModel.this);
                do {
                    value2 = mutableStateFlowAccess$get_uiState$p3.getValue();
                } while (!mutableStateFlowAccess$get_uiState$p3.compareAndSet(value2, FavouriteBundlesUiState.copy$default((FavouriteBundlesUiState) value2, null, null, null, false, "Failed to remove favourite", null, 7, null)));
            }
            Unit unit = Unit.INSTANCE;
            int i6 = copydefault + 35;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component2(FavoriteBundle favoriteBundle, Continuation<? super component2> continuation) {
            super(2, continuation);
            this.component1 = favoriteBundle;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = FavouriteBundlesViewModel.this.new component2(this.component1, continuation);
            int i2 = ShareDataUIState + 111;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 80 / 0;
            }
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 31;
            copydefault = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                component2(coroutineScope2, continuation2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objComponent2 = component2(coroutineScope2, continuation2);
            int i3 = copydefault + 87;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 121;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            component2 component2Var = (component2) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                component2Var.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = component2Var.invokeSuspend(unit);
            int i4 = ShareDataUIState + 121;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.FavouriteBundlesViewModel$reorderFavourites$1", f = "FavouriteBundlesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int copy = 1;
        int ShareDataUIState;
        final int component3;
        final int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            Object value;
            int i = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.ShareDataUIState != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (FavouriteBundlesViewModel.access$getOriginalOrder$p(FavouriteBundlesViewModel.this) == null) {
                FavouriteBundlesViewModel favouriteBundlesViewModel = FavouriteBundlesViewModel.this;
                FavouriteBundlesViewModel.access$setOriginalOrder$p(favouriteBundlesViewModel, ((FavouriteBundlesUiState) FavouriteBundlesViewModel.access$get_uiState$p(favouriteBundlesViewModel).getValue()).getFavouriteBundles());
            }
            List mutableList = CollectionsKt.toMutableList((Collection) ((FavouriteBundlesUiState) FavouriteBundlesViewModel.access$get_uiState$p(FavouriteBundlesViewModel.this).getValue()).getFavouriteBundles());
            mutableList.add(this.component3, (FavoriteBundle) mutableList.remove(this.copydefault));
            MutableStateFlow mutableStateFlowAccess$get_uiState$p = FavouriteBundlesViewModel.access$get_uiState$p(FavouriteBundlesViewModel.this);
            int i2 = copy + 85;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            do {
                value = mutableStateFlowAccess$get_uiState$p.getValue();
            } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, FavouriteBundlesUiState.copy$default((FavouriteBundlesUiState) value, mutableList, null, null, false, null, null, 22, null)));
            int i4 = copy + 57;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        copydefault(int i, int i2, Continuation<? super copydefault> continuation) {
            super(2, continuation);
            this.copydefault = i;
            this.component3 = i2;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = FavouriteBundlesViewModel.this.new copydefault(this.copydefault, this.component3, continuation);
            int i2 = copy + 63;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return copydefaultVar;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 45;
            copy = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return component1(coroutineScope2, continuation2);
            }
            component1(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 95;
            copy = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = copy + 95;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    private final void component3(int i, int i2) {
        int i3 = 2 % 2;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new copydefault(i, i2, null), 3, null);
        int i4 = copy + 45;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void copydefault() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new copy(null), 3, null);
        int i2 = copy + 21;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 45 / 0;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.FavouriteBundlesViewModel$updateReorder$1", f = "FavouriteBundlesViewModel.kt", i = {0}, l = {228}, m = "invokeSuspend", n = {"currentList"}, s = {"L$0"})
    static final class copy extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component1;
        int component2;
        Object component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            Object value;
            List<FavoriteBundle> list;
            Object value2;
            FavouriteBundlesUiState favouriteBundlesUiState;
            List<FavoriteBundle> listAccess$getOriginalOrder$p;
            MutableStateFlow mutableStateFlowAccess$get_uiState$p;
            Object value3;
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component2;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlowAccess$get_uiState$p2 = FavouriteBundlesViewModel.access$get_uiState$p(FavouriteBundlesViewModel.this);
                do {
                    value = mutableStateFlowAccess$get_uiState$p2.getValue();
                } while (!mutableStateFlowAccess$get_uiState$p2.compareAndSet(value, FavouriteBundlesUiState.copy$default((FavouriteBundlesUiState) value, null, null, null, true, null, "Reordering favourites...", 23, null)));
                int i3 = component1 + 83;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                List<FavoriteBundle> mutableList = CollectionsKt.toMutableList((Collection) FavouriteBundlesViewModel.this.getUiState().getValue().getFavouriteBundles());
                this.component3 = mutableList;
                this.component2 = 1;
                Object objReorderFavourites = FavouriteBundlesViewModel.access$getRepository$p(FavouriteBundlesViewModel.this).reorderFavourites(mutableList, this);
                if (objReorderFavourites == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = mutableList;
                obj = objReorderFavourites;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.component3;
                ResultKt.throwOnFailure(obj);
            }
            Resource resource = (Resource) obj;
            if (!(!resource.isSuccess())) {
                int i5 = ShareDataUIState + 17;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    FavouriteBundlesViewModel.access$setOriginalOrder$p(FavouriteBundlesViewModel.this, null);
                    mutableStateFlowAccess$get_uiState$p = FavouriteBundlesViewModel.access$get_uiState$p(FavouriteBundlesViewModel.this);
                    int i6 = 69 / 0;
                } else {
                    FavouriteBundlesViewModel.access$setOriginalOrder$p(FavouriteBundlesViewModel.this, null);
                    mutableStateFlowAccess$get_uiState$p = FavouriteBundlesViewModel.access$get_uiState$p(FavouriteBundlesViewModel.this);
                }
                do {
                    value3 = mutableStateFlowAccess$get_uiState$p.getValue();
                } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value3, FavouriteBundlesUiState.copy$default((FavouriteBundlesUiState) value3, list, null, null, false, null, null, 22, null)));
            } else if (resource.isError()) {
                MutableStateFlow mutableStateFlowAccess$get_uiState$p3 = FavouriteBundlesViewModel.access$get_uiState$p(FavouriteBundlesViewModel.this);
                FavouriteBundlesViewModel favouriteBundlesViewModel = FavouriteBundlesViewModel.this;
                do {
                    value2 = mutableStateFlowAccess$get_uiState$p3.getValue();
                    favouriteBundlesUiState = (FavouriteBundlesUiState) value2;
                    listAccess$getOriginalOrder$p = FavouriteBundlesViewModel.access$getOriginalOrder$p(favouriteBundlesViewModel);
                    if (listAccess$getOriginalOrder$p == null) {
                        int i7 = component1 + 53;
                        ShareDataUIState = i7 % 128;
                        if (i7 % 2 == 0) {
                            throw null;
                        }
                        listAccess$getOriginalOrder$p = list;
                    }
                } while (!mutableStateFlowAccess$get_uiState$p3.compareAndSet(value2, FavouriteBundlesUiState.copy$default(favouriteBundlesUiState, listAccess$getOriginalOrder$p, null, null, false, "Failed to reorder favourites", null, 6, null)));
                FavouriteBundlesViewModel.access$setOriginalOrder$p(FavouriteBundlesViewModel.this, null);
                int i8 = component1 + 39;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
            }
            return Unit.INSTANCE;
        }

        copy(Continuation<? super copy> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copy copyVar = FavouriteBundlesViewModel.this.new copy(continuation);
            int i2 = component1 + 61;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 13 / 0;
            }
            return copyVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 111;
            ShareDataUIState = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return ShareDataUIState(coroutineScope2, continuation2);
            }
            ShareDataUIState(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 65;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copy) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 81 / 0;
            }
            return objInvokeSuspend;
        }
    }

    static {
        int i = 1 + 71;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
