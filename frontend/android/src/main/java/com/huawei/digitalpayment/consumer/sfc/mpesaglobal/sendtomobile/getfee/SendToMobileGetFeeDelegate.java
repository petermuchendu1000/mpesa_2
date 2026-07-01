package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.getfee;

import com.huawei.common.exception.BaseException;
import com.safaricom.sharedui.compose.confirmation.ConfirmInfoItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.onPictureInPictureModeChanged;
import kotlin.onPreparePanel;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001Jb\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001cH&J\u0012\u0010 \u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u0018\u0010\u000e\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/getfee/SendToMobileGetFeeDelegate;", "", "sendToMobileFeeInquiryRequestId", "", "getSendToMobileFeeInquiryRequestId", "()Ljava/lang/String;", "setSendToMobileFeeInquiryRequestId", "(Ljava/lang/String;)V", "firstName", "getFirstName", "setFirstName", "lastName", "getLastName", "setLastName", "middleName", "getMiddleName", "setMiddleName", "getSendToMobileFee", "", "phoneNumber", "amount", "selectedCountryIso", "selectedCountryName", "selectedCurrencyIso", "selectedCarrier", "isCostEstimatorFlow", "", "confirmationLoadingObservable", "Lkotlinx/coroutines/flow/MutableStateFlow;", "confirmationDataObservable", "", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem;", "handleSendToMobileError", "e", "Lcom/huawei/common/exception/BaseException;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SendToMobileGetFeeDelegate {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int component1 = 0;
        private static int component2 = 1;

        public static void handleSendToMobileError(SendToMobileGetFeeDelegate sendToMobileGetFeeDelegate, BaseException baseException) {
            int i = 2 % 2;
            int i2 = component2 + 37;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        public static void copydefault() {
            onPreparePanel.ShareDataUIState[0] = onPictureInPictureModeChanged.component2[0];
        }
    }

    String getFirstName();

    String getLastName();

    String getMiddleName();

    void getSendToMobileFee(String phoneNumber, String amount, String selectedCountryIso, String selectedCountryName, String selectedCurrencyIso, String selectedCarrier, boolean isCostEstimatorFlow, MutableStateFlow<Boolean> confirmationLoadingObservable, MutableStateFlow<List<ConfirmInfoItem>> confirmationDataObservable);

    String getSendToMobileFeeInquiryRequestId();

    void handleSendToMobileError(BaseException e);

    void setFirstName(String str);

    void setLastName(String str);

    void setMiddleName(String str);

    void setSendToMobileFeeInquiryRequestId(String str);
}
