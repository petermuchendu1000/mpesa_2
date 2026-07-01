package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.getfee;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.consumer.commons.util.TextResource;
import com.safaricom.sharedui.compose.confirmation.ConfirmInfoItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J`\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000f0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000eH&¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtobank/getfee/SendToBankGetFeeDelegate;", "", "getSendToBankFee", "", "selectedCountryIso", "", "selectedCountryName", "Lcom/safaricom/consumer/commons/util/TextResource;", "selectedCurrencyIso", "selectedCurrencyName", "amount", "bankDetailsState", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtobank/bankdetails/BankDetailsState;", "confirmationLoadingObservable", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/payment/mvvm/Resource;", "confirmationDataObservable", "", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SendToBankGetFeeDelegate {
    void getSendToBankFee(String selectedCountryIso, TextResource selectedCountryName, String selectedCurrencyIso, TextResource selectedCurrencyName, String amount, BankDetailsState bankDetailsState, MutableStateFlow<Resource<Unit>> confirmationLoadingObservable, MutableStateFlow<List<ConfirmInfoItem>> confirmationDataObservable);
}
