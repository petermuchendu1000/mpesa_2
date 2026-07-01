package com.huawei.digitalpayment.consumer.pochiwallet.ui.resp;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/resp/OptOutItems;", "", "<init>", "()V", "createOptOutReasons", "", "Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/resp/OptOutReason;", "createPochiOptOutReasons", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OptOutItems {
    public static final int $stable = 0;
    public static final OptOutItems INSTANCE = new OptOutItems();
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    private OptOutItems() {
    }

    public final List<OptOutReason> createOptOutReasons() {
        int i = 2 % 2;
        List<OptOutReason> mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.listOf((Object[]) new OptOutReason[]{new OptOutReason(false, "Change of Sim card ownership", null, 4, null), new OptOutReason(false, "I no longer need the service", null, 4, null), new OptOutReason(false, "High cost/interest", null, 4, null), new OptOutReason(false, "Taking a break", null, 4, null)}));
        int i2 = ShareDataUIState + 27;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return mutableList;
        }
        throw null;
    }

    public final List<OptOutReason> createPochiOptOutReasons() {
        int i = 2 % 2;
        List<OptOutReason> mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.listOf((Object[]) new OptOutReason[]{new OptOutReason(false, "Upgrading to Till number", null, 4, null), new OptOutReason(false, "I no longer need the service", null, 4, null), new OptOutReason(false, "Cost related reasons", null, 4, null), new OptOutReason(false, "Other Reason", null, 4, null)}));
        int i2 = ShareDataUIState + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return mutableList;
    }

    static {
        int i = component2 + 87;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
