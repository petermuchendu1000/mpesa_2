package com.huawei.digitalpayment.consumer.sfcui.buybundles.repository;

import androidx.room.RoomDatabaseKt;
import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.daos.neobundles.NeoBundlesDao;
import com.huawei.digitalpayment.consumer.base.database.entities.neobundles.entity.NeoProductTypeEntity;
import com.huawei.digitalpayment.consumer.base.database.entities.neobundles.relation.NeoProductFullDetails;
import com.huawei.digitalpayment.consumer.base.database.entities.neobundles.relation.NeoSubOfferingWithTypes;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallProductResponse;
import java.util.ArrayList;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tJ\u001c\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0002\u0010\u000fJ\u001c\u0010\u0010\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082@¢\u0006\u0002\u0010\u000fJ\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/repository/NeoBundlesRepository;", "", "neoBundlesDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/neobundles/NeoBundlesDao;", "appDatabase", "Lcom/huawei/digitalpayment/consumer/base/database/AppDatabase;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/daos/neobundles/NeoBundlesDao;Lcom/huawei/digitalpayment/consumer/base/database/AppDatabase;)V", "getAllBundles", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataCallProductResponse;", "saveBundles", "", "productCatalog", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveBundlesImpl", "transformCached", "cached", "Lcom/huawei/digitalpayment/consumer/base/database/entities/neobundles/relation/NeoProductFullDetails;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NeoBundlesRepository {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copy = 1;
    private static int copydefault;
    private final NeoBundlesDao ShareDataUIState;
    private final AppDatabase component2;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.NeoBundlesRepository", f = "NeoBundlesRepository.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {34, 40, 47}, m = "saveBundlesImpl", n = {"this", "dataCallProductResponse", "productEntity", "this", "productEntity", "dataCallSubOfferings", "this", "productEntity"}, s = {"L$0", "L$2", "L$3", "L$0", "L$2", "L$4", "L$0", "L$2"})
    static final class component2 extends ContinuationImpl {
        private static int component4 = 1;
        private static int getAsAtTimestamp;
        Object ShareDataUIState;
        Object component1;
        Object component2;
        Object component3;
        Object copydefault;
        Object equals;
        int getRequestBeneficiariesState;

        component2(Continuation<? super component2> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component4 + 69;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            this.equals = obj;
            this.getRequestBeneficiariesState |= Integer.MIN_VALUE;
            NeoBundlesRepository neoBundlesRepository = NeoBundlesRepository.this;
            if (i3 != 0) {
                NeoBundlesRepository.access$saveBundlesImpl(neoBundlesRepository, null, this);
                throw null;
            }
            Object objAccess$saveBundlesImpl = NeoBundlesRepository.access$saveBundlesImpl(neoBundlesRepository, null, this);
            int i4 = getAsAtTimestamp + 27;
            component4 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 63 / 0;
            }
            return objAccess$saveBundlesImpl;
        }
    }

    @Inject
    public NeoBundlesRepository(NeoBundlesDao neoBundlesDao, AppDatabase appDatabase) {
        Intrinsics.checkNotNullParameter(neoBundlesDao, "");
        Intrinsics.checkNotNullParameter(appDatabase, "");
        this.ShareDataUIState = neoBundlesDao;
        this.component2 = appDatabase;
    }

    public static final Object access$saveBundlesImpl(NeoBundlesRepository neoBundlesRepository, List list, Continuation continuation) {
        int i = 2 % 2;
        int i2 = copy + 49;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            neoBundlesRepository.copydefault(list, continuation);
            obj.hashCode();
            throw null;
        }
        Object objCopydefault = neoBundlesRepository.copydefault(list, continuation);
        int i3 = copy + 19;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return objCopydefault;
        }
        throw null;
    }

    public static final List access$transformCached(NeoBundlesRepository neoBundlesRepository, List list) {
        int i = 2 % 2;
        int i2 = component1 + 87;
        copy = i2 % 128;
        int i3 = i2 % 2;
        List<DataCallProductResponse> listComponent3 = neoBundlesRepository.component3(list);
        int i4 = component1 + 85;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return listComponent3;
    }

    public final Object saveBundles(List<DataCallProductResponse> list, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        Object objWithTransaction = RoomDatabaseKt.withTransaction(this.component2, new component1(list, null), continuation);
        if (objWithTransaction == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            int i2 = component1 + 3;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return objWithTransaction;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = copy + 117;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return unit;
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.NeoBundlesRepository$saveBundles$2", f = "NeoBundlesRepository.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int component3;
        int ShareDataUIState;
        final List<DataCallProductResponse> copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.ShareDataUIState;
            if (i2 != 0) {
                int i3 = component3 + 21;
                int i4 = i3 % 128;
                component1 = i4;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i4 + 101;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.ShareDataUIState = 1;
                if (NeoBundlesRepository.access$saveBundlesImpl(NeoBundlesRepository.this, this.copydefault, this) == coroutine_suspended) {
                    int i6 = component1 + 55;
                    component3 = i6 % 128;
                    int i7 = i6 % 2;
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component1(List<DataCallProductResponse> list, Continuation<? super component1> continuation) {
            super(1, continuation);
            this.copydefault = list;
        }

        @Override
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = NeoBundlesRepository.this.new component1(this.copydefault, continuation);
            int i2 = component3 + 107;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return component1Var;
        }

        @Override
        public Object invoke(Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 101;
            component1 = i2 % 128;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                component3(continuation2);
                throw null;
            }
            Object objComponent3 = component3(continuation2);
            int i3 = component3 + 15;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return objComponent3;
        }

        public final Object component3(Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 49;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            component1 component1Var = (component1) create(continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return component1Var.invokeSuspend(unit);
            }
            component1Var.invokeSuspend(unit);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x010f -> B:29:0x00d6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0111 -> B:40:0x0117). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01a6 -> B:56:0x01aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01ad -> B:58:0x01b1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object copydefault(java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallProductResponse> r18, kotlin.coroutines.Continuation<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.NeoBundlesRepository.copydefault(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final List<DataCallProductResponse> component3(List<NeoProductFullDetails> list) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        for (NeoProductFullDetails neoProductFullDetails : list) {
            List<NeoSubOfferingWithTypes> subOfferings = neoProductFullDetails.getSubOfferings();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subOfferings, 10));
            for (NeoSubOfferingWithTypes neoSubOfferingWithTypes : subOfferings) {
                List<NeoProductTypeEntity> productTypes = neoSubOfferingWithTypes.getProductTypes();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(productTypes, 10));
                Iterator<T> it = productTypes.iterator();
                while (it.hasNext()) {
                    int i2 = component1 + 37;
                    copy = i2 % 128;
                    int i3 = i2 % 2;
                    arrayList3.add(NeoBundlesRepositoryKt.access$toDataCallProduct((NeoProductTypeEntity) it.next()));
                }
                arrayList2.add(NeoBundlesRepositoryKt.access$toDataCallSubOffering(neoSubOfferingWithTypes.getSubOffering(), arrayList3));
                int i4 = copy + 111;
                component1 = i4 % 128;
                int i5 = i4 % 2;
            }
            arrayList.add(NeoBundlesRepositoryKt.access$toDataCallProduct(neoProductFullDetails.getProduct(), arrayList2));
        }
        return arrayList;
    }

    public final Flow<List<DataCallProductResponse>> getAllBundles() {
        int i = 2 % 2;
        final Flow<List<NeoProductFullDetails>> allProductsWithDetails = this.ShareDataUIState.getAllProductsWithDetails();
        Flow<List<DataCallProductResponse>> flow = (Flow) new Flow<List<? extends DataCallProductResponse>>() {
            private static int component1 = 1;
            private static int copydefault;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements FlowCollector {
                private static int ShareDataUIState = 1;
                private static int copydefault;
                final NeoBundlesRepository component2;
                final FlowCollector component3;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.NeoBundlesRepository$getAllBundles$$inlined$map$1$2", f = "NeoBundlesRepository.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    private static int component3 = 0;
                    private static int copydefault = 1;
                    Object L$0;
                    int label;
                    Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override
                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        int i2 = copydefault + 97;
                        component3 = i2 % 128;
                        int i3 = i2 % 2;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        Object objEmit = AnonymousClass2.this.emit(null, this);
                        int i4 = component3 + 19;
                        copydefault = i4 % 128;
                        int i5 = i4 % 2;
                        return objEmit;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
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
                        boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.NeoBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        r2 = 1
                        if (r1 == r2) goto L9
                        goto L19
                    L9:
                        r1 = r7
                        com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.NeoBundlesRepository$getAllBundles$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.NeoBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                        int r3 = r1.label
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r3 & r4
                        if (r3 == 0) goto L19
                        int r7 = r1.label
                        int r7 = r7 + r4
                        r1.label = r7
                        goto L1e
                    L19:
                        com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.NeoBundlesRepository$getAllBundles$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.NeoBundlesRepository$getAllBundles$$inlined$map$1$2$1
                        r1.<init>(r7)
                    L1e:
                        java.lang.Object r7 = r1.result
                        java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r4 = r1.label
                        if (r4 == 0) goto L45
                        int r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.NeoBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.ShareDataUIState
                        int r6 = r6 + r2
                        int r1 = r6 % 128
                        com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.NeoBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.copydefault = r1
                        int r6 = r6 % r0
                        if (r4 != r2) goto L3d
                        int r1 = r1 + 123
                        int r6 = r1 % 128
                        com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.NeoBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.ShareDataUIState = r6
                        int r1 = r1 % r0
                        kotlin.ResultKt.throwOnFailure(r7)
                        goto L5e
                    L3d:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L45:
                        kotlin.ResultKt.throwOnFailure(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.component3
                        r4 = r1
                        kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                        java.util.List r6 = (java.util.List) r6
                        com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.NeoBundlesRepository r4 = r5.component2
                        java.util.List r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.NeoBundlesRepository.access$transformCached(r4, r6)
                        r1.label = r2
                        java.lang.Object r6 = r7.emit(r6, r1)
                        if (r6 != r3) goto L5e
                        return r3
                    L5e:
                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                        int r7 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.NeoBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.ShareDataUIState
                        int r7 = r7 + 19
                        int r1 = r7 % 128
                        com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.NeoBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.copydefault = r1
                        int r7 = r7 % r0
                        if (r7 != 0) goto L6c
                        return r6
                    L6c:
                        r6 = 0
                        throw r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.NeoBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }

                public AnonymousClass2(FlowCollector flowCollector, NeoBundlesRepository neoBundlesRepository) {
                    this.component3 = flowCollector;
                    this.component2 = neoBundlesRepository;
                }
            }

            @Override
            public Object collect(FlowCollector<? super List<? extends DataCallProductResponse>> flowCollector, Continuation continuation) {
                int i2 = 2 % 2;
                Object objCollect = allProductsWithDetails.collect(new AnonymousClass2(flowCollector, this), continuation);
                if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    int i3 = copydefault + 25;
                    component1 = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 11 / 0;
                    }
                    return objCollect;
                }
                Unit unit = Unit.INSTANCE;
                int i5 = component1 + 115;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 40 / 0;
                }
                return unit;
            }
        };
        int i2 = component1 + 7;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return flow;
    }

    static {
        int i = 1 + 75;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
