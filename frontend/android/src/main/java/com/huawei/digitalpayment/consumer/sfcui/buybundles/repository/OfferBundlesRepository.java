package com.huawei.digitalpayment.consumer.sfcui.buybundles.repository;

import com.huawei.digitalpayment.consumer.base.database.daos.productcatalog.OfferBundleDao;
import com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.OfferBundleEntity;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfaMotoFetchOffersResponse;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/repository/OfferBundlesRepository;", "", "dao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/productcatalog/OfferBundleDao;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/daos/productcatalog/OfferBundleDao;)V", "saveBundles", "", "offerResponse", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OfaMotoFetchOffersResponse;", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OfaMotoFetchOffersResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllBundles", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OfferBundle;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OfferBundlesRepository {
    public static final int $stable = 8;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final OfferBundleDao ShareDataUIState;

    @Inject
    public OfferBundlesRepository(OfferBundleDao offerBundleDao) {
        Intrinsics.checkNotNullParameter(offerBundleDao, "");
        this.ShareDataUIState = offerBundleDao;
    }

    public final Object saveBundles(OfaMotoFetchOffersResponse ofaMotoFetchOffersResponse, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        String sessionID = ofaMotoFetchOffersResponse.getSessionID();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = ofaMotoFetchOffersResponse.getData().iterator();
        while (!(!it.hasNext())) {
            int i2 = component2 + 119;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            arrayList.add(OfferBundlesRepositoryKt.access$toEntity((OfferBundle) it.next(), sessionID));
        }
        Object objInsertAll = this.ShareDataUIState.insertAll(arrayList, continuation);
        if (objInsertAll != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return Unit.INSTANCE;
        }
        int i4 = copydefault + 61;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return objInsertAll;
    }

    public final Flow<List<OfferBundle>> getAllBundles() {
        int i = 2 % 2;
        final Flow<List<OfferBundleEntity>> allBundles = this.ShareDataUIState.getAllBundles();
        Flow<List<OfferBundle>> flow = (Flow) new Flow<List<? extends OfferBundle>>() {
            private static int component1 = 1;
            private static int component3;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements FlowCollector {
                private static int component2 = 1;
                private static int component3;
                final FlowCollector component1;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.OfferBundlesRepository$getAllBundles$$inlined$map$1$2", f = "OfferBundlesRepository.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    private static int component1 = 1;
                    private static int component3;
                    Object L$0;
                    int label;
                    Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override
                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        int i2 = component3 + 71;
                        component1 = i2 % 128;
                        int i3 = i2 % 2;
                        Object obj2 = null;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        if (i3 == 0) {
                            anonymousClass2.emit(null, this);
                            obj2.hashCode();
                            throw null;
                        }
                        Object objEmit = anonymousClass2.emit(null, this);
                        int i4 = component1 + 13;
                        component3 = i4 % 128;
                        if (i4 % 2 == 0) {
                            return objEmit;
                        }
                        throw null;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
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
                        boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.OfferBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        r2 = 1
                        r1 = r1 ^ r2
                        if (r1 == 0) goto La
                        goto L2b
                    La:
                        r1 = r7
                        com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.OfferBundlesRepository$getAllBundles$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.OfferBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                        int r3 = r1.label
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r3 & r4
                        if (r3 == 0) goto L2b
                        int r7 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.OfferBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.component3
                        int r7 = r7 + 115
                        int r3 = r7 % 128
                        com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.OfferBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.component2 = r3
                        int r7 = r7 % r0
                        if (r7 != 0) goto L25
                        int r7 = r1.label
                        int r7 = r7 * r4
                        r1.label = r7
                        goto L30
                    L25:
                        int r7 = r1.label
                        int r7 = r7 + r4
                        r1.label = r7
                        goto L30
                    L2b:
                        com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.OfferBundlesRepository$getAllBundles$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.OfferBundlesRepository$getAllBundles$$inlined$map$1$2$1
                        r1.<init>(r7)
                    L30:
                        java.lang.Object r7 = r1.result
                        java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r4 = r1.label
                        if (r4 == 0) goto L51
                        int r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.OfferBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.component3
                        int r6 = r6 + 119
                        int r1 = r6 % 128
                        com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.OfferBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.component2 = r1
                        int r6 = r6 % r0
                        if (r4 != r2) goto L49
                        kotlin.ResultKt.throwOnFailure(r7)
                        goto L8d
                    L49:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L51:
                        kotlin.ResultKt.throwOnFailure(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.component1
                        r0 = r1
                        kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                        java.util.List r6 = (java.util.List) r6
                        java.lang.Iterable r6 = (java.lang.Iterable) r6
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r4 = 10
                        int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r4)
                        r0.<init>(r4)
                        java.util.Collection r0 = (java.util.Collection) r0
                        java.util.Iterator r6 = r6.iterator()
                    L6e:
                        boolean r4 = r6.hasNext()
                        if (r4 == 0) goto L82
                        java.lang.Object r4 = r6.next()
                        com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.OfferBundleEntity r4 = (com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.OfferBundleEntity) r4
                        com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle r4 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.OfferBundlesRepositoryKt.access$toBundle(r4)
                        r0.add(r4)
                        goto L6e
                    L82:
                        java.util.List r0 = (java.util.List) r0
                        r1.label = r2
                        java.lang.Object r6 = r7.emit(r0, r1)
                        if (r6 != r3) goto L8d
                        return r3
                    L8d:
                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.OfferBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.component1 = flowCollector;
                }
            }

            @Override
            public Object collect(FlowCollector<? super List<? extends OfferBundle>> flowCollector, Continuation continuation) {
                int i2 = 2 % 2;
                Object objCollect = allBundles.collect(new AnonymousClass2(flowCollector), continuation);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return Unit.INSTANCE;
                }
                int i3 = component1;
                int i4 = i3 + 103;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                int i5 = i3 + 67;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    return objCollect;
                }
                throw null;
            }
        };
        int i2 = component2 + 69;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return flow;
        }
        throw null;
    }

    static {
        int i = 1 + 35;
        component3 = i % 128;
        int i2 = i % 2;
    }
}
