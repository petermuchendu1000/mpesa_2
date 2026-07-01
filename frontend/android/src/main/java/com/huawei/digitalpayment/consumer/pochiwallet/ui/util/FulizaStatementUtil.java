package com.huawei.digitalpayment.consumer.pochiwallet.ui.util;

import com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.resp.TransactionEntryGroup;
import com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.resp.TransactionEntryResp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/util/FulizaStatementUtil;", "", "<init>", "()V", "toLocalTransactionGroup", "", "Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/TransactionEntryGroup;", "statementList", "", "Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/TransactionEntryResp;", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FulizaStatementUtil {
    public static final int $stable = 0;
    public static final FulizaStatementUtil INSTANCE = new FulizaStatementUtil();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    private FulizaStatementUtil() {
    }

    public final List<TransactionEntryGroup> toLocalTransactionGroup(List<TransactionEntryResp> statementList) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(statementList, "");
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        List<TransactionEntryResp> list = statementList;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i2 = component1 + 121;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                arrayList2.contains(((TransactionEntryResp) it.next()).getTransactionTime());
                throw null;
            }
            TransactionEntryResp transactionEntryResp = (TransactionEntryResp) it.next();
            if (!arrayList2.contains(transactionEntryResp.getTransactionTime())) {
                arrayList2.add(transactionEntryResp.getTransactionTime());
            }
        }
        for (String str : arrayList2) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list) {
                if (!(!Intrinsics.areEqual(((TransactionEntryResp) obj).getTransactionTime(), str))) {
                    int i3 = copydefault + 75;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    arrayList3.add(obj);
                }
            }
            arrayList.add(new TransactionEntryGroup(str, CollectionsKt.toMutableList((Collection) arrayList3)));
            int i5 = component1 + 31;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
        }
        return CollectionsKt.toMutableList((Collection) arrayList);
    }

    static {
        int i = component3 + 29;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
