package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents;

import com.huawei.digitalpayment.consumer.base.database.entities.FrequentEntity;
import com.huawei.digitalpayment.consumer.home.ui.utils.ComponentTypeConstants;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentCategory;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentItem;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentTransaction;
import com.safaricom.consumer.commons.transaction.TransactionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ \u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\r0\fH\u0016J\u0016\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ(\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentTransactionRepositoryImpl;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentTransactionRepository;", "localDatasource", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentsLocalDatasource;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentsLocalDatasource;)V", "insertFrequentTransaction", "", "frequentItem", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentItem$TransactionItem;", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentItem$TransactionItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFrequentTransactions", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentCategory;", "", "deleteFrequentTransaction", "buildCategoryListMap", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransaction;", ComponentTypeConstants.TYPE_TRANSACTIONS, "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FrequentTransactionRepositoryImpl implements FrequentTransactionRepository {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 51 % 128;
    private static int component3;
    private static int copydefault;
    private final FrequentsLocalDatasource component2;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImpl", f = "FrequentTransactionRepositoryImpl.kt", i = {0, 0}, l = {19, 23, 25}, m = "insertFrequentTransaction", n = {"this", "frequentItem"}, s = {"L$0", "L$1"})
    static final class ShareDataUIState extends ContinuationImpl {
        private static int equals = 1;
        private static int getAsAtTimestamp;
        Object ShareDataUIState;
        int component1;
        Object component2;
        Object component3;

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 21;
            equals = i2 % 128;
            int i3 = i2 % 2;
            this.component3 = obj;
            this.component1 |= Integer.MIN_VALUE;
            Object objInsertFrequentTransaction = FrequentTransactionRepositoryImpl.this.insertFrequentTransaction(null, this);
            int i4 = equals + 59;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return objInsertFrequentTransaction;
        }
    }

    @Inject
    public FrequentTransactionRepositoryImpl(FrequentsLocalDatasource frequentsLocalDatasource) {
        Intrinsics.checkNotNullParameter(frequentsLocalDatasource, "");
        this.component2 = frequentsLocalDatasource;
    }

    public static final Map access$buildCategoryListMap(FrequentTransactionRepositoryImpl frequentTransactionRepositoryImpl, List list) {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return frequentTransactionRepositoryImpl.copydefault(list);
        }
        frequentTransactionRepositoryImpl.copydefault(list);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object insertFrequentTransaction(com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentItem.TransactionItem r23, kotlin.coroutines.Continuation<? super kotlin.Unit> r24) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImpl.insertFrequentTransaction(com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentItem$TransactionItem, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override
    public Object deleteFrequentTransaction(FrequentItem.TransactionItem transactionItem, Continuation<? super Unit> continuation) {
        Object objDeleteFrequentItem;
        int i = 2 % 2;
        int i2 = copydefault + 67;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            transactionItem.getData().getId();
            obj.hashCode();
            throw null;
        }
        String id = transactionItem.getData().getId();
        if (id == null || (objDeleteFrequentItem = this.component2.deleteFrequentItem(id, continuation)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            Unit unit = Unit.INSTANCE;
            int i3 = copydefault + 49;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        int i5 = copydefault;
        int i6 = i5 + 107;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 54 / 0;
        }
        int i8 = i5 + 93;
        ShareDataUIState = i8 % 128;
        if (i8 % 2 != 0) {
            return objDeleteFrequentItem;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Map<FrequentCategory, List<FrequentTransaction>> copydefault(List<FrequentTransaction> list) {
        int i = 2 % 2;
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = list.iterator();
        int i2 = copydefault + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        while (!(!it.hasNext())) {
            int i4 = copydefault + 57;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                linkedHashMap.get(((FrequentTransaction) it.next()).getTransactionType());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object next = it.next();
            TransactionType transactionType = ((FrequentTransaction) next).getTransactionType();
            Object obj2 = linkedHashMap.get(transactionType);
            if (obj2 == null) {
                obj2 = (List) new ArrayList();
                linkedHashMap.put(transactionType, obj2);
            }
            ((List) obj2).add(next);
        }
        FrequentCategory.Apps apps = FrequentCategory.Apps.INSTANCE;
        List listEmptyList = (List) linkedHashMap.get(TransactionType.UNDEFINED);
        if (listEmptyList == null) {
            int i5 = ShareDataUIState + 93;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                listEmptyList = CollectionsKt.emptyList();
                int i6 = 96 / 0;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
        }
        mapCreateMapBuilder.put(apps, listEmptyList);
        FrequentCategory.Send send = FrequentCategory.Send.INSTANCE;
        List listEmptyList2 = (List) linkedHashMap.get(TransactionType.SEND_MONEY);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        mapCreateMapBuilder.put(send, listEmptyList2);
        mapCreateMapBuilder.put(FrequentCategory.Pay.INSTANCE, CollectionsKt.flatten(CollectionsKt.listOfNotNull((Object[]) new List[]{linkedHashMap.get(TransactionType.PAY_BILL), linkedHashMap.get(TransactionType.BUY_GOODS)})));
        mapCreateMapBuilder.put(FrequentCategory.Bundles.INSTANCE, CollectionsKt.flatten(CollectionsKt.listOfNotNull((Object[]) new List[]{linkedHashMap.get(TransactionType.BUY_BUNDLES), linkedHashMap.get(TransactionType.BUY_BUNDLES_OD)})));
        return MapsKt.build(mapCreateMapBuilder);
    }

    @Override
    public Flow<Map<FrequentCategory, List<FrequentItem.TransactionItem>>> getFrequentTransactions() {
        int i = 2 % 2;
        final Flow<List<FrequentEntity>> frequentItemsByType = this.component2.getFrequentItemsByType("TRANSACTION");
        Flow<Map<FrequentCategory, List<FrequentItem.TransactionItem>>> flow = (Flow) new Flow<Map<FrequentCategory, ? extends List<? extends FrequentItem.TransactionItem>>>() {
            private static int component3 = 1;
            private static int copydefault;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements FlowCollector {
                private static int component2 = 0;
                private static int component3 = 1;
                final FlowCollector ShareDataUIState;
                final FrequentTransactionRepositoryImpl copydefault;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImpl$getFrequentTransactions$$inlined$map$1$2", f = "FrequentTransactionRepositoryImpl.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    private static int component2 = 1;
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
                        int i2 = component2 + 37;
                        component3 = i2 % 128;
                        int i3 = i2 % 2;
                        Object obj2 = null;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        AnonymousClass1 anonymousClass1 = this;
                        if (i3 == 0) {
                            return anonymousClass2.emit(null, anonymousClass1);
                        }
                        anonymousClass2.emit(null, anonymousClass1);
                        obj2.hashCode();
                        throw null;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
                    /*
                        Method dump skipped, instruction units count: 260
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.FrequentTransactionRepositoryImpl$getFrequentTransactions$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }

                public AnonymousClass2(FlowCollector flowCollector, FrequentTransactionRepositoryImpl frequentTransactionRepositoryImpl) {
                    this.ShareDataUIState = flowCollector;
                    this.copydefault = frequentTransactionRepositoryImpl;
                }
            }

            @Override
            public Object collect(FlowCollector<? super Map<FrequentCategory, ? extends List<? extends FrequentItem.TransactionItem>>> flowCollector, Continuation continuation) {
                int i2 = 2 % 2;
                Object objCollect = frequentItemsByType.collect(new AnonymousClass2(flowCollector, this), continuation);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return Unit.INSTANCE;
                }
                int i3 = component3 + 115;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 52 / 0;
                }
                return objCollect;
            }
        };
        int i2 = copydefault + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return flow;
    }

    static {
        int i = 51 % 2;
    }
}
