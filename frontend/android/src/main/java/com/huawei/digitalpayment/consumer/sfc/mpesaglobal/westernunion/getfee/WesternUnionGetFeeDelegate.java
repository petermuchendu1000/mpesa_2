package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.getfee;

import com.safaricom.consumer.commons.util.TextResource;
import com.safaricom.sharedui.compose.confirmation.ConfirmInfoItem;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001Jl\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0015H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/westernunion/getfee/WesternUnionGetFeeDelegate;", "", "feeInquiryRequestId", "", "getFeeInquiryRequestId", "()Ljava/lang/String;", "setFeeInquiryRequestId", "(Ljava/lang/String;)V", "getWesternUnionFee", "", "selectedCountryIso", "selectedStateIso", "selectedCountryName", "Lcom/safaricom/consumer/commons/util/TextResource;", "selectedCurrencyIso", "selectedCurrencyName", "fullName", "amount", "isCostEstimatorFlow", "", "confirmationLoadingObservable", "Lkotlinx/coroutines/flow/MutableStateFlow;", "confirmationDataObservable", "", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WesternUnionGetFeeDelegate {
    String getFeeInquiryRequestId();

    void getWesternUnionFee(String selectedCountryIso, String selectedStateIso, TextResource selectedCountryName, String selectedCurrencyIso, TextResource selectedCurrencyName, String fullName, String amount, boolean isCostEstimatorFlow, MutableStateFlow<Boolean> confirmationLoadingObservable, MutableStateFlow<List<ConfirmInfoItem>> confirmationDataObservable);

    void setFeeInquiryRequestId(String str);
}
