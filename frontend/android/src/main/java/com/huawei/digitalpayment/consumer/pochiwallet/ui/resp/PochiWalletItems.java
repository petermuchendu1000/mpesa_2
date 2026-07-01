package com.huawei.digitalpayment.consumer.pochiwallet.ui.resp;

import com.huawei.digitalpayment.consumer.remoteconfig.models.MiniAppIds;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u0016R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/resp/PochiWalletItems;", "", "<init>", "()V", "PAY", "Lkotlin/Pair;", "", "getPAY", "()Lkotlin/Pair;", "DEPOSIT_TO_POCHI", "getDEPOSIT_TO_POCHI", "WITHDRAW_FROM_POCHI", "getWITHDRAW_FROM_POCHI", "ZIIDI_FOR_POCHI", "getZIIDI_FOR_POCHI", "TAASI_POCHI", "getTAASI_POCHI", "createPochiHomeFunctions", "", "Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/resp/PochiWalletFunction;", "createPochiDoMoreFunctons", "miniAppIds", "Lcom/huawei/digitalpayment/consumer/remoteconfig/models/MiniAppIds;", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PochiWalletItems {
    public static final int $stable = 0;
    private static int component4 = 1;
    private static int copy = 1;
    private static int getAsAtTimestamp;
    private static int getRequestBeneficiariesState;
    public static final PochiWalletItems INSTANCE = new PochiWalletItems();
    private static final Pair<String, String> component2 = new Pair<>("1", "Pay");
    private static final Pair<String, String> component3 = new Pair<>("2", "Deposit to Pochi");
    private static final Pair<String, String> component1 = new Pair<>("3", "Withdraw from Pochi");
    private static final Pair<String, String> ShareDataUIState = new Pair<>("4", "Ziidi for Pochi");
    private static final Pair<String, String> copydefault = new Pair<>("4", "Taasi Pochi");

    private PochiWalletItems() {
    }

    static {
        int i = getRequestBeneficiariesState + 67;
        copy = i % 128;
        int i2 = i % 2;
    }

    public final Pair<String, String> getPAY() {
        int i = 2 % 2;
        int i2 = component4 + 5;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Pair<String, String> pair = component2;
        int i4 = i3 + 47;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return pair;
        }
        throw null;
    }

    public final Pair<String, String> getDEPOSIT_TO_POCHI() {
        int i = 2 % 2;
        int i2 = component4 + 85;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        Pair<String, String> pair = component3;
        int i5 = i3 + 37;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return pair;
        }
        throw null;
    }

    public final Pair<String, String> getWITHDRAW_FROM_POCHI() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 107;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        Pair<String, String> pair = component1;
        int i5 = i2 + 29;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return pair;
    }

    public final Pair<String, String> getZIIDI_FOR_POCHI() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 83;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        Pair<String, String> pair = ShareDataUIState;
        int i5 = i2 + 69;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return pair;
        }
        throw null;
    }

    public final Pair<String, String> getTAASI_POCHI() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 33;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return copydefault;
        }
        throw null;
    }

    public final List<PochiWalletFunction> createPochiHomeFunctions() {
        int i = 2 % 2;
        Pair<String, String> pair = component2;
        PochiWalletFunction pochiWalletFunction = new PochiWalletFunction(pair.getFirst(), R.drawable.ic_pochi_pay, pair.getSecond(), "/pochiWalletModule/pochiWalletPay");
        Pair<String, String> pair2 = component3;
        PochiWalletFunction pochiWalletFunction2 = new PochiWalletFunction(pair2.getFirst(), R.drawable.ic_deposit_to_pochi, pair2.getSecond(), "/pochiWalletModule/depositToPochi");
        Pair<String, String> pair3 = component1;
        List<PochiWalletFunction> mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.listOf((Object[]) new PochiWalletFunction[]{pochiWalletFunction, pochiWalletFunction2, new PochiWalletFunction(pair3.getFirst(), R.drawable.ic_withdraw_from_pochi, pair3.getSecond(), "/pochiWalletModule/withdrawFromPochi")}));
        int i2 = component4 + 71;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return mutableList;
        }
        throw null;
    }

    public final List<PochiWalletFunction> createPochiDoMoreFunctons(MiniAppIds miniAppIds) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(miniAppIds, "");
        Pair<String, String> pair = ShareDataUIState;
        PochiWalletFunction pochiWalletFunction = new PochiWalletFunction(pair.getFirst(), R.drawable.ic_ziidi_for_pochi, pair.getSecond(), miniAppIds.getZiidiPochiMiniAppId());
        Pair<String, String> pair2 = copydefault;
        List<PochiWalletFunction> mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.listOf((Object[]) new PochiWalletFunction[]{pochiWalletFunction, new PochiWalletFunction(pair2.getFirst(), R.drawable.ic_taasi_pochi, pair2.getSecond(), miniAppIds.getTaasiPochiMiniAppId())}));
        int i2 = component4 + 39;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return mutableList;
    }
}
