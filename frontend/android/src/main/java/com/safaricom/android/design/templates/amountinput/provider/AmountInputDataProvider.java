package com.safaricom.android.design.templates.amountinput.provider;

import com.safaricom.android.design.templates.amountinput.model.OverdraftInfo;
import com.safaricom.android.design.templates.amountinput.model.Wallet;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u001a\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/safaricom/android/design/templates/amountinput/provider/AmountInputDataProvider;", "", "balance", "Lkotlinx/coroutines/flow/Flow;", "", "getBalance", "()Lkotlinx/coroutines/flow/Flow;", "isBalanceOutdated", "", "overdraftInfo", "Lcom/safaricom/android/design/templates/amountinput/model/OverdraftInfo;", "getOverdraftInfo", "accountWallets", "", "Lcom/safaricom/android/design/templates/amountinput/model/Wallet;", "getAccountWallets", "showMultipleWalletTooltip", "getShowMultipleWalletTooltip", "ConsumerSfcAmountInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AmountInputDataProvider {
    Flow<List<Wallet>> getAccountWallets();

    Flow<Double> getBalance();

    Flow<OverdraftInfo> getOverdraftInfo();

    Flow<Boolean> getShowMultipleWalletTooltip();

    Flow<Boolean> isBalanceOutdated();
}
