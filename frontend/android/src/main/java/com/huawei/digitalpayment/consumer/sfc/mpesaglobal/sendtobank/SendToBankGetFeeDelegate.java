package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank;

import com.safaricom.consumer.commons.util.TextResource;
import com.safaricom.sharedui.compose.confirmation.ConfirmInfoItem;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\\\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\rH&¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtobank/SendToBankGetFeeDelegate;", "", "getSendToBankFee", "", "selectedCountryIso", "", "selectedStateIso", "selectedCountryName", "Lcom/safaricom/consumer/commons/util/TextResource;", "selectedCurrencyIso", "selectedCurrencyName", "amount", "confirmationLoadingObservable", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "confirmationDataObservable", "", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SendToBankGetFeeDelegate {
    void getSendToBankFee(String selectedCountryIso, String selectedStateIso, TextResource selectedCountryName, String selectedCurrencyIso, TextResource selectedCurrencyName, String amount, MutableStateFlow<Boolean> confirmationLoadingObservable, MutableStateFlow<List<ConfirmInfoItem>> confirmationDataObservable);
}
