package com.huawei.digitalpayment.consumer.fixeddata.domain.model;

import com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountState;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"allowedActions", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountAction;", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountState;", "getAllowedActions", "(Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountState;)Ljava/util/Set;", "visibleActions", "", "getVisibleActions", "(Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountState;)Ljava/util/List;", "ConsumerSfcFixedData_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AccountStateKt {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    public static final Set<AccountAction> getAllowedActions(AccountState accountState) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(accountState, "");
        if (Intrinsics.areEqual(accountState, AccountState.NoAccount.INSTANCE)) {
            return SetsKt.emptySet();
        }
        if (Intrinsics.areEqual(accountState, AccountState.NoProduct.INSTANCE)) {
            int i4 = ShareDataUIState + 81;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return SetsKt.setOf(AccountAction.BUY_PLAN);
        }
        if (!(accountState instanceof AccountState.Inactive)) {
            if (accountState instanceof AccountState.Active) {
                return SetsKt.setOf((Object[]) new AccountAction[]{AccountAction.CHANGE_PLAN, AccountAction.TOP_UP});
            }
            throw new NoWhenBranchMatchedException();
        }
        int i6 = copydefault + 109;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return SetsKt.setOf((Object[]) new AccountAction[]{AccountAction.CHANGE_PLAN, AccountAction.PAY});
        }
        AccountAction[] accountActionArr = new AccountAction[4];
        accountActionArr[0] = AccountAction.CHANGE_PLAN;
        accountActionArr[0] = AccountAction.PAY;
        return SetsKt.setOf((Object[]) accountActionArr);
    }

    public static final List<AccountAction> getVisibleActions(AccountState accountState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accountState, "");
        List<AccountAction> listTake = CollectionsKt.take(CollectionsKt.sortedWith(getAllowedActions(accountState), new Comparator() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            /* JADX WARN: Multi-variable type inference failed */
            @Override
            public final int compare(T t, T t2) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 107;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                int iCompareValues = ComparisonsKt.compareValues(Integer.valueOf(((AccountAction) t).getOrder()), Integer.valueOf(((AccountAction) t2).getOrder()));
                int i5 = ShareDataUIState + 109;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return iCompareValues;
            }
        }), 2);
        int i2 = ShareDataUIState + 39;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return listTake;
    }
}
