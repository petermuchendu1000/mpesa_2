package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents;

import com.huawei.digitalpayment.consumer.base.database.entities.FrequentEntity;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentItem;
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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\fH\u0016J\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentMiniAppRepositoryImpl;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentMiniAppRepository;", "localDatasource", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentsLocalDatasource;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentsLocalDatasource;)V", "insertFrequentMiniApp", "", "frequentItem", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentItem$MiniAppItem;", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentItem$MiniAppItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFrequentMiniApps", "Lkotlinx/coroutines/flow/Flow;", "", "deleteFrequentMiniApp", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FrequentMiniAppRepositoryImpl implements FrequentMiniAppRepository {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 125 % 128;
    private static int component2;
    private static int component3;
    private final FrequentsLocalDatasource copydefault;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImpl", f = "FrequentMiniAppRepositoryImpl.kt", i = {0, 0}, l = {16, 20, 22}, m = "insertFrequentMiniApp", n = {"this", "frequentItem"}, s = {"L$0", "L$1"})
    static final class component1 extends ContinuationImpl {
        private static int equals = 1;
        private static int getRequestBeneficiariesState;
        Object ShareDataUIState;
        int component2;
        Object component3;
        Object copydefault;

        component1(Continuation<? super component1> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = equals + 3;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            this.ShareDataUIState = obj;
            this.component2 |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objInsertFrequentMiniApp = FrequentMiniAppRepositoryImpl.this.insertFrequentMiniApp(null, this);
            int i4 = getRequestBeneficiariesState + 71;
            equals = i4 % 128;
            if (i4 % 2 != 0) {
                return objInsertFrequentMiniApp;
            }
            obj2.hashCode();
            throw null;
        }
    }

    @Inject
    public FrequentMiniAppRepositoryImpl(FrequentsLocalDatasource frequentsLocalDatasource) {
        Intrinsics.checkNotNullParameter(frequentsLocalDatasource, "");
        this.copydefault = frequentsLocalDatasource;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object insertFrequentMiniApp(com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentItem.MiniAppItem r24, kotlin.coroutines.Continuation<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImpl.insertFrequentMiniApp(com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentItem$MiniAppItem, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override
    public Object deleteFrequentMiniApp(FrequentItem.MiniAppItem miniAppItem, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String id = miniAppItem.getData().getId();
        if (id != null) {
            int i4 = ShareDataUIState + 67;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                this.copydefault.deleteFrequentItem(id, continuation);
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objDeleteFrequentItem = this.copydefault.deleteFrequentItem(id, continuation);
            if (objDeleteFrequentItem == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                int i5 = ShareDataUIState + 111;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return objDeleteFrequentItem;
            }
        }
        return Unit.INSTANCE;
    }

    @Override
    public Flow<List<FrequentItem.MiniAppItem>> getFrequentMiniApps() {
        int i = 2 % 2;
        final Flow<List<FrequentEntity>> frequentItemsByType = this.copydefault.getFrequentItemsByType("MINI_APP");
        Flow<List<FrequentItem.MiniAppItem>> flow = (Flow) new Flow<List<? extends FrequentItem.MiniAppItem>>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements FlowCollector {
                private static int component3 = 0;
                private static int copydefault = 1;
                final FlowCollector ShareDataUIState;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImpl$getFrequentMiniApps$$inlined$map$1$2", f = "FrequentMiniAppRepositoryImpl.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    private static int ShareDataUIState = 1;
                    private static int component1;
                    Object L$0;
                    int label;
                    Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override
                    public final Object invokeSuspend(Object obj) {
                        Object objEmit;
                        int i = 2 % 2;
                        int i2 = ShareDataUIState + 61;
                        component1 = i2 % 128;
                        int i3 = i2 % 2;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        if (i3 != 0) {
                            objEmit = anonymousClass2.emit(null, this);
                            int i4 = 22 / 0;
                        } else {
                            objEmit = anonymousClass2.emit(null, this);
                        }
                        int i5 = ShareDataUIState + 105;
                        component1 = i5 % 128;
                        int i6 = i5 % 2;
                        return objEmit;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        r0 = 2
                        int r1 = r0 % r0
                        int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImpl$getFrequentMiniApps$$inlined$map$1.AnonymousClass2.component3
                        int r1 = r1 + 31
                        int r2 = r1 % 128
                        com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImpl$getFrequentMiniApps$$inlined$map$1.AnonymousClass2.copydefault = r2
                        int r1 = r1 % r0
                        boolean r1 = r8 instanceof com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImpl$getFrequentMiniApps$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r1 == 0) goto L31
                        r1 = r8
                        com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImpl$getFrequentMiniApps$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImpl$getFrequentMiniApps$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                        int r2 = r1.label
                        r3 = -2147483648(0xffffffff80000000, float:-0.0)
                        r2 = r2 & r3
                        if (r2 == 0) goto L31
                        int r8 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImpl$getFrequentMiniApps$$inlined$map$1.AnonymousClass2.copydefault
                        int r8 = r8 + 77
                        int r2 = r8 % 128
                        com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImpl$getFrequentMiniApps$$inlined$map$1.AnonymousClass2.component3 = r2
                        int r8 = r8 % r0
                        if (r8 == 0) goto L2b
                        int r8 = r1.label
                        int r8 = r8 + r3
                        r1.label = r8
                        goto L36
                    L2b:
                        int r8 = r1.label
                        int r8 = r8 + r3
                        r1.label = r8
                        goto L36
                    L31:
                        com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImpl$getFrequentMiniApps$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImpl$getFrequentMiniApps$$inlined$map$1$2$1
                        r1.<init>(r8)
                    L36:
                        java.lang.Object r8 = r1.result
                        java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r3 = r1.label
                        r4 = 1
                        if (r3 == 0) goto L6d
                        int r7 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImpl$getFrequentMiniApps$$inlined$map$1.AnonymousClass2.component3
                        r1 = 47
                        int r7 = r7 + r1
                        int r2 = r7 % 128
                        com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImpl$getFrequentMiniApps$$inlined$map$1.AnonymousClass2.copydefault = r2
                        int r7 = r7 % r0
                        if (r7 != 0) goto L50
                        if (r3 != r4) goto L65
                        goto L52
                    L50:
                        if (r3 != r4) goto L65
                    L52:
                        int r2 = r2 + 15
                        int r7 = r2 % 128
                        com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImpl$getFrequentMiniApps$$inlined$map$1.AnonymousClass2.component3 = r7
                        int r2 = r2 % r0
                        if (r2 == 0) goto L61
                        kotlin.ResultKt.throwOnFailure(r8)
                        int r1 = r1 / 0
                        goto Lb2
                    L61:
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto Lb2
                    L65:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L6d:
                        kotlin.ResultKt.throwOnFailure(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.ShareDataUIState
                        r3 = r1
                        kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                        java.util.List r7 = (java.util.List) r7
                        java.lang.Iterable r7 = (java.lang.Iterable) r7
                        java.util.ArrayList r3 = new java.util.ArrayList
                        r5 = 10
                        int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r7, r5)
                        r3.<init>(r5)
                        java.util.Collection r3 = (java.util.Collection) r3
                        java.util.Iterator r7 = r7.iterator()
                    L8a:
                        boolean r5 = r7.hasNext()
                        if (r5 == 0) goto L9e
                        java.lang.Object r5 = r7.next()
                        com.huawei.digitalpayment.consumer.base.database.entities.FrequentEntity r5 = (com.huawei.digitalpayment.consumer.base.database.entities.FrequentEntity) r5
                        com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentItem$MiniAppItem r5 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImplKt.access$toFrequentMiniAppItem(r5)
                        r3.add(r5)
                        goto L8a
                    L9e:
                        java.util.List r3 = (java.util.List) r3
                        r1.label = r4
                        java.lang.Object r7 = r8.emit(r3, r1)
                        if (r7 != r2) goto Lb2
                        int r7 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImpl$getFrequentMiniApps$$inlined$map$1.AnonymousClass2.copydefault
                        int r7 = r7 + 65
                        int r8 = r7 % 128
                        com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImpl$getFrequentMiniApps$$inlined$map$1.AnonymousClass2.component3 = r8
                        int r7 = r7 % r0
                        return r2
                    Lb2:
                        kotlin.Unit r7 = kotlin.Unit.INSTANCE
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentMiniAppRepositoryImpl$getFrequentMiniApps$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.ShareDataUIState = flowCollector;
                }
            }

            @Override
            public Object collect(FlowCollector<? super List<? extends FrequentItem.MiniAppItem>> flowCollector, Continuation continuation) {
                int i2 = 2 % 2;
                Object objCollect = frequentItemsByType.collect(new AnonymousClass2(flowCollector), continuation);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return Unit.INSTANCE;
                }
                int i3 = component3 + 71;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 93;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return objCollect;
            }
        };
        int i2 = component3 + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return flow;
    }

    static {
        int i = 125 % 2;
    }
}
