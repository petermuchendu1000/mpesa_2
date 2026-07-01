package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents;

import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentCategory;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentItem;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Singleton
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fJ \u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00110\u000f0\u000eH\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00110\u000eH\u0016J\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentsRepositoryImpl;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentsRepository;", "frequentTransactionRepository", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentTransactionRepository;", "frequentMiniAppRepository", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentMiniAppRepository;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentTransactionRepository;Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/FrequentMiniAppRepository;)V", "saveFrequentItem", "", "frequentItem", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentItem;", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFrequentTransactions", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentCategory;", "", "getFrequentMiniApps", "removeFrequentItem", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FrequentsRepositoryImpl implements FrequentsRepository {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int copydefault = 1;
    private static int equals = 1;
    private final FrequentTransactionRepository component2;
    private final FrequentMiniAppRepository component3;

    @Inject
    public FrequentsRepositoryImpl(FrequentTransactionRepository frequentTransactionRepository, FrequentMiniAppRepository frequentMiniAppRepository) {
        Intrinsics.checkNotNullParameter(frequentTransactionRepository, "");
        Intrinsics.checkNotNullParameter(frequentMiniAppRepository, "");
        this.component2 = frequentTransactionRepository;
        this.component3 = frequentMiniAppRepository;
    }

    @Override
    public Object saveFrequentItem(FrequentItem frequentItem, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 == 0) {
            boolean z = frequentItem instanceof FrequentItem.TransactionItem;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (frequentItem instanceof FrequentItem.TransactionItem) {
            Object objInsertFrequentTransaction = this.component2.insertFrequentTransaction((FrequentItem.TransactionItem) frequentItem, continuation);
            if (objInsertFrequentTransaction != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return Unit.INSTANCE;
            }
            int i4 = equals + 31;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return objInsertFrequentTransaction;
        }
        if (!(frequentItem instanceof FrequentItem.MiniAppItem)) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = i3 + 77;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        Object objInsertFrequentMiniApp = this.component3.insertFrequentMiniApp((FrequentItem.MiniAppItem) frequentItem, continuation);
        if (objInsertFrequentMiniApp == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            int i8 = ShareDataUIState + 15;
            equals = i8 % 128;
            int i9 = i8 % 2;
            return objInsertFrequentMiniApp;
        }
        Unit unit = Unit.INSTANCE;
        int i10 = ShareDataUIState + 107;
        equals = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 64 / 0;
        }
        return unit;
    }

    @Override
    public Flow<Map<FrequentCategory, List<FrequentItem>>> getFrequentTransactions() {
        int i = 2 % 2;
        int i2 = equals + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Flow<Map<FrequentCategory, List<FrequentItem.TransactionItem>>> frequentTransactions = this.component2.getFrequentTransactions();
        int i4 = ShareDataUIState + 19;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return frequentTransactions;
    }

    @Override
    public Flow<List<FrequentItem>> getFrequentMiniApps() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Flow<List<FrequentItem.MiniAppItem>> frequentMiniApps = this.component3.getFrequentMiniApps();
        int i4 = ShareDataUIState + 71;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return frequentMiniApps;
    }

    @Override
    public Object removeFrequentItem(FrequentItem frequentItem, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        if (frequentItem instanceof FrequentItem.TransactionItem) {
            int i2 = ShareDataUIState + 115;
            equals = i2 % 128;
            int i3 = i2 % 2;
            Object objDeleteFrequentTransaction = this.component2.deleteFrequentTransaction((FrequentItem.TransactionItem) frequentItem, continuation);
            if (objDeleteFrequentTransaction != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return Unit.INSTANCE;
            }
            int i4 = ShareDataUIState + 69;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return objDeleteFrequentTransaction;
        }
        if (!(frequentItem instanceof FrequentItem.MiniAppItem)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objDeleteFrequentMiniApp = this.component3.deleteFrequentMiniApp((FrequentItem.MiniAppItem) frequentItem, continuation);
        if (objDeleteFrequentMiniApp != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return Unit.INSTANCE;
        }
        int i6 = ShareDataUIState + 57;
        equals = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 56 / 0;
        }
        return objDeleteFrequentMiniApp;
    }

    static {
        int i = 1 + 85;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 74 / 0;
        }
    }
}
