package com.huawei.digitalpayment.consumer.sfcui.buybundles.repository;

import com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService;
import com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle;
import com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundleWrapper;
import com.huawei.digitalpayment.consumer.sfcui.local.FavouriteBundlesLocalDataSource;
import com.safaricom.consumer.commons.resource.Resource;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ(\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\n0\t2\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\n2\u0006\u0010\u0013\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0014J\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\n2\u0006\u0010\u0013\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0014J(\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0096@¢\u0006\u0002\u0010\u0018J\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\nH\u0096@¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/repository/FavouriteBundlesRepositoryImpl;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/repository/FavouriteBundlesRepository;", "service", "Lcom/huawei/digitalpayment/consumer/sfcui/api/FavouriteBundlesService;", "localDataSource", "Lcom/huawei/digitalpayment/consumer/sfcui/local/FavouriteBundlesLocalDataSource;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/api/FavouriteBundlesService;Lcom/huawei/digitalpayment/consumer/sfcui/local/FavouriteBundlesLocalDataSource;)V", "getBundlesFavouritesMenu", "Lkotlinx/coroutines/flow/Flow;", "Lcom/safaricom/consumer/commons/resource/Resource;", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundleWrapper;", "forceRefresh", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavourites", "", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundle;", "addFavourite", "bundle", "(Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFavourite", "reorderFavourites", "reorderedBundles", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeAllFavourites", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocalFavorites", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FavouriteBundlesRepositoryImpl implements FavouriteBundlesRepository {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component4 = 59 % 128;
    private final FavouriteBundlesService component3;
    private final FavouriteBundlesLocalDataSource copydefault;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.FavouriteBundlesRepositoryImpl", f = "FavouriteBundlesRepository.kt", i = {0}, l = {174}, m = "removeAllFavourites", n = {"this"}, s = {"L$0"})
    static final class ShareDataUIState extends ContinuationImpl {
        private static int component1 = 0;
        private static int getRequestBeneficiariesState = 1;
        Object ShareDataUIState;
        int component2;
        Object copydefault;

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 45;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            this.copydefault = obj;
            this.component2 |= Integer.MIN_VALUE;
            Object objRemoveAllFavourites = FavouriteBundlesRepositoryImpl.this.removeAllFavourites(this);
            int i4 = getRequestBeneficiariesState + 17;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return objRemoveAllFavourites;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.FavouriteBundlesRepositoryImpl", f = "FavouriteBundlesRepository.kt", i = {0, 0, 1, 1}, l = {124, 126}, m = "removeFavourite", n = {"this", "currentFavourites", "this", "currentFavourites"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class component2 extends ContinuationImpl {
        private static int copy = 0;
        private static int getRequestBeneficiariesState = 1;
        int ShareDataUIState;
        Object component1;
        Object component2;
        Object component3;

        component2(Continuation<? super component2> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 115;
            copy = i2 % 128;
            int i3 = i2 % 2;
            this.component2 = obj;
            this.ShareDataUIState |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objRemoveFavourite = FavouriteBundlesRepositoryImpl.this.removeFavourite(null, this);
            int i4 = copy + 91;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                return objRemoveFavourite;
            }
            obj2.hashCode();
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.FavouriteBundlesRepositoryImpl", f = "FavouriteBundlesRepository.kt", i = {0, 1}, l = {97, 99}, m = "addFavourite", n = {"this", "this"}, s = {"L$0", "L$0"})
    static final class component3 extends ContinuationImpl {
        private static int component2 = 0;
        private static int copy = 1;
        Object component1;
        Object component3;
        int copydefault;

        component3(Continuation<? super component3> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = copy + 57;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            this.component3 = obj;
            this.copydefault |= Integer.MIN_VALUE;
            Object objAddFavourite = FavouriteBundlesRepositoryImpl.this.addFavourite(null, this);
            int i4 = copy + 17;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objAddFavourite;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.FavouriteBundlesRepositoryImpl", f = "FavouriteBundlesRepository.kt", i = {0}, l = {154}, m = "reorderFavourites", n = {"this"}, s = {"L$0"})
    static final class getRequestBeneficiariesState extends ContinuationImpl {
        private static int copydefault = 0;
        private static int equals = 1;
        Object component1;
        Object component2;
        int component3;

        getRequestBeneficiariesState(Continuation<? super getRequestBeneficiariesState> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = equals + 17;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.component1 = obj;
            this.component3 |= Integer.MIN_VALUE;
            FavouriteBundlesRepositoryImpl favouriteBundlesRepositoryImpl = FavouriteBundlesRepositoryImpl.this;
            getRequestBeneficiariesState getrequestbeneficiariesstate = this;
            if (i3 == 0) {
                return favouriteBundlesRepositoryImpl.reorderFavourites(null, getrequestbeneficiariesstate);
            }
            favouriteBundlesRepositoryImpl.reorderFavourites(null, getrequestbeneficiariesstate);
            obj2.hashCode();
            throw null;
        }
    }

    @Inject
    public FavouriteBundlesRepositoryImpl(FavouriteBundlesService favouriteBundlesService, FavouriteBundlesLocalDataSource favouriteBundlesLocalDataSource) {
        Intrinsics.checkNotNullParameter(favouriteBundlesService, "");
        Intrinsics.checkNotNullParameter(favouriteBundlesLocalDataSource, "");
        this.component3 = favouriteBundlesService;
        this.copydefault = favouriteBundlesLocalDataSource;
    }

    public static final FavouriteBundlesLocalDataSource access$getLocalDataSource$p(FavouriteBundlesRepositoryImpl favouriteBundlesRepositoryImpl) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 25;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        FavouriteBundlesLocalDataSource favouriteBundlesLocalDataSource = favouriteBundlesRepositoryImpl.copydefault;
        int i5 = i2 + 99;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return favouriteBundlesLocalDataSource;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final FavouriteBundlesService access$getService$p(FavouriteBundlesRepositoryImpl favouriteBundlesRepositoryImpl) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 71;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        FavouriteBundlesService favouriteBundlesService = favouriteBundlesRepositoryImpl.component3;
        int i5 = i2 + 31;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return favouriteBundlesService;
        }
        throw null;
    }

    @Override
    public Object getBundlesFavouritesMenu(boolean z, Continuation<? super Flow<Resource<FavoriteBundleWrapper>>> continuation) {
        int i = 2 % 2;
        Flow flow = FlowKt.flow(new component1(z, null));
        int i2 = ShareDataUIState + 79;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return flow;
        }
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/safaricom/consumer/commons/resource/Resource;", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundleWrapper;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.FavouriteBundlesRepositoryImpl$getBundlesFavouritesMenu$2", f = "FavouriteBundlesRepository.kt", i = {0, 0, 1, 1, 2, 2}, l = {33, 35, 38, 44, 46, 52, 54}, m = "invokeSuspend", n = {"$this$flow", "cached", "$this$flow", "cached", "$this$flow", "cached"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    static final class component1 extends SuspendLambda implements Function2<FlowCollector<? super Resource<? extends FavoriteBundleWrapper>>, Continuation<? super Unit>, Object> {
        private static int equals = 0;
        private static int getRequestBeneficiariesState = 1;
        private Object ShareDataUIState;
        Object component1;
        final boolean component2;
        int component3;

        /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x010c  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 376
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.FavouriteBundlesRepositoryImpl.component1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component1(boolean z, Continuation<? super component1> continuation) {
            super(2, continuation);
            this.component2 = z;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = FavouriteBundlesRepositoryImpl.this.new component1(this.component2, continuation);
            component1Var.ShareDataUIState = obj;
            component1 component1Var2 = component1Var;
            int i2 = equals + 91;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return component1Var2;
        }

        @Override
        public Object invoke(FlowCollector<? super Resource<? extends FavoriteBundleWrapper>> flowCollector, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 109;
            equals = i2 % 128;
            FlowCollector<? super Resource<? extends FavoriteBundleWrapper>> flowCollector2 = flowCollector;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return component1(flowCollector2, continuation2);
            }
            component1(flowCollector2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object component1(FlowCollector<? super Resource<FavoriteBundleWrapper>> flowCollector, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 9;
            equals = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 39 / 0;
            }
            return objInvokeSuspend;
        }
    }

    @Override
    public Object getFavourites(boolean z, Continuation<? super Flow<? extends Resource<? extends List<FavoriteBundle>>>> continuation) {
        int i = 2 % 2;
        Flow flow = FlowKt.flow(new copydefault(z, null));
        int i2 = component1 + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return flow;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/safaricom/consumer/commons/resource/Resource;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundle;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.FavouriteBundlesRepositoryImpl$getFavourites$2", f = "FavouriteBundlesRepository.kt", i = {0, 0, 1, 1, 2, 2}, l = {65, 67, 70, 75, 80, 82}, m = "invokeSuspend", n = {"$this$flow", "cached", "$this$flow", "cached", "$this$flow", "cached"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    static final class copydefault extends SuspendLambda implements Function2<FlowCollector<? super Resource<? extends List<? extends FavoriteBundle>>>, Continuation<? super Unit>, Object> {
        private static int equals = 1;
        private static int getAsAtTimestamp;
        private Object ShareDataUIState;
        final boolean component1;
        int component3;
        Object copydefault;

        /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00b0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 358
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.FavouriteBundlesRepositoryImpl.copydefault.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        copydefault(boolean z, Continuation<? super copydefault> continuation) {
            super(2, continuation);
            this.component1 = z;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = FavouriteBundlesRepositoryImpl.this.new copydefault(this.component1, continuation);
            copydefaultVar.ShareDataUIState = obj;
            copydefault copydefaultVar2 = copydefaultVar;
            int i2 = equals + 33;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return copydefaultVar2;
        }

        @Override
        public Object invoke(FlowCollector<? super Resource<? extends List<? extends FavoriteBundle>>> flowCollector, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 97;
            equals = i2 % 128;
            FlowCollector<? super Resource<? extends List<? extends FavoriteBundle>>> flowCollector2 = flowCollector;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return ShareDataUIState(flowCollector2, continuation2);
            }
            ShareDataUIState(flowCollector2, continuation2);
            throw null;
        }

        public final Object ShareDataUIState(FlowCollector<? super Resource<? extends List<FavoriteBundle>>> flowCollector, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 57;
            equals = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = equals + 117;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00de, code lost:
    
        if (r10 == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00eb, code lost:
    
        if (r10 == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ed, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ee, code lost:
    
        r11 = r10;
        r10 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127 A[PHI: r11
  0x0127: PHI (r11v27 com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundleWrapper) = 
  (r11v26 com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundleWrapper)
  (r11v33 com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundleWrapper)
 binds: [B:52:0x0125, B:49:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object addFavourite(com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle r10, kotlin.coroutines.Continuation<? super com.safaricom.consumer.commons.resource.Resource<? extends java.util.List<com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle>>> r11) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.FavouriteBundlesRepositoryImpl.addFavourite(com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final boolean component1(FavoriteBundle favoriteBundle, FavoriteBundle favoriteBundle2) {
        int i = 2 % 2;
        int i2 = component1 + 45;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(favoriteBundle, "");
            Intrinsics.checkNotNullParameter(favoriteBundle2, "");
            int i3 = 32 / 0;
            if (favoriteBundle2.getId() != favoriteBundle.getId()) {
                return false;
            }
        } else {
            Intrinsics.checkNotNullParameter(favoriteBundle, "");
            Intrinsics.checkNotNullParameter(favoriteBundle2, "");
            if (favoriteBundle2.getId() != favoriteBundle.getId()) {
                return false;
            }
        }
        int i4 = ShareDataUIState + 107;
        component1 = i4 % 128;
        return i4 % 2 != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object removeFavourite(final com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle r11, kotlin.coroutines.Continuation<? super com.safaricom.consumer.commons.resource.Resource<? extends java.util.List<com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle>>> r12) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.FavouriteBundlesRepositoryImpl.removeFavourite(com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object reorderFavourites(java.util.List<com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle> r10, kotlin.coroutines.Continuation<? super com.safaricom.consumer.commons.resource.Resource<? extends java.util.List<com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle>>> r11) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.FavouriteBundlesRepositoryImpl.reorderFavourites(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[PHI: r1
  0x0029: PHI (r1v25 com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.FavouriteBundlesRepositoryImpl$ShareDataUIState) = 
  (r1v24 com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.FavouriteBundlesRepositoryImpl$ShareDataUIState)
  (r1v27 com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.FavouriteBundlesRepositoryImpl$ShareDataUIState)
 binds: [B:10:0x0027, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object removeAllFavourites(kotlin.coroutines.Continuation<? super com.safaricom.consumer.commons.resource.Resource<? extends java.util.List<com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle>>> r14) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.FavouriteBundlesRepositoryImpl.removeAllFavourites(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override
    public List<FavoriteBundle> getLocalFavorites() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        List<FavoriteBundle> favoriteBundles = this.copydefault.getFavoriteBundles();
        int i4 = component1 + 43;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return favoriteBundles;
        }
        throw null;
    }

    public static boolean m11365$r8$lambda$JPu2o7jUVegw98Id_h3ru28OA(FavoriteBundle favoriteBundle, FavoriteBundle favoriteBundle2) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zComponent1 = component1(favoriteBundle, favoriteBundle2);
        int i4 = component1 + 9;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return zComponent1;
    }

    static {
        if (59 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
